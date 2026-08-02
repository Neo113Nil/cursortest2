package com.paypal.oslo.feature.settings.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/repository/LegalRepositoryImpl;", "Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;)V", "", "", "getLegalLinks", "()Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalRepositoryImpl implements com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LegalRepositoryImpl(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = settingsDynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository
    public final java.util.Map<java.lang.String, java.lang.String> getLegalLinks() {
        return this.getHighSpeedVideoFpsRanges.getLegalLinks();
    }
}
