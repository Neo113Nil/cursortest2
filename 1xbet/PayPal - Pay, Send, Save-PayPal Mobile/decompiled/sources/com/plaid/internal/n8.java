package com.plaid.internal;

/* loaded from: classes16.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6510a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final android.content.pm.PackageManager f;
    public final java.lang.String g;
    public final com.plaid.internal.C0459b3 h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;

    public n8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.pm.PackageManager packageManager, java.lang.String str8, com.plaid.internal.C0459b3 c0459b3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.plaid.internal.O4.f5870a, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0459b3, "");
        this.f6510a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        this.e = str6;
        this.f = packageManager;
        this.g = str8;
        this.h = c0459b3;
        this.i = kotlin.LazyKt.lazy(com.plaid.internal.j8.f6454a);
        this.j = kotlin.LazyKt.lazy(new com.plaid.internal.l8(str));
        this.k = kotlin.LazyKt.lazy(new com.plaid.internal.k8(this));
        this.l = kotlin.LazyKt.lazy(new com.plaid.internal.m8(this));
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a(com.plaid.internal.N2.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        com.plaid.internal.M0 m0 = aVar.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m0, "");
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a a2 = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.newBuilder().e(m0.f5839a).c(m0.b).d(m0.c).b(m0.d).f(m0.e).a(m0.f).a(m0.g);
        com.plaid.internal.L0 l0 = m0.h;
        if (l0 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l0, "");
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a a3 = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.newBuilder().a(l0.f5829a).a(l0.e);
            if (l0.b != null) {
                a3.a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder().build());
            } else if (l0.d != null) {
                a3.a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder().build());
            } else if (l0.c != null) {
                a3.a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder().a(l0.c.f5822a).build());
            }
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration build = a3.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            a2.a(build);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration build2 = a2.a((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) this.j.getValue()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.protobuf.Timestamp build3 = com.google.protobuf.Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "");
        android.content.pm.PackageManager packageManager = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "");
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest build4 = a().a(build3).a(build2).a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "");
        return build4;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a(com.plaid.internal.N2.b bVar, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "");
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a e = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.newBuilder().c(bVar.b).e(bVar.c.getToken());
        java.lang.String str = this.d;
        if (str == null) {
            str = "";
        }
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a a2 = e.d(str).a((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) this.j.getValue());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.protobuf.Timestamp build = com.google.protobuf.Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        android.content.pm.PackageManager packageManager = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "");
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a2).a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).b(z).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a2 = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.newBuilder().a((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.l.getValue()).a((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.k.getValue());
        this.h.invoke();
        return a2.a("");
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a c = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.newBuilder().a(java.util.UUID.randomUUID().toString()).c(str);
        java.lang.String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a a2 = c.b(str2).a((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) this.j.getValue());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.protobuf.Timestamp build = com.google.protobuf.Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        android.content.pm.PackageManager packageManager = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "");
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a2).a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a(com.plaid.internal.N2.k kVar, com.plaid.internal.D6.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
        java.lang.String queryParameter = companion.get(kVar.f).queryParameter(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
        java.lang.String queryParameter2 = companion.get(kVar.f).queryParameter("oauthNonce");
        java.lang.String str = null;
        if (queryParameter == null || !kotlin.text.StringsKt.startsWith$default(queryParameter, "link-", false, 2, (java.lang.Object) null)) {
            queryParameter = "";
        }
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a2 = a();
        com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a a3 = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder().b(aVar.f5770a).a(queryParameter);
        com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a newBuilder = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder();
        try {
            android.net.Uri parse = android.net.Uri.parse(aVar.f5770a);
            if (parse != null) {
                str = parse.getQueryParameter("oauth_state_id");
            }
        } catch (java.lang.Exception unused) {
        }
        if (str == null) {
            str = "";
        }
        com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a b = newBuilder.b(str);
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest build = a2.a(a3.a(b.a(queryParameter2))).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
