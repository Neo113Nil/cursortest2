package util.h.xy.ej;

/* loaded from: classes18.dex */
public final class rc implements util.h.xy.ef.rg {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -1231763795;
    private byte[] getOutputMinFrameDuration = null;
    private int getInputSizeshNQ4ISI = 0;
    private int getOutputFormats = 0;
    private byte[] getInputFormats = null;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = Camera2StreamConfigurationMap;
        int i5 = i4 + 57;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = (i4 + 37) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 111) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i6 = raVar.f2649;
            cArr[i6] = (char) (cArr[i6] - ((int) (getHighSpeedVideoSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private void getHighSpeedVideoSizes(byte[] bArr) {
        this.getInputFormats = bArr;
        int i = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputFormats = 0;
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = new byte[256];
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        }
        int i2 = 0;
        while (i2 < 256) {
            int i3 = getHighSpeedVideoFpsRangesFor + 73;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                this.getOutputMinFrameDuration[i2] = (byte) i2;
                i2 += 42;
            } else {
                this.getOutputMinFrameDuration[i2] = (byte) i2;
                i2++;
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i < 256) {
            byte b = bArr[i4];
            byte[] bArr2 = this.getOutputMinFrameDuration;
            byte b2 = bArr2[i];
            i5 = ((b & 255) + b2 + i5) & 255;
            bArr2[i] = bArr2[i5];
            bArr2[i5] = b2;
            i4 = (i4 + 1) % bArr.length;
            i++;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        }
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ᐝ */
    public final void mo26570() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoSizes(this.getInputFormats);
            throw null;
        }
        getHighSpeedVideoSizes(this.getInputFormats);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 53;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ᐝ */
    public final int mo26553(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\fﾽ\u0010\u0005\f\u000f\u0011\u0006\u000b\r\u0012\u0011ﾽ\uffff\u0012\u0003\u0003\u0002\u000fﾽ\u0011\f", (intValue >> 22) + 22, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 8, 158 - android.graphics.Color.alpha(0), false, objArr);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (i3 + i2 > bArr2.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ﾼ\u000b\u000b\u0010ﾼ\u000e\u0001\u0002\u0002\u0011\ufffeﾼ\u0010\u0011\f\u0010\u0011\u000b\u0010\u000e\u000b\u0004\u000f", (-16777193) - android.graphics.Color.rgb(0, 0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, 159 - android.widget.ExpandableListView.getPackedPositionType(0L), true, objArr2);
            throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.getInputSizeshNQ4ISI + 1) & 255;
            this.getInputSizeshNQ4ISI = i5;
            byte[] bArr3 = this.getOutputMinFrameDuration;
            byte b = bArr3[i5];
            int i6 = (this.getOutputFormats + b) & 255;
            this.getOutputFormats = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ᐝ */
    public final byte mo26552(byte b) {
        int i = (getHighSpeedVideoFpsRangesFor + 91) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        int i2 = (this.getInputSizeshNQ4ISI + 1) & 255;
        this.getInputSizeshNQ4ISI = i2;
        byte[] bArr = this.getOutputMinFrameDuration;
        byte b2 = bArr[i2];
        int i3 = (this.getOutputFormats + b2) & 255;
        this.getOutputFormats = i3;
        bArr[i2] = bArr[i3];
        bArr[i3] = b2;
        byte b3 = (byte) (b ^ bArr[(bArr[i2] + b2) & 255]);
        int i4 = i + 95;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return b3;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ˋ */
    public final void mo26569(boolean z, util.h.xy.ef.mb mbVar) {
        int i = getHighSpeedVideoFpsRangesFor + 71;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (mbVar instanceof util.h.xy.ep.mc) {
            byte[] m26663 = ((util.h.xy.ep.mc) mbVar).m26663();
            this.getInputFormats = m26663;
            getHighSpeedVideoSizes(m26663);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ￇ\u0017\b\u001a\u001a\f\u000bￇ\u001b\u0016ￇ\ufff9￪ￛￇ\u0010\u0015\u0010\u001bￇￔￇ\u0010\u0015\u001d\b\u0013\u0010\u000bￇ\u0017\b\u0019\b\u0014\f\u001b\f\u0019", 39 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 148, false, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(mbVar.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
