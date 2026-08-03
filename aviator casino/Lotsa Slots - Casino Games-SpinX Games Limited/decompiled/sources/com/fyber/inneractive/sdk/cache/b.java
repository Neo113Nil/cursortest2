package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3549a;

    public b(java.lang.String str) {
        this.f3549a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt.dynamic.icon.data", com.fyber.inneractive.sdk.util.w0.a(bitmap)).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "dt.dynamic.icon.last.modified";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return java.lang.String.valueOf(("dt.dynamic.icon_" + this.f3549a).hashCode());
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
        return com.fyber.inneractive.sdk.util.w0.a(str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        return this.f3549a;
    }
}
