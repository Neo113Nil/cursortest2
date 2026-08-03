package com.ironsource;

/* loaded from: classes5.dex */
public final class Wc implements com.ironsource.InterfaceC3219p7, com.ironsource.InterfaceC3219p7.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3216p4 f6046a;
    private final com.ironsource.I7 b;
    private final java.util.Map<java.lang.String, com.ironsource.Vc> c;

    public Wc(com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.I7 repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "repository");
        this.f6046a = currentTimeProvider;
        this.b = repository;
        this.c = new java.util.LinkedHashMap();
    }

    public final java.util.Map<java.lang.String, com.ironsource.Vc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.c.get(identifier) == null) {
            return;
        }
        this.b.a(this.f6046a.a(), identifier);
    }

    private final boolean a(com.ironsource.Vc vc, java.lang.String str) {
        java.lang.Long a2 = this.b.a(str);
        return a2 != null && this.f6046a.a() - a2.longValue() < vc.a();
    }

    @Override // com.ironsource.InterfaceC3219p7
    public com.ironsource.G3 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.ironsource.Vc vc = this.c.get(identifier);
        if (vc == null) {
            return new com.ironsource.G3(false, null, 2, null);
        }
        if (a(vc, identifier)) {
            return new com.ironsource.G3(true, com.ironsource.I3.Pacing);
        }
        return new com.ironsource.G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public java.lang.Object a(java.lang.String identifier, com.ironsource.I3 cappingType, com.ironsource.InterfaceC3183n7 cappingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object b = cappingConfig.b();
        if (kotlin.Result.m10805isSuccessimpl(b)) {
            com.ironsource.Vc vc = (com.ironsource.Vc) b;
            if (vc != null) {
                this.c.put(identifier, vc);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(b);
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
    }
}
