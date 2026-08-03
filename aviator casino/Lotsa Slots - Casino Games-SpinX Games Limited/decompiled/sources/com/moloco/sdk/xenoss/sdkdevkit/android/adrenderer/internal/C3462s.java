package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3462s implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7536a;

    public C3462s(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7536a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r
    public boolean a(java.lang.String uri) {
        boolean b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3463t.b(this.f7536a, uri);
        return b2;
    }
}
