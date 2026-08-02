package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    @javax.inject.Inject
    public final com.plaid.internal.n8 f5875a;

    @javax.inject.Inject
    public final com.plaid.internal.i8 b;

    @javax.inject.Inject
    public final kotlinx.serialization.json.Json c;

    public P0(com.plaid.internal.InterfaceC0449a3 interfaceC0449a3) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0449a3, "");
        com.plaid.internal.C0600o0 c0600o0 = (com.plaid.internal.C0600o0) interfaceC0449a3;
        com.plaid.internal.C0609p0 c0609p0 = c0600o0.f6513a;
        com.plaid.internal.C0600o0 c0600o02 = c0600o0.b;
        new com.plaid.internal.C0591n0(c0609p0, c0600o02, new com.plaid.internal.I1());
        this.f5875a = c0600o02.i.get();
        com.plaid.internal.E5 e5 = c0600o02.f6513a.l.get();
        com.plaid.internal.C0587m5 c0587m5 = c0600o02.f6513a.m.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0587m5, "");
        com.plaid.internal.EnumC0560j5 b = c0587m5.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
        int i = com.plaid.internal.C0569k5.f6463a[b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
            java.lang.Object create = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            this.b = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create);
            this.c = c0609p0.e.get();
        }
        str = "https://production.plaid.com/";
        java.lang.Object create2 = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        this.b = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create2);
        this.c = c0609p0.e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.O0 o0;
        int i;
        com.plaid.internal.AbstractC0550i4 abstractC0550i4;
        if (continuationImpl instanceof com.plaid.internal.O0) {
            o0 = (com.plaid.internal.O0) continuationImpl;
            int i2 = o0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0.c = i2 - 2147483648;
                java.lang.Object obj = o0.f5867a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = o0.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.n8 n8Var = this.f5875a;
                    com.plaid.internal.i8 i8Var = null;
                    if (n8Var == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        n8Var = null;
                    }
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a2 = n8Var.a(str);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("embedded view workflow start request is : ".concat(java.lang.String.valueOf(a2)), true);
                    com.plaid.internal.i8 i8Var2 = this.b;
                    if (i8Var2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        i8Var = i8Var2;
                    }
                    o0.c = 1;
                    obj = i8Var.a(a2, o0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj;
                if (!abstractC0550i4.a()) {
                    com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "embedded search workflow start request error: ".concat(java.lang.String.valueOf(abstractC0550i4)));
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("embedded search workflow start request error: ".concat(java.lang.String.valueOf(abstractC0550i4)))));
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(abstractC0550i4, "");
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) ((com.plaid.internal.AbstractC0550i4.c) abstractC0550i4).b();
                java.lang.String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "");
                if (url.length() != 0) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl());
                }
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "missing webview fallback url: ".concat(java.lang.String.valueOf(workflow$LinkWorkflowStartResponse)));
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("missing webview fallback url: ".concat(java.lang.String.valueOf(workflow$LinkWorkflowStartResponse)))));
            }
        }
        o0 = new com.plaid.internal.O0(this, continuationImpl);
        java.lang.Object obj2 = o0.f5867a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o0.c;
        if (i != 0) {
        }
        abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj2;
        if (!abstractC0550i4.a()) {
        }
    }
}
