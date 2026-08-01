package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Y7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6967a;
    public int b;
    public final /* synthetic */ Z7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(Z7 z7, Continuation continuation) {
        super(continuation);
        this.c = z7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6967a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
