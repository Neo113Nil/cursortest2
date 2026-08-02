package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/pds/components/SelectionCardConfig;", "", "<init>", "()V", "Vertical", "Grid", "HorizontalScroll", "Lcom/paypal/pds/components/SelectionCardConfig$Grid;", "Lcom/paypal/pds/components/SelectionCardConfig$HorizontalScroll;", "Lcom/paypal/pds/components/SelectionCardConfig$Vertical;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class SelectionCardConfig {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/SelectionCardConfig$Vertical;", "Lcom/paypal/pds/components/SelectionCardConfig;", "", "equalHeight", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/pds/components/SelectionCardConfig$Vertical;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEqualHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Vertical extends com.paypal.pds.components.SelectionCardConfig {
        public static final int $stable = 0;
        private final boolean equalHeight;

        public Vertical(boolean z) {
            super(null);
            this.equalHeight = z;
        }

        public /* synthetic */ Vertical(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEqualHeight() {
            return this.equalHeight;
        }

        public final java.lang.String toString() {
            boolean z = this.equalHeight;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vertical(equalHeight=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.equalHeight);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.components.SelectionCardConfig.Vertical) && this.equalHeight == ((com.paypal.pds.components.SelectionCardConfig.Vertical) other).equalHeight;
        }

        public final com.paypal.pds.components.SelectionCardConfig.Vertical copy(boolean equalHeight) {
            return new com.paypal.pds.components.SelectionCardConfig.Vertical(equalHeight);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEqualHeight() {
            return this.equalHeight;
        }

        public static /* synthetic */ com.paypal.pds.components.SelectionCardConfig.Vertical copy$default(com.paypal.pds.components.SelectionCardConfig.Vertical vertical, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = vertical.equalHeight;
            }
            return vertical.copy(z);
        }

        public Vertical() {
            this(false, 1, null);
        }
    }

    private SelectionCardConfig() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/SelectionCardConfig$Grid;", "Lcom/paypal/pds/components/SelectionCardConfig;", "", "equalHeight", "", "columns", "<init>", "(ZI)V", "component1", "()Z", "component2", "()I", "copy", "(ZI)Lcom/paypal/pds/components/SelectionCardConfig$Grid;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getEqualHeight", com.visa.cbp.getEncExpo.warmup, "getColumns"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Grid extends com.paypal.pds.components.SelectionCardConfig {
        public static final int $stable = 0;
        private final int columns;
        private final boolean equalHeight;

        public Grid(boolean z, int i) {
            super(null);
            this.equalHeight = z;
            this.columns = i;
        }

        public /* synthetic */ Grid(boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2 : i);
        }

        public final boolean getEqualHeight() {
            return this.equalHeight;
        }

        public final int getColumns() {
            return this.columns;
        }

        public final java.lang.String toString() {
            boolean z = this.equalHeight;
            int i = this.columns;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Grid(equalHeight=");
            sb.append(z);
            sb.append(", columns=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.equalHeight) * 31) + java.lang.Integer.hashCode(this.columns);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.SelectionCardConfig.Grid)) {
                return false;
            }
            com.paypal.pds.components.SelectionCardConfig.Grid grid = (com.paypal.pds.components.SelectionCardConfig.Grid) other;
            return this.equalHeight == grid.equalHeight && this.columns == grid.columns;
        }

        public final com.paypal.pds.components.SelectionCardConfig.Grid copy(boolean equalHeight, int columns) {
            return new com.paypal.pds.components.SelectionCardConfig.Grid(equalHeight, columns);
        }

        /* renamed from: component2, reason: from getter */
        public final int getColumns() {
            return this.columns;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEqualHeight() {
            return this.equalHeight;
        }

        public static /* synthetic */ com.paypal.pds.components.SelectionCardConfig.Grid copy$default(com.paypal.pds.components.SelectionCardConfig.Grid grid, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                z = grid.equalHeight;
            }
            if ((i2 & 2) != 0) {
                i = grid.columns;
            }
            return grid.copy(z, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Grid() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/SelectionCardConfig$HorizontalScroll;", "Lcom/paypal/pds/components/SelectionCardConfig;", "Landroidx/compose/ui/unit/Dp;", "cardWidth", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "copy-0680j_4", "(F)Lcom/paypal/pds/components/SelectionCardConfig$HorizontalScroll;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCardWidth-D9Ej5fM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HorizontalScroll extends com.paypal.pds.components.SelectionCardConfig {
        public static final int $stable = 0;
        private final float cardWidth;

        private HorizontalScroll(float f) {
            super(null);
            this.cardWidth = f;
        }

        public /* synthetic */ HorizontalScroll(float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f, null);
        }

        /* renamed from: getCardWidth-D9Ej5fM, reason: not valid java name */
        public final float m22028getCardWidthD9Ej5fM() {
            return this.cardWidth;
        }

        public final java.lang.String toString() {
            java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.cardWidth);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalScroll(cardWidth=");
            sb.append(m8612toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.cardWidth);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.components.SelectionCardConfig.HorizontalScroll) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.cardWidth, ((com.paypal.pds.components.SelectionCardConfig.HorizontalScroll) other).cardWidth);
        }

        /* renamed from: copy-0680j_4, reason: not valid java name */
        public final com.paypal.pds.components.SelectionCardConfig.HorizontalScroll m22027copy0680j_4(float cardWidth) {
            return new com.paypal.pds.components.SelectionCardConfig.HorizontalScroll(cardWidth, null);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCardWidth() {
            return this.cardWidth;
        }

        /* renamed from: copy-0680j_4$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.pds.components.SelectionCardConfig.HorizontalScroll m22025copy0680j_4$default(com.paypal.pds.components.SelectionCardConfig.HorizontalScroll horizontalScroll, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = horizontalScroll.cardWidth;
            }
            return horizontalScroll.m22027copy0680j_4(f);
        }

        public /* synthetic */ HorizontalScroll(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }
    }

    public /* synthetic */ SelectionCardConfig(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
