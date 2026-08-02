package com.paypal.oslo.core.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a@\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "T", "", "", "Lcom/paypal/oslo/core/navigation/NavigationMetadataKey;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/util/Map;Lcom/paypal/oslo/core/navigation/NavigationMetadataKey;Ljava/lang/Object;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavigationMetadataKeysKt {
    public static final <T> void set(java.util.Map<java.lang.String, java.lang.Object> map, com.paypal.oslo.core.navigation.NavigationMetadataKey<T> navigationMetadataKey, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationMetadataKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        map.put(navigationMetadataKey.toString(), t);
    }
}
