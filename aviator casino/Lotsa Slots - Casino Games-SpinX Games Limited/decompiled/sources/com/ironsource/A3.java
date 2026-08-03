package com.ironsource;

/* loaded from: classes5.dex */
public final class A3 implements com.ironsource.InterfaceC3201o7 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f5608a;
    private final java.lang.Integer b;
    private final com.ironsource.H3 c;

    public A3(java.lang.Boolean bool, java.lang.Integer num, com.ironsource.H3 h3) {
        this.f5608a = bool;
        this.b = num;
        this.c = h3;
    }

    @Override // com.ironsource.InterfaceC3201o7
    public java.lang.Object a() {
        java.lang.Boolean bool = this.f5608a;
        if (bool == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(java.lang.Boolean.FALSE);
        }
        java.lang.Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("limit flag is not provided or invalid")));
        }
        if (this.c == null) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("unit flag is not provided or invalid")));
        }
        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(java.lang.Boolean.TRUE);
    }
}
