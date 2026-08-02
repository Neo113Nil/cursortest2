package com.plaid.internal;

/* loaded from: classes16.dex */
public final class E7 implements com.plaid.internal.A6, com.plaid.internal.A8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f5781a;
    public final com.plaid.internal.C0457b1 b;

    public E7(com.plaid.internal.T3 t3, com.plaid.internal.C0457b1 c0457b1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        this.f5781a = t3;
        this.b = c0457b1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.D7 d7;
        int i;
        if (continuationImpl instanceof com.plaid.internal.D7) {
            d7 = (com.plaid.internal.D7) continuationImpl;
            int i2 = d7.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7.c = i2 - 2147483648;
                java.lang.Object obj = d7.f5773a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d7.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.EnumC0467c1 enumC0467c1 = com.plaid.internal.EnumC0467c1.BACKEND_DETERMINES;
                    if (enumC0467c1.isSet()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(enumC0467c1.toBoolean());
                    }
                    com.plaid.internal.T3 t3 = this.f5781a;
                    d7.c = 1;
                    obj = t3.a("webview_background_transparency_state", "webview_background_is_transparent", d7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) obj;
                return str != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false) : kotlin.coroutines.jvm.internal.Boxing.boxBoolean(java.lang.Boolean.parseBoolean(str));
            }
        }
        d7 = new com.plaid.internal.D7(this, continuationImpl);
        java.lang.Object obj2 = d7.f5773a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d7.c;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    @Override // com.plaid.internal.A8
    public final java.lang.Object a(boolean z, com.plaid.internal.C0637s2 c0637s2) {
        java.lang.Object a2 = this.f5781a.a("webview_background_transparency_state", "webview_background_is_transparent", java.lang.String.valueOf(z), c0637s2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.A6
    public final java.lang.Object a(com.plaid.internal.S7 s7) {
        java.lang.Object a2 = this.f5781a.a("webview_background_transparency_state", s7);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
