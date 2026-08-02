package util.h.xy.o;

/* loaded from: classes5.dex */
public final class ra {
    private static final byte[] AMEXKernel;
    private static final byte[] ArtificialStackFrames;
    private static final byte[] Camera2StreamConfigurationMap;
    private static final byte[] CoroutineDebuggingKt;
    private static final byte[] _BOUNDARY;
    private static final byte[] _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f7080a;
    private static final byte[] accessartificialFrame;
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] coroutineBoundary;
    private static final byte[] coroutineCreation;
    private static final byte[] d;
    private static final byte[] getARTIFICIAL_FRAME_PACKAGE_NAME;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final byte[] getHighSpeedVideoFpsRanges;
    private static final byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static final byte[] getHighSpeedVideoSizesFor;
    private static final byte[] getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final byte[] getOutputFormats;
    private static final byte[] getOutputMinFrameDuration;
    private static final byte[] getOutputMinFrameDurationlomOqCM;
    private static final byte[] getOutputSizes;
    private static final byte[] getOutputSizeshNQ4ISI;
    private static final byte[] getOutputStallDuration;
    private static final byte[] getOutputStallDurationlomOqCM;
    private static final byte[] getValidOutputFormatsForInputhNQ4ISI;
    private static int[] init = null;
    private static final java.lang.String isOutputSupportedFor;
    private static final byte[] isOutputSupportedForhNQ4ISI;
    private static int kernelVersion = 1;
    private static int release;
    private static final byte[] resetTransaction;
    private static final byte[] toString;
    private static final byte[] unwrapAs;

    static {
        getHighSpeedVideoSizes();
        isOutputSupportedFor = util.h.xy.o.ra.class.getName();
        toString = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        coroutineCreation = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE};
        getOutputStallDurationlomOqCM = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        getOutputMinFrameDurationlomOqCM = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        getInputFormats = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        d = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        getHighSpeedVideoSizesFor = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
        getHighSpeedVideoFpsRanges = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 56};
        unwrapAs = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 57};
        getOutputSizeshNQ4ISI = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 48};
        getOutputFormats = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        getInputSizeshNQ4ISI = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE};
        getOutputSizes = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        getOutputMinFrameDuration = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        accessartificialFrame = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        isOutputSupportedForhNQ4ISI = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        _BOUNDARY = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
        getOutputStallDuration = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 56};
        ArtificialStackFrames = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 57};
        CoroutineDebuggingKt = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 48};
        c = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        getHighSpeedVideoFpsRangesFor = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE};
        resetTransaction = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        getValidOutputFormatsForInputhNQ4ISI = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        b = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        _CREATION = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        coroutineBoundary = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
        getARTIFICIAL_FRAME_PACKAGE_NAME = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 56};
        f7080a = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 57};
        Camera2StreamConfigurationMap = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 48};
        AMEXKernel = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        kernelVersion = (release + 125) % 128;
    }

    /* renamed from: util.h.xy.o.ra$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.o.b.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[util.h.xy.o.b.f2286.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.o.b.f2285.ordinal()] = 2;
                int i = getHighSpeedVideoSizes + 99;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                int i2 = i % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.o.b.f2276.ordinal()] = 3;
                int i3 = getHighSpeedVideoSizes;
                int i4 = (i3 & 79) + (i3 | 79);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.o.b.f2278.ordinal()] = 4;
                int i6 = getHighSpeedVideoSizes;
                int i7 = (i6 & 57) + (i6 | 57);
                getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[util.h.xy.o.b.f2281.ordinal()] = 5;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 11) % 128;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = init;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 59) % 128;
                iArr4[i2] = (int) (iArr3[i2] ^ (-5569649899877129369L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = init;
        if (iArr6 != null) {
            int i3 = getHighSpeedVideoSizes + 91;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 21;
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 != 0) {
                    iArr2[i4] = (int) (iArr6[i4] & (-5569649899877129369L));
                    i4 >>>= 1;
                } else {
                    iArr2[i4] = (int) (iArr6[i4] ^ (-5569649899877129369L));
                    i4++;
                }
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 1) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr5[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        int i11 = getHighResolutionOutputSizeshNQ4ISI + 69;
        getHighSpeedVideoSizes = i11 % 128;
        if (i11 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27003(util.h.xy.o.b bVar) {
        kernelVersion = (release + 109) % 128;
        int i = util.h.xy.o.ra.AnonymousClass1.Camera2StreamConfigurationMap[bVar.ordinal()];
        if (i == 1) {
            return Camera2StreamConfigurationMap(new byte[]{-87, 92, 48, 74, -6, -44, 34, -117}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, -111, 93, 124, -71, 62, com.google.common.base.Ascii.GS}, toString);
        }
        if (i == 2) {
            return Camera2StreamConfigurationMap(new byte[]{-19, -113, 42, 75, -41, 35, 108, 126}, new byte[]{83, 43, 63, -120, 105, 60, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -15}, coroutineCreation);
        }
        if (i == 3) {
            return Camera2StreamConfigurationMap(new byte[]{120, -79, -78, -35, 66, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75, 19}, new byte[]{-8, -42, 32, 10, 88, 41, -27, 18}, getHighSpeedVideoSizesFor);
        }
        if (i != 4) {
            if (i == 5) {
                return Camera2StreamConfigurationMap(new byte[]{-31, -8, 34, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 124, Byte.MAX_VALUE}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.google.common.base.Ascii.ESC, 34, -123, com.visa.cbp.getEncExpo.IResultReceiver2, 44, com.google.common.base.Ascii.FS, -14}, resetTransaction);
            }
            throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2240);
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{67, -10, 103, 18, 9, 94, 93, 84}, new byte[]{-11, -70, -106, 1, 99, 89, -20, -13}, accessartificialFrame);
        int i2 = kernelVersion + 73;
        release = i2 % 128;
        if (i2 % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m27001(byte[] bArr) {
        kernelVersion = (release + 51) % 128;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = null;
        try {
            byte[] bArr3 = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -67, -41, -10, -119, 3, com.google.common.base.Ascii.GS, 115};
            byte[] bArr4 = {87, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.GS, -104, -1, 47, Byte.MAX_VALUE, 47};
            bArr2 = util.h.xy.ar.b.m25090(bArr, getHighSpeedVideoFpsRanges);
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr3, bArr4, bArr2);
            util.h.xy.ar.b.m25095(bArr2);
            release = (kernelVersion + 3) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27004(byte[] bArr) {
        byte[] Camera2StreamConfigurationMap2;
        int i = release + 55;
        kernelVersion = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 == 0) {
                util.h.xy.ar.b.m25074(bArr);
                byte[][] bArr3 = new byte[2][];
                bArr3[1] = bArr;
                bArr3[1] = getOutputStallDurationlomOqCM;
                bArr2 = util.h.xy.ar.b.m25090(bArr3);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{41, -66, -7, 107, com.visa.cbp.getEncExpo.IResultReceiver, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -82, -52}, new byte[]{-38, -18, 69, -25, -126, 57, -13, -6}, bArr2);
            } else {
                util.h.xy.ar.b.m25074(bArr);
                bArr2 = util.h.xy.ar.b.m25090(bArr, getOutputStallDurationlomOqCM);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{41, -66, -7, 107, com.visa.cbp.getEncExpo.IResultReceiver, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -82, -52}, new byte[]{-38, -18, 69, -25, -126, 57, -13, -6}, bArr2);
            }
            int i2 = release;
            kernelVersion = (i2 + 15) % 128;
            int i3 = i2 + 63;
            kernelVersion = i3 % 128;
            if (i3 % 2 != 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        } finally {
            util.h.xy.ar.b.m25095(bArr2);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27011(byte[] bArr) {
        kernelVersion = (release + 113) % 128;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = null;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{-72975959, 44924836}, 3 - android.graphics.Color.blue(0), objArr);
            byte[] digest = java.security.MessageDigest.getInstance(((java.lang.String) objArr[0]).intern()).digest(bArr);
            util.h.xy.ar.b.m25074(bArr);
            util.h.xy.ar.b.m25074(digest);
            bArr3 = util.h.xy.ar.b.m25090(digest, getOutputFormats);
            bArr2 = Camera2StreamConfigurationMap(new byte[]{-51, 98, -2, 3, -83, -66, -37, -28}, new byte[]{123, 56, -26, 92, 126, 13, -71, 62}, bArr3);
        } catch (java.security.NoSuchAlgorithmException e) {
            e.getMessage();
        } finally {
            util.h.xy.ar.b.m25095(bArr3);
        }
        release = (kernelVersion + 111) % 128;
        return bArr2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m27016(byte[] bArr) {
        byte[] Camera2StreamConfigurationMap2;
        int i = kernelVersion + 77;
        release = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25074(bArr);
                byte[] bArr3 = {com.google.common.base.Ascii.CAN, -75, -60, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -82, 88, 111, 41};
                byte[][] bArr4 = new byte[2][];
                bArr4[0] = bArr;
                bArr4[0] = getInputSizeshNQ4ISI;
                bArr2 = util.h.xy.ar.b.m25090(bArr4);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{-94, 72, 39, -47, 13, -21, 6, 34}, bArr3, bArr2);
            } else {
                util.h.xy.ar.b.m25074(bArr);
                byte[] bArr5 = {com.google.common.base.Ascii.CAN, -75, -60, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -82, 88, 111, 41};
                bArr2 = util.h.xy.ar.b.m25090(bArr, getInputSizeshNQ4ISI);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{-94, 72, 39, -47, 13, -21, 6, 34}, bArr5, bArr2);
            }
            int i2 = kernelVersion + 39;
            release = i2 % 128;
            if (i2 % 2 == 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        } finally {
            util.h.xy.ar.b.m25095(bArr2);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27008(byte[] bArr) {
        byte[] Camera2StreamConfigurationMap2;
        int i = kernelVersion + 3;
        release = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25074(bArr);
                byte[] bArr3 = {85, -21, -88, -48, 66, 105, com.google.common.base.Ascii.US, 76};
                byte[] bArr4 = {59, -38, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -61, 41, -72, -1, -19};
                byte[][] bArr5 = new byte[3][];
                bArr5[0] = bArr;
                bArr5[1] = getOutputMinFrameDurationlomOqCM;
                bArr2 = util.h.xy.ar.b.m25090(bArr5);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr3, bArr4, bArr2);
                util.h.xy.ar.b.m25095(bArr2);
            } else {
                util.h.xy.ar.b.m25074(bArr);
                byte[] bArr6 = {85, -21, -88, -48, 66, 105, com.google.common.base.Ascii.US, 76};
                byte[] bArr7 = {59, -38, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -61, 41, -72, -1, -19};
                bArr2 = util.h.xy.ar.b.m25090(bArr, getOutputMinFrameDurationlomOqCM);
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr6, bArr7, bArr2);
            }
            release = (kernelVersion + 105) % 128;
            return Camera2StreamConfigurationMap2;
        } finally {
            util.h.xy.ar.b.m25095(bArr2);
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static byte[] m27014(byte[] bArr) {
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = null;
        try {
            bArr2 = util.h.xy.ar.b.m25090(bArr, getInputFormats);
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{102, 16, -27, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, -9, 56, 45}, new byte[]{35, -35, -94, -118, -106, 81, -18, -5}, bArr2);
            util.h.xy.ar.b.m25095(bArr2);
            int i = release;
            kernelVersion = (i + 111) % 128;
            int i2 = i + 17;
            kernelVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static byte[] m26991(byte[] bArr) {
        release = (kernelVersion + 81) % 128;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = null;
        try {
            byte[] bArr3 = {103, 16, -27, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, -1, 57, 45};
            byte[] bArr4 = {45, -35, -30, 74, -106, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -18, -21};
            bArr2 = util.h.xy.ar.b.m25090(bArr, _CREATION);
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr3, bArr4, bArr2);
            util.h.xy.ar.b.m25095(bArr2);
            release = (kernelVersion + 49) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr2);
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static byte[] m26993(byte[] bArr) {
        java.lang.Throwable th;
        byte[] m25090;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = {98, 16, -27, 16, com.google.common.base.Ascii.GS, -1, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS};
        byte[] bArr3 = {67, -51, 82, 43, 87, -102, -33, 8};
        byte[] bArr4 = null;
        try {
            m25090 = util.h.xy.ar.b.m25090(bArr, getOutputStallDuration);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, bArr3, m25090);
            util.h.xy.ar.b.m25095(m25090);
            int i = release + 75;
            int i2 = i % 128;
            kernelVersion = i2;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i3 = i2 + 87;
            release = i3 % 128;
            if (i3 % 2 == 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr4 = m25090;
            util.h.xy.ar.b.m25095(bArr4);
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27009(byte[] bArr, byte[] bArr2) {
        java.lang.Throwable th;
        byte[] m25090;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            byte[] bArr3 = null;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{-249075187, -439495119, -1630753919, -804430206, 2041140109, -825623672, -1983756364, 1549111057, -227750114, 353919299, 208618541, 303166656, -295155464, 366098710, 1489063945, 1036543088, 1545841659, 42919227, -1069856172, -1493598429, 501000151, -1660535900, 2007935890, 876310736, -523853884, 73295842, -481063366, -2134360654, 975015590, 554741145, 1283473332, -1161605742, -1493150127, 2055473191}, 66 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(util.h.xy.ar.b.m25074(bArr));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{-627332211, -1997375682, -381428718, 1965063110}, 5 - android.text.TextUtils.indexOf("", "", 0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(bArr2);
            if (sb.toString() != null) {
                util.h.xy.ar.b.m25074(bArr2);
            }
            byte[] bArr4 = {com.google.common.base.Ascii.EM, com.visa.cbp.getEncExpo.IResultReceiver, -46, -61, 56, -86, -60, 47};
            byte[] bArr5 = {36, -25, 77, -102, 66, 59, com.google.common.base.Ascii.FS, -41};
            try {
                if (bArr2 == null) {
                    m25090 = util.h.xy.ar.b.m25090(bArr, d);
                } else {
                    m25090 = util.h.xy.ar.b.m25090(bArr, d, bArr2);
                }
                try {
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr4, bArr5, m25090);
                    util.h.xy.ar.b.m25095(m25090);
                    int i = (release + 11) % 128;
                    kernelVersion = i;
                    int i2 = i + 53;
                    release = i2 % 128;
                    if (i2 % 2 == 0) {
                        return Camera2StreamConfigurationMap2;
                    }
                    throw null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bArr3 = m25090;
                    util.h.xy.ar.b.m25095(bArr3);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27005(byte[] bArr, byte[] bArr2) {
        byte[] m25090;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-249075187, -439495119, -1630753919, -804430206, 2041140109, -825623672, -1983756364, 1549111057, -227750114, 353919299, 208618541, 303166656, -295155464, 366098710, 1489063945, 1036543088, 383618410, -298181077, 616550983, 380832112, -304058331, -276147338, 420546658, -875863208, 1956173777, -307992392, 442343155, 1180721286, 1426283788, 625193441, 86751701, 1726074551}, 63 - android.text.TextUtils.getOffsetAfter("", 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.ar.b.m25074(bArr));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-627332211, -1997375682, -381428718, 1965063110}, android.graphics.Color.red(0) + 5, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(bArr2);
        if (sb.toString() != null) {
            util.h.xy.ar.b.m25074(bArr2);
        }
        byte[] bArr3 = null;
        try {
            byte[] bArr4 = {com.google.common.base.Ascii.SUB, 40, 42, -77, -45, -52, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 44};
            byte[] bArr5 = {5, -75, 84, 39, 116, -35, -90, -60};
            if (bArr2 != null) {
                m25090 = util.h.xy.ar.b.m25090(bArr, ArtificialStackFrames, bArr2);
                kernelVersion = (release + 1) % 128;
            } else {
                int i = kernelVersion + 43;
                release = i % 128;
                if (i % 2 != 0) {
                    byte[][] bArr6 = new byte[4][];
                    bArr6[0] = bArr;
                    bArr6[0] = ArtificialStackFrames;
                    m25090 = util.h.xy.ar.b.m25090(bArr6);
                } else {
                    m25090 = util.h.xy.ar.b.m25090(bArr, ArtificialStackFrames);
                }
            }
            bArr3 = m25090;
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr4, bArr5, bArr3);
            util.h.xy.ar.b.m25095(bArr3);
            release = (kernelVersion + 13) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr3);
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m27017(byte[] bArr, byte[] bArr2) {
        byte[] m25090;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-249075187, -439495119, -1630753919, -804430206, 2041140109, -825623672, -1983756364, 1549111057, -227750114, 353919299, 208618541, 303166656, -295155464, 366098710, 1489063945, 1036543088, 730950099, -1741508971, 106537968, -2081743302, -940734696, 2081380805, 118725743, -381561530, -1907664944, 261124021, -1983756364, 1549111057, -1670732011, -1134320453, -381428718, 1965063110}, 61 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.ar.b.m25074(bArr));
        int[] iArr = {-627332211, -1997375682, -381428718, 1965063110};
        kernelVersion = (release + 9) % 128;
        try {
            byte[] bArr3 = null;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(iArr, 5 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(bArr2);
            if (sb.toString() != null) {
                util.h.xy.ar.b.m25074(bArr2);
            }
            try {
                byte[] bArr4 = {34, -121, 18, -45, -88, -1, 116, 93};
                byte[] bArr5 = {4, -89, 86, com.google.common.base.Ascii.ESC, -115, -109, 6, -93};
                if (bArr2 != null) {
                    m25090 = util.h.xy.ar.b.m25090(bArr, ArtificialStackFrames, bArr2);
                } else {
                    release = (kernelVersion + 45) % 128;
                    m25090 = util.h.xy.ar.b.m25090(bArr, ArtificialStackFrames);
                }
                bArr3 = m25090;
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr4, bArr5, bArr3);
                util.h.xy.ar.b.m25095(bArr3);
                kernelVersion = (release + 61) % 128;
                return Camera2StreamConfigurationMap2;
            } catch (java.lang.Throwable th) {
                util.h.xy.ar.b.m25095(bArr3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27012(byte[] bArr, byte[] bArr2) {
        release = (kernelVersion + 19) % 128;
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(bArr2);
        byte[] bArr3 = null;
        try {
            byte[] bArr4 = {89, com.visa.cbp.getEncExpo.IResultReceiver, -46, -61, 56, -86, -60, 43};
            byte[] bArr5 = {org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -25, 77, -102, 66, 59, com.google.common.base.Ascii.FS, 58};
            bArr3 = util.h.xy.ar.b.m25090(bArr, getOutputSizes, bArr2);
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr4, bArr5, bArr3);
            util.h.xy.ar.b.m25095(bArr3);
            kernelVersion = (release + 73) % 128;
            return Camera2StreamConfigurationMap2;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bArr3);
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m27015() {
        int i = release + 47;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(new byte[]{106, 83, 105, com.google.common.base.Ascii.FS, 125, -74, -17, 44}, new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 110, -76, -43, com.google.common.base.Ascii.EM, 43, 86}, toString);
        }
        Camera2StreamConfigurationMap(new byte[]{106, 83, 105, com.google.common.base.Ascii.FS, 125, -74, -17, 44}, new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 110, -76, -43, com.google.common.base.Ascii.EM, 43, 86}, toString);
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m27000() {
        int i = kernelVersion + 93;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(new byte[]{125, -74, 105, com.google.common.base.Ascii.FS, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 83, -17, 44}, new byte[]{-43, com.google.common.base.Ascii.EM, 110, -76, com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 43, 86}, toString);
        }
        Camera2StreamConfigurationMap(new byte[]{125, -74, 105, com.google.common.base.Ascii.FS, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 83, -17, 44}, new byte[]{-43, com.google.common.base.Ascii.EM, 110, -76, com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 43, 86}, toString);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27010() {
        release = (kernelVersion + 101) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{19, 19, -70, 14, -125, 70, -46, 81}, new byte[]{-115, com.visa.cbp.getEncExpo.registerForActivityResult, -32, 40, 62, -122, com.google.common.base.Ascii.VT, 7}, b);
        kernelVersion = (release + 107) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27007() {
        kernelVersion = (release + 121) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{125, 104, -92, -57, -114, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -84, 36}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 60, 81, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -102, com.google.common.base.Ascii.SYN, -62, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus}, getOutputSizes);
        int i = kernelVersion + 47;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27002() {
        kernelVersion = (release + 91) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{69, -35, 7, -1, 9, -13, -51, 3}, new byte[]{-1, -19, -33, -26, 9, -93, com.google.common.base.Ascii.RS, 116}, unwrapAs);
        int i = release + 65;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static byte[] m26992() {
        kernelVersion = (release + 19) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.SYN, -111, -41, 99, 126, -11, 9}, new byte[]{13, 82, 68, -122, -79, 4, 47, -56}, getOutputMinFrameDuration);
        int i = kernelVersion + 85;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static byte[] m27013() {
        int i = release + 97;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(new byte[]{34, com.google.common.base.Ascii.ETB, -102, -95, 99, 126, -78, 8}, new byte[]{1, -46, com.google.common.base.Ascii.DC4, -106, 1, 4, 44, -59}, isOutputSupportedForhNQ4ISI);
        }
        Camera2StreamConfigurationMap(new byte[]{34, com.google.common.base.Ascii.ETB, -102, -95, 99, 126, -78, 8}, new byte[]{1, -46, com.google.common.base.Ascii.DC4, -106, 1, 4, 44, -59}, isOutputSupportedForhNQ4ISI);
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static byte[] m26990() {
        kernelVersion = (release + 15) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{64, 39, -99, -61, 82, 109, -89, 17}, new byte[]{68, -95, 4, -105, 40, -47, 40, com.google.common.base.Ascii.EM}, getValidOutputFormatsForInputhNQ4ISI);
        int i = release + 115;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static byte[] m26994() {
        release = (kernelVersion + 9) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{-115, 104, -92, -57, -114, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -84, 35}, new byte[]{17, 60, 81, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -102, com.google.common.base.Ascii.SYN, -62, 33}, getOutputMinFrameDuration);
        int i = kernelVersion + 3;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public static byte[] m27018() {
        int i = release + 111;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{18, 104, -92, -57, -114, 72, -54, 35}, new byte[]{-95, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 65, 78, 44, -90, -46, 18}, f7080a);
            int i2 = release + 31;
            kernelVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap(new byte[]{18, 104, -92, -57, -114, 72, -54, 35}, new byte[]{-95, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 65, 78, 44, -90, -46, 18}, f7080a);
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static byte[] m26998() {
        kernelVersion = (release + 97) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{93, 8, -44, -61, 7, 45, -1, 69}, new byte[]{34, 93, 97, -113, com.google.common.base.Ascii.SUB, 104, -9, -42}, getHighSpeedVideoFpsRangesFor);
        int i = kernelVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static byte[] m26999() {
        kernelVersion = (release + 57) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new byte[]{-43, Byte.MIN_VALUE, -60, -47, 87, -83, -17, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, new byte[]{-1, 70, 33, Byte.MAX_VALUE, 122, 120, com.visa.cbp.getEncExpo.IResultReceiver, 118}, Camera2StreamConfigurationMap);
        int i = kernelVersion + 5;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static byte[] m26997() {
        int i = release + 115;
        kernelVersion = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(new byte[]{com.google.common.base.Ascii.SUB, 43, 60, 77, -95, -78, -61, 94}, new byte[]{com.google.common.base.Ascii.RS, 45, 60, 75, -31, -46, -61, -76}, getHighSpeedVideoFpsRangesFor);
        }
        Camera2StreamConfigurationMap(new byte[]{com.google.common.base.Ascii.SUB, 43, 60, 77, -95, -78, -61, 94}, new byte[]{com.google.common.base.Ascii.RS, 45, 60, 75, -31, -46, -61, -76}, getHighSpeedVideoFpsRangesFor);
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public static byte[] m27006() {
        int i = kernelVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(new byte[]{-95, -117, 124, 109, -91, -69, 67, -18}, new byte[]{94, 46, 58, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -18, -35, com.visa.cbp.getEncExpo.startTransaction, -77}, AMEXKernel);
        }
        Camera2StreamConfigurationMap(new byte[]{-95, -117, 124, 109, -91, -69, 67, -18}, new byte[]{94, 46, 58, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -18, -35, com.visa.cbp.getEncExpo.startTransaction, -77}, AMEXKernel);
        throw new java.lang.ArithmeticException();
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7 = null;
        try {
            byte[] m25082 = util.h.xy.ar.b.m25082(new byte[]{-22, com.google.common.base.Ascii.GS, 7, -44, -126, -23, -41, -23}, new byte[]{com.google.common.base.Ascii.US, com.google.common.base.Ascii.VT, 124, -40, -74, -21, -106, 101});
            try {
                bArr4 = util.h.xy.ar.b.m25082(bArr, bArr2);
                try {
                    byte[] m25090 = util.h.xy.ar.b.m25090(m25082, bArr3);
                    try {
                        bArr6 = new byte[bArr4.length];
                        try {
                            java.lang.System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
                            byte[] m250822 = util.h.xy.ar.b.m25082(m25090, bArr6);
                            util.h.xy.ar.b.m25100(m25082, bArr4);
                            util.h.xy.ar.b.m25100(m25090, bArr6);
                            int i = kernelVersion + 87;
                            int i2 = i % 128;
                            release = i2;
                            if (i % 2 != 0) {
                                throw null;
                            }
                            int i3 = i2 + 11;
                            kernelVersion = i3 % 128;
                            if (i3 % 2 != 0) {
                                return m250822;
                            }
                            throw null;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bArr7 = m25090;
                            bArr5 = bArr7;
                            bArr7 = m25082;
                            util.h.xy.ar.b.m25100(bArr7, bArr4);
                            util.h.xy.ar.b.m25100(bArr5, bArr6);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr6 = null;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr6 = null;
                    bArr5 = bArr7;
                    bArr7 = m25082;
                    util.h.xy.ar.b.m25100(bArr7, bArr4);
                    util.h.xy.ar.b.m25100(bArr5, bArr6);
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr4 = null;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr4 = null;
            bArr5 = null;
            bArr6 = null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static byte[] m26995(byte[] bArr) {
        java.lang.Throwable th;
        util.h.xy.ar.b.m25074(bArr);
        byte[] bArr2 = {-112, -76, -41, -10, -119, 3, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4};
        byte[] bArr3 = {35, -126, com.google.common.base.Ascii.GS, -104, -1, 47, 125, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
        byte[] bArr4 = null;
        try {
            byte[] m25090 = util.h.xy.ar.b.m25090(bArr, getHighSpeedVideoFpsRanges);
            try {
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, bArr3, m25090);
                util.h.xy.ar.b.m25095(m25090);
                int i = kernelVersion;
                release = (i + 115) % 128;
                int i2 = i + 31;
                release = i2 % 128;
                if (i2 % 2 == 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr4 = m25090;
                util.h.xy.ar.b.m25095(bArr4);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static byte[] m26996() {
        int i = kernelVersion + 17;
        release = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(new byte[]{32, -59, 69, -1, kotlin.io.encoding.Base64.padSymbol, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 125, com.visa.cbp.getEncExpo.registerForActivityResult}, new byte[]{-119, 77, -13, 40, -18, 109, 39, -118}, CoroutineDebuggingKt);
        }
        Camera2StreamConfigurationMap(new byte[]{32, -59, 69, -1, kotlin.io.encoding.Base64.padSymbol, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 125, com.visa.cbp.getEncExpo.registerForActivityResult}, new byte[]{-119, 77, -13, 40, -18, 109, 39, -118}, CoroutineDebuggingKt);
        throw null;
    }

    static void getHighSpeedVideoSizes() {
        init = new int[]{1720173645, 117917469, -244562461, -904810453, 2059158919, 867320492, -1263947530, 1781693377, -608581236, -1306911425, -993205644, -1185311820, -765645124, 826183922, -282244004, 782765433, 336423559, -794031725};
    }
}
