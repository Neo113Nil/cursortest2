package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
public interface StorageManager {
    <T> T compute(kotlin.jvm.functions.Function0<? extends T> function0);

    <K, V> kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    <K, V> kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues<K, V> createCacheWithNullableValues();

    <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValue(kotlin.jvm.functions.Function0<? extends T> function0);

    <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValueWithPostCompute(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends T> function1, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12);

    <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction(kotlin.jvm.functions.Function1<? super K, ? extends V> function1);

    <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(kotlin.jvm.functions.Function1<? super K, ? extends V> function1);

    <T> kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<T> createNullableLazyValue(kotlin.jvm.functions.Function0<? extends T> function0);

    <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createRecursionTolerantLazyValue(kotlin.jvm.functions.Function0<? extends T> function0, T t);
}
