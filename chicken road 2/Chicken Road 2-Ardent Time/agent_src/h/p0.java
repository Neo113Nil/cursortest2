package h;

/* loaded from: classes.dex */
public final class p0 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static h.p0 f3226j;

    /* renamed from: k, reason: collision with root package name */
    public static h.p0 f3227k;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f3228a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f3229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3230c;

    /* renamed from: d, reason: collision with root package name */
    public final h.o0 f3231d = new h.o0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final h.o0 f3232e = new h.o0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f3233f;

    /* renamed from: g, reason: collision with root package name */
    public int f3234g;

    /* renamed from: h, reason: collision with root package name */
    public h.q0 f3235h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3236i;

    public p0(android.view.View view, java.lang.CharSequence charSequence) {
        this.f3228a = view;
        this.f3229b = charSequence;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        java.lang.reflect.Method method = y.B.f8419a;
        this.f3230c = android.os.Build.VERSION.SDK_INT >= 28 ? y.z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3233f = Integer.MAX_VALUE;
        this.f3234g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(h.p0 p0Var) {
        h.p0 p0Var2 = f3226j;
        if (p0Var2 != null) {
            p0Var2.f3228a.removeCallbacks(p0Var2.f3231d);
        }
        f3226j = p0Var;
        if (p0Var != null) {
            p0Var.f3228a.postDelayed(p0Var.f3231d, android.view.ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        h.p0 p0Var = f3227k;
        android.view.View view = this.f3228a;
        if (p0Var == this) {
            f3227k = null;
            h.q0 q0Var = this.f3235h;
            if (q0Var != null) {
                android.view.View view2 = q0Var.f3240b;
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) q0Var.f3239a.getSystemService("window")).removeView(view2);
                }
                this.f3235h = null;
                this.f3233f = Integer.MAX_VALUE;
                this.f3234g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                android.util.Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3226j == this) {
            b(null);
        }
        view.removeCallbacks(this.f3232e);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        java.lang.String str;
        int i3;
        java.lang.String str2;
        long longPressTimeout;
        long j2;
        long j3;
        java.lang.reflect.Field field = y.x.f8478a;
        android.view.View view = this.f3228a;
        if (view.isAttachedToWindow()) {
            b(null);
            h.p0 p0Var = f3227k;
            if (p0Var != null) {
                p0Var.a();
            }
            f3227k = this;
            this.f3236i = z2;
            h.q0 q0Var = new h.q0(view.getContext());
            this.f3235h = q0Var;
            int i4 = this.f3233f;
            int i5 = this.f3234g;
            boolean z3 = this.f3236i;
            android.view.View view2 = q0Var.f3240b;
            android.view.ViewParent parent = view2.getParent();
            android.content.Context context = q0Var.f3239a;
            if (parent != null && view2.getParent() != null) {
                ((android.view.WindowManager) context.getSystemService("window")).removeView(view2);
            }
            q0Var.f3241c.setText(this.f3229b);
            android.view.WindowManager.LayoutParams layoutParams = q0Var.f3242d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.watchfacestudio.huasi_urx110.R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.watchfacestudio.huasi_urx110.R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? com.watchfacestudio.huasi_urx110.R.dimen.tooltip_y_offset_touch : com.watchfacestudio.huasi_urx110.R.dimen.tooltip_y_offset_non_touch);
            android.view.View rootView = view.getRootView();
            android.view.ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof android.view.WindowManager.LayoutParams) || ((android.view.WindowManager.LayoutParams) layoutParams2).type != 2) {
                android.content.Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof android.content.ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof android.app.Activity) {
                        rootView = ((android.app.Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((android.content.ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                android.util.Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                android.graphics.Rect rect = q0Var.f3243e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    android.content.res.Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = q0Var.f3245g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = q0Var.f3244f;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i6;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i6 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[1];
                int i8 = ((i2 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
                str2 = str;
            }
            ((android.view.WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f3236i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            h.o0 o0Var = this.f3232e;
            view.removeCallbacks(o0Var);
            view.postDelayed(o0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f3235h != null && this.f3236i) {
            return false;
        }
        android.view.View view2 = this.f3228a;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f3233f = Integer.MAX_VALUE;
                this.f3234g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f3235h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int abs = java.lang.Math.abs(x2 - this.f3233f);
            int i2 = this.f3230c;
            if (abs > i2 || java.lang.Math.abs(y2 - this.f3234g) > i2) {
                this.f3233f = x2;
                this.f3234g = y2;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        this.f3233f = view.getWidth() / 2;
        this.f3234g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
