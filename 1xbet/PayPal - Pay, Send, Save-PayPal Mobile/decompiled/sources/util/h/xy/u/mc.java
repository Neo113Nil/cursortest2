package util.h.xy.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mc {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static char getInputSizeshNQ4ISI;
    private static char[] getOutputFormats;
    private static char getOutputMinFrameDuration;
    private static final /* synthetic */ util.h.xy.u.mc[] getOutputMinFrameDurationlomOqCM;
    private static char getOutputStallDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.u.mc f2436;

    private mc(java.lang.String str) {
    }

    public static util.h.xy.u.mc valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 89;
        getInputFormats = i % 128;
        util.h.xy.u.mc mcVar = (util.h.xy.u.mc) java.lang.Enum.valueOf(util.h.xy.u.mc.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 107) % 128;
        return mcVar;
    }

    public static util.h.xy.u.mc[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 121;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.u.mc[] mcVarArr = (util.h.xy.u.mc[]) getOutputMinFrameDurationlomOqCM.clone();
        int i2 = getHighSpeedVideoFpsRangesFor + 43;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return mcVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.red(0) + 40), "\u000b\u0012\u001f\u0000\u001d\u0014\u001a\u000f", 8 - android.view.View.resolveSize(0, 0), objArr);
        util.h.xy.u.mc mcVar = new util.h.xy.u.mc(((java.lang.String) objArr[0]).intern());
        f2436 = mcVar;
        int i = (getInputFormats + 107) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        util.h.xy.u.mc[] mcVarArr = {mcVar};
        int i2 = i + 37;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            getOutputMinFrameDurationlomOqCM = mcVarArr;
            int i3 = i + 75;
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        throw null;
    }

    final class a extends java.io.OutputStream {
        private static int Camera2StreamConfigurationMap = 1;
        private static long getHighResolutionOutputSizeshNQ4ISI = -6064589512403484290L;
        private static int getHighSpeedVideoFpsRanges;
        private java.security.Signature getHighSpeedVideoSizes;

        a(java.security.Signature signature) {
            this.getHighSpeedVideoSizes = signature;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = ((i3 & 49) + (i3 | 49)) % 128;
            getHighSpeedVideoFpsRanges = i4;
            try {
                java.security.Signature signature = this.getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i4 & 35) + (i4 | 35)) % 128;
                Camera2StreamConfigurationMap = (i4 + 69) % 128;
                try {
                    java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("늏孓愽༁ᖗ⎥즊홧ﰨ記郪뺬䒈洠筴ĕ⿲㗌쎚\ue864\uf65c鰴\uaafa", 59862 - (~(-android.view.KeyEvent.getDeadChar(0, 0))), objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    int i5 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i6 = (i5 * 399) + 18331656;
                    int i7 = ~i5;
                    int i8 = ~((i7 ^ 45944) | (i7 & 45944));
                    int i9 = (~(i5 | (-45945))) | i8;
                    int i10 = ~((i ^ (-45945)) | (i & (-45945)));
                    int i11 = -(-(((i9 ^ i10) | (i9 & i10)) * 398));
                    int i12 = (i6 ^ i11) + ((i6 & i11) << 1);
                    int i13 = ((i5 ^ 45944) | (45944 & i5)) * (-1194);
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    int i15 = ~i;
                    int i16 = ~((i15 ^ (-45945)) | (i15 & (-45945)));
                    int i17 = (i16 ^ i8) | (i16 & i8);
                    int i18 = ~((i5 ^ (-45945)) | (i5 & (-45945)));
                    int i19 = -(-(((i17 ^ i18) | (i17 & i18)) * 398));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("느Ǣ푯꣡罍㏓", (i14 ^ i19) + ((i19 & i14) << 1), objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(signature, objArr);
                    int i20 = getHighSpeedVideoFpsRanges;
                    int i21 = (i20 & 81) + (i20 | 81);
                    Camera2StreamConfigurationMap = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 3 / 2;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.security.SignatureException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] charArray = str.toCharArray();
            util.h.xz.b.d dVar = new util.h.xz.b.d();
            dVar.f2628 = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-7508379876853140581L));
                dVar.f2629++;
            }
            char[] cArr = new char[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                dVar.f2629++;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws java.io.IOException {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (i + 87) % 128;
            try {
                java.security.Signature signature = this.getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = ((i ^ 93) + ((i & 93) << 1)) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("늏孓愽༁ᖗ⎥즊홧ﰨ記郪뺬䒈洠筴ĕ⿲㗌쎚\ue864\uf65c鰴\uaafa", 59862 - (~(-(-(android.view.ViewConfiguration.getEdgeSlop() >> 16)))), objArr);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                    int i2 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("느Ǣ푯꣡罍㏓", ((i2 | 45943) << 1) - (i2 ^ 45943), objArr2);
                    cls.getMethod((java.lang.String) objArr2[0], byte[].class).invoke(signature, bArr);
                    int i3 = (getHighSpeedVideoFpsRanges + 63) % 128;
                    Camera2StreamConfigurationMap = i3;
                    int i4 = i3 + 117;
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.security.SignatureException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws java.io.IOException {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 ^ 69) + ((i2 & 69) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    throw new java.lang.NullPointerException();
                }
                java.security.Signature signature = this.getHighSpeedVideoSizes;
                byte b = (byte) i;
                getHighSpeedVideoFpsRanges = (i2 + 113) % 128;
                try {
                    java.lang.Object[] objArr = {java.lang.Byte.valueOf(b)};
                    int threadPriority = android.os.Process.getThreadPriority(0);
                    int i4 = -(((threadPriority & 20) + (threadPriority | 20)) >> 6);
                    int i5 = i4 * (-574);
                    int i6 = (i5 ^ (-34361362)) + ((i5 & (-34361362)) << 1);
                    int i7 = ~i4;
                    int i8 = ~i;
                    int i9 = ~(i7 | i8);
                    int i10 = ~(((-59864) ^ i) | (i & (-59864)));
                    int i11 = (i9 | i10) * 1150;
                    int i12 = (i6 ^ i11) + ((i6 & i11) << 1);
                    int i13 = ~((59863 ^ i8) | (i8 & 59863));
                    int i14 = -(-(((i13 ^ i10) | (i10 & i13)) * (-575)));
                    int i15 = (i12 ^ i14) + ((i14 & i12) << 1);
                    int i16 = ((~(i4 | i8)) | (~((i7 ^ i) | (i7 & i)))) * 575;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("늏孓愽༁ᖗ⎥즊홧ﰨ記郪뺬䒈洠筴ĕ⿲㗌쎚\ue864\uf65c鰴\uaafa", (i15 & i16) + (i16 | i15), objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                    int i17 = (packedPositionType * (-300)) + 13874786;
                    int i18 = (~((45943 ^ packedPositionType) | (packedPositionType & 45943) | i)) * (-301);
                    int i19 = ~((i ^ (-45944)) | (i & (-45944)));
                    int i20 = ~((i8 ^ packedPositionType) | (i8 & packedPositionType));
                    int i21 = (i17 & i18) + (i17 | i18) + (((i20 ^ i19) | (i19 & i20)) * (-301));
                    int i22 = ~(i | (~packedPositionType));
                    int i23 = ((i22 ^ (-45944)) | (i22 & (-45944))) * 301;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("느Ǣ푯꣡罍㏓", (i21 ^ i23) + ((i23 & i21) << 1), objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], java.lang.Byte.TYPE).invoke(signature, objArr);
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 27) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.security.SignatureException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }
    }

    private util.h.xy.ew.ma Camera2StreamConfigurationMap(java.security.Signature signature, java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        util.h.xy.ew.ra raVar = new util.h.xy.ew.ra();
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 125) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{0, 23, 0, 14}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{23, 12, 99, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr2);
            util.h.xy.ed.a m26729 = raVar.m26729((java.lang.String) cls.getMethod((java.lang.String) objArr2[0], null).invoke(signature, null));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{0, 23, 0, 14}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", objArr3);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{35, 8, 0, 2}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", objArr4);
            java.lang.String str = (java.lang.String) objArr4[0];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ഥ뭚浄崋ᕓ䖍鬑摷緦䬞迕골诟┉⼜䗣嫑\ue223⼪\uf566轔㨂꠪쒯", 24 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
            cls2.getMethod(str, java.lang.Class.forName((java.lang.String) objArr5[0])).invoke(signature, privateKey);
            util.h.xy.ew.ma maVar = new util.h.xy.ew.ma(signature, m26729) { // from class: util.h.xy.u.mc.3
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getHighSpeedVideoSizes = 0;
                private static int getHighSpeedVideoSizesFor = 0;
                private static char[] getInputFormats = null;
                private static int getInputSizeshNQ4ISI = 0;
                private static char getOutputFormats = 0;
                private static short[] getOutputMinFrameDuration = null;
                private static int getOutputMinFrameDurationlomOqCM = 0;
                private static int getOutputSizes = 1;
                private static int getOutputSizeshNQ4ISI;
                private static byte[] getOutputStallDurationlomOqCM;
                final /* synthetic */ util.h.xy.ed.a Camera2StreamConfigurationMap;
                final /* synthetic */ java.security.Signature getHighSpeedVideoFpsRangesFor;
                private java.io.OutputStream getOutputStallDuration;

                {
                    this.getHighSpeedVideoFpsRangesFor = signature;
                    this.Camera2StreamConfigurationMap = m26729;
                    this.getOutputStallDuration = util.h.xy.u.mc.this.new a(signature);
                }

                @Override // util.h.xy.ew.ma
                /* renamed from: ᐝ */
                public final util.h.xy.ed.a mo26726() {
                    int i = getOutputSizes;
                    int i2 = i + 115;
                    getInputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    util.h.xy.ed.a aVar = this.Camera2StreamConfigurationMap;
                    int i3 = i + 7;
                    getInputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 == 0) {
                        return aVar;
                    }
                    throw null;
                }

                @Override // util.h.xy.ew.ma
                /* renamed from: ˋ */
                public final java.io.OutputStream mo26725() {
                    int i = (getInputSizeshNQ4ISI + 7) % 128;
                    getOutputSizes = i;
                    java.io.OutputStream outputStream = this.getOutputStallDuration;
                    getInputSizeshNQ4ISI = (i + 31) % 128;
                    return outputStream;
                }

                @Override // util.h.xy.ew.ma
                /* renamed from: ˊ */
                public final byte[] mo26724() {
                    int i;
                    java.security.SignatureException signatureException;
                    boolean z;
                    char c;
                    int i2;
                    int length;
                    byte[] bArr;
                    int i3;
                    int i4 = getInputSizeshNQ4ISI;
                    int i5 = i4 + 33;
                    getOutputSizes = i5 % 128;
                    try {
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        java.security.Signature signature2 = this.getHighSpeedVideoFpsRangesFor;
                        getOutputSizes = (i4 + 67) % 128;
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (android.view.View.getDefaultSize(0, 0) + 6), "\u0005\u0004\u000b\u0004\u0005\n\u0001\u0002\u000f\t\u000f\r\u000e\n\u0006\r\u0000\u0003\u0004\u000f\u000f\t㘅", android.view.View.MeasureSpec.getMode(0) + 23, objArr6);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (android.text.TextUtils.getOffsetBefore("", 0) + 29), "\n\r\u0000\u0003", 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr7);
                            return (byte[]) cls3.getMethod((java.lang.String) objArr7[0], null).invoke(signature2, null);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.security.SignatureException e) {
                        e = e;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                        short s = (short) ((-35) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte b = (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        int i6 = 404561005 - (keyRepeatDelay >> 16);
                        int lastIndexOf = (-1953229787) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        util.h.xz.b.me meVar = new util.h.xz.b.me();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        int i7 = (indexOf - 34) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L)));
                        if (i7 == -1) {
                            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (i != 0) {
                            byte[] bArr2 = getOutputStallDurationlomOqCM;
                            if (bArr2 != null) {
                                int length2 = bArr2.length;
                                byte[] bArr3 = new byte[length2];
                                int i8 = 0;
                                while (i8 < length2) {
                                    bArr3[i8] = (byte) (bArr2[i8] ^ (-2689713159175858216L));
                                    i8++;
                                    e = e;
                                }
                                signatureException = e;
                                bArr2 = bArr3;
                            } else {
                                signatureException = e;
                            }
                            i7 = bArr2 != null ? (byte) (((byte) (getOutputStallDurationlomOqCM[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L)))) : (short) (((short) (getOutputMinFrameDuration[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))));
                        } else {
                            signatureException = e;
                        }
                        if (i7 > 0) {
                            meVar.f2647 = ((i6 + i7) - 2) + ((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i;
                            meVar.f2644 = (char) (lastIndexOf + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                            sb2.append(meVar.f2644);
                            meVar.f2646 = meVar.f2644;
                            byte[] bArr4 = getOutputStallDurationlomOqCM;
                            if (bArr4 != null) {
                                int i9 = getHighSpeedVideoSizes + 21;
                                getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                                if (i9 % 2 == 0) {
                                    length = bArr4.length;
                                    bArr = new byte[length];
                                    i3 = 1;
                                } else {
                                    length = bArr4.length;
                                    bArr = new byte[length];
                                    i3 = 0;
                                }
                                while (i3 < length) {
                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 9) % 128;
                                    bArr[i3] = (byte) (bArr4[i3] ^ (-2689713159175858216L));
                                    i3++;
                                }
                                bArr4 = bArr;
                            }
                            if (bArr4 != null) {
                                int i10 = getHighResolutionOutputSizeshNQ4ISI + 49;
                                getHighSpeedVideoSizes = i10 % 128;
                                int i11 = i10 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            int i12 = 1;
                            while (true) {
                                meVar.f2645 = i12;
                                if (meVar.f2645 >= i7) {
                                    break;
                                }
                                if (z) {
                                    byte[] bArr5 = getOutputStallDurationlomOqCM;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    byte b2 = (byte) (bArr5[r4] ^ (-2689713159175858216L));
                                    c = meVar.f2646;
                                    i2 = (byte) (b2 + s);
                                } else {
                                    short[] sArr = getOutputMinFrameDuration;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    short s2 = (short) (sArr[r4] ^ (-2689713159175858216L));
                                    c = meVar.f2646;
                                    i2 = (short) (s2 + s);
                                }
                                meVar.f2644 = (char) (c + (i2 ^ b));
                                sb2.append(meVar.f2644);
                                meVar.f2646 = meVar.f2644;
                                i12 = meVar.f2645 + 1;
                            }
                        }
                        objArr8[0] = sb2.toString();
                        sb.append(((java.lang.String) objArr8[0]).intern());
                        sb.append(signatureException.getMessage());
                        throw new util.h.xy.ab.b(sb.toString(), signatureException);
                    }
                }

                private static void Camera2StreamConfigurationMap(byte b, java.lang.String str2, int i, java.lang.Object[] objArr6) {
                    int i2;
                    char[] charArray = str2.toCharArray();
                    util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                    char[] cArr = getInputFormats;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                        }
                        cArr = cArr2;
                    }
                    char c = (char) (4042185467053315654L ^ getOutputFormats);
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr3[i2] = (char) (charArray[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        mcVar.f2638 = 0;
                        while (mcVar.f2638 < i2) {
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                            if (mcVar.f2641 == mcVar.f2636) {
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                            } else {
                                mcVar.f2639 = mcVar.f2641 / c;
                                mcVar.f2640 = mcVar.f2641 % c;
                                mcVar.f2637 = mcVar.f2636 / c;
                                mcVar.f2635 = mcVar.f2636 % c;
                                if (mcVar.f2640 == mcVar.f2635) {
                                    mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                    mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                    int i4 = mcVar.f2639;
                                    int i5 = mcVar.f2640;
                                    int i6 = mcVar.f2637;
                                    int i7 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                                } else if (mcVar.f2639 == mcVar.f2637) {
                                    mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                    mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                    int i8 = mcVar.f2639;
                                    int i9 = mcVar.f2640;
                                    int i10 = mcVar.f2637;
                                    int i11 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                                } else {
                                    int i12 = mcVar.f2639;
                                    int i13 = mcVar.f2635;
                                    int i14 = mcVar.f2637;
                                    int i15 = mcVar.f2640;
                                    cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                                }
                            }
                            mcVar.f2638 += 2;
                        }
                    }
                    for (int i16 = 0; i16 < i; i16++) {
                        cArr3[i16] = (char) (cArr3[i16] ^ 13722);
                    }
                    objArr6[0] = new java.lang.String(cArr3);
                }

                static void Camera2StreamConfigurationMap() {
                    getInputFormats = new char[]{41913, 41919, 41906, 41915, 41910, 41871, 41970, 41917, 41898, 41903, 41893, 41902, 41896, 41897, 41909, 41030};
                    getOutputFormats = (char) 38466;
                }

                static {
                    Camera2StreamConfigurationMap();
                    getOutputSizeshNQ4ISI = 4453451;
                    getOutputMinFrameDurationlomOqCM = -408872967;
                    getHighSpeedVideoSizesFor = -1815413785;
                    getOutputStallDurationlomOqCM = new byte[]{38, -47, 32, -50, -8, -4, -18, -50, -14, -7, -63, -82, 4, -60, com.visa.cbp.getEncExpo.onUnminimized, -58, com.visa.cbp.getEncExpo.onUnminimized, -13, -56, -19, -50, -86, 13, -6, -15, com.visa.cbp.getEncExpo.startTransaction, -1, -10, -3, -42, -18};
                }
            };
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 11) % 128;
            return maVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getOutputStallDuration ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.security.cert.X509Certificate m27541(java.security.Signature signature, java.security.KeyPair keyPair) throws java.security.cert.CertificateException, util.h.xy.ee.ra, java.security.InvalidKeyException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 56), "\u001d\u0015\f\"\u001e\u0013\u0010\u001d\u0004\u0011\u001f \u0017\f\"\u0016\u001f \u0017\f\"\u0011\u001f \u0017\f\u001f\u0000\f\"\u001e\u0013\u000f\u001d\f\"㘕", 38 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        util.h.xy.dw.b bVar = new util.h.xy.dw.b(((java.lang.String) objArr[0]).intern());
        try {
            getHighSpeedVideoFpsRangesFor(false, new int[]{43, 26, 167, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new java.lang.Object[1]);
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) r6[0]).getDeclaredConstructor(null).newInstance(null)).nextInt());
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar2.add(1, 10);
            java.util.Date time = calendar.getTime();
            java.util.Date time2 = calendar2.getTime();
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ഥ뭚浄崋ᕓ䖍鬑摷緦䬞迕골诟┉뻕ฮ櫑⻄㔩쓺嗊뾕", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{69, 9, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", objArr3);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], null).invoke(keyPair, null);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ഥ뭚浄崋ᕓ䖍鬑摷緦䬞迕골诟┉봗稂쫞\ued77뤦\uda56뻕ฮ渥ሾ", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{78, 10, 193, 7}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr5);
            util.h.xy.ee.a aVar = new util.h.xy.ee.a(bVar, valueOf, time, time2, locale, bVar, util.h.xy.ed.mc.m26512(cls2.getMethod((java.lang.String) objArr5[0], null).invoke(invoke, null)));
            aVar.m26529(util.h.xy.ed.ma.f2105, false, new util.h.xy.ed.rc(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ഥ뭚浄崋ᕓ䖍鬑摷緦䬞迕골诟┉뻕ฮ櫑⻄㔩쓺嗊뾕", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, objArr6);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ؗ瞪칑\uf7e2떆툾浄崋겞泧", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, objArr7);
            util.h.xy.ee.b m26530 = aVar.m26530(Camera2StreamConfigurationMap(signature, (java.security.PrivateKey) cls3.getMethod((java.lang.String) objArr7[0], null).invoke(keyPair, null)));
            try {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (59 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\t\b\u0005\u001c㗞", 5 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                try {
                    java.lang.Object[] objArr9 = {((java.lang.String) objArr8[0]).intern()};
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(false, new int[]{88, 37, 50, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr10);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(true, new int[]{125, 11, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr11);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.String.class).invoke(null, objArr9);
                    try {
                        java.lang.Object[] objArr12 = {new java.io.ByteArrayInputStream(m26530.m26531())};
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(false, new int[]{88, 37, 50, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr13);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(true, new int[]{136, 19, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr14);
                        return (java.security.cert.X509Certificate) cls5.getMethod((java.lang.String) objArr14[0], java.io.InputStream.class).invoke(invoke2, objArr12);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (113 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0012\u001e\u0010\r!\"\u000f\u0001#\u0010\u0002\u001a\b\u0003\u0010\u001f\u0017\r\u0010\r\u000f\u0003\u0010\u0007\u000e\u0010\u0015 \u0012\u0006㘪", 30 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr15);
                sb.append(((java.lang.String) objArr15[0]).intern());
                sb.append(e.getMessage());
                throw new util.h.xy.ab.b(sb.toString(), e);
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 45) % 128;
        int i4 = i3 + 113;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 111;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 115;
                cArr3[i2] = (char) (charArray[i2] * b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 57) % 128;
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 99) % 128;
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i7 = mcVar.f2639;
                        int i8 = mcVar.f2640;
                        int i9 = mcVar.f2637;
                        int i10 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i7 * c) + i8];
                        cArr3[mcVar.f2638 + 1] = cArr[(i9 * c) + i10];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i11 = mcVar.f2639;
                        int i12 = mcVar.f2640;
                        int i13 = mcVar.f2637;
                        int i14 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i11 * c) + i12];
                        cArr3[mcVar.f2638 + 1] = cArr[(i13 * c) + i14];
                    } else {
                        int i15 = mcVar.f2639;
                        int i16 = mcVar.f2635;
                        int i17 = mcVar.f2637;
                        int i18 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i15 * c) + i16];
                        cArr3[mcVar.f2638 + 1] = cArr[(i17 * c) + i18];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new char[]{42340, 42288, 42291, 42283, 42254, 42269, 42243, 42293, 42295, 42298, 42295, 42281, 42286, 42294, 42298, 42296, 42294, 42294, 42266, 42253, 42289, 42297, 42289, 42296, 42388, 42386, 42464, 42468, 42385, 42387, 42382, 42381, 42380, 42380, 42384, 42346, 42294, 42294, 42295, 42293, 42243, 42302, 42291, 42453, 42065, 42063, 42063, 42419, 42410, 42062, 42070, 42062, 42055, 42057, 42056, 42048, 42407, 42426, 42078, 42070, 42062, 42055, 42063, 42079, 42077, 42067, 42061, 42061, 42056, 42283, 42422, 42412, 42426, 42426, 42413, 42417, 42418, 42422, 42437, 42103, 42100, 42055, 42048, 42096, 42106, 42107, 42104, 42104, 42259, 42442, 42432, 42432, 42276, 42463, 42435, 42443, 42435, 42488, 42434, 42493, 42485, 42456, 42279, 42443, 42432, 42488, 42462, 42295, 42459, 42432, 42488, 42493, 42436, 42436, 42437, 42441, 42433, 42435, 42458, 42456, 42441, 42432, 42494, 42495, 42490, 42441, 42101, 42097, 42102, 42099, 42090, 42089, 42050, 42111, 42093, 42103, 42351, 42289, 42295, 42303, 42299, 42298, 42298, 42291, 42286, 42294, 42249, 42249, 42289, 42295, 42292, 42294, 42292, 42292, 42299};
        getInputSizeshNQ4ISI = (char) 58872;
        Camera2StreamConfigurationMap = (char) 24804;
        getOutputStallDuration = (char) 441;
        getHighSpeedVideoFpsRanges = (char) 49734;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputFormats = new char[]{41958, 41864, 41903, 41907, 41961, 41865, 41877, 41970, 41860, 41902, 41914, 41956, 41913, 41909, 41881, 41919, 41953, 41980, 41968, 41915, 41917, 41959, 41954, 41874, 41892, 41957, 41885, 41887, 41875, 41964, 41871, 41883, 41900, 41896, 41906, 41872};
        getOutputMinFrameDuration = (char) 38464;
    }
}
