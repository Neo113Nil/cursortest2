package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Qi extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q4 f6806a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ri c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qi(Ri ri, Continuation continuation) {
        super(continuation);
        this.c = ri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
