package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¼\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032$\b\u0006\u0010\u0007\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u001b\b\u0006\u0010\t\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b2<\b\u0006\u0010\r\u001a6\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Landroidx/collection/LruCache;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LruCacheKt {
    public static /* synthetic */ androidx.collection.LruCache lruCache$default(int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new kotlin.jvm.functions.Function2<K, V, java.lang.Integer>() { // from class: androidx.collection.LruCacheKt$lruCache$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Integer invoke(K k, V v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                    return 1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke((androidx.collection.LruCacheKt$lruCache$1<K, V>) obj2, obj3);
                }
            };
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<K, V>() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K k) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            function4 = new kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit>() { // from class: androidx.collection.LruCacheKt$lruCache$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke(bool.booleanValue(), (boolean) obj2, obj3, obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(boolean z, K k, V v, V v2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        return new androidx.collection.LruCacheKt$lruCache$4(i, function2, function1, function4);
    }

    public static final <K, V> androidx.collection.LruCache<K, V> lruCache(int i, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> function2, kotlin.jvm.functions.Function1<? super K, ? extends V> function1, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        return new androidx.collection.LruCacheKt$lruCache$4(i, function2, function1, function4);
    }
}
