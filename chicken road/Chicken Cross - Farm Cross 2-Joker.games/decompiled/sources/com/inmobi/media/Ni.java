package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Ni extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6745a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Oi c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ni(Oi oi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = oi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
