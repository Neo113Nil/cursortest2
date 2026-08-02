package com.paypal.oslo.app.environment.companion;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/environment/companion/EnvironmentSectionFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/app/environment/companion/EnvironmentConfigSectionResolver;", "envResolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Lcom/paypal/oslo/app/environment/companion/EnvironmentConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnvironmentSectionFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory INSTANCE = new com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory();

    private EnvironmentSectionFactory() {
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver envResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(envResolver, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section("environment", "Environment Configuration", "Configure application environment settings", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory.$r8$lambda$bzOSmiLhqHCicKXOtMHAebwmVqI(com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RYiq7lMjBPRaoyO2vW1tEjMB1YM(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("Environment URL");
        configFieldBuilder.description("The URL for the environment");
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
        java.lang.String str = (java.lang.String) (resolver != null ? resolver.defaultValue(com.paypal.oslo.core.companion.domain.EnvironmentSectionConstants.ENVIRONMENT_URL_FIELD_ID, null) : null);
        if (str == null) {
            str = com.paypal.oslo.app.environment.Environment.Production.INSTANCE.getBaseUrl();
        }
        configFieldBuilder.value(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bzOSmiLhqHCicKXOtMHAebwmVqI(com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver environmentConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(environmentConfigSectionResolver);
        configSectionBuilder.stringField(com.paypal.oslo.core.companion.domain.EnvironmentSectionConstants.ENVIRONMENT_URL_FIELD_ID, com.paypal.oslo.app.environment.Environment.Production.INSTANCE.getBaseUrl(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.environment.companion.EnvironmentSectionFactory.$r8$lambda$RYiq7lMjBPRaoyO2vW1tEjMB1YM((com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
