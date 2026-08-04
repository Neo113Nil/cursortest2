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

/* JADX INFO: loaded from: classes.dex */
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
        int iZza;
        String str;
        zzbbp zzbbpVar = zzbby.zzcR;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            iZza = ((Integer) c0254t.f2726c.zzb(zzbby.zzcW)).intValue();
        } else {
            iZza = this.zzi.zza();
        }
        zzatg zzatgVar = new zzatg((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatj zzatjVar = this.zzk;
        if (zzatjVar == null || zzatjVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzatjVar.zza().get(iZza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        zzatgVar.zza = str;
        return zzatgVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzk() != null) {
                this.zza.zzk().get();
            }
            zzasm zzasmVarZzc = this.zza.zzc();
            if (zzasmVarZzc == null || !zzasmVarZzc.zzaf()) {
                return null;
            }
            return zzasmVarZzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        int i7;
        zzatg zzatgVarZzc;
        zzatg zzatgVar;
        AtomicReference atomicReferenceZza = zzh.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzatg zzatgVar2 = (zzatg) atomicReferenceZza.get();
                if (zzatgVar2 == null || zzavu.zzd(zzatgVar2.zza) || zzatgVar2.zza.equals("E") || zzatgVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzavu.zzd(null)) {
                        zzavu.zzd(null);
                        i7 = 3;
                    } else {
                        i7 = 5;
                    }
                    if (this.zzk != null) {
                        zzatgVarZzc = zzc();
                    } else {
                        boolean z4 = false;
                        if (i7 == 3 && !this.zzi.zzd()) {
                            z4 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        zzbbp zzbbpVar = zzbby.zzcF;
                        C0254t c0254t = C0254t.f2723d;
                        Boolean bool = (Boolean) c0254t.f2726c.zzb(zzbbpVar);
                        String strZzb = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcE)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzo() && zzavu.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzatg zzatgVar3 = new zzatg((String) this.zze.invoke(null, this.zzj, boolValueOf, strZzb));
                        if (zzavu.zzd(zzatgVar3.zza) || zzatgVar3.zza.equals("E")) {
                            int i8 = i7 - 1;
                            if (i8 == 3) {
                                String strZzd = zzd();
                                if (!zzavu.zzd(strZzd)) {
                                    zzatgVar3.zza = strZzd;
                                }
                            } else if (i8 == 4) {
                                throw null;
                            }
                        }
                        zzatgVarZzc = zzatgVar3;
                    }
                    atomicReferenceZza.set(zzatgVarZzc);
                }
                zzatgVar = (zzatg) atomicReferenceZza.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzd) {
            if (zzatgVar != null) {
                try {
                    this.zzd.zzv(zzatgVar.zza);
                    this.zzd.zzV(zzatgVar.zzb);
                    this.zzd.zzX(zzatgVar.zzc);
                    this.zzd.zzi(zzatgVar.zzd);
                    this.zzd.zzu(zzatgVar.zze);
                } catch (Throwable th2) {
                    throw th2;
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
            byte[] bArrZzf = zzavu.zzf((String) c0254t.f2726c.zzb(zzbbpVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzavu.zzf((String) c0254t.f2726c.zzb(zzbby.zzcH)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgbw zzgbwVarZze = zzgbw.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxg
                public final void onChecksumsReady(List list) {
                    zzgbw zzgbwVar = zzgbwVarZze;
                    if (list == null) {
                        zzgbwVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ApkChecksum apkChecksumF = AbstractC0348d.f(list.get(i7));
                            if (apkChecksumF.getType() == 8) {
                                zzgbwVar.zzc(zzavu.zzb(apkChecksumF.getValue()));
                                return;
                            }
                        }
                        zzgbwVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgbwVar.zzc(null);
                    }
                }
            });
            return (String) zzgbwVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
