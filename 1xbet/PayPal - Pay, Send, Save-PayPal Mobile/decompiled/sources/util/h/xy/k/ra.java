package util.h.xy.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static final byte[] Camera2StreamConfigurationMap = null;
    private static final int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char getOutputFormats;
    private static long getOutputMinFrameDuration;
    private static final /* synthetic */ util.h.xy.k.ra[] getOutputMinFrameDurationlomOqCM;
    private static final java.lang.String getOutputSizes;
    private static byte[] getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static long getOutputStallDurationlomOqCM;
    private static int isOutputSupportedFor;
    private static char[] unwrapAs;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.k.ra f2243;
    private util.h.xy.d.d toString = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0043 -> B:7:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(java.lang.Object[] objArr) {
        byte[] bArr;
        char[] cArr;
        int i;
        int i2;
        byte b;
        byte b2;
        byte b3;
        int i3;
        byte b4;
        int i4 = getInputFormats;
        int i5 = i4 + 33;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            bArr = Camera2StreamConfigurationMap;
            cArr = new char[0];
            i = 88;
            b2 = com.google.common.base.Ascii.SYN;
            i2 = 4;
            if (bArr == null) {
                b3 = 1;
                getInputSizeshNQ4ISI = (i4 + 41) % 128;
                b = b3;
                i3 = i2;
                b4 = b2;
            } else {
                b = 1;
                cArr[b] = (char) i2;
                ?? r8 = b + 1;
                if (b == b2) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i++;
                byte b5 = b2;
                b2 = bArr[i];
                b = r8;
                i3 = i2;
                b4 = b5;
            }
        } else {
            bArr = Camera2StreamConfigurationMap;
            cArr = new char[1];
            i = 3;
            i2 = 715;
            if (bArr == null) {
                b2 = 0;
                b3 = 0;
                getInputSizeshNQ4ISI = (i4 + 41) % 128;
                b = b3;
                i3 = i2;
                b4 = b2;
            } else {
                b = 0;
                b2 = 0;
                cArr[b] = (char) i2;
                ?? r82 = b + 1;
                if (b == b2) {
                }
            }
        }
        byte b6 = b4;
        i2 = (-b2) + i3;
        b2 = b6;
        cArr[b] = (char) i2;
        ?? r822 = b + 1;
        if (b == b2) {
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputMinFrameDuration ^ (-7508379876853140581L));
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

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 107) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputStallDurationlomOqCM ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        while (true) {
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                int i2 = getHighSpeedVideoSizes + 33;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    break;
                }
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                dVar.f2629++;
            }
            objArr[0] = new java.lang.String(cArr);
            return;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            int i3 = dVar.f2629;
        }
    }

    private ra(java.lang.String str) {
    }

    public static util.h.xy.k.ra valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 99;
        getInputFormats = i % 128;
        util.h.xy.k.ra raVar = (util.h.xy.k.ra) java.lang.Enum.valueOf(util.h.xy.k.ra.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getInputFormats + 27;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    public static util.h.xy.k.ra[] values() {
        getInputFormats = (getInputSizeshNQ4ISI + 119) % 128;
        util.h.xy.k.ra[] raVarArr = (util.h.xy.k.ra[]) getOutputMinFrameDurationlomOqCM.clone();
        int i = getInputFormats + 7;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return raVarArr;
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 84), "\u001e\u000b\u0010#\u0018\n\u0014\u001c", 9 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
            util.h.xy.k.ra raVar = new util.h.xy.k.ra(((java.lang.String) objArr[0]).intern());
            f2243 = raVar;
            int i = getInputSizeshNQ4ISI;
            getInputFormats = (i + 91) % 128;
            getInputFormats = (i + 15) % 128;
            getOutputMinFrameDurationlomOqCM = new util.h.xy.k.ra[]{raVar};
            getOutputSizes = util.h.xy.k.ra.class.getName();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26971(java.lang.String str, java.lang.String str2, byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 105;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            int i3 = i + 99;
            int i4 = i3 % 128;
            getInputFormats = i4;
            if (i3 % 2 == 0) {
                if (bArr.length == 0 || str == null) {
                    return;
                }
                getInputSizeshNQ4ISI = (i4 + 11) % 128;
                if (str.length() == 0) {
                    return;
                }
                byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
                util.h.xy.d.ra m26913 = util.h.xy.k.b.m26913(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                util.h.xy.d.b m26219 = m26913.m26219();
                if (m26913.m26220() != null) {
                    util.h.xy.d.rc m26220 = m26913.m26220();
                    byte[] m26243 = m26220.m26243();
                    byte[] m26242 = m26220.m26242();
                    byte[] m26239 = m26220.m26239();
                    byte[] m26237 = m26220.m26237();
                    byte[] m25088 = util.h.xy.ar.b.m25088(m26220.m26246());
                    byte[] m250882 = util.h.xy.ar.b.m25088(m26220.m26238());
                    byte[] m26244 = m26220.m26244();
                    m26219.m26143();
                    new java.lang.String(m26243, util.h.xy.h.a.f2221);
                    new java.lang.String(bArr, util.h.xy.h.a.f2221);
                    util.h.xy.t.mb.f2417.m27425(bytes, m26219.m26143(), bArr2, bArr, m26243, m26242, m26239, m26237, m25088, m250882, m26244, util.h.xy.d.mg.f1144);
                    int i5 = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getInputFormats = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("❑鯿常ᄘ햢裯䬹\u0e72싊蔆砛㲢￬뉶畹⧋\uec18꽔控⚩", 48311 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(3001, ((java.lang.String) objArr[0]).intern());
            }
            int length = bArr.length;
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (isOutputSupportedFor ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputSizeshNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getOutputSizeshNQ4ISI[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (isOutputSupportedFor ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (isOutputSupportedFor ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputSizeshNQ4ISI;
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
                    byte[] bArr5 = getOutputSizeshNQ4ISI;
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
        objArr[0] = sb.toString();
    }

    private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor + 69;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 113) % 128;
        char[] cArr = charArray;
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = unwrapAs;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 31) % 128;
                cArr3[i4] = (char) (cArr2[i4] ^ 4042185467053315654L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (4042185467053315654L ^ getOutputFormats);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = getHighSpeedVideoSizes + 87;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 92;
                cArr4[i2] = (char) (cArr[i2] % b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = cArr[mcVar.f2638];
                mcVar.f2636 = cArr[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr4[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr4[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr4[mcVar.f2638] = cArr2[(i6 * c) + i7];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr4[mcVar.f2638] = cArr2[(i10 * c) + i11];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr4[mcVar.f2638] = cArr2[(i14 * c) + i15];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 115) % 128;
        for (int i18 = 0; i18 < i; i18++) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 7) % 128;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (r7 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        util.h.xy.t.mb.f2417.m27443(r35, r34.m26143(), r34.m26133());
        util.h.xy.t.mb.f2417.m27468(r35, r34.m26143(), r34.m26133());
        util.h.xy.t.mb.f2417.m27424(r35, r34.m26143(), r34.m26133());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        util.h.xy.k.ra.getInputSizeshNQ4ISI = (r10 + 79) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r8 = m26936(false, util.h.xy.t.mb.f2417.m27439(r35, r9)).m26230();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r7 > 0) goto L15;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static util.h.xy.d.b m26935(util.h.xy.d.b bVar, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        int i2;
        getInputFormats = (getInputSizeshNQ4ISI + 19) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (103 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), " \u0015\u0002\u001f\u0005\t\u0004\u0003\b#\u0007\r\u000f\u0004\n\u0014\u0014\u0006\u000b\u001f\u001a\u0014㙜", 22 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        bVar.m26140(((java.lang.String) objArr[0]).intern());
        int m26135 = bVar.m26135();
        int m26139 = bVar.m26139();
        if (bVar.m26139() <= 0) {
            if (bVar.m26142() != 0) {
                getInputSizeshNQ4ISI = (getInputFormats + 49) % 128;
                if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                    util.h.xy.d.b bVar2 = new util.h.xy.d.b(bVar.m26143(), bVar.m26139(), bVar.m26141(), bVar.m26136(), true, bVar.m26133(), bVar.m26131(), bVar.m26132(), 0, bVar.m26145(), bVar.m26134(), bVar.m26135());
                    f2243.m26966(bArr, bVar2);
                    return bVar2;
                }
            }
            return null;
        }
        int m26143 = bVar.m26143() + 1;
        int m26132 = bVar.m26132();
        try {
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                int i3 = getInputSizeshNQ4ISI + 49;
                int i4 = i3 % 128;
                getInputFormats = i4;
                if (i3 % 2 != 0) {
                    m26139 += 83;
                    m26132 += 12;
                } else {
                    m26139--;
                    m26132++;
                }
            } else if (bVar.m26133() == util.h.xy.d.mg.f1144 && m26135 > 0) {
                m26135--;
            }
            int i5 = m26139;
            int i6 = m26143;
            int i7 = m26132;
            int i8 = m26135;
            if (bVar.m26139() <= 0) {
                int i9 = getInputSizeshNQ4ISI + 65;
                getInputFormats = i9 % 128;
                if (i9 % 2 != 0) {
                    bVar.m26139();
                    throw null;
                }
                bVar.m26139();
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                getInputFormats = (getInputSizeshNQ4ISI + 41) % 128;
                i2 = bVar.m26143();
            } else {
                getInputFormats = (getInputSizeshNQ4ISI + 59) % 128;
                i2 = 0;
            }
            util.h.xy.d.b bVar3 = new util.h.xy.d.b(i6, i5, bVar.m26141(), bVar.m26136(), true, bVar.m26133(), bVar.m26131(), i7, i2, bVar.m26145(), bVar.m26134(), i8);
            f2243.m26966(bArr, bVar3);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("❾鎘亖㦜\uf4b2꾚᪸햏胑篝㛉\ue1e5岩\u17ff싱뵄栘⌊鸧䤩Х［ꩤ敞큐警䙂ㅾ\uec7f墉", 46326 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            bVar3.m26140(((java.lang.String) objArr2[0]).intern());
            int i10 = getInputFormats + 53;
            getInputSizeshNQ4ISI = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 3;
            }
            return bVar3;
        } catch (java.lang.Throwable th) {
            if (bVar.m26139() <= 0) {
                bVar.m26139();
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                getInputFormats = (getInputSizeshNQ4ISI + 119) % 128;
                i = bVar.m26143();
            } else {
                i = 0;
            }
            util.h.xy.d.b bVar4 = new util.h.xy.d.b(m26143, m26139, bVar.m26141(), bVar.m26136(), true, bVar.m26133(), bVar.m26131(), m26132, i, bVar.m26145(), bVar.m26134(), m26135);
            f2243.m26966(bArr, bVar4);
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("❾鎘亖㦜\uf4b2꾚᪸햏胑篝㛉\ue1e5岩\u17ff싱뵄栘⌊鸧䤩Х［ꩤ敞큐警䙂ㅾ\uec7f墉", 46326 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr3);
                bVar4.m26140(((java.lang.String) objArr3[0]).intern());
                throw th;
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26943() {
        getInputSizeshNQ4ISI = (getInputFormats + 119) % 128;
        util.h.xy.f.mb.f2209.m26793();
        this.toString = null;
        util.h.xy.f.b.f2201.m26749();
        int i = getInputFormats + 121;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.d.d m26956() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (this.toString == null) {
            getInputFormats = (getInputSizeshNQ4ISI + 125) % 128;
            byte[] m27446 = util.h.xy.t.mb.f2417.m27446();
            if (m27446 == null) {
                m27446 = new byte[0];
            }
            if (m27446.length > 0) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = m26950(new java.lang.String(m27446, util.h.xy.h.a.f2221));
                if (m26950.isSuccessful()) {
                    this.toString = m26950.getResult();
                    getInputSizeshNQ4ISI = (getInputFormats + 41) % 128;
                }
            }
        }
        return this.toString;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26952(util.h.xy.d.d dVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        getInputSizeshNQ4ISI = (getInputFormats + 11) % 128;
        dVar.m26180();
        dVar.m26179();
        util.h.xy.u.d.m27510(dVar.m26180());
        if (dVar.m26179() != null) {
            util.h.xy.u.d.m27510(dVar.m26179());
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            int i = getInputSizeshNQ4ISI + 33;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                throw null;
            }
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR && paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                java.lang.String str = util.h.xy.i.b.f2235;
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27689 = util.h.xy.x.a.m27689(util.h.xy.i.b.f2235);
                int i2 = getInputSizeshNQ4ISI + 45;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    return m27689;
                }
                throw null;
            }
        }
        return m26969(dVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26946(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (bArr != null && bArr.length > 0) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = m26950(new java.lang.String(bArr, util.h.xy.h.a.f2221));
            m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, m26950.getResult());
            if (!m26950.isSuccessful()) {
                return util.h.xy.x.a.m27696(null);
            }
            getInputSizeshNQ4ISI = (getInputFormats + 39) % 128;
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRanges = f2243.getHighSpeedVideoFpsRanges(m26950.getResult());
            getInputFormats = (getInputSizeshNQ4ISI + 95) % 128;
            return highSpeedVideoFpsRanges;
        }
        return util.h.xy.x.a.m27696(null);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26969(util.h.xy.d.d dVar) {
        try {
            if (!m26968(dVar.m26180())) {
                getInputSizeshNQ4ISI = (getInputFormats + 109) % 128;
                m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, (util.h.xy.d.d) null);
                return getHighSpeedVideoFpsRanges(dVar);
            }
            int i = getInputSizeshNQ4ISI + 3;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                return util.h.xy.x.a.m27696(null);
            }
            util.h.xy.x.a.m27696(null);
            throw null;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return util.h.xy.x.a.m27692((java.lang.Exception) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x0cf8, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r8)).intValue() == r1) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0cfc, code lost:
    
        r3 = com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0e8f, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r8)).intValue() != r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0d9c, code lost:
    
        if (r1 >= 0) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07a6 A[Catch: Exception -> 0x07b4, InternalComponentException -> 0x0fac, TRY_LEAVE, TryCatch #12 {InternalComponentException -> 0x0fac, blocks: (B:10:0x0109, B:13:0x011a, B:16:0x0120, B:19:0x0127, B:22:0x0137, B:24:0x014d, B:27:0x0164, B:29:0x017f, B:31:0x0195, B:34:0x01b2, B:37:0x01c4, B:39:0x01ff, B:42:0x0214, B:45:0x0229, B:47:0x0239, B:49:0x0253, B:52:0x0268, B:54:0x0282, B:56:0x029c, B:59:0x02b4, B:61:0x02c4, B:63:0x02d4, B:66:0x02e9, B:68:0x02fe, B:71:0x0316, B:73:0x032b, B:76:0x0354, B:78:0x0381, B:81:0x03a0, B:84:0x03d5, B:86:0x0425, B:89:0x0435, B:91:0x044a, B:93:0x0462, B:96:0x0470, B:98:0x047e, B:100:0x048c, B:103:0x049a, B:106:0x04bd, B:109:0x04dc, B:112:0x0500, B:114:0x0521, B:120:0x0578, B:123:0x0595, B:125:0x05c2, B:128:0x060a, B:131:0x0618, B:133:0x0626, B:136:0x0634, B:138:0x0642, B:140:0x0655, B:142:0x0663, B:145:0x0676, B:148:0x0689, B:150:0x0697, B:153:0x06a5, B:155:0x06bd, B:157:0x06d0, B:160:0x06e3, B:162:0x06fb, B:165:0x0713, B:168:0x0730, B:170:0x0743, B:172:0x0751, B:175:0x075f, B:177:0x077b, B:179:0x07a0, B:181:0x07a6, B:184:0x07b4, B:186:0x07c7, B:188:0x07df, B:191:0x07f2, B:194:0x080a, B:197:0x0818, B:200:0x0826, B:202:0x0839, B:204:0x084c, B:206:0x085f, B:209:0x086d, B:211:0x087b, B:213:0x0889, B:215:0x089c, B:218:0x08af, B:220:0x08c2, B:222:0x08d5, B:225:0x08ed, B:227:0x08fb, B:230:0x0909, B:232:0x091c, B:235:0x0936, B:237:0x0950, B:239:0x0965, B:241:0x099a, B:244:0x09ad, B:246:0x09c5, B:249:0x09df, B:251:0x09f9, B:254:0x0a0e, B:257:0x0a2a, B:259:0x0a3a, B:261:0x0a54, B:264:0x0a6e, B:266:0x0a83, B:268:0x0aae, B:270:0x0ae1, B:273:0x0af4, B:276:0x0b0d, B:278:0x0b38, B:281:0x0b63, B:283:0x0b7b, B:285:0x0b8e, B:287:0x0ba3, B:288:0x0bb1, B:296:0x0eb3, B:305:0x0f08, B:307:0x0f0d, B:309:0x0f14), top: B:9:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0eb3 A[Catch: InternalComponentException -> 0x0fac, TRY_ENTER, TRY_LEAVE, TryCatch #12 {InternalComponentException -> 0x0fac, blocks: (B:10:0x0109, B:13:0x011a, B:16:0x0120, B:19:0x0127, B:22:0x0137, B:24:0x014d, B:27:0x0164, B:29:0x017f, B:31:0x0195, B:34:0x01b2, B:37:0x01c4, B:39:0x01ff, B:42:0x0214, B:45:0x0229, B:47:0x0239, B:49:0x0253, B:52:0x0268, B:54:0x0282, B:56:0x029c, B:59:0x02b4, B:61:0x02c4, B:63:0x02d4, B:66:0x02e9, B:68:0x02fe, B:71:0x0316, B:73:0x032b, B:76:0x0354, B:78:0x0381, B:81:0x03a0, B:84:0x03d5, B:86:0x0425, B:89:0x0435, B:91:0x044a, B:93:0x0462, B:96:0x0470, B:98:0x047e, B:100:0x048c, B:103:0x049a, B:106:0x04bd, B:109:0x04dc, B:112:0x0500, B:114:0x0521, B:120:0x0578, B:123:0x0595, B:125:0x05c2, B:128:0x060a, B:131:0x0618, B:133:0x0626, B:136:0x0634, B:138:0x0642, B:140:0x0655, B:142:0x0663, B:145:0x0676, B:148:0x0689, B:150:0x0697, B:153:0x06a5, B:155:0x06bd, B:157:0x06d0, B:160:0x06e3, B:162:0x06fb, B:165:0x0713, B:168:0x0730, B:170:0x0743, B:172:0x0751, B:175:0x075f, B:177:0x077b, B:179:0x07a0, B:181:0x07a6, B:184:0x07b4, B:186:0x07c7, B:188:0x07df, B:191:0x07f2, B:194:0x080a, B:197:0x0818, B:200:0x0826, B:202:0x0839, B:204:0x084c, B:206:0x085f, B:209:0x086d, B:211:0x087b, B:213:0x0889, B:215:0x089c, B:218:0x08af, B:220:0x08c2, B:222:0x08d5, B:225:0x08ed, B:227:0x08fb, B:230:0x0909, B:232:0x091c, B:235:0x0936, B:237:0x0950, B:239:0x0965, B:241:0x099a, B:244:0x09ad, B:246:0x09c5, B:249:0x09df, B:251:0x09f9, B:254:0x0a0e, B:257:0x0a2a, B:259:0x0a3a, B:261:0x0a54, B:264:0x0a6e, B:266:0x0a83, B:268:0x0aae, B:270:0x0ae1, B:273:0x0af4, B:276:0x0b0d, B:278:0x0b38, B:281:0x0b63, B:283:0x0b7b, B:285:0x0b8e, B:287:0x0ba3, B:288:0x0bb1, B:296:0x0eb3, B:305:0x0f08, B:307:0x0f0d, B:309:0x0f14), top: B:9:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0eb8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0d14 A[Catch: InternalComponentException -> 0x0f6a, UnsupportedEncodingException -> 0x0f8b, TRY_LEAVE, TryCatch #46 {UnsupportedEncodingException -> 0x0f8b, blocks: (B:290:0x0c15, B:328:0x0c46, B:341:0x0d02, B:343:0x0d08, B:344:0x0d09, B:347:0x0d0b, B:349:0x0d12, B:350:0x0d13, B:351:0x0d14, B:356:0x0d27, B:359:0x0d30, B:364:0x0d3b, B:369:0x0d51, B:373:0x0d5c, B:377:0x0d6f, B:380:0x0d79, B:382:0x0d7d, B:386:0x0d86, B:390:0x0d95, B:394:0x0da0, B:397:0x0da6, B:415:0x0de1, B:426:0x0e95, B:428:0x0e9b, B:429:0x0e9c, B:437:0x0ea7, B:438:0x0eac, B:432:0x0e9e, B:434:0x0ea5, B:435:0x0ea6, B:443:0x0d9a), top: B:289:0x0c15, outer: #21 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v8, types: [util.h.xy.a.ra] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> getHighSpeedVideoFpsRanges(util.h.xy.d.d dVar) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        byte[] bArr4;
        java.lang.String str5;
        java.lang.String str6;
        int m24553;
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.Class<?> cls;
        java.lang.String str7;
        java.lang.Class<?>[] clsArr;
        util.h.xy.k.ra raVar = this;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((-1324272536) - android.graphics.ImageFormat.getBitsPerPixel(0), (short) (90 - android.os.Process.getGidForName("")), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 100, android.view.View.combineMeasuredStates(0, 0) - 719813810, objArr);
        java.lang.String str8 = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((-1324272450) - android.view.MotionEvent.axisFromString(""), (short) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 113), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") - 102, android.view.View.MeasureSpec.getMode(0) - 719813810, objArr2);
        java.lang.String str9 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("꧃侟敱ᫍろ혴쿀\ue5ba魨냖嚻䱻斓ᮉㄎ훉첞\ue20b鯙놹圗䳫抧᠗ㇳ", android.os.Process.getGidForName("") + 58968, objArr3);
        java.lang.String str10 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1324272432, (short) ((-66) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.resolveSizeAndState(0, 0, 0) - 98, android.widget.ExpandableListView.getPackedPositionChild(0L) - 719813809, objArr4);
        java.lang.String str11 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("꧃\ue265㺅䫏蜳펻濂롱\uf4b4Î崂\ue9b2◌繎誌웯ጚ꾡ﯱ㐛䁿鳹⤙敆뇾쨡", (-16757843) - android.graphics.Color.rgb(0, 0, 0), objArr5);
        java.lang.String str12 = (java.lang.String) objArr5[0];
        byte[] bytes = dVar.m26180().getBytes(util.h.xy.h.a.f2221);
        try {
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
            byte[] bArr5 = new byte[131];
            try {
                try {
                    try {
                        ((java.security.SecureRandom) java.lang.Class.forName(str12).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr5);
                        byte[] bArr6 = new byte[128];
                        byte[] bArr7 = new byte[3];
                        raVar = new util.h.xy.a.ra();
                        try {
                            bArr = bArr7;
                            try {
                                bArr2 = bArr6;
                                bArr3 = m25017;
                                try {
                                    raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f143, new java.lang.Class[0]));
                                } catch (java.lang.Exception unused) {
                                }
                            } catch (java.lang.Exception unused2) {
                                bArr2 = bArr6;
                                bArr3 = m25017;
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
                                cls = java.lang.Class.forName(str8);
                                str7 = util.h.xy.al.b.f128;
                                clsArr = new java.lang.Class[1];
                                bArr4 = bArr5;
                                str = str11;
                                str4 = str12;
                                try {
                                    str2 = str9;
                                    str3 = str10;
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes((-1324272514) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 59), (byte) android.text.TextUtils.indexOf("", "", 0, 0), android.view.KeyEvent.keyCodeFromString("") - 91, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 719813810, objArr6);
                                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr6[0]);
                                    raVar.m24514(cls.getMethod(str7, clsArr));
                                } catch (java.lang.Exception unused3) {
                                    str2 = str9;
                                    str3 = str10;
                                }
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
                                java.lang.Class<?> cls2 = java.lang.Class.forName(str8);
                                java.lang.String str13 = util.h.xy.al.b.f193;
                                java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                                clsArr2[0] = java.lang.String.class;
                                str5 = "";
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.view.View.resolveSizeAndState(0, 0, 0) - 1324272514, (short) ((-58) - android.view.View.MeasureSpec.getSize(0)), (byte) android.view.KeyEvent.normalizeMetaState(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 91, (-719813810) - android.view.Gravity.getAbsoluteGravity(0, 0), objArr7);
                                clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr7[0]);
                                raVar.m24514(cls2.getMethod(str13, clsArr2));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
                                java.lang.Class<?> cls3 = java.lang.Class.forName(str8);
                                java.lang.String str14 = util.h.xy.al.b.f108;
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧲\ued1c‱朣먻\uf115㑑䬕踄씋ᡦ彨鉬⥸汎ꌐ\ue65a㵅灙랦쫳Ƈ䒪鮄\ude85ᖑꢅ\uef83⋶秽볳\uf3eb㚲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17656, objArr8);
                                raVar.m24514(cls3.getMethod(str14, java.lang.String.class, byte[].class, java.lang.Class.forName((java.lang.String) objArr8[0])));
                                java.lang.Class<?> cls4 = java.lang.Class.forName(str8);
                                java.lang.String str15 = util.h.xy.al.b.f108;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃籟˱⤍ￛ舩ꡆ绫դ⮔︦蒠\uaac4焬ޠ⨕\uf0a0", android.view.KeyEvent.getDeadChar(0, 0) + 54679, objArr9);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧲\ued1c‱朣먻\uf115㑑䬕踄씋ᡦ彨鉬⥸汎ꌐ\ue65a㵅灙랦쫳Ƈ䒪鮄\ude85ᖑꢅ\uef83⋶秽볳\uf3eb㚲", 17658 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
                                raVar.m24514(cls4.getMethod(str15, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr9[0]), char[].class, java.lang.Class.forName((java.lang.String) objArr10[0])));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
                                raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
                                raVar.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f147, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f131, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f188, new java.lang.Class[0]));
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30490, objArr11);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr11[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", android.view.View.MeasureSpec.getMode(0) + 30491, objArr12);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr12[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 30491, objArr13);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr13[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30491, objArr14);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr14[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-1324272485) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) (61 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (byte) android.graphics.Color.red(0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 84, (-719813810) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr15);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr15[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                                i4 = getInputFormats + 73;
                                getInputSizeshNQ4ISI = i4 % 128;
                                if (i4 % 2 == 0) {
                                }
                                str6 = str5;
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-1324272486) - android.widget.ExpandableListView.getPackedPositionChild(0L), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.graphics.Color.alpha(0) - 84, android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 719813809, objArr16);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr16[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1324272485, (short) (60 - android.widget.ExpandableListView.getPackedPositionChild(0L)), (byte) (android.os.Process.myPid() >> 22), (-84) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-719813811) - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr17);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr17[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
                                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f153, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f139, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f166, java.util.function.BiConsumer.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f167, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f154, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f168, java.lang.Object.class, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f92, java.util.Map.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f91, java.util.function.BiFunction.class));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f176, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧈꤂ꡇꮔ\uaad2ꨙ굓곤꿮꼷긵ꆚꃰꏊꌚꉅ", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 197, objArr18);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr18[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
                                if (android.os.Build.VERSION.SDK_INT >= 28) {
                                }
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
                                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
                                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                                java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                                java.lang.String str16 = util.h.xy.al.b.f121;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃籟˱⤍ￛ舩ꡆ绫դ⮔︦蒠\uaac4焬ޠ⨕\uf0a0", 54679 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr19);
                                raVar.m24514(cls5.getMethod(str16, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr19[0])));
                                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f192, byte[].class));
                                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f192, byte[].class, java.lang.Integer.TYPE));
                                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str4)));
                                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
                                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                                java.lang.Class<?> cls6 = java.lang.Class.forName(str);
                                java.lang.String str17 = util.h.xy.al.b.f190;
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃酇\ud8c1e䮻댑殺∣涤哜鱖쟸ཤ盄븫了ℰ梠叆魀신ਖ਼疆봉", android.graphics.Color.rgb(0, 0, 0) + 16791695, objArr20);
                                raVar.m24514(cls6.getMethod(str17, java.lang.Class.forName((java.lang.String) objArr20[0])));
                                java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                                java.lang.String str18 = util.h.xy.al.b.f190;
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧃酇\ud8c1e䮻댑殺∣涤哜鱖쟸ཤ盄븫了ℰ梠叆魀신ਖ਼疆봉", 14479 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr21);
                                raVar.m24514(cls7.getMethod(str18, java.lang.Class.forName((java.lang.String) objArr21[0]), java.lang.Class.forName(str4)));
                                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f196, byte[].class));
                                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
                                getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧈ꐴ눫耂鸊\uec7f奔젢왂푇⊴キ\u0ebfᲗ檗磭皷䓡勚ꃙ뼦贲鬤\ue90e\ue704\uf53c썌텭⽄㵾\u0ba1ᦫួ斟玌䇤忬귙믕覈萓鈷\ue01e︔찉\uda7b⡱", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3570, objArr22);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr22[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("꧈ꐴ눫耂鸊\uec7f奔젢왂푇⊴キ\u0ebfᲗ檗磭皷䓡勚ꃙ뼦贲鬤\ue90e\ue704\uf53c썌텭⽄㵾\u0ba1ᦫួ斟玌䇤忬귙믕覈萓鈷\ue01e︔찉\uda7b⡱", 3572 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr23);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr23[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
                                raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
                                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f133, byte[].class));
                                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
                                raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
                                raVar.m24514(com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.class);
                                raVar.m24514(util.h.xy.f.b.class);
                                raVar.m24514(util.h.xy.k.b.class);
                                raVar.m24514(util.h.xy.k.ra.class);
                                raVar.m24514(util.h.xy.k.mb.class);
                                raVar.m24514(util.h.xy.m.mb.class);
                                raVar.m24514(util.h.xy.t.mb.class);
                                raVar.m24514(util.h.xy.ac.a.class);
                                raVar.m24514(util.h.xy.ac.ma.class);
                                raVar.m24514(util.h.xy.ac.c.class);
                                raVar.m24514(util.h.xy.ac.rb.class);
                                raVar.m24514(util.h.xy.ac.d.class);
                                raVar.m24514(util.h.xy.q.b.class);
                                raVar.m24514(util.h.xy.u.a.class);
                                raVar.m24514(util.h.xy.w.ra.class);
                                raVar.m24514(util.h.xy.d.ra.class);
                                raVar.m24514(util.h.xy.d.rc.class);
                                raVar.m24514(util.h.xy.aw.ma.class);
                                raVar.m24514(util.h.xy.ar.b.class);
                                raVar.m24514(util.h.xy.ad.a.class);
                                try {
                                    byte[] bArr8 = bArr4;
                                    byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr8, util.h.xy.a.ma.m24504((util.h.xy.a.ra) raVar));
                                    m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                                    if (m24553 == -91) {
                                    }
                                } catch (java.io.UnsupportedEncodingException unused4) {
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("❈餜宰ᰥ\uded1齆凨ቦ퐑隟圯৸쩬賐䵬\u0ff3솉舫䒽Շ", 48750 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr24);
                                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr24[0]).intern());
                                }
                            }
                        } catch (java.lang.Exception unused5) {
                            bArr = bArr7;
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
                        } catch (java.lang.Exception unused6) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
                        } catch (java.lang.Exception unused7) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
                        } catch (java.lang.Exception unused8) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
                        } catch (java.lang.Exception unused9) {
                        }
                        try {
                            cls = java.lang.Class.forName(str8);
                            str7 = util.h.xy.al.b.f128;
                            clsArr = new java.lang.Class[1];
                            bArr4 = bArr5;
                            str = str11;
                            str4 = str12;
                            str2 = str9;
                            str3 = str10;
                            try {
                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-1324272514) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 59), (byte) android.text.TextUtils.indexOf("", "", 0, 0), android.view.KeyEvent.keyCodeFromString("") - 91, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 719813810, objArr62);
                                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                raVar.m24514(cls.getMethod(str7, clsArr));
                            } catch (java.lang.Exception unused10) {
                            }
                        } catch (java.lang.Exception unused11) {
                            str = str11;
                            str2 = str9;
                            str3 = str10;
                            str4 = str12;
                            bArr4 = bArr5;
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
                        } catch (java.lang.Exception unused12) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
                        } catch (java.lang.Exception unused13) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused14) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
                        } catch (java.lang.Exception unused15) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                        } catch (java.lang.Exception unused16) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                        } catch (java.lang.Exception unused17) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                        } catch (java.lang.Exception unused18) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
                        } catch (java.lang.Exception unused19) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused20) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused21) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
                        } catch (java.lang.Exception unused22) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
                        } catch (java.lang.Exception unused23) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
                        } catch (java.lang.Exception unused24) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
                        } catch (java.lang.Exception unused25) {
                        }
                        try {
                            java.lang.Class<?> cls22 = java.lang.Class.forName(str8);
                            java.lang.String str132 = util.h.xy.al.b.f193;
                            java.lang.Class<?>[] clsArr22 = new java.lang.Class[2];
                            clsArr22[0] = java.lang.String.class;
                            str5 = "";
                            try {
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.view.View.resolveSizeAndState(0, 0, 0) - 1324272514, (short) ((-58) - android.view.View.MeasureSpec.getSize(0)), (byte) android.view.KeyEvent.normalizeMetaState(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 91, (-719813810) - android.view.Gravity.getAbsoluteGravity(0, 0), objArr72);
                                clsArr22[1] = java.lang.Class.forName((java.lang.String) objArr72[0]);
                                raVar.m24514(cls22.getMethod(str132, clsArr22));
                            } catch (java.lang.Exception unused26) {
                            }
                        } catch (java.lang.Exception unused27) {
                            str5 = "";
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
                        } catch (java.lang.Exception unused28) {
                        }
                        try {
                            java.lang.Class<?> cls32 = java.lang.Class.forName(str8);
                            java.lang.String str142 = util.h.xy.al.b.f108;
                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧲\ued1c‱朣먻\uf115㑑䬕踄씋ᡦ彨鉬⥸汎ꌐ\ue65a㵅灙랦쫳Ƈ䒪鮄\ude85ᖑꢅ\uef83⋶秽볳\uf3eb㚲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17656, objArr82);
                            raVar.m24514(cls32.getMethod(str142, java.lang.String.class, byte[].class, java.lang.Class.forName((java.lang.String) objArr82[0])));
                        } catch (java.lang.Exception unused29) {
                        }
                        try {
                            java.lang.Class<?> cls42 = java.lang.Class.forName(str8);
                            java.lang.String str152 = util.h.xy.al.b.f108;
                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃籟˱⤍ￛ舩ꡆ绫դ⮔︦蒠\uaac4焬ޠ⨕\uf0a0", android.view.KeyEvent.getDeadChar(0, 0) + 54679, objArr92);
                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧲\ued1c‱朣먻\uf115㑑䬕踄씋ᡦ彨鉬⥸汎ꌐ\ue65a㵅灙랦쫳Ƈ䒪鮄\ude85ᖑꢅ\uef83⋶秽볳\uf3eb㚲", 17658 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr102);
                            raVar.m24514(cls42.getMethod(str152, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr92[0]), char[].class, java.lang.Class.forName((java.lang.String) objArr102[0])));
                        } catch (java.lang.Exception unused30) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused31) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
                        } catch (java.lang.Exception unused32) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str8).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
                        } catch (java.lang.Exception unused33) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused34) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f147, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused35) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f131, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused36) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f188, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused37) {
                        }
                        try {
                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30490, objArr112);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr112[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused38) {
                        }
                        try {
                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", android.view.View.MeasureSpec.getMode(0) + 30491, objArr122);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr122[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused39) {
                        }
                        try {
                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 30491, objArr132);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr132[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused40) {
                        }
                        try {
                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃\uded3䟩척痫艹据\ue877ᄄ蘨໎럴㲔ꗘ⪘卙\ud860䄱\uf63b织\ue7c7泻闟᪔荓ࡣ녡☑꼩ퟃ峈얉䪰\uf397硑\ue16cᘗ鼷", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30491, objArr142);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr142[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused41) {
                        }
                        try {
                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((-1324272485) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) (61 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (byte) android.graphics.Color.red(0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 84, (-719813810) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr152);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr152[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                            i4 = getInputFormats + 73;
                            getInputSizeshNQ4ISI = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 2 / 2;
                            }
                        } catch (java.lang.Exception unused42) {
                        }
                        try {
                            str6 = str5;
                            try {
                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-1324272486) - android.widget.ExpandableListView.getPackedPositionChild(0L), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.graphics.Color.alpha(0) - 84, android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 719813809, objArr162);
                                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr162[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
                            } catch (java.lang.Exception unused43) {
                            }
                        } catch (java.lang.Exception unused44) {
                            str6 = str5;
                        }
                        try {
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1324272485, (short) (60 - android.widget.ExpandableListView.getPackedPositionChild(0L)), (byte) (android.os.Process.myPid() >> 22), (-84) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-719813811) - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr172);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr172[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused45) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused46) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused47) {
                        }
                        try {
                            raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused48) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused49) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f153, java.lang.Object.class));
                        } catch (java.lang.Exception unused50) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f139, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused51) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f166, java.util.function.BiConsumer.class));
                        } catch (java.lang.Exception unused52) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f167, java.lang.Object.class));
                        } catch (java.lang.Exception unused53) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused54) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f154, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused55) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f168, java.lang.Object.class, java.lang.Object.class));
                        } catch (java.lang.Exception unused56) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f92, java.util.Map.class));
                        } catch (java.lang.Exception unused57) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                        } catch (java.lang.Exception unused58) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class, java.lang.Object.class));
                        } catch (java.lang.Exception unused59) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class));
                        } catch (java.lang.Exception unused60) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class));
                        } catch (java.lang.Exception unused61) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f91, java.util.function.BiFunction.class));
                        } catch (java.lang.Exception unused62) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused63) {
                        }
                        try {
                            raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f176, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused64) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused65) {
                        }
                        try {
                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧈꤂ꡇꮔ\uaad2ꨙ굓곤꿮꼷긵ꆚꃰꏊꌚꉅ", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 197, objArr182);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr182[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused66) {
                        }
                        try {
                            if (android.os.Build.VERSION.SDK_INT >= 28) {
                                raVar.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f127, new java.lang.Class[0]));
                            }
                        } catch (java.lang.Exception unused67) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
                        } catch (java.lang.Exception unused68) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
                        } catch (java.lang.Exception unused69) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
                        } catch (java.lang.Exception unused70) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
                        } catch (java.lang.Exception unused71) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused72) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused73) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
                        } catch (java.lang.Exception unused74) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused75) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
                        } catch (java.lang.Exception unused76) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused77) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused78) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused79) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused80) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused81) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                        } catch (java.lang.Exception unused82) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
                        } catch (java.lang.Exception unused83) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
                        } catch (java.lang.Exception unused84) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused85) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused86) {
                        }
                        try {
                            raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
                        } catch (java.lang.Exception unused87) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                        } catch (java.lang.Exception unused88) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                        } catch (java.lang.Exception unused89) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                        } catch (java.lang.Exception unused90) {
                        }
                        try {
                            java.lang.Class<?> cls52 = java.lang.Class.forName(str2);
                            java.lang.String str162 = util.h.xy.al.b.f121;
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃籟˱⤍ￛ舩ꡆ绫դ⮔︦蒠\uaac4焬ޠ⨕\uf0a0", 54679 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr192);
                            raVar.m24514(cls52.getMethod(str162, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr192[0])));
                        } catch (java.lang.Exception unused91) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f192, byte[].class));
                        } catch (java.lang.Exception unused92) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f192, byte[].class, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused93) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                        } catch (java.lang.Exception unused94) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                        } catch (java.lang.Exception unused95) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                        } catch (java.lang.Exception unused96) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str4)));
                        } catch (java.lang.Exception unused97) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused98) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                        } catch (java.lang.Exception unused99) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                        } catch (java.lang.Exception unused100) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                        } catch (java.lang.Exception unused101) {
                        }
                        try {
                            java.lang.Class<?> cls62 = java.lang.Class.forName(str);
                            java.lang.String str172 = util.h.xy.al.b.f190;
                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃酇\ud8c1e䮻댑殺∣涤哜鱖쟸ཤ盄븫了ℰ梠叆魀신ਖ਼疆봉", android.graphics.Color.rgb(0, 0, 0) + 16791695, objArr202);
                            raVar.m24514(cls62.getMethod(str172, java.lang.Class.forName((java.lang.String) objArr202[0])));
                        } catch (java.lang.Exception unused102) {
                        }
                        try {
                            java.lang.Class<?> cls72 = java.lang.Class.forName(str);
                            java.lang.String str182 = util.h.xy.al.b.f190;
                            java.lang.Object[] objArr212 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧃酇\ud8c1e䮻댑殺∣涤哜鱖쟸ཤ盄븫了ℰ梠叆魀신ਖ਼疆봉", 14479 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr212);
                            raVar.m24514(cls72.getMethod(str182, java.lang.Class.forName((java.lang.String) objArr212[0]), java.lang.Class.forName(str4)));
                        } catch (java.lang.Exception unused103) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f196, byte[].class));
                        } catch (java.lang.Exception unused104) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused105) {
                        }
                        getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
                        try {
                            java.lang.Object[] objArr222 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧈ꐴ눫耂鸊\uec7f奔젢왂푇⊴キ\u0ebfᲗ檗磭皷䓡勚ꃙ뼦贲鬤\ue90e\ue704\uf53c썌텭⽄㵾\u0ba1ᦫួ斟玌䇤忬귙믕覈萓鈷\ue01e︔찉\uda7b⡱", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3570, objArr222);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr222[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
                        } catch (java.lang.Exception unused106) {
                        }
                        try {
                            java.lang.Object[] objArr232 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("꧈ꐴ눫耂鸊\uec7f奔젢왂푇⊴キ\u0ebfᲗ檗磭皷䓡勚ꃙ뼦贲鬤\ue90e\ue704\uf53c썌텭⽄㵾\u0ba1ᦫួ斟玌䇤忬귙믕覈萓鈷\ue01e︔찉\uda7b⡱", 3572 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr232);
                            raVar.m24514(java.lang.Class.forName((java.lang.String) objArr232[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused107) {
                        }
                        try {
                            raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
                        } catch (java.lang.Exception unused108) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f133, byte[].class));
                        } catch (java.lang.Exception unused109) {
                        }
                        try {
                            raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
                        } catch (java.lang.Exception unused110) {
                        }
                        try {
                            raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
                        } catch (java.lang.Exception unused111) {
                        }
                        raVar.m24514(com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.class);
                        raVar.m24514(util.h.xy.f.b.class);
                        raVar.m24514(util.h.xy.k.b.class);
                        raVar.m24514(util.h.xy.k.ra.class);
                        raVar.m24514(util.h.xy.k.mb.class);
                        raVar.m24514(util.h.xy.m.mb.class);
                        raVar.m24514(util.h.xy.t.mb.class);
                        raVar.m24514(util.h.xy.ac.a.class);
                        raVar.m24514(util.h.xy.ac.ma.class);
                        raVar.m24514(util.h.xy.ac.c.class);
                        raVar.m24514(util.h.xy.ac.rb.class);
                        raVar.m24514(util.h.xy.ac.d.class);
                        raVar.m24514(util.h.xy.q.b.class);
                        raVar.m24514(util.h.xy.u.a.class);
                        raVar.m24514(util.h.xy.w.ra.class);
                        raVar.m24514(util.h.xy.d.ra.class);
                        raVar.m24514(util.h.xy.d.rc.class);
                        raVar.m24514(util.h.xy.aw.ma.class);
                        raVar.m24514(util.h.xy.ar.b.class);
                        raVar.m24514(util.h.xy.ad.a.class);
                        try {
                            byte[] bArr82 = bArr4;
                            byte[] m275942 = util.h.xy.v.b.f2439.m27594(bArr82, util.h.xy.a.ma.m24504((util.h.xy.a.ra) raVar));
                            m24553 = util.h.xy.af.mb.m24551().m24553(m275942[0]);
                            if (m24553 == -91) {
                                raVar = 111;
                                if (m24553 == 111) {
                                    try {
                                        i = ((java.security.SecureRandom) java.lang.Class.forName(str4).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                        try {
                                            java.lang.Object[] objArr25 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(i)};
                                            java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                            if (obj == null) {
                                                java.lang.Class cls8 = (java.lang.Class) util.h.xy.dd.b.m26271(123 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (47455 - android.view.View.combineMeasuredStates(0, 0)), 20 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(objArr26);
                                                java.lang.String str19 = (java.lang.String) objArr26[0];
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1324272409, (short) (127 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.view.KeyEvent.getDeadChar(0, 0) - 98, (-719813819) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr27);
                                                obj = cls8.getMethod(str19, java.lang.Class.forName((java.lang.String) objArr27[0]), java.lang.Integer.TYPE);
                                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                            }
                                            i3 = i;
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
                                }
                                if (m24553 == -91) {
                                    return util.h.xy.x.a.m27690(m24553);
                                }
                                try {
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("꧈꤂ꡇꮔ\uaad2ꨙ굓곤꿮꼷긵ꆚꃰꏊꌚꉅ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 198, objArr28);
                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("꧀ᗇ퇗鶛妿Ս셠贅䤤㓞\uf0c8볹碛Ⓘ\ue05a걹栍퐡鏇", 48157 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr29);
                                    raVar = ((java.lang.Boolean) cls9.getMethod((java.lang.String) objArr29[0], null).invoke(null, null)).booleanValue();
                                    if (raVar != 0) {
                                        int i6 = getInputFormats + 35;
                                        getInputSizeshNQ4ISI = i6 % 128;
                                        return i6 % 2 == 0 ? util.h.xy.x.a.m27690(12379) : util.h.xy.x.a.m27690(803);
                                    }
                                    util.h.xy.t.mb.f2417.m27431(util.h.xy.o.b.f2276, bytes);
                                    this.toString = dVar;
                                    util.h.xy.f.b.f2201.m26753(dVar, true);
                                    if (dVar.m26179() != null) {
                                        if (dVar.m26179().isEmpty()) {
                                        }
                                        return util.h.xy.x.a.m27696(null);
                                    }
                                    util.h.xy.f.b.f2201.m26764(util.h.xy.f.ma.f2203, new byte[]{0}, true);
                                    util.h.xy.t.mb.f2417.m27472(true);
                                    util.h.xy.t.mb.f2417.m27416(true);
                                    util.h.xy.t.mb.f2417.m27450(true);
                                    return util.h.xy.x.a.m27696(null);
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            int i7 = 131;
                            byte[] bArr9 = new byte[131];
                            int i8 = 0;
                            while (i8 < i7) {
                                int i9 = getInputFormats + 91;
                                getInputSizeshNQ4ISI = i9 % 128;
                                if (i9 % 2 == 0) {
                                    bArr9[i8] = m275942[i8];
                                    i8 += 46;
                                } else {
                                    int i10 = i8 + 1;
                                    bArr9[i8] = m275942[i10];
                                    i8 = i10;
                                }
                                i7 = 131;
                            }
                            for (int i11 = 0; i11 < i7; i11++) {
                                byte b = (byte) (bArr9[i11] ^ bArr3[i11]);
                                bArr9[i11] = b;
                                bArr9[i11] = (byte) (b ^ bArr82[i11]);
                            }
                            for (int i12 = 0; i12 < 128; i12++) {
                                bArr2[i12] = bArr9[i12];
                            }
                            for (int i13 = 0; i13 < 3; i13++) {
                                bArr[i13] = bArr9[i13 + 128];
                            }
                            i = getInputFormats;
                            getInputSizeshNQ4ISI = (i + 1) % 128;
                            int i14 = bArr[0];
                            if (i14 == 0) {
                                getInputSizeshNQ4ISI = (i + 119) % 128;
                                if (bArr[1] == 0 && bArr[2] == 0) {
                                    m24553 = -91;
                                    raVar = i;
                                    if (m24553 == -91) {
                                    }
                                }
                            }
                            if (i14 >= 0 && (i2 = bArr[1]) >= 0) {
                                int i15 = i + 79;
                                int i16 = i15 % 128;
                                getInputSizeshNQ4ISI = i16;
                                if (i15 % 2 == 0) {
                                    i = bArr[2];
                                    if (i >= 0) {
                                        i = i;
                                        if (i14 != i2 && i2 != (i = bArr[2]) && i14 != i) {
                                            int i17 = bArr2[i14];
                                            int i18 = bArr2[i2];
                                            i = bArr2[i];
                                            if (i17 < i18 && i17 >= 0 && i17 <= 100 && i18 >= 0 && i18 <= 100 && i >= 0 && i <= 100) {
                                                if (i < i17) {
                                                    m24553 = 801;
                                                    raVar = i;
                                                    if (m24553 == -91) {
                                                    }
                                                } else if (i < i18 && i >= i17 && i < i18) {
                                                    int i19 = i16 + 77;
                                                    getInputFormats = i19 % 128;
                                                    if (i19 % 2 != 0) {
                                                        throw new java.lang.NullPointerException();
                                                    }
                                                    try {
                                                        i = ((java.security.SecureRandom) java.lang.Class.forName(str4).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                                        try {
                                                            java.lang.Object[] objArr30 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(i)};
                                                            java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                                            if (obj2 == null) {
                                                                java.lang.Class cls10 = (java.lang.Class) util.h.xy.dd.b.m26271(171 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (47455 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 21 - android.view.KeyEvent.keyCodeFromString(str6));
                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRanges(objArr31);
                                                                java.lang.String str20 = (java.lang.String) objArr31[0];
                                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                getHighSpeedVideoSizes((-1324272409) - android.view.View.combineMeasuredStates(0, 0), (short) (126 - android.view.View.getDefaultSize(0, 0)), (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 98, android.view.View.resolveSize(0, 0) - 719813819, objArr32);
                                                                obj2 = cls10.getMethod(str20, java.lang.Class.forName((java.lang.String) objArr32[0]), java.lang.Integer.TYPE);
                                                                util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                                            }
                                                            i3 = i;
                                                        } catch (java.lang.Throwable th4) {
                                                            java.lang.Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i = bArr[2];
                                    i = i;
                                }
                            }
                            m24553 = -91;
                            raVar = i;
                            if (m24553 == -91) {
                            }
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused112) {
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("❔聚椿툓믍擰춇땫Ḧ윘ꂧ\u09bb\uf283婺͌\uec08", android.graphics.Color.alpha(0) + 42793, objArr33);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr33[0]).intern());
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        e = e;
                        raVar = this;
                        com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException = e;
                        internalComponentException.getMessage();
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27692 = util.h.xy.x.a.m27692((java.lang.Exception) internalComponentException);
                        try {
                            raVar.m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, (util.h.xy.d.d) null);
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused113) {
                        }
                        return m27692;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    java.lang.Throwable th7 = th;
                    java.lang.Throwable cause6 = th7.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2 != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) goto L18;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.d dVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getInputSizeshNQ4ISI + 101) % 128;
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            getInputSizeshNQ4ISI = (getInputFormats + 11) % 128;
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            }
        }
        if (dVar != null) {
            if (m26968(dVar.m26180())) {
                util.h.xy.f.b.f2201.m26769();
            }
            getInputSizeshNQ4ISI = (getInputFormats + 75) % 128;
        } else {
            int i = (getInputSizeshNQ4ISI + 59) % 128;
            getInputFormats = i;
            getInputSizeshNQ4ISI = (i + 87) % 128;
        }
        int i2 = getInputSizeshNQ4ISI + 99;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.t.mb.f2417.m27467(util.h.xy.o.b.f2276);
            this.toString = null;
            util.h.xy.u.c.m27495();
            util.h.xy.u.c.m27499();
            util.h.xy.u.c.m27505();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.t.mb.f2417.m27467(util.h.xy.o.b.f2276);
        this.toString = null;
        util.h.xy.u.c.m27495();
        util.h.xy.u.c.m27499();
        util.h.xy.u.c.m27505();
        getInputSizeshNQ4ISI = (getInputFormats + 75) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.d.b m26955(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27473 = util.h.xy.t.mb.f2417.m27473(bArr);
        util.h.xy.ar.b.m25098(m27473);
        if (util.h.xy.ar.b.m25070(m27473)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("❾\uf25e贚壪玪ມ\ud855\uf32c軺妞瓗๏\ud93f\uf416迒媮瑤༸\uda4f\uf5d1肻娸畎\u0017\udbf5\uf6a0膞嬖瘥Ǳ\udcd7\uf793脝尣矽˄\udd9c\uf76b舯", android.graphics.Color.red(0) + 54577, objArr);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26953 = m26953(bArr, m27473);
        if (m26953.isSuccessful()) {
            util.h.xy.d.b result = m26953.getResult();
            int i = getInputFormats + 113;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25095(m27473);
                int i2 = getInputSizeshNQ4ISI + 29;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    return result;
                }
                throw null;
            }
            util.h.xy.ar.b.m25095(m27473);
            throw new java.lang.ArithmeticException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (5 - android.view.MotionEvent.axisFromString("")), "\u001c\u0011\u001e\u0003\t\b\t\u0005\u0005\b\u0004\r\u0013\u0012\t\u0006\u0000\u0017\t\b\u001d\u0005\u001a\u0014\u0005\b!\u001c\u0005\n", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(m26953.getErrorMessage());
        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[PHI: r4
      0x00d5: PHI (r4v27 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc A[PHI: r4
      0x00dc: PHI (r4v25 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3 A[PHI: r4
      0x00e3: PHI (r4v23 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[PHI: r4
      0x00ea: PHI (r4v21 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100 A[PHI: r4
      0x0100: PHI (r4v18 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107 A[PHI: r4
      0x0107: PHI (r4v16 util.h.xy.ar.mb) = (r4v5 util.h.xy.ar.mb), (r4v29 util.h.xy.ar.mb) binds: [B:47:0x00d1, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26953(byte[] bArr, byte[] bArr2) {
        util.h.xy.ar.mb mbVar;
        int i;
        getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
        util.h.xy.ar.mb[] m25063 = util.h.xy.ar.a.m25063(bArr2, new byte[]{6}, new byte[]{7}, new byte[]{8}, new byte[]{9}, new byte[]{16}, new byte[]{com.google.common.base.Ascii.SYN}, new byte[]{com.google.common.base.Ascii.ETB}, new byte[]{10}, new byte[]{com.google.common.base.Ascii.VT}, new byte[]{14}, new byte[]{com.google.common.base.Ascii.FF}, new byte[]{com.google.common.base.Ascii.EM});
        int length = m25063.length;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        byte[] bArr10 = null;
        byte[] bArr11 = null;
        byte[] bArr12 = null;
        byte[] bArr13 = null;
        byte[] bArr14 = null;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = getInputSizeshNQ4ISI + 59;
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                mbVar = m25063[i2];
                byte b = mbVar.m25111()[0];
                if (b != 14) {
                    if (b != 16) {
                        if (b != 25) {
                            if (b != 22) {
                                if (b != 23) {
                                    switch (b) {
                                    }
                                }
                                bArr9 = mbVar.m25110();
                            }
                            bArr8 = mbVar.m25110();
                        }
                        bArr14 = mbVar.m25110();
                    }
                    byte[] m25110 = mbVar.m25110();
                    i = getInputFormats + 119;
                    getInputSizeshNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                    }
                    bArr7 = m25110;
                }
                bArr12 = mbVar.m25110();
            } else {
                mbVar = m25063[i2];
                byte b2 = mbVar.m25111()[0];
                if (b2 == 14) {
                    bArr12 = mbVar.m25110();
                } else if (b2 == 16) {
                    byte[] m251102 = mbVar.m25110();
                    i = getInputFormats + 119;
                    getInputSizeshNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                        int i4 = 5 / 3;
                    }
                    bArr7 = m251102;
                } else if (b2 == 25) {
                    bArr14 = mbVar.m25110();
                } else if (b2 == 22) {
                    bArr8 = mbVar.m25110();
                } else {
                    if (b2 != 23) {
                        switch (b2) {
                            case 6:
                                bArr3 = mbVar.m25110();
                                break;
                            case 7:
                                bArr4 = mbVar.m25110();
                                break;
                            case 8:
                                byte[] m26937 = m26937(bArr);
                                getInputSizeshNQ4ISI = (getInputFormats + 101) % 128;
                                bArr5 = m26937;
                                break;
                            case 9:
                                bArr6 = mbVar.m25110();
                                break;
                            case 10:
                                bArr10 = mbVar.m25110();
                                break;
                            case 11:
                                bArr11 = mbVar.m25110();
                                break;
                            case 12:
                                bArr13 = mbVar.m25110();
                                break;
                        }
                    }
                    bArr9 = mbVar.m25110();
                }
            }
        }
        return util.h.xy.u.rb.m27547(bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13, bArr14);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.dcm.DigitalizedCard m26963(java.lang.String str) {
        int i = getInputFormats + 49;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.d.md mdVar = str != null ? new util.h.xy.d.md(str) : null;
        int i2 = getInputFormats + 125;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return mdVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26962(byte[] bArr, util.h.xy.d.b bVar, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int m26143;
        boolean z;
        int m26132;
        util.h.xy.d.b bVar2;
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.d.b m26955 = m26955(bArr);
        int m26139 = m26955.m26139();
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m26136 = bVar.m26136();
        if (m26955.m26139() == 0) {
            m26143 = bVar.m26143();
        } else {
            m26143 = m26955.m26143();
            getInputSizeshNQ4ISI = (getInputFormats + 109) % 128;
        }
        int i2 = m26143;
        java.lang.String str = new java.lang.String(bArr, util.h.xy.h.a.f2221);
        if (m26968(str)) {
            getInputSizeshNQ4ISI = (getInputFormats + 35) % 128;
            z = util.h.xy.u.c.m27504(str, f2243.m26940(str).booleanValue());
            getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
        } else {
            z = false;
        }
        int m26142 = z ? m26955.m26142() : 0;
        int m261322 = m26955.m26132();
        int i3 = z ? m261322 - 2 : m261322 - 1;
        m26955.m26145();
        for (int m26145 = m26955.m26145(); m26145 <= i3; m26145++) {
            util.h.xy.t.mb.f2417.m27451(bArr, m26145);
        }
        if (z) {
            int i4 = getInputFormats + 109;
            getInputSizeshNQ4ISI = i4 % 128;
            m26132 = i4 % 2 == 0 ? m26955.m26132() % 1 : m26955.m26132() - 1;
        } else {
            m26132 = m26955.m26132();
        }
        int i5 = m26132 == 0 ? 1 : m26132;
        if (bVar.m26133() != null) {
            int i6 = getInputSizeshNQ4ISI + 97;
            getInputFormats = i6 % 128;
            if (i6 % 2 != 0) {
                bVar.m26133();
                util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1144;
                throw new java.lang.ArithmeticException();
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1144) {
                bVar2 = new util.h.xy.d.b(i2, 1, bVar.m26141(), m26136, true, bVar.m26133(), bVar.m26131(), m26955.m26132(), m26142, i5, bVar.m26134(), bVar.m26135());
                java.lang.String str2 = getOutputSizes;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) (android.graphics.Color.blue(0) + 94), "\r\n\n\u0013\u0014\u0006\u000b\u0013 \u0017\u0014\b\u0011\u0001\u0014\u0006\u000b\u0013 \u0004\u000f\u0005\u0000\u0014㙝", 25 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                bVar2.m26137(str2, ((java.lang.String) objArr[0]).intern());
                m26966(bArr, bVar2);
            }
        }
        bVar2 = new util.h.xy.d.b(i2, i + m26139, bVar.m26141(), m26136, true, bVar.m26133(), bVar.m26131(), m26955.m26132(), m26142, i5, bVar.m26134(), bVar.m26135());
        java.lang.String str22 = getOutputSizes;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (android.graphics.Color.blue(0) + 94), "\r\n\n\u0013\u0014\u0006\u000b\u0013 \u0017\u0014\b\u0011\u0001\u0014\u0006\u000b\u0013 \u0004\u000f\u0005\u0000\u0014㙝", 25 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        bVar2.m26137(str22, ((java.lang.String) objArr2[0]).intern());
        m26966(bArr, bVar2);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26966(byte[] bArr, util.h.xy.d.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        byte[] bArr2;
        getInputSizeshNQ4ISI = (getInputFormats + 49) % 128;
        util.h.xy.ar.b.m25074(bArr);
        byte[] m25088 = util.h.xy.ar.b.m25088(bVar.m26143());
        byte[] m250882 = util.h.xy.ar.b.m25088(bVar.m26139());
        byte[] m250883 = util.h.xy.ar.b.m25088(bVar.m26141());
        byte[] bytes = bVar.m26136().toString().getBytes();
        if (bVar.m26138()) {
            getInputSizeshNQ4ISI = (getInputFormats + 25) % 128;
            i = 1;
        } else {
            i = 0;
        }
        byte[] bArr3 = {(byte) i};
        if (bVar.m26133() != null) {
            getInputFormats = (getInputSizeshNQ4ISI + 99) % 128;
            bArr2 = bVar.m26133().toString().getBytes();
        } else {
            bArr2 = null;
        }
        byte[] m250884 = util.h.xy.ar.b.m25088(bVar.m26131());
        byte[] m250885 = util.h.xy.ar.b.m25088(bVar.m26132());
        byte[] m250886 = util.h.xy.ar.b.m25088(bVar.m26142());
        byte[] m250887 = util.h.xy.ar.b.m25088(bVar.m26145());
        byte[] m250888 = util.h.xy.ar.b.m25088(bVar.m26134());
        byte[] m250889 = util.h.xy.ar.b.m25088(bVar.m26135());
        byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{6}, m25088);
        byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{7}, m250882);
        byte[] m251073 = util.h.xy.ar.mb.m25107(new byte[]{9}, m250883);
        byte[] m251074 = util.h.xy.ar.mb.m25107(new byte[]{8}, bytes);
        byte[] m251075 = util.h.xy.ar.mb.m25107(new byte[]{16}, bArr3);
        byte[] m251076 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.SYN}, bArr2);
        byte[] m251077 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.ETB}, m250884);
        byte[] m251078 = util.h.xy.ar.mb.m25107(new byte[]{10}, m250885);
        byte[] m251079 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.VT}, m250886);
        byte[] m2510710 = util.h.xy.ar.mb.m25107(new byte[]{14}, m250887);
        byte[] m2510711 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.FF}, m250888);
        byte[] m2510712 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.EM}, m250889);
        util.h.xy.ar.b.m25100(m25088, m250882, bytes, m250883, bArr2, m250884, m250885, m250886, m250887, m250888, m250889);
        byte[] m25090 = util.h.xy.ar.b.m25090(m25107, m251072, m251073, m251074, m251075, m251076, m251077, m251078, m251079, m2510710, m2510711, m2510712);
        util.h.xy.ar.b.m25100(m25107, m25107, m251073, m251074, m251075, m251076, m251077, m251078, m251079, m2510710, m2510711, m2510712);
        util.h.xy.t.mb.f2417.m27414(bArr, m25090);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26965(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 63;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(str, digitalizedCardState, true, true);
        } else {
            getHighSpeedVideoFpsRangesFor(str, digitalizedCardState, false, true);
        }
        getInputSizeshNQ4ISI = (getInputFormats + 5) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26944(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(str, digitalizedCardState, z, false);
        } else {
            getHighSpeedVideoFpsRangesFor(str, digitalizedCardState, z, false);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, boolean z, boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getInputSizeshNQ4ISI + 3) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        util.h.xy.d.b m26955 = m26955(bytes);
        int m26143 = m26955.m26143();
        int m26132 = m26955.m26132();
        int m26139 = m26955.m26139();
        util.h.xy.d.mg m26133 = m26955.m26133();
        if (m26133 == util.h.xy.d.mg.f1144) {
            util.h.xy.t.mb.f2417.m27443(bytes, m26143, m26133);
        } else if (m26133 == util.h.xy.d.mg.f1145) {
            getInputSizeshNQ4ISI = (getInputFormats + 57) % 128;
            if (m26955.m26142() != 0) {
                int m261322 = m26955.m26132() - 1;
                if (z2) {
                    util.h.xy.t.mb.f2417.m27451(bytes, m261322);
                } else {
                    m26957(m261322, m26133, bytes, util.h.xy.d.rb.a.f1148);
                }
            }
            for (int i = 1; i <= m26139; i++) {
                getInputSizeshNQ4ISI = (getInputFormats + 5) % 128;
                byte[] m27439 = util.h.xy.t.mb.f2417.m27439(bytes, m26132);
                if (m27439 != null && m27439.length > 0) {
                    m26143 = m26936(false, m27439).m26230();
                    util.h.xy.t.mb.f2417.m27443(bytes, m26143, m26133);
                    util.h.xy.t.mb.f2417.m27468(bytes, m26143, m26133);
                    util.h.xy.t.mb.f2417.m27424(bytes, m26143, m26133);
                    if (z2) {
                        util.h.xy.t.mb.f2417.m27451(bytes, m26132);
                    } else {
                        m26957(m26132, m26133, bytes, util.h.xy.d.rb.a.f1148);
                    }
                }
                m26143++;
                m26132++;
            }
        }
        int i2 = m26143;
        int i3 = m26132;
        if (!z) {
            if (z2) {
                if (m26133 == util.h.xy.d.mg.f1145) {
                    m26966(bytes, new util.h.xy.d.b(0, 0, m26955.m26141(), digitalizedCardState, true, m26955.m26133(), m26955.m26131(), 0, 0, 0, 0, 0));
                    return;
                }
                return;
            }
            m26966(bytes, new util.h.xy.d.b(i2, 0, m26955.m26141(), digitalizedCardState, true, m26955.m26133(), m26955.m26131(), i3, 0, m26955.m26145(), m26955.m26134(), 0));
            return;
        }
        util.h.xy.t.mb.f2417.m27465(bytes);
        if (m26133 == util.h.xy.d.mg.f1145) {
            int m261323 = m26955.m26132();
            for (int m26145 = m26955.m26145(); m26145 < m261323 + m26139; m26145++) {
                util.h.xy.t.mb.f2417.m27451(bytes, m26145);
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m26972(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27436 = util.h.xy.t.mb.f2417.m27436(util.h.xy.o.b.f2285);
        if (m27436 != null) {
            java.lang.String str = new java.lang.String(m27436, util.h.xy.h.a.f2221);
            java.lang.String str2 = new java.lang.String(bArr, util.h.xy.h.a.f2221);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71), "㗾", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr);
            java.lang.String[] split = str.split(((java.lang.String) objArr[0]).intern());
            int length = split.length;
            for (int i = 0; i < length; i++) {
                int i2 = getInputSizeshNQ4ISI + 101;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    if (str2.equals(split[i])) {
                        return bArr;
                    }
                } else {
                    str2.equals(split[i]);
                    throw new java.lang.ArithmeticException();
                }
            }
        }
        getInputSizeshNQ4ISI = (getInputFormats + 101) % 128;
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26961(byte[] bArr, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, util.h.xy.d.rd {
        java.lang.String[] split;
        boolean z2;
        byte[] bArr2;
        int length;
        byte[] m27436 = util.h.xy.t.mb.f2417.m27436(util.h.xy.o.b.f2285);
        if (m27436 == null) {
            byte[] bArr3 = new byte[bArr.length + 1];
            int i = getInputSizeshNQ4ISI + 103;
            getInputFormats = i % 128;
            int i2 = i % 2;
            split = null;
            bArr2 = bArr3;
            length = 0;
            z2 = false;
        } else {
            java.lang.String str = new java.lang.String(m27436, util.h.xy.h.a.f2221);
            java.lang.String str2 = new java.lang.String(bArr, util.h.xy.h.a.f2221);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 72), "㗾", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr);
            split = str.split(((java.lang.String) objArr[0]).intern());
            int length2 = split.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = false;
                    break;
                } else {
                    if (str2.equals(split[i3])) {
                        getInputSizeshNQ4ISI = (getInputFormats + 85) % 128;
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            bArr2 = new byte[m27436.length + bArr.length + 1];
            java.lang.System.arraycopy(m27436, 0, bArr2, 0, m27436.length);
            length = m27436.length;
            getInputFormats = (getInputSizeshNQ4ISI + 79) % 128;
        }
        if (z2) {
            if (z) {
                util.h.xy.k.ra raVar = f2243;
                util.h.xy.d.b m26955 = raVar.m26955(bArr);
                if (m26955 != null) {
                    raVar.m26966(bArr, new util.h.xy.d.b(m26955.m26143(), m26955.m26139(), m26955.m26141(), digitalizedCardState, m26955.m26138(), m26955.m26133(), m26955.m26131(), m26955.m26132(), m26955.m26142(), m26955.m26145(), m26955.m26134(), m26955.m26135()));
                    getInputFormats = (getInputSizeshNQ4ISI + 1) % 128;
                    return;
                }
                return;
            }
            throw new util.h.xy.d.rd(util.h.xy.i.b.f2222);
        }
        if (split != null && split.length >= 30) {
            throw new util.h.xy.d.rd(util.h.xy.i.b.f2233);
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, length, bArr.length);
        bArr2[length + bArr.length] = 44;
        util.h.xy.t.mb.f2417.m27431(util.h.xy.o.b.f2285, bArr2);
        f2243.m26966(bArr, util.h.xy.u.ra.m27544(digitalizedCardState));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26947(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.u.d.m27510(str);
        byte[] m27436 = util.h.xy.t.mb.f2417.m27436(util.h.xy.o.b.f2285);
        java.lang.String str2 = new java.lang.String(m27436, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27436);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        util.h.xy.t.mb.f2417.m27431(util.h.xy.o.b.f2285, str2.replace(sb.toString(), "").getBytes(util.h.xy.h.a.f2221));
        getInputSizeshNQ4ISI = (getInputFormats + 95) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26948(byte[] bArr, util.h.xy.d.mc mcVar, util.h.xy.d.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        getInputSizeshNQ4ISI = (getInputFormats + 35) % 128;
        try {
            if (mcVar.m26202() != null) {
                getHighSpeedVideoSizes(bArr, bVar, mcVar.m26202(), com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                i = mcVar.m26202().length;
            } else {
                i = 0;
            }
            if (mcVar.m26196() != null) {
                getHighSpeedVideoSizes(bArr, bVar, mcVar.m26196(), com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            }
            if (mcVar.m26198() != null) {
                int i2 = getInputSizeshNQ4ISI + 55;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    getHighSpeedVideoSizes(bArr, bVar, mcVar.m26198(), com.gemalto.mfs.mwsdk.dcm.PaymentType.QR);
                    int length = mcVar.m26198().length;
                    throw null;
                }
                getHighSpeedVideoSizes(bArr, bVar, mcVar.m26198(), com.gemalto.mfs.mwsdk.dcm.PaymentType.QR);
                i = mcVar.m26198().length;
            }
            if (mcVar.m26200() != null) {
                getHighSpeedVideoSizes(bArr, bVar, mcVar.m26200(), com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP);
                i = mcVar.m26200().length;
            }
            f2243.m26962(bArr, util.h.xy.u.ra.m27542(bVar), i);
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                int i3 = getInputSizeshNQ4ISI + 19;
                getInputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    mcVar.m26194();
                    throw new java.lang.ArithmeticException();
                }
                mcVar.m26194();
            }
            int i4 = getInputSizeshNQ4ISI + 107;
            getInputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                mcVar.m26194();
                getInputSizeshNQ4ISI = (getInputFormats + 49) % 128;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(byte[] bArr, util.h.xy.d.b bVar, util.h.xy.d.rc[] rcVarArr, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel2;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel3;
        int i;
        util.h.xy.d.mg mgVar;
        int i2;
        int i3;
        util.h.xy.d.mg mgVar2;
        byte[] bArr2;
        int i4;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel4;
        int m26143 = bVar.m26143();
        util.h.xy.d.mg m26133 = bVar.m26133();
        int m26132 = bVar.m26132();
        if (m26133 == util.h.xy.d.mg.f1144) {
            m26132 = 1;
        }
        java.lang.String m25099 = util.h.xy.ar.b.m25099();
        int length = rcVarArr.length;
        ?? r10 = 0;
        int i5 = m26143;
        int i6 = 0;
        while (i6 < length) {
            util.h.xy.d.rc rcVar = rcVarArr[i6];
            byte[] m26240 = rcVar.m26240();
            byte[] m26241 = rcVar.m26241();
            byte[] m26243 = rcVar.m26243();
            byte[] m26242 = rcVar.m26242();
            java.util.Arrays.toString(m26240);
            java.util.Arrays.toString(m26241);
            java.util.Arrays.toString(m26243);
            byte[] m26239 = rcVar.m26239();
            byte[] m26237 = rcVar.m26237();
            byte[] m25088 = util.h.xy.ar.b.m25088(rcVar.m26246());
            byte[] m250882 = util.h.xy.ar.b.m25088(rcVar.m26238());
            byte[] m26244 = rcVar.m26244();
            new java.lang.String(m26243, util.h.xy.h.a.f2221);
            byte[] m27439 = util.h.xy.t.mb.f2417.m27439(bArr, m26132);
            if (m27439 != null) {
                int i7 = getInputFormats + 27;
                getInputSizeshNQ4ISI = i7 % 128;
                if (i7 % 2 == 0) {
                    int length2 = m27439.length;
                    throw null;
                }
                if (m27439.length != 0) {
                    profileChannel = m26936((boolean) r10, m27439).m26235();
                    if (m27439.length == 0 && profileChannel != null) {
                        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                            profileChannel4 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                            getInputFormats = (getInputSizeshNQ4ISI + 59) % 128;
                        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                            getInputSizeshNQ4ISI = (getInputFormats + 87) % 128;
                            profileChannel4 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR;
                        } else {
                            profileChannel4 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS;
                        }
                        profileChannel3 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.get((byte) (profileChannel4.getCode()[r10] | profileChannel.getCode()[r10]));
                    } else if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                        profileChannel3 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS;
                    } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                        profileChannel3 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR;
                    } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                        getInputFormats = (getInputSizeshNQ4ISI + 97) % 128;
                        profileChannel3 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                    } else {
                        profileChannel2 = null;
                        int i8 = i6;
                        boolean z = r10;
                        util.h.xy.t.mb.f2417.m27452(bArr, m26132, m26949(new util.h.xy.d.rb(i5, util.h.xy.d.rb.a.f1149, m26242, m25099, m26237, new java.lang.String(m26243, util.h.xy.h.a.f2221), rcVar.m26238(), profileChannel2)));
                        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                            i2 = i8;
                            i3 = m26132;
                            i = length;
                            mgVar = m26133;
                            util.h.xy.t.mb.f2417.m27425(bArr, i5, m26241, m26240, m26243, m26242, m26239, m26237, m25088, m250882, m26244, m26133);
                        } else {
                            i = length;
                            mgVar = m26133;
                            i2 = i8;
                            i3 = m26132;
                            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                                util.h.xy.t.mb.f2417.m27444(bArr, i5, m26241, m26240, m26243, m26242, m26239, m26237, m25088, m250882, m26244, mgVar);
                            } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                                util.h.xy.t.mb.f2417.m27432(bArr, i5, m26241, m26240, m26243, m26242, null, null, m25088, m250882, m26244, mgVar);
                            }
                        }
                        mgVar2 = mgVar;
                        if (mgVar2 == util.h.xy.d.mg.f1144) {
                            bArr2 = m26243;
                            m26959(new java.lang.String(bArr, util.h.xy.h.a.f2221), new java.lang.String(bArr2), bVar.m26131(), bVar.m26134());
                        } else {
                            bArr2 = m26243;
                        }
                        if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                            int i9 = getInputFormats + 79;
                            getInputSizeshNQ4ISI = i9 % 128;
                            if (i9 % 2 == 0) {
                                i5 += 121;
                                i4 = i3 + 118;
                            } else {
                                i5++;
                                i4 = i3 + 1;
                            }
                        } else {
                            i4 = i3;
                        }
                        util.h.xy.ar.b.m25100(m26241, m26240, bArr2, m26237, m25088, m250882, m26244);
                        m26133 = mgVar2;
                        r10 = z;
                        length = i;
                        m26132 = i4;
                        i6 = i2 + 1;
                    }
                    profileChannel2 = profileChannel3;
                    int i82 = i6;
                    boolean z2 = r10;
                    util.h.xy.t.mb.f2417.m27452(bArr, m26132, m26949(new util.h.xy.d.rb(i5, util.h.xy.d.rb.a.f1149, m26242, m25099, m26237, new java.lang.String(m26243, util.h.xy.h.a.f2221), rcVar.m26238(), profileChannel2)));
                    if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                    }
                    mgVar2 = mgVar;
                    if (mgVar2 == util.h.xy.d.mg.f1144) {
                    }
                    if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                    }
                    util.h.xy.ar.b.m25100(m26241, m26240, bArr2, m26237, m25088, m250882, m26244);
                    m26133 = mgVar2;
                    r10 = z2;
                    length = i;
                    m26132 = i4;
                    i6 = i2 + 1;
                }
            }
            profileChannel = null;
            if (m27439.length == 0) {
            }
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            }
            profileChannel2 = profileChannel3;
            int i822 = i6;
            boolean z22 = r10;
            util.h.xy.t.mb.f2417.m27452(bArr, m26132, m26949(new util.h.xy.d.rb(i5, util.h.xy.d.rb.a.f1149, m26242, m25099, m26237, new java.lang.String(m26243, util.h.xy.h.a.f2221), rcVar.m26238(), profileChannel2)));
            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            }
            mgVar2 = mgVar;
            if (mgVar2 == util.h.xy.d.mg.f1144) {
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
            }
            util.h.xy.ar.b.m25100(m26241, m26240, bArr2, m26237, m25088, m250882, m26244);
            m26133 = mgVar2;
            r10 = z22;
            length = i;
            m26132 = i4;
            i6 = i2 + 1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.lang.String> m26932(java.lang.String str) throws org.json.JSONException {
        java.lang.String result = util.h.xy.k.ma.m26925().mo26151(str, util.h.xy.d.ma.f1140).getResult();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) ('A' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\r\n\t\u001f\t\u0003\b\u001a\f\u0004\n\u000f\u0004\u000f", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr);
        java.lang.String m27506 = util.h.xy.u.d.m27506(result, ((java.lang.String) objArr[0]).intern());
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = new org.json.JSONObject(m27506);
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
            getInputFormats = (getInputSizeshNQ4ISI + 113) % 128;
        }
        int i = getInputSizeshNQ4ISI + 121;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26951(java.lang.String str, java.lang.String str2) {
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        byte[] bytes2 = str2.getBytes(util.h.xy.h.a.f2221);
        try {
            try {
                util.h.xy.t.mb.f2417.m27426(bytes, bytes2);
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(java.lang.Boolean.TRUE, true, null);
                util.h.xy.ar.b.m25095(bytes);
                util.h.xy.ar.b.m25095(bytes2);
                getInputFormats = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                return raVar;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m27692 = util.h.xy.x.a.m27692((java.lang.Exception) e);
                util.h.xy.ar.b.m25095(bytes);
                util.h.xy.ar.b.m25095(bytes2);
                return m27692;
            }
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095(bytes);
            util.h.xy.ar.b.m25095(bytes2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m26934(java.lang.String str, util.h.xy.d.b bVar) {
        com.gemalto.mfs.mwsdk.exception.InternalComponentException e;
        int i;
        int i2;
        int i3;
        int i4 = getInputSizeshNQ4ISI + 99;
        getInputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            if (bVar.m26139() != 0) {
                int i5 = 0;
                try {
                    byte[] m27439 = util.h.xy.t.mb.f2417.m27439(bytes, (bVar.m26132() + bVar.m26139()) - 1);
                    if (util.h.xy.ar.b.m25068(m27439)) {
                        util.h.xy.d.b m26955 = f2243.m26955(bytes);
                        m26955.m26142();
                        i3 = m26955.m26142();
                        getInputSizeshNQ4ISI = (getInputFormats + 77) % 128;
                    } else {
                        i3 = 0;
                    }
                    try {
                        i = m26936(false, m27439).m26230();
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                        e = e2;
                        i5 = i3;
                        e.getMessage();
                        i = i5;
                        i2 = getInputSizeshNQ4ISI + 73;
                        getInputFormats = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                    e = e3;
                }
                i2 = getInputSizeshNQ4ISI + 73;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    return i + 1;
                }
                throw null;
            }
            int i6 = getInputFormats + 101;
            getInputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                return bVar.m26143();
            }
            bVar.m26143();
            throw null;
        }
        java.nio.charset.Charset charset = util.h.xy.h.a.f2221;
        bVar.m26139();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.util.List<util.h.xy.d.rb> m26964(byte[] bArr, int i, int i2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getInputSizeshNQ4ISI = (getInputFormats + 113) % 128;
        while (i <= i2) {
            getInputFormats = (getInputSizeshNQ4ISI + 45) % 128;
            byte[] m27439 = util.h.xy.t.mb.f2417.m27439(bArr, i);
            if (util.h.xy.ar.b.m25068(m27439)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("❊跐爌❎趆犆✣豦狅⟹谟煉➝賋煁♨貮熒☰譂熔⛒謄瀔⚦诎瀚╌讌烍╟評炎▢設罯▵誦缡⑫誰翤\u242f褦", 43711 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
            }
            arrayList.add(m26936(false, m27439));
            i++;
        }
        int i3 = getInputSizeshNQ4ISI + 93;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.d.rb m26933(boolean z, byte[] bArr, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getInputSizeshNQ4ISI + 73) % 128;
        util.h.xy.d.rb m26936 = m26936(z, util.h.xy.t.mb.f2417.m27439(bArr, i));
        getInputFormats = (getInputSizeshNQ4ISI + 103) % 128;
        return m26936;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26957(int i, util.h.xy.d.mg mgVar, byte[] bArr, util.h.xy.d.rb.a aVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (mgVar == util.h.xy.d.mg.f1144) {
            return;
        }
        byte[] m27439 = util.h.xy.t.mb.f2417.m27439(bArr, i);
        if (!util.h.xy.ar.b.m25068(m27439)) {
            util.h.xy.d.rb m26936 = m26936(false, m27439);
            m26936.m26227(getOutputSizes);
            java.lang.String m26229 = m26936.m26229();
            int i2 = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.d.mg mgVar2 = util.h.xy.d.mg.f1145;
                throw null;
            }
            if (mgVar == util.h.xy.d.mg.f1145) {
                getInputSizeshNQ4ISI = (getInputFormats + 9) % 128;
                if (aVar == util.h.xy.d.rb.a.f1146) {
                    int i3 = (getInputSizeshNQ4ISI + 25) % 128;
                    getInputFormats = i3;
                    int i4 = i3 + 57;
                    getInputSizeshNQ4ISI = i4 % 128;
                    if (i4 % 2 == 0) {
                        util.h.xy.ar.b.m25099();
                        throw null;
                    }
                    m26229 = util.h.xy.ar.b.m25099();
                }
            }
            m26960(bArr, i, new util.h.xy.d.rb(m26936, aVar, m26229));
            getInputFormats = (getInputSizeshNQ4ISI + 99) % 128;
        }
        int i5 = getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26960(byte[] bArr, int i, util.h.xy.d.rb rbVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i2 = getInputSizeshNQ4ISI + 7;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.t.mb.f2417.m27452(bArr, i, m26949(rbVar));
            getInputFormats = (getInputSizeshNQ4ISI + 101) % 128;
        } else {
            util.h.xy.t.mb.f2417.m27452(bArr, i, m26949(rbVar));
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26949(util.h.xy.d.rb rbVar) {
        byte[] bArr;
        getInputSizeshNQ4ISI = (getInputFormats + 67) % 128;
        java.lang.String str = getOutputSizes;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("✠绐铛⪣䂴\ue6d6㳫勻\ue8c6\u0ee4ꐆ行ဪ똾찶扔롘\ude4d瑉詭↕䞗鶌㏲䧵", 23027 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
        rbVar.m26234(str, ((java.lang.String) objArr[0]).intern());
        byte[] m25088 = util.h.xy.ar.b.m25088(rbVar.m26230());
        byte[] m250882 = util.h.xy.ar.b.m25088(rbVar.m26233().m26236());
        byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{6}, m25088);
        byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.SI}, m250882);
        byte[] m251073 = util.h.xy.ar.mb.m25107(new byte[]{4}, rbVar.m26228());
        byte[] m251074 = util.h.xy.ar.mb.m25107(new byte[]{13}, rbVar.m26229().getBytes());
        byte[] m251075 = util.h.xy.ar.mb.m25107(new byte[]{17}, rbVar.m26231());
        byte[] m251076 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.NAK}, rbVar.m26226().getBytes());
        byte[] m251077 = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.CAN}, util.h.xy.ar.b.m25088(rbVar.m26232()));
        if (rbVar.m26235() != null) {
            getInputFormats = (getInputSizeshNQ4ISI + 85) % 128;
            bArr = util.h.xy.ar.mb.m25107(new byte[]{com.google.common.base.Ascii.EM}, rbVar.m26235().getCode());
            getInputFormats = (getInputSizeshNQ4ISI + 41) % 128;
        } else {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        util.h.xy.ar.b.m25100(m25088, m250882);
        return util.h.xy.ar.b.m25090(m25107, m251072, m251073, m251074, m251075, m251076, m251077, bArr2);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.d.rb m26936(boolean z, byte[] bArr) {
        util.h.xy.ar.mb mbVar;
        getInputSizeshNQ4ISI = (getInputFormats + 35) % 128;
        util.h.xy.ar.mb[] m25063 = util.h.xy.ar.a.m25063(bArr, new byte[]{6}, new byte[]{com.google.common.base.Ascii.SI}, new byte[]{4}, new byte[]{13}, new byte[]{17}, new byte[]{com.google.common.base.Ascii.NAK}, new byte[]{com.google.common.base.Ascii.CAN}, new byte[]{com.google.common.base.Ascii.EM});
        int length = m25063.length;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        for (int i = 0; i < length; i++) {
            int i2 = getInputSizeshNQ4ISI + 29;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                mbVar = m25063[i];
                byte b = mbVar.m25111()[0];
                if (b != 4) {
                    if (b != 6) {
                        if (b != 13) {
                            if (b != 15) {
                                if (b != 17) {
                                    if (b != 21) {
                                        if (b != 24) {
                                            if (b != 25) {
                                            }
                                            bArr9 = mbVar.m25110();
                                        }
                                        bArr8 = mbVar.m25110();
                                    }
                                    bArr7 = mbVar.m25110();
                                }
                                bArr6 = mbVar.m25110();
                            }
                            bArr3 = mbVar.m25110();
                        }
                        bArr5 = mbVar.m25110();
                    }
                    bArr2 = mbVar.m25110();
                }
                bArr4 = mbVar.m25110();
            } else {
                mbVar = m25063[i];
                byte b2 = mbVar.m25111()[1];
                if (b2 == 4) {
                    bArr4 = mbVar.m25110();
                } else if (b2 == 6) {
                    bArr2 = mbVar.m25110();
                } else if (b2 == 13) {
                    bArr5 = mbVar.m25110();
                } else if (b2 == 15) {
                    bArr3 = mbVar.m25110();
                } else if (b2 == 17) {
                    bArr6 = mbVar.m25110();
                } else if (b2 == 21) {
                    bArr7 = mbVar.m25110();
                } else {
                    if (b2 != 24) {
                        if (b2 != 25) {
                        }
                        bArr9 = mbVar.m25110();
                    }
                    bArr8 = mbVar.m25110();
                }
            }
        }
        return util.h.xy.u.rb.m27546(z, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9).getResult();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26938(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 119;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            util.h.xy.u.d.m27510(str);
            util.h.xy.t.mb.f2417.m27460(str.getBytes(util.h.xy.h.a.f2221), digitalizedCardState.toString().getBytes());
            if (digitalizedCardState == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED && f2243.m26968(str)) {
                getInputSizeshNQ4ISI = (getInputFormats + 55) % 128;
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192);
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185);
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190);
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186);
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198);
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199);
                getInputSizeshNQ4ISI = (getInputFormats + 75) % 128;
                return;
            }
            return;
        }
        util.h.xy.u.d.m27510(str);
        util.h.xy.t.mb.f2417.m27460(str.getBytes(util.h.xy.h.a.f2221), digitalizedCardState.toString().getBytes());
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2 = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED;
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26937(byte[] bArr) {
        getInputFormats = (getInputSizeshNQ4ISI + 87) % 128;
        try {
            byte[] m27438 = util.h.xy.t.mb.f2417.m27438(bArr);
            getInputSizeshNQ4ISI = (getInputFormats + 101) % 128;
            return m27438;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26939(byte[] bArr, java.lang.String str, java.lang.String str2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(util.h.xy.s.ma.f2373);
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            }
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            java.lang.String string = jSONObject2.getString(util.h.xy.s.ma.f2375);
            java.lang.String string2 = jSONObject2.getString(util.h.xy.s.ma.f2339);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("✬Ỵ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14813, objArr);
            if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(string)) {
                getInputFormats = (getInputSizeshNQ4ISI + 31) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("✭쿏", 59617 - android.view.View.getDefaultSize(0, 0), objArr2);
                if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(string2)) {
                    jSONObject2.put(util.h.xy.s.ma.f2370, str2);
                    jSONArray.put(i, jSONObject2);
                    break;
                }
            }
            i++;
        }
        jSONObject.put(util.h.xy.s.ma.f2373, jSONArray);
        util.h.xy.t.mb.f2417.m27411(bArr, jSONObject.toString().getBytes(util.h.xy.h.a.f2221));
        int i2 = getInputSizeshNQ4ISI + 11;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f A[SYNTHETIC] */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26959(java.lang.String str, java.lang.String str2, long j, long j2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bytes;
        org.json.JSONArray m26942;
        int i;
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject;
        byte b;
        int i2;
        java.lang.String str3;
        long j3 = j2;
        try {
            byte[] m26781 = util.h.xy.f.b.f2201.m26781();
            java.lang.String str4 = "\u0014\u0006\u0004\u0013\b\u0002\u0015\u0002\u0006\u0014";
            if (m26781 != null) {
                int i3 = getInputFormats + 89;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    if (m26781.length == 0) {
                    }
                    new java.lang.String(m26781, util.h.xy.h.a.f2221);
                    m26942 = m26942(m26781);
                    i = 0;
                    while (true) {
                        if (i < m26942.length()) {
                        }
                        i++;
                        str4 = str3;
                        j3 = j2;
                    }
                    bytes = jSONArray.toString().getBytes(util.h.xy.h.a.f2221);
                    util.h.xy.f.b.f2201.m26778(bytes);
                }
                if (1 == m26781.length) {
                }
                new java.lang.String(m26781, util.h.xy.h.a.f2221);
                m26942 = m26942(m26781);
                i = 0;
                while (true) {
                    if (i < m26942.length()) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) (android.graphics.Color.red(0) + 86), "\u0004\u0003\u000e\t\u0017 㘴", 8 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                        jSONObject2.put(((java.lang.String) objArr[0]).intern(), str);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25321, objArr2);
                        jSONObject2.put(((java.lang.String) objArr2[0]).intern(), str2);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) (63 - android.text.TextUtils.indexOf("", "", 0, 0)), "\u0015\u001f\u0015\b\f\"㘨", 7 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                        jSONObject2.put(((java.lang.String) objArr3[0]).intern(), j);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((byte) (102 - android.graphics.Color.blue(0)), str4, 10 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                        jSONObject2.put(((java.lang.String) objArr4[0]).intern(), j2);
                        jSONArray = m26942;
                        jSONArray.put(jSONObject2);
                        break;
                    }
                    int i4 = getInputSizeshNQ4ISI + 97;
                    getInputFormats = i4 % 128;
                    if (i4 % 2 != 0) {
                        jSONObject = m26942.getJSONObject(i);
                        b = (byte) (22 << (android.os.SystemClock.uptimeMillis() > 1L ? 1 : (android.os.SystemClock.uptimeMillis() == 1L ? 0 : -1)));
                        i2 = 77;
                    } else {
                        jSONObject = m26942.getJSONObject(i);
                        b = (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 85);
                        i2 = 6;
                    }
                    try {
                        str3 = str4;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(b, "\u0004\u0003\u000e\t\u0017 㘴", i2 + (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr5);
                        if (jSONObject.getString(((java.lang.String) objArr5[0]).intern()).equals(str)) {
                            getInputFormats = (getInputSizeshNQ4ISI + 89) % 128;
                            org.json.JSONObject jSONObject3 = m26942.getJSONObject(i);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 25321, objArr6);
                            jSONObject3.put(((java.lang.String) objArr6[0]).intern(), str2);
                            org.json.JSONObject jSONObject4 = m26942.getJSONObject(i);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (63 - android.view.KeyEvent.getDeadChar(0, 0)), "\u0015\u001f\u0015\b\f\"㘨", '7' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr7);
                            jSONObject4.put(((java.lang.String) objArr7[0]).intern(), j);
                            org.json.JSONObject jSONObject5 = m26942.getJSONObject(i);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (android.view.KeyEvent.keyCodeFromString("") + 102), str3, 11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
                            jSONObject5.put(((java.lang.String) objArr8[0]).intern(), j2);
                            jSONArray = m26942;
                            break;
                        }
                        i++;
                        str4 = str3;
                        j3 = j2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                bytes = jSONArray.toString().getBytes(util.h.xy.h.a.f2221);
                util.h.xy.f.b.f2201.m26778(bytes);
            }
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 86), "\u0004\u0003\u000e\t\u0017 㘴", 7 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr9);
            jSONObject6.put(((java.lang.String) objArr9[0]).intern(), str);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", 25322 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
            jSONObject6.put(((java.lang.String) objArr10[0]).intern(), str2);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 64), "\u0015\u001f\u0015\b\f\"㘨", android.graphics.Color.argb(0, 0, 0, 0) + 7, objArr11);
            jSONObject6.put(((java.lang.String) objArr11[0]).intern(), j);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 102), "\u0014\u0006\u0004\u0013\b\u0002\u0015\u0002\u0006\u0014", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr12);
            jSONObject6.put(((java.lang.String) objArr12[0]).intern(), j3);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(jSONObject6);
            bytes = jSONArray2.toString().getBytes(util.h.xy.h.a.f2221);
            util.h.xy.f.b.f2201.m26778(bytes);
        } catch (org.json.JSONException e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final org.json.JSONArray m26942(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 51;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                if (util.h.xy.ar.b.m25070(bArr)) {
                    return new org.json.JSONArray();
                }
                org.json.JSONArray m26954 = m26954(new org.json.JSONArray(new java.lang.String(bArr, util.h.xy.h.a.f2221)));
                getInputSizeshNQ4ISI = (getInputFormats + 35) % 128;
                return m26954;
            }
            util.h.xy.ar.b.m25070(bArr);
            throw null;
        } catch (org.json.JSONException e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a4, code lost:
    
        if (r9.has(((java.lang.String) r2[0]).intern()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a6, code lost:
    
        r0 = util.h.xy.k.ra.getInputSizeshNQ4ISI + 1;
        util.h.xy.k.ra.getInputFormats = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if ((r0 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        r2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", 12375 - android.view.KeyEvent.getDeadChar(1, 1), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c8, code lost:
    
        if (r9.optString(((java.lang.String) r2[0]).intern(), null) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        r2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 63), "\u0015\u001f\u0015\b\f\"㘨", 6 - android.widget.ExpandableListView.getPackedPositionChild(0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        if (r9.has(((java.lang.String) r2[0]).intern()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010a, code lost:
    
        r0 = util.h.xy.k.ra.getInputSizeshNQ4ISI + 29;
        util.h.xy.k.ra.getInputFormats = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0116, code lost:
    
        if ((r0 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0118, code lost:
    
        r6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() - 79) * 61), "\u0014\u0006\u0004\u0013\b\u0002\u0015\u0002\u0006\u0014", 60 >>> (android.graphics.PointF.length(1.0f, 2.0f) > 0.0f ? 1 : (android.graphics.PointF.length(1.0f, 2.0f) == 0.0f ? 0 : -1)), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0140, code lost:
    
        if (r9.has(((java.lang.String) r6[0]).intern()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0167, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0143, code lost:
    
        r6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 102), "\u0014\u0006\u0004\u0013\b\u0002\u0015\u0002\u0006\u0014", 10 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0165, code lost:
    
        if (r9.has(((java.lang.String) r6[0]).intern()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        r2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", android.view.KeyEvent.getDeadChar(0, 0) + 25321, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if (r9.optString(((java.lang.String) r2[0]).intern(), null) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r9.has(((java.lang.String) r6[0]).intern()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r9.has(((java.lang.String) r6[0]).intern()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005e, code lost:
    
        util.h.xy.k.ra.getInputSizeshNQ4ISI = (util.h.xy.k.ra.getInputFormats + 95) % 128;
        r6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (86 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), "\u0004\u0003\u000e\t\u0017 㘴", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r9.optString(((java.lang.String) r6[0]).intern(), null) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("❸䖌\ue2bf࿏곋짩瘯錣〡嵉", 25322 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), r2);
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26967(org.json.JSONObject jSONObject) {
        int i = getInputFormats + 51;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (104 % (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0004\u0003\u000e\t\u0017 㘴", 18 % android.text.TextUtils.indexOf((java.lang.CharSequence) "", 'D', 0), objArr);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 86), "\u0004\u0003\u000e\t\u0017 㘴", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, objArr2);
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final org.json.JSONArray m26954(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = getInputFormats + 1;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (m26967(jSONObject)) {
                        jSONArray2.put(jSONObject);
                    }
                } else {
                    m26967(jSONArray.getJSONObject(i));
                    throw null;
                }
            }
            return jSONArray2;
        }
        getInputSizeshNQ4ISI = (getInputFormats + 113) % 128;
        return jSONArray;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26970(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr;
        byte[] m26781 = util.h.xy.f.b.f2201.m26781();
        if (m26781 != null) {
            int i = getInputFormats + 11;
            getInputSizeshNQ4ISI = i % 128;
            boolean z = true;
            if (i % 2 != 0 ? m26781.length != 0 : 1 != m26781.length) {
                new java.lang.String(m26781, util.h.xy.h.a.f2221);
                try {
                    org.json.JSONArray m26942 = m26942(m26781);
                    if (m26942.length() > 1) {
                        getInputSizeshNQ4ISI = (getInputFormats + 111) % 128;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= m26942.length()) {
                                z = false;
                                break;
                            }
                            getInputSizeshNQ4ISI = (getInputFormats + 55) % 128;
                            org.json.JSONObject jSONObject = m26942.getJSONObject(i2);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 87), "\u0004\u0003\u000e\t\u0017 㘴", 6 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
                            if (jSONObject.getString(((java.lang.String) objArr[0]).intern()).equals(str)) {
                                getInputSizeshNQ4ISI = (getInputFormats + 11) % 128;
                                m26942.remove(i2);
                                break;
                            } else {
                                i2++;
                                int i3 = getInputFormats + 47;
                                getInputSizeshNQ4ISI = i3 % 128;
                                int i4 = i3 % 2;
                            }
                        }
                        bArr = m26942.toString().getBytes(util.h.xy.h.a.f2221);
                    } else {
                        if (m26942.length() == 1) {
                            org.json.JSONObject jSONObject2 = m26942.getJSONObject(0);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap((byte) (86 - android.text.TextUtils.getCapsMode("", 0, 0)), "\u0004\u0003\u000e\t\u0017 㘴", android.view.Gravity.getAbsoluteGravity(0, 0) + 7, objArr2);
                            if (jSONObject2.getString(((java.lang.String) objArr2[0]).intern()).equals(str)) {
                                getInputSizeshNQ4ISI = (getInputFormats + 35) % 128;
                                m26942.remove(0);
                                bArr = null;
                            }
                        }
                        z = false;
                        bArr = null;
                    }
                    if (z) {
                        util.h.xy.f.b.f2201.m26778(bArr);
                        return;
                    }
                    return;
                } catch (org.json.JSONException e) {
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage());
                }
            }
        }
        int i5 = getInputSizeshNQ4ISI + 61;
        getInputFormats = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 3;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950(java.lang.String str) {
        int i = getInputFormats + 25;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m26973(str).getResult();
            throw null;
        }
        java.lang.String result = m26973(str).getResult();
        if (result == null) {
            return util.h.xy.x.a.m27695();
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26941 = m26941(result);
        if (m26941.isSuccessful()) {
            int i2 = getInputSizeshNQ4ISI + 29;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                m26941.getResult();
                throw null;
            }
            if (m26941.getResult() != null && m26941.getResult().m26180() != null) {
                if (str.equals(m26941.getResult().m26180())) {
                    return m26941;
                }
                int i3 = getInputSizeshNQ4ISI + 103;
                getInputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    m26973(m26941.getResult().m26180()).getResult();
                    throw null;
                }
                java.lang.String result2 = m26973(m26941.getResult().m26180()).getResult();
                if (result2 != null) {
                    return m26941(result2);
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m27695 = util.h.xy.x.a.m27695();
                getInputFormats = (getInputSizeshNQ4ISI + 53) % 128;
                return m27695;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), " \u0004\u000e\t\u0017\b\u001f\u000b\t#\u001d\u0011\u001a\b\u0005\t\u0000\u0013\u001f\u0015\f\u0016㘀", 23 - android.view.KeyEvent.normalizeMetaState(0), objArr);
        return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26941(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m27688;
        util.h.xy.d.d dVar;
        int i = getInputSizeshNQ4ISI + 87;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            if (!util.h.xy.u.d.m27518(str)) {
                return util.h.xy.x.a.m27695();
            }
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            try {
                try {
                    byte[] m27429 = util.h.xy.t.mb.f2417.m27429(bytes);
                    if (!util.h.xy.ar.b.m25068(m27429)) {
                        java.lang.String str2 = new java.lang.String(m27429, util.h.xy.h.a.f2221);
                        if (Camera2StreamConfigurationMap(str2)) {
                            dVar = new util.h.xy.d.d(m27429);
                        } else {
                            util.h.xy.d.d dVar2 = new util.h.xy.d.d(str);
                            dVar2.m26178(str2);
                            util.h.xy.t.mb.f2417.m27454(bytes, dVar2.m26176());
                            dVar = dVar2;
                        }
                        util.h.xy.ar.b.m25095(m27429);
                        m27688 = new util.h.xy.an.ra<>(dVar, true, null);
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("❜駘媣ᯝ\udce2鴁席ἷ큏酵压ᓪ헂雝埩ࠒ쥭詡䭃ෂ캑辵䃀Ʈ숋茯䐫Ԛ왳뢉禮㫈ﮝ볾紘㸧ｇ끠狃㎚\uf4bc뗗盦㜞\ue820ꤰ樛\u2b75\ued8c꺺濃₢\ue1d0ꈰ", 48869 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                        m27688 = util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                        int i2 = getInputFormats + 49;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 5 / 4;
                        }
                    }
                    return m27688;
                } finally {
                    util.h.xy.ar.b.m25095(bytes);
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException e) {
                return util.h.xy.x.a.m27692(e);
            }
        }
        util.h.xy.u.d.m27518(str);
        throw new java.lang.ArithmeticException();
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            new org.json.JSONObject(str);
            int i = getInputSizeshNQ4ISI;
            getInputFormats = (i + 49) % 128;
            getInputFormats = (i + 59) % 128;
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final boolean m26968(java.lang.String str) {
        int i = getInputFormats + 51;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26945 = m26945(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            if (m26945 == null || m26945.getResult() == null || !m26945.getResult().booleanValue()) {
                getInputFormats = (getInputSizeshNQ4ISI + 95) % 128;
                return false;
            }
            getInputFormats = (getInputSizeshNQ4ISI + 35) % 128;
            return true;
        }
        m26945(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26945(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> raVar;
        getInputSizeshNQ4ISI = (getInputFormats + 65) % 128;
        try {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> mo26161 = util.h.xy.k.ma.m26925().mo26161(paymentType);
            if (mo26161.isSuccessful()) {
                java.lang.String result = mo26161.getResult();
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = f2243.m26950(str);
                if (util.h.xy.u.d.m27514(m26950)) {
                    raVar = util.h.xy.x.a.m27696(java.lang.Boolean.valueOf(result.equals(m26950.getResult().m26180())));
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("❔땜̷釵濓ﶘ䩦\ud838뙅ә銤潵ﵙ䬑\ud9e1랹փ鉶恳︎䳞\udab2뜷Փ錚懸ﾰ䶁\uda57꠩", 37423 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                    raVar = new util.h.xy.an.ra<>(((java.lang.String) objArr[0]).intern(), 1009);
                }
            } else {
                int errorCode = mo26161.getErrorCode();
                if (errorCode == 1010 || errorCode == 1009) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("❔땜̷釵濓ﶘ䩦\ud838뙅ә銤潵ﵙ䬑\ud9e1랹փ鉶恳︎䳞\udab2뜷Փ錚懸ﾰ䶁\uda57꠩", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37423, objArr2);
                    raVar = new util.h.xy.an.ra<>(((java.lang.String) objArr2[0]).intern(), 1009);
                } else {
                    util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(null, mo26161.isSuccessful(), mo26161.getErrorMessage(), mo26161.getErrorCode());
                    int i = getInputFormats + 5;
                    getInputSizeshNQ4ISI = i % 128;
                    int i2 = i % 2;
                    raVar = raVar2;
                }
            }
            int i3 = getInputFormats + 41;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return raVar;
            }
            throw null;
        } catch (java.lang.Exception e) {
            return util.h.xy.x.a.m27692(e);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final java.lang.Boolean m26940(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = m26950(str);
        if (util.h.xy.u.d.m27514(m26950)) {
            java.lang.String m26179 = m26950.getResult().m26179();
            boolean z = false;
            if (m26179 != null && m26179.equals(str)) {
                getInputFormats = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        int i = getInputSizeshNQ4ISI + 83;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26973(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m27688;
        getInputSizeshNQ4ISI = (getInputFormats + 33) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        try {
            byte[] m27457 = util.h.xy.t.mb.f2417.m27457(bytes, util.h.xy.d.ma.f1140);
            if (!util.h.xy.ar.b.m25068(m27457)) {
                java.lang.String str2 = new java.lang.String(m27457, util.h.xy.h.a.f2221);
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) (86 - android.graphics.Color.alpha(0)), "\u0004\u0003\u000e\t\u0017 㘴", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, objArr);
                m27688 = new util.h.xy.an.ra<>(util.h.xy.u.d.m27506(str2, ((java.lang.String) objArr[0]).intern()), true, null);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("❞橏봉샠Ᏹꚦ\ue84a㬌令醿⒏癟륙쳮Ᾰꊅ\uf45eݞ䫥鶻ₕ爒蔚죰ᮼ꺕\uf047͝", 19763 - android.text.TextUtils.getTrimmedLength(""), objArr2);
                m27688 = util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr2[0]).intern());
                getInputFormats = (getInputSizeshNQ4ISI + 69) % 128;
            }
            return m27688;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            return util.h.xy.x.a.m27692((java.lang.Exception) e);
        } finally {
            util.h.xy.ar.b.m25095(bytes);
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = -3775865746218902990L;
        getHighSpeedVideoFpsRanges = -1454384049;
        isOutputSupportedFor = -408873055;
        getOutputStallDuration = -851023164;
        getOutputSizeshNQ4ISI = new byte[]{64, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 120, com.google.common.base.Ascii.RS, -89, 97, 103, com.google.common.base.Ascii.SUB, -126, 114, 104, 68, 122, 111, 123, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -86, 72, 98, 68, -13, -107, -32, -20, -27, -17, -9, -28, -97, -124, -105, 44, -28, -97, -28, -73, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -25, -99, -23, -17, -108, -32, -12, -89, -33, -3, -105, -23, 18, com.google.common.base.Ascii.EM, 17, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 87, com.google.common.base.Ascii.SI, 5, 66, 10, 110, 10, com.google.common.base.Ascii.EM, 13, 42, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 110, com.google.common.base.Ascii.RS, 102, 60, 69, com.google.common.base.Ascii.SI, 5, 56, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 16, com.google.common.base.Ascii.SYN, 98, com.google.common.base.Ascii.CAN, 13, com.google.common.base.Ascii.EM, 109, -48, 72, 118, 0, 98, 68, 84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 78, 109, 124, -106, 82, 75, 94, 78, 70, com.google.common.base.Ascii.FS, -99, 126, -94, 124, 94, -19, -25, -101, -115, -19, -111, -104, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 47, -97, -107, -31, -25, -116, -104, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -41, -11, -113, -31, -90, 77, -85, 80, 89, 118, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -28, 80, 83, -85, 80, 89, 86, 111, -108, -91, -92, -89, 72, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 87, -40, -40, -40, -40, -40, -40};
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputStallDurationlomOqCM = -950625039240457082L;
        unwrapAs = new char[]{41904, 41900, 41907, 41896, 41866, 41919, 41874, 41912, 41913, 41880, 41915, 41980, 41030, 41970, 41914, 41911, 41917, 41871, 41902, 41905, 41906, 41968, 41887, 41903, 41916, 41031, 41881, 41872, 41885, 41882, 41893, 41918, 41897, 41909, 41864, 41877};
        getOutputFormats = (char) 38464;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 61) % 128;
        Camera2StreamConfigurationMap = new byte[]{com.google.common.base.Ascii.NAK, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 67, 44};
        getHighResolutionOutputSizeshNQ4ISI = 81;
        int i2 = i + 37;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
