package com.paypal.oslo.feature.settings.legal.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/domain/usecase/GetLegalScreenItemsUseCase;", "", "Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;", "repository", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "stringsProvider", "<init>", "(Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;)V", "", "Lcom/paypal/oslo/feature/settings/legal/domain/model/LegalItem;", "invoke", "()Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetLegalScreenItemsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetLegalScreenItemsUseCase(com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository legalRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = legalRepository;
        this.getHighSpeedVideoSizes = settingsStringsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.paypal.oslo.feature.settings.legal.domain.model.LegalItem] */
    public final java.util.List<com.paypal.oslo.feature.settings.legal.domain.model.LegalItem> invoke() {
        java.util.List<java.util.Map.Entry> list = kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI.getLegalLinks().entrySet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : list) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.lang.Integer legalTitleStringResId = com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper.INSTANCE.getLegalTitleStringResId(str);
            if (legalTitleStringResId != null) {
                java.lang.Integer legalSubtitleStringResId = com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper.INSTANCE.getLegalSubtitleStringResId(str);
                com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider = this.getHighSpeedVideoSizes;
                r5 = new com.paypal.oslo.feature.settings.legal.domain.model.LegalItem(str, settingsStringsProvider.stringValue(legalTitleStringResId.intValue()), legalSubtitleStringResId != null ? settingsStringsProvider.stringValue(legalSubtitleStringResId.intValue()) : null, str2);
            }
            if (r5 != null) {
                arrayList.add(r5);
            }
        }
        return arrayList;
    }
}
