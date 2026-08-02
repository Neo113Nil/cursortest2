package I0;

import Y4.D;
import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e extends D {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f3497k;

    public e(SlidingPaneLayout slidingPaneLayout) {
        this.f3497k = slidingPaneLayout;
    }

    @Override // Y4.D
    public final void F(int i7, int i8) {
        if (L0()) {
            SlidingPaneLayout slidingPaneLayout = this.f3497k;
            slidingPaneLayout.f9778F.c(slidingPaneLayout.f9792f, i8);
        }
    }

    @Override // Y4.D
    public final void G(int i7) {
        if (L0()) {
            SlidingPaneLayout slidingPaneLayout = this.f3497k;
            slidingPaneLayout.f9778F.c(slidingPaneLayout.f9792f, i7);
        }
    }

    @Override // Y4.D
    public final void H(View view) {
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = slidingPaneLayout.getChildAt(i7);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // Y4.D
    public final void I(int i7) {
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        if (slidingPaneLayout.f9778F.f7928a == 0) {
            float f7 = slidingPaneLayout.f9793x;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f9777E;
            if (f7 != 1.0f) {
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f9779G = true;
                return;
            }
            slidingPaneLayout.f(slidingPaneLayout.f9792f);
            Iterator it2 = copyOnWriteArrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            slidingPaneLayout.f9779G = false;
        }
    }

    @Override // Y4.D
    public final void J(View view, int i7) {
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        if (slidingPaneLayout.f9792f == null) {
            slidingPaneLayout.f9793x = 0.0f;
        } else {
            boolean b7 = slidingPaneLayout.b();
            f fVar = (f) slidingPaneLayout.f9792f.getLayoutParams();
            int width = slidingPaneLayout.f9792f.getWidth();
            if (b7) {
                i7 = (slidingPaneLayout.getWidth() - i7) - width;
            }
            float paddingRight = (i7 - ((b7 ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (b7 ? ((ViewGroup.MarginLayoutParams) fVar).rightMargin : ((ViewGroup.MarginLayoutParams) fVar).leftMargin))) / slidingPaneLayout.f9795z;
            slidingPaneLayout.f9793x = paddingRight;
            if (slidingPaneLayout.f9774B != 0) {
                slidingPaneLayout.d(paddingRight);
            }
            Iterator it = slidingPaneLayout.f9777E.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // Y4.D
    public final void K(View view, float f7) {
        int paddingLeft;
        f fVar = (f) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        if (slidingPaneLayout.b()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            if (f7 < 0.0f || (f7 == 0.0f && slidingPaneLayout.f9793x > 0.5f)) {
                paddingRight += slidingPaneLayout.f9795z;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f9792f.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) fVar).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f7 > 0.0f || (f7 == 0.0f && slidingPaneLayout.f9793x > 0.5f)) {
                paddingLeft += slidingPaneLayout.f9795z;
            }
        }
        slidingPaneLayout.f9778F.t(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    public final boolean L0() {
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        if (slidingPaneLayout.f9773A || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.c() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.c() || slidingPaneLayout.getLockMode() != 2;
    }

    @Override // Y4.D
    public final boolean d0(View view) {
        if (L0()) {
            return ((f) view.getLayoutParams()).f3500b;
        }
        return false;
    }

    @Override // Y4.D
    public final int i(View view, int i7) {
        SlidingPaneLayout slidingPaneLayout = this.f3497k;
        f fVar = (f) slidingPaneLayout.f9792f.getLayoutParams();
        if (!slidingPaneLayout.b()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            return Math.min(Math.max(i7, paddingLeft), slidingPaneLayout.f9795z + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f9792f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        return Math.max(Math.min(i7, width), width - slidingPaneLayout.f9795z);
    }

    @Override // Y4.D
    public final int j(View view) {
        return view.getTop();
    }

    @Override // Y4.D
    public final int u(View view) {
        return this.f3497k.f9795z;
    }
}
