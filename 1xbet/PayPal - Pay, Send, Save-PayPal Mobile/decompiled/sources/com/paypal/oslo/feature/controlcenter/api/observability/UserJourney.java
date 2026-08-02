package com.paypal.oslo.feature.controlcenter.api.observability;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "", "", "journeyId", "<init>", "(Ljava/lang/String;)V", "message", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "error", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserJourney {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.Companion INSTANCE = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public UserJourney(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError error$default(com.paypal.oslo.feature.controlcenter.api.observability.UserJourney userJourney, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 8) != 0) {
            th = null;
        }
        return userJourney.error(str, str2, map, th);
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError error(java.lang.String message, java.lang.String failure, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        return new com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError(message, INSTANCE.buildAttributes(this.getHighSpeedVideoFpsRanges, failure, attributes), error);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney$Companion;", "", "<init>", "()V", "", "journeyId", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", "callerAttributes", "buildAttributes", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.util.Map buildAttributes$default(com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.Companion companion, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return companion.buildAttributes(str, str2, map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> buildAttributes(java.lang.String journeyId, java.lang.String failure, java.util.Map<java.lang.String, ? extends java.lang.Object> callerAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journeyId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerAttributes, "");
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            createMapBuilder.putAll(callerAttributes);
            createMapBuilder.put("user_journey", journeyId);
            createMapBuilder.put(com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, failure);
            return kotlin.collections.MapsKt.build(createMapBuilder);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
