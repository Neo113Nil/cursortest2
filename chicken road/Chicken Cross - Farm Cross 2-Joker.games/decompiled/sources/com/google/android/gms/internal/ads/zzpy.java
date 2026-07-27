package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzpy implements zzqh {
    public static final zzgvc zza = zzpw.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzqg zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpy() {
        throw null;
    }

    public zzpy(zzgvc zzgvcVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zznr zznrVar) {
        if (zznrVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpx zzpxVar = (zzpx) this.zze.get(str);
                zzpxVar.getClass();
                zzm(zzpxVar);
                return;
            }
            return;
        }
        zzpx zzpxVar2 = (zzpx) this.zze.get(this.zzh);
        int i = zznrVar.zzc;
        zzxo zzxoVar = zznrVar.zzd;
        this.zzh = zzo(i, zzxoVar).zze();
        zzc(zznrVar);
        if (zzxoVar == null || !zzxoVar.zzb()) {
            return;
        }
        if (zzpxVar2 != null) {
            if (zzpxVar2.zzg() == zzxoVar.zzd && zzpxVar2.zzh() != null) {
                zzxo zzh = zzpxVar2.zzh();
                if (zzh.zzb == zzxoVar.zzb) {
                    zzxo zzh2 = zzpxVar2.zzh();
                    if (zzh2.zzc == zzxoVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzxo(zzxoVar.zza, zzxoVar.zzd));
    }

    private final void zzm(zzpx zzpxVar) {
        if (zzpxVar.zzg() != -1 && zzpxVar.zzi()) {
            this.zzi = zzpxVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpx zzpxVar = (zzpx) this.zze.get(this.zzh);
        return (zzpxVar == null || zzpxVar.zzg() == -1) ? this.zzi + 1 : zzpxVar.zzg();
    }

    private final zzpx zzo(int i, zzxo zzxoVar) {
        HashMap hashMap = this.zze;
        long j = Long.MAX_VALUE;
        zzpx zzpxVar = null;
        for (zzpx zzpxVar2 : hashMap.values()) {
            zzpxVar2.zzc(i, zzxoVar);
            if (zzpxVar2.zzb(i, zzxoVar)) {
                long zzg = zzpxVar2.zzg();
                if (zzg == -1 || zzg < j) {
                    zzpxVar = zzpxVar2;
                    j = zzg;
                } else if (zzg == j) {
                    String str = zzfm.zza;
                    if (zzpxVar.zzh() != null && zzpxVar2.zzh() != null) {
                        zzpxVar = zzpxVar2;
                    }
                }
            }
        }
        if (zzpxVar != null) {
            return zzpxVar;
        }
        String zzp = zzp();
        zzpx zzpxVar3 = new zzpx(this, zzp, i, zzxoVar);
        hashMap.put(zzp, zzpxVar3);
        return zzpxVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zza(zzqg zzqgVar) {
        this.zzf = zzqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final synchronized String zzb(zzbf zzbfVar, zzxo zzxoVar) {
        return zzo(zzbfVar.zzo(zzxoVar.zza, this.zzd).zzc, zzxoVar).zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 < zzn()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r2.zzf() != r10.zzc) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(zznr zznrVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = zznrVar.zzb;
        if (!zzbfVar.zzg()) {
            zzxo zzxoVar = zznrVar.zzd;
            if (zzxoVar != null) {
                long j = zzxoVar.zzd;
                if (j != -1) {
                }
                zzpx zzpxVar = (zzpx) this.zze.get(this.zzh);
                if (zzpxVar != null) {
                    if (zzpxVar.zzg() == -1) {
                    }
                }
            }
            int i = zznrVar.zzc;
            zzpx zzo = zzo(i, zzxoVar);
            if (this.zzh == null) {
                this.zzh = zzo.zze();
            }
            if (zzxoVar != null && zzxoVar.zzb()) {
                Object obj = zzxoVar.zza;
                long j2 = zzxoVar.zzd;
                int i2 = zzxoVar.zzb;
                zzpx zzo2 = zzo(i, new zzxo(obj, j2, i2));
                if (!zzo2.zzi()) {
                    zzo2.zzj(true);
                    zzbd zzbdVar = this.zzd;
                    zzbfVar.zzo(obj, zzbdVar);
                    zzbdVar.zzc(i2);
                    Math.max(0L, zzfm.zzs(0L) + zzfm.zzs(0L));
                }
            }
            if (!zzo.zzi()) {
                zzo.zzj(true);
            }
            if (zzo.zze().equals(this.zzh) && !zzo.zzk()) {
                zzo.zzl(true);
                this.zzf.zzc(zznrVar, zzo.zze());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final synchronized void zzd(zznr zznrVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = this.zzg;
        this.zzg = zznrVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpx zzpxVar = (zzpx) it.next();
            if (!zzpxVar.zza(zzbfVar, this.zzg) || zzpxVar.zzd(zznrVar)) {
                it.remove();
                if (zzpxVar.zze().equals(this.zzh)) {
                    zzm(zzpxVar);
                }
                if (zzpxVar.zzi()) {
                    this.zzf.zzd(zznrVar, zzpxVar.zze(), false);
                }
            }
        }
        zzl(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final synchronized void zze(zznr zznrVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpx zzpxVar = (zzpx) it.next();
            if (zzpxVar.zzd(zznrVar)) {
                it.remove();
                boolean equals = zzpxVar.zze().equals(this.zzh);
                if (equals) {
                    zzm(zzpxVar);
                }
                if (zzpxVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && equals && zzpxVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zznrVar, zzpxVar.zze(), z);
                }
            }
        }
        zzl(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final synchronized void zzg(zznr zznrVar) {
        zzqg zzqgVar;
        String str = this.zzh;
        if (str != null) {
            zzpx zzpxVar = (zzpx) this.zze.get(str);
            if (zzpxVar == null) {
                throw null;
            }
            zzpx zzpxVar2 = zzpxVar;
            zzm(zzpxVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpx zzpxVar3 = (zzpx) it.next();
            it.remove();
            if (zzpxVar3.zzi() && (zzqgVar = this.zzf) != null) {
                zzqgVar.zzd(zznrVar, zzpxVar3.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }
}
