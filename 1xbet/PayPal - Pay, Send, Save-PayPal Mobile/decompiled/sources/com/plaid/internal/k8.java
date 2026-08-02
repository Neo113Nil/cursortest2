package com.plaid.internal;

/* loaded from: classes16.dex */
public final class k8 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.n8 f6465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.plaid.internal.n8 n8Var) {
        super(0);
        com.plaid.internal.O4 o4 = com.plaid.internal.O4.f5870a;
        this.f6465a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata invoke() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a newBuilder = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.newBuilder();
        com.plaid.internal.O4 o4 = com.plaid.internal.O4.f5870a;
        com.plaid.internal.n8 n8Var = this.f6465a;
        newBuilder.d(com.plaid.internal.O4.c);
        newBuilder.e(com.plaid.internal.O4.d);
        newBuilder.f(com.plaid.internal.O4.h);
        newBuilder.g(com.plaid.internal.O4.g);
        newBuilder.c(((java.util.Locale) n8Var.i.getValue()).toLanguageTag());
        newBuilder.a(((java.util.Locale) n8Var.i.getValue()).getCountry());
        newBuilder.b(((java.util.Locale) n8Var.i.getValue()).getLanguage());
        newBuilder.b(com.plaid.internal.O4.k);
        newBuilder.a(com.plaid.internal.O4.j);
        return newBuilder.build();
    }
}
