package com.ironsource;

import com.ironsource.S4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vg implements Yg {

    /* renamed from: a, reason: collision with root package name */
    private final Rg f7979a;

    public Vg(Rg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f7979a = waterfallOperations;
    }

    @Override // com.ironsource.Yg
    public void a() {
    }

    @Override // com.ironsource.Yg
    public void a(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f7979a.a(it);
        this.f7979a.a(S4.b.b);
    }

    @Override // com.ironsource.Yg
    public Md b() {
        return Md.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Yg
    public B c() {
        return this.f7979a.a(0);
    }
}
