package com.vungle.ads.internal;

import com.vungle.ads.internal.model.j3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class w0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f12197a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ com.vungle.ads.internal.model.i0 c;
    public final /* synthetic */ j3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, x0 x0Var, com.vungle.ads.internal.model.i0 i0Var, j3 j3Var) {
        super(0);
        this.f12197a = y0Var;
        this.b = x0Var;
        this.c = i0Var;
        this.d = j3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y0.a(this.f12197a, this.b, this.c, this.d);
        return Unit.INSTANCE;
    }
}
