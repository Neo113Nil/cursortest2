package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class H6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public long f6597a;
    public /* synthetic */ Object b;
    public final /* synthetic */ M6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H6(M6 m6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = m6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
