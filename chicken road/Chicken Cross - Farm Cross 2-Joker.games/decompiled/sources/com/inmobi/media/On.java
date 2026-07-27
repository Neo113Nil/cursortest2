package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class On extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6767a;
    public final /* synthetic */ Rn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public On(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6767a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, this);
    }
}
