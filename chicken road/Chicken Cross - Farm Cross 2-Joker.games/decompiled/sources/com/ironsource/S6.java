package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S6 implements T6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f7890a;
    private final W6 b;

    public S6(long j, W6 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f7890a = j;
        this.b = recoveryStrategy;
    }

    @Override // com.ironsource.T6
    public long a() {
        return this.f7890a;
    }

    @Override // com.ironsource.T6
    public W6 b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S6(V6 feature) {
        this(feature.a(), feature.c());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
