package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class H7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6598a;
    public final /* synthetic */ P7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(P7 p7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = p7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6598a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
