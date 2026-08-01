package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4705w3 implements InterfaceC4494k7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8742a;
    private final Integer b;
    private final E3 c;

    public C4705w3(Boolean bool, Integer num, E3 e3) {
        this.f8742a = bool;
        this.b = num;
        this.c = e3;
    }

    private final Object a(E3 e3) {
        return new C4723x3(this.f8742a, this.b, e3).a();
    }

    @Override // com.ironsource.InterfaceC4494k7
    public Object b() {
        E3 e3 = E3.Second;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a(e3));
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Vc vc = (!Intrinsics.areEqual(this.f8742a, Boolean.TRUE) || this.b == null) ? null : new Vc(e3.a(this.b), null, 2, null);
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m8079constructorimpl(vc);
    }

    @Override // com.ironsource.InterfaceC4494k7
    public Object c() {
        C4627rf c4627rf;
        Integer num;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a(this.c));
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        if (Intrinsics.areEqual(this.f8742a, Boolean.TRUE) && (num = this.b) != null) {
            int intValue = num.intValue();
            E3 e3 = this.c;
            if (e3 != null) {
                c4627rf = new C4627rf(intValue, e3);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8079constructorimpl(c4627rf);
            }
        }
        c4627rf = null;
        Result.Companion companion22 = Result.INSTANCE;
        return Result.m8079constructorimpl(c4627rf);
    }

    public final Boolean d() {
        return this.f8742a;
    }

    public final Integer e() {
        return this.b;
    }

    public final E3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4494k7
    public Object a() {
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(new I4(this.f8742a).a());
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Result.Companion companion2 = Result.INSTANCE;
        Boolean bool = this.f8742a;
        return Result.m8079constructorimpl(bool != null ? new H4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C4705w3(Boolean bool, Integer num, E3 e3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : e3);
    }
}
