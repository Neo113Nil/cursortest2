package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1807jj extends com.facebook.ads.redexgen.core.N3 {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"naGFqnPrPSZVlF1tbzSnGlWDlhg8Bx7N", "RM0IQcINTb6QF6bWU7ymbn4JjJrL5iWr", "XJIeYwVEWh3ByQbCoBQqWdEefl5R9e76", "6T6YAwPN0KvqZkFL7aTQgfqW9EwPqPWp", "VPS1QaAIDZymsBiqXIOVWbiLhGEbna9V", "CymBNsc0cxG6yTnU49Ac6tOVI4DKwjx7", "uBQQQ5YEdlglu1zaQURE0tehHklX5mTJ", "q6iumcfL9EATxxGEWvppmeo1ZOnHOvxd"};
    public android.view.View A00;
    public android.view.View A01;
    public com.facebook.ads.NativeAdLayout A02;
    public com.facebook.ads.redexgen.core.NE A03;
    public com.facebook.ads.redexgen.core.NF A04;
    public com.facebook.ads.redexgen.core.EnumC1101Ve A05;
    public java.lang.String A06;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1683hT> A07;
    public java.util.List<android.view.View> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final com.facebook.ads.redexgen.core.C1818ju A0F;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0G = new byte[]{Byte.MAX_VALUE, -88, -92, -93, 85, -102, -83, -104, -102, -91, -87, -98, -92, -93, -52, -38, -31, -44, -50, -54, -40, -33, -46, -36, -126, -112, -105, -108, -118, 126, -111, -112, -112, -117, -118, -98, -89, -100, -82, -82, -33, -24, -27, -33, -25, -35, -34, -24, -31, -104, -85, -89, -91, -108, -110, -101, -100, -95, -89, -90, -103, -108, -125, -121, 123, -127, Byte.MAX_VALUE, -119, -122, -112, -111, -82, -90, -91, -86, -94, -73, -86, -90, -72, -79, -92, -81, -80, -92, -69, -70, -17, -30, -19, -18, -22, -17, -8, -1, -14, -2, -7, -45, -58, -46, -36, -71, -84, -67, -84, -67, 2, -10, com.google.common.base.Ascii.VT, -3, 10, -38, -44, -33, -38, -43, -30, -26, -27, -18, -42, -43, -34, -55, -40, -56, -50, -61, -10, -7, -16, -18, -16, -11, -63, -61, -74, -76, -78, -76, -71, -74, -80, -66, -74, -75, -70, -78, -115, -125, -108, Byte.MAX_VALUE, -90, -95, -108, -93, -90, -101, -94, -89, -28, -43, -24, -28, -18, -13, -22, -33, -85, -103, -84, -88, -35, -42, -45, -42, -41, -33, -42, -99, -112, -116, -98, -13, -26, -30, -12, -28, -17, -20, -14, -19, -78, -97, 113, 92, -101, 99, 87, -82, 113, 92, -101, -76, -51, -54, -116, 119, -74, 126, 114, -53, -116, 119, -74, -49};
    }

    static {
        A05();
    }

    public C1807jj(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.N4 n4, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        super(c1636gi, n4, c1581fp);
        this.A03 = com.facebook.ads.redexgen.core.NE.A03;
        this.A04 = null;
        this.A0F = c1818ju;
    }

    private java.lang.String A02(android.view.View view) {
        try {
            org.json.JSONObject json = A04(view);
            return json.toString();
        } catch (org.json.JSONException unused) {
            return A01(0, 14, 32);
        }
    }

    private java.lang.String A03(android.view.View view) {
        int width = view.getWidth();
        java.lang.String A01 = A01(0, 0, 95);
        if (width <= 0 || view.getHeight() <= 0) {
            return A01;
        }
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new android.graphics.Canvas(createBitmap));
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, this.A0F.A0A(), byteArrayOutputStream);
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.lang.Exception unused) {
            return A01;
        }
    }

    private org.json.JSONObject A04(android.view.View view) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt(A01(60, 2, 27), java.lang.Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(35, 5, 38), view.getClass());
        boolean z = false;
        jSONObject.putOpt(A01(129, 6, 114), java.lang.String.format(java.util.Locale.US, A01(205, 12, 61), java.lang.Integer.valueOf(view.getTop()), java.lang.Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(149, 4, 5), java.lang.String.format(java.util.Locale.US, A01(193, 12, 34), java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getWidth())));
        if (this.A08 != null && this.A08.contains(view)) {
            z = true;
        }
        jSONObject.putOpt(A01(40, 9, 103), java.lang.Boolean.valueOf(z));
        java.lang.String A01 = A01(173, 7, 83);
        if (view instanceof android.widget.Button) {
            A01 = A01(29, 6, 7);
        } else if (view instanceof android.widget.TextView) {
            A01 = A01(161, 4, 91);
        } else if (view instanceof android.widget.ImageView) {
            A01 = A01(62, 5, 5);
        } else {
            boolean z2 = view instanceof com.facebook.ads.MediaView;
            if (A0H[5].charAt(12) != 'y') {
                throw new java.lang.RuntimeException();
            }
            A0H[4] = "bylXNVHmRehwPu5eFX29358jXG6bP6wL";
            if (z2) {
                A01 = A01(71, 9, 44);
            } else if (view instanceof android.view.ViewGroup) {
                A01 = A01(184, 9, 104);
            }
        }
        jSONObject.putOpt(A01(165, 4, 101), A01);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            org.json.JSONArray list = new org.json.JSONArray();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                org.json.JSONObject data = A04(viewGroup.getChildAt(i));
                list.put(data);
            }
            jSONObject.putOpt(A01(67, 4, 8), list);
        }
        return jSONObject;
    }

    private void A06(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A07 != null && this.A07.get() != null) {
            com.facebook.ads.redexgen.core.C1683hT c1683hT = this.A07.get();
            if (c1683hT.A0F()) {
                map.put(A01(14, 5, 86), java.lang.Boolean.TRUE.toString());
            }
            if (c1683hT.A0G()) {
                java.lang.String bool = java.lang.Boolean.TRUE.toString();
                if (A0H[2].charAt(5) == '8') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0H;
                strArr[3] = "GeaOzgSwE0B4RbQuyOnyR54BUk9OPQWk";
                strArr[7] = "6p8n9jXNaDOiZOly6vqLiSGdWpkNyQr0";
                map.put(A01(19, 5, 84), bool);
            }
            if (c1683hT.A0H()) {
                map.put(A01(24, 5, 12), java.lang.Boolean.TRUE.toString());
            }
        }
    }

    private void A07(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A02 != null && (this.A02.getNativeAdLayoutApi() instanceof com.facebook.ads.redexgen.core.C1665hB)) {
            com.facebook.ads.redexgen.core.C1665hB c1665hB = (com.facebook.ads.redexgen.core.C1665hB) this.A02.getNativeAdLayoutApi();
            if (c1665hB.A07()) {
                map.put(A01(87, 7, 108), java.lang.Boolean.TRUE.toString());
            }
            boolean A06 = c1665hB.A06();
            if (A0H[2].charAt(5) == '8') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0H;
            strArr[6] = "xEcLApnGSHOQdN2Hz4ZghwgYHUh65NKO";
            strArr[1] = "p79k2dIgP5w5SbVKwTjPD6VDhwKg5iET";
            if (A06) {
                map.put(A01(80, 7, 46), java.lang.Boolean.TRUE.toString());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A0F == null) {
            return;
        }
        if (this.A05 != null) {
            map.put(A01(126, 3, 69), java.lang.String.valueOf(this.A05.A05()));
        }
        if (this.A09) {
            map.put(A01(112, 3, 87), java.lang.Boolean.TRUE.toString());
        }
        if (this.A0D) {
            map.put(A01(118, 3, 99), java.lang.Boolean.TRUE.toString());
        }
        if (this.A0A) {
            map.put(A01(121, 5, 83), java.lang.Boolean.TRUE.toString());
        }
        if (this.A00 != null && this.A0F.A0T()) {
            java.lang.String A02 = A02(this.A00);
            java.lang.String A01 = A01(180, 4, 18);
            if (A0H[5].charAt(12) != 'y') {
                throw new java.lang.RuntimeException();
            }
            A0H[0] = "0nsTrvyBVFn5JiHcx4XaPHfYKfpd5PBN";
            map.put(A01, A02);
        }
        if (this.A00 != null && this.A0F.A0U()) {
            map.put(A01(153, 8, 30), A03(this.A00));
        }
        if (this.A0C) {
            map.put(A01(115, 3, 87), java.lang.Boolean.TRUE.toString());
        }
        if (this.A03 != null) {
            map.put(A01(135, 14, 60), this.A03.toString());
        }
        if (this.A0B) {
            map.put(A01(169, 4, 33), java.lang.Boolean.TRUE.toString());
        }
        if (this.A01 != null) {
            map.put(A01(98, 4, 80), java.lang.String.valueOf((int) (this.A01.getWidth() / com.facebook.ads.redexgen.core.XX.A02)));
            map.put(A01(94, 4, 124), java.lang.String.valueOf((int) (this.A01.getHeight() / com.facebook.ads.redexgen.core.XX.A02)));
        }
        if (this.A04 != null) {
            map.put(A01(102, 5, 54), this.A04.toString());
        }
        if (this.A06 != null) {
            map.put(A01(49, 11, 30), this.A06);
        }
        if (this.A0E) {
            map.put(A01(107, 5, 127), java.lang.Boolean.TRUE.toString());
        }
        A07(map);
        A06(map);
        this.A0F.A0O(map);
    }

    public final void A09(android.view.View view) {
        this.A01 = view;
    }

    public final void A0A(android.view.View view) {
        this.A00 = view;
    }

    public final void A0B(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        this.A02 = nativeAdLayout;
    }

    public final void A0C(com.facebook.ads.redexgen.core.NE ne) {
        this.A03 = ne;
    }

    public final void A0D(com.facebook.ads.redexgen.core.NF nf) {
        this.A04 = nf;
    }

    public final void A0E(com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve) {
        this.A05 = enumC1101Ve;
    }

    public final void A0F(java.lang.String str) {
        this.A06 = str;
    }

    public final void A0G(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1683hT> weakReference) {
        this.A07 = weakReference;
    }

    public final void A0H(java.util.List<android.view.View> clickableViews) {
        this.A08 = clickableViews;
    }

    public final void A0I(boolean z) {
        this.A09 = z;
    }

    public final void A0J(boolean z) {
        this.A0A = z;
    }

    public final void A0K(boolean z) {
        this.A0B = z;
    }

    public final void A0L(boolean z) {
        this.A0C = z;
    }

    public final void A0M(boolean z) {
        this.A0D = z;
    }

    public final void A0N(boolean z) {
        this.A0E = z;
    }
}
