package kotlinx.serialization.json.internal;

/* compiled from: SchemaCache.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00072\u0006\u0010\u000e\u001a\u0002H\u000bH\u0086\u0002¢\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012¢\u0006\u0002\u0010\u0013J0\u0010\u0014\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0015R6\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "map", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "Lkotlinx/serialization/json/internal/DescriptorData;", "set", "", "T", "descriptor", com.ironsource.X3.i.W, "value", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "Key", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DescriptorSchemaCache {
    private final java.util.Map<kotlinx.serialization.descriptors.SerialDescriptor, java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object>> map = kotlinx.serialization.json.internal.CreateMapForCacheKt.createMapForCache(16);

    /* compiled from: SchemaCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "T", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key<T> {
    }

    public final <T> void set(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.Map<kotlinx.serialization.descriptors.SerialDescriptor, java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object>> map = this.map;
        java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = kotlinx.serialization.json.internal.CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }

    public final <T> T getOrPut(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) get(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        set(descriptor, key, invoke);
        return invoke;
    }

    public final <T> T get(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.util.Map<kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.Object>, java.lang.Object> map = this.map.get(descriptor);
        java.lang.Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }
}
