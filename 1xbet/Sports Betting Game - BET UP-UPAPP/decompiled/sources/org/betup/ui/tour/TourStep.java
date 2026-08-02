package org.betup.ui.tour;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourStep.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/tour/TourStep;", "", "position", "Lorg/betup/ui/tour/TourHelperPosition;", "sign", "Lorg/betup/ui/tour/TourHelperSign;", "tourTooltipData", "Lorg/betup/ui/tour/TourTooltipData;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/tour/TourHelperPosition;Lorg/betup/ui/tour/TourHelperSign;Lorg/betup/ui/tour/TourTooltipData;)V", "getPosition", "()Lorg/betup/ui/tour/TourHelperPosition;", "getSign", "()Lorg/betup/ui/tour/TourHelperSign;", "getTourTooltipData", "()Lorg/betup/ui/tour/TourTooltipData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TourStep {
    public static final int $stable = 0;
    private final TourHelperPosition position;
    private final TourHelperSign sign;
    private final TourTooltipData tourTooltipData;

    public static /* synthetic */ TourStep copy$default(TourStep tourStep, TourHelperPosition tourHelperPosition, TourHelperSign tourHelperSign, TourTooltipData tourTooltipData, int i, Object obj) {
        if ((i & 1) != 0) {
            tourHelperPosition = tourStep.position;
        }
        if ((i & 2) != 0) {
            tourHelperSign = tourStep.sign;
        }
        if ((i & 4) != 0) {
            tourTooltipData = tourStep.tourTooltipData;
        }
        return tourStep.copy(tourHelperPosition, tourHelperSign, tourTooltipData);
    }

    /* renamed from: component1, reason: from getter */
    public final TourHelperPosition getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final TourHelperSign getSign() {
        return this.sign;
    }

    /* renamed from: component3, reason: from getter */
    public final TourTooltipData getTourTooltipData() {
        return this.tourTooltipData;
    }

    public final TourStep copy(TourHelperPosition position, TourHelperSign sign, TourTooltipData tourTooltipData) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(tourTooltipData, "tourTooltipData");
        return new TourStep(position, sign, tourTooltipData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TourStep)) {
            return false;
        }
        TourStep tourStep = (TourStep) other;
        return this.position == tourStep.position && this.sign == tourStep.sign && Intrinsics.areEqual(this.tourTooltipData, tourStep.tourTooltipData);
    }

    public int hashCode() {
        return (((this.position.hashCode() * 31) + this.sign.hashCode()) * 31) + this.tourTooltipData.hashCode();
    }

    public String toString() {
        return "TourStep(position=" + this.position + ", sign=" + this.sign + ", tourTooltipData=" + this.tourTooltipData + ")";
    }

    public TourStep(TourHelperPosition position, TourHelperSign sign, TourTooltipData tourTooltipData) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(tourTooltipData, "tourTooltipData");
        this.position = position;
        this.sign = sign;
        this.tourTooltipData = tourTooltipData;
    }

    public final TourHelperPosition getPosition() {
        return this.position;
    }

    public final TourHelperSign getSign() {
        return this.sign;
    }

    public final TourTooltipData getTourTooltipData() {
        return this.tourTooltipData;
    }
}
