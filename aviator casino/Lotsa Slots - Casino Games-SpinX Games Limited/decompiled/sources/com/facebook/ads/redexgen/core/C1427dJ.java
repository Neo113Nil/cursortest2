package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1427dJ {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1420dC> A00;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0783Is> A01 = new java.lang.ref.WeakReference<>(null);
    public boolean A02 = false;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.C1407cz A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.VA> A07;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, Byte.MAX_VALUE, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new java.lang.RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C1427dJ(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1420dC c1420dC, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1407cz c1407cz, java.lang.String str, java.lang.String str2) {
        this.A03 = c1636gi;
        this.A00 = new java.lang.ref.WeakReference<>(c1420dC);
        this.A07 = new java.lang.ref.WeakReference<>(va);
        this.A04 = c1407cz;
        this.A05 = str;
        this.A06 = str2;
    }

    public static java.util.Map<java.lang.String, java.lang.String> A03(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        java.util.HashMap hashMap = new java.util.HashMap();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9k();
    }

    private void A06() {
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAm();
    }

    private void A07() {
        this.A03.A0F().A64();
        this.A02 = true;
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AKD();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A03)) {
            this.A03.A0B().ADb();
        }
    }

    private void A08() {
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AE0();
    }

    private void A0A(com.facebook.ads.redexgen.core.C1420dC c1420dC, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        android.content.SharedPreferences A00 = com.facebook.ads.redexgen.core.WN.A00(this.A03);
        java.lang.String A01 = A01(57, 5, 77);
        java.lang.String A012 = A01(0, 0, 53);
        java.lang.String storageValue = jSONObject.optString(A01, A012);
        java.lang.String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        java.lang.String string = A00.getString(A01(14, 4, 0) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c1420dC.A0g(storageValue, A012);
    }

    private void A0B(com.facebook.ads.redexgen.core.C1420dC c1420dC, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String A01 = A01(98, 5, 42);
        java.lang.String A012 = A01(0, 0, 53);
        java.lang.String optString = jSONObject.optString(A01, A012);
        java.lang.String optString2 = jSONObject.optString(A01(57, 5, 77), A012);
        com.facebook.ads.redexgen.core.WN.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), optString).apply();
        c1420dC.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(com.facebook.ads.redexgen.core.EnumC1425dH enumC1425dH, java.lang.String str) throws org.json.JSONException {
        switch (enumC1425dH.ordinal()) {
            case 0:
                A0I(new org.json.JSONObject(str));
                break;
            case 1:
                A06();
                break;
            case 2:
                A04();
                break;
            case 5:
                A07();
                break;
            case 7:
                if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A0K(new org.json.JSONObject(str));
                break;
            case 9:
                A0L(new org.json.JSONObject(str));
                break;
            case 10:
                A05();
            case 11:
                this.A03.A0F().A6G(str);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                A0D(enumC1425dH, str);
                break;
            case 19:
                A0J(new org.json.JSONObject(str));
                break;
            case 20:
                A08();
                break;
            case 21:
                A0M(new org.json.JSONObject(str));
                break;
        }
        com.facebook.ads.redexgen.core.C1420dC c1420dC = this.A00.get();
        if (c1420dC == null) {
        }
        switch (enumC1425dH.ordinal()) {
            case 3:
                c1420dC.A0S();
                break;
            case 4:
                c1420dC.A0R();
                break;
            case 6:
                c1420dC.A0i(A03(new org.json.JSONObject(str)));
                break;
            case 17:
                A0B(c1420dC, str);
                break;
            case 18:
                A0A(c1420dC, str);
                break;
        }
    }

    private void A0D(com.facebook.ads.redexgen.core.EnumC1425dH enumC1425dH, java.lang.String str) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is = this.A01.get();
        if (interfaceC0783Is == null) {
        }
        switch (enumC1425dH.ordinal()) {
            case 12:
                A0E(interfaceC0783Is, str);
                break;
            case 13:
                interfaceC0783Is.AE4();
                break;
            case 14:
                interfaceC0783Is.AFz();
                break;
            case 15:
                A0G(interfaceC0783Is, str);
                break;
            case 16:
                A0F(interfaceC0783Is, str);
                break;
        }
    }

    private void A0E(com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String STATE_KEY = A01(87, 5, 115);
        interfaceC0783Is.AEu(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC0783Is.AGX(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC0783Is.AGZ(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is = this.A01.get();
        if (interfaceC0783Is == null) {
            return;
        }
        java.lang.String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (android.text.TextUtils.isEmpty(productUrl)) {
            interfaceC0783Is.A9f();
        } else {
            interfaceC0783Is.A9g(productUrl);
        }
    }

    private void A0J(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.InterfaceC0783Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.VA va = this.A07.get();
        if (va == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        java.lang.String key = jSONObject.optString(A01(43, 11, 127));
        if (android.text.TextUtils.isEmpty(key)) {
            return;
        }
        com.facebook.ads.redexgen.core.VI handler = new com.facebook.ads.redexgen.core.VI(this.A06, va);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(org.json.JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (optInt == -1) {
            return;
        }
        java.lang.String message = jSONObject.optString(A01(29, 14, 56));
        if (android.text.TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().ABA(optInt, message);
        java.lang.String[] strArr = A09;
        java.lang.String message2 = strArr[2];
        java.lang.String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is = this.A01.get();
        if (interfaceC0783Is == null) {
            return;
        }
        java.lang.String A01 = A01(92, 6, 88);
        java.lang.String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        java.lang.String optString = jSONObject.optString(A01);
        if (optString == null) {
            return;
        }
        interfaceC0783Is.AGo(optString);
    }

    public final void A0N(com.facebook.ads.redexgen.core.InterfaceC0783Is interfaceC0783Is) {
        this.A01 = new java.lang.ref.WeakReference<>(interfaceC0783Is);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @android.webkit.JavascriptInterface
    public void postMessage(java.lang.String str) {
        com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.RunnableC1424dG(this, str));
    }
}
