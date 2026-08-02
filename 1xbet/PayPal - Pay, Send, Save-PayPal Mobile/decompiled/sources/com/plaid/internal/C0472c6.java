package com.plaid.internal;

/* renamed from: com.plaid.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0472c6 implements com.plaid.internal.InterfaceC0704z6, com.plaid.internal.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f6009a;

    public C0472c6(com.plaid.internal.T3 t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        this.f6009a = t3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC0704z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0462b6 c0462b6;
        int i;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.C0462b6) {
            c0462b6 = (com.plaid.internal.C0462b6) continuationImpl;
            int i2 = c0462b6.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0462b6.c = i2 - 2147483648;
                java.lang.Object obj = c0462b6.f6002a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0462b6.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.T3 t3 = this.f6009a;
                    c0462b6.c = 1;
                    obj = t3.a("pre_completion_result_state", "pre_completion_result", c0462b6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return null;
                }
                return com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.parseFrom(android.util.Base64.decode(str, 0));
            }
        }
        c0462b6 = new com.plaid.internal.C0462b6(this, continuationImpl);
        java.lang.Object obj2 = c0462b6.f6002a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0462b6.c;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC0704z6
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = this.f6009a.a("pre_completion_result_state", continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.z8
    public final java.lang.Object a(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult, com.plaid.internal.C0693y4.b bVar) {
        java.lang.String encodeToString = android.util.Base64.encodeToString(sDKResult.toByteArray(), 0);
        com.plaid.internal.T3 t3 = this.f6009a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(encodeToString);
        java.lang.Object a2 = t3.a("pre_completion_result_state", "pre_completion_result", encodeToString, bVar);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
