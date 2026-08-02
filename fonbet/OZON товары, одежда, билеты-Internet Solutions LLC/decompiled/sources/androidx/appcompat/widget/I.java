package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C7444a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
class I extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f37636a;

    /* renamed from: b, reason: collision with root package name */
    private int f37637b;

    /* renamed from: c, reason: collision with root package name */
    private int f37638c;

    /* renamed from: d, reason: collision with root package name */
    private int f37639d;

    /* renamed from: e, reason: collision with root package name */
    private int f37640e;

    /* renamed from: f, reason: collision with root package name */
    private int f37641f;

    /* renamed from: g, reason: collision with root package name */
    private d f37642g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37643h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37644i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37645j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.core.widget.h f37646k;

    /* renamed from: l, reason: collision with root package name */
    f f37647l;

    static class a {
        static void a(View view, float f7, float f11) {
            view.drawableHotspotChanged(f7, f11);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f37648a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f37649b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f37650c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f37651d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f37648a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f37649b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f37650c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f37651d = true;
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            }
        }

        static boolean a() {
            return f37651d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(I i11, int i12, View view) {
            try {
                f37648a.invoke(i11, Integer.valueOf(i12), view, Boolean.FALSE, -1, -1);
                f37649b.invoke(i11, Integer.valueOf(i12));
                f37650c.invoke(i11, Integer.valueOf(i12));
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z11) {
            absListView.setSelectedChildViewEnabled(z11);
        }
    }

    private static class d extends C7444a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f37652b;

        d(Drawable drawable) {
            super(drawable);
            this.f37652b = true;
        }

        final void a(boolean z11) {
            this.f37652b = z11;
        }

        @Override // k.C7444a, android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            if (this.f37652b) {
                super.draw(canvas);
            }
        }

        @Override // k.C7444a, android.graphics.drawable.Drawable
        public final void setHotspot(float f7, float f11) {
            if (this.f37652b) {
                super.setHotspot(f7, f11);
            }
        }

        @Override // k.C7444a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f37652b) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // k.C7444a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f37652b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.C7444a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z11, boolean z12) {
            if (this.f37652b) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f37653a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            f37653a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f37653a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z11) {
            Field field = f37653a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z11));
                } catch (IllegalAccessException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            I i11 = I.this;
            i11.f37647l = null;
            i11.drawableStateChanged();
        }
    }

    I(@NonNull Context context, boolean z11) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f37636a = new Rect();
        this.f37637b = 0;
        this.f37638c = 0;
        this.f37639d = 0;
        this.f37640e = 0;
        this.f37644i = z11;
        setCacheColorHint(0);
    }

    public int a(int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i13 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i14 = 0;
        View view = null;
        for (int i15 = 0; i15 < count; i15++) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i11, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                i13 += dividerHeight;
            }
            i13 += view.getMeasuredHeight();
            if (i13 >= i12) {
                return i12;
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0132 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(MotionEvent motionEvent, int i11) {
        boolean z11;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked == 1) {
            z11 = false;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                z11 = true;
                if (z11 || z12) {
                    this.f37645j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f37641f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z11) {
                    androidx.core.widget.h hVar = this.f37646k;
                    if (hVar != null) {
                        hVar.f(false);
                    }
                    return z11;
                }
                if (this.f37646k == null) {
                    this.f37646k = new androidx.core.widget.h(this);
                }
                this.f37646k.f(true);
                this.f37646k.onTouch(this, motionEvent);
                return z11;
            }
            z11 = false;
            if (z11) {
            }
            this.f37645j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f37641f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z11) {
            }
        } else {
            z11 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        if (findPointerIndex >= 0) {
            int x11 = (int) motionEvent.getX(findPointerIndex);
            int y11 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x11, y11);
            if (pointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f7 = x11;
                float f11 = y11;
                this.f37645j = true;
                int i12 = Build.VERSION.SDK_INT;
                a.a(this, f7, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i13 = this.f37641f;
                if (i13 != -1 && (childAt = getChildAt(i13 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f37641f = pointToPosition;
                a.a(childAt3, f7 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || pointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f37636a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f37637b;
                rect.top -= this.f37638c;
                rect.right += this.f37639d;
                rect.bottom += this.f37640e;
                boolean a11 = i12 >= 33 ? c.a(this) : e.a(this);
                if (childAt3.isEnabled() != a11) {
                    boolean z14 = !a11;
                    if (i12 >= 33) {
                        c.b(this, z14);
                    } else {
                        e.b(this, z14);
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    androidx.core.graphics.drawable.a.f(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    androidx.core.graphics.drawable.a.f(selector2, f7, f11);
                }
                d dVar = this.f37642g;
                if (dVar != null) {
                    dVar.a(false);
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z12 = false;
                z11 = true;
            }
            if (z11) {
            }
            this.f37645j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f37641f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z11) {
            }
        }
        z11 = false;
        if (z11) {
        }
        this.f37645j = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f37641f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z11) {
        }
    }

    final void c(boolean z11) {
        this.f37643h = z11;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f37636a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.f37647l != null) {
            return;
        }
        super.drawableStateChanged();
        d dVar = this.f37642g;
        if (dVar != null) {
            dVar.a(true);
        }
        Drawable selector = getSelector();
        if (selector != null && this.f37645j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f37644i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f37644i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f37644i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f37644i && this.f37643h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f37647l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i11 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f37647l == null) {
            f fVar = new f();
            this.f37647l = fVar;
            post(fVar);
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
                if (i11 < 30 || !b.a()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, pointToPosition, childAt);
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f37645j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f37641f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f37647l;
        if (fVar != null) {
            I i11 = I.this;
            i11.f37647l = null;
            i11.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f37642g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f37637b = rect.left;
        this.f37638c = rect.top;
        this.f37639d = rect.right;
        this.f37640e = rect.bottom;
    }
}
