package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Re extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6827a;
    public final /* synthetic */ Te b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Re(Te te, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6827a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
