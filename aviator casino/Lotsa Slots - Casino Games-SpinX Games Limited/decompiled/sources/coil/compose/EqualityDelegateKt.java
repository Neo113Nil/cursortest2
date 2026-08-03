package coil.compose;

/* compiled from: EqualityDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DefaultModelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "getDefaultModelEqualityDelegate", "()Lcoil/compose/EqualityDelegate;", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EqualityDelegateKt {
    private static final coil.compose.EqualityDelegate DefaultModelEqualityDelegate = new coil.compose.EqualityDelegate() { // from class: coil.compose.EqualityDelegateKt$DefaultModelEqualityDelegate$1
        @Override // coil.compose.EqualityDelegate
        public boolean equals(java.lang.Object self, java.lang.Object other) {
            if (self == other) {
                return true;
            }
            if (!(self instanceof coil.request.ImageRequest) || !(other instanceof coil.request.ImageRequest)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(self, other);
            }
            coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) self;
            coil.request.ImageRequest imageRequest2 = (coil.request.ImageRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getContext(), imageRequest2.getContext()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getData(), imageRequest2.getData()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getPlaceholderMemoryCacheKey(), imageRequest2.getPlaceholderMemoryCacheKey()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getMemoryCacheKey(), imageRequest2.getMemoryCacheKey()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getDiskCacheKey(), imageRequest2.getDiskCacheKey()) && imageRequest.getBitmapConfig() == imageRequest2.getBitmapConfig() && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getColorSpace(), imageRequest2.getColorSpace()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getTransformations(), imageRequest2.getTransformations()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getHeaders(), imageRequest2.getHeaders()) && imageRequest.getAllowConversionToBitmap() == imageRequest2.getAllowConversionToBitmap() && imageRequest.getAllowHardware() == imageRequest2.getAllowHardware() && imageRequest.getAllowRgb565() == imageRequest2.getAllowRgb565() && imageRequest.getPremultipliedAlpha() == imageRequest2.getPremultipliedAlpha() && imageRequest.getMemoryCachePolicy() == imageRequest2.getMemoryCachePolicy() && imageRequest.getDiskCachePolicy() == imageRequest2.getDiskCachePolicy() && imageRequest.getNetworkCachePolicy() == imageRequest2.getNetworkCachePolicy() && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getSizeResolver(), imageRequest2.getSizeResolver()) && imageRequest.getScale() == imageRequest2.getScale() && imageRequest.getPrecision() == imageRequest2.getPrecision() && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getParameters(), imageRequest2.getParameters());
        }

        @Override // coil.compose.EqualityDelegate
        public int hashCode(java.lang.Object self) {
            if (!(self instanceof coil.request.ImageRequest)) {
                if (self != null) {
                    return self.hashCode();
                }
                return 0;
            }
            coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) self;
            int hashCode = ((imageRequest.getContext().hashCode() * 31) + imageRequest.getData().hashCode()) * 31;
            coil.memory.MemoryCache.Key placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            int hashCode2 = (hashCode + (placeholderMemoryCacheKey != null ? placeholderMemoryCacheKey.hashCode() : 0)) * 31;
            coil.memory.MemoryCache.Key memoryCacheKey = imageRequest.getMemoryCacheKey();
            int hashCode3 = (hashCode2 + (memoryCacheKey != null ? memoryCacheKey.hashCode() : 0)) * 31;
            java.lang.String diskCacheKey = imageRequest.getDiskCacheKey();
            int hashCode4 = (((hashCode3 + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31) + imageRequest.getBitmapConfig().hashCode()) * 31;
            android.graphics.ColorSpace colorSpace = imageRequest.getColorSpace();
            return ((((((((((((((((((((((((((hashCode4 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + imageRequest.getTransformations().hashCode()) * 31) + imageRequest.getHeaders().hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(imageRequest.getAllowConversionToBitmap())) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(imageRequest.getAllowHardware())) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(imageRequest.getAllowRgb565())) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(imageRequest.getPremultipliedAlpha())) * 31) + imageRequest.getMemoryCachePolicy().hashCode()) * 31) + imageRequest.getDiskCachePolicy().hashCode()) * 31) + imageRequest.getNetworkCachePolicy().hashCode()) * 31) + imageRequest.getSizeResolver().hashCode()) * 31) + imageRequest.getScale().hashCode()) * 31) + imageRequest.getPrecision().hashCode()) * 31) + imageRequest.getParameters().hashCode();
        }
    };

    public static final coil.compose.EqualityDelegate getDefaultModelEqualityDelegate() {
        return DefaultModelEqualityDelegate;
    }
}
