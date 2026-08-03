package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f7912a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k b;

    public k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j resource, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
        this.f7912a = resource;
        this.b = kVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = this.b;
        if (kVar != null) {
            kVar.destroy();
        }
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j k() {
        return this.f7912a;
    }

    public /* synthetic */ k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i & 2) != 0 ? null : kVar);
    }
}
