package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfigImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "", "p0", "Lcom/zettle/sdk/commons/network/NetworkClient;", "p1", "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/commons/network/NetworkClient;)V", "mutate$core_publicRelease", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getConversationContext$core_publicRelease", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/network/NetworkClient;", "getNetwork$core_publicRelease", "()Lcom/zettle/sdk/commons/network/NetworkClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionConfigImpl extends com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.NetworkClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig
    /* renamed from: getConversationContext$core_publicRelease, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig
    /* renamed from: getNetwork$core_publicRelease, reason: from getter */
    public final com.zettle.sdk.commons.network.NetworkClient getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public TransactionConfigImpl(java.lang.String str, com.zettle.sdk.commons.network.NetworkClient networkClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = networkClient;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig mutate$core_publicRelease(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfigImpl(p0, getGetHighSpeedVideoFpsRangesFor());
    }
}
