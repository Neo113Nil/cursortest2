package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class AESEngine implements org.bouncycastle.crypto.BlockCipher {
    private byte[] getInputFormats;
    private int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int[][] getOutputMinFrameDuration = null;
    private static final byte[] getHighSpeedVideoSizes = {99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
    private static final int[] Camera2StreamConfigurationMap = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, 250, 239, 197, 145};
    private static final int[] getHighSpeedVideoFpsRangesFor = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] getHighSpeedVideoFpsRanges = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to AES init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new java.lang.IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.getInputSizeshNQ4ISI = i + 6;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i + 7, 4);
        char c = 3;
        if (i == 4) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i2 = 1; i2 <= 10; i2++) {
                littleEndianToInt ^= Camera2StreamConfigurationMap((littleEndianToInt4 << (-8)) | (littleEndianToInt4 >>> 8)) ^ Camera2StreamConfigurationMap[i2 - 1];
                int[] iArr2 = iArr[i2];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = org.bouncycastle.util.Pack.littleEndianToInt(key, 16);
            int littleEndianToInt10 = org.bouncycastle.util.Pack.littleEndianToInt(key, 20);
            int i3 = 1;
            int i4 = 1;
            while (true) {
                int[] iArr3 = iArr[i4];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int Camera2StreamConfigurationMap2 = littleEndianToInt5 ^ (Camera2StreamConfigurationMap((littleEndianToInt10 << (-8)) | (littleEndianToInt10 >>> 8)) ^ i3);
                int[] iArr4 = iArr[i4];
                iArr4[2] = Camera2StreamConfigurationMap2;
                int i5 = littleEndianToInt6 ^ Camera2StreamConfigurationMap2;
                iArr4[3] = i5;
                int i6 = littleEndianToInt7 ^ i5;
                int[] iArr5 = iArr[i4 + 1];
                iArr5[0] = i6;
                int i7 = littleEndianToInt8 ^ i6;
                iArr5[1] = i7;
                int i8 = littleEndianToInt9 ^ i7;
                iArr5[2] = i8;
                int i9 = littleEndianToInt10 ^ i8;
                iArr5[3] = i9;
                int i10 = i3 << 2;
                littleEndianToInt5 = Camera2StreamConfigurationMap2 ^ ((i3 << 1) ^ Camera2StreamConfigurationMap((i9 << (-8)) | (i9 >>> 8)));
                int[] iArr6 = iArr[i4 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i5 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i6 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i7 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i4 += 3;
                if (i4 >= 13) {
                    break;
                }
                littleEndianToInt9 = i8 ^ littleEndianToInt8;
                littleEndianToInt10 = i9 ^ littleEndianToInt9;
                i3 = i10;
            }
        } else {
            if (i != 8) {
                throw new java.lang.IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = org.bouncycastle.util.Pack.littleEndianToInt(key, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = org.bouncycastle.util.Pack.littleEndianToInt(key, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = org.bouncycastle.util.Pack.littleEndianToInt(key, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = org.bouncycastle.util.Pack.littleEndianToInt(key, 28);
            iArr[1][3] = littleEndianToInt18;
            int i11 = 2;
            int i12 = 1;
            while (true) {
                int i13 = i12 << 1;
                littleEndianToInt11 ^= Camera2StreamConfigurationMap((littleEndianToInt18 << (-8)) | (littleEndianToInt18 >>> 8)) ^ i12;
                int[] iArr7 = iArr[i11];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c] = littleEndianToInt14;
                int i14 = i11 + 1;
                if (i14 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= Camera2StreamConfigurationMap(littleEndianToInt14);
                int[] iArr8 = iArr[i14];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[3] = littleEndianToInt18;
                i11 += 2;
                i12 = i13;
                c = 3;
            }
        }
        if (!z) {
            for (int i15 = 1; i15 < this.getInputSizeshNQ4ISI; i15++) {
                for (int i16 = 0; i16 < 4; i16++) {
                    int[] iArr9 = iArr[i15];
                    int i17 = iArr9[i16];
                    int i18 = ((i17 << (-8)) | (i17 >>> 8)) ^ i17;
                    int i19 = i17 ^ (((((-2139062144) & i18) >>> 7) * 27) ^ ((2139062143 & i18) << 1));
                    int i20 = (-1061109568) & i19;
                    int i21 = i20 ^ (i20 >>> 1);
                    int i22 = i18 ^ (((i21 >>> 2) ^ ((1061109567 & i19) << 2)) ^ (i21 >>> 5));
                    iArr9[i16] = i19 ^ (i22 ^ ((i22 << (-16)) | (i22 >>> 16)));
                }
            }
        }
        this.getOutputMinFrameDuration = iArr;
        this.getOutputFormats = z;
        if (z) {
            this.getInputFormats = org.bouncycastle.util.Arrays.clone(getHighSpeedVideoSizes);
        } else {
            this.getInputFormats = org.bouncycastle.util.Arrays.clone(getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.engines.AESEngine aESEngine = this;
        int[][] iArr = aESEngine.getOutputMinFrameDuration;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("AES engine not initialised");
        }
        int i3 = 16;
        if (i > bArr.length - 16) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        char c = 0;
        if (aESEngine.getOutputFormats) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
            int[] iArr2 = iArr[0];
            int i4 = littleEndianToInt ^ iArr2[0];
            int i5 = littleEndianToInt2 ^ iArr2[1];
            int i6 = littleEndianToInt3 ^ iArr2[2];
            int i7 = littleEndianToInt4 ^ iArr2[3];
            int i8 = 1;
            for (int i9 = 1; i8 < aESEngine.getInputSizeshNQ4ISI - i9; i9 = 1) {
                int[] iArr3 = getHighSpeedVideoFpsRangesFor;
                int i10 = iArr3[i4 & 255];
                int i11 = iArr3[(i5 >> 8) & 255];
                int i12 = ((i11 << (-24)) | (i11 >>> 24)) ^ i10;
                int i13 = iArr3[(i6 >> 16) & 255];
                int i14 = i12 ^ ((i13 << (-16)) | (i13 >>> i3));
                int i15 = iArr3[(i7 >> 24) & 255];
                int i16 = i14 ^ ((i15 << (-8)) | (i15 >>> 8));
                int[] iArr4 = iArr[i8];
                int i17 = i16 ^ iArr4[c];
                int i18 = iArr3[i5 & 255];
                int i19 = iArr3[(i6 >> 8) & 255];
                int i20 = ((i19 << (-24)) | (i19 >>> 24)) ^ i18;
                int i21 = iArr3[(i7 >> 16) & 255];
                int i22 = i20 ^ ((i21 << (-16)) | (i21 >>> i3));
                int i23 = iArr3[(i4 >> 24) & 255];
                int i24 = (i22 ^ ((i23 << (-8)) | (i23 >>> 8))) ^ iArr4[i9];
                int i25 = iArr3[i6 & 255];
                int i26 = iArr3[(i7 >> 8) & 255];
                int i27 = i25 ^ ((i26 << (-24)) | (i26 >>> 24));
                int i28 = iArr3[(i4 >> 16) & 255];
                int i29 = i27 ^ ((i28 << (-16)) | (i28 >>> i3));
                int i30 = iArr3[(i5 >> 24) & 255];
                int i31 = (i29 ^ ((i30 << (-8)) | (i30 >>> 8))) ^ iArr4[2];
                int i32 = iArr3[i7 & 255];
                int i33 = iArr3[(i4 >> 8) & 255];
                int i34 = iArr3[(i5 >> 16) & 255];
                int i35 = (i34 >>> i3) | (i34 << (-16));
                int i36 = iArr3[(i6 >> 24) & 255];
                int i37 = (((i32 ^ ((i33 >>> 24) | (i33 << (-24)))) ^ i35) ^ ((i36 >>> 8) | (i36 << (-8)))) ^ iArr4[3];
                int i38 = iArr3[i17 & 255];
                int i39 = iArr3[(i24 >> 8) & 255];
                int i40 = iArr3[(i31 >> 16) & 255];
                int i41 = (i40 >>> i3) | (i40 << (-16));
                int i42 = iArr3[(i37 >> 24) & 255];
                int[] iArr5 = iArr[i8 + 1];
                int i43 = iArr5[0];
                int i44 = iArr3[i24 & 255];
                int i45 = iArr3[(i31 >> 8) & 255];
                int i46 = iArr3[(i37 >> 16) & 255];
                int i47 = iArr3[(i17 >> 24) & 255];
                int i48 = (i47 << (-8)) | (i47 >>> 8);
                int i49 = iArr5[1];
                int[][] iArr6 = iArr;
                int i50 = iArr3[i31 & 255];
                int i51 = iArr3[(i37 >> 8) & 255];
                int i52 = (i51 << (-24)) | (i51 >>> 24);
                int i53 = iArr3[(i17 >> 16) & 255];
                int i54 = (i53 << (-16)) | (i53 >>> 16);
                int i55 = iArr3[(i24 >> 24) & 255];
                int i56 = iArr5[2];
                int i57 = iArr3[i37 & 255];
                int i58 = iArr3[(i17 >> 8) & 255];
                int i59 = iArr3[(i24 >> 16) & 255];
                int i60 = iArr3[(i31 >> 24) & 255];
                i8 += 2;
                i7 = (((i57 ^ ((i58 << (-24)) | (i58 >>> 24))) ^ ((i59 << (-16)) | (i59 >>> 16))) ^ ((i60 >>> 8) | (i60 << (-8)))) ^ iArr5[3];
                i4 = (((i38 ^ ((i39 >>> 24) | (i39 << (-24)))) ^ i41) ^ ((i42 << (-8)) | (i42 >>> 8))) ^ i43;
                i5 = (i48 ^ ((((i45 << (-24)) | (i45 >>> 24)) ^ i44) ^ ((i46 << (-16)) | (i46 >>> 16)))) ^ i49;
                i6 = (((i50 ^ i52) ^ i54) ^ ((i55 << (-8)) | (i55 >>> 8))) ^ i56;
                aESEngine = this;
                iArr = iArr6;
                i3 = 16;
                c = 0;
            }
            int[][] iArr7 = iArr;
            int[] iArr8 = getHighSpeedVideoFpsRangesFor;
            int i61 = iArr8[i4 & 255];
            int i62 = iArr8[(i5 >> 8) & 255];
            int i63 = i61 ^ ((i62 >>> 24) | (i62 << (-24)));
            int i64 = iArr8[(i6 >> 16) & 255];
            int i65 = i63 ^ ((i64 >>> 16) | (i64 << (-16)));
            int i66 = iArr8[(i7 >> 24) & 255];
            int i67 = i65 ^ ((i66 >>> 8) | (i66 << (-8)));
            int[] iArr9 = iArr7[i8];
            int i68 = i67 ^ iArr9[0];
            int i69 = iArr8[i5 & 255];
            int i70 = iArr8[(i6 >> 8) & 255];
            int i71 = i69 ^ ((i70 >>> 24) | (i70 << (-24)));
            int i72 = iArr8[(i7 >> 16) & 255];
            int i73 = i71 ^ ((i72 >>> 16) | (i72 << (-16)));
            int i74 = iArr8[(i4 >> 24) & 255];
            int i75 = (i73 ^ ((i74 >>> 8) | (i74 << (-8)))) ^ iArr9[1];
            int i76 = iArr8[i6 & 255];
            int i77 = iArr8[(i7 >> 8) & 255];
            int i78 = i76 ^ ((i77 >>> 24) | (i77 << (-24)));
            int i79 = iArr8[(i4 >> 16) & 255];
            int i80 = i78 ^ ((i79 >>> 16) | (i79 << (-16)));
            int i81 = iArr8[(i5 >> 24) & 255];
            int i82 = (i80 ^ ((i81 >>> 8) | (i81 << (-8)))) ^ iArr9[2];
            int i83 = iArr8[i7 & 255];
            int i84 = iArr8[(i4 >> 8) & 255];
            int i85 = iArr8[(i5 >> 16) & 255];
            int i86 = iArr8[(i6 >> 24) & 255];
            int i87 = (((i86 >>> 8) | (i86 << (-8))) ^ ((i83 ^ ((i84 >>> 24) | (i84 << (-24)))) ^ ((i85 << (-16)) | (i85 >>> 16)))) ^ iArr9[3];
            byte[] bArr3 = getHighSpeedVideoSizes;
            byte b = bArr3[i68 & 255];
            byte b2 = bArr3[(i75 >> 8) & 255];
            byte[] bArr4 = this.getInputFormats;
            byte b3 = bArr4[(i82 >> 16) & 255];
            byte b4 = bArr4[(i87 >> 24) & 255];
            int[] iArr10 = iArr7[i8 + 1];
            int i88 = iArr10[0];
            byte b5 = bArr4[i75 & 255];
            byte b6 = bArr3[(i82 >> 8) & 255];
            byte b7 = bArr3[(i87 >> 16) & 255];
            byte b8 = bArr4[(i68 >> 24) & 255];
            int i89 = iArr10[1];
            byte b9 = bArr4[i82 & 255];
            byte b10 = bArr3[(i87 >> 8) & 255];
            byte b11 = bArr3[(i68 >> 16) & 255];
            byte b12 = bArr3[(i75 >> 24) & 255];
            int i90 = iArr10[2];
            byte b13 = bArr4[i87 & 255];
            byte b14 = bArr4[(i68 >> 8) & 255];
            byte b15 = bArr4[(i75 >> 16) & 255];
            byte b16 = bArr3[(i82 >> 24) & 255];
            int i91 = iArr10[3];
            org.bouncycastle.util.Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ (b4 << com.google.common.base.Ascii.CAN)) ^ i88, bArr2, i2);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b5 & 255) ^ ((b6 & 255) << 8)) ^ ((b7 & 255) << 16)) ^ (b8 << com.google.common.base.Ascii.CAN)) ^ i89, bArr2, i2 + 4);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b9 & 255) ^ ((b10 & 255) << 8)) ^ ((b11 & 255) << 16)) ^ (b12 << com.google.common.base.Ascii.CAN)) ^ i90, bArr2, i2 + 8);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ (b16 << com.google.common.base.Ascii.CAN)) ^ i91, bArr2, i2 + 12);
            return 16;
        }
        int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
        int i92 = this.getInputSizeshNQ4ISI;
        int[] iArr11 = iArr[i92];
        int i93 = littleEndianToInt5 ^ iArr11[0];
        int i94 = 1;
        int i95 = littleEndianToInt6 ^ iArr11[1];
        int i96 = littleEndianToInt7 ^ iArr11[2];
        int i97 = i92 - 1;
        int i98 = littleEndianToInt8 ^ iArr11[3];
        while (i97 > i94) {
            int[] iArr12 = getHighSpeedVideoFpsRanges;
            int i99 = iArr12[i93 & 255];
            int i100 = iArr12[(i98 >> 8) & 255];
            int i101 = i99 ^ ((i100 >>> 24) | (i100 << (-24)));
            int i102 = iArr12[(i96 >> 16) & 255];
            int i103 = i101 ^ ((i102 >>> 16) | (i102 << (-16)));
            int i104 = iArr12[(i95 >> 24) & 255];
            int i105 = i103 ^ ((i104 >>> 8) | (i104 << (-8)));
            int[] iArr13 = iArr[i97];
            int i106 = i105 ^ iArr13[0];
            int i107 = iArr12[i95 & 255];
            int i108 = iArr12[(i93 >> 8) & 255];
            int i109 = i107 ^ ((i108 >>> 24) | (i108 << (-24)));
            int i110 = iArr12[(i98 >> 16) & 255];
            int i111 = i109 ^ ((i110 >>> 16) | (i110 << (-16)));
            int i112 = iArr12[(i96 >> 24) & 255];
            int i113 = (i111 ^ ((i112 >>> 8) | (i112 << (-8)))) ^ iArr13[1];
            int i114 = iArr12[i96 & 255];
            int i115 = iArr12[(i95 >> 8) & 255];
            int i116 = i114 ^ ((i115 >>> 24) | (i115 << (-24)));
            int i117 = iArr12[(i93 >> 16) & 255];
            int i118 = i116 ^ ((i117 >>> 16) | (i117 << (-16)));
            int i119 = iArr12[(i98 >> 24) & 255];
            int i120 = (i118 ^ ((i119 >>> 8) | (i119 << (-8)))) ^ iArr13[2];
            int i121 = iArr12[i98 & 255];
            int i122 = iArr12[(i96 >> 8) & 255];
            int i123 = iArr12[(i95 >> 16) & 255];
            int i124 = (i123 >>> 16) | (i123 << (-16));
            int i125 = iArr12[(i93 >> 24) & 255];
            int i126 = (((i125 >>> 8) | (i125 << (-8))) ^ ((i121 ^ ((i122 >>> 24) | (i122 << (-24)))) ^ i124)) ^ iArr13[3];
            int i127 = iArr12[i106 & 255];
            int i128 = iArr12[(i126 >> 8) & 255];
            int i129 = iArr12[(i120 >> 16) & 255];
            int i130 = (i129 >>> 16) | (i129 << (-16));
            int i131 = iArr12[(i113 >> 24) & 255];
            int i132 = (i131 >>> 8) | (i131 << (-8));
            int[] iArr14 = iArr[i97 - 1];
            int i133 = iArr14[0];
            int i134 = iArr12[i113 & 255];
            int i135 = iArr12[(i106 >> 8) & 255];
            int i136 = iArr12[(i126 >> 16) & 255];
            int i137 = iArr12[(i120 >> 24) & 255];
            int i138 = (i137 << (-8)) | (i137 >>> 8);
            int i139 = iArr14[1];
            int i140 = iArr12[i120 & 255];
            int i141 = iArr12[(i113 >> 8) & 255];
            int i142 = (i141 << (-24)) | (i141 >>> 24);
            int i143 = iArr12[(i106 >> 16) & 255];
            int i144 = (i143 << (-16)) | (i143 >>> 16);
            int i145 = iArr12[(i126 >> 24) & 255];
            int i146 = iArr14[2];
            int i147 = iArr12[i126 & 255];
            int i148 = iArr12[(i120 >> 8) & 255];
            int i149 = iArr12[(i113 >> 16) & 255];
            int i150 = iArr12[(i106 >> 24) & 255];
            i97 -= 2;
            int i151 = (((i127 ^ ((i128 >>> 24) | (i128 << (-24)))) ^ i130) ^ i132) ^ i133;
            i95 = (((i134 ^ ((i135 << (-24)) | (i135 >>> 24))) ^ ((i136 << (-16)) | (i136 >>> 16))) ^ i138) ^ i139;
            i96 = (((i145 << (-8)) | (i145 >>> 8)) ^ ((i140 ^ i142) ^ i144)) ^ i146;
            i94 = 1;
            i98 = (((i147 ^ ((i148 << (-24)) | (i148 >>> 24))) ^ ((i149 << (-16)) | (i149 >>> 16))) ^ ((i150 >>> 8) | (i150 << (-8)))) ^ iArr14[3];
            i93 = i151;
        }
        int[] iArr15 = getHighSpeedVideoFpsRanges;
        int i152 = iArr15[i93 & 255];
        int i153 = iArr15[(i98 >> 8) & 255];
        int i154 = i152 ^ ((i153 >>> 24) | (i153 << (-24)));
        int i155 = iArr15[(i96 >> 16) & 255];
        int i156 = i154 ^ ((i155 >>> 16) | (i155 << (-16)));
        int i157 = iArr15[(i95 >> 24) & 255];
        int[] iArr16 = iArr[i97];
        int i158 = (i156 ^ ((i157 >>> 8) | (i157 << (-8)))) ^ iArr16[0];
        int i159 = iArr15[i95 & 255];
        int i160 = iArr15[(i93 >> 8) & 255];
        int i161 = i159 ^ ((i160 >>> 24) | (i160 << (-24)));
        int i162 = iArr15[(i98 >> 16) & 255];
        int i163 = i161 ^ ((i162 >>> 16) | (i162 << (-16)));
        int i164 = iArr15[(i96 >> 24) & 255];
        int i165 = (i163 ^ ((i164 >>> 8) | (i164 << (-8)))) ^ iArr16[1];
        int i166 = iArr15[i96 & 255];
        int i167 = iArr15[(i95 >> 8) & 255];
        int i168 = i166 ^ ((i167 >>> 24) | (i167 << (-24)));
        int i169 = iArr15[(i93 >> 16) & 255];
        int i170 = i168 ^ ((i169 >>> 16) | (i169 << (-16)));
        int i171 = iArr15[(i98 >> 24) & 255];
        int i172 = (i170 ^ ((i171 >>> 8) | (i171 << (-8)))) ^ iArr16[2];
        int i173 = iArr15[i98 & 255];
        int i174 = iArr15[(i96 >> 8) & 255];
        int i175 = iArr15[(i95 >> 16) & 255];
        int i176 = iArr15[(i93 >> 24) & 255];
        int i177 = (((i176 >>> 8) | (i176 << (-8))) ^ ((i173 ^ ((i174 >>> 24) | (i174 << (-24)))) ^ ((i175 >>> 16) | (i175 << (-16))))) ^ iArr16[3];
        byte[] bArr5 = getHighResolutionOutputSizeshNQ4ISI;
        byte b17 = bArr5[i158 & 255];
        byte[] bArr6 = this.getInputFormats;
        byte b18 = bArr6[(i177 >> 8) & 255];
        byte b19 = bArr6[(i172 >> 16) & 255];
        byte b20 = bArr5[(i165 >> 24) & 255];
        int[] iArr17 = iArr[0];
        int i178 = iArr17[0];
        byte b21 = bArr6[i165 & 255];
        byte b22 = bArr6[(i158 >> 8) & 255];
        byte b23 = bArr5[(i177 >> 16) & 255];
        byte b24 = bArr6[(i172 >> 24) & 255];
        int i179 = iArr17[1];
        byte b25 = bArr6[i172 & 255];
        byte b26 = bArr5[(i165 >> 8) & 255];
        byte b27 = bArr5[(i158 >> 16) & 255];
        byte b28 = bArr6[(i177 >> 24) & 255];
        int i180 = iArr17[2];
        byte b29 = bArr5[i177 & 255];
        byte b30 = bArr6[(i172 >> 8) & 255];
        byte b31 = bArr6[(i165 >> 16) & 255];
        byte b32 = bArr6[(i158 >> 24) & 255];
        int i181 = iArr17[3];
        org.bouncycastle.util.Pack.intToLittleEndian(((((b17 & 255) ^ ((b18 & 255) << 8)) ^ ((b19 & 255) << 16)) ^ (b20 << com.google.common.base.Ascii.CAN)) ^ i178, bArr2, i2);
        org.bouncycastle.util.Pack.intToLittleEndian(((((b21 & 255) ^ ((b22 & 255) << 8)) ^ ((b23 & 255) << 16)) ^ (b24 << com.google.common.base.Ascii.CAN)) ^ i179, bArr2, i2 + 4);
        org.bouncycastle.util.Pack.intToLittleEndian(((((b25 & 255) ^ ((b26 & 255) << 8)) ^ ((b27 & 255) << 16)) ^ (b28 << com.google.common.base.Ascii.CAN)) ^ i180, bArr2, i2 + 8);
        org.bouncycastle.util.Pack.intToLittleEndian(((((b29 & 255) ^ ((b30 & 255) << 8)) ^ ((b31 & 255) << 16)) ^ (b32 << com.google.common.base.Ascii.CAN)) ^ i181, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return org.jose4j.keys.AesKey.ALGORITHM;
    }

    private static int Camera2StreamConfigurationMap(int i) {
        byte[] bArr = getHighSpeedVideoSizes;
        return (bArr[(i >> 24) & 255] << com.google.common.base.Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }
}
