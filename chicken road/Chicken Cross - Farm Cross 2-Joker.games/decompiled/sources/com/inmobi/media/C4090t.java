package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4090t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7383a;
    public final /* synthetic */ C4200x b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4090t(C4200x c4200x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4200x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7383a = obj;
        this.c |= Integer.MIN_VALUE;
        return C4200x.a(this.b, null, null, 0, this);
    }
}
