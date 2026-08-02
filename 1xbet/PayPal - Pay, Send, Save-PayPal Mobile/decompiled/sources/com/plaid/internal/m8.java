package com.plaid.internal;

/* loaded from: classes16.dex */
public final class m8 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.n8 f6499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.plaid.internal.n8 n8Var) {
        super(0);
        this.f6499a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata invoke() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a newBuilder = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.newBuilder();
        com.plaid.internal.n8 n8Var = this.f6499a;
        newBuilder.a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_ANDROID);
        newBuilder.c(n8Var.f6510a);
        newBuilder.a();
        newBuilder.b(n8Var.e);
        newBuilder.a(n8Var.g);
        if (n8Var.b != null) {
            newBuilder.a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_REACTNATIVEANDROID).a(n8Var.b).build());
        }
        if (n8Var.c != null) {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_FLUTTERANDROID).a(n8Var.c).build();
        }
        return newBuilder.build();
    }
}
