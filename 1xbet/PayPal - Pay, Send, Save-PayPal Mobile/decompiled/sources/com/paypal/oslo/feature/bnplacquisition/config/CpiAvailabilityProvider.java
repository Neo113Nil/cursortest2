package com.paypal.oslo.feature.bnplacquisition.config;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "configContext", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig;", "supportedCpisConfig", "Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig;Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/FeatureGateManager;)V", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;", "availableCpiTypes", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "(Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "availableCpis", "type", "", "isCpiTypeEnabled", "(Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;)Z", "cpiFor", "(Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "hasAnyCpisAvailable", "()Z", "hasMultipleCpisAvailable", "p0", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig;", "Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CpiAvailabilityProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CpiAvailabilityProvider(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig supportedCpisConfig, com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpisConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.Camera2StreamConfigurationMap = configContext;
        this.getHighSpeedVideoSizes = supportedCpisConfig;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes(com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> supportedCpiTypes = this.getHighSpeedVideoSizes.supportedCpiTypes(country);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : supportedCpiTypes) {
            if (getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> availableCpis(com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes = availableCpiTypes(country);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = availableCpiTypes.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpiFor = this.getHighSpeedVideoSizes.cpiFor((com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType) it.next(), country);
            if (cpiFor != null) {
                arrayList.add(cpiFor);
            }
        }
        return arrayList;
    }

    public final boolean isCpiTypeEnabled(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return this.getHighSpeedVideoSizes.supports(type, this.Camera2StreamConfigurationMap.getCountry()) && getHighSpeedVideoFpsRangesFor(type);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpiFor(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return this.getHighSpeedVideoSizes.cpiFor(type, this.Camera2StreamConfigurationMap.getCountry());
    }

    public final boolean hasAnyCpisAvailable() {
        return !availableCpis().isEmpty();
    }

    public final boolean hasMultipleCpisAvailable() {
        return availableCpis().size() > 1;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType p0) {
        int i = com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRangesFor.isLongTermCpiEnabled();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoFpsRangesFor.isShortTermCpiEnabled();
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> availableCpiTypes() {
        return availableCpiTypes(this.Camera2StreamConfigurationMap.getCountry());
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> availableCpis() {
        return availableCpis(this.Camera2StreamConfigurationMap.getCountry());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.LONG_TERM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.SHORT_TERM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
