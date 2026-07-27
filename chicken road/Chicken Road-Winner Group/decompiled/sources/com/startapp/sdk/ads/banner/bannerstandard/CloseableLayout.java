package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.sdk.internal.f3;
import com.startapp.sdk.internal.k2;

/* loaded from: classes.dex */
public class CloseableLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f2907a;

    /* renamed from: b, reason: collision with root package name */
    private f3 f2908b;

    /* renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f2909c;

    /* renamed from: d, reason: collision with root package name */
    private ClosePosition f2910d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2911e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2912g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2913h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f2914i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f2915j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f2916k;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f2917l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2918m;

    /* renamed from: n, reason: collision with root package name */
    private f f2919n;

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2913h) {
            this.f2913h = false;
            this.f2914i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f2910d;
            Rect rect = this.f2914i;
            Rect rect2 = this.f2915j;
            int i3 = this.f2911e;
            Gravity.apply(closePosition.a(), i3, i3, rect, rect2);
            this.f2917l.set(this.f2915j);
            Rect rect3 = this.f2917l;
            int i4 = this.f2912g;
            rect3.inset(i4, i4);
            ClosePosition closePosition2 = this.f2910d;
            Rect rect4 = this.f2917l;
            Rect rect5 = this.f2916k;
            int i5 = this.f;
            Gravity.apply(closePosition2.a(), i5, i5, rect4, rect5);
            this.f2909c.setBounds(this.f2916k);
        }
        if (this.f2909c.isVisible()) {
            this.f2909c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x3 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f2915j;
        return x3 >= rect.left && y >= rect.top && x3 < rect.right && y < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f2913h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i3 = this.f2907a;
        Rect rect = this.f2915j;
        if (x3 < rect.left - i3 || y < rect.top - i3 || x3 >= rect.right + i3 || y >= rect.bottom + i3 || !(this.f2918m || this.f2909c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                a(false);
                return true;
            }
        } else if (this.f2909c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.f2919n == null) {
                this.f2919n = new f(this);
            }
            postDelayed(this.f2919n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            f3 f3Var = this.f2908b;
            if (f3Var != null) {
                f3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z3) {
        this.f2918m = z3;
    }

    public void setCloseBoundChanged(boolean z3) {
        this.f2913h = z3;
    }

    public void setCloseBounds(Rect rect) {
        this.f2915j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f2910d = closePosition;
        this.f2913h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z3) {
        if (this.f2909c.setVisible(z3, false)) {
            invalidate(this.f2915j);
        }
    }

    public void setOnCloseListener(f3 f3Var) {
        this.f2908b = f3Var;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i3 = this.f2911e;
        Gravity.apply(closePosition.a(), i3, i3, rect, rect2);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f2914i = new Rect();
        this.f2915j = new Rect();
        this.f2916k = new Rect();
        this.f2917l = new Rect();
        BitmapDrawable a3 = k2.a(context.getResources());
        this.f2909c = a3;
        this.f2910d = ClosePosition.TOP_RIGHT;
        a3.setState(FrameLayout.EMPTY_STATE_SET);
        a3.setCallback(this);
        this.f2907a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2911e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.f2912g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.f2918m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z3) {
        int[] state = this.f2909c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z3 == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f2909c;
        if (!z3) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f2915j);
    }

    public final boolean a() {
        return this.f2909c.isVisible();
    }

    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i3) {
            this.mGravity = i3;
        }

        public static ClosePosition a(String str) {
            ClosePosition closePosition = TOP_RIGHT;
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("top-left")) {
                    return TOP_LEFT;
                }
                if (!str.equals("top-right")) {
                    if (str.equals("center")) {
                        return CENTER;
                    }
                    if (str.equals("bottom-left")) {
                        return BOTTOM_LEFT;
                    }
                    if (str.equals("bottom-right")) {
                        return BOTTOM_RIGHT;
                    }
                    if (str.equals("top-center")) {
                        return TOP_CENTER;
                    }
                    if (str.equals("bottom-center")) {
                        return BOTTOM_CENTER;
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            return closePosition;
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
