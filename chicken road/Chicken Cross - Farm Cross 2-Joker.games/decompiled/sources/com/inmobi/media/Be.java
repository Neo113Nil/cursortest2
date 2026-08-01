package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Be extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6475a;
    public final /* synthetic */ De b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(De de, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = de;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6475a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
