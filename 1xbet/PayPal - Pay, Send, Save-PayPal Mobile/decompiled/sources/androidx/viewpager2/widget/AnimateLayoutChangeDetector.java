package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
final class AnimateLayoutChangeDetector {
    private static final android.view.ViewGroup.MarginLayoutParams getHighSpeedVideoSizes;
    private androidx.recyclerview.widget.LinearLayoutManager getHighSpeedVideoFpsRanges;

    static {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        getHighSpeedVideoSizes = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    AnimateLayoutChangeDetector(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.getHighSpeedVideoFpsRanges = linearLayoutManager;
    }

    private static boolean getHighSpeedVideoFpsRanges(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getHighSpeedVideoFpsRanges(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        r0 = r11.getHighSpeedVideoFpsRanges.getChildCount();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r3 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (getHighSpeedVideoFpsRanges(r11.getHighSpeedVideoFpsRanges.getChildAt(r3)) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        if (r4[r0 - 1][1] >= (r5 - r3)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        if (r11.getHighSpeedVideoFpsRanges.getChildCount() <= 1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean getHighSpeedVideoFpsRangesFor() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.getHighSpeedVideoFpsRanges.getChildCount();
        if (childCount != 0) {
            boolean z = this.getHighSpeedVideoFpsRanges.getOrientation() == 0;
            int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, childCount, 2);
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = this.getHighSpeedVideoFpsRanges.getChildAt(i3);
                if (childAt == null) {
                    throw new java.lang.IllegalStateException("null view contained in the view hierarchy");
                }
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = getHighSpeedVideoSizes;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = childAt.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            java.util.Arrays.sort(iArr, new java.util.Comparator<int[]>() { // from class: androidx.viewpager2.widget.AnimateLayoutChangeDetector.1
                @Override // java.util.Comparator
                public /* bridge */ /* synthetic */ int compare(int[] iArr4, int[] iArr5) {
                    return iArr4[0] - iArr5[0];
                }
            });
            int i4 = 1;
            while (true) {
                if (i4 < childCount) {
                    if (iArr[i4 - 1][1] != iArr[i4][0]) {
                        break;
                    }
                    i4++;
                } else {
                    int[] iArr4 = iArr[0];
                    int i5 = iArr4[1];
                    int i6 = iArr4[0];
                    if (i6 <= 0) {
                    }
                }
            }
        }
    }
}
