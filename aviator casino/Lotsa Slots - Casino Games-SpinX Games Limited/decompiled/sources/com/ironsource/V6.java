package com.ironsource;

/* loaded from: classes5.dex */
public final class V6 implements com.ironsource.W6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6016a;
    private final com.ironsource.Z6 b;

    public V6(long j, com.ironsource.Z6 recoveryStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f6016a = j;
        this.b = recoveryStrategy;
    }

    @Override // com.ironsource.W6
    public long a() {
        return this.f6016a;
    }

    @Override // com.ironsource.W6
    public com.ironsource.Z6 b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V6(com.ironsource.Y6 feature) {
        this(feature.a(), feature.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
