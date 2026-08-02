package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Key"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DescriptorSchemaCache {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<kotlinx.serialization.descriptors.SerialDescriptor, java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object>> Camera2StreamConfigurationMap = kotlinx.serialization.json.internal.CreateMapForCacheKt.createMapForCache(16);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "T", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Key<T> {
    }

    public final <T> void set(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.Map<kotlinx.serialization.descriptors.SerialDescriptor, java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object>> map = this.Camera2StreamConfigurationMap;
        java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = kotlinx.serialization.json.internal.CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }

    public final <T> T getOrPut(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        T t = (T) get(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        set(descriptor, key, invoke);
        return invoke;
    }

    public final <T> T get(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object> map = this.Camera2StreamConfigurationMap.get(descriptor);
        T t = map != null ? (T) map.get(key) : null;
        if (t == null) {
            return null;
        }
        return t;
    }
}
