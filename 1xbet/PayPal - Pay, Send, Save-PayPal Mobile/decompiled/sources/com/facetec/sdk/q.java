package com.facetec.sdk;

/* loaded from: classes8.dex */
final class q {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char n;
    private static char p;
    private static char[] q;
    private static char r;
    private static char s;
    private static long t;
    private static int u;
    private static int w;
    java.util.List<com.facetec.sdk.aa> b = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    java.util.List<java.lang.String> f3758a = new java.util.ArrayList();
    java.util.List<java.util.List<java.lang.Integer>> e = new java.util.ArrayList();
    private java.util.List<java.util.List<com.facetec.sdk.aa>> h = new java.util.ArrayList();
    private java.util.List<java.util.List<com.facetec.sdk.aa>> m = new java.util.ArrayList();
    java.util.List<java.util.List<java.util.List<com.facetec.sdk.aa>>> d = new java.util.ArrayList();
    java.util.List<java.util.List<java.util.List<com.facetec.sdk.aa>>> c = new java.util.ArrayList();
    java.util.List<java.util.List<java.util.List<com.facetec.sdk.aa>>> g = new java.util.ArrayList();
    private com.facetec.sdk.x k = com.facetec.sdk.x.NOT_RAN;

    /* renamed from: o, reason: collision with root package name */
    private com.facetec.sdk.x f3759o = com.facetec.sdk.x.NOT_RAN;
    com.facetec.sdk.x i = com.facetec.sdk.x.NOT_RAN;
    com.facetec.sdk.x j = com.facetec.sdk.x.NOT_RAN;
    com.facetec.sdk.x f = com.facetec.sdk.x.NOT_RAN;
    private com.facetec.sdk.s l = new com.facetec.sdk.s();

