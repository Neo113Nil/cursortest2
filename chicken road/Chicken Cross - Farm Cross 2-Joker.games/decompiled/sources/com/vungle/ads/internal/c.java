package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c extends h {
    public c() {
        super("IMPRESSION_LOGGED", 4, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.f || adState == h.g || adState == h.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "impressionLogged";
    }
}
