package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.87, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass87 extends com.facebook.ads.redexgen.core.AbstractC1840kH {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final java.lang.String A06;
    public com.facebook.ads.redexgen.core.XS A00;
    public final android.net.Uri A01;
    public final com.facebook.ads.redexgen.core.C0900Ng A02;
    public final java.util.Map<java.lang.String, java.lang.String> A03;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final java.util.List<android.content.Intent> A06() {
        java.util.List<com.facebook.ads.redexgen.core.C0893My> A052 = A05();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (A052 != null) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C0893My> it = A052.iterator();
            while (it.hasNext()) {
                android.content.Intent A00 = A00(it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, kotlin.io.encoding.Base64.padSymbol, 109, 124, 111, 110, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 17, 85, 1, com.google.common.base.Ascii.SUB, 85, com.google.common.base.Ascii.SUB, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 85, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 7, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DLE, 1, 85, 0, 7, com.google.common.base.Ascii.EM, 79, 85, 51, 53, 8, 7, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ESC, 6, 0, com.google.common.base.Ascii.CR, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, kotlin.io.encoding.Base64.padSymbol, 42, 55, 49, 48, 112, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 5, 10, 0, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, 0, 74, com.google.common.base.Ascii.CR, 10, com.google.common.base.Ascii.DLE, 1, 10, com.google.common.base.Ascii.DLE, 74, 5, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, com.google.common.base.Ascii.FS, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, com.google.common.base.Ascii.SYN, 3, 3, 72, 73, 88, 77, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 95, 19, 69, 72, 17, 9, 95, com.google.common.base.Ascii.ESC, 4, 17, com.google.common.base.Ascii.SUB, 17, com.google.common.base.Ascii.DLE, 43, com.google.common.base.Ascii.DLE, 17, 17, 4, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, com.google.common.base.Ascii.DC4, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 125, 68, 67, 78, 78, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 65, 73, 59, 42, 35, 117, com.google.common.base.Ascii.ETB, 6, com.google.common.base.Ascii.SI, 19, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.ETB, 89};
    }

    static {
        A07();
        A06 = com.facebook.ads.redexgen.core.AnonymousClass87.class.getSimpleName();
    }

    public AnonymousClass87(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.N0 n0, boolean z, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        super(c1636gi, va, str, n0, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c0900Ng;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.core.C0893My c0893My) {
        if (android.text.TextUtils.isEmpty(c0893My.A05())) {
            return null;
        }
        java.lang.String A03 = c0893My.A03();
        com.facebook.ads.redexgen.core.C1636gi c1636gi = ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01;
        java.lang.String appLinkUri = c0893My.A05();
        if (!com.facebook.ads.redexgen.core.AbstractC1152Xi.A04(c1636gi, appLinkUri)) {
            com.facebook.ads.redexgen.core.C1636gi c1636gi2 = ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01;
            if (A05[6].charAt(8) != 'P') {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "ldjYBpnAKJ5YKanQesg35Gt0OkPWSzAG";
            if (!A09(c1636gi2, A03)) {
                return null;
            }
        }
        if (!android.text.TextUtils.isEmpty(A03)) {
            java.lang.String appLinkUri2 = A04(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 4, 102);
            if (!A03.startsWith(appLinkUri2)) {
                java.lang.String appLinkUri3 = A04(254, 10, 74);
            }
            return new android.content.Intent(A04(62, 26, 119), com.facebook.ads.redexgen.core.XB.A00(A03));
        }
        android.content.pm.PackageManager packageManager = ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        java.lang.String appLinkUri4 = c0893My.A04();
        if (android.text.TextUtils.isEmpty(appLinkUri4)) {
            boolean isEmpty = android.text.TextUtils.isEmpty(A03);
            java.lang.String[] strArr = A05;
            java.lang.String str = strArr[7];
            java.lang.String appLinkUri5 = strArr[1];
            if (str.length() == appLinkUri5.length()) {
                throw new java.lang.RuntimeException();
            }
            A05[2] = "P0UyeT8Oj9P4H3GWuZ6UwWdLOtPXQiGU";
            if (isEmpty) {
                java.lang.String appLinkUri6 = c0893My.A05();
                return packageManager.getLaunchIntentForPackage(appLinkUri6);
            }
        }
        android.content.Intent A01 = A01(c0893My);
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A01, 65536);
        if (A01.getComponent() == null) {
            java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.content.pm.ResolveInfo next = it.next();
                java.lang.String str2 = next.activityInfo.packageName;
                java.lang.String A052 = c0893My.A05();
                if (A05[0].charAt(20) != '5') {
                    throw new java.lang.RuntimeException();
                }
                A05[5] = "zQ3PtZjh8GquAUsdZUz15LBCi8uwCZq5";
                if (str2.equals(A052)) {
                    A01.setComponent(new android.content.ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || A01.getComponent() == null) {
            if (!A09(((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, A03)) {
                return null;
            }
            java.lang.String appLinkUri7 = c0893My.A05();
            A01.setPackage(appLinkUri7);
        }
        return A01;
    }

    private android.content.Intent A01(com.facebook.ads.redexgen.core.C0893My c0893My) {
        android.content.Intent intent = new android.content.Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!android.text.TextUtils.isEmpty(c0893My.A05()) && !android.text.TextUtils.isEmpty(c0893My.A04())) {
            intent.setComponent(new android.content.ComponentName(c0893My.A05(), c0893My.A04()));
        }
        if (!android.text.TextUtils.isEmpty(c0893My.A03())) {
            intent.setData(com.facebook.ads.redexgen.core.XB.A00(c0893My.A03()));
        }
        return intent;
    }

    private final android.net.Uri A02() {
        java.lang.String queryParameter = this.A01.getQueryParameter(A04(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            return com.facebook.ads.redexgen.core.XB.A00(queryParameter);
        }
        android.net.Uri uri = this.A01;
        java.lang.String storeUrl = A04(211, 8, 11);
        java.lang.String storeId = uri.getQueryParameter(storeUrl);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = {storeId};
        java.lang.String storeUrl2 = A04(126, 22, 5);
        return com.facebook.ads.redexgen.core.XB.A00(java.lang.String.format(locale, storeUrl2, objArr));
    }

    private com.facebook.ads.redexgen.core.EnumC0885Mq A03() throws com.facebook.ads.redexgen.core.C1138Ws {
        com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
        try {
            return com.facebook.ads.redexgen.core.X6.A06(x6, ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, A02(), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A03, this.A03);
        } catch (com.facebook.ads.redexgen.core.C1138Ws unused) {
            java.lang.String str = A04(26, 27, 92) + this.A01.toString();
            java.lang.String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                com.facebook.ads.redexgen.core.X6.A0E(x6, ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, com.facebook.ads.redexgen.core.XB.A00(queryParameter), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A03);
            }
            return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        }
    }

    private java.util.List<com.facebook.ads.redexgen.core.C0893My> A05() {
        java.lang.String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        java.lang.String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter);
            java.lang.String appsiteDataString2 = A04(55, 7, 64);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    com.facebook.ads.redexgen.core.C0893My A00 = com.facebook.ads.redexgen.core.C0893My.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (org.json.JSONException e) {
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01.A08();
            int i2 = com.facebook.ads.redexgen.core.AbstractC1048Td.A24;
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(e);
            java.lang.String appsiteDataString3 = A04(204, 7, 61);
            A08.ABC(appsiteDataString3, i2, c1049Te);
            java.lang.String str = A06;
            java.lang.String appsiteDataString4 = A04(0, 26, 52);
            android.util.Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        java.util.List<android.content.Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        java.util.Iterator<android.content.Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (com.facebook.ads.redexgen.core.C1140Wu.A0D(((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 30 && str != null && com.facebook.ads.redexgen.core.C1086Up.A29(c1636gi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1840kH
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0H() {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (((com.facebook.ads.redexgen.core.AbstractC1840kH) this).A03) {
            enumC0885Mq = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), java.lang.String.valueOf(true));
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, enumC0885Mq);
        com.facebook.ads.redexgen.core.C0900Ng.A06(this.A02, ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01);
        return enumC0885Mq;
    }

    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0M() {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        java.lang.String A042 = A04(148, 15, 93);
        boolean A0K = A0K(this.A01);
        if (!A0K) {
            A0K = A08();
        }
        if (!A0K) {
            try {
                enumC0885Mq = A03();
                if (enumC0885Mq != com.facebook.ads.redexgen.core.EnumC0885Mq.A09) {
                    A042 = A04(188, 16, 61);
                } else {
                    A042 = A04(163, 25, 59);
                }
            } catch (java.lang.Exception unused) {
                enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A04;
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.A03;
        java.lang.String redirectionAction = java.lang.String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC0885Mq;
    }

    public final void A0N(com.facebook.ads.redexgen.core.XS xs) {
        this.A00 = xs;
    }
}
