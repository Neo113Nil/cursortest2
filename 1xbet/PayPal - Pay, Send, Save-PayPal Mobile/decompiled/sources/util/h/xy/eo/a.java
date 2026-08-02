package util.h.xy.eo;

/* loaded from: classes5.dex */
public final class a implements util.h.xy.ef.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private int getHighSpeedVideoSizesFor;
    private util.h.xy.ef.ra getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private boolean getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputStallDurationlomOqCM;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {8164, 19651, 47524, 59033, 21348, 32844, 60705, 23044, 34558, 62412, 8377, 36228, 64098, 10051, 37997, 49435, 11752, 39630, 51129, 13442, 24959, 52749, 15136, 26648, 54526, 473, 28397, 56207, 2152, 29965, 41529, 3845, 31720, 43149, 5566, 17036, 44896, 7240, 18797, 46593, 58088, 20419, 48298, 59801, 22117, 33549, 61484, 23838, 35245, 63183, 9121, 36994, 64878, 10822, 38765, 50206, 12516, 40407, 51880, 40034, 53056, 14895, 25871, 53486, 981, 28385, 55682, 1385, 28736, 41775, 3590, 31204, 42113, 6052, 17039, 44642, 6483, 17464, 46865, 58101, 19912, 47279, 60294, 22305, 33362, 60725, 22528, 35829, 63172, 8673, 35990, 63592, 11093, 38441, 49422, 11508, 40917, 51937, 13713, 24947, 52302, 16183, 27144, 54757, 200, 29615, 56966, 2593, 30026, 40996, 4888, 32431, 40040, 53071, 14897, 25876, 53493, 897, 28323, 55700, 1383, 28743, 41764, 3603, 31137, 42197, 6062, 17038, 44577, 6482, 17449, 46862, 58099, 19925};
    private static long getOutputFormats = 6837338105382620961L;

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 21) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 19) % 128;
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
            rbVar.f2651++;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 25) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 119) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private int Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2, int i2) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int i3 = this.getHighSpeedVideoSizesFor;
        int i4 = 0;
        if (i + i3 > bArr.length) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(makeMeasureSpec + 22, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 111, (char) android.text.TextUtils.indexOf("", ""), objArr);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
        }
        java.lang.System.arraycopy(bArr, i, this.getOutputMinFrameDurationlomOqCM, 0, i3);
        int mo26555 = this.getInputFormats.mo26555(bArr, i, bArr2, i2);
        while (i4 < this.getHighSpeedVideoSizesFor) {
            int i5 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (i5 + 13) % 128;
            int i6 = i2 + i4;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.getInputSizeshNQ4ISI[i4]);
            i4++;
            getHighSpeedVideoFpsRangesFor = (i5 + 27) % 128;
        }
        byte[] bArr3 = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
        this.getOutputMinFrameDurationlomOqCM = bArr3;
        int i7 = getHighSpeedVideoFpsRanges + 109;
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 != 0) {
            return mo26555;
        }
        throw null;
    }

    private int getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, int i2) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 7) % 128;
        if (this.getHighSpeedVideoSizesFor + i > bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 112 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
        }
        int i3 = 0;
        while (i3 < this.getHighSpeedVideoSizesFor) {
            int i4 = getHighSpeedVideoFpsRangesFor + 29;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                byte[] bArr3 = this.getInputSizeshNQ4ISI;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i * i3]);
                i3 += 112;
            } else {
                byte[] bArr4 = this.getInputSizeshNQ4ISI;
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i + i3]);
                i3++;
            }
        }
        int mo26555 = this.getInputFormats.mo26555(this.getInputSizeshNQ4ISI, 0, bArr2, i2);
        byte[] bArr5 = this.getInputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr2, i2, bArr5, 0, bArr5.length);
        return mo26555;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public final void mo26557() {
        int i = getHighSpeedVideoFpsRanges + 99;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.getOutputStallDurationlomOqCM;
            java.lang.System.arraycopy(bArr, 0, this.getInputSizeshNQ4ISI, 0, bArr.length);
            util.h.xy.fb.a.m26826(this.getOutputMinFrameDurationlomOqCM, (byte) 0);
        } else {
            byte[] bArr2 = this.getOutputStallDurationlomOqCM;
            java.lang.System.arraycopy(bArr2, 0, this.getInputSizeshNQ4ISI, 0, bArr2.length);
            util.h.xy.fb.a.m26826(this.getOutputMinFrameDurationlomOqCM, (byte) 0);
        }
        this.getInputFormats.mo26557();
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int Camera2StreamConfigurationMap2;
        int i3 = getHighSpeedVideoFpsRanges + 3;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getOutputMinFrameDuration) {
            Camera2StreamConfigurationMap2 = getHighSpeedVideoSizes(bArr, i, bArr2, i2);
        } else {
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, i, bArr2, i2);
            int i4 = getHighSpeedVideoFpsRanges + 105;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getHighSpeedVideoFpsRanges + 91;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26554() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        int mo26554 = this.getInputFormats.mo26554();
        int i = getHighSpeedVideoFpsRanges + 67;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return mo26554;
        }
        throw null;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final void mo26556(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        boolean z2 = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = z;
        if (!(mbVar instanceof util.h.xy.ep.e)) {
            mo26557();
            if (mbVar != null) {
                int i = getHighSpeedVideoFpsRanges + 113;
                getHighSpeedVideoFpsRangesFor = i % 128;
                this.getInputFormats.mo26556(z, mbVar);
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            if (z2 == z) {
                return;
            }
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(deadChar + 53, 60 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        util.h.xy.ep.e eVar = (util.h.xy.ep.e) mbVar;
        byte[] m26658 = eVar.m26658();
        if (m26658.length != this.getHighSpeedVideoSizesFor) {
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(59 - (jumpTapTimeout >> 16), android.text.TextUtils.indexOf("", "", 0, 0), (char) (33676 - android.text.TextUtils.getOffsetBefore("", 0)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        java.lang.System.arraycopy(m26658, 0, this.getOutputStallDurationlomOqCM, 0, m26658.length);
        mo26557();
        if (eVar.m26659() != null) {
            this.getInputFormats.mo26556(z, eVar.m26659());
        } else if (z2 != z) {
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(53 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 60, (char) android.graphics.Color.alpha(0), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 35) % 128;
    }

    public a(util.h.xy.ef.ra raVar) {
        this.getInputFormats = raVar;
        int mo26554 = raVar.mo26554();
        this.getHighSpeedVideoSizesFor = mo26554;
        this.getOutputStallDurationlomOqCM = new byte[mo26554];
        this.getInputSizeshNQ4ISI = new byte[mo26554];
        this.getOutputMinFrameDurationlomOqCM = new byte[mo26554];
    }
}
