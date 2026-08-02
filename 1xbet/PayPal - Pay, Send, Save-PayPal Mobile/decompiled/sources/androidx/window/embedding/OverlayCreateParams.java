package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/window/embedding/OverlayCreateParams;", "", "", "tag", "Landroidx/window/embedding/OverlayAttributes;", "overlayAttributes", "<init>", "(Ljava/lang/String;Landroidx/window/embedding/OverlayAttributes;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTag", "Landroidx/window/embedding/OverlayAttributes;", "getOverlayAttributes", "()Landroidx/window/embedding/OverlayAttributes;", "Companion", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayCreateParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.OverlayCreateParams.Companion INSTANCE = new androidx.window.embedding.OverlayCreateParams.Companion(null);
    private final androidx.window.embedding.OverlayAttributes overlayAttributes;
    private final java.lang.String tag;

    public OverlayCreateParams(java.lang.String str, androidx.window.embedding.OverlayAttributes overlayAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayAttributes, "");
        this.tag = str;
        this.overlayAttributes = overlayAttributes;
    }

    public /* synthetic */ OverlayCreateParams(java.lang.String str, androidx.window.embedding.OverlayAttributes overlayAttributes, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INSTANCE.generateOverlayTag() : str, (i & 2) != 0 ? new androidx.window.embedding.OverlayAttributes.Builder().build() : overlayAttributes);
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final androidx.window.embedding.OverlayAttributes getOverlayAttributes() {
        return this.overlayAttributes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.embedding.OverlayCreateParams.class).getSimpleName());
        sb.append(":{ , tag=");
        sb.append(this.tag);
        sb.append(", attrs=");
        sb.append(this.overlayAttributes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/window/embedding/OverlayCreateParams$Builder;", "", "<init>", "()V", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/window/embedding/OverlayCreateParams$Builder;", "Landroidx/window/embedding/OverlayAttributes;", "attrs", "setOverlayAttributes", "(Landroidx/window/embedding/OverlayAttributes;)Landroidx/window/embedding/OverlayCreateParams$Builder;", "Landroidx/window/embedding/OverlayCreateParams;", "build", "()Landroidx/window/embedding/OverlayCreateParams;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/window/embedding/OverlayAttributes;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.window.embedding.OverlayAttributes getHighResolutionOutputSizeshNQ4ISI;

        public final androidx.window.embedding.OverlayCreateParams.Builder setTag(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            this.getHighSpeedVideoFpsRanges = tag;
            return this;
        }

        public final androidx.window.embedding.OverlayCreateParams.Builder setOverlayAttributes(androidx.window.embedding.OverlayAttributes attrs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "");
            this.getHighResolutionOutputSizeshNQ4ISI = attrs;
            return this;
        }

        public final androidx.window.embedding.OverlayCreateParams build() {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                str = androidx.window.embedding.OverlayCreateParams.INSTANCE.generateOverlayTag();
            }
            androidx.window.embedding.OverlayAttributes overlayAttributes = this.getHighResolutionOutputSizeshNQ4ISI;
            if (overlayAttributes == null) {
                overlayAttributes = new androidx.window.embedding.OverlayAttributes.Builder().build();
            }
            return new androidx.window.embedding.OverlayCreateParams(str, overlayAttributes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/window/embedding/OverlayCreateParams$Companion;", "", "<init>", "()V", "", "generateOverlayTag", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String generateOverlayTag() {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return kotlin.text.StringsKt.substring(obj, new kotlin.ranges.IntRange(0, 32));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String generateOverlayTag() {
        return INSTANCE.generateOverlayTag();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
