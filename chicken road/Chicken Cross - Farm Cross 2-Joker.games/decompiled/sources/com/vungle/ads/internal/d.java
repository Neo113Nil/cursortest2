package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d extends h {
    public d() {
        super("LOADING", 1, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.c || adState == h.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "loading";
    }
}
