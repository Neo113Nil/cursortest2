package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.rh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4052rh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7354a;
    public final /* synthetic */ AbstractC4080sh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4052rh(AbstractC4080sh abstractC4080sh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = abstractC4080sh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7354a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((Vg) null, this);
    }
}
