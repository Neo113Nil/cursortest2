package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Bh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6476a;
    public final /* synthetic */ Gh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bh(Gh gh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = gh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6476a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
