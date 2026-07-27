package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.mq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3920mq extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7255a;
    public final /* synthetic */ C3948nq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3920mq(C3948nq c3948nq, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3948nq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7255a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
