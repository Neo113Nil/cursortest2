package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0013J%\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Landroidx/compose/material3/TooltipPositionProviderImpl;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/material3/TooltipAnchorPosition;", "p0", "", "p1", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "p3", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/unit/IntRect;J)J", "(Landroidx/compose/ui/unit/IntRect;JJ)J", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "()I", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipPositionProviderImpl implements androidx.compose.ui.window.PopupPositionProvider {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    private TooltipPositionProviderImpl(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect p0, long p1, androidx.compose.ui.unit.LayoutDirection p2, long p3) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4157getLeftlOKsHw4())) {
            return getHighResolutionOutputSizeshNQ4ISI(p0, p3);
        }
        if (androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4158getRightlOKsHw4())) {
            return getHighResolutionOutputSizeshNQ4ISI(p0, p3, p1);
        }
        if (androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4154getAbovelOKsHw4())) {
            return getHighSpeedVideoSizes(p0, p3, p1);
        }
        if (!androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4155getBelowlOKsHw4())) {
            if (!androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4159getStartlOKsHw4())) {
                if (!androidx.compose.material3.TooltipAnchorPosition.m4150equalsimpl0(i, androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4156getEndlOKsHw4())) {
                    return getHighSpeedVideoSizes(p0, p3, p1);
                }
                if (p2 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                    return getHighResolutionOutputSizeshNQ4ISI(p0, p3, p1);
                }
                return getHighResolutionOutputSizeshNQ4ISI(p0, p3);
            }
            if (p2 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                return getHighResolutionOutputSizeshNQ4ISI(p0, p3);
            }
            return getHighResolutionOutputSizeshNQ4ISI(p0, p3, p1);
        }
        int i2 = (int) (p3 >> 32);
        int left = p0.getLeft() + ((p0.getWidth() - i2) / 2);
        if (left < 0) {
            left = p0.getLeft();
        } else if (left + i2 > ((int) (p1 >> 32))) {
            left = p0.getRight() - i2;
        }
        int bottom = p0.getBottom() + this.getHighSpeedVideoSizes;
        int i3 = (int) (p3 & 4294967295L);
        if (bottom + i3 > ((int) (p1 & 4294967295L))) {
            bottom = (p0.getTop() - i3) - this.getHighSpeedVideoSizes;
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((left << 32) | (bottom & 4294967295L));
    }

    private long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.IntRect p0, long p1) {
        int left = p0.getLeft() - (((int) (p1 >> 32)) + this.getHighSpeedVideoSizes);
        if (left < 0) {
            left = p0.getRight() + this.getHighSpeedVideoSizes;
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((left << 32) | ((((p0.getTop() + p0.getBottom()) - ((int) (p1 & 4294967295L))) / 2) & 4294967295L));
    }

    private long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.IntRect p0, long p1, long p2) {
        int right = p0.getRight() + this.getHighSpeedVideoSizes;
        int i = (int) (p1 >> 32);
        if (right + i > ((int) (p2 >> 32))) {
            right = p0.getLeft() - (i + this.getHighSpeedVideoSizes);
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((right << 32) | ((((p0.getTop() + p0.getBottom()) - ((int) (p1 & 4294967295L))) / 2) & 4294967295L));
    }

    private long getHighSpeedVideoSizes(androidx.compose.ui.unit.IntRect p0, long p1, long p2) {
        int i = (int) (p1 >> 32);
        int left = p0.getLeft() + ((p0.getWidth() - i) / 2);
        if (left < 0) {
            left = p0.getLeft();
        } else if (left + i > ((int) (p2 >> 32))) {
            left = p0.getRight() - i;
        }
        int top = (p0.getTop() - ((int) (p1 & 4294967295L))) - this.getHighSpeedVideoSizes;
        if (top < 0) {
            top = p0.getBottom() + this.getHighSpeedVideoSizes;
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((left << 32) | (top & 4294967295L));
    }

    public /* synthetic */ TooltipPositionProviderImpl(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
