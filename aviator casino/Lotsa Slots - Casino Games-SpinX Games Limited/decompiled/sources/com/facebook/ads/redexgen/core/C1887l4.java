package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.l4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1887l4 implements com.facebook.ads.redexgen.core.L8 {
    public static java.lang.String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1886l3 A04;
    public final com.facebook.ads.redexgen.core.C04424u A03 = new com.facebook.ads.redexgen.core.C04424u(new byte[5]);
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.LH> A01 = new android.util.SparseArray<>();
    public final android.util.SparseIntArray A02 = new android.util.SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // com.facebook.ads.redexgen.core.L8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int i;
        java.util.List list;
        com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53;
        int i2;
        int i3;
        android.util.SparseArray sparseArray;
        int i4;
        int i5;
        int i6;
        com.facebook.ads.redexgen.core.HA ha;
        boolean z;
        com.facebook.ads.redexgen.core.HA ha2;
        android.util.SparseBooleanArray sparseBooleanArray;
        android.util.SparseBooleanArray sparseBooleanArray2;
        com.facebook.ads.redexgen.core.LH lh;
        android.util.SparseArray sparseArray2;
        com.facebook.ads.redexgen.core.HA ha3;
        int i7;
        android.util.SparseBooleanArray sparseBooleanArray3;
        int i8;
        com.facebook.ads.redexgen.core.LE le;
        com.facebook.ads.redexgen.core.LH A5V;
        int i9;
        com.facebook.ads.redexgen.core.LH lh2;
        com.facebook.ads.redexgen.core.LE le2;
        com.facebook.ads.redexgen.core.LH lh3;
        com.facebook.ads.redexgen.core.LH lh4;
        com.facebook.ads.redexgen.core.HA ha4;
        int i10;
        int i11;
        java.util.List list2;
        java.util.List list3;
        if (c04434v.A0I() != 2) {
            return;
        }
        i = this.A04.A09;
        if (i != 1) {
            i10 = this.A04.A09;
            if (i10 != 2) {
                i11 = this.A04.A02;
                if (i11 != 1) {
                    list2 = this.A04.A0I;
                    anonymousClass53 = new com.facebook.ads.redexgen.core.AnonymousClass53(((com.facebook.ads.redexgen.core.AnonymousClass53) list2.get(0)).A02());
                    list3 = this.A04.A0I;
                    list3.add(anonymousClass53);
                    if ((c04434v.A0I() & 128) != 0) {
                        return;
                    }
                    c04434v.A0g(1);
                    int A0M = c04434v.A0M();
                    int i12 = 3;
                    c04434v.A0g(3);
                    c04434v.A0h(this.A03, 2);
                    this.A03.A09(3);
                    int i13 = 13;
                    this.A04.A01 = this.A03.A04(13);
                    c04434v.A0h(this.A03, 2);
                    int i14 = 4;
                    this.A03.A09(4);
                    c04434v.A0g(this.A03.A04(12));
                    i2 = this.A04.A09;
                    int i15 = 21;
                    if (i2 == 2) {
                        lh2 = this.A04.A05;
                        if (lh2 == null) {
                            com.facebook.ads.redexgen.core.LD ld = new com.facebook.ads.redexgen.core.LD(21, null, null, com.facebook.ads.redexgen.core.C5C.A07);
                            com.facebook.ads.redexgen.core.C1886l3 c1886l3 = this.A04;
                            le2 = this.A04.A0H;
                            c1886l3.A05 = le2.A5V(21, ld);
                            lh3 = this.A04.A05;
                            if (lh3 != null) {
                                lh4 = this.A04.A05;
                                ha4 = this.A04.A03;
                                lh4.AAA(anonymousClass53, ha4, new com.facebook.ads.redexgen.core.LG(A0M, 21, 8192));
                            }
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    int A07 = c04434v.A07();
                    while (A07 > 0) {
                        c04434v.A0h(this.A03, 5);
                        int A04 = this.A03.A04(8);
                        this.A03.A09(i12);
                        int A042 = this.A03.A04(i13);
                        this.A03.A09(i14);
                        int A043 = this.A03.A04(12);
                        com.facebook.ads.redexgen.core.LD A00 = A00(c04434v, A043);
                        if (A04 == 6 || A04 == 5) {
                            A04 = A00.A00;
                        }
                        A07 -= A043 + 5;
                        i7 = this.A04.A09;
                        int i16 = i7 == 2 ? A04 : A042;
                        sparseBooleanArray3 = this.A04.A0C;
                        if (!sparseBooleanArray3.get(i16)) {
                            i8 = this.A04.A09;
                            if (i8 == 2 && A04 == i15) {
                                A5V = this.A04.A05;
                            } else {
                                le = this.A04.A0H;
                                A5V = le.A5V(A04, A00);
                            }
                            i9 = this.A04.A09;
                            if (i9 == 2) {
                                android.util.SparseIntArray sparseIntArray = this.A02;
                                java.lang.String[] strArr = A05;
                                if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                                if (A042 >= sparseIntArray.get(i16, 8192)) {
                                }
                            }
                            this.A02.put(i16, A042);
                            this.A01.put(i16, A5V);
                        }
                        i15 = 21;
                        i12 = 3;
                        i14 = 4;
                        i13 = 13;
                    }
                    int size = this.A02.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        int keyAt = this.A02.keyAt(i17);
                        int valueAt = this.A02.valueAt(i17);
                        sparseBooleanArray = this.A04.A0C;
                        sparseBooleanArray.put(keyAt, true);
                        sparseBooleanArray2 = this.A04.A0D;
                        sparseBooleanArray2.put(valueAt, true);
                        com.facebook.ads.redexgen.core.LH valueAt2 = this.A01.valueAt(i17);
                        if (valueAt2 != null) {
                            lh = this.A04.A05;
                            if (valueAt2 != lh) {
                                ha3 = this.A04.A03;
                                valueAt2.AAA(anonymousClass53, ha3, new com.facebook.ads.redexgen.core.LG(A0M, keyAt, 8192));
                            }
                            sparseArray2 = this.A04.A0B;
                            sparseArray2.put(valueAt, valueAt2);
                        }
                    }
                    i3 = this.A04.A09;
                    if (i3 == 2) {
                        z = this.A04.A08;
                        if (z) {
                            return;
                        }
                        ha2 = this.A04.A03;
                        java.lang.String[] strArr2 = A05;
                        if (strArr2[1].length() != strArr2[2].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr3 = A05;
                        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
                        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
                        ha2.A6O();
                        this.A04.A02 = 0;
                        this.A04.A08 = true;
                        return;
                    }
                    int i18 = 0;
                    sparseArray = this.A04.A0B;
                    sparseArray.remove(this.A00);
                    com.facebook.ads.redexgen.core.C1886l3 c1886l32 = this.A04;
                    i4 = this.A04.A09;
                    if (i4 != 1) {
                        i5 = this.A04.A02;
                        i18 = i5 - 1;
                    }
                    c1886l32.A02 = i18;
                    i6 = this.A04.A02;
                    if (i6 == 0) {
                        ha = this.A04.A03;
                        ha.A6O();
                        this.A04.A08 = true;
                        return;
                    }
                    return;
                }
            }
        }
        list = this.A04.A0I;
        anonymousClass53 = (com.facebook.ads.redexgen.core.AnonymousClass53) list.get(0);
        if ((c04434v.A0I() & 128) != 0) {
        }
    }

    public C1887l4(com.facebook.ads.redexgen.core.C1886l3 c1886l3, int i) {
        this.A04 = c1886l3;
        this.A00 = i;
    }

    private com.facebook.ads.redexgen.core.LD A00(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        int descriptorTag = c04434v.A09();
        int descriptorLength = descriptorTag + i;
        int i2 = -1;
        java.lang.String str = null;
        java.util.ArrayList arrayList = null;
        while (c04434v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c04434v.A0I();
            int A09 = c04434v.A09() + c04434v.A0I();
            if (A09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long A0Q = c04434v.A0Q();
                if (A0Q == 1094921523) {
                    i2 = 129;
                } else if (A0Q == 1161904947) {
                    i2 = 135;
                } else if (A0Q == 1094921524) {
                    i2 = 172;
                } else if (A0Q == 1212503619) {
                    i2 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i2 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i2 = 135;
            } else {
                java.lang.String[] strArr = A05;
                java.lang.String str2 = strArr[1];
                java.lang.String str3 = strArr[2];
                int descriptorsStartPosition = str2.length();
                if (descriptorsStartPosition != str3.length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c04434v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i2 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i2 = 138;
                } else {
                    java.lang.String[] strArr3 = A05;
                    java.lang.String str4 = strArr3[1];
                    java.lang.String str5 = strArr3[2];
                    int descriptorsStartPosition3 = str4.length();
                    if (descriptorsStartPosition3 != str5.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        java.lang.String A0W = c04434v.A0W(3);
                        java.lang.String[] strArr5 = A05;
                        java.lang.String str6 = strArr5[1];
                        java.lang.String str7 = strArr5[2];
                        int descriptorsStartPosition4 = str6.length();
                        if (descriptorsStartPosition4 != str7.length()) {
                            str = A0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            str = A0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i2 = 89;
                        arrayList = new java.util.ArrayList();
                        while (c04434v.A09() < A09) {
                            java.lang.String trim = c04434v.A0W(3).trim();
                            int A0I = c04434v.A0I();
                            byte[] bArr = new byte[4];
                            c04434v.A0k(bArr, 0, 4);
                            arrayList.add(new com.facebook.ads.redexgen.core.LC(trim, A0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i2 = 257;
                    }
                }
            }
            c04434v.A0g(A09 - c04434v.A09());
        }
        c04434v.A0f(descriptorLength);
        return new com.facebook.ads.redexgen.core.LD(i2, str, arrayList, java.util.Arrays.copyOfRange(c04434v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
    }
}
