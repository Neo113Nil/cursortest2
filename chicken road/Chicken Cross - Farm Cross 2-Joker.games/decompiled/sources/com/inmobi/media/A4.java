package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class A4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6447a;
    public final /* synthetic */ B4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(B4 b4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = b4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6447a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
