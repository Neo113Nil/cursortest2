package util.h.xy.s;

/* loaded from: classes5.dex */
public class f {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 71) % 128;

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte m27207() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 119) + ((i & 119) << 1)) % 128;
        return this.getHighSpeedVideoFpsRanges[0];
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27209(byte[] bArr) {
        int i = getHighSpeedVideoSizes + 31;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (bArr != null) {
            this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 3) % 128;
        } else {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i2 = ~identityHashCode;
            int i3 = (~(1486422005 | identityHashCode)) | (~((773220496 ^ i2) | (i2 & 773220496)));
            int i4 = ~((i2 ^ (-1486422006)) | (i2 & (-1486422006)));
            int i5 = ((i3 ^ i4) | (i3 & i4)) * (-516);
            int i6 = ~((identityHashCode ^ (-637927425)) | (identityHashCode & (-637927425)));
            int i7 = ~(((-773220497) ^ i2) | (i2 & (-773220497)) | (-1486422006));
            int i8 = ~(i2 | (-1486422006));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i9 = ~(((-1233260545) ^ identityHashCode2) | (identityHashCode2 & (-1233260545)));
            int i10 = ~identityHashCode2;
            int i11 = (i10 ^ 1773572396) | (i10 & 1773572396);
            int i12 = ~((i11 ^ 1606637138) | (i11 & 1606637138));
            int i13 = ((i9 ^ i12) | (i9 & i12)) * (-318);
            int i14 = ((((i13 | 1834405042) << 1) - (i13 ^ 1834405042)) - (~(-(-(((~((identityHashCode2 ^ 1773572396) | (identityHashCode2 & 1773572396))) | 373376594) * (-318)))))) - 1;
            int i15 = ~((identityHashCode2 ^ (-1773572397)) | (identityHashCode2 & (-1773572397)));
            int i16 = -(-(((i15 ^ (-1606637139)) | (i15 & (-1606637139))) * 318));
            if ((i5 ^ 1542371970) + ((i5 & 1542371970) << 1) + (((i6 ^ i7) | (i7 & i6)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((135293072 ^ i8) | (i8 & 135293072)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) <= (i14 ^ i16) + ((i16 & i14) << 1)) {
                this.getHighSpeedVideoFpsRanges = new byte[1];
            } else {
                this.getHighSpeedVideoFpsRanges = new byte[0];
            }
            int i17 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i17 & 11) + (i17 | 11)) % 128;
        }
        int i18 = getHighResolutionOutputSizeshNQ4ISI + 115;
        getHighSpeedVideoSizes = i18 % 128;
        if (i18 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte m27208() {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            byte b = bArr[1];
            util.h.xy.ar.b.m25074(bArr);
            i = (b & com.google.common.base.Ascii.FS) * 3;
        } else {
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            byte b2 = bArr2[0];
            util.h.xy.ar.b.m25074(bArr2);
            i = (b2 & 255) >> 3;
        }
        byte b3 = (byte) i;
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 7;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return b3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27212(byte[] bArr) {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (((i2 | 121) << 1) - (i2 ^ 121)) % 128;
        getHighSpeedVideoSizes = i3;
        if (bArr == null) {
            int i4 = ((i3 ^ 67) + ((i3 & 67) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            this.Camera2StreamConfigurationMap = new byte[0];
            i = ((i4 | 107) << 1) - (i4 ^ 107);
        } else {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
            i = getHighResolutionOutputSizeshNQ4ISI + 13;
        }
        int i5 = i % 128;
        getHighSpeedVideoSizes = i5;
        int i6 = (i5 ^ 97) + ((i5 & 97) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27210() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 67) + (i | 67)) % 128;
        byte[] bArr = (byte[]) this.getHighSpeedVideoFpsRangesFor.clone();
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 97) + ((i2 & 97) << 1)) % 128;
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27213(byte[] bArr) {
        if (bArr != null) {
            this.getHighSpeedVideoFpsRangesFor = (byte[]) bArr.clone();
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        } else {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 29) << 1) - (i ^ 29);
            int i3 = i2 % 128;
            getHighSpeedVideoSizes = i3;
            int i4 = i2 % 2;
            this.getHighSpeedVideoFpsRangesFor = new byte[0];
            getHighResolutionOutputSizeshNQ4ISI = ((i3 & 121) + (i3 | 121)) % 128;
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI;
        int i6 = ((i5 | 45) << 1) - (i5 ^ 45);
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27211(byte b) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 113) + ((i & 113) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        if (bArr2 != null) {
            int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr2.length;
                throw null;
            }
            if (bArr2.length > 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 17) % 128;
                int length2 = bArr2.length + 2;
                byte[] bArr3 = new byte[length2];
                bArr3[0] = m27207();
                bArr3[1] = m27208();
                byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = length2 * (-396);
                int i5 = ((i4 | (-796)) << 1) - (i4 ^ (-796));
                int i6 = ~identityHashCode;
                int i7 = ~((i6 ^ 1) | (i6 & 1));
                int i8 = ~((length2 ^ 1) | (length2 & 1));
                int i9 = (i7 ^ i8) | (i7 & i8);
                int i10 = ~((i6 ^ length2) | (i6 & length2));
                int i11 = -(-(((i10 ^ i9) | (i10 & i9)) * (-397)));
                int i12 = (i5 ^ i11) + ((i11 & i5) << 1) + (i8 * (-397));
                int i13 = (identityHashCode ^ i8) | (identityHashCode & i8);
                int i14 = ~((~length2) | (-2));
                int i15 = -(-(((i14 ^ i13) | (i14 & i13)) * 397));
                java.lang.System.arraycopy(bArr4, 0, bArr3, 2, ((i12 | i15) << 1) - (i15 ^ i12));
                bArr = util.h.xy.al.rd.m25023(new byte[]{b}, bArr3);
                int i16 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i16 & 121) + (i16 | 121)) % 128;
            }
        }
        int i17 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i17 ^ 13) + ((i17 & 13) << 1)) % 128;
        return bArr;
    }
}
