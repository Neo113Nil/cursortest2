package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0151dv extends ListView {

    /* JADX INFO: renamed from: j */
    public final Rect f1840j;

    /* JADX INFO: renamed from: k */
    public int f1841k;

    /* JADX INFO: renamed from: l */
    public int f1842l;

    /* JADX INFO: renamed from: m */
    public int f1843m;

    /* JADX INFO: renamed from: n */
    public int f1844n;

    /* JADX INFO: renamed from: o */
    public int f1845o;

    /* JADX INFO: renamed from: p */
    public C0076bv f1846p;

    /* JADX INFO: renamed from: q */
    public boolean f1847q;

    /* JADX INFO: renamed from: r */
    public final boolean f1848r;

    /* JADX INFO: renamed from: s */
    public boolean f1849s;

    /* JADX INFO: renamed from: t */
    public aj0 f1850t;

    /* JADX INFO: renamed from: u */
    public RunnableC0897y0 f1851u;

    public C0151dv(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1840j = new Rect();
        this.f1841k = 0;
        this.f1842l = 0;
        this.f1843m = 0;
        this.f1844n = 0;
        this.f1848r = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m1306a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: b */
    public final boolean m1307b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM487a;
        View childAt;
        View childAt2;
        aj0 aj0Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f1849s = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1845o - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            aj0Var = this.f1850t;
            if (z) {
                if (aj0Var == null) {
                    this.f1850t = new aj0(this);
                }
                aj0 aj0Var2 = this.f1850t;
                boolean z3 = aj0Var2.f213y;
                aj0Var2.f213y = true;
                aj0Var2.onTouch(this, motionEvent);
            } else if (aj0Var != null) {
                if (aj0Var.f213y) {
                    aj0Var.m259d();
                }
                aj0Var.f213y = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f1849s = true;
                AbstractC0927yu.m5833a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f1845o;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1845o = iPointToPosition;
                AbstractC0927yu.m5833a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1840j;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1841k;
                rect.top -= this.f1842l;
                rect.right += this.f1843m;
                rect.bottom += this.f1844n;
                if (Build.VERSION.SDK_INT >= 33) {
                    zM487a = AbstractC0039av.m487a(this);
                } else {
                    Field field = AbstractC0115cv.f1461a;
                    if (field != null) {
                        try {
                            zM487a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM487a = false;
                        }
                    } else {
                        zM487a = false;
                    }
                }
                if (childAt3.isEnabled() != zM487a) {
                    boolean z5 = !zM487a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0039av.m488b(this, z5);
                    } else {
                        Field field2 = AbstractC0115cv.f1461a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C0076bv c0076bv = this.f1846p;
                if (c0076bv != null) {
                    c0076bv.f1000k = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f1849s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1845o - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f1849s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1845o - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        aj0Var = this.f1850t;
        if (z) {
            if (aj0Var == null) {
                this.f1850t = new aj0(this);
            }
            aj0 aj0Var3 = this.f1850t;
            boolean z6 = aj0Var3.f213y;
            aj0Var3.f213y = true;
            aj0Var3.onTouch(this, motionEvent);
        } else if (aj0Var != null) {
            if (aj0Var.f213y) {
                aj0Var.m259d();
            }
            aj0Var.f213y = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1840j;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1851u != null) {
            return;
        }
        super.drawableStateChanged();
        C0076bv c0076bv = this.f1846p;
        if (c0076bv != null) {
            c0076bv.f1000k = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1849s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1848r || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1848r || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1848r || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1848r && this.f1847q) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1851u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 7;
        if (actionMasked == 10 && this.f1851u == null) {
            RunnableC0897y0 runnableC0897y0 = new RunnableC0897y0(i, this);
            this.f1851u = runnableC0897y0;
            post(runnableC0897y0);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !AbstractC0964zu.f9962d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0964zu.f9959a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0964zu.f9960b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0964zu.f9961c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f1849s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1845o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0897y0 runnableC0897y0 = this.f1851u;
        if (runnableC0897y0 != null) {
            C0151dv c0151dv = (C0151dv) runnableC0897y0.f9120k;
            c0151dv.f1851u = null;
            c0151dv.removeCallbacks(runnableC0897y0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1847q = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0076bv c0076bv = null;
        if (drawable != null) {
            C0076bv c0076bv2 = new C0076bv();
            Drawable drawable2 = c0076bv2.f999j;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0076bv2.f999j = drawable;
            drawable.setCallback(c0076bv2);
            c0076bv2.f1000k = true;
            c0076bv = c0076bv2;
        }
        this.f1846p = c0076bv;
        super.setSelector(c0076bv);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1841k = rect.left;
        this.f1842l = rect.top;
        this.f1843m = rect.right;
        this.f1844n = rect.bottom;
    }
}
