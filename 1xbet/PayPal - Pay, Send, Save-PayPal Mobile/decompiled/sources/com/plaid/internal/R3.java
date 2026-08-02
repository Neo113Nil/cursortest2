package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", f = "LocalPaneStateDatabaseStore.kt", i = {0, 0, 0}, l = {23}, m = "putString", n = {"this", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes16.dex */
public final class R3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.S3 f5905a;
    public java.lang.String b;
    public java.lang.String c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.S3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(com.plaid.internal.S3 s3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
