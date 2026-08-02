package com.plaid.internal;

/* renamed from: com.plaid.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0659u6 implements com.plaid.internal.InterfaceC0571k7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0535g7 f6591a;
    public java.lang.String b;

    public C0659u6(com.plaid.internal.InterfaceC0535g7 interfaceC0535g7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        this.f6591a = interfaceC0535g7;
    }

    @Override // com.plaid.internal.InterfaceC0571k7
    public final com.plaid.internal.C0536h a(com.plaid.internal.InterfaceC0562j7 interfaceC0562j7, com.plaid.internal.C0608p c0608p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0562j7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0608p, "");
        java.lang.String str = this.b;
        if (str == null) {
            com.plaid.internal.C0536h a2 = com.plaid.internal.C0536h.a(new java.lang.Exception("FAILURE: sessionVerificationId is null"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
            return a2;
        }
        com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest build = com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest.newBuilder().a(interfaceC0562j7.a().a()).b(str).build();
        com.plaid.internal.InterfaceC0535g7 interfaceC0535g7 = this.f6591a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        try {
            retrofit2.Response<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse> execute = interfaceC0535g7.a(build).execute();
            if (execute.isSuccessful()) {
                com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse body = execute.body();
                java.lang.String redirectTargetUrl = body != null ? body.getRedirectTargetUrl() : null;
                if (redirectTargetUrl != null) {
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Prove Start Step success - redirectTargetUrl: ");
                    sb.append(redirectTargetUrl);
                    com.plaid.internal.C0452a6.a.a(sb.toString(), true);
                    com.plaid.internal.C0536h a3 = com.plaid.internal.C0536h.a(redirectTargetUrl);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "");
                    return a3;
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Prove Start Step failure - response: ");
            sb2.append(execute);
            com.plaid.internal.Y6.a.a(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("FAILURE: ");
            sb3.append(execute);
            com.plaid.internal.C0536h a4 = com.plaid.internal.C0536h.a(new java.lang.Exception(sb3.toString()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "");
            return a4;
        } catch (java.lang.Exception e) {
            com.plaid.internal.Y6.a.a("Prove Start Step failure - exception: ".concat(java.lang.String.valueOf(e)));
            com.plaid.internal.C0536h a5 = com.plaid.internal.C0536h.a(new java.lang.Exception("FAILURE: ".concat(java.lang.String.valueOf(e))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a5, "");
            return a5;
        }
    }
}
