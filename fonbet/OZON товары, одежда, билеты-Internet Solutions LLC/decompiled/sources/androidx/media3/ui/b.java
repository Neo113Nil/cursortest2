package androidx.media3.ui;

import Gl.C3124a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.y;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import m3.N;

/* loaded from: classes8.dex */
public final class b extends View implements y {

    /* renamed from: A, reason: collision with root package name */
    private int f44212A;

    /* renamed from: B, reason: collision with root package name */
    private long f44213B;

    /* renamed from: C, reason: collision with root package name */
    private int f44214C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f44215D;

    /* renamed from: E, reason: collision with root package name */
    private ValueAnimator f44216E;

    /* renamed from: F, reason: collision with root package name */
    private float f44217F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f44218G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f44219H;

    /* renamed from: I, reason: collision with root package name */
    private long f44220I;

    /* renamed from: J, reason: collision with root package name */
    private long f44221J;

    /* renamed from: K, reason: collision with root package name */
    private long f44222K;

    /* renamed from: L, reason: collision with root package name */
    private long f44223L;

    /* renamed from: M, reason: collision with root package name */
    private int f44224M;

    /* renamed from: N, reason: collision with root package name */
    private long[] f44225N;

    /* renamed from: O, reason: collision with root package name */
    private boolean[] f44226O;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f44227a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f44228b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f44229c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f44230d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f44231e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f44232f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f44233g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f44234h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f44235i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f44236j;

    /* renamed from: k, reason: collision with root package name */
    private final Drawable f44237k;

    /* renamed from: l, reason: collision with root package name */
    private final int f44238l;

    /* renamed from: m, reason: collision with root package name */
    private final int f44239m;

    /* renamed from: n, reason: collision with root package name */
    private final int f44240n;

    /* renamed from: o, reason: collision with root package name */
    private final int f44241o;

    /* renamed from: p, reason: collision with root package name */
    private final int f44242p;

    /* renamed from: q, reason: collision with root package name */
    private final int f44243q;

    /* renamed from: r, reason: collision with root package name */
    private final int f44244r;

    /* renamed from: s, reason: collision with root package name */
    private final int f44245s;

    /* renamed from: t, reason: collision with root package name */
    private final int f44246t;

    /* renamed from: u, reason: collision with root package name */
    private final StringBuilder f44247u;

    /* renamed from: v, reason: collision with root package name */
    private final Formatter f44248v;

    /* renamed from: w, reason: collision with root package name */
    private final I.g f44249w;

    /* renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<y.a> f44250x;

    /* renamed from: y, reason: collision with root package name */
    private final Point f44251y;

