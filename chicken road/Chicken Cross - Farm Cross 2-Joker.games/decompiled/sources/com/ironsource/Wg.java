package com.ironsource;

import com.ironsource.S4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wg implements Yg {

    /* renamed from: a, reason: collision with root package name */
    private final Rg f7999a;
    private int b;

    public Wg(Rg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f7999a = waterfallOperations;
    }

    @Override // com.ironsource.Yg
    public void a(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.b++;
        this.f7999a.a(it);
    }

    @Override // com.ironsource.Yg
    public Md b() {
        return this.b >= 2 ? Md.MAX_ATTEMPTS_REACHED : !this.f7999a.a() ? Md.NO_LOADED_ADS : Md.CAN_RECOVER;
    }

    @Override // com.ironsource.Yg
    public B c() {
        return this.f7999a.a(this.b);
    }

    @Override // com.ironsource.Yg
    public void a() {
        this.f7999a.a(S4.c.b);
    }
}
