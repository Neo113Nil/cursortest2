package com.datadog.android.internal.attributes;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003"}, d2 = {"Lcom/datadog/android/internal/attributes/LocalAttribute;", "", "Constant", "Key"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LocalAttribute {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/internal/attributes/LocalAttribute$Constant;", "", "Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "getKey", "()Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "key"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Constant {
        com.datadog.android.internal.attributes.LocalAttribute.Key getKey();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "CREATION_SAMPLING_RATE", "REPORTING_SAMPLING_RATE", "VIEW_SCOPE_INSTRUMENTATION_TYPE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Key {
        CREATION_SAMPLING_RATE("_dd.local.head_sampling_rate_key"),
        REPORTING_SAMPLING_RATE("_dd.local.tail_sampling_rate_key"),
        VIEW_SCOPE_INSTRUMENTATION_TYPE("_dd.local.view_instrumentation_type_key");


        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        Key(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
