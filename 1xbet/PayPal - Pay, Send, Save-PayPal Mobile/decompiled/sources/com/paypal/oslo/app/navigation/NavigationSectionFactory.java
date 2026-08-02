package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/navigation/NavigationSectionFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/app/navigation/NavigationConfigSectionResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Lcom/paypal/oslo/app/navigation/NavigationConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationSectionFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.navigation.NavigationSectionFactory INSTANCE = new com.paypal.oslo.app.navigation.NavigationSectionFactory();

    private NavigationSectionFactory() {
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final com.paypal.oslo.app.navigation.NavigationConfigSectionResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section$default("navigation", "Navigation", null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.navigation.NavigationSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.navigation.NavigationSectionFactory.$r8$lambda$d6IDjLCS3IsLwcCzCY_HcTcNZm4(com.paypal.oslo.app.navigation.NavigationConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6S3wN9ybY_CtZKKo2y8d6Masme0(com.paypal.oslo.app.navigation.NavigationConfigSectionResolver navigationConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("Always Show SMB Flow");
        configFieldBuilder.description("When enabled, show SMB bottom navigation destinations");
        java.lang.Object defaultValue = navigationConfigSectionResolver.defaultValue(com.paypal.oslo.core.companion.domain.NavigationSectionConstants.ALWAYS_SHOW_SMB_FLOW_FIELD_ID, null);
        java.lang.Boolean bool = defaultValue instanceof java.lang.Boolean ? (java.lang.Boolean) defaultValue : null;
        configFieldBuilder.value(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d6IDjLCS3IsLwcCzCY_HcTcNZm4(final com.paypal.oslo.app.navigation.NavigationConfigSectionResolver navigationConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(navigationConfigSectionResolver);
        configSectionBuilder.booleanField(com.paypal.oslo.core.companion.domain.NavigationSectionConstants.ALWAYS_SHOW_SMB_FLOW_FIELD_ID, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.navigation.NavigationSectionFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.navigation.NavigationSectionFactory.$r8$lambda$6S3wN9ybY_CtZKKo2y8d6Masme0(com.paypal.oslo.app.navigation.NavigationConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
