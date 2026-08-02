package util.h.xy.ej;

/* loaded from: classes18.dex */
final class mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static int getHighSpeedVideoFpsRangesFor = 1;
    static int getHighSpeedVideoSizes = 0;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI = 1705622021;
    private static int getOutputFormats = 2123706601;
    private static int getOutputMinFrameDuration = -408873080;
    private static byte[] getOutputStallDurationlomOqCM = {com.google.common.base.Ascii.ETB, 101, -42, -90, -95, -48, -33, com.google.common.base.Ascii.FS, -72, -73, -38, -21, com.visa.cbp.getEncExpo.IResultReceiver, -36, -46, com.google.common.base.Ascii.US, 100, -89, -82, -54, -82, com.google.common.base.Ascii.NAK, 106, -39, -92, 13, 117, 88, -34, -37, -34};
    util.h.xy.ep.md Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        boolean z = i6 == -1;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 47) % 128;
            byte[] bArr = getOutputStallDurationlomOqCM;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i6 = (byte) (((byte) (getOutputStallDurationlomOqCM[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i8 = getInputFormats + 23;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 != 0) {
                i4 = ((i >> i6) / 5) - ((int) (getOutputFormats | (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputStallDurationlomOqCM;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = getInputFormats + 69;
                    getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                    if (i10 % 2 != 0) {
                        bArr4[i9] = (byte) (bArr3[i9] % (-2689713159175858216L));
                    } else {
                        bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                        i9++;
                    }
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    int i11 = getInputFormats + 111;
                    getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                    if (i11 % 2 == 0) {
                        byte[] bArr5 = getOutputStallDurationlomOqCM;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    } else {
                        int i12 = meVar.f2647;
                        throw new java.lang.ArithmeticException();
                    }
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
        objArr[0] = sb.toString();
    }

    public final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger) {
        int i = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        getHighSpeedVideoSizes = i;
        util.h.xy.ep.md mdVar = this.Camera2StreamConfigurationMap;
        if (!(mdVar instanceof util.h.xy.ep.re)) {
            return bigInteger.modPow(mdVar.m26665(), this.Camera2StreamConfigurationMap.m26664());
        }
        getHighSpeedVideoFpsRangesFor = (i + 33) % 128;
        util.h.xy.ep.re reVar = (util.h.xy.ep.re) mdVar;
        java.math.BigInteger m26683 = reVar.m26683();
        java.math.BigInteger m26679 = reVar.m26679();
        java.math.BigInteger m26684 = reVar.m26684();
        java.math.BigInteger m26680 = reVar.m26680();
        java.math.BigInteger m26682 = reVar.m26682();
        java.math.BigInteger modPow = bigInteger.remainder(m26683).modPow(m26684, m26683);
        java.math.BigInteger modPow2 = bigInteger.remainder(m26679).modPow(m26680, m26679);
        java.math.BigInteger add = modPow.subtract(modPow2).multiply(m26682).mod(m26683).multiply(m26679).add(modPow2);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        return add;
    }

    public final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        try {
            if (i2 > getHighSpeedVideoFpsRanges() + 1) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724635343 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) - 64), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 63), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 80, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2113360525, objArr);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
            }
            if (i2 == getHighSpeedVideoFpsRanges() + 1 && !this.getHighSpeedVideoFpsRanges) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(1724635343 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 66), (byte) ((-64) - android.text.TextUtils.getOffsetBefore("", 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 80, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2113360524, objArr2);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr2[0]).intern());
            }
            if (i != 0 || i2 != bArr2.length) {
                byte[] bArr3 = new byte[i2];
                java.lang.System.arraycopy(bArr2, i, bArr3, 0, i2);
                bArr2 = bArr3;
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr2);
            if (bigInteger.compareTo(this.Camera2StreamConfigurationMap.m26664()) < 0) {
                return bigInteger;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1724635342, (short) (android.view.KeyEvent.getDeadChar(0, 0) - 65), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 'p'), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 82, 2113360524 - android.view.View.resolveSize(0, 0), objArr3);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr3[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        int bitLength = this.Camera2StreamConfigurationMap.m26664().bitLength();
        if (!this.getHighSpeedVideoFpsRanges) {
            return ((bitLength + 7) / 8) - 1;
        }
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 59) % 128;
        int i2 = (bitLength + 7) / 8;
        int i3 = i + 117;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int getHighSpeedVideoFpsRanges() {
        int bitLength = this.Camera2StreamConfigurationMap.m26664().bitLength();
        if (!this.getHighSpeedVideoFpsRanges) {
            return (bitLength + 7) / 8;
        }
        int i = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        getHighSpeedVideoSizes = i;
        getHighSpeedVideoFpsRangesFor = (i + 99) % 128;
        return ((bitLength + 7) / 8) - 1;
    }

    mc() {
    }
}
