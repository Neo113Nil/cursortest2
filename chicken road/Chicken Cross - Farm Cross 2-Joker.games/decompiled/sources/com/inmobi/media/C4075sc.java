package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4075sc extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7371a;
    public final /* synthetic */ C4213xc b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4075sc(C4213xc c4213xc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4213xc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7371a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
