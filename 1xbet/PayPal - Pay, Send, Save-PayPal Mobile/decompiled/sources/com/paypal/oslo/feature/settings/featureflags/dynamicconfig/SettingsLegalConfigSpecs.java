package com.paypal.oslo.feature.settings.featureflags.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R3\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsLegalConfigSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "legalLinks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getLegalLinks", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "getLegalLinks$annotations", "legalLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsLegalConfigSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsLegalConfigSpecs INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsLegalConfigSpecs.class, "legalLinks", "getLegalLinks()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: legalLinks$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty legalLinks;

    public static /* synthetic */ void getLegalLinks$annotations() {
    }

    private SettingsLegalConfigSpecs() {
        super("settings", "legal_links");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.util.Map<java.lang.String, java.lang.String>> getLegalLinks() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) legalLinks.getValue(this, getHighSpeedVideoSizes[0]);
    }

    static {
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsLegalConfigSpecs settingsLegalConfigSpecs = new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsLegalConfigSpecs();
        INSTANCE = settingsLegalConfigSpecs;
        legalLinks = settingsLegalConfigSpecs.create(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("license_agreement", "https://www.paypalobjects.com/webstatic/wallet/LegalAgreements/%251$s.html"), kotlin.TuplesKt.to("user_agreement", "https://www.paypal.com/%251$s/webapps/mpp/ua/useragreement-full?locale.x=%252$s"), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.AnnotationPrivacyPolicy, "https://www.paypal.com/%251$s/webapps/mpp/ua/privacy-full?locale.x=%252$s"), kotlin.TuplesKt.to("acknowledgements", "https://www.paypalobjects.com/webstatic/wallet/misc/android-attr-%251$s.html")), "legal_links");
        $stable = 8;
    }
}
