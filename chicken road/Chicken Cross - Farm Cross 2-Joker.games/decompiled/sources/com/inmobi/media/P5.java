package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class P5 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Vg f6776a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Q5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5(Q5 q5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = q5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Vg) null, this);
    }
}