    private static java.lang.String $$c(short s2, int i, int i2) {
        int i3 = 3 - (i * 4);
        int i4 = 112 - s2;
        int i5 = i2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i4 = (-bArr[i7]) + i4;
            i3 = i7;
            i6 = i8;
        }
    }

    static void init$0() {
        $$a = new byte[]{120, -93, 60, 33};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    q() {
    }

    final org.json.JSONObject b() {
        java.util.List<com.facetec.sdk.aa> list = this.b;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int i = 0;
        while (i < list.size()) {
            u = (w + 77) % 128;
            jSONArray.put(list.get(i).d());
            i++;
            u = (w + 91) % 128;
        }
        org.json.JSONArray b = com.facetec.sdk.ad.b(this.h);
        org.json.JSONArray b2 = com.facetec.sdk.ad.b(this.m);
        org.json.JSONArray e = com.facetec.sdk.ad.e(this.d);
        org.json.JSONArray e2 = com.facetec.sdk.ad.e(this.c);
        org.json.JSONArray e3 = com.facetec.sdk.ad.e(this.g);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            v("ດ仟샭齝", android.graphics.Color.argb(0, 0, 0, 0) + 3, objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), jSONArray.toString());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            v("⓳䐃샭齝", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4, objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), this.f3758a.toString());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            x((android.view.ViewConfiguration.getTapTimeout() >> 16) + 2, (char) android.widget.ExpandableListView.getPackedPositionType(0L), android.view.KeyEvent.normalizeMetaState(0), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), this.e.toString());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            v("豔Ȟꗁ㾉샭齝", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 5, objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), b.toString());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            v("闆㦖ꗁ㾉샭齝", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, objArr5);
            jSONObject.put(((java.lang.String) objArr5[0]).intern(), b2.toString());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            v("ࡲ簸ꥑख嗎⻆", 4 - android.os.Process.getGidForName(""), objArr6);
            jSONObject.put(((java.lang.String) objArr6[0]).intern(), e.toString());
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            v("ࡲ簸ꥑख횯\ueecd", 5 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr7);
            jSONObject.put(((java.lang.String) objArr7[0]).intern(), e2.toString());
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            x(android.text.TextUtils.indexOf("", "", 0, 0) + 5, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2 - android.graphics.Color.blue(0), objArr8);
            jSONObject.put(((java.lang.String) objArr8[0]).intern(), e3.toString());
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            x((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 5, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 7 - (android.os.Process.myTid() >> 22), objArr9);
            jSONObject.put(((java.lang.String) objArr9[0]).intern(), java.lang.String.valueOf(this.k.f3773a));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            x(android.text.TextUtils.indexOf("", "") + 5, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 12 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr10);
            jSONObject.put(((java.lang.String) objArr10[0]).intern(), java.lang.String.valueOf(this.f3759o.f3773a));
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            v("ࡲ簸䞍ヵ嗎⻆", android.widget.ExpandableListView.getPackedPositionChild(0L) + 6, objArr11);
            jSONObject.put(((java.lang.String) objArr11[0]).intern(), java.lang.String.valueOf(this.i.f3773a));
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            x((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, (char) (37307 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 17 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr12);
            jSONObject.put(((java.lang.String) objArr12[0]).intern(), java.lang.String.valueOf(this.j.f3773a));
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            v("ࡲ簸䞍ヵ듫\ueea7", 4 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr13);
            jSONObject.put(((java.lang.String) objArr13[0]).intern(), java.lang.String.valueOf(this.f.f3773a));
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            v("뵲\u0cff챾昽에ꩤ", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, objArr14);
            jSONObject.put(((java.lang.String) objArr14[0]).intern(), new org.json.JSONObject().toString());
        } catch (org.json.JSONException unused) {
        }
        int i2 = u + 53;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObject;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void x(int i, char c, int i2, java.lang.Object[] objArr) {
        long j;
        java.lang.Object obj;
        java.lang.Throwable cause;
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i];
        hhVar.e = 0;
        while (true) {
            j = 0;
            obj = null;
            if (hhVar.e >= i) {
                break;
            }
            $11 = ($10 + 107) % 128;
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(q[i2 + i3])};
                java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                if (d == null) {
                    byte b = (byte) 0;
                    d = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45150), 2150 - android.graphics.Color.red(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, 1926116241, false, $$c((byte) 7, b, b), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(t), java.lang.Integer.valueOf(c)};
                java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.graphics.Color.blue(0) + 1834, 23 - android.graphics.ImageFormat.getBitsPerPixel(0), -1880730373, false, $$c((byte) 6, b2, b2), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                if (d3 == null) {
                    byte b3 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) android.view.View.combineMeasuredStates(0, 0), 2341 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), -1839099840, false, $$c((byte) 10, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        hhVar.e = 0;
        while (hhVar.e < i) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr5 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) android.graphics.Color.argb(0, 0, 0, 0), 2340 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)) + 23, -1839099840, false, $$c((byte) 10, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr6 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b5 = (byte) 0;
                d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2341 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 24, -1839099840, false, $$c((byte) 10, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr6);
            j = 0;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void v(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.Object obj = null;
        if (str != null) {
            int i3 = $10 + 65;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                obj.hashCode();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr3 = new char[cArr2.length];
        hoVar.b = 0;
        char[] cArr4 = new char[2];
        $11 = ($10 + 87) % 128;
        while (hoVar.b < cArr2.length) {
            int i4 = $10 + 17;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr4[1] = cArr2[hoVar.b];
                cArr4[1] = cArr2[hoVar.b % 1];
                i2 = 1;
            } else {
                cArr4[0] = cArr2[hoVar.b];
                cArr4[1] = cArr2[hoVar.b + 1];
                i2 = 0;
            }
            int i5 = 58224;
            while (i2 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (r ^ 2174069992062419062L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(p)};
                    java.lang.Object d = com.facetec.sdk.al.d(1497828241);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.text.TextUtils.getOffsetAfter("", 0), 211 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (n ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(s)};
                    int i6 = charValue + i5;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777427, 23 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i2++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[hoVar.b] = cArr4[0];
            cArr3[hoVar.b + 1] = cArr4[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d3 = com.facetec.sdk.al.d(-2113314280);
            if (d3 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                d3 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31540), 1912 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23, 635836640, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        w = 0;
        u = 1;
        n = (char) 46068;
        s = (char) 39120;
        r = (char) 37235;
        p = (char) 33044;
        q = new char[]{27762, 62615, 27766, 62592, 23979, 42687, 3993, 27763, 62610, 23972, 42682, 4038, 27769, 62610, 23972, 42682, 4038, 64970, 25916, 52250, 14094, 40484};
        t = -9108671096523262730L;
    }
}
