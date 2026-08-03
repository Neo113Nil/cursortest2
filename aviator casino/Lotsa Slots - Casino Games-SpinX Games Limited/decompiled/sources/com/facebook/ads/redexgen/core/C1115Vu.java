package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1115Vu {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final com.facebook.ads.redexgen.core.EnumC1114Vt A00;
    public final java.lang.Long A01;
    public final java.lang.String A02;
    public final java.lang.String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C1115Vu(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq) throws com.facebook.ads.redexgen.core.C1109Vn {
        java.lang.String A01 = A01(270, 21, 91);
        java.lang.String A012 = A01(291, 11, 58);
        java.lang.String A013 = A01(247, 14, 109);
        java.lang.String A014 = A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 4, 38);
        java.lang.String A015 = A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, 8, 37);
        if (android.text.TextUtils.isEmpty(str)) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC1114Vt.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            switch (com.facebook.ads.redexgen.core.EnumC1114Vt.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()) {
                case 0:
                    this.A00 = com.facebook.ads.redexgen.core.EnumC1114Vt.A03;
                    this.A01 = java.lang.Long.valueOf(jSONObject.getString(A01(241, 6, 127)));
                    if (jSONObject.has(A013)) {
                        this.A02 = jSONObject.getString(A013);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 88));
                    if (!jSONObject.getString(A012).equals(t8.A05().A9T()) && !com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess() && com.facebook.ads.redexgen.core.AbstractC1089Us.A03(jSONObject) != java.lang.Boolean.TRUE) {
                        throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(A012), t8.A05().A9T()));
                    }
                    if (!jSONObject.getString(A01).equals(str2)) {
                        throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(A01), str2));
                    }
                    java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC1111Vq.A0H.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC1111Vq.A0K.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC1111Vq.A0I.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC1111Vq.A0J.A04())));
                    if (jSONObject.getInt(A015) != enumC1111Vq.A04()) {
                        if (!hashSet.contains(java.lang.Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(java.lang.Integer.valueOf(enumC1111Vq.A04()))) {
                            throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(104, 48, 28), this.A01, java.lang.Integer.valueOf(jSONObject.getInt(A015)), enumC1111Vq));
                        }
                        return;
                    }
                    return;
                default:
                    throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 28, 68) + jSONObject.getString(A014));
            }
        } catch (org.json.JSONException e) {
            t8.A08().ABC(A01(238, 3, 5), com.facebook.ads.redexgen.core.AbstractC1048Td.A0P, new com.facebook.ads.redexgen.core.C1049Te(e));
            throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 18, 88), e);
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 6, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 51, 36, 43, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SYN, 5, com.google.common.base.Ascii.DC2, 19, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 19, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 2, 5, 9, com.google.common.base.Ascii.SO, 7, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.NAK, 19, 5, 4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 51, 36, 43, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SYN, 5, com.google.common.base.Ascii.DC2, 19, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 19, 83, 120, 117, 49, 52, 117, 49, 119, 126, 99, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 49, 115, 116, 120, Byte.MAX_VALUE, 118, 49, 100, 98, 116, 117, 49, 126, Byte.MAX_VALUE, 49, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, 49, 52, 98, 68, 111, 98, 38, 35, 98, 38, 96, 105, 116, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 38, 100, 99, 111, 104, 97, 38, 115, 117, 99, 98, 38, 105, 104, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, com.google.common.base.Ascii.VT, 44, 52, 35, 46, 43, 38, 98, 0, 43, 38, com.google.common.base.Ascii.DC2, 35, 59, 46, 45, 35, 38, 71, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, 51, 54, 96, 51, 122, 96, 51, 125, 124, 103, 51, 101, 114, Byte.MAX_VALUE, 122, 119, 51, 113, 114, 125, 125, 118, 97, 51, 103, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, com.google.common.base.Ascii.VT, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, com.google.common.base.Ascii.FS, 55, 58, com.google.common.base.Ascii.SO, 63, 39, 50, 49, 63, 58, 126, 42, 39, 46, 59, 126, 126, 111, 118, 7, com.google.common.base.Ascii.FF, 1, 58, com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, 19, 40, 3, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC2, 40, 3, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.EM, 38, 39, 52, 43, 33, 39, com.google.common.base.Ascii.GS, 43, 38, 51, 36, 50, 46, 45, 55, 36, 37, com.google.common.base.Ascii.RS, 49, 45, 32, 34, 36, 44, 36, 47, 53, com.google.common.base.Ascii.RS, 40, 37, 83, 68, 75, Byte.MAX_VALUE, 86, 69, 82, 83, 73, 79, 78, 75, 90, 82, 79, 83, 94, 75, 90, 72, 69, 76, 89};
    }

    static {
        A02();
    }

    public C1115Vu() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1114Vt.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static com.facebook.ads.redexgen.core.EnumC1111Vq A00(java.lang.String str) throws com.facebook.ads.redexgen.core.C1109Vn {
        try {
            return com.facebook.ads.redexgen.core.EnumC1111Vq.A00(new org.json.JSONObject(str).getInt(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, 8, 37)));
        } catch (org.json.JSONException e) {
            throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 18, 88), e);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq) throws com.facebook.ads.redexgen.core.C1109Vn {
        if (!com.facebook.ads.redexgen.core.EnumC1111Vq.A0G.equals(enumC1111Vq) && !com.facebook.ads.redexgen.core.EnumC1111Vq.A0E.equals(enumC1111Vq) && !com.facebook.ads.redexgen.core.EnumC1111Vq.A0F.equals(enumC1111Vq)) {
            boolean equals = com.facebook.ads.redexgen.core.EnumC1111Vq.A0D.equals(enumC1111Vq);
            if (A05[1].charAt(20) == 'm') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (equals) {
            } else {
                throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(170, 40, 9), java.lang.Integer.valueOf(enumC1111Vq.A04())));
            }
        }
    }

    public final java.lang.String A04() {
        if (this.A01 == null) {
            return null;
        }
        java.lang.Long l = this.A01;
        if (A05[4].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
        return l.toString();
    }

    public final java.lang.String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != com.facebook.ads.redexgen.core.EnumC1114Vt.A04;
    }
}
