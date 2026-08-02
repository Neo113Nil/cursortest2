package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u0000 \u00102\u00020\u0001:\u0004\u0011\u0012\u0013\u0010B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Landroidx/window/embedding/DividerAttributes;", "", "", "p0", "p1", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "widthDp", com.visa.cbp.getEncExpo.warmup, "getWidthDp", "()I", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "getColor", "Companion", "FixedDividerAttributes", "DraggableDividerAttributes", "DragRange"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DividerAttributes {
    public static final int COLOR_SYSTEM_DEFAULT = -16777216;
    public static final float DRAG_RANGE_VALUE_UNSPECIFIED = -1.0f;
    public static final int TYPE_VALUE_DRAGGABLE = 1;
    public static final int TYPE_VALUE_FIXED = 0;
    public static final int WIDTH_SYSTEM_DEFAULT = -1;
    private final int color;
    private final int widthDp;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.DividerAttributes.Companion INSTANCE = new androidx.window.embedding.DividerAttributes.Companion(null);
    public static final androidx.window.embedding.DividerAttributes NO_DIVIDER = new androidx.window.embedding.DividerAttributes() { // from class: androidx.window.embedding.DividerAttributes$Companion$NO_DIVIDER$1
        @Override // androidx.window.embedding.DividerAttributes
        public final java.lang.String toString() {
            return "NO_DIVIDER";
        }

        public final int hashCode() {
            return toString().hashCode();
        }
    };

    private DividerAttributes(int i, int i2) {
        this.widthDp = i;
        this.color = i2;
    }

    /* synthetic */ DividerAttributes(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -16777216 : i2);
    }

    public final int getWidthDp() {
        return this.widthDp;
    }

    public final int getColor() {
        return this.color;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DividerAttributes{width=");
        sb.append(this.widthDp);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes;", "Landroidx/window/embedding/DividerAttributes;", "", "p0", "p1", "<init>", "(II)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FixedDividerAttributes extends androidx.window.embedding.DividerAttributes {
        private FixedDividerAttributes(int i, int i2) {
            super(i, i2, null);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.window.embedding.DividerAttributes.FixedDividerAttributes)) {
                return false;
            }
            androidx.window.embedding.DividerAttributes.FixedDividerAttributes fixedDividerAttributes = (androidx.window.embedding.DividerAttributes.FixedDividerAttributes) other;
            return getWidthDp() == fixedDividerAttributes.getWidthDp() && getColor() == fixedDividerAttributes.getColor();
        }

        public final int hashCode() {
            return (getWidthDp() * 31) + getColor();
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes;", com.visa.cbp.DeviceInfo.valueOf, "(Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes;)V", "", "widthDp", "setWidthDp", "(I)Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes$Builder;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "setColor", "build", "()Landroidx/window/embedding/DividerAttributes$FixedDividerAttributes;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private int getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private int Camera2StreamConfigurationMap;

            public Builder() {
                this.getHighSpeedVideoSizes = -1;
                this.Camera2StreamConfigurationMap = -16777216;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Builder(androidx.window.embedding.DividerAttributes.FixedDividerAttributes fixedDividerAttributes) {
                this();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fixedDividerAttributes, "");
                this.getHighSpeedVideoSizes = fixedDividerAttributes.getWidthDp();
                this.Camera2StreamConfigurationMap = fixedDividerAttributes.getColor();
            }

            public final androidx.window.embedding.DividerAttributes.FixedDividerAttributes.Builder setWidthDp(int widthDp) {
                androidx.window.embedding.DividerAttributes.Companion.access$validateWidth(androidx.window.embedding.DividerAttributes.INSTANCE, widthDp);
                this.getHighSpeedVideoSizes = widthDp;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.FixedDividerAttributes.Builder setColor(int color) {
                androidx.window.embedding.DividerAttributes.Companion.access$validateColor(androidx.window.embedding.DividerAttributes.INSTANCE, color);
                this.Camera2StreamConfigurationMap = color;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.FixedDividerAttributes build() {
                return new androidx.window.embedding.DividerAttributes.FixedDividerAttributes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null);
            }
        }

        public /* synthetic */ FixedDividerAttributes(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001bB1\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a"}, d2 = {"Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes;", "Landroidx/window/embedding/DividerAttributes;", "", "p0", "p1", "Landroidx/window/embedding/DividerAttributes$DragRange;", "p2", "", "p3", "<init>", "(IILandroidx/window/embedding/DividerAttributes$DragRange;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "dragRange", "Landroidx/window/embedding/DividerAttributes$DragRange;", "getDragRange", "()Landroidx/window/embedding/DividerAttributes$DragRange;", "isDraggingToFullscreenAllowed", "Z", "()Z", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DraggableDividerAttributes extends androidx.window.embedding.DividerAttributes {
        private final androidx.window.embedding.DividerAttributes.DragRange dragRange;
        private final boolean isDraggingToFullscreenAllowed;

        public final androidx.window.embedding.DividerAttributes.DragRange getDragRange() {
            return this.dragRange;
        }

        /* renamed from: isDraggingToFullscreenAllowed, reason: from getter */
        public final boolean getIsDraggingToFullscreenAllowed() {
            return this.isDraggingToFullscreenAllowed;
        }

        private DraggableDividerAttributes(int i, int i2, androidx.window.embedding.DividerAttributes.DragRange dragRange, boolean z) {
            super(i, i2, null);
            this.dragRange = dragRange;
            this.isDraggingToFullscreenAllowed = z;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.window.embedding.DividerAttributes.DraggableDividerAttributes)) {
                return false;
            }
            androidx.window.embedding.DividerAttributes.DraggableDividerAttributes draggableDividerAttributes = (androidx.window.embedding.DividerAttributes.DraggableDividerAttributes) other;
            return getWidthDp() == draggableDividerAttributes.getWidthDp() && getColor() == draggableDividerAttributes.getColor() && kotlin.jvm.internal.Intrinsics.areEqual(this.dragRange, draggableDividerAttributes.dragRange) && this.isDraggingToFullscreenAllowed == draggableDividerAttributes.isDraggingToFullscreenAllowed;
        }

        public final int hashCode() {
            int widthDp = getWidthDp();
            return (((((widthDp * 31) + getColor()) * 31) + this.dragRange.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isDraggingToFullscreenAllowed);
        }

        @Override // androidx.window.embedding.DividerAttributes
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.class.getSimpleName());
            sb.append("{width=");
            sb.append(getWidthDp());
            sb.append(", color=");
            sb.append(getColor());
            sb.append(", primaryContainerDragRange=");
            sb.append(this.dragRange);
            sb.append(", isDraggingToFullscreenAllowed=");
            sb.append(this.isDraggingToFullscreenAllowed);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e"}, d2 = {"Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes$Builder;", "", "<init>", "()V", "Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes;", com.visa.cbp.DeviceInfo.valueOf, "(Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes;)V", "", "widthDp", "setWidthDp", "(I)Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes$Builder;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "setColor", "Landroidx/window/embedding/DividerAttributes$DragRange;", "dragRange", "setDragRange", "(Landroidx/window/embedding/DividerAttributes$DragRange;)Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes$Builder;", "", "allowed", "setDraggingToFullscreenAllowed", "(Z)Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes$Builder;", "build", "()Landroidx/window/embedding/DividerAttributes$DraggableDividerAttributes;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/embedding/DividerAttributes$DragRange;", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private int getHighSpeedVideoFpsRangesFor;
            private androidx.window.embedding.DividerAttributes.DragRange getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private int getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private boolean getHighSpeedVideoFpsRanges;

            public Builder() {
                this.getHighSpeedVideoSizes = -1;
                this.getHighSpeedVideoFpsRangesFor = -16777216;
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.window.embedding.DividerAttributes.DragRange.DRAG_RANGE_SYSTEM_DEFAULT;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Builder(androidx.window.embedding.DividerAttributes.DraggableDividerAttributes draggableDividerAttributes) {
                this();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draggableDividerAttributes, "");
                this.getHighSpeedVideoSizes = draggableDividerAttributes.getWidthDp();
                this.getHighResolutionOutputSizeshNQ4ISI = draggableDividerAttributes.getDragRange();
                this.getHighSpeedVideoFpsRangesFor = draggableDividerAttributes.getColor();
                this.getHighSpeedVideoFpsRanges = draggableDividerAttributes.getIsDraggingToFullscreenAllowed();
            }

            public final androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder setWidthDp(int widthDp) {
                androidx.window.embedding.DividerAttributes.Companion.access$validateWidth(androidx.window.embedding.DividerAttributes.INSTANCE, widthDp);
                this.getHighSpeedVideoSizes = widthDp;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder setColor(int color) {
                androidx.window.embedding.DividerAttributes.Companion.access$validateColor(androidx.window.embedding.DividerAttributes.INSTANCE, color);
                this.getHighSpeedVideoFpsRangesFor = color;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder setDragRange(androidx.window.embedding.DividerAttributes.DragRange dragRange) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragRange, "");
                this.getHighResolutionOutputSizeshNQ4ISI = dragRange;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder setDraggingToFullscreenAllowed(boolean allowed) {
                this.getHighSpeedVideoFpsRanges = allowed;
                return this;
            }

            public final androidx.window.embedding.DividerAttributes.DraggableDividerAttributes build() {
                return new androidx.window.embedding.DividerAttributes.DraggableDividerAttributes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null);
            }
        }

        public /* synthetic */ DraggableDividerAttributes(int i, int i2, androidx.window.embedding.DividerAttributes.DragRange dragRange, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, dragRange, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/embedding/DividerAttributes$DragRange;", "", "<init>", "()V", "Companion", "SplitRatioDragRange"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DragRange {
        public static final androidx.window.embedding.DividerAttributes.DragRange DRAG_RANGE_SYSTEM_DEFAULT = new androidx.window.embedding.DividerAttributes.DragRange() { // from class: androidx.window.embedding.DividerAttributes$DragRange$Companion$DRAG_RANGE_SYSTEM_DEFAULT$1
            public final java.lang.String toString() {
                return "DRAG_RANGE_SYSTEM_DEFAULT";
            }
        };

        private DragRange() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Landroidx/window/embedding/DividerAttributes$DragRange$SplitRatioDragRange;", "Landroidx/window/embedding/DividerAttributes$DragRange;", "", "minRatio", "maxRatio", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinRatio", "()F", "getMaxRatio"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SplitRatioDragRange extends androidx.window.embedding.DividerAttributes.DragRange {
            private final float maxRatio;
            private final float minRatio;

            public final float getMinRatio() {
                return this.minRatio;
            }

            public final float getMaxRatio() {
                return this.maxRatio;
            }

            public SplitRatioDragRange(float f, float f2) {
                super(null);
                this.minRatio = f;
                this.maxRatio = f2;
                double d = f;
                if (d <= 0.0d || d >= 1.0d) {
                    throw new java.lang.IllegalArgumentException("minRatio must be in the interval (0.0, 1.0)");
                }
                double d2 = f2;
                if (d2 <= 0.0d || d2 >= 1.0d) {
                    throw new java.lang.IllegalArgumentException("maxRatio must be in the interval (0.0, 1.0)");
                }
                if (f > f2) {
                    throw new java.lang.IllegalArgumentException("minRatio must be less than or equal to maxRatio");
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitRatioDragRange[");
                sb.append(this.minRatio);
                sb.append(", ");
                sb.append(this.maxRatio);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof androidx.window.embedding.DividerAttributes.DragRange.SplitRatioDragRange)) {
                    return false;
                }
                androidx.window.embedding.DividerAttributes.DragRange.SplitRatioDragRange splitRatioDragRange = (androidx.window.embedding.DividerAttributes.DragRange.SplitRatioDragRange) other;
                return this.minRatio == splitRatioDragRange.minRatio && this.maxRatio == splitRatioDragRange.maxRatio;
            }

            public final int hashCode() {
                return (java.lang.Float.hashCode(this.minRatio) * 31) + java.lang.Float.hashCode(this.maxRatio);
            }
        }

        public /* synthetic */ DragRange(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017"}, d2 = {"Landroidx/window/embedding/DividerAttributes$Companion;", "", "<init>", "()V", "", "type", "widthDp", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "dragRangeMinRatio", "dragRangeMaxRatio", "", "isDraggingToFullscreenAllowed", "Landroidx/window/embedding/DividerAttributes;", "createDividerAttributes$window_release", "(IIIFFZ)Landroidx/window/embedding/DividerAttributes;", "hasDragRangeMinRatio", "hasDragRangeMaxRatio", "hasIsDraggingToFullscreenAllowed", "", "validateXmlDividerAttributes$window_release", "(IZZZ)V", "WIDTH_SYSTEM_DEFAULT", com.visa.cbp.getEncExpo.warmup, "NO_DIVIDER", "Landroidx/window/embedding/DividerAttributes;", "TYPE_VALUE_FIXED", "TYPE_VALUE_DRAGGABLE", "DRAG_RANGE_VALUE_UNSPECIFIED", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "COLOR_SYSTEM_DEFAULT"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.embedding.DividerAttributes createDividerAttributes$window_release(int type, int widthDp, int color, float dragRangeMinRatio, float dragRangeMaxRatio, boolean isDraggingToFullscreenAllowed) {
            if (type == 0) {
                return new androidx.window.embedding.DividerAttributes.FixedDividerAttributes.Builder().setWidthDp(widthDp).setColor(color).build();
            }
            if (type == 1) {
                androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder draggingToFullscreenAllowed = new androidx.window.embedding.DividerAttributes.DraggableDividerAttributes.Builder().setWidthDp(widthDp).setColor(color).setDraggingToFullscreenAllowed(isDraggingToFullscreenAllowed);
                if (dragRangeMinRatio == -1.0f || dragRangeMaxRatio == -1.0f) {
                    draggingToFullscreenAllowed.setDragRange(androidx.window.embedding.DividerAttributes.DragRange.DRAG_RANGE_SYSTEM_DEFAULT);
                } else {
                    draggingToFullscreenAllowed.setDragRange(new androidx.window.embedding.DividerAttributes.DragRange.SplitRatioDragRange(dragRangeMinRatio, dragRangeMaxRatio));
                }
                return draggingToFullscreenAllowed.build();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Got unknown divider type ");
            sb.append(type);
            sb.append('!');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public final void validateXmlDividerAttributes$window_release(int type, boolean hasDragRangeMinRatio, boolean hasDragRangeMaxRatio, boolean hasIsDraggingToFullscreenAllowed) {
            if (type != 1) {
                if (hasDragRangeMinRatio) {
                    throw new java.lang.IllegalArgumentException("Fixed divider does not allow attribute dragRangeMinRatio!");
                }
                if (hasDragRangeMaxRatio) {
                    throw new java.lang.IllegalArgumentException("Fixed divider does not allow attribute dragRangeMaxRatio!");
                }
                if (hasIsDraggingToFullscreenAllowed) {
                    throw new java.lang.IllegalArgumentException("Fixed divider does not allow attribute isDraggingToFullscreenAllowed!");
                }
            }
        }

        public static final /* synthetic */ void access$validateColor(androidx.window.embedding.DividerAttributes.Companion companion, int i) {
            if ((i >>> 24) == 255) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Divider color must be opaque. Got: ");
            sb.append(java.lang.Integer.toHexString(i));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static final /* synthetic */ void access$validateWidth(androidx.window.embedding.DividerAttributes.Companion companion, int i) {
            if (i != -1 && i < 0) {
                throw new java.lang.IllegalArgumentException("widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: ".concat(java.lang.String.valueOf(i)).toString());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DividerAttributes(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
