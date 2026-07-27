package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4024qh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3628ch f7329a;
    public InterfaceC3968oh b;
    public Vg c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC4080sh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024qh(AbstractC4080sh abstractC4080sh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = abstractC4080sh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
