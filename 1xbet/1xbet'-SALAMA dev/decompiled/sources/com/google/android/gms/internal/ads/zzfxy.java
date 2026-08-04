package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
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
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static zzfxy zzj(int i7, Object[] objArr, zzfwj zzfwjVar) {
        short[] sArr;
        char c3;
        char c4;
        ?? r7;
        ?? r8;
        ?? r9;
        int i8 = i7;
        Object[] objArrCopyOf = objArr;
        if (i8 == 0) {
            return (zzfxy) zza;
        }
        zzfwi zzfwiVar = null;
        ?? r10 = 0;
        zzfwi zzfwiVar2 = null;
        zzfwi zzfwiVar3 = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzfve.zzb(obj, obj2);
            return new zzfxy(null, objArrCopyOf, 1);
        }
        zzfth.zzb(i8, objArrCopyOf.length >> 1, "index");
        int iZzh = zzfwm.zzh(i7);
        if (i8 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzfve.zzb(obj3, obj4);
            i8 = 1;
            c3 = 1;
            c4 = 2;
        } else {
            int i10 = iZzh - 1;
            byte b7 = -1;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj5 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i14 ^ i9];
                    Objects.requireNonNull(obj6);
                    zzfve.zzb(obj5, obj6);
                    int iZza = zzfvz.zza(obj5.hashCode());
                    while (true) {
                        int i15 = iZza & i10;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArrCopyOf[i13] = obj5;
                                objArrCopyOf[i13 ^ 1] = obj6;
                            }
                            i12++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i16 == true ? 1 : 0])) {
                            int i17 = ~i16;
                            Object obj7 = objArrCopyOf[i17 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzfwi zzfwiVar4 = new zzfwi(obj5, obj6, obj7);
                            objArrCopyOf[i17 == true ? 1 : 0] = obj6;
                            zzfwiVar2 = zzfwiVar4;
                            break;
                        }
                        iZza = i15 + 1;
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    r8 = bArr;
                } else {
                    r9 = new Object[]{bArr, Integer.valueOf(i12), zzfwiVar2};
                    c4 = 2;
                }
                c3 = 1;
                r10 = r9;
            } else {
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i18 = 0;
                    for (int i19 = 0; i19 < i8; i19++) {
                        int i20 = i18 + i18;
                        int i21 = i19 + i19;
                        Object obj8 = objArrCopyOf[i21];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i21 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzfve.zzb(obj8, obj9);
                        int iZza2 = zzfvz.zza(obj8.hashCode());
                        while (true) {
                            int i22 = iZza2 & i10;
                            char c7 = (char) sArr[i22];
                            if (c7 == 65535) {
                                sArr[i22] = (short) i20;
                                if (i18 < i19) {
                                    objArrCopyOf[i20] = obj8;
                                    objArrCopyOf[i20 ^ 1] = obj9;
                                }
                                i18++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[c7])) {
                                int i23 = c7 ^ 1;
                                Object obj10 = objArrCopyOf[i23 == true ? 1 : 0];
                                Objects.requireNonNull(obj10);
                                zzfwi zzfwiVar5 = new zzfwi(obj8, obj9, obj10);
                                objArrCopyOf[i23 == true ? 1 : 0] = obj9;
                                zzfwiVar3 = zzfwiVar5;
                                break;
                            }
                            iZza2 = i22 + 1;
                        }
                    }
                    if (i18 != i8) {
                        Integer numValueOf = Integer.valueOf(i18);
                        c3 = 1;
                        c4 = 2;
                        r7 = new Object[]{sArr, numValueOf, zzfwiVar3};
                        r10 = r7;
                    }
                    r8 = sArr;
                } else {
                    int i24 = 1;
                    sArr = new int[iZzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i8) {
                        int i27 = i26 + i26;
                        int i28 = i25 + i25;
                        Object obj11 = objArrCopyOf[i28];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i28 ^ i24];
                        Objects.requireNonNull(obj12);
                        zzfve.zzb(obj11, obj12);
                        int iZza3 = zzfvz.zza(obj11.hashCode());
                        while (true) {
                            int i29 = iZza3 & i10;
                            ?? r15 = sArr[i29];
                            if (r15 == b7) {
                                sArr[i29] = i27;
                                if (i26 < i25) {
                                    objArrCopyOf[i27] = obj11;
                                    objArrCopyOf[i27 ^ 1] = obj12;
                                }
                                i26++;
                                break;
                            }
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i30 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i30 == true ? 1 : 0];
                                Objects.requireNonNull(obj13);
                                zzfwi zzfwiVar6 = new zzfwi(obj11, obj12, obj13);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj12;
                                zzfwiVar = zzfwiVar6;
                                break;
                            }
                            iZza3 = i29 + 1;
                            b7 = -1;
                        }
                        i25++;
                        i24 = 1;
                        b7 = -1;
                    }
                    if (i26 != i8) {
                        c3 = 1;
                        c4 = 2;
                        r7 = new Object[]{sArr, Integer.valueOf(i26), zzfwiVar};
                        r10 = r7;
                    }
                    r8 = sArr;
                }
                c3 = 1;
                r10 = r9;
            }
            c4 = 2;
            r9 = r8;
            c3 = 1;
            r10 = r9;
        }
        boolean z4 = r10 instanceof Object[];
        ?? r11 = r10;
        if (z4) {
            Object[] objArr2 = (Object[]) r10;
            zzfwi zzfwiVar7 = (zzfwi) objArr2[c4];
            if (zzfwjVar == null) {
                throw zzfwiVar7.zza();
            }
            zzfwjVar.zzc = zzfwiVar7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r11 = obj14;
            i8 = iIntValue;
        }
        return new zzfxy(r11, objArrCopyOf, i8);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzfwk, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i7 = this.zzd;
            Object[] objArr = this.zzb;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzfvz.zza(obj.hashCode());
                    while (true) {
                        int i8 = iZza & length;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i9])) {
                            obj2 = objArr[i9 ^ 1];
                        } else {
                            iZza = i8 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzfvz.zza(obj.hashCode());
                    while (true) {
                        int i10 = iZza2 & length2;
                        char c3 = (char) sArr[i10];
                        if (c3 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c3])) {
                            obj2 = objArr[c3 ^ 1];
                        } else {
                            iZza2 = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzfvz.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza3 & length3;
                        int i12 = iArr[i11];
                        if (i12 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iZza3 = i11 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
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
