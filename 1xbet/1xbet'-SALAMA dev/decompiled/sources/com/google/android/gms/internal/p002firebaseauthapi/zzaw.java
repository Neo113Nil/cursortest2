package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    public final V get(Object obj) {
        V v6;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i7 = this.zzd;
        if (obj == null) {
            v6 = null;
        } else if (i7 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                v6 = (V) objArr[1];
                Objects.requireNonNull(v6);
            } else {
                v6 = null;
            }
        } else if (obj2 == null) {
            v6 = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iZza = zzah.zza(obj.hashCode());
            while (true) {
                int i8 = iZza & length;
                int i9 = bArr[i8] & 255;
                if (i9 == 255) {
                    break;
                }
                if (obj.equals(objArr[i9])) {
                    v6 = (V) objArr[i9 ^ 1];
                } else {
                    iZza = i8 + 1;
                }
            }
            v6 = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iZza2 = zzah.zza(obj.hashCode());
            while (true) {
                int i10 = iZza2 & length2;
                int i11 = sArr[i10] & 65535;
                if (i11 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i11])) {
                    v6 = (V) objArr[i11 ^ 1];
                } else {
                    iZza2 = i10 + 1;
                }
            }
            v6 = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iZza3 = zzah.zza(obj.hashCode());
            while (true) {
                int i12 = iZza3 & length3;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                if (obj.equals(objArr[i13])) {
                    v6 = (V) objArr[i13 ^ 1];
                } else {
                    iZza3 = i12 + 1;
                }
            }
            v6 = null;
        }
        if (v6 == null) {
            return null;
        }
        return v6;
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
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzaw<K, V> zza(int i7, Object[] objArr, zzas<K, V> zzasVar) {
        int iHighestOneBit;
        short[] sArr;
        char c3;
        char c4;
        ?? r7;
        ?? r8;
        int i8 = i7;
        Object[] objArrCopyOf = objArr;
        if (i8 == 0) {
            return (zzaw) zza;
        }
        zzar zzarVar = null;
        ?? r9 = 0;
        zzar zzarVar2 = null;
        zzar zzarVar3 = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzai.zza(obj, obj2);
            return new zzaw<>(null, objArrCopyOf, 1);
        }
        zzy.zzb(i8, objArrCopyOf.length >> 1);
        int iMax = Math.max(i8, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            if (!(iMax < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i8 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzai.zza(obj3, obj4);
            c3 = 1;
            c4 = 2;
        } else {
            int i10 = iHighestOneBit - 1;
            byte b7 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i11 * 2;
                    int i14 = i12 * 2;
                    Object obj5 = objArrCopyOf[i13];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i13 ^ i9];
                    Objects.requireNonNull(obj6);
                    zzai.zza(obj5, obj6);
                    int iZza = zzah.zza(obj5.hashCode());
                    while (true) {
                        int i15 = iZza & i10;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i14;
                            if (i12 < i11) {
                                objArrCopyOf[i14] = obj5;
                                objArrCopyOf[i14 ^ 1] = obj6;
                            }
                            i12++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i16 == true ? 1 : 0])) {
                            int i17 = ~i16;
                            Object obj7 = objArrCopyOf[i17 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzarVar2 = new zzar(obj5, obj6, obj7);
                            objArrCopyOf[i17 == true ? 1 : 0] = obj6;
                            break;
                        }
                        iZza = i15 + 1;
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    r7 = bArr;
                    c4 = 2;
                    r8 = r7;
                } else {
                    r8 = new Object[]{bArr, Integer.valueOf(i12), zzarVar2};
                    c4 = 2;
                }
                c3 = 1;
                r9 = r8;
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i18 = 0;
                    for (int i19 = 0; i19 < i8; i19++) {
                        int i20 = i19 * 2;
                        int i21 = i18 * 2;
                        Object obj8 = objArrCopyOf[i20];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i20 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzai.zza(obj8, obj9);
                        int iZza2 = zzah.zza(obj8.hashCode());
                        while (true) {
                            int i22 = iZza2 & i10;
                            int i23 = sArr[i22] & 65535;
                            if (i23 == 65535) {
                                sArr[i22] = (short) i21;
                                if (i18 < i19) {
                                    objArrCopyOf[i21] = obj8;
                                    objArrCopyOf[i21 ^ 1] = obj9;
                                }
                                i18++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[i23 == true ? 1 : 0])) {
                                int i24 = ~i23;
                                Object obj10 = objArrCopyOf[i24 == true ? 1 : 0];
                                Objects.requireNonNull(obj10);
                                zzarVar3 = new zzar(obj8, obj9, obj10);
                                objArrCopyOf[i24 == true ? 1 : 0] = obj9;
                                break;
                            }
                            iZza2 = i22 + 1;
                        }
                    }
                    if (i18 != i8) {
                        c4 = 2;
                        r8 = new Object[]{sArr, Integer.valueOf(i18), zzarVar3};
                    }
                    c3 = 1;
                    r9 = r8;
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i8) {
                        int i27 = i25 * 2;
                        int i28 = i26 * 2;
                        Object obj11 = objArrCopyOf[i27];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i27 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzai.zza(obj11, obj12);
                        int iZza3 = zzah.zza(obj11.hashCode());
                        while (true) {
                            int i29 = iZza3 & i10;
                            ?? r15 = sArr[i29];
                            if (r15 == b7) {
                                sArr[i29] = i28;
                                if (i26 < i25) {
                                    objArrCopyOf[i28] = obj11;
                                    objArrCopyOf[i28 ^ 1] = obj12;
                                }
                                i26++;
                                break;
                            }
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i30 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i30 == true ? 1 : 0];
                                Objects.requireNonNull(obj13);
                                zzarVar = new zzar(obj11, obj12, obj13);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj12;
                                break;
                            }
                            iZza3 = i29 + 1;
                            b7 = -1;
                        }
                        i25++;
                        b7 = -1;
                    }
                    if (i26 != i8) {
                        c3 = 1;
                        c4 = 2;
                        r9 = new Object[]{sArr, Integer.valueOf(i26), zzarVar};
                    }
                }
                r7 = sArr;
                c4 = 2;
                r8 = r7;
                c3 = 1;
                r9 = r8;
            }
        }
        boolean z4 = r9 instanceof Object[];
        ?? r10 = r9;
        if (z4) {
            Object[] objArr2 = (Object[]) r9;
            zzar zzarVar4 = (zzar) objArr2[c4];
            if (zzasVar == null) {
                throw zzarVar4.zza();
            }
            zzasVar.zza = zzarVar4;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            r10 = obj14;
            i8 = iIntValue;
        }
        return new zzaw<>(r10, objArrCopyOf, i8);
    }
}
