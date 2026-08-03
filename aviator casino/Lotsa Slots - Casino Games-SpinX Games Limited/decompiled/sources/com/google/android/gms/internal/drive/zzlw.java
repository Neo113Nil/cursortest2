package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzlw<T> implements com.google.android.gms.internal.drive.zzmf<T> {
    private final com.google.android.gms.internal.drive.zzlq zzuh;
    private final boolean zzui;
    private final com.google.android.gms.internal.drive.zzmx<?, ?> zzur;
    private final com.google.android.gms.internal.drive.zzjy<?> zzus;

    private zzlw(com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzlq zzlqVar) {
        this.zzur = zzmxVar;
        this.zzui = zzjyVar.zze(zzlqVar);
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
    }

    static <T> com.google.android.gms.internal.drive.zzlw<T> zza(com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return new com.google.android.gms.internal.drive.zzlw<>(zzmxVar, zzjyVar, zzlqVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzuh.zzcz().zzde();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
            return false;
        }
        if (this.zzui) {
            return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int hashCode = this.zzur.zzr(t).hashCode();
        return this.zzui ? (hashCode * 53) + this.zzus.zzb(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        com.google.android.gms.internal.drive.zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzmh.zza(this.zzus, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it = this.zzus.zzb(t).iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<?, java.lang.Object> next = it.next();
            com.google.android.gms.internal.drive.zzkd zzkdVar = (com.google.android.gms.internal.drive.zzkd) next.getKey();
            if (zzkdVar.zzcr() != com.google.android.gms.internal.drive.zznr.MESSAGE || zzkdVar.zzcs() || zzkdVar.zzct()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof com.google.android.gms.internal.drive.zzkv) {
                zznsVar.zza(zzkdVar.zzcp(), (java.lang.Object) ((com.google.android.gms.internal.drive.zzkv) next).zzdq().zzbl());
            } else {
                zznsVar.zza(zzkdVar.zzcp(), next.getValue());
            }
        }
        com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar = this.zzur;
        zzmxVar.zzc(zzmxVar.zzr(t), zznsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) t;
        com.google.android.gms.internal.drive.zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar == com.google.android.gms.internal.drive.zzmy.zzfa()) {
            zzmyVar = com.google.android.gms.internal.drive.zzmy.zzfb();
            zzkkVar.zzrq = zzmyVar;
        }
        ((com.google.android.gms.internal.drive.zzkk.zzc) t).zzdg();
        com.google.android.gms.internal.drive.zzkk.zzd zzdVar = null;
        while (i < i2) {
            int zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
            int i3 = zzizVar.zznk;
            if (i3 == 11) {
                int i4 = 0;
                com.google.android.gms.internal.drive.zzjc zzjcVar = null;
                while (zza < i2) {
                    zza = com.google.android.gms.internal.drive.zziy.zza(bArr, zza, zzizVar);
                    int i5 = zzizVar.zznk;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzdVar != null) {
                                com.google.android.gms.internal.drive.zzmd.zzej();
                                throw new java.lang.NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                zza = com.google.android.gms.internal.drive.zziy.zze(bArr, zza, zzizVar);
                                zzjcVar = (com.google.android.gms.internal.drive.zzjc) zzizVar.zznm;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zza = com.google.android.gms.internal.drive.zziy.zza(i5, bArr, zza, i2, zzizVar);
                        }
                    } else if (i7 == 0) {
                        zza = com.google.android.gms.internal.drive.zziy.zza(bArr, zza, zzizVar);
                        i4 = zzizVar.zznk;
                        zzdVar = (com.google.android.gms.internal.drive.zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzjcVar != null) {
                    zzmyVar.zzb((i4 << 3) | 2, zzjcVar);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zzdVar = (com.google.android.gms.internal.drive.zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i3 >>> 3);
                if (zzdVar != null) {
                    com.google.android.gms.internal.drive.zzmd.zzej();
                    throw new java.lang.NoSuchMethodError();
                }
                i = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, zza, i2, zzmyVar, zzizVar);
            } else {
                i = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, zza, i2, zzizVar);
            }
        }
        if (i != i2) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        this.zzur.zzd(t);
        this.zzus.zzd(t);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        return this.zzus.zzb(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar = this.zzur;
        int zzs = zzmxVar.zzs(zzmxVar.zzr(t));
        return this.zzui ? zzs + this.zzus.zzb(t).zzco() : zzs;
    }
}
