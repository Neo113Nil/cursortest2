package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class R0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f6814a;
    public /* synthetic */ Object b;
    public final /* synthetic */ T0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(T0 t0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = t0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
