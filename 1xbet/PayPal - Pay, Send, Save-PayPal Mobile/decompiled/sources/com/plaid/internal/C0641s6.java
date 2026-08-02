package com.plaid.internal;

/* renamed from: com.plaid.internal.s6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0641s6 implements com.plaid.internal.InterfaceC0571k7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0535g7 f6568a;
    public java.lang.String b;

    public C0641s6(com.plaid.internal.InterfaceC0535g7 interfaceC0535g7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        this.f6568a = interfaceC0535g7;
    }

    @Override // com.plaid.internal.InterfaceC0571k7
    public final com.plaid.internal.C0536h a(com.plaid.internal.InterfaceC0520f1 interfaceC0520f1, com.plaid.internal.C0608p c0608p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0520f1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0608p, "");
        java.lang.String str = this.b;
        if (str == null) {
            com.plaid.internal.C0536h a2 = com.plaid.internal.C0536h.a(new java.lang.Exception("FAILURE: sessionVerificationId is null"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
            return a2;
        }
        com.plaid.internal.InterfaceC0535g7 interfaceC0535g7 = this.f6568a;
        java.lang.String a3 = interfaceC0520f1.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "");
        try {
            retrofit2.Response<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse> execute = interfaceC0535g7.a(str, a3).execute();
            if (execute.isSuccessful()) {
                com.plaid.internal.C0536h a4 = com.plaid.internal.C0536h.a(java.lang.String.valueOf(execute.body()));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "");
                return a4;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Prove Finish Step failure - response: ");
            sb.append(execute);
            com.plaid.internal.Y6.a.a(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FAILURE: ");
            sb2.append(execute);
            com.plaid.internal.C0536h a5 = com.plaid.internal.C0536h.a(new java.lang.Exception(sb2.toString()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a5, "");
            return a5;
        } catch (java.lang.Exception e) {
            com.plaid.internal.Y6.a.a("Prove Finish Step failure - exception: ".concat(java.lang.String.valueOf(e)));
            com.plaid.internal.C0536h a6 = com.plaid.internal.C0536h.a(new java.lang.Exception("FAILURE: ".concat(java.lang.String.valueOf(e))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a6, "");
            return a6;
        }
    }
}
