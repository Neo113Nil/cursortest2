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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.appcompat.widget.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0628l0 extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8683A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public V.g f8684B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RunnableC0085d f8685C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8691f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0624j0 f8692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f8694z;

    public C0628l0(Context context, boolean z4) {
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
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i7, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i8) {
                return i8;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(int i7, MotionEvent motionEvent) {
        boolean z4;
        boolean zA;
        View childAt;
        View childAt2;
        V.g gVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z7 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z4 = true;
            } else if (actionMasked != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || z7) {
                this.f8683A = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z4) {
                if (this.f8684B == null) {
                    this.f8684B = new V.g(this);
                }
                V.g gVar2 = this.f8684B;
                boolean z8 = gVar2.f6616G;
                gVar2.f6616G = true;
                gVar2.onTouch(this, motionEvent);
            } else {
                gVar = this.f8684B;
                if (gVar != null) {
                    if (gVar.f6616G) {
                        gVar.d();
                    }
                    gVar.f6616G = false;
                }
            }
            return z4;
        }
        z4 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex < 0) {
            z4 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y4);
            if (iPointToPosition == -1) {
                z7 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f7 = x4;
                float f8 = y4;
                this.f8683A = true;
                AbstractC0618g0.a(this, f7, f8);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i8 = this.f8691f;
                if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f8691f = iPointToPosition;
                AbstractC0618g0.a(childAt3, f7 - childAt3.getLeft(), f8 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z9 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z9) {
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
                    zA = AbstractC0622i0.a(this);
                } else {
                    Field field = AbstractC0626k0.f8676a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z10 = !zA;
                    if (L.b.c()) {
                        AbstractC0622i0.b(this, z10);
                    } else {
                        Field field2 = AbstractC0626k0.f8676a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z10));
                            } catch (IllegalAccessException e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z9) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    J.a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    J.a.e(selector2, f7, f8);
                }
                C0624j0 c0624j0 = this.f8692x;
                if (c0624j0 != null) {
                    c0624j0.f8661b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z4 = true;
                z7 = false;
            }
        }
        if (z4) {
            this.f8683A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f8683A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8691f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z4) {
            if (this.f8684B == null) {
                this.f8684B = new V.g(this);
            }
            V.g gVar3 = this.f8684B;
            boolean z11 = gVar3.f6616G;
            gVar3.f6616G = true;
            gVar3.onTouch(this, motionEvent);
        } else {
            gVar = this.f8684B;
            if (gVar != null) {
                if (gVar.f6616G) {
                    gVar.d();
                }
                gVar.f6616G = false;
            }
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
        C0624j0 c0624j0 = this.f8692x;
        if (c0624j0 != null) {
            c0624j0.f8661b = true;
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
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !AbstractC0620h0.f8630d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0620h0.f8627a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0620h0.f8628b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0620h0.f8629c.invoke(this, Integer.valueOf(iPointToPosition));
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
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8691f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0085d runnableC0085d = this.f8685C;
        if (runnableC0085d != null) {
            C0628l0 c0628l0 = (C0628l0) runnableC0085d.f1259b;
            c0628l0.f8685C = null;
            c0628l0.removeCallbacks(runnableC0085d);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f8693y = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0624j0 c0624j0 = null;
        if (drawable != null) {
            C0624j0 c0624j1 = new C0624j0();
            Drawable drawable2 = c0624j1.f8660a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0624j1.f8660a = drawable;
            drawable.setCallback(c0624j1);
            c0624j1.f8661b = true;
            c0624j0 = c0624j1;
        }
        this.f8692x = c0624j0;
        super.setSelector(c0624j0);
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
