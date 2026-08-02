package com.plaid.internal;

/* loaded from: classes16.dex */
public final class l8 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(java.lang.String str) {
        super(0);
        this.f6480a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration invoke() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a newBuilder = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.newBuilder();
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a newBuilder2 = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.newBuilder();
        java.lang.String str = this.f6480a;
        if (str == null) {
            str = "";
        }
        return newBuilder.a(newBuilder2.a(str).build()).build();
    }
}
