package com.plaid.internal;

/* loaded from: classes16.dex */
public final class I7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0683x3 f5814a;
    public final com.plaid.internal.B6 b;

    @javax.inject.Inject
    public I7(com.plaid.internal.C0683x3 c0683x3, com.plaid.internal.B6 b6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0683x3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b6, "");
        this.f5814a = c0683x3;
        this.b = b6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.F7 f7;
        int i;
        com.plaid.internal.I7 i7;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.F7) {
            f7 = (com.plaid.internal.F7) continuationImpl;
            int i2 = f7.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f7.d = i2 - 2147483648;
                java.lang.Object obj = f7.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f7.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.B6 b6 = this.b;
                    f7.f5790a = this;
                    f7.d = 1;
                    obj = b6.a(f7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i7 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = f7.f5790a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackCancelEvent");
                } else {
                    i7.f5814a.a(str);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("WebviewFallbackCancel webviewFallbackId=".concat(java.lang.String.valueOf(str)), true);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        f7 = new com.plaid.internal.F7(this, continuationImpl);
        java.lang.Object obj2 = f7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f7.d;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.G7 g7;
        int i;
        com.plaid.internal.I7 i7;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.G7) {
            g7 = (com.plaid.internal.G7) continuationImpl;
            int i2 = g7.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7.d = i2 - 2147483648;
                java.lang.Object obj = g7.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g7.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.B6 b6 = this.b;
                    g7.f5796a = this;
                    g7.d = 1;
                    obj = b6.a(g7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i7 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = g7.f5796a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackEmitPreCompletionResultEvent");
                } else {
                    i7.f5814a.b(str);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("WebviewFallbackEmitPreCompletionResult webviewFallbackId=".concat(java.lang.String.valueOf(str)), true);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        g7 = new com.plaid.internal.G7(this, continuationImpl);
        java.lang.Object obj2 = g7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g7.d;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.H7 h7;
        int i;
        com.plaid.internal.I7 i7;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.H7) {
            h7 = (com.plaid.internal.H7) continuationImpl;
            int i2 = h7.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h7.d = i2 - 2147483648;
                java.lang.Object obj = h7.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h7.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.B6 b6 = this.b;
                    h7.f5804a = this;
                    h7.d = 1;
                    obj = b6.a(h7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i7 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = h7.f5804a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackOpenEvent");
                } else {
                    i7.f5814a.c(str);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("WebviewFallbackOpen webviewFallbackId=".concat(java.lang.String.valueOf(str)), true);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        h7 = new com.plaid.internal.H7(this, continuationImpl);
        java.lang.Object obj2 = h7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h7.d;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
