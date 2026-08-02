package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import game.betting133.sports1xbet.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class E0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public static E0 f18142u;

    /* renamed from: v, reason: collision with root package name */
    public static E0 f18143v;

    /* renamed from: k, reason: collision with root package name */
    public final View f18144k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f18145l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18146m;

    /* renamed from: n, reason: collision with root package name */
    public final D0 f18147n;

    /* renamed from: o, reason: collision with root package name */
    public final D0 f18148o;

    /* renamed from: p, reason: collision with root package name */
    public int f18149p;

    /* renamed from: q, reason: collision with root package name */
    public int f18150q;

    /* renamed from: r, reason: collision with root package name */
    public F0 f18151r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18152s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18153t;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.D0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [n.D0] */
    public E0(View view, CharSequence charSequence) {
        final int i = 0;
        this.f18147n = new Runnable(this) { // from class: n.D0

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ E0 f18134l;

            {
                this.f18134l = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f18134l.c(false);
                        break;
                    default:
                        this.f18134l.a();
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f18148o = new Runnable(this) { // from class: n.D0

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ E0 f18134l;

            {
                this.f18134l = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f18134l.c(false);
                        break;
                    default:
                        this.f18134l.a();
                        break;
                }
            }
        };
        this.f18144k = view;
        this.f18145l = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = n1.D.f18363a;
        this.f18146m = Build.VERSION.SDK_INT >= 28 ? d1.i.k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f18153t = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(E0 e02) {
        E0 e03 = f18142u;
        if (e03 != null) {
            e03.f18144k.removeCallbacks(e03.f18147n);
        }
        f18142u = e02;
        if (e02 != null) {
            e02.f18144k.postDelayed(e02.f18147n, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        E0 e02 = f18143v;
        View view = this.f18144k;
        if (e02 == this) {
            f18143v = null;
            F0 f02 = this.f18151r;
            if (f02 != null) {
                View view2 = f02.f18155b;
                if (view2.getParent() != null) {
                    ((WindowManager) f02.f18154a.getSystemService("window")).removeView(view2);
                }
                this.f18151r = null;
                this.f18153t = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f18142u == this) {
            b(null);
        }
        view.removeCallbacks(this.f18148o);
    }

    public final void c(boolean z3) {
        int height;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        long longPressTimeout;
        long j5;
        long j6;
        View view = this.f18144k;
        if (view.isAttachedToWindow()) {
            b(null);
            E0 e02 = f18143v;
            if (e02 != null) {
                e02.a();
            }
            f18143v = this;
            this.f18152s = z3;
            F0 f02 = new F0(view.getContext());
            this.f18151r = f02;
            int i9 = this.f18149p;
            int i10 = this.f18150q;
            boolean z5 = this.f18152s;
            View view2 = f02.f18155b;
            ViewParent parent = view2.getParent();
            Context context = f02.f18154a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            f02.f18156c.setText(this.f18145l);
            WindowManager.LayoutParams layoutParams = f02.f18157d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z5 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i8 = 1;
            } else {
                Rect rect = f02.f18158e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i5 = i9;
                    i6 = i;
                    i7 = 0;
                    i8 = 1;
                } else {
                    Resources resources = context.getResources();
                    i8 = 1;
                    i5 = i9;
                    i6 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i7 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = f02.f18159g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = f02.f;
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i7] - iArr[i7];
                iArr2[i7] = i11;
                iArr2[i8] = iArr2[i8] - iArr[i8];
                layoutParams.x = (i11 + i5) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, i7);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[i8];
                int i13 = ((i12 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + height + dimensionPixelOffset3;
                if (z5) {
                    if (i13 >= 0) {
                        layoutParams.y = i13;
                    } else {
                        layoutParams.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams.y = i14;
                } else {
                    layoutParams.y = i13;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f18152s) {
                j6 = 2500;
            } else {
                Field field = n1.C.f18360a;
                if ((view.getWindowSystemUiVisibility() & 1) == i8) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 15000;
                }
                j6 = j5 - longPressTimeout;
            }
            D0 d02 = this.f18148o;
            view.removeCallbacks(d02);
            view.postDelayed(d02, j6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f18150q) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f18151r == null || !this.f18152s) {
            View view2 = this.f18144k;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f18153t = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f18151r == null) {
                    int x5 = (int) motionEvent.getX();
                    int y5 = (int) motionEvent.getY();
                    if (!this.f18153t) {
                        int abs = Math.abs(x5 - this.f18149p);
                        int i = this.f18146m;
                        if (abs <= i) {
                        }
                    }
                    this.f18149p = x5;
                    this.f18150q = y5;
                    this.f18153t = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f18149p = view.getWidth() / 2;
        this.f18150q = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
