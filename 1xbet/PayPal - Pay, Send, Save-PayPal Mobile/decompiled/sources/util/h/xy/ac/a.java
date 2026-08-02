package util.h.xy.ac;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static byte[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;
    private byte[] getOutputFormats;
    private java.util.concurrent.locks.Lock getOutputMinFrameDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();
    private final java.lang.String getOutputSizes;
    private util.h.xy.ac.c getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private android.content.SharedPreferences getOutputStallDurationlomOqCM;
    private android.content.Context isOutputSupportedForhNQ4ISI;

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 86, 68, -32, Byte.MIN_VALUE, 6, -12, 74, 8, -3, -46, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 106, 115, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -76};
        getOutputMinFrameDuration = util.h.xy.ac.a.class.getName();
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 45) % 128;
    }

    public a(android.content.Context context, java.lang.String str, util.h.xy.ac.c cVar) {
        byte[] bArr;
        byte[] bArr2;
        this.getOutputSizeshNQ4ISI = cVar;
        this.isOutputSupportedForhNQ4ISI = context;
        this.getOutputStallDuration = str;
        java.lang.String m25016 = util.h.xy.al.rb.m25016(str.getBytes());
        this.getOutputSizes = m25016;
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 45) % 128;
        android.content.SharedPreferences sharedPreferences = this.isOutputSupportedForhNQ4ISI.getSharedPreferences(this.getOutputStallDuration, 0);
        this.getOutputStallDurationlomOqCM = sharedPreferences;
        int i = getHighSpeedVideoFpsRangesFor + 71;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            sharedPreferences.getString(m25016, null);
            throw new java.lang.ArithmeticException();
        }
        java.lang.String string = sharedPreferences.getString(m25016, null);
        if (string == null || string.isEmpty()) {
            bArr = null;
        } else {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getInputFormats = ((i2 & 91) + (i2 | 91)) % 128;
            bArr = util.h.xy.al.rb.m25017(string);
            util.h.xy.al.rb.m25016(bArr);
        }
        int i3 = (getInputFormats + 91) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        try {
            if (bArr != null) {
                getInputFormats = ((i3 ^ 23) + ((i3 & 23) << 1)) % 128;
                if (bArr.length != 0) {
                    util.h.xy.al.rb.m25016(bArr);
                    this.getOutputFormats = (byte[]) bArr.clone();
                    return;
                }
            }
            int i4 = -android.view.KeyEvent.getDeadChar(0, 0);
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i5 = i4 * (-958);
            int i6 = ~identityHashCode;
            int i7 = ~((i6 ^ 804138663) | (i6 & 804138663));
            int i8 = ~i4;
            int i9 = ~((i8 ^ identityHashCode) | (i8 & identityHashCode));
            int i10 = (i7 ^ i9) | (i7 & i9);
            int i11 = ~((i6 ^ i4) | (i6 & i4));
            int i12 = ((((i5 | 1565694128) << 1) - (i5 ^ 1565694128)) - (~(((i10 & i11) | (i10 ^ i11)) * 959))) - 1;
            int i13 = (~(((-804138664) ^ i4) | (i4 & (-804138664)))) * (-959);
            int i14 = (i12 & i13) + (i12 | i13);
            int i15 = ~(i6 | i8);
            int i16 = ~(identityHashCode | 804138663);
            int i17 = (i15 ^ i16) | (i15 & i16);
            int i18 = ~(i4 | identityHashCode);
            int i19 = -(-(((i18 ^ i17) | (i18 & i17)) * 959));
            short windowTouchSlop = (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            byte touchSlop = (byte) (android.view.ViewConfiguration.getTouchSlop() >> 8);
            int i20 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i21 = i20 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
            int i22 = (i21 ^ 13797) + ((i21 & 13797) << 1);
            int i23 = ~i20;
            int i24 = ~((i23 ^ 62) | (i23 & 62));
            int i25 = ~identityHashCode2;
            int i26 = (i25 ^ i20) | (i25 & i20);
            int i27 = ~((i26 & (-63)) | (i26 ^ (-63)));
            int i28 = ((i24 & i27) | (i24 ^ i27)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i29 = ~((i25 & (-63)) | (i25 ^ (-63)));
            int i30 = (((i22 & i28) + (i28 | i22)) - (~(((i29 & i20) | (i20 ^ i29)) * (-440)))) - 1;
            int i31 = -(-(((i20 ^ (-63)) | (i20 & (-63)) | identityHashCode2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((i19 | i14) + (i14 & i19), windowTouchSlop, touchSlop, (i30 & i31) + (i31 | i30), (-2060736202) - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
            int i32 = getInputFormats;
            int i33 = i32 + 95;
            getHighSpeedVideoFpsRangesFor = i33 % 128;
            if (i33 % 2 != 0) {
                throw null;
            }
            if (m25016 != null) {
                int i34 = (i32 & 65) + (i32 | 65);
                getHighSpeedVideoFpsRangesFor = i34 % 128;
                if (i34 % 2 != 0) {
                    throw null;
                }
                util.h.xy.al.rb.m25016(bArr2);
                android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
                edit.putString(m25016, util.h.xy.al.rb.m25016(bArr2));
                edit.commit();
                int i35 = getInputFormats;
                getHighSpeedVideoFpsRangesFor = ((i35 ^ 93) + ((i35 & 93) << 1)) % 128;
            }
            int i36 = getInputFormats;
            getHighSpeedVideoFpsRangesFor = ((i36 & 93) + (i36 | 93)) % 128;
            util.h.xy.al.rb.m25016(bArr2);
            bArr = bArr2;
            this.getOutputFormats = (byte[]) bArr.clone();
            return;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        m24536();
        bArr2 = new byte[16];
        int i37 = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        getInputFormats = i37;
        getHighSpeedVideoFpsRangesFor = ((i37 & 33) + (i37 | 33)) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m24538(byte[] bArr) throws util.h.xy.ac.mc {
        byte[] bArr2;
        int i = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        getInputFormats = i;
        int i2 = i + 85;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        byte[] bArr3 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr != null) {
            util.h.xy.al.rb.m25016(bArr);
            java.lang.String string = this.getOutputStallDurationlomOqCM.getString(util.h.xy.al.rb.m25016(bArr), null);
            if (string != null) {
                int i3 = getInputFormats;
                getHighSpeedVideoFpsRangesFor = ((i3 ^ 7) + ((i3 & 7) << 1)) % 128;
                if (!string.isEmpty()) {
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i4 = -(-(((identityHashCode ^ 171971670) | (identityHashCode & 171971670)) * 988));
                    int i5 = (i4 ^ (-479103890)) + ((i4 & (-479103890)) << 1);
                    int i6 = ~identityHashCode;
                    int i7 = ~(((-1955783082) ^ i6) | (i6 & (-1955783082)));
                    int i8 = ((i7 ^ 1074815240) | (i7 & 1074815240)) * (-1976);
                    int i9 = (i5 & i8) + (i8 | i5);
                    int i10 = ~((identityHashCode ^ 1052939511) | (identityHashCode & 1052939511));
                    int i11 = (i10 ^ 171971670) | (i10 & 171971670);
                    int i12 = ~(((-1052939512) ^ i6) | (i6 & (-1052939512)));
                    int i13 = -(-(((i11 ^ i12) | (i12 & i11)) * 988));
                    int identityHashCode2 = java.lang.System.identityHashCode(this);
                    int i14 = ~identityHashCode2;
                    int i15 = (-1032905641) - (~(-(-((((~((i14 ^ 1165226488) | (i14 & 1165226488))) | 789510) | (~((i14 & (-1143963087)) | (i14 ^ (-1143963087))))) * 464))));
                    int i16 = -(-((1166015998 | identityHashCode2) * (-464)));
                    int i17 = (i15 & i16) + (i16 | i15);
                    int i18 = ~((identityHashCode2 ^ (-1143963087)) | (identityHashCode2 & (-1143963087)));
                    int i19 = ((i18 ^ 789510) | (i18 & 789510)) * 464;
                    int i20 = (i9 ^ i13) + ((i13 & i9) << 1);
                    int i21 = (i17 ^ i19) + ((i19 & i17) << 1);
                    bArr2 = util.h.xy.al.rb.m25017(string);
                    if (i20 > i21) {
                        util.h.xy.al.rb.m25016(bArr2);
                        throw null;
                    }
                    util.h.xy.al.rb.m25016(bArr2);
                    int i22 = (getInputFormats + 5) % 128;
                    getHighSpeedVideoFpsRangesFor = i22;
                    if (bArr2 != null) {
                        int i23 = i22 + 113;
                        getInputFormats = i23 % 128;
                        try {
                            if (i23 % 2 == 0) {
                                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2);
                                util.h.xy.ar.b.m25098(Camera2StreamConfigurationMap2);
                                int length = Camera2StreamConfigurationMap2.length;
                                throw null;
                            }
                            bArr3 = Camera2StreamConfigurationMap(bArr2);
                            util.h.xy.ar.b.m25098(bArr3);
                            int length2 = bArr3.length;
                        } catch (util.h.xy.ac.b e) {
                            throw new util.h.xy.ac.mc(e.getMessage());
                        }
                    }
                    getHighSpeedVideoFpsRangesFor = (getInputFormats + 37) % 128;
                    return bArr3;
                }
            }
        }
        bArr2 = null;
        int i222 = (getInputFormats + 5) % 128;
        getHighSpeedVideoFpsRangesFor = i222;
        if (bArr2 != null) {
        }
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 37) % 128;
        return bArr3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m24537(byte[] bArr, byte[] bArr2) throws util.h.xy.ac.mc {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr != null && bArr2 != null) {
            int i3 = (i & 79) + (i | 79);
            getInputFormats = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2);
                    if (highSpeedVideoSizes != null) {
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        int i5 = ((i4 | 41) << 1) - (i4 ^ 41);
                        getInputFormats = i5 % 128;
                        if (i5 % 2 != 0) {
                            util.h.xy.al.rb.m25016(bArr);
                            util.h.xy.al.rb.m25016(highSpeedVideoSizes);
                            getHighSpeedVideoFpsRanges(bArr, highSpeedVideoSizes);
                        } else {
                            util.h.xy.al.rb.m25016(bArr);
                            util.h.xy.al.rb.m25016(highSpeedVideoSizes);
                            getHighSpeedVideoFpsRanges(bArr, highSpeedVideoSizes);
                            throw null;
                        }
                    }
                    int length = bArr2.length;
                } else {
                    getHighSpeedVideoSizes(bArr2);
                    throw null;
                }
            } catch (util.h.xy.ac.b e) {
                throw new util.h.xy.ac.mc(e.getMessage());
            }
        }
        int i6 = getInputFormats;
        int i7 = (i6 & 5) + (i6 | 5);
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m24539(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 1) % 128;
        if (bArr == null) {
            return;
        }
        util.h.xy.al.rb.m25016(bArr);
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
            edit.remove(util.h.xy.al.rb.m25016(bArr));
            edit.commit();
            this.getOutputStallDurationlomOqCM.getString(util.h.xy.al.rb.m25016(bArr), null);
            this.getOutputMinFrameDurationlomOqCM.unlock();
            getInputFormats = (getHighSpeedVideoFpsRangesFor + 77) % 128;
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m24536() {
        int i = getInputFormats;
        int i2 = (i & 71) + (i | 71);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.getOutputMinFrameDurationlomOqCM.lock();
                this.getOutputStallDurationlomOqCM.edit();
                this.getOutputStallDurationlomOqCM.getAll().keySet().iterator();
                throw new java.lang.ArithmeticException();
            }
            this.getOutputMinFrameDurationlomOqCM.lock();
            android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
            java.util.Iterator<java.lang.String> it = this.getOutputStallDurationlomOqCM.getAll().keySet().iterator();
            while (it.hasNext()) {
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 99) % 128;
                edit.remove(it.next());
                edit.commit();
                int i3 = getHighSpeedVideoFpsRangesFor + 17;
                getInputFormats = i3 % 128;
                int i4 = i3 % 2;
            }
            this.getOutputMinFrameDurationlomOqCM.unlock();
            int i5 = getInputFormats;
            int i6 = (i5 & 1) + (i5 | 1);
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getHighSpeedVideoSizes;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getHighSpeedVideoSizes[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoSizes;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getHighSpeedVideoSizes;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoFpsRanges;
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

    private byte[] getHighSpeedVideoSizes(byte[] bArr) throws util.h.xy.ac.b {
        byte[] bArr2;
        util.h.xy.ac.rb rbVar;
        java.lang.Throwable th;
        util.h.xy.al.rb.m25016(bArr);
        byte[] bArr3 = null;
        try {
            byte[] m24540 = this.getOutputSizeshNQ4ISI.m24540();
            try {
                util.h.xy.ar.b.m25098(m24540);
                bArr2 = getHighSpeedVideoSizes();
                try {
                    util.h.xy.al.rb.m25016(bArr2);
                    util.h.xy.al.rb.m25016(this.getOutputFormats);
                    rbVar = new util.h.xy.ac.rb(256, m24540, this.getOutputFormats, bArr2);
                    try {
                        util.h.xy.ac.ma maVar = new util.h.xy.ac.ma();
                        maVar.m24543(rbVar);
                        byte[] m24545 = maVar.m24545(bArr);
                        util.h.xy.ar.b.m25098(bArr);
                        util.h.xy.al.rb.m25016(bArr);
                        getHighSpeedVideoFpsRangesFor(m24540);
                        getHighSpeedVideoFpsRangesFor(bArr2);
                        int i = getHighSpeedVideoFpsRangesFor + 11;
                        getInputFormats = i % 128;
                        if (i % 2 != 0) {
                            rbVar.mo24542();
                            util.h.xy.al.rb.m25016(bArr);
                            int i2 = getHighSpeedVideoFpsRangesFor;
                            int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
                            getInputFormats = i3 % 128;
                            if (i3 % 2 != 0) {
                                return m24545;
                            }
                            throw null;
                        }
                        rbVar.mo24542();
                        throw null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        th = th;
                        bArr3 = m24540;
                        util.h.xy.al.rb.m25016(bArr);
                        getHighSpeedVideoFpsRangesFor(bArr3);
                        getHighSpeedVideoFpsRangesFor(bArr2);
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

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.ac.b {
        byte[] bArr2;
        util.h.xy.ac.rb rbVar;
        byte[] m24540;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 7) + (i | 7)) % 128;
        getInputFormats = i2;
        if (bArr != null) {
            int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                util.h.xy.al.rb.m25016(bArr);
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.al.rb.m25016(bArr);
            int i4 = getHighSpeedVideoFpsRangesFor;
            getInputFormats = (((i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        }
        byte[] bArr3 = null;
        try {
            m24540 = this.getOutputSizeshNQ4ISI.m24540();
            try {
                util.h.xy.ar.b.m25098(m24540);
                bArr2 = getHighSpeedVideoSizes();
                try {
                    util.h.xy.al.rb.m25016(bArr2);
                    util.h.xy.al.rb.m25016(this.getOutputFormats);
                    rbVar = new util.h.xy.ac.rb(256, m24540, this.getOutputFormats, bArr2);
                } catch (java.lang.Throwable th) {
                    th = th;
                    rbVar = null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr2 = null;
                rbVar = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr2 = null;
            rbVar = null;
        }
        try {
            util.h.xy.ac.ma maVar = new util.h.xy.ac.ma();
            maVar.m24543(rbVar);
            byte[] m24544 = maVar.m24544(bArr);
            getHighSpeedVideoFpsRangesFor(m24540);
            getHighSpeedVideoFpsRangesFor(bArr2);
            getInputFormats = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            rbVar.mo24542();
            int i5 = getHighSpeedVideoFpsRangesFor;
            getInputFormats = ((i5 & 55) + (i5 | 55)) % 128;
            return m24544;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr3 = m24540;
            getHighSpeedVideoFpsRangesFor(bArr3);
            getHighSpeedVideoFpsRangesFor(bArr2);
            if (rbVar != null) {
                rbVar.mo24542();
            }
            throw th;
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        getInputFormats = (((i | 25) << 1) - (i ^ 25)) % 128;
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            android.content.SharedPreferences.Editor edit = this.getOutputStallDurationlomOqCM.edit();
            util.h.xy.al.rb.m25016(bArr);
            util.h.xy.al.rb.m25016(bArr2);
            edit.putString(util.h.xy.al.rb.m25016(bArr), util.h.xy.al.rb.m25016(bArr2));
            edit.commit();
            this.getOutputMinFrameDurationlomOqCM.unlock();
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 103) % 128;
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    private byte[] getHighSpeedVideoSizes() {
        byte[] bArr;
        int i = getHighSpeedVideoFpsRangesFor;
        getInputFormats = (((i | 27) << 1) - (i ^ 27)) % 128;
        byte[] bArr2 = {0};
        byte[] bArr3 = null;
        try {
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.al.ra.f369);
            try {
                int i2 = (getInputFormats + 87) % 128;
                getHighSpeedVideoFpsRangesFor = i2;
                int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
                getInputFormats = i3 % 128;
                int i4 = i3 % 2;
                byte[] bArr4 = {0, 1, 0, 0};
                int i5 = ((i2 | 53) << 1) - (i2 ^ 53);
                getInputFormats = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                try {
                    byte[] bArr5 = getInputSizeshNQ4ISI;
                    int length = bArr5.length;
                    int i6 = -(-m25017.length);
                    int i7 = (length & i6) + (length | i6) + 4;
                    byte[] bArr6 = new byte[(i7 ^ 1) + ((i7 & 1) << 1)];
                    java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                    int i8 = (-1) - (~(-(-bArr5.length)));
                    java.lang.System.arraycopy(bArr2, 0, bArr6, i8, 1);
                    int i9 = (i8 ^ 1) + ((i8 & 1) << 1);
                    java.lang.System.arraycopy(m25017, 0, bArr6, i9, m25017.length);
                    int i10 = -(-m25017.length);
                    java.lang.System.arraycopy(bArr4, 0, bArr6, (i9 ^ i10) + ((i10 & i9) << 1), 4);
                    Camera2StreamConfigurationMap(m25017, bArr4, bArr2);
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i11 = ~(((-601814083) ^ identityHashCode) | (identityHashCode & (-601814083)));
                    int i12 = -(-(((i11 ^ 583435266) | (i11 & 583435266)) * 104));
                    int i13 = (i12 ^ 594103836) + ((i12 & 594103836) << 1);
                    int i14 = ~identityHashCode;
                    int i15 = (i14 ^ 851872826) | (i14 & 851872826);
                    int i16 = -(-((~((i15 ^ 601814082) | (i15 & 601814082))) * (-104)));
                    int identityHashCode2 = java.lang.System.identityHashCode(this);
                    int i17 = ~((2054069978 ^ identityHashCode2) | (identityHashCode2 & 2054069978));
                    int i18 = -(-(((83960097 ^ i17) | (i17 & 83960097)) * (-814)));
                    int i19 = (~((-895593788) | (~identityHashCode2))) | 1242436288;
                    int i20 = 1242436288 | (~(((-2054069979) ^ identityHashCode2) | (identityHashCode2 & (-2054069979))));
                    int i21 = ~(identityHashCode2 | 895593787);
                    if (((((i13 | i16) << 1) - (i16 ^ i13)) - (~((identityHashCode | 851872826) * 104))) - 1 > (((1113430965 - (~i18)) + (((i17 & i19) | (i19 ^ i17)) * 407)) - (~(-(-(((i21 & i20) | (i20 ^ i21)) * 407))))) - 1) {
                        return bArr6;
                    }
                    throw null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr3 = bArr4;
                    bArr = bArr3;
                    bArr3 = m25017;
                    Camera2StreamConfigurationMap(bArr3, bArr, bArr2);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i = getInputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 115) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor = (((i | 41) << 1) - (i ^ 41)) % 128;
            if (bArr.length > 0) {
                int i2 = ((i | 85) << 1) - (i ^ 85);
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                java.util.Arrays.fill(bArr, i2 % 2 != 0 ? bArr[1] : bArr[0]);
            }
        }
        int i3 = getInputFormats;
        int i4 = ((i3 | 107) << 1) - (i3 ^ 107);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void Camera2StreamConfigurationMap(byte[]... bArr) {
        int i;
        int i2 = getInputFormats + 97;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            int length = bArr.length;
            i = 1;
        } else {
            int length2 = bArr.length;
            i = 0;
        }
        while (i < 3) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 | 103) << 1) - (i3 ^ 103);
            getInputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                getHighSpeedVideoFpsRangesFor(bArr[i]);
                i += com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            } else {
                getHighSpeedVideoFpsRangesFor(bArr[i]);
                i++;
            }
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 119) % 128;
        }
        int i5 = getHighSpeedVideoFpsRangesFor + 75;
        getInputFormats = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = -934332048;
        Camera2StreamConfigurationMap = -408873087;
        getHighResolutionOutputSizeshNQ4ISI = -1653260053;
        getHighSpeedVideoSizes = new byte[]{38, -45, 46, -43, -41, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 43, 37, -54, 38, -54, -3, 109, -35, -45, 47, 37, -54, 38, 42, -99, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, 47, -40};
    }
}
