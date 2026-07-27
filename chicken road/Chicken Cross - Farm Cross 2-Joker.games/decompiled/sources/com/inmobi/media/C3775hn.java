package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3775hn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7151a;
    public final /* synthetic */ C3859kn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3775hn(C3859kn c3859kn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3859kn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7151a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
