package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationHerdAnalyticsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationHerdAnalytics;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "old", "new", "", "track", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRanges", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "", "", "getHighSpeedVideoSizes", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationHerdAnalyticsImpl implements com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalytics {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.Long> getHighSpeedVideoSizes;

    public AttestationHerdAnalyticsImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.getHighSpeedVideoFpsRanges = analytics;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalytics
    public final void track(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State old, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State r12) {
        java.lang.Long l;
        java.lang.String str;
        java.lang.Long l2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(old, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        if ((old instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle) && (r12 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress)) {
            java.lang.String obj = com.zettle.sdk.commons.UUIDFactory.createUUID1().toString();
            this.getHighSpeedVideoFpsRangesFor = obj;
            if (!this.getHighSpeedVideoSizes.containsKey(obj)) {
                java.util.Map<java.lang.String, java.lang.Long> map = this.getHighSpeedVideoSizes;
                java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                map.put(str2, java.lang.Long.valueOf(com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime()));
            }
        }
        boolean z = old instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress;
        if (z && (r12 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded) && (str = this.getHighSpeedVideoFpsRangesFor) != null && (l2 = (java.lang.Long) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoSizes).remove(str)) != null) {
            this.getHighSpeedVideoFpsRanges.dispatch(new com.zettle.sdk.analytics.Herd.Event(com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation.INSTANCE, l2.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), com.zettle.sdk.analytics.Herd.Result.Success.INSTANCE));
        }
        if (z && (r12 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed)) {
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed) r12;
            java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
            if (str3 == null || (l = (java.lang.Long) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoSizes).remove(str3)) == null) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.dispatch(new com.zettle.sdk.analytics.Herd.Event(com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation.INSTANCE, l.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), new com.zettle.sdk.analytics.Herd.Result.Failure(failed.getReason().toString())));
        }
    }
}
