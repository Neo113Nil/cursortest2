package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class e0 extends com.fyber.inneractive.sdk.network.d0 {
    public static final java.lang.String e = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.network.e0.class);
    public final com.fyber.inneractive.sdk.player.cache.g d;

    public e0(android.content.Context context, com.fyber.inneractive.sdk.cache.a aVar, com.fyber.inneractive.sdk.player.cache.g gVar) {
        super(context, aVar);
        this.d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: Exception -> 0x00c7, TryCatch #1 {Exception -> 0x00c7, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:21:0x007e, B:23:0x0088, B:26:0x0093, B:28:0x00a0, B:29:0x00aa, B:38:0x006b, B:39:0x00bc, B:10:0x001c, B:12:0x0020, B:14:0x002c, B:18:0x003e, B:20:0x0044, B:32:0x0038, B:33:0x0049, B:34:0x0061, B:35:0x0062, B:36:0x0069), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: Exception -> 0x00c7, TryCatch #1 {Exception -> 0x00c7, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:21:0x007e, B:23:0x0088, B:26:0x0093, B:28:0x00a0, B:29:0x00aa, B:38:0x006b, B:39:0x00bc, B:10:0x001c, B:12:0x0020, B:14:0x002c, B:18:0x003e, B:20:0x0044, B:32:0x0038, B:33:0x0049, B:34:0x0061, B:35:0x0062, B:36:0x0069), top: B:1:0x0000, inners: #0 }] */
    @Override // com.fyber.inneractive.sdk.network.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.cache.m a() {
        java.lang.String str;
        android.net.Uri uri;
        try {
            if (this.d != null && this.b.d()) {
                com.fyber.inneractive.sdk.player.cache.g gVar = this.d;
                java.lang.String c = this.b.c();
                gVar.getClass();
                try {
                } catch (java.lang.Exception e2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("%s: failure on filePath: %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.player.cache.g.class), e2);
                }
                if (gVar.i == null) {
                    throw new java.lang.IllegalStateException("cache is closed");
                }
                if (!com.fyber.inneractive.sdk.player.cache.g.p.matcher(c).matches()) {
                    throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + c + "\"");
                }
                com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) gVar.j.get(c);
                java.io.File a2 = eVar == null ? null : eVar.a(0);
                if (a2 != null && a2.exists()) {
                    str = a2.getAbsolutePath();
                    uri = (android.net.Uri) this.b.a(str);
                    if (uri != null) {
                        new com.fyber.inneractive.sdk.network.c0();
                        return new com.fyber.inneractive.sdk.cache.m();
                    }
                    com.fyber.inneractive.sdk.util.IAlog.a("Get cached file: %s", str);
                    if (this.c == null) {
                        this.c = this.f3835a.getSharedPreferences("IAConfigurationPreferences", 0);
                    }
                    return new com.fyber.inneractive.sdk.cache.m(uri, this.c.getString(this.b.b(), null));
                }
                str = null;
                uri = (android.net.Uri) this.b.a(str);
                if (uri != null) {
                }
            }
            new com.fyber.inneractive.sdk.network.c0();
            return new com.fyber.inneractive.sdk.cache.m();
        } catch (java.lang.Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final boolean a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.player.cache.g gVar;
        try {
            byte[] decode = android.util.Base64.decode(str2, 0);
            if (decode != null && (gVar = this.d) != null) {
                com.fyber.inneractive.sdk.player.cache.d a2 = gVar.a(str);
                if (a2 == null) {
                    com.fyber.inneractive.sdk.util.IAlog.f("%s: Error getting editor", e);
                    return false;
                }
                a2.a(decode);
                a2.a();
                return true;
            }
            com.fyber.inneractive.sdk.util.IAlog.f("%s: Invalid content", e);
            return false;
        } catch (java.io.IOException | java.lang.IllegalArgumentException e2) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s: Error writing cache: ", e, e2);
            return false;
        }
    }
}
