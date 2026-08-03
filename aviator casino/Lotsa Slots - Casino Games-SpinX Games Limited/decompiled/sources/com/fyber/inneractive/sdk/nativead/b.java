package com.fyber.inneractive.sdk.nativead;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.player.cache.f {
    public static final com.fyber.inneractive.sdk.nativead.b f = new com.fyber.inneractive.sdk.nativead.b();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f3829a;
    public com.fyber.inneractive.sdk.player.cache.g b;
    public boolean c = false;
    public final java.util.concurrent.CopyOnWriteArrayList d = new java.util.concurrent.CopyOnWriteArrayList();
    public final com.fyber.inneractive.sdk.nativead.a e = new com.fyber.inneractive.sdk.nativead.a(this);

    public static java.io.File a(com.fyber.inneractive.sdk.nativead.b bVar) {
        java.lang.String str;
        java.io.File externalCacheDir;
        java.lang.String str2 = "";
        android.content.Context context = bVar.f3829a;
        if (context != null && !android.text.TextUtils.isEmpty("fyb.native.cache")) {
            if (com.fyber.inneractive.sdk.util.o.f4302a != null && com.fyber.inneractive.sdk.util.o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    str = android.os.Environment.getExternalStorageState();
                } catch (java.lang.Throwable unused) {
                    str = "";
                }
                if ("mounted".equals(str)) {
                    try {
                        str2 = android.os.Environment.getExternalStorageState();
                    } catch (java.lang.Throwable unused2) {
                    }
                    if (("mounted".equals(str2) || "mounted_ro".equals(str2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 41943040) {
                        return new java.io.File(context.getExternalCacheDir(), "fyb.native.cache");
                    }
                }
            }
            java.io.File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 41943040) {
                return new java.io.File(context.getCacheDir(), "fyb.native.cache");
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.cache.f
    public final boolean a(java.lang.String str) {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        boolean z;
        com.fyber.inneractive.sdk.player.cache.g gVar = this.b;
        if (gVar != null) {
            synchronized (gVar) {
                z = gVar.i == null;
            }
            if (!z) {
                try {
                    this.b.close();
                    this.c = false;
                    return;
                } catch (java.lang.Throwable th) {
                    com.fyber.inneractive.sdk.util.IAlog.f("%s: destroy: Error closing cache: %s", "NativeCache", th);
                    return;
                }
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.c("%s: destroy: cache already closed or not exists", "NativeCache");
    }
}
