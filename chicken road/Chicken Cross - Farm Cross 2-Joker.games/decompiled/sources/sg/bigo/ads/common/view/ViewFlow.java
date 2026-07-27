package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.L0.A;
import sg.bigo.ads.L0.B;
import sg.bigo.ads.L0.f;
import sg.bigo.ads.L0.q;
import sg.bigo.ads.L0.r;
import sg.bigo.ads.L0.s;
import sg.bigo.ads.L0.t;
import sg.bigo.ads.L0.u;
import sg.bigo.ads.L0.v;
import sg.bigo.ads.L0.w;
import sg.bigo.ads.L0.x;
import sg.bigo.ads.L0.y;
import sg.bigo.ads.L0.z;
import sg.bigo.ads.Z.c;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class ViewFlow extends f {
    public static final q P = new q();
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public VelocityTracker F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public boolean K;
    public final r L;
    public int M;
    public boolean N;
    public boolean O;
    public final y d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public View l;
    public View m;
    public B n;
    public B o;
    public sg.bigo.ads.U.r p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final Scroller t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final int x;
    public int y;
    public final int z;

    public ViewFlow(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0 < r4.getRight()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ViewFlow viewFlow) {
        int itemCount;
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.l != null) {
            itemCount = 0;
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.l;
            if (childAt == view) {
            }
        }
        if (viewFlow.m != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.m;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            itemCount = viewFlow.getItemCount() - 1;
            viewFlow.a(itemCount, -20, true);
        }
    }

    private int getScrollRange() {
        return Math.max(0, this.k - getMeasuredWidth());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.m) {
                i = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.l) {
                i++;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(boolean z) {
        boolean z2 = this.M == 2;
        if (z2 && !this.t.isFinished()) {
            this.t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.t.getCurrX();
            int currY = this.t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z2) {
            if (z) {
                c.a(this, this.L);
            } else {
                this.L.f12413a.setScrollState(0);
            }
        }
    }

    public final void c() {
        this.E = -1;
        this.v = false;
        this.w = false;
        this.s = false;
        VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.F = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof z) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.u = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        c.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.r = true;
        if (!this.O) {
            onTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new z();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new z();
    }

    public int getContentMaxWidthSpace() {
        return this.j;
    }

    public int getCurrentItem() {
        return this.e;
    }

    public int getItemCount() {
        return this.f;
    }

    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.l && childAt != this.m) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public A getOnItemChangeListener() {
        return this.d.b;
    }

    public int getViewStyle() {
        return this.h;
    }

    @Override // sg.bigo.ads.L0.f, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
    }

    @Override // sg.bigo.ads.L0.f, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.L);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.O = false;
        if (this.q) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            c();
            return false;
        }
        if (action != 0) {
            if (this.v) {
                return true;
            }
            if (this.w) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.C = x;
            this.A = x;
            float y = motionEvent.getY();
            this.D = y;
            this.B = y;
            this.E = motionEvent.getPointerId(0);
            this.w = false;
            this.u = true;
            this.t.computeScrollOffset();
            if (this.M != 2 || Math.abs(this.t.getFinalX() - this.t.getCurrX()) <= this.J) {
                b(false);
                this.v = false;
            } else {
                this.t.abortAnimation();
                this.s = false;
                this.v = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.E;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.A;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.D);
                if (f != 0.0f) {
                    float f2 = this.A;
                    if ((f2 >= this.y || f <= 0.0f) && ((f2 <= getWidth() - this.y || f >= 0.0f) && getWidth() < this.k)) {
                        this.A = x2;
                        this.B = y2;
                        this.w = true;
                        return false;
                    }
                }
                float f3 = this.z;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.s = false;
                    this.v = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.C;
                    float f5 = this.z;
                    this.A = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.B = y2;
                } else if (abs2 > f3) {
                    this.w = true;
                }
                if (this.v) {
                    a(x2);
                }
            }
        } else if (action == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.E) {
                int i2 = actionIndex == 0 ? 1 : 0;
                this.A = motionEvent.getX(i2);
                this.E = motionEvent.getPointerId(i2);
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            }
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float max;
        int i5;
        int max2;
        y yVar = this.d;
        yVar.f12420a.post(new w(yVar, this.f));
        this.k = 0;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        float abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i3 - i);
        View view = this.l;
        if (view != null) {
            if (view != null) {
                float measuredHeight = (abs - view.getMeasuredHeight()) / 2.0f;
                View view2 = this.l;
                view2.layout(0, (int) measuredHeight, view2.getMeasuredWidth(), (int) (measuredHeight + this.l.getMeasuredHeight()));
            }
            this.k = this.l.getRight() + this.k;
        }
        View view3 = null;
        boolean z2 = true;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != this.l && childAt != this.m) {
                int i7 = this.h;
                if (i7 == 2) {
                    max2 = (int) (this.k + (z2 ? Math.max(this.j, (abs2 - childAt.getMeasuredWidth()) / 2.0f) : this.i));
                } else if (i7 != 3) {
                    max2 = this.k + (z2 ? this.j : this.i);
                } else {
                    if (view3 != null) {
                        this.k = (int) (((abs2 - view3.getMeasuredWidth()) / 2.0f) + this.k);
                    }
                    max2 = (int) (((abs2 - childAt.getMeasuredWidth()) / 2.0f) + this.k);
                }
                this.k = max2;
                int i8 = ((z) childAt.getLayoutParams()).e;
                int measuredHeight2 = i8 != 48 ? (int) (i8 != 80 ? (abs - childAt.getMeasuredHeight()) / 2.0f : abs - childAt.getMeasuredHeight()) : 0;
                int i9 = this.k;
                childAt.layout(i9, measuredHeight2, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + measuredHeight2);
                this.k = childAt.getRight();
                z2 = false;
                view3 = childAt;
            }
        }
        if (view3 != null) {
            int i10 = this.h;
            if (i10 == 2) {
                f = this.k;
                max = Math.max(this.j, (abs2 - view3.getMeasuredWidth()) / 2.0f);
            } else if (i10 != 3) {
                i5 = this.k + this.j;
                this.k = i5;
            } else {
                f = this.k;
                max = Math.max(0.0f, (abs2 - view3.getMeasuredWidth()) / 2.0f);
            }
            i5 = (int) (max + f);
            this.k = i5;
        }
        View view4 = this.m;
        if (view4 != null) {
            int i11 = this.k;
            if (view4 != null) {
                View view5 = this.l;
                int right = view5 != null ? view5.getRight() : 0;
                if (i11 - right < getMeasuredWidth()) {
                    i11 = getMeasuredWidth() + right;
                }
                float measuredHeight3 = (abs - this.m.getMeasuredHeight()) / 2.0f;
                View view6 = this.m;
                view6.layout(i11, (int) measuredHeight3, view6.getMeasuredWidth() + i11, (int) (measuredHeight3 + this.m.getMeasuredHeight()));
            }
            this.k = this.m.getRight();
        }
        if (this.K) {
            a(this.e, 0, false);
        } else {
            a(this.e, -20, true);
        }
        this.K = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        sg.bigo.ads.U.r rVar;
        int i3;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        sg.bigo.ads.U.r a2;
        sg.bigo.ads.U.r rVar2;
        z zVar;
        int i4;
        int i5 = 0;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.y = Math.min(measuredWidth / 10, this.x);
        int measuredWidth2 = getMeasuredWidth() - (this.j * 2);
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt == this.l || childAt == this.m || (zVar = (z) childAt.getLayoutParams()) == null || !zVar.c) {
                i6++;
            } else {
                int i7 = zVar.f12421a;
                if (i7 > 0 && (i4 = zVar.b) > 0) {
                    rVar = sg.bigo.ads.U.r.a(i7, i4, measuredWidth2, measuredHeight);
                }
            }
        }
        rVar = null;
        if (rVar == null && (rVar2 = this.p) != null) {
            rVar = sg.bigo.ads.U.r.a(rVar2.f12567a, rVar2.b, measuredWidth2, measuredHeight);
        }
        this.e = Math.min(Math.max(0, this.e), this.f - 1);
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (childAt2 == this.l || childAt2 == this.m) {
                i3 = i5;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i3);
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i3);
            } else {
                z zVar2 = (z) childAt2.getLayoutParams();
                if (zVar2 == null) {
                    i3 = i5;
                    i8++;
                    i5 = i3;
                } else {
                    int i9 = zVar2.f12421a;
                    int i10 = zVar2.b;
                    if (this.h == Integer.MIN_VALUE) {
                        a2 = new sg.bigo.ads.U.r((int) (((measuredHeight * 1.0f) * i9) / i10), measuredHeight);
                    } else {
                        int i11 = zVar2.d;
                        if (i11 == 1 || i11 == 2) {
                            if (i11 == 2 && rVar != null) {
                                a2 = rVar;
                            } else if (i9 > 0 && i10 > 0) {
                                a2 = sg.bigo.ads.U.r.a(i9, i10, measuredWidth2, measuredHeight);
                            }
                        }
                        a2 = new sg.bigo.ads.U.r(measuredWidth2, measuredHeight);
                    }
                    int i12 = a2.f12567a;
                    ((ViewGroup.LayoutParams) zVar2).width = i12;
                    ((ViewGroup.LayoutParams) zVar2).height = a2.b;
                    i3 = 0;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((ViewGroup.LayoutParams) zVar2).height), 1073741824);
                }
            }
            childAt2.measure(makeMeasureSpec, makeMeasureSpec2);
            i8++;
            i5 = i3;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onScrollChanged(i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.l) {
            i5 = 0;
            i6 = i;
        } else {
            i6 = Math.max(childAt.getRight(), i);
            i5 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.m) {
            i6 = Math.min(childAt2.getLeft() - getMeasuredWidth(), i6);
            childCount--;
        }
        int i7 = this.h;
        int i8 = 3;
        float measuredWidth = (i7 == 2 || i7 == 3) ? i6 + ((getMeasuredWidth() * 1.0f) / 2.0f) : i6 + this.j;
        View childAt3 = getChildAt(this.e + i5);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.j * 2) : childAt3.getMeasuredWidth();
        int i9 = i5;
        while (i9 < childCount) {
            View childAt4 = getChildAt(i9);
            if (childAt4 != null) {
                int i10 = this.h;
                float max = Math.max(-1.0f, Math.min(1.0f, ((i10 == 2 || i10 == i8) ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i11 = i9 - i5;
                if (childAt4.getLeft() < measuredWidth && childAt4.getRight() > measuredWidth) {
                    this.g = i11;
                }
                y yVar = this.d;
                yVar.f12420a.post(new u(yVar, childAt4, i11, max));
                if (max == 0.0f && this.e != i11) {
                    this.e = i11;
                    this.g = i11;
                    y yVar2 = this.d;
                    yVar2.f12420a.post(new v(yVar2, childAt4, i11));
                }
            }
            i9++;
            i8 = 3;
        }
        y yVar3 = this.d;
        if (yVar3 != null) {
            yVar3.f12420a.post(new x(yVar3, i, getScrollRange()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x025a, code lost:
    
        if (r1 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
    
        if (r1 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025c, code lost:
    
        r1.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        B b;
        int i;
        int scrollRange;
        boolean z;
        this.O = true;
        boolean z2 = false;
        if (!this.q) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || getChildCount() == 0) {
            return false;
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.v) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex == -1) {
                            c();
                            z2 = true;
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.A);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.B);
                            if (abs > this.z && abs > abs2) {
                                this.s = false;
                                this.v = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f = this.C;
                                this.A = x - f > 0.0f ? f + this.z : f - this.z;
                                this.B = y;
                                setScrollState(1);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.v) {
                        a(motionEvent.getX(motionEvent.findPointerIndex(this.E)));
                    } else {
                        this.s = true;
                    }
                } else if (action == 3) {
                    if (this.v) {
                        a(this.e, 0, true);
                        c();
                        z = true;
                    }
                    z = false;
                } else if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.A = motionEvent.getX(actionIndex);
                    this.E = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.E) {
                        int i2 = actionIndex2 == 0 ? 1 : 0;
                        this.A = motionEvent.getX(i2);
                        this.E = motionEvent.getPointerId(i2);
                        VelocityTracker velocityTracker = this.F;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                    this.A = motionEvent.getX(motionEvent.findPointerIndex(this.E));
                }
            } else if (this.v) {
                VelocityTracker velocityTracker2 = this.F;
                velocityTracker2.computeCurrentVelocity(1000, this.H);
                int xVelocity = (int) velocityTracker2.getXVelocity(this.E);
                int scrollX = getScrollX();
                int x2 = (int) (motionEvent.getX(motionEvent.findPointerIndex(this.E)) - this.C);
                if (Integer.MIN_VALUE != this.h) {
                    int i3 = this.g;
                    int i4 = (Math.abs(x2) <= this.I || Math.abs(xVelocity) <= this.G || xVelocity > 0) ? i3 : i3 + 1;
                    if (i4 == i3) {
                        double measuredWidth = (x2 * 1.0f) / a(i3).getMeasuredWidth();
                        if (measuredWidth > 0.1d) {
                            i3--;
                        } else if (measuredWidth < -0.1d) {
                            i3++;
                        }
                    } else {
                        i3 = i4;
                    }
                    int max = Math.max(Math.min(i3, this.e + 1), this.e - 1);
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View view = this.l;
                        if (view != null && view == getChildAt(0)) {
                            childCount--;
                        }
                        View view2 = this.m;
                        if (view2 != null && view2 == getChildAt(getChildCount() - 1)) {
                            childCount--;
                        }
                        max = Math.max(0, Math.min(max, childCount - 1));
                    }
                    a(max, xVelocity, true);
                } else if (Math.abs(xVelocity) > this.G) {
                    int i5 = -xVelocity;
                    if (this.l != null) {
                        View childAt = getChildAt(0);
                        View view3 = this.l;
                        if (childAt == view3) {
                            i = view3.getRight();
                            if (this.m != null) {
                                View childAt2 = getChildAt(getChildCount() - 1);
                                View view4 = this.m;
                                if (childAt2 == view4) {
                                    scrollRange = view4.getLeft() - getMeasuredWidth();
                                    int i6 = scrollRange;
                                    if (getChildCount() > 0) {
                                        this.t.fling(getScrollX(), getScrollY(), i5, 0, i, i6, 0, 0);
                                        postInvalidateOnAnimation();
                                    }
                                }
                            }
                            scrollRange = getScrollRange();
                            int i62 = scrollRange;
                            if (getChildCount() > 0) {
                            }
                        }
                    }
                    i = 0;
                    if (this.m != null) {
                    }
                    scrollRange = getScrollRange();
                    int i622 = scrollRange;
                    if (getChildCount() > 0) {
                    }
                } else {
                    post(new s(this));
                }
                if (scrollX != 0 || x2 <= 0 || this.l == null || getChildAt(0) != this.l) {
                    if (this.m != null) {
                        View childAt3 = getChildAt(getChildCount() - 1);
                        View view5 = this.m;
                        if (childAt3 == view5) {
                            if (x2 < 0) {
                                if (scrollX == view5.getRight() - getMeasuredWidth()) {
                                    b = this.o;
                                }
                            }
                        }
                    }
                    c();
                    z = true;
                } else {
                    b = this.n;
                }
            } else {
                if (Integer.MIN_VALUE != this.h) {
                    a(this.g, -20, true);
                } else {
                    post(new t(this));
                }
                z = false;
            }
            this.s = false;
            z2 = z;
        } else {
            this.t.abortAnimation();
            float x3 = motionEvent.getX();
            this.C = x3;
            this.A = x3;
            float y2 = motionEvent.getY();
            this.D = y2;
            this.B = y2;
            this.E = motionEvent.getPointerId(0);
        }
        if (z2) {
            c.a(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.m || view == this.l || view == null) {
            return;
        }
        this.f++;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.m || view == this.l || view == null) {
            return;
        }
        this.f--;
    }

    public void setContentMaxWidthSpace(int i) {
        int max = Math.max(0, i);
        if (this.j != max) {
            this.j = max;
            requestLayout();
        }
    }

    public void setDividerWidth(int i) {
        int max = Math.max(0, i);
        if (this.i != max) {
            this.i = max;
            if (this.h != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.m;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.m = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(sg.bigo.ads.U.r rVar) {
        this.p = rVar;
    }

    public void setOnEndViewShowListener(B b) {
        this.o = b;
    }

    public void setOnItemChangeListener(A a2) {
        this.d.b = a2;
    }

    public void setOnStartViewShowListener(B b) {
        this.n = b;
    }

    public void setScrollEnabled(boolean z) {
        this.q = z;
    }

    public void setScrollState(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
    }

    public void setStartView(View view) {
        View view2 = this.l;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.l = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new y(this);
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 3;
        this.q = true;
        this.r = false;
        this.s = false;
        this.E = -1;
        this.K = true;
        this.L = new r(this);
        this.M = 0;
        this.O = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.t = new Scroller(context2, P);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.z = viewConfiguration.getScaledPagingTouchSlop();
        this.G = (int) (400.0f * f);
        this.H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.I = (int) (25.0f * f);
        this.J = (int) (2.0f * f);
        this.x = (int) (f * 16.0f);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new z();
    }

    public final boolean b() {
        int i = this.k;
        View view = this.l;
        if (view != null) {
            i -= view.getRight();
        }
        View view2 = this.m;
        if (view2 != null) {
            i -= view2.getMeasuredWidth();
        }
        return getWidth() >= i;
    }

    public final View a(int i) {
        List<View> items = getItems();
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    public final int a(RoundedFrameLayout roundedFrameLayout) {
        if (roundedFrameLayout == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == roundedFrameLayout) {
                return i;
            }
        }
        return -1;
    }

    public final void a(float f) {
        float f2 = this.A - f;
        this.A = f;
        float max = Math.max(0.0f, Math.min(getScrollX() + f2, getScrollRange()));
        AbstractC5496a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + max);
        int i = (int) max;
        this.A = (max - i) + this.A;
        scrollTo(i, getScrollY());
    }

    public final void a(int i, int i2, boolean z) {
        int i3;
        int scrollX;
        int i4;
        int measuredWidth;
        if (this.f <= 0) {
            return;
        }
        int min = Math.min(Math.max(0, i), this.f - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.l) {
            min++;
        }
        View childAt2 = getChildAt(min);
        if (childAt2 != null) {
            int i5 = this.h;
            i3 = (i5 == 2 || i5 == 3) ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.j, this.i);
        } else {
            i3 = 0;
        }
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.m != null) {
                i4 = this.k - getMeasuredWidth();
                measuredWidth = this.m.getMeasuredWidth();
            } else {
                i4 = this.k;
                measuredWidth = getMeasuredWidth();
            }
            i3 = (int) Math.max(0.0f, Math.min(i3, i4 - measuredWidth));
        }
        if (i3 == getScrollX()) {
            return;
        }
        if (z) {
            if (this.f == 0) {
                return;
            }
            Scroller scroller = this.t;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.u ? this.t.getCurrX() : this.t.getStartX();
                this.t.abortAnimation();
            }
            int i6 = scrollX;
            int scrollY = getScrollY();
            int i7 = i3 - i6;
            int i8 = 0 - scrollY;
            if (i7 == 0 && i8 == 0) {
                b(false);
                setScrollState(0);
                return;
            }
            setScrollState(2);
            float measuredWidth2 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i7) * 1.0f) / r10) - 0.5f) * 0.47123894f)) * measuredWidth2) + measuredWidth2;
            int abs = Math.abs(i2);
            int min2 = Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / getChildAt(this.e).getWidth()) + 1.0f) * 100.0f), 600);
            this.u = false;
            this.t.startScroll(i6, scrollY, i7, i8, min2);
            c.a(this);
            return;
        }
        b(false);
        scrollTo(i3, 0);
    }
}
