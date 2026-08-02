package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class zzls<T> implements zzme<T> {
    private final zzlm zza;
    private final zzmu<?, ?> zzb;
    private final boolean zzc;
    private final zzjv<?> zzd;

    @Override // com.google.android.gms.internal.measurement.zzme
    public final int zza(T t) {
        zzmu<?, ?> zzmuVar = this.zzb;
        int zzb = zzmuVar.zzb(zzmuVar.zzd(t));
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    static <T> zzls<T> zza(zzmu<?, ?> zzmuVar, zzjv<?> zzjvVar, zzlm zzlmVar) {
        return new zzls<>(zzmuVar, zzjvVar, zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final T zza() {
        zzlm zzlmVar = this.zza;
        if (zzlmVar instanceof zzkg) {
            return (T) ((zzkg) zzlmVar).zzci();
        }
        return (T) zzlmVar.zzcm().zzak();
    }

    private zzls(zzmu<?, ?> zzmuVar, zzjv<?> zzjvVar, zzlm zzlmVar) {
        this.zzb = zzmuVar;
        this.zzc = zzjvVar.zza(zzlmVar);
        this.zzd = zzjvVar;
        this.zza = zzlmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zzd(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, T t2) {
        zzmg.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzmg.zza(this.zzd, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzmf zzmfVar, zzjt zzjtVar) throws IOException {
        boolean z;
        zzmu<?, ?> zzmuVar = this.zzb;
        zzjv<?> zzjvVar = this.zzd;
        Object zzc = zzmuVar.zzc(t);
        zzjw<?> zzb = zzjvVar.zzb(t);
        while (zzmfVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzmfVar.zzd();
                int i = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzjvVar.zza(zzjtVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzjvVar.zza(zzmfVar, zza, zzjtVar, zzb);
                        } else {
                            z = zzmuVar.zza((zzmu<?, ?>) zzc, zzmfVar, 0);
                        }
                    } else {
                        z = zzmfVar.zzt();
                    }
                    if (z) {
                        return;
                    }
                } else {
                    Object obj = null;
                    zziy zziyVar = null;
                    while (zzmfVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzmfVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzmfVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzjvVar.zza(zzmfVar, obj, zzjtVar, zzb);
                            } else {
                                zziyVar = zzmfVar.zzp();
                            }
                        } else {
                            i = zzmfVar.zzj();
                            obj = zzjvVar.zza(zzjtVar, this.zza, i);
                        }
                    }
                    if (zzmfVar.zzd() != 12) {
                        throw zzkp.zzb();
                    }
                    if (zziyVar != null) {
                        if (obj != null) {
                            zzjvVar.zza(zziyVar, obj, zzjtVar, zzb);
                        } else {
                            zzmuVar.zza((zzmu<?, ?>) zzc, i, zziyVar);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            } finally {
                zzmuVar.zzb((Object) t, (T) zzc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzit zzitVar) throws IOException {
        int i3;
        zzkg zzkgVar = (zzkg) t;
        zzmx zzmxVar = zzkgVar.zzb;
        if (zzmxVar == zzmx.zzc()) {
            zzmxVar = zzmx.zzd();
            zzkgVar.zzb = zzmxVar;
        }
        zzmx zzmxVar2 = zzmxVar;
        ((zzkg.zzb) t).zza();
        zzkg.zzd zzdVar = null;
        while (i < i2) {
            int zzc = zziu.zzc(bArr, i, zzitVar);
            int i4 = zzitVar.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzit zzitVar2 = zzitVar;
                int i6 = 0;
                zziy zziyVar = null;
                while (true) {
                    if (zzc >= i5) {
                        i3 = zzc;
                        break;
                    }
                    i3 = zziu.zzc(bArr2, zzc, zzitVar2);
                    int i7 = zzitVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzdVar != null) {
                                zzma.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i9 == 2) {
                                zzc = zziu.zza(bArr2, i3, zzitVar2);
                                zziyVar = (zziy) zzitVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzc = zziu.zza(i7, bArr2, i3, i5, zzitVar2);
                        }
                    } else if (i9 == 0) {
                        zzc = zziu.zzc(bArr2, i3, zzitVar2);
                        i6 = zzitVar2.zza;
                        zzdVar = (zzkg.zzd) this.zzd.zza(zzitVar2.zzd, this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zziyVar != null) {
                    zzmxVar2.zza((i6 << 3) | 2, zziyVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzitVar = zzitVar2;
            } else if ((i4 & 7) == 2) {
                zzdVar = (zzkg.zzd) this.zzd.zza(zzitVar.zzd, this.zza, i4 >>> 3);
                if (zzdVar != null) {
                    zzma.zza();
                    throw new NoSuchMethodError();
                }
                i = zziu.zza(i4, bArr, zzc, i2, zzmxVar2, zzitVar);
            } else {
                i = zziu.zza(i4, bArr, zzc, i2, zzitVar);
            }
        }
        if (i != i2) {
            throw zzkp.zzg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, zznl zznlVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzjy zzjyVar = (zzjy) next.getKey();
            if (zzjyVar.zzc() != zznj.MESSAGE || zzjyVar.zze() || zzjyVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzkt) {
                zznlVar.zza(zzjyVar.zza(), (Object) ((zzkt) next).zza().zzb());
            } else {
                zznlVar.zza(zzjyVar.zza(), next.getValue());
            }
        }
        zzmu<?, ?> zzmuVar = this.zzb;
        zzmuVar.zza((zzmu<?, ?>) zzmuVar.zzd(t), zznlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zze(T t) {
        return this.zzd.zza(t).zzg();
    }
}
