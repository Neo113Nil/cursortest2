package androidx.appcompat.widget;

import C0.RunnableC0085d;
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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.appcompat.widget.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0649l0 extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8683A;

    /* renamed from: B, reason: collision with root package name */
    public V.g f8684B;

    /* renamed from: C, reason: collision with root package name */
    public RunnableC0085d f8685C;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8686a;

    /* renamed from: b, reason: collision with root package name */
    public int f8687b;

    /* renamed from: c, reason: collision with root package name */
    public int f8688c;

    /* renamed from: d, reason: collision with root package name */
    public int f8689d;

    /* renamed from: e, reason: collision with root package name */
    public int f8690e;

    /* renamed from: f, reason: collision with root package name */
    public int f8691f;

    /* renamed from: x, reason: collision with root package name */
    public C0645j0 f8692x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8693y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8694z;

    public C0649l0(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f8686a = new Rect();
        this.f8687b = 0;
        this.f8688c = 0;
        this.f8689d = 0;
        this.f8690e = 0;
        this.f8694z = z4;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i7, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i7, MotionEvent motionEvent) {
        int i8;
        boolean z4;
        boolean z7;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = false;
        if (actionMasked == 1) {
            i8 = i7;
            z4 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z4 = true;
                    if (z4 || z8) {
                        this.f8683A = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z4) {
                        V.g gVar = this.f8684B;
                        if (gVar != null) {
                            if (gVar.f6616G) {
                                gVar.d();
                            }
                            gVar.f6616G = false;
                        }
                    } else {
                        if (this.f8684B == null) {
                            this.f8684B = new V.g(this);
                        }
                        V.g gVar2 = this.f8684B;
                        boolean z9 = gVar2.f6616G;
                        gVar2.f6616G = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z4;
                }
                z4 = false;
                if (z4) {
                }
                this.f8683A = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z4) {
                }
                return z4;
            }
            i8 = i7;
            z4 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i8);
        if (findPointerIndex >= 0) {
            int x4 = (int) motionEvent.getX(findPointerIndex);
            int y4 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x4, y4);
            if (pointToPosition == -1) {
                z8 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f7 = x4;
                float f8 = y4;
                this.f8683A = true;
                AbstractC0639g0.a(this, f7, f8);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i9 = this.f8691f;
                if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f8691f = pointToPosition;
                AbstractC0639g0.a(childAt3, f7 - childAt3.getLeft(), f8 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z10 = (selector == null || pointToPosition == -1) ? false : true;
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f8686a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f8687b;
                rect.top -= this.f8688c;
                rect.right += this.f8689d;
                rect.bottom += this.f8690e;
                if (L.b.c()) {
                    z7 = AbstractC0643i0.a(this);
                } else {
                    Field field = AbstractC0647k0.f8676a;
                    if (field != null) {
                        try {
                            z7 = field.getBoolean(this);
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                        }
                    }
                    z7 = false;
                }
                if (childAt3.isEnabled() != z7) {
                    boolean z11 = !z7;
                    if (L.b.c()) {
                        AbstractC0643i0.b(this, z11);
                    } else {
                        Field field2 = AbstractC0647k0.f8676a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z11));
                            } catch (IllegalAccessException e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    J.a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    J.a.e(selector2, f7, f8);
                }
                C0645j0 c0645j0 = this.f8692x;
                if (c0645j0 != null) {
                    c0645j0.f8661b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z4 = true;
                z8 = false;
            }
            if (z4) {
            }
            this.f8683A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z4) {
            }
            return z4;
        }
        z4 = false;
        if (z4) {
        }
        this.f8683A = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z4) {
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8686a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8685C != null) {
            return;
        }
        super.drawableStateChanged();
        C0645j0 c0645j0 = this.f8692x;
        if (c0645j0 != null) {
            c0645j0.f8661b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f8683A && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f8694z || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f8694z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f8694z || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f8694z && this.f8693y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8685C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8685C == null) {
            RunnableC0085d runnableC0085d = new RunnableC0085d(this, 29);
            this.f8685C = runnableC0085d;
            post(runnableC0085d);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !AbstractC0641h0.f8630d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0641h0.f8627a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0641h0.f8628b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0641h0.f8629c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                        } catch (InvocationTargetException e8) {
                            e8.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f8683A && isPressed()) {
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
            this.f8691f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0085d runnableC0085d = this.f8685C;
        if (runnableC0085d != null) {
            C0649l0 c0649l0 = (C0649l0) runnableC0085d.f1259b;
            c0649l0.f8685C = null;
            c0649l0.removeCallbacks(runnableC0085d);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f8693y = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0645j0 c0645j0 = null;
        if (drawable != null) {
            C0645j0 c0645j02 = new C0645j0();
            Drawable drawable2 = c0645j02.f8660a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0645j02.f8660a = drawable;
            drawable.setCallback(c0645j02);
            c0645j02.f8661b = true;
            c0645j0 = c0645j02;
        }
        this.f8692x = c0645j0;
        super.setSelector(c0645j0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8687b = rect.left;
        this.f8688c = rect.top;
        this.f8689d = rect.right;
        this.f8690e = rect.bottom;
    }
}
