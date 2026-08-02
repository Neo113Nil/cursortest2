package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaw<K, V> extends zzap<K, V> {
    private static final zzap<Object, Object> zza = new zzaw(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzaw(Object obj, Object[] objArr, int i7) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v6;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i7 = this.zzd;
        if (obj != null) {
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v6 = (V) objArr[1];
                    Objects.requireNonNull(v6);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int zza2 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i8 = zza2 & length;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i9])) {
                            v6 = (V) objArr[i9 ^ 1];
                            break;
                        }
                        zza2 = i8 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int zza3 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i10 = zza3 & length2;
                        int i11 = sArr[i10] & 65535;
                        if (i11 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            v6 = (V) objArr[i11 ^ 1];
                            break;
                        }
                        zza3 = i10 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int zza4 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i12 = zza4 & length3;
                        int i13 = iArr[i12];
                        if (i13 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            v6 = (V) objArr[i13 ^ 1];
                            break;
                        }
                        zza4 = i12 + 1;
                    }
                }
            }
            if (v6 != null) {
                return null;
            }
            return v6;
        }
        v6 = null;
        if (v6 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzak<V> zza() {
        return new zzba(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzau<Map.Entry<K, V>> zzb() {
        return new zzav(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzau<K> zzc() {
        return new zzax(this, new zzba(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzaw<K, V> zza(int i7, Object[] objArr, zzas<K, V> zzasVar) {
        int i8;
        short[] sArr;
        char c3;
        char c4;
        int i9 = i7;
        Object[] objArr2 = objArr;
        if (i9 == 0) {
            return (zzaw) zza;
        }
        Object obj = null;
        int i10 = 1;
        if (i9 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzai.zza(obj2, obj3);
            return new zzaw<>(null, objArr2, 1);
        }
        zzy.zzb(i9, objArr2.length >> 1);
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            i8 = Integer.highestOneBit(max - 1) << 1;
            while (i8 * 0.7d < max) {
                i8 <<= 1;
            }
        } else {
            i8 = 1073741824;
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i9 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzai.zza(obj4, obj5);
            c3 = 1;
            c4 = 2;
        } else {
            int i11 = i8 - 1;
            char c7 = 65535;
            if (i8 <= 128) {
                byte[] bArr = new byte[i8];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i12 * 2;
                    int i15 = i13 * 2;
                    Object obj6 = objArr2[i14];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i14 ^ i10];
                    Objects.requireNonNull(obj7);
                    zzai.zza(obj6, obj7);
                    int zza2 = zzah.zza(obj6.hashCode());
                    while (true) {
                        int i16 = zza2 & i11;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i15;
                            if (i13 < i12) {
                                objArr2[i15] = obj6;
                                objArr2[i15 ^ 1] = obj7;
                            }
                            i13++;
                        } else {
                            if (obj6.equals(objArr2[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj8 = objArr2[i18];
                                Objects.requireNonNull(obj8);
                                obj = new zzar(obj6, obj7, obj8);
                                objArr2[i18] = obj7;
                                break;
                            }
                            zza2 = i16 + 1;
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 == i9) {
                    obj = bArr;
                    c4 = 2;
                    c3 = 1;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                    c4 = 2;
                    c3 = 1;
                }
            } else {
                if (i8 <= 32768) {
                    sArr = new short[i8];
                    Arrays.fill(sArr, (short) -1);
                    int i19 = 0;
                    for (int i20 = 0; i20 < i9; i20++) {
                        int i21 = i20 * 2;
                        int i22 = i19 * 2;
                        Object obj9 = objArr2[i21];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i21 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzai.zza(obj9, obj10);
                        int zza3 = zzah.zza(obj9.hashCode());
                        while (true) {
                            int i23 = zza3 & i11;
                            int i24 = sArr[i23] & 65535;
                            if (i24 == 65535) {
                                sArr[i23] = (short) i22;
                                if (i19 < i20) {
                                    objArr2[i22] = obj9;
                                    objArr2[i22 ^ 1] = obj10;
                                }
                                i19++;
                            } else {
                                if (obj9.equals(objArr2[i24])) {
                                    int i25 = i24 ^ 1;
                                    Object obj11 = objArr2[i25];
                                    Objects.requireNonNull(obj11);
                                    obj = new zzar(obj9, obj10, obj11);
                                    objArr2[i25] = obj10;
                                    break;
                                }
                                zza3 = i23 + 1;
                            }
                        }
                    }
                    if (i19 != i9) {
                        c4 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i19), obj};
                        c3 = 1;
                    }
                } else {
                    sArr = new int[i8];
                    Arrays.fill((int[]) sArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i9) {
                        int i28 = i26 * 2;
                        int i29 = i27 * 2;
                        Object obj12 = objArr2[i28];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i28 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzai.zza(obj12, obj13);
                        int zza4 = zzah.zza(obj12.hashCode());
                        while (true) {
                            int i30 = zza4 & i11;
                            ?? r15 = sArr[i30];
                            if (r15 == c7) {
                                sArr[i30] = i29;
                                if (i27 < i26) {
                                    objArr2[i29] = obj12;
                                    objArr2[i29 ^ 1] = obj13;
                                }
                                i27++;
                            } else {
                                if (obj12.equals(objArr2[r15])) {
                                    int i31 = r15 ^ 1;
                                    Object obj14 = objArr2[i31];
                                    Objects.requireNonNull(obj14);
                                    obj = new zzar(obj12, obj13, obj14);
                                    objArr2[i31] = obj13;
                                    break;
                                }
                                zza4 = i30 + 1;
                                c7 = 65535;
                            }
                        }
                        i26++;
                        c7 = 65535;
                    }
                    if (i27 != i9) {
                        c3 = 1;
                        c4 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i27), obj};
                    }
                }
                obj = sArr;
                c4 = 2;
                c3 = 1;
            }
        }
        boolean z4 = obj instanceof Object[];
        Object obj15 = obj;
        if (z4) {
            Object[] objArr3 = (Object[]) obj;
            zzar zzarVar = (zzar) objArr3[c4];
            if (zzasVar == null) {
                throw zzarVar.zza();
            }
            zzasVar.zza = zzarVar;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c3]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue << 1);
            obj15 = obj16;
            i9 = intValue;
        }
        return new zzaw<>(obj15, objArr2, i9);
    }
}
