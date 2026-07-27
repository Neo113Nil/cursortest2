package com.startapp.sdk.ads.list3d;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.t6;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a, reason: collision with root package name */
    private Adapter f2985a;

    /* renamed from: b, reason: collision with root package name */
    protected int f2986b;

    /* renamed from: c, reason: collision with root package name */
    protected int f2987c;

    /* renamed from: d, reason: collision with root package name */
    protected int f2988d;

    /* renamed from: e, reason: collision with root package name */
    protected int f2989e;
    protected int f;

    /* renamed from: g, reason: collision with root package name */
    protected int f2990g;

    /* renamed from: h, reason: collision with root package name */
    protected int f2991h;

    /* renamed from: i, reason: collision with root package name */
    protected int f2992i;

    /* renamed from: j, reason: collision with root package name */
    protected int f2993j;

    /* renamed from: k, reason: collision with root package name */
    private VelocityTracker f2994k;

    /* renamed from: l, reason: collision with root package name */
    protected t6 f2995l;

    /* renamed from: m, reason: collision with root package name */
    private c f2996m;

    /* renamed from: n, reason: collision with root package name */
    private final LinkedList f2997n;

    /* renamed from: o, reason: collision with root package name */
    private d f2998o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f2999p;

    /* renamed from: q, reason: collision with root package name */
    private Camera f3000q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f3001r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f3002s;

    /* renamed from: t, reason: collision with root package name */
    private int f3003t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f3004u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3005v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3006w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3007x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f2986b = 0;
        this.f2997n = new LinkedList();
        this.f3003t = Integer.MIN_VALUE;
        this.f3004u = false;
        this.f3005v = false;
        this.f3006w = false;
        this.f3007x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i3, int i4, int i5, int i6, float f, float f3) {
        if (this.f3000q == null) {
            this.f3000q = new Camera();
        }
        this.f3000q.save();
        this.f3000q.translate(0.0f, 0.0f, i6);
        this.f3000q.rotateX(f3);
        float f4 = -i6;
        this.f3000q.translate(0.0f, 0.0f, f4);
        if (this.f3001r == null) {
            this.f3001r = new Matrix();
        }
        this.f3000q.getMatrix(this.f3001r);
        this.f3000q.restore();
        this.f3001r.preTranslate(-i5, f4);
        this.f3001r.postScale(f, f);
        this.f3001r.postTranslate(i4 + i5, i3 + i6);
        if (this.f3002s == null) {
            Paint paint = new Paint();
            this.f3002s = paint;
            paint.setAntiAlias(true);
            this.f3002s.setFilterBitmap(true);
        }
        Paint paint2 = this.f3002s;
        double cos = Math.cos((f3 * 3.141592653589793d) / 180.0d);
        int i7 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i7 > 255) {
            i7 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i7, i7, i7), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f3001r, this.f3002s);
    }

    public final void b(int i3) {
        int height;
        int i4 = this.f2989e + i3;
        this.f = i4;
        int height2 = (-(i4 * 270)) / getHeight();
        this.f2991h = height2;
        int i5 = height2 % 90;
        if (i5 < 45) {
            height = (getHeight() * (-(height2 - i5))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i5))) / 270;
        }
        if (this.f3003t == Integer.MIN_VALUE && this.f2993j == this.f2985a.getCount() - 1) {
            if (getChildAt(getChildCount() - 1).getBottom() + ((int) ((r4.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.f3003t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i6 = this.f3003t;
            if (height < i6) {
                height = i6;
            }
        }
        t6 t6Var = this.f2995l;
        float f = height;
        t6Var.f4361c = f;
        t6Var.f4362d = f;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j3);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f = ((top + height) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos(f)) * 0.15000000596046448d));
        float f3 = (this.f2991h - (f * 20.0f)) % 90.0f;
        if (f3 < 0.0f) {
            f3 += 90.0f;
        }
        if (f3 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, cos, f3 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, cos, f3);
            return false;
        }
        float f4 = f3;
        a(canvas, drawingCache, top, left, width, height, cos, f4);
        a(canvas, drawingCache, top, left, width, height, cos, f4 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f2985a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2996m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        if (!this.f3004u || this.f2985a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f3006w) {
                this.f = getHeight() / 3;
            }
            this.f2993j = -1;
            int i8 = this.f;
            while (i8 < getHeight() && this.f2993j < this.f2985a.getCount() - 1) {
                int i9 = this.f2993j + 1;
                this.f2993j = i9;
                View view = this.f2985a.getView(i9, this.f2997n.size() != 0 ? (View) this.f2997n.removeFirst() : null, this);
                a(view, 0);
                i8 += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int a3 = (this.f + this.f2990g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.f2993j != this.f2985a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + a3 < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.f2997n.addLast(childAt);
                    this.f2992i++;
                    this.f2990g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.f2990g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f2992i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + a3 > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i10 = childCount - 1;
                    this.f2997n.addLast(childAt2);
                    this.f2993j--;
                    childAt2 = i10 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i10;
                }
            }
            int bottom = getChildAt(getChildCount() - 1).getBottom();
            int measuredHeight = (int) ((r2.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight;
                if (bottom + a3 >= getHeight() || this.f2993j >= this.f2985a.getCount() - 1) {
                    break;
                }
                int i11 = this.f2993j + 1;
                this.f2993j = i11;
                View view2 = this.f2985a.getView(i11, this.f2997n.size() != 0 ? (View) this.f2997n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int a4 = a(getChildAt(0));
            while (a4 + a3 > 0 && (i7 = this.f2992i) > 0) {
                int i12 = i7 - 1;
                this.f2992i = i12;
                View view3 = this.f2985a.getView(i12, this.f2997n.size() != 0 ? (View) this.f2997n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight2 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                a4 -= measuredHeight2;
                this.f2990g -= measuredHeight2;
            }
        }
        int i13 = this.f + this.f2990g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt3 = getChildAt(i14);
            int sin = (int) (Math.sin(height * 6.283185307179586d * i13) * width);
            int measuredWidth = childAt3.getMeasuredWidth();
            int measuredHeight3 = childAt3.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + sin;
            int measuredHeight4 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i15 = i13 + measuredHeight4;
            childAt3.layout(width2, i15, measuredWidth + width2, i15 + measuredHeight3);
            i13 += (measuredHeight4 * 2) + measuredHeight3;
        }
        if (this.f3006w && !this.f3007x) {
            this.f3007x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new nb(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r1 <= (r0 + 10)) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float f = 0.0f;
            if (action == 1) {
                int i3 = this.f2986b;
                if (i3 == 1) {
                    int a3 = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (a3 != -1) {
                        View childAt = getChildAt(a3);
                        int i4 = this.f2992i + a3;
                        performItemClick(childAt, i4, this.f2985a.getItemId(i4));
                    }
                } else if (i3 == 2) {
                    this.f2994k.addMovement(motionEvent);
                    this.f2994k.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    f = this.f2994k.getYVelocity();
                }
                a(f);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.f2986b == 1) {
                    int x3 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i5 = this.f2987c;
                    if (x3 >= i5 - 10 && x3 <= i5 + 10) {
                        int i6 = this.f2988d;
                        if (y >= i6 - 10) {
                        }
                    }
                    removeCallbacks(this.f2998o);
                    this.f2986b = 2;
                }
                if (this.f2986b == 2) {
                    this.f2994k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.f2988d);
                }
            }
        } else {
            p0.a(this);
            removeCallbacks(this.f2996m);
            this.f2987c = (int) motionEvent.getX();
            this.f2988d = (int) motionEvent.getY();
            this.f2989e = a(getChildAt(0)) - this.f2990g;
            if (this.f2998o == null) {
                this.f2998o = new d(this);
            }
            postDelayed(this.f2998o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f2994k = obtain;
            obtain.addMovement(motionEvent);
            this.f2986b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.f3005v) {
            setAlpha(0.0f);
        }
        this.f2985a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(t6 t6Var) {
        t6 t6Var2 = this.f2995l;
        if (t6Var2 != null) {
            float f = t6Var2.f4359a;
            float f3 = t6Var2.f4360b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f4360b = f3;
            t6Var.f4359a = f;
            t6Var.f4363e = currentAnimationTimeMillis;
        }
        this.f2995l = t6Var;
    }

    public void setFade(boolean z3) {
        this.f3005v = z3;
    }

    public void setHint(boolean z3) {
        this.f3006w = z3;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i3) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f3004u = true;
    }

    private void a(float f) {
        VelocityTracker velocityTracker = this.f2994k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f2994k = null;
        removeCallbacks(this.f2998o);
        if (this.f2996m == null) {
            this.f2996m = new c(this);
        }
        t6 t6Var = this.f2995l;
        if (t6Var != null) {
            float f3 = this.f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f4360b = f;
            t6Var.f4359a = f3;
            t6Var.f4363e = currentAnimationTimeMillis;
            post(this.f2996m);
        }
        this.f2986b = 0;
    }

    public final int a(int i3, int i4) {
        if (this.f2999p == null) {
            this.f2999p = new Rect();
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).getHitRect(this.f2999p);
            if (this.f2999p.contains(i3, i4)) {
                return i5;
            }
        }
        return -1;
    }

    public final void a(int i3) {
        View childAt = getChildAt(i3);
        int i4 = this.f2992i + i3;
        long itemId = this.f2985a.getItemId(i4);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i4, itemId);
        }
    }

    private void a(View view, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i4 = i3 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i4, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    public static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
