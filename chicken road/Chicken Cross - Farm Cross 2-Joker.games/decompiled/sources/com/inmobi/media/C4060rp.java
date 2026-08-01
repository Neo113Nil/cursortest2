package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.rp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4060rp extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f7360a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4116tp d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4060rp(C4116tp c4116tp, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4116tp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C4116tp.a(this.d, this);
    }
}
