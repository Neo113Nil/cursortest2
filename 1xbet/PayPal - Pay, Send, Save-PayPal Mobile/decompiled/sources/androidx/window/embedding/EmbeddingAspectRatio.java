package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/window/embedding/EmbeddingAspectRatio;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription$window_release", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue$window_release", "()F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddingAspectRatio {
    private final java.lang.String description;
    private final float value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.EmbeddingAspectRatio.Companion INSTANCE = new androidx.window.embedding.EmbeddingAspectRatio.Companion(null);
    public static final androidx.window.embedding.EmbeddingAspectRatio ALWAYS_ALLOW = new androidx.window.embedding.EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);
    public static final androidx.window.embedding.EmbeddingAspectRatio ALWAYS_DISALLOW = new androidx.window.embedding.EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    private EmbeddingAspectRatio(java.lang.String str, float f) {
        this.description = str;
        this.value = f;
    }

    /* renamed from: getDescription$window_release, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: getValue$window_release, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddingAspectRatio(");
        sb.append(this.description);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.EmbeddingAspectRatio)) {
            return false;
        }
        androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio = (androidx.window.embedding.EmbeddingAspectRatio) other;
        return this.value == embeddingAspectRatio.value && kotlin.jvm.internal.Intrinsics.areEqual(this.description, embeddingAspectRatio.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (java.lang.Float.hashCode(this.value) * 31);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingAspectRatio$Companion;", "", "<init>", "()V", "", "ratio", "Landroidx/window/embedding/EmbeddingAspectRatio;", "(F)Landroidx/window/embedding/EmbeddingAspectRatio;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "buildAspectRatioFromValue$window_release", "ALWAYS_ALLOW", "Landroidx/window/embedding/EmbeddingAspectRatio;", "ALWAYS_DISALLOW"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.EmbeddingAspectRatio ratio(float ratio) {
            if (ratio <= 1.0f) {
                throw new java.lang.IllegalArgumentException("Ratio must be greater than 1.".toString());
            }
            return new androidx.window.embedding.EmbeddingAspectRatio("ratio:".concat(java.lang.String.valueOf(ratio)), ratio, null);
        }

        public final androidx.window.embedding.EmbeddingAspectRatio buildAspectRatioFromValue$window_release(float value) {
            if (value == androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_ALLOW.getValue()) {
                return androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_ALLOW;
            }
            if (value == androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_DISALLOW.getValue()) {
                return androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_DISALLOW;
            }
            return ratio(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.EmbeddingAspectRatio ratio(float f) {
        return INSTANCE.ratio(f);
    }

    public /* synthetic */ EmbeddingAspectRatio(java.lang.String str, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f);
    }
}
