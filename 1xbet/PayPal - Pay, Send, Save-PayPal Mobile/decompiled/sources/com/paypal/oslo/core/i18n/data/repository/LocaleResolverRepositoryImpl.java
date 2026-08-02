package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/LocaleResolverRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;", "assetMetadata", "<init>", "(Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;)V", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "getLocaleResolverMetadata", "()Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleResolverRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LocaleResolverRepositoryImpl(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata localeResolverAssetMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverAssetMetadata, "");
        this.getHighSpeedVideoFpsRanges = localeResolverAssetMetadata;
    }

    @Override // com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository
    public final com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData getLocaleResolverMetadata() {
        return this.getHighSpeedVideoFpsRanges.getLocaleResolverMetadata();
    }
}
