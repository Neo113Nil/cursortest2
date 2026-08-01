package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.qo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4031qo extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Bo f7335a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Bo c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4031qo(Bo bo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = bo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
