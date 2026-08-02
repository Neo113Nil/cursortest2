package com.google.android.gms.internal.ads;

import F2.C0254t;
import P.AbstractC0348d;
import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import io.sentry.SentryBaseEvent;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzawf extends zzaxe {
    private static final zzaxf zzh = new zzaxf();
    private final zzarn zzi;
    private final Context zzj;
    private final zzatj zzk;

    public zzawf(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, Context context, zzare zzareVar, zzarn zzarnVar, zzatj zzatjVar) {
        super(zzavrVar, "Ve21h85y8zyXmD7mYX40CbhQPgnShWjzbHE4yCJKJ6FL+RV7KGtw6p1aNaOQtQCP", "DdaQauG5oPDgpLWEm8FjS9mWezFUY9FDIRvqk+aVXxI=", zzarrVar, i7, 27);
        this.zzj = context;
        this.zzi = zzarnVar;
        this.zzk = zzatjVar;
    }

    private final zzatg zzc() {
        int zza;
        String str;
        zzbbp zzbbpVar = zzbby.zzcR;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zza = ((Integer) c0254t.f2726c.zzb(zzbby.zzcW)).intValue();
        } else {
            zza = this.zzi.zza();
        }
        zzatg zzatgVar = new zzatg((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatj zzatjVar = this.zzk;
        if (zzatjVar != null && zzatjVar.zza() != null) {
            try {
                str = (String) zzatjVar.zza().get(zza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzatgVar.zza = str;
            return zzatgVar;
        }
        str = "E";
        zzatgVar.zza = str;
        return zzatgVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzk() != null) {
                this.zza.zzk().get();
            }
            zzasm zzc = this.zza.zzc();
            if (zzc == null || !zzc.zzaf()) {
                return null;
            }
            return zzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        int i7;
        zzatg zzatgVar;
        zzatg zzatgVar2;
        AtomicReference zza = zzh.zza(this.zzj.getPackageName());
        synchronized (zza) {
            try {
                zzatg zzatgVar3 = (zzatg) zza.get();
                if (zzatgVar3 != null) {
                    if (!zzavu.zzd(zzatgVar3.zza)) {
                        if (!zzatgVar3.zza.equals("E")) {
                            if (zzatgVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzatgVar2 = (zzatg) zza.get();
                        }
                    }
                }
                if (zzavu.zzd(null)) {
                    zzavu.zzd(null);
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                if (this.zzk != null) {
                    zzatgVar = zzc();
                } else {
                    boolean z4 = false;
                    if (i7 == 3 && !this.zzi.zzd()) {
                        z4 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z4);
                    zzbbp zzbbpVar = zzbby.zzcF;
                    C0254t c0254t = C0254t.f2723d;
                    Boolean bool = (Boolean) c0254t.f2726c.zzb(zzbbpVar);
                    String zzb = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcE)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzo() && zzavu.zzd(zzb)) {
                        zzb = zzd();
                    }
                    zzatg zzatgVar4 = new zzatg((String) this.zze.invoke(null, this.zzj, valueOf, zzb));
                    if (zzavu.zzd(zzatgVar4.zza) || zzatgVar4.zza.equals("E")) {
                        int i8 = i7 - 1;
                        if (i8 == 3) {
                            String zzd = zzd();
                            if (!zzavu.zzd(zzd)) {
                                zzatgVar4.zza = zzd;
                            }
                        } else if (i8 == 4) {
                            throw null;
                        }
                    }
                    zzatgVar = zzatgVar4;
                }
                zza.set(zzatgVar);
                zzatgVar2 = (zzatg) zza.get();
            } finally {
            }
        }
        synchronized (this.zzd) {
            if (zzatgVar2 != null) {
                try {
                    this.zzd.zzv(zzatgVar2.zza);
                    this.zzd.zzV(zzatgVar2.zzb);
                    this.zzd.zzX(zzatgVar2.zzc);
                    this.zzd.zzi(zzatgVar2.zzd);
                    this.zzd.zzu(zzatgVar2.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzaxg] */
    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            zzbbp zzbbpVar = zzbby.zzcG;
            C0254t c0254t = C0254t.f2723d;
            byte[] zzf = zzavu.zzf((String) c0254t.f2726c.zzb(zzbbpVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzavu.zzf((String) c0254t.f2726c.zzb(zzbby.zzcH)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgbw zze = zzgbw.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxg
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzgbw zzgbwVar = zzgbw.this;
                    if (list == null) {
                        zzgbwVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ApkChecksum f7 = AbstractC0348d.f(list.get(i7));
                            type = f7.getType();
                            if (type == 8) {
                                value = f7.getValue();
                                zzgbwVar.zzc(zzavu.zzb(value));
                                return;
                            }
                        }
                        zzgbwVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgbwVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
