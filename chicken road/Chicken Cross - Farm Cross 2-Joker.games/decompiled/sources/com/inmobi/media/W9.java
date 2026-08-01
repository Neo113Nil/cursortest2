package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class W9 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public X9 f6928a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(X9 x9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
