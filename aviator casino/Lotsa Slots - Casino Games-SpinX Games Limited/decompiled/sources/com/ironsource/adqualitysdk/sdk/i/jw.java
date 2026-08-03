package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jw {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.jw f2936;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.jw.e> f2937;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.jw.e> f2939 = new java.util.HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    private android.os.Handler f2938 = new android.os.Handler(android.os.Looper.getMainLooper());

    public enum e {
        f2949,
        f2946,
        f2947;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2943 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static long f2944 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2945 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2950;

        /* renamed from: ﾇ, reason: contains not printable characters */
        static void m8313() {
            f2950 = new char[]{'n', 52960, 40304, 5506, 56088, 34961, 48531, 29442, 3684, 49386, 37754, 26050, 'T', 52957, 40287, 27619, 14959, 2203, 55067, 42427, 29757, 17225, 4546, 57466, 44792, 32002, 19339, 6692, 59554, 64199, 13407, 26587, 37236, 49384, 61981, 11658, 24355, 36537, 47581, 60246, 6899, 21609, 34697, 45323, 57533, 4662, 19902, 31966, 44614, 55804, 2940};
            f2944 = 298594857175731855L;
        }

        public static com.ironsource.adqualitysdk.sdk.i.jw.e valueOf(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f2943 + 29;
            f2945 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.jw.e eVar = (com.ironsource.adqualitysdk.sdk.i.jw.e) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.jw.e.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f2943 + 107;
            f2945 = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.ironsource.adqualitysdk.sdk.i.jw.e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f2943 + 3;
            f2945 = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            com.ironsource.adqualitysdk.sdk.i.jw.e[] eVarArr = (com.ironsource.adqualitysdk.sdk.i.jw.e[]) values().clone();
            int i3 = f2945 + 101;
            f2943 = i3 % 128;
            if (i3 % 2 == 0) {
                return eVarArr;
            }
            super.hashCode();
            throw null;
        }

        static {
            m8313();
            int i = f2943 + 119;
            f2945 = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static com.ironsource.adqualitysdk.sdk.i.jw.e m8314(java.lang.String str) {
            int i = 2 % 2;
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            int i2 = f2943 + 53;
            f2945 = i2 % 128;
            int i3 = i2 % 2;
            int hashCode = str.hashCode();
            char c = 0;
            if (hashCode == 3642) {
                if (str.equals(m8315((char) (48609 - (android.os.Process.myTid() >> 22)), 6 - (android.os.Process.myTid() >> 22), 2 - android.text.TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i4 = f2943;
                    int i5 = i4 + 83;
                    f2945 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 15;
                    f2945 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 96921) {
                if (hashCode == 109261 && str.equals(m8315((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.MeasureSpec.getSize(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3).intern())) {
                    int i9 = f2945;
                    int i10 = i9 + 123;
                    f2943 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 115;
                    f2943 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = 65535;
            } else {
                if (str.equals(m8315((char) (5603 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3).intern())) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                return f2949;
            }
            if (c == 1) {
                return f2946;
            }
            if (c != 2) {
                return null;
            }
            return f2947;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m8315(char c, int i, int i2) {
            java.lang.String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
                char[] cArr = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2950[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2944)) ^ c);
                    com.ironsource.adqualitysdk.sdk.i.c.f1208++;
                }
                str = new java.lang.String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.jw m8305() {
        com.ironsource.adqualitysdk.sdk.i.jw jwVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.jw.class) {
            if (f2936 == null) {
                f2936 = new com.ironsource.adqualitysdk.sdk.i.jw();
            }
            jwVar = f2936;
        }
        return jwVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8312(final java.lang.String str, final com.ironsource.adqualitysdk.sdk.i.jw.e eVar) {
        this.f2938.post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                synchronized (com.ironsource.adqualitysdk.sdk.i.jw.this) {
                    com.ironsource.adqualitysdk.sdk.i.jw.this.f2939.put(str, eVar);
                }
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m8311(android.app.Activity activity) {
        return com.ironsource.adqualitysdk.sdk.i.jw.e.f2946 == m8308(activity);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m8310(android.app.Activity activity) {
        return com.ironsource.adqualitysdk.sdk.i.jw.e.f2947 == m8308(activity);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private synchronized com.ironsource.adqualitysdk.sdk.i.jw.e m8308(android.app.Activity activity) {
        if (activity != null) {
            java.lang.String name = activity.getClass().getName();
            if (m8306().containsKey(name)) {
                return m8306().get(name);
            }
            if (m8307().containsKey(name)) {
                return m8307().get(name);
            }
        }
        return com.ironsource.adqualitysdk.sdk.i.jw.e.m8314(com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6048());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.jw.e> m8306() {
        return new java.util.HashMap(this.f2939);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.jw.e> m8307() {
        if (this.f2937 == null) {
            this.f2937 = new java.util.HashMap();
            org.json.JSONObject mo6045 = com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6045();
            if (mo6045 != null) {
                this.f2937 = com.ironsource.adqualitysdk.sdk.i.kj.m8421(mo6045, new com.ironsource.adqualitysdk.sdk.i.kj.a<com.ironsource.adqualitysdk.sdk.i.jw.e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                    /* renamed from: ﻛ */
                    public final /* synthetic */ com.ironsource.adqualitysdk.sdk.i.jw.e mo6106(org.json.JSONObject jSONObject, java.lang.String str) {
                        return com.ironsource.adqualitysdk.sdk.i.jw.e.m8314(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f2937;
    }
}
