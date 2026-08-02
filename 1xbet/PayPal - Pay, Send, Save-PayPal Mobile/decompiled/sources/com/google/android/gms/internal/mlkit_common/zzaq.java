package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzaq extends com.google.android.gms.internal.mlkit_common.zzai {
    static final com.google.android.gms.internal.mlkit_common.zzai zza = new com.google.android.gms.internal.mlkit_common.zzaq(null, new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a6  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.mlkit_common.zzaq zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.mlkit_common.zzah zzahVar) {
        int i2;
        byte[] bArr;
        short[] sArr;
        boolean z;
        int i3 = i;
        java.lang.Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (com.google.android.gms.internal.mlkit_common.zzaq) zza;
        }
        java.lang.Object obj = null;
        if (i3 == 1) {
            com.google.android.gms.internal.mlkit_common.zzw.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            return new com.google.android.gms.internal.mlkit_common.zzaq(null, objArr2, 1);
        }
        com.google.android.gms.internal.mlkit_common.zzt.zzb(i3, objArr2.length >> 1, "index");
        int max = java.lang.Math.max(i3, 2);
        if (max < 751619276) {
            i2 = java.lang.Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new java.lang.IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            com.google.android.gms.internal.mlkit_common.zzw.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            i3 = 1;
        } else {
            int i4 = i2 - 1;
            char c = 65535;
            if (i2 <= 128) {
                bArr = new byte[i2];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i5 + i5;
                    int i8 = i6 + i6;
                    java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr2[i8]);
                    java.lang.Object requireNonNull2 = java.util.Objects.requireNonNull(objArr2[i8 ^ 1]);
                    com.google.android.gms.internal.mlkit_common.zzw.zza(requireNonNull, requireNonNull2);
                    int zza2 = com.google.android.gms.internal.mlkit_common.zzy.zza(requireNonNull.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i5 < i6) {
                                objArr2[i7] = requireNonNull;
                                objArr2[i7 ^ 1] = requireNonNull2;
                            }
                            i5++;
                        } else {
                            if (requireNonNull.equals(objArr2[i10])) {
                                int i11 = i10 ^ 1;
                                com.google.android.gms.internal.mlkit_common.zzag zzagVar = new com.google.android.gms.internal.mlkit_common.zzag(requireNonNull, requireNonNull2, java.util.Objects.requireNonNull(objArr2[i11]));
                                objArr2[i11] = requireNonNull2;
                                obj = zzagVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                }
                if (i5 != i3) {
                    sArr = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i5), obj};
                    obj = sArr;
                }
                z = bArr instanceof java.lang.Object[];
                java.lang.Object obj2 = bArr;
                if (z) {
                    java.lang.Object[] objArr3 = (java.lang.Object[]) bArr;
                    com.google.android.gms.internal.mlkit_common.zzag zzagVar2 = (com.google.android.gms.internal.mlkit_common.zzag) objArr3[2];
                    if (zzahVar == null) {
                        throw zzagVar2.zza();
                    }
                    zzahVar.zzc = zzagVar2;
                    java.lang.Object obj3 = objArr3[0];
                    int intValue = ((java.lang.Integer) objArr3[1]).intValue();
                    objArr2 = java.util.Arrays.copyOf(objArr2, intValue + intValue);
                    obj2 = obj3;
                    i3 = intValue;
                }
                return new com.google.android.gms.internal.mlkit_common.zzaq(obj2, objArr2, i3);
            }
            if (i2 > 32768) {
                bArr = new int[i2];
                java.util.Arrays.fill((int[]) bArr, -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i3) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    java.lang.Object requireNonNull3 = java.util.Objects.requireNonNull(objArr2[i15]);
                    java.lang.Object requireNonNull4 = java.util.Objects.requireNonNull(objArr2[i15 ^ 1]);
                    com.google.android.gms.internal.mlkit_common.zzw.zza(requireNonNull3, requireNonNull4);
                    int zza3 = com.google.android.gms.internal.mlkit_common.zzy.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i16 = zza3 & i4;
                        ?? r15 = bArr[i16];
                        if (r15 == c) {
                            bArr[i16] = i14;
                            if (i13 < i12) {
                                objArr2[i14] = requireNonNull3;
                                objArr2[i14 ^ 1] = requireNonNull4;
                            }
                            i13++;
                        } else {
                            if (requireNonNull3.equals(objArr2[r15])) {
                                int i17 = r15 ^ 1;
                                com.google.android.gms.internal.mlkit_common.zzag zzagVar3 = new com.google.android.gms.internal.mlkit_common.zzag(requireNonNull3, requireNonNull4, java.util.Objects.requireNonNull(objArr2[i17]));
                                objArr2[i17] = requireNonNull4;
                                obj = zzagVar3;
                                break;
                            }
                            zza3 = i16 + 1;
                            c = 65535;
                        }
                    }
                    i12++;
                    c = 65535;
                }
                if (i13 != i3) {
                    bArr = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i13), obj};
                }
                z = bArr instanceof java.lang.Object[];
                java.lang.Object obj22 = bArr;
                if (z) {
                }
                return new com.google.android.gms.internal.mlkit_common.zzaq(obj22, objArr2, i3);
            }
            sArr = new short[i2];
            java.util.Arrays.fill(sArr, (short) -1);
            int i18 = 0;
            for (int i19 = 0; i19 < i3; i19++) {
                int i20 = i18 + i18;
                int i21 = i19 + i19;
                java.lang.Object requireNonNull5 = java.util.Objects.requireNonNull(objArr2[i21]);
                java.lang.Object requireNonNull6 = java.util.Objects.requireNonNull(objArr2[i21 ^ 1]);
                com.google.android.gms.internal.mlkit_common.zzw.zza(requireNonNull5, requireNonNull6);
                int zza4 = com.google.android.gms.internal.mlkit_common.zzy.zza(requireNonNull5.hashCode());
                while (true) {
                    int i22 = zza4 & i4;
                    char c2 = (char) sArr[i22];
                    if (c2 == 65535) {
                        sArr[i22] = (short) i20;
                        if (i18 < i19) {
                            objArr2[i20] = requireNonNull5;
                            objArr2[i20 ^ 1] = requireNonNull6;
                        }
                        i18++;
                    } else {
                        if (requireNonNull5.equals(objArr2[c2])) {
                            int i23 = c2 ^ 1;
                            com.google.android.gms.internal.mlkit_common.zzag zzagVar4 = new com.google.android.gms.internal.mlkit_common.zzag(requireNonNull5, requireNonNull6, java.util.Objects.requireNonNull(objArr2[i23]));
                            objArr2[i23] = requireNonNull6;
                            obj = zzagVar4;
                            break;
                        }
                        zza4 = i22 + 1;
                    }
                }
            }
            if (i18 != i3) {
                obj = new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i18), obj};
            }
            obj = sArr;
        }
        bArr = obj;
        z = bArr instanceof java.lang.Object[];
        java.lang.Object obj222 = bArr;
        if (z) {
        }
        return new com.google.android.gms.internal.mlkit_common.zzaq(obj222, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj != null) {
            int i = this.zzd;
            java.lang.Object[] objArr = this.zzb;
            if (i != 1) {
                java.lang.Object obj3 = this.zzc;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length;
                        int zza2 = com.google.android.gms.internal.mlkit_common.zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & (length - 1);
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length;
                        int zza3 = com.google.android.gms.internal.mlkit_common.zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & (length2 - 1);
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length;
                        int zza4 = com.google.android.gms.internal.mlkit_common.zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & (length3 - 1);
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            } else if (java.util.Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = java.util.Objects.requireNonNull(objArr[1]);
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

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final com.google.android.gms.internal.mlkit_common.zzab zza() {
        return new com.google.android.gms.internal.mlkit_common.zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final com.google.android.gms.internal.mlkit_common.zzaj zzd() {
        return new com.google.android.gms.internal.mlkit_common.zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final com.google.android.gms.internal.mlkit_common.zzaj zze() {
        return new com.google.android.gms.internal.mlkit_common.zzao(this, new com.google.android.gms.internal.mlkit_common.zzap(this.zzb, 0, this.zzd));
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    private zzaq(@javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }
}
