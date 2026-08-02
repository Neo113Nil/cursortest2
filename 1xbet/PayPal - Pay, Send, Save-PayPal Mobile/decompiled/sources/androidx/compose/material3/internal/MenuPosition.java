package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000f"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition;", "", "<init>", "()V", "", "offset", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "(I)Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "endToAnchorEnd", "margin", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "(I)Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToAnchorTop", "centerToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "Vertical", "Horizontal"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MenuPosition {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.MenuPosition INSTANCE = new androidx.compose.material3.internal.MenuPosition();

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", com.daon.sdk.face.license.License.FEATURE_POSITION}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Horizontal {
        /* renamed from: position-95KtPRI */
        int mo4270position95KtPRI(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuWidth, androidx.compose.ui.unit.LayoutDirection layoutDirection);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Vertical;", "", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", com.daon.sdk.face.license.License.FEATURE_POSITION}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Vertical {
        /* renamed from: position-JVtK1S4 */
        int mo4271positionJVtK1S4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuHeight);
    }

    private MenuPosition() {
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Horizontal startToAnchorStart$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.startToAnchorStart(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Horizontal startToAnchorStart(int offset) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal(androidx.compose.ui.Alignment.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getStart(), offset);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Horizontal endToAnchorEnd$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.endToAnchorEnd(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Horizontal endToAnchorEnd(int offset) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal(androidx.compose.ui.Alignment.INSTANCE.getEnd(), androidx.compose.ui.Alignment.INSTANCE.getEnd(), offset);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Horizontal leftToWindowLeft$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.leftToWindowLeft(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Horizontal leftToWindowLeft(int margin) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal(androidx.compose.ui.AbsoluteAlignment.INSTANCE.getLeft(), margin);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Horizontal rightToWindowRight$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.rightToWindowRight(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Horizontal rightToWindowRight(int margin) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal(androidx.compose.ui.AbsoluteAlignment.INSTANCE.getRight(), margin);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Vertical topToAnchorBottom$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.topToAnchorBottom(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Vertical topToAnchorBottom(int offset) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(androidx.compose.ui.Alignment.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getBottom(), offset);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Vertical bottomToAnchorTop$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.bottomToAnchorTop(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Vertical bottomToAnchorTop(int offset) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(androidx.compose.ui.Alignment.INSTANCE.getBottom(), androidx.compose.ui.Alignment.INSTANCE.getTop(), offset);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Vertical centerToAnchorTop$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.centerToAnchorTop(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Vertical centerToAnchorTop(int offset) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), androidx.compose.ui.Alignment.INSTANCE.getTop(), offset);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Vertical topToWindowTop$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.topToWindowTop(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Vertical topToWindowTop(int margin) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical(androidx.compose.ui.Alignment.INSTANCE.getTop(), margin);
    }

    public static /* synthetic */ androidx.compose.material3.internal.MenuPosition.Vertical bottomToWindowBottom$default(androidx.compose.material3.internal.MenuPosition menuPosition, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.bottomToWindowBottom(i);
    }

    public final androidx.compose.material3.internal.MenuPosition.Vertical bottomToWindowBottom(int margin) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical(androidx.compose.ui.Alignment.INSTANCE.getBottom(), margin);
    }
}
