package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzfxy extends zzfwk {
    static final zzfwk zza = new zzfxy(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzfxy(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzfxy zzj(int i7, Object[] objArr, zzfwj zzfwjVar) {
        short[] sArr;
        char c3;
        char c4;
        Object[] objArr2;
        int i8 = i7;
        Object[] objArr3 = objArr;
        if (i8 == 0) {
            return (zzfxy) zza;
        }
        Object obj = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzfve.zzb(obj2, obj3);
            return new zzfxy(null, objArr3, 1);
        }
        zzfth.zzb(i8, objArr3.length >> 1, "index");
        int zzh = zzfwm.zzh(i7);
        if (i8 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzfve.zzb(obj4, obj5);
            i8 = 1;
            c3 = 1;
            c4 = 2;
        } else {
            int i10 = zzh - 1;
            char c7 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj6 = objArr3[i14];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i14 ^ i9];
                    Objects.requireNonNull(obj7);
                    zzfve.zzb(obj6, obj7);
                    int zza2 = zzfvz.zza(obj6.hashCode());
                    while (true) {
                        int i15 = zza2 & i10;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArr3[i13] = obj6;
                                objArr3[i13 ^ 1] = obj7;
                            }
                            i12++;
                        } else {
                            if (obj6.equals(objArr3[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj8 = objArr3[i17];
                                Objects.requireNonNull(obj8);
                                zzfwi zzfwiVar = new zzfwi(obj6, obj7, obj8);
                                objArr3[i17] = obj7;
                                obj = zzfwiVar;
                                break;
                            }
                            zza2 = i15 + 1;
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i12), obj};
                    c4 = 2;
                    c3 = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i18 = 0;
                    for (int i19 = 0; i19 < i8; i19++) {
                        int i20 = i18 + i18;
                        int i21 = i19 + i19;
                        Object obj9 = objArr3[i21];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i21 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfve.zzb(obj9, obj10);
                        int zza3 = zzfvz.zza(obj9.hashCode());
                        while (true) {
                            int i22 = zza3 & i10;
                            char c8 = (char) sArr[i22];
                            if (c8 == 65535) {
                                sArr[i22] = (short) i20;
                                if (i18 < i19) {
                                    objArr3[i20] = obj9;
                                    objArr3[i20 ^ 1] = obj10;
                                }
                                i18++;
                            } else {
                                if (obj9.equals(objArr3[c8])) {
                                    int i23 = c8 ^ 1;
                                    Object obj11 = objArr3[i23];
                                    Objects.requireNonNull(obj11);
                                    zzfwi zzfwiVar2 = new zzfwi(obj9, obj10, obj11);
                                    objArr3[i23] = obj10;
                                    obj = zzfwiVar2;
                                    break;
                                }
                                zza3 = i22 + 1;
                            }
                        }
                    }
                    if (i18 != i8) {
                        Integer valueOf = Integer.valueOf(i18);
                        c3 = 1;
                        c4 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i24 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i8) {
                        int i27 = i26 + i26;
                        int i28 = i25 + i25;
                        Object obj12 = objArr3[i28];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i28 ^ i24];
                        Objects.requireNonNull(obj13);
                        zzfve.zzb(obj12, obj13);
                        int zza4 = zzfvz.zza(obj12.hashCode());
                        while (true) {
                            int i29 = zza4 & i10;
                            ?? r15 = sArr[i29];
                            if (r15 == c7) {
                                sArr[i29] = i27;
                                if (i26 < i25) {
                                    objArr3[i27] = obj12;
                                    objArr3[i27 ^ 1] = obj13;
                                }
                                i26++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i30 = r15 ^ 1;
                                    Object obj14 = objArr3[i30];
                                    Objects.requireNonNull(obj14);
                                    zzfwi zzfwiVar3 = new zzfwi(obj12, obj13, obj14);
                                    objArr3[i30] = obj13;
                                    obj = zzfwiVar3;
                                    break;
                                }
                                zza4 = i29 + 1;
                                c7 = 65535;
                            }
                        }
                        i25++;
                        i24 = 1;
                        c7 = 65535;
                    }
                    if (i26 != i8) {
                        c3 = 1;
                        c4 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i26), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c3 = 1;
            }
            c4 = 2;
            c3 = 1;
        }
        boolean z4 = obj instanceof Object[];
        Object obj15 = obj;
        if (z4) {
            Object[] objArr4 = (Object[]) obj;
            zzfwi zzfwiVar4 = (zzfwi) objArr4[c4];
            if (zzfwjVar == null) {
                throw zzfwiVar4.zza();
            }
            zzfwjVar.zzc = zzfwiVar4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c3]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i8 = intValue;
        }
        return new zzfxy(obj15, objArr3, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfwk, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i7 = this.zzd;
            Object[] objArr = this.zzb;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzfvz.zza(obj.hashCode());
                        while (true) {
                            int i8 = zza2 & length;
                            int i9 = bArr[i8] & 255;
                            if (i9 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            zza2 = i8 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzfvz.zza(obj.hashCode());
                        while (true) {
                            int i10 = zza3 & length2;
                            char c3 = (char) sArr[i10];
                            if (c3 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c3])) {
                                obj2 = objArr[c3 ^ 1];
                                break;
                            }
                            zza3 = i10 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzfvz.zza(obj.hashCode());
                        while (true) {
                            int i11 = zza4 & length3;
                            int i12 = iArr[i11];
                            if (i12 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            zza4 = i11 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfwk
    public final zzfwc zza() {
        return new zzfxx(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfwk
    public final zzfwm zzf() {
        return new zzfxv(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfwk
    public final zzfwm zzg() {
        return new zzfxw(this, new zzfxx(this.zzb, 0, this.zzd));
    }
}
