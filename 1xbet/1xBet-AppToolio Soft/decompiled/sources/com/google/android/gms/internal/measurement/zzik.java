package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzik extends zzdz {
    private final zziy zzaqo;
    private zzfa zzaqp;
    private volatile Boolean zzaqq;
    private final zzep zzaqr;
    private final zzjo zzaqs;
    private final List<Runnable> zzaqt;
    private final zzep zzaqu;

    protected zzik(zzgn zzgnVar) {
        super(zzgnVar);
        this.zzaqt = new ArrayList();
        this.zzaqs = new zzjo(zzgnVar.zzbt());
        this.zzaqo = new zziy(this);
        this.zzaqr = new zzil(this, zzgnVar);
        this.zzaqu = new zziq(this, zzgnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void onServiceDisconnected(ComponentName componentName) {
        zzab();
        if (this.zzaqp != null) {
            this.zzaqp = null;
            zzgi().zzjc().zzg("Disconnected from device MeasurementService", componentName);
            zzab();
            zzdf();
        }
    }

    static /* synthetic */ zzfa zza(zzik zzikVar, zzfa zzfaVar) {
        zzikVar.zzaqp = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzcu() {
        zzab();
        this.zzaqs.start();
        this.zzaqr.zzh(zzez.zzajk.get().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzcv() {
        zzab();
        if (isConnected()) {
            zzgi().zzjc().log("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    @WorkerThread
    private final void zzf(Runnable runnable) throws IllegalStateException {
        zzab();
        if (isConnected()) {
            runnable.run();
        } else {
            if (this.zzaqt.size() >= 1000) {
                zzgi().zziv().log("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzaqt.add(runnable);
            this.zzaqu.zzh(60000L);
            zzdf();
        }
    }

    @WorkerThread
    @Nullable
    private final zzeb zzk(boolean z) {
        zzgl();
        return zzfz().zzbl(z ? zzgi().zzje() : null);
    }

    private final boolean zzkq() {
        zzgl();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzks() {
        zzab();
        zzgi().zzjc().zzg("Processing queued up service tasks", Integer.valueOf(this.zzaqt.size()));
        Iterator<Runnable> it = this.zzaqt.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                zzgi().zziv().zzg("Task exception while flushing queue", e);
            }
        }
        this.zzaqt.clear();
        this.zzaqu.cancel();
    }

    @WorkerThread
    public final void disconnect() {
        zzab();
        zzch();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzaqo);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzaqp = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public final boolean isConnected() {
        zzab();
        zzch();
        return this.zzaqp != null;
    }

    @WorkerThread
    protected final void resetAnalyticsData() {
        zzab();
        zzfv();
        zzch();
        zzeb zzk = zzk(false);
        if (zzkq()) {
            zzgc().resetAnalyticsData();
        }
        zzf(new zzim(this, zzk));
    }

    @WorkerThread
    @VisibleForTesting
    protected final void zza(zzfa zzfaVar) {
        zzab();
        Preconditions.checkNotNull(zzfaVar);
        this.zzaqp = zzfaVar;
        zzcu();
        zzks();
    }

    @WorkerThread
    @VisibleForTesting
    final void zza(zzfa zzfaVar, AbstractSafeParcelable abstractSafeParcelable, zzeb zzebVar) {
        int i;
        zzfk zziv;
        String str;
        List<AbstractSafeParcelable> zzp;
        zzab();
        zzfv();
        zzch();
        boolean zzkq = zzkq();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zzkq || (zzp = zzgc().zzp(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(zzp);
                i = zzp.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzex) {
                    try {
                        zzfaVar.zza((zzex) abstractSafeParcelable2, zzebVar);
                    } catch (RemoteException e) {
                        e = e;
                        zziv = zzgi().zziv();
                        str = "Failed to send event to the service";
                        zziv.zzg(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzka) {
                    try {
                        zzfaVar.zza((zzka) abstractSafeParcelable2, zzebVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        zziv = zzgi().zziv();
                        str = "Failed to send attribute to the service";
                        zziv.zzg(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzef) {
                    try {
                        zzfaVar.zza((zzef) abstractSafeParcelable2, zzebVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        zziv = zzgi().zziv();
                        str = "Failed to send conditional property to the service";
                        zziv.zzg(str, e);
                    }
                } else {
                    zzgi().zziv().log("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    @WorkerThread
    public final void zza(AtomicReference<String> atomicReference) {
        zzab();
        zzch();
        zzf(new zzin(this, atomicReference, zzk(false)));
    }

    @WorkerThread
    protected final void zza(AtomicReference<List<zzef>> atomicReference, String str, String str2, String str3) {
        zzab();
        zzch();
        zzf(new zziu(this, atomicReference, str, str2, str3, zzk(false)));
    }

    @WorkerThread
    protected final void zza(AtomicReference<List<zzka>> atomicReference, String str, String str2, String str3, boolean z) {
        zzab();
        zzch();
        zzf(new zziv(this, atomicReference, str, str2, str3, z, zzk(false)));
    }

    @WorkerThread
    protected final void zza(AtomicReference<List<zzka>> atomicReference, boolean z) {
        zzab();
        zzch();
        zzf(new zzix(this, atomicReference, zzk(false), z));
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @WorkerThread
    protected final void zzb(zzex zzexVar, String str) {
        Preconditions.checkNotNull(zzexVar);
        zzab();
        zzch();
        boolean zzkq = zzkq();
        zzf(new zzis(this, zzkq, zzkq && zzgc().zza(zzexVar), zzexVar, zzk(true), str));
    }

    @WorkerThread
    protected final void zzb(zzig zzigVar) {
        zzab();
        zzch();
        zzf(new zzip(this, zzigVar));
    }

    @WorkerThread
    protected final void zzb(zzka zzkaVar) {
        zzab();
        zzch();
        zzf(new zziw(this, zzkq() && zzgc().zza(zzkaVar), zzkaVar, zzk(true)));
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    @WorkerThread
    protected final void zzd(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        zzab();
        zzch();
        zzgl();
        zzf(new zzit(this, true, zzgc().zzc(zzefVar), new zzef(zzefVar), zzk(true), zzefVar));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0065. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzdf() {
        zzfk zziy;
        String str;
        boolean z;
        boolean z2;
        zzfk zziy2;
        String str2;
        zzab();
        zzch();
        if (isConnected()) {
            return;
        }
        boolean z3 = false;
        if (this.zzaqq == null) {
            zzab();
            zzch();
            Boolean zzjl = zzgj().zzjl();
            if (zzjl == null || !zzjl.booleanValue()) {
                zzgl();
                if (zzfz().zzit() != 1) {
                    zzgi().zzjc().log("Checking service availability");
                    int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zzgg().getContext(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (isGooglePlayServicesAvailable != 9) {
                        if (isGooglePlayServicesAvailable != 18) {
                            switch (isGooglePlayServicesAvailable) {
                                case 0:
                                    zziy2 = zzgi().zzjc();
                                    str2 = "Service available";
                                    break;
                                case 1:
                                    zzgi().zzjc().log("Service missing");
                                    z = false;
                                    z2 = true;
                                    break;
                                case 2:
                                    zzgi().zzjb().log("Service container out of date");
                                    if (zzgg().zzlp() >= 12600) {
                                        Boolean zzjl2 = zzgj().zzjl();
                                        if (zzjl2 == null || zzjl2.booleanValue()) {
                                            z = true;
                                            z2 = false;
                                            break;
                                        }
                                        z = false;
                                        z2 = false;
                                    }
                                    z = false;
                                    z2 = true;
                                    break;
                                case 3:
                                    zziy = zzgi().zziy();
                                    str = "Service disabled";
                                    break;
                                default:
                                    zzgi().zziy().zzg("Unexpected service status", Integer.valueOf(isGooglePlayServicesAvailable));
                                    z = false;
                                    z2 = false;
                                    break;
                            }
                            if (!z && zzgk().zzhu()) {
                                zzgi().zziv().log("No way to upload. Consider using the full version of Analytics");
                                z2 = false;
                            }
                            if (z2) {
                                zzgj().zzf(z);
                            }
                        } else {
                            zziy2 = zzgi().zziy();
                            str2 = "Service updating";
                        }
                        zziy2.log(str2);
                    } else {
                        zziy = zzgi().zziy();
                        str = "Service invalid";
                    }
                    zziy.log(str);
                    z = false;
                    z2 = false;
                    if (!z) {
                        zzgi().zziv().log("No way to upload. Consider using the full version of Analytics");
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                z = true;
                z2 = true;
                if (!z) {
                }
                if (z2) {
                }
            } else {
                z = true;
            }
            this.zzaqq = Boolean.valueOf(z);
        }
        if (this.zzaqq.booleanValue()) {
            this.zzaqo.zzkt();
            return;
        }
        if (zzgk().zzhu()) {
            return;
        }
        zzgl();
        List<ResolveInfo> queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            z3 = true;
        }
        if (!z3) {
            zzgi().zziv().log("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context context = getContext();
        zzgl();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zzaqo.zzc(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzdu zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzhm zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfd zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzik zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzih zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfe zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzjj zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    @Override // com.google.android.gms.internal.measurement.zzdz
    protected final boolean zzgn() {
        return false;
    }

    @WorkerThread
    protected final void zzkm() {
        zzab();
        zzch();
        zzf(new zzio(this, zzk(true)));
    }

    @WorkerThread
    protected final void zzkp() {
        zzab();
        zzch();
        zzf(new zzir(this, zzk(true)));
    }

    final Boolean zzkr() {
        return this.zzaqq;
    }
}
