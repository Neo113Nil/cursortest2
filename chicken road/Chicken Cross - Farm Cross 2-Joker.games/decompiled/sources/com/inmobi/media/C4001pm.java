package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4001pm extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7311a;
    public final /* synthetic */ C4029qm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4001pm(C4029qm c4029qm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4029qm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7311a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
