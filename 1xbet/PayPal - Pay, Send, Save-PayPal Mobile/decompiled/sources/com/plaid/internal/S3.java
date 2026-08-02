package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S3 implements com.plaid.internal.T3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0688y<java.lang.String, java.lang.Object> f5918a;
    public final com.plaid.internal.I3 b;

    public S3(com.plaid.internal.workflow.persistence.database.WorkflowDatabase workflowDatabase) {
        com.plaid.internal.C0450a4 c0450a4 = new com.plaid.internal.C0450a4();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0450a4, "");
        this.f5918a = c0450a4;
        this.b = workflowDatabase.a();
    }

    @Override // com.plaid.internal.T3
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = this.f5918a.a(str2);
        java.lang.String str3 = a2 instanceof java.lang.String ? (java.lang.String) a2 : null;
        return str3 == null ? this.b.a(str, str2, continuationImpl) : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.T3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.R3 r3;
        int i;
        com.plaid.internal.S3 s3;
        if (continuationImpl instanceof com.plaid.internal.R3) {
            r3 = (com.plaid.internal.R3) continuationImpl;
            int i2 = r3.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3.f = i2 - 2147483648;
                java.lang.Object obj = r3.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = r3.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.I3 i3 = this.b;
                    r3.f5905a = this;
                    r3.b = str2;
                    r3.c = str3;
                    r3.f = 1;
                    if (i3.a(str, str2, str3, r3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    s3 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = r3.c;
                    str2 = r3.b;
                    s3 = r3.f5905a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                s3.f5918a.a(str2, str3);
                return kotlin.Unit.INSTANCE;
            }
        }
        r3 = new com.plaid.internal.R3(this, continuationImpl);
        java.lang.Object obj2 = r3.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r3.f;
        if (i != 0) {
        }
        s3.f5918a.a(str2, str3);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.T3
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        this.f5918a.clear();
        java.lang.Object a2 = this.b.a(str, continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
