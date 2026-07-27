package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.chicken.jump.road.pump.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static r0 f9865j;

    /* renamed from: k, reason: collision with root package name */
    public static r0 f9866k;

    /* renamed from: a, reason: collision with root package name */
    public final View f9867a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f9868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9869c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f9870d = new q0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final q0 f9871e = new q0(this, 1);
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f9872g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f9873h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9874i;

    public r0(View view, CharSequence charSequence) {
        this.f9867a = view;
        this.f9868b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = D.D.f196a;
        this.f9869c = Build.VERSION.SDK_INT >= 28 ? D.B.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f = Integer.MAX_VALUE;
        this.f9872g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r0 r0Var) {
        r0 r0Var2 = f9865j;
        if (r0Var2 != null) {
            r0Var2.f9867a.removeCallbacks(r0Var2.f9870d);
        }
        f9865j = r0Var;
        if (r0Var != null) {
            r0Var.f9867a.postDelayed(r0Var.f9870d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        r0 r0Var = f9866k;
        View view = this.f9867a;
        if (r0Var == this) {
            f9866k = null;
            s0 s0Var = this.f9873h;
            if (s0Var != null) {
                View view2 = (View) s0Var.f9879b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) s0Var.f9878a).getSystemService("window")).removeView(view2);
                }
                this.f9873h = null;
                this.f = Integer.MAX_VALUE;
                this.f9872g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f9865j == this) {
            b(null);
        }
        view.removeCallbacks(this.f9871e);
    }

    public final void c(boolean z3) {
        int height;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = D.z.f259a;
        View view = this.f9867a;
        if (view.isAttachedToWindow()) {
            b(null);
            r0 r0Var = f9866k;
            if (r0Var != null) {
                r0Var.a();
            }
            f9866k = this;
            this.f9874i = z3;
            Context context = view.getContext();
            s0 s0Var = new s0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            s0Var.f9881d = layoutParams;
            s0Var.f9882e = new Rect();
            s0Var.f = new int[2];
            s0Var.f9883g = new int[2];
            s0Var.f9878a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            s0Var.f9879b = inflate;
            s0Var.f9880c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(s0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f9873h = s0Var;
            int i8 = this.f;
            int i9 = this.f9872g;
            boolean z4 = this.f9874i;
            View view2 = (View) s0Var.f9879b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) s0Var.f9878a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) s0Var.f9880c).setText(this.f9868b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) s0Var.f9881d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i9 + dimensionPixelOffset2;
                i3 = i9 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z4 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i7 = 1;
            } else {
                Rect rect = (Rect) s0Var.f9882e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i8;
                    i5 = i3;
                    i6 = 0;
                    i7 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i7 = 1;
                    i4 = i8;
                    i5 = i3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) s0Var.f9883g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) s0Var.f;
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i10;
                iArr2[i7] = iArr2[i7] - iArr[i7];
                layoutParams2.x = (i10 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[i7];
                int i12 = ((i11 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i12 >= 0) {
                        layoutParams2.y = i12;
                    } else {
                        layoutParams2.y = i13;
                    }
                } else if (measuredHeight + i13 <= rect.height()) {
                    layoutParams2.y = i13;
                } else {
                    layoutParams2.y = i12;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f9874i) {
                j4 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i7) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            q0 q0Var = this.f9871e;
            view.removeCallbacks(q0Var);
            view.postDelayed(q0Var, j4);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f9873h == null || !this.f9874i) {
            View view2 = this.f9867a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f = Integer.MAX_VALUE;
                        this.f9872g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f9873h == null) {
                    int x3 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int abs = Math.abs(x3 - this.f);
                    int i3 = this.f9869c;
                    if (abs > i3 || Math.abs(y - this.f9872g) > i3) {
                        this.f = x3;
                        this.f9872g = y;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f9872g = view.getHeight() / 2;
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
