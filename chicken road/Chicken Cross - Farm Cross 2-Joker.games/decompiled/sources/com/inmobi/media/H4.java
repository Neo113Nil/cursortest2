package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class H4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6595a;
    public final /* synthetic */ J4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4(J4 j4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6595a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
