package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class n implements com.fyber.inneractive.sdk.player.cache.f {
    public static final com.fyber.inneractive.sdk.player.cache.n f = new com.fyber.inneractive.sdk.player.cache.n();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f3876a;
    public com.fyber.inneractive.sdk.player.cache.g b;
    public boolean c = false;
    public final java.util.concurrent.CopyOnWriteArrayList d = new java.util.concurrent.CopyOnWriteArrayList();
    public final com.fyber.inneractive.sdk.player.cache.m e = new com.fyber.inneractive.sdk.player.cache.m(this);

    public static java.io.File a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.io.File externalCacheDir;
        java.lang.String str3 = "";
        if (context != null && !android.text.TextUtils.isEmpty(str)) {
            if (com.fyber.inneractive.sdk.util.o.f4302a != null && com.fyber.inneractive.sdk.util.o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    str2 = android.os.Environment.getExternalStorageState();
                } catch (java.lang.Throwable unused) {
                    str2 = "";
                }
                if ("mounted".equals(str2)) {
                    try {
                        str3 = android.os.Environment.getExternalStorageState();
                    } catch (java.lang.Throwable unused2) {
                    }
                    if (("mounted".equals(str3) || "mounted_ro".equals(str3)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                        return new java.io.File(context.getExternalCacheDir(), str);
                    }
                }
            }
            java.io.File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 52428800) {
                return new java.io.File(context.getCacheDir(), str);
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
}
