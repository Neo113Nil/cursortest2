package com.ironsource;

/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3394z3 implements com.ironsource.InterfaceC3183n7 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f6855a;
    private final java.lang.Integer b;
    private final com.ironsource.H3 c;

    public C3394z3(java.lang.Boolean bool, java.lang.Integer num, com.ironsource.H3 h3) {
        this.f6855a = bool;
        this.b = num;
        this.c = h3;
    }

    private final java.lang.Object a(com.ironsource.H3 h3) {
        return new com.ironsource.A3(this.f6855a, this.b, h3).a();
    }

    @Override // com.ironsource.InterfaceC3183n7
    public java.lang.Object b() {
        java.lang.Integer num;
        com.ironsource.H3 h3 = com.ironsource.H3.Second;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a(h3));
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        com.ironsource.Vc vc = (!kotlin.jvm.internal.Intrinsics.areEqual(this.f6855a, java.lang.Boolean.TRUE) || (num = this.b) == null) ? null : new com.ironsource.Vc(h3.a(num), null, 2, null);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(vc);
    }

    @Override // com.ironsource.InterfaceC3183n7
    public java.lang.Object c() {
        com.ironsource.C3298tf c3298tf;
        java.lang.Integer num;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a(this.c));
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.f6855a, java.lang.Boolean.TRUE) && (num = this.b) != null) {
            int intValue = num.intValue();
            com.ironsource.H3 h3 = this.c;
            if (h3 != null) {
                c3298tf = new com.ironsource.C3298tf(intValue, h3);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(c3298tf);
            }
        }
        c3298tf = null;
        kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(c3298tf);
    }

    public final java.lang.Boolean d() {
        return this.f6855a;
    }

    public final java.lang.Integer e() {
        return this.b;
    }

    public final com.ironsource.H3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3183n7
    public java.lang.Object a() {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(new com.ironsource.L4(this.f6855a).a());
        if (m10801exceptionOrNullimpl != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.Boolean bool = this.f6855a;
        return kotlin.Result.m10798constructorimpl(bool != null ? new com.ironsource.K4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C3394z3(java.lang.Boolean bool, java.lang.Integer num, com.ironsource.H3 h3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : h3);
    }
}
