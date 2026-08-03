package androidx.compose.ui;

/* compiled from: Alignment.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment;", "Landroidx/compose/ui/Alignment;", "horizontalBias", "", "verticalBias", "(FF)V", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Horizontal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiasAbsoluteAlignment implements androidx.compose.ui.Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    /* renamed from: component1, reason: from getter */
    private final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* renamed from: component2, reason: from getter */
    private final float getVerticalBias() {
        return this.verticalBias;
    }

    public static /* synthetic */ androidx.compose.ui.BiasAbsoluteAlignment copy$default(androidx.compose.ui.BiasAbsoluteAlignment biasAbsoluteAlignment, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f, f2);
    }

    public final androidx.compose.ui.BiasAbsoluteAlignment copy(float horizontalBias, float verticalBias) {
        return new androidx.compose.ui.BiasAbsoluteAlignment(horizontalBias, verticalBias);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.BiasAbsoluteAlignment)) {
            return false;
        }
        androidx.compose.ui.BiasAbsoluteAlignment biasAbsoluteAlignment = (androidx.compose.ui.BiasAbsoluteAlignment) other;
        return java.lang.Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && java.lang.Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.horizontalBias) * 31) + java.lang.Float.floatToIntBits(this.verticalBias);
    }

    public java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }

    public BiasAbsoluteAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo1748alignKFBX0sM(long size, long space, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(space) - androidx.compose.ui.unit.IntSize.m4652getWidthimpl(size), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(space) - androidx.compose.ui.unit.IntSize.m4651getHeightimpl(size));
        float f = 1;
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt((androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize) / 2.0f) * (this.horizontalBias + f)), kotlin.math.MathKt.roundToInt((androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize) / 2.0f) * (f + this.verticalBias)));
    }

    /* compiled from: Alignment.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "bias", "", "(F)V", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        /* renamed from: component1, reason: from getter */
        private final float getBias() {
            return this.bias;
        }

        public static /* synthetic */ androidx.compose.ui.BiasAbsoluteAlignment.Horizontal copy$default(androidx.compose.ui.BiasAbsoluteAlignment.Horizontal horizontal, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.bias;
            }
            return horizontal.copy(f);
        }

        public final androidx.compose.ui.BiasAbsoluteAlignment.Horizontal copy(float bias) {
            return new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(bias);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.BiasAbsoluteAlignment.Horizontal) && java.lang.Float.compare(this.bias, ((androidx.compose.ui.BiasAbsoluteAlignment.Horizontal) other).bias) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.bias);
        }

        public java.lang.String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }

        public Horizontal(float f) {
            this.bias = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int size, int space, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            return kotlin.math.MathKt.roundToInt(((space - size) / 2.0f) * (1 + this.bias));
        }
    }
}
