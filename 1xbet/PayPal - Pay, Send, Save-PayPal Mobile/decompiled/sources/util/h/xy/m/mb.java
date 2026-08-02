package util.h.xy.m;

/* loaded from: classes5.dex */
public class mb implements util.h.xy.d.c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static char getOutputMinFrameDuration;
    private static util.h.xy.m.mb getOutputSizes;
    private static int[] getOutputStallDuration;

    static {
        getHighSpeedVideoSizes();
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int i2 = i + 21;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        getHighSpeedVideoFpsRanges = true;
        getInputSizeshNQ4ISI = util.h.xy.m.mb.class.getName();
        getOutputSizes = null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.m.mb m26975(android.content.Context context) {
        util.h.xy.m.mb mbVar;
        synchronized (util.h.xy.m.mb.class) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            if (getOutputSizes == null) {
                getOutputSizes = new util.h.xy.m.mb();
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 57) % 128;
            }
            mbVar = getOutputSizes;
        }
        return mbVar;
    }

    private mb() {
        util.h.xy.f.b.f2201.m26787();
    }

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getOutputStallDuration;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i3 = 0;
            while (i3 < length2) {
                int i4 = Camera2StreamConfigurationMap + 23;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    iArr4[i3] = (int) (iArr3[i3] + 5569649899877129369L);
                    i3 >>= 1;
                } else {
                    iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getOutputStallDuration;
        if (iArr6 != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 101;
            int i6 = i5 % 128;
            Camera2StreamConfigurationMap = i6;
            if (i5 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            getHighResolutionOutputSizeshNQ4ISI = (i6 + 97) % 128;
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i7 = 0; i7 < 16; i7++) {
                cVar.f2627 ^= iArr5[i7];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i8 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i8;
            }
            int i9 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i9;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i10 = cVar.f2627;
            int i11 = cVar.f2625;
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("嚼뀧⧿Ⲵ", 4 - android.view.View.resolveSize(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("珢룐ꄤ플揞옮", 6 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        try {
            util.h.xy.da.mc.m26263(util.h.xy.ag.a.m24556().m24558());
            int i = getHighSpeedVideoSizesFor + 55;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 3;
            }
            try {
                util.h.xy.by.ma.f1067.m25804(util.h.xy.ag.a.m24556().m24558());
                try {
                    util.h.xy.ak.b.f76.m24963(util.h.xy.ag.a.m24556().m24558());
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 89) % 128;
                    try {
                        util.h.xy.t.mb.f2417.m27466(util.h.xy.ag.a.m24556().m24558());
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{383074228, -1547281397, 1759546969, -618187875}, 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr3[0]).intern(), util.h.xy.al.rc.m25022(e));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1390182867, 809143396, -969594982, -1799988668, 34767436, -1428178318, 507604792, -1822614221, 1647526077, -586540013, -1211577997, -29918244, -2037506137, -287816256, 1575224409, 665936695, -450162505, 886400111, -2093233, -705664687, 119313678, -307174, 1944808021, -1339927592}, 46 - android.graphics.Color.green(0), objArr4);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr4[0]).intern(), e);
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{974992121, 1914961964, 1759546969, -618187875}, 5 - android.text.TextUtils.getOffsetAfter("", 0), objArr5);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr5[0]).intern(), util.h.xy.al.rc.m25022(e2));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{1390182867, 809143396, -969594982, -1799988668, 34767436, -1428178318, 507604792, -1822614221, 1647526077, -586540013, -1211577997, -29918244, -569994904, 1108451509, -1473192158, 1501065894, -1831014880, -60732161, 252116961, -1029863148, -974483289, -1832794248, -1754635601, 454260252, -1270405829, -184867016}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49, objArr6);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr6[0]).intern(), e2);
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1098173680, -845439237, 1759546969, -618187875}, 4 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr7);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr7[0]).intern(), util.h.xy.al.rc.m25022(e3));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes("龾㡼ჳ痚䵊鿨④偅渟\u2fd7㗓懑쵗럫྅얓辐⮃걤\udb7a䠝嘠攕ﾐ\uf07d괡煋簅双薥\ue63b汄虋ᚻ쵗럫埨匾趶⡝뺆䴬撌觵醟袰꣯\ue279⟁토", android.text.TextUtils.indexOf("", "") + 49, objArr8);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr8[0]).intern(), e3);
            }
        } catch (util.h.xy.da.b e4) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-2109288134, -23599872, 1759546969, -618187875}, android.text.TextUtils.getTrimmedLength("") + 5, objArr9);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr9[0]).intern(), util.h.xy.al.rc.m25022(e4));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{1364153244, -1844661506, 1587566684, -1650161661, -1259641499, 1628596989, 601651760, -1836383227, -1111385217, 1174247741, 80612592, 1653029597, -956645967, 1833444746, 1063230322, -864942920, 507519519, -738407153, -344731161, 1364485348}, 38 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr10);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr10[0]).intern(), e4);
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 23;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 67;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i5 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 41) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("嚼뀧⧿Ⲵ", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int[] iArr = {-2141217557, 1101712630, 905116550, 755192342};
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i + 81) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 95) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(iArr, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 6, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            util.h.xy.cc.ma.m25860().m25868();
            util.h.xy.k.ra.f2243.m26943();
            util.h.xy.f.b.f2201.m26787();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3 A[Catch: all -> 0x02af, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0017, B:12:0x0026, B:15:0x002f, B:18:0x0038, B:21:0x0041, B:23:0x006b, B:25:0x0071, B:30:0x0083, B:33:0x008b, B:34:0x0120, B:36:0x012a, B:37:0x026d, B:42:0x0130, B:43:0x014b, B:45:0x014f, B:47:0x015d, B:49:0x0169, B:51:0x0173, B:52:0x0183, B:53:0x0186, B:54:0x0187, B:56:0x018d, B:58:0x019f, B:60:0x01ab, B:61:0x01bb, B:62:0x01ca, B:63:0x01cb, B:65:0x01d1, B:67:0x01db, B:68:0x01ed, B:70:0x0212, B:73:0x021e, B:75:0x0226, B:77:0x0230, B:79:0x0236, B:80:0x0242, B:83:0x0260, B:89:0x026c, B:91:0x0273, B:92:0x0291, B:98:0x0297, B:100:0x02a3, B:103:0x02a9, B:85:0x0265, B:86:0x026a), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a9 A[Catch: all -> 0x02af, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0017, B:12:0x0026, B:15:0x002f, B:18:0x0038, B:21:0x0041, B:23:0x006b, B:25:0x0071, B:30:0x0083, B:33:0x008b, B:34:0x0120, B:36:0x012a, B:37:0x026d, B:42:0x0130, B:43:0x014b, B:45:0x014f, B:47:0x015d, B:49:0x0169, B:51:0x0173, B:52:0x0183, B:53:0x0186, B:54:0x0187, B:56:0x018d, B:58:0x019f, B:60:0x01ab, B:61:0x01bb, B:62:0x01ca, B:63:0x01cb, B:65:0x01d1, B:67:0x01db, B:68:0x01ed, B:70:0x0212, B:73:0x021e, B:75:0x0226, B:77:0x0230, B:79:0x0236, B:80:0x0242, B:83:0x0260, B:89:0x026c, B:91:0x0273, B:92:0x0291, B:98:0x0297, B:100:0x02a3, B:103:0x02a9, B:85:0x0265, B:86:0x026a), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x002e  */
    @Override // util.h.xy.d.c
    /* renamed from: ᐝ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26172(java.lang.String str, util.h.xy.d.me meVar, boolean z) {
        boolean z2;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26175;
        boolean z3;
        synchronized (this) {
            util.h.xy.u.d.m27510(str);
            util.h.xy.u.d.m27511(meVar);
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            try {
                try {
                    if (util.h.xy.k.ra.f2243.m26972(bytes) == null) {
                        int i = getHighSpeedVideoSizesFor + 13;
                        getHighSpeedVideoFpsRangesFor = i % 128;
                        if (i % 2 == 0) {
                            z2 = false;
                            boolean z4 = meVar.m26215() == null;
                            boolean z5 = meVar.m26217() == null;
                            boolean z6 = meVar.m26213() == null;
                            java.lang.String m26212 = meVar.m26212();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes("컢媳✗郵˒\ue90f\udc00⦨", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr);
                            mo26175 = mo26175(util.h.xy.u.d.m27506(m26212, ((java.lang.String) objArr[0]).intern()));
                            if (mo26175.isSuccessful() || mo26175.getResult() == null) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("᪆碚窍锱妋ࠥ녔돬飵\ue8cfフ觠⎆\ue300寤塂㭄ϱ྅얓朦\ue9b2\udbbbʡೀꓒ", 25 - android.text.TextUtils.getTrimmedLength(""), objArr2);
                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(509, ((java.lang.String) objArr2[0]).intern());
                            }
                            util.h.xy.k.ra.f2243.m26961(bytes, meVar.m26216(), z);
                            if (!z2) {
                                z3 = false;
                            } else {
                                if (!z4 && !z5 && !z6) {
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26911 = util.h.xy.k.b.m26911(str, util.h.xy.d.ma.f1140);
                                    try {
                                        org.json.JSONObject jSONObject = new org.json.JSONObject(meVar.m26212());
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("⡯\ue44a\ue70b狰埯茢ຆꉼ쑶岘賠ᵮ픗槥", (-16777202) - android.graphics.Color.rgb(0, 0, 0), objArr3);
                                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr3[0]).intern());
                                        m26911.getResult();
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(m26911.getResult());
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("⡯\ue44a\ue70b狰埯茢ຆꉼ쑶岘賠ᵮ픗槥", 14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                                        org.json.JSONObject m27521 = util.h.xy.u.d.m27521(jSONObject3.getJSONObject(((java.lang.String) objArr4[0]).intern()), jSONObject2);
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("⡯\ue44a\ue70b狰埯茢ຆꉼ쑶岘賠ᵮ픗槥", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, objArr5);
                                        jSONObject3.remove(((java.lang.String) objArr5[0]).intern());
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("⡯\ue44a\ue70b狰埯茢ຆꉼ쑶岘賠ᵮ픗槥", 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
                                        jSONObject3.put(((java.lang.String) objArr6[0]).intern(), m27521);
                                        util.h.xy.t.mb.f2417.m27434(bytes, jSONObject3.toString().getBytes(util.h.xy.h.a.f2221));
                                        int i2 = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                                        getHighSpeedVideoSizesFor = i2;
                                        getHighSpeedVideoFpsRangesFor = (i2 + 105) % 128;
                                        return util.h.xy.x.a.m27696(null);
                                    } catch (org.json.JSONException unused) {
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("ꞣ୕ﶁ⧟䈗긎녔돬鮬\udfc2픗槥낎筗醟袰ƻ⬌潕⤻が뜖쵗럫ೀꓒ", android.widget.ExpandableListView.getPackedPositionChild(0L) + 26, objArr7);
                                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr7[0]).intern());
                                    }
                                }
                                z3 = true;
                            }
                            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                            if (meVar.m26215() != null) {
                                int i3 = getHighSpeedVideoSizesFor + 53;
                                getHighSpeedVideoFpsRangesFor = i3 % 128;
                                if (i3 % 2 != 0) {
                                    meVar.m26215();
                                    throw null;
                                }
                                if (!meVar.m26215().isEmpty()) {
                                    util.h.xy.t.mb.f2417.m27411(bytes, meVar.m26215().getBytes(util.h.xy.h.a.f2221));
                                }
                            }
                            if (meVar.m26213() != null) {
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 103) % 128;
                                if (!meVar.m26213().isEmpty()) {
                                    int i4 = getHighSpeedVideoSizesFor + 3;
                                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        util.h.xy.t.mb.f2417.m27408(bytes, meVar.m26213().getBytes(util.h.xy.h.a.f2221));
                                        throw null;
                                    }
                                    util.h.xy.t.mb.f2417.m27408(bytes, meVar.m26213().getBytes(util.h.xy.h.a.f2221));
                                }
                            }
                            if (meVar.m26217() != null && !meVar.m26217().isEmpty()) {
                                byte[] bytes2 = meVar.m26217().getBytes(util.h.xy.h.a.f2221);
                                util.h.xy.t.mb.f2417.m27477(bytes, bytes2);
                                java.util.Arrays.toString(bytes2);
                            }
                            byte[] bytes3 = meVar.m26212().getBytes(util.h.xy.h.a.f2221);
                            byte[] bytes4 = meVar.m26216().toString().getBytes();
                            util.h.xy.t.mb.f2417.m27434(bytes, bytes3);
                            util.h.xy.t.mb.f2417.m27460(bytes, bytes4);
                            java.util.Arrays.toString(bytes4);
                            if (z3) {
                                int i5 = getHighSpeedVideoSizesFor + 75;
                                getHighSpeedVideoFpsRangesFor = i5 % 128;
                                if (i5 % 2 != 0) {
                                    util.h.xy.k.ra.f2243.m26968(str);
                                    throw new java.lang.NullPointerException();
                                }
                                if (util.h.xy.k.ra.f2243.m26968(str)) {
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = util.h.xy.k.ma.m26925().mo26170(str);
                                    if (mo26170 == null || !mo26170.isSuccessful()) {
                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("᪆碚窍锱뀾ㅾ듅篆铺黤ƻ⬌\uf406䇞낎筗ꕎ骉㏪빠", 20 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
                                        return util.h.xy.x.a.m27685(((java.lang.String) objArr8[0]).intern());
                                    }
                                    util.h.xy.f.b.f2201.m26753(mo26170.getResult(), false);
                                }
                            }
                            return util.h.xy.x.a.m27696(null);
                        }
                    }
                    z2 = true;
                    if (meVar.m26215() == null) {
                    }
                    if (meVar.m26217() == null) {
                    }
                    if (meVar.m26213() == null) {
                    }
                    java.lang.String m262122 = meVar.m26212();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("컢媳✗郵˒\ue90f\udc00⦨", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr9);
                    mo26175 = mo26175(util.h.xy.u.d.m27506(m262122, ((java.lang.String) objArr9[0]).intern()));
                    if (mo26175.isSuccessful()) {
                    }
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("᪆碚窍锱妋ࠥ녔돬飵\ue8cfフ觠⎆\ue300寤塂㭄ϱ྅얓朦\ue9b2\udbbbʡೀꓒ", 25 - android.text.TextUtils.getTrimmedLength(""), objArr22);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(509, ((java.lang.String) objArr22[0]).intern());
                } catch (org.json.JSONException e) {
                    e = e;
                    if (util.h.xy.i.b.f2233.equalsIgnoreCase(e.getMessage())) {
                        return util.h.xy.x.a.m27687(e);
                    }
                    return util.h.xy.x.a.m27692(e);
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
                if (util.h.xy.i.b.f2233.equalsIgnoreCase(e.getMessage())) {
                }
            } catch (util.h.xy.d.rd e3) {
                e = e3;
                if (util.h.xy.i.b.f2233.equalsIgnoreCase(e.getMessage())) {
                }
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˊ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26150(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 117;
            getHighSpeedVideoSizesFor = i % 128;
            try {
                if (i % 2 != 0) {
                    util.h.xy.u.d.m27510(str);
                    byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
                    java.util.List<java.lang.String> mo26159 = mo26159(str);
                    if (mo26159 != null && mo26159.size() > 2) {
                        java.lang.String str4 = mo26159.get(0);
                        java.lang.String str5 = mo26159.get(1);
                        mo26159.size();
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str4);
                            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(util.h.xy.s.ma.f2352);
                            jSONObject2.put(util.h.xy.s.rh.f2416, str3);
                            jSONObject.put(util.h.xy.s.ma.f2352, jSONObject2);
                            util.h.xy.t.mb.f2417.m27434(bytes, jSONObject.toString().getBytes(util.h.xy.h.a.f2221));
                            util.h.xy.k.ra.m26939(bytes, str5, str2);
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27696 = util.h.xy.x.a.m27696(null);
                            int i2 = getHighSpeedVideoFpsRangesFor + 81;
                            getHighSpeedVideoSizesFor = i2 % 128;
                            if (i2 % 2 != 0) {
                                return m27696;
                            }
                            throw null;
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException e) {
                            return util.h.xy.x.a.m27692(e);
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1902067699, 1746793847, -1841653094, -1208540097, -95924369, 1601871223, -1499952730, -2032939751, -337273849, 436334671, 691599214, 1255460680}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 22, objArr);
                    return util.h.xy.x.a.m27689(((java.lang.String) objArr[0]).intern());
                }
                util.h.xy.u.d.m27510(str);
                java.nio.charset.Charset charset = util.h.xy.h.a.f2221;
                mo26159(str);
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                return util.h.xy.x.a.m27689(e2.getMessage());
            }
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26169(java.lang.String str, util.h.xy.d.b bVar, util.h.xy.d.mc mcVar) {
        synchronized (this) {
            util.h.xy.u.d.m27510(str);
            if (bVar.m26139() != (mcVar.m26202() != null ? mcVar.m26202().length : mcVar.m26198() != null ? mcVar.m26198().length : mcVar.m26200() != null ? mcVar.m26200().length : 0)) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{1852521154, -1760643249, -635189851, 1466494396, -761641497, 1580052195, 368335224, 1931410690, -657007187, -1632400941, 1479928421, -683568231, 621719164, 470268874, -541271062, 1425616676, -480070622, 695566824, 2008707718, 1631198262, -1988841657, -692779499, -29880611, 598367872, 301602898, 1446504870, -1211577997, -29918244, -1222832727, -963697112, 309636283, -37359765, -1211577997, -29918244, -1924397767, 1971258667, 1369818222, -1620746490, -2016416728, 1795723091}, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 80, objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1144 && mcVar.m26202().length > 1) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{354028858, 1552362608, -321862174, -611161037, 2103032328, -2020065879, 668732351, -728496785, 993441932, 34498508, -432350569, 2140873867, -807999720, -1926745828, -259515977, -1132470211, 2028843857, -1124124729, 599654, -1975647200, -39966594, 1573534580, -1822888582, -291018191, -481575350, -364187960, 995166594, -676784650}, 54 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            try {
                try {
                    if (util.h.xy.k.b.m26915(str)) {
                        util.h.xy.k.ra.f2243.m26948(bytes, mcVar, bVar);
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27696 = util.h.xy.x.a.m27696(null);
                        if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                            mcVar.m26194();
                        }
                        return m27696;
                    }
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("릊䤨핀煓ꝲ냷྅얓컢媳茽ꄺ攕ﾐ双薥頫恀ຆꉼが뜖ᙖ퀈隒헀赽Ń橥ڏ\u1942颇④偅渟\u2fd7瓢㫛㭄ϱ\uf18eٜ᪖蛊№悄埯茢躉䈒が뜖쵗럫ೀꓒ", 54 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27688 = util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr3[0]).intern());
                    if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                        mcVar.m26194();
                    }
                    return m27688;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m276882 = util.h.xy.x.a.m27688((java.lang.Object) null, e.getMessage());
                    if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                        mcVar.m26194();
                    }
                    return m276882;
                }
            } catch (java.lang.Throwable th2) {
                if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                    mcVar.m26194();
                }
                throw th2;
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26155(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 41;
            getHighSpeedVideoSizesFor = i % 128;
            try {
                if (i % 2 == 0) {
                    util.h.xy.u.d.m27510(str);
                    util.h.xy.k.b.m26915(str);
                    throw null;
                }
                util.h.xy.u.d.m27510(str);
                if (util.h.xy.k.b.m26915(str)) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 63) % 128;
                    util.h.xy.k.mb.m26926(str, digitalizedCardState);
                    return util.h.xy.x.a.m27696(null);
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("릊䤨핀煓ꝲ냷྅얓컢媳䴛ꩭᰐ\ue855걤\udb7a鿃㙔埨匾䐪\uddc6埯茢쑶岘挮⾇\udff4ꚋ\u0e74䝑ƻ⬌ຆꉼ\ue583딱速鼷㗓懑⎆\ue300寤塂␏ﰾ窍锱", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, objArr);
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27688 = util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                int i2 = getHighSpeedVideoSizesFor + 101;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    return m27688;
                }
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27688((java.lang.Object) null, e.getMessage());
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26168(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        synchronized (this) {
            util.h.xy.u.d.m27510(str);
            try {
                if (!util.h.xy.k.b.m26915(str)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("릊䤨핀煓ꝲ냷྅얓컢媳⮨ᙚ鱇飝욏쟆걤\udb7a␏ﰾ窍锱\uffdfᗊ픗槥㫉哛④偅渟\u2fd7瓢㫛㭄ϱ\uf18eٜ᪖蛊№悄埯茢躉䈒が뜖쵗럫ೀꓒ", android.view.KeyEvent.keyCodeFromString("") + 51, objArr);
                    return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                }
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 21) % 128;
                util.h.xy.k.ra.m26938(str, digitalizedCardState);
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27696 = util.h.xy.x.a.m27696(null);
                int i = getHighSpeedVideoFpsRangesFor + 67;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 != 0) {
                    return m27696;
                }
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27688((java.lang.Object) null, e.getMessage());
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ᐝ */
    public void mo26174(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            int i = getHighSpeedVideoSizesFor + 5;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                util.h.xy.u.d.m27510(str);
                if (util.h.xy.k.b.m26915(str)) {
                    util.h.xy.k.mb.m26931(mo26170(str).getResult());
                    int i2 = getHighSpeedVideoSizesFor + 77;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else {
                util.h.xy.u.d.m27510(str);
                util.h.xy.k.b.m26915(str);
                throw new java.lang.ArithmeticException();
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ᐝ */
    public void mo26173() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 71) % 128;
            util.h.xy.k.a.m26907(true);
            int i = getHighSpeedVideoSizesFor + 89;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    public java.util.List<java.lang.String> mo26159(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.List<java.lang.String> m26917;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 47;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                util.h.xy.k.b.m26915(str);
                throw null;
            }
            if (!util.h.xy.k.b.m26915(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1902067699, 1746793847, -792385076, 657663466, -774445785, -1174070913, 539068539, -747558165}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1011, ((java.lang.String) objArr[0]).intern());
            }
            m26917 = util.h.xy.k.b.m26917(str);
            int i2 = getHighSpeedVideoFpsRangesFor + 57;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return m26917;
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˊ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> mo26151(java.lang.String str, util.h.xy.d.ma maVar) {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 45) % 128;
            try {
                if (util.h.xy.k.b.m26915(str)) {
                    return util.h.xy.x.a.m27696(util.h.xy.k.b.m26921(str, maVar));
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("돿觱✗郵扻䚦㭄ϱ྅얓\uf063徫ꝲ냷䐪\uddc6䪜᧔", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, objArr);
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m27688 = util.h.xy.x.a.m27688("", ((java.lang.String) objArr[0]).intern());
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 17) % 128;
                return m27688;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27692((java.lang.Exception) e);
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˊ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148(java.lang.String str) {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            try {
                if (!util.h.xy.k.b.m26915(str)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("᪆碚窍锱ƻ⬌\uf406䇞큧먂速鼷㗓懑⎆\ue300ᱭ\uf25e", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 18, objArr);
                    return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                }
                int i = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 != 0) {
                    return util.h.xy.k.b.m26908(str);
                }
                util.h.xy.k.b.m26908(str);
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27692((java.lang.Exception) e);
            }
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˊ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> mo26149(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> highResolutionOutputSizeshNQ4ISI;
        synchronized (this) {
            int i = getHighSpeedVideoSizesFor + 1;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                getHighResolutionOutputSizeshNQ4ISI(str, paymentType, z, z2);
                throw new java.lang.ArithmeticException();
            }
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, paymentType, z, z2);
            int i2 = getHighSpeedVideoFpsRangesFor + 89;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @util.h.xy.a.a
    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) {
        int i = getHighSpeedVideoSizesFor + 23;
        getHighSpeedVideoFpsRangesFor = i % 128;
        try {
            if (i % 2 != 0) {
                util.h.xy.k.b.m26915(str);
                throw new java.lang.ArithmeticException();
            }
            if (!util.h.xy.k.b.m26915(str)) {
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, "", 1011);
                int i2 = getHighSpeedVideoFpsRangesFor + 125;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    return raVar;
                }
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.d.ra m26910 = util.h.xy.k.b.m26910(str, paymentType, z, z2);
            int i3 = getHighSpeedVideoFpsRangesFor + 27;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (m26910 != null) {
                if (m26910.m26220() == null) {
                    int i4 = getHighSpeedVideoFpsRangesFor + 17;
                    getHighSpeedVideoSizesFor = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    m26910.m26222();
                    util.h.xy.ar.b.m25074(m26910.m26220().m26243());
                    util.h.xy.ar.b.m25074(m26910.m26220().m26239());
                    util.h.xy.ar.b.m25074(m26910.m26220().m26242());
                    util.h.xy.ar.b.m25074(m26910.m26220().m26240());
                    util.h.xy.ar.b.m25074(m26910.m26220().m26241());
                }
            }
            return new util.h.xy.an.ra(m26910, true, null);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException e) {
            return util.h.xy.x.a.m27692(e);
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> mo26166() {
        try {
            java.lang.String[] m26916 = util.h.xy.k.b.m26916(true);
            int length = m26916.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < m26916.length; i++) {
                java.lang.String str = m26916[i];
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = mo26170(str);
                if (mo26170.isSuccessful()) {
                    if (mo26170.getResult().m26180().equals(str)) {
                        int i2 = getHighSpeedVideoFpsRangesFor + 21;
                        getHighSpeedVideoSizesFor = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (mo26170.getResult().m26179() != null && !mo26170.getResult().m26179().isEmpty()) {
                                if (mo26146(mo26170.getResult().m26179()).isSuccessful()) {
                                    arrayList.add(m26916[i]);
                                }
                                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                            } else {
                                arrayList.add(m26916[i]);
                            }
                            arrayList.size();
                        } else {
                            mo26170.getResult().m26179();
                            throw new java.lang.ArithmeticException();
                        }
                    }
                } else {
                    return new util.h.xy.an.ra(mo26170.getErrorMessage(), 1011);
                }
            }
            return util.h.xy.x.a.m27696((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return util.h.xy.x.a.m27692((java.lang.Exception) e);
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˎ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> mo26161(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 27) % 128;
            try {
                if (util.h.xy.k.b.m26914(paymentType)) {
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m27696 = util.h.xy.x.a.m27696(util.h.xy.k.b.m26909(paymentType));
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                    return m27696;
                }
                return util.h.xy.x.a.m27696("");
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                return util.h.xy.x.a.m27692((java.lang.Exception) e);
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ᐝ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26171(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        synchronized (this) {
            try {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = mo26170(str);
                util.h.xy.d.d result = mo26170.getResult();
                if (mo26170.isSuccessful()) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                    if (result != null) {
                        if (str.equals(result.m26179())) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{2096611892, -152840575, 1361245860, -874709900, 1649814059, -1197192367, 518524453, -720514475, -1411204597, 1468683449, -710309817, -1195825394, 1814077052, 1665457962}, android.view.KeyEvent.getDeadChar(0, 0) + 25, objArr);
                            return util.h.xy.x.a.m27685(((java.lang.String) objArr[0]).intern());
                        }
                        if (!util.h.xy.k.b.m26915(result.m26180())) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("돿觱✗郵扻䚦㭄ϱ྅얓\uf063徫ꝲ냷䐪\uddc6䪜᧔", 17 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                            return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr2[0]).intern());
                        }
                        int i = getHighSpeedVideoFpsRangesFor + 61;
                        getHighSpeedVideoSizesFor = i % 128;
                        if (i % 2 == 0) {
                            util.h.xy.k.b.m26908(result.m26180()).isSuccessful();
                            throw new java.lang.ArithmeticException();
                        }
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26908 = util.h.xy.k.b.m26908(result.m26180());
                        if (!m26908.isSuccessful()) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{-1825603420, -1977098489, 631349584, 652744138, -218239761, -1967041292, 1165416577, -927631325, -383110353, 785750018, -1994942355, 892037838, -1866000510, -981004385, 541086483, -1887906608, -1760712657, -1360289481}, android.text.TextUtils.indexOf("", "", 0) + 35, objArr3);
                            return util.h.xy.x.a.m27689(((java.lang.String) objArr3[0]).intern());
                        }
                        if (m26908.getResult().m26136() != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                            try {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(new int[]{-1902067699, 1746793847, -259515977, -1132470211, 2134052179, 1254172781, 726259640, 589891313}, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 15, objArr4);
                                return util.h.xy.x.a.m27684(null, ((java.lang.String) objArr4[0]).intern());
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 97) % 128;
                        if (result.m26179() != null) {
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m269082 = util.h.xy.k.b.m26908(result.m26179());
                            if (!m269082.isSuccessful()) {
                                int[] iArr = {-1825603420, -1977098489, 631349584, 652744138, -218239761, -1967041292, 1165416577, -927631325, -383110353, 785750018, -1994942355, 892037838, -1866000510, -981004385, 541086483, -1887906608, -1760712657, -1360289481};
                                int i2 = getHighSpeedVideoFpsRangesFor + 29;
                                getHighSpeedVideoSizesFor = i2 % 128;
                                int i3 = i2 % 2;
                                try {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(iArr, 35 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr5);
                                    return util.h.xy.x.a.m27689(((java.lang.String) objArr5[0]).intern());
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                            int i4 = getHighSpeedVideoFpsRangesFor + 13;
                            getHighSpeedVideoSizesFor = i4 % 128;
                            if (i4 % 2 == 0) {
                                m269082.getResult().m26136();
                                com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
                                throw null;
                            }
                            if (m269082.getResult().m26136() != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                                int[] iArr2 = {-1902067699, 1746793847, -259515977, -1132470211, 2134052179, 1254172781, 726259640, 589891313};
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 31) % 128;
                                try {
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(iArr2, 15 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr6);
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27684 = util.h.xy.x.a.m27684(null, ((java.lang.String) objArr6[0]).intern());
                                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 83) % 128;
                                    return m27684;
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        }
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26952 = util.h.xy.k.ra.f2243.m26952(result, paymentType);
                        if (m26952 != null && m26952.isSuccessful()) {
                            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{1603125908, 1835724278, 1771181736, -1194203346, 33918978, 1926147335, 1314039517, -782126657}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr7);
                            util.h.xy.av.ra.m25235(m24558, ((java.lang.String) objArr7[0]).intern());
                        }
                        return m26952;
                    }
                }
                return util.h.xy.x.a.m27682(null, mo26170.getErrorMessage(), mo26170.getErrorCode());
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27688((java.lang.Object) null, e.getMessage());
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26154(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 71) % 128;
            try {
                if (!util.h.xy.k.b.m26914(paymentType)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("돿觱✗郵扻䚦㭄ϱ྅얓\uf063徫ꝲ냷䐪\uddc6䪜᧔", 17 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
                    return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                }
                int i = getHighSpeedVideoSizesFor + 55;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    return util.h.xy.k.mb.m26929(paymentType);
                }
                util.h.xy.k.mb.m26929(paymentType);
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.x.a.m27692((java.lang.Exception) e);
            }
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˋ */
    public byte[] mo26160() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 39) % 128;
        try {
            byte[] m27435 = util.h.xy.t.mb.f2417.m27435();
            int i = getHighSpeedVideoSizesFor;
            getHighSpeedVideoFpsRangesFor = (i + 81) % 128;
            int i2 = i + 99;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return m27435;
            }
            throw null;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return new byte[16];
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˎ */
    public void mo26165(byte[] bArr) {
        synchronized (this) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 117) % 128;
            util.h.xy.ar.b.m25074(bArr);
            try {
                util.h.xy.t.mb.f2417.m27474(bArr);
                util.h.xy.ar.b.m25095(bArr);
                int i = getHighSpeedVideoFpsRangesFor + 81;
                getHighSpeedVideoSizesFor = i % 128;
                int i2 = i % 2;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˊ */
    public byte[] mo26153() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 65) % 128;
        try {
            byte[] m27461 = util.h.xy.t.mb.f2417.m27461();
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizesFor = (i + 43) % 128;
            getHighSpeedVideoSizesFor = (i + 109) % 128;
            return m27461;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return new byte[16];
        }
    }

    @Override // util.h.xy.d.c
    @util.h.xy.a.a
    /* renamed from: ˊ */
    public void mo26152(byte[] bArr) {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 49) % 128;
            util.h.xy.ar.b.m25098(bArr);
            try {
                util.h.xy.t.mb.f2417.m27407(bArr);
                util.h.xy.ar.b.m25095(bArr);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            int i = getHighSpeedVideoSizesFor + 19;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> mo26157(java.lang.String str, byte[] bArr) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m27692;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 7;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.u.d.m27510(str);
                if (!getHighSpeedVideoFpsRanges && bArr == null) {
                    throw new java.lang.AssertionError();
                }
                byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
                try {
                    try {
                        util.h.xy.t.mb.f2417.m27445(bytes, util.h.xy.ar.b.m25090(util.h.xy.ar.mb.m25107(new byte[]{81}, bArr), new byte[]{0}));
                        util.h.xy.k.ra.f2243.m26970(new java.lang.String(bytes));
                        m27692 = new util.h.xy.an.ra<>(java.lang.Boolean.TRUE, true, null);
                        util.h.xy.ar.b.m25095(bytes);
                        int i2 = (getHighSpeedVideoSizesFor + 53) % 128;
                        getHighSpeedVideoFpsRangesFor = i2;
                        bytes = i2;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        m27692 = util.h.xy.x.a.m27692((java.lang.Exception) e);
                        util.h.xy.ar.b.m25095(bytes);
                        bytes = bytes;
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.ar.b.m25095(bytes);
                    throw th;
                }
            } else {
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.u.d.m27510(str);
                throw new java.lang.ArithmeticException();
            }
        }
        return m27692;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[Catch: all -> 0x0133, InternalComponentException -> 0x0135, TryCatch #2 {InternalComponentException -> 0x0135, blocks: (B:6:0x0013, B:8:0x001d, B:11:0x002b, B:12:0x003f, B:16:0x0059, B:18:0x005f, B:21:0x006f, B:22:0x0072, B:29:0x0093, B:30:0x00c6, B:32:0x00c9, B:33:0x00cf, B:37:0x00ea, B:39:0x00f0, B:44:0x00fc, B:45:0x0122, B:53:0x00b3, B:62:0x010e, B:65:0x0051), top: B:5:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: all -> 0x0143, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:20:0x0067, B:24:0x007e, B:35:0x00e0, B:40:0x00f7, B:46:0x013a, B:55:0x00b6, B:63:0x011a, B:69:0x013f, B:70:0x0142, B:6:0x0013, B:8:0x001d, B:11:0x002b, B:12:0x003f, B:16:0x0059, B:18:0x005f, B:21:0x006f, B:22:0x0072, B:29:0x0093, B:30:0x00c6, B:32:0x00c9, B:33:0x00cf, B:37:0x00ea, B:39:0x00f0, B:44:0x00fc, B:45:0x0122, B:53:0x00b3, B:62:0x010e, B:65:0x0051, B:72:0x0136), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> mo26158(java.lang.String str, byte[] bArr, byte[] bArr2) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m27692;
        byte[] bArr3;
        byte[] m25090;
        synchronized (this) {
            util.h.xy.ar.b.m25074(bArr);
            util.h.xy.ar.b.m25074(bArr2);
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            try {
                try {
                    util.h.xy.u.d.m27510(str);
                    byte[] m25107 = bArr2 != null ? util.h.xy.ar.mb.m25107(new byte[]{81}, bArr2) : null;
                    if (bArr != null) {
                        bArr3 = util.h.xy.ar.mb.m25107(new byte[]{80}, bArr);
                        int length = ((byte[]) java.util.Objects.requireNonNull(bArr3)).length;
                        util.h.xy.ar.b.m25074(bArr3);
                    } else {
                        bArr3 = null;
                    }
                    byte[] result = Camera2StreamConfigurationMap(str).getResult();
                    util.h.xy.ar.mb m25057 = util.h.xy.ar.a.m25057(result, (byte) 81);
                    int m25112 = m25057 == null ? 0 : m25057.m25112() + 2;
                    if (result == null || result.length - (m25112 + 3) <= 0) {
                        m25090 = util.h.xy.ar.b.m25090(bArr3, m25107, new byte[]{bArr3 != null ? (byte) 1 : (byte) 0});
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 29) % 128;
                    } else {
                        util.h.xy.d.mg m26768 = util.h.xy.f.b.f2201.m26768(str);
                        if (m26768 != null) {
                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 17) % 128;
                            m26768.m26218();
                        }
                        byte b = result[result.length - 1];
                        byte b2 = result[result.length - 1];
                        if (m26768 == util.h.xy.d.mg.f1144) {
                            int i = getHighSpeedVideoSizesFor + 41;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 == 0 ? b >= 100 : b >= 67) {
                                util.h.xy.ar.mb m250572 = util.h.xy.ar.a.m25057(result, (byte) 80);
                                util.h.xy.ar.b.m25074(m250572.m25108());
                                int length2 = m250572.m25108().length;
                                int length3 = result.length;
                                int length4 = result.length;
                                util.h.xy.ar.b.m25074(result);
                                result = java.util.Arrays.copyOfRange(result, length2, length3);
                                int length5 = result.length;
                                util.h.xy.ar.b.m25074(result);
                                int length6 = result.length;
                                util.h.xy.ar.b.m25074(m25057 == null ? m25057.m25110() : null);
                                byte[] copyOfRange = java.util.Arrays.copyOfRange(result, 0, length6 - (m25112 + 1));
                                int length7 = copyOfRange.length;
                                util.h.xy.ar.b.m25074(copyOfRange);
                                if (m26768 == util.h.xy.d.mg.f1144) {
                                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 101) % 128;
                                    if (util.h.xy.u.d.m27508(bArr3, copyOfRange, b2 - 1)) {
                                        return new util.h.xy.an.ra(java.lang.Boolean.FALSE, false, null);
                                    }
                                }
                                m25090 = util.h.xy.ar.b.m25090(copyOfRange, bArr3, m25107, new byte[]{b2});
                            }
                        }
                        if (bArr != null && bArr.length > 0) {
                            int i2 = getHighSpeedVideoFpsRangesFor + 15;
                            getHighSpeedVideoSizesFor = i2 % 128;
                            int i3 = b2;
                            if (i2 % 2 != 0) {
                                i3 = b2 + 1;
                            }
                            b2 = (byte) i3;
                        }
                        int length62 = result.length;
                        util.h.xy.ar.b.m25074(m25057 == null ? m25057.m25110() : null);
                        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(result, 0, length62 - (m25112 + 1));
                        int length72 = copyOfRange2.length;
                        util.h.xy.ar.b.m25074(copyOfRange2);
                        if (m26768 == util.h.xy.d.mg.f1144) {
                        }
                        m25090 = util.h.xy.ar.b.m25090(copyOfRange2, bArr3, m25107, new byte[]{b2});
                    }
                    int length8 = m25090.length;
                    util.h.xy.ar.b.m25074(m25090);
                    util.h.xy.t.mb.f2417.m27445(bytes, m25090);
                    m27692 = new util.h.xy.an.ra<>(java.lang.Boolean.TRUE, true, null);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    m27692 = util.h.xy.x.a.m27692((java.lang.Exception) e);
                }
                return m27692;
            } finally {
                util.h.xy.ar.b.m25095(bytes);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0026, code lost:
    
        if (r9.isSuccessful() != false) goto L10;
     */
    @Override // util.h.xy.d.c
    /* renamed from: ˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[][]> mo26162(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[]> Camera2StreamConfigurationMap2;
        byte[] bArr;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[][]> m27697;
        int i;
        synchronized (this) {
            int i2 = getHighSpeedVideoSizesFor + 79;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str);
                bArr = new byte[1];
                if (Camera2StreamConfigurationMap2.isSuccessful()) {
                    bArr = Camera2StreamConfigurationMap2.getResult();
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                }
                if (bArr.length > 0) {
                    int length = bArr.length;
                    util.h.xy.ar.b.m25074(bArr);
                    util.h.xy.ar.mb m25057 = util.h.xy.ar.a.m25057(bArr, (byte) 81);
                    int i3 = bArr[bArr.length - 1];
                    if (m25057 != null) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 29) % 128;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i4 = i3 + i;
                    byte[][] bArr2 = new byte[i4][];
                    int i5 = 0;
                    while (bArr.length > 1) {
                        util.h.xy.ar.b.m25074(bArr);
                        int length2 = bArr.length;
                        util.h.xy.ar.mb m250572 = util.h.xy.ar.a.m25057(bArr, (byte) 80);
                        if (m250572 == null) {
                            m250572 = m25057;
                        }
                        byte[] m25110 = m250572.m25110();
                        bArr2[i5] = m25110;
                        util.h.xy.ar.b.m25074(m25110);
                        i5++;
                        int length3 = m250572.m25108().length;
                        int length4 = bArr.length;
                        if (length3 >= length4) {
                            break;
                        }
                        bArr = java.util.Arrays.copyOfRange(bArr, length3, length4);
                        util.h.xy.ar.b.m25074(bArr);
                        int length5 = bArr.length;
                    }
                    if (i4 != i5) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ueb44堗巂쁡辐⮃⎆\ue300寤塂№悄䴛ꩭ攕ﾐ躉䈒④偅\uf406䇞쑶岘릊䤨✎嚭窍锱轼ᠰ⫬༜㏪빠᪖蛊", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, objArr);
                        m27697 = util.h.xy.x.a.m27689(((java.lang.String) objArr[0]).intern());
                    } else {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 53) % 128;
                        for (int i6 = 0; i6 < i4; i6++) {
                            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                            byte[] bArr3 = bArr2[i6];
                            util.h.xy.ar.b.m25074(bArr3);
                            int length6 = bArr3.length;
                        }
                        m27697 = new util.h.xy.an.ra<>(bArr2, true, null);
                    }
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("国츜煋簅걤\udb7a\uf689橇挮⾇㭄ϱ④偅䆊赼ట쐯\ua879詾埯茢ຆꉼꗌ鮤⾪䶵", 29 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                    m27697 = util.h.xy.x.a.m27697(new byte[0][], ((java.lang.String) objArr2[0]).intern());
                }
            } else {
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str);
                bArr = new byte[0];
            }
        }
        return m27697;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[]> Camera2StreamConfigurationMap(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[]> m27697;
        int i = getHighSpeedVideoSizesFor + 1;
        getHighSpeedVideoFpsRangesFor = i % 128;
        try {
            try {
                if (i % 2 == 0) {
                    util.h.xy.u.d.m27510(str);
                    byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
                    byte[] m27456 = util.h.xy.t.mb.f2417.m27456(bytes);
                    if (m27456.length > 0) {
                        int length = m27456.length;
                        m27697 = new util.h.xy.an.ra<>(m27456, true, null);
                    } else {
                        byte[] bArr = new byte[0];
                        int i2 = getHighSpeedVideoFpsRangesFor + 9;
                        getHighSpeedVideoSizesFor = i2 % 128;
                        try {
                            if (i2 % 2 == 0) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoSizes("国츜煋簅걤\udb7a\uf689橇挮⾇㭄ϱ④偅䆊赼ట쐯␏ﰾ埯茢ຆꉼꗌ鮤⾪䶵", 29 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                                m27697 = util.h.xy.x.a.m27697(bArr, ((java.lang.String) objArr[0]).intern());
                            } else {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("国츜煋簅걤\udb7a\uf689橇挮⾇㭄ϱ④偅䆊赼ట쐯␏ﰾ埯茢ຆꉼꗌ鮤⾪䶵", 29 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr2);
                                m27697 = util.h.xy.x.a.m27697(bArr, ((java.lang.String) objArr2[0]).intern());
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    util.h.xy.ar.b.m25095(bytes);
                    return m27697;
                }
                util.h.xy.u.d.m27510(str);
                int length2 = util.h.xy.t.mb.f2417.m27456(str.getBytes(util.h.xy.h.a.f2221)).length;
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[]> m27692 = util.h.xy.x.a.m27692((java.lang.Exception) e);
                util.h.xy.ar.b.m25095((byte[]) str);
                return m27692;
            }
        } catch (java.lang.Throwable th2) {
            util.h.xy.ar.b.m25095((byte[]) str);
            throw th2;
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> mo26167(java.lang.String str) {
        util.h.xy.an.ra raVar;
        synchronized (this) {
            util.h.xy.u.d.m27510(str);
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            try {
                util.h.xy.t.mb.f2417.m27420(bytes);
                raVar = new util.h.xy.an.ra(java.lang.Boolean.TRUE, true, null);
                util.h.xy.ar.b.m25095(bytes);
                int i = getHighSpeedVideoFpsRangesFor;
                int i2 = i + 107;
                getHighSpeedVideoSizesFor = i2 % 128;
                int i3 = i2 % 2;
                int i4 = (i + 7) % 128;
                getHighSpeedVideoSizesFor = i4;
                getHighSpeedVideoFpsRangesFor = (i4 + 93) % 128;
            } catch (java.lang.Throwable th) {
                util.h.xy.ar.b.m25095(bytes);
                throw th;
            }
        }
        return raVar;
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˎ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26164(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, java.lang.String str2, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 65;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                util.h.xy.al.rb.m25016(bArr);
                com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.al.rb.m25016(bArr);
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                java.lang.String str3 = util.h.xy.i.b.f2235;
                return util.h.xy.x.a.m27689(util.h.xy.i.b.f2235);
            }
            util.h.xy.u.d.m27510(str);
            if (!util.h.xy.k.b.m26915(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("돿觱✗郵扻䚦㭄ϱ྅얓\uf063徫ꝲ냷䐪\uddc6䪜᧔", 17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
            }
            if (!util.h.xy.k.ra.f2243.m26968(str)) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("澗ﶻ罂㥫뺆䴬夷♅퓮炬が뜖쵗럫ೀꓒ", 15 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                return util.h.xy.x.a.m27694((java.lang.Object) null, ((java.lang.String) objArr2[0]).intern());
            }
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.set(str2, bArr);
            try {
                util.h.xy.v.b.f2439.m27640(Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI));
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 27) % 128;
                return util.h.xy.x.a.m27696(null);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ᩜጮ攕ﾐ㧂阘⎆\ue300\uffdfᗊ白䎡\u0e74䝑뤑막첄邳ॡ㟹ᕞ㑎샇끩䳉沺胧뤟䐪\uddc6྅얓鮬\udfc2픗槥", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, objArr3);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1009, ((java.lang.String) objArr3[0]).intern());
            }
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˋ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26156(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                java.lang.String str2 = util.h.xy.i.b.f2235;
                return util.h.xy.x.a.m27689(util.h.xy.i.b.f2235);
            }
            util.h.xy.u.d.m27510(str);
            if (!util.h.xy.k.b.m26915(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1650391935, 592241217, -346038507, 127560765, 1885028865, -1705224361, 660710626, 604149180, 650545700, -539413082}, android.graphics.Color.alpha(0) + 17, objArr);
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27688 = util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
                int i = getHighSpeedVideoSizesFor + 15;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    return m27688;
                }
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 49) % 128;
            if (util.h.xy.k.ra.f2243.m26968(str)) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 125) % 128;
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2193);
                return util.h.xy.x.a.m27696(null);
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("澗ﶻ龕⤻뺆䴬夷♅퓮炬が뜖쵗럫ೀꓒ", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 15, objArr2);
            return util.h.xy.x.a.m27694((java.lang.Object) null, ((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ˎ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> mo26163(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 3;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                throw null;
            }
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                java.lang.String str2 = util.h.xy.i.b.f2235;
                return util.h.xy.x.a.m27689(util.h.xy.i.b.f2235);
            }
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 89) % 128;
            util.h.xy.u.d.m27510(str);
            if (!util.h.xy.k.b.m26915(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("돿觱✗郵扻䚦㭄ϱ྅얓\uf063徫ꝲ냷䐪\uddc6䪜᧔", android.view.View.MeasureSpec.getMode(0) + 17, objArr);
                return util.h.xy.x.a.m27688((java.lang.Object) null, ((java.lang.String) objArr[0]).intern());
            }
            if (util.h.xy.k.ra.f2243.m26968(str)) {
                return util.h.xy.x.a.m27696(getHighResolutionOutputSizeshNQ4ISI());
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("澗ﶻ龕⤻뺆䴬夷♅퓮炬뀲డ쵗럫ೀꓒ", android.graphics.Color.red(0) + 15, objArr2);
            return util.h.xy.x.a.m27694((java.lang.Object) null, ((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // util.h.xy.d.c
    /* renamed from: ʻ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> mo26146(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26973;
        synchronized (this) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 39) % 128;
            m26973 = util.h.xy.k.ra.f2243.m26973(str);
            int i = getHighSpeedVideoSizesFor + 103;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        return m26973;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData m26976() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData highResolutionOutputSizeshNQ4ISI;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 119;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
                throw new java.lang.ArithmeticException();
            }
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            int i2 = getHighSpeedVideoSizesFor + 39;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private static com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData getHighResolutionOutputSizeshNQ4ISI() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData digitalizedCardAdditionalPaymentData = new com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData();
        byte[] m27615 = util.h.xy.v.b.f2439.m27615(new byte[]{0});
        if (!util.h.xy.ar.b.m25070(m27615)) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-357958767, 206432743}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr);
            byte[] m25076 = util.h.xy.ar.b.m25076(((java.lang.String) objArr[0]).intern().substring(2));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﷅᚄ咀㱮", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr2);
            util.h.xy.ar.mb[] m25063 = util.h.xy.ar.a.m25063(m27615, m25076, util.h.xy.ar.b.m25076(((java.lang.String) objArr2[0]).intern().substring(2)));
            int length = m25063.length;
            int i = 0;
            while (i < length) {
                int i2 = getHighSpeedVideoSizesFor + 21;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.ar.mb mbVar = m25063[i];
                    digitalizedCardAdditionalPaymentData.set(util.h.xy.ar.b.m25074(new byte[]{1, mbVar.m25111()[0]}), mbVar.m25110());
                    i++;
                } else {
                    util.h.xy.ar.mb mbVar2 = m25063[i];
                    byte[] bArr = {0, 0};
                    bArr[1] = mbVar2.m25111()[0];
                    digitalizedCardAdditionalPaymentData.set(util.h.xy.ar.b.m25074(bArr), mbVar2.m25110());
                    i += 75;
                }
            }
        }
        return digitalizedCardAdditionalPaymentData;
    }

    private static byte[] Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData digitalizedCardAdditionalPaymentData) {
        java.lang.String[] paths;
        int length;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor + 97;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            paths = digitalizedCardAdditionalPaymentData.getPaths();
            length = paths.length;
            i = 1;
        } else {
            paths = digitalizedCardAdditionalPaymentData.getPaths();
            length = paths.length;
            i = 0;
        }
        byte[] bArr = null;
        while (i < length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 93) % 128;
            java.lang.String str = paths[i];
            byte[] m25076 = util.h.xy.ar.b.m25076(str.substring(2));
            byte[] value = digitalizedCardAdditionalPaymentData.getValue(str);
            bArr = util.h.xy.ar.b.m25090(bArr, util.h.xy.ar.b.m25090(m25076, util.h.xy.ar.b.m25101(value.length, 1), value));
            i++;
        }
        return bArr;
    }

    @Override // util.h.xy.d.c
    /* renamed from: ʽ */
    public boolean mo26147(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = mo26170(str);
        boolean z = false;
        if (mo26170.isSuccessful()) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 51) % 128;
            if (mo26170.getResult() != null) {
                if (mo26170.getResult().m26179() != null) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 41) % 128;
                    z = true;
                } else {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 37) % 128;
                }
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 101) % 128;
                return z;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 91) % 128;
        return z;
    }

    @Override // util.h.xy.d.c
    /* renamed from: ͺ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 57;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.k.ra.f2243.m26950(str);
            throw null;
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = util.h.xy.k.ra.f2243.m26950(str);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        return m26950;
    }

    @Override // util.h.xy.d.c
    /* renamed from: ι */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26175(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 57) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26941 = util.h.xy.k.ra.f2243.m26941(str);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        return m26941;
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = (char) 32307;
        getOutputMinFrameDuration = (char) 32704;
        getInputFormats = (char) 29770;
        getHighSpeedVideoSizes = (char) 49035;
        getOutputStallDuration = new int[]{72220720, 1641505769, 1573602719, -1495979295, -2079693905, -1481280661, 1779831139, -408728447, -1683804825, -1351481511, -1933186639, -347766861, 1752406970, -635187656, -830494658, 1558083213, -185639860, -2102306905};
    }
}
