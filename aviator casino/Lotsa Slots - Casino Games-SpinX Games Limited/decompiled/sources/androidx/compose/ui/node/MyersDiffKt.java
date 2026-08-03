package androidx.compose.ui.node;

/* compiled from: MyersDiff.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0015\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final androidx.compose.ui.node.IntStack calculateDiff(int i, int i2, androidx.compose.ui.node.DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        androidx.compose.ui.node.IntStack intStack = new androidx.compose.ui.node.IntStack(i3 * 3);
        androidx.compose.ui.node.IntStack intStack2 = new androidx.compose.ui.node.IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] m3496constructorimpl = androidx.compose.ui.node.CenteredArray.m3496constructorimpl(new int[i4]);
        int[] m3496constructorimpl2 = androidx.compose.ui.node.CenteredArray.m3496constructorimpl(new int[i4]);
        int[] m3673constructorimpl = androidx.compose.ui.node.Snake.m3673constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m3496constructorimpl;
            int[] iArr2 = m3496constructorimpl2;
            if (m3574midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m3496constructorimpl, m3496constructorimpl2, m3673constructorimpl)) {
                if (androidx.compose.ui.node.Snake.m3676getDiagonalSizeimpl(m3673constructorimpl) > 0) {
                    androidx.compose.ui.node.Snake.m3671addDiagonalToStackimpl(m3673constructorimpl, intStack);
                }
                intStack2.pushRange(pop4, androidx.compose.ui.node.Snake.m3681getStartXimpl(m3673constructorimpl), pop2, androidx.compose.ui.node.Snake.m3682getStartYimpl(m3673constructorimpl));
                intStack2.pushRange(androidx.compose.ui.node.Snake.m3677getEndXimpl(m3673constructorimpl), pop3, androidx.compose.ui.node.Snake.m3678getEndYimpl(m3673constructorimpl), pop);
            }
            m3496constructorimpl = iArr;
            m3496constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    private static final void applyDiff(androidx.compose.ui.node.IntStack intStack, androidx.compose.ui.node.DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getLastIndex()) {
            int i4 = i + 2;
            int i5 = intStack.get(i) - intStack.get(i4);
            int i6 = intStack.get(i + 1) - intStack.get(i4);
            int i7 = intStack.get(i4);
            i += 3;
            while (i2 < i5) {
                diffCallback.remove(i3, i2);
                i2++;
            }
            while (i3 < i6) {
                diffCallback.insert(i3);
                i3++;
            }
            while (true) {
                int i8 = i7 - 1;
                if (i7 > 0) {
                    diffCallback.same(i2, i3);
                    i2++;
                    i3++;
                    i7 = i8;
                }
            }
        }
    }

    public static final void executeDiff(int i, int i2, androidx.compose.ui.node.DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m3574midPointq5eDKzI(int i, int i2, int i3, int i4, androidx.compose.ui.node.DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            androidx.compose.ui.node.CenteredArray.m3502setimpl(iArr, 1, i);
            androidx.compose.ui.node.CenteredArray.m3502setimpl(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m3573forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m3572backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m3573forward4l5_RBY(int i, int i2, int i3, int i4, androidx.compose.ui.node.DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m3499getimpl;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = java.lang.Math.abs(i8) % 2 == 1;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr, i10 + 1) > androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr, i10 - 1))) {
                m3499getimpl = androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr, i10 + 1);
                i6 = m3499getimpl;
            } else {
                m3499getimpl = androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr, i10 - 1);
                i6 = m3499getimpl + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = (i5 == 0 || i6 != m3499getimpl) ? i11 : i11 - 1;
            while (i6 < i2 && i11 < i4) {
                if (!diffCallback.areItemsTheSame(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            androidx.compose.ui.node.CenteredArray.m3502setimpl(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr2, i7) <= i6) {
                    fillSnake(m3499getimpl, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m3572backward4l5_RBY(int i, int i2, int i3, int i4, androidx.compose.ui.node.DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m3499getimpl;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = i8 % 2 == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr2, i10 + 1) < androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr2, i10 - 1))) {
                m3499getimpl = androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr2, i10 + 1);
                i6 = m3499getimpl;
            } else {
                m3499getimpl = androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr2, i10 - 1);
                i6 = m3499getimpl - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = (i5 == 0 || i6 != m3499getimpl) ? i11 : i11 + 1;
            while (i6 > i && i11 > i3) {
                if (!diffCallback.areItemsTheSame(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            androidx.compose.ui.node.CenteredArray.m3502setimpl(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (androidx.compose.ui.node.CenteredArray.m3499getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i11, m3499getimpl, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
