package com.ironsource;

/* loaded from: classes5.dex */
public final class N4 implements com.ironsource.InterfaceC3219p7, com.ironsource.InterfaceC3219p7.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.K4> f5849a = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC3219p7
    public com.ironsource.G3 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.ironsource.K4 k4 = this.f5849a.get(identifier);
        return (k4 == null || k4.a()) ? new com.ironsource.G3(false, null, 2, null) : new com.ironsource.G3(true, com.ironsource.I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public java.lang.Object a(java.lang.String identifier, com.ironsource.I3 cappingType, com.ironsource.InterfaceC3183n7 cappingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object a2 = cappingConfig.a();
        if (kotlin.Result.m10805isSuccessimpl(a2)) {
            com.ironsource.K4 k4 = (com.ironsource.K4) a2;
            if (k4 != null) {
                this.f5849a.put(identifier, k4);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
    }
}
