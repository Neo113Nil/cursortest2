package com.iab.omid.library.unity3d.internal;

/* loaded from: classes5.dex */
public class f {
    private static com.iab.omid.library.unity3d.internal.f b = new com.iab.omid.library.unity3d.internal.f();

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f4503a;

    private f() {
    }

    public static com.iab.omid.library.unity3d.internal.f b() {
        return b;
    }

    public android.content.Context a() {
        return this.f4503a;
    }

    public void a(android.content.Context context) {
        this.f4503a = context != null ? context.getApplicationContext() : null;
    }
}
