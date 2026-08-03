package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class b1 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;

    public b1(com.fyber.inneractive.sdk.web.x xVar, java.lang.String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(xVar, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        java.io.FileOutputStream fileOutputStream;
        java.lang.String str;
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                java.io.InputStream inputStream = lVar.c;
                java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Pictures");
                file.mkdirs();
                java.lang.String a2 = a(java.net.URI.create(this.p), map);
                if (android.text.TextUtils.isEmpty(a2)) {
                    str = null;
                } else {
                    java.io.File file2 = new java.io.File(file, a2);
                    str = file2.toString();
                    fileOutputStream = new java.io.FileOutputStream(file2);
                    try {
                        com.fyber.inneractive.sdk.util.v.a(inputStream, fileOutputStream);
                        fileOutputStream2 = fileOutputStream;
                    } catch (java.lang.Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        com.fyber.inneractive.sdk.util.IAlog.a("failed to download and save the image file.", new java.lang.Object[0]);
                        com.fyber.inneractive.sdk.util.v.b(fileOutputStream2);
                        return o0Var;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.fyber.inneractive.sdk.util.v.b(fileOutputStream);
                        throw th;
                    }
                }
                o0Var.f3851a = str;
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (java.lang.Exception unused2) {
        }
        com.fyber.inneractive.sdk.util.v.b(fileOutputStream2);
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public static java.lang.String a(java.net.URI uri, java.util.Map map) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            return null;
        }
        java.lang.String name = new java.io.File(path).getName();
        java.util.List list = map != null ? (java.util.List) map.get("Content-Type") : null;
        java.lang.String str = list != null ? (java.lang.String) list.get(0) : null;
        if (str == null) {
            return name;
        }
        for (java.lang.String str2 : str.split(";")) {
            if (str2.contains("image/")) {
                java.lang.String str3 = "." + str2.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)[1];
                if (name.endsWith(str3)) {
                    return name;
                }
                return name + str3;
            }
        }
        return name;
    }
}
