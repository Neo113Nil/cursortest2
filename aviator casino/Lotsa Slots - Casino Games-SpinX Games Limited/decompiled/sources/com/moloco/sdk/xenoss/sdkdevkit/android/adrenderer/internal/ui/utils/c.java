package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c f7665a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c();
    public static final int b = 0;

    public final float a(int i) {
        return i / android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g b(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g(a(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(layoutCoordinates.mo3409getSizeYbymL2g())), a(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(layoutCoordinates.mo3409getSizeYbymL2g())));
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f a(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(a((int) androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) androidx.compose.ui.geometry.Offset.m1872getYimpl(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f a(long j) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(a((int) androidx.compose.ui.geometry.Offset.m1871getXimpl(j)), a((int) androidx.compose.ui.geometry.Offset.m1872getYimpl(j)));
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c(buttonType, a(layoutCoordinates), b(layoutCoordinates));
    }

    public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f().c() > 0.0f && cVar.f().d() > 0.0f;
    }
}
