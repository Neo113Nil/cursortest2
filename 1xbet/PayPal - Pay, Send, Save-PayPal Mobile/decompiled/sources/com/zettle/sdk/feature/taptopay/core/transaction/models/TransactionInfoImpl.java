package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001a\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u001e\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfoImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/util/UUID;", "p0", "", "p1", "p2", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "p3", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;", "p4", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "p5", "<init>", "(Ljava/util/UUID;JJLcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "mutate$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getAmount", "()J", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getGratuity", "getHighSpeedVideoFpsRanges", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;", "getPaymentConfiguration", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "getPaymentProperties", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "getHighSpeedVideoSizesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReference", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getOutputFormats"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionInfoImpl extends com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.UUID getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats;

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getId, reason: from getter */
    public final java.util.UUID getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getAmount, reason: from getter */
    public final long getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getGratuity, reason: from getter */
    public final long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getReference, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getPaymentConfiguration, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    /* renamed from: getPaymentProperties, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public TransactionInfoImpl(java.util.UUID uuid, long j, long j2, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration paymentConfiguration, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProperties, "");
        this.getHighSpeedVideoSizes = uuid;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getOutputFormats = tapToPayReference;
        this.getHighSpeedVideoFpsRanges = paymentConfiguration;
        this.Camera2StreamConfigurationMap = paymentProperties;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo mutate$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfoImpl(getGetHighSpeedVideoSizes(), getGetHighSpeedVideoFpsRangesFor(), getGetHighResolutionOutputSizeshNQ4ISI(), p0, getGetHighSpeedVideoFpsRanges(), getCamera2StreamConfigurationMap());
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo mutate$core_publicRelease(com.zettle.sdk.feature.taptopay.core.models.CvmLimits p0) {
        com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        copy = r1.copy((r22 & 1) != 0 ? r1.merchantInfo : null, (r22 & 2) != 0 ? r1.currency : null, (r22 & 4) != 0 ? r1.currencyId : null, (r22 & 8) != 0 ? r1.countryId : null, (r22 & 16) != 0 ? r1.minAmountAllowed : 0L, (r22 & 32) != 0 ? r1.maxAmountAllowed : 0L, (r22 & 64) != 0 ? r1.isPinSupported : false, (r22 & 128) != 0 ? getGetHighSpeedVideoFpsRanges().cvmLimits : p0);
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfoImpl(getGetHighSpeedVideoSizes(), getGetHighSpeedVideoFpsRangesFor(), getGetHighResolutionOutputSizeshNQ4ISI(), getGetOutputFormats(), copy, getCamera2StreamConfigurationMap());
    }
}
