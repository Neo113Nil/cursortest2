package coil3;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/util/Logger;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "(Lcoil3/util/Logger;)Lkotlinx/coroutines/CoroutineScope;", "Lcoil3/ComponentRegistry$Builder;", "Lcoil3/RealImageLoader$Options;", "options", "addServiceLoaderComponents", "(Lcoil3/ComponentRegistry$Builder;Lcoil3/RealImageLoader$Options;)Lcoil3/ComponentRegistry$Builder;", "addCommonComponents", "(Lcoil3/ComponentRegistry$Builder;)Lcoil3/ComponentRegistry$Builder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealImageLoaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes(coil3.content.Logger logger) {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(new coil3.RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, logger)));
    }

    public static final coil3.ComponentRegistry.Builder addServiceLoaderComponents(coil3.ComponentRegistry.Builder builder, coil3.RealImageLoader.Options options) {
        if (coil3.ImageLoadersKt.getServiceLoaderEnabled(options)) {
            builder.addFetcherFactories(new kotlin.jvm.functions.Function0() { // from class: coil3.RealImageLoaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.List highSpeedVideoSizes;
                    highSpeedVideoSizes = coil3.RealImageLoaderKt.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            });
            builder.addDecoderFactories(new kotlin.jvm.functions.Function0() { // from class: coil3.RealImageLoaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.List highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = coil3.RealImageLoaderKt.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
            });
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoSizes() {
        kotlin.reflect.KClass type;
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(coil3.content.ServiceLoaderComponentRegistry.INSTANCE.getFetchers(), new java.util.Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$0$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((coil3.content.FetcherServiceLoaderTarget) t2).priority()), java.lang.Integer.valueOf(((coil3.content.FetcherServiceLoaderTarget) t).priority()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = sortedWith.size();
        for (int i = 0; i < size; i++) {
            coil3.content.FetcherServiceLoaderTarget fetcherServiceLoaderTarget = (coil3.content.FetcherServiceLoaderTarget) sortedWith.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(fetcherServiceLoaderTarget, "");
            coil3.fetch.Fetcher.Factory factory = fetcherServiceLoaderTarget.factory();
            kotlin.Pair pair = (factory == null || (type = fetcherServiceLoaderTarget.type()) == null) ? null : kotlin.TuplesKt.to(factory, type);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRanges() {
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(coil3.content.ServiceLoaderComponentRegistry.INSTANCE.getDecoders(), new java.util.Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$1$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((coil3.content.DecoderServiceLoaderTarget) t2).priority()), java.lang.Integer.valueOf(((coil3.content.DecoderServiceLoaderTarget) t).priority()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = sortedWith.size();
        for (int i = 0; i < size; i++) {
            coil3.decode.Decoder.Factory factory = ((coil3.content.DecoderServiceLoaderTarget) sortedWith.get(i)).factory();
            if (factory != null) {
                arrayList.add(factory);
            }
        }
        return arrayList;
    }

    public static final coil3.ComponentRegistry.Builder addCommonComponents(coil3.ComponentRegistry.Builder builder) {
        return builder.add(new coil3.map.StringMapper(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)).add(new coil3.map.PathMapper(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(okio.Path.class)).add(new coil3.key.FileUriKeyer(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class)).add(new coil3.key.UriKeyer(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class)).add(new coil3.fetch.FileUriFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class)).add(new coil3.fetch.ByteArrayFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class)).add(new coil3.fetch.DataUriFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class)).add(new coil3.fetch.BitmapFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.graphics.Bitmap.class));
    }
}
