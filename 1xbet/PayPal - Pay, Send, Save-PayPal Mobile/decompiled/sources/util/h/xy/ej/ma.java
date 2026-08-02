package util.h.xy.ej;

/* loaded from: classes5.dex */
public final class ma implements util.h.xy.ef.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static boolean getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static boolean getInputFormats;
    private static final int[] getInputSizeshNQ4ISI;
    private static final int[] getOutputFormats;
    private static final int[] getOutputMinFrameDuration;
    private static char[] getOutputSizeshNQ4ISI;
    private static final byte[] getOutputStallDuration;
    private static final byte[] getOutputStallDurationlomOqCM;
    private int[][] getOutputMinFrameDurationlomOqCM = null;
    private boolean getOutputSizes;
    private byte[] isOutputSupportedForhNQ4ISI;
    private int unwrapAs;

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        int i3 = getHighSpeedVideoFpsRanges + 121;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i4 = getHighSpeedVideoFpsRanges + 107;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getHighSpeedVideoSizes) {
            if (!getInputFormats) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getOutputStallDurationlomOqCM = new byte[]{99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
        getOutputStallDuration = new byte[]{82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
        getOutputMinFrameDuration = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, 250, 239, 197, 145};
        getInputSizeshNQ4ISI = new int[]{-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
        getOutputFormats = new int[]{1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};
        int i = getHighSpeedVideoFpsRangesFor + 101;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public final void mo26557() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) {
        util.h.xy.ej.ma maVar = this;
        int[][] iArr = maVar.getOutputMinFrameDurationlomOqCM;
        char c = 0;
        int i3 = 1;
        int i4 = 16;
        if (iArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0098\u0082\u0094\u0093\u0085\u009b\u0093\u0088\u0093\u0086\u0093\u0084\u0088\u008a\u0086\u0084\u0082\u0086\u0093\u0087\u0086\u0082\u0084\u0096\u009f\u009e", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (i > bArr.length - 16) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.View.getDefaultSize(0, 0) + 127, "\u0088\u009a\u008a\u0089\u0094\u0084\u008a\u008a\u0088\u0084\u009a\u0082¡¡\u0097\u0092\u0084\u0088\u0097\u009c\u0086\u0093", objArr2);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr2[0]).intern());
        }
        if (i2 > bArr2.length - 16) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0088\u009a\u008a\u0089\u0094\u0084\u008a\u008a\u0088\u0084\u009a\u0082¡¡\u0097\u0092\u0084\u0088\u0097\u009c\u0088\u0097\u008a", objArr3);
                throw new util.h.xy.ef.f(((java.lang.String) objArr3[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i5 = 24;
        int i6 = 8;
        if (!maVar.getOutputSizes) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 113) % 128;
            int m26842 = util.h.xy.fb.rb.m26842(bArr, i);
            int m268422 = util.h.xy.fb.rb.m26842(bArr, i + 4);
            int m268423 = util.h.xy.fb.rb.m26842(bArr, i + 8);
            int m268424 = util.h.xy.fb.rb.m26842(bArr, i + 12);
            int i7 = this.unwrapAs;
            int[] iArr2 = iArr[i7];
            int i8 = m26842 ^ iArr2[0];
            int i9 = m268422 ^ iArr2[1];
            int i10 = m268423 ^ iArr2[2];
            int i11 = i7 - 1;
            int i12 = m268424 ^ iArr2[3];
            for (int i13 = 1; i11 > i13; i13 = 1) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 101) % 128;
                int[] iArr3 = getOutputFormats;
                int Camera2StreamConfigurationMap2 = (((iArr3[i8 & 255] ^ Camera2StreamConfigurationMap(iArr3[(i12 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr3[(i10 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr3[(i9 >> 24) & 255], 8)) ^ iArr[i11][0];
                int Camera2StreamConfigurationMap3 = (((iArr3[i9 & 255] ^ Camera2StreamConfigurationMap(iArr3[(i8 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr3[(i12 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr3[(i10 >> 24) & 255], 8)) ^ iArr[i11][1];
                int Camera2StreamConfigurationMap4 = (((iArr3[i10 & 255] ^ Camera2StreamConfigurationMap(iArr3[(i9 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr3[(i8 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr3[(i12 >> 24) & 255], 8)) ^ iArr[i11][2];
                int i14 = i11 - 1;
                int Camera2StreamConfigurationMap5 = (((iArr3[i12 & 255] ^ Camera2StreamConfigurationMap(iArr3[(i10 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr3[(i9 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr3[(i8 >> 24) & 255], 8)) ^ iArr[i11][3];
                int i15 = iArr3[Camera2StreamConfigurationMap2 & 255];
                int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap5 >> 8) & 255], 24);
                int Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap4 >> 16) & 255], 16);
                int Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap3 >> 24) & 255], 8);
                int i16 = iArr[i14][0];
                int i17 = iArr3[Camera2StreamConfigurationMap3 & 255];
                int Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap2 >> 8) & 255], 24);
                int Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap5 >> 16) & 255], 16);
                int Camera2StreamConfigurationMap11 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap4 >> 24) & 255], 8);
                int i18 = iArr[i14][1];
                int i19 = iArr3[Camera2StreamConfigurationMap4 & 255];
                int Camera2StreamConfigurationMap12 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap3 >> 8) & 255], 24);
                int Camera2StreamConfigurationMap13 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap2 >> 16) & 255], 16);
                int Camera2StreamConfigurationMap14 = Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap5 >> 24) & 255], 8);
                int i20 = iArr[i14][2];
                i11 -= 2;
                i12 = (((iArr3[Camera2StreamConfigurationMap5 & 255] ^ Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap4 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap3 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr3[(Camera2StreamConfigurationMap2 >> 24) & 255], 8)) ^ iArr[i14][3];
                i8 = (((i15 ^ Camera2StreamConfigurationMap6) ^ Camera2StreamConfigurationMap7) ^ Camera2StreamConfigurationMap8) ^ i16;
                i9 = (((i17 ^ Camera2StreamConfigurationMap9) ^ Camera2StreamConfigurationMap10) ^ Camera2StreamConfigurationMap11) ^ i18;
                i10 = (Camera2StreamConfigurationMap14 ^ ((Camera2StreamConfigurationMap12 ^ i19) ^ Camera2StreamConfigurationMap13)) ^ i20;
            }
            int[] iArr4 = getOutputFormats;
            int Camera2StreamConfigurationMap15 = (((iArr4[i8 & 255] ^ Camera2StreamConfigurationMap(iArr4[(i12 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr4[(i10 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr4[(i9 >> 24) & 255], 8)) ^ iArr[i11][0];
            int Camera2StreamConfigurationMap16 = (((iArr4[i9 & 255] ^ Camera2StreamConfigurationMap(iArr4[(i8 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr4[(i12 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr4[(i10 >> 24) & 255], 8)) ^ iArr[i11][1];
            int Camera2StreamConfigurationMap17 = (((iArr4[i10 & 255] ^ Camera2StreamConfigurationMap(iArr4[(i9 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr4[(i8 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr4[(i12 >> 24) & 255], 8)) ^ iArr[i11][2];
            int Camera2StreamConfigurationMap18 = (((iArr4[i12 & 255] ^ Camera2StreamConfigurationMap(iArr4[(i10 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr4[(i9 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr4[(i8 >> 24) & 255], 8)) ^ iArr[i11][3];
            byte[] bArr3 = getOutputStallDuration;
            byte b = bArr3[Camera2StreamConfigurationMap15 & 255];
            byte[] bArr4 = this.isOutputSupportedForhNQ4ISI;
            byte b2 = bArr4[(Camera2StreamConfigurationMap18 >> 8) & 255];
            byte b3 = bArr4[(Camera2StreamConfigurationMap17 >> 16) & 255];
            byte b4 = bArr3[(Camera2StreamConfigurationMap16 >> 24) & 255];
            int[] iArr5 = iArr[0];
            int i21 = iArr5[0];
            byte b5 = bArr4[Camera2StreamConfigurationMap16 & 255];
            byte b6 = bArr4[(Camera2StreamConfigurationMap15 >> 8) & 255];
            byte b7 = bArr3[(Camera2StreamConfigurationMap18 >> 16) & 255];
            byte b8 = bArr4[(Camera2StreamConfigurationMap17 >> 24) & 255];
            int i22 = iArr5[1];
            byte b9 = bArr4[Camera2StreamConfigurationMap17 & 255];
            byte b10 = bArr3[(Camera2StreamConfigurationMap16 >> 8) & 255];
            byte b11 = bArr3[(Camera2StreamConfigurationMap15 >> 16) & 255];
            byte b12 = bArr4[(Camera2StreamConfigurationMap18 >> 24) & 255];
            int i23 = iArr5[2];
            byte b13 = bArr3[Camera2StreamConfigurationMap18 & 255];
            byte b14 = bArr4[(Camera2StreamConfigurationMap17 >> 8) & 255];
            byte b15 = bArr4[(Camera2StreamConfigurationMap16 >> 16) & 255];
            byte b16 = bArr4[(Camera2StreamConfigurationMap15 >> 24) & 255];
            int i24 = iArr5[3];
            util.h.xy.fb.rb.m26840(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ (b4 << com.google.common.base.Ascii.CAN)) ^ i21, bArr2, i2);
            util.h.xy.fb.rb.m26840(((((b5 & 255) ^ ((b6 & 255) << 8)) ^ ((b7 & 255) << 16)) ^ (b8 << com.google.common.base.Ascii.CAN)) ^ i22, bArr2, i2 + 4);
            util.h.xy.fb.rb.m26840(((((b9 & 255) ^ ((b10 & 255) << 8)) ^ ((b11 & 255) << 16)) ^ (b12 << com.google.common.base.Ascii.CAN)) ^ i23, bArr2, i2 + 8);
            util.h.xy.fb.rb.m26840(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ (b16 << com.google.common.base.Ascii.CAN)) ^ i24, bArr2, i2 + 12);
            return 16;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        int m268425 = util.h.xy.fb.rb.m26842(bArr, i);
        int m268426 = util.h.xy.fb.rb.m26842(bArr, i + 4);
        int m268427 = util.h.xy.fb.rb.m26842(bArr, i + 8);
        int m268428 = util.h.xy.fb.rb.m26842(bArr, i + 12);
        int[] iArr6 = iArr[0];
        int i25 = m268425 ^ iArr6[0];
        int i26 = m268426 ^ iArr6[1];
        int i27 = m268427 ^ iArr6[2];
        int i28 = m268428 ^ iArr6[3];
        int i29 = getHighSpeedVideoFpsRangesFor + 3;
        getHighResolutionOutputSizeshNQ4ISI = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 1;
        while (i31 < maVar.unwrapAs - i3) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 119) % 128;
            int[] iArr7 = getInputSizeshNQ4ISI;
            int Camera2StreamConfigurationMap19 = (((Camera2StreamConfigurationMap(iArr7[(i26 >> 8) & 255], i5) ^ iArr7[i25 & 255]) ^ Camera2StreamConfigurationMap(iArr7[(i27 >> 16) & 255], i4)) ^ Camera2StreamConfigurationMap(iArr7[(i28 >> 24) & 255], i6)) ^ iArr[i31][c];
            int Camera2StreamConfigurationMap20 = (((Camera2StreamConfigurationMap(iArr7[(i27 >> 8) & 255], i5) ^ iArr7[i26 & 255]) ^ Camera2StreamConfigurationMap(iArr7[(i28 >> 16) & 255], i4)) ^ Camera2StreamConfigurationMap(iArr7[(i25 >> 24) & 255], i6)) ^ iArr[i31][1];
            int Camera2StreamConfigurationMap21 = (((iArr7[i27 & 255] ^ Camera2StreamConfigurationMap(iArr7[(i28 >> 8) & 255], i5)) ^ Camera2StreamConfigurationMap(iArr7[(i25 >> 16) & 255], i4)) ^ Camera2StreamConfigurationMap(iArr7[(i26 >> 24) & 255], 8)) ^ iArr[i31][2];
            int i32 = iArr7[i28 & 255];
            int Camera2StreamConfigurationMap22 = Camera2StreamConfigurationMap(iArr7[(i25 >> 8) & 255], i5);
            int Camera2StreamConfigurationMap23 = Camera2StreamConfigurationMap(iArr7[(i26 >> 16) & 255], 16);
            int i33 = i31 + 1;
            int Camera2StreamConfigurationMap24 = (((i32 ^ Camera2StreamConfigurationMap22) ^ Camera2StreamConfigurationMap23) ^ Camera2StreamConfigurationMap(iArr7[(i27 >> 24) & 255], 8)) ^ iArr[i31][3];
            int i34 = iArr7[Camera2StreamConfigurationMap19 & 255];
            int Camera2StreamConfigurationMap25 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap20 >> 8) & 255], i5);
            int Camera2StreamConfigurationMap26 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap21 >> 16) & 255], 16);
            int Camera2StreamConfigurationMap27 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap24 >> 24) & 255], 8);
            int i35 = iArr[i33][0];
            int i36 = iArr7[Camera2StreamConfigurationMap20 & 255];
            int Camera2StreamConfigurationMap28 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap21 >> 8) & 255], 24);
            int Camera2StreamConfigurationMap29 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap24 >> 16) & 255], 16);
            int Camera2StreamConfigurationMap30 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap19 >> 24) & 255], 8);
            int i37 = iArr[i33][1];
            int i38 = iArr7[Camera2StreamConfigurationMap21 & 255];
            int Camera2StreamConfigurationMap31 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap24 >> 8) & 255], 24);
            int Camera2StreamConfigurationMap32 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap19 >> 16) & 255], 16);
            int Camera2StreamConfigurationMap33 = Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap20 >> 24) & 255], 8);
            int i39 = iArr[i33][2];
            i31 += 2;
            i28 = (((iArr7[Camera2StreamConfigurationMap24 & 255] ^ Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap19 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap20 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr7[(Camera2StreamConfigurationMap21 >> 24) & 255], 8)) ^ iArr[i33][3];
            i25 = (((i34 ^ Camera2StreamConfigurationMap25) ^ Camera2StreamConfigurationMap26) ^ Camera2StreamConfigurationMap27) ^ i35;
            i26 = (((i36 ^ Camera2StreamConfigurationMap28) ^ Camera2StreamConfigurationMap29) ^ Camera2StreamConfigurationMap30) ^ i37;
            i27 = (Camera2StreamConfigurationMap33 ^ ((i38 ^ Camera2StreamConfigurationMap31) ^ Camera2StreamConfigurationMap32)) ^ i39;
            maVar = this;
            c = 0;
            i3 = 1;
            i4 = 16;
            i5 = 24;
            i6 = 8;
        }
        int[] iArr8 = getInputSizeshNQ4ISI;
        int Camera2StreamConfigurationMap34 = (((iArr8[i25 & 255] ^ Camera2StreamConfigurationMap(iArr8[(i26 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr8[(i27 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr8[(i28 >> 24) & 255], 8)) ^ iArr[i31][0];
        int Camera2StreamConfigurationMap35 = (((iArr8[i26 & 255] ^ Camera2StreamConfigurationMap(iArr8[(i27 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr8[(i28 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr8[(i25 >> 24) & 255], 8)) ^ iArr[i31][1];
        int Camera2StreamConfigurationMap36 = (((iArr8[i27 & 255] ^ Camera2StreamConfigurationMap(iArr8[(i28 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr8[(i25 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr8[(i26 >> 24) & 255], 8)) ^ iArr[i31][2];
        int Camera2StreamConfigurationMap37 = (((iArr8[i28 & 255] ^ Camera2StreamConfigurationMap(iArr8[(i25 >> 8) & 255], 24)) ^ Camera2StreamConfigurationMap(iArr8[(i26 >> 16) & 255], 16)) ^ Camera2StreamConfigurationMap(iArr8[(i27 >> 24) & 255], 8)) ^ iArr[i31][3];
        byte[] bArr5 = getOutputStallDurationlomOqCM;
        byte b17 = bArr5[Camera2StreamConfigurationMap34 & 255];
        byte b18 = bArr5[(Camera2StreamConfigurationMap35 >> 8) & 255];
        byte[] bArr6 = this.isOutputSupportedForhNQ4ISI;
        byte b19 = bArr6[(Camera2StreamConfigurationMap36 >> 16) & 255];
        byte b20 = bArr6[(Camera2StreamConfigurationMap37 >> 24) & 255];
        int[] iArr9 = iArr[i31 + 1];
        int i40 = iArr9[0];
        byte b21 = bArr6[Camera2StreamConfigurationMap35 & 255];
        byte b22 = bArr5[(Camera2StreamConfigurationMap36 >> 8) & 255];
        byte b23 = bArr5[(Camera2StreamConfigurationMap37 >> 16) & 255];
        byte b24 = bArr6[(Camera2StreamConfigurationMap34 >> 24) & 255];
        int i41 = iArr9[1];
        byte b25 = bArr6[Camera2StreamConfigurationMap36 & 255];
        byte b26 = bArr5[(Camera2StreamConfigurationMap37 >> 8) & 255];
        byte b27 = bArr5[(Camera2StreamConfigurationMap34 >> 16) & 255];
        byte b28 = bArr5[(Camera2StreamConfigurationMap35 >> 24) & 255];
        int i42 = iArr9[2];
        byte b29 = bArr6[Camera2StreamConfigurationMap37 & 255];
        byte b30 = bArr6[(Camera2StreamConfigurationMap34 >> 8) & 255];
        byte b31 = bArr6[(Camera2StreamConfigurationMap35 >> 16) & 255];
        byte b32 = bArr5[(Camera2StreamConfigurationMap36 >> 24) & 255];
        int i43 = iArr9[3];
        util.h.xy.fb.rb.m26840(i40 ^ ((((b17 & 255) ^ ((b18 & 255) << 8)) ^ ((b19 & 255) << 16)) ^ (b20 << com.google.common.base.Ascii.CAN)), bArr2, i2);
        util.h.xy.fb.rb.m26840(((((b21 & 255) ^ ((b22 & 255) << 8)) ^ ((b23 & 255) << 16)) ^ (b24 << com.google.common.base.Ascii.CAN)) ^ i41, bArr2, i2 + 4);
        util.h.xy.fb.rb.m26840(((((b25 & 255) ^ ((b26 & 255) << 8)) ^ ((b27 & 255) << 16)) ^ (b28 << com.google.common.base.Ascii.CAN)) ^ i42, bArr2, i2 + 8);
        util.h.xy.fb.rb.m26840(((((b29 & 255) ^ ((b30 & 255) << 8)) ^ ((b31 & 255) << 16)) ^ (b32 << com.google.common.base.Ascii.CAN)) ^ i43, bArr2, i2 + 12);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
        return 16;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26554() {
        int i = getHighSpeedVideoFpsRangesFor + 121;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i % 2 != 0 ? 100 : 16;
        int i4 = i2 + 113;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final void mo26556(boolean z, util.h.xy.ef.mb mbVar) {
        int length;
        if (!(mbVar instanceof util.h.xy.ep.mc)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.View.getDefaultSize(0, 0) + 127, "\u0084 \u0084\u0088\u0093\u0086\u0093\u0084\u0096\u009f\u009e\u0084\u008a\u0088\u0084\u0098\u0082\u0094\u0094\u009b\u009c\u0084\u009a\u0082\u0088\u0082\u009d\u009b\u009a\u009b\u009c\u0084\u0098\u0093\u0085\u009b\u0099\u0086\u0093", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(mbVar.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 117) % 128;
        byte[] m26663 = ((util.h.xy.ep.mc) mbVar).m26663();
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 93;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0 ? (length = m26663.length) >= 16 : (length = m26663.length) >= 90) {
            if (length <= 32) {
                getHighResolutionOutputSizeshNQ4ISI = (i + 35) % 128;
                if ((length & 7) == 0) {
                    int i3 = length >>> 2;
                    this.unwrapAs = i3 + 6;
                    int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i3 + 7, 4);
                    int i4 = 8;
                    char c = 3;
                    if (i3 == 4) {
                        int m26842 = util.h.xy.fb.rb.m26842(m26663, 0);
                        iArr[0][0] = m26842;
                        int m268422 = util.h.xy.fb.rb.m26842(m26663, 4);
                        iArr[0][1] = m268422;
                        int m268423 = util.h.xy.fb.rb.m26842(m26663, 8);
                        iArr[0][2] = m268423;
                        int m268424 = util.h.xy.fb.rb.m26842(m26663, 12);
                        iArr[0][3] = m268424;
                        for (int i5 = 1; i5 <= 10; i5++) {
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                            m26842 ^= Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(m268424, 8)) ^ getOutputMinFrameDuration[i5 - 1];
                            int[] iArr2 = iArr[i5];
                            iArr2[0] = m26842;
                            m268422 ^= m26842;
                            iArr2[1] = m268422;
                            m268423 ^= m268422;
                            iArr2[2] = m268423;
                            m268424 ^= m268423;
                            iArr2[3] = m268424;
                        }
                    } else if (i3 == 6) {
                        int m268425 = util.h.xy.fb.rb.m26842(m26663, 0);
                        iArr[0][0] = m268425;
                        int m268426 = util.h.xy.fb.rb.m26842(m26663, 4);
                        iArr[0][1] = m268426;
                        int m268427 = util.h.xy.fb.rb.m26842(m26663, 8);
                        iArr[0][2] = m268427;
                        int m268428 = util.h.xy.fb.rb.m26842(m26663, 12);
                        iArr[0][3] = m268428;
                        int m268429 = util.h.xy.fb.rb.m26842(m26663, 16);
                        int m2684210 = util.h.xy.fb.rb.m26842(m26663, 20);
                        int i6 = 1;
                        int i7 = 1;
                        while (true) {
                            int[] iArr3 = iArr[i7];
                            iArr3[0] = m268429;
                            iArr3[1] = m2684210;
                            int Camera2StreamConfigurationMap2 = m268425 ^ (Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(m2684210, 8)) ^ i6);
                            int[] iArr4 = iArr[i7];
                            iArr4[2] = Camera2StreamConfigurationMap2;
                            int i8 = m268426 ^ Camera2StreamConfigurationMap2;
                            iArr4[3] = i8;
                            int i9 = m268427 ^ i8;
                            int[] iArr5 = iArr[i7 + 1];
                            iArr5[0] = i9;
                            int i10 = m268428 ^ i9;
                            iArr5[1] = i10;
                            int i11 = m268429 ^ i10;
                            iArr5[2] = i11;
                            int i12 = m2684210 ^ i11;
                            iArr5[3] = i12;
                            int i13 = i6 << 2;
                            m268425 = Camera2StreamConfigurationMap2 ^ ((i6 << 1) ^ Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(i12, 8)));
                            int[] iArr6 = iArr[i7 + 2];
                            iArr6[0] = m268425;
                            m268426 = i8 ^ m268425;
                            iArr6[1] = m268426;
                            m268427 = i9 ^ m268426;
                            iArr6[2] = m268427;
                            m268428 = i10 ^ m268427;
                            iArr6[3] = m268428;
                            i7 += 3;
                            if (i7 >= 13) {
                                break;
                            }
                            m268429 = i11 ^ m268428;
                            m2684210 = i12 ^ m268429;
                            i6 = i13;
                        }
                    } else {
                        if (i3 != 8) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.resolveSize(0, 0), "\u0082\u009a\u0082\u0089\u0084\u0088\u0082\u0087\u0084\u009a\u0082\u0099\u0082\u0086\u0084\u0098\u0085\u0097\u008a\u0089\u0096", objArr2);
                            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
                        }
                        int m2684211 = util.h.xy.fb.rb.m26842(m26663, 0);
                        iArr[0][0] = m2684211;
                        int m2684212 = util.h.xy.fb.rb.m26842(m26663, 4);
                        iArr[0][1] = m2684212;
                        int m2684213 = util.h.xy.fb.rb.m26842(m26663, 8);
                        iArr[0][2] = m2684213;
                        int m2684214 = util.h.xy.fb.rb.m26842(m26663, 12);
                        iArr[0][3] = m2684214;
                        int m2684215 = util.h.xy.fb.rb.m26842(m26663, 16);
                        iArr[1][0] = m2684215;
                        int m2684216 = util.h.xy.fb.rb.m26842(m26663, 20);
                        iArr[1][1] = m2684216;
                        int m2684217 = util.h.xy.fb.rb.m26842(m26663, 24);
                        iArr[1][2] = m2684217;
                        int m2684218 = util.h.xy.fb.rb.m26842(m26663, 28);
                        iArr[1][3] = m2684218;
                        int i14 = 1;
                        int i15 = 2;
                        while (true) {
                            int i16 = i14 << 1;
                            m2684211 ^= Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(m2684218, i4)) ^ i14;
                            int[] iArr7 = iArr[i15];
                            iArr7[0] = m2684211;
                            m2684212 ^= m2684211;
                            iArr7[1] = m2684212;
                            m2684213 ^= m2684212;
                            iArr7[2] = m2684213;
                            m2684214 ^= m2684213;
                            iArr7[c] = m2684214;
                            int i17 = i15 + 1;
                            if (i17 >= 15) {
                                break;
                            }
                            m2684215 ^= Camera2StreamConfigurationMap(m2684214);
                            int[] iArr8 = iArr[i17];
                            iArr8[0] = m2684215;
                            m2684216 ^= m2684215;
                            iArr8[1] = m2684216;
                            m2684217 ^= m2684216;
                            iArr8[2] = m2684217;
                            m2684218 ^= m2684217;
                            iArr8[3] = m2684218;
                            i15 += 2;
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
                            i14 = i16;
                            i4 = 8;
                            c = 3;
                        }
                    }
                    if (!z) {
                        for (int i18 = 1; i18 < this.unwrapAs; i18++) {
                            int i19 = 0;
                            while (i19 < 4) {
                                int i20 = getHighSpeedVideoFpsRangesFor + 89;
                                getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int[] iArr9 = iArr[i18];
                                    iArr9[i19] = getHighSpeedVideoSizes(iArr9[i19]);
                                    i19 += 36;
                                } else {
                                    int[] iArr10 = iArr[i18];
                                    iArr10[i19] = getHighSpeedVideoSizes(iArr10[i19]);
                                    i19++;
                                }
                            }
                        }
                    }
                    int i21 = getHighSpeedVideoFpsRangesFor + 121;
                    getHighResolutionOutputSizeshNQ4ISI = i21 % 128;
                    if (i21 % 2 != 0) {
                        throw null;
                    }
                    this.getOutputMinFrameDurationlomOqCM = iArr;
                    this.getOutputSizes = z;
                    if (!z) {
                        this.isOutputSupportedForhNQ4ISI = util.h.xy.fb.a.m26821(getOutputStallDuration);
                        return;
                    }
                    this.isOutputSupportedForhNQ4ISI = util.h.xy.fb.a.m26821(getOutputStallDurationlomOqCM);
                    int i22 = getHighResolutionOutputSizeshNQ4ISI + 11;
                    getHighSpeedVideoFpsRangesFor = i22 % 128;
                    int i23 = i22 % 2;
                    return;
                }
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0095\u0094\u0088\u0093\u0092\u0084\u0091\u0090\u008c\u008e\u008c\u008f\u008b\u008e\u008d\u008c\u008b\u0084\u0088\u008a\u0086\u0084\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr3);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
    }

    private static int Camera2StreamConfigurationMap(int i) {
        int i2 = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        byte[] bArr = getOutputStallDurationlomOqCM;
        byte b = bArr[i & 255];
        byte b2 = bArr[(i >> 8) & 255];
        byte b3 = bArr[(i >> 16) & 255];
        byte b4 = bArr[(i >> 24) & 255];
        int i3 = i2 + 73;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return (b4 << com.google.common.base.Ascii.CAN) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
        }
        throw new java.lang.ArithmeticException();
    }

    private static int getHighSpeedVideoSizes(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i, 8) ^ i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 111;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        int i4 = i3 % 2 == 0 ? (Camera2StreamConfigurationMap2 & 2139062143) - 1 : ((((-2139062144) & Camera2StreamConfigurationMap2) >>> 7) * 27) ^ ((2139062143 & Camera2StreamConfigurationMap2) << 1);
        int i5 = i2 + 37;
        int i6 = i5 % 128;
        getHighSpeedVideoFpsRangesFor = i6;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i7 = i ^ i4;
        getHighResolutionOutputSizeshNQ4ISI = (i6 + 25) % 128;
        int i8 = (-1061109568) & i7;
        int i9 = i8 ^ (i8 >>> 1);
        int i10 = i6 + 19;
        getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
        if (i10 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i11 = Camera2StreamConfigurationMap2 ^ (((i9 >>> 2) ^ ((1061109567 & i7) << 2)) ^ (i9 >>> 5));
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(i11, 16);
        int i12 = getHighResolutionOutputSizeshNQ4ISI + 79;
        getHighSpeedVideoFpsRangesFor = i12 % 128;
        if (i12 % 2 != 0) {
            return i7 ^ (i11 ^ Camera2StreamConfigurationMap3);
        }
        throw null;
    }

    private static int Camera2StreamConfigurationMap(int i, int i2) {
        int i3;
        int i4;
        int i5 = getHighSpeedVideoFpsRangesFor + 35;
        int i6 = i5 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i6;
        if (i5 % 2 != 0) {
            i3 = i + i2;
            i4 = i / (-i2);
        } else {
            i3 = i >>> i2;
            i4 = i << (-i2);
        }
        getHighSpeedVideoFpsRangesFor = (i6 + 115) % 128;
        return i4 | i3;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputSizeshNQ4ISI = new char[]{64348, 64310, 64290, 64395, 64319, 64313, 64304, 64295, 64307, 64312, 64378, 64357, 64355, 64376, 64354, 64358, 64353, 64309, 64306, 64292, 64377, 64324, 64294, 64311, 64289, 64293, 64330, 64315, 64318, 64362, 64342, 64382, 64305};
        getHighSpeedVideoSizesFor = -1074857045;
        getInputFormats = true;
        getHighSpeedVideoSizes = true;
    }
}
