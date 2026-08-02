package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/collection/LruCacheKt$lruCache$4;", "Landroidx/collection/LruCache;", "key", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class LruCacheKt$lruCache$4<K, V> extends androidx.collection.LruCache<K, V> {
    final /* synthetic */ kotlin.jvm.functions.Function1<K, V> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<K, V, java.lang.Integer> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> function2, kotlin.jvm.functions.Function1<? super K, ? extends V> function1, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> function4) {
        super(i);
        this.getHighSpeedVideoFpsRanges = function2;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = function4;
    }

    @Override // androidx.collection.LruCache
    protected final int sizeOf(K key, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.getHighSpeedVideoFpsRanges.invoke(key, value).intValue();
    }

    @Override // androidx.collection.LruCache
    protected final V create(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.Camera2StreamConfigurationMap.invoke(key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "");
        this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Boolean.valueOf(evicted), key, oldValue, newValue);
    }
}
