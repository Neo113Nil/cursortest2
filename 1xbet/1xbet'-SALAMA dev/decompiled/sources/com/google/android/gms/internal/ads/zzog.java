package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzog implements zzop {
    public static final zzftz zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzoe
        @Override // com.google.android.gms.internal.ads.zzftz
        public final Object zza() {
            return zzog.zzn();
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
        String strZzn = zzn();
        zzof zzofVar3 = new zzof(this, strZzn, i7, zzuqVar);
        this.zze.put(strZzn, zzofVar3);
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
        zzof zzofVarZzm = zzm(zzlzVar.zzc, zzlzVar.zzd);
        this.zzh = zzofVarZzm.zzb;
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
        String unused2 = zzofVarZzm.zzb;
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

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzop
    public final synchronized void zzi(zzlz zzlzVar) {
        zzof zzofVarZzm;
        zzuq zzuqVar;
        zzof zzofVarZzm2;
        zzof zzofVar;
        try {
            if (this.zzf == null) {
                throw null;
            }
            if (!zzlzVar.zzb.zzo()) {
                zzuq zzuqVar2 = zzlzVar.zzd;
                if (zzuqVar2 == null) {
                    zzofVarZzm = zzm(zzlzVar.zzc, zzlzVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zzofVarZzm.zzb;
                    }
                    zzuqVar = zzlzVar.zzd;
                    if (zzuqVar != null) {
                        zzofVarZzm2 = zzm(zzlzVar.zzc, new zzuq(zzuqVar.zza, zzuqVar.zzd, zzuqVar.zzb));
                        if (!zzofVarZzm2.zzf) {
                            zzofVarZzm2.zzf = true;
                            zzlzVar.zzb.zzn(zzlzVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzlzVar.zzd.zzb);
                            Math.max(0L, zzen.zzv(0L) + zzen.zzv(0L));
                            String unused = zzofVarZzm2.zzb;
                        }
                    }
                    if (!zzofVarZzm.zzf) {
                        zzofVarZzm.zzf = true;
                        String unused2 = zzofVarZzm.zzb;
                    }
                    if (zzofVarZzm.zzb.equals(this.zzh)) {
                        zzofVarZzm.zzg = true;
                        this.zzf.zzu(zzlzVar, zzofVarZzm.zzb);
                    }
                } else if (zzuqVar2.zzd >= zzl() && ((zzofVar = (zzof) this.zze.get(this.zzh)) == null || zzofVar.zzd != -1 || zzofVar.zzc == zzlzVar.zzc)) {
                    zzofVarZzm = zzm(zzlzVar.zzc, zzlzVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zzofVarZzm.zzb;
                    }
                    zzuqVar = zzlzVar.zzd;
                    if (zzuqVar != null && zzuqVar.zzb()) {
                        zzofVarZzm2 = zzm(zzlzVar.zzc, new zzuq(zzuqVar.zza, zzuqVar.zzd, zzuqVar.zzb));
                        if (!zzofVarZzm2.zzf) {
                            zzofVarZzm2.zzf = true;
                            zzlzVar.zzb.zzn(zzlzVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzlzVar.zzd.zzb);
                            Math.max(0L, zzen.zzv(0L) + zzen.zzv(0L));
                            String unused3 = zzofVarZzm2.zzb;
                        }
                    }
                    if (!zzofVarZzm.zzf) {
                        zzofVarZzm.zzf = true;
                        String unused4 = zzofVarZzm.zzb;
                    }
                    if (zzofVarZzm.zzb.equals(this.zzh) && !zzofVarZzm.zzg) {
                        zzofVarZzm.zzg = true;
                        this.zzf.zzu(zzlzVar, zzofVarZzm.zzb);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
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
                        boolean zEquals = zzofVar.zzb.equals(this.zzh);
                        boolean z4 = false;
                        if (i7 == 0 && zEquals && zzofVar.zzg) {
                            z4 = true;
                        }
                        if (zEquals) {
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
                if (!zzofVar.zzl(zzbnVar, this.zzg) || zzofVar.zzk(zzlzVar)) {
                    it.remove();
                    if (zzofVar.zzf) {
                        if (zzofVar.zzb.equals(this.zzh)) {
                            zzo(zzofVar);
                        }
                        this.zzf.zzv(zzlzVar, zzofVar.zzb, false);
                    }
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
