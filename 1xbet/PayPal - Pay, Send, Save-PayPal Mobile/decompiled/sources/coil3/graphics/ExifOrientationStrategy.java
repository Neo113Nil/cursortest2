package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/decode/ExifOrientationStrategy;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lokio/BufferedSource;", "source", "", "supports", "(Ljava/lang/String;Lokio/BufferedSource;)Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ExifOrientationStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.graphics.ExifOrientationStrategy.Companion INSTANCE = coil3.graphics.ExifOrientationStrategy.Companion.getHighSpeedVideoFpsRangesFor;
    public static final coil3.graphics.ExifOrientationStrategy IGNORE = new coil3.graphics.ExifOrientationStrategy() { // from class: coil3.decode.ExifOrientationStrategy$$ExternalSyntheticLambda0
        @Override // coil3.graphics.ExifOrientationStrategy
        public final boolean supports(java.lang.String str, okio.BufferedSource bufferedSource) {
            return coil3.graphics.ExifOrientationStrategy.$r8$lambda$nG4y_MqyIsHKxfwYzVJOSlsoNko(str, bufferedSource);
        }
    };
    public static final coil3.graphics.ExifOrientationStrategy RESPECT_PERFORMANCE = new coil3.graphics.ExifOrientationStrategy() { // from class: coil3.decode.ExifOrientationStrategy$$ExternalSyntheticLambda1
        @Override // coil3.graphics.ExifOrientationStrategy
        public final boolean supports(java.lang.String str, okio.BufferedSource bufferedSource) {
            return coil3.graphics.ExifOrientationStrategy.$r8$lambda$Yvh_mffU3Xuwn6JErEeZy38Nt7s(str, bufferedSource);
        }
    };
    public static final coil3.graphics.ExifOrientationStrategy RESPECT_ALL = new coil3.graphics.ExifOrientationStrategy() { // from class: coil3.decode.ExifOrientationStrategy$$ExternalSyntheticLambda2
        @Override // coil3.graphics.ExifOrientationStrategy
        public final boolean supports(java.lang.String str, okio.BufferedSource bufferedSource) {
            return coil3.graphics.ExifOrientationStrategy.$r8$lambda$TwZW4FbjbRcNwH15NDv_zN7qd_Q(str, bufferedSource);
        }
    };

    static /* synthetic */ boolean $r8$lambda$TwZW4FbjbRcNwH15NDv_zN7qd_Q(java.lang.String str, okio.BufferedSource bufferedSource) {
        return true;
    }

    static /* synthetic */ boolean $r8$lambda$nG4y_MqyIsHKxfwYzVJOSlsoNko(java.lang.String str, okio.BufferedSource bufferedSource) {
        return false;
    }

    boolean supports(java.lang.String mimeType, okio.BufferedSource source);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0014\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001R\u0014\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/decode/ExifOrientationStrategy$Companion;", "", "<init>", "()V", "Lcoil3/decode/ExifOrientationStrategy;", "IGNORE", "Lcoil3/decode/ExifOrientationStrategy;", "RESPECT_PERFORMANCE", "RESPECT_ALL"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ coil3.graphics.ExifOrientationStrategy.Companion getHighSpeedVideoFpsRangesFor = new coil3.graphics.ExifOrientationStrategy.Companion();

        private Companion() {
        }
    }

    static /* synthetic */ boolean $r8$lambda$Yvh_mffU3Xuwn6JErEeZy38Nt7s(java.lang.String str, okio.BufferedSource bufferedSource) {
        if (str != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str, "image/jpeg") || kotlin.jvm.internal.Intrinsics.areEqual(str, "image/webp") || kotlin.jvm.internal.Intrinsics.areEqual(str, "image/heic") || kotlin.jvm.internal.Intrinsics.areEqual(str, "image/heif");
        }
        return false;
    }
}
