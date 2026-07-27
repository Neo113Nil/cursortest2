package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3776ho extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C4197wn f7152a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3831jo c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776ho(C3831jo c3831jo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3831jo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((C4197wn) null, (Co) null, this);
    }
}
