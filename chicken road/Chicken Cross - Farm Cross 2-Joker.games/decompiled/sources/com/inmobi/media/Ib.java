package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Ib extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6624a;
    public final /* synthetic */ Kb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(Kb kb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = kb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6624a = obj;
        this.c |= Integer.MIN_VALUE;
        return Kb.a(this.b, this);
    }
}
