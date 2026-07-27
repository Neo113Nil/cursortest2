package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Mh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6720a;
    public final /* synthetic */ Oh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Oh oh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = oh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6720a = obj;
        this.c |= Integer.MIN_VALUE;
        return Oh.a(this.b, this);
    }
}
