package com.facebook.ads.androidx.media3.common;

/* loaded from: assets/audience_network/classes2.dex */
public final class ColorInfo implements com.facebook.ads.redexgen.core.AnonymousClass24, android.os.Parcelable {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"fwssHt7wmjS4irtBHVgHRy1kfHVI1fy3", "Eontljbnef3w1ZNyXpqY7w", "WqOEcdnYiI", "OC7aOsM7dG7kZGpbfVwzqO", "jKxxMaD7lr6ZikoqJ8VvarFUhz7fi6dh", "IxIxrmcLCYn92mmubnPuZ", "k8ZHYUrndjPkyYjbitUMWCOJyy2ruKg", "BYcVzsGm3P4KW5EWFDHzj0wXk7JiqRGv"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.ColorInfo> A07;
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.androidx.media3.common.ColorInfo> A08;
    public static final com.facebook.ads.androidx.media3.common.ColorInfo A09;
    public static final com.facebook.ads.androidx.media3.common.ColorInfo A0A;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[7].charAt(5) != 's') {
                throw new java.lang.RuntimeException();
            }
            A06[2] = "3J0fS2w4pJ";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
            if (A06[2].length() != 10) {
                A06[4] = "NZQ27YGgzUvTQnYJbnO7KrKPnOKajcu0";
                copyOfRange[i4] = b;
                i4 += 0;
            } else {
                java.lang.String[] strArr = A06;
                strArr[3] = "apS4Da1AN2CX9NcLFevAWz";
                strArr[1] = "J8xda0JkxA2JO9OskXZrhx";
                copyOfRange[i4] = b;
                i4++;
            }
        }
    }

    public static void A08() {
        A05 = new byte[]{49, 97, 109, 59, 45, 75, 73, 75, 73, 59, 45, 79, 73, 72, 62, 40, 75, 76, 69, 32, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 17, 42, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.FF, 75, com.google.common.base.Ascii.CR, 62, 39, 39, 107, 57, 42, 37, 44, 46, 71, 97, 109, 109, 97, 32, 50, 46, 50, 42, 46, 37, 122, 95, 91, 95, 66, 83, 82, com.google.common.base.Ascii.SYN, 68, 87, 88, 81, 83, 92, 121, 126, 117, 113, 98, 83, 68, 82, 32, 83, 77, 80, 84, 69, 32, 49, 55, 48, 77, 39, 32, 70, 68, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 84, 36, 37, 74, 113, 123, 122, 121, 118, 113, 122, 123, 63, 124, 112, 115, 112, 109, 63, 109, 126, 113, 120, 122, 121, 66, 72, 73, 74, 69, 66, 73, 72, com.google.common.base.Ascii.FF, 79, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 94, com.google.common.base.Ascii.FF, 95, 92, 77, 79, 73, 47, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 90, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, 8, 90, com.google.common.base.Ascii.SO, 8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 8, 9, 50, 47, 57, 40, 124, 63, 51, 48, 51, 46, 124, 46, kotlin.io.encoding.Base64.padSymbol, 50, 59, 57, 90, 97, 124, 106, 123, 47, 108, 96, 99, 96, 125, 47, 124, Byte.MAX_VALUE, 110, 108, 106, 58, 1, com.google.common.base.Ascii.FS, 10, com.google.common.base.Ascii.ESC, 79, com.google.common.base.Ascii.FF, 0, 3, 0, com.google.common.base.Ascii.GS, 79, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.FS, 9, 10, com.google.common.base.Ascii.GS, 1, 32, 53, 48};
    }

    static {
        A08();
        A09 = new com.facebook.ads.androidx.media3.common.ColorInfo(1, 2, 3, null);
        A0A = new com.facebook.ads.redexgen.core.C03742a().A01(1).A00(1).A02(2).A03();
        A07 = new android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.ColorInfo>() { // from class: com.facebook.ads.redexgen.X.2Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.ColorInfo createFromParcel(android.os.Parcel parcel) {
                return new com.facebook.ads.androidx.media3.common.ColorInfo(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.ColorInfo[] newArray(int i) {
                return new com.facebook.ads.androidx.media3.common.ColorInfo[i];
            }
        };
        A08 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qO
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                return com.facebook.ads.androidx.media3.common.ColorInfo.A02(bundle);
            }
        };
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(android.os.Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = com.facebook.ads.redexgen.core.C5C.A1C(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int A00(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 8:
            default:
                return -1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 2;
            case 9:
                return 6;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int A01(int i) {
        switch (i) {
            case 1:
            case 6:
            case 7:
                return 3;
            case 4:
                return 10;
            case 13:
                java.lang.String[] strArr = A06;
                if (strArr[3].length() != strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                A06[4] = "iITQwSOY6G69yL4zBCgmbr9Ezk0yNeSE";
                return 2;
            case 16:
                return 6;
            case 18:
                return 7;
            default:
                return -1;
        }
    }

    public static /* synthetic */ com.facebook.ads.androidx.media3.common.ColorInfo A02(android.os.Bundle bundle) {
        return new com.facebook.ads.androidx.media3.common.ColorInfo(bundle.getInt(A06(0), -1), bundle.getInt(A06(1), -1), bundle.getInt(A06(2), -1), bundle.getByteArray(A06(3)));
    }

    public static java.lang.String A03(int i) {
        switch (i) {
            case -1:
                return A07(159, 17, 6);
            case 0:
            default:
                if (A06[7].charAt(5) != 's') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A06;
                strArr[6] = "vjIO54OW5kLbXJOIktKSO2lZwe9uVoS";
                strArr[5] = "lPZMw6sIoJTf8tamb5XBd";
                return A07(93, 21, 69);
            case 1:
                return A07(29, 10, 17);
            case 2:
                return A07(51, 13, 108);
        }
    }

    public static java.lang.String A04(int i) {
        switch (i) {
            case -1:
                return A07(176, 17, 85);
            case 0:
            case 3:
            case 4:
            case 5:
            default:
                return A07(114, 21, 118);
            case 1:
                return A07(14, 5, 38);
            case 2:
                return A07(9, 5, 35);
            case 6:
                return A07(3, 6, 35);
        }
    }

    public static java.lang.String A05(int i) {
        switch (i) {
            case -1:
                return A07(193, 20, 53);
            case 0:
            case 4:
            case 5:
            case 8:
            case 9:
            default:
                return A07(135, 24, 32);
            case 1:
                return A07(64, 6, 74);
            case 2:
                if (A06[4].charAt(21) != 'r') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A06;
                strArr[6] = "Bpd0ZivgAzgpSLL99gZnlOGn3AZ7ySo";
                strArr[5] = "Ie1ERw9CGiz8VQ2Le8mIF";
                return A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 4, 40);
            case 3:
                return A07(70, 14, 90);
            case 6:
                return A07(84, 9, 46);
            case 7:
                return A07(48, 3, 56);
            case 10:
                return A07(39, 9, 90);
        }
    }

    public static java.lang.String A06(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public static boolean A09(com.facebook.ads.androidx.media3.common.ColorInfo colorInfo) {
        return colorInfo != null && (colorInfo.A03 == 7 || colorInfo.A03 == 6);
    }

    public final com.facebook.ads.redexgen.core.C03742a A0A() {
        return new com.facebook.ads.redexgen.core.C03742a(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.androidx.media3.common.ColorInfo colorInfo = (com.facebook.ads.androidx.media3.common.ColorInfo) obj;
        if (this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03 && java.util.Arrays.equals(this.A04, colorInfo.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = ((((17 * 31) + result) * 31) + this.A01) * 31;
            int result3 = this.A03;
            this.A00 = ((result2 + result3) * 31) + java.util.Arrays.hashCode(this.A04);
        }
        int result4 = this.A00;
        return result4;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A07(19, 10, 57)).append(A04(this.A02));
        java.lang.String A072 = A07(1, 2, 23);
        return append.append(A072).append(A03(this.A01)).append(A072).append(A05(this.A03)).append(A072).append(this.A04 != null).append(A07(0, 1, 66)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        com.facebook.ads.redexgen.core.C5C.A0w(parcel, this.A04 != null);
        if (this.A04 != null) {
            parcel.writeByteArray(this.A04);
        }
    }
}
