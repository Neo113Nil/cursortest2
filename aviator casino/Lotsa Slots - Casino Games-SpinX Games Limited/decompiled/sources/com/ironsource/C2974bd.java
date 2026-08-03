package com.ironsource;

/* renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2974bd {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f6159a = "com.google.market";
    public static final java.lang.String b = "com.android.vending";
    public static final java.lang.String c = "isInstalled";
    private static final java.lang.String d = "bd";
    private static final java.util.ArrayList<java.lang.String> e = new com.ironsource.C2974bd.a();

    /* renamed from: com.ironsource.bd$a */
    class a extends java.util.ArrayList<java.lang.String> {
        a() {
            add("com.android.vending");
            add(com.ironsource.C2974bd.f6159a);
        }
    }

    /* renamed from: com.ironsource.bd$b */
    class b extends org.json.JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6160a;

        b(boolean z) throws org.json.JSONException {
            this.f6160a = z;
            put("isInstalled", z);
        }
    }

    /* renamed from: com.ironsource.bd$c */
    private enum c {
        GOOGLE_PLAY(2, new java.lang.String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new java.lang.String[]{com.ironsource.C2974bd.f6159a}),
        SAMSUNG(5, new java.lang.String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new java.lang.String[]{"com.amazon.venezia"}),
        HUAWEI(7, new java.lang.String[]{"com.huawei.appmarket"});

        private static final java.util.Map<java.lang.String, com.ironsource.C2974bd.c> h = new java.util.HashMap();

        /* renamed from: a, reason: collision with root package name */
        private final int f6161a;
        private final java.lang.String[] b;

        static {
            for (com.ironsource.C2974bd.c cVar : values()) {
                for (java.lang.String str : cVar.d()) {
                    h.put(str, cVar);
                }
            }
        }

        c(int i2, java.lang.String[] strArr) {
            this.f6161a = i2;
            this.b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.ArrayList<java.lang.String> b() {
            return new java.util.ArrayList<>(h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f6161a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String[] d() {
            return this.b;
        }
    }

    private static org.json.JSONObject a(android.content.Context context) {
        return a(context, e);
    }

    public static java.lang.String b(android.content.Context context) {
        java.util.Iterator<java.lang.String> it = e.iterator();
        while (it.hasNext()) {
            java.lang.String a2 = a(context, it.next());
            if (!android.text.TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return "";
    }

    private static java.util.ArrayList<java.lang.String> c(android.content.Context context) {
        java.util.List<android.content.pm.ApplicationInfo> I = com.ironsource.Jb.Y().a().I(context);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (android.content.pm.ApplicationInfo applicationInfo : I) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(java.util.Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static java.lang.Integer d(android.content.Context context) {
        org.json.JSONObject a2 = a(context, (java.util.ArrayList<java.lang.String>) com.ironsource.C2974bd.c.b());
        int i = 0;
        for (com.ironsource.C2974bd.c cVar : com.ironsource.C2974bd.c.values()) {
            java.lang.String[] d2 = cVar.d();
            int length = d2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                org.json.JSONObject optJSONObject = a2.optJSONObject(d2[i2]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i = (int) (i + java.lang.Math.pow(2.0d, r5.c() - 1));
                    break;
                }
                i2++;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    public static boolean e(android.content.Context context) {
        org.json.JSONObject a2 = a(context);
        java.util.Iterator<java.lang.String> keys = a2.keys();
        while (keys.hasNext()) {
            org.json.JSONObject optJSONObject = a2.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static org.json.JSONObject a(android.content.Context context, java.util.ArrayList<java.lang.String> arrayList) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.ArrayList<java.lang.String> c2 = c(context);
            java.util.Iterator<java.lang.String> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                jSONObject.put(next, a(c2.contains(next.trim().toLowerCase(java.util.Locale.getDefault()))));
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            android.util.Log.d(d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static org.json.JSONObject a(boolean z) throws org.json.JSONException {
        return new com.ironsource.C2974bd.b(z);
    }
}
