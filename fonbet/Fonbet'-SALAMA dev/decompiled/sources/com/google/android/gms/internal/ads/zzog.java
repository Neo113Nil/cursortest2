package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class zzog implements zzop {
    public static final zzftz zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzoe
        @Override // com.google.android.gms.internal.ads.zzftz
        public final Object zza() {
            String zzn;
            zzn = zzog.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzbm zzc;
    private final zzbl zzd;
    private final HashMap zze;
    private zzoo zzf;
    private zzbn zzg;
    private String zzh;
    private long zzi;

    public zzog() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzof zzofVar = (zzof) this.zze.get(this.zzh);
        return (zzofVar == null || zzofVar.zzd == -1) ? this.zzi + 1 : zzofVar.zzd;
    }

    private final zzof zzm(int i7, zzuq zzuqVar) {
        long j = Long.MAX_VALUE;
        zzof zzofVar = null;
        for (zzof zzofVar2 : this.zze.values()) {
            zzofVar2.zzg(i7, zzuqVar);
            if (zzofVar2.zzj(i7, zzuqVar)) {
                long j3 = zzofVar2.zzd;
                if (j3 == -1 || j3 < j) {
                    zzofVar = zzofVar2;
                    j = j3;
                } else if (j3 == j) {
                    int i8 = zzen.zza;
                    if (zzofVar.zze != null && zzofVar2.zze != null) {
                        zzofVar = zzofVar2;
                    }
                }
            }
        }
        if (zzofVar != null) {
            return zzofVar;
        }
        String zzn = zzn();
        zzof zzofVar3 = new zzof(this, zzn, i7, zzuqVar);
        this.zze.put(zzn, zzofVar3);
        return zzofVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzof zzofVar) {
        if (zzofVar.zzd != -1) {
            this.zzi = zzofVar.zzd;
        }
        this.zzh = null;
    }

    private final void zzp(zzlz zzlzVar) {
        if (zzlzVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzof zzofVar = (zzof) this.zze.get(str);
                zzofVar.getClass();
                zzo(zzofVar);
                return;
            }
            return;
        }
        zzof zzofVar2 = (zzof) this.zze.get(this.zzh);
        zzof zzm = zzm(zzlzVar.zzc, zzlzVar.zzd);
        this.zzh = zzm.zzb;
        zzi(zzlzVar);
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar == null || !zzuqVar.zzb()) {
            return;
        }
        if (zzofVar2 != null) {
            if (zzofVar2.zzd == zzuqVar.zzd && zzofVar2.zze != null && zzofVar2.zze.zzb == zzlzVar.zzd.zzb && zzofVar2.zze.zzc == zzlzVar.zzd.zzc) {
                return;
            }
        }
        zzuq zzuqVar2 = zzlzVar.zzd;
        String unused = zzm(zzlzVar.zzc, new zzuq(zzuqVar2.zza, zzuqVar2.zzd)).zzb;
        String unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized String zzf(zzbn zzbnVar, zzuq zzuqVar) {
        return zzm(zzbnVar.zzn(zzuqVar.zza, this.zzd).zzc, zzuqVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized void zzg(zzlz zzlzVar) {
        zzoo zzooVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzof zzofVar = (zzof) this.zze.get(str);
                if (zzofVar == null) {
                    throw null;
                }
                zzo(zzofVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar2 = (zzof) it.next();
                it.remove();
                if (zzofVar2.zzf && (zzooVar = this.zzf) != null) {
                    zzooVar.zzv(zzlzVar, zzofVar2.zzb, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final void zzh(zzoo zzooVar) {
        this.zzf = zzooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized void zzi(zzlz zzlzVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            if (!zzlzVar.zzb.zzo()) {
                zzuq zzuqVar = zzlzVar.zzd;
                if (zzuqVar != null) {
                    if (zzuqVar.zzd >= zzl()) {
                        zzof zzofVar = (zzof) this.zze.get(this.zzh);
                        if (zzofVar != null) {
                            if (zzofVar.zzd == -1) {
                                if (zzofVar.zzc == zzlzVar.zzc) {
                                }
                            }
                        }
                    }
                }
                zzof zzm = zzm(zzlzVar.zzc, zzlzVar.zzd);
                if (this.zzh == null) {
                    this.zzh = zzm.zzb;
                }
                zzuq zzuqVar2 = zzlzVar.zzd;
                if (zzuqVar2 != null && zzuqVar2.zzb()) {
                    zzof zzm2 = zzm(zzlzVar.zzc, new zzuq(zzuqVar2.zza, zzuqVar2.zzd, zzuqVar2.zzb));
                    if (!zzm2.zzf) {
                        zzm2.zzf = true;
                        zzbn zzbnVar = zzlzVar.zzb;
                        zzuq zzuqVar3 = zzlzVar.zzd;
                        zzbnVar.zzn(zzuqVar3.zza, this.zzd);
                        this.zzd.zzg(zzlzVar.zzd.zzb);
                        Math.max(0L, zzen.zzv(0L) + zzen.zzv(0L));
                        String unused = zzm2.zzb;
                    }
                }
                if (!zzm.zzf) {
                    zzm.zzf = true;
                    String unused2 = zzm.zzb;
                }
                if (zzm.zzb.equals(this.zzh) && !zzm.zzg) {
                    zzm.zzg = true;
                    this.zzf.zzu(zzlzVar, zzm.zzb);
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized void zzj(zzlz zzlzVar, int i7) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar = (zzof) it.next();
                if (zzofVar.zzk(zzlzVar)) {
                    it.remove();
                    if (zzofVar.zzf) {
                        boolean equals = zzofVar.zzb.equals(this.zzh);
                        boolean z4 = false;
                        if (i7 == 0 && equals && zzofVar.zzg) {
                            z4 = true;
                        }
                        if (equals) {
                            zzo(zzofVar);
                        }
                        this.zzf.zzv(zzlzVar, zzofVar.zzb, z4);
                    }
                }
            }
            zzp(zzlzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized void zzk(zzlz zzlzVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbn zzbnVar = this.zzg;
            this.zzg = zzlzVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar = (zzof) it.next();
                if (zzofVar.zzl(zzbnVar, this.zzg) && !zzofVar.zzk(zzlzVar)) {
                }
                it.remove();
                if (zzofVar.zzf) {
                    if (zzofVar.zzb.equals(this.zzh)) {
                        zzo(zzofVar);
                    }
                    this.zzf.zzv(zzlzVar, zzofVar.zzb, false);
                }
            }
            zzp(zzlzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzog(zzftz zzftzVar) {
        this.zzc = new zzbm();
        this.zzd = new zzbl();
        this.zze = new HashMap();
        this.zzg = zzbn.zza;
        this.zzi = -1L;
    }
}
