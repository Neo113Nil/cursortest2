package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4238ya extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7498a;
    public final /* synthetic */ C4266za b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4238ya(C4266za c4266za, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4266za;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7498a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
