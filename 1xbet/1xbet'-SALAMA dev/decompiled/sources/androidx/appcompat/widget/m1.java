package androidx.appcompat.widget;

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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static m1 f8697B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static m1 f8698C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8699A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f8701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f8703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f8704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8705f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n1 f8707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8708z;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.l1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.l1] */
    public m1(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f8703d = new Runnable(this) { // from class: androidx.appcompat.widget.l1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f8696b;

            {
                this.f8696b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f8696b.c(false);
                        break;
                    default:
                        this.f8696b.a();
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f8704e = new Runnable(this) { // from class: androidx.appcompat.widget.l1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f8696b;

            {
                this.f8696b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f8696b.c(false);
                        break;
                    default:
                        this.f8696b.a();
                        break;
                }
            }
        };
        this.f8700a = view;
        this.f8701b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = P.Y.f5042a;
        this.f8702c = Build.VERSION.SDK_INT >= 28 ? P.W.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f8699A = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(m1 m1Var) {
        m1 m1Var2 = f8697B;
        if (m1Var2 != null) {
            m1Var2.f8700a.removeCallbacks(m1Var2.f8703d);
        }
        f8697B = m1Var;
        if (m1Var != null) {
            m1Var.f8700a.postDelayed(m1Var.f8703d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        m1 m1Var = f8698C;
        View view = this.f8700a;
        if (m1Var == this) {
            f8698C = null;
            n1 n1Var = this.f8707y;
            if (n1Var != null) {
                View view2 = (View) n1Var.f8712b;
                if (view2.getParent() != null) {
                    ((WindowManager) n1Var.f8711a.getSystemService("window")).removeView(view2);
                }
                this.f8707y = null;
                this.f8699A = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8697B == this) {
            b(null);
        }
        view.removeCallbacks(this.f8704e);
    }

    public final void c(boolean z4) {
        int height;
        int i7;
        int i8;
        long longPressTimeout;
        long j;
        long j3;
        WeakHashMap weakHashMap = P.U.f5037a;
        View view = this.f8700a;
        if (view.isAttachedToWindow()) {
            b(null);
            m1 m1Var = f8698C;
            if (m1Var != null) {
                m1Var.a();
            }
            f8698C = this;
            this.f8708z = z4;
            Context context = view.getContext();
            n1 n1Var = new n1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            n1Var.f8714d = layoutParams;
            n1Var.f8715e = new Rect();
            n1Var.f8716f = new int[2];
            n1Var.f8717g = new int[2];
            n1Var.f8711a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            n1Var.f8712b = viewInflate;
            n1Var.f8713c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(n1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f8707y = n1Var;
            int width = this.f8705f;
            int i9 = this.f8706x;
            boolean z7 = this.f8708z;
            View view2 = (View) n1Var.f8712b;
            ViewParent parent = view2.getParent();
            Context context2 = n1Var.f8711a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) n1Var.f8713c).setText(this.f8701b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) n1Var.f8714d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i9 + dimensionPixelOffset2;
                i7 = i9 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = (Rect) n1Var.f8715e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i8 = 0;
                } else {
                    Resources resources = context2.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i8 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) n1Var.f8717g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) n1Var.f8716f;
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i8] - iArr[i8];
                iArr2[i8] = i10;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i10 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, i8);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[1];
                int i12 = ((i7 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + height + dimensionPixelOffset3;
                if (z7) {
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
            if (this.f8708z) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j3 = j - longPressTimeout;
            }
            l1 l1Var = this.f8704e;
            view.removeCallbacks(l1Var);
            view.postDelayed(l1Var, j3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f8707y != null && this.f8708z) {
            return false;
        }
        View view2 = this.f8700a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f8699A = true;
                a();
            }
        } else if (view2.isEnabled() && this.f8707y == null) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (this.f8699A) {
                this.f8705f = x4;
                this.f8706x = y4;
                this.f8699A = false;
                b(this);
            } else {
                int iAbs = Math.abs(x4 - this.f8705f);
                int i7 = this.f8702c;
                if (iAbs > i7 || Math.abs(y4 - this.f8706x) > i7) {
                    this.f8705f = x4;
                    this.f8706x = y4;
                    this.f8699A = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f8705f = view.getWidth() / 2;
        this.f8706x = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
