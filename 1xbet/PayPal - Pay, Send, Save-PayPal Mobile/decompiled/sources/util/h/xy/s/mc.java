package util.h.xy.s;

/* loaded from: classes5.dex */
public class mc {
    private static int Camera2StreamConfigurationMap = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static boolean getOutputMinFrameDuration;
    private int getHighSpeedVideoSizesFor;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private byte[] toString;

    static {
        getHighSpeedVideoSizes();
        getInputFormats = util.h.xy.s.mc.class.getName();
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 7) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m27218() {
        int i = getHighSpeedVideoFpsRangesFor + 119;
        getOutputFormats = i % 128;
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27223(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.graphics.Color.alpha(0), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        if (!str.equals(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0086\u0085\u0087\u0083\u0084", objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 33) % 128;
                this.getOutputStallDurationlomOqCM = new byte[]{2};
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0089\u008c\u008b\u0089\u008a\u0089\u0088", objArr3);
                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                    this.getOutputStallDurationlomOqCM = new byte[]{5};
                }
            }
        } else {
            int i = getHighSpeedVideoFpsRangesFor + 67;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                this.getOutputStallDurationlomOqCM = new byte[]{1};
                throw new java.lang.ArithmeticException();
            }
            this.getOutputStallDurationlomOqCM = new byte[]{1};
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        this.getHighSpeedVideoSizesFor++;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27225(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0) + 127, "\u0090\u008f\u008e\u008d", objArr);
        if (str.equals(((java.lang.String) objArr[0]).intern())) {
            this.getOutputSizeshNQ4ISI = new byte[]{1};
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - android.view.KeyEvent.keyCodeFromString(""), "\u0090\u0094\u0093\u0092\u0091", objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                int i = getHighSpeedVideoFpsRangesFor + 65;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    this.getOutputSizeshNQ4ISI = new byte[]{0};
                } else {
                    this.getOutputSizeshNQ4ISI = new byte[]{0};
                    throw null;
                }
            }
        }
        if (str != null) {
            int i2 = getOutputFormats + 121;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            int length = str.length();
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (length > 0) {
                this.getHighSpeedVideoSizesFor++;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 41) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27221(byte[] bArr) {
        this.getOutputStallDuration = bArr;
        if (bArr != null) {
            int i = getOutputFormats;
            getHighSpeedVideoFpsRangesFor = (i + 113) % 128;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRangesFor = (i + 63) % 128;
                this.getHighSpeedVideoSizesFor++;
            }
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 29;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27219(byte[] bArr) {
        this.getOutputMinFrameDurationlomOqCM = bArr;
        if (bArr != null && bArr.length > 0) {
            int i = getHighSpeedVideoFpsRangesFor + 27;
            getOutputFormats = i % 128;
            this.getHighSpeedVideoSizesFor = i % 2 != 0 ? 0 : this.getHighSpeedVideoSizesFor + 1;
        }
        int i2 = getOutputFormats + 39;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r9.equals(((java.lang.String) r5[0]).intern()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        r4 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0084\u0085\u0096\u0098\u0083\u0082\u0098", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        if (r9.equals(((java.lang.String) r4[0]).intern()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f1, code lost:
    
        r8.toString = new byte[]{4};
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        r4 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0089\u008c\u008b\u0089\u008a\u0089\u0088", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (r9.equals(((java.lang.String) r4[0]).intern()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        r8.toString = new byte[]{5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        r8.toString = new byte[]{3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r9.equals(((java.lang.String) r5[0]).intern()) != false) goto L21;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27220(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        if (!str.equals(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u0086\u0085\u0087\u0083\u0084", objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 95) % 128;
                this.toString = new byte[]{2};
            } else {
                int i = getHighSpeedVideoFpsRangesFor + 87;
                getOutputFormats = i % 128;
                try {
                    if (i % 2 != 0) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(127 >> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() * 38), "\u0097\u0096\u0085\u0081\u0082\u0083\u0095\u0095\u008b\u0081", objArr3);
                    } else {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(127 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u0097\u0096\u0085\u0081\u0082\u0083\u0095\u0095\u008b\u0081", objArr4);
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        } else {
            int i2 = getOutputFormats + 29;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                this.toString = new byte[]{1};
                throw null;
            }
            this.toString = new byte[]{1};
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        this.getHighSpeedVideoSizesFor++;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27217(byte[] bArr) {
        this.getOutputSizes = bArr;
        if (bArr != null && bArr.length > 0) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 11) % 128;
            this.getHighSpeedVideoSizesFor++;
        }
        int i = getHighSpeedVideoFpsRangesFor + 87;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m27224() {
        int i = getHighSpeedVideoFpsRangesFor + 83;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getOutputStallDuration;
        int i3 = i2 + 111;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m27222() {
        int i;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i2;
        int i3;
        int i4;
        int i5 = this.getHighSpeedVideoSizesFor;
        byte[][] bArr6 = new byte[i5][];
        byte[][] bArr7 = new byte[i5][];
        if (i5 > 0) {
            int i6 = (getHighSpeedVideoFpsRangesFor + 19) % 128;
            getOutputFormats = i6;
            byte[] bArr8 = this.getOutputStallDurationlomOqCM;
            if (bArr8 != null) {
                int i7 = (i6 + 115) % 128;
                getHighSpeedVideoFpsRangesFor = i7;
                if (bArr8.length > 0) {
                    bArr6[0] = new byte[]{-126};
                    bArr7[0] = bArr8;
                    getOutputFormats = (i7 + 19) % 128;
                    i = 1;
                    bArr = this.toString;
                    if (bArr != null && bArr.length > 0) {
                        bArr6[i] = new byte[]{-122};
                        bArr7[i] = bArr;
                        i++;
                    }
                    bArr2 = this.getOutputSizes;
                    if (bArr2 != null && bArr2.length > 0) {
                        i3 = getHighSpeedVideoFpsRangesFor + 95;
                        getOutputFormats = i3 % 128;
                        if (i3 % 2 == 0) {
                            bArr6[i] = new byte[]{-127};
                            i4 = i + 5;
                            bArr7[i] = bArr2;
                        } else {
                            bArr6[i] = new byte[]{-127};
                            i4 = i + 1;
                            bArr7[i] = bArr2;
                        }
                        i = i4;
                    }
                    bArr3 = this.getOutputMinFrameDurationlomOqCM;
                    if (bArr3 != null) {
                        int i8 = getOutputFormats;
                        getHighSpeedVideoFpsRangesFor = (i8 + 19) % 128;
                        if (bArr3.length > 0) {
                            int i9 = i8 + 45;
                            getHighSpeedVideoFpsRangesFor = i9 % 128;
                            if (i9 % 2 == 0) {
                                bArr6[i] = new byte[]{-123};
                                i2 = i + 70;
                                bArr7[i] = bArr3;
                            } else {
                                bArr6[i] = new byte[]{-123};
                                i2 = i + 1;
                                bArr7[i] = bArr3;
                            }
                            i = i2;
                        }
                    }
                    bArr4 = this.getOutputSizeshNQ4ISI;
                    if (bArr4 != null) {
                        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                        if (bArr4.length > 0) {
                            bArr6[i] = new byte[]{-125};
                            bArr7[i] = bArr4;
                            i++;
                        }
                    }
                    bArr5 = this.getOutputStallDuration;
                    if (bArr5 != null && bArr5.length > 0) {
                        bArr6[i] = new byte[]{-124};
                        bArr7[i] = bArr5;
                    }
                }
            }
            i = 0;
            bArr = this.toString;
            if (bArr != null) {
                bArr6[i] = new byte[]{-122};
                bArr7[i] = bArr;
                i++;
            }
            bArr2 = this.getOutputSizes;
            if (bArr2 != null) {
                i3 = getHighSpeedVideoFpsRangesFor + 95;
                getOutputFormats = i3 % 128;
                if (i3 % 2 == 0) {
                }
                i = i4;
            }
            bArr3 = this.getOutputMinFrameDurationlomOqCM;
            if (bArr3 != null) {
            }
            bArr4 = this.getOutputSizeshNQ4ISI;
            if (bArr4 != null) {
            }
            bArr5 = this.getOutputStallDuration;
            if (bArr5 != null) {
                bArr6[i] = new byte[]{-124};
                bArr7[i] = bArr5;
            }
        }
        byte[] m25024 = util.h.xy.al.rd.m25024(bArr6, bArr7);
        if (m25024 != null) {
            int length = m25024.length;
        }
        return m25024;
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 43) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i4 = Camera2StreamConfigurationMap + 97;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                cArr[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
                i3++;
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
        if (!getOutputMinFrameDuration) {
            if (!getHighSpeedVideoFpsRanges) {
                throw null;
            }
            throw null;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 113) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i6 = Camera2StreamConfigurationMap + 5;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                cArr3[mdVar.f2643] = (char) (cArr2[bytes[mdVar.f2642 - mdVar.f2643] * i] / i5);
                i2 = mdVar.f2643 >>> 1;
            } else {
                cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
                i2 = mdVar.f2643 + 1;
            }
            mdVar.f2643 = i2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{64432, 64417, 64434, 64435, 64446, 64419, 64433, 64418, 64421, 64440, 64420, 64428, 64387, 64385, 64386, 64402, 64413, 64406, 64411, 64384, 64442, 64438, 64443, 64423};
        getInputSizeshNQ4ISI = -1074856969;
        getHighSpeedVideoFpsRanges = true;
        getOutputMinFrameDuration = true;
    }
}
