package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzat extends com.google.android.gms.internal.play_billing.zzal {
    static final com.google.android.gms.internal.play_billing.zzal zza = new com.google.android.gms.internal.play_billing.zzat(null, new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    private zzat(@javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.play_billing.zzat zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.play_billing.zzak zzakVar) {
        int i2;
        char c;
        char c2;
        int i3 = i;
        java.lang.Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (com.google.android.gms.internal.play_billing.zzat) zza;
        }
        java.lang.Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            com.google.android.gms.internal.play_billing.zzad.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            return new com.google.android.gms.internal.play_billing.zzat(null, objArr2, 1);
        }
        com.google.android.gms.internal.play_billing.zzaa.zzb(i3, objArr2.length >> 1, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
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
            com.google.android.gms.internal.play_billing.zzad.zza(java.util.Objects.requireNonNull(objArr2[0]), java.util.Objects.requireNonNull(objArr2[1]));
            i3 = 1;
        } else {
            int i5 = i2 - 1;
            int i6 = -1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i3) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr2[i10]);
                    java.lang.Object requireNonNull2 = java.util.Objects.requireNonNull(objArr2[i10 ^ i4]);
                    com.google.android.gms.internal.play_billing.zzad.zza(requireNonNull, requireNonNull2);
                    int zza2 = com.google.android.gms.internal.play_billing.zzae.zza(requireNonNull.hashCode());
                    while (true) {
                        int i11 = zza2 & i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = requireNonNull;
                                objArr2[i9 ^ 1] = requireNonNull2;
                            }
                            i8++;
                        } else {
                            if (requireNonNull.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                com.google.android.gms.internal.play_billing.zzaj zzajVar = new com.google.android.gms.internal.play_billing.zzaj(requireNonNull, requireNonNull2, java.util.Objects.requireNonNull(objArr2[i13]));
                                objArr2[i13] = requireNonNull2;
                                obj = zzajVar;
                                break;
                            }
                            zza2 = i11 + 1;
                        }
                    }
                    i7++;
                    i4 = 1;
                }
                if (i8 != i3) {
                    c2 = 2;
                    obj = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i8), obj};
                    c = 1;
                    if (obj instanceof java.lang.Object[]) {
                        java.lang.Object[] objArr3 = obj;
                        com.google.android.gms.internal.play_billing.zzaj zzajVar2 = (com.google.android.gms.internal.play_billing.zzaj) objArr3[c2];
                        if (zzakVar == null) {
                            throw zzajVar2.zza();
                        }
                        zzakVar.zzc = zzajVar2;
                        java.lang.Object obj2 = objArr3[0];
                        int intValue = ((java.lang.Integer) objArr3[c]).intValue();
                        objArr2 = java.util.Arrays.copyOf(objArr2, intValue + intValue);
                        obj = obj2;
                        i3 = intValue;
                    }
                    return new com.google.android.gms.internal.play_billing.zzat(obj, objArr2, i3);
                }
                obj = bArr;
            } else if (i2 <= 32768) {
                short[] sArr = new short[i2];
                java.util.Arrays.fill(sArr, (short) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i3; i15++) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    java.lang.Object requireNonNull3 = java.util.Objects.requireNonNull(objArr2[i17]);
                    java.lang.Object requireNonNull4 = java.util.Objects.requireNonNull(objArr2[i17 ^ 1]);
                    com.google.android.gms.internal.play_billing.zzad.zza(requireNonNull3, requireNonNull4);
                    int zza3 = com.google.android.gms.internal.play_billing.zzae.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i18 = zza3 & i5;
                        char c3 = (char) sArr[i18];
                        if (c3 == 65535) {
                            sArr[i18] = (short) i16;
                            if (i14 < i15) {
                                objArr2[i16] = requireNonNull3;
                                objArr2[i16 ^ 1] = requireNonNull4;
                            }
                            i14++;
                        } else {
                            if (requireNonNull3.equals(objArr2[c3])) {
                                int i19 = c3 ^ 1;
                                com.google.android.gms.internal.play_billing.zzaj zzajVar3 = new com.google.android.gms.internal.play_billing.zzaj(requireNonNull3, requireNonNull4, java.util.Objects.requireNonNull(objArr2[i19]));
                                objArr2[i19] = requireNonNull4;
                                obj = zzajVar3;
                                break;
                            }
                            zza3 = i18 + 1;
                        }
                    }
                }
                obj = i14 == i3 ? sArr : new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i14), obj};
            } else {
                int i20 = 1;
                int[] iArr = new int[i2];
                java.util.Arrays.fill(iArr, -1);
                int i21 = 0;
                int i22 = 0;
                while (i21 < i3) {
                    int i23 = i22 + i22;
                    int i24 = i21 + i21;
                    java.lang.Object requireNonNull5 = java.util.Objects.requireNonNull(objArr2[i24]);
                    java.lang.Object requireNonNull6 = java.util.Objects.requireNonNull(objArr2[i24 ^ i20]);
                    com.google.android.gms.internal.play_billing.zzad.zza(requireNonNull5, requireNonNull6);
                    int zza4 = com.google.android.gms.internal.play_billing.zzae.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i25 = zza4 & i5;
                        int i26 = iArr[i25];
                        if (i26 == i6) {
                            iArr[i25] = i23;
                            if (i22 < i21) {
                                objArr2[i23] = requireNonNull5;
                                objArr2[i23 ^ 1] = requireNonNull6;
                            }
                            i22++;
                        } else {
                            if (requireNonNull5.equals(objArr2[i26])) {
                                int i27 = i26 ^ 1;
                                com.google.android.gms.internal.play_billing.zzaj zzajVar4 = new com.google.android.gms.internal.play_billing.zzaj(requireNonNull5, requireNonNull6, java.util.Objects.requireNonNull(objArr2[i27]));
                                objArr2[i27] = requireNonNull6;
                                obj = zzajVar4;
                                break;
                            }
                            zza4 = i25 + 1;
                            i6 = -1;
                        }
                    }
                    i21++;
                    i20 = 1;
                    i6 = -1;
                }
                if (i22 != i3) {
                    c = 1;
                    c2 = 2;
                    obj = new java.lang.Object[]{iArr, java.lang.Integer.valueOf(i22), obj};
                    if (obj instanceof java.lang.Object[]) {
                    }
                    return new com.google.android.gms.internal.play_billing.zzat(obj, objArr2, i3);
                }
                obj = iArr;
            }
        }
        c2 = 2;
        c = 1;
        if (obj instanceof java.lang.Object[]) {
        }
        return new com.google.android.gms.internal.play_billing.zzat(obj, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
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
                        int length = bArr.length - 1;
                        int zza2 = com.google.android.gms.internal.play_billing.zzae.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
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
                        int length2 = sArr.length - 1;
                        int zza3 = com.google.android.gms.internal.play_billing.zzae.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
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
                        int length3 = iArr.length - 1;
                        int zza4 = com.google.android.gms.internal.play_billing.zzae.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
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

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final com.google.android.gms.internal.play_billing.zzaf zza() {
        return new com.google.android.gms.internal.play_billing.zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final com.google.android.gms.internal.play_billing.zzam zzd() {
        return new com.google.android.gms.internal.play_billing.zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final com.google.android.gms.internal.play_billing.zzam zze() {
        return new com.google.android.gms.internal.play_billing.zzar(this, new com.google.android.gms.internal.play_billing.zzas(this.zzb, 0, this.zzd));
    }
}
