package com.ironsource;

/* loaded from: classes5.dex */
public final class L4 implements com.ironsource.InterfaceC3201o7 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f5813a;

    public L4(java.lang.Boolean bool) {
        this.f5813a = bool;
    }

    @Override // com.ironsource.InterfaceC3201o7
    public java.lang.Object a() {
        java.lang.Boolean bool = this.f5813a;
        if (bool == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("enabled flag is not provided or invalid")));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(bool);
    }
}
