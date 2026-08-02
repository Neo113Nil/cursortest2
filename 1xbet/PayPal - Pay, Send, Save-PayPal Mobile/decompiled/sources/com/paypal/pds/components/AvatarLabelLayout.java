package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/pds/components/AvatarLabelLayout;", "", "<init>", "()V", "Grid", "HorizontalScroll", "Lcom/paypal/pds/components/AvatarLabelLayout$Grid;", "Lcom/paypal/pds/components/AvatarLabelLayout$HorizontalScroll;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AvatarLabelLayout {
    public static final int $stable = 0;

    private AvatarLabelLayout() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/AvatarLabelLayout$Grid;", "Lcom/paypal/pds/components/AvatarLabelLayout;", "", "numberOfColumns", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/pds/components/AvatarLabelLayout$Grid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getNumberOfColumns"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Grid extends com.paypal.pds.components.AvatarLabelLayout {
        public static final int $stable = 0;
        private final int numberOfColumns;

        public Grid(int i) {
            super(null);
            this.numberOfColumns = i;
        }

        public /* synthetic */ Grid(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Integer.MAX_VALUE : i);
        }

        public final int getNumberOfColumns() {
            return this.numberOfColumns;
        }

        public final java.lang.String toString() {
            int i = this.numberOfColumns;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Grid(numberOfColumns=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.numberOfColumns);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.components.AvatarLabelLayout.Grid) && this.numberOfColumns == ((com.paypal.pds.components.AvatarLabelLayout.Grid) other).numberOfColumns;
        }

        public final com.paypal.pds.components.AvatarLabelLayout.Grid copy(int numberOfColumns) {
            return new com.paypal.pds.components.AvatarLabelLayout.Grid(numberOfColumns);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumberOfColumns() {
            return this.numberOfColumns;
        }

        public static /* synthetic */ com.paypal.pds.components.AvatarLabelLayout.Grid copy$default(com.paypal.pds.components.AvatarLabelLayout.Grid grid, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = grid.numberOfColumns;
            }
            return grid.copy(i);
        }

        public Grid() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/AvatarLabelLayout$HorizontalScroll;", "Lcom/paypal/pds/components/AvatarLabelLayout;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HorizontalScroll extends com.paypal.pds.components.AvatarLabelLayout {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll INSTANCE = new com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll();

        public final int hashCode() {
            return -1145936971;
        }

        private HorizontalScroll() {
            super(null);
        }

        public final java.lang.String toString() {
            return "HorizontalScroll";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AvatarLabelLayout(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
