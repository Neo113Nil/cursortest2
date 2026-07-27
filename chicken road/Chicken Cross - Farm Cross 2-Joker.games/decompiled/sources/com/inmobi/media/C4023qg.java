package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4023qg extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7328a;
    public final /* synthetic */ C4051rg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4023qg(C4051rg c4051rg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4051rg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7328a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
