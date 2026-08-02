package n;

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
import game.betting133.sports1xbet.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class T extends ListView {

    /* renamed from: k, reason: collision with root package name */
    public final Rect f18182k;

    /* renamed from: l, reason: collision with root package name */
    public int f18183l;

    /* renamed from: m, reason: collision with root package name */
    public int f18184m;

    /* renamed from: n, reason: collision with root package name */
    public int f18185n;

    /* renamed from: o, reason: collision with root package name */
    public int f18186o;

    /* renamed from: p, reason: collision with root package name */
    public int f18187p;

    /* renamed from: q, reason: collision with root package name */
    public Q f18188q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18189r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18190s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18191t;

    /* renamed from: u, reason: collision with root package name */
    public s1.c f18192u;

    /* renamed from: v, reason: collision with root package name */
    public A0.C f18193v;

    public T(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f18182k = new Rect();
        this.f18183l = 0;
        this.f18184m = 0;
        this.f18185n = 0;
        this.f18186o = 0;
        this.f18190s = z3;
        setCacheColorHint(0);
    }

    public final int a(int i, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i5) {
                return i5;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z3;
        boolean z5;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z6) {
                        this.f18191t = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f18187p - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        s1.c cVar = this.f18192u;
                        if (cVar != null) {
                            if (cVar.f19199z) {
                                cVar.f();
                            }
                            cVar.f19199z = false;
                        }
                    } else {
                        if (this.f18192u == null) {
                            this.f18192u = new s1.c(this);
                        }
                        s1.c cVar2 = this.f18192u;
                        boolean z7 = cVar2.f19199z;
                        cVar2.f19199z = true;
                        cVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f18191t = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f18187p - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x5 = (int) motionEvent.getX(findPointerIndex);
            int y5 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x5, y5);
            if (pointToPosition == -1) {
                z6 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x5;
                float f5 = y5;
                this.f18191t = true;
                int i5 = Build.VERSION.SDK_INT;
                AbstractC2120N.a(this, f, f5);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i6 = this.f18187p;
                if (i6 != -1 && (childAt = getChildAt(i6 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f18187p = pointToPosition;
                AbstractC2120N.a(childAt3, f - childAt3.getLeft(), f5 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z8 = (selector == null || pointToPosition == -1) ? false : true;
                if (z8) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f18182k;
                rect.set(left, top, right, bottom);
                rect.left -= this.f18183l;
                rect.top -= this.f18184m;
                rect.right += this.f18185n;
                rect.bottom += this.f18186o;
                if (i5 >= 33) {
                    z5 = P.a(this);
                } else {
                    Field field = S.f18181a;
                    if (field != null) {
                        try {
                            z5 = field.getBoolean(this);
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        }
                    }
                    z5 = false;
                }
                if (childAt3.isEnabled() != z5) {
                    boolean z9 = !z5;
                    if (Build.VERSION.SDK_INT >= 33) {
                        P.b(this, z9);
                    } else {
                        Field field2 = S.f18181a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z9));
                            } catch (IllegalAccessException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z8) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f5);
                }
                Q q5 = this.f18188q;
                if (q5 != null) {
                    q5.f18180l = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = true;
                z6 = false;
            }
            if (z3) {
            }
            this.f18191t = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f18187p - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f18191t = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f18187p - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f18182k;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f18193v != null) {
            return;
        }
        super.drawableStateChanged();
        Q q5 = this.f18188q;
        if (q5 != null) {
            q5.f18180l = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f18191t && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f18190s || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f18190s || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f18190s || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f18190s && this.f18189r) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f18193v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f18193v == null) {
            A0.C c5 = new A0.C(17, this);
            this.f18193v = c5;
            post(c5);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC2121O.f18178d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC2121O.f18175a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC2121O.f18176b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC2121O.f18177c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f18191t && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f18187p = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A0.C c5 = this.f18193v;
        if (c5 != null) {
            T t5 = (T) c5.f158l;
            t5.f18193v = null;
            t5.removeCallbacks(c5);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f18189r = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        Q q5 = null;
        if (drawable != null) {
            Q q6 = new Q();
            Drawable drawable2 = q6.f18179k;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            q6.f18179k = drawable;
            drawable.setCallback(q6);
            q6.f18180l = true;
            q5 = q6;
        }
        this.f18188q = q5;
        super.setSelector(q5);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f18183l = rect.left;
        this.f18184m = rect.top;
        this.f18185n = rect.right;
        this.f18186o = rect.bottom;
    }
}
