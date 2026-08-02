package com.paypal.oslo.app.network;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/network/NetworkSectionFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/app/network/NetworkConfigSectionResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Lcom/paypal/oslo/app/network/NetworkConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkSectionFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.network.NetworkSectionFactory INSTANCE = new com.paypal.oslo.app.network.NetworkSectionFactory();

    private NetworkSectionFactory() {
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final com.paypal.oslo.app.network.NetworkConfigSectionResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section$default("network", "Network", null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.network.NetworkSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.network.NetworkSectionFactory.$r8$lambda$WFzIMt0KC8lgcxZPcVxi3wLvQ3A(com.paypal.oslo.app.network.NetworkConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CXKHE5fMkIPoZSadzYRtIpQ4YbY(com.paypal.oslo.app.network.NetworkConfigSectionResolver networkConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("Chucker HTTP Inspector");
        configFieldBuilder.description("Enable Chucker for debugging HTTP requests (debug builds only)");
        java.lang.Object defaultValue = networkConfigSectionResolver.defaultValue(com.paypal.oslo.app.network.NetworkConfigSectionResolver.NETWORK_CHUCKER_ENABLED_FIELD_ID, null);
        java.lang.Boolean bool = defaultValue instanceof java.lang.Boolean ? (java.lang.Boolean) defaultValue : null;
        configFieldBuilder.value(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WFzIMt0KC8lgcxZPcVxi3wLvQ3A(final com.paypal.oslo.app.network.NetworkConfigSectionResolver networkConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(networkConfigSectionResolver);
        configSectionBuilder.stringField(com.paypal.oslo.core.companion.domain.NetworkSectionConstants.NETWORK_LOGGING_LEVEL_FIELD_ID, com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.INSTANCE.getDEFAULT().name(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.network.NetworkSectionFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.network.NetworkSectionFactory.$r8$lambda$_kl44XAQb3yldGns8DuBwB4TXR0(com.paypal.oslo.app.network.NetworkConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        configSectionBuilder.booleanField(com.paypal.oslo.app.network.NetworkConfigSectionResolver.NETWORK_CHUCKER_ENABLED_FIELD_ID, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.network.NetworkSectionFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.network.NetworkSectionFactory.$r8$lambda$CXKHE5fMkIPoZSadzYRtIpQ4YbY(com.paypal.oslo.app.network.NetworkConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_kl44XAQb3yldGns8DuBwB4TXR0(com.paypal.oslo.app.network.NetworkConfigSectionResolver networkConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("Logging Level");
        configFieldBuilder.description("The level of detail for network request/response logging");
        java.lang.Object defaultValue = networkConfigSectionResolver.defaultValue(com.paypal.oslo.core.companion.domain.NetworkSectionConstants.NETWORK_LOGGING_LEVEL_FIELD_ID, null);
        java.lang.String str = defaultValue instanceof java.lang.String ? (java.lang.String) defaultValue : null;
        if (str == null) {
            str = com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.INSTANCE.getDEFAULT().name();
        }
        configFieldBuilder.value(str);
        return kotlin.Unit.INSTANCE;
    }
}
