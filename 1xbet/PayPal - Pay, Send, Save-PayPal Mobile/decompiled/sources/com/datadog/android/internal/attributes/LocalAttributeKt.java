package com.datadog.android.internal.attributes;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"", "", "", "Lcom/datadog/android/internal/attributes/LocalAttribute$Constant;", "attribute", "enrichWithConstantAttribute", "(Ljava/util/Map;Lcom/datadog/android/internal/attributes/LocalAttribute$Constant;)Ljava/util/Map;", "Lcom/datadog/android/internal/attributes/LocalAttribute$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "enrichWithLocalAttribute", "(Ljava/util/Map;Lcom/datadog/android/internal/attributes/LocalAttribute$Key;Ljava/lang/Object;)Ljava/util/Map;", "enrichWithNonNullAttribute"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalAttributeKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> enrichWithConstantAttribute(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.android.internal.attributes.LocalAttribute.Constant constant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constant, "");
        return enrichWithLocalAttribute(map, constant.getKey(), constant);
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> enrichWithNonNullAttribute(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.android.internal.attributes.LocalAttribute.Key key, java.lang.Object obj) {
        java.util.Map<java.lang.String, java.lang.Object> enrichWithLocalAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (obj == null || (enrichWithLocalAttribute = enrichWithLocalAttribute(map, key, obj)) == null) ? map : enrichWithLocalAttribute;
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> enrichWithLocalAttribute(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.android.internal.attributes.LocalAttribute.Key key, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        map.put(key.toString(), obj);
        return map;
    }
}
