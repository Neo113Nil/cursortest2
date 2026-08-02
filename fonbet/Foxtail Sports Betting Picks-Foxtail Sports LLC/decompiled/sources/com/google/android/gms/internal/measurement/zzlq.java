package com.google.android.gms.internal.measurement;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.getcapacitor.Bridge;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class zzlq<T> implements zzme<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlu zzn;
    private final zzkw zzo;
    private final zzmu<?, ?> zzp;
    private final zzjv<?> zzq;
    private final zzlj zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzmz.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzmz.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzng zzngVar, Class<?> cls, zzit zzitVar) throws IOException {
        switch (zzlt.zza[zzngVar.ordinal()]) {
            case 1:
                int zzd = zziu.zzd(bArr, i, zzitVar);
                zzitVar.zzc = Boolean.valueOf(zzitVar.zzb != 0);
                return zzd;
            case 2:
                return zziu.zza(bArr, i, zzitVar);
            case 3:
                zzitVar.zzc = Double.valueOf(zziu.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzitVar.zzc = Integer.valueOf(zziu.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzitVar.zzc = Long.valueOf(zziu.zzd(bArr, i));
                return i + 8;
            case 8:
                zzitVar.zzc = Float.valueOf(zziu.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zziu.zzc(bArr, i, zzitVar);
                zzitVar.zzc = Integer.valueOf(zzitVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zziu.zzd(bArr, i, zzitVar);
                zzitVar.zzc = Long.valueOf(zzitVar.zzb);
                return zzd2;
            case 14:
                return zziu.zza(zzma.zza().zza((Class) cls), bArr, i, i2, zzitVar);
            case 15:
                int zzc2 = zziu.zzc(bArr, i, zzitVar);
                zzitVar.zzc = Integer.valueOf(zzjk.zze(zzitVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zziu.zzd(bArr, i, zzitVar);
                zzitVar.zzc = Long.valueOf(zzjk.zza(zzitVar.zzb));
                return zzd3;
            case 17:
                return zziu.zzb(bArr, i, zzitVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzme
    public final int zza(T t) {
        int i;
        int zza2;
        int zza3;
        int zzb2;
        int zzd;
        int zzf;
        int zzg;
        zzlq<T> zzlqVar = this;
        T t2 = t;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzlqVar.zzc.length) {
            int zzc = zzlqVar.zzc(i3);
            int i7 = (267386880 & zzc) >>> 20;
            int[] iArr = zzlqVar.zzc;
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
            if (i7 >= zzkb.DOUBLE_LIST_PACKED.zza()) {
                zzkb.SINT64_LIST_PACKED.zza();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzjn.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zza(i8, 0.0f);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zzb(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zze(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zzc(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zza(i8, 0L);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zzb(i8, 0);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zza(i8, true);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zziy) {
                            zzb2 = zzjn.zza(i8, (zziy) object);
                        } else {
                            zzb2 = zzjn.zza(i8, (String) object);
                        }
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzmg.zza(i8, unsafe.getObject(t2, j), (zzme<?>) zzlqVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zza(i8, (zziy) unsafe.getObject(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zzf(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zza(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zzd(i8, 0);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzjn.zzc(i8, 0L);
                        i5 = i11 + zza3;
                        zzlqVar = this;
                        t2 = t;
                        break;
                    }
                    zzlqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zze(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzjn.zzd(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzlqVar = this;
                        break;
                    }
                    zzlqVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzlqVar.zza((zzlq<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzjn.zza(i8, (zzlm) unsafe.getObject(t2, j), zzlqVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    zza2 = zzmg.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 19:
                    zza2 = zzmg.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 20:
                    zza2 = zzmg.zzf(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 21:
                    zza2 = zzmg.zzj(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 22:
                    zza2 = zzmg.zze(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 23:
                    zza2 = zzmg.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 24:
                    zza2 = zzmg.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 25:
                    zza2 = zzmg.zza(i8, (List<?>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 26:
                    zza2 = zzmg.zzb(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case 27:
                    zza2 = zzmg.zzb(i8, (List<?>) unsafe.getObject(t2, j), (zzme<?>) zzlqVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 28:
                    zza2 = zzmg.zza(i8, (List<zziy>) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case 29:
                    zza2 = zzmg.zzi(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 30:
                    zza2 = zzmg.zzb(i8, (List<Integer>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zza2 = zzmg.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 32:
                    zza2 = zzmg.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 33:
                    zza2 = zzmg.zzg(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 34:
                    zza2 = zzmg.zzh(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 35:
                    zzd = zzmg.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    zzd = zzmg.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    zzd = zzmg.zzf((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzd = zzmg.zzj((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    zzd = zzmg.zze((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    zzd = zzmg.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    zzd = zzmg.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    zzd = zzmg.zza((List<?>) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzd = zzmg.zzi((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    zzd = zzmg.zzb((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    zzd = zzmg.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzd = zzmg.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzd = zzmg.zzg((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    zzd = zzmg.zzh((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzjn.zzf(i8);
                        zzg = zzjn.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 49:
                    zza2 = zzmg.zza(i8, (List<zzlm>) unsafe.getObject(t2, j), (zzme<?>) zzlqVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 50:
                    zza2 = zzlqVar.zzr.zza(i8, unsafe.getObject(t2, j), zzlqVar.zzf(i3));
                    i5 = i11 + zza2;
                    break;
                case 51:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 52:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, 0.0f);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 53:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzb(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 54:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zze(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzc(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzb(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, true);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zziy) {
                            zza2 = zzjn.zza(i8, (zziy) object2);
                        } else {
                            zza2 = zzjn.zza(i8, (String) object2);
                        }
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzmg.zza(i8, unsafe.getObject(t2, j), (zzme<?>) zzlqVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, (zziy) unsafe.getObject(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 62:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzf(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzd(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 65:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzc(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 66:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zze(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 67:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zzd(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzlqVar.zzc((zzlq<T>) t2, i8, i3)) {
                        zza2 = zzjn.zza(i8, (zzlm) unsafe.getObject(t2, j), zzlqVar.zze(i3));
                        i5 = i11 + zza2;
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
        zzmu<?, ?> zzmuVar = zzlqVar.zzp;
        int zza4 = i5 + zzmuVar.zza((zzmu<?, ?>) zzmuVar.zzd(t2));
        if (!zzlqVar.zzh) {
            return zza4;
        }
        zzjw<?> zza5 = zzlqVar.zzq.zza(t2);
        int zzb3 = zza5.zza.zzb();
        int i12 = 0;
        for (int i13 = 0; i13 < zzb3; i13++) {
            Map.Entry<?, Object> zza6 = zza5.zza.zza(i13);
            i12 += zzjw.zza((zzjy<?>) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzc()) {
            i12 += zzjw.zza((zzjy<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final int zzb(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzkj.zza(Double.doubleToLongBits(zzmz.zza(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzmz.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzh(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzmz.zze(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zzmz.zze(t, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzmz.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzmz.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzkj.zza(zzmz.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zzmz.zze(t, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzmz.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzmz.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzmz.zze(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmz.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmz.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkj.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlq<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmz.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t).hashCode() : hashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzmz.zze(t, j)).intValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.measurement.zzit r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzit):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
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

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzmz.zze(t, j)).longValue();
    }

    private final zzkl zzd(int i) {
        return (zzkl) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzlq<T> zza(Class<T> cls, zzlk zzlkVar, zzlu zzluVar, zzkw zzkwVar, zzmu<?, ?> zzmuVar, zzjv<?> zzjvVar, zzlj zzljVar) {
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
        zzmc zzmcVar;
        int i17;
        int[] iArr2;
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zza2;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (zzlkVar instanceof zzmc) {
            zzmc zzmcVar2 = (zzmc) zzlkVar;
            String zzd = zzmcVar2.zzd();
            int length = zzd.length();
            char c = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i32 = 1;
                while (true) {
                    i = i32 + 1;
                    if (zzd.charAt(i32) < 55296) {
                        break;
                    }
                    i32 = i;
                }
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt15 = zzd.charAt(i);
            if (charAt15 >= 55296) {
                int i34 = charAt15 & 8191;
                int i35 = 13;
                while (true) {
                    i31 = i33 + 1;
                    charAt14 = zzd.charAt(i33);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i34 |= (charAt14 & 8191) << i35;
                    i35 += 13;
                    i33 = i31;
                }
                charAt15 = i34 | (charAt14 << i35);
                i33 = i31;
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
                int i36 = i33 + 1;
                int charAt16 = zzd.charAt(i33);
                if (charAt16 >= 55296) {
                    int i37 = charAt16 & 8191;
                    int i38 = 13;
                    while (true) {
                        i15 = i36 + 1;
                        charAt9 = zzd.charAt(i36);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i37 |= (charAt9 & 8191) << i38;
                        i38 += 13;
                        i36 = i15;
                    }
                    charAt16 = i37 | (charAt9 << i38);
                    i36 = i15;
                }
                int i39 = i36 + 1;
                int charAt17 = zzd.charAt(i36);
                if (charAt17 >= 55296) {
                    int i40 = charAt17 & 8191;
                    int i41 = 13;
                    while (true) {
                        i14 = i39 + 1;
                        charAt8 = zzd.charAt(i39);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i40 |= (charAt8 & 8191) << i41;
                        i41 += 13;
                        i39 = i14;
                    }
                    charAt17 = i40 | (charAt8 << i41);
                    i39 = i14;
                }
                int i42 = i39 + 1;
                int charAt18 = zzd.charAt(i39);
                if (charAt18 >= 55296) {
                    int i43 = charAt18 & 8191;
                    int i44 = 13;
                    while (true) {
                        i13 = i42 + 1;
                        charAt7 = zzd.charAt(i42);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i43 |= (charAt7 & 8191) << i44;
                        i44 += 13;
                        i42 = i13;
                    }
                    charAt18 = i43 | (charAt7 << i44);
                    i42 = i13;
                }
                int i45 = i42 + 1;
                int charAt19 = zzd.charAt(i42);
                if (charAt19 >= 55296) {
                    int i46 = charAt19 & 8191;
                    int i47 = 13;
                    while (true) {
                        i12 = i45 + 1;
                        charAt6 = zzd.charAt(i45);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i46 |= (charAt6 & 8191) << i47;
                        i47 += 13;
                        i45 = i12;
                    }
                    charAt19 = i46 | (charAt6 << i47);
                    i45 = i12;
                }
                int i48 = i45 + 1;
                charAt = zzd.charAt(i45);
                if (charAt >= 55296) {
                    int i49 = charAt & 8191;
                    int i50 = 13;
                    while (true) {
                        i11 = i48 + 1;
                        charAt5 = zzd.charAt(i48);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i49 |= (charAt5 & 8191) << i50;
                        i50 += 13;
                        i48 = i11;
                    }
                    charAt = i49 | (charAt5 << i50);
                    i48 = i11;
                }
                int i51 = i48 + 1;
                int charAt20 = zzd.charAt(i48);
                if (charAt20 >= 55296) {
                    int i52 = charAt20 & 8191;
                    int i53 = 13;
                    while (true) {
                        i10 = i51 + 1;
                        charAt4 = zzd.charAt(i51);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i52 |= (charAt4 & 8191) << i53;
                        i53 += 13;
                        i51 = i10;
                    }
                    charAt20 = i52 | (charAt4 << i53);
                    i51 = i10;
                }
                int i54 = i51 + 1;
                int charAt21 = zzd.charAt(i51);
                if (charAt21 >= 55296) {
                    int i55 = charAt21 & 8191;
                    int i56 = 13;
                    while (true) {
                        i9 = i54 + 1;
                        charAt3 = zzd.charAt(i54);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i55 |= (charAt3 & 8191) << i56;
                        i56 += 13;
                        i54 = i9;
                    }
                    charAt21 = i55 | (charAt3 << i56);
                    i54 = i9;
                }
                int i57 = i54 + 1;
                int charAt22 = zzd.charAt(i54);
                if (charAt22 >= 55296) {
                    int i58 = charAt22 & 8191;
                    int i59 = 13;
                    while (true) {
                        i8 = i57 + 1;
                        charAt2 = zzd.charAt(i57);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i58 |= (charAt2 & 8191) << i59;
                        i59 += 13;
                        i57 = i8;
                    }
                    charAt22 = i58 | (charAt2 << i59);
                    i57 = i8;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                int i60 = (charAt16 << 1) + charAt17;
                int i61 = charAt20;
                i2 = charAt18;
                i3 = i61;
                i4 = charAt19;
                i5 = i60;
                iArr = iArr3;
                i6 = charAt16;
                i7 = charAt22;
                i33 = i57;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzmcVar2.zze();
            Class<?> cls2 = zzmcVar2.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i62 = i7 + i3;
            int i63 = i7;
            int i64 = i62;
            int i65 = 0;
            int i66 = 0;
            while (i33 < length) {
                int i67 = i33 + 1;
                int charAt23 = zzd.charAt(i33);
                if (charAt23 >= c) {
                    int i68 = charAt23 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i30 = i69 + 1;
                        charAt13 = zzd.charAt(i69);
                        if (charAt13 < c) {
                            break;
                        }
                        i68 |= (charAt13 & 8191) << i70;
                        i70 += 13;
                        i69 = i30;
                    }
                    charAt23 = i68 | (charAt13 << i70);
                    i16 = i30;
                } else {
                    i16 = i67;
                }
                int i71 = i16 + 1;
                int charAt24 = zzd.charAt(i16);
                if (charAt24 >= c) {
                    int i72 = charAt24 & 8191;
                    int i73 = i71;
                    int i74 = 13;
                    while (true) {
                        i29 = i73 + 1;
                        charAt12 = zzd.charAt(i73);
                        zzmcVar = zzmcVar2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i72 |= (charAt12 & 8191) << i74;
                        i74 += 13;
                        i73 = i29;
                        zzmcVar2 = zzmcVar;
                    }
                    charAt24 = i72 | (charAt12 << i74);
                    i17 = i29;
                } else {
                    zzmcVar = zzmcVar2;
                    i17 = i71;
                }
                int i75 = charAt24 & 255;
                int i76 = length;
                if ((charAt24 & 1024) != 0) {
                    iArr[i66] = i65;
                    i66++;
                }
                int i77 = charAt23;
                if (i75 >= 51) {
                    i21 = i17 + 1;
                    int charAt25 = zzd.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i78 = charAt25 & 8191;
                        int i79 = 13;
                        while (true) {
                            i28 = i21 + 1;
                            charAt11 = zzd.charAt(i21);
                            if (charAt11 < c2) {
                                break;
                            }
                            i78 |= (charAt11 & 8191) << i79;
                            i79 += 13;
                            i21 = i28;
                            c2 = 55296;
                        }
                        charAt25 = i78 | (charAt11 << i79);
                        i21 = i28;
                    }
                    int i80 = i75 - 51;
                    int i81 = charAt25;
                    if (i80 == 9 || i80 == 17) {
                        i27 = i5 + 1;
                        objArr[((i65 / 3) << 1) + 1] = zze[i5];
                    } else {
                        if (i80 == 12 && (zzmcVar.zzb().equals(zzmb.PROTO2) || (charAt24 & 2048) != 0)) {
                            i27 = i5 + 1;
                            objArr[((i65 / 3) << 1) + 1] = zze[i5];
                        }
                        int i82 = i81 << 1;
                        obj = zze[i82];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i82] = zza3;
                        }
                        iArr2 = iArr4;
                        i18 = i6;
                        i22 = (int) unsafe.objectFieldOffset(zza3);
                        int i83 = i82 + 1;
                        obj2 = zze[i83];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i83] = zza4;
                        }
                        i23 = (int) unsafe.objectFieldOffset(zza4);
                        i24 = i5;
                        str = zzd;
                        i20 = 0;
                    }
                    i5 = i27;
                    int i822 = i81 << 1;
                    obj = zze[i822];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    i18 = i6;
                    i22 = (int) unsafe.objectFieldOffset(zza3);
                    int i832 = i822 + 1;
                    obj2 = zze[i832];
                    if (!(obj2 instanceof Field)) {
                    }
                    i23 = (int) unsafe.objectFieldOffset(zza4);
                    i24 = i5;
                    str = zzd;
                    i20 = 0;
                } else {
                    iArr2 = iArr4;
                    i18 = i6;
                    int i84 = i5 + 1;
                    Field zza5 = zza(cls2, (String) zze[i5]);
                    if (i75 == 9 || i75 == 17) {
                        objArr[((i65 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i75 == 27 || i75 == 49) {
                            i26 = i5 + 2;
                            objArr[((i65 / 3) << 1) + 1] = zze[i84];
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            if (zzmcVar.zzb() == zzmb.PROTO2 || (charAt24 & 2048) != 0) {
                                i26 = i5 + 2;
                                objArr[((i65 / 3) << 1) + 1] = zze[i84];
                            }
                        } else if (i75 == 50) {
                            int i85 = i63 + 1;
                            iArr[i63] = i65;
                            int i86 = (i65 / 3) << 1;
                            int i87 = i5 + 2;
                            objArr[i86] = zze[i84];
                            if ((charAt24 & 2048) != 0) {
                                i84 = i5 + 3;
                                objArr[i86 + 1] = zze[i87];
                                i63 = i85;
                            } else {
                                i63 = i85;
                                i84 = i87;
                            }
                        }
                        i84 = i26;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) == 0 || i75 > 17) {
                        str = zzd;
                        i19 = 1048575;
                        i20 = 0;
                    } else {
                        int i88 = i17 + 1;
                        int charAt26 = zzd.charAt(i17);
                        if (charAt26 >= 55296) {
                            int i89 = charAt26 & 8191;
                            int i90 = 13;
                            while (true) {
                                i25 = i88 + 1;
                                charAt10 = zzd.charAt(i88);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i89 |= (charAt10 & 8191) << i90;
                                i90 += 13;
                                i88 = i25;
                            }
                            charAt26 = i89 | (charAt10 << i90);
                            i88 = i25;
                        }
                        int i91 = (i18 << 1) + (charAt26 / 32);
                        Object obj3 = zze[i91];
                        int i92 = charAt26;
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls2, (String) obj3);
                            zze[i91] = zza2;
                        }
                        str = zzd;
                        i20 = i92 % 32;
                        int i93 = i88;
                        i19 = (int) unsafe.objectFieldOffset(zza2);
                        i17 = i93;
                    }
                    if (i75 < 18 || i75 > 49) {
                        int i94 = i84;
                        i21 = i17;
                        i22 = objectFieldOffset;
                        i23 = i19;
                        i24 = i94;
                    } else {
                        int i95 = i64 + 1;
                        iArr[i64] = objectFieldOffset;
                        int i96 = i84;
                        i21 = i17;
                        i22 = objectFieldOffset;
                        i23 = i19;
                        i24 = i96;
                        i64 = i95;
                    }
                }
                int i97 = i65 + 1;
                iArr2[i65] = i77;
                int i98 = i65 + 2;
                iArr2[i97] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i22;
                i65 += 3;
                iArr2[i98] = (i20 << 20) | i23;
                i33 = i21;
                zzd = str;
                length = i76;
                zzmcVar2 = zzmcVar;
                i6 = i18;
                c = 55296;
                i5 = i24;
                iArr4 = iArr2;
            }
            return new zzlq<>(iArr4, objArr, i2, i4, zzmcVar2.zza(), false, iArr, i7, i62, zzluVar, zzkwVar, zzmuVar, zzjvVar, zzljVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzme zze(int i) {
        int i2 = (i / 3) << 1;
        zzme zzmeVar = (zzme) this.zzd[i2];
        if (zzmeVar != null) {
            return zzmeVar;
        }
        zzme<T> zza2 = zzma.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    static zzmx zzc(Object obj) {
        zzkg zzkgVar = (zzkg) obj;
        zzmx zzmxVar = zzkgVar.zzb;
        if (zzmxVar != zzmx.zzc()) {
            return zzmxVar;
        }
        zzmx zzd = zzmx.zzd();
        zzkgVar.zzb = zzd;
        return zzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmu<UT, UB> zzmuVar, Object obj2) {
        zzkl zzd;
        int i2 = this.zzc[i];
        Object zze = zzmz.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(zze), zzd, (zzkl) ub, (zzmu<UT, zzkl>) zzmuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzkl zzklVar, UB ub, zzmu<UT, UB> zzmuVar, Object obj) {
        zzlh<?, ?> zza2 = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzklVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmuVar.zzc(obj);
                }
                zzjd zzc = zziy.zzc(zzle.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzle.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmuVar.zza((zzmu<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzme zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzlq<T>) t, i)) {
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
        zzme zze = zze(i2);
        if (!zzc((zzlq<T>) t, i, i2)) {
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

    @Override // com.google.android.gms.internal.measurement.zzme
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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzlq(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, int[] iArr2, int i3, int i4, zzlu zzluVar, zzkw zzkwVar, zzmu<?, ?> zzmuVar, zzjv<?> zzjvVar, zzlj zzljVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzlmVar instanceof zzkg;
        this.zzh = zzjvVar != null && zzjvVar.zza(zzlmVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzluVar;
        this.zzo = zzkwVar;
        this.zzp = zzmuVar;
        this.zzq = zzjvVar;
        this.zzg = zzlmVar;
        this.zzr = zzljVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zzd(T t) {
        if (zzg(t)) {
            if (t instanceof zzkg) {
                zzkg zzkgVar = (zzkg) t;
                zzkgVar.zzc(Integer.MAX_VALUE);
                zzkgVar.zza = 0;
                zzkgVar.zzcp();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzlq<T>) t, this.zzc[i], i)) {
                            zze(i).zzd(zzb.getObject(t, j));
                        }
                    } else {
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
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case 44:
                            case 45:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
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
                    }
                }
                if (zzc((zzlq<T>) t, i)) {
                    zze(i).zzd(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza(t, j, zzmz.zza(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzb(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzd(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzd(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzd(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zzc(t, j, zzmz.zzh(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza(t, j, zzmz.zze(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza(t, j, zzmz.zze(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzd(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzc(t2, j));
                        zzb((zzlq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlq<T>) t2, i)) {
                        zzmz.zza((Object) t, j, zzmz.zzd(t2, j));
                        zzb((zzlq<T>) t, i);
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzmg.zza(this.zzr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzlq<T>) t2, i2, i)) {
                        zzmz.zza(t, j, zzmz.zze(t2, j));
                        zzb((zzlq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlq<T>) t2, i2, i)) {
                        zzmz.zza(t, j, zzmz.zze(t2, j));
                        zzb((zzlq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzmg.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzmg.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x059e A[Catch: all -> 0x05cd, TryCatch #7 {all -> 0x05cd, blocks: (B:106:0x0599, B:108:0x059e, B:109:0x05a3), top: B:105:0x0599 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05de A[LOOP:1: B:28:0x05da->B:30:0x05de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05f1  */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzmf zzmfVar, zzjt zzjtVar) throws IOException {
        T t2;
        int i;
        Object obj;
        zzjv<?> zzjvVar;
        zzlq<T> zzlqVar;
        zzjt zzjtVar2;
        T t3;
        Object zza2;
        T t4;
        zzlq<T> zzlqVar2 = this;
        zzjt zzjtVar3 = zzjtVar;
        zzjtVar3.getClass();
        zzf(t);
        zzmu zzmuVar = zzlqVar2.zzp;
        zzjv<?> zzjvVar2 = zzlqVar2.zzq;
        Object obj2 = null;
        zzjw<?> zzjwVar = null;
        while (true) {
            try {
                int zzc = zzmfVar.zzc();
                int zza3 = zzlqVar2.zza(zzc);
                if (zza3 >= 0) {
                    zzjvVar = zzjvVar2;
                    zzlqVar = zzlqVar2;
                    zzjtVar2 = zzjtVar3;
                    t3 = t;
                    int zzc2 = zzlqVar.zzc(zza3);
                    switch ((267386880 & zzc2) >>> 20) {
                        case 0:
                            zzmz.zza(t3, zzc2 & 1048575, zzmfVar.zza());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 1:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzb());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 2:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzl());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 3:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzo());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 4:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzg());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 5:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzk());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 6:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzf());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 7:
                            zzmz.zzc(t3, zzc2 & 1048575, zzmfVar.zzs());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 8:
                            zzlqVar.zza((Object) t3, zzc2, zzmfVar);
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 9:
                            zzlm zzlmVar = (zzlm) zzlqVar.zza((zzlq<T>) t3, zza3);
                            zzmfVar.zzb((zzmf) zzlmVar, (zzme<zzmf>) zzlqVar.zze(zza3), zzjtVar2);
                            zzlqVar.zza((zzlq<T>) t3, zza3, zzlmVar);
                            break;
                        case 10:
                            zzmz.zza(t3, zzc2 & 1048575, zzmfVar.zzp());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 11:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzj());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 12:
                            int zze = zzmfVar.zze();
                            zzkl zzd = zzlqVar.zzd(zza3);
                            if (zzd != null && !zzd.zza(zze)) {
                                obj2 = zzmg.zza(t3, zzc, zze, obj2, zzmuVar);
                                break;
                            }
                            zzmz.zza((Object) t3, zzc2 & 1048575, zze);
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 13:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzh());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 14:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzm());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 15:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzi());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 16:
                            zzmz.zza((Object) t3, zzc2 & 1048575, zzmfVar.zzn());
                            zzlqVar.zzb((zzlq<T>) t3, zza3);
                            break;
                        case 17:
                            zzlm zzlmVar2 = (zzlm) zzlqVar.zza((zzlq<T>) t3, zza3);
                            zzmfVar.zza((zzmf) zzlmVar2, (zzme<zzmf>) zzlqVar.zze(zza3), zzjtVar2);
                            zzlqVar.zza((zzlq<T>) t3, zza3, zzlmVar2);
                            break;
                        case 18:
                            zzmfVar.zzc(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 19:
                            zzmfVar.zzg(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 20:
                            zzmfVar.zzi(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 21:
                            zzmfVar.zzq(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 22:
                            zzmfVar.zzh(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 23:
                            zzmfVar.zzf(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 24:
                            zzmfVar.zze(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 25:
                            zzmfVar.zza(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 26:
                            boolean zzg = zzg(zzc2);
                            zzkw zzkwVar = zzlqVar.zzo;
                            if (zzg) {
                                zzmfVar.zzo(zzkwVar.zza(t3, zzc2 & 1048575));
                                break;
                            } else {
                                zzmfVar.zzn(zzkwVar.zza(t3, zzc2 & 1048575));
                                break;
                            }
                        case 27:
                            zzmfVar.zzb((List) zzlqVar.zzo.zza(t3, zzc2 & 1048575), (zzme) zzlqVar.zze(zza3), zzjtVar2);
                            break;
                        case 28:
                            zzmfVar.zzb(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 29:
                            zzmfVar.zzp(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 30:
                            List<Integer> zza4 = zzlqVar.zzo.zza(t3, zzc2 & 1048575);
                            zzmfVar.zzd(zza4);
                            zzkl zzd2 = zzlqVar.zzd(zza3);
                            Object obj3 = obj2;
                            zzmu zzmuVar2 = zzmuVar;
                            zza2 = zzmg.zza(t3, zzc, zza4, zzd2, obj3, zzmuVar2);
                            zzmuVar = zzmuVar2;
                            obj2 = zza2;
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zzmfVar.zzj(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 32:
                            zzmfVar.zzk(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 33:
                            zzmfVar.zzl(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 34:
                            zzmfVar.zzm(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 35:
                            zzmfVar.zzc(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 36:
                            zzmfVar.zzg(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 37:
                            zzmfVar.zzi(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            zzmfVar.zzq(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 39:
                            zzmfVar.zzh(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 40:
                            zzmfVar.zzf(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 41:
                            zzmfVar.zze(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            zzmfVar.zza(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            zzmfVar.zzp(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 44:
                            List<Integer> zza5 = zzlqVar.zzo.zza(t3, zzc2 & 1048575);
                            zzmfVar.zzd(zza5);
                            zzkl zzd3 = zzlqVar.zzd(zza3);
                            Object obj4 = obj2;
                            zzmu zzmuVar3 = zzmuVar;
                            try {
                                zza2 = zzmg.zza(t3, zzc, zza5, zzd3, obj4, zzmuVar3);
                                zzmuVar = zzmuVar3;
                                obj2 = zza2;
                                break;
                            } catch (zzko unused) {
                                obj2 = obj4;
                                zzmuVar = zzmuVar3;
                                t4 = t3;
                                zzlqVar2 = zzlqVar;
                                try {
                                    zzmuVar.zza(zzmfVar);
                                    if (obj2 == null) {
                                    }
                                    if (zzmuVar.zza((zzmu) obj2, zzmfVar, 0)) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t4;
                                    i = zzlqVar2.zzl;
                                    obj = obj2;
                                    while (i < zzlqVar2.zzm) {
                                    }
                                    T t5 = t2;
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj4;
                                zzmuVar = zzmuVar3;
                                t2 = t3;
                                zzlqVar2 = zzlqVar;
                                i = zzlqVar2.zzl;
                                obj = obj2;
                                while (i < zzlqVar2.zzm) {
                                }
                                T t52 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            zzmfVar.zzj(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            zzmfVar.zzk(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            zzmfVar.zzl(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 48:
                            zzmfVar.zzm(zzlqVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 49:
                            zzmfVar.zza((List) zzlqVar.zzo.zza(t3, zzc2 & 1048575), (zzme) zzlqVar.zze(zza3), zzjtVar2);
                            break;
                        case 50:
                            Object zzf = zzlqVar.zzf(zza3);
                            long zzc3 = zzlqVar.zzc(zza3) & 1048575;
                            Object zze2 = zzmz.zze(t3, zzc3);
                            zzlj zzljVar = zzlqVar.zzr;
                            if (zze2 == null) {
                                zze2 = zzljVar.zzb(zzf);
                                zzmz.zza(t3, zzc3, zze2);
                            } else if (zzljVar.zzf(zze2)) {
                                Object zzb2 = zzlqVar.zzr.zzb(zzf);
                                zzlqVar.zzr.zza(zzb2, zze2);
                                zzmz.zza(t3, zzc3, zzb2);
                                zze2 = zzb2;
                            }
                            zzmfVar.zza(zzlqVar.zzr.zze(zze2), zzlqVar.zzr.zza(zzf), zzjtVar2);
                            break;
                        case 51:
                            zzmz.zza(t3, zzc2 & 1048575, Double.valueOf(zzmfVar.zza()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 52:
                            zzmz.zza(t3, zzc2 & 1048575, Float.valueOf(zzmfVar.zzb()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 53:
                            zzmz.zza(t3, zzc2 & 1048575, Long.valueOf(zzmfVar.zzl()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 54:
                            zzmz.zza(t3, zzc2 & 1048575, Long.valueOf(zzmfVar.zzo()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzmfVar.zzg()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 56:
                            zzmz.zza(t3, zzc2 & 1048575, Long.valueOf(zzmfVar.zzk()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 57:
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzmfVar.zzf()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 58:
                            zzmz.zza(t3, zzc2 & 1048575, Boolean.valueOf(zzmfVar.zzs()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 59:
                            zzlqVar.zza((Object) t3, zzc2, zzmfVar);
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 60:
                            zzlm zzlmVar3 = (zzlm) zzlqVar.zza((zzlq<T>) t3, zzc, zza3);
                            zzmfVar.zzb((zzmf) zzlmVar3, (zzme<zzmf>) zzlqVar.zze(zza3), zzjtVar2);
                            zzlqVar.zza((zzlq<T>) t3, zzc, zza3, zzlmVar3);
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            zzmz.zza(t3, zzc2 & 1048575, zzmfVar.zzp());
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 62:
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzmfVar.zzj()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            int zze3 = zzmfVar.zze();
                            zzkl zzd4 = zzlqVar.zzd(zza3);
                            if (zzd4 != null && !zzd4.zza(zze3)) {
                                obj2 = zzmg.zza(t3, zzc, zze3, obj2, zzmuVar);
                                break;
                            }
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zze3));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 64:
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzmfVar.zzh()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 65:
                            zzmz.zza(t3, zzc2 & 1048575, Long.valueOf(zzmfVar.zzm()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 66:
                            zzmz.zza(t3, zzc2 & 1048575, Integer.valueOf(zzmfVar.zzi()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 67:
                            zzmz.zza(t3, zzc2 & 1048575, Long.valueOf(zzmfVar.zzn()));
                            zzlqVar.zzb((zzlq<T>) t3, zzc, zza3);
                            break;
                        case 68:
                            zzlm zzlmVar4 = (zzlm) zzlqVar.zza((zzlq<T>) t3, zzc, zza3);
                            zzmfVar.zza((zzmf) zzlmVar4, (zzme<zzmf>) zzlqVar.zze(zza3), zzjtVar2);
                            zzlqVar.zza((zzlq<T>) t3, zzc, zza3, zzlmVar4);
                            break;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzmuVar.zzc(t3);
                                } catch (zzko unused2) {
                                    t4 = t3;
                                    zzlqVar2 = zzlqVar;
                                    zzmuVar.zza(zzmfVar);
                                    if (obj2 == null) {
                                        obj2 = zzmuVar.zzc(t4);
                                    }
                                    if (zzmuVar.zza((zzmu) obj2, zzmfVar, 0)) {
                                        int i2 = zzlqVar2.zzl;
                                        Object obj5 = obj2;
                                        while (i2 < zzlqVar2.zzm) {
                                            T t6 = t4;
                                            obj5 = zzlqVar2.zza((Object) t6, zzlqVar2.zzk[i2], (int) obj5, (zzmu<UT, int>) zzmuVar, (Object) t);
                                            i2++;
                                            t4 = t6;
                                        }
                                        T t7 = t4;
                                        if (obj5 != null) {
                                            zzmuVar.zzb((Object) t7, (T) obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    zzjtVar3 = zzjtVar2;
                                    zzjvVar2 = zzjvVar;
                                }
                            }
                            try {
                                if (!zzmuVar.zza((zzmu) obj2, zzmfVar, 0)) {
                                    int i3 = zzlqVar.zzl;
                                    Object obj6 = obj2;
                                    while (i3 < zzlqVar.zzm) {
                                        T t8 = t3;
                                        obj6 = zzlqVar.zza((Object) t8, zzlqVar.zzk[i3], (int) obj6, (zzmu<UT, int>) zzmuVar, (Object) t);
                                        i3++;
                                        t3 = t8;
                                    }
                                    T t9 = t3;
                                    if (obj6 != null) {
                                        zzmuVar.zzb((Object) t9, (T) obj6);
                                        return;
                                    }
                                    return;
                                }
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                t4 = t3;
                                zzlqVar2 = zzlqVar;
                                t2 = t4;
                                i = zzlqVar2.zzl;
                                obj = obj2;
                                while (i < zzlqVar2.zzm) {
                                }
                                T t522 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i4 = zzlqVar2.zzl;
                    Object obj7 = obj2;
                    while (i4 < zzlqVar2.zzm) {
                        obj7 = zzlqVar2.zza((Object) t, zzlqVar2.zzk[i4], (int) obj7, (zzmu<UT, int>) zzmuVar, (Object) t);
                        i4++;
                        zzlqVar2 = zzlqVar2;
                    }
                    zzlqVar = zzlqVar2;
                    if (obj7 != null) {
                        zzmuVar.zzb((Object) t, (T) obj7);
                    }
                } else {
                    zzlqVar = zzlqVar2;
                    t3 = t;
                    try {
                        Object zza6 = !zzlqVar.zzh ? null : zzjvVar2.zza(zzjtVar3, zzlqVar.zzg, zzc);
                        if (zza6 != null) {
                            if (zzjwVar == null) {
                                zzjwVar = zzjvVar2.zzb(t3);
                            }
                            zzjw<?> zzjwVar2 = zzjwVar;
                            zzmu zzmuVar4 = zzmuVar;
                            try {
                                obj2 = zzjvVar2.zza(t3, zzmfVar, zza6, zzjtVar3, zzjwVar2, obj2, zzmuVar4);
                                zzjwVar = zzjwVar2;
                                zzmuVar = zzmuVar4;
                                zzjvVar = zzjvVar2;
                                zzjtVar2 = zzjtVar3;
                            } catch (Throwable th4) {
                                th = th4;
                                t2 = t3;
                                zzmuVar = zzmuVar4;
                                zzlqVar2 = zzlqVar;
                                i = zzlqVar2.zzl;
                                obj = obj2;
                                while (i < zzlqVar2.zzm) {
                                }
                                T t5222 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzjvVar = zzjvVar2;
                            t2 = t3;
                            zzjtVar2 = zzjtVar3;
                            try {
                                zzmuVar.zza(zzmfVar);
                                if (obj2 == null) {
                                    try {
                                        obj2 = zzmuVar.zzc(t2);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        zzlqVar2 = zzlqVar;
                                        i = zzlqVar2.zzl;
                                        obj = obj2;
                                        while (i < zzlqVar2.zzm) {
                                            obj = zzlqVar2.zza((Object) t2, zzlqVar2.zzk[i], (int) obj, (zzmu<UT, int>) zzmuVar, (Object) t);
                                            i++;
                                            zzlqVar2 = this;
                                        }
                                        T t52222 = t2;
                                        if (obj != null) {
                                            zzmuVar.zzb((Object) t52222, (T) obj);
                                        }
                                        throw th;
                                    }
                                }
                                if (!zzmuVar.zza((zzmu) obj2, zzmfVar, 0)) {
                                    Object obj8 = obj2;
                                    for (int i5 = zzlqVar.zzl; i5 < zzlqVar.zzm; i5++) {
                                        obj8 = zzlqVar.zza((Object) t2, zzlqVar.zzk[i5], (int) obj8, (zzmu<UT, int>) zzmuVar, (Object) t);
                                    }
                                    if (obj8 != null) {
                                        zzmuVar.zzb((Object) t2, (T) obj8);
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        t2 = t3;
                        zzlqVar2 = zzlqVar;
                        i = zzlqVar2.zzl;
                        obj = obj2;
                        while (i < zzlqVar2.zzm) {
                        }
                        T t522222 = t2;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
                zzlqVar2 = zzlqVar;
                zzjtVar3 = zzjtVar2;
                zzjvVar2 = zzjvVar;
            } catch (Throwable th8) {
                th = th8;
                t2 = t;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, byte[] bArr, int i, int i2, zzit zzitVar) throws IOException {
        zza((zzlq<T>) t, bArr, i, i2, 0, zzitVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzlq<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzme zze = zze(i);
            if (!zzc((zzlq<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzlq<T>) t, i);
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzlq<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzme zze = zze(i);
            if (!zzc((zzlq<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzlq<T>) t, i2, i);
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
        }
    }

    private final void zza(Object obj, int i, zzmf zzmfVar) throws IOException {
        if (zzg(i)) {
            zzmz.zza(obj, i & 1048575, zzmfVar.zzr());
        } else if (this.zzi) {
            zzmz.zza(obj, i & 1048575, zzmfVar.zzq());
        } else {
            zzmz.zza(obj, i & 1048575, zzmfVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzmz.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zzmz.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzmz.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzlq<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzlq<T>) t, i, i2);
    }

    private final <K, V> void zza(zznl zznlVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznlVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zznl zznlVar) throws IOException {
        if (obj instanceof String) {
            zznlVar.zza(i, (String) obj);
        } else {
            zznlVar.zza(i, (zziy) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a5f  */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zznl zznlVar) throws IOException {
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
        zzlq<T> zzlqVar = this;
        int i6 = 267386880;
        int i7 = 1;
        int i8 = 1048575;
        if (zznlVar.zza() == 2) {
            zza(zzlqVar.zzp, t, zznlVar);
            if (zzlqVar.zzh) {
                zzjw<?> zza2 = zzlqVar.zzq.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzlqVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzlqVar.zzc(length2);
                        int i9 = zzlqVar.zzc[length2];
                        while (entry3 != null && zzlqVar.zzq.zza(entry3) > i9) {
                            zzlqVar.zzq.zza(zznlVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzb(i9, zzmz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zze(i9, zzmz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzc(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzb(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zzh(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zza(i9, zzmz.zze(t, zzc & 1048575), zznlVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzb(i9, zzmz.zze(t, zzc & 1048575), zzlqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, (zziy) zzmz.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzf(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzd(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzc(i9, zzmz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zze(i9, zzmz.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zzd(i9, zzmz.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzlqVar.zzc((zzlq<T>) t, length2)) {
                                    zznlVar.zza(i9, zzmz.zze(t, zzc & 1048575), zzlqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzmg.zzb(zzlqVar.zzc[length2], (List<Double>) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 19:
                                zzmg.zzf(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 20:
                                zzmg.zzh(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 21:
                                zzmg.zzn(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 22:
                                zzmg.zzg(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 23:
                                zzmg.zze(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 24:
                                zzmg.zzd(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 25:
                                zzmg.zza(zzlqVar.zzc[length2], (List<Boolean>) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 26:
                                zzmg.zzb(zzlqVar.zzc[length2], (List<String>) zzmz.zze(t, zzc & 1048575), zznlVar);
                                break;
                            case 27:
                                zzmg.zzb(zzlqVar.zzc[length2], (List<?>) zzmz.zze(t, zzc & 1048575), zznlVar, (zzme<?>) zzlqVar.zze(length2));
                                break;
                            case 28:
                                zzmg.zza(zzlqVar.zzc[length2], (List<zziy>) zzmz.zze(t, zzc & 1048575), zznlVar);
                                break;
                            case 29:
                                zzmg.zzm(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 30:
                                zzmg.zzc(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                zzmg.zzi(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 32:
                                zzmg.zzj(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 33:
                                zzmg.zzk(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 34:
                                zzmg.zzl(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, false);
                                break;
                            case 35:
                                zzmg.zzb(zzlqVar.zzc[length2], (List<Double>) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 36:
                                zzmg.zzf(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 37:
                                zzmg.zzh(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                                zzmg.zzn(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 39:
                                zzmg.zzg(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 40:
                                zzmg.zze(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 41:
                                zzmg.zzd(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                zzmg.zza(zzlqVar.zzc[length2], (List<Boolean>) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                zzmg.zzm(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 44:
                                zzmg.zzc(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 45:
                                zzmg.zzi(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                zzmg.zzj(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                zzmg.zzk(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 48:
                                zzmg.zzl(zzlqVar.zzc[length2], (List) zzmz.zze(t, zzc & 1048575), zznlVar, true);
                                break;
                            case 49:
                                zzmg.zza(zzlqVar.zzc[length2], (List<?>) zzmz.zze(t, zzc & 1048575), zznlVar, (zzme<?>) zzlqVar.zze(length2));
                                break;
                            case 50:
                                zzlqVar.zza(zznlVar, i9, zzmz.zze(t, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzb(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zze(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzc(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzb(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zza(i9, zzmz.zze(t, zzc & 1048575), zznlVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzb(i9, zzmz.zze(t, zzc & 1048575), zzlqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, (zziy) zzmz.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzf(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzd(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzc(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zze(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zzd(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzlqVar.zzc((zzlq<T>) t, i9, length2)) {
                                    zznlVar.zza(i9, zzmz.zze(t, zzc & 1048575), zzlqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzlqVar.zzq.zza(zznlVar, entry3);
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
        if (zzlqVar.zzh) {
            zzjw<?> zza3 = zzlqVar.zzq.zza(t);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzlqVar.zzc.length;
                Unsafe unsafe = zzb;
                i = 0;
                int i10 = 0;
                int i11 = 1048575;
                while (i < length) {
                    int zzc2 = zzlqVar.zzc(i);
                    int i12 = i6;
                    int[] iArr = zzlqVar.zzc;
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
                    while (entry2 != null && zzlqVar.zzq.zza(entry2) <= i13) {
                        zzlqVar.zzq.zza(zznlVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j = zzc2 & i8;
                    switch (i14) {
                        case 0:
                            i5 = i15;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, zzmz.zza(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i19 = i15;
                            i5 = i19;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, zzmz.zzb(t, j));
                                i5 = i19;
                            }
                            zzlqVar = this;
                            break;
                        case 2:
                            int i20 = i15;
                            i5 = i20;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzb(i13, unsafe.getLong(t, j));
                                i5 = i20;
                            }
                            zzlqVar = this;
                            break;
                        case 3:
                            int i21 = i15;
                            i5 = i21;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zze(i13, unsafe.getLong(t, j));
                                i5 = i21;
                            }
                            zzlqVar = this;
                            break;
                        case 4:
                            int i22 = i15;
                            i5 = i22;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzc(i13, unsafe.getInt(t, j));
                                i5 = i22;
                            }
                            zzlqVar = this;
                            break;
                        case 5:
                            int i23 = i15;
                            i5 = i23;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, unsafe.getLong(t, j));
                                i5 = i23;
                            }
                            zzlqVar = this;
                            break;
                        case 6:
                            int i24 = i15;
                            i5 = i24;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzb(i13, unsafe.getInt(t, j));
                                i5 = i24;
                            }
                            zzlqVar = this;
                            break;
                        case 7:
                            int i25 = i15;
                            i5 = i25;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, zzmz.zzh(t, j));
                                i5 = i25;
                            }
                            zzlqVar = this;
                            break;
                        case 8:
                            int i26 = i15;
                            i5 = i26;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zza(i13, unsafe.getObject(t, j), zznlVar);
                                i5 = i26;
                            }
                            zzlqVar = this;
                            break;
                        case 9:
                            i5 = i15;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzb(i13, unsafe.getObject(t, j), zzlqVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i27 = i15;
                            i5 = i27;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, (zziy) unsafe.getObject(t, j));
                                i5 = i27;
                            }
                            zzlqVar = this;
                            break;
                        case 11:
                            int i28 = i15;
                            i5 = i28;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzf(i13, unsafe.getInt(t, j));
                                i5 = i28;
                            }
                            zzlqVar = this;
                            break;
                        case 12:
                            int i29 = i15;
                            i5 = i29;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, unsafe.getInt(t, j));
                                i5 = i29;
                            }
                            zzlqVar = this;
                            break;
                        case 13:
                            int i30 = i15;
                            i5 = i30;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzd(i13, unsafe.getInt(t, j));
                                i5 = i30;
                            }
                            zzlqVar = this;
                            break;
                        case 14:
                            int i31 = i15;
                            i5 = i31;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzc(i13, unsafe.getLong(t, j));
                                i5 = i31;
                            }
                            zzlqVar = this;
                            break;
                        case 15:
                            int i32 = i15;
                            i5 = i32;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zze(i13, unsafe.getInt(t, j));
                                i5 = i32;
                            }
                            zzlqVar = this;
                            break;
                        case 16:
                            int i33 = i15;
                            i5 = i33;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zzd(i13, unsafe.getLong(t, j));
                                i5 = i33;
                            }
                            zzlqVar = this;
                            break;
                        case 17:
                            i5 = i15;
                            if (zzlqVar.zza((zzlq<T>) t, i, i2, i3, i4)) {
                                zznlVar.zza(i13, unsafe.getObject(t, j), zzlqVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i5 = i15;
                            zzmg.zzb(zzlqVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 19:
                            i5 = i15;
                            zzmg.zzf(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 20:
                            i5 = i15;
                            zzmg.zzh(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 21:
                            i5 = i15;
                            zzmg.zzn(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 22:
                            i5 = i15;
                            zzmg.zzg(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 23:
                            i5 = i15;
                            zzmg.zze(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 24:
                            i5 = i15;
                            zzmg.zzd(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 25:
                            i5 = i15;
                            zzmg.zza(zzlqVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 26:
                            i5 = i15;
                            zzmg.zzb(zzlqVar.zzc[i], (List<String>) unsafe.getObject(t, j), zznlVar);
                            break;
                        case 27:
                            i5 = i15;
                            zzmg.zzb(zzlqVar.zzc[i], (List<?>) unsafe.getObject(t, j), zznlVar, (zzme<?>) zzlqVar.zze(i));
                            break;
                        case 28:
                            i5 = i15;
                            zzmg.zza(zzlqVar.zzc[i], (List<zziy>) unsafe.getObject(t, j), zznlVar);
                            break;
                        case 29:
                            i5 = i15;
                            zzmg.zzm(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 30:
                            i5 = i15;
                            zzmg.zzc(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            i5 = i15;
                            zzmg.zzi(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 32:
                            i5 = i15;
                            zzmg.zzj(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 33:
                            i5 = i15;
                            zzmg.zzk(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 34:
                            i5 = i15;
                            zzmg.zzl(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, false);
                            break;
                        case 35:
                            boolean z = i15;
                            zzmg.zzb(zzlqVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zznlVar, z);
                            i5 = z;
                            break;
                        case 36:
                            boolean z2 = i15;
                            zzmg.zzf(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z2);
                            i5 = z2;
                            break;
                        case 37:
                            boolean z3 = i15;
                            zzmg.zzh(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z3);
                            i5 = z3;
                            break;
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            boolean z4 = i15;
                            zzmg.zzn(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z4);
                            i5 = z4;
                            break;
                        case 39:
                            boolean z5 = i15;
                            zzmg.zzg(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z5);
                            i5 = z5;
                            break;
                        case 40:
                            boolean z6 = i15;
                            zzmg.zze(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z6);
                            i5 = z6;
                            break;
                        case 41:
                            boolean z7 = i15;
                            zzmg.zzd(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z7);
                            i5 = z7;
                            break;
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            boolean z8 = i15;
                            zzmg.zza(zzlqVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zznlVar, z8);
                            i5 = z8;
                            break;
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            boolean z9 = i15;
                            zzmg.zzm(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z9);
                            i5 = z9;
                            break;
                        case 44:
                            boolean z10 = i15;
                            zzmg.zzc(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z10);
                            i5 = z10;
                            break;
                        case 45:
                            boolean z11 = i15;
                            zzmg.zzi(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z11);
                            i5 = z11;
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            boolean z12 = i15;
                            zzmg.zzj(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z12);
                            i5 = z12;
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            boolean z13 = i15;
                            zzmg.zzk(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z13);
                            i5 = z13;
                            break;
                        case 48:
                            boolean z14 = i15;
                            zzmg.zzl(zzlqVar.zzc[i], (List) unsafe.getObject(t, j), zznlVar, z14);
                            i5 = z14;
                            break;
                        case 49:
                            zzmg.zza(zzlqVar.zzc[i], (List<?>) unsafe.getObject(t, j), zznlVar, (zzme<?>) zzlqVar.zze(i));
                            i5 = i15;
                            break;
                        case 50:
                            zzlqVar.zza(zznlVar, i13, unsafe.getObject(t, j), i);
                            i5 = i15;
                            break;
                        case 51:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, zza(t, j));
                            }
                            i5 = i15;
                            break;
                        case 52:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, zzb(t, j));
                            }
                            i5 = i15;
                            break;
                        case 53:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzb(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 54:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zze(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzc(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 56:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 57:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzb(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 58:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, zze(t, j));
                            }
                            i5 = i15;
                            break;
                        case 59:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zza(i13, unsafe.getObject(t, j), zznlVar);
                            }
                            i5 = i15;
                            break;
                        case 60:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzb(i13, unsafe.getObject(t, j), zzlqVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, (zziy) unsafe.getObject(t, j));
                            }
                            i5 = i15;
                            break;
                        case 62:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzf(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 64:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzd(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 65:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzc(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 66:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zze(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 67:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zzd(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 68:
                            if (zzlqVar.zzc((zzlq<T>) t, i13, i)) {
                                zznlVar.zza(i13, unsafe.getObject(t, j), zzlqVar.zze(i));
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
                    zzlqVar.zzq.zza(zznlVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzlqVar.zzp, t, zznlVar);
            }
        }
        entry = null;
        it = null;
        length = zzlqVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i102 = 0;
        int i112 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzlqVar.zzp, t, zznlVar);
    }

    private static <UT, UB> void zza(zzmu<UT, UB> zzmuVar, T t, zznl zznlVar) throws IOException {
        zzmuVar.zzb((zzmu<UT, UB>) zzmuVar.zzd(t), zznlVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzlq<T>) t, i) == zzc((zzlq<T>) t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmz.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmz.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmz.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmz.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.measurement.zzme
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
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case 44:
                    case 45:
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    case 48:
                    case 49:
                        z = zzmg.zza(zzmz.zze(t, j), zzmz.zze(t2, j));
                        break;
                    case 50:
                        z = zzmg.zza(zzmz.zze(t, j), zzmz.zze(t2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 62:
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zzb2 = zzb(i) & 1048575;
                        if (zzmz.zzc(t, zzb2) == zzmz.zzc(t2, zzb2)) {
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

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzmz.zzc(t, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmz.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmz.zzb(t, j2)) != 0;
            case 2:
                return zzmz.zzd(t, j2) != 0;
            case 3:
                return zzmz.zzd(t, j2) != 0;
            case 4:
                return zzmz.zzc(t, j2) != 0;
            case 5:
                return zzmz.zzd(t, j2) != 0;
            case 6:
                return zzmz.zzc(t, j2) != 0;
            case 7:
                return zzmz.zzh(t, j2);
            case 8:
                Object zze = zzmz.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zziy) {
                    return !zziy.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmz.zze(t, j2) != null;
            case 10:
                return !zziy.zza.equals(zzmz.zze(t, j2));
            case 11:
                return zzmz.zzc(t, j2) != 0;
            case 12:
                return zzmz.zzc(t, j2) != 0;
            case 13:
                return zzmz.zzc(t, j2) != 0;
            case 14:
                return zzmz.zzd(t, j2) != 0;
            case 15:
                return zzmz.zzc(t, j2) != 0;
            case 16:
                return zzmz.zzd(t, j2) != 0;
            case 17:
                return zzmz.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzlq<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.measurement.zzme] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.measurement.zzme] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zze(T t) {
        int i;
        int i2;
        zzlq<T> zzlqVar;
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
                zzlqVar = this;
                t2 = t;
                if (!zzlqVar.zza((zzlq<T>) t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzlqVar = this;
                t2 = t;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zzlqVar.zza((zzlq<T>) t2, i6, i, i2, i10) && !zza((Object) t2, zzc, zze(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc((zzlq<T>) t2, i7, i6) && !zza((Object) t2, zzc, zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzlqVar.zzr.zzd(zzmz.zze(t2, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzlqVar.zzr.zza(zzf(i6)).zzc.zzb() == zznj.MESSAGE) {
                                ?? r3 = 0;
                                for (Object obj : zzd.values()) {
                                    r3 = r3;
                                    if (r3 == 0) {
                                        r3 = zzma.zza().zza((Class) obj.getClass());
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
                List list = (List) zzmz.zze(t2, zzc & 1048575);
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
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzq.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzme zzmeVar) {
        return zzmeVar.zze(zzmz.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkg) {
            return ((zzkg) obj).zzcq();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzmz.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzmz.zze(t, j)).booleanValue();
    }
}
