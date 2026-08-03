package com.facebook.ads.redexgen.core;

@java.lang.Deprecated
/* renamed from: com.facebook.ads.redexgen.X.Ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0588Ba {
    public static int A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"eqdzSiIdqnT3hCSsTENYLmZ4", "qLAEi2WvCJu9wjJ", "toce", "QmOxXIzlvE53d2X", "WAyVnYX8HOamSHc7hCznsAV7J1o4yjh4", "2Jg1vBhmBkCi6YoALSajSHGhL27exhse", "FyqWibsIBjeEGSoGFPMxHwupdmiGrYAl", "dJbg5x7m2zG"};
    public static final java.util.HashMap<com.facebook.ads.redexgen.core.BW, java.util.List<com.facebook.ads.redexgen.core.B3>> A03;
    public static final java.util.regex.Pattern A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws com.facebook.ads.redexgen.core.BX {
        int i = A00;
        java.lang.String[] strArr = A02;
        if (strArr[0].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A02[7] = "ayn8";
        if (i == -1) {
            int i2 = 0;
            com.facebook.ads.redexgen.core.B3 A0J = A0J(A0N(1756, 9, 19), false, false);
            if (A0J != null) {
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J.A0V()) {
                    i2 = java.lang.Math.max(A03(codecProfileLevel.level), i2);
                }
                i2 = java.lang.Math.max(i2, com.facebook.ads.redexgen.core.C5C.A02 >= 21 ? 345600 : com.inmobi.media.core.config.models.AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            A00 = i2;
        }
        return A00;
    }

    public static java.lang.String A0N(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new java.lang.String(copyOfRange);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.ads.redexgen.X.BX.<init>(java.lang.Throwable, com.facebook.ads.redexgen.X.BV):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a9, code lost:
    
        if (r23.A01 == false) goto L41;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: Exception -> 0x01b2, TryCatch #7 {Exception -> 0x01b2, blocks: (B:3:0x0014, B:5:0x002a, B:10:0x0035, B:14:0x0040, B:56:0x0101, B:66:0x0170, B:67:0x01aa, B:61:0x013c, B:63:0x0142), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.core.B3> A0Q(com.facebook.ads.redexgen.core.BW r23, com.facebook.ads.redexgen.core.BY r24) throws com.facebook.ads.redexgen.core.BX {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C0588Ba.A0Q(com.facebook.ads.redexgen.X.BW, com.facebook.ads.redexgen.X.BY):java.util.ArrayList");
    }

    public static void A0S() {
        A01 = new byte[]{-121, -113, 94, 102, -92, -97, -89, -86, -93, -94, 94, -78, -83, 94, -81, -77, -93, -80, -73, 94, -95, -97, -82, -97, -96, -89, -86, -89, -78, -89, -93, -79, 103, 56, -111, -125, -92, -42, -42, -40, -48, -52, -47, -54, -99, -125, 65, -122, 120, 118, -120, -123, 120, -72, -3, 1, -72, 66, 66, -90, -89, 85, 87, -84, -81, 111, 115, 65, 70, -115, -109, -98, -91, -95, -87, 99, 108, -73, -89, -90, 87, 87, 65, 66, 68, 70, 103, -116, -120, -116, -85, -101, -127, -127, -125, -124, -91, -93, -81, -92, -91, -78, 92, 74, 78, 73, 77, 119, 101, 105, 100, 105, 121, 103, 108, 102, 106, -113, 125, -126, 124, -127, -97, -110, -110, -116, -114, -70, -83, -83, -89, -86, -59, -72, -72, -78, -72, 90, 77, 77, 72, 77, -72, -66, -59, -74, -74, -72, -71, -38, -40, -28, -39, -38, -25, -60, -54, -47, -62, -50, -45, -49, -61, -59, -26, -28, -16, -27, -26, -13, -73, -67, -60, -63, -60, -89, -72, -39, -41, -29, -40, -39, -26, -51, -45, -38, -32, -7, -4, -20, -13, -3, -50, -17, -19, -7, -18, -17, -4, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -38, -34, -50, -37, -30, -119, -52, -40, -51, -50, -52, -119, -63, -86, -85, -87, 103, 80, 81, 82, -68, -91, -87, -92, -119, 114, 118, 116, -58, -81, -77, -76, -78, -101, -94, -102, 88, 65, 72, 67, Byte.MIN_VALUE, 105, 112, 110, -95, -116, -119, -79, -97, -103, -117, 121, 118, 114, 99, 90, -93, -108, -114, -84, -79, -107, -77, -70, -69, -66, -75, -70, -77, 108, -71, -83, -72, -78, -69, -66, -71, -79, -80, 108, -115, -94, 125, 108, -81, -69, -80, -79, -81, 108, -65, -64, -66, -75, -70, -77, -122, 108, 120, -106, -99, -98, -95, -104, -99, -106, 79, -100, -112, -101, -107, -98, -95, -100, -108, -109, 79, 112, -123, 114, 79, -110, -98, -109, -108, -110, 79, -94, -93, -95, -104, -99, -106, 105, 79, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -61, -50, -56, -47, -44, -49, -57, -58, -126, -90, -47, -50, -60, -37, -126, -72, -53, -43, -53, -47, -48, -126, -59, -47, -58, -57, -59, -126, -43, -42, -44, -53, -48, -55, -100, -126, -122, -92, -85, -84, -81, -90, -85, -92, 93, -86, -98, -87, -93, -84, -81, -86, -94, -95, 93, -123, -126, -109, Byte.MIN_VALUE, 93, -96, -84, -95, -94, -96, 93, -80, -79, -81, -90, -85, -92, 119, 93, -71, -41, -34, -33, -30, -39, -34, -41, -112, -35, -47, -36, -42, -33, -30, -35, -43, -44, -112, -67, -64, -92, -79, -112, -45, -33, -44, -43, -45, -112, -29, -28, -30, -39, -34, -41, -86, -112, 90, 120, Byte.MAX_VALUE, Byte.MIN_VALUE, -125, 122, Byte.MAX_VALUE, 120, 49, 126, 114, 125, 119, Byte.MIN_VALUE, -125, 126, 118, 117, 49, 103, 97, 74, 49, 116, Byte.MIN_VALUE, 117, 118, 116, 49, -124, -123, -125, 122, Byte.MAX_VALUE, 120, 75, 49, -112, 117, 118, 116, -53, -80, -79, -78, -65, -92, -88, -93, -63, -90, -86, -88, -124, 105, 109, 110, -92, -119, -112, -120, -64, -91, -84, -89, 108, 81, 88, 86, -66, -91, -94, -61, -86, -83, -33, -98, -120, -126, -44, -66, -69, -96, -115, -124, -119, 118, 112, 92, 95, 66, 83, 116, 114, 126, 115, 116, -127, -105, -81, -82, -77, -85, -115, -71, -82, -81, -83, -106, -77, -67, -66, 106, -117, -102, -109, 106, -82, -77, -82, -72, 113, -66, 106, -74, -77, -67, -66, 106, -67, -81, -83, -65, -68, -81, 106, -82, -81, -83, -71, -82, -81, -68, 106, -80, -71, -68, -124, 106, -86, -62, -63, -58, -66, -96, -52, -63, -62, -64, -78, -47, -58, -55, -85, -87, -76, -118, -95, -44, -43, -54, -53, -49, -118, -99, -99, -97, -118, -96, -63, -65, -53, -64, -63, -50, -40, -42, -31, -73, -42, -36, -73, -47, -50, -33, -52, -51, -33, -73, -51, -18, -20, -8, -19, -18, -5, -48, -50, -39, -81, -50, -43, -52, -81, -62, -42, -59, -54, -48, -81, -59, -58, -60, -48, -59, -58, -45, -81, -62, -62, -60, -68, -70, -59, -101, -70, -63, -72, -101, -82, -62, -79, -74, -68, -101, -79, -78, -80, -68, -79, -78, -65, -101, -79, -64, -67, -82, -80, -96, -120, -122, -111, 103, -122, -115, -124, 103, 122, -114, 125, -126, -120, 103, 125, 126, 124, -120, 125, 126, -117, 103, -117, 122, -112, -102, -104, -93, 121, -99, -97, -106, 121, -63, -76, -81, -80, -70, 121, -81, -80, -82, -70, -81, -80, -67, -127, Byte.MAX_VALUE, -118, 96, -123, 119, 117, 96, Byte.MAX_VALUE, -126, 101, 96, 118, -105, -107, -95, -106, -105, -92, -46, -48, -37, -79, -42, -56, -58, -79, -28, -28, -26, -79, -25, -24, -26, -82, -84, -73, -115, -78, -92, -94, -115, -52, -49, -110, -115, -61, -60, -62, -126, Byte.MIN_VALUE, -117, 97, -122, 120, 118, 97, -87, -93, 107, 97, -105, -104, -106, -119, -121, -110, 104, -100, -84, -99, -89, 104, -101, -81, -98, -93, -87, 104, -89, -86, 109, 104, -98, -97, -99, -87, -98, -97, -84, -124, -126, -115, 99, -100, -92, -92, -100, -95, -102, -86, -88, -77, -119, -62, -54, -54, -62, -57, -64, -119, -51, -68, -46, -119, -65, -64, -66, -54, -65, -64, -51, -84, -86, -75, -117, -55, -60, -62, -117, -66, -64, -112, -117, -63, -62, -64, -52, -63, -62, -49, -72, -74, -63, -105, -43, -48, -50, -105, -54, -43, -54, -52, -105, -51, -50, -52, -40, -51, -50, -37, -114, -116, -105, 109, -85, -90, -92, 109, -91, -85, -96, -94, 109, -93, -92, -94, -82, -93, -92, -79, 108, 106, 117, 75, -114, Byte.MIN_VALUE, -116, -118, 75, 126, -110, -127, -122, -116, 75, -127, -126, Byte.MIN_VALUE, -116, -127, -126, -113, 75, 126, 126, Byte.MIN_VALUE, 107, 105, 116, 74, -115, Byte.MAX_VALUE, -117, -119, 74, 125, -111, Byte.MIN_VALUE, -123, -117, 74, Byte.MIN_VALUE, -127, Byte.MAX_VALUE, -117, Byte.MIN_VALUE, -127, -114, 
        74, -119, -116, 79, -75, -77, -66, -108, -41, -55, -43, -45, -108, -36, -49, -54, -53, -43, -108, -54, -53, -55, -43, -54, -53, -40, -108, -36, -42, -98, 114, 112, 123, 81, -108, -105, -116, 81, -124, -104, -121, -116, -110, 81, -121, -120, -122, -110, -121, -120, -107, 81, -119, -113, -124, -122, -105, -107, -96, 118, -70, -83, -87, -76, -68, -83, -77, 118, -66, -79, -84, -83, -73, 118, -84, -83, -85, -73, -84, -83, -70, 118, -68, -67, -74, -74, -83, -76, -83, -84, -80, -105, -102, -118, 116, 119, 123, -114, -40, -56, -78, -75, -70, -52, -45, -61, -42, -77, -79, -121, -125, 97, 100, 102, 121, -112, -88, -90, -83, -83, -90, -85, -92, 93, -96, -84, -95, -94, -96, 93, -50, -25, -28, -25, -24, -16, -25, -103, -70, -49, -86, -103, -37, -30, -19, -103, -35, -34, -23, -19, -31, -77, -103, -78, -53, -56, -53, -52, -44, -53, 125, -98, -77, -114, 125, -55, -62, -45, -62, -55, -105, 125, -41, -16, -19, -16, -15, -7, -16, -94, -61, -40, -77, -94, -14, -12, -15, -24, -21, -18, -25, -68, -94, -124, -99, -102, -99, -98, -90, -99, 79, 112, -123, 114, 79, -101, -108, -91, -108, -101, 105, 79, -84, -59, -62, -59, -58, -50, -59, 119, -104, -83, -102, 119, -57, -55, -58, -67, -64, -61, -68, -111, 119, -111, -86, -89, -86, -85, -77, -86, 92, Byte.MIN_VALUE, -85, -88, -98, -75, 92, -110, -91, -81, -91, -85, -86, 92, -88, -95, -78, -95, -88, 92, -81, -80, -82, -91, -86, -93, 118, 92, 100, 125, 122, 125, 126, -122, 125, 47, 83, 126, 123, 113, -120, 47, 101, 120, -126, 120, 126, 125, 47, Byte.MAX_VALUE, -127, 126, 117, 120, 123, 116, 47, -126, -125, -127, 120, 125, 118, 73, 47, -75, -50, -53, -50, -49, -41, -50, Byte.MIN_VALUE, -88, -91, -74, -93, Byte.MIN_VALUE, -52, -59, -42, -59, -52, Byte.MIN_VALUE, -45, -44, -46, -55, -50, -57, -102, Byte.MIN_VALUE, -52, -27, -30, -27, -26, -18, -27, -105, -65, -68, -51, -70, -105, -25, -23, -26, -35, -32, -29, -36, -105, -22, -21, -23, -32, -27, -34, -79, -105, -93, -68, -71, -68, -67, -59, -68, 110, -92, -98, -121, 110, -70, -77, -60, -77, -70, -120, 110, -101, -76, -79, -76, -75, -67, -76, 102, -100, -106, Byte.MAX_VALUE, 102, -74, -72, -75, -84, -81, -78, -85, Byte.MIN_VALUE, 102, 112, -127, 121, -121, -123, -127, -44, -90, -37, -39, -63, -68, -91, -39, -31, -88, -90, -95, -89, 125, 118, -36, -19, -34, -87, 122, -114, 125, -126, -120, 72, 122, 124, 76, -38, -18, -35, -30, -24, -88, -38, -27, -38, -36, 116, -120, 119, 124, -126, 66, 120, 116, 118, 70, -48, -28, -45, -40, -34, -98, -44, -48, -46, -94, -100, -39, -34, -46, -96, -76, -93, -88, -82, 110, -91, -85, -96, -94, 120, -116, 123, Byte.MIN_VALUE, -122, 70, -125, 126, 68, 120, 122, 74, -125, -105, -122, -117, -111, 81, -113, -110, 86, -125, 79, -114, -125, -106, -113, -54, -34, -51, -46, -40, -104, -37, -54, -32, -46, -26, -43, -38, -32, -96, -23, -98, -35, -40, -98, -46, -35, -46, -44, -37, -17, -34, -29, -23, -87, -14, -89, -26, -31, -89, -32, -26, -37, -35, -118, -97, 89, 90, Byte.MAX_VALUE, -108, -127, 79, 126, -109, Byte.MIN_VALUE, 79, -82, 125, 121, -101, 106, 102, -103, -90, -100, -86, -89, -95, -100, -59, -108, -112, -61, -48, -58, -44, -47, -53, -58, -112, 114, 65, kotlin.io.encoding.Base64.padSymbol, 118, 126, 126, 118, 123, 116, kotlin.io.encoding.Base64.padSymbol, 120, 70, -39, -31, -19, -22, -17, -19, -19, -96, -99, -82, 105, -21, -7, -26, -76, -33, -37, -31, -23, -38, -82, -94, -77, -86, -81, -90, -83, -75, -90, -94, -75, -75, -113, -110, 86, -125, -58, -60, -49, -123, -54, -56, -45, -119, -63, -63, -56, -53, -64, -62, -119, -88, -90, -79, 103, -96, -88, -88, -96, -91, -98, 103, -66, -68, -57, 125, -64, -78, -66, -68, 125, -59, -72, -77, -76, -66, 125, -77, -76, -78, -66, -77, -76, -63, 125, -73, -76, -59, -78, -62, -58, -59, -77, -76, -78, -100, -102, -91, 91, -96, -110, -112, 91, -10, -8, -11, -6, -11, -5, -116, 122, -122, -116, -114, -121, Byte.MIN_VALUE, -109, -127, -114, -108, -113, -109, -8, -22, -24, -6, -9, -22, -78, -11, -15, -26, -2, -25, -26, -24, -16, -119, 123, -120, -120, 119, -124, -123, -69, 119, -82, -81, -88, -88, -97, -90, -97, -98, 103, -86, -90, -101, -77, -100, -101, -99, -91, -106, -119, -124, -123, -113, 79, -127, -106, -125, -99, -112, -117, -116, -106, 86, -117, -106, -109, -119, -96, 84, -99, -112, -102, -112, -106, -107, -77, -90, -95, -94, -84, 108, -95, -77, -100, -91, -94, -77, -96, -101, -114, -119, -118, -108, 84, -115, -118, -101, -120, -66, -79, -84, -83, -73, 119, -80, -83, -66, -85, -84, -66, -28, -41, -38, -38, -45, -107, -120, -117, -117, -124, -126, 81, -64, -77, -74, -74, -81, -70, -74, -65, -67, -78, -84, 108, 117, -64, -85, -76, -78, -70, -85, -43, -64, -51, -54, -63, -57, -49, -64, -52, -73, -60, -63, -66, -58, -73};
    }

    static {
        A0S();
        A04 = java.util.regex.Pattern.compile(A0N(1409, 10, 112));
        A03 = new java.util.HashMap<>();
        A00 = -1;
    }

    public static int A01(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                if (A02[7].length() == 25) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[1] = "p3tScLodvmBhgJu";
                strArr[3] = "blAckLRsjuERKNr";
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                java.lang.String[] strArr2 = A02;
                if (strArr2[6].charAt(8) == strArr2[5].charAt(8)) {
                    A02[7] = "bdr4r1uDMPeXB3s0e5pOX5Q";
                    return 65536;
                }
                break;
            case 17:
                return 131072;
            case 18:
                java.lang.String[] strArr3 = A02;
                if (strArr3[6].charAt(8) != strArr3[5].charAt(8)) {
                    java.lang.String[] strArr4 = A02;
                    strArr4[6] = "34IRfUzRBRFF7aBglEcwMApXZqeFGI1m";
                    strArr4[5] = "iRGVlhZlB1b37DNJ3kG6hrLab0t0wQjp";
                    return 262144;
                }
                java.lang.String[] strArr5 = A02;
                strArr5[0] = "eT6IL44S7u9o4A5QFAcxcvIY";
                strArr5[2] = "bWAi";
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                java.lang.String[] strArr6 = A02;
                if (strArr6[6].charAt(8) != strArr6[5].charAt(8)) {
                    A02[4] = "Kx02KfDWNZB3bbiKdLxxGACkAkNM6rJP";
                    return 2097152;
                }
                A02[4] = "WnzQHL4oKpbMUVBkEywLAA92oYxlOTj8";
                return 2097152;
            case 22:
                if (A02[4].charAt(21) == 'A') {
                    A02[4] = "cAiGKOliFB77vtIZojZGlA8hvOCkEVbR";
                    return 4194304;
                }
                break;
            case 23:
                return 8388608;
            default:
                return -1;
        }
        throw new java.lang.RuntimeException();
    }

    public static int A02(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            case 20:
                return 32;
            case 21:
                return 64;
            case 22:
                return 128;
            case 30:
                return 256;
            case 31:
                return 512;
            case 32:
                return 1024;
            case 40:
                return 2048;
            case 41:
                return 4096;
            case 42:
                return 8192;
            case 50:
                return 16384;
            case 51:
                java.lang.String[] strArr = A02;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[1] = "Dd2HPoEYdkjLRr8";
                strArr2[3] = "8RMIphYW42mwAMu";
                return 32768;
            case 52:
                return 65536;
            default:
                return -1;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                java.lang.String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[1] = "3QcVs4uE13o5U89";
                strArr2[3] = "HwwNiq3rR5E2ArP";
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int A04(int i) {
        switch (i) {
            case 66:
                return 1;
            case 77:
                return 2;
            case 88:
                return 4;
            case 100:
                return 8;
            case 110:
                return 16;
            case 122:
                return 32;
            case 244:
                return 64;
            default:
                return -1;
        }
    }

    public static int A05(int i) {
        switch (i) {
            case 1:
                if (A02[4].charAt(21) != 'A') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[0] = "QMC9ZT5BEMY9TcRggpPTke3A";
                strArr[2] = "gCyl";
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                java.lang.String[] strArr2 = A02;
                if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "69A91wQXEtxdKe6VEWAWvAWn2bPjhSLd";
                return 5;
            case 6:
                return 6;
            case 17:
                return 17;
            case 20:
                return 20;
            case 23:
                return 23;
            case 29:
                return 29;
            case 39:
                return 39;
            case 42:
                return 42;
            default:
                return -1;
        }
    }

    public static int A06(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 20:
                return 4;
            case 21:
                return 8;
            case 30:
                return 16;
            case 31:
                return 32;
            case 40:
                return 64;
            case 41:
                if (A02[7].length() == 25) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[1] = "FYHyz6Jn9nffJKB";
                strArr[3] = "LZRAC8LId4dogw6";
                return 128;
            case 50:
                return 256;
            case 51:
                return 512;
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int A07(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                if (A02[7].length() == 25) {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "pIa0SKSMXaKd1ZRZCUAsSAHaUimoLOpx";
                return 8;
            default:
                java.lang.String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[0] = "vDav2EVX30wYgrXK4P9ZX6kx";
                strArr2[2] = "QW4Z";
                return -1;
        }
    }

    public static /* synthetic */ int A08(com.facebook.ads.redexgen.core.B3 b3) {
        java.lang.String str = b3.A03;
        java.lang.String name = A0N(861, 10, 40);
        if (str.startsWith(name)) {
            return 1;
        }
        java.lang.String name2 = A0N(1560, 10, 43);
        if (str.startsWith(name2)) {
            return 1;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 26) {
            return 0;
        }
        java.lang.String name3 = A0N(725, 25, 44);
        if (str.equals(name3)) {
            return -1;
        }
        return 0;
    }

    public static /* synthetic */ int A09(com.facebook.ads.redexgen.core.B3 b3) {
        return b3.A03.startsWith(A0N(861, 10, 40)) ? 1 : 0;
    }

    public static /* synthetic */ int A0A(com.facebook.ads.redexgen.core.BZ bz, java.lang.Object obj, java.lang.Object obj2) {
        return bz.A8w(obj2) - bz.A8w(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (r3.equals(A0N(1549, 4, 17)) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0B(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (c2196qI.A0R == null) {
            return null;
        }
        java.lang.String[] split = c2196qI.A0R.split(A0N(1407, 2, 107));
        if (A0N(1765, 18, 26).equals(c2196qI.A0W)) {
            return A0E(c2196qI.A0R, split);
        }
        char c = 0;
        java.lang.String[] strArr = A02;
        if (strArr[1].length() == strArr[3].length()) {
            A02[7] = "tNXQa1vGcfp5ezAoaXcp0CKZSytrXWro";
            java.lang.String str = split[0];
            switch (str.hashCode()) {
                case 3004662:
                    if (str.equals(A0N(1545, 4, 28))) {
                        c = 5;
                        switch (c) {
                            case 0:
                            case 1:
                                return A0D(c2196qI.A0R, split);
                            case 2:
                                return A0F(c2196qI.A0R, split);
                            case 3:
                            case 4:
                                return A0H(c2196qI.A0R, split, c2196qI.A0N);
                            case 5:
                                return A0G(c2196qI.A0R, split, c2196qI.A0N);
                            case 6:
                                return A0C(c2196qI.A0R, split);
                            default:
                                return null;
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                case 3006243:
                    if (A02[4].charAt(21) == 'A') {
                        A02[4] = "3GHWnNsivmk8fIs2ywxIWAiS03xMF18F";
                        break;
                    }
                    break;
                case 3006244:
                    if (str.equals(A0N(1553, 4, 16))) {
                        c = 1;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                case 3199032:
                    if (str.equals(A0N(1600, 4, 43))) {
                        c = 3;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                case 3214780:
                    if (str.equals(A0N(1604, 4, 118))) {
                        c = 4;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                case 3356560:
                    if (str.equals(A0N(1625, 4, 21))) {
                        c = 6;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                case 3624515:
                    if (str.equals(A0N(1839, 4, 47))) {
                        c = 2;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                default:
                    c = 65535;
                    switch (c) {
                    }
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0C(java.lang.String str, java.lang.String[] strArr) {
        int length = strArr.length;
        java.lang.String A0N = A0N(428, 38, 99);
        java.lang.String A0N2 = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length != 3) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
        try {
            int objectTypeIndication = java.lang.Integer.parseInt(strArr[1], 16);
            if (A0N(1491, 15, 21).equals(com.facebook.ads.redexgen.core.C3J.A05(objectTypeIndication))) {
                int objectTypeIndication2 = java.lang.Integer.parseInt(strArr[2]);
                int A05 = A05(objectTypeIndication2);
                if (A05 != -1) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(A05), 0);
                }
            }
        } catch (java.lang.NumberFormatException unused) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
        }
        return null;
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0D(java.lang.String str, java.lang.String[] strArr) {
        int parseInt;
        int parseInt2;
        int length = strArr.length;
        java.lang.String A0N = A0N(307, 37, 34);
        java.lang.String A0N2 = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 2) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                parseInt = java.lang.Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt2 = java.lang.Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                parseInt = java.lang.Integer.parseInt(strArr[1]);
                parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            } else {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
                return null;
            }
            int A042 = A04(parseInt);
            if (A042 == -1) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1212, 21, 74) + parseInt);
                return null;
            }
            int levelInteger = A02(parseInt2);
            if (levelInteger == -1) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1193, 19, 34) + parseInt2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(A042), java.lang.Integer.valueOf(levelInteger));
        } catch (java.lang.NumberFormatException unused) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0E(java.lang.String str, java.lang.String[] strArr) {
        int length = strArr.length;
        java.lang.String A0N = A0N(344, 46, 85);
        java.lang.String levelString = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 3) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(levelString, A0N + str);
            return null;
        }
        java.util.regex.Matcher matcher = A04.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(levelString, A0N + str);
            return null;
        }
        java.lang.String group = matcher.group(1);
        java.lang.Integer profile = A0L(group);
        if (profile == null) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(levelString, A0N(1268, 37, 2) + group);
            return null;
        }
        java.lang.String str2 = strArr[2];
        java.lang.Integer A0K = A0K(str2);
        if (A0K == null) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(levelString, A0N(1233, 35, 47) + str2);
            return null;
        }
        return new android.util.Pair<>(profile, A0K);
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0F(java.lang.String str, java.lang.String[] strArr) {
        int length = strArr.length;
        java.lang.String A0N = A0N(466, 37, 4);
        java.lang.String A0N2 = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 3) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            int profile = A07(parseInt);
            if (profile == -1) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1380, 21, 57) + parseInt);
                return null;
            }
            int profileInteger = A06(parseInt2);
            if (profileInteger == -1) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1361, 19, 65) + parseInt2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(profile), java.lang.Integer.valueOf(profileInteger));
        } catch (java.lang.NumberFormatException unused) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        if (r1 == 6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0G(java.lang.String str, java.lang.String[] strArr, com.facebook.ads.androidx.media3.common.ColorInfo colorInfo) {
        int bitDepthInteger;
        int length = strArr.length;
        java.lang.String A0N = A0N(270, 37, 63);
        java.lang.String A0N2 = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 4) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, ((java.lang.String) A0N) + str);
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2].substring(0, 2));
            A0N = java.lang.Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1172, 21, 117) + parseInt);
                return null;
            }
            if (A0N != 8 && A0N != 10) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1130, 23, 108) + ((int) A0N));
                return null;
            }
            if (A0N == 8) {
                bitDepthInteger = 1;
            } else {
                if (colorInfo != null) {
                    byte[] bArr = colorInfo.A04;
                    int levelInteger = A02[4].charAt(21);
                    if (levelInteger != 65) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A02;
                    strArr2[0] = "3Naka6lMBkjhse4CHD6m4SHW";
                    strArr2[2] = "4qp9";
                    if (bArr == null) {
                        int levelInteger2 = colorInfo.A03;
                        if (levelInteger2 != 7) {
                            int levelInteger3 = colorInfo.A03;
                        }
                    }
                    bitDepthInteger = 4096;
                }
                bitDepthInteger = 2;
            }
            int levelInteger4 = A01(parseInt2);
            if (levelInteger4 == -1) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1153, 19, 80) + parseInt2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(bitDepthInteger), java.lang.Integer.valueOf(levelInteger4));
        } catch (java.lang.NumberFormatException unused) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0H(java.lang.String str, java.lang.String[] strArr, com.facebook.ads.androidx.media3.common.ColorInfo colorInfo) {
        int i;
        int length = strArr.length;
        java.lang.String A0N = A0N(390, 38, 48);
        java.lang.String A0N2 = A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 4) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
            return null;
        }
        java.util.regex.Matcher matcher = A04.matcher(strArr[1]);
        boolean matches = matcher.matches();
        if (A02[7].length() != 25) {
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "KQD5T9TnBB7A1Qau37dPwA8fp0YnC9XP";
            strArr2[5] = "pnb4d0x2BWoBz7rcvfU2b1k7Wl63lPA1";
            if (!matches) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N + str);
                return null;
            }
            java.lang.String group = matcher.group(1);
            if (A0N(77, 1, 121).equals(group)) {
                i = 1;
            } else if (A0N(86, 1, 40).equals(group)) {
                if (colorInfo != null && colorInfo.A03 == 6) {
                    i = 4096;
                } else {
                    i = 2;
                }
            } else {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1332, 29, 106) + group);
                return null;
            }
            java.lang.String[] strArr3 = A02;
            if (strArr3[6].charAt(8) == strArr3[5].charAt(8)) {
                A02[7] = "4AE";
                java.lang.String profileString = strArr[3];
                java.lang.Integer A0M = A0M(profileString);
                if (A0M == null) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N2, A0N(1305, 27, 83) + profileString);
                    return null;
                }
                return new android.util.Pair<>(java.lang.Integer.valueOf(i), A0M);
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static com.facebook.ads.redexgen.core.B3 A0I() throws com.facebook.ads.redexgen.core.BX {
        return A0J(A0N(1506, 9, 92), false, false);
    }

    public static com.facebook.ads.redexgen.core.B3 A0J(java.lang.String str, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.BX {
        java.util.List<com.facebook.ads.redexgen.core.B3> A0R = A0R(str, z, z2);
        if (A0R.isEmpty()) {
            return null;
        }
        return A0R.get(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Integer A0K(java.lang.String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 1537:
                if (str.equals(A0N(59, 2, 105))) {
                    c = 0;
                    switch (c) {
                        case 0:
                            java.lang.String[] strArr = A02;
                            if (strArr[0].length() != strArr[2].length()) {
                                A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                                return 1;
                            }
                            break;
                        case 1:
                            if (A02[4].charAt(21) != 'A') {
                                return 2;
                            }
                            java.lang.String[] strArr2 = A02;
                            strArr2[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                            strArr2[2] = "mM9F";
                            return 2;
                        case 2:
                            return 4;
                        case 3:
                            return 8;
                        case 4:
                            return 16;
                        case 5:
                            return 32;
                        case 6:
                            java.lang.String[] strArr3 = A02;
                            if (strArr3[6].charAt(8) != strArr3[5].charAt(8)) {
                                return 64;
                            }
                            java.lang.String[] strArr4 = A02;
                            strArr4[0] = "UDGIwR651ijO548zFQsUwwxK";
                            strArr4[2] = "M6So";
                            return 64;
                        case 7:
                            return 128;
                        case '\b':
                            java.lang.String[] strArr5 = A02;
                            if (strArr5[0].length() == strArr5[2].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr6 = A02;
                            strArr6[1] = "TGauph7jBQEYmTr";
                            strArr6[3] = "n0Og3rwDrR2czMW";
                            return 256;
                        case '\t':
                            java.lang.String[] strArr7 = A02;
                            if (strArr7[0].length() != strArr7[2].length()) {
                                java.lang.String[] strArr8 = A02;
                                strArr8[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                                strArr8[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                                return 512;
                            }
                            java.lang.String[] strArr9 = A02;
                            strArr9[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                            strArr9[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                            return 512;
                        case '\n':
                            return 1024;
                        case 11:
                            return 2048;
                        case '\f':
                            return 4096;
                        default:
                            return null;
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1538:
                if (str.equals(A0N(61, 2, 24))) {
                    c = 1;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1539:
                java.lang.String[] strArr10 = A02;
                if (strArr10[0].length() != strArr10[2].length()) {
                    A02[4] = "4lxnqF3Aq6PG5fAKBVQihAUdAnfaVY4u";
                    if (str.equals(A0N(63, 2, 111))) {
                        c = 2;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
                throw new java.lang.RuntimeException();
            case 1540:
                if (str.equals(A0N(65, 2, 50))) {
                    c = 3;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1541:
                if (str.equals(A0N(67, 2, 4))) {
                    c = 4;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1542:
                if (str.equals(A0N(69, 2, 80))) {
                    c = 5;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1543:
                if (str.equals(A0N(71, 2, 97))) {
                    c = 6;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1544:
                if (str.equals(A0N(73, 2, 100))) {
                    c = 7;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1545:
                if (str.equals(A0N(75, 2, 38))) {
                    c = '\b';
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1567:
                if (str.equals(A0N(78, 2, 105))) {
                    c = '\t';
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1568:
                if (str.equals(A0N(80, 2, 25))) {
                    c = '\n';
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1569:
                if (str.equals(A0N(82, 2, 3))) {
                    c = 11;
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            case 1570:
                if (str.equals(A0N(84, 2, 6))) {
                    c = '\f';
                    switch (c) {
                    }
                    throw new java.lang.RuntimeException();
                }
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
            default:
                c = 65535;
                switch (c) {
                }
                throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static java.lang.Integer A0L(java.lang.String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 1536:
                if (str.equals(A0N(57, 2, 5))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1537:
                if (str.equals(A0N(59, 2, 105))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1538:
                if (str.equals(A0N(61, 2, 24))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1539:
                if (str.equals(A0N(63, 2, 111))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1540:
                if (str.equals(A0N(65, 2, 50))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1541:
                if (str.equals(A0N(67, 2, 4))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1542:
                if (str.equals(A0N(69, 2, 80))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1543:
                if (str.equals(A0N(71, 2, 97))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1544:
                if (str.equals(A0N(73, 2, 100))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1545:
                if (str.equals(A0N(75, 2, 38))) {
                    c = '\t';
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                java.lang.String[] strArr = A02;
                if (strArr[6].charAt(8) != strArr[5].charAt(8)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[6] = "0KPemZPlBkz6ir7aaqTED1Pw3reeXjRU";
                strArr2[5] = "kXrOI8miBty6c848hwuI9lm7Gcuo04IC";
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Integer A0M(java.lang.String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 70821:
                if (str.equals(A0N(253, 3, 76))) {
                    c = '\r';
                    switch (c) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 16;
                        case 3:
                            return 64;
                        case 4:
                            return 256;
                        case 5:
                            return 1024;
                        case 6:
                            return 4096;
                        case 7:
                            return 16384;
                        case '\b':
                            return 65536;
                        case '\t':
                            return 262144;
                        case '\n':
                            return 1048576;
                        case 11:
                            return 4194304;
                        case '\f':
                            return 16777216;
                        case '\r':
                            return 2;
                        case 14:
                            return 8;
                        case 15:
                            return 32;
                        case 16:
                            java.lang.String[] strArr = A02;
                            if (strArr[1].length() != strArr[3].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                            return 128;
                        case 17:
                            return 512;
                        case 18:
                            return 2048;
                        case 19:
                            return 8192;
                        case 20:
                            return 32768;
                        case 21:
                            return 131072;
                        case 22:
                            return 524288;
                        case 23:
                            return 2097152;
                        case 24:
                            return 8388608;
                        case 25:
                            return 33554432;
                        default:
                            return null;
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 70914:
                if (str.equals(A0N(256, 3, 92))) {
                    c = 14;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 70917:
                if (str.equals(A0N(259, 3, 54))) {
                    c = 15;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 71007:
                java.lang.String A0N = A0N(262, 3, 29);
                java.lang.String[] strArr2 = A02;
                if (strArr2[0].length() != strArr2[2].length()) {
                    A02[7] = com.ironsource.B5.q;
                    if (str.equals(A0N)) {
                        c = 16;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
                throw new java.lang.RuntimeException();
            case 71010:
                if (str.equals(A0N(265, 3, 78))) {
                    c = 17;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 74665:
                if (str.equals(A0N(535, 3, 101))) {
                    c = 0;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 74758:
                if (str.equals(A0N(542, 3, 69))) {
                    c = 1;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 74761:
                if (str.equals(A0N(545, 3, 123))) {
                    c = 2;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 74851:
                if (str.equals(A0N(548, 3, 71))) {
                    c = 3;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 74854:
                if (str.equals(A0N(551, 3, 48))) {
                    c = 4;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193639:
                if (str.equals(A0N(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 4, 108))) {
                    c = 18;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193642:
                if (str.equals(A0N(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 4, 18))) {
                    c = 19;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193732:
                if (str.equals(A0N(229, 4, 103))) {
                    c = 20;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193735:
                if (str.equals(A0N(233, 4, 52))) {
                    c = 21;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193738:
                if (A02[4].charAt(21) != 'A') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr3 = A02;
                strArr3[0] = "gU6PtQLn9s6J6gQuv9ZEK0nw";
                strArr3[2] = "GdK9";
                if (str.equals(A0N(237, 4, 113))) {
                    c = 22;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193825:
                if (str.equals(A0N(241, 4, 93))) {
                    c = 23;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193828:
                if (str.equals(A0N(245, 4, 3))) {
                    c = 24;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2193831:
                if (str.equals(A0N(249, 4, 43))) {
                    c = 25;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312803:
                java.lang.String[] strArr4 = A02;
                if (strArr4[1].length() != strArr4[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                A02[7] = "nulQl7CSoY";
                if (str.equals(A0N(503, 4, 55))) {
                    c = 5;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312806:
                if (str.equals(A0N(507, 4, 114))) {
                    c = 6;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312896:
                if (str.equals(A0N(androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, 4, 102))) {
                    c = 7;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312899:
                if (str.equals(A0N(515, 4, 104))) {
                    c = '\b';
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312902:
                boolean equals = str.equals(A0N(519, 4, 43));
                java.lang.String[] strArr5 = A02;
                if (strArr5[1].length() == strArr5[3].length()) {
                    A02[4] = "crD2koPf8HiM7FLITwbLUAokMU0ofExW";
                    if (equals) {
                        c = '\t';
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
                throw new java.lang.RuntimeException();
            case 2312989:
                if (str.equals(A0N(523, 4, 75))) {
                    c = '\n';
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312992:
                if (str.equals(A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 4, 103))) {
                    c = 11;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 2312995:
                if (str.equals(A0N(531, 4, 19))) {
                    c = '\f';
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            default:
                c = 65535;
                switch (c) {
                }
        }
    }

    public static java.lang.String A0O(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        for (java.lang.String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(A0N(1765, 18, 26))) {
            if (A0N(651, 21, 124).equals(str)) {
                return A0N(1806, 12, 59);
            }
            java.lang.String[] strArr = A02;
            if (strArr[1].length() == strArr[3].length()) {
                java.lang.String[] strArr2 = A02;
                strArr2[0] = "SNR7DEuQkTqundc8fpfLWSSq";
                strArr2[2] = "Am34";
                if (A0N(com.unity3d.services.UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 21, 62).equals(str) || A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 34, 59).equals(str)) {
                    return A0N(1783, 13, 48);
                }
                return null;
            }
        } else {
            if (str2.equals(A0N(1435, 10, 108)) && A0N(912, 20, 92).equals(str)) {
                return A0N(1515, 15, 100);
            }
            java.lang.String[] strArr3 = A02;
            if (strArr3[1].length() == strArr3[3].length()) {
                java.lang.String[] strArr4 = A02;
                strArr4[0] = "F6UQuKTk39X0DFpi3syODLNA";
                strArr4[2] = "oGjK";
                if (str2.equals(A0N(1469, 10, 50)) && A0N(932, 20, 50).equals(str)) {
                    return A0N(1530, 15, 109);
                }
                if (str2.equals(A0N(1426, 9, 12)) && A0N(893, 19, 80).equals(str)) {
                    return A0N(1479, 12, 10);
                }
                return null;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static java.lang.String A0P(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        if (A0N(1455, 14, 98).equals(c2196qI.A0W)) {
            java.lang.String A0N = A0N(1445, 10, 6);
            if (A02[7].length() != 25) {
                java.lang.String[] strArr = A02;
                strArr[6] = "ZfndW6AJBdBNuLe7GaNBaOlzT6fPhO3e";
                strArr[5] = "cwvehiRLBehKtkGil8NX01GWyhG4bC3G";
                return A0N;
            }
        } else {
            if (A0N(1765, 18, 26).equals(c2196qI.A0W) && (codecProfileAndLevel = A0B(c2196qI)) != null) {
                int profile = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
                if (profile == 16 || profile == 256) {
                    return A0N(1796, 10, 24);
                }
                if (profile == 512) {
                    java.lang.String[] strArr2 = A02;
                    if (strArr2[0].length() != strArr2[2].length()) {
                        A02[7] = "uUyr2eIguxRStOoGPtni7X3Qg6do19s";
                        return A0N(1756, 9, 19);
                    }
                }
            }
            java.lang.String[] strArr3 = A02;
            if (strArr3[0].length() != strArr3[2].length()) {
                java.lang.String[] strArr4 = A02;
                strArr4[6] = "fWQmLDMHB8f7NLxxt23iYDut8JSJcJup";
                strArr4[5] = "lo0RJuE4BwIH2JQYtOHz0H7ocrHx9GAy";
                return null;
            }
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecInfo> */
    public static synchronized java.util.List<com.facebook.ads.redexgen.core.B3> A0R(java.lang.String str, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.BX {
        com.facebook.ads.redexgen.core.BY c2063o8;
        synchronized (com.facebook.ads.redexgen.core.C0588Ba.class) {
            com.facebook.ads.redexgen.core.BW bw = new com.facebook.ads.redexgen.core.BW(str, z, z2);
            java.util.List<com.facebook.ads.redexgen.core.B3> list = A03.get(bw);
            if (list != null) {
                return list;
            }
            if (com.facebook.ads.redexgen.core.C5C.A02 >= 21) {
                c2063o8 = new com.facebook.ads.redexgen.core.C2062o7(z, z2);
            } else {
                c2063o8 = new com.facebook.ads.redexgen.core.C2063o8();
            }
            java.util.ArrayList<com.facebook.ads.redexgen.core.B3> A0Q = A0Q(bw, c2063o8);
            if (z && A0Q.isEmpty() && 21 <= com.facebook.ads.redexgen.core.C5C.A02 && com.facebook.ads.redexgen.core.C5C.A02 <= 23) {
                A0Q = A0Q(bw, new com.facebook.ads.redexgen.core.C2063o8());
                if (!A0Q.isEmpty()) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0N(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80), A0N(564, 51, 61) + str + A0N(34, 12, 86) + A0Q.get(0).A03);
                }
            }
            A0T(str, A0Q);
            com.facebook.ads.redexgen.core.BP A05 = com.facebook.ads.redexgen.core.BP.A05(A0Q);
            A03.put(bw, A05);
            return A05;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        if (r0.equals(r5) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0T(java.lang.String str, java.util.List<com.facebook.ads.redexgen.core.B3> list) {
        if (A0N(1506, 9, 92).equals(str)) {
            if (com.facebook.ads.redexgen.core.C5C.A02 < 26 && com.facebook.ads.redexgen.core.C5C.A03.equals(A0N(1090, 2, 81))) {
                int size = list.size();
                java.lang.String[] strArr = A02;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                A02[7] = "javvHYyhFf0KGd1kb";
                if (size == 1 && list.get(0).A03.equals(A0N(725, 25, 44))) {
                    list.add(com.facebook.ads.redexgen.core.B3.A02(A0N(871, 22, 78), A0N(1506, 9, 92), A0N(1506, 9, 92), null, false, true, false, false, false));
                }
            }
            A0U(list, new com.facebook.ads.redexgen.core.BZ() { // from class: com.facebook.ads.redexgen.X.oA
                @Override // com.facebook.ads.redexgen.core.BZ
                public final int A8w(java.lang.Object obj) {
                    return com.facebook.ads.redexgen.core.C0588Ba.A08((com.facebook.ads.redexgen.core.B3) obj);
                }
            });
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 < 21 && list.size() > 1) {
            java.lang.String str2 = list.get(0).A03;
            java.lang.String firstCodecName = A0N(805, 15, 82);
            if (!firstCodecName.equals(str2)) {
                java.lang.String firstCodecName2 = A0N(771, 19, 37);
                if (!firstCodecName2.equals(str2)) {
                    java.lang.String firstCodecName3 = A0N(835, 26, 45);
                }
            }
            A0U(list, new com.facebook.ads.redexgen.core.BZ() { // from class: com.facebook.ads.redexgen.X.o9
                @Override // com.facebook.ads.redexgen.core.BZ
                public final int A8w(java.lang.Object obj) {
                    return com.facebook.ads.redexgen.core.C0588Ba.A09((com.facebook.ads.redexgen.core.B3) obj);
                }
            });
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 < 32 && list.size() > 1) {
            java.lang.String str3 = list.get(0).A03;
            java.lang.String firstCodecName4 = A0N(1030, 26, 22);
            if (firstCodecName4.equals(str3)) {
                list.add(list.remove(0));
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BZ != com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$ScoreProvider<T> */
    public static <T> void A0U(java.util.List<T> list, final com.facebook.ads.redexgen.core.BZ<T> bz) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.BU
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.facebook.ads.redexgen.core.C0588Ba.A0A(com.facebook.ads.redexgen.core.BZ.this, obj, obj2);
            }
        });
    }

    public static boolean A0V(android.media.MediaCodecInfo mediaCodecInfo) {
        return com.facebook.ads.redexgen.core.C5C.A02 >= 29 && A0W(mediaCodecInfo);
    }

    public static boolean A0W(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A0X(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A0Y(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A0Z(android.media.MediaCodecInfo mediaCodecInfo) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            return A0a(mediaCodecInfo);
        }
        java.lang.String A012 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(mediaCodecInfo.getName());
        java.lang.String codecName = A0N(1644, 11, 44);
        if (!A012.startsWith(codecName)) {
            java.lang.String codecName2 = A0N(1570, 11, 85);
            if (!A012.startsWith(codecName2)) {
                java.lang.String codecName3 = A0N(1581, 10, 2);
                if (!A012.startsWith(codecName3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0a(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static boolean A0b(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            return A0X(mediaCodecInfo);
        }
        boolean A0c = A0c(mediaCodecInfo, str);
        if (A02[7].length() == 25) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[1] = "KoKjuGysRdwz5u0";
        strArr[3] = "VFpylWMq2S0rj93";
        return !A0c;
    }

    public static boolean A0c(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            boolean A0Y = A0Y(mediaCodecInfo);
            if (A02[7].length() == 25) {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "d";
            return A0Y;
        }
        if (com.facebook.ads.redexgen.core.C3J.A0C(str)) {
            return true;
        }
        java.lang.String A012 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(mediaCodecInfo.getName());
        java.lang.String codecName = A0N(1422, 4, 110);
        if (A012.startsWith(codecName)) {
            return false;
        }
        java.lang.String codecName2 = A0N(1644, 11, 44);
        if (A012.startsWith(codecName2)) {
            return true;
        }
        java.lang.String codecName3 = A0N(1633, 11, 78);
        if (A012.startsWith(codecName3)) {
            return true;
        }
        java.lang.String codecName4 = A0N(1688, 8, 32);
        if (A012.startsWith(codecName4)) {
            java.lang.String A0N = A0N(53, 4, 125);
            java.lang.String[] strArr = A02;
            if (strArr[6].charAt(8) == strArr[5].charAt(8)) {
                A02[4] = "Tb2zdMoNeySIBbx0V3f9cAwRo38zez7f";
                if (A012.contains(A0N)) {
                    return true;
                }
            } else if (A012.contains(A0N)) {
                return true;
            }
        }
        java.lang.String codecName5 = A0N(1655, 33, 66);
        if (A012.equals(codecName5)) {
            return true;
        }
        java.lang.String codecName6 = A0N(1570, 11, 85);
        if (A012.startsWith(codecName6)) {
            return true;
        }
        java.lang.String codecName7 = A0N(1581, 10, 2);
        if (A012.startsWith(codecName7)) {
            return true;
        }
        java.lang.String codecName8 = A0N(1629, 4, 74);
        if (!A012.startsWith(codecName8)) {
            java.lang.String codecName9 = A0N(1557, 3, 62);
            if (!A012.startsWith(codecName9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0324, code lost:
    
        if (A0N(1092, 6, 58).equals(r4) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0335, code lost:
    
        if (A0N(1104, 5, 115).equals(com.facebook.ads.redexgen.core.C5C.A03) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x034e, code lost:
    
        if (A0N(1092, 6, 58).equals(r4) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03df, code lost:
    
        if (r3 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(268, 2, 87)) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c7, code lost:
    
        if (A0N(1109, 6, 39).equals(com.facebook.ads.redexgen.core.C5C.A03) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0239, code lost:
    
        if (A0N(117, 5, 63).equals(com.facebook.ads.redexgen.core.C5C.A03) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0d(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z, java.lang.String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(A0N(46, 7, 6)))) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 < 21 && (A0N(142, 13, 104).equals(str) || A0N(170, 13, 103).equals(str) || A0N(183, 16, 125).equals(str) || A0N(155, 15, 116).equals(str) || A0N(92, 10, 51).equals(str) || A0N(554, 10, 2).equals(str))) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 < 18 && A0N(672, 25, 116).equals(str)) {
            if (!A0N(1419, 3, 57).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                if (A0N(1401, 6, 11).equals(com.facebook.ads.redexgen.core.C5C.A05)) {
                }
            }
            return false;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 == 16 && A0N(978, 26, 15).equals(str)) {
            if (!A0N(1593, 4, 104).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                if (!A0N(1696, 6, 121).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                    if (!A0N(1818, 5, 97).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                        if (!A0N(1830, 9, 61).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                            if (!A0N(1823, 7, 18).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                java.lang.String str3 = com.facebook.ads.redexgen.core.C5C.A03;
                                java.lang.String[] strArr = A02;
                                if (strArr[0].length() != strArr[2].length()) {
                                    java.lang.String[] strArr2 = A02;
                                    strArr2[6] = "F0Gn9cxfBSvii7fa0UF93GCV4uv6K8de";
                                    strArr2[5] = "DcyddPg9BiXD105tQwV5IePfZ0bLVn4M";
                                    if (!str3.startsWith(A0N(1597, 3, 123))) {
                                        if (!A0N(122, 5, 79).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                            if (!A0N(127, 5, 106).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                                if (!A0N(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 5, 117).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                                    if (!A0N(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 5, 10).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                                        if (!A0N(538, 4, 106).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new java.lang.RuntimeException();
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 == 16 && A0N(952, 26, 16).equals(str)) {
            if (!A0N(102, 5, 12).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                java.lang.String str4 = com.facebook.ads.redexgen.core.C5C.A03;
                if (A02[7].length() != 25) {
                    java.lang.String[] strArr3 = A02;
                    strArr3[6] = "nydJBFHRBD5hk7o2D4tykvKlgMFsP1SM";
                    strArr3[5] = "WWeXBCZuBCRG7EUvuKiPsTkRgK8ERGfC";
                    if (!A0N(107, 5, 39).equals(str4)) {
                        if (!A0N(112, 5, 41).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                        }
                    }
                }
                throw new java.lang.RuntimeException();
            }
            return false;
        }
        int i = com.facebook.ads.redexgen.core.C5C.A02;
        java.lang.String[] strArr4 = A02;
        if (strArr4[6].charAt(8) == strArr4[5].charAt(8)) {
            java.lang.String[] strArr5 = A02;
            strArr5[6] = "GkRyYjTYByrmgDH0WlXKVdmPSNZ8lCgN";
            strArr5[5] = "ni9nM4uSBMddlB6zBZSK6aFbzoXzwy3u";
            java.lang.String A0N = A0N(1702, 7, 12);
            if (i < 24 && ((A0N(790, 15, 118).equals(str) || A0N(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 22, 79).equals(str)) && A0N.equals(com.facebook.ads.redexgen.core.C5C.A05))) {
                if (!com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1849, 8, 78)) && !com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1857, 7, 69)) && !com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1843, 6, 57))) {
                    if (!A0N(1098, 6, 120).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                        if (!A0N(1613, 12, 52).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                            if (!A0N(87, 5, 75).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                java.lang.String str5 = com.facebook.ads.redexgen.core.C5C.A03;
                                java.lang.String[] strArr6 = A02;
                                if (strArr6[6].charAt(8) == strArr6[5].charAt(8)) {
                                    java.lang.String[] strArr7 = A02;
                                    strArr7[0] = "nYvmQZpdwFAwcv6gzbNkZZWF";
                                    strArr7[2] = "X6eS";
                                }
                            }
                        }
                    }
                }
                return false;
            }
            int i2 = com.facebook.ads.redexgen.core.C5C.A02;
            java.lang.String A0N2 = A0N(1608, 5, 104);
            if (i2 <= 19 && A0N(820, 15, 38).equals(str) && A0N.equals(com.facebook.ads.redexgen.core.C5C.A05)) {
                if (!com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1591, 2, 7)) && !com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1730, 7, 9)) && !com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N2) && !com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1709, 6, 19))) {
                    boolean startsWith = com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(1737, 2, 58));
                    java.lang.String[] strArr8 = A02;
                    if (strArr8[0].length() == strArr8[2].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr9 = A02;
                    strArr9[6] = "JGSFe5hHB2u94PbOntGCWQqPSFCJeXlP";
                    strArr9[5] = "TkGozbnrBqdw4Stmffdx8IiId823o3dX";
                }
                return false;
            }
            if (com.facebook.ads.redexgen.core.C5C.A02 <= 19 && com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N2) && A0N(1004, 26, 89).equals(str)) {
                return false;
            }
            return (com.facebook.ads.redexgen.core.C5C.A02 <= 23 && A0N(1455, 14, 98).equals(str2) && A0N(697, 28, 96).equals(str)) ? false : true;
        }
        throw new java.lang.RuntimeException();
    }
}
