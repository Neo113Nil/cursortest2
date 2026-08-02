package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J\u0014\u0010\u0017\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0019\u0010\u001a\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u0013H\u0000¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u0013H\u0002J\u0014\u0010 \u001a\u00020!*\u00020\u00132\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u001c\u0010#\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020!H\u0002J\u001d\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/window/embedding/ActivityEmbeddingOptionsImpl;", "", "<init>", "()V", "KEY_EMBEDDING_BOUNDS", "", "KEY_EMBEDDING_BOUNDS_ALIGNMENT", "KEY_EMBEDDING_BOUNDS_WIDTH", "KEY_EMBEDDING_BOUNDS_HEIGHT", "DIMENSION_TYPE_EXPANDED", "DIMENSION_TYPE_HINGE", "DIMENSION_TYPE_RATIO", "DIMENSION_TYPE_PIXEL", "KEY_EMBEDDING_BOUNDS_DIMENSION_TYPE", "KEY_EMBEDDING_BOUNDS_DIMENSION_VALUE", "KEY_ACTIVITY_STACK_ALIGNMENT", "setOverlayCreateParams", "", "options", "Landroid/os/Bundle;", "overlayCreateParams", "Landroidx/window/embedding/OverlayCreateParams;", "setOverlayCreateParams$window_release", "putEmbeddingBounds", "embeddingBounds", "Landroidx/window/embedding/EmbeddingBounds;", "putActivityStackAlignment", "putActivityStackAlignment$window_release", "getOverlayAttributes", "Landroidx/window/embedding/OverlayAttributes;", "getOverlayAttributes$window_release", "getEmbeddingBounds", "getDimension", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "key", "putDimension", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_DIMENSION, "setActivityStackToken", "activityStackToken", "Landroidx/window/extensions/embedding/ActivityStack$Token;", "setActivityStackToken$window_release", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityEmbeddingOptionsImpl {
    public static final androidx.window.embedding.ActivityEmbeddingOptionsImpl INSTANCE = new androidx.window.embedding.ActivityEmbeddingOptionsImpl();

    private ActivityEmbeddingOptionsImpl() {
    }

    public final void setOverlayCreateParams$window_release(android.os.Bundle options, androidx.window.embedding.OverlayCreateParams overlayCreateParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayCreateParams, "");
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(8);
        options.putString("androidx.window.extensions.embedding.OverlayTag", overlayCreateParams.getTag());
        androidx.window.embedding.EmbeddingBounds bounds = overlayCreateParams.getOverlayAttributes().getBounds();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("androidx.window.embedding.EmbeddingBounds.alignment", bounds.getAlignment().getValue());
        getHighSpeedVideoFpsRanges(bundle, "androidx.window.embedding.EmbeddingBounds.width", bounds.getWidth());
        getHighSpeedVideoFpsRanges(bundle, "androidx.window.embedding.EmbeddingBounds.height", bounds.getHeight());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        options.putBundle("androidx.window.embedding.EmbeddingBounds", bundle);
    }

    public final void putActivityStackAlignment$window_release(android.os.Bundle bundle, androidx.window.embedding.EmbeddingBounds embeddingBounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBounds, "");
        bundle.putInt("androidx.window.embedding.ActivityStackAlignment", embeddingBounds.getAlignment().getValue());
    }

    private static androidx.window.embedding.EmbeddingBounds.Dimension getHighSpeedVideoFpsRanges(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(bundle2);
        java.lang.String string = bundle2.getString("androidx.window.embedding.EmbeddingBounds.dimension_type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1939100487:
                    if (string.equals("expanded")) {
                        return androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED;
                    }
                    break;
                case 99283243:
                    if (string.equals("hinge")) {
                        return androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE;
                    }
                    break;
                case 106680966:
                    if (string.equals("pixel")) {
                        return androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.pixel(bundle2.getInt("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
                case 108285963:
                    if (string.equals("ratio")) {
                        return androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.ratio(bundle2.getFloat("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
            }
        }
        throw new java.lang.IllegalArgumentException("Illegal type ".concat(java.lang.String.valueOf(string)));
    }

    private static void getHighSpeedVideoFpsRanges(android.os.Bundle bundle, java.lang.String str, androidx.window.embedding.EmbeddingBounds.Dimension dimension) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (kotlin.jvm.internal.Intrinsics.areEqual(dimension, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED)) {
            bundle2.putString("androidx.window.embedding.EmbeddingBounds.dimension_type", "expanded");
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(dimension, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            bundle2.putString("androidx.window.embedding.EmbeddingBounds.dimension_type", "hinge");
        } else if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) {
            bundle2.putString("androidx.window.embedding.EmbeddingBounds.dimension_type", "ratio");
            bundle2.putFloat("androidx.window.embedding.EmbeddingBounds.dimension_value", ((androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) dimension).getValue());
        } else if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) {
            bundle2.putString("androidx.window.embedding.EmbeddingBounds.dimension_type", "pixel");
            bundle2.putInt("androidx.window.embedding.EmbeddingBounds.dimension_value", ((androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) dimension).getValue());
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        bundle.putBundle(str, bundle2);
    }

    public final void setActivityStackToken$window_release(android.os.Bundle options, androidx.window.extensions.embedding.ActivityStack.Token activityStackToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStackToken, "");
        options.putBundle("androidx.window.extensions.embedding.ActivityStackToken", activityStackToken.toBundle());
    }

    public final androidx.window.embedding.OverlayAttributes getOverlayAttributes$window_release(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle bundle2 = bundle.getBundle("androidx.window.embedding.EmbeddingBounds");
        androidx.window.embedding.EmbeddingBounds embeddingBounds = bundle2 == null ? null : new androidx.window.embedding.EmbeddingBounds(new androidx.window.embedding.EmbeddingBounds.Alignment(bundle2.getInt("androidx.window.embedding.EmbeddingBounds.alignment")), getHighSpeedVideoFpsRanges(bundle2, "androidx.window.embedding.EmbeddingBounds.width"), getHighSpeedVideoFpsRanges(bundle2, "androidx.window.embedding.EmbeddingBounds.height"));
        if (embeddingBounds == null) {
            return null;
        }
        return new androidx.window.embedding.OverlayAttributes(embeddingBounds);
    }
}
