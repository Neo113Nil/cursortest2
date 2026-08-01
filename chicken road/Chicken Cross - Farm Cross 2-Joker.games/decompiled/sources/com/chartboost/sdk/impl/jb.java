package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public final hd f4825a;
    public final String b;
    public final a0 c;

    public jb(hd multiRenderable, String auctionId, a0 adMarkupConfig) {
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.f4825a = multiRenderable;
        this.b = auctionId;
        this.c = adMarkupConfig;
    }

    public final a0 a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final hd c() {
        return this.f4825a;
    }
}
