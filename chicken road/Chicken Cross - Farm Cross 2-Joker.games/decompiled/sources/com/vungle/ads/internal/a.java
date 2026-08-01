package com.vungle.ads.internal;

import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a extends h {
    public a() {
        super("ERROR", 6, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return U3.i.t;
    }
}
