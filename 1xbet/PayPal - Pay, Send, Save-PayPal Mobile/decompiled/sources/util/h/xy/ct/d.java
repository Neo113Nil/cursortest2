package util.h.xy.ct;

/* loaded from: classes5.dex */
public class d implements util.h.xy.ct.rb {
    private static int[] Camera2StreamConfigurationMap = null;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getOutputFormats = 1;
    private final util.h.xy.co.ra getInputFormats;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.ct.d.class.getName();
        int i = getHighSpeedVideoFpsRangesFor + 45;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class mb {
        public static final util.h.xy.ct.d.mb Camera2StreamConfigurationMap;
        public static final util.h.xy.ct.d.mb getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 0;
        private static char[] getHighSpeedVideoSizesFor = null;
        private static boolean getInputFormats = false;
        private static int getInputSizeshNQ4ISI = 0;
        private static final /* synthetic */ util.h.xy.ct.d.mb[] getOutputFormats;
        private static int getOutputMinFrameDuration = 1;
        private static boolean getOutputMinFrameDurationlomOqCM;
        private final java.lang.String getOutputSizeshNQ4ISI;

        public static util.h.xy.ct.d.mb valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 39) % 128;
            util.h.xy.ct.d.mb mbVar = (util.h.xy.ct.d.mb) java.lang.Enum.valueOf(util.h.xy.ct.d.mb.class, str);
            int i = getOutputMinFrameDuration + 71;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return mbVar;
            }
            throw null;
        }

        public static util.h.xy.ct.d.mb[] values() {
            int i = getOutputMinFrameDuration + 29;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            util.h.xy.ct.d.mb[] mbVarArr = (util.h.xy.ct.d.mb[]) getOutputFormats.clone();
            int i2 = getOutputMinFrameDuration + 115;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return mbVarArr;
            }
            throw null;
        }

        static {
            Camera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0081\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u008b\u008a\u0085\u0085\u0085", objArr2);
            util.h.xy.ct.d.mb mbVar = new util.h.xy.ct.d.mb(intern, 0, ((java.lang.String) objArr2[0]).intern());
            Camera2StreamConfigurationMap = mbVar;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0081\u0089\u0088\u0087\u0086\u0084\u0082\u0083\u0082\u0081\u0085\u0087\u008d\u008c\u0082\u0087", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0081\u0089\u0087\u0086\u0084\u0082\u0083\u0082\u0081\u008f\u008d\u008e\u0081", objArr4);
            util.h.xy.ct.d.mb mbVar2 = new util.h.xy.ct.d.mb(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            getHighResolutionOutputSizeshNQ4ISI = mbVar2;
            int i = (getOutputMinFrameDuration + 121) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            util.h.xy.ct.d.mb[] mbVarArr = {mbVar, mbVar2};
            int i2 = i + 115;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 != 0) {
                getOutputFormats = mbVarArr;
                int i3 = i + 97;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            throw new java.lang.ArithmeticException();
        }

        private mb(java.lang.String str, int i, java.lang.String str2) {
            this.getOutputSizeshNQ4ISI = str2;
        }

        public final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            int i = getOutputMinFrameDuration + 55;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return this.getOutputSizeshNQ4ISI;
            }
            throw null;
        }

        private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr = getHighSpeedVideoSizesFor;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i2 = 0; i2 < length; i2++) {
                    cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                }
                cArr = cArr2;
            }
            int i3 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
            if (!getOutputMinFrameDurationlomOqCM) {
                if (!getInputFormats) {
                    throw null;
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 103) % 128;
                throw null;
            }
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 29) % 128;
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void Camera2StreamConfigurationMap() {
            getHighSpeedVideoSizesFor = new char[]{64167, 64182, 64161, 64186, 64148, 64164, 64187, 64179, 64189, 64198, 64199, 64177, 64178, 64184, 64174};
            getInputSizeshNQ4ISI = -1074857225;
            getInputFormats = true;
            getOutputMinFrameDurationlomOqCM = true;
        }
    }

    d() throws util.h.xy.ct.mc {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String highResolutionOutputSizeshNQ4ISI = util.h.xy.ct.d.mb.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{537099181, -1054064480, 215915013, 1955869579, -835004412, -477394031, -1654588893, 334631807}, 13 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        hashMap.put(highResolutionOutputSizeshNQ4ISI, ((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1974373271, 421583307, 74216055, 726189453, 893249485, -1937522383, -668850355, 419162318}, 15 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        util.h.xy.co.ra raVar = new util.h.xy.co.ra(((java.lang.String) objArr2[0]).intern(), util.h.xy.ct.d.mb.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(), hashMap);
        this.getInputFormats = raVar;
        try {
            util.h.xy.co.ma.m25988().mo25986(raVar);
        } catch (util.h.xy.co.b unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-164693676, 1285954782, 1411025016, 1254595215, -582495851, 749072971, 233374934, -295048780, 2006051336, -496891945, -1055398649, -1174950895, -1459887660, -868968797, 1298202242, -1073570322, -1375942948, -1743224264}, android.text.TextUtils.indexOf("", "", 0) + 36, objArr3);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr3[0]).intern());
        }
    }

    @Override // util.h.xy.ct.rb
    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean mo26040() {
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        try {
            boolean mo25983 = util.h.xy.co.ma.m25988().mo25983(this.getInputFormats, util.h.xy.ct.d.mb.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI());
            int i = getHighSpeedVideoFpsRangesFor + 125;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                return mo25983;
            }
            throw null;
        } catch (util.h.xy.co.b unused) {
            return false;
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = Camera2StreamConfigurationMap;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = Camera2StreamConfigurationMap;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 49) % 128;
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // util.h.xy.ct.rb
    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] mo26041() throws util.h.xy.ct.mc {
        int i = getHighSpeedVideoFpsRangesFor + 15;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap();
        }
        Camera2StreamConfigurationMap();
        throw null;
    }

    private byte[] Camera2StreamConfigurationMap() throws util.h.xy.ct.mc {
        try {
            return util.h.xy.cv.ma.m26063(util.h.xy.co.ma.m25988().mo25984(this.getInputFormats, util.h.xy.ct.d.mb.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI()).get(util.h.xy.ct.d.mb.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI()), new util.h.xy.cp.ma().m25992(util.h.xy.cr.ra.m26018()));
        } catch (util.h.xy.cm.ma unused) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{-1945441433, -275269058, -1476880971, 1314032035, -810933085, -1610807323, 1644012053, -1945260254, -504471484, -1320080957, 1296917496, 270085432, 808551504, 796753527, -1552355432, -6576819, -778015956, 1646289299}, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 32, objArr);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (util.h.xy.co.b unused2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighResolutionOutputSizeshNQ4ISI);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1945441433, -275269058, -1476880971, 1314032035, -810933085, -1610807323, 1644012053, -1945260254, -504471484, -1320080957, 1296917496, 270085432, 808551504, 796753527, -1552355432, -6576819, -778015956, 1646289299}, android.graphics.Color.green(0) + 33, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            throw new util.h.xy.ct.mc(sb.toString());
        }
    }

    @Override // util.h.xy.ct.rb
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo26042(byte[] bArr) throws util.h.xy.ct.mc {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 49) % 128;
        try {
            byte[] m26063 = util.h.xy.cv.ma.m26063(bArr, new util.h.xy.cp.ma().m25992(util.h.xy.ct.mb.f1127));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(util.h.xy.ct.d.mb.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(), m26063);
            util.h.xy.co.ma.m25988().V_(this.getInputFormats, util.h.xy.ct.d.mb.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(), contentValues);
            if (!mo26040()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighResolutionOutputSizeshNQ4ISI);
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{-1945441433, -275269058, -1476880971, 1314032035, -1515736365, -916833886, -65921667, 1910470346, 129073829, -1317325576, 1400685492, -1180585555, 1298202242, -1073570322, -1375942948, -1743224264}, android.graphics.Color.green(0) + 32, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                throw new util.h.xy.ct.mc(sb.toString());
            }
            util.h.xy.cr.ra.m26019(util.h.xy.ct.mb.f1127);
            if (util.h.xy.ct.rc.m26048().mo26030()) {
                int i = getHighSpeedVideoFpsRangesFor + 75;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    util.h.xy.ct.rc.m26048().mo26029();
                    throw new java.lang.NullPointerException();
                }
                util.h.xy.ct.rc.m26048().mo26029();
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 27) % 128;
            }
            int i2 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (util.h.xy.cm.ma unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1945441433, -275269058, -1476880971, 1314032035, -1515736365, -916833886, -65921667, 1910470346, 129073829, -1317325576, 1400685492, -1180585555, 1298202242, -1073570322, -1375942948, -1743224264}, 32 - android.view.View.combineMeasuredStates(0, 0), objArr2);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr2[0]).intern());
        } catch (util.h.xy.co.b unused2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getHighResolutionOutputSizeshNQ4ISI);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1945441433, -275269058, -1476880971, 1314032035, -1515736365, -916833886, -65921667, 1910470346, 129073829, -1317325576, 1400685492, -1180585555, 1298202242, -1073570322, -1375942948, -1743224264}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            throw new util.h.xy.ct.mc(sb2.toString());
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new int[]{615835629, 1566752622, 2021673848, -1175762360, 1552468372, -332091987, 1525510550, -383307118, 355193791, -1310817534, 1874699492, -1314133999, -1415721198, -934800629, -1994732798, 653463634, 1714893007, 104808152};
    }
}
