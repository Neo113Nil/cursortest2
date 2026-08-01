package com.vungle.ads.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class h1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f11924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o1 o1Var) {
        super(0);
        this.f11924a = o1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.util.p pVar = com.vungle.ads.internal.util.p.b;
        pVar.a(((com.vungle.ads.internal.executor.d) o1.a(this.f11924a)).f11913a);
        return pVar;
    }
}