    /* renamed from: z, reason: collision with root package name */
    private final float f44252z;

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(context, null, 0);
        this.f44227a = new Rect();
        this.f44228b = new Rect();
        this.f44229c = new Rect();
        this.f44230d = new Rect();
        Paint paint = new Paint();
        this.f44231e = paint;
        Paint paint2 = new Paint();
        this.f44232f = paint2;
        Paint paint3 = new Paint();
        this.f44233g = paint3;
        Paint paint4 = new Paint();
        this.f44234h = paint4;
        Paint paint5 = new Paint();
        this.f44235i = paint5;
        Paint paint6 = new Paint();
        this.f44236j = paint6;
        paint6.setAntiAlias(true);
        this.f44250x = new CopyOnWriteArraySet<>();
        this.f44251y = new Point();
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f44252z = f7;
        this.f44246t = c(f7, -50);
        int c11 = c(f7, 4);
        int c12 = c(f7, 26);
        int c13 = c(f7, 4);
        int c14 = c(f7, 12);
        int c15 = c(f7, 0);
        int c16 = c(f7, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x4.c.f105019b, 0, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f44237k = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    c12 = Math.max(drawable.getMinimumHeight(), c12);
                }
                this.f44238l = obtainStyledAttributes.getDimensionPixelSize(3, c11);
                this.f44239m = obtainStyledAttributes.getDimensionPixelSize(12, c12);
                this.f44240n = obtainStyledAttributes.getInt(2, 0);
                this.f44241o = obtainStyledAttributes.getDimensionPixelSize(1, c13);
                this.f44242p = obtainStyledAttributes.getDimensionPixelSize(11, c14);
                this.f44243q = obtainStyledAttributes.getDimensionPixelSize(8, c15);
                this.f44244r = obtainStyledAttributes.getDimensionPixelSize(9, c16);
                int i12 = obtainStyledAttributes.getInt(6, -1);
                int i13 = obtainStyledAttributes.getInt(7, -1);
                int i14 = obtainStyledAttributes.getInt(4, -855638017);
                int i15 = obtainStyledAttributes.getInt(13, 872415231);
                int i16 = obtainStyledAttributes.getInt(0, -1291845888);
                int i17 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f44238l = c11;
            this.f44239m = c12;
            this.f44240n = 0;
            this.f44241o = c13;
            this.f44242p = c14;
            this.f44243q = c15;
            this.f44244r = c16;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f44237k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f44247u = sb2;
        this.f44248v = new Formatter(sb2, Locale.getDefault());
        this.f44249w = new I.g(this, 7);
        Drawable drawable2 = this.f44237k;
        if (drawable2 != null) {
            this.f44245s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f44245s = (Math.max(this.f44243q, Math.max(this.f44242p, this.f44244r)) + 1) / 2;
        }
        this.f44217F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f44216E = valueAnimator;
        valueAnimator.addUpdateListener(new LT.a(this, 2));
        this.f44221J = -9223372036854775807L;
        this.f44213B = -9223372036854775807L;
        this.f44212A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        bVar.f44217F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.invalidate(bVar.f44227a);
    }

    private static int c(float f7, int i11) {
        return (int) ((i11 * f7) + 0.5f);
    }

    private long d() {
        long j11 = this.f44213B;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        long j12 = this.f44221J;
        if (j12 == -9223372036854775807L) {
            return 0L;
        }
        return j12 / this.f44212A;
    }

    private long e() {
        if (this.f44228b.width() <= 0 || this.f44221J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f44230d.width() * this.f44221J) / r0.width();
    }

    private boolean h(long j11) {
        long j12 = this.f44221J;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.f44219H ? this.f44220I : this.f44222K;
        long j14 = N.j(j13 + j11, 0L, j12);
        if (j14 == j13) {
            return false;
        }
        if (this.f44219H) {
            n(j14);
        } else {
            k(j14);
        }
        m();
        return true;
    }

    private void k(long j11) {
        this.f44220I = j11;
        this.f44219H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<y.a> it = this.f44250x.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z11) {
        removeCallbacks(this.f44249w);
        this.f44219H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<y.a> it = this.f44250x.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f44220I, z11);
        }
    }

    private void m() {
        Rect rect = this.f44229c;
        Rect rect2 = this.f44228b;
        rect.set(rect2);
        Rect rect3 = this.f44230d;
        rect3.set(rect2);
        long j11 = this.f44219H ? this.f44220I : this.f44222K;
        if (this.f44221J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f44223L) / this.f44221J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j11) / this.f44221J)), rect2.right);
        } else {
            int i11 = rect2.left;
            rect.right = i11;
            rect3.right = i11;
        }
        invalidate(this.f44227a);
    }

    private void n(long j11) {
        if (this.f44220I == j11) {
            return;
        }
        this.f44220I = j11;
        Iterator<y.a> it = this.f44250x.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j11);
        }
    }

    @Override // androidx.media3.ui.y
    public final void addListener(y.a aVar) {
        aVar.getClass();
        this.f44250x.add(aVar);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f44237k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44216E;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f44217F, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    public final void g(boolean z11) {
        ValueAnimator valueAnimator = this.f44216E;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f44218G = z11;
        this.f44217F = 0.0f;
        invalidate(this.f44227a);
    }

    @Override // androidx.media3.ui.y
    public final long getPreferredUpdateDelay() {
        int width = (int) (this.f44228b.width() / this.f44252z);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.f44221J;
        if (j11 == 0 || j11 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j11 / width;
    }

    public final void i() {
        ValueAnimator valueAnimator = this.f44216E;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f44218G = false;
        this.f44217F = 1.0f;
        invalidate(this.f44227a);
    }

    public final void j() {
        ValueAnimator valueAnimator = this.f44216E;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f44218G = false;
        valueAnimator.setFloatValues(this.f44217F, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f44237k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f44228b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i11 = centerY + height;
        long j11 = this.f44221J;
        Paint paint = this.f44233g;
        Rect rect2 = this.f44230d;
        if (j11 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i11, paint);
        } else {
            Rect rect3 = this.f44229c;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int max = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (max < i14) {
                canvas.drawRect(max, centerY, i14, i11, paint);
            }
            int max2 = Math.max(i12, rect2.right);
            if (i13 > max2) {
                canvas.drawRect(max2, centerY, i13, i11, this.f44232f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i11, this.f44231e);
            }
            if (this.f44224M != 0) {
                long[] jArr = this.f44225N;
                jArr.getClass();
                boolean[] zArr = this.f44226O;
                zArr.getClass();
                int i15 = this.f44241o;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f44224M) {
                    int i19 = i18;
                    canvas.drawRect(Math.min(rect.width() - i15, Math.max(i17, ((int) ((rect.width() * N.j(jArr[i18], 0L, this.f44221J)) / this.f44221J)) - i16)) + rect.left, centerY, r3 + i15, i11, zArr[i18] ? this.f44235i : this.f44234h);
                    i18 = i19 + 1;
                    i17 = i17;
                }
            }
            canvas2 = canvas;
        }
        if (this.f44221J > 0) {
            int i21 = N.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f44237k;
            if (drawable == null) {
                canvas2.drawCircle(i21, centerY2, (int) ((((this.f44219H || isFocused()) ? this.f44244r : isEnabled() ? this.f44242p : this.f44243q) * this.f44217F) / 2.0f), this.f44236j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f44217F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f44217F)) / 2;
                drawable.setBounds(i21 - intrinsicWidth, centerY2 - intrinsicHeight, i21 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!this.f44219H || z11) {
            return;
        }
        l(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(N.E(this.f44247u, this.f44248v, this.f44222K));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(N.E(this.f44247u, this.f44248v, this.f44222K));
        if (this.f44221J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (isEnabled()) {
            long d11 = d();
            if (i11 != 66) {
                switch (i11) {
                    case 21:
                        d11 = -d11;
                        if (h(d11)) {
                            I.g gVar = this.f44249w;
                            removeCallbacks(gVar);
                            postDelayed(gVar, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (h(d11)) {
                        }
                        break;
                }
                return true;
            }
            if (this.f44219H) {
                l(false);
                return true;
            }
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        Rect rect;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        int i19 = this.f44218G ? 0 : this.f44245s;
        int i21 = this.f44240n;
        int i22 = this.f44238l;
        int i23 = this.f44239m;
        if (i21 == 1) {
            i15 = (i18 - getPaddingBottom()) - i23;
            i16 = ((i18 - getPaddingBottom()) - i22) - Math.max(i19 - (i22 / 2), 0);
        } else {
            i15 = (i18 - i23) / 2;
            i16 = (i18 - i22) / 2;
        }
        Rect rect2 = this.f44227a;
        rect2.set(paddingLeft, i15, paddingRight, i23 + i15);
        this.f44228b.set(rect2.left + i19, i16, rect2.right - i19, i22 + i16);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f44215D) == null || rect.width() != i17 || this.f44215D.height() != i18)) {
            Rect rect3 = new Rect(0, 0, i17, i18);
            this.f44215D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m();
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int i13 = this.f44239m;
        if (mode == 0) {
            size = i13;
        } else if (mode != 1073741824) {
            size = Math.min(i13, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        Drawable drawable = this.f44237k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.f44237k;
        if (drawable == null || !drawable.setLayoutDirection(i11)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f44221J > 0) {
            Point point = this.f44251y;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i11 = point.x;
            int i12 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f44230d;
            Rect rect2 = this.f44228b;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f44219H) {
                            if (i12 < this.f44246t) {
                                int i13 = this.f44214C;
                                rect.right = N.i(C3124a.a(i11, i13, 3, i13), rect2.left, rect2.right);
                            } else {
                                this.f44214C = i11;
                                rect.right = N.i(i11, rect2.left, rect2.right);
                            }
                            n(e());
                            m();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.f44219H) {
                    l(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i14 = i11;
                if (this.f44227a.contains(i14, i12)) {
                    rect.right = N.i(i14, rect2.left, rect2.right);
                    k(e());
                    m();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.f44221J <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (h(-d())) {
                l(false);
            }
        } else {
            if (i11 != 4096) {
                return false;
            }
            if (h(d())) {
                l(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // androidx.media3.ui.y
    public final void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11) {
        G10.a.c(i11 == 0 || !(jArr == null || zArr == null));
        this.f44224M = i11;
        this.f44225N = jArr;
        this.f44226O = zArr;
        m();
    }

    @Override // androidx.media3.ui.y
    public final void setBufferedPosition(long j11) {
        if (this.f44223L == j11) {
            return;
        }
        this.f44223L = j11;
        m();
    }

    @Override // androidx.media3.ui.y
    public final void setDuration(long j11) {
        if (this.f44221J == j11) {
            return;
        }
        this.f44221J = j11;
        if (this.f44219H && j11 == -9223372036854775807L) {
            l(true);
        }
        m();
    }

    @Override // android.view.View, androidx.media3.ui.y
    public final void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.f44219H || z11) {
            return;
        }
        l(true);
    }

    @Override // androidx.media3.ui.y
    public final void setPosition(long j11) {
        if (this.f44222K == j11) {
            return;
        }
        this.f44222K = j11;
        setContentDescription(N.E(this.f44247u, this.f44248v, j11));
        m();
    }
}
