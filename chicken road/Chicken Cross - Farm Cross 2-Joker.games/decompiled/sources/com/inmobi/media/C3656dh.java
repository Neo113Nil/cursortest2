package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.dh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3656dh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Vg f7070a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC3796ih c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3656dh(AbstractC3796ih abstractC3796ih, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC3796ih;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Vg) null, this);
    }
}
