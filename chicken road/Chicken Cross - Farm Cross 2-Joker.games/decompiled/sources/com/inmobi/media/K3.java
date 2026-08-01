package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class K3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C4066s3 f6662a;
    public /* synthetic */ Object b;
    public final /* synthetic */ L3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(L3 l3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = l3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
