package kotlin.reflect.jvm.internal.impl.resolve.sam;

/* loaded from: classes5.dex */
public final class SamConversionResolverImpl implements kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver {
    private final java.lang.Iterable<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighSpeedVideoSizes;

    public SamConversionResolverImpl(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, java.lang.Iterable<? extends java.lang.Object> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
        this.getHighSpeedVideoSizes = storageManager.createCacheWithNullableValues();
    }
}
