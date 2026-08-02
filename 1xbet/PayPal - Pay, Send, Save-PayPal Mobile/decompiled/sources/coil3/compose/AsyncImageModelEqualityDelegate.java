package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImageModelEqualityDelegate;", "", "self", "other", "", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "hashCode", "(Ljava/lang/Object;)I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AsyncImageModelEqualityDelegate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.compose.AsyncImageModelEqualityDelegate.Companion INSTANCE = coil3.compose.AsyncImageModelEqualityDelegate.Companion.getHighSpeedVideoSizes;
    public static final coil3.compose.AsyncImageModelEqualityDelegate Default = new coil3.compose.AsyncImageModelEqualityDelegate() { // from class: coil3.compose.AsyncImageModelEqualityDelegate$Companion$Default$1
        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public final boolean equals(java.lang.Object self, java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(self instanceof coil3.view.ImageRequest) || !(other instanceof coil3.view.ImageRequest)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(self, other);
            }
            coil3.view.ImageRequest imageRequest = (coil3.view.ImageRequest) self;
            coil3.view.ImageRequest imageRequest2 = (coil3.view.ImageRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getContext(), imageRequest2.getContext()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getData(), imageRequest2.getData()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getMemoryCacheKey(), imageRequest2.getMemoryCacheKey()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getMemoryCacheKeyExtras(), imageRequest2.getMemoryCacheKeyExtras()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getDiskCacheKey(), imageRequest2.getDiskCacheKey()) && kotlin.jvm.internal.Intrinsics.areEqual(imageRequest.getSizeResolver(), imageRequest2.getSizeResolver()) && imageRequest.getScale() == imageRequest2.getScale() && imageRequest.getPrecision() == imageRequest2.getPrecision();
        }

        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public final int hashCode(java.lang.Object self) {
            if (!(self instanceof coil3.view.ImageRequest)) {
                if (self != null) {
                    return self.hashCode();
                }
                return 0;
            }
            coil3.view.ImageRequest imageRequest = (coil3.view.ImageRequest) self;
            int hashCode = imageRequest.getContext().hashCode();
            int hashCode2 = imageRequest.getData().hashCode();
            java.lang.String memoryCacheKey = imageRequest.getMemoryCacheKey();
            int hashCode3 = memoryCacheKey != null ? memoryCacheKey.hashCode() : 0;
            int hashCode4 = imageRequest.getMemoryCacheKeyExtras().hashCode();
            java.lang.String diskCacheKey = imageRequest.getDiskCacheKey();
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31) + imageRequest.getSizeResolver().hashCode()) * 31) + imageRequest.getScale().hashCode()) * 31) + imageRequest.getPrecision().hashCode();
        }

        public final java.lang.String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    };
    public static final coil3.compose.AsyncImageModelEqualityDelegate AllProperties = new coil3.compose.AsyncImageModelEqualityDelegate() { // from class: coil3.compose.AsyncImageModelEqualityDelegate$Companion$AllProperties$1
        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public final boolean equals(java.lang.Object self, java.lang.Object other) {
            return kotlin.jvm.internal.Intrinsics.areEqual(self, other);
        }

        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public final int hashCode(java.lang.Object self) {
            if (self != null) {
                return self.hashCode();
            }
            return 0;
        }

        public final java.lang.String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    };

    boolean equals(java.lang.Object self, java.lang.Object other);

    int hashCode(java.lang.Object self);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0014\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImageModelEqualityDelegate$Companion;", "", "<init>", "()V", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "Default", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "AllProperties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ coil3.compose.AsyncImageModelEqualityDelegate.Companion getHighSpeedVideoSizes = new coil3.compose.AsyncImageModelEqualityDelegate.Companion();

        private Companion() {
        }
    }
}
