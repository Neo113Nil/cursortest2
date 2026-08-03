package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1050Tf {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final java.lang.Object A02;
    public static final java.lang.String A03;
    public static final java.util.Map<java.lang.String, java.lang.Integer> A04;
    public static final java.util.Set<java.lang.String> A05;
    public static final java.util.concurrent.atomic.AtomicInteger A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C1052Th A01(java.lang.String str, com.facebook.ads.redexgen.core.T8 t8, java.util.Map<java.lang.String, java.lang.String> map) {
        com.facebook.ads.redexgen.core.C1052Th c1052Th = null;
        try {
            c1052Th = new com.facebook.ads.redexgen.core.C1052Th(t8.A09().A01(), t8.A09().A02(), new com.facebook.ads.redexgen.core.TR(str, map, true).A02());
            A0C(c1052Th, t8);
            return c1052Th;
        } catch (java.lang.Exception unused) {
            return c1052Th;
        }
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static org.json.JSONArray A04(com.facebook.ads.redexgen.core.T8 t8, int i) {
        com.facebook.ads.redexgen.core.InterfaceC1047Tc A08;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (A02) {
            java.io.FileInputStream fileInputStream = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            try {
                try {
                    if (new java.io.File(t8.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8)).exists()) {
                        fileInputStream = t8.openFileInput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8));
                        inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                        bufferedReader = new java.io.BufferedReader(inputStreamReader);
                        while (true) {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null || i == 0) {
                                break;
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(readLine);
                            if (!jSONObject.has(A02(260, 7, 82))) {
                                jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(0));
                            }
                            java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                            if (!A05.contains(string)) {
                                int i2 = jSONObject.getInt(A02(260, 7, 82));
                                if (A04.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(A04.get(string)));
                                } else {
                                    A0E(string, i2);
                                }
                                jSONArray.put(jSONObject);
                                if (i > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e) {
                            e = e;
                            A08 = t8.A08();
                            A08.A4I(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (java.io.IOException | org.json.JSONException e2) {
                    t8.A08().A4I(e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e3) {
                            e = e3;
                            A08 = t8.A08();
                            A08.A4I(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (java.io.IOException e4) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A00 = new byte[]{-73, -24, -36, 0, 46, 43, 44, -1, 43, 49, 42, 48, 33, 46, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, com.google.common.base.Ascii.RS, 60, 73, 2, 79, -5, 63, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -5, 65, 68, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 42, com.google.common.base.Ascii.FS, 52, 37, 39, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, 50, 33, 38, 34, 43, 32, 34, com.google.common.base.Ascii.VT, 34, 49, 52, 44, 47, 40, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, 32, 56, 54, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 50, 49, -19, 50, 67, 50, 59, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -5, 1, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, -50, 17, com.google.common.base.Ascii.GS, 32, 32, 35, com.google.common.base.Ascii.RS, 34, 19, com.google.common.base.Ascii.DC2, -50, com.google.common.base.Ascii.DC2, 19, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.NAK, -50, 19, 36, 19, com.google.common.base.Ascii.FS, 34, -50, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, 19, -36, 44, 74, 81, 65, 70, 63, -8, 76, 71, -8, 77, 72, 60, 57, 76, kotlin.io.encoding.Base64.padSymbol, -8, 77, 70, 74, kotlin.io.encoding.Base64.padSymbol, 59, 71, 74, 60, kotlin.io.encoding.Base64.padSymbol, 60, -8, 60, kotlin.io.encoding.Base64.padSymbol, 58, 77, 63, 36, 71, 63, com.google.common.base.Ascii.GS, 78, kotlin.io.encoding.Base64.padSymbol, 70, 76, 6, -8, 57, 60, 60, 65, 70, 63, -8, 76, 71, -8, 39, 70, 63, 71, 65, 70, 63, com.google.common.base.Ascii.GS, 78, kotlin.io.encoding.Base64.padSymbol, 70, 76, 6, 36, 57, 42, 50, 53, com.google.common.base.Ascii.GS, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, 37, 42, 37, 47, 36, 33, 32, -36, 33, 50, 33, 42, 48, -36, 47, 36, 43, 49, 40, 32, -36, 42, 43, 48, -36, com.google.common.base.Ascii.RS, 33, -36, 49, 44, 32, com.google.common.base.Ascii.GS, 48, 33, 32, -36, 48, 43, -36, com.google.common.base.Ascii.VT, 42, 35, 43, 37, 42, 35, 1, 50, 33, 42, 48, -22, 65, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, 49, 41, 39, 46, 46, 35, 34, 3, 52, 35, 44, 50, 49, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 5, -1, 3, com.google.common.base.Ascii.SI, 4, 5, 70, 59, 63, 55, 74, 79, 70, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(com.facebook.ads.redexgen.core.T8 t8) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (A02) {
            int i = 0;
            java.io.FileInputStream fileInputStream = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            java.io.FileOutputStream fileOutputStream = null;
            try {
                try {
                    if (new java.io.File(t8.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8)).exists()) {
                        fileInputStream = t8.openFileInput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8));
                        inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                        bufferedReader = new java.io.BufferedReader(inputStreamReader);
                        while (true) {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(readLine);
                            java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                            if (!A05.contains(string)) {
                                if (A04.containsKey(string)) {
                                    java.lang.Integer num = A04.get(string);
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
                                    int A022 = com.facebook.ads.redexgen.core.AbstractC1088Ur.A02(t8);
                                    if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                        jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(valueOf));
                                        jSONArray.put(jSONObject);
                                    } else {
                                        A0D(string);
                                        i++;
                                    }
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            sb.append(jSONArray.getJSONObject(i2).toString()).append('\n');
                        }
                        fileOutputStream = t8.openFileOutput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8), 0);
                        fileOutputStream.write(sb.toString().getBytes());
                    }
                    A09(t8, A00(t8));
                    if (i > 0) {
                        t8.A08().ABC(A02(271, 10, 5), com.facebook.ads.redexgen.core.AbstractC1048Td.A2Y, new com.facebook.ads.redexgen.core.C1049Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    return true;
                } finally {
                    if (0 != 0) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e) {
                            t8.A08().A4I(e);
                            A05.clear();
                            A04.clear();
                        }
                    }
                    if (0 != 0) {
                        inputStreamReader.close();
                    }
                    if (0 != 0) {
                        fileInputStream.close();
                    }
                    if (0 != 0) {
                        fileOutputStream.close();
                    }
                    A05.clear();
                    A04.clear();
                }
            } catch (java.io.IOException | org.json.JSONException e2) {
                t8.A08().A4I(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e3) {
                        t8.A08().A4I(e3);
                        A05.clear();
                        A04.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A05.clear();
                A04.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206 A[Catch: IOException -> 0x020a, all -> 0x0254, TRY_LEAVE, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0H(com.facebook.ads.redexgen.core.T8 t8) {
        int intValue;
        synchronized (A02) {
            int i = 0;
            java.io.FileInputStream fileInputStream = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            java.io.FileOutputStream fileOutputStream = null;
            java.io.FileInputStream fileInputStream2 = null;
            java.io.FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    java.lang.String processSpecificName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8);
                    java.io.File file = new java.io.File(t8.getFilesDir(), processSpecificName);
                    java.lang.String str = processSpecificName + A02(255, 5, 91);
                    A0A(t8, str);
                    if (file.exists()) {
                        fileOutputStream2 = t8.openFileOutput(str, 32768);
                        fileInputStream = t8.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                            try {
                                bufferedReader = new java.io.BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        java.lang.String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        try {
                                            org.json.JSONObject jSONObject = new org.json.JSONObject(readLine);
                                            java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                                            if (!A05.contains(string)) {
                                                if (A04.containsKey(string)) {
                                                    try {
                                                        java.lang.Integer num = A04.get(string);
                                                        if (num != null) {
                                                            try {
                                                                intValue = num.intValue();
                                                            } catch (java.io.IOException e) {
                                                                e = e;
                                                                t8.A08().A4I(e);
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                return false;
                                                            } catch (org.json.JSONException e2) {
                                                                e = e2;
                                                                if (!t8.A05().AAO()) {
                                                                }
                                                            } catch (java.lang.Throwable th) {
                                                                th = th;
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        } else {
                                                            intValue = 0;
                                                        }
                                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                                                        int A022 = com.facebook.ads.redexgen.core.AbstractC1088Ur.A02(t8);
                                                        if (A022 > -1) {
                                                            try {
                                                                if (valueOf.intValue() > A022 - 1) {
                                                                    try {
                                                                        try {
                                                                            A0D(string);
                                                                            i++;
                                                                        } catch (org.json.JSONException e3) {
                                                                            e = e3;
                                                                            if (!t8.A05().AAO()) {
                                                                                android.util.Log.e(A03, A02(153, 36, 68), e);
                                                                            }
                                                                        }
                                                                    } catch (java.io.IOException e4) {
                                                                        e = e4;
                                                                        t8.A08().A4I(e);
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (java.io.IOException e5) {
                                                                                t8.A08().A4I(e5);
                                                                                A05.clear();
                                                                                A04.clear();
                                                                                return false;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStream != null) {
                                                                            fileInputStream.close();
                                                                        }
                                                                        if (fileOutputStream != null) {
                                                                            fileOutputStream.close();
                                                                        }
                                                                        if (fileInputStream2 != null) {
                                                                            fileInputStream2.close();
                                                                        }
                                                                        if (fileOutputStream2 != null) {
                                                                            fileOutputStream2.close();
                                                                        }
                                                                        A05.clear();
                                                                        A04.clear();
                                                                        return false;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        th = th2;
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (java.io.IOException e6) {
                                                                                t8.A08().A4I(e6);
                                                                                A05.clear();
                                                                                A04.clear();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStream != null) {
                                                                            fileInputStream.close();
                                                                        }
                                                                        if (fileOutputStream != null) {
                                                                            fileOutputStream.close();
                                                                        }
                                                                        if (fileInputStream2 != null) {
                                                                            fileInputStream2.close();
                                                                        }
                                                                        if (fileOutputStream2 != null) {
                                                                            fileOutputStream2.close();
                                                                        }
                                                                        A05.clear();
                                                                        A04.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (java.io.IOException e7) {
                                                                e = e7;
                                                                t8.A08().A4I(e);
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                return false;
                                                            } catch (org.json.JSONException e8) {
                                                                e = e8;
                                                            } catch (java.lang.Throwable th3) {
                                                                th = th3;
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        }
                                                        jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(valueOf));
                                                        fileOutputStream2.write((jSONObject.toString() + '\n').getBytes());
                                                    } catch (java.io.IOException e9) {
                                                        e = e9;
                                                    } catch (org.json.JSONException e10) {
                                                        e = e10;
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                    }
                                                } else {
                                                    fileOutputStream2.write((jSONObject.toString() + '\n').getBytes());
                                                }
                                            }
                                        } catch (org.json.JSONException e11) {
                                            e = e11;
                                        }
                                    } catch (java.io.IOException e12) {
                                        e = e12;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                }
                                fileInputStream2 = t8.openFileInput(str);
                                fileOutputStream = t8.openFileOutput(processSpecificName, 0);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream2.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileInputStream2.close();
                                fileOutputStream2.close();
                                A0A(t8, str);
                            } catch (java.io.IOException e13) {
                                e = e13;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (java.io.IOException e14) {
                            e = e14;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                    }
                    A09(t8, A00(t8));
                    if (i > 0) {
                        t8.A08().ABC(A02(271, 10, 5), com.facebook.ads.redexgen.core.AbstractC1048Td.A2Y, new com.facebook.ads.redexgen.core.C1049Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e15) {
                            t8.A08().A4I(e15);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    A05.clear();
                    A04.clear();
                    return true;
                } catch (java.io.IOException e16) {
                    e = e16;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
    }

    static {
        A06();
        A03 = com.facebook.ads.redexgen.core.C1050Tf.class.getName();
        A02 = new java.lang.Object();
        A05 = java.util.Collections.synchronizedSet(new java.util.HashSet());
        A04 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        A06 = new java.util.concurrent.atomic.AtomicInteger();
    }

    public static int A00(android.content.Context context) {
        return context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A05.size();
    }

    public static org.json.JSONArray A03(com.facebook.ads.redexgen.core.T8 t8) {
        return A04(t8, -1);
    }

    public static org.json.JSONObject A05(com.facebook.ads.redexgen.core.C1052Th c1052Th) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(A02(343, 2, 110), java.util.UUID.randomUUID().toString());
        jSONObject.put(A02(com.ironsource.InterfaceC3141l1.a.b.f, 4, 108), c1052Th.A03());
        jSONObject.put(A02(402, 4, 104), com.facebook.ads.redexgen.core.Y1.A03(c1052Th.A01()));
        jSONObject.put(A02(355, 12, 22), com.facebook.ads.redexgen.core.Y1.A03(c1052Th.A00()));
        jSONObject.put(A02(345, 10, 28), c1052Th.A02());
        jSONObject.put(A02(267, 4, 37), c1052Th.A04() != null ? new org.json.JSONObject(c1052Th.A04()) : new org.json.JSONObject());
        jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(0));
        return jSONObject;
    }

    public static void A07(android.content.Context context) {
        synchronized (A02) {
            java.io.File file = new java.io.File(context.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A05.clear();
            A04.clear();
        }
    }

    public static void A08(android.content.Context context) {
        A09(context, context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(android.content.Context context, int i) {
        int i2 = 0;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i >= 0) {
            i2 = i;
        }
        if (A01[1].charAt(3) != 'F') {
            throw new java.lang.RuntimeException();
        }
        A01[0] = androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
        edit.putInt(A02(75, 10, 38), i2).apply();
    }

    public static void A0A(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        java.io.File file = new java.io.File(t8.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            t8.A08().A4I(new java.lang.RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1632ge c1632ge, java.lang.String str) {
        java.lang.Integer num = A04.get(str);
        if (num == null) {
            if (c1632ge.A05().AAO()) {
                android.util.Log.e(A03, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A04.remove(str);
        }
        java.util.Map<java.lang.String, java.lang.Integer> map = A04;
        java.lang.Integer attempt = java.lang.Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(com.facebook.ads.redexgen.core.C1052Th c1052Th, com.facebook.ads.redexgen.core.T8 t8) {
        if (c1052Th != null && t8 != null) {
            synchronized (A02) {
                try {
                    java.lang.String processSpecificName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8);
                    java.io.File file = new java.io.File(t8.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = com.facebook.ads.redexgen.core.AbstractC1088Ur.A07(t8);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean delete = file.delete();
                            A09(t8, 0);
                            A05.clear();
                            A04.clear();
                            if (delete) {
                                java.util.Map<java.lang.String, java.lang.String> A5a = t8.A04().A5a();
                                A5a.put(A02(383, 7, 1), A02(271, 10, 5));
                                A5a.put(A02(390, 12, 54), java.lang.String.valueOf(2401));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A06.getAndIncrement(), t8, A5a);
                                return;
                            }
                            java.lang.String processSpecificName2 = A02(85, 17, 83);
                            android.util.Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    org.json.JSONObject A052 = A05(c1052Th);
                    java.io.FileOutputStream outputStream = t8.openFileOutput(processSpecificName, 32768);
                    outputStream.write((A052.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(t8);
                } catch (java.lang.Exception e) {
                    t8.A08().A4I(e);
                }
            }
        }
    }

    public static void A0D(java.lang.String str) {
        A04.remove(str);
        A05.add(str);
    }

    public static void A0E(java.lang.String str, int i) {
        if (!A05.contains(str)) {
            if (A04.containsKey(str)) {
                A04.remove(str);
            }
            A04.put(str, java.lang.Integer.valueOf(i));
            return;
        }
        throw new java.lang.RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(com.facebook.ads.redexgen.core.T8 t8) {
        if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0O(t8)) {
            return A0H(t8);
        }
        return A0G(t8);
    }

    public static boolean A0I(java.lang.String str) {
        return A05.contains(str) || A04.containsKey(str);
    }
}
