package com.paypal.oslo.app.pds;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/pds/PdsSectionFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/app/pds/PdsConfigSectionResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Lcom/paypal/oslo/app/pds/PdsConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "", "PDS_SECTION_ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PdsSectionFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.pds.PdsSectionFactory INSTANCE = new com.paypal.oslo.app.pds.PdsSectionFactory();
    public static final java.lang.String PDS_SECTION_ID = "pdsConfig";

    private PdsSectionFactory() {
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final com.paypal.oslo.app.pds.PdsConfigSectionResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section$default(PDS_SECTION_ID, "PDS Config", null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.pds.PdsSectionFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.pds.PdsSectionFactory.$r8$lambda$6ylQUSxeZXNrx7jsPqj5xiFAz1g(com.paypal.oslo.app.pds.PdsConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ylQUSxeZXNrx7jsPqj5xiFAz1g(final com.paypal.oslo.app.pds.PdsConfigSectionResolver pdsConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(pdsConfigSectionResolver);
        configSectionBuilder.booleanField(com.paypal.oslo.app.pds.PdsConfigSectionResolver.PDS_COMPONENT_HIGHLIGHT_FIELD_ID, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.pds.PdsSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.pds.PdsSectionFactory.m11079$r8$lambda$EYwJS5rkIeV4NQYAJ0_niHzPpA(com.paypal.oslo.app.pds.PdsConfigSectionResolver.this, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EYwJS-5rkIeV4NQYAJ0_niHzPpA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11079$r8$lambda$EYwJS5rkIeV4NQYAJ0_niHzPpA(com.paypal.oslo.app.pds.PdsConfigSectionResolver pdsConfigSectionResolver, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name("PDS Component Highlight");
        configFieldBuilder.description("When enabled, draws debug borders around PDS components");
        java.lang.Object defaultValue = pdsConfigSectionResolver.defaultValue(com.paypal.oslo.app.pds.PdsConfigSectionResolver.PDS_COMPONENT_HIGHLIGHT_FIELD_ID, null);
        java.lang.Boolean bool = defaultValue instanceof java.lang.Boolean ? (java.lang.Boolean) defaultValue : null;
        configFieldBuilder.value(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return kotlin.Unit.INSTANCE;
    }
}
