package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AdvIdentifiersResult {
    public final io.appmetrica.analytics.AdvIdentifiersResult.AdvId googleAdvId;
    public final io.appmetrica.analytics.AdvIdentifiersResult.AdvId huaweiAdvId;
    public final io.appmetrica.analytics.AdvIdentifiersResult.AdvId yandexAdvId;

    public static class AdvId {
        public final java.lang.String advId;
        public final io.appmetrica.analytics.AdvIdentifiersResult.Details details;
        public final java.lang.String errorExplanation;

        public AdvId(java.lang.String str, io.appmetrica.analytics.AdvIdentifiersResult.Details details, java.lang.String str2) {
            this.advId = str;
            this.details = details;
            this.errorExplanation = str2;
        }
    }

    public enum Details {
        OK,
        IDENTIFIER_PROVIDER_UNAVAILABLE,
        INVALID_ADV_ID,
        FEATURE_DISABLED,
        INTERNAL_ERROR,
        FORBIDDEN_BY_CLIENT_CONFIG
    }

    public AdvIdentifiersResult(io.appmetrica.analytics.AdvIdentifiersResult.AdvId advId, io.appmetrica.analytics.AdvIdentifiersResult.AdvId advId2, io.appmetrica.analytics.AdvIdentifiersResult.AdvId advId3) {
        this.googleAdvId = advId;
        this.huaweiAdvId = advId2;
        this.yandexAdvId = advId3;
    }
}
