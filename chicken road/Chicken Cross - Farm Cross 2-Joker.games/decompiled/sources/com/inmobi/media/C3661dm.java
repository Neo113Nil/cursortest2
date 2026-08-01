package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3661dm extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7074a;
    public final /* synthetic */ C3829jm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3661dm(C3829jm c3829jm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3829jm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7074a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((ContinuationImpl) this);
    }
}
