package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzalg<T> implements zzalv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalk zzn;
    private final zzakm zzo;
    private final zzamo<?, ?> zzp;
    private final zzajm<?> zzq;
    private final zzakz zzr;

    private zzalg(int[] iArr, Object[] objArr, int i7, int i8, zzalc zzalcVar, boolean z4, int[] iArr2, int i9, int i10, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzalcVar instanceof zzajy;
        this.zzh = zzajmVar != null && zzajmVar.zza(zzalcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i9;
        this.zzm = i10;
        this.zzn = zzalkVar;
        this.zzo = zzakmVar;
        this.zzp = zzamoVar;
        this.zzq = zzajmVar;
        this.zzg = zzalcVar;
        this.zzr = zzakzVar;
    }

    private static <T> double zza(T t7, long j) {
        return ((Double) zzamp.zze(t7, j)).doubleValue();
    }

    private static <T> float zzb(T t7, long j) {
        return ((Float) zzamp.zze(t7, j)).floatValue();
    }

    private static <T> int zzc(T t7, long j) {
        return ((Integer) zzamp.zze(t7, j)).intValue();
    }

    private static <T> long zzd(T t7, long j) {
        return ((Long) zzamp.zze(t7, j)).longValue();
    }

    private final zzalv zze(int i7) {
        int i8 = (i7 / 3) << 1;
        zzalv zzalvVar = (zzalv) this.zzd[i8];
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zza2 = zzalr.zza().zza((Class) this.zzd[i8 + 1]);
        this.zzd[i8] = zza2;
        return zza2;
    }

    private final Object zzf(int i7) {
        return this.zzd[(i7 / 3) << 1];
    }

    private static boolean zzg(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i7, int i8, zzamw zzamwVar, Class<?> cls, zzaik zzaikVar) {
        switch (zzalj.zza[zzamwVar.ordinal()]) {
            case 1:
                int zzd = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Boolean.valueOf(zzaikVar.zzb != 0);
                return zzd;
            case 2:
                return zzail.zza(bArr, i7, zzaikVar);
            case 3:
                zzaikVar.zzc = Double.valueOf(zzail.zza(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                zzaikVar.zzc = Integer.valueOf(zzail.zzc(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                zzaikVar.zzc = Long.valueOf(zzail.zzd(bArr, i7));
                return i7 + 8;
            case 8:
                zzaikVar.zzc = Float.valueOf(zzail.zzb(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzail.zzc(bArr, i7, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzaikVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzaikVar.zzb);
                return zzd2;
            case 14:
                return zzail.zza(zzalr.zza().zza((Class) cls), bArr, i7, i8, zzaikVar);
            case 15:
                int zzc2 = zzail.zzc(bArr, i7, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzajb.zze(zzaikVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzajb.zza(zzaikVar.zzb));
                return zzd3;
            case 17:
                return zzail.zzb(bArr, i7, zzaikVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i7) {
        return this.zzc[i7 + 1];
    }

    private final zzakd zzd(int i7) {
        return (zzakd) this.zzd[((i7 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzajy) {
            return ((zzajy) obj).zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t7) {
        int i7;
        int zza2;
        int i8;
        int zzc;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzc2 = zzc(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & zzc2;
            int i12 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(Double.doubleToLongBits(zzamp.zza(t7, j)));
                    i9 = zza2 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    zza2 = Float.floatToIntBits(zzamp.zzb(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 5:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 7:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzh(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    zza2 = ((String) zzamp.zze(t7, j)).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 9:
                    Object zze = zzamp.zze(t7, j);
                    if (zze != null) {
                        i12 = zze.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i7 = i9 * 53;
                    zza2 = zzamp.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 12:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 13:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 14:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    zzc = zzamp.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 16:
                    i7 = i9 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 17:
                    Object zze2 = zzamp.zze(t7, j);
                    if (zze2 != null) {
                        i12 = zze2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i9 * 53;
                    zza2 = zzamp.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    zza2 = zzamp.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 51:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(Double.doubleToLongBits(zza(t7, j)));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = Float.floatToIntBits(zzb(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zze(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = ((String) zzamp.zze(t7, j)).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzamp.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzamp.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzakb.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzalg<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzamp.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t7).hashCode() + (i9 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t7).hashCode() : hashCode;
    }

    public static zzamn zzc(Object obj) {
        zzajy zzajyVar = (zzajy) obj;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar != zzamn.zzc()) {
            return zzamnVar;
        }
        zzamn zzd = zzamn.zzd();
        zzajyVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t7) {
        if (zzg(t7)) {
            if (t7 instanceof zzajy) {
                zzajy zzajyVar = (zzajy) t7;
                zzajyVar.zzb(f.API_PRIORITY_OTHER);
                zzajyVar.zza = 0;
                zzajyVar.zzt();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzc = zzc(i7);
                long j = 1048575 & zzc;
                int i8 = (zzc & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 != 60 && i8 != 68) {
                        switch (i8) {
                            case 18:
                            case 19:
                            case 20:
                            case zzbbd.zzt.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(t7, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t7, j);
                                if (object != null) {
                                    unsafe.putObject(t7, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzalg<T>) t7, this.zzc[i7], i7)) {
                        zze(i7).zzd(zzb.getObject(t7, j));
                    }
                }
                if (zzc((zzalg<T>) t7, i7)) {
                    zze(i7).zzd(zzb.getObject(t7, j));
                }
            }
            this.zzp.zzf(t7);
            if (this.zzh) {
                this.zzq.zzc(t7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t7) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.zzl) {
            int i12 = this.zzk[i11];
            int i13 = this.zzc[i12];
            int zzc = zzc(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = zzb.getInt(t7, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & zzc) != 0 && !zza((zzalg<T>) t7, i12, i7, i8, i16)) {
                return false;
            }
            int i17 = (267386880 & zzc) >>> 20;
            if (i17 != 9 && i17 != 17) {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (zzc((zzalg<T>) t7, i13, i12) && !zza((Object) t7, zzc, zze(i12))) {
                            return false;
                        }
                    } else if (i17 != 49) {
                        if (i17 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzamp.zze(t7, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i12)).zzc.zzb() == zzand.MESSAGE) {
                                ?? r12 = 0;
                                for (Object obj : zzd.values()) {
                                    r12 = r12;
                                    if (r12 == 0) {
                                        r12 = zzalr.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r12.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzamp.zze(t7, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zze.zze(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zza((zzalg<T>) t7, i12, i7, i8, i16) && !zza((Object) t7, zzc, zze(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.zzh || this.zzq.zza(t7).zzg();
    }

    private final boolean zzc(T t7, T t8, int i7) {
        return zzc((zzalg<T>) t7, i7) == zzc((zzalg<T>) t8, i7);
    }

    private final boolean zzc(T t7, int i7) {
        int zzb2 = zzb(i7);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzamp.zzc(t7, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i7);
        long j3 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamp.zza(t7, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamp.zzb(t7, j3)) != 0;
            case 2:
                return zzamp.zzd(t7, j3) != 0;
            case 3:
                return zzamp.zzd(t7, j3) != 0;
            case 4:
                return zzamp.zzc(t7, j3) != 0;
            case 5:
                return zzamp.zzd(t7, j3) != 0;
            case 6:
                return zzamp.zzc(t7, j3) != 0;
            case 7:
                return zzamp.zzh(t7, j3);
            case 8:
                Object zze = zzamp.zze(t7, j3);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzaip) {
                    return !zzaip.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamp.zze(t7, j3) != null;
            case 10:
                return !zzaip.zza.equals(zzamp.zze(t7, j3));
            case 11:
                return zzamp.zzc(t7, j3) != 0;
            case 12:
                return zzamp.zzc(t7, j3) != 0;
            case 13:
                return zzamp.zzc(t7, j3) != 0;
            case 14:
                return zzamp.zzd(t7, j3) != 0;
            case 15:
                return zzamp.zzc(t7, j3) != 0;
            case 16:
                return zzamp.zzd(t7, j3) != 0;
            case 17:
                return zzamp.zze(t7, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t7) {
        int i7;
        int i8;
        int i9;
        int zza2;
        int zza3;
        int zza4;
        int zze;
        boolean z4;
        int zzc;
        int zzd;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int zzc2 = zzc(i13);
            int i15 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i10;
            if (i15 <= 17) {
                if (i18 != i11) {
                    i12 = i18 == i10 ? 0 : unsafe.getInt(t7, i18);
                    i11 = i18;
                }
                i7 = i11;
                i8 = i12;
                i9 = 1 << (i17 >>> 20);
            } else {
                i7 = i11;
                i8 = i12;
                i9 = 0;
            }
            long j = zzc2 & i10;
            if (i15 >= zzajs.zza.zza()) {
                zzajs.zzb.zza();
            }
            switch (i15) {
                case 0:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zza(i16, 0.0d);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zza(i16, 0.0f);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zzb(i16, unsafe.getLong(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zze(i16, unsafe.getLong(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zzd(i16, unsafe.getInt(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zza(i16, 0L);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajg.zzc(i16, 0);
                        i14 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zza(i16, true);
                        i14 += zza3;
                    }
                    break;
                case 8:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        Object object = unsafe.getObject(t7, j);
                        if (object instanceof zzaip) {
                            zza3 = zzajg.zza(i16, (zzaip) object);
                        } else {
                            zza3 = zzajg.zza(i16, (String) object);
                        }
                        i14 += zza3;
                    }
                    break;
                case 9:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza4 = zzalx.zza(i16, unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                        i14 += zza4;
                    }
                    break;
                case 10:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zza(i16, (zzaip) unsafe.getObject(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 11:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zzg(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 12:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zzb(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 13:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zze = zzajg.zze(i16, 0);
                        i14 += zze;
                    }
                    break;
                case 14:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zzc(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 15:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zzf(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 16:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zzd(i16, unsafe.getLong(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 17:
                    if (zza((zzalg<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajg.zza(i16, (zzalc) unsafe.getObject(t7, j), zze(i13));
                        i14 += zza3;
                    }
                    break;
                case 18:
                    zza4 = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zza4;
                    break;
                case 19:
                    z4 = false;
                    zzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 20:
                    z4 = false;
                    zzc = zzalx.zzf(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    z4 = false;
                    zzc = zzalx.zzj(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 22:
                    z4 = false;
                    zzc = zzalx.zze(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 23:
                    z4 = false;
                    zzc = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 24:
                    z4 = false;
                    zzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 25:
                    z4 = false;
                    zzc = zzalx.zza(i16, (List<?>) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 26:
                    zza4 = zzalx.zzb(i16, (List) unsafe.getObject(t7, j));
                    i14 += zza4;
                    break;
                case 27:
                    zza4 = zzalx.zzb(i16, (List<?>) unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                    i14 += zza4;
                    break;
                case 28:
                    zza4 = zzalx.zza(i16, (List<zzaip>) unsafe.getObject(t7, j));
                    i14 += zza4;
                    break;
                case 29:
                    zza4 = zzalx.zzi(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zza4;
                    break;
                case 30:
                    z4 = false;
                    zzc = zzalx.zzb(i16, (List<Integer>) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 31:
                    z4 = false;
                    zzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 32:
                    z4 = false;
                    zzc = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 33:
                    z4 = false;
                    zzc = zzalx.zzg(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 34:
                    z4 = false;
                    zzc = zzalx.zzh(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 35:
                    zzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 36:
                    zzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 37:
                    zzd = zzalx.zzf((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 38:
                    zzd = zzalx.zzj((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 39:
                    zzd = zzalx.zze((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 40:
                    zzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 41:
                    zzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 42:
                    zzd = zzalx.zza((List<?>) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 43:
                    zzd = zzalx.zzi((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 44:
                    zzd = zzalx.zzb((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 45:
                    zzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 46:
                    zzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 47:
                    zzd = zzalx.zzg((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 48:
                    zzd = zzalx.zzh((List) unsafe.getObject(t7, j));
                    if (zzd > 0) {
                        zzi = zzajg.zzi(i16);
                        zzj = zzajg.zzj(zzd);
                        i14 += zzj + zzi + zzd;
                    }
                    break;
                case 49:
                    zza4 = zzalx.zza(i16, (List<zzalc>) unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                    i14 += zza4;
                    break;
                case 50:
                    zza4 = this.zzr.zza(i16, unsafe.getObject(t7, j), zzf(i13));
                    i14 += zza4;
                    break;
                case 51:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, 0.0d);
                        i14 += zza3;
                    }
                    break;
                case 52:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, 0.0f);
                        i14 += zza3;
                    }
                    break;
                case 53:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzb(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 54:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zze(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 55:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzd(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 56:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 57:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zze = zzajg.zzc(i16, 0);
                        i14 += zze;
                    }
                    break;
                case 58:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, true);
                        i14 += zza3;
                    }
                    break;
                case 59:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        Object object2 = unsafe.getObject(t7, j);
                        if (object2 instanceof zzaip) {
                            zza3 = zzajg.zza(i16, (zzaip) object2);
                        } else {
                            zza3 = zzajg.zza(i16, (String) object2);
                        }
                        i14 += zza3;
                    }
                    break;
                case 60:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza4 = zzalx.zza(i16, unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                        i14 += zza4;
                    }
                    break;
                case 61:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, (zzaip) unsafe.getObject(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 62:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzg(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 63:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzb(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 64:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zze = zzajg.zze(i16, 0);
                        i14 += zze;
                    }
                    break;
                case 65:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzc(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 66:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzf(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 67:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zzd(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 68:
                    if (zzc((zzalg<T>) t7, i16, i13)) {
                        zza3 = zzajg.zza(i16, (zzalc) unsafe.getObject(t7, j), zze(i13));
                        i14 += zza3;
                    }
                    break;
            }
            i13 += 3;
            i11 = i7;
            i12 = i8;
            i10 = 1048575;
        }
        int i19 = 0;
        zzamo<?, ?> zzamoVar = this.zzp;
        int zza5 = i14 + zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t7));
        if (!this.zzh) {
            return zza5;
        }
        zzajr<?> zza6 = this.zzq.zza(t7);
        int zza7 = zza6.zza.zza();
        for (int i20 = 0; i20 < zza7; i20++) {
            Map.Entry<?, Object> zza8 = zza6.zza.zza(i20);
            i19 += zzajr.zza((zzajt<?>) zza8.getKey(), zza8.getValue());
        }
        for (Map.Entry<?, Object> entry : zza6.zza.zzb()) {
            i19 += zzajr.zza((zzajt<?>) entry.getKey(), entry.getValue());
        }
        return zza5 + i19;
    }

    private static <T> boolean zze(T t7, long j) {
        return ((Boolean) zzamp.zze(t7, j)).booleanValue();
    }

    private final boolean zzc(T t7, int i7, int i8) {
        return zzamp.zzc(t7, (long) (zzb(i8) & 1048575)) == i7;
    }

    private final int zzb(int i7) {
        return this.zzc[i7 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t7, T t8, int i7) {
        int i8 = this.zzc[i7];
        if (zzc((zzalg<T>) t8, i8, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, zzc);
            if (object != null) {
                zzalv zze = zze(i7);
                if (!zzc((zzalg<T>) t7, i8, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t7, zzc, zza2);
                    }
                    zzb((zzalg<T>) t7, i8, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t7, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zzb(T t7, int i7) {
        int zzb2 = zzb(i7);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzamp.zza((Object) t7, j, (1 << (zzb2 >>> 20)) | zzamp.zzc(t7, j));
    }

    private final void zzb(T t7, int i7, int i8) {
        zzamp.zza((Object) t7, zzb(i8) & 1048575, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t7, T t8) {
        int length = this.zzc.length;
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            if (i7 < length) {
                int zzc = zzc(i7);
                long j = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 1:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 2:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 3:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 4:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 5:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 6:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 7:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 8:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 9:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 10:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 11:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 12:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 13:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 14:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 15:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 16:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 17:
                        if (zzc(t7, t8, i7)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case zzbbd.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z4 = zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j));
                        break;
                    case 50:
                        z4 = zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zzb2 = zzb(i7) & 1048575;
                        if (zzamp.zzc(t7, zzb2) == zzamp.zzc(t8, zzb2)) {
                            break;
                        }
                        z4 = false;
                        break;
                }
                if (!z4) {
                    return false;
                }
                i7 += 3;
            } else {
                if (!this.zzp.zzd(t7).equals(this.zzp.zzd(t8))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t7).equals(this.zzq.zza(t8));
                }
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d79, code lost:
    
        if (r13 == r8) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d7b, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d81, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d88, code lost:
    
        if (r6 >= r11.zzm) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d8a, code lost:
    
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzamn) zza((java.lang.Object) r33, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzamo<UT, int>) r11.zzp, (java.lang.Object) r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0da0, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0da2, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0da7, code lost:
    
        if (r9 != 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dab, code lost:
    
        if (r7 != r36) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db2, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0db9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0db5, code lost:
    
        if (r7 > r36) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0db7, code lost:
    
        if (r10 != r9) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dbe, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(T t7, byte[] bArr, int i7, int i8, int i9, zzaik zzaikVar) {
        Unsafe unsafe;
        int i10;
        zzalg<T> zzalgVar;
        int i11;
        int i12;
        int zza2;
        int i13;
        zzalg<T> zzalgVar2;
        int i14;
        int i15;
        int i16;
        zzaik zzaikVar2;
        int i17;
        int i18;
        zzaik zzaikVar3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Unsafe unsafe2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzaik zzaikVar4;
        int i30;
        int i31;
        int i32;
        int zzd;
        int i33;
        int i34;
        int i35;
        int zza3;
        int i36;
        int i37;
        int zzc;
        int i38;
        int i39;
        Object obj;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzakc zzakcVar;
        int i40;
        zzaik zzaikVar5;
        int i41;
        int i42;
        Unsafe unsafe5;
        int i43;
        int i44;
        int i45;
        int i46;
        Unsafe unsafe6;
        int i47;
        int i48;
        int i49;
        int i50;
        zzaik zzaikVar6;
        int i51;
        int i52;
        Unsafe unsafe7;
        zzakc zzakcVar2;
        int i53;
        zzaik zzaikVar7;
        int i54;
        int i55;
        zzaik zzaikVar8;
        zzakc zzakcVar3;
        int zza4;
        zzalg<T> zzalgVar3 = this;
        T t8 = t7;
        byte[] bArr2 = bArr;
        int i56 = i8;
        int i57 = i9;
        zzaik zzaikVar9 = zzaikVar;
        zzf(t7);
        Unsafe unsafe8 = zzb;
        int i58 = i7;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = -1;
        int i63 = 1048575;
        while (true) {
            if (i58 < i56) {
                int i64 = i58 + 1;
                byte b7 = bArr2[i58];
                if (b7 < 0) {
                    int zza5 = zzail.zza(b7, bArr2, i64, zzaikVar9);
                    i12 = zzaikVar9.zza;
                    i64 = zza5;
                } else {
                    i12 = b7;
                }
                int i65 = i12 >>> 3;
                int i66 = i12 & 7;
                if (i65 > i62) {
                    zza2 = (i65 < zzalgVar3.zze || i65 > zzalgVar3.zzf) ? -1 : zzalgVar3.zza(i65, i59 / 3);
                } else {
                    zza2 = zzalgVar3.zza(i65);
                }
                int i67 = zza2;
                if (i67 == -1) {
                    unsafe = unsafe8;
                    i13 = i57;
                    zzalgVar2 = zzalgVar3;
                    i14 = i61;
                    i15 = i63;
                    i16 = 0;
                    zzaikVar2 = zzaikVar9;
                    i17 = i65;
                    i18 = i64;
                } else {
                    int[] iArr = zzalgVar3.zzc;
                    int i68 = iArr[i67 + 1];
                    int i69 = (i68 & 267386880) >>> 20;
                    int i70 = i64;
                    int i71 = i12;
                    long j = i68 & 1048575;
                    if (i69 <= 17) {
                        int i72 = iArr[i67 + 2];
                        int i73 = 1 << (i72 >>> 20);
                        int i74 = 1048575;
                        int i75 = i72 & 1048575;
                        if (i75 != i63) {
                            if (i63 != 1048575) {
                                unsafe8.putInt(t8, i63, i61);
                                i74 = 1048575;
                            }
                            i15 = i75;
                            i14 = i75 == i74 ? 0 : unsafe8.getInt(t8, i75);
                        } else {
                            i14 = i61;
                            i15 = i63;
                        }
                        switch (i69) {
                            case 0:
                                i21 = i8;
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 1) {
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    zzamp.zza(t8, j, zzail.zza(bArr2, i20));
                                    i24 = i20 + 8;
                                    i27 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 1:
                                i21 = i8;
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 5) {
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    zzamp.zza((Object) t8, j, zzail.zzb(bArr2, i20));
                                    i24 = i20 + 4;
                                    i27 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 2:
                            case 3:
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 0) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    int zzd2 = zzail.zzd(bArr2, i20, zzaikVar3);
                                    unsafe2.putLong(t7, j, zzaikVar3.zzb);
                                    i26 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i8;
                                    i58 = zzd2;
                                    i57 = i25;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i61 = i26;
                                }
                            case 4:
                            case 11:
                                i21 = i8;
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 0) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    i24 = zzail.zzc(bArr2, i20, zzaikVar3);
                                    unsafe2.putInt(t8, j, zzaikVar3.zza);
                                    i27 = i14 | i73;
                                    i57 = i25;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 5:
                            case 14:
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 1) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    unsafe2.putLong(t7, j, zzail.zzd(bArr2, i20));
                                    i24 = i20 + 8;
                                    i27 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i8;
                                    i57 = i25;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 6:
                            case 13:
                                i21 = i8;
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 5) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    unsafe2.putInt(t8, j, zzail.zzc(bArr2, i20));
                                    i24 = i20 + 4;
                                    i27 = i14 | i73;
                                    i57 = i25;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 7:
                                i21 = i8;
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 0) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    i24 = zzail.zzd(bArr2, i20, zzaikVar3);
                                    zzamp.zzc(t8, j, zzaikVar3.zzb != 0);
                                    i27 = i14 | i73;
                                    i57 = i25;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 8:
                                i21 = i8;
                                i25 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 2) {
                                    i57 = i25;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    if (zzg(i68)) {
                                        i24 = zzail.zzb(bArr2, i20, zzaikVar3);
                                    } else {
                                        i24 = zzail.zzc(bArr2, i20, zzaikVar3);
                                        int i76 = zzaikVar3.zza;
                                        if (i76 < 0) {
                                            throw zzakf.zzf();
                                        }
                                        if (i76 == 0) {
                                            zzaikVar3.zzc = "";
                                        } else {
                                            zzaikVar3.zzc = new String(bArr2, i24, i76, zzakb.zza);
                                            i24 += i76;
                                        }
                                    }
                                    unsafe2.putObject(t8, j, zzaikVar3.zzc);
                                    i27 = i14 | i73;
                                    i57 = i25;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 9:
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i28 = i71;
                                i20 = i70;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 2) {
                                    i22 = i28;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    Object zza6 = zzalgVar3.zza((zzalg<T>) t8, i19);
                                    i22 = i28;
                                    i24 = zzail.zza(zza6, zzalgVar3.zze(i19), bArr, i20, i8, zzaikVar);
                                    zzalgVar3.zza((zzalg<T>) t8, i19, zza6);
                                    i27 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i8;
                                    i57 = i57;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 10:
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i28 = i71;
                                i20 = i70;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 2) {
                                    i22 = i28;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    i24 = zzail.zza(bArr2, i20, zzaikVar3);
                                    unsafe2.putObject(t8, j, zzaikVar3.zzc);
                                    i27 = i14 | i73;
                                    i60 = i28;
                                    unsafe8 = unsafe2;
                                    i56 = i8;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 12:
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 0) {
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    int zzc2 = zzail.zzc(bArr2, i20, zzaikVar3);
                                    int i77 = zzaikVar3.zza;
                                    zzakd zzd3 = zzalgVar3.zzd(i19);
                                    if ((i68 & Integer.MIN_VALUE) != 0 && zzd3 != null && !zzd3.zza(i77)) {
                                        zzc(t7).zza(i22, Long.valueOf(i77));
                                        i60 = i22;
                                        unsafe8 = unsafe2;
                                        i56 = i8;
                                        i59 = i19;
                                        zzaikVar9 = zzaikVar3;
                                        i62 = i23;
                                        i61 = i14;
                                        i63 = i15;
                                    } else {
                                        unsafe2.putInt(t8, j, i77);
                                        i60 = i22;
                                        unsafe8 = unsafe2;
                                        i56 = i8;
                                        i59 = i19;
                                        zzaikVar9 = zzaikVar3;
                                        i62 = i23;
                                        i63 = i15;
                                        i61 = i14 | i73;
                                    }
                                    i58 = zzc2;
                                }
                            case 15:
                                i21 = i8;
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                if (i66 != 0) {
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    i24 = zzail.zzc(bArr2, i20, zzaikVar3);
                                    unsafe2.putInt(t8, j, zzajb.zze(zzaikVar3.zza));
                                    i27 = i14 | i73;
                                    unsafe8 = unsafe2;
                                    i56 = i21;
                                    i59 = i19;
                                    zzaikVar9 = zzaikVar3;
                                    i62 = i23;
                                    i60 = i22;
                                    i63 = i15;
                                    i58 = i24;
                                    i61 = i27;
                                }
                            case 16:
                                if (i66 != 0) {
                                    zzaikVar3 = zzaikVar9;
                                    unsafe2 = unsafe8;
                                    i19 = i67;
                                    i23 = i65;
                                    i20 = i70;
                                    i57 = i9;
                                    i22 = i71;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    int zzd4 = zzail.zzd(bArr2, i70, zzaikVar9);
                                    unsafe8.putLong(t7, j, zzajb.zza(zzaikVar9.zzb));
                                    i26 = i14 | i73;
                                    unsafe8 = unsafe8;
                                    i56 = i8;
                                    i57 = i9;
                                    i59 = i67;
                                    zzaikVar9 = zzaikVar9;
                                    i62 = i65;
                                    i60 = i71;
                                    i63 = i15;
                                    i58 = zzd4;
                                    i61 = i26;
                                }
                            case 17:
                                if (i66 != 3) {
                                    i57 = i9;
                                    zzaikVar3 = zzaikVar9;
                                    i19 = i67;
                                    i20 = i70;
                                    i22 = i71;
                                    i23 = i65;
                                    unsafe2 = unsafe8;
                                    i13 = i57;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    zzaikVar2 = zzaikVar3;
                                    i17 = i23;
                                    i12 = i22;
                                    i16 = i19;
                                    break;
                                } else {
                                    Object zza7 = zzalgVar3.zza((zzalg<T>) t8, i67);
                                    i58 = zzail.zza(zza7, zzalgVar3.zze(i67), bArr, i70, i8, (i65 << 3) | 4, zzaikVar);
                                    zzalgVar3.zza((zzalg<T>) t8, i67, zza7);
                                    i61 = i14 | i73;
                                    i60 = i71;
                                    i59 = i67;
                                    i62 = i65;
                                    i63 = i15;
                                    i56 = i8;
                                    i57 = i9;
                                }
                            default:
                                i57 = i9;
                                zzaikVar3 = zzaikVar9;
                                i19 = i67;
                                i20 = i70;
                                i22 = i71;
                                i23 = i65;
                                unsafe2 = unsafe8;
                                i13 = i57;
                                zzalgVar2 = zzalgVar3;
                                unsafe = unsafe2;
                                i18 = i20;
                                zzaikVar2 = zzaikVar3;
                                i17 = i23;
                                i12 = i22;
                                i16 = i19;
                                break;
                        }
                    } else {
                        i14 = i61;
                        i15 = i63;
                        zzaik zzaikVar10 = zzaikVar9;
                        int i78 = i71;
                        Unsafe unsafe9 = unsafe8;
                        if (i69 != 27) {
                            if (i69 > 49) {
                                Unsafe unsafe10 = unsafe9;
                                i59 = i67;
                                i29 = i70;
                                int i79 = i78;
                                if (i69 != 50) {
                                    zzaikVar2 = zzaikVar10;
                                    unsafe = unsafe10;
                                    t8 = t7;
                                    Unsafe unsafe11 = zzb;
                                    long j3 = iArr[i59 + 2] & 1048575;
                                    switch (i69) {
                                        case 51:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 1) {
                                                unsafe11.putObject(t8, j, Double.valueOf(zzail.zza(bArr2, i31)));
                                                i32 = i31 + 8;
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = i32;
                                                if (i58 == i31) {
                                                    bArr2 = bArr;
                                                    i56 = i8;
                                                    zzaikVar9 = zzaikVar2;
                                                    i60 = i12;
                                                    i59 = i16;
                                                    i62 = i17;
                                                    i61 = i14;
                                                    i63 = i15;
                                                    unsafe8 = unsafe;
                                                    zzalgVar3 = zzalgVar2;
                                                    i57 = i9;
                                                    break;
                                                } else {
                                                    i13 = i9;
                                                    i18 = i58;
                                                    break;
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                        case 52:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 5) {
                                                unsafe11.putObject(t8, j, Float.valueOf(zzail.zzb(bArr2, i31)));
                                                i32 = i31 + 4;
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = i32;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 0) {
                                                zzd = zzail.zzd(bArr2, i31, zzaikVar2);
                                                unsafe11.putObject(t8, j, Long.valueOf(zzaikVar2.zzb));
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = zzd;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 0) {
                                                zzd = zzail.zzc(bArr2, i31, zzaikVar2);
                                                unsafe11.putObject(t8, j, Integer.valueOf(zzaikVar2.zza));
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = zzd;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 1) {
                                                unsafe11.putObject(t8, j, Long.valueOf(zzail.zzd(bArr2, i31)));
                                                i32 = i31 + 8;
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = i32;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 5) {
                                                unsafe11.putObject(t8, j, Integer.valueOf(zzail.zzc(bArr2, i31)));
                                                i32 = i31 + 4;
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = i32;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 58:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 0) {
                                                zzd = zzail.zzd(bArr2, i31, zzaikVar2);
                                                unsafe11.putObject(t8, j, Boolean.valueOf(zzaikVar2.zzb != 0));
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = zzd;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 59:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i16 = i59;
                                            i12 = i79;
                                            if (i66 == 2) {
                                                int zzc3 = zzail.zzc(bArr2, i31, zzaikVar2);
                                                int i80 = zzaikVar2.zza;
                                                if (i80 == 0) {
                                                    unsafe11.putObject(t8, j, "");
                                                } else {
                                                    if ((i68 & 536870912) != 0 && !zzamt.zzc(bArr2, zzc3, zzc3 + i80)) {
                                                        throw zzakf.zzd();
                                                    }
                                                    unsafe11.putObject(t8, j, new String(bArr2, zzc3, i80, zzakb.zza));
                                                    zzc3 += i80;
                                                }
                                                unsafe11.putInt(t8, j3, i17);
                                                i58 = zzc3;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 60:
                                            zzalgVar2 = this;
                                            i33 = i29;
                                            i34 = i59;
                                            i35 = i65;
                                            i12 = i79;
                                            if (i66 == 2) {
                                                Object zza8 = zzalgVar2.zza((zzalg<T>) t8, i35, i34);
                                                int zza9 = zzail.zza(zza8, zzalgVar2.zze(i34), bArr, i33, i8, zzaikVar);
                                                zzalgVar2.zza((zzalg<T>) t8, i35, i34, zza8);
                                                i58 = zza9;
                                                i16 = i34;
                                                i31 = i33;
                                                i17 = i35;
                                                zzalgVar2 = zzalgVar2;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i16 = i34;
                                            i17 = i35;
                                            i31 = i33;
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 61:
                                            zzalgVar2 = this;
                                            i33 = i29;
                                            i34 = i59;
                                            i35 = i65;
                                            i12 = i79;
                                            if (i66 == 2) {
                                                zza3 = zzail.zza(bArr2, i33, zzaikVar2);
                                                unsafe11.putObject(t8, j, zzaikVar2.zzc);
                                                unsafe11.putInt(t8, j3, i35);
                                                i58 = zza3;
                                                i16 = i34;
                                                i17 = i35;
                                                i31 = i33;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i16 = i34;
                                            i17 = i35;
                                            i31 = i33;
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 63:
                                            zzalgVar2 = this;
                                            i33 = i29;
                                            i34 = i59;
                                            i35 = i65;
                                            if (i66 == 0) {
                                                zza3 = zzail.zzc(bArr2, i33, zzaikVar2);
                                                int i81 = zzaikVar2.zza;
                                                zzakd zzd5 = zzalgVar2.zzd(i34);
                                                if (zzd5 != null && !zzd5.zza(i81)) {
                                                    i12 = i79;
                                                    zzc(t7).zza(i12, Long.valueOf(i81));
                                                } else {
                                                    i12 = i79;
                                                    unsafe11.putObject(t8, j, Integer.valueOf(i81));
                                                    unsafe11.putInt(t8, j3, i35);
                                                }
                                                i58 = zza3;
                                                i16 = i34;
                                                i17 = i35;
                                                i31 = i33;
                                                if (i58 == i31) {
                                                }
                                            } else {
                                                i12 = i79;
                                                i16 = i34;
                                                i17 = i35;
                                                i31 = i33;
                                                i58 = i31;
                                                if (i58 == i31) {
                                                }
                                            }
                                            break;
                                        case 66:
                                            zzalgVar2 = this;
                                            i33 = i29;
                                            i36 = i59;
                                            i35 = i65;
                                            i37 = i79;
                                            if (i66 == 0) {
                                                zzc = zzail.zzc(bArr2, i33, zzaikVar2);
                                                unsafe11.putObject(t8, j, Integer.valueOf(zzajb.zze(zzaikVar2.zza)));
                                                unsafe11.putInt(t8, j3, i35);
                                                i58 = zzc;
                                                i16 = i36;
                                                i12 = i37;
                                                i17 = i35;
                                                i31 = i33;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i16 = i36;
                                            i12 = i37;
                                            i17 = i35;
                                            i31 = i33;
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 67:
                                            zzalgVar2 = this;
                                            i33 = i29;
                                            i36 = i59;
                                            i35 = i65;
                                            i37 = i79;
                                            if (i66 == 0) {
                                                zzc = zzail.zzd(bArr2, i33, zzaikVar2);
                                                unsafe11.putObject(t8, j, Long.valueOf(zzajb.zza(zzaikVar2.zzb)));
                                                unsafe11.putInt(t8, j3, i35);
                                                i58 = zzc;
                                                i16 = i36;
                                                i12 = i37;
                                                i17 = i35;
                                                i31 = i33;
                                                if (i58 == i31) {
                                                }
                                            }
                                            i16 = i36;
                                            i12 = i37;
                                            i17 = i35;
                                            i31 = i33;
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                        case 68:
                                            if (i66 == 3) {
                                                zzalgVar2 = this;
                                                Object zza10 = zzalgVar2.zza((zzalg<T>) t8, i65, i59);
                                                i33 = i29;
                                                i58 = zzail.zza(zza10, zzalgVar2.zze(i59), bArr, i33, i8, (i79 & (-8)) | 4, zzaikVar);
                                                zzalgVar2.zza((zzalg<T>) t8, i65, i59, zza10);
                                                i16 = i59;
                                                i17 = i65;
                                                i12 = i79;
                                                i31 = i33;
                                                if (i58 == i31) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzalgVar2 = this;
                                            i31 = i29;
                                            i17 = i65;
                                            i12 = i79;
                                            i16 = i59;
                                            i58 = i31;
                                            if (i58 == i31) {
                                            }
                                            break;
                                    }
                                } else if (i66 == 2) {
                                    Unsafe unsafe12 = zzb;
                                    Object zzf = zzalgVar3.zzf(i59);
                                    zzaikVar4 = zzaikVar10;
                                    t8 = t7;
                                    Object object = unsafe12.getObject(t8, j);
                                    if (zzalgVar3.zzr.zzf(object)) {
                                        Object zzb2 = zzalgVar3.zzr.zzb(zzf);
                                        zzalgVar3.zzr.zza(zzb2, object);
                                        unsafe12.putObject(t8, j, zzb2);
                                        object = zzb2;
                                    }
                                    zzakx<?, ?> zza11 = zzalgVar3.zzr.zza(zzf);
                                    Map<?, ?> zze = zzalgVar3.zzr.zze(object);
                                    int zzc4 = zzail.zzc(bArr2, i29, zzaikVar4);
                                    int i82 = zzaikVar4.zza;
                                    if (i82 >= 0 && i82 <= i8 - zzc4) {
                                        int i83 = zzc4 + i82;
                                        Object obj2 = zza11.zzb;
                                        Object obj3 = zza11.zzd;
                                        Object obj4 = obj2;
                                        while (zzc4 < i83) {
                                            int i84 = zzc4 + 1;
                                            byte b8 = bArr2[zzc4];
                                            if (b8 < 0) {
                                                i84 = zzail.zza(b8, bArr2, i84, zzaikVar4);
                                                b8 = zzaikVar4.zza;
                                            }
                                            Object obj5 = obj3;
                                            int i85 = b8 >>> 3;
                                            Object obj6 = obj4;
                                            int i86 = b8 & 7;
                                            if (i85 == 1) {
                                                i38 = i83;
                                                i39 = i79;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                if (i86 == zza11.zza.zza()) {
                                                    zzc4 = zza(bArr, i84, i8, zza11.zza, (Class<?>) null, zzaikVar);
                                                    obj4 = zzaikVar4.zzc;
                                                    i83 = i38;
                                                    obj3 = obj5;
                                                    i79 = i39;
                                                    unsafe10 = unsafe3;
                                                }
                                            } else if (i85 == 2) {
                                                if (i86 == zza11.zzc.zza()) {
                                                    zzc4 = zza(bArr, i84, i8, zza11.zzc, zza11.zzd.getClass(), zzaikVar);
                                                    obj3 = zzaikVar4.zzc;
                                                    i83 = i83;
                                                    obj4 = obj6;
                                                    i79 = i79;
                                                } else {
                                                    i38 = i83;
                                                    i39 = i79;
                                                    obj = obj6;
                                                    unsafe3 = unsafe10;
                                                }
                                            } else {
                                                obj3 = obj5;
                                                i38 = i83;
                                                i39 = i79;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                zzc4 = zzail.zza(b8, bArr2, i84, i8, zzaikVar4);
                                                i83 = i38;
                                                obj4 = obj;
                                                i79 = i39;
                                                unsafe10 = unsafe3;
                                            }
                                            obj3 = obj5;
                                            zzc4 = zzail.zza(b8, bArr2, i84, i8, zzaikVar4);
                                            i83 = i38;
                                            obj4 = obj;
                                            i79 = i39;
                                            unsafe10 = unsafe3;
                                        }
                                        int i87 = i83;
                                        i30 = i79;
                                        unsafe = unsafe10;
                                        Object obj7 = obj4;
                                        if (zzc4 == i87) {
                                            zze.put(obj7, obj3);
                                            if (i87 == i29) {
                                                zzalgVar2 = this;
                                                i13 = i9;
                                                i18 = i87;
                                                zzaikVar2 = zzaikVar4;
                                                i17 = i65;
                                                i12 = i30;
                                            } else {
                                                i57 = i9;
                                                i58 = i87;
                                                zzaikVar9 = zzaikVar4;
                                                i56 = i8;
                                                i62 = i65;
                                                i61 = i14;
                                                i60 = i30;
                                                i63 = i15;
                                                unsafe8 = unsafe;
                                                zzalgVar3 = this;
                                            }
                                        } else {
                                            throw zzakf.zzg();
                                        }
                                    }
                                } else {
                                    i30 = i79;
                                    zzaikVar4 = zzaikVar10;
                                    unsafe = unsafe10;
                                    t8 = t7;
                                    zzalgVar2 = this;
                                    i13 = i9;
                                    i18 = i29;
                                    zzaikVar2 = zzaikVar4;
                                    i17 = i65;
                                    i12 = i30;
                                }
                            } else {
                                long j7 = i68;
                                Unsafe unsafe13 = zzb;
                                zzakc zzakcVar4 = (zzakc) unsafe13.getObject(t8, j);
                                if (zzakcVar4.zzc()) {
                                    unsafe4 = unsafe9;
                                    zzakcVar = zzakcVar4;
                                } else {
                                    unsafe4 = unsafe9;
                                    zzakcVar = zzakcVar4.zza(zzakcVar4.size() << 1);
                                    unsafe13.putObject(t8, j, zzakcVar);
                                }
                                switch (i69) {
                                    case 18:
                                    case 35:
                                        i40 = i9;
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i41 = i70;
                                        i42 = i78;
                                        unsafe5 = unsafe4;
                                        i43 = i8;
                                        if (i66 != 2) {
                                            if (i66 == 1) {
                                                zzaji zzajiVar = (zzaji) zzakcVar;
                                                zzajiVar.zza(zzail.zza(bArr2, i41));
                                                i44 = i41 + 8;
                                                while (i44 < i43) {
                                                    int zzc5 = zzail.zzc(bArr2, i44, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        zzajiVar.zza(zzail.zza(bArr2, zzc5));
                                                        i44 = zzc5 + 8;
                                                    }
                                                }
                                            }
                                            i45 = i41;
                                            if (i45 != i41) {
                                                i58 = i45;
                                                i57 = i40;
                                                unsafe8 = unsafe5;
                                                i60 = i42;
                                                i56 = i43;
                                                zzaikVar9 = zzaikVar5;
                                                i62 = i65;
                                                i61 = i14;
                                                i63 = i15;
                                                t8 = t7;
                                                break;
                                            } else {
                                                i18 = i45;
                                                zzalgVar2 = zzalgVar3;
                                                i13 = i40;
                                                unsafe = unsafe5;
                                                i12 = i42;
                                                zzaikVar2 = zzaikVar5;
                                                i17 = i65;
                                                t8 = t7;
                                                break;
                                            }
                                        } else {
                                            zzaji zzajiVar2 = (zzaji) zzakcVar;
                                            i44 = zzail.zzc(bArr2, i41, zzaikVar5);
                                            int i88 = zzaikVar5.zza;
                                            int i89 = i44 + i88;
                                            if (i89 <= bArr2.length) {
                                                zzajiVar2.zzc((i88 / 8) + zzajiVar2.size());
                                                while (i44 < i89) {
                                                    zzajiVar2.zza(zzail.zza(bArr2, i44));
                                                    i44 += 8;
                                                }
                                                if (i44 != i89) {
                                                    throw zzakf.zzj();
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        i45 = i44;
                                        if (i45 != i41) {
                                        }
                                    case 19:
                                    case 36:
                                        i40 = i9;
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i41 = i70;
                                        i42 = i78;
                                        unsafe5 = unsafe4;
                                        i43 = i8;
                                        if (i66 == 2) {
                                            zzajx zzajxVar = (zzajx) zzakcVar;
                                            i44 = zzail.zzc(bArr2, i41, zzaikVar5);
                                            int i90 = zzaikVar5.zza;
                                            int i91 = i44 + i90;
                                            if (i91 <= bArr2.length) {
                                                zzajxVar.zzc((i90 / 4) + zzajxVar.size());
                                                while (i44 < i91) {
                                                    zzajxVar.zza(zzail.zzb(bArr2, i44));
                                                    i44 += 4;
                                                }
                                                if (i44 != i91) {
                                                    throw zzakf.zzj();
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 5) {
                                                zzajx zzajxVar2 = (zzajx) zzakcVar;
                                                zzajxVar2.zza(zzail.zzb(bArr2, i41));
                                                i44 = i41 + 4;
                                                while (i44 < i43) {
                                                    int zzc6 = zzail.zzc(bArr2, i44, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        zzajxVar2.zza(zzail.zzb(bArr2, zzc6));
                                                        i44 = zzc6 + 4;
                                                    }
                                                }
                                            }
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        i45 = i44;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        i40 = i9;
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i41 = i70;
                                        i42 = i78;
                                        unsafe5 = unsafe4;
                                        i43 = i8;
                                        if (i66 == 2) {
                                            zzakr zzakrVar = (zzakr) zzakcVar;
                                            i44 = zzail.zzc(bArr2, i41, zzaikVar5);
                                            int i92 = zzaikVar5.zza + i44;
                                            while (i44 < i92) {
                                                i44 = zzail.zzd(bArr2, i44, zzaikVar5);
                                                zzakrVar.zza(zzaikVar5.zzb);
                                            }
                                            if (i44 != i92) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 0) {
                                                zzakr zzakrVar2 = (zzakr) zzakcVar;
                                                i44 = zzail.zzd(bArr2, i41, zzaikVar5);
                                                zzakrVar2.zza(zzaikVar5.zzb);
                                                while (i44 < i43) {
                                                    int zzc7 = zzail.zzc(bArr2, i44, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        i44 = zzail.zzd(bArr2, zzc7, zzaikVar5);
                                                        zzakrVar2.zza(zzaikVar5.zzb);
                                                    }
                                                }
                                            }
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        i45 = i44;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i46 = i70;
                                        i42 = i78;
                                        unsafe6 = unsafe4;
                                        i43 = i8;
                                        i47 = i9;
                                        if (i66 == 2) {
                                            i45 = zzail.zza(bArr2, i46, (zzakc<?>) zzakcVar, zzaikVar5);
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            if (i45 != i41) {
                                            }
                                        } else {
                                            if (i66 == 0) {
                                                i41 = i46;
                                                i40 = i47;
                                                unsafe5 = unsafe6;
                                                i44 = zzail.zza(i42, bArr, i41, i8, (zzakc<?>) zzakcVar, zzaikVar);
                                                i45 = i44;
                                                if (i45 != i41) {
                                                }
                                            }
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i46 = i70;
                                        i42 = i78;
                                        unsafe6 = unsafe4;
                                        i43 = i8;
                                        i47 = i9;
                                        if (i66 == 2) {
                                            zzakr zzakrVar3 = (zzakr) zzakcVar;
                                            i45 = zzail.zzc(bArr2, i46, zzaikVar5);
                                            int i93 = zzaikVar5.zza;
                                            int i94 = i45 + i93;
                                            if (i94 <= bArr2.length) {
                                                zzakrVar3.zzc((i93 / 8) + zzakrVar3.size());
                                                while (i45 < i94) {
                                                    zzakrVar3.zza(zzail.zzd(bArr2, i45));
                                                    i45 += 8;
                                                }
                                                if (i45 != i94) {
                                                    throw zzakf.zzj();
                                                }
                                                i41 = i46;
                                                i40 = i47;
                                                unsafe5 = unsafe6;
                                                if (i45 != i41) {
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 1) {
                                                zzakr zzakrVar4 = (zzakr) zzakcVar;
                                                zzakrVar4.zza(zzail.zzd(bArr2, i46));
                                                i48 = i46 + 8;
                                                while (i48 < i43) {
                                                    int zzc8 = zzail.zzc(bArr2, i48, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        zzakrVar4.zza(zzail.zzd(bArr2, zzc8));
                                                        i48 = zzc8 + 8;
                                                    } else {
                                                        i41 = i46;
                                                        i40 = i47;
                                                        i45 = i48;
                                                        unsafe5 = unsafe6;
                                                        if (i45 != i41) {
                                                        }
                                                    }
                                                }
                                                i41 = i46;
                                                i40 = i47;
                                                i45 = i48;
                                                unsafe5 = unsafe6;
                                                if (i45 != i41) {
                                                }
                                            }
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i46 = i70;
                                        i42 = i78;
                                        unsafe6 = unsafe4;
                                        i43 = i8;
                                        i47 = i9;
                                        if (i66 == 2) {
                                            zzajz zzajzVar = (zzajz) zzakcVar;
                                            i45 = zzail.zzc(bArr2, i46, zzaikVar5);
                                            int i95 = zzaikVar5.zza;
                                            int i96 = i45 + i95;
                                            if (i96 <= bArr2.length) {
                                                zzajzVar.zzd((i95 / 4) + zzajzVar.size());
                                                while (i45 < i96) {
                                                    zzajzVar.zzc(zzail.zzc(bArr2, i45));
                                                    i45 += 4;
                                                }
                                                if (i45 != i96) {
                                                    throw zzakf.zzj();
                                                }
                                                i41 = i46;
                                                i40 = i47;
                                                unsafe5 = unsafe6;
                                                if (i45 != i41) {
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 5) {
                                                zzajz zzajzVar2 = (zzajz) zzakcVar;
                                                zzajzVar2.zzc(zzail.zzc(bArr2, i46));
                                                i48 = i46 + 4;
                                                while (i48 < i43) {
                                                    int zzc9 = zzail.zzc(bArr2, i48, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        zzajzVar2.zzc(zzail.zzc(bArr2, zzc9));
                                                        i48 = zzc9 + 4;
                                                    } else {
                                                        i41 = i46;
                                                        i40 = i47;
                                                        i45 = i48;
                                                        unsafe5 = unsafe6;
                                                        if (i45 != i41) {
                                                        }
                                                    }
                                                }
                                                i41 = i46;
                                                i40 = i47;
                                                i45 = i48;
                                                unsafe5 = unsafe6;
                                                if (i45 != i41) {
                                                }
                                            }
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i46 = i70;
                                        i42 = i78;
                                        unsafe6 = unsafe4;
                                        i43 = i8;
                                        i47 = i9;
                                        if (i66 == 2) {
                                            zzain zzainVar = (zzain) zzakcVar;
                                            i45 = zzail.zzc(bArr2, i46, zzaikVar5);
                                            int i97 = zzaikVar5.zza + i45;
                                            while (i45 < i97) {
                                                i45 = zzail.zzd(bArr2, i45, zzaikVar5);
                                                zzainVar.zza(zzaikVar5.zzb != 0);
                                            }
                                            if (i45 != i97) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 0) {
                                                zzain zzainVar2 = (zzain) zzakcVar;
                                                i45 = zzail.zzd(bArr2, i46, zzaikVar5);
                                                zzainVar2.zza(zzaikVar5.zzb != 0);
                                                while (i45 < i43) {
                                                    int zzc10 = zzail.zzc(bArr2, i45, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        i45 = zzail.zzd(bArr2, zzc10, zzaikVar5);
                                                        zzainVar2.zza(zzaikVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        i41 = i46;
                                        i40 = i47;
                                        unsafe5 = unsafe6;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 26:
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i46 = i70;
                                        i42 = i78;
                                        unsafe6 = unsafe4;
                                        i43 = i8;
                                        i47 = i9;
                                        if (i66 == 2) {
                                            if ((j7 & 536870912) == 0) {
                                                i45 = zzail.zzc(bArr2, i46, zzaikVar5);
                                                int i98 = zzaikVar5.zza;
                                                if (i98 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i98 == 0) {
                                                    zzakcVar.add("");
                                                } else {
                                                    zzakcVar.add(new String(bArr2, i45, i98, zzakb.zza));
                                                    i45 += i98;
                                                }
                                                while (i45 < i43) {
                                                    int zzc11 = zzail.zzc(bArr2, i45, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        i45 = zzail.zzc(bArr2, zzc11, zzaikVar5);
                                                        int i99 = zzaikVar5.zza;
                                                        if (i99 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i99 == 0) {
                                                            zzakcVar.add("");
                                                        } else {
                                                            zzakcVar.add(new String(bArr2, i45, i99, zzakb.zza));
                                                            i45 += i99;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i45 = zzail.zzc(bArr2, i46, zzaikVar5);
                                                int i100 = zzaikVar5.zza;
                                                if (i100 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i100 == 0) {
                                                    zzakcVar.add("");
                                                } else {
                                                    int i101 = i45 + i100;
                                                    if (zzamt.zzc(bArr2, i45, i101)) {
                                                        zzakcVar.add(new String(bArr2, i45, i100, zzakb.zza));
                                                        i45 = i101;
                                                    } else {
                                                        throw zzakf.zzd();
                                                    }
                                                }
                                                while (i45 < i43) {
                                                    int zzc12 = zzail.zzc(bArr2, i45, zzaikVar5);
                                                    if (i42 == zzaikVar5.zza) {
                                                        i45 = zzail.zzc(bArr2, zzc12, zzaikVar5);
                                                        int i102 = zzaikVar5.zza;
                                                        if (i102 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i102 == 0) {
                                                            zzakcVar.add("");
                                                        } else {
                                                            int i103 = i45 + i102;
                                                            if (zzamt.zzc(bArr2, i45, i103)) {
                                                                zzakcVar.add(new String(bArr2, i45, i102, zzakb.zza));
                                                                i45 = i103;
                                                            } else {
                                                                throw zzakf.zzd();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i41 = i46;
                                            i40 = i47;
                                            unsafe5 = unsafe6;
                                            if (i45 != i41) {
                                            }
                                        }
                                        i41 = i46;
                                        i40 = i47;
                                        unsafe5 = unsafe6;
                                        i45 = i41;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 27:
                                        i40 = i9;
                                        i49 = i8;
                                        i50 = i67;
                                        zzaikVar6 = zzaikVar10;
                                        i51 = i70;
                                        i52 = i78;
                                        unsafe7 = unsafe4;
                                        if (i66 == 2) {
                                            zzaikVar5 = zzaikVar6;
                                            int zzb3 = zzail.zzb(zzalgVar3.zze(i50), i52, bArr, i51, i8, zzakcVar, zzaikVar);
                                            i43 = i49;
                                            i59 = i50;
                                            i40 = i40;
                                            unsafe5 = unsafe7;
                                            i42 = i52;
                                            i45 = zzb3;
                                            i41 = i51;
                                            if (i45 != i41) {
                                            }
                                        }
                                        zzaikVar5 = zzaikVar6;
                                        i42 = i52;
                                        i43 = i49;
                                        unsafe5 = unsafe7;
                                        i41 = i51;
                                        i59 = i50;
                                        i45 = i41;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 28:
                                        i40 = i9;
                                        i49 = i8;
                                        zzakc zzakcVar5 = zzakcVar;
                                        i50 = i67;
                                        zzaikVar6 = zzaikVar10;
                                        i51 = i70;
                                        i52 = i78;
                                        unsafe7 = unsafe4;
                                        if (i66 == 2) {
                                            int zzc13 = zzail.zzc(bArr2, i51, zzaikVar6);
                                            int i104 = zzaikVar6.zza;
                                            if (i104 >= 0) {
                                                if (i104 > bArr2.length - zzc13) {
                                                    throw zzakf.zzj();
                                                }
                                                if (i104 == 0) {
                                                    zzakcVar2 = zzakcVar5;
                                                    zzakcVar2.add(zzaip.zza);
                                                } else {
                                                    zzakcVar2 = zzakcVar5;
                                                    zzakcVar2.add(zzaip.zza(bArr2, zzc13, i104));
                                                    zzc13 += i104;
                                                }
                                                while (zzc13 < i49) {
                                                    int zzc14 = zzail.zzc(bArr2, zzc13, zzaikVar6);
                                                    if (i52 == zzaikVar6.zza) {
                                                        zzc13 = zzail.zzc(bArr2, zzc14, zzaikVar6);
                                                        int i105 = zzaikVar6.zza;
                                                        if (i105 >= 0) {
                                                            if (i105 > bArr2.length - zzc13) {
                                                                throw zzakf.zzj();
                                                            }
                                                            if (i105 == 0) {
                                                                zzakcVar2.add(zzaip.zza);
                                                            } else {
                                                                zzakcVar2.add(zzaip.zza(bArr2, zzc13, i105));
                                                                zzc13 += i105;
                                                            }
                                                        } else {
                                                            throw zzakf.zzf();
                                                        }
                                                    } else {
                                                        i45 = zzc13;
                                                        zzaikVar5 = zzaikVar6;
                                                        i42 = i52;
                                                        i43 = i49;
                                                        unsafe5 = unsafe7;
                                                        i41 = i51;
                                                        i59 = i50;
                                                        if (i45 != i41) {
                                                        }
                                                    }
                                                }
                                                i45 = zzc13;
                                                zzaikVar5 = zzaikVar6;
                                                i42 = i52;
                                                i43 = i49;
                                                unsafe5 = unsafe7;
                                                i41 = i51;
                                                i59 = i50;
                                                if (i45 != i41) {
                                                }
                                            } else {
                                                throw zzakf.zzf();
                                            }
                                        }
                                        zzaikVar5 = zzaikVar6;
                                        i42 = i52;
                                        i43 = i49;
                                        unsafe5 = unsafe7;
                                        i41 = i51;
                                        i59 = i50;
                                        i45 = i41;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i53 = i67;
                                        zzaikVar7 = zzaikVar10;
                                        i54 = i70;
                                        i55 = i78;
                                        if (i66 == 2) {
                                            i40 = i9;
                                            zzaikVar8 = zzaikVar7;
                                            zza4 = zzail.zza(bArr2, i54, (zzakc<?>) zzakcVar, zzaikVar7);
                                            i50 = i53;
                                            i49 = i8;
                                            i51 = i54;
                                            zzakcVar3 = zzakcVar;
                                            unsafe7 = unsafe4;
                                        } else {
                                            if (i66 == 0) {
                                                zzaikVar8 = zzaikVar7;
                                                i50 = i53;
                                                i49 = i8;
                                                i51 = i54;
                                                i40 = i9;
                                                zzakcVar3 = zzakcVar;
                                                unsafe7 = unsafe4;
                                                zza4 = zzail.zza(i55, bArr, i54, i8, (zzakc<?>) zzakcVar, zzaikVar);
                                            }
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i41 = i54;
                                            i42 = i55;
                                            unsafe5 = unsafe4;
                                            i43 = i8;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        zzalx.zza(t7, i65, zzakcVar3, zzalgVar3.zzd(i50), null, zzalgVar3.zzp);
                                        zzaikVar5 = zzaikVar8;
                                        i42 = i55;
                                        i45 = zza4;
                                        i43 = i49;
                                        unsafe5 = unsafe7;
                                        i41 = i51;
                                        i59 = i50;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i53 = i67;
                                        zzaikVar7 = zzaikVar10;
                                        i54 = i70;
                                        i55 = i78;
                                        if (i66 == 2) {
                                            zzajz zzajzVar3 = (zzajz) zzakcVar;
                                            i45 = zzail.zzc(bArr2, i54, zzaikVar7);
                                            int i106 = zzaikVar7.zza + i45;
                                            while (i45 < i106) {
                                                i45 = zzail.zzc(bArr2, i45, zzaikVar7);
                                                zzajzVar3.zzc(zzajb.zze(zzaikVar7.zza));
                                            }
                                            if (i45 != i106) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i66 == 0) {
                                                zzajz zzajzVar4 = (zzajz) zzakcVar;
                                                i45 = zzail.zzc(bArr2, i54, zzaikVar7);
                                                zzajzVar4.zzc(zzajb.zze(zzaikVar7.zza));
                                                while (i45 < i8) {
                                                    int zzc15 = zzail.zzc(bArr2, i45, zzaikVar7);
                                                    if (i55 == zzaikVar7.zza) {
                                                        i45 = zzail.zzc(bArr2, zzc15, zzaikVar7);
                                                        zzajzVar4.zzc(zzajb.zze(zzaikVar7.zza));
                                                    }
                                                }
                                            }
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i41 = i54;
                                            i42 = i55;
                                            unsafe5 = unsafe4;
                                            i43 = i8;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        i40 = i9;
                                        zzaikVar5 = zzaikVar7;
                                        i59 = i53;
                                        i41 = i54;
                                        i42 = i55;
                                        unsafe5 = unsafe4;
                                        i43 = i8;
                                        if (i45 != i41) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i53 = i67;
                                        zzaikVar7 = zzaikVar10;
                                        i54 = i70;
                                        if (i66 == 2) {
                                            zzakr zzakrVar5 = (zzakr) zzakcVar;
                                            i45 = zzail.zzc(bArr2, i54, zzaikVar7);
                                            int i107 = zzaikVar7.zza + i45;
                                            while (i45 < i107) {
                                                i45 = zzail.zzd(bArr2, i45, zzaikVar7);
                                                zzakrVar5.zza(zzajb.zza(zzaikVar7.zzb));
                                            }
                                            if (i45 != i107) {
                                                throw zzakf.zzj();
                                            }
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i43 = i8;
                                            i41 = i54;
                                            i42 = i78;
                                            unsafe5 = unsafe4;
                                            if (i45 != i41) {
                                            }
                                        } else if (i66 == 0) {
                                            zzakr zzakrVar6 = (zzakr) zzakcVar;
                                            i45 = zzail.zzd(bArr2, i54, zzaikVar7);
                                            zzakrVar6.zza(zzajb.zza(zzaikVar7.zzb));
                                            while (true) {
                                                if (i45 < i8) {
                                                    int zzc16 = zzail.zzc(bArr2, i45, zzaikVar7);
                                                    i55 = i78;
                                                    if (i55 == zzaikVar7.zza) {
                                                        i45 = zzail.zzd(bArr2, zzc16, zzaikVar7);
                                                        zzakrVar6.zza(zzajb.zza(zzaikVar7.zzb));
                                                        i78 = i55;
                                                    }
                                                } else {
                                                    i55 = i78;
                                                }
                                            }
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i41 = i54;
                                            i42 = i55;
                                            unsafe5 = unsafe4;
                                            i43 = i8;
                                            if (i45 != i41) {
                                            }
                                        } else {
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i43 = i8;
                                            i41 = i54;
                                            i42 = i78;
                                            unsafe5 = unsafe4;
                                            i45 = i41;
                                            if (i45 != i41) {
                                            }
                                        }
                                        break;
                                    case 49:
                                        if (i66 == 3) {
                                            i54 = i70;
                                            i53 = i67;
                                            zzaikVar7 = zzaikVar10;
                                            i45 = zzail.zza(zzalgVar3.zze(i67), i78, bArr, i54, i8, (zzakc<?>) zzakcVar, zzaikVar);
                                            i40 = i9;
                                            zzaikVar5 = zzaikVar7;
                                            i59 = i53;
                                            i43 = i8;
                                            i41 = i54;
                                            i42 = i78;
                                            unsafe5 = unsafe4;
                                            if (i45 != i41) {
                                            }
                                        }
                                        break;
                                    default:
                                        i40 = i9;
                                        i59 = i67;
                                        zzaikVar5 = zzaikVar10;
                                        i41 = i70;
                                        i42 = i78;
                                        unsafe5 = unsafe4;
                                        i43 = i8;
                                        i45 = i41;
                                        if (i45 != i41) {
                                        }
                                        break;
                                }
                            }
                        } else if (i66 == 2) {
                            zzakc zzakcVar6 = (zzakc) unsafe9.getObject(t8, j);
                            if (!zzakcVar6.zzc()) {
                                int size = zzakcVar6.size();
                                zzakcVar6 = zzakcVar6.zza(size == 0 ? 10 : size << 1);
                                unsafe9.putObject(t8, j, zzakcVar6);
                            }
                            i58 = zzail.zzb(zzalgVar3.zze(i67), i78, bArr, i70, i8, zzakcVar6, zzaikVar);
                            zzaikVar9 = zzaikVar10;
                            i59 = i67;
                            i56 = i8;
                            unsafe8 = unsafe9;
                            i62 = i65;
                            i60 = i78;
                            i61 = i14;
                            i63 = i15;
                            i57 = i9;
                        } else {
                            unsafe = unsafe9;
                            i29 = i70;
                            i59 = i67;
                            zzaikVar4 = zzaikVar10;
                            i30 = i78;
                            zzalgVar2 = this;
                            i13 = i9;
                            i18 = i29;
                            zzaikVar2 = zzaikVar4;
                            i17 = i65;
                            i12 = i30;
                        }
                        i16 = i59;
                    }
                }
                if (i12 == i13 && i13 != 0) {
                    i58 = i18;
                    i10 = i13;
                    i60 = i12;
                    i61 = i14;
                    i63 = i15;
                    i11 = 1048575;
                    zzalgVar = zzalgVar2;
                } else if (zzalgVar2.zzh && zzaikVar2.zzd != zzajk.zza) {
                    i58 = zzail.zza(i12, bArr, i18, i8, t7, zzalgVar2.zzg, zzalgVar2.zzp, zzaikVar);
                    bArr2 = bArr;
                    zzaikVar9 = zzaikVar2;
                    i60 = i12;
                    i59 = i16;
                    i62 = i17;
                    i61 = i14;
                    i63 = i15;
                    unsafe8 = unsafe;
                    zzalgVar3 = zzalgVar2;
                    i57 = i13;
                    i56 = i8;
                } else {
                    int i108 = i12;
                    int i109 = i13;
                    zzalg<T> zzalgVar4 = zzalgVar2;
                    i58 = zzail.zza(i108, bArr, i18, i8, zzc(t7), zzaikVar);
                    bArr2 = bArr;
                    i56 = i8;
                    zzaikVar9 = zzaikVar2;
                    i57 = i109;
                    zzalgVar3 = zzalgVar4;
                    i60 = i108;
                    i59 = i16;
                    i62 = i17;
                    i61 = i14;
                    i63 = i15;
                    unsafe8 = unsafe;
                }
            } else {
                unsafe = unsafe8;
                i10 = i57;
                zzalgVar = zzalgVar3;
                i11 = 1048575;
            }
        }
    }

    private final int zza(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zza(i7, 0);
    }

    private final int zza(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzalg<T> zza(Class<T> cls, zzala zzalaVar, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        int i7;
        int charAt;
        int charAt2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        int i22;
        int i23;
        int i24;
        zzalt zzaltVar;
        int i25;
        int objectFieldOffset;
        int i26;
        String str;
        int i27;
        int i28;
        int i29;
        Field zza2;
        int i30;
        char charAt11;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        if (zzalaVar instanceof zzalt) {
            zzalt zzaltVar2 = (zzalt) zzalaVar;
            String zzd = zzaltVar2.zzd();
            int length = zzd.length();
            char c3 = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i38 = 1;
                while (true) {
                    i7 = i38 + 1;
                    if (zzd.charAt(i38) < 55296) {
                        break;
                    }
                    i38 = i7;
                }
            } else {
                i7 = 1;
            }
            int i39 = i7 + 1;
            int charAt16 = zzd.charAt(i7);
            if (charAt16 >= 55296) {
                int i40 = charAt16 & 8191;
                int i41 = 13;
                while (true) {
                    i37 = i39 + 1;
                    charAt15 = zzd.charAt(i39);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i40 |= (charAt15 & 8191) << i41;
                    i41 += 13;
                    i39 = i37;
                }
                charAt16 = i40 | (charAt15 << i41);
                i39 = i37;
            }
            if (charAt16 == 0) {
                i12 = 0;
                charAt = 0;
                charAt2 = 0;
                i11 = 0;
                i10 = 0;
                i9 = 0;
                iArr = zza;
                i8 = 0;
            } else {
                int i42 = i39 + 1;
                int charAt17 = zzd.charAt(i39);
                if (charAt17 >= 55296) {
                    int i43 = charAt17 & 8191;
                    int i44 = 13;
                    while (true) {
                        i20 = i42 + 1;
                        charAt10 = zzd.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i20;
                    }
                    charAt17 = i43 | (charAt10 << i44);
                    i42 = i20;
                }
                int i45 = i42 + 1;
                int charAt18 = zzd.charAt(i42);
                if (charAt18 >= 55296) {
                    int i46 = charAt18 & 8191;
                    int i47 = 13;
                    while (true) {
                        i19 = i45 + 1;
                        charAt9 = zzd.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i19;
                    }
                    charAt18 = i46 | (charAt9 << i47);
                    i45 = i19;
                }
                int i48 = i45 + 1;
                int charAt19 = zzd.charAt(i45);
                if (charAt19 >= 55296) {
                    int i49 = charAt19 & 8191;
                    int i50 = 13;
                    while (true) {
                        i18 = i48 + 1;
                        charAt8 = zzd.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i18;
                    }
                    charAt19 = i49 | (charAt8 << i50);
                    i48 = i18;
                }
                int i51 = i48 + 1;
                int charAt20 = zzd.charAt(i48);
                if (charAt20 >= 55296) {
                    int i52 = charAt20 & 8191;
                    int i53 = 13;
                    while (true) {
                        i17 = i51 + 1;
                        charAt7 = zzd.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i52 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i51 = i17;
                    }
                    charAt20 = i52 | (charAt7 << i53);
                    i51 = i17;
                }
                int i54 = i51 + 1;
                charAt = zzd.charAt(i51);
                if (charAt >= 55296) {
                    int i55 = charAt & 8191;
                    int i56 = 13;
                    while (true) {
                        i16 = i54 + 1;
                        charAt6 = zzd.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i55 |= (charAt6 & 8191) << i56;
                        i56 += 13;
                        i54 = i16;
                    }
                    charAt = i55 | (charAt6 << i56);
                    i54 = i16;
                }
                int i57 = i54 + 1;
                charAt2 = zzd.charAt(i54);
                if (charAt2 >= 55296) {
                    int i58 = charAt2 & 8191;
                    int i59 = 13;
                    while (true) {
                        i15 = i57 + 1;
                        charAt5 = zzd.charAt(i57);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i58 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i57 = i15;
                    }
                    charAt2 = i58 | (charAt5 << i59);
                    i57 = i15;
                }
                int i60 = i57 + 1;
                int charAt21 = zzd.charAt(i57);
                if (charAt21 >= 55296) {
                    int i61 = charAt21 & 8191;
                    int i62 = 13;
                    while (true) {
                        i14 = i60 + 1;
                        charAt4 = zzd.charAt(i60);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i61 |= (charAt4 & 8191) << i62;
                        i62 += 13;
                        i60 = i14;
                    }
                    charAt21 = i61 | (charAt4 << i62);
                    i60 = i14;
                }
                int i63 = i60 + 1;
                int charAt22 = zzd.charAt(i60);
                if (charAt22 >= 55296) {
                    int i64 = charAt22 & 8191;
                    int i65 = 13;
                    while (true) {
                        i13 = i63 + 1;
                        charAt3 = zzd.charAt(i63);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i64 |= (charAt3 & 8191) << i65;
                        i65 += 13;
                        i63 = i13;
                    }
                    charAt22 = i64 | (charAt3 << i65);
                    i63 = i13;
                }
                int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
                int i66 = (charAt17 << 1) + charAt18;
                i8 = charAt17;
                i9 = charAt22;
                i39 = i63;
                i10 = charAt20;
                i11 = charAt19;
                i12 = i66;
                iArr = iArr2;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzaltVar2.zze();
            Class<?> cls2 = zzaltVar2.zza().getClass();
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i67 = i9 + charAt2;
            int i68 = i9;
            int i69 = i67;
            int i70 = 0;
            int i71 = 0;
            while (i39 < length) {
                int i72 = i39 + 1;
                int charAt23 = zzd.charAt(i39);
                if (charAt23 >= c3) {
                    int i73 = charAt23 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i36 = i74 + 1;
                        charAt14 = zzd.charAt(i74);
                        if (charAt14 < c3) {
                            break;
                        }
                        i73 |= (charAt14 & 8191) << i75;
                        i75 += 13;
                        i74 = i36;
                    }
                    charAt23 = i73 | (charAt14 << i75);
                    i21 = i36;
                } else {
                    i21 = i72;
                }
                int i76 = i21 + 1;
                int charAt24 = zzd.charAt(i21);
                if (charAt24 >= c3) {
                    int i77 = charAt24 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i35 = i78 + 1;
                        charAt13 = zzd.charAt(i78);
                        i22 = length;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i35;
                        length = i22;
                    }
                    charAt24 = i77 | (charAt13 << i79);
                    i23 = i35;
                } else {
                    i22 = length;
                    i23 = i76;
                }
                int i80 = charAt24 & 255;
                int i81 = i10;
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i70;
                    i71++;
                }
                int i82 = i11;
                if (i80 >= 51) {
                    int i83 = i23 + 1;
                    int charAt25 = zzd.charAt(i23);
                    char c4 = 55296;
                    if (charAt25 >= 55296) {
                        int i84 = charAt25 & 8191;
                        int i85 = 13;
                        while (true) {
                            i34 = i83 + 1;
                            charAt12 = zzd.charAt(i83);
                            if (charAt12 < c4) {
                                break;
                            }
                            i84 |= (charAt12 & 8191) << i85;
                            i85 += 13;
                            i83 = i34;
                            c4 = 55296;
                        }
                        charAt25 = i84 | (charAt12 << i85);
                        i83 = i34;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 != 9 && i86 != 17) {
                        if (i86 == 12 && (zzaltVar2.zzb().equals(zzalo.PROTO2) || (charAt24 & 2048) != 0)) {
                            i32 = 1;
                            i33 = i12 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zze[i12];
                        } else {
                            i32 = 1;
                            int i88 = charAt25 << i32;
                            obj = zze[i88];
                            if (!(obj instanceof Field)) {
                                zza3 = (Field) obj;
                            } else {
                                zza3 = zza(cls2, (String) obj);
                                zze[i88] = zza3;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                            int i89 = i88 + 1;
                            obj2 = zze[i89];
                            int i90 = i12;
                            if (!(obj2 instanceof Field)) {
                                zza4 = (Field) obj2;
                            } else {
                                zza4 = zza(cls2, (String) obj2);
                                zze[i89] = zza4;
                            }
                            i27 = (int) unsafe.objectFieldOffset(zza4);
                            str = zzd;
                            objectFieldOffset = objectFieldOffset2;
                            i26 = i90;
                            i29 = 0;
                            zzaltVar = zzaltVar2;
                            i24 = charAt23;
                            i28 = i87;
                        }
                    } else {
                        i32 = 1;
                        i33 = i12 + 1;
                        objArr[((i70 / 3) << 1) + 1] = zze[i12];
                    }
                    i12 = i33;
                    int i882 = charAt25 << i32;
                    obj = zze[i882];
                    if (!(obj instanceof Field)) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                    int i892 = i882 + 1;
                    obj2 = zze[i892];
                    int i902 = i12;
                    if (!(obj2 instanceof Field)) {
                    }
                    i27 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    objectFieldOffset = objectFieldOffset22;
                    i26 = i902;
                    i29 = 0;
                    zzaltVar = zzaltVar2;
                    i24 = charAt23;
                    i28 = i87;
                } else {
                    int i91 = i12 + 1;
                    Field zza5 = zza(cls2, (String) zze[i12]);
                    i24 = charAt23;
                    if (i80 == 9 || i80 == 17) {
                        zzaltVar = zzaltVar2;
                        objArr[((i70 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            zzaltVar = zzaltVar2;
                            i31 = i12 + 2;
                            objArr[((i70 / 3) << 1) + 1] = zze[i91];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            zzaltVar = zzaltVar2;
                            if (zzaltVar2.zzb() == zzalo.PROTO2 || (charAt24 & 2048) != 0) {
                                i31 = i12 + 2;
                                objArr[((i70 / 3) << 1) + 1] = zze[i91];
                            }
                        } else if (i80 == 50) {
                            int i92 = i68 + 1;
                            iArr[i68] = i70;
                            int i93 = (i70 / 3) << 1;
                            int i94 = i12 + 2;
                            objArr[i93] = zze[i91];
                            if ((charAt24 & 2048) != 0) {
                                i91 = i12 + 3;
                                objArr[i93 + 1] = zze[i94];
                                zzaltVar = zzaltVar2;
                                i68 = i92;
                            } else {
                                i68 = i92;
                                zzaltVar = zzaltVar2;
                                i25 = i94;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                                if ((charAt24 & 4096) != 0 || i80 > 17) {
                                    i26 = i25;
                                    str = zzd;
                                    i27 = 1048575;
                                    i28 = i23;
                                    i29 = 0;
                                } else {
                                    i28 = i23 + 1;
                                    int charAt26 = zzd.charAt(i23);
                                    if (charAt26 >= 55296) {
                                        int i95 = charAt26 & 8191;
                                        int i96 = 13;
                                        while (true) {
                                            i30 = i28 + 1;
                                            charAt11 = zzd.charAt(i28);
                                            if (charAt11 < 55296) {
                                                break;
                                            }
                                            i95 |= (charAt11 & 8191) << i96;
                                            i96 += 13;
                                            i28 = i30;
                                        }
                                        charAt26 = i95 | (charAt11 << i96);
                                        i28 = i30;
                                    }
                                    int i97 = (charAt26 / 32) + (i8 << 1);
                                    Object obj3 = zze[i97];
                                    if (obj3 instanceof Field) {
                                        zza2 = (Field) obj3;
                                    } else {
                                        zza2 = zza(cls2, (String) obj3);
                                        zze[i97] = zza2;
                                    }
                                    i26 = i25;
                                    str = zzd;
                                    i29 = charAt26 % 32;
                                    i27 = (int) unsafe.objectFieldOffset(zza2);
                                }
                                if (i80 >= 18 && i80 <= 49) {
                                    iArr[i69] = objectFieldOffset;
                                    i69++;
                                }
                            }
                        } else {
                            zzaltVar = zzaltVar2;
                        }
                        i25 = i31;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) != 0) {
                        }
                        i26 = i25;
                        str = zzd;
                        i27 = 1048575;
                        i28 = i23;
                        i29 = 0;
                        if (i80 >= 18) {
                            iArr[i69] = objectFieldOffset;
                            i69++;
                        }
                    }
                    i25 = i91;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i26 = i25;
                    str = zzd;
                    i27 = 1048575;
                    i28 = i23;
                    i29 = 0;
                    if (i80 >= 18) {
                    }
                }
                int i98 = i70 + 1;
                iArr3[i70] = i24;
                int i99 = i70 + 2;
                Class<?> cls3 = cls2;
                int i100 = i28;
                iArr3[i98] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | objectFieldOffset;
                i70 += 3;
                iArr3[i99] = (i29 << 20) | i27;
                zzd = str;
                i10 = i81;
                i12 = i26;
                zzaltVar2 = zzaltVar;
                length = i22;
                i11 = i82;
                cls2 = cls3;
                i39 = i100;
                c3 = 55296;
            }
            return new zzalg<>(iArr3, objArr, i11, i10, zzaltVar2.zza(), false, iArr, i9, i67, zzalkVar, zzakmVar, zzamoVar, zzajmVar, zzakzVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i7, UB ub, zzamo<UT, UB> zzamoVar, Object obj2) {
        zzakd zzd;
        int i8 = this.zzc[i7];
        Object zze = zzamp.zze(obj, zzc(i7) & 1048575);
        return (zze == null || (zzd = zzd(i7)) == null) ? ub : (UB) zza(i7, i8, this.zzr.zze(zze), zzd, (zzakd) ub, (zzamo<UT, zzakd>) zzamoVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i7, int i8, Map<K, V> map, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar, Object obj) {
        zzakx<?, ?> zza2 = this.zzr.zza(zzf(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakdVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamoVar.zzc(obj);
                }
                zzaiu zzc = zzaip.zzc(zzaku.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzaku.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzamoVar.zza((zzamo<UT, UB>) ub, i8, zzc.zza());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7) {
        zzalv zze = zze(i7);
        long zzc = zzc(i7) & 1048575;
        if (!zzc((zzalg<T>) t7, i7)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t7, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7, int i8) {
        zzalv zze = zze(i8);
        if (!zzc((zzalg<T>) t7, i7, i8)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t7, zzc(i8) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l7 = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            l7.append(arrays);
            throw new RuntimeException(l7.toString());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, T t8) {
        zzf(t7);
        t8.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzc = zzc(i7);
            long j = 1048575 & zzc;
            int i8 = this.zzc[i7];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zza(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzb(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zzc(t7, j, zzamp.zzh(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t7, t8, i7);
                    break;
                case 10:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzalg<T>) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((zzalg<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t7, t8, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t7, t8, j);
                    break;
                case 50:
                    zzalx.zza(this.zzr, t7, t8, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzalg<T>) t8, i8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((zzalg<T>) t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t7, t8, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzalg<T>) t8, i8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((zzalg<T>) t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t7, t8, i7);
                    break;
            }
        }
        zzalx.zza(this.zzp, t7, t8);
        if (this.zzh) {
            zzalx.zza(this.zzq, t7, t8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:14:0x00c5, B:48:0x00d3, B:19:0x062b, B:21:0x0630, B:22:0x0635, B:77:0x00ff, B:80:0x0114, B:82:0x0125, B:84:0x0136, B:86:0x0147, B:88:0x0158, B:90:0x0162, B:93:0x0169, B:94:0x016e, B:96:0x017b, B:98:0x018c, B:100:0x019a, B:102:0x01ac, B:104:0x01b4, B:106:0x01c6, B:108:0x01d8, B:110:0x01ea, B:112:0x01fc, B:114:0x020e, B:116:0x0220, B:118:0x0232, B:120:0x0244, B:122:0x0254, B:123:0x0275, B:124:0x025e, B:126:0x0266, B:128:0x0286, B:130:0x0298, B:132:0x02a6, B:134:0x02b4, B:136:0x02c2), top: B:13:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x063b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0665 A[LOOP:2: B:40:0x0661->B:42:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0679  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzals] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t7, zzals zzalsVar, zzajk zzajkVar) {
        zzamo zzamoVar;
        T t8;
        int i7;
        zzamo zzamoVar2;
        T t9;
        zzajm<?> zzajmVar;
        zzajk zzajkVar2;
        Object obj;
        Object obj2;
        T t10 = t7;
        zzajk zzajkVar3 = zzajkVar;
        zzajkVar.getClass();
        zzf(t7);
        zzamo zzamoVar3 = this.zzp;
        zzajm<?> zzajmVar2 = this.zzq;
        Object obj3 = null;
        zzajr<?> zzajrVar = null;
        while (true) {
            try {
                int zzc = zzalsVar.zzc();
                int zza2 = zza(zzc);
                if (zza2 < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i8 = this.zzl; i8 < this.zzm; i8++) {
                            obj3 = zza((Object) t7, this.zzk[i8], (int) obj3, (zzamo<UT, int>) zzamoVar3, (Object) t7);
                        }
                        if (obj3 != null) {
                            zzamoVar3.zzb((Object) t10, (T) obj3);
                            return;
                        }
                        return;
                    }
                    try {
                        Object zza3 = !this.zzh ? null : zzajmVar2.zza(zzajkVar3, this.zzg, zzc);
                        if (zza3 != null) {
                            zzajr<?> zzb2 = zzajrVar == null ? zzajmVar2.zzb(t10) : zzajrVar;
                            zzamoVar2 = zzamoVar3;
                            t9 = t10;
                            try {
                                obj3 = zzajmVar2.zza(t7, zzalsVar, zza3, zzajkVar, zzb2, obj3, zzamoVar2);
                                zzajrVar = zzb2;
                            } catch (Throwable th) {
                                th = th;
                                t8 = t9;
                                zzamoVar = zzamoVar2;
                                while (i7 < this.zzm) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzamoVar2 = zzamoVar3;
                            t9 = t10;
                            zzamoVar2.zza((zzals) zzalsVar);
                            if (obj3 == null) {
                                obj3 = zzamoVar2.zzc(t9);
                            }
                            if (!zzamoVar2.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                int i9 = this.zzl;
                                while (i9 < this.zzm) {
                                    zzamo zzamoVar4 = zzamoVar2;
                                    obj3 = zza((Object) t7, this.zzk[i9], (int) obj3, (zzamo<UT, int>) zzamoVar4, (Object) t7);
                                    i9++;
                                    t9 = t9;
                                    zzamoVar2 = zzamoVar4;
                                }
                                Object obj4 = t9;
                                zzamo zzamoVar5 = zzamoVar2;
                                if (obj3 != null) {
                                    zzamoVar5.zzb(obj4, obj3);
                                    return;
                                }
                                return;
                            }
                        }
                        t10 = t9;
                        zzamoVar3 = zzamoVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        zzamoVar = zzamoVar3;
                        t8 = t10;
                    }
                } else {
                    zzamoVar = zzamoVar3;
                    t8 = t10;
                    try {
                        int zzc2 = zzc(zza2);
                        switch ((267386880 & zzc2) >>> 20) {
                            case 0:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t8, zzc2 & 1048575, zzalsVar.zza());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 1:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzb());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 2:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzl());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 3:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzo());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 4:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzg());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 5:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzk());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 6:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzf());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 7:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zzc(t8, zzc2 & 1048575, zzalsVar.zzs());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 8:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zza((Object) t8, zzc2, (zzals) zzalsVar);
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 9:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar = (zzalc) zza((zzalg<T>) t8, zza2);
                                zzalsVar.zzb(zzalcVar, zze(zza2), zzajkVar2);
                                zza((zzalg<T>) t8, zza2, zzalcVar);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 10:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t8, zzc2 & 1048575, zzalsVar.zzp());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 11:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzj());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 12:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                int zze = zzalsVar.zze();
                                zzakd zzd = zzd(zza2);
                                if (zzd != null && !zzd.zza(zze)) {
                                    obj3 = zzalx.zza(t8, zzc, zze, obj2, zzamoVar);
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t10 = t8;
                                    break;
                                }
                                zzamp.zza((Object) t8, zzc2 & 1048575, zze);
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 13:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzh());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 14:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzm());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 15:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzi());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 16:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, zzc2 & 1048575, zzalsVar.zzn());
                                zzb((zzalg<T>) t8, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 17:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar2 = (zzalc) zza((zzalg<T>) t8, zza2);
                                zzalsVar.zza(zzalcVar2, zze(zza2), zzajkVar2);
                                zza((zzalg<T>) t8, zza2, zzalcVar2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 18:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 19:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 20:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 22:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 23:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 24:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 25:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 26:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                if (zzg(zzc2)) {
                                    zzalsVar.zzo(this.zzo.zza(t8, zzc2 & 1048575));
                                } else {
                                    zzalsVar.zzn(this.zzo.zza(t8, zzc2 & 1048575));
                                }
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 27:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb(this.zzo.zza(t8, zzc2 & 1048575), zze(zza2), zzajkVar2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 28:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 29:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 30:
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                List zza4 = this.zzo.zza(t8, zzc2 & 1048575);
                                zzalsVar.zzd(zza4);
                                obj3 = zzalx.zza(t7, zzc, zza4, zzd(zza2), obj3, zzamoVar);
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                break;
                            case 31:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzj(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 32:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzk(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 33:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzl(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 34:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzm(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 35:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 36:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 37:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 38:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 39:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 40:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 41:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 42:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 43:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t8, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 44:
                                List zza5 = this.zzo.zza(t8, zzc2 & 1048575);
                                zzalsVar.zzd(zza5);
                                obj = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                try {
                                    obj3 = zzalx.zza(t7, zzc, zza5, zzd(zza2), obj, zzamoVar);
                                } catch (zzake unused) {
                                    obj3 = obj;
                                    zzamoVar.zza((zzals) zzalsVar);
                                    if (obj3 == null) {
                                    }
                                    if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                    }
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t10 = t8;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj3 = obj;
                                    while (i7 < this.zzm) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                break;
                            case 45:
                                zzalsVar.zzj(this.zzo.zza(t8, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 46:
                                zzalsVar.zzk(this.zzo.zza(t8, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 47:
                                zzalsVar.zzl(this.zzo.zza(t8, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 48:
                                zzalsVar.zzm(this.zzo.zza(t8, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 49:
                                zzalsVar.zza(this.zzo.zza(t8, zzc2 & 1048575), zze(zza2), zzajkVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 50:
                                Object zzf = zzf(zza2);
                                long zzc3 = zzc(zza2) & 1048575;
                                Object zze2 = zzamp.zze(t8, zzc3);
                                if (zze2 == null) {
                                    zze2 = this.zzr.zzb(zzf);
                                    zzamp.zza(t8, zzc3, zze2);
                                } else if (this.zzr.zzf(zze2)) {
                                    Object zzb3 = this.zzr.zzb(zzf);
                                    this.zzr.zza(zzb3, zze2);
                                    zzamp.zza(t8, zzc3, zzb3);
                                    zze2 = zzb3;
                                }
                                zzalsVar.zza(this.zzr.zze(zze2), this.zzr.zza(zzf), zzajkVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 51:
                                zzamp.zza(t8, zzc2 & 1048575, Double.valueOf(zzalsVar.zza()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 52:
                                zzamp.zza(t8, zzc2 & 1048575, Float.valueOf(zzalsVar.zzb()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 53:
                                zzamp.zza(t8, zzc2 & 1048575, Long.valueOf(zzalsVar.zzl()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 54:
                                zzamp.zza(t8, zzc2 & 1048575, Long.valueOf(zzalsVar.zzo()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 55:
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzg()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 56:
                                zzamp.zza(t8, zzc2 & 1048575, Long.valueOf(zzalsVar.zzk()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 57:
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzf()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 58:
                                zzamp.zza(t8, zzc2 & 1048575, Boolean.valueOf(zzalsVar.zzs()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 59:
                                zza((Object) t8, zzc2, (zzals) zzalsVar);
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 60:
                                zzalc zzalcVar3 = (zzalc) zza((zzalg<T>) t8, zzc, zza2);
                                zzalsVar.zzb(zzalcVar3, zze(zza2), zzajkVar3);
                                zza((zzalg<T>) t8, zzc, zza2, zzalcVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 61:
                                zzamp.zza(t8, zzc2 & 1048575, zzalsVar.zzp());
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 62:
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzj()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 63:
                                int zze3 = zzalsVar.zze();
                                zzakd zzd2 = zzd(zza2);
                                if (zzd2 != null && !zzd2.zza(zze3)) {
                                    obj3 = zzalx.zza(t8, zzc, zze3, obj3, zzamoVar);
                                    t10 = t8;
                                    zzamoVar3 = zzamoVar;
                                    break;
                                }
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zze3));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 64:
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzh()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 65:
                                zzamp.zza(t8, zzc2 & 1048575, Long.valueOf(zzalsVar.zzm()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 66:
                                zzamp.zza(t8, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzi()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 67:
                                zzamp.zza(t8, zzc2 & 1048575, Long.valueOf(zzalsVar.zzn()));
                                zzb((zzalg<T>) t8, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 68:
                                zzalc zzalcVar4 = (zzalc) zza((zzalg<T>) t8, zzc, zza2);
                                zzalsVar.zza(zzalcVar4, zze(zza2), zzajkVar3);
                                zza((zzalg<T>) t8, zzc, zza2, zzalcVar4);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            default:
                                if (obj3 == null) {
                                    try {
                                        try {
                                            obj3 = zzamoVar.zzc(t8);
                                        } catch (zzake unused2) {
                                            obj = obj3;
                                            zzajmVar = zzajmVar2;
                                            zzajkVar2 = zzajkVar3;
                                            obj3 = obj;
                                            zzamoVar.zza((zzals) zzalsVar);
                                            if (obj3 == null) {
                                                obj3 = zzamoVar.zzc(t8);
                                            }
                                            if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                                for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                                    obj3 = zza((Object) t7, this.zzk[i10], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t7);
                                                }
                                                if (obj3 != null) {
                                                    zzamoVar.zzb((Object) t8, (T) obj3);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzamoVar3 = zzamoVar;
                                            zzajmVar2 = zzajmVar;
                                            zzajkVar3 = zzajkVar2;
                                            t10 = t8;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        while (i7 < this.zzm) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                        for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                            obj3 = zza((Object) t7, this.zzk[i11], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t7);
                                        }
                                        if (obj3 != null) {
                                            zzamoVar.zzb((Object) t8, (T) obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    t10 = t8;
                                    zzamoVar3 = zzamoVar;
                                } catch (zzake unused3) {
                                    zzajmVar = zzajmVar2;
                                    zzajkVar2 = zzajkVar3;
                                    zzamoVar.zza((zzals) zzalsVar);
                                    if (obj3 == null) {
                                    }
                                    if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                    }
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t10 = t8;
                                }
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        for (i7 = this.zzl; i7 < this.zzm; i7++) {
                            obj3 = zza((Object) t7, this.zzk[i7], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t7);
                        }
                        if (obj3 != null) {
                            zzamoVar.zzb((Object) t8, (T) obj3);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                zzamoVar = zzamoVar3;
                t8 = t10;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        zza((zzalg<T>) t7, bArr, i7, i8, 0, zzaikVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t7, T t8, int i7) {
        if (zzc((zzalg<T>) t8, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, zzc);
            if (object != null) {
                zzalv zze = zze(i7);
                if (!zzc((zzalg<T>) t7, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t7, zzc, zza2);
                    }
                    zzb((zzalg<T>) t7, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t7, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zza(Object obj, int i7, zzals zzalsVar) {
        if (zzg(i7)) {
            zzamp.zza(obj, i7 & 1048575, zzalsVar.zzr());
        } else if (this.zzi) {
            zzamp.zza(obj, i7 & 1048575, zzalsVar.zzq());
        } else {
            zzamp.zza(obj, i7 & 1048575, zzalsVar.zzp());
        }
    }

    private final void zza(T t7, int i7, Object obj) {
        zzb.putObject(t7, zzc(i7) & 1048575, obj);
        zzb((zzalg<T>) t7, i7);
    }

    private final void zza(T t7, int i7, int i8, Object obj) {
        zzb.putObject(t7, zzc(i8) & 1048575, obj);
        zzb((zzalg<T>) t7, i7, i8);
    }

    private final <K, V> void zza(zzanf zzanfVar, int i7, Object obj, int i8) {
        if (obj != null) {
            zzanfVar.zza(i7, this.zzr.zza(zzf(i8)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i7, Object obj, zzanf zzanfVar) {
        if (obj instanceof String) {
            zzanfVar.zza(i7, (String) obj);
        } else {
            zzanfVar.zza(i7, (zzaip) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b90  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t7, zzanf zzanfVar) {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i7;
        Iterator<Map.Entry<?, Object>> it2;
        int i8;
        Map.Entry<?, ?> entry2;
        int i9;
        int i10;
        int i11;
        Map.Entry<?, ?> entry3;
        int i12;
        boolean z4;
        int i13;
        Unsafe unsafe;
        boolean z7;
        Iterator<Map.Entry<?, Object>> it3;
        Map.Entry<?, ?> entry4;
        int length2;
        zzanf zzanfVar2 = zzanfVar;
        int i14 = 267386880;
        int i15 = 1048575;
        if (zzanfVar.zza() == 2) {
            zza(this.zzp, t7, zzanfVar2);
            if (this.zzh) {
                zzajr<?> zza2 = this.zzq.zza(t7);
                if (!zza2.zza.isEmpty()) {
                    it3 = zza2.zzc();
                    entry4 = (Map.Entry) it3.next();
                    for (length2 = this.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzc(length2);
                        int i16 = this.zzc[length2];
                        while (entry4 != null && this.zzq.zza(entry4) > i16) {
                            this.zzq.zza(zzanfVar2, entry4);
                            entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zza(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zzb(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzb(i16, zzamp.zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zze(i16, zzamp.zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzc(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzb(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zzh(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zza(i16, zzamp.zze(t7, zzc & 1048575), zzanfVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzb(i16, zzamp.zze(t7, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, (zzaip) zzamp.zze(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzf(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzd(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzc(i16, zzamp.zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zze(i16, zzamp.zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zzd(i16, zzamp.zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzc((zzalg<T>) t7, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zze(t7, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzalx.zzb(this.zzc[length2], (List<Double>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 19:
                                zzalx.zzf(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 20:
                                zzalx.zzh(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                zzalx.zzn(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 22:
                                zzalx.zzg(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 23:
                                zzalx.zze(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 24:
                                zzalx.zzd(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 25:
                                zzalx.zza(this.zzc[length2], (List<Boolean>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 26:
                                zzalx.zzb(this.zzc[length2], (List<String>) zzamp.zze(t7, zzc & 1048575), zzanfVar2);
                                break;
                            case 27:
                                zzalx.zzb(this.zzc[length2], (List<?>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, (zzalv<?>) zze(length2));
                                break;
                            case 28:
                                zzalx.zza(this.zzc[length2], (List<zzaip>) zzamp.zze(t7, zzc & 1048575), zzanfVar2);
                                break;
                            case 29:
                                zzalx.zzm(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 30:
                                zzalx.zzc(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 31:
                                zzalx.zzi(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 32:
                                zzalx.zzj(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 33:
                                zzalx.zzk(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 34:
                                zzalx.zzl(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 35:
                                zzalx.zzb(this.zzc[length2], (List<Double>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 36:
                                zzalx.zzf(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 37:
                                zzalx.zzh(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 38:
                                zzalx.zzn(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 39:
                                zzalx.zzg(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 40:
                                zzalx.zze(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 41:
                                zzalx.zzd(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 42:
                                zzalx.zza(this.zzc[length2], (List<Boolean>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 43:
                                zzalx.zzm(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 44:
                                zzalx.zzc(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 45:
                                zzalx.zzi(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 46:
                                zzalx.zzj(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 47:
                                zzalx.zzk(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 48:
                                zzalx.zzl(this.zzc[length2], (List) zzamp.zze(t7, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 49:
                                zzalx.zza(this.zzc[length2], (List<?>) zzamp.zze(t7, zzc & 1048575), zzanfVar2, (zzalv<?>) zze(length2));
                                break;
                            case 50:
                                zza(zzanfVar2, i16, zzamp.zze(t7, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zza(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zzb(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzb(i16, zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zze(i16, zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzc(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzb(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zze(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zza(i16, zzamp.zze(t7, zzc & 1048575), zzanfVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzb(i16, zzamp.zze(t7, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, (zzaip) zzamp.zze(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzf(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzd(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzc(i16, zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zze(i16, zzc(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zzd(i16, zzd(t7, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzc((zzalg<T>) t7, i16, length2)) {
                                    zzanfVar2.zza(i16, zzamp.zze(t7, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry4 != null) {
                        this.zzq.zza(zzanfVar2, entry4);
                        entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                    }
                    return;
                }
            }
            it3 = null;
            entry4 = null;
            while (length2 >= 0) {
            }
            while (entry4 != null) {
            }
            return;
        }
        if (this.zzh) {
            zzajr<?> zza3 = this.zzq.zza(t7);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = this.zzc.length;
                Unsafe unsafe2 = zzb;
                int i17 = 0;
                i7 = 0;
                int i18 = 1048575;
                while (i7 < length) {
                    int zzc2 = zzc(i7);
                    int[] iArr = this.zzc;
                    int i19 = iArr[i7];
                    int i20 = (zzc2 & i14) >>> 20;
                    if (i20 <= 17) {
                        int i21 = iArr[i7 + 2];
                        int i22 = i21 & i15;
                        if (i22 != i18) {
                            if (i22 == i15) {
                                it2 = it;
                                i17 = 0;
                            } else {
                                it2 = it;
                                i17 = unsafe2.getInt(t7, i22);
                            }
                            i18 = i22;
                        } else {
                            it2 = it;
                        }
                        entry2 = entry;
                        i9 = i17;
                        i10 = 1 << (i21 >>> 20);
                        i8 = i18;
                    } else {
                        it2 = it;
                        i8 = i18;
                        entry2 = entry;
                        i9 = i17;
                        i10 = 0;
                    }
                    while (entry2 != null && this.zzq.zza(entry2) <= i19) {
                        this.zzq.zza(zzanfVar2, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    long j = zzc2 & 1048575;
                    switch (i20) {
                        case 0:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, zzamp.zza(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, zzamp.zzb(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzb(i19, unsafe.getLong(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zze(i19, unsafe.getLong(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzc(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, unsafe.getLong(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzb(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, zzamp.zzh(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zza(i19, unsafe.getObject(t7, j), zzanfVar2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzb(i19, unsafe.getObject(t7, j), zze(i13));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, (zzaip) unsafe.getObject(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzf(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zza(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzd(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zzc(i19, unsafe.getLong(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i13, i11, i9, i10)) {
                                zzanfVar2.zze(i19, unsafe.getInt(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            i11 = i8;
                            if (zza((zzalg<T>) t7, i13, i8, i9, i10)) {
                                zzanfVar2.zzd(i19, unsafe.getLong(t7, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            z4 = false;
                            entry3 = entry2;
                            i13 = i7;
                            i12 = length;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t7, i7, i8, i9, i10)) {
                                zzanfVar2 = zzanfVar;
                                zzanfVar2.zza(i19, unsafe.getObject(t7, j), zze(i13));
                            } else {
                                zzanfVar2 = zzanfVar;
                            }
                            i11 = i8;
                            break;
                        case 18:
                            z7 = false;
                            zzalx.zzb(this.zzc[i7], (List<Double>) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 19:
                            z7 = false;
                            zzalx.zzf(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 20:
                            z7 = false;
                            zzalx.zzh(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            z7 = false;
                            zzalx.zzn(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 22:
                            z7 = false;
                            zzalx.zzg(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 23:
                            z7 = false;
                            zzalx.zze(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 24:
                            z7 = false;
                            zzalx.zzd(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 25:
                            z7 = false;
                            zzalx.zza(this.zzc[i7], (List<Boolean>) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 26:
                            zzalx.zzb(this.zzc[i7], (List<String>) unsafe2.getObject(t7, j), zzanfVar2);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 27:
                            zzalx.zzb(this.zzc[i7], (List<?>) unsafe2.getObject(t7, j), zzanfVar2, (zzalv<?>) zze(i7));
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 28:
                            zzalx.zza(this.zzc[i7], (List<zzaip>) unsafe2.getObject(t7, j), zzanfVar2);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 29:
                            z7 = false;
                            zzalx.zzm(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 30:
                            z7 = false;
                            zzalx.zzc(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 31:
                            z7 = false;
                            zzalx.zzi(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 32:
                            z7 = false;
                            zzalx.zzj(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 33:
                            z7 = false;
                            zzalx.zzk(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 34:
                            z7 = false;
                            zzalx.zzl(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                            i11 = i8;
                            entry3 = entry2;
                            z4 = z7;
                            i12 = length;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 35:
                            zzalx.zzb(this.zzc[i7], (List<Double>) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 36:
                            zzalx.zzf(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 37:
                            zzalx.zzh(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 38:
                            zzalx.zzn(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 39:
                            zzalx.zzg(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 40:
                            zzalx.zze(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 41:
                            zzalx.zzd(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 42:
                            zzalx.zza(this.zzc[i7], (List<Boolean>) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 43:
                            zzalx.zzm(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 44:
                            zzalx.zzc(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 45:
                            zzalx.zzi(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 46:
                            zzalx.zzj(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 47:
                            zzalx.zzk(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 48:
                            zzalx.zzl(this.zzc[i7], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 49:
                            zzalx.zza(this.zzc[i7], (List<?>) unsafe2.getObject(t7, j), zzanfVar2, (zzalv<?>) zze(i7));
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 50:
                            zza(zzanfVar2, i19, unsafe2.getObject(t7, j), i7);
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 51:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, zza(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 52:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, zzb(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 53:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzb(i19, zzd(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 54:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zze(i19, zzd(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 55:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzc(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 56:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, zzd(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 57:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzb(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 58:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, zze(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 59:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zza(i19, unsafe2.getObject(t7, j), zzanfVar2);
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 60:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzb(i19, unsafe2.getObject(t7, j), zze(i7));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 61:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, (zzaip) unsafe2.getObject(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 62:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzf(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 63:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 64:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzd(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 65:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzc(i19, zzd(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 66:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zze(i19, zzc(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 67:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zzd(i19, zzd(t7, j));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        case 68:
                            if (zzc((zzalg<T>) t7, i19, i7)) {
                                zzanfVar2.zza(i19, unsafe2.getObject(t7, j), zze(i7));
                            }
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                        default:
                            i11 = i8;
                            entry3 = entry2;
                            i12 = length;
                            z4 = false;
                            i13 = i7;
                            unsafe = unsafe2;
                            break;
                    }
                    i7 = i13 + 3;
                    i17 = i9;
                    unsafe2 = unsafe;
                    i15 = 1048575;
                    it = it2;
                    entry = entry3;
                    length = i12;
                    i18 = i11;
                    i14 = 267386880;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    this.zzq.zza(zzanfVar2, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(this.zzp, t7, zzanfVar2);
            }
        }
        entry = null;
        it = null;
        length = this.zzc.length;
        Unsafe unsafe22 = zzb;
        int i172 = 0;
        i7 = 0;
        int i182 = 1048575;
        while (i7 < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(this.zzp, t7, zzanfVar2);
    }

    private static <UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t7, zzanf zzanfVar) {
        zzamoVar.zzb((zzamo<UT, UB>) zzamoVar.zzd(t7), zzanfVar);
    }

    private final boolean zza(T t7, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzc((zzalg<T>) t7, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i7, zzalv zzalvVar) {
        return zzalvVar.zze(zzamp.zze(obj, i7 & 1048575));
    }
}
