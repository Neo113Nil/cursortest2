package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/window/embedding/OverlayAttributes;", "", "Landroidx/window/embedding/EmbeddingBounds;", "bounds", "<init>", "(Landroidx/window/embedding/EmbeddingBounds;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/window/embedding/EmbeddingBounds;", "getBounds", "()Landroidx/window/embedding/EmbeddingBounds;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayAttributes {
    private final androidx.window.embedding.EmbeddingBounds bounds;

    public OverlayAttributes(androidx.window.embedding.EmbeddingBounds embeddingBounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBounds, "");
        this.bounds = embeddingBounds;
    }

    public /* synthetic */ OverlayAttributes(androidx.window.embedding.EmbeddingBounds embeddingBounds, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.window.embedding.EmbeddingBounds.BOUNDS_EXPANDED : embeddingBounds);
    }

    public final androidx.window.embedding.EmbeddingBounds getBounds() {
        return this.bounds;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OverlayAttributes: {bounds=");
        sb.append(this.bounds);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.window.embedding.OverlayAttributes) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bounds, ((androidx.window.embedding.OverlayAttributes) other).bounds);
        }
        return false;
    }

    public final int hashCode() {
        return this.bounds.hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/window/embedding/OverlayAttributes$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/EmbeddingBounds;", "bounds", "setBounds", "(Landroidx/window/embedding/EmbeddingBounds;)Landroidx/window/embedding/OverlayAttributes$Builder;", "Landroidx/window/embedding/OverlayAttributes;", "build", "()Landroidx/window/embedding/OverlayAttributes;", "getHighSpeedVideoSizes", "Landroidx/window/embedding/EmbeddingBounds;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingBounds getHighSpeedVideoFpsRanges = androidx.window.embedding.EmbeddingBounds.BOUNDS_EXPANDED;

        public final androidx.window.embedding.OverlayAttributes.Builder setBounds(androidx.window.embedding.EmbeddingBounds bounds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
            this.getHighSpeedVideoFpsRanges = bounds;
            return this;
        }

        public final androidx.window.embedding.OverlayAttributes build() {
            return new androidx.window.embedding.OverlayAttributes(this.getHighSpeedVideoFpsRanges);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayAttributes() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
