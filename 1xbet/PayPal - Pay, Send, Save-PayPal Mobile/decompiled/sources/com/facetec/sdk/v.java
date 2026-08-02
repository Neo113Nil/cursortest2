package com.facetec.sdk;

/* loaded from: classes8.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    java.util.List<java.util.List<java.lang.Integer>> f3768a = new java.util.ArrayList();
    int c = 0;
    int d = 0;
    com.facetec.sdk.x b = com.facetec.sdk.x.NOT_RAN;
    com.facetec.sdk.x e = com.facetec.sdk.x.NOT_RAN;
    com.facetec.sdk.x h = com.facetec.sdk.x.NOT_RAN;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.v.e f3769a;
        public static final com.facetec.sdk.v.e b;
        public static final com.facetec.sdk.v.e c;
        public static final com.facetec.sdk.v.e d;
        public static final com.facetec.sdk.v.e e;
        private static final /* synthetic */ com.facetec.sdk.v.e[] f;
        private static char g;
        private static char h;
        public static final com.facetec.sdk.v.e j;
        private static int k;
        private static int l;
        private static char m;
        private static int n;

        /* renamed from: o, reason: collision with root package name */
        private static char f3770o;
        private static int r;
        final java.lang.String i;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(short s, int i, int i2) {
            int i3;
            int i4;
            int i5 = 1 - (s * 4);
            byte[] bArr = $$a;
            int i6 = i2 + 4;
            int i7 = 112 - (i * 2);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i6;
                int i9 = 0;
                i7 += i6;
                i6 = i8;
                i3 = i9;
                int i10 = i6 + 1;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                    return new java.lang.String(bArr2, 0);
                }
                i8 = i10;
                i6 = bArr[i10];
                i9 = i4;
                i7 += i6;
                i6 = i8;
                i3 = i9;
                int i102 = i6 + 1;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                int i1022 = i6 + 1;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{124, 16, -27, -110};
            $$b = 135;
        }

        private static /* synthetic */ com.facetec.sdk.v.e[] d() {
            int i = n + 101;
            l = i % 128;
            if (i % 2 == 0) {
                return new com.facetec.sdk.v.e[]{b, e, c, f3769a, d, j};
            }
            com.facetec.sdk.v.e[] eVarArr = new com.facetec.sdk.v.e[51];
            eVarArr[1] = b;
            eVarArr[0] = e;
            eVarArr[3] = c;
            eVarArr[5] = f3769a;
            eVarArr[5] = d;
            eVarArr[4] = j;
            return eVarArr;
        }

        public static com.facetec.sdk.v.e valueOf(java.lang.String str) {
            int i = n + 69;
            l = i % 128;
            com.facetec.sdk.v.e eVar = (com.facetec.sdk.v.e) java.lang.Enum.valueOf(com.facetec.sdk.v.e.class, str);
            if (i % 2 == 0) {
                return eVar;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static com.facetec.sdk.v.e[] values() {
            int i = l + 27;
            n = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            com.facetec.sdk.v.e[] eVarArr = (com.facetec.sdk.v.e[]) f.clone();
            l = (n + 49) % 128;
            return eVarArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            k = 0;
            r = 1;
            l = 0;
            n = 1;
            a();
            java.lang.Object[] objArr = new java.lang.Object[1];
            p("ᛔ牐", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, objArr);
            b = new com.facetec.sdk.v.e("HASH_SET", 0, ((java.lang.String) objArr[0]).intern());
            e = new com.facetec.sdk.v.e("SIZE", 1, lib.android.paypal.com.magnessdk.g.n2);
            c = new com.facetec.sdk.v.e("SESSION_COUNT", 2, "sc");
            f3769a = new com.facetec.sdk.v.e("INTRA_SESSION_LOOP_DETECTION_LEVEL", 3, "l1");
            d = new com.facetec.sdk.v.e("INTRA_FACETEC_SESSION_LOOP_DETECTION_LEVEL", 4, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.FEATURE);
            j = new com.facetec.sdk.v.e("INTER_FACETEC_SESSION_LOOP_DETECTION_LEVEL", 5, "l3");
            f = d();
            int i = k + 41;
            r = i % 128;
            if (i % 2 == 0) {
                int i2 = 69 / 0;
            }
        }

        private e(java.lang.String str, int i, java.lang.String str2) {
            this.i = str2;
        }

        private static void p(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 113) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
            char[] cArr3 = new char[cArr2.length];
            hoVar.b = 0;
            char[] cArr4 = new char[2];
            while (hoVar.b < cArr2.length) {
                cArr4[0] = cArr2[hoVar.b];
                cArr4[1] = cArr2[hoVar.b + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    $11 = ($10 + 21) % 128;
                    char c2 = cArr4[1];
                    char c3 = cArr4[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (f3770o ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(m)};
                        int i4 = c3 + i2;
                        java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 211 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 24 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        cArr4[1] = charValue;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (g ^ 2174069992062419062L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(h)};
                        int i5 = charValue + i2;
                        java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 22 - android.view.MotionEvent.axisFromString(""), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                        i2 -= 40503;
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
                java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
                if (d4 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    d4 = com.facetec.sdk.al.c((char) (31541 - android.view.View.MeasureSpec.getSize(0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1913, 23 - android.view.View.getDefaultSize(0, 0), 635836640, false, $$c(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3, 0, i);
        }

        static void a() {
            g = (char) 1650;
            h = (char) 54693;
            f3770o = (char) 65362;
            m = (char) 58470;
        }
    }

    v() {
    }

    final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (com.facetec.sdk.v.e eVar : com.facetec.sdk.v.e.values()) {
                switch (com.facetec.sdk.v.AnonymousClass2.b[eVar.ordinal()]) {
                    case 1:
                        jSONObject.put(eVar.i, new org.json.JSONArray((java.util.Collection) this.f3768a));
                        break;
                    case 2:
                        jSONObject.put(eVar.i, this.c);
                        break;
                    case 3:
                        jSONObject.put(eVar.i, this.d);
                        break;
                    case 4:
                        jSONObject.put(eVar.i, this.b.f3773a);
                        break;
                    case 5:
                        jSONObject.put(eVar.i, this.e.f3773a);
                        break;
                    case 6:
                        jSONObject.put(eVar.i, this.h.f3773a);
                        break;
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: com.facetec.sdk.v$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.facetec.sdk.v.e.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.v.e.b.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.v.e.e.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.v.e.c.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.facetec.sdk.v.e.f3769a.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                b[com.facetec.sdk.v.e.d.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                b[com.facetec.sdk.v.e.j.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static com.facetec.sdk.v b(java.lang.String str) {
        com.facetec.sdk.v vVar = new com.facetec.sdk.v();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.facetec.sdk.v.e.b.i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(java.lang.Integer.valueOf(jSONArray2.getInt(i2)));
                }
                arrayList.add(arrayList2);
            }
            for (com.facetec.sdk.v.e eVar : com.facetec.sdk.v.e.values()) {
                switch (com.facetec.sdk.v.AnonymousClass2.b[eVar.ordinal()]) {
                    case 1:
                        vVar.f3768a = arrayList;
                        break;
                    case 2:
                        vVar.c = jSONObject.getInt(eVar.i);
                        break;
                    case 3:
                        vVar.d = jSONObject.getInt(eVar.i);
                        break;
                    case 4:
                        vVar.b = com.facetec.sdk.x.a(jSONObject.getInt(eVar.i));
                        break;
                    case 5:
                        vVar.e = com.facetec.sdk.x.a(jSONObject.getInt(eVar.i));
                        break;
                    case 6:
                        vVar.h = com.facetec.sdk.x.a(jSONObject.getInt(eVar.i));
                        break;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return vVar;
    }
}
