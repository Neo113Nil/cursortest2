package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4216xf extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7479a;
    public final /* synthetic */ C4271zf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216xf(C4271zf c4271zf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4271zf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7479a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
