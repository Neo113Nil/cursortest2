package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzali<T> implements zzalv<T> {
    private final zzalc zza;
    private final zzamo<?, ?> zzb;
    private final boolean zzc;
    private final zzajm<?> zzd;

    private zzali(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        this.zzb = zzamoVar;
        this.zzc = zzajmVar.zza(zzalcVar);
        this.zzd = zzajmVar;
        this.zza = zzalcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t7) {
        zzamo<?, ?> zzamoVar = this.zzb;
        int iZzb = zzamoVar.zzb(zzamoVar.zzd(t7));
        return this.zzc ? iZzb + this.zzd.zza(t7).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t7) {
        int iHashCode = this.zzb.zzd(t7).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t7).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t7) {
        this.zzb.zzf(t7);
        this.zzd.zzc(t7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t7) {
        return this.zzd.zza(t7).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzb(T t7, T t8) {
        if (!this.zzb.zzd(t7).equals(this.zzb.zzd(t8))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t7).equals(this.zzd.zza(t8));
        }
        return true;
    }

    public static <T> zzali<T> zza(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        return new zzali<>(zzamoVar, zzajmVar, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        zzalc zzalcVar = this.zza;
        if (zzalcVar instanceof zzajy) {
            return (T) ((zzajy) zzalcVar).zzo();
        }
        return (T) zzalcVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, T t8) {
        zzalx.zza(this.zzb, t7, t8);
        if (this.zzc) {
            zzalx.zza(this.zzd, t7, t8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, zzals zzalsVar, zzajk zzajkVar) {
        boolean zZzt;
        zzamo<?, ?> zzamoVar = this.zzb;
        zzajm<?> zzajmVar = this.zzd;
        Object objZzc = zzamoVar.zzc(t7);
        zzajr<T> zzajrVarZzb = zzajmVar.zzb(t7);
        while (zzalsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzalsVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzajmVar.zza(zzajkVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzajmVar.zza(zzalsVar, objZza, zzajkVar, zzajrVarZzb);
                        } else {
                            zZzt = zzamoVar.zza(objZzc, zzalsVar, 0);
                        }
                    } else {
                        zZzt = zzalsVar.zzt();
                    }
                    if (!zZzt) {
                        zzamoVar.zzb(t7, objZzc);
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    zzaip zzaipVarZzp = null;
                    while (zzalsVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzalsVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzalsVar.zzj();
                            objZza2 = zzajmVar.zza(zzajkVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzajmVar.zza(zzalsVar, objZza2, zzajkVar, zzajrVarZzb);
                            } else {
                                zzaipVarZzp = zzalsVar.zzp();
                            }
                        } else if (!zzalsVar.zzt()) {
                            break;
                        }
                    }
                    if (zzalsVar.zzd() != 12) {
                        throw zzakf.zzb();
                    }
                    if (zzaipVarZzp != null) {
                        if (objZza2 != null) {
                            zzajmVar.zza(zzaipVarZzp, objZza2, zzajkVar, zzajrVarZzb);
                        } else {
                            zzamoVar.zza(objZzc, iZzj, zzaipVarZzp);
                        }
                    }
                }
                zZzt = true;
                if (!zZzt) {
                    zzamoVar.zzb(t7, objZzc);
                    return;
                }
            } catch (Throwable th) {
                zzamoVar.zzb(t7, objZzc);
                throw th;
            }
        }
        zzamoVar.zzb(t7, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaik zzaikVar) throws zzakf {
        zzajy zzajyVar = (zzajy) t7;
        zzamn zzamnVarZzd = zzajyVar.zzb;
        if (zzamnVarZzd == zzamn.zzc()) {
            zzamnVarZzd = zzamn.zzd();
            zzajyVar.zzb = zzamnVarZzd;
        }
        ((zzajy.zzb) t7).zza();
        zzajy.zzd zzdVar = null;
        while (i7 < i8) {
            int iZzc = zzail.zzc(bArr, i7, zzaikVar);
            int i9 = zzaikVar.zza;
            if (i9 == 11) {
                int i10 = 0;
                zzaip zzaipVar = null;
                while (iZzc < i8) {
                    iZzc = zzail.zzc(bArr, iZzc, zzaikVar);
                    int i11 = zzaikVar.zza;
                    int i12 = i11 >>> 3;
                    int i13 = i11 & 7;
                    if (i12 == 2) {
                        if (i13 != 0) {
                            if (i11 != 12) {
                                break;
                                break;
                            }
                            iZzc = zzail.zza(i11, bArr, iZzc, i8, zzaikVar);
                        } else {
                            iZzc = zzail.zzc(bArr, iZzc, zzaikVar);
                            i10 = zzaikVar.zza;
                            zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i10);
                        }
                    } else {
                        if (i12 == 3) {
                            if (zzdVar != null) {
                                zzalr.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i13 == 2) {
                                iZzc = zzail.zza(bArr, iZzc, zzaikVar);
                                zzaipVar = (zzaip) zzaikVar.zzc;
                            }
                        }
                        if (i11 != 12) {
                            break;
                        } else {
                            iZzc = zzail.zza(i11, bArr, iZzc, i8, zzaikVar);
                        }
                    }
                }
                if (zzaipVar != null) {
                    zzamnVarZzd.zza((i10 << 3) | 2, zzaipVar);
                }
                i7 = iZzc;
            } else if ((i9 & 7) == 2) {
                zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i9 >>> 3);
                if (zzdVar == null) {
                    i7 = zzail.zza(i9, bArr, iZzc, i8, zzamnVarZzd, zzaikVar);
                } else {
                    zzalr.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i7 = zzail.zza(i9, bArr, iZzc, i8, zzaikVar);
            }
        }
        if (i7 != i8) {
            throw zzakf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, zzanf zzanfVar) {
        Iterator itZzd = this.zzd.zza(t7).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzajt zzajtVar = (zzajt) entry.getKey();
            if (zzajtVar.zzc() == zzand.MESSAGE && !zzajtVar.zze() && !zzajtVar.zzd()) {
                if (entry instanceof zzakj) {
                    zzanfVar.zza(zzajtVar.zza(), (Object) ((zzakj) entry).zza().zzb());
                } else {
                    zzanfVar.zza(zzajtVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamo<?, ?> zzamoVar = this.zzb;
        zzamoVar.zza(zzamoVar.zzd(t7), zzanfVar);
    }
}
