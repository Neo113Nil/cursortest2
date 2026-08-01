package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ip {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6636a;
    public final boolean b;
    public final C3560a6 c;
    public final C3560a6 d;
    public final C3912mi e;

    public Ip(boolean z, boolean z2, C3560a6 iconMinDimension, C3560a6 mediaMinDimension, C3912mi nativeViewData) {
        Intrinsics.checkNotNullParameter(iconMinDimension, "iconMinDimension");
        Intrinsics.checkNotNullParameter(mediaMinDimension, "mediaMinDimension");
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.f6636a = z;
        this.b = z2;
        this.c = iconMinDimension;
        this.d = mediaMinDimension;
        this.e = nativeViewData;
    }
}
