package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourHighlightTarget.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/tour/compose/TourBubbleLayout;", "", "placement", "Lorg/betup/ui/tour/compose/TourBubblePlacement;", "tipPosition", "Lorg/betup/ui/tour/compose/TipPosition;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/tour/compose/TourBubblePlacement;Lorg/betup/ui/tour/compose/TipPosition;)V", "getPlacement", "()Lorg/betup/ui/tour/compose/TourBubblePlacement;", "getTipPosition", "()Lorg/betup/ui/tour/compose/TipPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TourBubbleLayout {
    public static final int $stable = 0;
    private final TourBubblePlacement placement;
    private final TipPosition tipPosition;

    public static /* synthetic */ TourBubbleLayout copy$default(TourBubbleLayout tourBubbleLayout, TourBubblePlacement tourBubblePlacement, TipPosition tipPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            tourBubblePlacement = tourBubbleLayout.placement;
        }
        if ((i & 2) != 0) {
            tipPosition = tourBubbleLayout.tipPosition;
        }
        return tourBubbleLayout.copy(tourBubblePlacement, tipPosition);
    }

    /* renamed from: component1, reason: from getter */
    public final TourBubblePlacement getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final TipPosition getTipPosition() {
        return this.tipPosition;
    }

    public final TourBubbleLayout copy(TourBubblePlacement placement, TipPosition tipPosition) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(tipPosition, "tipPosition");
        return new TourBubbleLayout(placement, tipPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TourBubbleLayout)) {
            return false;
        }
        TourBubbleLayout tourBubbleLayout = (TourBubbleLayout) other;
        return this.placement == tourBubbleLayout.placement && this.tipPosition == tourBubbleLayout.tipPosition;
    }

    public int hashCode() {
        return (this.placement.hashCode() * 31) + this.tipPosition.hashCode();
    }

    public String toString() {
        return "TourBubbleLayout(placement=" + this.placement + ", tipPosition=" + this.tipPosition + ")";
    }

    public TourBubbleLayout(TourBubblePlacement placement, TipPosition tipPosition) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(tipPosition, "tipPosition");
        this.placement = placement;
        this.tipPosition = tipPosition;
    }

    public final TourBubblePlacement getPlacement() {
        return this.placement;
    }

    public final TipPosition getTipPosition() {
        return this.tipPosition;
    }
}
