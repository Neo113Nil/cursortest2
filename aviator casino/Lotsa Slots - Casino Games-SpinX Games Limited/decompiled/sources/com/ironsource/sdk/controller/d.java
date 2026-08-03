package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
class d {
    static final java.lang.String h = "controllerSourceData";
    private static final java.lang.String i = "next_";
    private static final java.lang.String j = "fallback_";
    private static final java.lang.String k = "controllerSourceCode";

    /* renamed from: a, reason: collision with root package name */
    private long f6607a;
    private int b;
    private com.ironsource.sdk.controller.d.c c;
    private com.ironsource.sdk.controller.d.EnumC0161d d = com.ironsource.sdk.controller.d.EnumC0161d.NONE;
    private java.lang.String e;
    private java.lang.String f;
    private com.ironsource.C3020e5 g;

    class a extends org.json.JSONObject {
        a() throws org.json.JSONException {
            putOpt(com.ironsource.X3.a.j, java.lang.Integer.valueOf(com.ironsource.sdk.controller.d.this.b));
            putOpt(com.ironsource.sdk.controller.d.k, java.lang.Integer.valueOf(com.ironsource.sdk.controller.d.this.d.b()));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6609a;

        static {
            int[] iArr = new int[com.ironsource.sdk.controller.d.c.values().length];
            f6609a = iArr;
            try {
                iArr[com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6609a[com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6609a[com.ironsource.sdk.controller.d.c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0161d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a, reason: collision with root package name */
        private int f6611a;

        EnumC0161d(int i) {
            this.f6611a = i;
        }

        public int b() {
            return this.f6611a;
        }
    }

    d(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.ironsource.C3020e5 c3020e5) {
        int optInt = jSONObject.optInt(com.ironsource.X3.a.j, -1);
        this.b = optInt;
        this.c = a(optInt);
        this.e = str;
        this.f = str2;
        this.g = c3020e5;
    }

    private com.ironsource.sdk.controller.d.c a(int i2) {
        return i2 != 1 ? i2 != 2 ? com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_NO_FALLBACK : com.ironsource.sdk.controller.d.c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws java.lang.Exception {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            com.ironsource.C3381y8 g = g();
            if (g.exists()) {
                com.ironsource.C3381y8 h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(g.getPath(), h2.getPath());
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    private void d() {
        com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(g());
    }

    private com.ironsource.C3381y8 h() {
        return new com.ironsource.C3381y8(this.e, "fallback_mobileController.html");
    }

    private com.ironsource.C3381y8 i() {
        return new com.ironsource.C3381y8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.Integer.valueOf(this.b));
        if (this.f6607a > 0) {
            a2.a(com.ironsource.B5.B, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f6607a));
        }
        com.ironsource.C3327v8.a(com.ironsource.C3083he.x, a2.a());
    }

    org.json.JSONObject f() throws org.json.JSONException {
        return new com.ironsource.sdk.controller.d.a();
    }

    com.ironsource.C3381y8 g() {
        return new com.ironsource.C3381y8(this.e, com.ironsource.X3.f);
    }

    boolean k() {
        int i2 = com.ironsource.sdk.controller.d.b.f6609a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new com.ironsource.C3381y8(this.e, com.ironsource.sdk.utils.SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new com.ironsource.C3381y8(this.e, com.ironsource.sdk.utils.SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                com.ironsource.C3381y8 g = g();
                com.ironsource.C3381y8 i3 = i();
                if (!i3.exists() && !g.exists()) {
                    a(new com.ironsource.C3381y8(this.e, com.ironsource.sdk.utils.SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!i3.exists() && g.exists()) {
                    com.ironsource.sdk.controller.d.EnumC0161d enumC0161d = com.ironsource.sdk.controller.d.EnumC0161d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC0161d;
                    a(enumC0161d);
                    a(new com.ironsource.C3381y8(this.e, i3.getName()));
                    return true;
                }
                c();
                if (b()) {
                    com.ironsource.sdk.controller.d.EnumC0161d enumC0161d2 = com.ironsource.sdk.controller.d.EnumC0161d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC0161d2;
                    a(enumC0161d2);
                    d();
                    a(new com.ironsource.C3381y8(this.e, i3.getName()));
                    return true;
                }
                if (!a()) {
                    a(new com.ironsource.C3381y8(this.e, com.ironsource.sdk.utils.SDKUtils.getFileName(this.f)));
                    return false;
                }
                com.ironsource.sdk.controller.d.EnumC0161d enumC0161d3 = com.ironsource.sdk.controller.d.EnumC0161d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC0161d3;
                a(enumC0161d3);
                a(new com.ironsource.C3381y8(this.e, i3.getName()));
                return true;
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
        }
        return false;
    }

    boolean m() {
        return this.d != com.ironsource.sdk.controller.d.EnumC0161d.NONE;
    }

    void a(java.lang.Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        com.ironsource.sdk.controller.d.EnumC0161d enumC0161d = com.ironsource.sdk.controller.d.EnumC0161d.CONTROLLER_FROM_SERVER;
        this.d = enumC0161d;
        a(enumC0161d);
        runnable.run();
    }

    void a(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            com.ironsource.sdk.controller.d.EnumC0161d enumC0161d = com.ironsource.sdk.controller.d.EnumC0161d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0161d;
            a(enumC0161d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(com.ironsource.C3381y8 c3381y8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c3381y8, this.f);
    }

    void a(com.ironsource.C3238q8 c3238q8) {
        c3238q8.a(com.ironsource.B5.y, java.lang.Integer.valueOf(this.b));
        com.ironsource.C3327v8.a(com.ironsource.C3083he.v, c3238q8.a());
        this.f6607a = java.lang.System.currentTimeMillis();
    }

    private void a(com.ironsource.sdk.controller.d.EnumC0161d enumC0161d) {
        com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.Integer.valueOf(this.b)).a(com.ironsource.B5.z, java.lang.Integer.valueOf(enumC0161d.b()));
        if (this.f6607a > 0) {
            a2.a(com.ironsource.B5.B, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f6607a));
        }
        com.ironsource.C3327v8.a(com.ironsource.C3083he.w, a2.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return false;
        }
    }
}
