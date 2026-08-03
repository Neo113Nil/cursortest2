package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O9 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4872a;
    public kotlinx.coroutines.sync.Mutex b;
    public /* synthetic */ java.lang.Object c;
    public int d;

    public O9(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
