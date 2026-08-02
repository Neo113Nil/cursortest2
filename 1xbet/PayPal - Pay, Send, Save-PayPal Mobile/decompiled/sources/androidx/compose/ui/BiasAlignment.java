package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0011"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/BiasAlignment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHorizontalBias", "getVerticalBias", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BiasAlignment implements androidx.compose.ui.Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public final long mo5504alignKFBX0sM(long size, long space, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        float f;
        float f2 = (((int) (space >> 32)) - ((int) (size >> 32))) / 2.0f;
        float f3 = (((int) (space & 4294967295L)) - ((int) (size & 4294967295L))) / 2.0f;
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            f = this.horizontalBias;
        } else {
            f = (-1.0f) * this.horizontalBias;
        }
        float f4 = this.verticalBias;
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((java.lang.Math.round(f2 * (f + 1.0f)) << 32) | (java.lang.Math.round(f3 * (f4 + 1.0f)) & 4294967295L));
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "bias", "<init>", "(F)V", "", io.ktor.http.ContentDisposition.Parameters.Size, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "Landroidx/compose/ui/Alignment$Vertical;", "other", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;", "component1", "()F", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Horizontal;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBias"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        public final float getBias() {
            return this.bias;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int align(int size, int space, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            return java.lang.Math.round(((space - size) / 2.0f) * ((layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.bias : (-1.0f) * this.bias) + 1.0f));
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final androidx.compose.ui.Alignment plus(androidx.compose.ui.Alignment.Vertical other) {
            return other instanceof androidx.compose.ui.BiasAlignment.Vertical ? new androidx.compose.ui.BiasAlignment(this.bias, ((androidx.compose.ui.BiasAlignment.Vertical) other).getBias()) : super.plus(other);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Horizontal(bias=");
            sb.append(this.bias);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.bias);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.BiasAlignment.Horizontal) && java.lang.Float.compare(this.bias, ((androidx.compose.ui.BiasAlignment.Horizontal) other).bias) == 0;
        }

        public final androidx.compose.ui.BiasAlignment.Horizontal copy(float bias) {
            return new androidx.compose.ui.BiasAlignment.Horizontal(bias);
        }

        /* renamed from: component1, reason: from getter */
        public final float getBias() {
            return this.bias;
        }

        public static /* synthetic */ androidx.compose.ui.BiasAlignment.Horizontal copy$default(androidx.compose.ui.BiasAlignment.Horizontal horizontal, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.bias;
            }
            return horizontal.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "", "bias", "<init>", "(F)V", "", io.ktor.http.ContentDisposition.Parameters.Size, "space", "align", "(II)I", "Landroidx/compose/ui/Alignment$Horizontal;", "other", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;", "component1", "()F", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Vertical;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBias"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Vertical implements androidx.compose.ui.Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f) {
            this.bias = f;
        }

        public final float getBias() {
            return this.bias;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public final int align(int size, int space) {
            return java.lang.Math.round(((space - size) / 2.0f) * (this.bias + 1.0f));
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public final androidx.compose.ui.Alignment plus(androidx.compose.ui.Alignment.Horizontal other) {
            return other instanceof androidx.compose.ui.BiasAlignment.Horizontal ? new androidx.compose.ui.BiasAlignment(((androidx.compose.ui.BiasAlignment.Horizontal) other).getBias(), this.bias) : other instanceof androidx.compose.ui.BiasAbsoluteAlignment.Horizontal ? new androidx.compose.ui.BiasAbsoluteAlignment(((androidx.compose.ui.BiasAbsoluteAlignment.Horizontal) other).getBias(), this.bias) : super.plus(other);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vertical(bias=");
            sb.append(this.bias);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.bias);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.BiasAlignment.Vertical) && java.lang.Float.compare(this.bias, ((androidx.compose.ui.BiasAlignment.Vertical) other).bias) == 0;
        }

        public final androidx.compose.ui.BiasAlignment.Vertical copy(float bias) {
            return new androidx.compose.ui.BiasAlignment.Vertical(bias);
        }

        /* renamed from: component1, reason: from getter */
        public final float getBias() {
            return this.bias;
        }

        public static /* synthetic */ androidx.compose.ui.BiasAlignment.Vertical copy$default(androidx.compose.ui.BiasAlignment.Vertical vertical, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = vertical.bias;
            }
            return vertical.copy(f);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        sb.append(this.verticalBias);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Float.hashCode(this.horizontalBias) * 31) + java.lang.Float.hashCode(this.verticalBias);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.BiasAlignment)) {
            return false;
        }
        androidx.compose.ui.BiasAlignment biasAlignment = (androidx.compose.ui.BiasAlignment) other;
        return java.lang.Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && java.lang.Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final androidx.compose.ui.BiasAlignment copy(float horizontalBias, float verticalBias) {
        return new androidx.compose.ui.BiasAlignment(horizontalBias, verticalBias);
    }

    /* renamed from: component2, reason: from getter */
    public final float getVerticalBias() {
        return this.verticalBias;
    }

    /* renamed from: component1, reason: from getter */
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public static /* synthetic */ androidx.compose.ui.BiasAlignment copy$default(androidx.compose.ui.BiasAlignment biasAlignment, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = biasAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f, f2);
    }
}
