package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Ah extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6457a;
    public final /* synthetic */ Gh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ah(Gh gh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = gh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6457a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((Integer) null, (String) null, 0L, this);
    }
}
