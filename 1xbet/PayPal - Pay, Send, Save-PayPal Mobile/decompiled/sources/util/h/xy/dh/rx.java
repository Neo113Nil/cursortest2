package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rx extends util.h.xy.dh.me {
    private static long Camera2StreamConfigurationMap = -5793912797138318808L;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputFormats = 1;
    private static int getOutputFormats;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 125;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(Camera2StreamConfigurationMap ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (Camera2StreamConfigurationMap ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    @Override // util.h.xy.dh.me, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getInputFormats + 21;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.me, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = (getOutputFormats + 39) % 128;
        getInputFormats = i;
        int i2 = i + 115;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.me, util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getOutputFormats = (getInputFormats + 49) % 128;
        rjVar.getHighSpeedVideoSizes(z, 24, getHighSpeedVideoSizes());
        int i = getInputFormats + 87;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.me, util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getInputFormats + 55;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, getHighSpeedVideoSizes().length);
            throw new java.lang.ArithmeticException();
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, getHighSpeedVideoSizes().length);
        int i2 = getOutputFormats + 73;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    private byte[] getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges.length - 1] != 90) {
            return this.getHighSpeedVideoFpsRanges;
        }
        if (!m26313()) {
            byte[] bArr = new byte[this.getHighSpeedVideoFpsRanges.length + 4];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, 0, this.getHighSpeedVideoFpsRanges.length - 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("瑸⌎쓣촣瑈턾⃓ᬓ밢", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            java.lang.System.arraycopy(util.h.xy.fb.rd.m26856(((java.lang.String) objArr[0]).intern()), 0, bArr, this.getHighSpeedVideoFpsRanges.length - 1, 5);
            return bArr;
        }
        if (!m26315()) {
            getInputFormats = (getOutputFormats + 11) % 128;
            byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.length + 2];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr2, 0, this.getHighSpeedVideoFpsRanges.length - 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uf455牣뷽㱚\uf465聓妧", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
            java.lang.System.arraycopy(util.h.xy.fb.rd.m26856(((java.lang.String) objArr2[0]).intern()), 0, bArr2, this.getHighSpeedVideoFpsRanges.length - 1, 3);
            return bArr2;
        }
        if (!m26312()) {
            return this.getHighSpeedVideoFpsRanges;
        }
        int i = getInputFormats + 55;
        getOutputFormats = i % 128;
        int length = (i % 2 != 0 ? this.getHighSpeedVideoFpsRanges.length : this.getHighSpeedVideoFpsRanges.length) - 2;
        while (length > 0) {
            int i2 = getInputFormats + 85;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                if (this.getHighSpeedVideoFpsRanges[length] != 48) {
                    break;
                }
                getInputFormats = (getOutputFormats + 69) % 128;
                length--;
            } else {
                if (this.getHighSpeedVideoFpsRanges[length] != 67) {
                    break;
                }
                getInputFormats = (getOutputFormats + 69) % 128;
                length--;
            }
        }
        if (this.getHighSpeedVideoFpsRanges[length] == 46) {
            byte[] bArr3 = new byte[length + 1];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr3, 0, length);
            bArr3[length] = com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME;
            int i3 = getInputFormats + 101;
            getOutputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr3;
            }
            throw null;
        }
        byte[] bArr4 = new byte[length + 2];
        int i4 = length + 1;
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, i4);
        bArr4[i4] = com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i5 = getInputFormats + 1;
        getOutputFormats = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr4;
        }
        throw null;
    }

    public rx(java.lang.String str) {
        super(str);
    }

    public rx(byte[] bArr) {
        super(bArr);
    }
}
