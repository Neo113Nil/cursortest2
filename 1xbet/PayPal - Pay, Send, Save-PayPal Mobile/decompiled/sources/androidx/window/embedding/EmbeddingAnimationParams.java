package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0002 !B1\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationParams;", "", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "p0", "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "p1", "p2", "p3", "<init>", "(Landroidx/window/embedding/EmbeddingAnimationBackground;Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "animationBackground", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "getAnimationBackground", "()Landroidx/window/embedding/EmbeddingAnimationBackground;", "openAnimation", "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "getOpenAnimation", "()Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "closeAnimation", "getCloseAnimation", "changeAnimation", "getChangeAnimation", "AnimationSpec", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddingAnimationParams {
    private final androidx.window.embedding.EmbeddingAnimationBackground animationBackground;
    private final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec changeAnimation;
    private final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec closeAnimation;
    private final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec openAnimation;

    private EmbeddingAnimationParams(androidx.window.embedding.EmbeddingAnimationBackground embeddingAnimationBackground, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec2, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec3) {
        this.animationBackground = embeddingAnimationBackground;
        this.openAnimation = animationSpec;
        this.closeAnimation = animationSpec2;
        this.changeAnimation = animationSpec3;
    }

    public final androidx.window.embedding.EmbeddingAnimationBackground getAnimationBackground() {
        return this.animationBackground;
    }

    public final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getOpenAnimation() {
        return this.openAnimation;
    }

    public final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getCloseAnimation() {
        return this.closeAnimation;
    }

    public final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getChangeAnimation() {
        return this.changeAnimation;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "", "", "p0", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimationSpec {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.Companion INSTANCE = new androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.Companion(null);
        public static final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec DEFAULT = new androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec(0);
        public static final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec JUMP_CUT = new androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec(1);
        private final int value;

        private AnimationSpec(int i) {
            this.value = i;
        }

        /* renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            int i = this.value;
            if (i == 0) {
                return "DEFAULT";
            }
            if (i == 1) {
                return "JUMP_CUT";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown value: ");
            sb.append(this.value);
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec) && this.value == ((androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec) other).value;
        }

        public final int hashCode() {
            return this.value * 31;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "getAnimationSpecFromValue$window_release", "(I)Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "DEFAULT", "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "JUMP_CUT"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getAnimationSpecFromValue$window_release(int value) {
                if (value == androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue()) {
                    return androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT;
                }
                if (value == androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.JUMP_CUT.getValue()) {
                    return androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.JUMP_CUT;
                }
                throw new java.lang.IllegalArgumentException("Undefined value:".concat(java.lang.String.valueOf(value)));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.animationBackground.hashCode();
        return (((((hashCode * 31) + this.openAnimation.hashCode()) * 31) + this.closeAnimation.hashCode()) * 31) + this.changeAnimation.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.EmbeddingAnimationParams)) {
            return false;
        }
        androidx.window.embedding.EmbeddingAnimationParams embeddingAnimationParams = (androidx.window.embedding.EmbeddingAnimationParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.animationBackground, embeddingAnimationParams.animationBackground) && kotlin.jvm.internal.Intrinsics.areEqual(this.openAnimation, embeddingAnimationParams.openAnimation) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeAnimation, embeddingAnimationParams.closeAnimation) && kotlin.jvm.internal.Intrinsics.areEqual(this.changeAnimation, embeddingAnimationParams.changeAnimation);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddingAnimationParams:{animationBackground=");
        sb.append(this.animationBackground);
        sb.append(", openAnimation=");
        sb.append(this.openAnimation);
        sb.append(", closeAnimation=");
        sb.append(this.closeAnimation);
        sb.append(", changeAnimation=");
        sb.append(this.changeAnimation);
        sb.append(" }");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationParams$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/EmbeddingAnimationBackground;", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "setAnimationBackground", "(Landroidx/window/embedding/EmbeddingAnimationBackground;)Landroidx/window/embedding/EmbeddingAnimationParams$Builder;", "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "spec", "setOpenAnimation", "(Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;)Landroidx/window/embedding/EmbeddingAnimationParams$Builder;", "setCloseAnimation", "setChangeAnimation", "Landroidx/window/embedding/EmbeddingAnimationParams;", "build", "()Landroidx/window/embedding/EmbeddingAnimationParams;", "getHighSpeedVideoFpsRanges", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/window/embedding/EmbeddingAnimationParams$AnimationSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAnimationBackground getHighResolutionOutputSizeshNQ4ISI = androidx.window.embedding.EmbeddingAnimationBackground.DEFAULT;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getHighSpeedVideoFpsRanges = androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec getHighSpeedVideoSizes = androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec Camera2StreamConfigurationMap = androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT;

        public final androidx.window.embedding.EmbeddingAnimationParams.Builder setAnimationBackground(androidx.window.embedding.EmbeddingAnimationBackground background) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(background, "");
            this.getHighResolutionOutputSizeshNQ4ISI = background;
            return this;
        }

        public final androidx.window.embedding.EmbeddingAnimationParams.Builder setOpenAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec spec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
            this.getHighSpeedVideoFpsRanges = spec;
            return this;
        }

        public final androidx.window.embedding.EmbeddingAnimationParams.Builder setCloseAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec spec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
            this.getHighSpeedVideoSizes = spec;
            return this;
        }

        public final androidx.window.embedding.EmbeddingAnimationParams.Builder setChangeAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec spec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
            this.Camera2StreamConfigurationMap = spec;
            return this;
        }

        public final androidx.window.embedding.EmbeddingAnimationParams build() {
            return new androidx.window.embedding.EmbeddingAnimationParams(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null);
        }
    }

    public /* synthetic */ EmbeddingAnimationParams(androidx.window.embedding.EmbeddingAnimationBackground embeddingAnimationBackground, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec2, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec animationSpec3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(embeddingAnimationBackground, animationSpec, animationSpec2, animationSpec3);
    }
}
