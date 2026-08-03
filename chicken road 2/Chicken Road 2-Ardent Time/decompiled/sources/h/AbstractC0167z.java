package h;

/* renamed from: h.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0167z extends android.widget.ListView {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f3281a;

    /* renamed from: b, reason: collision with root package name */
    public int f3282b;

    /* renamed from: c, reason: collision with root package name */
    public int f3283c;

    /* renamed from: d, reason: collision with root package name */
    public int f3284d;

    /* renamed from: e, reason: collision with root package name */
    public int f3285e;

    /* renamed from: f, reason: collision with root package name */
    public int f3286f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Field f3287g;

    /* renamed from: h, reason: collision with root package name */
    public h.C0166y f3288h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3289i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3290j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3291k;

    /* renamed from: l, reason: collision with root package name */
    public C.g f3292l;

    /* renamed from: m, reason: collision with root package name */
    public C.b f3293m;

    public AbstractC0167z(android.content.Context context, boolean z2) {
        super(context, null, com.watchfacestudio.huasi_urx110.R.attr.dropDownListViewStyle);
        this.f3281a = new android.graphics.Rect();
        this.f3282b = 0;
        this.f3283c = 0;
        this.f3284d = 0;
        this.f3285e = 0;
        this.f3290j = z2;
        setCacheColorHint(0);
        try {
            java.lang.reflect.Field declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3287g = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        android.view.View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i2, i7 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i3) {
                return i3;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2, android.view.MotionEvent motionEvent) {
        int i3;
        boolean z2;
        android.view.View childAt;
        android.view.View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            i3 = i2;
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z3) {
                        this.f3291k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f3286f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        C.g gVar = this.f3292l;
                        if (gVar != null) {
                            if (gVar.f85p) {
                                gVar.d();
                            }
                            gVar.f85p = false;
                        }
                    } else {
                        if (this.f3292l == null) {
                            this.f3292l = new C.g(this);
                        }
                        C.g gVar2 = this.f3292l;
                        boolean z4 = gVar2.f85p;
                        gVar2.f85p = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f3291k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3286f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            i3 = i2;
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z3 = true;
            } else {
                android.view.View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f3291k = true;
                drawableHotspotChanged(f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f3286f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3286f = pointToPosition;
                childAt3.drawableHotspotChanged(f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                android.graphics.drawable.Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                java.lang.reflect.Field field = this.f3287g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                android.graphics.Rect rect = this.f3281a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3282b;
                rect.top -= this.f3283c;
                rect.right += this.f3284d;
                rect.bottom += this.f3285e;
                try {
                    boolean z6 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        field.set(this, java.lang.Boolean.valueOf(!z6));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (java.lang.IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    s.AbstractC0989a.e(selector, exactCenterX, exactCenterY);
                }
                android.graphics.drawable.Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    s.AbstractC0989a.e(selector2, f2, f3);
                }
                h.C0166y c0166y = this.f3288h;
                if (c0166y != null) {
                    c0166y.f3280b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z3 = false;
            }
            if (z2) {
            }
            this.f3291k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3286f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f3291k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f3286f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.f3281a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3293m != null) {
            return;
        }
        super.drawableStateChanged();
        h.C0166y c0166y = this.f3288h;
        if (c0166y != null) {
            c0166y.f3280b = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.f3291k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3290j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3290j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3290j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3290j && this.f3289i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3293m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3293m == null) {
            C.b bVar = new C.b(7, this);
            this.f3293m = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                android.graphics.drawable.Drawable selector = getSelector();
                if (selector != null && this.f3291k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3286f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C.b bVar = this.f3293m;
        if (bVar != null) {
            h.AbstractC0167z abstractC0167z = (h.AbstractC0167z) bVar.f67b;
            abstractC0167z.f3293m = null;
            abstractC0167z.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f3289i = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        h.C0166y c0166y = null;
        if (drawable != null) {
            h.C0166y c0166y2 = new h.C0166y();
            android.graphics.drawable.Drawable drawable2 = c0166y2.f3279a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0166y2.f3279a = drawable;
            drawable.setCallback(c0166y2);
            c0166y2.f3280b = true;
            c0166y = c0166y2;
        }
        this.f3288h = c0166y;
        super.setSelector(c0166y);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3282b = rect.left;
        this.f3283c = rect.top;
        this.f3284d = rect.right;
        this.f3285e = rect.bottom;
    }
}
