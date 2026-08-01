package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class L6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public long f6689a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ M6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(M6 m6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = m6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, 0L, this);
    }
}
