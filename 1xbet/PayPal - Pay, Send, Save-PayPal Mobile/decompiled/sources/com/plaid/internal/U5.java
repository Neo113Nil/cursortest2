package com.plaid.internal;

/* loaded from: classes16.dex */
public final class U5 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.P5 f5939a;
    public final /* synthetic */ kotlinx.coroutines.Job b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(com.plaid.internal.P5 p5, kotlinx.coroutines.Job job) {
        super(1);
        this.f5939a = p5;
        this.b = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.Unit invoke(java.lang.Throwable th) {
        this.f5939a.e.remove(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
