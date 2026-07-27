package com.ironsource;

import com.ironsource.AbstractC4419g3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ug<Smash extends AbstractC4419g3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final Zg<Smash> f7954a;

    public Ug(Zg<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f7954a = smashPicker;
    }

    public final List<Smash> a() {
        return this.f7954a.c();
    }

    public final boolean b() {
        return this.f7954a.c().isEmpty() && this.f7954a.a().isEmpty();
    }

    public final boolean c() {
        return this.f7954a.d() == 0;
    }
}
