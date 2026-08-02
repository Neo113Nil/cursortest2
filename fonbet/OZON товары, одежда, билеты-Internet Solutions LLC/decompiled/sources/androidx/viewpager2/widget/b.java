package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f45202b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f45203a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f45202b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    b(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f45203a = linearLayoutManager;
    }

    private static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (a(viewGroup.getChildAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        r1 = r0.getChildCount();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r4 >= r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (a(r0.getChildAt(r4)) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        if (r0.getChildCount() <= 1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean b() {
        int top;
        int i11;
        int bottom;
        int i12;
        LinearLayoutManager linearLayoutManager = this.f45203a;
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z11 = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = linearLayoutManager.getChildAt(i13);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f45202b;
                int[] iArr2 = iArr[i13];
                if (z11) {
                    top = childAt.getLeft();
                    i11 = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i11 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i11;
                int[] iArr3 = iArr[i13];
                if (z11) {
                    bottom = childAt.getRight();
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i12 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i12;
            }
            Arrays.sort(iArr, new a());
            int i14 = 1;
            while (true) {
                if (i14 >= childCount) {
                    int[] iArr4 = iArr[0];
                    int i15 = iArr4[1];
                    int i16 = iArr4[0];
                    int i17 = i15 - i16;
                    if (i16 <= 0) {
                    }
                } else {
                    if (iArr[i14 - 1][1] != iArr[i14][0]) {
                        break;
                    }
                    i14++;
                }
            }
        }
    }
}
