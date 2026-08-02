package com.paypal.oslo.app.telemetry.companion;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/telemetry/companion/TelemetryConfigSectionFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/app/telemetry/companion/TelemetryConfigSectionFieldResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Lcom/paypal/oslo/app/telemetry/companion/TelemetryConfigSectionFieldResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TelemetryConfigSectionFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory INSTANCE = new com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory();

    private TelemetryConfigSectionFactory() {
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.SECTION_ID, "Telemetry", "Configure telemetry settings", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory.$r8$lambda$V5NZqam2v8zFbztwb4tjmuJwkpY(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GlyPDZRTNlsR0Oiki1Q8IEo3cE4(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver telemetryConfigSectionFieldResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        java.lang.Object defaultValue = telemetryConfigSectionFieldResolver.defaultValue(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_ENVIRONMENT_FIELD_ID, java.lang.Boolean.TRUE);
        java.lang.Boolean bool = defaultValue instanceof java.lang.Boolean ? (java.lang.Boolean) defaultValue : null;
        final boolean booleanValue = bool != null ? bool.booleanValue() : true;
        configSectionBuilder.booleanField(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_ENVIRONMENT_FIELD_ID, booleanValue, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory.$r8$lambda$TiShic0SRy6QgXb2kFlNPj_rFy4(booleanValue, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TiShic0SRy6QgXb2kFlNPj_rFy4(boolean z, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("Use Adobe Production Environment");
        configFieldBuilder.description("Toggle On to use Production. Toggle Off to use Staging.");
        configFieldBuilder.value(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V5NZqam2v8zFbztwb4tjmuJwkpY(final com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver telemetryConfigSectionFieldResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(telemetryConfigSectionFieldResolver);
        configSectionBuilder.subSection(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_SUB_SECTION_ID, "Adobe", "Configure Adobe Settings", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFactory.$r8$lambda$GlyPDZRTNlsR0Oiki1Q8IEo3cE4(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
