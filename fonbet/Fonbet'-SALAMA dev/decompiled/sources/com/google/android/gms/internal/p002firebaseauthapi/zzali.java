package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
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
        int zzb = zzamoVar.zzb(zzamoVar.zzd(t7));
        return this.zzc ? zzb + this.zzd.zza(t7).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t7) {
        int hashCode = this.zzb.zzd(t7).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t7).hashCode() : hashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t7, zzals zzalsVar, zzajk zzajkVar) {
        boolean z4;
        zzamo<?, ?> zzamoVar = this.zzb;
        zzajm<?> zzajmVar = this.zzd;
        Object zzc = zzamoVar.zzc(t7);
        zzajr<?> zzb = zzajmVar.zzb(t7);
        while (zzalsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzalsVar.zzd();
                int i7 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzajmVar.zza(zzajkVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzajmVar.zza(zzalsVar, zza, zzajkVar, zzb);
                        } else {
                            z4 = zzamoVar.zza((zzamo<?, ?>) zzc, zzalsVar, 0);
                        }
                    } else {
                        z4 = zzalsVar.zzt();
                    }
                    if (z4) {
                        zzamoVar.zzb((Object) t7, (T) zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    zzaip zzaipVar = null;
                    while (zzalsVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzalsVar.zzd();
                        if (zzd2 == 16) {
                            i7 = zzalsVar.zzj();
                            obj = zzajmVar.zza(zzajkVar, this.zza, i7);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzajmVar.zza(zzalsVar, obj, zzajkVar, zzb);
                            } else {
                                zzaipVar = zzalsVar.zzp();
                            }
                        } else if (!zzalsVar.zzt()) {
                            break;
                        }
                    }
                    if (zzalsVar.zzd() != 12) {
                        throw zzakf.zzb();
                    }
                    if (zzaipVar != null) {
                        if (obj != null) {
                            zzajmVar.zza(zzaipVar, obj, zzajkVar, zzb);
                        } else {
                            zzamoVar.zza((zzamo<?, ?>) zzc, i7, zzaipVar);
                        }
                    }
                }
                z4 = true;
                if (z4) {
                }
            } catch (Throwable th) {
                zzamoVar.zzb((Object) t7, (T) zzc);
                throw th;
            }
        }
        zzamoVar.zzb((Object) t7, (T) zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        zzajy zzajyVar = (zzajy) t7;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar == zzamn.zzc()) {
            zzamnVar = zzamn.zzd();
            zzajyVar.zzb = zzamnVar;
        }
        ((zzajy.zzb) t7).zza();
        zzajy.zzd zzdVar = null;
        while (i7 < i8) {
            int zzc = zzail.zzc(bArr, i7, zzaikVar);
            int i9 = zzaikVar.zza;
            if (i9 == 11) {
                int i10 = 0;
                zzaip zzaipVar = null;
                while (zzc < i8) {
                    zzc = zzail.zzc(bArr, zzc, zzaikVar);
                    int i11 = zzaikVar.zza;
                    int i12 = i11 >>> 3;
                    int i13 = i11 & 7;
                    if (i12 != 2) {
                        if (i12 == 3) {
                            if (zzdVar != null) {
                                zzalr.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i13 == 2) {
                                zzc = zzail.zza(bArr, zzc, zzaikVar);
                                zzaipVar = (zzaip) zzaikVar.zzc;
                            }
                        }
                        if (i11 != 12) {
                            break;
                        } else {
                            zzc = zzail.zza(i11, bArr, zzc, i8, zzaikVar);
                        }
                    } else if (i13 == 0) {
                        zzc = zzail.zzc(bArr, zzc, zzaikVar);
                        i10 = zzaikVar.zza;
                        zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i10);
                    } else if (i11 != 12) {
                    }
                }
                if (zzaipVar != null) {
                    zzamnVar.zza((i10 << 3) | 2, zzaipVar);
                }
                i7 = zzc;
            } else if ((i9 & 7) == 2) {
                zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i9 >>> 3);
                if (zzdVar == null) {
                    i7 = zzail.zza(i9, bArr, zzc, i8, zzamnVar, zzaikVar);
                } else {
                    zzalr.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i7 = zzail.zza(i9, bArr, zzc, i8, zzaikVar);
            }
        }
        if (i7 != i8) {
            throw zzakf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, zzanf zzanfVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t7).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzajt zzajtVar = (zzajt) next.getKey();
            if (zzajtVar.zzc() == zzand.MESSAGE && !zzajtVar.zze() && !zzajtVar.zzd()) {
                if (next instanceof zzakj) {
                    zzanfVar.zza(zzajtVar.zza(), (Object) ((zzakj) next).zza().zzb());
                } else {
                    zzanfVar.zza(zzajtVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamo<?, ?> zzamoVar = this.zzb;
        zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t7), zzanfVar);
    }
}
