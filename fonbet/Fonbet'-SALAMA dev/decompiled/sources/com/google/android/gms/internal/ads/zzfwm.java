package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class zzfwm extends zzfwc implements Set {
    private transient zzfwh zza;

    public static int zzh(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            zzfth.zzf(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzfwl zzj(int i7) {
        return new zzfwl(i7, true);
    }

    public static zzfwm zzl(Collection collection) {
        if ((collection instanceof zzfwm) && !(collection instanceof SortedSet)) {
            zzfwm zzfwmVar = (zzfwm) collection;
            if (!zzfwmVar.zzf()) {
                return zzfwmVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfwm zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzfyk(objArr[0]) : zzfxz.zza;
    }

    public static zzfwm zzn() {
        return zzfxz.zza;
    }

    public static zzfwm zzo(Object obj) {
        return new zzfyk(obj);
    }

    public static zzfwm zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfwm zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfwm zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfwm zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return zzv(9, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfwm zzv(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzfxz.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzfyk(obj);
        }
        int zzh = zzh(i7);
        Object[] objArr2 = new Object[zzh];
        int i8 = zzh - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            zzfxr.zza(obj2, i11);
            int hashCode = obj2.hashCode();
            int zza = zzfvz.zza(hashCode);
            while (true) {
                int i12 = zza & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzfyk(obj4);
        }
        if (zzh(i10) < zzh / 2) {
            return zzv(i10, objArr);
        }
        if (zzw(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new zzfxz(objArr, i9, objArr2, i8, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfwm) && zzu() && ((zzfwm) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfyj.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfyj.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public zzfwh zzd() {
        zzfwh zzfwhVar = this.zza;
        if (zzfwhVar != null) {
            return zzfwhVar;
        }
        zzfwh zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfyn iterator();

    public zzfwh zzi() {
        Object[] array = toArray();
        int i7 = zzfwh.zzd;
        return zzfwh.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
