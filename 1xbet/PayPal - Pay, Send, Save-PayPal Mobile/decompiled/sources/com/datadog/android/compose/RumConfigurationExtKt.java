package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/datadog/android/rum/RumConfiguration$Builder;", "enableComposeActionTracking", "(Lcom/datadog/android/rum/RumConfiguration$Builder;)Lcom/datadog/android/rum/RumConfiguration$Builder;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumConfigurationExtKt {
    public static final com.datadog.android.rum.RumConfiguration.Builder enableComposeActionTracking(com.datadog.android.rum.RumConfiguration.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.datadog.android.rum._RumInternalProxy.INSTANCE.setComposeActionTrackingStrategy(builder, new com.datadog.android.compose.internal.ComposeActionTrackingStrategy(null, 1, null));
        return builder;
    }
}
