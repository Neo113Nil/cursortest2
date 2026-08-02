package com.plaid.internal;

/* loaded from: classes16.dex */
public final class W4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.H5 f5963a;
    public com.plaid.internal.S4 b;

    public W4(com.plaid.internal.H5 h5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "");
        this.f5963a = h5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.T4 t4;
        int i;
        com.plaid.internal.W4 w4;
        if (continuationImpl instanceof com.plaid.internal.T4) {
            t4 = (com.plaid.internal.T4) continuationImpl;
            int i2 = t4.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4.d = i2 - 2147483648;
                java.lang.Object obj = t4.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = t4.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.S4 s4 = this.b;
                    if (s4 != null) {
                        return s4;
                    }
                    t4.f5925a = this;
                    t4.d = 1;
                    if ((s4 != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(s4.f5919a) : null) != null) {
                        com.plaid.internal.S4 s42 = this.b;
                        obj = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(s42 != null && s42.f5919a);
                    } else {
                        obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.U4(this, null), t4);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w4 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w4 = t4.f5925a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.plaid.internal.S4 s43 = new com.plaid.internal.S4(((java.lang.Boolean) obj).booleanValue());
                w4.b = s43;
                return s43;
            }
        }
        t4 = new com.plaid.internal.T4(this, continuationImpl);
        java.lang.Object obj2 = t4.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t4.d;
        if (i != 0) {
        }
        com.plaid.internal.S4 s432 = new com.plaid.internal.S4(((java.lang.Boolean) obj2).booleanValue());
        w4.b = s432;
        return s432;
    }
}
