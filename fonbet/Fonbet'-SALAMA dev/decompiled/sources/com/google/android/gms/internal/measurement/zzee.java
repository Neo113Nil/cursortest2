package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m3.InterfaceC1436a;
import m3.b;
import p3.C1535a;
import q4.d;
import v3.C1666a;
import w3.InterfaceC1773a;
import w3.InterfaceC1774b;

/* loaded from: classes.dex */
public final class zzee {
    private static volatile zzee zzc;
    protected final InterfaceC1436a zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final C1666a zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcc zzj;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        Application application;
        Resources resources;
        int identifier;
        String string;
        if (str == null || !zzV(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = b.f15248a;
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new C1666a(this);
        this.zzf = new ArrayList();
        try {
            String k7 = d.k(context);
            resources = context.getResources();
            if (TextUtils.isEmpty(k7)) {
                k7 = d.k(context);
            }
            identifier = resources.getIdentifier("google_app_id", "string", k7);
        } catch (IllegalStateException unused) {
        }
        if (identifier != 0) {
            try {
                string = resources.getString(identifier);
            } catch (Resources.NotFoundException unused2) {
            }
            if (string != null && !zzR()) {
                this.zzi = null;
                this.zzh = true;
                Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
            if (zzV(str2, str3)) {
                this.zzi = "fa";
                if (str2 == null || str3 == null) {
                    if ((str2 == null) ^ (str3 == null)) {
                        Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                } else {
                    Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                }
            } else {
                this.zzi = str2;
            }
            zzU(new zzcx(this, str2, str3, context, bundle));
            application = (Application) context.getApplicationContext();
            if (application != null) {
                Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
                return;
            } else {
                application.registerActivityLifecycleCallbacks(new zzed(this));
                return;
            }
        }
        string = null;
        if (string != null) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (zzV(str2, str3)) {
        }
        zzU(new zzcx(this, str2, str3, context, bundle));
        application = (Application) context.getApplicationContext();
        if (application != null) {
        }
    }

    public static final boolean zzR() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS(Exception exc, boolean z4, boolean z7) {
        this.zzh |= z4;
        if (z4) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z7) {
            zzA(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzT(String str, String str2, Bundle bundle, boolean z4, boolean z7, Long l7) {
        zzU(new zzdr(this, l7, str, str2, bundle, z4, z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(zzdt zzdtVar) {
        this.zzb.execute(zzdtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzV(String str, String str2) {
        return (str2 == null || str == null || zzR()) ? false : true;
    }

    public static zzee zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        D.i(context);
        if (zzc == null) {
            synchronized (zzee.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzee(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public final void zzA(int i7, String str, Object obj, Object obj2, Object obj3) {
        zzU(new zzdg(this, false, 5, str, obj, null, null));
    }

    public final void zzB(InterfaceC1774b interfaceC1774b) {
        D.i(interfaceC1774b);
        synchronized (this.zzf) {
            for (int i7 = 0; i7 < this.zzf.size(); i7++) {
                try {
                    if (interfaceC1774b.equals(((Pair) this.zzf.get(i7)).first)) {
                        Log.w(this.zzd, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdv zzdvVar = new zzdv(interfaceC1774b);
            this.zzf.add(new Pair(interfaceC1774b, zzdvVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdp(this, zzdvVar));
        }
    }

    public final void zzC() {
        zzU(new zzcv(this));
    }

    public final void zzD(Bundle bundle) {
        zzU(new zzcn(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        zzU(new zzct(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        zzU(new zzcu(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        zzU(new zzcr(this, activity, str, str2));
    }

    public final void zzH(boolean z4) {
        zzU(new zzdm(this, z4));
    }

    public final void zzI(Bundle bundle) {
        zzU(new zzdn(this, bundle));
    }

    public final void zzJ(InterfaceC1773a interfaceC1773a) {
        zzdu zzduVar = new zzdu(interfaceC1773a);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzduVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzU(new zzdo(this, zzduVar));
    }

    public final void zzK(Boolean bool) {
        zzU(new zzcs(this, bool));
    }

    public final void zzL(long j) {
        zzU(new zzcw(this, j));
    }

    public final void zzM(String str) {
        zzU(new zzcq(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z4) {
        zzU(new zzds(this, str, str2, obj, z4));
    }

    public final void zzO(InterfaceC1774b interfaceC1774b) {
        Pair pair;
        D.i(interfaceC1774b);
        synchronized (this.zzf) {
            int i7 = 0;
            while (true) {
                try {
                    if (i7 >= this.zzf.size()) {
                        pair = null;
                        break;
                    } else {
                        if (interfaceC1774b.equals(((Pair) this.zzf.get(i7)).first)) {
                            pair = (Pair) this.zzf.get(i7);
                            break;
                        }
                        i7++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzdv zzdvVar = (zzdv) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdq(this, zzdvVar));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdj(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zze(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdc(this, zzbzVar));
        Long l7 = (Long) zzbz.zze(zzbzVar.zzb(500L), Long.class);
        if (l7 != null) {
            return l7.longValue();
        }
        long nanoTime = System.nanoTime();
        ((b) this.zza).getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i7 = this.zzg + 1;
        this.zzg = i7;
        return nextLong + i7;
    }

    public final Bundle zzc(Bundle bundle, boolean z4) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdh(this, bundle, zzbzVar));
        if (z4) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final C1666a zzd() {
        return this.zze;
    }

    public final zzcc zzf(Context context, boolean z4) {
        try {
            return zzcb.asInterface(p3.d.c(context, p3.d.f15678c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (C1535a e7) {
            zzS(e7, true, false);
            return null;
        }
    }

    public final Object zzh(int i7) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdl(this, zzbzVar, i7));
        return zzbz.zze(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdk(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdb(this, zzbzVar));
        return zzbzVar.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzde(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdd(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzda(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzcp(this, str, str2, zzbzVar));
        List list = (List) zzbz.zze(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzq(String str, String str2, boolean z4) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdf(this, str, str2, z4, zzbzVar));
        Bundle zzb = zzbzVar.zzb(5000L);
        if (zzb == null || zzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zzb.size());
        for (String str3 : zzb.keySet()) {
            Object obj = zzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzu(String str) {
        zzU(new zzcy(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        zzU(new zzco(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        zzU(new zzcz(this, str));
    }

    public final void zzx(String str, Bundle bundle) {
        zzT(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        zzT(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j) {
        zzT(str, str2, bundle, true, false, Long.valueOf(j));
    }
}
