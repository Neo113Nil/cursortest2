package util.h.xy.dh;

/* loaded from: classes5.dex */
public class rj {
    static int Camera2StreamConfigurationMap = 1;
    static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = -408873008;
    private static int getInputSizeshNQ4ISI = 1440011309;
    private static byte[] getOutputFormats = {-76, -72, 3, -40, -40};
    private static int getOutputMinFrameDuration = 458704803;
    java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getInputFormats ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputFormats;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputFormats;
            if (bArr3 != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 93) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i8 = getHighSpeedVideoFpsRangesFor + 105;
                getHighSpeedVideoSizes = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i4) {
                        if (z) {
                            byte[] bArr5 = getOutputFormats;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getHighSpeedVideoSizesFor;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            }
            z = false;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
            }
        }
        objArr[0] = sb.toString();
    }

    static int Camera2StreamConfigurationMap(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            int i3 = (getHighSpeedVideoFpsRanges + 15) % 128;
            Camera2StreamConfigurationMap = i3;
            i2++;
            getHighSpeedVideoFpsRanges = (i3 + 81) % 128;
        }
    }

    static int getHighSpeedVideoFpsRangesFor(boolean z, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i2 + 25) % 128;
        if (z) {
            int i3 = i2 + 63;
            Camera2StreamConfigurationMap = i3 % 128;
            r1 = i3 % 2 != 0 ? 1 : 0;
            Camera2StreamConfigurationMap = (i2 + 7) % 128;
        }
        return r1 + getHighSpeedVideoFpsRangesFor(i) + i;
    }

    static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i < 128) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 85) % 128;
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 47) % 128;
                return i2;
            }
            i2++;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 29) % 128;
        }
    }

    void getHighSpeedVideoFpsRanges(util.h.xy.dh.mi[] miVarArr) throws java.io.IOException {
        int length = miVarArr.length;
        int i = 0;
        while (i < length) {
            int i2 = Camera2StreamConfigurationMap + 21;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                miVarArr[i].getHighResolutionOutputSizeshNQ4ISI(this, true);
                i += 10;
            } else {
                miVarArr[i].getHighResolutionOutputSizeshNQ4ISI(this, true);
                i++;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 103) % 128;
        }
    }

    void getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mi miVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        miVar.getHighResolutionOutputSizeshNQ4ISI(this, z);
        int i = Camera2StreamConfigurationMap + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    final void getHighSpeedVideoSizes(int i, int i2) throws java.io.IOException {
        int i3 = getHighSpeedVideoFpsRanges + 83;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i2 < 31) {
            int i5 = i4 + 111;
            getHighSpeedVideoFpsRanges = i5 % 128;
            this.getHighResolutionOutputSizeshNQ4ISI.write(i | i2);
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr = new byte[6];
        int i6 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
            i2 >>>= 7;
            i6--;
            bArr[i6] = (byte) ((i2 & 127) | 128);
        }
        int i7 = i6 - 1;
        bArr[i7] = (byte) (i | 31);
        Camera2StreamConfigurationMap(bArr, i7, 6 - i7);
    }

    final void getHighSpeedVideoSizes(boolean z, int i) throws java.io.IOException {
        int i2 = getHighSpeedVideoFpsRanges + 11;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            int i4 = i3 + 111;
            getHighSpeedVideoFpsRanges = i4 % 128;
            this.getHighResolutionOutputSizeshNQ4ISI.write(i);
            if (i4 % 2 != 0) {
                throw null;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 45) % 128;
        }
    }

    final void getHighSpeedVideoFpsRangesFor(boolean z, int i, util.h.xy.dh.c[] cVarArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 29) % 128;
        getHighSpeedVideoSizes(z, i);
        int i2 = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRanges = i2 % 128;
        this.getHighResolutionOutputSizeshNQ4ISI.write(128);
        if (i2 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges(cVarArr);
        int i3 = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRanges = i3 % 128;
        this.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRanges = i4 % 128;
        this.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = getHighSpeedVideoFpsRanges + 105;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    final void Camera2StreamConfigurationMap(boolean z, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        int i4 = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRanges = i4 % 128;
        getHighSpeedVideoSizes(z, i);
        getHighSpeedVideoFpsRanges(i3);
        Camera2StreamConfigurationMap(bArr, i2, i3);
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = getHighSpeedVideoFpsRanges + 111;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final void getHighSpeedVideoSizes(boolean z, int i, byte[] bArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 3) % 128;
        getHighSpeedVideoSizes(z, i);
        getHighSpeedVideoFpsRanges(bArr.length);
        Camera2StreamConfigurationMap(bArr, 0, bArr.length);
        int i2 = getHighSpeedVideoFpsRanges + 17;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    void getHighSpeedVideoFpsRanges(util.h.xy.dh.c[] cVarArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        for (util.h.xy.dh.c cVar : cVarArr) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 63) % 128;
            cVar.mo26279().getHighResolutionOutputSizeshNQ4ISI(this, true);
        }
    }

    final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
            throw null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 43) % 128;
    }

    final void getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i3 + 1) % 128;
        if (i < 128) {
            int i4 = i3 + 111;
            getHighSpeedVideoFpsRanges = i4 % 128;
            this.getHighResolutionOutputSizeshNQ4ISI.write(i);
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr = new byte[5];
        int i5 = 5;
        while (true) {
            i2 = i5 - 1;
            bArr[i2] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                break;
            } else {
                i5 = i2;
            }
        }
        int i6 = getHighSpeedVideoFpsRanges + 7;
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = i5 - 2;
            bArr[i7] = (byte) ((5 - i2) | 128);
            Camera2StreamConfigurationMap(bArr, i7, 6 - i2);
        } else {
            int i8 = 5 / i2;
            int i9 = i5 + 79;
            bArr[i9] = (byte) (i8 | 12431);
            Camera2StreamConfigurationMap(bArr, i9, i8);
        }
    }

    util.h.xy.dh.am getHighSpeedVideoFpsRanges() {
        util.h.xy.dh.am amVar = new util.h.xy.dh.am(this.getHighResolutionOutputSizeshNQ4ISI);
        int i = getHighSpeedVideoFpsRanges + 41;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return amVar;
        }
        throw null;
    }

    util.h.xy.dh.z getHighResolutionOutputSizeshNQ4ISI() {
        util.h.xy.dh.z zVar = new util.h.xy.dh.z(this.getHighResolutionOutputSizeshNQ4ISI);
        int i = Camera2StreamConfigurationMap + 83;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return zVar;
        }
        throw new java.lang.ArithmeticException();
    }

    rj(java.io.OutputStream outputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dh.rj m26338(java.io.OutputStream outputStream, java.lang.String str) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 53) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1300904970, (short) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) (97 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 5, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50966473, objArr);
        if (str.equals(((java.lang.String) objArr[0]).intern())) {
            util.h.xy.dh.z zVar = new util.h.xy.dh.z(outputStream);
            int i = Camera2StreamConfigurationMap + 97;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return zVar;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(1300904974 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (byte) ((-45) - android.graphics.Color.red(0)), (-6) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 50966473, objArr2);
        if (!str.equals(((java.lang.String) objArr2[0]).intern())) {
            return new util.h.xy.dh.rj(outputStream);
        }
        util.h.xy.dh.am amVar = new util.h.xy.dh.am(outputStream);
        int i2 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return amVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dh.rj m26339(java.io.OutputStream outputStream) {
        util.h.xy.dh.rj rjVar = new util.h.xy.dh.rj(outputStream);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        return rjVar;
    }
}
