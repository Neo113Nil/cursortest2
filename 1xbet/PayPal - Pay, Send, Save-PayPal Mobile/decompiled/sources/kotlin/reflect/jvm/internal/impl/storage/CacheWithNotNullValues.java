package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
public interface CacheWithNotNullValues<K, V> {
    V computeIfAbsent(K k, kotlin.jvm.functions.Function0<? extends V> function0);
}
