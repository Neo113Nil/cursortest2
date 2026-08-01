package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class M9 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f6712a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(S9 s9, Continuation continuation) {
        super(continuation);
        this.c = s9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
