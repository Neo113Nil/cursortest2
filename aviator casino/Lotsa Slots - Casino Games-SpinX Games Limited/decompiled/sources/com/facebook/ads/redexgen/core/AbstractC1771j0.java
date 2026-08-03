package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1771j0 implements com.facebook.ads.redexgen.core.WC {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final com.facebook.ads.redexgen.core.N6 A0F = null;
    public static final com.facebook.ads.redexgen.core.WD A0G = null;
    public static final android.os.Handler A0H;
    public static final java.lang.String A0I;
    public com.facebook.ads.redexgen.core.N1 A00;
    public com.facebook.ads.redexgen.core.N1 A01;
    public com.facebook.ads.redexgen.core.C1067Tw A04;
    public com.facebook.ads.redexgen.core.WA A05;
    public com.facebook.ads.redexgen.core.WD A06;
    public com.facebook.ads.redexgen.core.N2 A07;
    public final com.facebook.ads.redexgen.core.O7 A08;
    public final com.facebook.ads.redexgen.core.VA A09;
    public final com.facebook.ads.redexgen.core.N6 A0A;
    public final com.facebook.ads.redexgen.core.C1636gi A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public java.lang.String A02 = null;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 33, 37, com.google.common.base.Ascii.SYN, 35, -47, com.google.common.base.Ascii.SUB, 36, -47, com.google.common.base.Ascii.US, 38, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, -47, -39, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, -47, com.google.common.base.Ascii.US, 32, 37, -47, com.google.common.base.Ascii.GS, 32, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, com.google.common.base.Ascii.FF, -67, 10, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 2, -67, -2, 1, -67, 0, -2, com.google.common.base.Ascii.VT, 1, 6, 1, -2, 17, 2, com.google.common.base.Ascii.DLE, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, 63, 66, -2, 63, 74, 80, 67, 63, 66, 87, -2, 81, 82, 63, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, com.google.common.base.Ascii.FS, 17, 32, 39, com.google.common.base.Ascii.RS, 34, 19, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, 60, 69, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 73, 70, 69, 68, 60, 69, 75, -9, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 53, 44, 48, 60, 59, 51, 54, 52, com.google.common.base.Ascii.NAK, 33, com.google.common.base.Ascii.DC4, 32, 36, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, 40, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, 44, 33, 37, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ETB, 37, 43, 17, 4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC4, 4, com.google.common.base.Ascii.DC2, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(com.facebook.ads.redexgen.core.N1 n1, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu, com.facebook.ads.redexgen.core.O8 o8);

    static {
        A08();
        com.facebook.ads.redexgen.core.YD.A02();
        A0I = com.facebook.ads.redexgen.core.AbstractC1771j0.class.getSimpleName();
        A0H = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public AbstractC1771j0(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O7 o7) {
        this.A0B = c1636gi;
        this.A08 = o7;
        if (A0G != null) {
            this.A06 = A0G;
        } else {
            this.A06 = new com.facebook.ads.redexgen.core.WD(this.A0B);
        }
        this.A06.A0R(this);
        if (A0F != null) {
            this.A0A = A0F;
        } else {
            this.A0A = new com.facebook.ads.redexgen.core.N6();
        }
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c1636gi.A0A();
        this.A0B.A0F().A5e();
    }

    private void A09(com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.facebook.ads.internal.dynamicloading.FlashPreferences.getSharedPreferences(this.A0B);
        if (c1067Tw.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c1067Tw.A0C()).putLong(A07(342, 16, 54), java.lang.System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        this.A0B.A0F().AJS(c1067Tw.A0H());
    }

    private void A0B(com.facebook.ads.redexgen.core.RG rg) {
        com.facebook.ads.redexgen.core.C1067Tw placement = rg.A00();
        if (placement == null || placement.A05() == null) {
            java.lang.String A07 = A07(291, 29, 53);
            com.facebook.ads.redexgen.core.C1108Vm error = new com.facebook.ads.redexgen.core.C1108Vm(com.facebook.ads.internal.protocol.AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0F().A5g(error.A03().getErrorCode(), A07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        com.facebook.ads.redexgen.core.C1067Tw c1067Tw = this.A04;
        org.json.JSONObject A0E2 = c1067Tw.A0E();
        java.lang.String A072 = A07(195, 3, 13);
        if (A0E2 == null) {
            com.facebook.ads.redexgen.core.C1065Tu A04 = c1067Tw.A04();
            if (!A0F(c1067Tw, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().ABC(A072, com.facebook.ads.redexgen.core.AbstractC1048Td.A0a, new com.facebook.ads.redexgen.core.C1049Te(A07(81, 26, 5), A04.A02()));
                ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, c1067Tw, A04, new com.facebook.ads.redexgen.core.O8(A04.A04(), c1067Tw.A05(), this.A08.A0A, c1067Tw.A05().A0C()));
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.facebook.ads.redexgen.core.C1065Tu A042 = c1067Tw.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(c1067Tw, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0E(A042)) {
                    arrayList.add(A042);
                }
                A042 = c1067Tw.A04();
            } while (A042 != null);
            com.facebook.ads.redexgen.core.N1 n1 = this.A00;
            java.lang.String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (n1 == null) {
                this.A0B.A08().ABC(A072, com.facebook.ads.redexgen.core.AbstractC1048Td.A0a, new com.facebook.ads.redexgen.core.C1049Te(A07(56, 25, 40), ((com.facebook.ads.redexgen.core.C1065Tu) arrayList.get(0)).A02()));
                ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AKL()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((com.facebook.ads.redexgen.core.C1065Tu) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), c1067Tw.A0E());
                    A0R(this.A00, c1067Tw, A042, new com.facebook.ads.redexgen.core.O8(jSONObject, c1067Tw.A05(), this.A08.A0A, c1067Tw.A05().A0C()));
                    z = true;
                }
            } catch (java.lang.Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    com.facebook.ads.redexgen.core.C1108Vm A01 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5g(A01.A03().getErrorCode(), A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(A01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().ABC(A072, com.facebook.ads.redexgen.core.AbstractC1048Td.A0a, new com.facebook.ads.redexgen.core.C1049Te(A07(22, 34, 82), ((com.facebook.ads.redexgen.core.C1065Tu) arrayList.get(0)).A02()));
                    ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                    return;
                }
                com.facebook.ads.redexgen.core.C1065Tu c1065Tu = (com.facebook.ads.redexgen.core.C1065Tu) arrayList.get(0);
                A0R(this.A00, c1067Tw, c1065Tu, new com.facebook.ads.redexgen.core.O8(c1065Tu.A04(), c1067Tw.A05(), this.A08.A0A, c1067Tw.A05().A0C()));
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType) {
        this.A0B.A0F().A5h(str != null);
        this.A03 = java.lang.System.currentTimeMillis();
        try {
            com.facebook.ads.redexgen.core.C1115Vu bidPayload = new com.facebook.ads.redexgen.core.C1115Vu(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (com.facebook.ads.redexgen.core.C1109Vn e) {
            ADp(com.facebook.ads.redexgen.core.C1108Vm.A02(e));
        }
    }

    private void A0D(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            com.facebook.ads.redexgen.core.N8.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(com.facebook.ads.redexgen.core.C1065Tu c1065Tu) {
        return (c1065Tu == null || c1065Tu.A04() == null) ? false : true;
    }

    private boolean A0F(com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu) {
        java.lang.String A07 = A07(0, 0, 103);
        if (c1065Tu == null) {
            com.facebook.ads.redexgen.core.C1108Vm A01 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, A07);
            this.A0B.A0F().A5g(A01.A03().getErrorCode(), A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(A01);
            }
            return false;
        }
        java.lang.String A02 = c1065Tu.A02();
        com.facebook.ads.redexgen.core.N1 A00 = this.A0A.A00(this.A0B, c1067Tw.A05().A0D());
        if (A00 == null) {
            this.A0B.A08().ABC(A07(195, 3, 13), com.facebook.ads.redexgen.core.AbstractC1048Td.A0a, new com.facebook.ads.redexgen.core.C1049Te(A07(0, 22, 38), A02));
            ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(A00.A8k())) {
            com.facebook.ads.redexgen.core.C1108Vm A012 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0F().A5g(A012.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.N2 n2 = this.A07;
                if (A0E[0].length() != 32) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                n2.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        org.json.JSONObject A04 = c1065Tu.A04();
        if (A04 != null) {
            java.lang.String optString = A04.optString(A07(332, 10, 64));
            this.A0B.A0F().AJk(optString);
            this.A0B.A0D(optString);
            com.facebook.ads.redexgen.core.C1632ge A002 = com.facebook.ads.redexgen.core.T7.A00();
            if (A002 != null) {
                A002.A0D(optString);
            }
            org.json.JSONObject dataObject = A04.optJSONObject(A07(274, 17, 80));
            A0D(dataObject);
            if (this.A05 == null) {
                java.lang.String A072 = A07(242, 20, 120);
                com.facebook.ads.redexgen.core.C1108Vm A013 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, A072);
                this.A0B.A0F().A5g(A013.A03().getErrorCode(), A072);
                if (this.A07 != null) {
                    this.A07.A0G(A013);
                }
                return false;
            }
            return true;
        }
        java.lang.String A073 = A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 18, 32);
        com.facebook.ads.redexgen.core.C1108Vm A014 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, A073);
        this.A0B.A0F().A5g(A014.A03().getErrorCode(), A073);
        if (this.A07 != null) {
            this.A07.A0G(A014);
        }
        return false;
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        java.lang.String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final android.os.Handler A0H() {
        return A0H;
    }

    public com.facebook.ads.redexgen.core.NQ A0I() {
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.N1 n1 = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((com.facebook.ads.redexgen.core.AbstractC1805jh) n1).A0I();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((com.facebook.ads.redexgen.core.AbstractC1805jh) n1).A0I();
        }
        java.lang.String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final com.facebook.ads.redexgen.core.C1068Tx A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1v(this.A0B)) {
            return;
        }
        com.facebook.ads.redexgen.core.N1 n1 = this.A01;
        java.lang.String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (n1 != null) {
            com.facebook.ads.redexgen.core.C1132Wl.A00(this.A0B).A0D(this.A01.A8k().toString(), this.A01.A7O());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        java.lang.String A7O;
        this.A0B.A0F().A3R(com.facebook.ads.redexgen.core.Y1.A01(this.A03));
        if (this.A01 == null || (A7O = this.A01.A7O()) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String A05 = com.facebook.ads.redexgen.core.Y1.A05(this.A03);
        java.lang.String clientToken = A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 12, 89);
        hashMap.put(clientToken, A05);
        new com.facebook.ads.redexgen.core.VI(A7O, this.A09).A04(com.facebook.ads.redexgen.core.VH.A08, hashMap);
    }

    public final void A0M() {
        com.facebook.ads.redexgen.core.N1 n1 = this.A01;
        java.lang.String A07 = A07(195, 3, 13);
        if (n1 == null) {
            java.lang.String A072 = A07(107, 26, 102);
            this.A0B.A08().ABC(A07, com.facebook.ads.redexgen.core.AbstractC1048Td.A0Q, new com.facebook.ads.redexgen.core.C1049Te(A072));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5g(adErrorType.getErrorCode(), A072);
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.N2 n2 = this.A07;
                java.lang.String errorMessage = adErrorType.getDefaultErrorMessage();
                n2.A0G(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5j();
            return;
        }
        if (this.A0C) {
            java.lang.String A073 = A07(174, 18, 127);
            this.A0B.A08().ABC(A07, com.facebook.ads.redexgen.core.AbstractC1048Td.A0M, new com.facebook.ads.redexgen.core.C1049Te(A073));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5g(adErrorType2.getErrorCode(), A073);
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.N2 n22 = this.A07;
                java.lang.String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                n22.A0G(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5i();
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.A01.A7O())) {
            this.A09.AC0(this.A01.A7O());
        }
        this.A0B.A0F().A5k();
        this.A0C = true;
        A0P();
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            com.facebook.ads.redexgen.core.N8.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(com.facebook.ads.redexgen.core.N1 n1) {
        if (n1 != null) {
            n1.onDestroy();
        }
    }

    public final void A0S(com.facebook.ads.redexgen.core.N2 n2) {
        this.A07 = n2;
    }

    public final void A0T(com.facebook.ads.redexgen.core.O8 o8) {
        A0V(o8.A03().optString(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 2, 12)));
    }

    public void A0U(java.lang.String str) {
        A0C(str, null);
    }

    public final void A0V(java.lang.String str) {
        this.A0B.A0F().A5d();
        if (!android.text.TextUtils.isEmpty(str)) {
            new com.facebook.ads.redexgen.core.VI(str, this.A09).A04(com.facebook.ads.redexgen.core.VH.A04, null);
        }
    }

    public final void A0W(java.lang.String str) {
        A0U(str);
    }

    public final void A0X(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5l();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final synchronized void ADp(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        A0H().post(new com.facebook.ads.redexgen.core.C1772j1(this, c1108Vm));
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final synchronized void AG7(com.facebook.ads.redexgen.core.RG rg) {
        try {
            A0B(rg);
        } catch (java.lang.Exception e) {
            this.A0B.A08().ABC(A07(195, 3, 13), com.facebook.ads.redexgen.core.AbstractC1048Td.A0T, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
    }
}
