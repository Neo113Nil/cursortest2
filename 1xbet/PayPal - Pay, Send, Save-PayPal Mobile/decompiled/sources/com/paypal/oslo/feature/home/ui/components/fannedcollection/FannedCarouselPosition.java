package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007 !\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\u0082\u0001\u0003'()"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "", "hideWhileTranslating", "Z", "getHideWhileTranslating", "()Z", "", "width", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "height", "getHeight", "", "getScale", "()F", "scale", "getRotationZ", "rotationZ", "getXAxisOffset", "xAxisOffset", "getYAxisOffset", "yAxisOffset", "getZIndex", "zIndex", "Middle", "Adjacent", "LeftAdjacent", "RightAdjacent", "Outer", "LeftOuter", "RightOuter", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Adjacent;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Middle;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Outer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FannedCarouselPosition {
    public static final int $stable = 0;
    private final int height;
    private final boolean hideWhileTranslating;
    private final int width;

    public abstract java.lang.String getId();

    public abstract float getRotationZ();

    public abstract float getScale();

    public abstract float getXAxisOffset();

    public abstract float getYAxisOffset();

    public abstract int getZIndex();

    private FannedCarouselPosition() {
        this.width = 175;
        this.height = 263;
    }

    public boolean getHideWhileTranslating() {
        return this.hideWhileTranslating;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00068C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00068C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0014\u0010#\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010$\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001a\u0010'\u001a\u00020&8\u0017X\u0097D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Middle;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "<init>", "()V", "", "rest", "", "dx", "drag", "(F)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "<set-?>", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isDragging", "()Z", "setDragging", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableFloatState;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "scale", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScale", "()F", "getRotationZ", "rotationZ", "getXAxisOffset", "xAxisOffset", "yAxisOffset", "getYAxisOffset", "", "zIndex", com.visa.cbp.getEncExpo.warmup, "getZIndex", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Middle extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition {
        public static final int $stable = 0;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
        private final java.lang.String id;

        /* renamed from: isDragging$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState isDragging;
        private final float scale;
        private final float yAxisOffset;
        private final int zIndex;

        public Middle() {
            super(null);
            this.id = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE;
            this.isDragging = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
            this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            this.scale = 1.0f;
            this.zIndex = 3;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final java.lang.String getId() {
            return this.id;
        }

        private final void setDragging(boolean z) {
            this.isDragging.setValue(java.lang.Boolean.valueOf(z));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isDragging() {
            return ((java.lang.Boolean) this.isDragging.getValue()).booleanValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final float getScale() {
            return this.scale;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final float getYAxisOffset() {
            return this.yAxisOffset;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final int getZIndex() {
            return this.zIndex;
        }

        public final void rest() {
            setDragging(false);
            this.getHighSpeedVideoFpsRanges.setFloatValue(0.0f);
            this.getHighSpeedVideoFpsRangesFor.setFloatValue(0.0f);
        }

        public final void drag(float dx) {
            setDragging(true);
            this.getHighSpeedVideoFpsRanges.setFloatValue(this.getHighSpeedVideoFpsRanges.getFloatValue() + dx);
            this.getHighSpeedVideoFpsRangesFor.setFloatValue(kotlin.ranges.RangesKt.coerceIn(this.getHighSpeedVideoFpsRanges.getFloatValue() / com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.DensityDependentConstants.INSTANCE.getCarouselItemMaxWidthPxs(), -1.0f, 1.0f) * 12.0f);
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final float getRotationZ() {
            return this.getHighSpeedVideoFpsRangesFor.getFloatValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final float getXAxisOffset() {
            return this.getHighSpeedVideoFpsRanges.getFloatValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Adjacent;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "<init>", "()V", "", "getDirection", "()I", "direction", "", "rotationZ$delegate", "Lkotlin/Lazy;", "getRotationZ", "()F", "rotationZ", "xAxisOffset$delegate", "getXAxisOffset", "xAxisOffset", "scale", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScale", "yAxisOffset", "getYAxisOffset", "zIndex", com.visa.cbp.getEncExpo.warmup, "getZIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Adjacent extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition {
        public static final int $stable = 8;

        /* renamed from: rotationZ$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy rotationZ;
        private final float scale;

        /* renamed from: xAxisOffset$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy xAxisOffset;
        private final float yAxisOffset;
        private final int zIndex;

        public abstract int getDirection();

        public Adjacent() {
            super(null);
            this.rotationZ = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition$Adjacent$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent.$r8$lambda$Re1TOfdCE1i4nTkkUIT0Jn5SDxc(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent.this));
                }
            });
            this.xAxisOffset = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition$Adjacent$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent.$r8$lambda$pCmXd1ZdzJmlXloYmopfJ3VWcyU(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent.this));
                }
            });
            this.scale = 0.9f;
            this.yAxisOffset = 5.0f;
            this.zIndex = 2;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getRotationZ() {
            return ((java.lang.Number) this.rotationZ.getValue()).floatValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getXAxisOffset() {
            return ((java.lang.Number) this.xAxisOffset.getValue()).floatValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getScale() {
            return this.scale;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getYAxisOffset() {
            return this.yAxisOffset;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public int getZIndex() {
            return this.zIndex;
        }

        public static /* synthetic */ float $r8$lambda$Re1TOfdCE1i4nTkkUIT0Jn5SDxc(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent adjacent) {
            return adjacent.getDirection() * 6.0f;
        }

        public static /* synthetic */ float $r8$lambda$pCmXd1ZdzJmlXloYmopfJ3VWcyU(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent adjacent) {
            return (com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.DensityDependentConstants.INSTANCE.getCarouselItemMaxWidthPxs() / 1.85f) * adjacent.getDirection();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$LeftAdjacent;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Adjacent;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "direction", com.visa.cbp.getEncExpo.warmup, "getDirection", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LeftAdjacent extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent {
        public static final int $stable = 8;
        private final java.lang.String id = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.LEFT_ADJACENT;
        private final int direction = -1;

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent
        public final int getDirection() {
            return this.direction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$RightAdjacent;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Adjacent;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "direction", com.visa.cbp.getEncExpo.warmup, "getDirection", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RightAdjacent extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent {
        public static final int $stable = 8;
        private final java.lang.String id = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.RIGHT_ADJACENT;
        private final int direction = 1;

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Adjacent
        public final int getDirection() {
            return this.direction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Outer;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "<init>", "()V", "", "getDirection", "()I", "direction", "", "rotationZ$delegate", "Lkotlin/Lazy;", "getRotationZ", "()F", "rotationZ", "xAxisOffset$delegate", "getXAxisOffset", "xAxisOffset", "scale", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScale", "yAxisOffset", "getYAxisOffset", "zIndex", com.visa.cbp.getEncExpo.warmup, "getZIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Outer extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition {
        public static final int $stable = 8;

        /* renamed from: rotationZ$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy rotationZ;
        private final float scale;

        /* renamed from: xAxisOffset$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy xAxisOffset;
        private final float yAxisOffset;
        private final int zIndex;

        public abstract int getDirection();

        public Outer() {
            super(null);
            this.rotationZ = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition$Outer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer.$r8$lambda$_A20KbYgPkirpHSdVJuJjb7V9SI(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer.this));
                }
            });
            this.xAxisOffset = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition$Outer$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer.$r8$lambda$zDuU1WOTzGX54OYK9WQeSJ9xlSA(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer.this));
                }
            });
            this.scale = 0.75f;
            this.yAxisOffset = 80.0f;
            this.zIndex = 1;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getRotationZ() {
            return ((java.lang.Number) this.rotationZ.getValue()).floatValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getXAxisOffset() {
            return ((java.lang.Number) this.xAxisOffset.getValue()).floatValue();
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getScale() {
            return this.scale;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public float getYAxisOffset() {
            return this.yAxisOffset;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public int getZIndex() {
            return this.zIndex;
        }

        public static /* synthetic */ float $r8$lambda$_A20KbYgPkirpHSdVJuJjb7V9SI(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer outer) {
            return outer.getDirection() * 12.0f;
        }

        public static /* synthetic */ float $r8$lambda$zDuU1WOTzGX54OYK9WQeSJ9xlSA(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer outer) {
            float carouselItemMaxWidthPxs = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.DensityDependentConstants.INSTANCE.getCarouselItemMaxWidthPxs();
            return (carouselItemMaxWidthPxs + (0.4f * carouselItemMaxWidthPxs)) * outer.getDirection();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$LeftOuter;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Outer;", "", "hideWhileTranslating", "<init>", "(Z)V", "Z", "getHideWhileTranslating", "()Z", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "direction", com.visa.cbp.getEncExpo.warmup, "getDirection", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LeftOuter extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer {
        public static final int $stable = 8;
        private final int direction;
        private final boolean hideWhileTranslating;
        private final java.lang.String id;

        public LeftOuter(boolean z) {
            this.hideWhileTranslating = z;
            this.id = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.LEFT_OUTER;
            this.direction = -1;
        }

        public /* synthetic */ LeftOuter(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final boolean getHideWhileTranslating() {
            return this.hideWhileTranslating;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer
        public final int getDirection() {
            return this.direction;
        }

        public LeftOuter() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$RightOuter;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition$Outer;", "", "hideWhileTranslating", "<init>", "(Z)V", "Z", "getHideWhileTranslating", "()Z", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "direction", com.visa.cbp.getEncExpo.warmup, "getDirection", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RightOuter extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer {
        public static final int $stable = 8;
        private final int direction;
        private final boolean hideWhileTranslating;
        private final java.lang.String id;

        public RightOuter(boolean z) {
            this.hideWhileTranslating = z;
            this.id = com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.RIGHT_OUTER;
            this.direction = 1;
        }

        public /* synthetic */ RightOuter(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final boolean getHideWhileTranslating() {
            return this.hideWhileTranslating;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Outer
        public final int getDirection() {
            return this.direction;
        }

        public RightOuter() {
            this(false, 1, null);
        }
    }

    public /* synthetic */ FannedCarouselPosition(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
