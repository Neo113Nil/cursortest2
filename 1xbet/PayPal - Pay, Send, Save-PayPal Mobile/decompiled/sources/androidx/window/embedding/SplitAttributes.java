package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 &2\u00020\u0001:\u0004'(&)B1\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/window/embedding/SplitAttributes;", "", "Landroidx/window/embedding/SplitAttributes$SplitType;", "p0", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "p1", "Landroidx/window/embedding/EmbeddingAnimationParams;", "p2", "Landroidx/window/embedding/DividerAttributes;", "p3", "<init>", "(Landroidx/window/embedding/SplitAttributes$SplitType;Landroidx/window/embedding/SplitAttributes$LayoutDirection;Landroidx/window/embedding/EmbeddingAnimationParams;Landroidx/window/embedding/DividerAttributes;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "splitType", "Landroidx/window/embedding/SplitAttributes$SplitType;", "getSplitType", "()Landroidx/window/embedding/SplitAttributes$SplitType;", "layoutDirection", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "getLayoutDirection", "()Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "animationParams", "Landroidx/window/embedding/EmbeddingAnimationParams;", "getAnimationParams", "()Landroidx/window/embedding/EmbeddingAnimationParams;", "dividerAttributes", "Landroidx/window/embedding/DividerAttributes;", "getDividerAttributes", "()Landroidx/window/embedding/DividerAttributes;", "Companion", "SplitType", "LayoutDirection", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitAttributes {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "SplitAttributes";
    private final androidx.window.embedding.EmbeddingAnimationParams animationParams;
    private final androidx.window.embedding.DividerAttributes dividerAttributes;
    private final androidx.window.embedding.SplitAttributes.LayoutDirection layoutDirection;
    private final androidx.window.embedding.SplitAttributes.SplitType splitType;

    private SplitAttributes(androidx.window.embedding.SplitAttributes.SplitType splitType, androidx.window.embedding.SplitAttributes.LayoutDirection layoutDirection, androidx.window.embedding.EmbeddingAnimationParams embeddingAnimationParams, androidx.window.embedding.DividerAttributes dividerAttributes) {
        this.splitType = splitType;
        this.layoutDirection = layoutDirection;
        this.animationParams = embeddingAnimationParams;
        this.dividerAttributes = dividerAttributes;
    }

    public final androidx.window.embedding.SplitAttributes.SplitType getSplitType() {
        return this.splitType;
    }

    public final androidx.window.embedding.SplitAttributes.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final androidx.window.embedding.EmbeddingAnimationParams getAnimationParams() {
        return this.animationParams;
    }

    public final androidx.window.embedding.DividerAttributes getDividerAttributes() {
        return this.dividerAttributes;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/window/embedding/SplitAttributes$SplitType;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getDescription$window_release", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue$window_release", "()F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SplitType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.embedding.SplitAttributes.SplitType.Companion INSTANCE;
        public static final androidx.window.embedding.SplitAttributes.SplitType SPLIT_TYPE_EQUAL;
        public static final androidx.window.embedding.SplitAttributes.SplitType SPLIT_TYPE_EXPAND;
        public static final androidx.window.embedding.SplitAttributes.SplitType SPLIT_TYPE_HINGE;
        private final java.lang.String description;
        private final float value;

        public SplitType(java.lang.String str, float f) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
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
            return this.description;
        }

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof androidx.window.embedding.SplitAttributes.SplitType)) {
                return false;
            }
            androidx.window.embedding.SplitAttributes.SplitType splitType = (androidx.window.embedding.SplitAttributes.SplitType) other;
            return this.value == splitType.value && kotlin.jvm.internal.Intrinsics.areEqual(this.description, splitType.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (java.lang.Float.hashCode(this.value) * 31);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000b"}, d2 = {"Landroidx/window/embedding/SplitAttributes$SplitType$Companion;", "", "<init>", "()V", "", "ratio", "Landroidx/window/embedding/SplitAttributes$SplitType;", "(F)Landroidx/window/embedding/SplitAttributes$SplitType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "buildSplitTypeFromValue$window_release", "SPLIT_TYPE_EXPAND", "Landroidx/window/embedding/SplitAttributes$SplitType;", "SPLIT_TYPE_EQUAL", "SPLIT_TYPE_HINGE"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.SplitAttributes.SplitType ratio(final float ratio) {
                androidx.window.core.SpecificationComputer.Companion companion = androidx.window.core.SpecificationComputer.INSTANCE;
                java.lang.String str = androidx.window.embedding.SplitAttributes.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                java.lang.Object compute = androidx.window.core.SpecificationComputer.Companion.startSpecification$default(companion, java.lang.Float.valueOf(ratio), str, androidx.window.core.VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new kotlin.jvm.functions.Function1() { // from class: androidx.window.embedding.SplitAttributes$SplitType$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.window.embedding.SplitAttributes.SplitType.Companion.$r8$lambda$rRaMmZGxKIfVnPQyijskboRzNck(ratio, ((java.lang.Float) obj).floatValue()));
                    }
                }).compute();
                kotlin.jvm.internal.Intrinsics.checkNotNull(compute);
                float floatValue = ((java.lang.Number) compute).floatValue();
                return new androidx.window.embedding.SplitAttributes.SplitType("ratio:".concat(java.lang.String.valueOf(floatValue)), floatValue);
            }

            public final androidx.window.embedding.SplitAttributes.SplitType buildSplitTypeFromValue$window_release(float value) {
                if (value == androidx.window.embedding.SplitAttributes.SplitType.SPLIT_TYPE_EXPAND.getValue()) {
                    return androidx.window.embedding.SplitAttributes.SplitType.SPLIT_TYPE_EXPAND;
                }
                return ratio(value);
            }

            public static /* synthetic */ boolean $r8$lambda$rRaMmZGxKIfVnPQyijskboRzNck(float f, float f2) {
                double d = f;
                return 0.0d <= d && d <= 1.0d && !kotlin.collections.ArraysKt.contains(new java.lang.Float[]{java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f)}, java.lang.Float.valueOf(f));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            androidx.window.embedding.SplitAttributes.SplitType.Companion companion = new androidx.window.embedding.SplitAttributes.SplitType.Companion(null);
            INSTANCE = companion;
            SPLIT_TYPE_EXPAND = new androidx.window.embedding.SplitAttributes.SplitType("expandContainers", 0.0f);
            SPLIT_TYPE_EQUAL = companion.ratio(0.5f);
            SPLIT_TYPE_HINGE = new androidx.window.embedding.SplitAttributes.SplitType("hinge", -1.0f);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.window.embedding.SplitAttributes.SplitType ratio(float f) {
            return INSTANCE.ratio(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f"}, d2 = {"Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutDirection {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection.Companion INSTANCE = new androidx.window.embedding.SplitAttributes.LayoutDirection.Companion(null);
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection LOCALE = new androidx.window.embedding.SplitAttributes.LayoutDirection("LOCALE", 0);
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection LEFT_TO_RIGHT = new androidx.window.embedding.SplitAttributes.LayoutDirection("LEFT_TO_RIGHT", 1);
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection RIGHT_TO_LEFT = new androidx.window.embedding.SplitAttributes.LayoutDirection("RIGHT_TO_LEFT", 2);
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection TOP_TO_BOTTOM = new androidx.window.embedding.SplitAttributes.LayoutDirection("TOP_TO_BOTTOM", 3);
        public static final androidx.window.embedding.SplitAttributes.LayoutDirection BOTTOM_TO_TOP = new androidx.window.embedding.SplitAttributes.LayoutDirection("BOTTOM_TO_TOP", 4);

        private LayoutDirection(java.lang.String str, int i) {
            this.getHighSpeedVideoSizes = str;
            this.value = i;
        }

        /* renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof androidx.window.embedding.SplitAttributes.LayoutDirection)) {
                return false;
            }
            androidx.window.embedding.SplitAttributes.LayoutDirection layoutDirection = (androidx.window.embedding.SplitAttributes.LayoutDirection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, layoutDirection.getHighSpeedVideoSizes) && this.value == layoutDirection.value;
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.value;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Landroidx/window/embedding/SplitAttributes$LayoutDirection$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "getLayoutDirectionFromValue$window_release", "(I)Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "LOCALE", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.SplitAttributes.LayoutDirection getLayoutDirectionFromValue$window_release(int value) {
                if (value == androidx.window.embedding.SplitAttributes.LayoutDirection.LEFT_TO_RIGHT.getValue()) {
                    return androidx.window.embedding.SplitAttributes.LayoutDirection.LEFT_TO_RIGHT;
                }
                if (value == androidx.window.embedding.SplitAttributes.LayoutDirection.RIGHT_TO_LEFT.getValue()) {
                    return androidx.window.embedding.SplitAttributes.LayoutDirection.RIGHT_TO_LEFT;
                }
                if (value == androidx.window.embedding.SplitAttributes.LayoutDirection.LOCALE.getValue()) {
                    return androidx.window.embedding.SplitAttributes.LayoutDirection.LOCALE;
                }
                if (value == androidx.window.embedding.SplitAttributes.LayoutDirection.TOP_TO_BOTTOM.getValue()) {
                    return androidx.window.embedding.SplitAttributes.LayoutDirection.TOP_TO_BOTTOM;
                }
                if (value == androidx.window.embedding.SplitAttributes.LayoutDirection.BOTTOM_TO_TOP.getValue()) {
                    return androidx.window.embedding.SplitAttributes.LayoutDirection.BOTTOM_TO_TOP;
                }
                throw new java.lang.IllegalArgumentException("Undefined value:".concat(java.lang.String.valueOf(value)));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.splitType.hashCode();
        return (((((hashCode * 31) + this.layoutDirection.hashCode()) * 31) + this.animationParams.hashCode()) * 31) + this.dividerAttributes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitAttributes)) {
            return false;
        }
        androidx.window.embedding.SplitAttributes splitAttributes = (androidx.window.embedding.SplitAttributes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.splitType, splitAttributes.splitType) && kotlin.jvm.internal.Intrinsics.areEqual(this.layoutDirection, splitAttributes.layoutDirection) && kotlin.jvm.internal.Intrinsics.areEqual(this.animationParams, splitAttributes.animationParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.dividerAttributes, splitAttributes.dividerAttributes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitAttributes:{splitType=");
        sb.append(this.splitType);
        sb.append(", layoutDir=");
        sb.append(this.layoutDirection);
        sb.append(", animationParams=");
        sb.append(this.animationParams);
        sb.append(", dividerAttributes=");
        sb.append(this.dividerAttributes);
        sb.append(" }");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 "}, d2 = {"Landroidx/window/embedding/SplitAttributes$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/SplitAttributes;", com.visa.cbp.DeviceInfo.valueOf, "(Landroidx/window/embedding/SplitAttributes;)V", "Landroidx/window/embedding/SplitAttributes$SplitType;", "type", "setSplitType", "(Landroidx/window/embedding/SplitAttributes$SplitType;)Landroidx/window/embedding/SplitAttributes$Builder;", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "layoutDirection", "setLayoutDirection", "(Landroidx/window/embedding/SplitAttributes$LayoutDirection;)Landroidx/window/embedding/SplitAttributes$Builder;", "Landroidx/window/embedding/EmbeddingAnimationParams;", "params", "setAnimationParams", "(Landroidx/window/embedding/EmbeddingAnimationParams;)Landroidx/window/embedding/SplitAttributes$Builder;", "Landroidx/window/embedding/DividerAttributes;", "dividerAttributes", "setDividerAttributes", "(Landroidx/window/embedding/DividerAttributes;)Landroidx/window/embedding/SplitAttributes$Builder;", "build", "()Landroidx/window/embedding/SplitAttributes;", "getHighSpeedVideoFpsRanges", "Landroidx/window/embedding/SplitAttributes$SplitType;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "getHighSpeedVideoFpsRangesFor", "Landroidx/window/embedding/EmbeddingAnimationParams;", "Landroidx/window/embedding/DividerAttributes;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.window.embedding.SplitAttributes.LayoutDirection getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.window.embedding.DividerAttributes getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.window.embedding.SplitAttributes.SplitType getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAnimationParams getHighSpeedVideoFpsRanges;

        public Builder() {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.window.embedding.SplitAttributes.SplitType.SPLIT_TYPE_EQUAL;
            this.getHighSpeedVideoFpsRangesFor = androidx.window.embedding.SplitAttributes.LayoutDirection.LOCALE;
            this.getHighSpeedVideoFpsRanges = new androidx.window.embedding.EmbeddingAnimationParams.Builder().build();
            this.getHighSpeedVideoSizes = androidx.window.embedding.DividerAttributes.NO_DIVIDER;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.window.embedding.SplitAttributes splitAttributes) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
            setSplitType(splitAttributes.getSplitType()).setLayoutDirection(splitAttributes.getLayoutDirection()).setAnimationParams(splitAttributes.getAnimationParams()).setDividerAttributes(splitAttributes.getDividerAttributes());
        }

        public final androidx.window.embedding.SplitAttributes.Builder setSplitType(androidx.window.embedding.SplitAttributes.SplitType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            this.getHighResolutionOutputSizeshNQ4ISI = type;
            return this;
        }

        public final androidx.window.embedding.SplitAttributes.Builder setLayoutDirection(androidx.window.embedding.SplitAttributes.LayoutDirection layoutDirection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
            this.getHighSpeedVideoFpsRangesFor = layoutDirection;
            return this;
        }

        public final androidx.window.embedding.SplitAttributes.Builder setAnimationParams(androidx.window.embedding.EmbeddingAnimationParams params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            this.getHighSpeedVideoFpsRanges = params;
            return this;
        }

        public final androidx.window.embedding.SplitAttributes.Builder setDividerAttributes(androidx.window.embedding.DividerAttributes dividerAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dividerAttributes, "");
            this.getHighSpeedVideoSizes = dividerAttributes;
            return this;
        }

        public final androidx.window.embedding.SplitAttributes build() {
            return new androidx.window.embedding.SplitAttributes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null);
        }
    }

    public /* synthetic */ SplitAttributes(androidx.window.embedding.SplitAttributes.SplitType splitType, androidx.window.embedding.SplitAttributes.LayoutDirection layoutDirection, androidx.window.embedding.EmbeddingAnimationParams embeddingAnimationParams, androidx.window.embedding.DividerAttributes dividerAttributes, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(splitType, layoutDirection, embeddingAnimationParams, dividerAttributes);
    }
}
