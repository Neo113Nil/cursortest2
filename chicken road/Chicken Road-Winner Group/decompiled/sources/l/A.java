package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.chicken.jump.road.pump.R;
import java.lang.reflect.Field;
import x.AbstractC1247a;

/* loaded from: classes.dex */
public abstract class A extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f9674a;

    /* renamed from: b, reason: collision with root package name */
    public int f9675b;

    /* renamed from: c, reason: collision with root package name */
    public int f9676c;

    /* renamed from: d, reason: collision with root package name */
    public int f9677d;

    /* renamed from: e, reason: collision with root package name */
    public int f9678e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f9679g;

    /* renamed from: h, reason: collision with root package name */
    public C1106z f9680h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9681i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9682j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9683k;

    /* renamed from: l, reason: collision with root package name */
    public H.f f9684l;

    /* renamed from: m, reason: collision with root package name */
    public A.b f9685m;

    public A(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9674a = new Rect();
        this.f9675b = 0;
        this.f9676c = 0;
        this.f9677d = 0;
        this.f9678e = 0;
        this.f9682j = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f9679g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    public final int a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i3, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i3, MotionEvent motionEvent) {
        boolean z3;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z4) {
                        this.f9683k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        H.f fVar = this.f9684l;
                        if (fVar != null) {
                            if (fVar.f476p) {
                                fVar.d();
                            }
                            fVar.f476p = false;
                        }
                    } else {
                        if (this.f9684l == null) {
                            this.f9684l = new H.f(this);
                        }
                        H.f fVar2 = this.f9684l;
                        boolean z5 = fVar2.f476p;
                        fVar2.f476p = true;
                        fVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f9683k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x3;
                float f3 = y;
                this.f9683k = true;
                drawableHotspotChanged(f, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f = pointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                Field field = this.f9679g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f9674a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f9675b;
                rect.top -= this.f9676c;
                rect.right += this.f9677d;
                rect.bottom += this.f9678e;
                try {
                    boolean z7 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z7) {
                        field.set(this, Boolean.valueOf(!z7));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC1247a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC1247a.e(selector2, f, f3);
                }
                C1106z c1106z = this.f9680h;
                if (c1106z != null) {
                    c1106z.f9916b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z4 = false;
                z3 = true;
            }
            if (z3) {
            }
            this.f9683k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f9683k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f9674a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f9685m != null) {
            return;
        }
        super.drawableStateChanged();
        C1106z c1106z = this.f9680h;
        if (c1106z != null) {
            c1106z.f9916b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f9683k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f9682j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f9682j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f9682j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f9682j && this.f9681i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f9685m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9685m == null) {
            A.b bVar = new A.b(14, this);
            this.f9685m = bVar;
            post(bVar);
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
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.f9683k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.b bVar = this.f9685m;
        if (bVar != null) {
            A a3 = (A) bVar.f4b;
            a3.f9685m = null;
            a3.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f9681i = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1106z c1106z = null;
        if (drawable != null) {
            C1106z c1106z2 = new C1106z();
            Drawable drawable2 = c1106z2.f9915a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1106z2.f9915a = drawable;
            drawable.setCallback(c1106z2);
            c1106z2.f9916b = true;
            c1106z = c1106z2;
        }
        this.f9680h = c1106z;
        super.setSelector(c1106z);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9675b = rect.left;
        this.f9676c = rect.top;
        this.f9677d = rect.right;
        this.f9678e = rect.bottom;
    }
}
