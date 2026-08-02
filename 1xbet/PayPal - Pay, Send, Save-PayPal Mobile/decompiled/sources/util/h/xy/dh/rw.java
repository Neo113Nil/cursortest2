package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rw extends util.h.xy.dh.ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizesFor = -758714670;
    private static int getInputFormats = -408873065;
    private static int getInputSizeshNQ4ISI = 142907498;
    private static short[] getOutputFormats;
    private static byte[] getOutputMinFrameDuration = {-83, -98, 73, -66, 70, -90, 74, 78, 110, -98, 68, -75, com.google.common.base.Ascii.FF, -7, 78, 2, -27, 72, -74, 75, 70, 14, -14, -78, 78, 78, -66, 71, -66, 66, -86, com.visa.cbp.getEncExpo.registerForActivityResult, 78, -71, 65, -95, 77, 73, 105, com.visa.cbp.getEncExpo.registerForActivityResult, 67, -78, com.google.common.base.Ascii.VT, -2, 73, 5, -32, 93, -78, -73, 68, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 3, -8, 71, -74, 78, -75, 76, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -40, -40};
    private static int getOutputStallDurationlomOqCM;

    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getInputFormats ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            int i6 = getHighSpeedVideoFpsRangesFor + 117;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i8 = (int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L));
            if (z2) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 13) % 128;
                z = true;
            } else {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 5) % 128;
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    @Override // util.h.xy.dh.ma, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputStallDurationlomOqCM = (i + 53) % 128;
        int i2 = i + 37;
        getOutputStallDurationlomOqCM = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.ma, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = getOutputStallDurationlomOqCM;
        getHighResolutionOutputSizeshNQ4ISI = (i + 41) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i + 91) % 128;
        return this;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        byte b = this.getHighSpeedVideoSizes[0];
        int length = this.getHighSpeedVideoSizes.length;
        int i = length - 1;
        byte b2 = this.getHighSpeedVideoSizes[i];
        byte b3 = (byte) ((255 << (b & 255)) & this.getHighSpeedVideoSizes[i]);
        if (b2 == b3) {
            rjVar.getHighSpeedVideoSizes(z, 3, this.getHighSpeedVideoSizes);
            getHighResolutionOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + 3) % 128;
        } else {
            byte[] bArr = this.getHighSpeedVideoSizes;
            util.h.xy.dh.rj.Camera2StreamConfigurationMap = (util.h.xy.dh.rj.getHighSpeedVideoFpsRanges + 101) % 128;
            rjVar.getHighSpeedVideoSizes(z, 3);
            rjVar.getHighSpeedVideoFpsRanges(length);
            rjVar.Camera2StreamConfigurationMap(bArr, 0, i);
            int i2 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
            util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i2 % 128;
            rjVar.getHighResolutionOutputSizeshNQ4ISI.write(b3);
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = util.h.xy.dh.rj.getHighSpeedVideoFpsRanges + 105;
            util.h.xy.dh.rj.Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
        getOutputStallDurationlomOqCM = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + 107) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 105;
        int i2 = i % 128;
        getOutputStallDurationlomOqCM = i2;
        boolean z = i % 2 != 0;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 21) % 128;
        return z;
    }

    rw(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public rw(int i) {
        super(m26306(i), m26307(i));
    }

    public rw(byte[] bArr, int i) {
        super(bArr, i);
    }

    public rw(byte[] bArr) {
        this(bArr, 0);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.rw m26352(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            mmVar.m26329();
            throw null;
        }
        util.h.xy.dh.mi m26329 = mmVar.m26329();
        if (z || (m26329 instanceof util.h.xy.dh.rw)) {
            util.h.xy.dh.rw m26351 = m26351(m26329);
            getHighResolutionOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return m26351;
        }
        util.h.xy.dh.rw rwVar = new util.h.xy.dh.rw(util.h.xy.dh.rh.m26335(m26329).m26337(), true);
        int i2 = getOutputStallDurationlomOqCM + 33;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return rwVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dh.rw m26351(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dh.rw)) {
            return (util.h.xy.dh.rw) obj;
        }
        if (obj instanceof util.h.xy.dh.ma) {
            return m26350((util.h.xy.dh.ma) obj);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(282751085 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 107), (-49) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-896006305) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return m26350((util.h.xy.dh.ma) m26324((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(282751055 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), (byte) (android.text.TextUtils.indexOf("", "", 0) - 109), (-49) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.graphics.Color.alpha(0) - 896006309, objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                sb2.append(e.toString());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.rw m26350(util.h.xy.dh.ma maVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 99;
        getOutputStallDurationlomOqCM = i % 128;
        util.h.xy.dh.rw rwVar = (util.h.xy.dh.rw) maVar.Camera2StreamConfigurationMap();
        if (i % 2 == 0) {
            return rwVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
