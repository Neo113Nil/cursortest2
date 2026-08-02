package util.h.xy.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.n.mb[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static boolean getInputFormats = false;
    private static boolean getInputSizeshNQ4ISI = false;
    private static char[] getOutputFormats;
    private static char[] getOutputMinFrameDuration;
    private static int getOutputMinFrameDurationlomOqCM;
    private static char[] getOutputStallDuration;
    private static char getOutputStallDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.n.mb f2254;
    private android.content.Context getOutputSizes = null;

    /* renamed from: ˏ, reason: contains not printable characters */
    public util.h.xy.da.ra f2258 = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.da.ra f2256 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f2257 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f2260 = null;

    /* renamed from: ͺ, reason: contains not printable characters */
    public util.h.xy.da.ra f2259 = null;

    /* renamed from: ʻ, reason: contains not printable characters */
    public util.h.xy.da.ra f2255 = null;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.n.mb valueOf(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.n.mb mbVar = (util.h.xy.n.mb) java.lang.Enum.valueOf(util.h.xy.n.mb.class, str);
        int i = getHighSpeedVideoSizesFor + 117;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.n.mb[] values() {
        int i = getOutputMinFrameDurationlomOqCM + 7;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.n.mb[] mbVarArr = getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return (util.h.xy.n.mb[]) mbVarArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "¥¤¡£¢\u0088¡ ", objArr);
        util.h.xy.n.mb mbVar = new util.h.xy.n.mb(((java.lang.String) objArr[0]).intern());
        f2254 = mbVar;
        int i = getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoSizesFor = (i + 99) % 128;
        util.h.xy.n.mb[] mbVarArr = {mbVar};
        int i2 = i + 125;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoFpsRanges = mbVarArr;
            Camera2StreamConfigurationMap = util.h.xy.n.mb.class.getName();
            int i3 = getOutputMinFrameDurationlomOqCM + 31;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0143 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145 A[DONT_GENERATE] */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26985(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] highSpeedVideoFpsRanges;
        byte[] highSpeedVideoFpsRanges2;
        byte[] highSpeedVideoFpsRanges3;
        synchronized (this) {
            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 59) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0082\u0085\u008a\u0089\u0091\u0089\u0092\u0086\u0091\u008e\u0082\u0081\u0082\u0085\u008a\u0091\u008e\u0090\u0085\u008f\u008e\u008d\u0085\u008c\u008b\u0085\u008a\u0089\u0082\u0083\u0086\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            byte[] bArr = {-70, -33, -6, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
            byte[] bArr2 = {-1, -85, -9, 17};
            byte[] bArr3 = {32, 60, -10, -108};
            byte[] bArr4 = {-108, kotlin.io.encoding.Base64.padSymbol, -56, com.google.common.base.Ascii.SUB};
            byte[] bArr5 = {-86, 35, -36, 63};
            byte[] bArr6 = {47, 77, -77, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME};
            if (this.getOutputSizes != null) {
                return false;
            }
            if (context == null) {
                throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2223);
            }
            if (context instanceof android.app.Activity) {
                int i = getOutputMinFrameDurationlomOqCM + 83;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 == 0) {
                    this.getOutputSizes = context.getApplicationContext();
                    throw new java.lang.ArithmeticException();
                }
                this.getOutputSizes = context.getApplicationContext();
                try {
                    util.h.xy.da.mc.m26263(this.getOutputSizes);
                    util.h.xy.db.a m27720 = util.h.xy.z.ra.m27720();
                    getHighSpeedVideoSizes();
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
                    highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr2);
                    highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr3);
                    byte[] highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(bArr4);
                    byte[] highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(bArr5);
                    byte[] highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(bArr6);
                    try {
                        this.f2258.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27720).mo26094());
                        this.f2256.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges3).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27720).mo26094());
                        this.f2259.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges6).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27720).mo26094());
                        this.f2257.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges4).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27720).mo26094());
                        this.f2260.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges5).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27720).mo26094());
                        util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges2);
                        int i2 = getOutputMinFrameDurationlomOqCM + 59;
                        getHighSpeedVideoSizesFor = i2 % 128;
                        return i2 % 2 != 0 ? true : true;
                    } catch (java.lang.Throwable th) {
                        util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges2);
                        throw th;
                    }
                } catch (util.h.xy.da.b e) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.graphics.Color.blue(0) + 127, "\u0091\u0083\u008e\u0086\u0084\u0085\u008f\u009a\u0085\u0096\u0091\u0083\u008e\u0086\u0089\u0099\u008e\u0094\u0089\u0086\u008e\u0091\u008e\u0096\u0085\u008a\u0089\u0082\u0083\u0086\u0097\u0096\u0085\u0082\u0098\u008f\u0085\u0097\u0096\u0095\u0094\u0093", objArr2);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(505, ((java.lang.String) objArr2[0]).intern(), e);
                }
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{0, 23, 117, 14}, objArr3);
            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(context)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2223);
            }
            int i3 = getOutputMinFrameDurationlomOqCM + 45;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                this.getOutputSizes = context;
                throw new java.lang.ArithmeticException();
            }
            this.getOutputSizes = context;
            util.h.xy.da.mc.m26263(this.getOutputSizes);
            util.h.xy.db.a m277202 = util.h.xy.z.ra.m27720();
            getHighSpeedVideoSizes();
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
            highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr2);
            highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr3);
            byte[] highSpeedVideoFpsRanges42 = getHighSpeedVideoFpsRanges(bArr4);
            byte[] highSpeedVideoFpsRanges52 = getHighSpeedVideoFpsRanges(bArr5);
            byte[] highSpeedVideoFpsRanges62 = getHighSpeedVideoFpsRanges(bArr6);
            this.f2258.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m277202).mo26094());
            this.f2256.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges3).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m277202).mo26094());
            this.f2259.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges62).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m277202).mo26094());
            this.f2257.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges42).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m277202).mo26094());
            this.f2260.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges52).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m277202).mo26094());
            util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges2);
            int i22 = getOutputMinFrameDurationlomOqCM + 59;
            getHighSpeedVideoSizesFor = i22 % 128;
            if (i22 % 2 != 0) {
            }
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputMinFrameDuration;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            cArr2 = cArr3;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getInputFormats) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 29) % 128;
            throw null;
        }
        int i4 = getHighSpeedVideoSizes + 53;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            mdVar.f2642 = bytes.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 1;
        } else {
            mdVar.f2642 = bytes.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 0;
        }
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 91) % 128;
            cArr[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, java.lang.Object[] objArr) {
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getOutputStallDuration;
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
        if (i4 > 0) {
            char[] cArr4 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr4, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr4, i4, cArr3, 0, i6);
        }
        char[] cArr5 = new char[i2];
        maVar.f2631 = 0;
        while (maVar.f2631 < i2) {
            cArr5[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr5[maVar.f2631] = (char) (cArr5[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26984() {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 97) % 128;
        try {
            getHighSpeedVideoSizes();
            if (!this.f2258.mo26079()) {
                getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 79) % 128;
                if (!this.f2255.mo26079() && !this.f2256.mo26079() && !this.f2257.mo26079()) {
                    int i = getHighSpeedVideoSizesFor + 111;
                    getOutputMinFrameDurationlomOqCM = i % 128;
                    if (i % 2 != 0) {
                        this.f2260.mo26079();
                        throw new java.lang.NullPointerException();
                    }
                    if (!this.f2260.mo26079() && !this.f2259.mo26079()) {
                        return false;
                    }
                }
            }
            return true;
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26986() {
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 99) % 128;
        try {
            getHighSpeedVideoSizes();
            util.h.xy.ak.d.m24967(this.f2258);
            util.h.xy.ak.d.m24967(this.f2256);
            util.h.xy.ak.d.m24967(this.f2257);
            util.h.xy.ak.d.m24967(this.f2260);
            util.h.xy.ak.d.m24967(this.f2259);
            util.h.xy.ak.d.m24967(this.f2255);
            int i = getOutputMinFrameDurationlomOqCM + 59;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 3;
            }
        } catch (util.h.xy.da.b unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r0.f2641 == r0.f2636) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        if (r0.f2640 != r0.f2635) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        if (r0.f2639 != r0.f2637) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0125, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r0.f2641 == r0.f2636) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes + 107;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputStallDurationlomOqCM);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i5 = getHighSpeedVideoFpsRangesFor + 17;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 42;
                cArr3[i2] = (char) (charArray[i2] >> b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 69) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                int i6 = getHighSpeedVideoSizes + 65;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            cArr3[i7] = (char) (cArr3[i7] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        byte[] bArr3;
        int i;
        int i2 = getOutputMinFrameDurationlomOqCM + 93;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            bArr2 = new byte[]{99, 111, 109, 46, 103, 101, 109, 97, 108, 116, 111, 46, 109, 111, 98, 105, 108, 101, 115, 100, 107};
            int length = bArr.length;
            bArr3 = new byte[21];
            i = 1;
        } else {
            bArr2 = new byte[]{99, 111, 109, 46, 103, 101, 109, 97, 108, 116, 111, 46, 109, 111, 98, 105, 108, 101, 115, 100, 107};
            int length2 = bArr.length;
            bArr3 = new byte[21];
            i = 0;
        }
        while (i < 21) {
            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 17) % 128;
            bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            i++;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u000f\u000b\u000b\r\u0002\r㖬", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 7, objArr);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(((java.lang.String) objArr[0]).intern());
            messageDigest.update(bArr3);
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2226, e);
        }
    }

    private void getHighSpeedVideoSizes() throws util.h.xy.da.b {
        if (this.f2258 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u009c\u009b\u009b", objArr);
            this.f2258 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        if (this.f2255 == null) {
            util.h.xy.da.ma maVar2 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (122 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "㘾㘾㘜", 3 - android.graphics.Color.green(0), objArr2);
            this.f2255 = util.h.xy.da.d.m26260(maVar2, ((java.lang.String) objArr2[0]).intern());
        }
        if (this.f2256 == null) {
            util.h.xy.da.ma maVar3 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.graphics.Color.red(0), "\u009e\u009d\u009b\u009b", objArr3);
            this.f2256 = util.h.xy.da.d.m26260(maVar3, ((java.lang.String) objArr3[0]).intern());
        }
        if (this.f2257 == null) {
            util.h.xy.da.ma maVar4 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), "\u009d\u009d\u009b\u009b", objArr4);
            this.f2257 = util.h.xy.da.d.m26260(maVar4, ((java.lang.String) objArr4[0]).intern());
            getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 57) % 128;
        }
        if (this.f2260 == null) {
            util.h.xy.da.ma maVar5 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u009f\u009d\u009b\u009b", objArr5);
            this.f2260 = util.h.xy.da.d.m26260(maVar5, ((java.lang.String) objArr5[0]).intern());
        }
        if (this.f2259 == null) {
            util.h.xy.da.ma maVar6 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 74), "㘏㘏\u0000\u0003", 4 - android.graphics.Color.red(0), objArr6);
            this.f2259 = util.h.xy.da.d.m26260(maVar6, ((java.lang.String) objArr6[0]).intern());
        }
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 109) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputStallDuration = new char[]{42430, 42375, 42420, 42430, 42425, 42373, 42494, 42372, 42371, 42425, 42426, 42372, 42430, 42379, 42420, 42416, 42375, 42420, 42430, 42425, 42469, 42494, 42420};
    }

    static void Camera2StreamConfigurationMap() {
        getOutputMinFrameDuration = new char[]{64326, 64288, 64295, 64294, 64317, 64290, 64297, 64323, 64305, 64319, 64356, 64338, 64300, 64313, 64307, 64348, 64292, 64325, 64327, 64314, 64306, 64374, 64291, 64301, 64296, 64302, 64311, 64366, 64353, 64358, 64352, 64345, 64324, 64322, 64337, 64339, 64349};
        getHighResolutionOutputSizeshNQ4ISI = -1074857066;
        getInputSizeshNQ4ISI = true;
        getInputFormats = true;
        getOutputFormats = new char[]{41957, 41966, 41960, 41965, 41955, 41953, 41859, 41876, 41952, 41885, 41967, 41871, 41954, 41962, 41961, 41969};
        getOutputStallDurationlomOqCM = (char) 38466;
    }
}
