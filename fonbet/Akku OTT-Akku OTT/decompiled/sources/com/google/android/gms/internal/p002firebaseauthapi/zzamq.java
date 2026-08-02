package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i, int i2, zzamm zzammVar, boolean z, int[] iArr2, int i3, int i4, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t, long j) {
        return ((Double) zzanz.zze(t, j)).doubleValue();
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzanz.zze(t, j)).floatValue();
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzanz.zze(t, j)).intValue();
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzanz.zze(t, j)).longValue();
    }

    private final zzanb zze(int i) {
        int i2 = (i / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i2];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zza2 = zzamx.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i, int i2, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) throws IOException {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int zzd = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return zzd;
            case 2:
                return zzajr.zza(bArr, i, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i));
                return i + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return zzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i, i2, zzajuVar);
            case 15:
                int zzc2 = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return zzd3;
            case 17:
                return zzajr.zzb(bArr, i, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private final zzalj zzd(int i) {
        return (zzalj) this.zzd[((i / 3) << 1) + 1];
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
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t) {
        int i;
        int zza2;
        int i2;
        int zzc;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzc2 = zzc(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzc2;
            int i6 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    zza2 = zzalh.zza(Double.doubleToLongBits(zzanz.zza(t, j)));
                    i3 = zza2 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    zza2 = Float.floatToIntBits(zzanz.zzb(t, j));
                    i3 = zza2 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t, j));
                    i3 = zza2 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t, j));
                    i3 = zza2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 5:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t, j));
                    i3 = zza2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 7:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzh(t, j));
                    i3 = zza2 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    zza2 = ((String) zzanz.zze(t, j)).hashCode();
                    i3 = zza2 + i;
                    break;
                case 9:
                    Object zze = zzanz.zze(t, j);
                    if (zze != null) {
                        i6 = zze.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    zza2 = zzanz.zze(t, j).hashCode();
                    i3 = zza2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 12:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 13:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 14:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t, j));
                    i3 = zza2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    zzc = zzanz.zzc(t, j);
                    i3 = i2 + zzc;
                    break;
                case 16:
                    i = i3 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t, j));
                    i3 = zza2 + i;
                    break;
                case 17:
                    Object zze2 = zzanz.zze(t, j);
                    if (zze2 != null) {
                        i6 = zze2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i3 * 53;
                    zza2 = zzanz.zze(t, j).hashCode();
                    i3 = zza2 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    zza2 = zzanz.zze(t, j).hashCode();
                    i3 = zza2 + i;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(Double.doubleToLongBits(zza(t, j)));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zzd(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zzd(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zzd(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zze(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = ((String) zzanz.zze(t, j)).hashCode();
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzanz.zze(t, j).hashCode();
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzanz.zze(t, j).hashCode();
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zzd(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        zzc = zzc(t, j);
                        i3 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzalh.zza(zzd(t, j));
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        zza2 = zzanz.zze(t, j).hashCode();
                        i3 = zza2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t).hashCode() + (i3 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t).hashCode() : hashCode;
    }

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzd = zzanx.zzd();
        zzalfVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t) {
        if (zzg(t)) {
            if (t instanceof zzalf) {
                zzalf zzalfVar = (zzalf) t;
                zzalfVar.zzb(Integer.MAX_VALUE);
                zzalfVar.zza = 0;
                zzalfVar.zzu();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.zzo.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzamq<T>) t, this.zzc[i], i)) {
                        zze(i).zzd(zzb.getObject(t, j));
                    }
                }
                if (zzc((zzamq<T>) t, i)) {
                    zze(i).zzd(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t) {
        int i;
        int i2;
        zzamq<T> zzamqVar;
        T t2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzc = zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(t, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & zzc) != 0) {
                zzamqVar = this;
                t2 = t;
                if (!zzamqVar.zza((zzamq<T>) t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzamqVar = this;
                t2 = t;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc((zzamq<T>) t2, i7, i6) && !zza((Object) t2, zzc, zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzamqVar.zzr.zzd(zzanz.zze(t2, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzamqVar.zzr.zza(zzf(i6)).zzc.zzb() == zzaoj.MESSAGE) {
                                ?? r3 = 0;
                                for (Object obj : zzd.values()) {
                                    r3 = r3;
                                    if (r3 == 0) {
                                        r3 = zzamx.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r3.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzanz.zze(t2, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zze.zze(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzamqVar.zza((zzamq<T>) t2, i6, i, i2, i10) && !zza((Object) t2, zzc, zze(i6))) {
                return false;
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzq.zza(t).zzg();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzamq<T>) t, i) == zzc((zzamq<T>) t2, i);
    }

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzanz.zzc(t, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t, j2)) != 0;
            case 2:
                return zzanz.zzd(t, j2) != 0;
            case 3:
                return zzanz.zzd(t, j2) != 0;
            case 4:
                return zzanz.zzc(t, j2) != 0;
            case 5:
                return zzanz.zzd(t, j2) != 0;
            case 6:
                return zzanz.zzc(t, j2) != 0;
            case 7:
                return zzanz.zzh(t, j2);
            case 8:
                Object zze = zzanz.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzajv) {
                    return !zzajv.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(t, j2) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(t, j2));
            case 11:
                return zzanz.zzc(t, j2) != 0;
            case 12:
                return zzanz.zzc(t, j2) != 0;
            case 13:
                return zzanz.zzc(t, j2) != 0;
            case 14:
                return zzanz.zzd(t, j2) != 0;
            case 15:
                return zzanz.zzc(t, j2) != 0;
            case 16:
                return zzanz.zzd(t, j2) != 0;
            case 17:
                return zzanz.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t) {
        int i;
        int zza2;
        int zza3;
        int zzb2;
        int zza4;
        int zzd;
        int zzh;
        int zzi;
        zzamq<T> zzamqVar = this;
        T t2 = t;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzamqVar.zzc.length) {
            int zzc = zzamqVar.zzc(i3);
            int i7 = (267386880 & zzc) >>> 20;
            int[] iArr = zzamqVar.zzc;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i6) {
                    i4 = i10 == i2 ? 0 : unsafe.getInt(t2, i10);
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = zzc & i2;
            if (i7 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzakn.zza(i8, 0.0d);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zza(i8, 0.0f);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zzb(i8, unsafe.getLong(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zze(i8, unsafe.getLong(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zzc(i8, unsafe.getInt(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zza(i8, 0L);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zzb(i8, 0);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zza(i8, true);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zzajv) {
                            zzb2 = zzakn.zza(i8, (zzajv) object);
                        } else {
                            zzb2 = zzakn.zza(i8, (String) object);
                        }
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza4 = zzand.zza(i8, unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                        i5 = i11 + zza4;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zza(i8, (zzajv) unsafe.getObject(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zzf(i8, unsafe.getInt(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zza(i8, unsafe.getInt(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zzd(i8, 0);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzakn.zzc(i8, 0L);
                        i5 = zza3 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zze(i8, unsafe.getInt(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzakn.zzd(i8, unsafe.getLong(t2, j));
                        i5 = zzb2 + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        zza4 = zzand.zza(i8, (zzamm) unsafe.getObject(t2, j), zzamqVar.zze(i3));
                        i5 = i11 + zza4;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    zza4 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 19:
                    zza4 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 20:
                    zza4 = zzand.zzf(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 21:
                    zza4 = zzand.zzj(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 22:
                    zza4 = zzand.zze(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 23:
                    zza4 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 24:
                    zza4 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 25:
                    zza4 = zzand.zza(i8, (List<?>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 26:
                    zza4 = zzand.zzb(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + zza4;
                    break;
                case 27:
                    zza4 = zzand.zzb(i8, (List<?>) unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                    i5 = i11 + zza4;
                    break;
                case 28:
                    zza4 = zzand.zza(i8, (List<zzajv>) unsafe.getObject(t2, j));
                    i5 = i11 + zza4;
                    break;
                case 29:
                    zza4 = zzand.zzi(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 30:
                    zza4 = zzand.zzb(i8, (List<Integer>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 31:
                    zza4 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 32:
                    zza4 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 33:
                    zza4 = zzand.zzg(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 34:
                    zza4 = zzand.zzh(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza4;
                    break;
                case 35:
                    zzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    zzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    zzd = zzand.zzf((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 38:
                    zzd = zzand.zzj((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    zzd = zzand.zze((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    zzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    zzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 42:
                    zzd = zzand.zza((List<?>) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 43:
                    zzd = zzand.zzi((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    zzd = zzand.zzb((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    zzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 46:
                    zzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 47:
                    zzd = zzand.zzg((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    zzd = zzand.zzh((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i8);
                        zzi = zzakn.zzi(zzd);
                        i5 = zzi + zzh + zzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zza4 = zzand.zza(i8, (List<zzamm>) unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                    i5 = i11 + zza4;
                    break;
                case 50:
                    zza4 = zzamqVar.zzr.zza(i8, unsafe.getObject(t2, j), zzamqVar.zzf(i3));
                    i5 = i11 + zza4;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, 0.0d);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 52:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, 0.0f);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 53:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzb(i8, zzd(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 54:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zze(i8, zzd(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 55:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzc(i8, zzc(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, 0L);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzb(i8, 0);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, true);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zzajv) {
                            zza2 = zzakn.zza(i8, (zzajv) object2);
                        } else {
                            zza2 = zzakn.zza(i8, (String) object2);
                        }
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza4 = zzand.zza(i8, unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                        i5 = i11 + zza4;
                        break;
                    }
                    i5 = i11;
                    break;
                case 61:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, (zzajv) unsafe.getObject(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 62:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzf(i8, zzc(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 63:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zza(i8, zzc(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzd(i8, 0);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 65:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzc(i8, 0L);
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 66:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zze(i8, zzc(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 67:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza2 = zzakn.zzd(i8, zzd(t2, j));
                        i5 = zza2 + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        zza4 = zzand.zza(i8, (zzamm) unsafe.getObject(t2, j), zzamqVar.zze(i3));
                        i5 = i11 + zza4;
                        break;
                    }
                    i5 = i11;
                    break;
                default:
                    i5 = i11;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzanu<?, ?> zzanuVar = zzamqVar.zzp;
        int zza5 = i5 + zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t2));
        if (!zzamqVar.zzh) {
            return zza5;
        }
        zzakx<?> zza6 = zzamqVar.zzq.zza(t2);
        int zzb3 = zza6.zza.zzb();
        int i12 = 0;
        for (int i13 = 0; i13 < zzb3; i13++) {
            Map.Entry<?, Object> zza7 = zza6.zza.zza(i13);
            i12 += zzakx.zza((zzakz<?>) zza7.getKey(), zza7.getValue());
        }
        for (Map.Entry<?, Object> entry : zza6.zza.zzc()) {
            i12 += zzakx.zza((zzakz<?>) entry.getKey(), entry.getValue());
        }
        return zza5 + i12;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzanz.zze(t, j)).booleanValue();
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzanz.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzamq<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object != null) {
                zzanb zze = zze(i);
                if (!zzc((zzamq<T>) t, i2, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t, zzc, zza2);
                    }
                    zzb((zzamq<T>) t, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzanz.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zzanz.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzanz.zza((Object) t, zzb(i2) & 1048575, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzc = zzc(i);
                long j = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
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
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        z = zzand.zza(zzanz.zze(t, j), zzanz.zze(t2, j));
                        break;
                    case 50:
                        z = zzand.zza(zzanz.zze(t, j), zzanz.zze(t2, j));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
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
                        long zzb2 = zzb(i) & 1048575;
                        if (zzanz.zzc(t, zzb2) == zzanz.zzc(t2, zzb2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzp.zzd(t).equals(this.zzp.zzd(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t).equals(this.zzq.zza(t2));
                }
                return true;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaju r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzamq<T> zza(Class<T> cls, zzamk zzamkVar, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        zzamz zzamzVar;
        int i17;
        int[] iArr2;
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zza2;
        int i24;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        if (zzamkVar instanceof zzamz) {
            zzamz zzamzVar2 = (zzamz) zzamkVar;
            String zzd = zzamzVar2.zzd();
            int length = zzd.length();
            char c = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i31 = 1;
                while (true) {
                    i = i31 + 1;
                    if (zzd.charAt(i31) < 55296) {
                        break;
                    }
                    i31 = i;
                }
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt15 = zzd.charAt(i);
            if (charAt15 >= 55296) {
                int i33 = charAt15 & 8191;
                int i34 = 13;
                while (true) {
                    i30 = i32 + 1;
                    charAt14 = zzd.charAt(i32);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i33 |= (charAt14 & 8191) << i34;
                    i34 += 13;
                    i32 = i30;
                }
                charAt15 = i33 | (charAt14 << i34);
                i32 = i30;
            }
            if (charAt15 == 0) {
                i3 = 0;
                i5 = 0;
                charAt = 0;
                i2 = 0;
                i4 = 0;
                i7 = 0;
                iArr = zza;
                i6 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt16 = zzd.charAt(i32);
                if (charAt16 >= 55296) {
                    int i36 = charAt16 & 8191;
                    int i37 = 13;
                    while (true) {
                        i15 = i35 + 1;
                        charAt9 = zzd.charAt(i35);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i36 |= (charAt9 & 8191) << i37;
                        i37 += 13;
                        i35 = i15;
                    }
                    charAt16 = i36 | (charAt9 << i37);
                    i35 = i15;
                }
                int i38 = i35 + 1;
                int charAt17 = zzd.charAt(i35);
                if (charAt17 >= 55296) {
                    int i39 = charAt17 & 8191;
                    int i40 = 13;
                    while (true) {
                        i14 = i38 + 1;
                        charAt8 = zzd.charAt(i38);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i39 |= (charAt8 & 8191) << i40;
                        i40 += 13;
                        i38 = i14;
                    }
                    charAt17 = i39 | (charAt8 << i40);
                    i38 = i14;
                }
                int i41 = i38 + 1;
                int charAt18 = zzd.charAt(i38);
                if (charAt18 >= 55296) {
                    int i42 = charAt18 & 8191;
                    int i43 = 13;
                    while (true) {
                        i13 = i41 + 1;
                        charAt7 = zzd.charAt(i41);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i42 |= (charAt7 & 8191) << i43;
                        i43 += 13;
                        i41 = i13;
                    }
                    charAt18 = i42 | (charAt7 << i43);
                    i41 = i13;
                }
                int i44 = i41 + 1;
                int charAt19 = zzd.charAt(i41);
                if (charAt19 >= 55296) {
                    int i45 = charAt19 & 8191;
                    int i46 = 13;
                    while (true) {
                        i12 = i44 + 1;
                        charAt6 = zzd.charAt(i44);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i45 |= (charAt6 & 8191) << i46;
                        i46 += 13;
                        i44 = i12;
                    }
                    charAt19 = i45 | (charAt6 << i46);
                    i44 = i12;
                }
                int i47 = i44 + 1;
                charAt = zzd.charAt(i44);
                if (charAt >= 55296) {
                    int i48 = charAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i11 = i47 + 1;
                        charAt5 = zzd.charAt(i47);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i48 |= (charAt5 & 8191) << i49;
                        i49 += 13;
                        i47 = i11;
                    }
                    charAt = i48 | (charAt5 << i49);
                    i47 = i11;
                }
                int i50 = i47 + 1;
                int charAt20 = zzd.charAt(i47);
                if (charAt20 >= 55296) {
                    int i51 = charAt20 & 8191;
                    int i52 = 13;
                    while (true) {
                        i10 = i50 + 1;
                        charAt4 = zzd.charAt(i50);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i51 |= (charAt4 & 8191) << i52;
                        i52 += 13;
                        i50 = i10;
                    }
                    charAt20 = i51 | (charAt4 << i52);
                    i50 = i10;
                }
                int i53 = i50 + 1;
                int charAt21 = zzd.charAt(i50);
                if (charAt21 >= 55296) {
                    int i54 = charAt21 & 8191;
                    int i55 = 13;
                    while (true) {
                        i9 = i53 + 1;
                        charAt3 = zzd.charAt(i53);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i54 |= (charAt3 & 8191) << i55;
                        i55 += 13;
                        i53 = i9;
                    }
                    charAt21 = i54 | (charAt3 << i55);
                    i53 = i9;
                }
                int i56 = i53 + 1;
                int charAt22 = zzd.charAt(i53);
                if (charAt22 >= 55296) {
                    int i57 = charAt22 & 8191;
                    int i58 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt2 = zzd.charAt(i56);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i57 |= (charAt2 & 8191) << i58;
                        i58 += 13;
                        i56 = i8;
                    }
                    charAt22 = i57 | (charAt2 << i58);
                    i56 = i8;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                int i59 = (charAt16 << 1) + charAt17;
                int i60 = charAt20;
                i2 = charAt18;
                i3 = i60;
                i4 = charAt19;
                i5 = i59;
                iArr = iArr3;
                i6 = charAt16;
                i7 = charAt22;
                i32 = i56;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzamzVar2.zze();
            Class<?> cls2 = zzamzVar2.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i61 = i7 + i3;
            int i62 = i7;
            int i63 = i61;
            int i64 = 0;
            int i65 = 0;
            while (i32 < length) {
                int i66 = i32 + 1;
                int charAt23 = zzd.charAt(i32);
                if (charAt23 >= c) {
                    int i67 = charAt23 & 8191;
                    int i68 = i66;
                    int i69 = 13;
                    while (true) {
                        i29 = i68 + 1;
                        charAt13 = zzd.charAt(i68);
                        if (charAt13 < c) {
                            break;
                        }
                        i67 |= (charAt13 & 8191) << i69;
                        i69 += 13;
                        i68 = i29;
                    }
                    charAt23 = i67 | (charAt13 << i69);
                    i16 = i29;
                } else {
                    i16 = i66;
                }
                int i70 = i16 + 1;
                int charAt24 = zzd.charAt(i16);
                if (charAt24 >= c) {
                    int i71 = charAt24 & 8191;
                    int i72 = i70;
                    int i73 = 13;
                    while (true) {
                        i28 = i72 + 1;
                        charAt12 = zzd.charAt(i72);
                        zzamzVar = zzamzVar2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i71 |= (charAt12 & 8191) << i73;
                        i73 += 13;
                        i72 = i28;
                        zzamzVar2 = zzamzVar;
                    }
                    charAt24 = i71 | (charAt12 << i73);
                    i17 = i28;
                } else {
                    zzamzVar = zzamzVar2;
                    i17 = i70;
                }
                int i74 = charAt24 & 255;
                int i75 = length;
                if ((charAt24 & 1024) != 0) {
                    iArr[i65] = i64;
                    i65++;
                }
                int i76 = charAt23;
                if (i74 >= 51) {
                    i21 = i17 + 1;
                    int charAt25 = zzd.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i77 = charAt25 & 8191;
                        int i78 = 13;
                        while (true) {
                            i27 = i21 + 1;
                            charAt11 = zzd.charAt(i21);
                            if (charAt11 < c2) {
                                break;
                            }
                            i77 |= (charAt11 & 8191) << i78;
                            i78 += 13;
                            i21 = i27;
                            c2 = 55296;
                        }
                        charAt25 = i77 | (charAt11 << i78);
                        i21 = i27;
                    }
                    int i79 = i74 - 51;
                    int i80 = charAt25;
                    if (i79 != 9 && i79 != 17) {
                        if (i79 == 12 && (zzamzVar.zzb().equals(zzamy.PROTO2) || (charAt24 & 2048) != 0)) {
                            i26 = i5 + 1;
                            objArr[((i64 / 3) << 1) + 1] = zze[i5];
                        }
                        int i81 = i80 << 1;
                        obj = zze[i81];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i81] = zza3;
                        }
                        iArr2 = iArr4;
                        i18 = i6;
                        i22 = (int) unsafe.objectFieldOffset(zza3);
                        int i82 = i81 + 1;
                        obj2 = zze[i82];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i82] = zza4;
                        }
                        i23 = (int) unsafe.objectFieldOffset(zza4);
                        str = zzd;
                        i20 = 0;
                    } else {
                        i26 = i5 + 1;
                        objArr[((i64 / 3) << 1) + 1] = zze[i5];
                    }
                    i5 = i26;
                    int i812 = i80 << 1;
                    obj = zze[i812];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    i18 = i6;
                    i22 = (int) unsafe.objectFieldOffset(zza3);
                    int i822 = i812 + 1;
                    obj2 = zze[i822];
                    if (!(obj2 instanceof Field)) {
                    }
                    i23 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    i20 = 0;
                } else {
                    iArr2 = iArr4;
                    i18 = i6;
                    int i83 = i5 + 1;
                    Field zza5 = zza(cls2, (String) zze[i5]);
                    if (i74 == 9 || i74 == 17) {
                        objArr[((i64 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i74 == 27 || i74 == 49) {
                            i25 = i5 + 2;
                            objArr[((i64 / 3) << 1) + 1] = zze[i83];
                        } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                            if (zzamzVar.zzb() == zzamy.PROTO2 || (charAt24 & 2048) != 0) {
                                i25 = i5 + 2;
                                objArr[((i64 / 3) << 1) + 1] = zze[i83];
                            }
                        } else if (i74 == 50) {
                            int i84 = i62 + 1;
                            iArr[i62] = i64;
                            int i85 = (i64 / 3) << 1;
                            int i86 = i5 + 2;
                            objArr[i85] = zze[i83];
                            if ((charAt24 & 2048) != 0) {
                                i83 = i5 + 3;
                                objArr[i85 + 1] = zze[i86];
                                i62 = i84;
                            } else {
                                i62 = i84;
                                i83 = i86;
                            }
                        }
                        i83 = i25;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) == 0 || i74 > 17) {
                        str = zzd;
                        i19 = 1048575;
                        i20 = 0;
                    } else {
                        int i87 = i17 + 1;
                        int charAt26 = zzd.charAt(i17);
                        if (charAt26 >= 55296) {
                            int i88 = charAt26 & 8191;
                            int i89 = 13;
                            while (true) {
                                i24 = i87 + 1;
                                charAt10 = zzd.charAt(i87);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i88 |= (charAt10 & 8191) << i89;
                                i89 += 13;
                                i87 = i24;
                            }
                            charAt26 = i88 | (charAt10 << i89);
                            i87 = i24;
                        }
                        int i90 = (charAt26 / 32) + (i18 << 1);
                        Object obj3 = zze[i90];
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls2, (String) obj3);
                            zze[i90] = zza2;
                        }
                        str = zzd;
                        i20 = charAt26 % 32;
                        int i91 = i87;
                        i19 = (int) unsafe.objectFieldOffset(zza2);
                        i17 = i91;
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                    i5 = i83;
                    i21 = i17;
                    i22 = objectFieldOffset;
                    i23 = i19;
                }
                int i92 = i64 + 1;
                iArr2[i64] = i76;
                int i93 = i64 + 2;
                iArr2[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i22;
                i64 += 3;
                iArr2[i93] = (i20 << 20) | i23;
                i32 = i21;
                zzd = str;
                length = i75;
                zzamzVar2 = zzamzVar;
                i6 = i18;
                iArr4 = iArr2;
                c = 55296;
            }
            return new zzamq<>(iArr4, objArr, i2, i4, zzamzVar2.zza(), false, iArr, i7, i61, zzamuVar, zzalwVar, zzanuVar, zzakwVar, zzamfVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzd;
        int i2 = this.zzc[i];
        Object zze = zzanz.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(zze), zzd, (zzalj) ub, (zzanu<UT, zzalj>) zzanuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zza2 = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzc = zzajv.zzc(zzame.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzanuVar.zza((zzanu<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzanb zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzamq<T>) t, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
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
    private final Object zza(T t, int i, int i2) {
        zzanb zze = zze(i2);
        if (!zzc((zzamq<T>) t, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a = c.a("Field ", str, " for ", name, " not found. Known fields are ");
            a.append(arrays);
            throw new RuntimeException(a.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zza(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzb(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zzc(t, j, zzanz.zzh(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzand.zza(this.zzr, t, t2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzamq<T>) t2, i2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzamq<T>) t2, i2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzand.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzand.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0775 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:37:0x0058, B:115:0x0770, B:117:0x0775, B:118:0x077a, B:134:0x013a, B:137:0x014c, B:138:0x0164, B:139:0x017c, B:140:0x0194, B:141:0x01ac, B:143:0x01bc, B:146:0x01c3, B:147:0x01c9, B:148:0x01d7, B:149:0x01ef, B:150:0x0203, B:151:0x021b, B:152:0x0229, B:153:0x0241, B:154:0x0259, B:155:0x0271, B:156:0x0289, B:157:0x02a1, B:158:0x02b9, B:159:0x02d1, B:160:0x02e9, B:162:0x02ff, B:163:0x0320, B:164:0x0309, B:166:0x0311, B:167:0x0331, B:168:0x0349, B:169:0x035d, B:170:0x0371, B:171:0x0385, B:172:0x0399, B:183:0x03cc, B:184:0x03da, B:185:0x03ee, B:186:0x0402, B:187:0x0416, B:188:0x042a, B:189:0x043e, B:190:0x0452, B:191:0x0466, B:192:0x047a, B:193:0x048e, B:194:0x04a2, B:195:0x04b6, B:196:0x04ca, B:201:0x04f1, B:202:0x04ff, B:203:0x0513, B:204:0x052b, B:206:0x0537, B:207:0x0545, B:208:0x0553, B:209:0x0567, B:210:0x057b, B:211:0x058f, B:212:0x05a3, B:213:0x05b7, B:214:0x05cb, B:215:0x05df, B:216:0x05f3, B:217:0x060b, B:218:0x0620, B:219:0x0634, B:220:0x0648, B:221:0x065c, B:223:0x066b, B:226:0x0672, B:227:0x0678, B:228:0x0682, B:229:0x0696, B:230:0x06aa, B:231:0x06c2, B:232:0x06d0, B:233:0x06e4, B:234:0x06f8, B:235:0x070c, B:236:0x0720, B:237:0x0734, B:238:0x0748, B:239:0x075c), top: B:36:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07ae A[LOOP:1: B:27:0x07aa->B:29:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07c1  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzanc zzancVar, zzaku zzakuVar) throws IOException {
        T t2;
        int i;
        Object obj;
        int zzc;
        int zza2;
        zzakw<?> zzakwVar;
        zzaku zzakuVar2;
        zzanu zzanuVar;
        T t3;
        zzamq<T> zzamqVar;
        Object zza3;
        T t4;
        zzanu zzanuVar2;
        zzanu zzanuVar3;
        zzamq<T> zzamqVar2;
        zzamq<T> zzamqVar3 = this;
        zzaku zzakuVar3 = zzakuVar;
        zzakuVar3.getClass();
        zzf(t);
        zzanu zzanuVar4 = zzamqVar3.zzp;
        zzakw<?> zzakwVar2 = zzamqVar3.zzq;
        Object obj2 = null;
        zzakx<?> zzakxVar = null;
        while (true) {
            try {
                zzc = zzancVar.zzc();
                zza2 = zzamqVar3.zza(zzc);
            } catch (Throwable th) {
                th = th;
                t2 = t;
            }
            if (zza2 >= 0) {
                zzakwVar = zzakwVar2;
                zzakuVar2 = zzakuVar3;
                zzanuVar = zzanuVar4;
                t3 = t;
                try {
                    int zzc2 = zzamqVar3.zzc(zza2);
                    switch ((267386880 & zzc2) >>> 20) {
                        case 0:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, zzancVar.zza());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 1:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzb());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 2:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzl());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 3:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzo());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 4:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzg());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 5:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzk());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 6:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzf());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 7:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zzc(t3, zzc2 & 1048575, zzancVar.zzs());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 8:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamqVar.zza((Object) t3, zzc2, zzancVar);
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 9:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar = (zzamm) zzamqVar.zza((zzamq<T>) t3, zza2);
                            zzancVar.zzb((zzanc) zzammVar, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t3, zza2, zzammVar);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 10:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, zzancVar.zzp());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 11:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzj());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 12:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            int zze = zzancVar.zze();
                            zzalj zzd = zzamqVar.zzd(zza2);
                            if (zzd != null && !zzd.zza(zze)) {
                                obj2 = zzand.zza(t3, zzc, zze, obj2, zzanuVar4);
                                zzamqVar3 = zzamqVar;
                                break;
                            }
                            zzanz.zza((Object) t3, zzc2 & 1048575, zze);
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 13:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzh());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 14:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzm());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 15:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzi());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 16:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t3, zzc2 & 1048575, zzancVar.zzn());
                            zzamqVar.zzb((zzamq<T>) t3, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 17:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar2 = (zzamm) zzamqVar.zza((zzamq<T>) t3, zza2);
                            zzancVar.zza((zzanc) zzammVar2, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t3, zza2, zzammVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 18:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzc(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 19:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzg(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 20:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzi(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 21:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzq(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 22:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzh(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 23:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzf(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 24:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zze(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 25:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 26:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            if (zzg(zzc2)) {
                                zzancVar.zzo(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            } else {
                                zzancVar.zzn(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        case 27:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzb((List) zzamqVar.zzo.zza(t3, zzc2 & 1048575), (zzanb) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 28:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzb(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 29:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzp(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 30:
                            zzamqVar = zzamqVar3;
                            List<Integer> zza4 = zzamqVar.zzo.zza(t3, zzc2 & 1048575);
                            zzancVar.zzd(zza4);
                            zza3 = zzand.zza(t3, zzc, zza4, zzamqVar.zzd(zza2), obj2, zzanuVar);
                            zzanuVar4 = zzanuVar;
                            obj2 = zza3;
                            zzamqVar3 = zzamqVar;
                            break;
                        case 31:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzj(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 32:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzk(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 33:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzl(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 34:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzm(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 35:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzc(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 36:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzg(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 37:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzi(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 38:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzq(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 39:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzh(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 40:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzf(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 41:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zze(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 42:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 43:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzp(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 44:
                            zzamqVar = zzamqVar3;
                            t4 = t3;
                            List<Integer> zza5 = zzamqVar.zzo.zza(t4, zzc2 & 1048575);
                            zzancVar.zzd(zza5);
                            zzalj zzd2 = zzamqVar.zzd(zza2);
                            Object obj3 = obj2;
                            try {
                                zza3 = zzand.zza(t4, zzc, zza5, zzd2, obj3, zzanuVar);
                                zzanuVar4 = zzanuVar;
                                obj2 = zza3;
                            } catch (zzalo unused) {
                                zzanuVar3 = zzanuVar;
                                obj2 = obj3;
                                zzanuVar4 = zzanuVar3;
                                zzanuVar4.zza(zzancVar);
                                if (obj2 == null) {
                                }
                                if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                zzanuVar2 = zzanuVar;
                                obj2 = obj3;
                                zzanuVar4 = zzanuVar2;
                                t2 = t4;
                                zzamqVar3 = zzamqVar;
                                i = zzamqVar3.zzl;
                                obj = obj2;
                                while (i < zzamqVar3.zzm) {
                                }
                                T t5 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        case 45:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzj(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 46:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzk(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 47:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzl(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 48:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzm(zzamqVar.zzo.zza(t3, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza((List) zzamqVar.zzo.zza(t3, zzc2 & 1048575), (zzanb) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 50:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            Object zzf = zzamqVar.zzf(zza2);
                            long zzc3 = zzamqVar.zzc(zza2) & 1048575;
                            Object zze2 = zzanz.zze(t3, zzc3);
                            if (zze2 == null) {
                                zze2 = zzamqVar.zzr.zzb(zzf);
                                zzanz.zza(t3, zzc3, zze2);
                            } else if (zzamqVar.zzr.zzf(zze2)) {
                                Object zzb2 = zzamqVar.zzr.zzb(zzf);
                                zzamqVar.zzr.zza(zzb2, zze2);
                                zzanz.zza(t3, zzc3, zzb2);
                                zze2 = zzb2;
                            }
                            zzancVar.zza(zzamqVar.zzr.zze(zze2), zzamqVar.zzr.zza(zzf), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Double.valueOf(zzancVar.zza()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 52:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Float.valueOf(zzancVar.zzb()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 53:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Long.valueOf(zzancVar.zzl()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 54:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Long.valueOf(zzancVar.zzo()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 55:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzancVar.zzg()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 56:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Long.valueOf(zzancVar.zzk()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 57:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzancVar.zzf()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 58:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Boolean.valueOf(zzancVar.zzs()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 59:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamqVar.zza((Object) t3, zzc2, zzancVar);
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 60:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar3 = (zzamm) zzamqVar.zza((zzamq<T>) t3, zzc, zza2);
                            zzancVar.zzb((zzanc) zzammVar3, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t3, zzc, zza2, zzammVar3);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 61:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, zzancVar.zzp());
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 62:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzancVar.zzj()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 63:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            int zze3 = zzancVar.zze();
                            zzalj zzd3 = zzamqVar.zzd(zza2);
                            if (zzd3 != null && !zzd3.zza(zze3)) {
                                obj2 = zzand.zza(t3, zzc, zze3, obj2, zzanuVar4);
                                zzamqVar3 = zzamqVar;
                                break;
                            }
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zze3));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 64:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzancVar.zzh()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 65:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Long.valueOf(zzancVar.zzm()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 66:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzancVar.zzi()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 67:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t3, zzc2 & 1048575, Long.valueOf(zzancVar.zzn()));
                            zzamqVar.zzb((zzamq<T>) t3, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 68:
                            zzamqVar = zzamqVar3;
                            t4 = t3;
                            zzanuVar4 = zzanuVar;
                            try {
                                zzamm zzammVar4 = (zzamm) zzamqVar.zza((zzamq<T>) t4, zzc, zza2);
                                zzancVar.zza((zzanc) zzammVar4, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                                zzamqVar.zza((zzamq<T>) t4, zzc, zza2, zzammVar4);
                            } catch (zzalo unused2) {
                                zzanuVar4.zza(zzancVar);
                                if (obj2 == null) {
                                }
                                if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                }
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzanuVar.zzc(t3);
                                } catch (zzalo unused3) {
                                    zzanuVar3 = zzanuVar;
                                    zzamqVar = zzamqVar3;
                                    t4 = t3;
                                    zzanuVar4 = zzanuVar3;
                                    zzanuVar4.zza(zzancVar);
                                    if (obj2 == null) {
                                        obj2 = zzanuVar4.zzc(t4);
                                    }
                                    if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                        int i2 = zzamqVar.zzl;
                                        Object obj4 = obj2;
                                        while (i2 < zzamqVar.zzm) {
                                            T t6 = t4;
                                            obj4 = zzamqVar.zza((Object) t6, zzamqVar.zzk[i2], (int) obj4, (zzanu<UT, int>) zzanuVar4, (Object) t);
                                            i2++;
                                            t4 = t6;
                                        }
                                        T t7 = t4;
                                        if (obj4 != null) {
                                            zzanuVar4.zzb((Object) t7, (T) obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    zzamqVar3 = zzamqVar;
                                    zzakuVar3 = zzakuVar2;
                                    zzakwVar2 = zzakwVar;
                                }
                            }
                            try {
                                if (!zzanuVar.zza((zzanu) obj2, zzancVar, 0)) {
                                    int i3 = zzamqVar3.zzl;
                                    Object obj5 = obj2;
                                    while (i3 < zzamqVar3.zzm) {
                                        T t8 = t3;
                                        zzanu zzanuVar5 = zzanuVar;
                                        obj5 = zzamqVar3.zza((Object) t8, zzamqVar3.zzk[i3], (int) obj5, (zzanu<UT, int>) zzanuVar5, (Object) t);
                                        i3++;
                                        t3 = t8;
                                        zzamqVar3 = zzamqVar3;
                                        zzanuVar = zzanuVar5;
                                    }
                                    zzanu zzanuVar6 = zzanuVar;
                                    zzamqVar2 = zzamqVar3;
                                    T t9 = t3;
                                    if (obj5 != null) {
                                        zzanuVar6.zzb((Object) t9, (T) obj5);
                                        break;
                                    }
                                } else {
                                    zzamqVar = zzamqVar3;
                                    zzanuVar4 = zzanuVar;
                                    zzamqVar3 = zzamqVar;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzanuVar2 = zzanuVar;
                                zzamqVar = zzamqVar3;
                                t4 = t3;
                                zzanuVar4 = zzanuVar2;
                                t2 = t4;
                                zzamqVar3 = zzamqVar;
                                i = zzamqVar3.zzl;
                                obj = obj2;
                                while (i < zzamqVar3.zzm) {
                                }
                                T t52 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    t2 = t3;
                    zzanuVar4 = zzanuVar;
                    i = zzamqVar3.zzl;
                    obj = obj2;
                    while (i < zzamqVar3.zzm) {
                    }
                    T t522 = t2;
                    if (obj != null) {
                    }
                    throw th;
                }
            } else if (zzc == Integer.MAX_VALUE) {
                int i4 = zzamqVar3.zzl;
                Object obj6 = obj2;
                while (i4 < zzamqVar3.zzm) {
                    obj6 = zzamqVar3.zza((Object) t, zzamqVar3.zzk[i4], (int) obj6, (zzanu<UT, int>) zzanuVar4, (Object) t);
                    i4++;
                    zzamqVar3 = zzamqVar3;
                }
                zzamqVar2 = zzamqVar3;
                if (obj6 != null) {
                    zzanuVar4.zzb((Object) t, (T) obj6);
                }
            } else {
                zzamqVar = zzamqVar3;
                t4 = t;
                try {
                    Object zza6 = !zzamqVar.zzh ? null : zzakwVar2.zza(zzakuVar3, zzamqVar.zzg, zzc);
                    if (zza6 != null) {
                        if (zzakxVar == null) {
                            try {
                                zzakxVar = zzakwVar2.zzb(t4);
                            } catch (Throwable th5) {
                                th = th5;
                                t2 = t4;
                                zzamqVar3 = zzamqVar;
                                i = zzamqVar3.zzl;
                                obj = obj2;
                                while (i < zzamqVar3.zzm) {
                                }
                                T t5222 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                        }
                        zzakx<?> zzakxVar2 = zzakxVar;
                        zzanu zzanuVar7 = zzanuVar4;
                        try {
                            obj2 = zzakwVar2.zza(t4, zzancVar, zza6, zzakuVar3, zzakxVar2, obj2, zzanuVar7);
                            zzakxVar = zzakxVar2;
                            zzanuVar4 = zzanuVar7;
                            zzakwVar = zzakwVar2;
                            zzakuVar2 = zzakuVar3;
                            zzamqVar3 = zzamqVar;
                        } catch (Throwable th6) {
                            th = th6;
                            t2 = t4;
                            zzanuVar4 = zzanuVar7;
                        }
                    } else {
                        zzakwVar = zzakwVar2;
                        t2 = t4;
                        zzakuVar2 = zzakuVar3;
                        try {
                            zzanuVar4.zza(zzancVar);
                            if (obj2 == null) {
                                try {
                                    obj2 = zzanuVar4.zzc(t2);
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                            if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                int i5 = zzamqVar.zzl;
                                Object obj7 = obj2;
                                while (i5 < zzamqVar.zzm) {
                                    zzamq<T> zzamqVar4 = zzamqVar;
                                    obj7 = zzamqVar4.zza((Object) t2, zzamqVar.zzk[i5], (int) obj7, (zzanu<UT, int>) zzanuVar4, (Object) t);
                                    i5++;
                                    zzanuVar4 = zzanuVar4;
                                    zzamqVar = zzamqVar4;
                                }
                                zzanu zzanuVar8 = zzanuVar4;
                                if (obj7 != null) {
                                    zzanuVar8.zzb((Object) t2, (T) obj7);
                                    return;
                                }
                                return;
                            }
                            zzamqVar3 = zzamqVar;
                            zzanuVar4 = zzanuVar4;
                        } catch (Throwable th8) {
                            th = th8;
                            zzamqVar3 = zzamqVar;
                            zzanuVar = zzanuVar4;
                            zzanuVar4 = zzanuVar;
                            i = zzamqVar3.zzl;
                            obj = obj2;
                            while (i < zzamqVar3.zzm) {
                            }
                            T t52222 = t2;
                            if (obj != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    zzanu zzanuVar9 = zzanuVar4;
                    t3 = t4;
                    zzamqVar3 = zzamqVar;
                    zzanuVar = zzanuVar9;
                    t2 = t3;
                    zzanuVar4 = zzanuVar;
                    i = zzamqVar3.zzl;
                    obj = obj2;
                    while (i < zzamqVar3.zzm) {
                    }
                    T t522222 = t2;
                    if (obj != null) {
                    }
                    throw th;
                }
                zzamqVar3 = zzamqVar;
                i = zzamqVar3.zzl;
                obj = obj2;
                while (i < zzamqVar3.zzm) {
                    obj = zzamqVar3.zza((Object) t2, zzamqVar3.zzk[i], (int) obj, (zzanu<UT, int>) zzanuVar4, (Object) t);
                    i++;
                    zzamqVar3 = this;
                }
                T t5222222 = t2;
                if (obj != null) {
                    zzanuVar4.zzb((Object) t5222222, (T) obj);
                }
                throw th;
            }
            zzakuVar3 = zzakuVar2;
            zzakwVar2 = zzakwVar;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        zza((zzamq<T>) t, bArr, i, i2, 0, zzajuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzamq<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object != null) {
                zzanb zze = zze(i);
                if (!zzc((zzamq<T>) t, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t, zzc, zza2);
                    }
                    zzb((zzamq<T>) t, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
        }
    }

    private final void zza(Object obj, int i, zzanc zzancVar) throws IOException {
        if (zzg(i)) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzamq<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzamq<T>) t, i, i2);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaolVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) throws IOException {
        if (obj instanceof String) {
            zzaolVar.zza(i, (String) obj);
        } else {
            zzaolVar.zza(i, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a60  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzaol zzaolVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzamq<T> zzamqVar = this;
        int i6 = 267386880;
        int i7 = 1;
        int i8 = 1048575;
        if (zzaolVar.zza() == 2) {
            zza(zzamqVar.zzp, t, zzaolVar);
            if (zzamqVar.zzh) {
                zzakx<?> zza2 = zzamqVar.zzq.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzamqVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzamqVar.zzc(length2);
                        int i9 = zzamqVar.zzc[length2];
                        while (entry3 != null && zzamqVar.zzq.zza(entry3) > i9) {
                            zzamqVar.zzq.zza(zzaolVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzb(i9, zzanz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zze(i9, zzanz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzc(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzb(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zzh(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zza(i9, zzanz.zze(t, zzc & 1048575), zzaolVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzb(i9, zzanz.zze(t, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, (zzajv) zzanz.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzf(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzd(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzc(i9, zzanz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zze(i9, zzanz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zzd(i9, zzanz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzamqVar.zzc((zzamq<T>) t, length2)) {
                                    zzaolVar.zza(i9, zzanz.zze(t, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzand.zzb(zzamqVar.zzc[length2], (List<Double>) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 19:
                                zzand.zzf(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 20:
                                zzand.zzh(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 21:
                                zzand.zzn(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 22:
                                zzand.zzg(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 23:
                                zzand.zze(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 24:
                                zzand.zzd(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 25:
                                zzand.zza(zzamqVar.zzc[length2], (List<Boolean>) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 26:
                                zzand.zzb(zzamqVar.zzc[length2], (List<String>) zzanz.zze(t, zzc & 1048575), zzaolVar);
                                break;
                            case 27:
                                zzand.zzb(zzamqVar.zzc[length2], (List<?>) zzanz.zze(t, zzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length2));
                                break;
                            case 28:
                                zzand.zza(zzamqVar.zzc[length2], (List<zzajv>) zzanz.zze(t, zzc & 1048575), zzaolVar);
                                break;
                            case 29:
                                zzand.zzm(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 30:
                                zzand.zzc(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 31:
                                zzand.zzi(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 32:
                                zzand.zzj(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 33:
                                zzand.zzk(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 34:
                                zzand.zzl(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, false);
                                break;
                            case 35:
                                zzand.zzb(zzamqVar.zzc[length2], (List<Double>) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 36:
                                zzand.zzf(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 37:
                                zzand.zzh(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 38:
                                zzand.zzn(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 39:
                                zzand.zzg(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 40:
                                zzand.zze(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 41:
                                zzand.zzd(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 42:
                                zzand.zza(zzamqVar.zzc[length2], (List<Boolean>) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 43:
                                zzand.zzm(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 44:
                                zzand.zzc(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 45:
                                zzand.zzi(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 46:
                                zzand.zzj(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 47:
                                zzand.zzk(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case 48:
                                zzand.zzl(zzamqVar.zzc[length2], (List) zzanz.zze(t, zzc & 1048575), zzaolVar, true);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzand.zza(zzamqVar.zzc[length2], (List<?>) zzanz.zze(t, zzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length2));
                                break;
                            case 50:
                                zzamqVar.zza(zzaolVar, i9, zzanz.zze(t, zzc & 1048575), length2);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzb(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zze(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzc(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzb(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zza(i9, zzanz.zze(t, zzc & 1048575), zzaolVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzb(i9, zzanz.zze(t, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, (zzajv) zzanz.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzf(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzd(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzc(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zze(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zzd(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzamqVar.zzc((zzamq<T>) t, i9, length2)) {
                                    zzaolVar.zza(i9, zzanz.zze(t, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzamqVar.zzq.zza(zzaolVar, entry3);
                        entry3 = it2.hasNext() ? it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (zzamqVar.zzh) {
            zzakx<?> zza3 = zzamqVar.zzq.zza(t);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzamqVar.zzc.length;
                Unsafe unsafe = zzb;
                i = 0;
                int i10 = 0;
                int i11 = 1048575;
                while (i < length) {
                    int zzc2 = zzamqVar.zzc(i);
                    int i12 = i6;
                    int[] iArr = zzamqVar.zzc;
                    int i13 = iArr[i];
                    int i14 = (zzc2 & i12) >>> 20;
                    int i15 = i7;
                    if (i14 <= 17) {
                        int i16 = iArr[i + 2];
                        int i17 = i16 & i8;
                        if (i17 != i11) {
                            i10 = i17 == i8 ? 0 : unsafe.getInt(t, i17);
                            i11 = i17;
                        }
                        int i18 = i15 << (i16 >>> 20);
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = i18;
                    } else {
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = 0;
                    }
                    while (entry2 != null && zzamqVar.zzq.zza(entry2) <= i13) {
                        zzamqVar.zzq.zza(zzaolVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j = zzc2 & i8;
                    switch (i14) {
                        case 0:
                            i5 = i15;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, zzanz.zza(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i19 = i15;
                            i5 = i19;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, zzanz.zzb(t, j));
                                i5 = i19;
                            }
                            zzamqVar = this;
                            break;
                        case 2:
                            int i20 = i15;
                            i5 = i20;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzb(i13, unsafe.getLong(t, j));
                                i5 = i20;
                            }
                            zzamqVar = this;
                            break;
                        case 3:
                            int i21 = i15;
                            i5 = i21;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zze(i13, unsafe.getLong(t, j));
                                i5 = i21;
                            }
                            zzamqVar = this;
                            break;
                        case 4:
                            int i22 = i15;
                            i5 = i22;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzc(i13, unsafe.getInt(t, j));
                                i5 = i22;
                            }
                            zzamqVar = this;
                            break;
                        case 5:
                            int i23 = i15;
                            i5 = i23;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, unsafe.getLong(t, j));
                                i5 = i23;
                            }
                            zzamqVar = this;
                            break;
                        case 6:
                            int i24 = i15;
                            i5 = i24;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzb(i13, unsafe.getInt(t, j));
                                i5 = i24;
                            }
                            zzamqVar = this;
                            break;
                        case 7:
                            int i25 = i15;
                            i5 = i25;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, zzanz.zzh(t, j));
                                i5 = i25;
                            }
                            zzamqVar = this;
                            break;
                        case 8:
                            int i26 = i15;
                            i5 = i26;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zza(i13, unsafe.getObject(t, j), zzaolVar);
                                i5 = i26;
                            }
                            zzamqVar = this;
                            break;
                        case 9:
                            i5 = i15;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzb(i13, unsafe.getObject(t, j), zzamqVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i27 = i15;
                            i5 = i27;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, (zzajv) unsafe.getObject(t, j));
                                i5 = i27;
                            }
                            zzamqVar = this;
                            break;
                        case 11:
                            int i28 = i15;
                            i5 = i28;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzf(i13, unsafe.getInt(t, j));
                                i5 = i28;
                            }
                            zzamqVar = this;
                            break;
                        case 12:
                            int i29 = i15;
                            i5 = i29;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, unsafe.getInt(t, j));
                                i5 = i29;
                            }
                            zzamqVar = this;
                            break;
                        case 13:
                            int i30 = i15;
                            i5 = i30;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzd(i13, unsafe.getInt(t, j));
                                i5 = i30;
                            }
                            zzamqVar = this;
                            break;
                        case 14:
                            int i31 = i15;
                            i5 = i31;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzc(i13, unsafe.getLong(t, j));
                                i5 = i31;
                            }
                            zzamqVar = this;
                            break;
                        case 15:
                            int i32 = i15;
                            i5 = i32;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zze(i13, unsafe.getInt(t, j));
                                i5 = i32;
                            }
                            zzamqVar = this;
                            break;
                        case 16:
                            int i33 = i15;
                            i5 = i33;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zzd(i13, unsafe.getLong(t, j));
                                i5 = i33;
                            }
                            zzamqVar = this;
                            break;
                        case 17:
                            i5 = i15;
                            if (zzamqVar.zza((zzamq<T>) t, i, i2, i3, i4)) {
                                zzaolVar.zza(i13, unsafe.getObject(t, j), zzamqVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i5 = i15;
                            zzand.zzb(zzamqVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 19:
                            i5 = i15;
                            zzand.zzf(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 20:
                            i5 = i15;
                            zzand.zzh(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 21:
                            i5 = i15;
                            zzand.zzn(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 22:
                            i5 = i15;
                            zzand.zzg(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 23:
                            i5 = i15;
                            zzand.zze(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 24:
                            i5 = i15;
                            zzand.zzd(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 25:
                            i5 = i15;
                            zzand.zza(zzamqVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 26:
                            i5 = i15;
                            zzand.zzb(zzamqVar.zzc[i], (List<String>) unsafe.getObject(t, j), zzaolVar);
                            break;
                        case 27:
                            i5 = i15;
                            zzand.zzb(zzamqVar.zzc[i], (List<?>) unsafe.getObject(t, j), zzaolVar, (zzanb<?>) zzamqVar.zze(i));
                            break;
                        case 28:
                            i5 = i15;
                            zzand.zza(zzamqVar.zzc[i], (List<zzajv>) unsafe.getObject(t, j), zzaolVar);
                            break;
                        case 29:
                            i5 = i15;
                            zzand.zzm(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 30:
                            i5 = i15;
                            zzand.zzc(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 31:
                            i5 = i15;
                            zzand.zzi(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 32:
                            i5 = i15;
                            zzand.zzj(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 33:
                            i5 = i15;
                            zzand.zzk(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 34:
                            i5 = i15;
                            zzand.zzl(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, false);
                            break;
                        case 35:
                            boolean z = i15;
                            zzand.zzb(zzamqVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zzaolVar, z);
                            i5 = z;
                            break;
                        case 36:
                            boolean z2 = i15;
                            zzand.zzf(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z2);
                            i5 = z2;
                            break;
                        case 37:
                            boolean z3 = i15;
                            zzand.zzh(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z3);
                            i5 = z3;
                            break;
                        case 38:
                            boolean z4 = i15;
                            zzand.zzn(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z4);
                            i5 = z4;
                            break;
                        case 39:
                            boolean z5 = i15;
                            zzand.zzg(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z5);
                            i5 = z5;
                            break;
                        case 40:
                            boolean z6 = i15;
                            zzand.zze(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z6);
                            i5 = z6;
                            break;
                        case 41:
                            boolean z7 = i15;
                            zzand.zzd(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z7);
                            i5 = z7;
                            break;
                        case 42:
                            boolean z8 = i15;
                            zzand.zza(zzamqVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zzaolVar, z8);
                            i5 = z8;
                            break;
                        case 43:
                            boolean z9 = i15;
                            zzand.zzm(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z9);
                            i5 = z9;
                            break;
                        case 44:
                            boolean z10 = i15;
                            zzand.zzc(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z10);
                            i5 = z10;
                            break;
                        case 45:
                            boolean z11 = i15;
                            zzand.zzi(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z11);
                            i5 = z11;
                            break;
                        case 46:
                            boolean z12 = i15;
                            zzand.zzj(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z12);
                            i5 = z12;
                            break;
                        case 47:
                            boolean z13 = i15;
                            zzand.zzk(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z13);
                            i5 = z13;
                            break;
                        case 48:
                            boolean z14 = i15;
                            zzand.zzl(zzamqVar.zzc[i], (List) unsafe.getObject(t, j), zzaolVar, z14);
                            i5 = z14;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzand.zza(zzamqVar.zzc[i], (List<?>) unsafe.getObject(t, j), zzaolVar, (zzanb<?>) zzamqVar.zze(i));
                            i5 = i15;
                            break;
                        case 50:
                            zzamqVar.zza(zzaolVar, i13, unsafe.getObject(t, j), i);
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, zza(t, j));
                            }
                            i5 = i15;
                            break;
                        case 52:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, zzb(t, j));
                            }
                            i5 = i15;
                            break;
                        case 53:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzb(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 54:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zze(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 55:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzc(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 56:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 57:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzb(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 58:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, zze(t, j));
                            }
                            i5 = i15;
                            break;
                        case 59:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zza(i13, unsafe.getObject(t, j), zzaolVar);
                            }
                            i5 = i15;
                            break;
                        case 60:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzb(i13, unsafe.getObject(t, j), zzamqVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        case 61:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, (zzajv) unsafe.getObject(t, j));
                            }
                            i5 = i15;
                            break;
                        case 62:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzf(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 63:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 64:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzd(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 65:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzc(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 66:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zze(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 67:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zzd(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 68:
                            if (zzamqVar.zzc((zzamq<T>) t, i13, i)) {
                                zzaolVar.zza(i13, unsafe.getObject(t, j), zzamqVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        default:
                            i5 = i15;
                            break;
                    }
                    i += 3;
                    i10 = i3;
                    it = it3;
                    i8 = 1048575;
                    i11 = i2;
                    entry = entry2;
                    i6 = i12;
                    i7 = i5;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzamqVar.zzq.zza(zzaolVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzamqVar.zzp, t, zzaolVar);
            }
        }
        entry = null;
        it = null;
        length = zzamqVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i102 = 0;
        int i112 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzamqVar.zzp, t, zzaolVar);
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t, zzaol zzaolVar) throws IOException {
        zzanuVar.zzb((zzanu<UT, UB>) zzanuVar.zzd(t), zzaolVar);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzamq<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i & 1048575));
    }
}
