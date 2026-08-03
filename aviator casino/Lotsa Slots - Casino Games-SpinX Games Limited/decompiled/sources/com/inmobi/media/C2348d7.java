package com.inmobi.media;

/* renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2348d7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.unifiedId.InMobiUserDataModel f5155a;
    public kotlinx.coroutines.sync.Mutex b;
    public /* synthetic */ java.lang.Object c;
    public int d;

    public C2348d7(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return com.inmobi.media.C2373e7.a(null, this);
    }
}
