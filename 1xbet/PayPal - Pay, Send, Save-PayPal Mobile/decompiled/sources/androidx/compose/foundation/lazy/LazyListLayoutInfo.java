package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0012\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010 \u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "", "getViewportStartOffset", "()I", "viewportStartOffset", "getViewportEndOffset", "viewportEndOffset", "getTotalItemsCount", "totalItemsCount", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "getReverseLayout", "()Z", "reverseLayout", "getBeforeContentPadding", "beforeContentPadding", "getAfterContentPadding", "afterContentPadding", "getMainAxisItemSpacing", "mainAxisItemSpacing"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyListLayoutInfo {
    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    int getViewportStartOffset();

    java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> getVisibleItemsInfo();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m1789getViewportSizeYbymL2g(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.mo1788getViewportSizeYbymL2g();
        }

        @java.lang.Deprecated
        public static androidx.compose.foundation.gestures.Orientation getOrientation(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.getOrientation();
        }

        @java.lang.Deprecated
        public static boolean getReverseLayout(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.getReverseLayout();
        }

        @java.lang.Deprecated
        public static int getBeforeContentPadding(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @java.lang.Deprecated
        public static int getAfterContentPadding(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @java.lang.Deprecated
        public static int getMainAxisItemSpacing(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
            return androidx.compose.foundation.lazy.LazyListLayoutInfo.super.getMainAxisItemSpacing();
        }
    }

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    default long mo1788getViewportSizeYbymL2g() {
        return androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    }

    default androidx.compose.foundation.gestures.Orientation getOrientation() {
        return androidx.compose.foundation.gestures.Orientation.Vertical;
    }
}
