package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\b\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/TransactionMetadata;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "metadata", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TransactionMetadata {
    private final java.util.Map<java.lang.String, java.lang.String> metadata;

    private TransactionMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
        this.metadata = map;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/TransactionMetadata$Builder;", "", "<init>", "()V", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addMetadata", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/TransactionMetadata$Builder;", "Lcom/zettle/sdk/TransactionMetadata;", "build", "()Lcom/zettle/sdk/TransactionMetadata;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes = 20;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRangesFor = 40;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap = 500;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

        public final com.zettle.sdk.TransactionMetadata.Builder addMetadata(java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            int size = this.getHighSpeedVideoFpsRanges.size();
            int i = this.getHighSpeedVideoSizes;
            if (size >= i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot add more than ");
                sb.append(i);
                sb.append(" metadata entries");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (key.length() == 0 || key.length() > this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalArgumentException("key must not be empty and length must be at most ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor)));
            }
            if (value.length() == 0 || value.length() > this.Camera2StreamConfigurationMap) {
                throw new java.lang.IllegalArgumentException("value must not be empty and length must be at most ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap)));
            }
            this.getHighSpeedVideoFpsRanges.put(key, value);
            return this;
        }

        public final com.zettle.sdk.TransactionMetadata build() {
            return new com.zettle.sdk.TransactionMetadata(kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRanges), null);
        }
    }

    public /* synthetic */ TransactionMetadata(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
