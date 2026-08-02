package org.betup.ui.tour.compose;

import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"org/betup/ui/tour/compose/TourOverlayKt$TourClickSportScreen$1$ButtonPosition", "", "left", "Landroidx/compose/ui/unit/Dp;", "top", "width", "height", TtmlNode.CENTER, TtmlNode.RIGHT, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeft", "()F", "F", "getTop", "getWidth", "getHeight", "getCenter", "getRight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Lorg/betup/ui/tour/compose/TourOverlayKt$TourClickSportScreen$1$ButtonPosition;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TourOverlayKt$TourClickSportScreen$1$ButtonPosition {
    private final float center;
    private final float height;
    private final float left;
    private final float right;
    private final float top;
    private final float width;

    public /* synthetic */ TourOverlayKt$TourClickSportScreen$1$ButtonPosition(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    public static /* synthetic */ TourOverlayKt$TourClickSportScreen$1$ButtonPosition copy$default(TourOverlayKt$TourClickSportScreen$1$ButtonPosition tourOverlayKt$TourClickSportScreen$1$ButtonPosition, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.left;
        }
        if ((i & 2) != 0) {
            f2 = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.top;
        }
        float f7 = f2;
        if ((i & 4) != 0) {
            f3 = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.width;
        }
        float f8 = f3;
        if ((i & 8) != 0) {
            f4 = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.height;
        }
        float f9 = f4;
        if ((i & 16) != 0) {
            f5 = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.center;
        }
        float f10 = f5;
        if ((i & 32) != 0) {
            f6 = tourOverlayKt$TourClickSportScreen$1$ButtonPosition.right;
        }
        return tourOverlayKt$TourClickSportScreen$1$ButtonPosition.copy(f, f7, f8, f9, f10, f6);
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final float getCenter() {
        return this.center;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final TourOverlayKt$TourClickSportScreen$1$ButtonPosition copy(float left, float top, float width, float height, float center, float right) {
        return new TourOverlayKt$TourClickSportScreen$1$ButtonPosition(left, top, width, height, center, right, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TourOverlayKt$TourClickSportScreen$1$ButtonPosition)) {
            return false;
        }
        TourOverlayKt$TourClickSportScreen$1$ButtonPosition tourOverlayKt$TourClickSportScreen$1$ButtonPosition = (TourOverlayKt$TourClickSportScreen$1$ButtonPosition) other;
        return Dp.m7779equalsimpl0(this.left, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.left) && Dp.m7779equalsimpl0(this.top, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.top) && Dp.m7779equalsimpl0(this.width, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.width) && Dp.m7779equalsimpl0(this.height, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.height) && Dp.m7779equalsimpl0(this.center, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.center) && Dp.m7779equalsimpl0(this.right, tourOverlayKt$TourClickSportScreen$1$ButtonPosition.right);
    }

    public int hashCode() {
        return (((((((((Dp.m7780hashCodeimpl(this.left) * 31) + Dp.m7780hashCodeimpl(this.top)) * 31) + Dp.m7780hashCodeimpl(this.width)) * 31) + Dp.m7780hashCodeimpl(this.height)) * 31) + Dp.m7780hashCodeimpl(this.center)) * 31) + Dp.m7780hashCodeimpl(this.right);
    }

    public String toString() {
        return "ButtonPosition(left=" + Dp.m7785toStringimpl(this.left) + ", top=" + Dp.m7785toStringimpl(this.top) + ", width=" + Dp.m7785toStringimpl(this.width) + ", height=" + Dp.m7785toStringimpl(this.height) + ", center=" + Dp.m7785toStringimpl(this.center) + ", right=" + Dp.m7785toStringimpl(this.right) + ")";
    }

    private TourOverlayKt$TourClickSportScreen$1$ButtonPosition(float f, float f2, float f3, float f4, float f5, float f6) {
        this.left = f;
        this.top = f2;
        this.width = f3;
        this.height = f4;
        this.center = f5;
        this.right = f6;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getCenter() {
        return this.center;
    }

    public final float getRight() {
        return this.right;
    }
}
