package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class H0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6591a;
    public final /* synthetic */ J0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(J0 j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = j0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6591a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
