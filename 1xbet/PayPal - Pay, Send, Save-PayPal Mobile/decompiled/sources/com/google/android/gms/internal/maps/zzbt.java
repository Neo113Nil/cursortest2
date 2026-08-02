package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbt extends com.google.android.gms.internal.maps.zzbl {
    static final com.google.android.gms.internal.maps.zzbl zza = new com.google.android.gms.internal.maps.zzbt(null, new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    static com.google.android.gms.internal.maps.zzbt zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.maps.zzbk zzbkVar) {
        byte[] bArr;
        int i2 = i;
        java.lang.Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (com.google.android.gms.internal.maps.zzbt) zza;
        }
        java.lang.Object obj = null;
        if (i2 == 1) {
            com.google.android.gms.internal.maps.zzbd.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            return new com.google.android.gms.internal.maps.zzbt(null, objArr2, 1);
        }
        com.google.android.gms.internal.maps.zzba.zzb(i2, objArr2.length >> 1, "index");
        int zzf = com.google.android.gms.internal.maps.zzbm.zzf(i);
        if (i2 == 1) {
            com.google.android.gms.internal.maps.zzbd.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            i2 = 1;
        } else {
            int i3 = zzf - 1;
            if (zzf <= 128) {
                bArr = new byte[zzf];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr2[i7]);
                    java.lang.Object requireNonNull2 = java.util.Objects.requireNonNull(objArr2[i7 ^ 1]);
                    com.google.android.gms.internal.maps.zzbd.zza(requireNonNull, requireNonNull2);
                    int zza2 = com.google.android.gms.internal.maps.zzbe.zza(requireNonNull.hashCode());
                    while (true) {
                        int i8 = zza2 & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArr2[i6] = requireNonNull;
                                objArr2[i6 ^ 1] = requireNonNull2;
                            }
                            i4++;
                        } else {
                            if (requireNonNull.equals(objArr2[i9])) {
                                int i10 = i9 ^ 1;
                                com.google.android.gms.internal.maps.zzbj zzbjVar = new com.google.android.gms.internal.maps.zzbj(requireNonNull, requireNonNull2, java.util.Objects.requireNonNull(objArr2[i10]));
                                objArr2[i10] = requireNonNull2;
                                obj = zzbjVar;
                                break;
                            }
                            zza2 = i8 + 1;
                        }
                    }
                }
                if (i4 != i2) {
                    obj = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i4), obj};
                }
                obj = bArr;
            } else if (zzf <= 32768) {
                bArr = new short[zzf];
                java.util.Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    java.lang.Object requireNonNull3 = java.util.Objects.requireNonNull(objArr2[i14]);
                    java.lang.Object requireNonNull4 = java.util.Objects.requireNonNull(objArr2[i14 ^ 1]);
                    com.google.android.gms.internal.maps.zzbd.zza(requireNonNull3, requireNonNull4);
                    int zza3 = com.google.android.gms.internal.maps.zzbe.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i15 = zza3 & i3;
                        char c = (char) bArr[i15];
                        if (c == 65535) {
                            bArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArr2[i13] = requireNonNull3;
                                objArr2[i13 ^ 1] = requireNonNull4;
                            }
                            i11++;
                        } else {
                            if (requireNonNull3.equals(objArr2[c])) {
                                int i16 = c ^ 1;
                                com.google.android.gms.internal.maps.zzbj zzbjVar2 = new com.google.android.gms.internal.maps.zzbj(requireNonNull3, requireNonNull4, java.util.Objects.requireNonNull(objArr2[i16]));
                                objArr2[i16] = requireNonNull4;
                                obj = zzbjVar2;
                                break;
                            }
                            zza3 = i15 + 1;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i11), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzf];
                java.util.Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    java.lang.Object requireNonNull5 = java.util.Objects.requireNonNull(objArr2[i20]);
                    java.lang.Object requireNonNull6 = java.util.Objects.requireNonNull(objArr2[i20 ^ 1]);
                    com.google.android.gms.internal.maps.zzbd.zza(requireNonNull5, requireNonNull6);
                    int zza4 = com.google.android.gms.internal.maps.zzbe.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i21 = zza4 & i3;
                        ?? r14 = bArr[i21];
                        if (r14 == -1) {
                            bArr[i21] = i19;
                            if (i17 < i18) {
                                objArr2[i19] = requireNonNull5;
                                objArr2[i19 ^ 1] = requireNonNull6;
                            }
                            i17++;
                        } else {
                            if (requireNonNull5.equals(objArr2[r14])) {
                                int i22 = r14 ^ 1;
                                com.google.android.gms.internal.maps.zzbj zzbjVar3 = new com.google.android.gms.internal.maps.zzbj(requireNonNull5, requireNonNull6, java.util.Objects.requireNonNull(objArr2[i22]));
                                objArr2[i22] = requireNonNull6;
                                obj = zzbjVar3;
                                break;
                            }
                            zza4 = i21 + 1;
                        }
                    }
                }
                if (i17 != i2) {
                    obj = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i17), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
            zzbkVar.zzc = (com.google.android.gms.internal.maps.zzbj) objArr3[2];
            java.lang.Object obj2 = objArr3[0];
            int intValue = ((java.lang.Integer) objArr3[1]).intValue();
            objArr2 = java.util.Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj2;
            i2 = intValue;
        }
        return new com.google.android.gms.internal.maps.zzbt(obj, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.maps.zzbl, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(java.lang.Object obj) {
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
                        int zza2 = com.google.android.gms.internal.maps.zzbe.zza(obj.hashCode());
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
                        int zza3 = com.google.android.gms.internal.maps.zzbe.zza(obj.hashCode());
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
                        int zza4 = com.google.android.gms.internal.maps.zzbe.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.maps.zzbl
    final com.google.android.gms.internal.maps.zzbf zza() {
        return new com.google.android.gms.internal.maps.zzbs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    final com.google.android.gms.internal.maps.zzbm zzd() {
        return new com.google.android.gms.internal.maps.zzbq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    final com.google.android.gms.internal.maps.zzbm zze() {
        return new com.google.android.gms.internal.maps.zzbr(this, new com.google.android.gms.internal.maps.zzbs(this.zzb, 0, this.zzd));
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    private zzbt(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }
}
