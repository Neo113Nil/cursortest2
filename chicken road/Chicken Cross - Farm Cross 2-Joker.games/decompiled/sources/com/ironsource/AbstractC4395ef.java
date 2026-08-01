package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4395ef {

    /* renamed from: a, reason: collision with root package name */
    private final P f8161a;

    public AbstractC4395ef(P p) {
        this.f8161a = p;
    }

    public final P a() {
        return this.f8161a;
    }

    public abstract EnumC4520lf b();

    public final C4701w a(Hb<AbstractC4395ef, C4701w> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
