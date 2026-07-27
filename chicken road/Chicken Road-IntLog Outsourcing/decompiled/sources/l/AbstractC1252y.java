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
import com.chickyneer.roadway.R;
import java.lang.reflect.Field;
import y.AbstractC1550a;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1252y extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f10983a;

    /* renamed from: b, reason: collision with root package name */
    public int f10984b;

    /* renamed from: c, reason: collision with root package name */
    public int f10985c;

    /* renamed from: d, reason: collision with root package name */
    public int f10986d;

    /* renamed from: e, reason: collision with root package name */
    public int f10987e;

    /* renamed from: f, reason: collision with root package name */
    public int f10988f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f10989g;

    /* renamed from: h, reason: collision with root package name */
    public C1251x f10990h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10991i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10992j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10993k;

    /* renamed from: l, reason: collision with root package name */
    public I.f f10994l;

    /* renamed from: m, reason: collision with root package name */
    public B.a f10995m;

    public AbstractC1252y(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10983a = new Rect();
        this.f10984b = 0;
        this.f10985c = 0;
        this.f10986d = 0;
        this.f10987e = 0;
        this.f10992j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f10989g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
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
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i3) {
                return i3;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2, MotionEvent motionEvent) {
        int i3;
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        if (actionMasked == 1) {
            i3 = i2;
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z5) {
                        this.f10993k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f10988f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z) {
                        I.f fVar = this.f10994l;
                        if (fVar != null) {
                            if (fVar.f1238p) {
                                fVar.d();
                            }
                            fVar.f1238p = false;
                        }
                    } else {
                        if (this.f10994l == null) {
                            this.f10994l = new I.f(this);
                        }
                        I.f fVar2 = this.f10994l;
                        boolean z6 = fVar2.f1238p;
                        fVar2.f1238p = true;
                        fVar2.onTouch(this, motionEvent);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.f10993k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f10988f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z) {
                }
                return z;
            }
            i3 = i2;
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x5 = (int) motionEvent.getX(findPointerIndex);
            int y5 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x5, y5);
            if (pointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f3 = x5;
                float f6 = y5;
                this.f10993k = true;
                drawableHotspotChanged(f3, f6);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i6 = this.f10988f;
                if (i6 != -1 && (childAt = getChildAt(i6 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f10988f = pointToPosition;
                childAt3.drawableHotspotChanged(f3 - childAt3.getLeft(), f6 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z7 = (selector == null || pointToPosition == -1) ? false : true;
                if (z7) {
                    selector.setVisible(false, false);
                }
                Field field = this.f10989g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f10983a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f10984b;
                rect.top -= this.f10985c;
                rect.right += this.f10986d;
                rect.bottom += this.f10987e;
                try {
                    boolean z8 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z8) {
                        field.set(this, Boolean.valueOf(!z8));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
                if (z7) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC1550a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC1550a.e(selector2, f3, f6);
                }
                C1251x c1251x = this.f10990h;
                if (c1251x != null) {
                    c1251x.f10982b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z5 = false;
            }
            if (z) {
            }
            this.f10993k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10988f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.f10993k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f10988f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10983a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10995m != null) {
            return;
        }
        super.drawableStateChanged();
        C1251x c1251x = this.f10990h;
        if (c1251x != null) {
            c1251x.f10982b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10993k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10992j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10992j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10992j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10992j && this.f10991i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10995m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f10995m == null) {
            B.a aVar = new B.a(15, this);
            this.f10995m = aVar;
            post(aVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f10993k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10988f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B.a aVar = this.f10995m;
        if (aVar != null) {
            AbstractC1252y abstractC1252y = (AbstractC1252y) aVar.f103b;
            abstractC1252y.f10995m = null;
            abstractC1252y.removeCallbacks(aVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f10991i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1251x c1251x = null;
        if (drawable != null) {
            C1251x c1251x2 = new C1251x();
            Drawable drawable2 = c1251x2.f10981a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1251x2.f10981a = drawable;
            drawable.setCallback(c1251x2);
            c1251x2.f10982b = true;
            c1251x = c1251x2;
        }
        this.f10990h = c1251x;
        super.setSelector(c1251x);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10984b = rect.left;
        this.f10985c = rect.top;
        this.f10986d = rect.right;
        this.f10987e = rect.bottom;
    }
}
