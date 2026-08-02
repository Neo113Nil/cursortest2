package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes4.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v = (V) objArr[1];
                    Objects.requireNonNull(v);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int zza2 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i2 = zza2 & length;
                        int i3 = bArr[i2] & UByte.MAX_VALUE;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            v = (V) objArr[i3 ^ 1];
                            break;
                        }
                        zza2 = i2 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int zza3 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i4 = zza3 & length2;
                        int i5 = sArr[i4] & UShort.MAX_VALUE;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            v = (V) objArr[i5 ^ 1];
                            break;
                        }
                        zza3 = i4 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int zza4 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i6 = zza4 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            v = (V) objArr[i7 ^ 1];
                            break;
                        }
                        zza4 = i6 + 1;
                    }
                }
            }
            if (v != null) {
                return null;
            }
            return v;
        }
        v = null;
        if (v != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d5  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> zzas<K, V> zza(int i, Object[] objArr, zzao<K, V> zzaoVar) {
        int i2;
        boolean z;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        boolean z4;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return (zzas) zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            return new zzas<>(null, objArr2, 1);
        }
        zzu.zzb(i5, objArr2.length >> 1);
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (i2 * 0.7d < max) {
                i2 <<= 1;
            }
        } else {
            i2 = 1073741824;
            zzu.zza(max < 1073741824, "collection too large");
        }
        if (i5 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzae.zza(obj5, obj6);
            z4 = false;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i8 * 2;
                    int i11 = i9 * 2;
                    Object obj7 = objArr2[i10];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i10 ^ i6];
                    Objects.requireNonNull(obj8);
                    zzae.zza(obj7, obj8);
                    int zza2 = zzad.zza(obj7.hashCode());
                    while (true) {
                        int i12 = zza2 & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & UByte.MAX_VALUE;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i11;
                            if (i9 < i8) {
                                objArr2[i11] = obj7;
                                objArr2[i11 ^ 1] = obj8;
                            }
                            i9++;
                        } else {
                            if (obj7.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj9 = objArr2[i14];
                                Objects.requireNonNull(obj9);
                                obj2 = new zzan(obj7, obj8, obj9);
                                objArr2[i14] = obj8;
                                break;
                            }
                            zza2 = i12 + 1;
                            z5 = z2;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z3) {
                        Object[] objArr3 = (Object[]) obj;
                        zzan zzanVar = (zzan) objArr3[c];
                        if (zzaoVar == null) {
                            throw zzanVar.zza();
                        }
                        zzaoVar.zza = zzanVar;
                        Object obj11 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue << 1);
                        obj10 = obj11;
                        i5 = intValue;
                    }
                    return new zzas<>(obj10, objArr2, i5);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i3 = 1;
                if (i2 > 32768) {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i15 * 2;
                        int i18 = i16 * 2;
                        Object obj12 = objArr2[i17];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i17 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzae.zza(obj12, obj13);
                        int zza3 = zzad.zza(obj12.hashCode());
                        while (true) {
                            int i19 = zza3 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i18;
                                if (i16 < i15) {
                                    objArr2[i18] = obj12;
                                    objArr2[i18 ^ 1] = obj13;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj12.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj14 = objArr2[i21];
                                    Objects.requireNonNull(obj14);
                                    obj2 = new zzan(obj12, obj13, obj14);
                                    objArr2[i21] = obj13;
                                    break;
                                }
                                zza3 = i19 + 1;
                                c3 = c2;
                            }
                        }
                        i15++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i16 == i5) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i16);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z3) {
                    }
                    return new zzas<>(obj102, objArr2, i5);
                }
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i23 * 2;
                    int i25 = i22 * 2;
                    Object obj15 = objArr2[i24];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArr2[i24 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzae.zza(obj15, obj16);
                    int zza4 = zzad.zza(obj15.hashCode());
                    while (true) {
                        int i26 = zza4 & i7;
                        int i27 = sArr[i26] & UShort.MAX_VALUE;
                        if (i27 == 65535) {
                            sArr[i26] = (short) i25;
                            if (i22 < i23) {
                                objArr2[i25] = obj15;
                                objArr2[i25 ^ 1] = obj16;
                            }
                            i22++;
                        } else {
                            if (obj15.equals(objArr2[i27])) {
                                int i28 = i27 ^ 1;
                                Object obj17 = objArr2[i28];
                                Objects.requireNonNull(obj17);
                                obj2 = new zzan(obj15, obj16, obj17);
                                objArr2[i28] = obj16;
                                break;
                            }
                            zza4 = i26 + 1;
                        }
                    }
                }
                if (i22 != i5) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z3) {
        }
        return new zzas<>(obj1022, objArr2, i5);
    }
}
