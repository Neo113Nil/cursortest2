package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5C {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"0jhNC1Lyu0lVYVQP", "8o531PEVmArnbRMxdetuA21oKPXOiLv", "tOAQF6Pzc2RVYks8fQT2p1g882rTPCd1", "wz1og", "CbSxkJOpnDO18KCthbWuHDege0bytfRM", "NVorx5pvNTEUlNt2QwU2VxD5ww57Xut2", "eRRRkvRnvdqMQMmsSxWecKvTVYNexEDg", "GD5J9oYLAsqrZf6ewUEjnT79ojUC6XcO"};
    public static final int A02;
    public static final java.lang.String A03;
    public static final java.lang.String A04;
    public static final java.lang.String A05;
    public static final java.lang.String A06;
    public static final byte[] A07;
    public static final java.util.regex.Pattern A08;
    public static final java.util.regex.Pattern A09;
    public static final java.util.regex.Pattern A0A;
    public static final java.util.regex.Pattern A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final java.lang.String[] A0E;
    public static final java.lang.String[] A0F;

    public static java.lang.String A0i(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0v() {
        A00 = new byte[]{-100, -92, -56, -27, -22, -15, -12, -73, -67, -22, -32, -18, -21, -27, -32, -100, -58, -55, -4, -30, -50, -25, 2, -50, 7, -47, -50, -38, -2, com.google.common.base.Ascii.FS, -45, com.google.common.base.Ascii.RS, -54, com.google.common.base.Ascii.RS, 53, 48, 36, 32, 82, 36, com.google.common.base.Ascii.US, 53, 95, 105, 99, 98, 53, com.google.common.base.Ascii.RS, 53, 48, 37, com.google.common.base.Ascii.RS, 99, 87, 100, 95, 92, 91, 105, 106, com.google.common.base.Ascii.RS, 36, 32, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, 53, com.google.common.base.Ascii.US, 53, com.google.common.base.Ascii.US, 83, 91, 83, 91, 83, 91, 83, 91, 32, 83, 36, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, 83, 36, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, 82, 75, 107, 84, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, 49, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, 49, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, com.google.common.base.Ascii.US, 82, 83, 37, 35, 84, com.google.common.base.Ascii.US, 83, 91, 34, 32, 32, 54, com.google.common.base.Ascii.US, 82, 81, 113, 84, 115, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, 83, 34, 115, 83, 36, 32, com.google.common.base.Ascii.US, 83, 91, 54, 83, 91, 32, 49, 54, com.google.common.base.Ascii.US, 83, 91, 83, 91, 32, 32, 32, 54, -83, -92, -46, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.VT, -47, -19, -34, -18, -35, -14, -27, -35, -3, 48, 39, 8, 36, com.google.common.base.Ascii.EM, 49, com.google.common.base.Ascii.GS, 42, 4, 33, com.google.common.base.Ascii.SUB, -25, -22, -26, -16, -26, -23, com.google.common.base.Ascii.ESC, 54, 62, 65, 58, 57, -11, 73, 68, -11, 71, 58, 54, 57, -11, 72, 78, 72, 73, 58, 66, -11, 69, 71, 68, 69, 58, 71, 73, 78, -11, 45, 82, 90, 69, 80, 77, 72, 4, 72, 77, 87, 84, 80, 69, 93, 4, 87, 77, 94, 73, com.google.common.base.Ascii.RS, 4, 10, com.google.common.base.Ascii.VT, kotlin.io.encoding.Base64.padSymbol, 62, 78, 52, 71, 50, 52, 52, 51, 66, 78, 50, 48, 63, 48, 49, 56, 59, 56, 67, 56, 52, 66, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 37, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 10, 37, 10, com.google.common.base.Ascii.CAN, 19, kotlin.io.encoding.Base64.padSymbol, 62, 78, 68, kotlin.io.encoding.Base64.padSymbol, 66, 68, 63, 63, 62, 65, 67, 52, 51, 78, 67, 72, 63, 52, -47, -19, -20, -9, 62, 93, 82, 85, -6, -26, -12, 58, 4, 9, 5, com.google.common.base.Ascii.ESC, 44, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 57, 6, 5, 53, 5, com.google.common.base.Ascii.ESC, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 57, 6, 5, 41, 5, com.google.common.base.Ascii.ESC, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 57, 6, 5, 32, 5, com.google.common.base.Ascii.ESC, 4, 48, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 57, 6, 5, 36, 5, com.google.common.base.Ascii.ESC, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 57, 6, 5, 41, 5, com.google.common.base.Ascii.ESC, 4, 4, 55, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.NAK, 10, 57, 6, 5, 47, 5, com.google.common.base.Ascii.ESC, 5, com.google.common.base.Ascii.ESC, 0, 90, 100, 38, 109, 112, 98, 75, 86, 76, -4, 9, -1, com.google.common.base.Ascii.CR, 10, 4, -1, -55, 3, -4, com.google.common.base.Ascii.CR, -1, com.google.common.base.Ascii.DC2, -4, com.google.common.base.Ascii.CR, 0, -55, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, 0, -55, -4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, 10, 8, 10, com.google.common.base.Ascii.SI, 4, 17, 0, 5, com.google.common.base.Ascii.DC2, 8, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.CR, 8, -46, 19, com.google.common.base.Ascii.ETB, -46, -9, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, 9, 17, -12, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, 9, com.google.common.base.Ascii.ETB, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 79, 75, 72, 66, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 83, 72, 78, 77, com.google.common.base.Ascii.SO, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 82, 71, 10, 87, 76, 75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 55, 47, 37, -17, 46, 52, -18, 52, 52, 53, 51, -20, 57, 46, 45, -23, -8, -8, -12, -15, -21, -23, -4, -15, -9, -10, -73, 0, -75, -11, -8, -19, -17, -35, -38, -44, 66, 81, 81, 77, 74, 68, 66, 85, 74, 80, 79, com.google.common.base.Ascii.DLE, 89, com.google.common.base.Ascii.SO, 83, 85, 84, 81, 57, 74, 5, 57, 74, 58, com.google.common.base.Ascii.CAN, 41, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, 49, 48, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 54, 67, 81, 94, 98, com.google.common.base.Ascii.SI, 32, -21, -2, -5, -9, -4, -3, 32, 42, 43, 39, 51, 49, -14, 55, 51, 50, kotlin.io.encoding.Base64.padSymbol, -14, 40, 56, 58, -14, 44, 37, 54, 40, 59, 37, 54, 41, -14, 52, 37, 50, 41, 48, -14, 53, 42, 44, 40, 51, 67, -21, 1, com.google.common.base.Ascii.SYN, 45, com.google.common.base.Ascii.CAN, 75, 76, 69, 74, 84, 81, 77, 66, 90, 72, 89, 88, com.google.common.base.Ascii.EM, 32, -14, 2, -17, -22, 10, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 9, 76, 85, 88, 83, 71, 90, 35, 83, com.google.common.base.Ascii.EM, 91, com.google.common.base.Ascii.RS, 19, 71, 71, 86, 82, 10, 19, com.google.common.base.Ascii.SYN, 17, 5, com.google.common.base.Ascii.CAN, -31, 17, com.google.common.base.Ascii.DC4, 8, -47, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, 17, 9, -47, 7, com.google.common.base.Ascii.ETB, 10, -30, -18, 7, 19, 6, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 39, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, 37, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.EM, 62, 73, 60, 58, 51, kotlin.io.encoding.Base64.padSymbol, 76, 70, 87, 17, 70, 83, 87, -1, -7, 10, -60, -1, 9, com.google.common.base.Ascii.CR, -1, -7, 10, -60, 10, 9, 7, 63, 60, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 93, 103, 63, 73, 77, 85, 96, 91, com.google.common.base.Ascii.GS, 46, 76, com.google.common.base.Ascii.DLE, 75, 68, 78, com.google.common.base.Ascii.EM, -35, com.google.common.base.Ascii.FS, 37, 40, -5, -65, 0, -13, 8, -13, -4, 1, -1, -7, -5, -5, -10, 85, 90, com.google.common.base.Ascii.ESC, 32, com.google.common.base.Ascii.SYN, 65, 75, 32, 42, 36, 74, 84, 78, 77, 77, 91, 76, 75, 59, 49, 33, com.google.common.base.Ascii.ETB, 70, com.google.common.base.Ascii.FF, 78, 17, 72, 60, 62, com.google.common.base.Ascii.VT, -1, com.google.common.base.Ascii.CR, 0, -12, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.CR, 36, 34, -9, -6, -18, 54, 60, 19, com.google.common.base.Ascii.EM, -45, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 10, 76, 88, 58, 45, 58, -22, -34, 87, 85, 85, 85, 65, 65, 66, -10, -9, -75, -22, -9, -13, -21, -20, -86, -21, -21, -20, 63, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -2, 63, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 51, 102, 103, 37, 102, 113, 102, 34, 35, com.google.common.base.Ascii.SYN, -22, -14, 91, 80, 93, com.google.common.base.Ascii.CR, 10, 44, 46, 45, 42, 80, 83, 75, com.google.common.base.Ascii.SO, -2, -2, 9, 1, 8, 1, 4, 102, 100, 7, 5, 0, -3, 8, -7, -13, 1, -11, 7, 8, -7, 6, 57, 56, 9, 8, 6, 62, 68, 62, -7, 47, 52, 62, 59, 55, 44, 68, -8, 62, 52, 69, 48, 54, 36, 46, 33, 48, 35, 47, 39, -30, -1, -30, 1, 9, -2, -9, 45, 48, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, -13, -25, -21, -19, -30, -29, com.google.common.base.Ascii.CR, -4, 5, -5, 6, 9, -59, -5, 0, 10, 7, 3, -8, com.google.common.base.Ascii.DLE, -60, 10, 0, 17, -4, com.google.common.base.Ascii.DC2, 0, 7, 85, 71, 76, 66, 77, 85, 98, 107, 91, -2, -20, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CR, -46, 8, com.google.common.base.Ascii.DC2, 19, 80, 62, 3, kotlin.io.encoding.Base64.padSymbol, 75, 69, 79, 75, 19, 1, -58, 1, -6, 4, 37, 19, -40, 19, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 
        41, com.google.common.base.Ascii.ETB, -36, com.google.common.base.Ascii.ETB, 34, com.google.common.base.Ascii.GS, -9, -27, -86, -22, -26, -21, -86, -21, -34, -21, 96, 78, 19, 84, 71, 84, 62, 44, -15, 60, 45, 37, 50, 43};
    }

    static {
        A0v();
        A02 = android.os.Build.VERSION.SDK_INT;
        A03 = android.os.Build.DEVICE;
        A05 = android.os.Build.MANUFACTURER;
        A06 = android.os.Build.MODEL;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A03);
        java.lang.String A0i = A0i(166, 2, 111);
        A04 = append.append(A0i).append(A06).append(A0i).append(A05).append(A0i).append(A02).toString();
        A07 = new byte[0];
        A0A = java.util.regex.Pattern.compile(A0i(68, 95, 123));
        A0B = java.util.regex.Pattern.compile(A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 84, 96));
        A08 = java.util.regex.Pattern.compile(A0i(16, 17, 37));
        A09 = java.util.regex.Pattern.compile(A0i(33, 35, 122), 2);
        A0E = new java.lang.String[]{A0i(com.ironsource.InterfaceC3141l1.a.b.j, 3, 110), A0i(877, 2, 119), A0i(567, 3, 46), A0i(739, 2, 57), A0i(570, 3, 83), A0i(642, 2, 17), A0i(580, 3, 13), A0i(814, 2, 99), A0i(925, 3, 25), A0i(573, 2, 88), A0i(583, 3, 24), A0i(970, 2, 8), A0i(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 3, 55), A0i(621, 2, 84), A0i(637, 3, 104), A0i(821, 2, 109), A0i(693, 3, 55), A0i(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, 2, 107), A0i(699, 3, 91), A0i(640, 2, 56), A0i(687, 3, 37), A0i(685, 2, 0), A0i(690, 3, 60), A0i(782, 2, 84), A0i(759, 3, 26), A0i(769, 2, 92), A0i(790, 3, 95), A0i(801, 2, 59), A0i(793, 3, 34), A0i(799, 2, 40), A0i(796, 3, 23), A0i(806, 2, 77), A0i(857, 3, 111), A0i(644, 2, 13), A0i(866, 3, 98), A0i(860, 2, 31), A0i(869, 3, 31), A0i(719, 7, 27), A0i(874, 3, 25), A0i(872, 2, 26), A0i(958, 3, 31), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 2, 12), A0i(762, 2, 22), A0i(808, 6, 42), A0i(778, 2, 104), A0i(726, 2, 91), A0i(728, 3, 46), A0i(726, 2, 91), A0i(780, 2, 102), A0i(968, 2, 118), A0i(564, 3, 59), A0i(558, 6, 92), A0i(764, 2, 112), A0i(808, 6, 42), A0i(766, 3, 54), A0i(808, 6, 42), A0i(819, 2, 0), A0i(840, 6, 85), A0i(852, 3, 56), A0i(840, 6, 85), A0i(823, 2, 107), A0i(834, 6, 1), A0i(825, 3, 87), A0i(834, 6, 1), A0i(com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, 2, 61), A0i(com.ironsource.InterfaceC3141l1.a.b.d, 6, 125), A0i(930, 3, 38), A0i(com.ironsource.InterfaceC3141l1.a.b.d, 6, 125), A0i(578, 2, 49), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_EXCEPTION, 7, 104), A0i(575, 3, 115), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_EXCEPTION, 7, 104), A0i(731, 2, 121), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 7, 27), A0i(733, 3, 91), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 7, 27), A0i(892, 2, 74), A0i(719, 7, 27), A0i(894, 3, 26), A0i(719, 7, 27), A0i(586, 3, 65), A0i(972, 6, 41), A0i(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, 3, 86), A0i(986, 6, 29), A0i(816, 3, 80), A0i(1016, 6, 106), A0i(736, 3, 113), A0i(1000, 6, 51)};
        A0F = new java.lang.String[]{A0i(746, 5, 52), A0i(784, 2, 57), A0i(741, 5, 103), A0i(986, 6, 29), A0i(751, 8, 22), A0i(855, 2, 0), A0i(828, 6, 12), A0i(840, 6, 85), A0i(846, 6, 124), A0i(834, 6, 1), A0i(978, 8, 90), A0i(972, 6, 41), A0i(992, 8, 47), A0i(986, 6, 29), A0i(1006, 10, 1), A0i(1016, 6, 106), A0i(1022, 8, 72), A0i(1000, 6, 51)};
        A0C = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A0D = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, 205, 144, 151, 158, 153, 140, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, 185, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, androidx.compose.material.TextFieldImplKt.AnimationDuration, 145, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 159, 138, 141, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static float A00(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f, f3));
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                java.lang.String[] strArr = A01;
                if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "qx6Bj";
                return 204;
            case 5:
                return com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return (A02 < 23 && A02 < 21) ? 0 : 6396;
            case 9:
            case 10:
            case 11:
            default:
                return 0;
            case 12:
                if (A02 < 32) {
                    return 0;
                }
                return 743676;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case 2:
            case 4:
            case 7:
            case 16:
            case 18:
                return 6005;
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 23:
            default:
                java.lang.String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[2] = "jxwDVk5Xin8Qw09ydBb2VsJiyiTp54vB";
                strArr2[5] = "SYToZK6HQezNburr1bp2e1PUtswsXJGu";
                return 6006;
            case 8:
            case 15:
                return 6003;
            case 10:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return 6002;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 8:
                return 3;
            case 16:
                return 2;
            case 24:
                return 536870912;
            case 32:
                return 805306368;
            default:
                return 0;
        }
    }

    public static int A04(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                java.lang.String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[7] = "Xwv9tgmCDWWECZ2rTxC05riy18CzxfIS";
                strArr2[1] = "vJ1JY8dVYpQ7RvuZirsFVuB4oK25CZB";
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A05(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int A06(int i, int i2) {
        switch (i) {
            case 2:
            case 268435456:
                return i2 * 2;
            case 3:
                return i2;
            case 4:
            case 805306368:
                return i2 * 4;
            case 536870912:
                return i2 * 3;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    public static int A07(int i, int i2, int i3) {
        return java.lang.Math.max(i2, java.lang.Math.min(i, i3));
    }

    public static int A08(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int A09(android.content.Context context, java.lang.String str, boolean z) {
        if (A02 < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            return 1;
        }
        return 5;
    }

    public static int A0A(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            java.lang.String scheme2 = A0i(862, 4, 62);
            if (com.facebook.ads.redexgen.core.AbstractC1831k7.A03(scheme2, scheme)) {
                return 3;
            }
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            int i = lastIndexOf + 1;
            java.lang.String[] strArr = A01;
            java.lang.String lastPathSegment2 = strArr[4];
            if (lastPathSegment2.charAt(18) != strArr[6].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "a9wHr";
            java.lang.String scheme3 = lastPathSegment.substring(i);
            int A0E2 = A0E(scheme3);
            if (A0E2 != 4) {
                return A0E2;
            }
        }
        java.util.regex.Pattern pattern = A09;
        java.lang.String scheme4 = uri.getPath();
        java.util.regex.Matcher matcher = pattern.matcher((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC04203y.A01(scheme4));
        if (!matcher.matches()) {
            return 4;
        }
        java.lang.String group = matcher.group(2);
        if (group != null) {
            java.lang.String scheme5 = A0i(666, 19, 40);
            if (group.contains(scheme5)) {
                return 0;
            }
            java.lang.String scheme6 = A0i(650, 16, 106);
            if (group.contains(scheme6)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A0B(android.net.Uri uri, java.lang.String str) {
        char c;
        if (str == null) {
            return A0A(uri);
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(A0i(519, 21, 12))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -156749520:
                if (str.equals(A0i(492, 27, 69))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64194685:
                if (str.equals(A0i(472, 20, 99))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1154777587:
                if (str.equals(A0i(540, 18, 101))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int A0C(com.facebook.ads.redexgen.core.C04294h c04294h, long j, boolean z, boolean z2) {
        int i = 0;
        int lowIndex = c04294h.A02();
        int i2 = lowIndex - 1;
        while (i <= i2) {
            int lowIndex2 = i + i2;
            int i3 = lowIndex2 >>> 1;
            if (c04294h.A03(i3) < j) {
                i = i3 + 1;
            } else {
                i2 = i3 - 1;
            }
        }
        if (z) {
            int highIndex = i2 + 1;
            int lowIndex3 = c04294h.A02();
            if (highIndex < lowIndex3) {
                int lowIndex4 = i2 + 1;
                if (c04294h.A03(lowIndex4) == j) {
                    return i2 + 1;
                }
            }
        }
        if (!z2 || i2 != -1) {
            return i2;
        }
        return 0;
    }

    public static int A0D(java.lang.String str) {
        int length = str.length();
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(length <= 4);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int length2 = str.charAt(i);
            result = (result << 8) | length2;
        }
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A0E(java.lang.String str) {
        char c;
        java.lang.String A012 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(str);
        switch (A012.hashCode()) {
            case 104579:
                if (A012.equals(A0i(771, 3, 59))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 108321:
                if (A012.equals(A0i(803, 3, 14))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3242057:
                if (A012.equals(A0i(774, 4, 101))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3299913:
                if (A012.equals(A0i(786, 4, 93))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
            case 3:
                return 1;
            default:
                return 4;
        }
    }

    public static int A0F(java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i2 : java.lang.Integer.reverseBytes(i2);
    }

    public static <T extends java.lang.Comparable<? super T>> int A0G(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int index;
        int binarySearch = java.util.Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            int listSize = list.size();
            do {
                binarySearch++;
                if (binarySearch >= listSize) {
                    break;
                }
                index = list.get(binarySearch).compareTo(t);
            } while (index == 0);
            if (z) {
                binarySearch--;
            }
        }
        if (!z2) {
            return binarySearch;
        }
        int index2 = list.size();
        int i = index2 - 1;
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[4];
        java.lang.String str2 = strArr[6];
        int charAt = str.charAt(18);
        int index3 = str2.charAt(18);
        if (charAt != index3) {
            throw new java.lang.RuntimeException();
        }
        A01[0] = "AVDkOIGrSYkQO6";
        return java.lang.Math.min(i, binarySearch);
    }

    public static <T extends java.lang.Comparable<? super T>> int A0H(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int index;
        int binarySearch = java.util.Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            int index2 = binarySearch + 2;
            binarySearch = -index2;
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
                java.lang.Comparable<? super T> comparable = list.get(binarySearch);
                if (A01[0].length() == 0) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[7] = "7wt3cZrGAy9gNsgF7PLcTg6oSzn5VQ1a";
                strArr[1] = "U87bGfnBcGjZypJnFtFTdrSmy7sh89Q";
                index = comparable.compareTo(t);
            } while (index == 0);
            if (z) {
                binarySearch++;
            }
        }
        return z2 ? java.lang.Math.max(0, binarySearch) : binarySearch;
    }

    public static int A0I(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int[] iArr = A0C;
            int i4 = bArr[i];
            i3 = (i3 << 8) ^ iArr[((i3 >>> 24) ^ (i4 & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int A0J(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int[] iArr = A0D;
            int i4 = bArr[i];
            i3 = iArr[(i4 & 255) ^ i3];
            i++;
        }
        return i3;
    }

    public static int A0K(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            do {
                binarySearch++;
                int index = jArr.length;
                if (binarySearch >= index) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch--;
            }
        }
        if (!z2) {
            return binarySearch;
        }
        int index2 = jArr.length;
        return java.lang.Math.min(index2 - 1, binarySearch);
    }

    public static int A0L(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            int index = binarySearch + 2;
            binarySearch = -index;
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch++;
            }
        }
        return z2 ? java.lang.Math.max(0, binarySearch) : binarySearch;
    }

    public static long A0M(int i) {
        return i & 4294967295L;
    }

    public static long A0N(int i, int i2) {
        return (A0M(i) << 32) | A0M(i2);
    }

    public static long A0O(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long A0P(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long A0Q(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        long round = java.lang.Math.round(j * f);
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[7] = "9GRIvgtOgBa9bXM6PfbvjJ8DWw6epVtI";
        strArr2[1] = "tkq8pPym2INMgxVxZaKpNGxpJRL95Qh";
        return round;
    }

    public static long A0R(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return java.lang.Math.round(j / f);
    }

    public static long A0S(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0T(long j, long j2, long j3) {
        return java.lang.Math.max(j2, java.lang.Math.min(j, j3));
    }

    public static long A0U(long j, long j2, long j3) {
        if (j3 >= j2) {
            long j4 = j3 % j2;
            java.lang.String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[7] = "tvym1rnXFHBFa5iZecmBaZkH1F6VWGFv";
            strArr2[1] = "ooOjiywY7MfdEFCffLHAs2l8GTiel20";
            if (j4 == 0) {
                return j / (j3 / j2);
            }
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static long A0V(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static android.graphics.Point A0W(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        android.view.Display display = null;
        if (A02 >= 17 && (displayManager = (android.hardware.display.DisplayManager) context.getSystemService(A0i(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, 7, 101))) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            display = ((android.view.WindowManager) com.facebook.ads.redexgen.core.AbstractC04203y.A01((android.view.WindowManager) context.getSystemService(A0i(961, 6, 98)))).getDefaultDisplay();
        }
        return A0X(context, display);
    }

    public static android.graphics.Point A0X(android.content.Context context, android.view.Display display) {
        java.lang.String A0m;
        if (display.getDisplayId() == 0 && A18(context)) {
            if (A02 < 28) {
                A0m = A0m(A0i(897, 16, 79));
            } else {
                java.lang.String displaySize = A0i(939, 19, 27);
                A0m = A0m(displaySize);
            }
            if (!android.text.TextUtils.isEmpty(A0m)) {
                try {
                    java.lang.String trim = A0m.trim();
                    java.lang.String displaySize2 = A0i(967, 1, 110);
                    java.lang.String[] A1O = A1O(trim, displaySize2);
                    if (A1O.length == 2) {
                        java.lang.String displaySize3 = A1O[0];
                        int width = java.lang.Integer.parseInt(displaySize3);
                        java.lang.String displaySize4 = A1O[1];
                        int parseInt = java.lang.Integer.parseInt(displaySize4);
                        if (width > 0 && parseInt > 0) {
                            return new android.graphics.Point(width, parseInt);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String displaySize5 = A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 22, 104);
                java.lang.String sb2 = sb.append(displaySize5).append(A0m).toString();
                java.lang.String displaySize6 = A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 4, 109);
                com.facebook.ads.redexgen.core.AbstractC04284g.A05(displaySize6, sb2);
            }
            java.lang.String A0i = A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 4, 2);
            java.lang.String displaySize7 = A05;
            if (A0i.equals(displaySize7)) {
                java.lang.String str = A06;
                java.lang.String displaySize8 = A0i(170, 6, 32);
                if (str.startsWith(displaySize8)) {
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    java.lang.String displaySize9 = A0i(589, 32, 72);
                    if (packageManager.hasSystemFeature(displaySize9)) {
                        return new android.graphics.Point(3840, 2160);
                    }
                }
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (A02 >= 23) {
            A0z(display, point);
        } else if (A02 >= 17) {
            A0y(display, point);
        } else {
            A0x(display, point);
        }
        return point;
    }

    public static android.os.Handler A0Y() {
        return A0a(null);
    }

    public static android.os.Handler A0Z() {
        return A0b(null);
    }

    public static android.os.Handler A0a(android.os.Handler.Callback callback) {
        return A0c((android.os.Looper) com.facebook.ads.redexgen.core.AbstractC04203y.A02(android.os.Looper.myLooper()), callback);
    }

    public static android.os.Handler A0b(android.os.Handler.Callback callback) {
        return A0c(A0d(), callback);
    }

    public static android.os.Handler A0c(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new android.os.Handler(looper, callback);
    }

    public static android.os.Looper A0d() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    public static java.lang.CharSequence A0e(java.lang.CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T A0f(T value) {
        return value;
    }

    public static java.lang.String A0g(int i) {
        switch (i) {
            case 0:
                return A0i(247, 2, 64);
            case 1:
                return A0i(290, 19, 115);
            case 2:
                return A0i(272, 18, 74);
            case 3:
                return A0i(249, 23, 115);
            case 4:
                return A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 3, 37);
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public static java.lang.String A0h(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public static java.lang.String A0j(android.content.Context context, java.lang.String str) {
        java.lang.String A0i;
        try {
            A0i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            A0i = A0i(169, 1, 50);
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
        java.lang.String versionName = A0i(168, 1, 38);
        java.lang.StringBuilder append2 = append.append(versionName).append(A0i);
        java.lang.String versionName2 = A0i(0, 16, 0);
        java.lang.StringBuilder append3 = append2.append(versionName2);
        java.lang.String versionName3 = android.os.Build.VERSION.RELEASE;
        java.lang.StringBuilder append4 = append3.append(versionName3);
        java.lang.String versionName4 = A0i(163, 2, 8);
        java.lang.StringBuilder append5 = append4.append(versionName4);
        java.lang.String versionName5 = A0i(176, 18, 60);
        return append5.append(versionName5).toString();
    }

    public static java.lang.String A0k(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new java.util.Locale(str).getISO3Language();
        } catch (java.util.MissingResourceException unused) {
            return com.facebook.ads.redexgen.core.AbstractC1831k7.A01(str);
        }
    }

    public static java.lang.String A0l(java.lang.String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int percentCharacterCount = str.charAt(i2);
            if (percentCharacterCount == 37) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int length2 = i * 2;
        int startOfNotEscaped = length - length2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(startOfNotEscaped);
        java.util.regex.Matcher matcher = A08.matcher(str);
        int i3 = 0;
        while (i > 0 && matcher.find()) {
            int parseInt = java.lang.Integer.parseInt((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(matcher.group(1)), 16);
            int percentCharacterCount2 = A01[0].length();
            if (percentCharacterCount2 == 0) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[4] = "PqPC6PEskzx9UdoEWhWT1LElayhySamU";
            strArr[6] = "px5MwBeS5rIOQRTPGFWWURcMVY777XUi";
            int length3 = matcher.start();
            sb.append((java.lang.CharSequence) str, i3, length3).append((char) parseInt);
            i3 = matcher.end();
            i--;
        }
        if (i3 < length) {
            sb.append((java.lang.CharSequence) str, i3, length);
        }
        int length4 = sb.length();
        if (length4 != startOfNotEscaped) {
            return null;
        }
        return sb.toString();
    }

    public static java.lang.String A0m(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(A0i(445, 27, 40));
            java.lang.reflect.Method getMethod = cls.getMethod(A0i(696, 3, 41), java.lang.String.class);
            return (java.lang.String) getMethod.invoke(cls, str);
        } catch (java.lang.Exception e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A0i(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 4, 109), A0i(194, 31, 89) + str, e);
            return null;
        }
    }

    public static java.lang.String A0n(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.String A0o(java.util.Locale locale) {
        return A02 >= 21 ? A0p(locale) : locale.toString();
    }

    public static java.lang.String A0p(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    public static java.lang.String A0q(byte[] bArr) {
        return new java.lang.String(bArr, com.facebook.ads.redexgen.core.AbstractC1833k9.A05);
    }

    public static java.lang.String A0r(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, com.facebook.ads.redexgen.core.AbstractC1833k9.A05);
    }

    public static java.lang.String A0s(java.lang.Object[] objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                java.lang.String[] strArr = A01;
                java.lang.String str = strArr[7];
                java.lang.String str2 = strArr[1];
                int i2 = str.length();
                if (i2 == str2.length()) {
                    throw new java.lang.RuntimeException();
                }
                A01[0] = "5BfmCuqMgNYZqTYtdlZRTWg2c";
                sb.append(A0i(166, 2, 111));
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.Thread A0t(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.util.concurrent.ExecutorService A0u(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.facebook.ads.redexgen.X.5A
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return com.facebook.ads.redexgen.core.C5C.A0t(str, runnable);
            }
        });
    }

    public static void A0w(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0x(android.view.Display display, android.graphics.Point point) {
        display.getSize(point);
    }

    public static void A0y(android.view.Display display, android.graphics.Point point) {
        display.getRealSize(point);
    }

    public static void A0z(android.view.Display display, android.graphics.Point point) {
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A10(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void A11(java.lang.Throwable th) {
        A12(th);
        throw null;
    }

    public static <T extends java.lang.Throwable> void A12(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    public static void A13(long[] jArr, long j, long j2) {
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            for (int i = 0; i < jArr.length; i++) {
                long divisionFactor = jArr[i];
                jArr[i] = divisionFactor / j3;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            for (int i2 = 0; i2 < jArr.length; i2++) {
                long multiplicationFactor = jArr[i2];
                jArr[i2] = multiplicationFactor * j4;
            }
            return;
        }
        double d = j / j2;
        int i3 = 0;
        while (true) {
            int length = jArr.length;
            java.lang.String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[2] = "BjGW37zAqxCLsW2nWmt2hw1kAHbIQbLh";
            strArr2[5] = "BHp6YnoeM2z0KYM9Il82lktneq2CMX6s";
            if (i3 < length) {
                double multiplicationFactor2 = (long) (jArr[i3] * d);
                jArr[i3] = multiplicationFactor2;
                i3++;
            } else {
                return;
            }
        }
    }

    public static boolean A14(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean A15(int i) {
        if (i != 3 && i != 2) {
            java.lang.String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "sEVRoy0udJ8XOlLumIW6NYr3k1TbE2j9";
            strArr2[6] = "fWOu24VM8azkAehbfbWIlWwimjJiblYr";
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean A16(int i) {
        return i == 10 || i == 13;
    }

    public static boolean A17(android.content.Context context) {
        return A02 >= 23 && context.getPackageManager().hasSystemFeature(A0i(413, 32, 31));
    }

    public static boolean A18(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService(A0i(933, 6, 2));
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean A19(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return android.database.DatabaseUtils.queryNumEntries(sQLiteDatabase, A0i(879, 13, 24), A0i(913, 12, 70), new java.lang.String[]{str}) > 0;
    }

    public static boolean A1A(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (!android.text.TextUtils.isEmpty(scheme)) {
            java.lang.String scheme2 = A0i(646, 4, 40);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1B(android.os.Handler handler, java.lang.Runnable runnable) {
        android.os.Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        android.os.Looper looper2 = handler.getLooper();
        android.os.Looper looper3 = android.os.Looper.myLooper();
        if (looper2 == looper3) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean A1C(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1D(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.C04434v c04434v2, java.util.zip.Inflater inflater) {
        if (c04434v.A07() <= 0) {
            return false;
        }
        if (c04434v2.A08() < c04434v.A07()) {
            c04434v2.A0c(c04434v.A07() * 2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(c04434v.A0l(), c04434v.A09(), c04434v.A07());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(c04434v2.A0l(), i, c04434v2.A08() - i);
                if (inflater.finished()) {
                    c04434v2.A0e(i);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i == c04434v2.A08()) {
                    c04434v2.A0c(c04434v2.A08() * 2);
                }
            } catch (java.util.zip.DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean A1E(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A1F(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] buffer = byteArrayOutputStream.toByteArray();
                return buffer;
            }
        }
    }

    public static byte[] A1G(java.lang.String str) {
        return str.getBytes(com.facebook.ads.redexgen.core.AbstractC1833k9.A05);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T[] A1H(T[] value) {
        return value;
    }

    public static <T> T[] A1I(T[] tArr, int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i <= tArr.length);
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    public static <T> T[] A1J(T[] tArr, int i, int i2) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        return (T[]) java.util.Arrays.copyOfRange(tArr, i, i2);
    }

    public static <T> T[] A1K(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static java.lang.String[] A1L() {
        java.lang.String[] A1M = A1M();
        for (int i = 0; i < A1M.length; i++) {
            A1M[i] = A0k(A1M[i]);
        }
        return A1M;
    }

    public static java.lang.String[] A1M() {
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        if (A02 >= 24) {
            return A1N(configuration);
        }
        return new java.lang.String[]{A0o(configuration.locale)};
    }

    public static java.lang.String[] A1N(android.content.res.Configuration configuration) {
        return A1O(configuration.getLocales().toLanguageTags(), A0i(165, 1, 42));
    }

    public static java.lang.String[] A1O(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    public static java.lang.String[] A1P(java.lang.String str, java.lang.String str2) {
        return str.split(str2, 2);
    }
}
