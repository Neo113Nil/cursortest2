package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final j f11502a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l b;

    public k(j resource, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f11502a = resource;
        this.b = lVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = this.b;
        if (lVar != null) {
            lVar.destroy();
        }
    }

    public final j k() {
        return this.f11502a;
    }

    public /* synthetic */ k(j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i & 2) != 0 ? null : lVar);
    }
}
