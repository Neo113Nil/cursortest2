package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3746gn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7129a;
    public int b;

    public C3746gn(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7129a = obj;
        this.b |= Integer.MIN_VALUE;
        return C3859kn.a(this);
    }
}
