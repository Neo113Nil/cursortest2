package com.zettle.sdk.feature.taptopay.core.transaction.analytics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionHerdAnalyticsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionHerdAnalytics;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "", "isBackendOrNetworkError$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)Z", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "old", "new", "", "track", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoSizes", "", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionHerdAnalyticsImpl implements com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalytics {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Long> getHighSpeedVideoFpsRanges;

    public TransactionHerdAnalyticsImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.getHighSpeedVideoSizes = analytics;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalytics
    public final void track(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State old, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State r12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(old, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        if ((old instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction) && (r12 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing)) {
            java.lang.String obj = ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) r12).getInfo().getGetHighSpeedVideoSizes().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            if (!this.getHighSpeedVideoFpsRanges.containsKey(obj)) {
                this.getHighSpeedVideoFpsRanges.put(obj, java.lang.Long.valueOf(com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime()));
            }
        }
        if (((old instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) || (old instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature) || (old instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature)) && (r12 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved)) {
            java.lang.String obj2 = ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved) r12).getInfo().getGetHighSpeedVideoSizes().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            java.lang.Long remove = this.getHighSpeedVideoFpsRanges.remove(obj2);
            if (remove != null) {
                this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Herd.Event(com.zettle.sdk.analytics.Herd.Type.TapToPayPayment.INSTANCE, remove.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), com.zettle.sdk.analytics.Herd.Result.Success.INSTANCE));
            }
        }
        if ((old instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) || !(r12 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
            return;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) r12;
        com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info = failed.getInfo();
        java.lang.Long remove2 = this.getHighSpeedVideoFpsRanges.remove(java.lang.String.valueOf(info != null ? info.getGetHighSpeedVideoSizes() : null));
        if (remove2 == null || !isBackendOrNetworkError$core_publicRelease(failed.getReason())) {
            return;
        }
        this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Herd.Event(com.zettle.sdk.analytics.Herd.Type.TapToPayPayment.INSTANCE, remove2.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), new com.zettle.sdk.analytics.Herd.Result.Failure(failed.getReason().toString())));
    }

    public final boolean isBackendOrNetworkError$core_publicRelease(com.zettle.sdk.feature.taptopay.core.FailureReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError ? ((com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError) reason).getError() == null : (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout) || (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError);
    }
}
