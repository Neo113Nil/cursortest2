package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.cache.a {
    public static final java.lang.String c = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.cache.d.class);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3551a;
    public final java.lang.String b;

    public d(java.lang.String str) {
        this.f3551a = str;
        java.util.Locale locale = java.util.Locale.US;
        int hashCode = str.hashCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashCode);
        this.b = sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(java.lang.Object obj) {
        com.fyber.inneractive.sdk.util.IAlog.c("%s: onCacheCommitted: %s for url: %s", c, (android.net.Uri) obj, this.f3551a);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return android.net.Uri.fromFile(new java.io.File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        return this.f3551a;
    }
}
