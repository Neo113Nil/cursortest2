package util.h.xy.eo;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.eo.mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = -1147933016;
    private static int getHighSpeedVideoSizes = -408873036;
    private static int getInputFormats = 0;
    private static short[] getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 1;
    private static int getOutputMinFrameDuration = 419835560;
    private long AMEXKernel;
    private int ArtificialStackFrames;
    private util.h.xy.en.ma CoroutineDebuggingKt;
    private byte[] _BOUNDARY;
    private byte[] _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7078a;
    private byte[] accessartificialFrame;
    private long b;
    private byte[] coroutineBoundary;
    private util.h.xy.ef.ra coroutineCreation;
    private long d;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private int init;
    private byte[] isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[] kernelVersion;
    private util.h.xy.en.a toString;
    private byte[] unwrapAs;
    private static byte[] getHighSpeedVideoFpsRanges = {33, -36, -56, 99, 46, -106, 98, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -56, 47, -118, 108, -47, 45, -38, -45, -101, 102, -104, 97, 45, -46, 43, -114, 101, 38, 42, -48, 45, -35, -43, 42, -117, com.visa.cbp.getEncExpo.IResultReceiver, -44, 36, 33, -34, -33, -30, -29, -25, com.google.common.base.Ascii.NAK, -77, 81, -32, com.google.common.base.Ascii.ESC, -76, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 13, -13, com.google.common.base.Ascii.GS, -17, com.google.common.base.Ascii.SYN, -27, com.google.common.base.Ascii.DC4, -25, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, -27, com.google.common.base.Ascii.EM, 85, -66, 19, com.google.common.base.Ascii.EM, 86, -84, -17, -30, -18, 0, -29, 66, -85, 19, 82, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.NAK, 17, 16, com.google.common.base.Ascii.GS, -18, 83, -66, com.google.common.base.Ascii.GS, -19, -24, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 83, -61, com.google.common.base.Ascii.SUB, -20, -40, -40, -40};
    private static long getHighSpeedVideoSizesFor = 6698720363888541685L;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 45;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
            dVar.f2629++;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        if (r3 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i7 = i2 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L)));
        boolean z = i7 == -1;
        if (z) {
            byte[] bArr2 = getHighSpeedVideoFpsRanges;
            if (bArr2 != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 37;
                Camera2StreamConfigurationMap = i8 % 128;
                if (i8 % 2 != 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i6 = 1;
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i6 = 0;
                }
                while (i6 < length) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
                    bArr[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                    i6++;
                }
                bArr2 = bArr;
            }
            i7 = bArr2 != null ? (byte) (((byte) (getHighSpeedVideoFpsRanges[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L)))) : (short) (((short) (getInputSizeshNQ4ISI[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
        }
        if (i7 > 0) {
            int i9 = Camera2StreamConfigurationMap + 47;
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            if (i9 % 2 == 0) {
                i4 = ((i / i7) + 5) - ((int) (getHighSpeedVideoFpsRangesFor * (-2689713159175858216L)));
            } else {
                i4 = ((i + i7) - 2) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoFpsRanges;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
            while (meVar.f2645 < i7) {
                int i11 = getHighResolutionOutputSizeshNQ4ISI + 87;
                Camera2StreamConfigurationMap = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                if (z2) {
                    byte[] bArr5 = getHighSpeedVideoFpsRanges;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getInputSizeshNQ4ISI;
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

    private void getHighSpeedVideoFpsRangesFor() {
        int i = getInputFormats + 23;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (this.f7078a) {
            int i3 = i2 + 65;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!this.getValidOutputFormatsForInputhNQ4ISI) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䰩\ued36ต꼟졡榀誼⮻䓓\ue5ef݀ꀩ셏扔荰㲈巾ﻑῧ륏\uda10笼鐜㕪嚈\uf7a4Ⴄ뇞틻\u0c0d괭치潫衱", android.view.View.resolveSize(0, 0) + 41243, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((-1546844476) - (windowTouchSlop >> 8), (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) ((-56) - android.view.View.combineMeasuredStates(0, 0)), (-66) - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22595288, objArr2);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
    }

    private void getHighSpeedVideoSizes(byte[] bArr) {
        int i = getInputFormats + 117;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䰯᮳\ue348䫰ኧ禎䇬⧑\uf152声⃔衝埰㾔蜳滬㚍鸤斬춑锵糜쓈갬篗쎁ꬽ犝\uda70ꈧ\u09cf텺뤥Ô", 22441 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i2 - 1;
        byte[] bArr2 = this.coroutineBoundary;
        int i3 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i4;
        int i5 = (i4 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i5;
        bArr2[12] = (byte) ((i5 >>> 8) + (bArr2[12] & 255));
        this.coroutineCreation.mo26555(bArr2, 0, bArr, 0);
        getOutputFormats = (getInputFormats + 57) % 128;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, int i, int i2) {
        getInputFormats = (getOutputFormats + 107) % 128;
        util.h.xy.en.ra.m26622(bArr, bArr2, i, i2);
        this.CoroutineDebuggingKt.mo26616(bArr);
        getInputFormats = (getOutputFormats + 117) % 128;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        int i = getInputFormats + 63;
        getOutputFormats = i % 128;
        util.h.xy.en.ra.m26633(bArr, bArr2);
        this.CoroutineDebuggingKt.mo26616(bArr);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䰡濎ர❡썏Ｓ骰뛟劳\u0e75⩚올\ue1e0鶟림啺煑\u2d6b죧\ue4c9肥뱥塔", android.view.KeyEvent.normalizeMetaState(0) + 9173, objArr);
            throw new util.h.xy.ef.f(((java.lang.String) objArr[0]).intern());
        }
        if (this.d == 0) {
            getInputFormats = (getOutputFormats + 21) % 128;
            getHighSpeedVideoFpsRanges();
        }
        byte[] bArr3 = new byte[16];
        getHighSpeedVideoSizes(bArr3);
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            util.h.xy.en.ra.m26634(bArr3, bArr, i);
            getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM, bArr3);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i2, 16);
            getOutputFormats = (getInputFormats + 97) % 128;
        } else {
            byte[] bArr4 = this.getOutputMinFrameDurationlomOqCM;
            int i3 = getOutputFormats + 65;
            getInputFormats = i3 % 128;
            util.h.xy.en.ra.m26634(bArr4, bArr, i);
            this.CoroutineDebuggingKt.mo26616(bArr4);
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = getInputFormats + 5;
            getOutputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            util.h.xy.en.ra.m26625(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.d += 16;
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ᐝ */
    public final int mo26642(byte[] bArr, int i) throws java.lang.IllegalStateException, util.h.xy.ef.md {
        int i2;
        getHighSpeedVideoFpsRangesFor();
        if (this.d == 0) {
            getHighSpeedVideoFpsRanges();
        }
        int i3 = this.ArtificialStackFrames;
        try {
            if (!this.getValidOutputFormatsForInputhNQ4ISI) {
                int i4 = this.getOutputSizes;
                if (i3 < i4) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-1546844489) - android.view.View.getDefaultSize(0, 0), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (55 - android.view.MotionEvent.axisFromString("")), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 94, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 22595316, objArr);
                    throw new util.h.xy.ef.md(((java.lang.String) objArr[0]).intern());
                }
                i3 -= i4;
                if (bArr.length - i < i3) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("䰡濎ர❡썏Ｓ骰뛟劳\u0e75⩚올\ue1e0鶟림啺煑\u2d6b죧\ue4c9肥뱥塔", android.graphics.Color.rgb(0, 0, 0) + 16786389, objArr2);
                    throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
                }
            } else if (bArr.length - i < this.getOutputSizes + i3) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰡濎ர❡썏Ｓ骰뛟劳\u0e75⩚올\ue1e0鶟림啺煑\u2d6b죧\ue4c9肥뱥塔", android.graphics.ImageFormat.getBitsPerPixel(0) + 9174, objArr3);
                throw new util.h.xy.ef.f(((java.lang.String) objArr3[0]).intern());
            }
            if (i3 > 0) {
                byte[] bArr2 = this.unwrapAs;
                getInputFormats = (getOutputFormats + 57) % 128;
                byte[] bArr3 = new byte[16];
                getHighSpeedVideoSizes(bArr3);
                if (this.getValidOutputFormatsForInputhNQ4ISI) {
                    util.h.xy.en.ra.m26629(bArr2, 0, bArr3, 0, i3);
                    Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM, bArr2, 0, i3);
                    i2 = getOutputFormats + 23;
                } else {
                    Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM, bArr2, 0, i3);
                    util.h.xy.en.ra.m26629(bArr2, 0, bArr3, 0, i3);
                    i2 = getOutputFormats + 65;
                }
                getInputFormats = i2 % 128;
                java.lang.System.arraycopy(bArr2, 0, bArr, i, i3);
                this.d += i3;
            }
            long j = this.b;
            int i5 = this.init;
            long j2 = j + i5;
            this.b = j2;
            if (j2 > this.AMEXKernel) {
                if (i5 > 0) {
                    Camera2StreamConfigurationMap(this.isOutputSupportedForhNQ4ISI, this._CREATION, 0, i5);
                }
                if (this.AMEXKernel > 0) {
                    util.h.xy.en.ra.m26633(this.isOutputSupportedForhNQ4ISI, this._BOUNDARY);
                }
                long j3 = this.d;
                byte[] bArr4 = new byte[16];
                if (this.toString == null) {
                    util.h.xy.en.mb mbVar = new util.h.xy.en.mb();
                    this.toString = mbVar;
                    mbVar.mo26615(this.getOutputSizeshNQ4ISI);
                }
                this.toString.mo26614(((j3 * 8) + 127) >>> 7, bArr4);
                util.h.xy.en.ra.m26626(this.isOutputSupportedForhNQ4ISI, bArr4);
                util.h.xy.en.ra.m26633(this.getOutputMinFrameDurationlomOqCM, this.isOutputSupportedForhNQ4ISI);
            }
            byte[] bArr5 = new byte[16];
            util.h.xy.fb.rb.m26848(this.b * 8, bArr5, 0);
            util.h.xy.fb.rb.m26848(this.d * 8, bArr5, 8);
            getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM, bArr5);
            byte[] bArr6 = new byte[16];
            this.coroutineCreation.mo26555(this.getOutputStallDuration, 0, bArr6, 0);
            util.h.xy.en.ra.m26633(bArr6, this.getOutputMinFrameDurationlomOqCM);
            int i6 = this.getOutputSizes;
            byte[] bArr7 = new byte[i6];
            this.isOutputSupportedFor = bArr7;
            java.lang.System.arraycopy(bArr6, 0, bArr7, 0, i6);
            if (this.getValidOutputFormatsForInputhNQ4ISI) {
                java.lang.System.arraycopy(this.isOutputSupportedFor, 0, bArr, i + this.ArtificialStackFrames, this.getOutputSizes);
                i3 += this.getOutputSizes;
            } else {
                int i7 = this.getOutputSizes;
                byte[] bArr8 = new byte[i7];
                java.lang.System.arraycopy(this.unwrapAs, i3, bArr8, 0, i7);
                if (!util.h.xy.fb.a.m26827(this.isOutputSupportedFor, bArr8)) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("䰃희立鹧ↁ䓩\ue859玸霝㨵巙\ue141Ӫ\ua82e㍇囮奄ᶛꃹ쑞澾\uf314ᚈ", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 39779, objArr4);
                    throw new util.h.xy.ef.md(((java.lang.String) objArr4[0]).intern());
                }
            }
            this.coroutineCreation.mo26557();
            this.getOutputMinFrameDurationlomOqCM = new byte[16];
            this.isOutputSupportedForhNQ4ISI = new byte[16];
            this._BOUNDARY = new byte[16];
            this._CREATION = new byte[16];
            this.init = 0;
            this.b = 0L;
            this.AMEXKernel = 0L;
            this.coroutineBoundary = util.h.xy.fb.a.m26821(this.getOutputStallDuration);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = -2;
            this.ArtificialStackFrames = 0;
            this.d = 0L;
            byte[] bArr9 = this.unwrapAs;
            if (bArr9 != null) {
                util.h.xy.fb.a.m26826(bArr9, (byte) 0);
            }
            if (this.getValidOutputFormatsForInputhNQ4ISI) {
                getInputFormats = (getOutputFormats + 115) % 128;
                this.f7078a = false;
            } else {
                byte[] bArr10 = this.accessartificialFrame;
                if (bArr10 != null) {
                    getOutputFormats = (getInputFormats + 57) % 128;
                    m26644(bArr10, 0, bArr10.length);
                }
            }
            int i8 = getInputFormats + 105;
            getOutputFormats = i8 % 128;
            if (i8 % 2 != 0) {
                return i3;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ᐝ */
    public final int mo26643(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc {
        int i4;
        int i5;
        getHighSpeedVideoFpsRangesFor();
        if (bArr.length - i < i2) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䰧ᕅﺔ䟔⤎\uf217宒㳸蘠潥ス駫捲쒛귇眊\ud81eꆈ\u0adc\uec1e땸ẳ", 22853 - android.text.TextUtils.indexOf("", ""), objArr);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
        }
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            if (this.ArtificialStackFrames != 0) {
                while (i2 > 0) {
                    getOutputFormats = (getInputFormats + 77) % 128;
                    i2--;
                    byte[] bArr3 = this.unwrapAs;
                    int i6 = this.ArtificialStackFrames;
                    i4 = i + 1;
                    bArr3[i6] = bArr[i];
                    int i7 = i6 + 1;
                    this.ArtificialStackFrames = i7;
                    if (i7 == 16) {
                        getHighResolutionOutputSizeshNQ4ISI(bArr3, 0, bArr2, i3);
                        this.ArtificialStackFrames = 0;
                        i5 = 16;
                        break;
                    }
                    i = i4;
                }
            }
            i4 = i;
            i5 = 0;
            while (i2 >= 16) {
                getHighResolutionOutputSizeshNQ4ISI(bArr, i4, bArr2, i3 + i5);
                i4 += 16;
                i2 -= 16;
                i5 += 16;
                int i8 = getInputFormats + 81;
                getOutputFormats = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 / 5;
                }
            }
            if (i2 > 0) {
                getOutputFormats = (getInputFormats + 107) % 128;
                java.lang.System.arraycopy(bArr, i4, this.unwrapAs, 0, i2);
                this.ArtificialStackFrames = i2;
            }
            return i5;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i2) {
            int i12 = getOutputFormats + 33;
            getInputFormats = i12 % 128;
            if (i12 % 2 != 0) {
                byte[] bArr4 = this.unwrapAs;
                int i13 = this.ArtificialStackFrames;
                bArr4[i13] = bArr[i - i10];
                int i14 = i13 % 1;
                this.ArtificialStackFrames = i14;
                if (i14 != bArr4.length) {
                    i10++;
                    getOutputFormats = (getInputFormats + 119) % 128;
                }
                getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs, 0, bArr2, i3 + i11);
                byte[] bArr5 = this.unwrapAs;
                java.lang.System.arraycopy(bArr5, 16, bArr5, 0, this.getOutputSizes);
                this.ArtificialStackFrames = this.getOutputSizes;
                i11 += 16;
                i10++;
                getOutputFormats = (getInputFormats + 119) % 128;
            } else {
                byte[] bArr6 = this.unwrapAs;
                int i15 = this.ArtificialStackFrames;
                bArr6[i15] = bArr[i + i10];
                int i16 = i15 + 1;
                this.ArtificialStackFrames = i16;
                if (i16 != bArr6.length) {
                    i10++;
                    getOutputFormats = (getInputFormats + 119) % 128;
                }
                getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs, 0, bArr2, i3 + i11);
                byte[] bArr52 = this.unwrapAs;
                java.lang.System.arraycopy(bArr52, 16, bArr52, 0, this.getOutputSizes);
                this.ArtificialStackFrames = this.getOutputSizes;
                i11 += 16;
                i10++;
                getOutputFormats = (getInputFormats + 119) % 128;
            }
        }
        return i11;
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = getOutputFormats + 63;
        getInputFormats = i % 128;
        long j = this.b;
        if (i % 2 == 0 ? j > 0 : j > 1) {
            java.lang.System.arraycopy(this.isOutputSupportedForhNQ4ISI, 0, this._BOUNDARY, 0, 16);
            this.AMEXKernel = this.b;
        }
        int i2 = this.init;
        if (i2 > 0) {
            Camera2StreamConfigurationMap(this._BOUNDARY, this._CREATION, 0, i2);
            this.AMEXKernel += this.init;
        }
        if (this.AMEXKernel > 0) {
            int i3 = getOutputFormats + 9;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.System.arraycopy(this._BOUNDARY, 0, this.getOutputMinFrameDurationlomOqCM, 0, 104);
            } else {
                java.lang.System.arraycopy(this._BOUNDARY, 0, this.getOutputMinFrameDurationlomOqCM, 0, 16);
            }
        }
        getOutputFormats = (getInputFormats + 125) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26644(byte[] bArr, int i, int i2) {
        getInputFormats = (getOutputFormats + 89) % 128;
        getHighSpeedVideoFpsRangesFor();
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArr2 = this._CREATION;
            int i4 = this.init;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.init = i5;
            if (i5 == 16) {
                getHighSpeedVideoFpsRanges(this.isOutputSupportedForhNQ4ISI, bArr2);
                this.init = 0;
                this.b += 16;
            }
            i3++;
            getOutputFormats = (getInputFormats + 25) % 128;
        }
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˎ */
    public final int mo26640(int i) {
        int i2 = i + this.ArtificialStackFrames;
        if (!this.getValidOutputFormatsForInputhNQ4ISI) {
            int i3 = getOutputFormats + 99;
            int i4 = i3 % 128;
            getInputFormats = i4;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i5 = this.getOutputSizes;
            if (i2 < i5) {
                return 0;
            }
            i2 -= i5;
            getOutputFormats = (i4 + 11) % 128;
        }
        return i2 - (i2 % 16);
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˋ */
    public final int mo26638(int i) {
        int i2 = i + this.ArtificialStackFrames;
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            getInputFormats = (getOutputFormats + 73) % 128;
            return i2 + this.getOutputSizes;
        }
        int i3 = this.getOutputSizes;
        if (i2 < i3) {
            return 0;
        }
        getOutputFormats = (getInputFormats + 101) % 128;
        return i2 - i3;
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˎ */
    public final byte[] mo26641() {
        int i = getOutputFormats + 119;
        int i2 = i % 128;
        getInputFormats = i2;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.isOutputSupportedFor;
        if (bArr != null) {
            return util.h.xy.fb.a.m26821(bArr);
        }
        int i3 = i2 + 95;
        getOutputFormats = i3 % 128;
        byte[] bArr2 = new byte[this.getOutputSizes];
        if (i3 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˊ */
    public final void mo26637(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        byte[] m26658;
        util.h.xy.ep.mc mcVar;
        byte[] bArr;
        this.getValidOutputFormatsForInputhNQ4ISI = z;
        this.isOutputSupportedFor = null;
        this.f7078a = true;
        if (mbVar instanceof util.h.xy.ep.ra) {
            util.h.xy.ep.ra raVar = (util.h.xy.ep.ra) mbVar;
            m26658 = raVar.m26670();
            this.accessartificialFrame = raVar.m26668();
            int m26671 = raVar.m26671();
            if (m26671 < 32 || m26671 > 128 || m26671 % 8 != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰧跧쿖\u09ba䮞薄읠ğ䌠鴐\udf04\u18f6嫟铵횪ႈ剬같\uee1d⠊模ꮽ\ue5c7⟆憼ꎄﴢ㼓", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 49639, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(m26671);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getOutputSizes = m26671 / 8;
            mcVar = raVar.m26669();
        } else {
            if (!(mbVar instanceof util.h.xy.ep.e)) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰇炅㔒呂븖択✔\uebed꠶沢ᄮ햸騿廊͜쟀葌䣈ഔ㇁\uf66b뫴罳⏸\ue072꒳榘⸆틂霸宻ᠸ", 15492 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            util.h.xy.ep.e eVar = (util.h.xy.ep.e) mbVar;
            m26658 = eVar.m26658();
            this.accessartificialFrame = null;
            this.getOutputSizes = 16;
            mcVar = (util.h.xy.ep.mc) eVar.m26659();
        }
        this.unwrapAs = new byte[z ? 16 : this.getOutputSizes + 16];
        if (m26658 == null || m26658.length <= 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䰧㵩껬\u1ff0襟窈\uebfc啹욄럒Ⅴ鉴ϖ赓繬\uefb4够쩼뮨╍阋߫\uf0fa扐펂峢", 29009 - android.graphics.Color.blue(0), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (z && (bArr = this.kernelVersion) != null && util.h.xy.fb.a.m26820(bArr, m26658)) {
            if (mcVar == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰍锪﹊읯⢕熣媐밟蔣\uee56㝯ᢜ懲䫡갇\uf52b\ude5d❾ࣔ冷뫥鰕\ue560칺\u1755碾䆌ꫬ谌피㹊ݬ梾뇟髭ﰎ씴", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55589, objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            }
            byte[] bArr2 = this.getOutputStallDurationlomOqCM;
            if (bArr2 != null && util.h.xy.fb.a.m26820(bArr2, mcVar.m26663())) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰍锪﹊읯⢕熣媐밟蔣\uee56㝯ᢜ懲䫡갇\uf52b\ude5d❾ࣔ冷뫥鰕\ue560칺\u1755碾䆌ꫬ谌피㹊ݬ梾뇟髭ﰎ씴", (-16721627) - android.graphics.Color.rgb(0, 0, 0), objArr5);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            }
        }
        this.kernelVersion = m26658;
        if (mcVar != null) {
            this.getOutputStallDurationlomOqCM = mcVar.m26663();
        }
        if (mcVar != null) {
            this.coroutineCreation.mo26556(true, mcVar);
            byte[] bArr3 = new byte[16];
            this.getOutputSizeshNQ4ISI = bArr3;
            this.coroutineCreation.mo26555(bArr3, 0, bArr3, 0);
            this.CoroutineDebuggingKt.mo26617(this.getOutputSizeshNQ4ISI);
            this.toString = null;
        } else if (this.getOutputSizeshNQ4ISI == null) {
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䰥\uf20c〙癛됟器㠷縫뱶\ue233⁍昃ꑉ\uea45⡩湤걷퉿ၹ嚎钆\udaddᢝ庡鳦슨¶䚺蓞쫌ࣝ仛貮㋠烮뛲\uf4e6", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 48647, objArr6);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        byte[] bArr4 = new byte[16];
        this.getOutputStallDuration = bArr4;
        byte[] bArr5 = this.kernelVersion;
        if (bArr5.length == 12) {
            java.lang.System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.getOutputStallDuration[15] = 1;
        } else {
            int length = bArr5.length;
            int i = getInputFormats + 51;
            getOutputFormats = i % 128;
            int i2 = i % 2 != 0 ? 0 : 1;
            while (i2 < length) {
                getInputFormats = (getOutputFormats + 113) % 128;
                Camera2StreamConfigurationMap(bArr4, bArr5, i2, java.lang.Math.min(length - i2, 16));
                i2 += 16;
                getOutputFormats = (getInputFormats + 101) % 128;
            }
            byte[] bArr6 = new byte[16];
            util.h.xy.fb.rb.m26848(this.kernelVersion.length * 8, bArr6, 8);
            getHighSpeedVideoFpsRanges(this.getOutputStallDuration, bArr6);
        }
        this.getOutputMinFrameDurationlomOqCM = new byte[16];
        this.isOutputSupportedForhNQ4ISI = new byte[16];
        this._BOUNDARY = new byte[16];
        this._CREATION = new byte[16];
        this.init = 0;
        this.b = 0L;
        this.AMEXKernel = 0L;
        this.coroutineBoundary = util.h.xy.fb.a.m26821(this.getOutputStallDuration);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = -2;
        this.ArtificialStackFrames = 0;
        this.d = 0L;
        byte[] bArr7 = this.accessartificialFrame;
        if (bArr7 != null) {
            m26644(bArr7, 0, bArr7.length);
        }
    }

    public ra(util.h.xy.ef.ra raVar, util.h.xy.en.ma maVar) {
        if (raVar.mo26554() == 16) {
            maVar = maVar == null ? new util.h.xy.en.b() : maVar;
            this.coroutineCreation = raVar;
            this.CoroutineDebuggingKt = maVar;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.KeyEvent.getDeadChar(0, 0) - 1546844528, (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (1 - android.text.TextUtils.getOffsetAfter("", 0)), android.graphics.Color.red(0) - 68, android.view.View.resolveSize(0, 0) + 22595315, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    public ra(util.h.xy.ef.ra raVar) {
        this(raVar, null);
    }
}
