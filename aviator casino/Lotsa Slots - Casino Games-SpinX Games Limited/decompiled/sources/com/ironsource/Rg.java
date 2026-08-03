package com.ironsource;

/* loaded from: classes5.dex */
public final class Rg<Smash extends com.ironsource.AbstractC3107j3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Wg<Smash> f5953a;

    public Rg(com.ironsource.Wg<Smash> smashPicker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f5953a = smashPicker;
    }

    public final java.util.List<Smash> a() {
        return this.f5953a.c();
    }

    public final boolean b() {
        return this.f5953a.c().isEmpty() && this.f5953a.a().isEmpty();
    }

    public final boolean c() {
        return this.f5953a.d() == 0;
    }
}
