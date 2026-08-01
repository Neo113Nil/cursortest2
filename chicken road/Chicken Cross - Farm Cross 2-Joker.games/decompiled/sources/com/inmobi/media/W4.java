package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class W4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f6923a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Y4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(Y4 y4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = y4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
