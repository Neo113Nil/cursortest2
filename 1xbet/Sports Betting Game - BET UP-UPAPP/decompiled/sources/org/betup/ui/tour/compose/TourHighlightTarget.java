package org.betup.ui.tour.compose;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourHighlightTarget.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/tour/compose/TourHighlightTarget;", "", "rect", "Landroid/graphics/Rect;", "cornerRadiusDp", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/graphics/Rect;F)V", "getRect", "()Landroid/graphics/Rect;", "getCornerRadiusDp", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TourHighlightTarget {
    public static final int $stable = 8;
    private final float cornerRadiusDp;
    private final Rect rect;

    public static /* synthetic */ TourHighlightTarget copy$default(TourHighlightTarget tourHighlightTarget, Rect rect, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = tourHighlightTarget.rect;
        }
        if ((i & 2) != 0) {
            f = tourHighlightTarget.cornerRadiusDp;
        }
        return tourHighlightTarget.copy(rect, f);
    }

    /* renamed from: component1, reason: from getter */
    public final Rect getRect() {
        return this.rect;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCornerRadiusDp() {
        return this.cornerRadiusDp;
    }

    public final TourHighlightTarget copy(Rect rect, float cornerRadiusDp) {
        return new TourHighlightTarget(rect, cornerRadiusDp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TourHighlightTarget)) {
            return false;
        }
        TourHighlightTarget tourHighlightTarget = (TourHighlightTarget) other;
        return Intrinsics.areEqual(this.rect, tourHighlightTarget.rect) && Float.compare(this.cornerRadiusDp, tourHighlightTarget.cornerRadiusDp) == 0;
    }

    public int hashCode() {
        Rect rect = this.rect;
        return ((rect == null ? 0 : rect.hashCode()) * 31) + Float.hashCode(this.cornerRadiusDp);
    }

    public String toString() {
        return "TourHighlightTarget(rect=" + this.rect + ", cornerRadiusDp=" + this.cornerRadiusDp + ")";
    }

    public TourHighlightTarget(Rect rect, float f) {
        this.rect = rect;
        this.cornerRadiusDp = f;
    }

    public /* synthetic */ TourHighlightTarget(Rect rect, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rect, (i & 2) != 0 ? 0.0f : f);
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final float getCornerRadiusDp() {
        return this.cornerRadiusDp;
    }
}
