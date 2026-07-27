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
import com.chickyneer.roadway.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static p0 f10930j;

    /* renamed from: k, reason: collision with root package name */
    public static p0 f10931k;

    /* renamed from: a, reason: collision with root package name */
    public final View f10932a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f10933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10934c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f10935d = new o0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final o0 f10936e = new o0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f10937f;

    /* renamed from: g, reason: collision with root package name */
    public int f10938g;

    /* renamed from: h, reason: collision with root package name */
    public q0 f10939h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10940i;

    public p0(View view, CharSequence charSequence) {
        this.f10932a = view;
        this.f10933b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = E.K.f568a;
        this.f10934c = Build.VERSION.SDK_INT >= 28 ? E.I.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f10937f = Integer.MAX_VALUE;
        this.f10938g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p0 p0Var) {
        p0 p0Var2 = f10930j;
        if (p0Var2 != null) {
            p0Var2.f10932a.removeCallbacks(p0Var2.f10935d);
        }
        f10930j = p0Var;
        if (p0Var != null) {
            p0Var.f10932a.postDelayed(p0Var.f10935d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p0 p0Var = f10931k;
        View view = this.f10932a;
        if (p0Var == this) {
            f10931k = null;
            q0 q0Var = this.f10939h;
            if (q0Var != null) {
                View view2 = (View) q0Var.f10942b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q0Var.f10941a).getSystemService("window")).removeView(view2);
                }
                this.f10939h = null;
                this.f10937f = Integer.MAX_VALUE;
                this.f10938g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f10930j == this) {
            b(null);
        }
        view.removeCallbacks(this.f10936e);
    }

    public final void c(boolean z) {
        int height;
        int i2;
        String str;
        int i3;
        String str2;
        long longPressTimeout;
        long j2;
        long j6;
        Field field = E.G.f566a;
        View view = this.f10932a;
        if (view.isAttachedToWindow()) {
            b(null);
            p0 p0Var = f10931k;
            if (p0Var != null) {
                p0Var.a();
            }
            f10931k = this;
            this.f10940i = z;
            Context context = view.getContext();
            q0 q0Var = new q0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            q0Var.f10944d = layoutParams;
            q0Var.f10945e = new Rect();
            q0Var.f10946f = new int[2];
            q0Var.f10947g = new int[2];
            q0Var.f10941a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            q0Var.f10942b = inflate;
            q0Var.f10943c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(q0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f10939h = q0Var;
            int i6 = this.f10937f;
            int i7 = this.f10938g;
            boolean z5 = this.f10940i;
            View view2 = (View) q0Var.f10942b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) q0Var.f10941a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) q0Var.f10943c).setText(this.f10933b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) q0Var.f10944d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i6 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i7 + dimensionPixelOffset2;
                i2 = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z5 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
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
                str2 = "window";
            } else {
                Rect rect = (Rect) q0Var.f10945e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context2.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) q0Var.f10947g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) q0Var.f10946f;
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i8 + i6) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[1];
                int i10 = ((i2 + i9) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z5) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
                str2 = str;
            }
            ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f10940i) {
                j6 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j6 = j2 - longPressTimeout;
            }
            o0 o0Var = this.f10936e;
            view.removeCallbacks(o0Var);
            view.postDelayed(o0Var, j6);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f10939h != null && this.f10940i) {
            return false;
        }
        View view2 = this.f10932a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f10937f = Integer.MAX_VALUE;
                this.f10938g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f10939h == null) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            int abs = Math.abs(x5 - this.f10937f);
            int i2 = this.f10934c;
            if (abs > i2 || Math.abs(y5 - this.f10938g) > i2) {
                this.f10937f = x5;
                this.f10938g = y5;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f10937f = view.getWidth() / 2;
        this.f10938g = view.getHeight() / 2;
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
