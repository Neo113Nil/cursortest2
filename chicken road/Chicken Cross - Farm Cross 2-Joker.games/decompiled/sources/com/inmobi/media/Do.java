package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Do extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Bn f6519a;
    public Qf b;
    public int c;
    public /* synthetic */ Object d;
    public int e;

    public Do(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return Jo.a(null, 0.0d, null, 0, null, this);
    }
}
