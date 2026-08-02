package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"Landroidx/window/embedding/EmbeddingConfiguration;", "", "Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "p0", "", "p1", "<init>", "(Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "dimAreaBehavior", "Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "getDimAreaBehavior", "()Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "isAutoSaveEmbeddingState", "Z", "()Z", "DimAreaBehavior", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddingConfiguration {
    private final androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior dimAreaBehavior;
    private final boolean isAutoSaveEmbeddingState;

    private EmbeddingConfiguration(androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior dimAreaBehavior, boolean z) {
        this.dimAreaBehavior = dimAreaBehavior;
        this.isAutoSaveEmbeddingState = z;
    }

    public final androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior getDimAreaBehavior() {
        return this.dimAreaBehavior;
    }

    /* renamed from: isAutoSaveEmbeddingState, reason: from getter */
    public final boolean getIsAutoSaveEmbeddingState() {
        return this.isAutoSaveEmbeddingState;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "", "", "p0", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DimAreaBehavior {
        private final int value;
        public static final androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior UNDEFINED = new androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior(0);
        public static final androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior ON_ACTIVITY_STACK = new androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior(1);
        public static final androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior ON_TASK = new androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior(2);

        private DimAreaBehavior(int i) {
            this.value = i;
        }

        /* renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str;
            int i = this.value;
            if (i == 0) {
                str = "UNDEFINED";
            } else if (i == 1) {
                str = "ON_ACTIVITY_STACK";
            } else if (i == 2) {
                str = "ON_TASK";
            } else {
                str = "UNKNOWN";
            }
            return "DimAreaBehavior=".concat(str);
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.EmbeddingConfiguration)) {
            return false;
        }
        androidx.window.embedding.EmbeddingConfiguration embeddingConfiguration = (androidx.window.embedding.EmbeddingConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dimAreaBehavior, embeddingConfiguration.dimAreaBehavior) && this.isAutoSaveEmbeddingState == embeddingConfiguration.isAutoSaveEmbeddingState;
    }

    public final int hashCode() {
        return (this.dimAreaBehavior.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAutoSaveEmbeddingState);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddingConfiguration{dimArea=");
        sb.append(this.dimAreaBehavior);
        sb.append(", saveState=");
        sb.append(this.isAutoSaveEmbeddingState);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/window/embedding/EmbeddingConfiguration$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "area", "setDimAreaBehavior", "(Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;)Landroidx/window/embedding/EmbeddingConfiguration$Builder;", "", "saveState", "setAutoSaveEmbeddingState", "(Z)Landroidx/window/embedding/EmbeddingConfiguration$Builder;", "Landroidx/window/embedding/EmbeddingConfiguration;", "build", "()Landroidx/window/embedding/EmbeddingConfiguration;", "getHighSpeedVideoSizes", "Landroidx/window/embedding/EmbeddingConfiguration$DimAreaBehavior;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior getHighSpeedVideoFpsRanges = androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior.UNDEFINED;

        public final androidx.window.embedding.EmbeddingConfiguration.Builder setDimAreaBehavior(androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior area) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(area, "");
            this.getHighSpeedVideoFpsRanges = area;
            return this;
        }

        public final androidx.window.embedding.EmbeddingConfiguration.Builder setAutoSaveEmbeddingState(boolean saveState) {
            this.getHighSpeedVideoFpsRangesFor = saveState;
            return this;
        }

        public final androidx.window.embedding.EmbeddingConfiguration build() {
            return new androidx.window.embedding.EmbeddingConfiguration(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null);
        }
    }

    public /* synthetic */ EmbeddingConfiguration(androidx.window.embedding.EmbeddingConfiguration.DimAreaBehavior dimAreaBehavior, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dimAreaBehavior, z);
    }
}
