package com.paypal.oslo.feature.debitcard.shared.domain.cache;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "availableFundingOptions", "", "putAvailableFundingOptions", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;)V", "", "selectedFundingSourceId", "putSelectedFundingSourceId", "(Ljava/lang/String;)V", "getAvailableFundingOptions", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "getSelectedFundingSourceId", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "getSelectedFundingSource", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "invalidateAll", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebitCardFundingOptionsCache {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DebitCardFundingOptionsCache() {
    }

    public final void putAvailableFundingOptions(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingOptions) {
        synchronized (this) {
            this.Camera2StreamConfigurationMap = availableFundingOptions;
        }
    }

    public final void putSelectedFundingSourceId(java.lang.String selectedFundingSourceId) {
        synchronized (this) {
            this.getHighResolutionOutputSizeshNQ4ISI = selectedFundingSourceId;
        }
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingOptions() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions;
        synchronized (this) {
            debitCardAvailableFundingOptions = this.Camera2StreamConfigurationMap;
        }
        return debitCardAvailableFundingOptions;
    }

    public final java.lang.String getSelectedFundingSourceId() {
        java.lang.String str;
        synchronized (this) {
            str = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getSelectedFundingSource(java.lang.String selectedFundingSourceId) {
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> fundingSources;
        synchronized (this) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = null;
            if (selectedFundingSourceId == null) {
                return null;
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions = this.Camera2StreamConfigurationMap;
            if (debitCardAvailableFundingOptions != null && (fundingSources = debitCardAvailableFundingOptions.getFundingSources()) != null) {
                java.util.Iterator<T> it = fundingSources.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) next).getId(), selectedFundingSourceId)) {
                        debitCardFundingSource = next;
                        break;
                    }
                }
                debitCardFundingSource = debitCardFundingSource;
            }
            return debitCardFundingSource;
        }
    }

    public final void invalidateAll() {
        synchronized (this) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }
}
