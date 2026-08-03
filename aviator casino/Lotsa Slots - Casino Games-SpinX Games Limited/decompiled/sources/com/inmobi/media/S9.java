package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S9 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4952a;
    public int b;

    public S9(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4952a = obj;
        this.b |= Integer.MIN_VALUE;
        return com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(this);
    }
}
