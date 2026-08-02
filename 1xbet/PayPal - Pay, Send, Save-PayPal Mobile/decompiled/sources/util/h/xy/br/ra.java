package util.h.xy.br;

/* loaded from: classes18.dex */
public class ra {
    private static char Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final byte[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private java.util.concurrent.locks.Lock getOutputMinFrameDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();
    private byte[] getOutputSizes;
    private util.h.xy.ac.c getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private android.content.Context getOutputStallDurationlomOqCM;
    private android.content.SharedPreferences isOutputSupportedForhNQ4ISI;
    private final java.lang.String unwrapAs;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = new byte[]{71, -10, -12, -32, Byte.MIN_VALUE, -3, -12, 75, 16, -3, -44, 113, 106, 120, 77, -76};
        getOutputMinFrameDuration = util.h.xy.br.ra.class.getName();
        int i = getHighSpeedVideoSizesFor + 83;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x0183, LOOP:0: B:16:0x00cb->B:18:0x00cf, LOOP_END, TryCatch #0 {all -> 0x0183, blocks: (B:15:0x007e, B:16:0x00cb, B:18:0x00cf, B:20:0x012e), top: B:14:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(android.content.Context context, java.lang.String str, util.h.xy.ac.c cVar) {
        byte[] bArr;
        util.h.xz.b.rc rcVar;
        int length;
        java.lang.String str2;
        this.getOutputSizeshNQ4ISI = cVar;
        this.getOutputStallDurationlomOqCM = context;
        this.getOutputStallDuration = str;
        java.lang.String m25016 = util.h.xy.al.rb.m25016(str.getBytes());
        this.unwrapAs = m25016;
        android.content.SharedPreferences sharedPreferences = this.getOutputStallDurationlomOqCM.getSharedPreferences(this.getOutputStallDuration, 0);
        this.isOutputSupportedForhNQ4ISI = sharedPreferences;
        getHighSpeedVideoSizesFor = (getOutputFormats + 121) % 128;
        java.lang.String string = sharedPreferences.getString(m25016, null);
        try {
            if (string != null) {
                getOutputFormats = (getHighSpeedVideoSizesFor + 91) % 128;
                if (!string.isEmpty()) {
                    getOutputFormats = (getHighSpeedVideoSizesFor + 11) % 128;
                    bArr = util.h.xy.al.rb.m25017(string);
                    util.h.xy.al.rb.m25016(bArr);
                    getOutputFormats = (getHighSpeedVideoSizesFor + 73) % 128;
                    if (bArr != null || bArr.length == 0) {
                        m25613();
                        bArr = new byte[16];
                        getOutputFormats = (getHighSpeedVideoSizesFor + 59) % 128;
                        char gidForName = (char) (45242 - android.os.Process.getGidForName(""));
                        int indexOf = (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        char[] charArray = "\u0000\u0000\u0000\u0000".toCharArray();
                        char[] charArray2 = "\uf069⣆뮑殰".toCharArray();
                        char[] charArray3 = "豩ꡈꂃﯺ쁼究ﾷ롄\u07b7䟓켽兓氖ᙟ鰵♯艨⸳퀺䕅䈱鍡\uee4d븶䩟컶".toCharArray();
                        rcVar = new util.h.xz.b.rc();
                        int length2 = charArray2.length;
                        char[] cArr = new char[length2];
                        int length3 = charArray.length;
                        char[] cArr2 = new char[length3];
                        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length2);
                        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length3);
                        cArr[0] = (char) (gidForName ^ cArr[0]);
                        int i = 2;
                        cArr2[2] = (char) (cArr2[2] + ((char) indexOf));
                        length = charArray3.length;
                        char[] cArr3 = new char[length];
                        rcVar.f2652 = 0;
                        while (rcVar.f2652 < length) {
                            int i2 = (rcVar.f2652 + i) % 4;
                            int i3 = (rcVar.f2652 + 3) % 4;
                            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
                            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
                            cArr[i3] = rcVar.f2653;
                            cArr3[rcVar.f2652] = (char) ((((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
                            rcVar.f2652++;
                            i = 2;
                        }
                        java.lang.String str3 = new java.lang.String(cArr3);
                        java.lang.String str4 = str3;
                        ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
                        str2 = this.unwrapAs;
                        if (str2 != null) {
                            getOutputFormats = (getHighSpeedVideoSizesFor + 59) % 128;
                            util.h.xy.al.rb.m25016(bArr);
                            android.content.SharedPreferences.Editor edit = this.isOutputSupportedForhNQ4ISI.edit();
                            edit.putString(str2, util.h.xy.al.rb.m25016(bArr));
                            edit.commit();
                            getHighSpeedVideoSizesFor = (getOutputFormats + 91) % 128;
                        }
                        util.h.xy.al.rb.m25016(bArr);
                    } else {
                        util.h.xy.al.rb.m25016(bArr);
                    }
                    this.getOutputSizes = (byte[]) bArr.clone();
                    getOutputFormats = (getHighSpeedVideoSizesFor + 85) % 128;
                    return;
                }
            }
            char gidForName2 = (char) (45242 - android.os.Process.getGidForName(""));
            int indexOf2 = (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            char[] charArray4 = "\u0000\u0000\u0000\u0000".toCharArray();
            char[] charArray22 = "\uf069⣆뮑殰".toCharArray();
            char[] charArray32 = "豩ꡈꂃﯺ쁼究ﾷ롄\u07b7䟓켽兓氖ᙟ鰵♯艨⸳퀺䕅䈱鍡\uee4d븶䩟컶".toCharArray();
            rcVar = new util.h.xz.b.rc();
            int length22 = charArray22.length;
            char[] cArr4 = new char[length22];
            int length32 = charArray4.length;
            char[] cArr22 = new char[length32];
            java.lang.System.arraycopy(charArray22, 0, cArr4, 0, length22);
            java.lang.System.arraycopy(charArray4, 0, cArr22, 0, length32);
            cArr4[0] = (char) (gidForName2 ^ cArr4[0]);
            int i4 = 2;
            cArr22[2] = (char) (cArr22[2] + ((char) indexOf2));
            length = charArray32.length;
            char[] cArr32 = new char[length];
            rcVar.f2652 = 0;
            while (rcVar.f2652 < length) {
            }
            java.lang.String str32 = new java.lang.String(cArr32);
            java.lang.String str42 = str32;
            ((java.security.SecureRandom) java.lang.Class.forName(str32).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
            str2 = this.unwrapAs;
            if (str2 != null) {
            }
            util.h.xy.al.rb.m25016(bArr);
            this.getOutputSizes = (byte[]) bArr.clone();
            getOutputFormats = (getHighSpeedVideoSizesFor + 85) % 128;
            return;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        bArr = null;
        if (bArr != null) {
        }
        m25613();
        bArr = new byte[16];
        getOutputFormats = (getHighSpeedVideoSizesFor + 59) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[RETURN] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m25612(byte[] bArr) throws util.h.xy.ac.mc {
        byte[] bArr2;
        int i = getOutputFormats;
        getHighSpeedVideoSizesFor = (i + 59) % 128;
        if (bArr != null) {
            getHighSpeedVideoSizesFor = (i + 121) % 128;
            util.h.xy.al.rb.m25016(bArr);
            java.lang.String string = this.isOutputSupportedForhNQ4ISI.getString(util.h.xy.al.rb.m25016(bArr), null);
            if (string != null) {
                getHighSpeedVideoSizesFor = (getOutputFormats + 111) % 128;
                if (!string.isEmpty()) {
                    bArr2 = util.h.xy.al.rb.m25017(string);
                    util.h.xy.al.rb.m25016(bArr2);
                    int i2 = getOutputFormats;
                    getHighSpeedVideoSizesFor = (i2 + 11) % 128;
                    if (bArr2 != null) {
                        return null;
                    }
                    int i3 = i2 + 37;
                    getHighSpeedVideoSizesFor = i3 % 128;
                    try {
                        if (i3 % 2 != 0) {
                            byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr2);
                            util.h.xy.ar.b.m25098(highSpeedVideoFpsRangesFor);
                            int length = highSpeedVideoFpsRangesFor.length;
                            return highSpeedVideoFpsRangesFor;
                        }
                        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr2);
                        util.h.xy.ar.b.m25098(highSpeedVideoFpsRangesFor2);
                        int length2 = highSpeedVideoFpsRangesFor2.length;
                        throw new java.lang.ArithmeticException();
                    } catch (util.h.xy.ac.b e) {
                        throw new util.h.xy.ac.mc(e.getMessage());
                    }
                }
            }
        }
        bArr2 = null;
        int i22 = getOutputFormats;
        getHighSpeedVideoSizesFor = (i22 + 11) % 128;
        if (bArr2 != null) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25611(byte[] bArr, byte[] bArr2) throws util.h.xy.ac.mc {
        int i = getOutputFormats;
        int i2 = i + 11;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr == null || bArr2 == null) {
            return;
        }
        getHighSpeedVideoSizesFor = (i + 119) % 128;
        try {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2);
            if (Camera2StreamConfigurationMap2 != null) {
                util.h.xy.al.rb.m25016(bArr);
                util.h.xy.al.rb.m25016(Camera2StreamConfigurationMap2);
                getHighSpeedVideoSizesFor = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                try {
                    this.getOutputMinFrameDurationlomOqCM.lock();
                    android.content.SharedPreferences.Editor edit = this.isOutputSupportedForhNQ4ISI.edit();
                    util.h.xy.al.rb.m25016(bArr);
                    util.h.xy.al.rb.m25016(Camera2StreamConfigurationMap2);
                    edit.putString(util.h.xy.al.rb.m25016(bArr), util.h.xy.al.rb.m25016(Camera2StreamConfigurationMap2));
                    edit.commit();
                    this.getOutputMinFrameDurationlomOqCM.unlock();
                    getOutputFormats = (getHighSpeedVideoSizesFor + 13) % 128;
                } catch (java.lang.Throwable th) {
                    this.getOutputMinFrameDurationlomOqCM.unlock();
                    throw th;
                }
            }
            int length = bArr2.length;
            getOutputFormats = (getHighSpeedVideoSizesFor + 51) % 128;
        } catch (util.h.xy.ac.b e) {
            throw new util.h.xy.ac.mc(e.getMessage());
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25613() {
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            android.content.SharedPreferences.Editor edit = this.isOutputSupportedForhNQ4ISI.edit();
            java.util.Iterator<java.lang.String> it = this.isOutputSupportedForhNQ4ISI.getAll().keySet().iterator();
            getOutputFormats = (getHighSpeedVideoSizesFor + 109) % 128;
            while (it.hasNext()) {
                getOutputFormats = (getHighSpeedVideoSizesFor + 25) % 128;
                edit.remove(it.next());
                edit.commit();
            }
            this.getOutputMinFrameDurationlomOqCM.unlock();
            getHighSpeedVideoSizesFor = (getOutputFormats + 15) % 128;
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.ac.b {
        byte[] bArr2;
        util.h.xy.ac.rb rbVar;
        java.lang.Throwable th;
        util.h.xy.al.rb.m25016(bArr);
        byte[] bArr3 = null;
        try {
            byte[] m24540 = this.getOutputSizeshNQ4ISI.m24540();
            try {
                util.h.xy.ar.b.m25098(m24540);
                bArr2 = getHighSpeedVideoFpsRanges();
                try {
                    util.h.xy.al.rb.m25016(bArr2);
                    util.h.xy.al.rb.m25016(this.getOutputSizes);
                    rbVar = new util.h.xy.ac.rb(256, m24540, this.getOutputSizes, bArr2);
                    try {
                        util.h.xy.ac.ma maVar = new util.h.xy.ac.ma();
                        maVar.m24543(rbVar);
                        byte[] m24545 = maVar.m24545(bArr);
                        util.h.xy.ar.b.m25098(bArr);
                        util.h.xy.al.rb.m25016(bArr);
                        getHighResolutionOutputSizeshNQ4ISI(m24540);
                        getHighResolutionOutputSizeshNQ4ISI(bArr2);
                        int i = getHighSpeedVideoSizesFor + 87;
                        getOutputFormats = i % 128;
                        if (i % 2 == 0) {
                            rbVar.mo24542();
                            getOutputFormats = (getHighSpeedVideoSizesFor + 101) % 128;
                            util.h.xy.al.rb.m25016(bArr);
                            getOutputFormats = (getHighSpeedVideoSizesFor + 9) % 128;
                            return m24545;
                        }
                        rbVar.mo24542();
                        throw new java.lang.ArithmeticException();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        th = th;
                        bArr3 = m24540;
                        util.h.xy.al.rb.m25016(bArr);
                        getHighResolutionOutputSizeshNQ4ISI(bArr3);
                        getHighResolutionOutputSizeshNQ4ISI(bArr2);
                        if (rbVar != null) {
                            rbVar.mo24542();
                        }
                        util.h.xy.al.rb.m25016(bArr);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    rbVar = null;
                    th = th3;
                }
            } catch (java.lang.Throwable th4) {
                rbVar = null;
                th = th4;
                bArr2 = null;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr2 = null;
            rbVar = null;
        }
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.ac.b {
        byte[] bArr2;
        util.h.xy.ac.rb rbVar;
        byte[] bArr3 = null;
        if (bArr != null) {
            int i = getOutputFormats + 81;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                util.h.xy.al.rb.m25016(bArr);
            } else {
                util.h.xy.al.rb.m25016(bArr);
                throw null;
            }
        }
        try {
            byte[] m24540 = this.getOutputSizeshNQ4ISI.m24540();
            try {
                util.h.xy.ar.b.m25098(m24540);
                bArr2 = getHighSpeedVideoFpsRanges();
                try {
                    util.h.xy.al.rb.m25016(bArr2);
                    util.h.xy.al.rb.m25016(this.getOutputSizes);
                    rbVar = new util.h.xy.ac.rb(256, m24540, this.getOutputSizes, bArr2);
                    try {
                        util.h.xy.ac.ma maVar = new util.h.xy.ac.ma();
                        maVar.m24543(rbVar);
                        byte[] m24544 = maVar.m24544(bArr);
                        getHighResolutionOutputSizeshNQ4ISI(m24540);
                        getHighResolutionOutputSizeshNQ4ISI(bArr2);
                        rbVar.mo24542();
                        getOutputFormats = (getHighSpeedVideoSizesFor + 69) % 128;
                        return m24544;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr3 = m24540;
                        getHighResolutionOutputSizeshNQ4ISI(bArr3);
                        getHighResolutionOutputSizeshNQ4ISI(bArr2);
                        if (rbVar != null) {
                            rbVar.mo24542();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    rbVar = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr2 = null;
                rbVar = null;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr2 = null;
            rbVar = null;
        }
    }

    private byte[] getHighSpeedVideoFpsRanges() {
        byte[] bArr;
        byte[] bArr2;
        int i;
        byte[] bArr3;
        getOutputFormats = (getHighSpeedVideoSizesFor + 81) % 128;
        byte[] bArr4 = {0};
        try {
            int[] iArr = {0, 64, 0, 0};
            byte[] bytes = "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000".getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = getHighSpeedVideoFpsRangesFor;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                    i6++;
                    i4 = i4;
                }
                i = i4;
                cArr = cArr2;
            } else {
                i = i4;
            }
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bytes != null) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 113) % 128;
                char[] cArr4 = new char[i3];
                maVar.f2631 = 0;
                char c = 0;
                while (maVar.f2631 < i3) {
                    if (bytes[maVar.f2631] == 1) {
                        int i7 = getHighSpeedVideoFpsRanges + 21;
                        getHighSpeedVideoSizes = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] + 4) << c);
                        } else {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        }
                    } else {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 31) % 128;
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i8 = i3 - i5;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i8);
            }
            if (i > 0) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 121) % 128;
                maVar.f2631 = 0;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 51) % 128;
                while (maVar.f2631 < i3) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    maVar.f2631++;
                }
            }
            java.lang.String str = new java.lang.String(cArr3);
            java.lang.String str2 = str;
            bArr2 = util.h.xy.al.rb.m25017(str.intern());
            try {
                int i9 = getOutputFormats;
                getHighSpeedVideoSizesFor = (i9 + 59) % 128;
                byte[] bArr5 = {0, 1, 0, 0};
                int i10 = i9 + 99;
                getHighSpeedVideoSizesFor = i10 % 128;
                if (i10 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                try {
                    byte[] bArr6 = getInputFormats;
                    byte[] bArr7 = new byte[bArr6.length + bArr2.length + 5];
                    java.lang.System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                    int length2 = bArr6.length;
                    java.lang.System.arraycopy(bArr4, 0, bArr7, length2, 1);
                    int i11 = length2 + 1;
                    java.lang.System.arraycopy(bArr2, 0, bArr7, i11, bArr2.length);
                    java.lang.System.arraycopy(bArr5, 0, bArr7, i11 + bArr2.length, 4);
                    Camera2StreamConfigurationMap(bArr2, bArr5, bArr4);
                    getOutputFormats = (getHighSpeedVideoSizesFor + 53) % 128;
                    return bArr7;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr3 = bArr5;
                    bArr = bArr3;
                    Camera2StreamConfigurationMap(bArr2, bArr, bArr4);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr3 = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
            bArr2 = null;
        }
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int i = getOutputFormats + 17;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        if (i % 2 != 0) {
            if (bArr != null && bArr.length > 0) {
                getOutputFormats = (i2 + 69) % 128;
                java.util.Arrays.fill(bArr, bArr[0]);
            }
            int i3 = getOutputFormats + 109;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(byte[]... bArr) {
        int i;
        int i2 = getHighSpeedVideoSizesFor;
        int i3 = i2 + 65;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            int length = bArr.length;
            i = 1;
        } else {
            int length2 = bArr.length;
            i = 0;
        }
        getOutputFormats = (i2 + 9) % 128;
        while (i < 3) {
            getOutputFormats = (getHighSpeedVideoSizesFor + 45) % 128;
            getHighResolutionOutputSizeshNQ4ISI(bArr[i]);
            i++;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighResolutionOutputSizeshNQ4ISI = 2457411417541981002L;
        getInputSizeshNQ4ISI = 294925130;
        Camera2StreamConfigurationMap = (char) 51217;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRangesFor = new char[]{42310, 42257, 42256, 42341, 42346, 42347, 42262, 42303, 42302, 42263, 42263, 42263, 42351, 42350, 42263, 42257, 42257, 42260, 42350, 42345, 42256, 42262, 42263, 42256, 42258, 42256, 42347, 42344, 42345, 42344, 42256, 42297, 42296, 42256, 42262, 42303, 42263, 42351, 42257, 42259, 42346, 42262, 42257, 42346, 42344, 42344, 42257, 42262, 42346, 42344, 42262, 42303, 42261, 42350, 42350, 42350, 42345, 42345, 42345, 42262, 42259, 42347, 42263, 42260, 42252, 42493, 42433, 42277, 42282, 42438, 42492, 42432, 42434, 42486, 42463, 42277, 42437, 42493, 42493, 42283, 42274, 42489, 42490, 42488, 42448, 42444, 42485, 42492};
    }
}
