package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;", "", "", "p0", "<init>", "(I)V", "indexModifier", com.visa.cbp.getEncExpo.warmup, "getIndexModifier", "()I", "Left", "Right", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection$Left;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection$Right;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FannedCarouselDragDirection {
    public static final int $stable = 0;
    private final int indexModifier;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection$Left;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Left extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Left INSTANCE = new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Left();

        public final int hashCode() {
            return -939126082;
        }

        private Left() {
            super(1, null);
        }

        public final java.lang.String toString() {
            return "Left";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Left)) {
                return false;
            }
            return true;
        }
    }

    private FannedCarouselDragDirection(int i) {
        this.indexModifier = i;
    }

    public final int getIndexModifier() {
        return this.indexModifier;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection$Right;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Right extends com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Right INSTANCE = new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Right();

        public final int hashCode() {
            return 957523525;
        }

        private Right() {
            super(-1, null);
        }

        public final java.lang.String toString() {
            return "Right";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Right)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FannedCarouselDragDirection(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
