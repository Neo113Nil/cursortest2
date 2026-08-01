package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f11199a = new c();
    public static final int b = 0;

    public final float a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public final a.AbstractC1622a.g b(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC1622a.g(a(IntSize.m4000getWidthimpl(layoutCoordinates.mo3123getSizeYbymL2g())), a(IntSize.m3999getHeightimpl(layoutCoordinates.mo3123getSizeYbymL2g())));
    }

    public final a.AbstractC1622a.f a(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC1622a.f(a((int) Offset.m1392getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) Offset.m1393getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    public final a.AbstractC1622a.f a(long j) {
        return new a.AbstractC1622a.f(a((int) Offset.m1392getXimpl(j)), a((int) Offset.m1393getYimpl(j)));
    }

    public final a.AbstractC1622a.c a(LayoutCoordinates layoutCoordinates, a.AbstractC1622a.c.EnumC1624a buttonType) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new a.AbstractC1622a.c(buttonType, a(layoutCoordinates), b(layoutCoordinates));
    }

    public final boolean a(a.AbstractC1622a.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f().c() > 0.0f && cVar.f().d() > 0.0f;
    }
}
