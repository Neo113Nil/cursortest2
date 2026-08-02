package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 '2\u00020\u0001:\u0003()'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds;", "", "Landroidx/window/embedding/EmbeddingBounds$Alignment;", "alignment", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "width", "height", "<init>", "(Landroidx/window/embedding/EmbeddingBounds$Alignment;Landroidx/window/embedding/EmbeddingBounds$Dimension;Landroidx/window/embedding/EmbeddingBounds$Dimension;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "shouldUseFallbackDimensionForWidth$window_release", "(Landroidx/window/layout/WindowLayoutInfo;)Z", "shouldUseFallbackDimensionForHeight$window_release", "Landroidx/window/layout/FoldingFeature;", "getHighSpeedVideoSizes", "(Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/layout/FoldingFeature;", "Landroidx/window/core/Bounds;", "parentContainerBounds", "getWidthInPixel$window_release", "(Landroidx/window/core/Bounds;Landroidx/window/layout/WindowLayoutInfo;)I", "getHeightInPixel$window_release", "Landroidx/window/embedding/EmbeddingBounds$Alignment;", "getAlignment", "()Landroidx/window/embedding/EmbeddingBounds$Alignment;", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "getWidth", "()Landroidx/window/embedding/EmbeddingBounds$Dimension;", "getHeight", "Companion", "Alignment", "Dimension"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddingBounds {
    public static final androidx.window.embedding.EmbeddingBounds BOUNDS_EXPANDED;
    public static final androidx.window.embedding.EmbeddingBounds BOUNDS_HINGE_BOTTOM;
    public static final androidx.window.embedding.EmbeddingBounds BOUNDS_HINGE_LEFT;
    public static final androidx.window.embedding.EmbeddingBounds BOUNDS_HINGE_RIGHT;
    public static final androidx.window.embedding.EmbeddingBounds BOUNDS_HINGE_TOP;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.EmbeddingBounds.Companion INSTANCE = new androidx.window.embedding.EmbeddingBounds.Companion(null);
    private final androidx.window.embedding.EmbeddingBounds.Alignment alignment;
    private final androidx.window.embedding.EmbeddingBounds.Dimension height;
    private final androidx.window.embedding.EmbeddingBounds.Dimension width;

    public EmbeddingBounds(androidx.window.embedding.EmbeddingBounds.Alignment alignment, androidx.window.embedding.EmbeddingBounds.Dimension dimension, androidx.window.embedding.EmbeddingBounds.Dimension dimension2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dimension, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dimension2, "");
        this.alignment = alignment;
        this.width = dimension;
        this.height = dimension2;
    }

    public final androidx.window.embedding.EmbeddingBounds.Alignment getAlignment() {
        return this.alignment;
    }

    public final androidx.window.embedding.EmbeddingBounds.Dimension getWidth() {
        return this.width;
    }

    public final androidx.window.embedding.EmbeddingBounds.Dimension getHeight() {
        return this.height;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bounds:{alignment=");
        sb.append(this.alignment);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.alignment.hashCode() * 31) + this.width.hashCode()) * 31) + this.height.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.EmbeddingBounds)) {
            return false;
        }
        androidx.window.embedding.EmbeddingBounds embeddingBounds = (androidx.window.embedding.EmbeddingBounds) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, embeddingBounds.alignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, embeddingBounds.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, embeddingBounds.height);
    }

    public final boolean shouldUseFallbackDimensionForWidth$window_release(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.width, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            return false;
        }
        androidx.window.layout.FoldingFeature highSpeedVideoSizes = getHighSpeedVideoSizes(windowLayoutInfo);
        return highSpeedVideoSizes == null || !kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes.getOrientation(), androidx.window.layout.FoldingFeature.Orientation.VERTICAL) || kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.window.embedding.EmbeddingBounds.Alignment[]{androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_TOP, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_BOTTOM}).contains(this.alignment);
    }

    public final boolean shouldUseFallbackDimensionForHeight$window_release(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.height, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            return false;
        }
        androidx.window.layout.FoldingFeature highSpeedVideoSizes = getHighSpeedVideoSizes(windowLayoutInfo);
        return highSpeedVideoSizes == null || !kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes.getOrientation(), androidx.window.layout.FoldingFeature.Orientation.HORIZONTAL) || kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.window.embedding.EmbeddingBounds.Alignment[]{androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_LEFT, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_RIGHT}).contains(this.alignment);
    }

    private static androidx.window.layout.FoldingFeature getHighSpeedVideoSizes(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        java.util.List<androidx.window.layout.DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : displayFeatures) {
            if (obj instanceof androidx.window.layout.FoldingFeature) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 1) {
            return (androidx.window.layout.FoldingFeature) arrayList2.get(0);
        }
        return null;
    }

    public final int getWidthInPixel$window_release(androidx.window.core.Bounds parentContainerBounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        androidx.window.embedding.EmbeddingBounds.Dimension dimension;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentContainerBounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        int width = parentContainerBounds.getWidth();
        if (shouldUseFallbackDimensionForWidth$window_release(windowLayoutInfo)) {
            dimension = androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.ratio(0.5f);
        } else {
            dimension = this.width;
        }
        if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) {
            return ((androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) dimension).times$window_release(width);
        }
        if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) {
            return java.lang.Math.min(width, ((androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) dimension).getValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(dimension, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            androidx.window.layout.FoldingFeature highSpeedVideoSizes = getHighSpeedVideoSizes(windowLayoutInfo);
            kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
            android.graphics.Rect bounds = highSpeedVideoSizes.getBounds();
            androidx.window.embedding.EmbeddingBounds.Alignment alignment = this.alignment;
            if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_LEFT)) {
                return bounds.left - parentContainerBounds.getLeft();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_RIGHT)) {
                return parentContainerBounds.getRight() - bounds.right;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unhandled condition to get height in pixel! embeddingBounds=");
            sb.append(this);
            sb.append(" taskBounds=");
            sb.append(parentContainerBounds);
            sb.append(" windowLayoutInfo=");
            sb.append(windowLayoutInfo);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unhandled width dimension=");
        sb2.append(this.width);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public final int getHeightInPixel$window_release(androidx.window.core.Bounds parentContainerBounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        androidx.window.embedding.EmbeddingBounds.Dimension dimension;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentContainerBounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        int height = parentContainerBounds.getHeight();
        if (shouldUseFallbackDimensionForHeight$window_release(windowLayoutInfo)) {
            dimension = androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.ratio(0.5f);
        } else {
            dimension = this.height;
        }
        if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) {
            return ((androidx.window.embedding.EmbeddingBounds.Dimension.Ratio) dimension).times$window_release(height);
        }
        if (dimension instanceof androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) {
            return java.lang.Math.min(height, ((androidx.window.embedding.EmbeddingBounds.Dimension.Pixel) dimension).getValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(dimension, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE)) {
            androidx.window.layout.FoldingFeature highSpeedVideoSizes = getHighSpeedVideoSizes(windowLayoutInfo);
            kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
            android.graphics.Rect bounds = highSpeedVideoSizes.getBounds();
            androidx.window.embedding.EmbeddingBounds.Alignment alignment = this.alignment;
            if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_TOP)) {
                return bounds.top - parentContainerBounds.getTop();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_BOTTOM)) {
                return parentContainerBounds.getBottom() - bounds.bottom;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unhandled condition to get height in pixel! embeddingBounds=");
            sb.append(this);
            sb.append(" taskBounds=");
            sb.append(parentContainerBounds);
            sb.append(" windowLayoutInfo=");
            sb.append(windowLayoutInfo);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unhandled width dimension=");
        sb2.append(this.width);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Alignment;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alignment {
        private final int value;
        public static final androidx.window.embedding.EmbeddingBounds.Alignment ALIGN_LEFT = new androidx.window.embedding.EmbeddingBounds.Alignment(0);
        public static final androidx.window.embedding.EmbeddingBounds.Alignment ALIGN_TOP = new androidx.window.embedding.EmbeddingBounds.Alignment(1);
        public static final androidx.window.embedding.EmbeddingBounds.Alignment ALIGN_RIGHT = new androidx.window.embedding.EmbeddingBounds.Alignment(2);
        public static final androidx.window.embedding.EmbeddingBounds.Alignment ALIGN_BOTTOM = new androidx.window.embedding.EmbeddingBounds.Alignment(3);

        public Alignment(int i) {
            this.value = i;
            if (i < 0 || i >= 4) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        }

        /* renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.window.embedding.EmbeddingBounds.Alignment) && this.value == ((androidx.window.embedding.EmbeddingBounds.Alignment) other).value;
        }

        public final int hashCode() {
            return this.value;
        }

        public final java.lang.String toString() {
            int i = this.value;
            if (i == 0) {
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
            }
            if (i == 1) {
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP;
            }
            if (i == 2) {
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
            }
            if (i == 3) {
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown position:");
            sb.append(this.value);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Dimension;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getDescription$window_release", "Companion", "Pixel", "Ratio"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Dimension {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.embedding.EmbeddingBounds.Dimension.Companion INSTANCE = new androidx.window.embedding.EmbeddingBounds.Dimension.Companion(null);
        public static final androidx.window.embedding.EmbeddingBounds.Dimension DIMENSION_EXPANDED = new androidx.window.embedding.EmbeddingBounds.Dimension.Ratio(1.0f);
        public static final androidx.window.embedding.EmbeddingBounds.Dimension DIMENSION_HINGE = new androidx.window.embedding.EmbeddingBounds.Dimension() { // from class: androidx.window.embedding.EmbeddingBounds$Dimension$Companion$DIMENSION_HINGE$1
        };
        private final java.lang.String description;

        public Dimension(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        /* renamed from: getDescription$window_release, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof androidx.window.embedding.EmbeddingBounds.Dimension) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((androidx.window.embedding.EmbeddingBounds.Dimension) other).description);
            }
            return false;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public java.lang.String toString() {
            return this.description;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Dimension$Pixel;", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "dimen", "compareTo$window_release", "(I)I", com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Pixel extends androidx.window.embedding.EmbeddingBounds.Dimension {
            private final int value;

            /* renamed from: getValue$window_release, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public Pixel(int i) {
                super("dimension in pixel:".concat(java.lang.String.valueOf(i)));
                this.value = i;
                if (i <= 0) {
                    throw new java.lang.IllegalArgumentException("Pixel value must be a positive integer.".toString());
                }
            }

            public final int compareTo$window_release(int dimen) {
                return this.value - dimen;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Dimension$Ratio;", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(F)V", "", "dimen", "times$window_release", "(I)I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue$window_release", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Ratio extends androidx.window.embedding.EmbeddingBounds.Dimension {
            private final float value;

            /* renamed from: getValue$window_release, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            public Ratio(float f) {
                super("dimension in ratio:".concat(java.lang.String.valueOf(f)));
                this.value = f;
                double d = f;
                if (d <= 0.0d || d > 1.0d) {
                    throw new java.lang.IllegalArgumentException("Ratio must be in range (0.0, 1.0]".toString());
                }
            }

            public final int times$window_release(int dimen) {
                return (int) (this.value * dimen);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Dimension$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "pixel", "(I)Landroidx/window/embedding/EmbeddingBounds$Dimension;", "", "ratio", "(F)Landroidx/window/embedding/EmbeddingBounds$Dimension;", "DIMENSION_EXPANDED", "Landroidx/window/embedding/EmbeddingBounds$Dimension;", "DIMENSION_HINGE"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.EmbeddingBounds.Dimension pixel(int value) {
                return new androidx.window.embedding.EmbeddingBounds.Dimension.Pixel(value);
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.EmbeddingBounds.Dimension ratio(float ratio) {
                return new androidx.window.embedding.EmbeddingBounds.Dimension.Ratio(ratio);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.window.embedding.EmbeddingBounds.Dimension ratio(float f) {
            return INSTANCE.ratio(f);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.window.embedding.EmbeddingBounds.Dimension pixel(int i) {
            return INSTANCE.pixel(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\n\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010"}, d2 = {"Landroidx/window/embedding/EmbeddingBounds$Companion;", "", "<init>", "()V", "Landroidx/window/embedding/EmbeddingBounds;", "embeddingBounds", "Landroidx/window/core/Bounds;", "parentContainerBounds", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "translateEmbeddingBounds$window_release", "(Landroidx/window/embedding/EmbeddingBounds;Landroidx/window/core/Bounds;Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/core/Bounds;", "Landroidx/window/embedding/ParentContainerInfo;", "parentContainerInfo", "(Landroidx/window/embedding/EmbeddingBounds;Landroidx/window/embedding/ParentContainerInfo;)Landroidx/window/core/Bounds;", "BOUNDS_EXPANDED", "Landroidx/window/embedding/EmbeddingBounds;", "BOUNDS_HINGE_TOP", "BOUNDS_HINGE_LEFT", "BOUNDS_HINGE_BOTTOM", "BOUNDS_HINGE_RIGHT"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.core.Bounds translateEmbeddingBounds$window_release(androidx.window.embedding.EmbeddingBounds embeddingBounds, androidx.window.core.Bounds parentContainerBounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
            androidx.window.embedding.EmbeddingBounds.Dimension width;
            androidx.window.embedding.EmbeddingBounds.Dimension height;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBounds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentContainerBounds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(embeddingBounds.getWidth(), androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED) && kotlin.jvm.internal.Intrinsics.areEqual(embeddingBounds.getHeight(), androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED)) {
                return androidx.window.core.Bounds.INSTANCE.getEMPTY_BOUNDS();
            }
            if (embeddingBounds.shouldUseFallbackDimensionForWidth$window_release(windowLayoutInfo)) {
                width = androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.ratio(0.5f);
            } else {
                width = embeddingBounds.getWidth();
            }
            if (embeddingBounds.shouldUseFallbackDimensionForHeight$window_release(windowLayoutInfo)) {
                height = androidx.window.embedding.EmbeddingBounds.Dimension.INSTANCE.ratio(0.5f);
            } else {
                height = embeddingBounds.getHeight();
            }
            androidx.window.embedding.EmbeddingBounds embeddingBounds2 = new androidx.window.embedding.EmbeddingBounds(embeddingBounds.getAlignment(), width, height);
            int widthInPixel$window_release = embeddingBounds2.getWidthInPixel$window_release(parentContainerBounds, windowLayoutInfo);
            int heightInPixel$window_release = embeddingBounds2.getHeightInPixel$window_release(parentContainerBounds, windowLayoutInfo);
            int width2 = parentContainerBounds.getWidth();
            int height2 = parentContainerBounds.getHeight();
            if (widthInPixel$window_release == width2 && heightInPixel$window_release == height2) {
                return androidx.window.core.Bounds.INSTANCE.getEMPTY_BOUNDS();
            }
            androidx.window.core.Bounds bounds = new androidx.window.core.Bounds(0, 0, widthInPixel$window_release, heightInPixel$window_release);
            androidx.window.embedding.EmbeddingBounds.Alignment alignment = embeddingBounds.getAlignment();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_TOP)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_LEFT)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_BOTTOM)) {
                        androidx.window.embedding.EmbeddingBounds.Companion companion = androidx.window.embedding.EmbeddingBounds.INSTANCE;
                        int i = (width2 - widthInPixel$window_release) / 2;
                        int i2 = height2 - heightInPixel$window_release;
                        return new androidx.window.core.Bounds(bounds.getLeft() + i, bounds.getTop() + i2, bounds.getRight() + i, bounds.getBottom() + i2);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_RIGHT)) {
                        androidx.window.embedding.EmbeddingBounds.Companion companion2 = androidx.window.embedding.EmbeddingBounds.INSTANCE;
                        int i3 = width2 - widthInPixel$window_release;
                        int i4 = (height2 - heightInPixel$window_release) / 2;
                        return new androidx.window.core.Bounds(bounds.getLeft() + i3, bounds.getTop() + i4, bounds.getRight() + i3, bounds.getBottom() + i4);
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown alignment: ");
                    sb.append(embeddingBounds.getAlignment());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                androidx.window.embedding.EmbeddingBounds.Companion companion3 = androidx.window.embedding.EmbeddingBounds.INSTANCE;
                int i5 = (height2 - heightInPixel$window_release) / 2;
                return new androidx.window.core.Bounds(bounds.getLeft(), bounds.getTop() + i5, bounds.getRight(), bounds.getBottom() + i5);
            }
            androidx.window.embedding.EmbeddingBounds.Companion companion4 = androidx.window.embedding.EmbeddingBounds.INSTANCE;
            int i6 = (width2 - widthInPixel$window_release) / 2;
            return new androidx.window.core.Bounds(bounds.getLeft() + i6, bounds.getTop(), bounds.getRight() + i6, bounds.getBottom());
        }

        public final androidx.window.core.Bounds translateEmbeddingBounds$window_release(androidx.window.embedding.EmbeddingBounds embeddingBounds, androidx.window.embedding.ParentContainerInfo parentContainerInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBounds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentContainerInfo, "");
            return translateEmbeddingBounds$window_release(embeddingBounds, parentContainerInfo.getWindowBounds(), parentContainerInfo.getWindowLayoutInfo());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.window.embedding.EmbeddingBounds.Alignment alignment = androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_TOP;
        androidx.window.embedding.EmbeddingBounds.Dimension dimension = androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED;
        BOUNDS_EXPANDED = new androidx.window.embedding.EmbeddingBounds(alignment, dimension, dimension);
        BOUNDS_HINGE_TOP = new androidx.window.embedding.EmbeddingBounds(androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_TOP, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE);
        BOUNDS_HINGE_LEFT = new androidx.window.embedding.EmbeddingBounds(androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_LEFT, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED);
        BOUNDS_HINGE_BOTTOM = new androidx.window.embedding.EmbeddingBounds(androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_BOTTOM, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE);
        BOUNDS_HINGE_RIGHT = new androidx.window.embedding.EmbeddingBounds(androidx.window.embedding.EmbeddingBounds.Alignment.ALIGN_RIGHT, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_HINGE, androidx.window.embedding.EmbeddingBounds.Dimension.DIMENSION_EXPANDED);
    }
}
