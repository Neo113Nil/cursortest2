package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031e1.k;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
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
        zzalv<T> zzalvVarZza = zzalr.zza().zza((Class) this.zzd[i8 + 1]);
        this.zzd[i8] = zzalvVarZza;
        return zzalvVarZza;
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
                int iZzd = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Boolean.valueOf(zzaikVar.zzb != 0);
                return iZzd;
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
                int iZzc = zzail.zzc(bArr, i7, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzaikVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzaikVar.zzb);
                return iZzd2;
            case 14:
                return zzail.zza(zzalr.zza().zza((Class) cls), bArr, i7, i8, zzaikVar);
            case 15:
                int iZzc2 = zzail.zzc(bArr, i7, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzajb.zze(zzaikVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzail.zzd(bArr, i7, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzajb.zza(zzaikVar.zzb));
                return iZzd3;
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
        int iZza;
        int i8;
        int iZzc;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzc2 = zzc(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(Double.doubleToLongBits(zzamp.zza(t7, j)));
                    i9 = iZza + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iZza = Float.floatToIntBits(zzamp.zzb(t7, j));
                    i9 = iZza + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = iZza + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = iZza + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = iZza + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 7:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzh(t7, j));
                    i9 = iZza + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iZza = ((String) zzamp.zze(t7, j)).hashCode();
                    i9 = iZza + i7;
                    break;
                case 9:
                    Object objZze = zzamp.zze(t7, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iZza = zzamp.zze(t7, j).hashCode();
                    i9 = iZza + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 13:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = iZza + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    iZzc = zzamp.zzc(t7, j);
                    i9 = i8 + iZzc;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t7, j));
                    i9 = iZza + i7;
                    break;
                case 17:
                    Object objZze2 = zzamp.zze(t7, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
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
                    iZza = zzamp.zze(t7, j).hashCode();
                    i9 = iZza + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iZza = zzamp.zze(t7, j).hashCode();
                    i9 = iZza + i7;
                    break;
                case 51:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(Double.doubleToLongBits(zza(t7, j)));
                        i9 = iZza + i7;
                    }
                    break;
                case 52:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = Float.floatToIntBits(zzb(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 53:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zzd(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 54:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zzd(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 55:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 56:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zzd(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 57:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 58:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zze(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 59:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = ((String) zzamp.zze(t7, j)).hashCode();
                        i9 = iZza + i7;
                    }
                    break;
                case 60:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzamp.zze(t7, j).hashCode();
                        i9 = iZza + i7;
                    }
                    break;
                case 61:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzamp.zze(t7, j).hashCode();
                        i9 = iZza + i7;
                    }
                    break;
                case 62:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 63:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 64:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 65:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zzd(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 66:
                    if (zzc(t7, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc = zzc(t7, j);
                        i9 = i8 + iZzc;
                    }
                    break;
                case 67:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzakb.zza(zzd(t7, j));
                        i9 = iZza + i7;
                    }
                    break;
                case 68:
                    if (zzc(t7, i11, i10)) {
                        i7 = i9 * 53;
                        iZza = zzamp.zze(t7, j).hashCode();
                        i9 = iZza + i7;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzp.zzd(t7).hashCode() + (i9 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t7).hashCode() : iHashCode2;
    }

    public static zzamn zzc(Object obj) {
        zzajy zzajyVar = (zzajy) obj;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar != zzamn.zzc()) {
            return zzamnVar;
        }
        zzamn zzamnVarZzd = zzamn.zzd();
        zzajyVar.zzb = zzamnVarZzd;
        return zzamnVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
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
                int iZzc = zzc(i7);
                long j = 1048575 & iZzc;
                int i8 = (iZzc & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 == 60 || i8 == 68) {
                        if (zzc(t7, this.zzc[i7], i7)) {
                            zze(i7).zzd(zzb.getObject(t7, j));
                        }
                    } else {
                        switch (i8) {
                            case 17:
                                if (zzc((Object) t7, i7)) {
                                    zze(i7).zzd(zzb.getObject(t7, j));
                                }
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
                                this.zzo.zzb(t7, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t7, j);
                                if (object != null) {
                                    unsafe.putObject(t7, j, this.zzr.zzc(object));
                                }
                                break;
                        }
                    }
                } else if (zzc((Object) t7, i7)) {
                    zze(i7).zzd(zzb.getObject(t7, j));
                }
            }
            this.zzp.zzf(t7);
            if (this.zzh) {
                this.zzq.zzc(t7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7 A[LOOP:2: B:52:0x00e6->B:57:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0114 A[SYNTHETIC] */
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
        List list;
        ?? Zze;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzl) {
            int i13 = this.zzk[i12];
            int i14 = this.zzc[i13];
            int iZzc = zzc(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(t7, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if ((268435456 & iZzc) != 0 && !zza(t7, i13, i7, i8, i17)) {
                return false;
            }
            int i18 = (267386880 & iZzc) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (zza(t7, i13, i7, i8, i17) && !zza((Object) t7, iZzc, zze(i13))) {
                    return false;
                }
            } else if (i18 == 27) {
                list = (List) zzamp.zze(t7, iZzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Zze = zze(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!Zze.zze(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (i18 == 60 || i18 == 68) {
                if (zzc(t7, i14, i13) && !zza((Object) t7, iZzc, zze(i13))) {
                    return false;
                }
            } else if (i18 == 49) {
                list = (List) zzamp.zze(t7, iZzc & 1048575);
                if (list.isEmpty()) {
                    Zze = zze(i13);
                    while (i9 < list.size()) {
                        if (!Zze.zze(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i18 != 50) {
                continue;
            } else {
                Map<?, ?> mapZzd = this.zzr.zzd(zzamp.zze(t7, iZzc & 1048575));
                if (mapZzd.isEmpty()) {
                    continue;
                } else if (this.zzr.zza(zzf(i13)).zzc.zzb() == zzand.MESSAGE) {
                    ?? Zza = 0;
                    for (Object obj : mapZzd.values()) {
                        if (Zza == 0) {
                            Zza = Zza;
                            Zza = zzalr.zza().zza((Class) obj.getClass());
                        }
                        Zza = Zza;
                        if (!Zza.zze(obj)) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
            i12++;
            i10 = i7;
            i11 = i8;
        }
        return !this.zzh || this.zzq.zza(t7).zzg();
    }

    private final boolean zzc(T t7, T t8, int i7) {
        return zzc((Object) t7, i7) == zzc((Object) t8, i7);
    }

    private final boolean zzc(T t7, int i7) {
        int iZzb = zzb(i7);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzamp.zzc(t7, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i7);
        long j3 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
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
                Object objZze = zzamp.zze(t7, j3);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzaip) {
                    return !zzaip.zza.equals(objZze);
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
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[PHI: r12
      0x0071: PHI (r12v4 int) = 
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v8 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v9 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v10 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v11 int)
      (r12v1 int)
     binds: [B:18:0x0058, B:181:0x04d1, B:178:0x04bd, B:172:0x0497, B:169:0x047a, B:166:0x045f, B:163:0x0446, B:160:0x042d, B:157:0x0417, B:154:0x0403, B:151:0x03eb, B:148:0x03d2, B:145:0x03b3, B:124:0x02bf, B:121:0x02a9, B:118:0x0293, B:115:0x027d, B:112:0x0267, B:109:0x0251, B:106:0x023b, B:103:0x0225, B:100:0x0210, B:97:0x01fb, B:94:0x01e6, B:91:0x01d1, B:88:0x01bc, B:86:0x01ad, B:84:0x01a3, B:79:0x016f, B:76:0x0163, B:73:0x0153, B:70:0x0143, B:67:0x0133, B:64:0x0127, B:61:0x011b, B:58:0x010f, B:52:0x00f1, B:50:0x00eb, B:48:0x00dd, B:45:0x00cc, B:42:0x00bd, B:39:0x00ae, B:37:0x00a8, B:35:0x00a1, B:32:0x0096, B:29:0x0087, B:26:0x0078, B:23:0x0070, B:21:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t7) {
        int i7;
        int i8;
        int i9;
        int iZza;
        int iZza2;
        int iZza3;
        int iZze;
        boolean z4;
        int iZzc;
        int iZzd;
        int iZzi;
        int iZzj;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int iZzc2 = zzc(i13);
            int i15 = (267386880 & iZzc2) >>> 20;
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
            long j = iZzc2 & i10;
            if (i15 >= zzajs.zza.zza()) {
                zzajs.zzb.zza();
            }
            switch (i15) {
                case 0:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zza(i16, 0.0d);
                        i14 += iZza;
                    }
                    break;
                case 1:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zza(i16, 0.0f);
                        i14 += iZza;
                    }
                    break;
                case 2:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zzb(i16, unsafe.getLong(t7, j));
                        i14 += iZza;
                    }
                    break;
                case 3:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zze(i16, unsafe.getLong(t7, j));
                        i14 += iZza;
                    }
                    break;
                case 4:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zzd(i16, unsafe.getInt(t7, j));
                        i14 += iZza;
                    }
                    break;
                case 5:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zza(i16, 0L);
                        i14 += iZza;
                    }
                    break;
                case 6:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza = zzajg.zzc(i16, 0);
                        i14 += iZza;
                    }
                    break;
                case 7:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zza(i16, true);
                        i14 += iZza2;
                    }
                    break;
                case 8:
                    if (zza(t7, i13, i7, i8, i9)) {
                        Object object = unsafe.getObject(t7, j);
                        if (object instanceof zzaip) {
                            iZza2 = zzajg.zza(i16, (zzaip) object);
                        } else {
                            iZza2 = zzajg.zza(i16, (String) object);
                        }
                        i14 += iZza2;
                    }
                    break;
                case 9:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza3 = zzalx.zza(i16, unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                        i14 += iZza3;
                    }
                    break;
                case 10:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zza(i16, (zzaip) unsafe.getObject(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 11:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zzg(i16, unsafe.getInt(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 12:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zzb(i16, unsafe.getInt(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 13:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZze = zzajg.zze(i16, 0);
                        i14 += iZze;
                    }
                    break;
                case 14:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zzc(i16, 0L);
                        i14 += iZza2;
                    }
                    break;
                case 15:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zzf(i16, unsafe.getInt(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 16:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zzd(i16, unsafe.getLong(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 17:
                    if (zza(t7, i13, i7, i8, i9)) {
                        iZza2 = zzajg.zza(i16, (zzalc) unsafe.getObject(t7, j), zze(i13));
                        i14 += iZza2;
                    }
                    break;
                case 18:
                    iZza3 = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZza3;
                    break;
                case 19:
                    z4 = false;
                    iZzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 20:
                    z4 = false;
                    iZzc = zzalx.zzf(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    z4 = false;
                    iZzc = zzalx.zzj(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 22:
                    z4 = false;
                    iZzc = zzalx.zze(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 23:
                    z4 = false;
                    iZzc = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 24:
                    z4 = false;
                    iZzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 25:
                    z4 = false;
                    iZzc = zzalx.zza(i16, (List<?>) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 26:
                    iZza3 = zzalx.zzb(i16, (List) unsafe.getObject(t7, j));
                    i14 += iZza3;
                    break;
                case 27:
                    iZza3 = zzalx.zzb(i16, (List<?>) unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                    i14 += iZza3;
                    break;
                case 28:
                    iZza3 = zzalx.zza(i16, (List<zzaip>) unsafe.getObject(t7, j));
                    i14 += iZza3;
                    break;
                case 29:
                    iZza3 = zzalx.zzi(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZza3;
                    break;
                case 30:
                    z4 = false;
                    iZzc = zzalx.zzb(i16, (List<Integer>) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 31:
                    z4 = false;
                    iZzc = zzalx.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 32:
                    z4 = false;
                    iZzc = zzalx.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 33:
                    z4 = false;
                    iZzc = zzalx.zzg(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 34:
                    z4 = false;
                    iZzc = zzalx.zzh(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += iZzc;
                    break;
                case 35:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 36:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 37:
                    iZzd = zzalx.zzf((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 38:
                    iZzd = zzalx.zzj((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 39:
                    iZzd = zzalx.zze((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 40:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 41:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 42:
                    iZzd = zzalx.zza((List<?>) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 43:
                    iZzd = zzalx.zzi((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 44:
                    iZzd = zzalx.zzb((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 45:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 46:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 47:
                    iZzd = zzalx.zzg((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 48:
                    iZzd = zzalx.zzh((List) unsafe.getObject(t7, j));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i14 += iZzj + iZzi + iZzd;
                    }
                    break;
                case 49:
                    iZza3 = zzalx.zza(i16, (List<zzalc>) unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                    i14 += iZza3;
                    break;
                case 50:
                    iZza3 = this.zzr.zza(i16, unsafe.getObject(t7, j), zzf(i13));
                    i14 += iZza3;
                    break;
                case 51:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, 0.0d);
                        i14 += iZza2;
                    }
                    break;
                case 52:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, 0.0f);
                        i14 += iZza2;
                    }
                    break;
                case 53:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzb(i16, zzd(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 54:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zze(i16, zzd(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 55:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzd(i16, zzc(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 56:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, 0L);
                        i14 += iZza2;
                    }
                    break;
                case 57:
                    if (zzc(t7, i16, i13)) {
                        iZze = zzajg.zzc(i16, 0);
                        i14 += iZze;
                    }
                    break;
                case 58:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, true);
                        i14 += iZza2;
                    }
                    break;
                case 59:
                    if (zzc(t7, i16, i13)) {
                        Object object2 = unsafe.getObject(t7, j);
                        if (object2 instanceof zzaip) {
                            iZza2 = zzajg.zza(i16, (zzaip) object2);
                        } else {
                            iZza2 = zzajg.zza(i16, (String) object2);
                        }
                        i14 += iZza2;
                    }
                    break;
                case 60:
                    if (zzc(t7, i16, i13)) {
                        iZza3 = zzalx.zza(i16, unsafe.getObject(t7, j), (zzalv<?>) zze(i13));
                        i14 += iZza3;
                    }
                    break;
                case 61:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, (zzaip) unsafe.getObject(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 62:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzg(i16, zzc(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 63:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzb(i16, zzc(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 64:
                    if (zzc(t7, i16, i13)) {
                        iZze = zzajg.zze(i16, 0);
                        i14 += iZze;
                    }
                    break;
                case 65:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzc(i16, 0L);
                        i14 += iZza2;
                    }
                    break;
                case 66:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzf(i16, zzc(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 67:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zzd(i16, zzd(t7, j));
                        i14 += iZza2;
                    }
                    break;
                case 68:
                    if (zzc(t7, i16, i13)) {
                        iZza2 = zzajg.zza(i16, (zzalc) unsafe.getObject(t7, j), zze(i13));
                        i14 += iZza2;
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = i7;
            i12 = i8;
            i10 = 1048575;
        }
        int iZza4 = 0;
        zzamo<?, ?> zzamoVar = this.zzp;
        int iZza5 = i14 + zzamoVar.zza(zzamoVar.zzd(t7));
        if (!this.zzh) {
            return iZza5;
        }
        zzajr<T> zzajrVarZza = this.zzq.zza(t7);
        int iZza6 = zzajrVarZza.zza.zza();
        for (int i19 = 0; i19 < iZza6; i19++) {
            Map.Entry entryZza = zzajrVarZza.zza.zza(i19);
            iZza4 += zzajr.zza((zzajt<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzajrVarZza.zza.zzb()) {
            iZza4 += zzajr.zza((zzajt<?>) entry.getKey(), entry.getValue());
        }
        return iZza5 + iZza4;
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
        if (zzc(t8, i8, i7)) {
            long jZzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, jZzc);
            if (object != null) {
                zzalv zzalvVarZze = zze(i7);
                if (!zzc(t7, i8, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, jZzc, object);
                    } else {
                        Object objZza = zzalvVarZze.zza();
                        zzalvVarZze.zza(objZza, object);
                        unsafe.putObject(t7, jZzc, objZza);
                    }
                    zzb(t7, i8, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t7, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalvVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zzb(T t7, int i7) {
        int iZzb = zzb(i7);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzamp.zza((Object) t7, j, (1 << (iZzb >>> 20)) | zzamp.zzc(t7, j));
    }

    private final void zzb(T t7, int i7, int i8) {
        zzamp.zza((Object) t7, zzb(i8) & 1048575, i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzb(T t7, T t8) {
        int length = this.zzc.length;
        int i7 = 0;
        while (true) {
            boolean zZza = true;
            if (i7 < length) {
                int iZzc = zzc(i7);
                long j = iZzc & 1048575;
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t7, t8, i7) || Double.doubleToLongBits(zzamp.zza(t7, j)) != Double.doubleToLongBits(zzamp.zza(t8, j))) {
                            zZza = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t7, t8, i7) || Float.floatToIntBits(zzamp.zzb(t7, j)) != Float.floatToIntBits(zzamp.zzb(t8, j))) {
                            zZza = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t7, t8, i7) || zzamp.zzd(t7, j) != zzamp.zzd(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t7, t8, i7) || zzamp.zzd(t7, j) != zzamp.zzd(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t7, t8, i7) || zzamp.zzd(t7, j) != zzamp.zzd(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t7, t8, i7) || zzamp.zzh(t7, j) != zzamp.zzh(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t7, t8, i7) || !zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j))) {
                            zZza = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t7, t8, i7) || !zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j))) {
                            zZza = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t7, t8, i7) || !zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j))) {
                            zZza = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t7, t8, i7) || zzamp.zzd(t7, j) != zzamp.zzd(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t7, t8, i7) || zzamp.zzc(t7, j) != zzamp.zzc(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t7, t8, i7) || zzamp.zzd(t7, j) != zzamp.zzd(t8, j)) {
                            zZza = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t7, t8, i7) || !zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j))) {
                            zZza = false;
                        }
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
                        zZza = zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j));
                        break;
                    case 50:
                        zZza = zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j));
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
                        long jZzb = zzb(i7) & 1048575;
                        if (zzamp.zzc(t7, jZzb) != zzamp.zzc(t8, jZzb) || !zzalx.zza(zzamp.zze(t7, j), zzamp.zze(t8, j))) {
                            zZza = false;
                        }
                        break;
                }
                if (!zZza) {
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

    /* JADX WARN: Code duplicated, block: B:390:0x093a A[PHI: r7 r8 r9 r10 r12 r13 r15
      0x093a: PHI (r7v132 int) = (r7v69 int), (r7v70 int), (r7v71 int), (r7v86 int), (r7v101 int), (r7v120 int), (r7v133 int) binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r8v137 int) = 
      (r8v95 int)
      (r8v96 int)
      (r8v97 int)
      (r8v105 int)
      (r8v117 int)
      (r8v128 int)
      (r37v0 int A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
     binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r9v106 int) = (r9v76 int), (r9v77 int), (r9v78 int), (r9v85 int), (r9v93 int), (r9v102 int), (r9v107 int) binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r10v79 sun.misc.Unsafe) = 
      (r10v39 sun.misc.Unsafe)
      (r10v40 sun.misc.Unsafe)
      (r10v41 sun.misc.Unsafe)
      (r10v52 sun.misc.Unsafe)
      (r10v66 sun.misc.Unsafe)
      (r10v74 sun.misc.Unsafe)
      (r10v80 sun.misc.Unsafe)
     binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r12v96 int) = (r12v64 int), (r12v65 int), (r12v66 int), (r12v73 int), (r12v81 int), (r12v91 int), (r12v97 int) binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r13v84 int) = (r13v52 int), (r13v53 int), (r13v54 int), (r13v61 int), (r13v69 int), (r13v77 int), (r13v85 int) binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x093a: PHI (r15v38 com.google.android.gms.internal.firebase-auth-api.zzaik) = 
      (r15v13 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v14 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v15 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v22 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v27 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v33 com.google.android.gms.internal.firebase-auth-api.zzaik)
      (r15v39 com.google.android.gms.internal.firebase-auth-api.zzaik)
     binds: [B:384:0x0919, B:364:0x08b8, B:344:0x0858, B:260:0x06d3, B:206:0x05da, B:153:0x04b6, B:131:0x042a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:516:0x0cd3 A[PHI: r4 r5 r8 r11 r19
      0x0cd3: PHI (r4v80 int) = 
      (r4v51 int)
      (r4v52 int)
      (r4v53 int)
      (r4v54 int)
      (r4v55 int)
      (r4v57 int)
      (r4v59 int)
      (r4v60 int)
      (r4v70 int)
      (r4v81 int)
     binds: [B:514:0x0cbf, B:511:0x0ca1, B:508:0x0c83, B:505:0x0c66, B:502:0x0c49, B:498:0x0c29, B:490:0x0c00, B:476:0x0bc4, B:453:0x0b0d, B:442:0x0a9f] A[DONT_GENERATE, DONT_INLINE]
      0x0cd3: PHI (r5v83 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>) = 
      (r5v57 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v58 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v59 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v60 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v61 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v63 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v65 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v66 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v75 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
      (r5v84 'this' com.google.android.gms.internal.firebase-auth-api.zzalg<T>)
     binds: [B:514:0x0cbf, B:511:0x0ca1, B:508:0x0c83, B:505:0x0c66, B:502:0x0c49, B:498:0x0c29, B:490:0x0c00, B:476:0x0bc4, B:453:0x0b0d, B:442:0x0a9f] A[DONT_GENERATE, DONT_INLINE]
      0x0cd3: PHI (r8v90 int) = 
      (r8v62 int)
      (r8v63 int)
      (r8v64 int)
      (r8v65 int)
      (r8v66 int)
      (r8v68 int)
      (r8v70 int)
      (r8v71 int)
      (r8v79 int)
      (r8v91 int)
     binds: [B:514:0x0cbf, B:511:0x0ca1, B:508:0x0c83, B:505:0x0c66, B:502:0x0c49, B:498:0x0c29, B:490:0x0c00, B:476:0x0bc4, B:453:0x0b0d, B:442:0x0a9f] A[DONT_GENERATE, DONT_INLINE]
      0x0cd3: PHI (r11v40 int) = 
      (r11v15 int)
      (r11v16 int)
      (r11v17 int)
      (r11v18 int)
      (r11v19 int)
      (r11v21 int)
      (r11v23 int)
      (r11v24 int)
      (r11v32 int)
      (r11v41 int)
     binds: [B:514:0x0cbf, B:511:0x0ca1, B:508:0x0c83, B:505:0x0c66, B:502:0x0c49, B:498:0x0c29, B:490:0x0c00, B:476:0x0bc4, B:453:0x0b0d, B:442:0x0a9f] A[DONT_GENERATE, DONT_INLINE]
      0x0cd3: PHI (r19v52 int) = 
      (r19v31 int)
      (r19v32 int)
      (r19v33 int)
      (r19v34 int)
      (r19v35 int)
      (r19v37 int)
      (r19v39 int)
      (r19v40 int)
      (r19v44 int)
      (r19v53 int)
     binds: [B:514:0x0cbf, B:511:0x0ca1, B:508:0x0c83, B:505:0x0c66, B:502:0x0c49, B:498:0x0c29, B:490:0x0c00, B:476:0x0bc4, B:453:0x0b0d, B:442:0x0a9f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:592:0x094c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x093d A[SYNTHETIC] */
    public final int zza(T t7, byte[] bArr, int i7, int i8, int i9, zzaik zzaikVar) throws zzakf {
        Unsafe unsafe;
        int i10;
        zzalg<T> zzalgVar;
        int i11;
        int i12;
        int iZza;
        int i13;
        int i14;
        zzaik zzaikVar2;
        int i15;
        int i16;
        int i17;
        int iZzc;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzaik zzaikVar3;
        int i23;
        int i24;
        int i25;
        int iZzd;
        int i26;
        int i27;
        int i28;
        int iZza2;
        int i29;
        int i30;
        int iZzc2;
        Object obj;
        int i31;
        int i32;
        Unsafe unsafe2;
        Object obj2;
        zzakc zzakcVarZza;
        zzaik zzaikVar4;
        int i33;
        int i34;
        Unsafe unsafe3;
        int i35;
        int iZzc3;
        int iZza3;
        int i36;
        Unsafe unsafe4;
        int i37;
        int i38;
        int i39;
        zzaik zzaikVar5;
        int i40;
        int i41;
        zzakc zzakcVar;
        zzaik zzaikVar6;
        int i42;
        int iZza4;
        zzalg<T> zzalgVar2 = this;
        T t8 = t7;
        byte[] bArr2 = bArr;
        int i43 = i8;
        i9 = i9;
        zzaik zzaikVar7 = zzaikVar;
        zzf(t7);
        Unsafe unsafe5 = zzb;
        int iZza5 = i7;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = -1;
        int i48 = 1048575;
        while (true) {
            if (iZza5 < i43) {
                int i49 = iZza5 + 1;
                int i50 = bArr2[iZza5];
                if (i50 < 0) {
                    int iZza6 = zzail.zza(i50, bArr2, i49, zzaikVar7);
                    i12 = zzaikVar7.zza;
                    i49 = iZza6;
                } else {
                    i12 = i50;
                }
                int i51 = (i12 == true ? 1 : 0) >>> 3;
                int i52 = (i12 == true ? 1 : 0) & 7;
                if (i51 > i47) {
                    iZza = (i51 < zzalgVar2.zze || i51 > zzalgVar2.zzf) ? -1 : zzalgVar2.zza(i51, i44 / 3);
                } else {
                    iZza = zzalgVar2.zza(i51);
                }
                int i53 = iZza;
                if (i53 != -1) {
                    int[] iArr = zzalgVar2.zzc;
                    int i54 = iArr[i53 + 1];
                    int i55 = (i54 & 267386880) >>> 20;
                    int i56 = i49;
                    boolean z4 = i12 == true ? 1 : 0;
                    long j = i54 & 1048575;
                    if (i55 <= 17) {
                        int i57 = iArr[i53 + 2];
                        int i58 = 1 << (i57 >>> 20);
                        int i59 = 1048575;
                        int i60 = i57 & 1048575;
                        i44 = i53;
                        if (i60 != i48) {
                            if (i48 != 1048575) {
                                unsafe5.putInt(t8, i48, i46);
                                i59 = 1048575;
                            }
                            i48 = i60;
                            i13 = i60 == i59 ? 0 : unsafe5.getInt(t8, i60);
                        } else {
                            i13 = i46;
                            i48 = i48;
                        }
                        switch (i55) {
                            case 0:
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 1) {
                                    zzamp.zza(t8, j, zzail.zza(bArr2, i56));
                                    iZzc = i56 + 8;
                                    i20 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 1:
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 5) {
                                    zzamp.zza((Object) t8, j, zzail.zzb(bArr2, i56));
                                    iZzc = i56 + 4;
                                    i20 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 2:
                            case 3:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 0) {
                                    int iZzd2 = zzail.zzd(bArr2, i56, zzaikVar7);
                                    unsafe5.putLong(t7, j, zzaikVar7.zzb);
                                    i19 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    iZza5 = iZzd2;
                                    i9 = i18;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17 == true ? 1 : 0;
                                    i46 = i19;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 4:
                            case 11:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 0) {
                                    iZzc = zzail.zzc(bArr2, i56, zzaikVar7);
                                    unsafe5.putInt(t8, j, zzaikVar7.zza);
                                    i20 = i13 | i58;
                                    i9 = i18;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 5:
                            case 14:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 1) {
                                    unsafe5.putLong(t7, j, zzail.zzd(bArr2, i56));
                                    iZzc = i56 + 8;
                                    i20 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i9 = i18;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 6:
                            case 13:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 5) {
                                    unsafe5.putInt(t8, j, zzail.zzc(bArr2, i56));
                                    iZzc = i56 + 4;
                                    i20 = i13 | i58;
                                    i9 = i18;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 7:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 0) {
                                    iZzc = zzail.zzd(bArr2, i56, zzaikVar7);
                                    zzamp.zzc(t8, j, zzaikVar7.zzb != 0);
                                    i20 = i13 | i58;
                                    i9 = i18;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 8:
                                i18 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 2) {
                                    if (zzg(i54)) {
                                        iZzc = zzail.zzb(bArr2, i56, zzaikVar7);
                                    } else {
                                        iZzc = zzail.zzc(bArr2, i56, zzaikVar7);
                                        int i61 = zzaikVar7.zza;
                                        if (i61 < 0) {
                                            throw zzakf.zzf();
                                        }
                                        if (i61 == 0) {
                                            zzaikVar7.zzc = "";
                                        } else {
                                            zzaikVar7.zzc = new String(bArr2, iZzc, i61, zzakb.zza);
                                            iZzc += i61;
                                        }
                                    }
                                    unsafe5.putObject(t8, j, zzaikVar7.zzc);
                                    i20 = i13 | i58;
                                    i9 = i18;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i18;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 9:
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i21 = z4 ? 1 : 0;
                                i56 = i56;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 2) {
                                    Object objZza = zzalgVar2.zza((Object) t8, i44);
                                    zzalv zzalvVarZze = zzalgVar2.zze(i44);
                                    i17 = i21 == true ? 1 : 0;
                                    iZzc = zzail.zza(objZza, zzalvVarZze, bArr, i56, i8, zzaikVar);
                                    zzalgVar2.zza(t8, i44, objZza);
                                    i20 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i9 = i9;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i17 = i21;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 10:
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i21 = z4 ? 1 : 0;
                                i56 = i56;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 2) {
                                    iZzc = zzail.zza(bArr2, i56, zzaikVar7);
                                    unsafe5.putObject(t8, j, zzaikVar7.zzc);
                                    i20 = i13 | i58;
                                    i45 = i21 == true ? 1 : 0;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i17 = i21;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 12:
                                i43 = i8;
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 0) {
                                    int iZzc4 = zzail.zzc(bArr2, i56, zzaikVar7);
                                    int i62 = zzaikVar7.zza;
                                    zzakd zzakdVarZzd = zzalgVar2.zzd(i44);
                                    if ((i54 & Integer.MIN_VALUE) != 0 && zzakdVarZzd != null && !zzakdVarZzd.zza(i62)) {
                                        zzc(t7).zza(i17 == true ? 1 : 0, Long.valueOf(i62));
                                        i45 = i17 == true ? 1 : 0;
                                        i46 = i13;
                                    } else {
                                        unsafe5.putInt(t8, j, i62);
                                        i45 = i17 == true ? 1 : 0;
                                        i46 = i13 | i58;
                                    }
                                    iZza5 = iZzc4;
                                } else {
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 15:
                                i9 = i9;
                                zzaikVar7 = zzaikVar7;
                                i44 = i44;
                                i56 = i56;
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                if (i52 == 0) {
                                    iZzc = zzail.zzc(bArr2, i56, zzaikVar7);
                                    unsafe5.putInt(t8, j, zzajb.zze(zzaikVar7.zza));
                                    i20 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i47;
                                    i45 = i17;
                                    i48 = i48;
                                    iZza5 = iZzc;
                                    i46 = i20;
                                } else {
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 16:
                                if (i52 == 0) {
                                    int iZzd3 = zzail.zzd(bArr2, i56, zzaikVar7);
                                    unsafe5.putLong(t7, j, zzajb.zza(zzaikVar7.zzb));
                                    i19 = i13 | i58;
                                    unsafe5 = unsafe5;
                                    i43 = i8;
                                    i9 = i9;
                                    i44 = i44;
                                    zzaikVar7 = zzaikVar7;
                                    i47 = i51;
                                    i45 = z4 ? 1 : 0;
                                    iZza5 = iZzd3;
                                    i46 = i19;
                                } else {
                                    zzaikVar7 = zzaikVar7;
                                    unsafe5 = unsafe5;
                                    i44 = i44;
                                    i47 = i51;
                                    i56 = i56;
                                    i9 = i9;
                                    i17 = z4 ? 1 : 0;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            case 17:
                                if (i52 == 3) {
                                    Object objZza2 = zzalgVar2.zza((Object) t8, i44);
                                    iZza5 = zzail.zza(objZza2, zzalgVar2.zze(i44), bArr, i56, i8, (i51 << 3) | 4, zzaikVar);
                                    zzalgVar2.zza(t8, i44, objZza2);
                                    i46 = i13 | i58;
                                    i45 = z4 ? 1 : 0;
                                    i44 = i44;
                                    i47 = i51;
                                    i48 = i48;
                                    i43 = i8;
                                    i9 = i9;
                                } else {
                                    i17 = z4 ? 1 : 0;
                                    i47 = i51;
                                    unsafe5 = unsafe5;
                                    i9 = i9;
                                    this = zzalgVar2;
                                    unsafe = unsafe5;
                                    i16 = i56;
                                    zzaikVar2 = zzaikVar7;
                                    i15 = i47;
                                    i12 = i17;
                                    i14 = i44;
                                }
                                break;
                            default:
                                i17 = z4 ? 1 : 0;
                                i47 = i51;
                                unsafe5 = unsafe5;
                                i9 = i9;
                                this = zzalgVar2;
                                unsafe = unsafe5;
                                i16 = i56;
                                zzaikVar2 = zzaikVar7;
                                i15 = i47;
                                i12 = i17;
                                i14 = i44;
                                break;
                        }
                    } else {
                        i13 = i46;
                        i48 = i48;
                        zzaik zzaikVar8 = zzaikVar7;
                        int i63 = z4 ? 1 : 0;
                        i15 = i51;
                        Unsafe unsafe6 = unsafe5;
                        int i64 = i8;
                        if (i55 != 27) {
                            Unsafe unsafe7 = unsafe6;
                            if (i55 <= 49) {
                                long j3 = i54;
                                Unsafe unsafe8 = zzb;
                                zzakc zzakcVar2 = (zzakc) unsafe8.getObject(t8, j);
                                if (zzakcVar2.zzc()) {
                                    zzakcVarZza = zzakcVar2;
                                } else {
                                    zzakcVarZza = zzakcVar2.zza(zzakcVar2.size() << 1);
                                    unsafe8.putObject(t8, j, zzakcVarZza);
                                }
                                switch (i55) {
                                    case 18:
                                    case 35:
                                        i9 = i9;
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i33 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe3 = unsafe7;
                                        i35 = i64;
                                        if (i52 != 2) {
                                            if (i52 == 1) {
                                                zzaji zzajiVar = (zzaji) zzakcVarZza;
                                                zzajiVar.zza(zzail.zza(bArr2, i33));
                                                iZzc3 = i33 + 8;
                                                while (iZzc3 < i35) {
                                                    int iZzc5 = zzail.zzc(bArr2, iZzc3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        zzajiVar.zza(zzail.zza(bArr2, iZzc5));
                                                        iZzc3 = iZzc5 + 8;
                                                    }
                                                }
                                            } else {
                                                iZza3 = i33;
                                            }
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                            break;
                                        } else {
                                            zzaji zzajiVar2 = (zzaji) zzakcVarZza;
                                            iZzc3 = zzail.zzc(bArr2, i33, zzaikVar4);
                                            int i65 = zzaikVar4.zza;
                                            int i66 = iZzc3 + i65;
                                            if (i66 <= bArr2.length) {
                                                zzajiVar2.zzc((i65 / 8) + zzajiVar2.size());
                                                while (iZzc3 < i66) {
                                                    zzajiVar2.zza(zzail.zza(bArr2, iZzc3));
                                                    iZzc3 += 8;
                                                }
                                                if (iZzc3 != i66) {
                                                    throw zzakf.zzj();
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i9 = i9;
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i33 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe3 = unsafe7;
                                        i35 = i64;
                                        if (i52 != 2) {
                                            if (i52 == 5) {
                                                zzajx zzajxVar = (zzajx) zzakcVarZza;
                                                zzajxVar.zza(zzail.zzb(bArr2, i33));
                                                iZzc3 = i33 + 4;
                                                while (iZzc3 < i35) {
                                                    int iZzc6 = zzail.zzc(bArr2, iZzc3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        zzajxVar.zza(zzail.zzb(bArr2, iZzc6));
                                                        iZzc3 = iZzc6 + 4;
                                                    }
                                                }
                                            } else {
                                                iZza3 = i33;
                                            }
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                            break;
                                        } else {
                                            zzajx zzajxVar2 = (zzajx) zzakcVarZza;
                                            iZzc3 = zzail.zzc(bArr2, i33, zzaikVar4);
                                            int i67 = zzaikVar4.zza;
                                            int i68 = iZzc3 + i67;
                                            if (i68 <= bArr2.length) {
                                                zzajxVar2.zzc((i67 / 4) + zzajxVar2.size());
                                                while (iZzc3 < i68) {
                                                    zzajxVar2.zza(zzail.zzb(bArr2, iZzc3));
                                                    iZzc3 += 4;
                                                }
                                                if (iZzc3 != i68) {
                                                    throw zzakf.zzj();
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        i9 = i9;
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i33 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe3 = unsafe7;
                                        i35 = i64;
                                        if (i52 != 2) {
                                            if (i52 == 0) {
                                                zzakr zzakrVar = (zzakr) zzakcVarZza;
                                                iZzc3 = zzail.zzd(bArr2, i33, zzaikVar4);
                                                zzakrVar.zza(zzaikVar4.zzb);
                                                while (iZzc3 < i35) {
                                                    int iZzc7 = zzail.zzc(bArr2, iZzc3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        iZzc3 = zzail.zzd(bArr2, iZzc7, zzaikVar4);
                                                        zzakrVar.zza(zzaikVar4.zzb);
                                                    }
                                                }
                                            } else {
                                                iZza3 = i33;
                                            }
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            zzakr zzakrVar2 = (zzakr) zzakcVarZza;
                                            iZzc3 = zzail.zzc(bArr2, i33, zzaikVar4);
                                            int i69 = zzaikVar4.zza + iZzc3;
                                            while (iZzc3 < i69) {
                                                iZzc3 = zzail.zzd(bArr2, iZzc3, zzaikVar4);
                                                zzakrVar2.zza(zzaikVar4.zzb);
                                            }
                                            if (iZzc3 != i69) {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i36 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe4 = unsafe7;
                                        i35 = i64;
                                        i37 = i9;
                                        if (i52 != 2) {
                                            if (i52 == 0) {
                                                i33 = i36;
                                                i9 = i37;
                                                unsafe3 = unsafe4;
                                                iZzc3 = zzail.zza(i34 == true ? 1 : 0, bArr, i33, i8, (zzakc<?>) zzakcVarZza, zzaikVar);
                                                iZza3 = iZzc3;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            }
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                            break;
                                        } else {
                                            iZza3 = zzail.zza(bArr2, i36, (zzakc<?>) zzakcVarZza, zzaikVar4);
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i36 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe4 = unsafe7;
                                        i35 = i64;
                                        i37 = i9;
                                        if (i52 != 2) {
                                            if (i52 == 1) {
                                                zzakr zzakrVar3 = (zzakr) zzakcVarZza;
                                                zzakrVar3.zza(zzail.zzd(bArr2, i36));
                                                i38 = i36 + 8;
                                                while (i38 < i35) {
                                                    int iZzc8 = zzail.zzc(bArr2, i38, zzaikVar4);
                                                    if (i34 != zzaikVar4.zza) {
                                                        i33 = i36;
                                                        i9 = i37;
                                                        iZza3 = i38;
                                                        unsafe3 = unsafe4;
                                                        if (iZza3 == i33) {
                                                            i9 = i9;
                                                            i16 = iZza3;
                                                            this = zzalgVar2;
                                                            i9 = i9;
                                                            unsafe = unsafe3;
                                                            i12 = i34;
                                                            zzaikVar2 = zzaikVar4;
                                                            t8 = t7;
                                                            i14 = i44;
                                                        } else {
                                                            i9 = i9;
                                                            iZza5 = iZza3;
                                                            i9 = i9;
                                                            unsafe5 = unsafe3;
                                                            i45 = i34;
                                                            i43 = i35;
                                                            zzaikVar7 = zzaikVar4;
                                                            i47 = i15;
                                                            i46 = i13;
                                                            i48 = i48;
                                                            t8 = t7;
                                                        }
                                                    } else {
                                                        zzakrVar3.zza(zzail.zzd(bArr2, iZzc8));
                                                        i38 = iZzc8 + 8;
                                                    }
                                                    break;
                                                }
                                                i33 = i36;
                                                i9 = i37;
                                                iZza3 = i38;
                                                unsafe3 = unsafe4;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            }
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            zzakr zzakrVar4 = (zzakr) zzakcVarZza;
                                            iZza3 = zzail.zzc(bArr2, i36, zzaikVar4);
                                            int i70 = zzaikVar4.zza;
                                            int i71 = iZza3 + i70;
                                            if (i71 <= bArr2.length) {
                                                zzakrVar4.zzc((i70 / 8) + zzakrVar4.size());
                                                while (iZza3 < i71) {
                                                    zzakrVar4.zza(zzail.zzd(bArr2, iZza3));
                                                    iZza3 += 8;
                                                }
                                                if (iZza3 != i71) {
                                                    throw zzakf.zzj();
                                                }
                                                i33 = i36;
                                                i9 = i37;
                                                unsafe3 = unsafe4;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i36 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe4 = unsafe7;
                                        i35 = i64;
                                        i37 = i9;
                                        if (i52 != 2) {
                                            if (i52 == 5) {
                                                zzajz zzajzVar = (zzajz) zzakcVarZza;
                                                zzajzVar.zzc(zzail.zzc(bArr2, i36));
                                                i38 = i36 + 4;
                                                while (i38 < i35) {
                                                    int iZzc9 = zzail.zzc(bArr2, i38, zzaikVar4);
                                                    if (i34 != zzaikVar4.zza) {
                                                        i33 = i36;
                                                        i9 = i37;
                                                        iZza3 = i38;
                                                        unsafe3 = unsafe4;
                                                        if (iZza3 == i33) {
                                                            i9 = i9;
                                                            i16 = iZza3;
                                                            this = zzalgVar2;
                                                            i9 = i9;
                                                            unsafe = unsafe3;
                                                            i12 = i34;
                                                            zzaikVar2 = zzaikVar4;
                                                            t8 = t7;
                                                            i14 = i44;
                                                        } else {
                                                            i9 = i9;
                                                            iZza5 = iZza3;
                                                            i9 = i9;
                                                            unsafe5 = unsafe3;
                                                            i45 = i34;
                                                            i43 = i35;
                                                            zzaikVar7 = zzaikVar4;
                                                            i47 = i15;
                                                            i46 = i13;
                                                            i48 = i48;
                                                            t8 = t7;
                                                        }
                                                    } else {
                                                        zzajzVar.zzc(zzail.zzc(bArr2, iZzc9));
                                                        i38 = iZzc9 + 4;
                                                    }
                                                    break;
                                                }
                                                i33 = i36;
                                                i9 = i37;
                                                iZza3 = i38;
                                                unsafe3 = unsafe4;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            }
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            zzajz zzajzVar2 = (zzajz) zzakcVarZza;
                                            iZza3 = zzail.zzc(bArr2, i36, zzaikVar4);
                                            int i72 = zzaikVar4.zza;
                                            int i73 = iZza3 + i72;
                                            if (i73 <= bArr2.length) {
                                                zzajzVar2.zzd((i72 / 4) + zzajzVar2.size());
                                                while (iZza3 < i73) {
                                                    zzajzVar2.zzc(zzail.zzc(bArr2, iZza3));
                                                    iZza3 += 4;
                                                }
                                                if (iZza3 != i73) {
                                                    throw zzakf.zzj();
                                                }
                                                i33 = i36;
                                                i9 = i37;
                                                unsafe3 = unsafe4;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            } else {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i36 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe4 = unsafe7;
                                        i35 = i64;
                                        i37 = i9;
                                        if (i52 != 2) {
                                            if (i52 == 0) {
                                                zzain zzainVar = (zzain) zzakcVarZza;
                                                iZza3 = zzail.zzd(bArr2, i36, zzaikVar4);
                                                zzainVar.zza(zzaikVar4.zzb != 0);
                                                while (iZza3 < i35) {
                                                    int iZzc10 = zzail.zzc(bArr2, iZza3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        iZza3 = zzail.zzd(bArr2, iZzc10, zzaikVar4);
                                                        zzainVar.zza(zzaikVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            zzain zzainVar2 = (zzain) zzakcVarZza;
                                            iZza3 = zzail.zzc(bArr2, i36, zzaikVar4);
                                            int i74 = zzaikVar4.zza + iZza3;
                                            while (iZza3 < i74) {
                                                iZza3 = zzail.zzd(bArr2, iZza3, zzaikVar4);
                                                zzainVar2.zza(zzaikVar4.zzb != 0);
                                            }
                                            if (iZza3 != i74) {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        i33 = i36;
                                        i9 = i37;
                                        unsafe3 = unsafe4;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 26:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i36 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe4 = unsafe7;
                                        i35 = i64;
                                        i37 = i9;
                                        if (i52 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                iZza3 = zzail.zzc(bArr2, i36, zzaikVar4);
                                                int i75 = zzaikVar4.zza;
                                                if (i75 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i75 == 0) {
                                                    zzakcVarZza.add("");
                                                } else {
                                                    zzakcVarZza.add(new String(bArr2, iZza3, i75, zzakb.zza));
                                                    iZza3 += i75;
                                                }
                                                while (iZza3 < i35) {
                                                    int iZzc11 = zzail.zzc(bArr2, iZza3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        iZza3 = zzail.zzc(bArr2, iZzc11, zzaikVar4);
                                                        int i76 = zzaikVar4.zza;
                                                        if (i76 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i76 == 0) {
                                                            zzakcVarZza.add("");
                                                        } else {
                                                            zzakcVarZza.add(new String(bArr2, iZza3, i76, zzakb.zza));
                                                            iZza3 += i76;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZza3 = zzail.zzc(bArr2, i36, zzaikVar4);
                                                int i77 = zzaikVar4.zza;
                                                if (i77 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i77 == 0) {
                                                    zzakcVarZza.add("");
                                                } else {
                                                    int i78 = iZza3 + i77;
                                                    if (zzamt.zzc(bArr2, iZza3, i78)) {
                                                        zzakcVarZza.add(new String(bArr2, iZza3, i77, zzakb.zza));
                                                        iZza3 = i78;
                                                    } else {
                                                        throw zzakf.zzd();
                                                    }
                                                }
                                                while (iZza3 < i35) {
                                                    int iZzc12 = zzail.zzc(bArr2, iZza3, zzaikVar4);
                                                    if (i34 == zzaikVar4.zza) {
                                                        iZza3 = zzail.zzc(bArr2, iZzc12, zzaikVar4);
                                                        int i79 = zzaikVar4.zza;
                                                        if (i79 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i79 == 0) {
                                                            zzakcVarZza.add("");
                                                        } else {
                                                            int i80 = iZza3 + i79;
                                                            if (zzamt.zzc(bArr2, iZza3, i80)) {
                                                                zzakcVarZza.add(new String(bArr2, iZza3, i79, zzakb.zza));
                                                                iZza3 = i80;
                                                            } else {
                                                                throw zzakf.zzd();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i33 = i36;
                                            i9 = i37;
                                            unsafe3 = unsafe4;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        }
                                        i33 = i36;
                                        i9 = i37;
                                        unsafe3 = unsafe4;
                                        iZza3 = i33;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 27:
                                        i9 = i9;
                                        i64 = i64;
                                        i39 = i53;
                                        zzaikVar5 = zzaikVar8;
                                        i40 = i56;
                                        i41 = i63 == true ? 1 : 0;
                                        unsafe7 = unsafe7;
                                        if (i52 == 2) {
                                            zzaikVar4 = zzaikVar5;
                                            int iZzb = zzail.zzb(zzalgVar2.zze(i39), i41 == true ? 1 : 0, bArr, i40, i8, zzakcVarZza, zzaikVar);
                                            i35 = i64;
                                            i44 = i39;
                                            unsafe3 = unsafe7;
                                            i34 = i41 == true ? 1 : 0;
                                            iZza3 = iZzb;
                                            i33 = i40;
                                        } else {
                                            zzaikVar4 = zzaikVar5;
                                            i34 = i41;
                                            i35 = i64;
                                            unsafe3 = unsafe7;
                                            i33 = i40;
                                            i44 = i39;
                                            iZza3 = i33;
                                        }
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 28:
                                        i9 = i9;
                                        i64 = i64;
                                        zzakc zzakcVar3 = zzakcVarZza;
                                        i39 = i53;
                                        zzaikVar5 = zzaikVar8;
                                        i40 = i56;
                                        i41 = i63 == true ? 1 : 0;
                                        unsafe7 = unsafe7;
                                        if (i52 == 2) {
                                            int iZzc13 = zzail.zzc(bArr2, i40, zzaikVar5);
                                            int i81 = zzaikVar5.zza;
                                            if (i81 >= 0) {
                                                if (i81 > bArr2.length - iZzc13) {
                                                    throw zzakf.zzj();
                                                }
                                                if (i81 == 0) {
                                                    zzakcVar = zzakcVar3;
                                                    zzakcVar.add(zzaip.zza);
                                                } else {
                                                    zzakcVar = zzakcVar3;
                                                    zzakcVar.add(zzaip.zza(bArr2, iZzc13, i81));
                                                    iZzc13 += i81;
                                                }
                                                while (iZzc13 < i64) {
                                                    int iZzc14 = zzail.zzc(bArr2, iZzc13, zzaikVar5);
                                                    if (i41 != zzaikVar5.zza) {
                                                        iZza3 = iZzc13;
                                                        zzaikVar4 = zzaikVar5;
                                                        i34 = i41 == true ? 1 : 0;
                                                        i35 = i64;
                                                        unsafe3 = unsafe7;
                                                        i33 = i40;
                                                        i44 = i39;
                                                        if (iZza3 == i33) {
                                                            i9 = i9;
                                                            i16 = iZza3;
                                                            this = zzalgVar2;
                                                            i9 = i9;
                                                            unsafe = unsafe3;
                                                            i12 = i34;
                                                            zzaikVar2 = zzaikVar4;
                                                            t8 = t7;
                                                            i14 = i44;
                                                        } else {
                                                            i9 = i9;
                                                            iZza5 = iZza3;
                                                            i9 = i9;
                                                            unsafe5 = unsafe3;
                                                            i45 = i34;
                                                            i43 = i35;
                                                            zzaikVar7 = zzaikVar4;
                                                            i47 = i15;
                                                            i46 = i13;
                                                            i48 = i48;
                                                            t8 = t7;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzc13 = zzail.zzc(bArr2, iZzc14, zzaikVar5);
                                                        int i82 = zzaikVar5.zza;
                                                        if (i82 >= 0) {
                                                            if (i82 > bArr2.length - iZzc13) {
                                                                throw zzakf.zzj();
                                                            }
                                                            if (i82 == 0) {
                                                                zzakcVar.add(zzaip.zza);
                                                            } else {
                                                                zzakcVar.add(zzaip.zza(bArr2, iZzc13, i82));
                                                                iZzc13 += i82;
                                                            }
                                                        } else {
                                                            throw zzakf.zzf();
                                                        }
                                                    }
                                                }
                                                iZza3 = iZzc13;
                                                zzaikVar4 = zzaikVar5;
                                                i34 = i41 == true ? 1 : 0;
                                                i35 = i64;
                                                unsafe3 = unsafe7;
                                                i33 = i40;
                                                i44 = i39;
                                                if (iZza3 == i33) {
                                                    i9 = i9;
                                                    i16 = iZza3;
                                                    this = zzalgVar2;
                                                    i9 = i9;
                                                    unsafe = unsafe3;
                                                    i12 = i34;
                                                    zzaikVar2 = zzaikVar4;
                                                    t8 = t7;
                                                    i14 = i44;
                                                } else {
                                                    i9 = i9;
                                                    iZza5 = iZza3;
                                                    i9 = i9;
                                                    unsafe5 = unsafe3;
                                                    i45 = i34;
                                                    i43 = i35;
                                                    zzaikVar7 = zzaikVar4;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    t8 = t7;
                                                }
                                            } else {
                                                throw zzakf.zzf();
                                            }
                                        }
                                        zzaikVar4 = zzaikVar5;
                                        i34 = i41;
                                        i35 = i64;
                                        unsafe3 = unsafe7;
                                        i33 = i40;
                                        i44 = i39;
                                        iZza3 = i33;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i39 = i53;
                                        zzaikVar6 = zzaikVar8;
                                        i40 = i56;
                                        i42 = i63 == true ? 1 : 0;
                                        if (i52 != 2) {
                                            if (i52 == 0) {
                                                iZza4 = zzail.zza(i42 == true ? 1 : 0, bArr, i40, i8, (zzakc<?>) zzakcVarZza, zzaikVar);
                                            }
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i33 = i40;
                                            i34 = i42;
                                            unsafe3 = unsafe7;
                                            i35 = i64;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            iZza4 = zzail.zza(bArr2, i40, (zzakc<?>) zzakcVarZza, zzaikVar6);
                                        }
                                        zzalx.zza(t7, i15, zzakcVarZza, zzalgVar2.zzd(i39), null, zzalgVar2.zzp);
                                        zzaikVar4 = zzaikVar6;
                                        i34 = i42 == true ? 1 : 0;
                                        iZza3 = iZza4;
                                        i35 = i64;
                                        unsafe3 = unsafe7;
                                        i33 = i40;
                                        i44 = i39;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i39 = i53;
                                        zzaikVar6 = zzaikVar8;
                                        i40 = i56;
                                        i42 = i63 == true ? 1 : 0;
                                        if (i52 != 2) {
                                            if (i52 == 0) {
                                                zzajz zzajzVar3 = (zzajz) zzakcVarZza;
                                                iZza3 = zzail.zzc(bArr2, i40, zzaikVar6);
                                                zzajzVar3.zzc(zzajb.zze(zzaikVar6.zza));
                                                while (iZza3 < i64) {
                                                    int iZzc15 = zzail.zzc(bArr2, iZza3, zzaikVar6);
                                                    if (i42 == zzaikVar6.zza) {
                                                        iZza3 = zzail.zzc(bArr2, iZzc15, zzaikVar6);
                                                        zzajzVar3.zzc(zzajb.zze(zzaikVar6.zza));
                                                    }
                                                }
                                            }
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i33 = i40;
                                            i34 = i42;
                                            unsafe3 = unsafe7;
                                            i35 = i64;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            zzajz zzajzVar4 = (zzajz) zzakcVarZza;
                                            iZza3 = zzail.zzc(bArr2, i40, zzaikVar6);
                                            int i83 = zzaikVar6.zza + iZza3;
                                            while (iZza3 < i83) {
                                                iZza3 = zzail.zzc(bArr2, iZza3, zzaikVar6);
                                                zzajzVar4.zzc(zzajb.zze(zzaikVar6.zza));
                                            }
                                            if (iZza3 != i83) {
                                                throw zzakf.zzj();
                                            }
                                        }
                                        i9 = i9;
                                        zzaikVar4 = zzaikVar6;
                                        i44 = i39;
                                        i33 = i40;
                                        i34 = i42;
                                        unsafe3 = unsafe7;
                                        i35 = i64;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i39 = i53;
                                        zzaikVar6 = zzaikVar8;
                                        i40 = i56;
                                        if (i52 == 2) {
                                            zzakr zzakrVar5 = (zzakr) zzakcVarZza;
                                            iZza3 = zzail.zzc(bArr2, i40, zzaikVar6);
                                            int i84 = zzaikVar6.zza + iZza3;
                                            while (iZza3 < i84) {
                                                iZza3 = zzail.zzd(bArr2, iZza3, zzaikVar6);
                                                zzakrVar5.zza(zzajb.zza(zzaikVar6.zzb));
                                            }
                                            if (iZza3 != i84) {
                                                throw zzakf.zzj();
                                            }
                                            i9 = i9;
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i35 = i64;
                                            i33 = i40;
                                            i34 = i63 == true ? 1 : 0;
                                            unsafe3 = unsafe7;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else if (i52 == 0) {
                                            zzakr zzakrVar6 = (zzakr) zzakcVarZza;
                                            iZza3 = zzail.zzd(bArr2, i40, zzaikVar6);
                                            zzakrVar6.zza(zzajb.zza(zzaikVar6.zzb));
                                            while (true) {
                                                if (iZza3 < i64) {
                                                    int iZzc16 = zzail.zzc(bArr2, iZza3, zzaikVar6);
                                                    i42 = i63;
                                                    if (i42 == zzaikVar6.zza) {
                                                        iZza3 = zzail.zzd(bArr2, iZzc16, zzaikVar6);
                                                        zzakrVar6.zza(zzajb.zza(zzaikVar6.zzb));
                                                        i63 = i42 == true ? 1 : 0;
                                                    }
                                                } else {
                                                    i42 = i63;
                                                }
                                            }
                                            i9 = i9;
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i33 = i40;
                                            i34 = i42;
                                            unsafe3 = unsafe7;
                                            i35 = i64;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        } else {
                                            i9 = i9;
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i35 = i64;
                                            i33 = i40;
                                            i34 = i63 == true ? 1 : 0;
                                            unsafe3 = unsafe7;
                                            iZza3 = i33;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                        }
                                        break;
                                    case 49:
                                        if (i52 == 3) {
                                            i40 = i56;
                                            i39 = i53;
                                            zzaikVar6 = zzaikVar8;
                                            iZza3 = zzail.zza(zzalgVar2.zze(i53), i63 == true ? 1 : 0, bArr, i40, i8, (zzakc<?>) zzakcVarZza, zzaikVar);
                                            i9 = i9;
                                            zzaikVar4 = zzaikVar6;
                                            i44 = i39;
                                            i35 = i64;
                                            i33 = i40;
                                            i34 = i63 == true ? 1 : 0;
                                            unsafe3 = unsafe7;
                                            if (iZza3 == i33) {
                                                i9 = i9;
                                                i16 = iZza3;
                                                this = zzalgVar2;
                                                i9 = i9;
                                                unsafe = unsafe3;
                                                i12 = i34;
                                                zzaikVar2 = zzaikVar4;
                                                t8 = t7;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = iZza3;
                                                i9 = i9;
                                                unsafe5 = unsafe3;
                                                i45 = i34;
                                                i43 = i35;
                                                zzaikVar7 = zzaikVar4;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                t8 = t7;
                                            }
                                            break;
                                        }
                                    default:
                                        i44 = i53;
                                        zzaikVar4 = zzaikVar8;
                                        i33 = i56;
                                        i34 = i63 == true ? 1 : 0;
                                        unsafe3 = unsafe7;
                                        i35 = i64;
                                        iZza3 = i33;
                                        if (iZza3 == i33) {
                                            i9 = i9;
                                            i16 = iZza3;
                                            this = zzalgVar2;
                                            i9 = i9;
                                            unsafe = unsafe3;
                                            i12 = i34;
                                            zzaikVar2 = zzaikVar4;
                                            t8 = t7;
                                            i14 = i44;
                                        } else {
                                            i9 = i9;
                                            iZza5 = iZza3;
                                            i9 = i9;
                                            unsafe5 = unsafe3;
                                            i45 = i34;
                                            i43 = i35;
                                            zzaikVar7 = zzaikVar4;
                                            i47 = i15;
                                            i46 = i13;
                                            i48 = i48;
                                            t8 = t7;
                                        }
                                        break;
                                }
                            } else {
                                Unsafe unsafe9 = unsafe7;
                                i44 = i53;
                                i22 = i56;
                                int i85 = i63 == true ? 1 : 0;
                                if (i55 != 50) {
                                    zzaikVar2 = zzaikVar8;
                                    unsafe = unsafe9;
                                    t8 = t7;
                                    Unsafe unsafe10 = zzb;
                                    long j7 = iArr[i44 + 2] & 1048575;
                                    switch (i55) {
                                        case 51:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 1) {
                                                unsafe10.putObject(t8, j, Double.valueOf(zzail.zza(bArr2, i24)));
                                                i25 = i24 + 8;
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = i25;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 52:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 5) {
                                                unsafe10.putObject(t8, j, Float.valueOf(zzail.zzb(bArr2, i24)));
                                                i25 = i24 + 4;
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = i25;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 0) {
                                                iZzd = zzail.zzd(bArr2, i24, zzaikVar2);
                                                unsafe10.putObject(t8, j, Long.valueOf(zzaikVar2.zzb));
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = iZzd;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 0) {
                                                iZzd = zzail.zzc(bArr2, i24, zzaikVar2);
                                                unsafe10.putObject(t8, j, Integer.valueOf(zzaikVar2.zza));
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = iZzd;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 1) {
                                                unsafe10.putObject(t8, j, Long.valueOf(zzail.zzd(bArr2, i24)));
                                                i25 = i24 + 8;
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = i25;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 5) {
                                                unsafe10.putObject(t8, j, Integer.valueOf(zzail.zzc(bArr2, i24)));
                                                i25 = i24 + 4;
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = i25;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 58:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 0) {
                                                iZzd = zzail.zzd(bArr2, i24, zzaikVar2);
                                                unsafe10.putObject(t8, j, Boolean.valueOf(zzaikVar2.zzb != 0));
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = iZzd;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 59:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i14 = i44;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 2) {
                                                int iZzc17 = zzail.zzc(bArr2, i24, zzaikVar2);
                                                int i86 = zzaikVar2.zza;
                                                if (i86 == 0) {
                                                    unsafe10.putObject(t8, j, "");
                                                } else {
                                                    if ((i54 & 536870912) != 0 && !zzamt.zzc(bArr2, iZzc17, iZzc17 + i86)) {
                                                        throw zzakf.zzd();
                                                    }
                                                    unsafe10.putObject(t8, j, new String(bArr2, iZzc17, i86, zzakb.zza));
                                                    iZzc17 += i86;
                                                }
                                                unsafe10.putInt(t8, j7, i15);
                                                iZza5 = iZzc17;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 60:
                                            this = this;
                                            i26 = i22;
                                            i27 = i44;
                                            i28 = i15;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 2) {
                                                Object objZza3 = this.zza(t8, i28, i27);
                                                int iZza7 = zzail.zza(objZza3, this.zze(i27), bArr, i26, i8, zzaikVar);
                                                this.zza(t8, i28, i27, objZza3);
                                                iZza5 = iZza7;
                                                i14 = i27;
                                                i24 = i26;
                                                i15 = i28;
                                            } else {
                                                i14 = i27;
                                                i15 = i28;
                                                i24 = i26;
                                                iZza5 = i24;
                                            }
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 61:
                                            this = this;
                                            i26 = i22;
                                            i27 = i44;
                                            i28 = i15;
                                            i12 = i85 == true ? 1 : 0;
                                            if (i52 == 2) {
                                                iZza2 = zzail.zza(bArr2, i26, zzaikVar2);
                                                unsafe10.putObject(t8, j, zzaikVar2.zzc);
                                                unsafe10.putInt(t8, j7, i28);
                                                iZza5 = iZza2;
                                                i14 = i27;
                                                i15 = i28;
                                                i24 = i26;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                            }
                                            i14 = i27;
                                            i15 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 63:
                                            this = this;
                                            i26 = i22;
                                            i27 = i44;
                                            i28 = i15;
                                            if (i52 == 0) {
                                                iZza2 = zzail.zzc(bArr2, i26, zzaikVar2);
                                                int i87 = zzaikVar2.zza;
                                                zzakd zzakdVarZzd2 = this.zzd(i27);
                                                if (zzakdVarZzd2 != null && !zzakdVarZzd2.zza(i87)) {
                                                    zzamn zzamnVarZzc = zzc(t7);
                                                    Long lValueOf = Long.valueOf(i87);
                                                    i12 = i85 == true ? 1 : 0;
                                                    zzamnVarZzc.zza(i12 == true ? 1 : 0, lValueOf);
                                                } else {
                                                    i12 = i85 == true ? 1 : 0;
                                                    unsafe10.putObject(t8, j, Integer.valueOf(i87));
                                                    unsafe10.putInt(t8, j7, i28);
                                                }
                                                iZza5 = iZza2;
                                                i14 = i27;
                                                i15 = i28;
                                                i24 = i26;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                            } else {
                                                i12 = i85 == true ? 1 : 0;
                                                i14 = i27;
                                                i15 = i28;
                                                i24 = i26;
                                                iZza5 = i24;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                            }
                                            break;
                                        case 66:
                                            this = this;
                                            i26 = i22;
                                            i29 = i44;
                                            i28 = i15;
                                            i30 = i85 == true ? 1 : 0;
                                            if (i52 == 0) {
                                                iZzc2 = zzail.zzc(bArr2, i26, zzaikVar2);
                                                unsafe10.putObject(t8, j, Integer.valueOf(zzajb.zze(zzaikVar2.zza)));
                                                unsafe10.putInt(t8, j7, i28);
                                                iZza5 = iZzc2;
                                                i14 = i29;
                                                i12 = i30;
                                                i15 = i28;
                                                i24 = i26;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                            }
                                            i14 = i29;
                                            i12 = i30;
                                            i15 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 67:
                                            this = this;
                                            i26 = i22;
                                            i29 = i44;
                                            i28 = i15;
                                            i30 = i85 == true ? 1 : 0;
                                            if (i52 == 0) {
                                                iZzc2 = zzail.zzd(bArr2, i26, zzaikVar2);
                                                unsafe10.putObject(t8, j, Long.valueOf(zzajb.zza(zzaikVar2.zzb)));
                                                unsafe10.putInt(t8, j7, i28);
                                                iZza5 = iZzc2;
                                                i14 = i29;
                                                i12 = i30;
                                                i15 = i28;
                                                i24 = i26;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                            }
                                            i14 = i29;
                                            i12 = i30;
                                            i15 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                        case 68:
                                            if (i52 == 3) {
                                                this = this;
                                                Object objZza4 = this.zza(t8, i15, i44);
                                                i26 = i22;
                                                iZza5 = zzail.zza(objZza4, this.zze(i44), bArr, i26, i8, ((i85 == true ? 1 : 0) & (-8)) | 4, zzaikVar);
                                                this.zza(t8, i15, i44, objZza4);
                                                i14 = i44;
                                                i15 = i15;
                                                i12 = i85 == true ? 1 : 0;
                                                i24 = i26;
                                                if (iZza5 == i24) {
                                                    this = this;
                                                    i9 = i9;
                                                    i16 = iZza5;
                                                } else {
                                                    this = this;
                                                    bArr2 = bArr;
                                                    i43 = i8;
                                                    zzaikVar7 = zzaikVar2;
                                                    i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                    i44 = i14;
                                                    i47 = i15;
                                                    i46 = i13;
                                                    i48 = i48;
                                                    unsafe5 = unsafe;
                                                    zzalgVar2 = this;
                                                    i9 = i9;
                                                }
                                                break;
                                            }
                                        default:
                                            this = this;
                                            i24 = i22;
                                            i15 = i15;
                                            i12 = i85 == true ? 1 : 0;
                                            i14 = i44;
                                            iZza5 = i24;
                                            if (iZza5 == i24) {
                                                this = this;
                                                i9 = i9;
                                                i16 = iZza5;
                                            } else {
                                                this = this;
                                                bArr2 = bArr;
                                                i43 = i8;
                                                zzaikVar7 = zzaikVar2;
                                                i45 = i12 == true ? 1 : 0 ? 1 : 0;
                                                i44 = i14;
                                                i47 = i15;
                                                i46 = i13;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                                i9 = i9;
                                            }
                                            break;
                                    }
                                } else if (i52 == 2) {
                                    Unsafe unsafe11 = zzb;
                                    Object objZzf = zzalgVar2.zzf(i44);
                                    zzaikVar3 = zzaikVar8;
                                    t8 = t7;
                                    Object object = unsafe11.getObject(t8, j);
                                    if (zzalgVar2.zzr.zzf(object)) {
                                        Object objZzb = zzalgVar2.zzr.zzb(objZzf);
                                        zzalgVar2.zzr.zza(objZzb, object);
                                        unsafe11.putObject(t8, j, objZzb);
                                        object = objZzb;
                                    }
                                    zzakx<?, ?> zzakxVarZza = zzalgVar2.zzr.zza(objZzf);
                                    Map<?, ?> mapZze = zzalgVar2.zzr.zze(object);
                                    int iZzc18 = zzail.zzc(bArr2, i22, zzaikVar3);
                                    int i88 = zzaikVar3.zza;
                                    if (i88 >= 0 && i88 <= i64 - iZzc18) {
                                        int i89 = iZzc18 + i88;
                                        Object obj3 = zzakxVarZza.zzb;
                                        Object obj4 = zzakxVarZza.zzd;
                                        Object obj5 = obj3;
                                        while (iZzc18 < i89) {
                                            int iZza8 = iZzc18 + 1;
                                            int i90 = bArr2[iZzc18];
                                            if (i90 < 0) {
                                                obj = obj4;
                                                iZza8 = zzail.zza(i90, bArr2, iZza8, zzaikVar3);
                                                i90 = zzaikVar3.zza;
                                            }
                                            obj = obj4;
                                            Object obj6 = obj;
                                            int i91 = i90 >>> 3;
                                            Object obj7 = obj5;
                                            int i92 = i90 & 7;
                                            if (i91 != 1) {
                                                if (i91 == 2) {
                                                    if (i92 == zzakxVarZza.zzc.zza()) {
                                                        iZzc18 = zza(bArr, iZza8, i8, zzakxVarZza.zzc, zzakxVarZza.zzd.getClass(), zzaikVar);
                                                        obj2 = zzaikVar3.zzc;
                                                        i89 = i89;
                                                        obj5 = obj7;
                                                        i85 = i85 == true ? 1 : 0;
                                                    } else {
                                                        i31 = i89;
                                                        i32 = i85;
                                                        unsafe2 = unsafe9;
                                                    }
                                                } else {
                                                    i31 = i89;
                                                    i32 = i85;
                                                    obj7 = obj7;
                                                    unsafe2 = unsafe9;
                                                    iZzc18 = zzail.zza(i90, bArr2, iZza8, i64, zzaikVar3);
                                                    i89 = i31;
                                                    obj5 = obj7;
                                                    obj2 = obj6;
                                                    i85 = i32;
                                                    unsafe9 = unsafe2;
                                                }
                                                obj = obj2;
                                            } else {
                                                i31 = i89;
                                                i32 = i85;
                                                unsafe2 = unsafe9;
                                                if (i92 == zzakxVarZza.zza.zza()) {
                                                    iZzc18 = zza(bArr, iZza8, i8, zzakxVarZza.zza, (Class<?>) null, zzaikVar);
                                                    obj5 = zzaikVar3.zzc;
                                                    i89 = i31;
                                                    obj2 = obj6;
                                                }
                                                i85 = i32;
                                                unsafe9 = unsafe2;
                                                obj = obj2;
                                            }
                                            iZzc18 = zzail.zza(i90, bArr2, iZza8, i64, zzaikVar3);
                                            i89 = i31;
                                            obj5 = obj7;
                                            obj2 = obj6;
                                            i85 = i32;
                                            unsafe9 = unsafe2;
                                            obj = obj2;
                                        }
                                        obj = obj4;
                                        int i93 = i89;
                                        i23 = i85;
                                        unsafe = unsafe9;
                                        Object obj8 = obj5;
                                        if (iZzc18 == i93) {
                                            mapZze.put(obj8, obj);
                                            if (i93 == i22) {
                                                i16 = i93;
                                                zzaikVar2 = zzaikVar3;
                                                i12 = i23;
                                                i14 = i44;
                                            } else {
                                                i9 = i9;
                                                iZza5 = i93;
                                                zzaikVar7 = zzaikVar3;
                                                i43 = i64;
                                                i47 = i15;
                                                i46 = i13;
                                                i45 = i23 == true ? 1 : 0;
                                                i48 = i48;
                                                unsafe5 = unsafe;
                                                zzalgVar2 = this;
                                            }
                                        } else {
                                            throw zzakf.zzg();
                                        }
                                    } else {
                                        throw zzakf.zzj();
                                    }
                                } else {
                                    i23 = i85 == true ? 1 : 0;
                                    zzaikVar3 = zzaikVar8;
                                    unsafe = unsafe9;
                                    t8 = t7;
                                    i16 = i22;
                                    zzaikVar2 = zzaikVar3;
                                    i12 = i23;
                                    i14 = i44;
                                }
                            }
                        } else if (i52 == 2) {
                            zzakc zzakcVarZza2 = (zzakc) unsafe6.getObject(t8, j);
                            if (!zzakcVarZza2.zzc()) {
                                int size = zzakcVarZza2.size();
                                zzakcVarZza2 = zzakcVarZza2.zza(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t8, j, zzakcVarZza2);
                            }
                            iZza5 = zzail.zzb(zzalgVar2.zze(i53), i63 == true ? 1 : 0, bArr, i56, i8, zzakcVarZza2, zzaikVar);
                            zzaikVar7 = zzaikVar8;
                            i44 = i53;
                            i43 = i64;
                            unsafe5 = unsafe6;
                            i47 = i15;
                            i45 = i63 == true ? 1 : 0;
                            i46 = i13;
                            i48 = i48;
                            i9 = i9;
                        } else {
                            unsafe = unsafe6;
                            i22 = i56;
                            i44 = i53;
                            zzaikVar3 = zzaikVar8;
                            i23 = i63 == true ? 1 : 0;
                            i16 = i22;
                            zzaikVar2 = zzaikVar3;
                            i12 = i23;
                            i14 = i44;
                        }
                    }
                } else {
                    unsafe = unsafe5;
                    i9 = i9;
                    this = zzalgVar2;
                    i13 = i46;
                    i48 = i48;
                    i14 = 0;
                    zzaikVar2 = zzaikVar7;
                    i15 = i51;
                    i16 = i49;
                }
                if (i12 == i9 && i9 != 0) {
                    iZza5 = i16;
                    i10 = i9;
                    i45 = i12;
                    i46 = i13;
                    i48 = i48;
                    i11 = 1048575;
                    zzalgVar = this;
                } else if (this.zzh && zzaikVar2.zzd != zzajk.zza) {
                    iZza5 = zzail.zza(i12 == true ? 1 : 0, bArr, i16, i8, t7, this.zzg, this.zzp, zzaikVar);
                    bArr2 = bArr;
                    zzaikVar7 = zzaikVar2;
                    i45 = i12 == true ? 1 : 0;
                    i44 = i14;
                    i47 = i15;
                    i46 = i13;
                    i48 = i48;
                    unsafe5 = unsafe;
                    zzalgVar2 = this;
                    i9 = i9;
                    i43 = i8;
                } else {
                    int i94 = i12;
                    int i95 = i9;
                    zzalg<T> zzalgVar3 = this;
                    iZza5 = zzail.zza(i94 == true ? 1 : 0, bArr, i16, i8, zzc(t7), zzaikVar);
                    bArr2 = bArr;
                    i43 = i8;
                    zzaikVar7 = zzaikVar2;
                    i9 = i95;
                    zzalgVar2 = zzalgVar3;
                    i45 = i94 == true ? 1 : 0;
                    i44 = i14;
                    i47 = i15;
                    i46 = i13;
                    i48 = i48;
                    unsafe5 = unsafe;
                }
            } else {
                unsafe = unsafe5;
                i10 = i9;
                zzalgVar = zzalgVar2;
                i11 = 1048575;
            }
        }
        if (i48 != i11) {
            unsafe.putInt(t8, i48, i46);
        }
        zzamn zzamnVar = null;
        for (int i96 = zzalgVar.zzl; i96 < zzalgVar.zzm; i96++) {
            zzamnVar = (zzamn) zza(t7, zzalgVar.zzk[i96], zzamnVar, (zzamo<UT, zzamn>) zzalgVar.zzp, t7);
        }
        if (zzamnVar != null) {
            zzalgVar.zzp.zzb(t8, zzamnVar);
        }
        if (i10 == 0) {
            if (iZza5 != i8) {
                throw zzakf.zzg();
            }
        } else if (iZza5 > i8 || i45 != i10) {
            throw zzakf.zzg();
        }
        return iZza5;
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

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:168:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x038c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0399  */
    public static <T> zzalg<T> zza(Class<T> cls, zzala zzalaVar, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        zzalt zzaltVar;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        Field fieldZza;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZza2;
        int i33;
        Object obj2;
        Field fieldZza3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (zzalaVar instanceof zzalt) {
            zzalt zzaltVar2 = (zzalt) zzalaVar;
            String strZzd = zzaltVar2.zzd();
            int length = strZzd.length();
            char c3 = 55296;
            if (strZzd.charAt(0) >= 55296) {
                int i38 = 1;
                while (true) {
                    i7 = i38 + 1;
                    if (strZzd.charAt(i38) < 55296) {
                        break;
                    }
                    i38 = i7;
                }
            } else {
                i7 = 1;
            }
            int i39 = i7 + 1;
            int iCharAt3 = strZzd.charAt(i7);
            if (iCharAt3 >= 55296) {
                int i40 = iCharAt3 & 8191;
                int i41 = 13;
                while (true) {
                    i37 = i39 + 1;
                    cCharAt13 = strZzd.charAt(i39);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt13 & 8191) << i41;
                    i41 += 13;
                    i39 = i37;
                }
                iCharAt3 = i40 | (cCharAt13 << i41);
                i39 = i37;
            }
            if (iCharAt3 == 0) {
                i12 = 0;
                iCharAt = 0;
                iCharAt2 = 0;
                i11 = 0;
                i10 = 0;
                i9 = 0;
                iArr = zza;
                i8 = 0;
            } else {
                int i42 = i39 + 1;
                int iCharAt4 = strZzd.charAt(i39);
                if (iCharAt4 >= 55296) {
                    int i43 = iCharAt4 & 8191;
                    int i44 = 13;
                    while (true) {
                        i20 = i42 + 1;
                        cCharAt8 = strZzd.charAt(i42);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i43 |= (cCharAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i20;
                    }
                    iCharAt4 = i43 | (cCharAt8 << i44);
                    i42 = i20;
                }
                int i45 = i42 + 1;
                int iCharAt5 = strZzd.charAt(i42);
                if (iCharAt5 >= 55296) {
                    int i46 = iCharAt5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i19 = i45 + 1;
                        cCharAt7 = strZzd.charAt(i45);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i46 |= (cCharAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i19;
                    }
                    iCharAt5 = i46 | (cCharAt7 << i47);
                    i45 = i19;
                }
                int i48 = i45 + 1;
                int iCharAt6 = strZzd.charAt(i45);
                if (iCharAt6 >= 55296) {
                    int i49 = iCharAt6 & 8191;
                    int i50 = 13;
                    while (true) {
                        i18 = i48 + 1;
                        cCharAt6 = strZzd.charAt(i48);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i49 |= (cCharAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i18;
                    }
                    iCharAt6 = i49 | (cCharAt6 << i50);
                    i48 = i18;
                }
                int i51 = i48 + 1;
                int iCharAt7 = strZzd.charAt(i48);
                if (iCharAt7 >= 55296) {
                    int i52 = iCharAt7 & 8191;
                    int i53 = 13;
                    while (true) {
                        i17 = i51 + 1;
                        cCharAt5 = strZzd.charAt(i51);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i52 |= (cCharAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i17;
                    }
                    iCharAt7 = i52 | (cCharAt5 << i53);
                    i51 = i17;
                }
                int i54 = i51 + 1;
                iCharAt = strZzd.charAt(i51);
                if (iCharAt >= 55296) {
                    int i55 = iCharAt & 8191;
                    int i56 = 13;
                    while (true) {
                        i16 = i54 + 1;
                        cCharAt4 = strZzd.charAt(i54);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i55 |= (cCharAt4 & 8191) << i56;
                        i56 += 13;
                        i54 = i16;
                    }
                    iCharAt = i55 | (cCharAt4 << i56);
                    i54 = i16;
                }
                int i57 = i54 + 1;
                iCharAt2 = strZzd.charAt(i54);
                if (iCharAt2 >= 55296) {
                    int i58 = iCharAt2 & 8191;
                    int i59 = 13;
                    while (true) {
                        i15 = i57 + 1;
                        cCharAt3 = strZzd.charAt(i57);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i58 |= (cCharAt3 & 8191) << i59;
                        i59 += 13;
                        i57 = i15;
                    }
                    iCharAt2 = i58 | (cCharAt3 << i59);
                    i57 = i15;
                }
                int i60 = i57 + 1;
                int iCharAt8 = strZzd.charAt(i57);
                if (iCharAt8 >= 55296) {
                    int i61 = iCharAt8 & 8191;
                    int i62 = 13;
                    while (true) {
                        i14 = i60 + 1;
                        cCharAt2 = strZzd.charAt(i60);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i61 |= (cCharAt2 & 8191) << i62;
                        i62 += 13;
                        i60 = i14;
                    }
                    iCharAt8 = i61 | (cCharAt2 << i62);
                    i60 = i14;
                }
                int i63 = i60 + 1;
                int iCharAt9 = strZzd.charAt(i60);
                if (iCharAt9 >= 55296) {
                    int i64 = iCharAt9 & 8191;
                    int i65 = 13;
                    while (true) {
                        i13 = i63 + 1;
                        cCharAt = strZzd.charAt(i63);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i64 |= (cCharAt & 8191) << i65;
                        i65 += 13;
                        i63 = i13;
                    }
                    iCharAt9 = i64 | (cCharAt << i65);
                    i63 = i13;
                }
                int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
                int i66 = (iCharAt4 << 1) + iCharAt5;
                i8 = iCharAt4;
                i9 = iCharAt9;
                i39 = i63;
                i10 = iCharAt7;
                i11 = iCharAt6;
                i12 = i66;
                iArr = iArr2;
            }
            Unsafe unsafe = zzb;
            Object[] objArrZze = zzaltVar2.zze();
            Class<?> cls2 = zzaltVar2.zza().getClass();
            int[] iArr3 = new int[iCharAt * 3];
            Object[] objArr = new Object[iCharAt << 1];
            int i67 = i9 + iCharAt2;
            int i68 = i9;
            int i69 = i67;
            int i70 = 0;
            int i71 = 0;
            while (i39 < length) {
                int i72 = i39 + 1;
                int iCharAt10 = strZzd.charAt(i39);
                if (iCharAt10 >= c3) {
                    int i73 = iCharAt10 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i36 = i74 + 1;
                        cCharAt12 = strZzd.charAt(i74);
                        if (cCharAt12 < c3) {
                            break;
                        }
                        i73 |= (cCharAt12 & 8191) << i75;
                        i75 += 13;
                        i74 = i36;
                    }
                    iCharAt10 = i73 | (cCharAt12 << i75);
                    i21 = i36;
                } else {
                    i21 = i72;
                }
                int i76 = i21 + 1;
                int iCharAt11 = strZzd.charAt(i21);
                if (iCharAt11 >= c3) {
                    int i77 = iCharAt11 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i35 = i78 + 1;
                        cCharAt11 = strZzd.charAt(i78);
                        i22 = length;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i77 |= (cCharAt11 & 8191) << i79;
                        i79 += 13;
                        i78 = i35;
                        length = i22;
                    }
                    iCharAt11 = i77 | (cCharAt11 << i79);
                    i23 = i35;
                } else {
                    i22 = length;
                    i23 = i76;
                }
                int i80 = iCharAt11 & 255;
                int i81 = i10;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i71] = i70;
                    i71++;
                }
                int i82 = i11;
                if (i80 >= 51) {
                    int i83 = i23 + 1;
                    int iCharAt12 = strZzd.charAt(i23);
                    char c4 = 55296;
                    if (iCharAt12 >= 55296) {
                        int i84 = iCharAt12 & 8191;
                        int i85 = 13;
                        while (true) {
                            i34 = i83 + 1;
                            cCharAt10 = strZzd.charAt(i83);
                            if (cCharAt10 < c4) {
                                break;
                            }
                            i84 |= (cCharAt10 & 8191) << i85;
                            i85 += 13;
                            i83 = i34;
                            c4 = 55296;
                        }
                        iCharAt12 = i84 | (cCharAt10 << i85);
                        i83 = i34;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 != 9 && i86 != 17) {
                        if (i86 != 12 || (!zzaltVar2.zzb().equals(zzalo.PROTO2) && (iCharAt11 & 2048) == 0)) {
                            i30 = 1;
                        } else {
                            i30 = 1;
                            i31 = i12 + 1;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i12];
                        }
                        i32 = iCharAt12 << i30;
                        obj = objArrZze[i32];
                        if (obj instanceof Field) {
                            fieldZza2 = (Field) obj;
                        } else {
                            fieldZza2 = zza(cls2, (String) obj);
                            objArrZze[i32] = fieldZza2;
                        }
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                        i33 = i32 + 1;
                        obj2 = objArrZze[i33];
                        int i88 = i12;
                        if (obj2 instanceof Field) {
                            fieldZza3 = (Field) obj2;
                        } else {
                            fieldZza3 = zza(cls2, (String) obj2);
                            objArrZze[i33] = fieldZza3;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                        strZzd = strZzd;
                        iObjectFieldOffset = iObjectFieldOffset3;
                        i25 = i88;
                        i27 = 0;
                        zzaltVar = zzaltVar2;
                        i24 = iCharAt10;
                        i26 = i87;
                    } else {
                        i30 = 1;
                        i31 = i12 + 1;
                        objArr[((i70 / 3) << 1) + 1] = objArrZze[i12];
                    }
                    i12 = i31;
                    i32 = iCharAt12 << i30;
                    obj = objArrZze[i32];
                    if (obj instanceof Field) {
                        fieldZza2 = (Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (String) obj);
                        objArrZze[i32] = fieldZza2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZza2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    int i89 = i12;
                    if (obj2 instanceof Field) {
                        fieldZza3 = (Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (String) obj2);
                        objArrZze[i33] = fieldZza3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    strZzd = strZzd;
                    iObjectFieldOffset = iObjectFieldOffset4;
                    i25 = i89;
                    i27 = 0;
                    zzaltVar = zzaltVar2;
                    i24 = iCharAt10;
                    i26 = i87;
                } else {
                    int i90 = i12 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZze[i12]);
                    i24 = iCharAt10;
                    if (i80 == 9 || i80 == 17) {
                        zzaltVar = zzaltVar2;
                        objArr[((i70 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            zzaltVar = zzaltVar2;
                            i29 = i12 + 2;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            zzaltVar = zzaltVar2;
                            if (zzaltVar2.zzb() == zzalo.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i29 = i12 + 2;
                                objArr[((i70 / 3) << 1) + 1] = objArrZze[i90];
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                            if ((iCharAt11 & 4096) != 0 || i80 > 17) {
                                iObjectFieldOffset2 = 1048575;
                                i26 = i23;
                                i27 = 0;
                            } else {
                                i26 = i23 + 1;
                                int iCharAt13 = strZzd.charAt(i23);
                                if (iCharAt13 >= 55296) {
                                    int i91 = iCharAt13 & 8191;
                                    int i92 = 13;
                                    while (true) {
                                        i28 = i26 + 1;
                                        cCharAt9 = strZzd.charAt(i26);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i91 |= (cCharAt9 & 8191) << i92;
                                        i92 += 13;
                                        i26 = i28;
                                    }
                                    iCharAt13 = i91 | (cCharAt9 << i92);
                                    i26 = i28;
                                }
                                int i93 = (iCharAt13 / 32) + (i8 << 1);
                                Object obj3 = objArrZze[i93];
                                if (obj3 instanceof Field) {
                                    fieldZza = (Field) obj3;
                                } else {
                                    fieldZza = zza(cls2, (String) obj3);
                                    objArrZze[i93] = fieldZza;
                                }
                                i27 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                            }
                            if (i80 >= 18 && i80 <= 49) {
                                iArr[i69] = iObjectFieldOffset;
                                i69++;
                            }
                        } else if (i80 == 50) {
                            int i94 = i68 + 1;
                            iArr[i68] = i70;
                            int i95 = (i70 / 3) << 1;
                            int i96 = i12 + 2;
                            objArr[i95] = objArrZze[i90];
                            if ((iCharAt11 & 2048) != 0) {
                                i90 = i12 + 3;
                                objArr[i95 + 1] = objArrZze[i96];
                                zzaltVar = zzaltVar2;
                                i68 = i94;
                            } else {
                                i68 = i94;
                                zzaltVar = zzaltVar2;
                                i25 = i96;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                            if ((iCharAt11 & 4096) != 0) {
                                iObjectFieldOffset2 = 1048575;
                                i26 = i23;
                                i27 = 0;
                            } else {
                                iObjectFieldOffset2 = 1048575;
                                i26 = i23;
                                i27 = 0;
                            }
                            if (i80 >= 18) {
                                iArr[i69] = iObjectFieldOffset;
                                i69++;
                            }
                        } else {
                            zzaltVar = zzaltVar2;
                        }
                        i25 = i29;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        }
                        if (i80 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    }
                    i25 = i90;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i23;
                        i27 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i23;
                        i27 = 0;
                    }
                    if (i80 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                }
                int i97 = i70 + 1;
                iArr3[i70] = i24;
                int i98 = i70 + 2;
                Class<?> cls3 = cls2;
                int i99 = i26;
                iArr3[i97] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | iObjectFieldOffset;
                i70 += 3;
                iArr3[i98] = (i27 << 20) | iObjectFieldOffset2;
                strZzd = strZzd;
                i10 = i81;
                i12 = i25;
                zzaltVar2 = zzaltVar;
                length = i22;
                i11 = i82;
                cls2 = cls3;
                i39 = i99;
                c3 = 55296;
            }
            return new zzalg<>(iArr3, objArr, i11, i10, zzaltVar2.zza(), false, iArr, i9, i67, zzalkVar, zzakmVar, zzamoVar, zzajmVar, zzakzVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i7, UB ub, zzamo<UT, UB> zzamoVar, Object obj2) {
        zzakd zzakdVarZzd;
        int i8 = this.zzc[i7];
        Object objZze = zzamp.zze(obj, zzc(i7) & 1048575);
        return (objZze == null || (zzakdVarZzd = zzd(i7)) == null) ? ub : (UB) zza(i7, i8, this.zzr.zze(objZze), zzakdVarZzd, ub, zzamoVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i7, int i8, Map<K, V> map, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar, Object obj) {
        zzakx<?, ?> zzakxVarZza = this.zzr.zza(zzf(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakdVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamoVar.zzc(obj);
                }
                zzaiu zzaiuVarZzc = zzaip.zzc(zzaku.zza(zzakxVarZza, next.getKey(), next.getValue()));
                try {
                    zzaku.zza(zzaiuVarZzc.zzb(), zzakxVarZza, next.getKey(), next.getValue());
                    zzamoVar.zza(ub, i8, zzaiuVarZzc.zza());
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
        zzalv zzalvVarZze = zze(i7);
        long jZzc = zzc(i7) & 1048575;
        if (!zzc((Object) t7, i7)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t7, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7, int i8) {
        zzalv zzalvVarZze = zze(i8);
        if (!zzc(t7, i7, i8)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t7, zzc(i8) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
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
            String string = Arrays.toString(declaredFields);
            StringBuilder sbL = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            sbL.append(string);
            throw new RuntimeException(sbL.toString());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, T t8) {
        zzf(t7);
        t8.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzc = zzc(i7);
            long j = 1048575 & iZzc;
            int i8 = this.zzc[i7];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zza(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 1:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzb(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 2:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 3:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 4:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 5:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 6:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 7:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zzc(t7, j, zzamp.zzh(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 8:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 9:
                    zza(t7, t8, i7);
                    break;
                case 10:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 11:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 12:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 13:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 14:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 15:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzc(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 16:
                    if (zzc((Object) t8, i7)) {
                        zzamp.zza((Object) t7, j, zzamp.zzd(t8, j));
                        zzb((Object) t7, i7);
                    }
                    break;
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
                    if (zzc(t8, i8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb(t7, i8, i7);
                    }
                    break;
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
                    if (zzc(t8, i8, i7)) {
                        zzamp.zza(t7, j, zzamp.zze(t8, j));
                        zzb(t7, i8, i7);
                    }
                    break;
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

    /* JADX WARN: Code duplicated, block: B:168:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:49:0x00c5, B:54:0x00d3, B:166:0x062b, B:168:0x0630, B:169:0x0635, B:65:0x00ff, B:67:0x0114, B:68:0x0125, B:69:0x0136, B:70:0x0147, B:71:0x0158, B:73:0x0162, B:76:0x0169, B:77:0x016e, B:78:0x017b, B:79:0x018c, B:80:0x019a, B:81:0x01ac, B:82:0x01b4, B:83:0x01c6, B:84:0x01d8, B:85:0x01ea, B:86:0x01fc, B:87:0x020e, B:88:0x0220, B:89:0x0232, B:90:0x0244, B:92:0x0254, B:96:0x0275, B:93:0x025e, B:95:0x0266, B:97:0x0286, B:98:0x0298, B:99:0x02a6, B:100:0x02b4, B:101:0x02c2), top: B:188:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0641 A[LOOP:1: B:172:0x063d->B:174:0x0641, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0655  */
    /* JADX WARN: Code duplicated, block: B:183:0x0665 A[LOOP:2: B:181:0x0661->B:183:0x0665, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0679  */
    /* JADX WARN: Code duplicated, block: B:208:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, zzals zzalsVar, zzajk zzajkVar) throws Throwable {
        zzamo zzamoVar;
        T t8;
        int i7;
        zzamo zzamoVar2;
        T t9;
        zzajm<?> zzajmVar;
        zzajk zzajkVar2;
        Object obj;
        Object obj2;
        int i8;
        T t10 = t7;
        zzajk zzajkVar3 = zzajkVar;
        zzajkVar.getClass();
        zzf(t7);
        zzamo zzamoVar3 = this.zzp;
        zzajm<?> zzajmVar2 = this.zzq;
        Object objZza = null;
        Object obj3 = null;
        while (true) {
            try {
                int iZzc = zzalsVar.zzc();
                int iZza = zza(iZzc);
                if (iZza < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i9 = this.zzl; i9 < this.zzm; i9++) {
                            objZza = zza(t7, this.zzk[i9], objZza, (zzamo<UT, Object>) zzamoVar3, t7);
                        }
                        if (objZza != null) {
                            zzamoVar3.zzb(t10, objZza);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZza2 = !this.zzh ? null : zzajmVar2.zza(zzajkVar3, this.zzg, iZzc);
                        if (objZza2 != null) {
                            Object objZzb = obj3 == null ? zzajmVar2.zzb(t10) : obj3;
                            zzamoVar2 = zzamoVar3;
                            t9 = t10;
                            try {
                                objZza = zzajmVar2.zza(t7, zzalsVar, objZza2, zzajkVar, objZzb, objZza, zzamoVar2);
                                obj3 = objZzb;
                            } catch (Throwable th) {
                                th = th;
                                t8 = t9;
                                zzamoVar = zzamoVar2;
                                while (i7 < this.zzm) {
                                    objZza = zza(t7, this.zzk[i7], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                }
                                if (objZza != null) {
                                    zzamoVar.zzb(t8, objZza);
                                }
                                throw th;
                            }
                        } else {
                            zzamoVar2 = zzamoVar3;
                            t9 = t10;
                            zzamoVar2.zza(zzalsVar);
                            if (objZza == null) {
                                objZza = zzamoVar2.zzc(t9);
                            }
                            if (!zzamoVar2.zza(objZza, zzalsVar, 0)) {
                                int i10 = this.zzl;
                                while (i10 < this.zzm) {
                                    zzamo zzamoVar4 = zzamoVar2;
                                    objZza = zza(t7, this.zzk[i10], objZza, (zzamo<UT, Object>) zzamoVar4, t7);
                                    i10++;
                                    t9 = t9;
                                    zzamoVar2 = zzamoVar4;
                                }
                                T t11 = t9;
                                zzamo zzamoVar5 = zzamoVar2;
                                if (objZza != null) {
                                    zzamoVar5.zzb(t11, objZza);
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
                        int iZzc2 = zzc(iZza);
                        switch ((267386880 & iZzc2) >>> 20) {
                            case 0:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t8, iZzc2 & 1048575, zzalsVar.zza());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 1:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzb());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 2:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzl());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 3:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzo());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 4:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzg());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 5:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzk());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 6:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzf());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 7:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zzc(t8, iZzc2 & 1048575, zzalsVar.zzs());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 8:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zza((Object) t8, iZzc2, zzalsVar);
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 9:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar = (zzalc) zza((Object) t8, iZza);
                                zzalsVar.zzb(zzalcVar, (zzalv<zzalc>) zze(iZza), zzajkVar2);
                                zza(t8, iZza, zzalcVar);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 10:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t8, iZzc2 & 1048575, zzalsVar.zzp());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 11:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzj());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 12:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                int iZze = zzalsVar.zze();
                                zzakd zzakdVarZzd = zzd(iZza);
                                if (zzakdVarZzd != null && !zzakdVarZzd.zza(iZze)) {
                                    objZza = zzalx.zza(t8, iZzc, iZze, obj2, zzamoVar);
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t10 = t8;
                                }
                                zzamp.zza((Object) t8, iZzc2 & 1048575, iZze);
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 13:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzh());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 14:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzm());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 15:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzi());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 16:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t8, iZzc2 & 1048575, zzalsVar.zzn());
                                zzb((Object) t8, iZza);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 17:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar2 = (zzalc) zza((Object) t8, iZza);
                                zzalsVar.zza(zzalcVar2, (zzalv<zzalc>) zze(iZza), zzajkVar2);
                                zza(t8, iZza, zzalcVar2);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 18:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 19:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 20:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 22:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 23:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 24:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 25:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 26:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                if (zzg(iZzc2)) {
                                    zzalsVar.zzo(this.zzo.zza(t8, iZzc2 & 1048575));
                                } else {
                                    zzalsVar.zzn(this.zzo.zza(t8, iZzc2 & 1048575));
                                }
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 27:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb((List) this.zzo.zza(t8, iZzc2 & 1048575), (zzalv) zze(iZza), zzajkVar2);
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 28:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 29:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 30:
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                List<Integer> listZza = this.zzo.zza(t8, iZzc2 & 1048575);
                                zzalsVar.zzd(listZza);
                                objZza = zzalx.zza(t7, iZzc, listZza, zzd(iZza), objZza, zzamoVar);
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                break;
                            case 31:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzj(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 32:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzk(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 33:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzl(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 34:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzm(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 35:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 36:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 37:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 38:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 39:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 40:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 41:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 42:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 43:
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t8, iZzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 44:
                                List<Integer> listZza2 = this.zzo.zza(t8, iZzc2 & 1048575);
                                zzalsVar.zzd(listZza2);
                                obj = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                try {
                                    objZza = zzalx.zza(t7, iZzc, listZza2, zzd(iZza), obj, zzamoVar);
                                } catch (zzake unused) {
                                    objZza = obj;
                                    zzamoVar.zza(zzalsVar);
                                    if (objZza == null) {
                                        objZza = zzamoVar.zzc(t8);
                                    }
                                    if (!zzamoVar.zza(objZza, zzalsVar, 0)) {
                                        for (i8 = this.zzl; i8 < this.zzm; i8++) {
                                            objZza = zza(t7, this.zzk[i8], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                        }
                                        if (objZza != null) {
                                            zzamoVar.zzb(t8, objZza);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    objZza = obj;
                                    for (i7 = this.zzl; i7 < this.zzm; i7++) {
                                        objZza = zza(t7, this.zzk[i7], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                    }
                                    if (objZza != null) {
                                        zzamoVar.zzb(t8, objZza);
                                    }
                                    throw th;
                                }
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                break;
                            case 45:
                                zzalsVar.zzj(this.zzo.zza(t8, iZzc2 & 1048575));
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 46:
                                zzalsVar.zzk(this.zzo.zza(t8, iZzc2 & 1048575));
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 47:
                                zzalsVar.zzl(this.zzo.zza(t8, iZzc2 & 1048575));
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 48:
                                zzalsVar.zzm(this.zzo.zza(t8, iZzc2 & 1048575));
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 49:
                                zzalsVar.zza((List) this.zzo.zza(t8, iZzc2 & 1048575), (zzalv) zze(iZza), zzajkVar3);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 50:
                                Object objZzf = zzf(iZza);
                                long jZzc = zzc(iZza) & 1048575;
                                Object objZze = zzamp.zze(t8, jZzc);
                                if (objZze == null) {
                                    objZze = this.zzr.zzb(objZzf);
                                    zzamp.zza(t8, jZzc, objZze);
                                } else if (this.zzr.zzf(objZze)) {
                                    Object objZzb2 = this.zzr.zzb(objZzf);
                                    this.zzr.zza(objZzb2, objZze);
                                    zzamp.zza(t8, jZzc, objZzb2);
                                    objZze = objZzb2;
                                }
                                zzalsVar.zza(this.zzr.zze(objZze), this.zzr.zza(objZzf), zzajkVar3);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 51:
                                zzamp.zza(t8, iZzc2 & 1048575, Double.valueOf(zzalsVar.zza()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 52:
                                zzamp.zza(t8, iZzc2 & 1048575, Float.valueOf(zzalsVar.zzb()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 53:
                                zzamp.zza(t8, iZzc2 & 1048575, Long.valueOf(zzalsVar.zzl()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 54:
                                zzamp.zza(t8, iZzc2 & 1048575, Long.valueOf(zzalsVar.zzo()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 55:
                                zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(zzalsVar.zzg()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 56:
                                zzamp.zza(t8, iZzc2 & 1048575, Long.valueOf(zzalsVar.zzk()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 57:
                                zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(zzalsVar.zzf()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 58:
                                zzamp.zza(t8, iZzc2 & 1048575, Boolean.valueOf(zzalsVar.zzs()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 59:
                                zza((Object) t8, iZzc2, zzalsVar);
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 60:
                                zzalc zzalcVar3 = (zzalc) zza(t8, iZzc, iZza);
                                zzalsVar.zzb(zzalcVar3, (zzalv<zzalc>) zze(iZza), zzajkVar3);
                                zza(t8, iZzc, iZza, zzalcVar3);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 61:
                                zzamp.zza(t8, iZzc2 & 1048575, zzalsVar.zzp());
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 62:
                                zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(zzalsVar.zzj()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 63:
                                int iZze2 = zzalsVar.zze();
                                zzakd zzakdVarZzd2 = zzd(iZza);
                                if (zzakdVarZzd2 != null && !zzakdVarZzd2.zza(iZze2)) {
                                    objZza = zzalx.zza(t8, iZzc, iZze2, objZza, zzamoVar);
                                } else {
                                    zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(iZze2));
                                    zzb(t8, iZzc, iZza);
                                    obj2 = objZza;
                                    zzajmVar = zzajmVar2;
                                    zzajkVar2 = zzajkVar3;
                                    zzajmVar2 = zzajmVar;
                                    objZza = obj2;
                                    zzajkVar3 = zzajkVar2;
                                }
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 64:
                                zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(zzalsVar.zzh()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 65:
                                zzamp.zza(t8, iZzc2 & 1048575, Long.valueOf(zzalsVar.zzm()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 66:
                                zzamp.zza(t8, iZzc2 & 1048575, Integer.valueOf(zzalsVar.zzi()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 67:
                                zzamp.zza(t8, iZzc2 & 1048575, Long.valueOf(zzalsVar.zzn()));
                                zzb(t8, iZzc, iZza);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 68:
                                zzalc zzalcVar4 = (zzalc) zza(t8, iZzc, iZza);
                                zzalsVar.zza(zzalcVar4, (zzalv<zzalc>) zze(iZza), zzajkVar3);
                                zza(t8, iZzc, iZza, zzalcVar4);
                                obj2 = objZza;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                objZza = obj2;
                                zzajkVar3 = zzajkVar2;
                                t10 = t8;
                                zzamoVar3 = zzamoVar;
                                break;
                            default:
                                if (objZza == null) {
                                    try {
                                        try {
                                            objZza = zzamoVar.zzc(t8);
                                        } catch (zzake unused2) {
                                            obj = objZza;
                                            zzajmVar = zzajmVar2;
                                            zzajkVar2 = zzajkVar3;
                                            objZza = obj;
                                            zzamoVar.zza(zzalsVar);
                                            if (objZza == null) {
                                                objZza = zzamoVar.zzc(t8);
                                            }
                                            if (!zzamoVar.zza(objZza, zzalsVar, 0)) {
                                                while (i8 < this.zzm) {
                                                    objZza = zza(t7, this.zzk[i8], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                                }
                                                if (objZza != null) {
                                                    zzamoVar.zzb(t8, objZza);
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
                                            objZza = zza(t7, this.zzk[i7], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                        }
                                        if (objZza != null) {
                                            zzamoVar.zzb(t8, objZza);
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    if (!zzamoVar.zza(objZza, zzalsVar, 0)) {
                                        for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                            objZza = zza(t7, this.zzk[i11], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                        }
                                        if (objZza != null) {
                                            zzamoVar.zzb(t8, objZza);
                                            return;
                                        }
                                        return;
                                    }
                                    t10 = t8;
                                    zzamoVar3 = zzamoVar;
                                } catch (zzake unused3) {
                                    zzajmVar = zzajmVar2;
                                    zzajkVar2 = zzajkVar3;
                                    zzamoVar.zza(zzalsVar);
                                    if (objZza == null) {
                                        objZza = zzamoVar.zzc(t8);
                                    }
                                    if (!zzamoVar.zza(objZza, zzalsVar, 0)) {
                                        while (i8 < this.zzm) {
                                            objZza = zza(t7, this.zzk[i8], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                                        }
                                        if (objZza != null) {
                                            zzamoVar.zzb(t8, objZza);
                                            return;
                                        }
                                        return;
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
                        while (i7 < this.zzm) {
                            objZza = zza(t7, this.zzk[i7], objZza, (zzamo<UT, Object>) zzamoVar, t7);
                        }
                        if (objZza != null) {
                            zzamoVar.zzb(t8, objZza);
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
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaik zzaikVar) throws zzakf {
        zza(t7, bArr, i7, i8, 0, zzaikVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t7, T t8, int i7) {
        if (zzc((Object) t8, i7)) {
            long jZzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, jZzc);
            if (object != null) {
                zzalv zzalvVarZze = zze(i7);
                if (!zzc((Object) t7, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, jZzc, object);
                    } else {
                        Object objZza = zzalvVarZze.zza();
                        zzalvVarZze.zza(objZza, object);
                        unsafe.putObject(t7, jZzc, objZza);
                    }
                    zzb((Object) t7, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t7, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalvVarZze.zza(object2, object);
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
        zzb((Object) t7, i7);
    }

    private final void zza(T t7, int i7, int i8, Object obj) {
        zzb.putObject(t7, zzc(i8) & 1048575, obj);
        zzb(t7, i7, i8);
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
    /* JADX WARN: Code duplicated, block: B:176:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t7, zzanf zzanfVar) {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        Unsafe unsafe;
        boolean z7;
        Iterator itZzc;
        Map.Entry<?, ?> entry2;
        zzanf zzanfVar2 = zzanfVar;
        int i11 = 267386880;
        int i12 = 1048575;
        if (zzanfVar.zza() == 2) {
            zza(this.zzp, t7, zzanfVar2);
            if (this.zzh) {
                zzajr<T> zzajrVarZza = this.zzq.zza(t7);
                if (zzajrVarZza.zza.isEmpty()) {
                    itZzc = null;
                    entry2 = null;
                } else {
                    itZzc = zzajrVarZza.zzc();
                    entry2 = (Map.Entry) itZzc.next();
                }
            } else {
                itZzc = null;
                entry2 = null;
            }
            for (int length = this.zzc.length - 3; length >= 0; length -= 3) {
                int iZzc = zzc(length);
                int i13 = this.zzc[length];
                while (entry2 != null && this.zzq.zza(entry2) > i13) {
                    this.zzq.zza(zzanfVar2, entry2);
                    entry2 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
                }
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zza(t7, iZzc & 1048575));
                        }
                        break;
                    case 1:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zzb(t7, iZzc & 1048575));
                        }
                        break;
                    case 2:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzb(i13, zzamp.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 3:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zze(i13, zzamp.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 4:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzc(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 5:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 6:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzb(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 7:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zzh(t7, iZzc & 1048575));
                        }
                        break;
                    case 8:
                        if (zzc((Object) t7, length)) {
                            zza(i13, zzamp.zze(t7, iZzc & 1048575), zzanfVar2);
                        }
                        break;
                    case 9:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzb(i13, zzamp.zze(t7, iZzc & 1048575), zze(length));
                        }
                        break;
                    case 10:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, (zzaip) zzamp.zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 11:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzf(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 12:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 13:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzd(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 14:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzc(i13, zzamp.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 15:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zze(i13, zzamp.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 16:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zzd(i13, zzamp.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 17:
                        if (zzc((Object) t7, length)) {
                            zzanfVar2.zza(i13, zzamp.zze(t7, iZzc & 1048575), zze(length));
                        }
                        break;
                    case 18:
                        zzalx.zzb(this.zzc[length], (List<Double>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 19:
                        zzalx.zzf(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 20:
                        zzalx.zzh(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case zzbbd.zzt.zzm /* 21 */:
                        zzalx.zzn(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 22:
                        zzalx.zzg(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 23:
                        zzalx.zze(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 24:
                        zzalx.zzd(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 25:
                        zzalx.zza(this.zzc[length], (List<Boolean>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 26:
                        zzalx.zzb(this.zzc[length], (List<String>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2);
                        break;
                    case 27:
                        zzalx.zzb(this.zzc[length], (List<?>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, (zzalv<?>) zze(length));
                        break;
                    case 28:
                        zzalx.zza(this.zzc[length], (List<zzaip>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2);
                        break;
                    case 29:
                        zzalx.zzm(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 30:
                        zzalx.zzc(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 31:
                        zzalx.zzi(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 32:
                        zzalx.zzj(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 33:
                        zzalx.zzk(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 34:
                        zzalx.zzl(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, false);
                        break;
                    case 35:
                        zzalx.zzb(this.zzc[length], (List<Double>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 36:
                        zzalx.zzf(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 37:
                        zzalx.zzh(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 38:
                        zzalx.zzn(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 39:
                        zzalx.zzg(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 40:
                        zzalx.zze(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 41:
                        zzalx.zzd(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 42:
                        zzalx.zza(this.zzc[length], (List<Boolean>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 43:
                        zzalx.zzm(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 44:
                        zzalx.zzc(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 45:
                        zzalx.zzi(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 46:
                        zzalx.zzj(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 47:
                        zzalx.zzk(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 48:
                        zzalx.zzl(this.zzc[length], (List) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, true);
                        break;
                    case 49:
                        zzalx.zza(this.zzc[length], (List<?>) zzamp.zze(t7, iZzc & 1048575), zzanfVar2, (zzalv<?>) zze(length));
                        break;
                    case 50:
                        zza(zzanfVar2, i13, zzamp.zze(t7, iZzc & 1048575), length);
                        break;
                    case 51:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zza(t7, iZzc & 1048575));
                        }
                        break;
                    case 52:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zzb(t7, iZzc & 1048575));
                        }
                        break;
                    case 53:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzb(i13, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 54:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zze(i13, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 55:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzc(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 56:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 57:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzb(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 58:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 59:
                        if (zzc(t7, i13, length)) {
                            zza(i13, zzamp.zze(t7, iZzc & 1048575), zzanfVar2);
                        }
                        break;
                    case 60:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzb(i13, zzamp.zze(t7, iZzc & 1048575), zze(length));
                        }
                        break;
                    case 61:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, (zzaip) zzamp.zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 62:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzf(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 63:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 64:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzd(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 65:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzc(i13, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 66:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zze(i13, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 67:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zzd(i13, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 68:
                        if (zzc(t7, i13, length)) {
                            zzanfVar2.zza(i13, zzamp.zze(t7, iZzc & 1048575), zze(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzq.zza(zzanfVar2, entry2);
                entry2 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
            }
            return;
        }
        if (this.zzh) {
            zzajr<T> zzajrVarZza2 = this.zzq.zza(t7);
            if (zzajrVarZza2.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzd = zzajrVarZza2.zzd();
                entry = (Map.Entry) itZzd.next();
                it = itZzd;
            }
        } else {
            entry = null;
            it = null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i15 < length2) {
            int iZzc2 = zzc(i15);
            int[] iArr = this.zzc;
            int i17 = iArr[i15];
            int i18 = (iZzc2 & i11) >>> 20;
            if (i18 <= 17) {
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i12;
                if (i20 != i16) {
                    i14 = i20 == i12 ? 0 : unsafe2.getInt(t7, i20);
                    i16 = i20;
                } else {
                    it = it;
                }
                i8 = i14;
                i9 = 1 << (i19 >>> 20);
                i7 = i16;
            } else {
                it = it;
                i7 = i16;
                i8 = i14;
                i9 = 0;
            }
            while (entry != null && this.zzq.zza(entry) <= i17) {
                this.zzq.zza(zzanfVar2, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzc2 & 1048575;
            switch (i18) {
                case 0:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, zzamp.zza(t7, j));
                    }
                    break;
                case 1:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, zzamp.zzb(t7, j));
                    }
                    break;
                case 2:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzb(i17, unsafe.getLong(t7, j));
                    }
                    break;
                case 3:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zze(i17, unsafe.getLong(t7, j));
                    }
                    break;
                case 4:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzc(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 5:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, unsafe.getLong(t7, j));
                    }
                    break;
                case 6:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzb(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 7:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, zzamp.zzh(t7, j));
                    }
                    break;
                case 8:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zza(i17, unsafe.getObject(t7, j), zzanfVar2);
                    }
                    break;
                case 9:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzb(i17, unsafe.getObject(t7, j), zze(i10));
                    }
                    break;
                case 10:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, (zzaip) unsafe.getObject(t7, j));
                    }
                    break;
                case 11:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzf(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 12:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zza(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 13:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzd(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 14:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzc(i17, unsafe.getLong(t7, j));
                    }
                    break;
                case 15:
                    i7 = i7;
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zze(i17, unsafe.getInt(t7, j));
                    }
                    break;
                case 16:
                    entry = entry;
                    length2 = length2;
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    i7 = i7;
                    if (zza(t7, i10, i7, i8, i9)) {
                        zzanfVar2.zzd(i17, unsafe.getLong(t7, j));
                    }
                    break;
                case 17:
                    z4 = false;
                    entry = entry;
                    i10 = i15;
                    length2 = length2;
                    unsafe = unsafe2;
                    if (zza(t7, i15, i7, i8, i9)) {
                        zzanfVar2 = zzanfVar;
                        zzanfVar2.zza(i17, unsafe.getObject(t7, j), zze(i10));
                    } else {
                        zzanfVar2 = zzanfVar;
                    }
                    i7 = i7;
                    break;
                case 18:
                    z7 = false;
                    zzalx.zzb(this.zzc[i15], (List<Double>) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 19:
                    z7 = false;
                    zzalx.zzf(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 20:
                    z7 = false;
                    zzalx.zzh(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    z7 = false;
                    zzalx.zzn(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 22:
                    z7 = false;
                    zzalx.zzg(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 23:
                    z7 = false;
                    zzalx.zze(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 24:
                    z7 = false;
                    zzalx.zzd(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 25:
                    z7 = false;
                    zzalx.zza(this.zzc[i15], (List<Boolean>) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 26:
                    zzalx.zzb(this.zzc[i15], (List<String>) unsafe2.getObject(t7, j), zzanfVar2);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 27:
                    zzalx.zzb(this.zzc[i15], (List<?>) unsafe2.getObject(t7, j), zzanfVar2, (zzalv<?>) zze(i15));
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 28:
                    zzalx.zza(this.zzc[i15], (List<zzaip>) unsafe2.getObject(t7, j), zzanfVar2);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 29:
                    z7 = false;
                    zzalx.zzm(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 30:
                    z7 = false;
                    zzalx.zzc(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 31:
                    z7 = false;
                    zzalx.zzi(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 32:
                    z7 = false;
                    zzalx.zzj(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 33:
                    z7 = false;
                    zzalx.zzk(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 34:
                    z7 = false;
                    zzalx.zzl(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, false);
                    z4 = z7;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 35:
                    zzalx.zzb(this.zzc[i15], (List<Double>) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 36:
                    zzalx.zzf(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 37:
                    zzalx.zzh(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 38:
                    zzalx.zzn(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 39:
                    zzalx.zzg(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 40:
                    zzalx.zze(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 41:
                    zzalx.zzd(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 42:
                    zzalx.zza(this.zzc[i15], (List<Boolean>) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 43:
                    zzalx.zzm(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 44:
                    zzalx.zzc(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 45:
                    zzalx.zzi(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 46:
                    zzalx.zzj(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 47:
                    zzalx.zzk(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 48:
                    zzalx.zzl(this.zzc[i15], (List) unsafe2.getObject(t7, j), zzanfVar2, true);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 49:
                    zzalx.zza(this.zzc[i15], (List<?>) unsafe2.getObject(t7, j), zzanfVar2, (zzalv<?>) zze(i15));
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 50:
                    zza(zzanfVar2, i17, unsafe2.getObject(t7, j), i15);
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 51:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, zza(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 52:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, zzb(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 53:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzb(i17, zzd(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 54:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zze(i17, zzd(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 55:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzc(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 56:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, zzd(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 57:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzb(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 58:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, zze(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 59:
                    if (zzc(t7, i17, i15)) {
                        zza(i17, unsafe2.getObject(t7, j), zzanfVar2);
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 60:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzb(i17, unsafe2.getObject(t7, j), zze(i15));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 61:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, (zzaip) unsafe2.getObject(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 62:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzf(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 63:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 64:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzd(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 65:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzc(i17, zzd(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 66:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zze(i17, zzc(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 67:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zzd(i17, zzd(t7, j));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                case 68:
                    if (zzc(t7, i17, i15)) {
                        zzanfVar2.zza(i17, unsafe2.getObject(t7, j), zze(i15));
                    }
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
                default:
                    z4 = false;
                    i10 = i15;
                    unsafe = unsafe2;
                    break;
            }
            i15 = i10 + 3;
            i14 = i8;
            unsafe2 = unsafe;
            i12 = 1048575;
            it = it;
            entry = entry;
            length2 = length2;
            i16 = i7;
            i11 = 267386880;
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzq.zza(zzanfVar2, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        zza(this.zzp, t7, zzanfVar2);
    }

    private static <UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t7, zzanf zzanfVar) {
        zzamoVar.zzb(zzamoVar.zzd(t7), zzanfVar);
    }

    private final boolean zza(T t7, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzc((Object) t7, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i7, zzalv zzalvVar) {
        return zzalvVar.zze(zzamp.zze(obj, i7 & 1048575));
    }
}
