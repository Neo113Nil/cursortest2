package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Zf extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6992a;
    public final /* synthetic */ C3682eg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zf(C3682eg c3682eg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3682eg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6992a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
