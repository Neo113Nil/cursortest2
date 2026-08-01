package sg.bigo.ads.K0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class X {
    public static void a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (view == null || onAttachStateChangeListener == null) {
            return;
        }
        view.addOnAttachStateChangeListener(new V(onAttachStateChangeListener));
    }

    public static boolean b(int i, int i2, View view) {
        return i >= 0 && i <= view.getWidth() && i2 >= 0 && i2 <= view.getHeight();
    }

    public static boolean c(int i, int i2, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains(i - (iArr[0] - iArr2[0]), i2 - (iArr[1] - iArr2[1]));
    }

    public static void d(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new S(view, onGlobalLayoutListener));
    }

    public static boolean b(View view) {
        Object parent;
        int i = sg.bigo.ads.I0.f.f12337a;
        if (sg.bigo.ads.I0.f.f == 1 || view.getWindowVisibility() != 0) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 0.9f && (parent = view.getParent()) != null) {
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public static void c(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        } else {
            AbstractC5496a.a("Views", "parent is not a view group, parent:" + view.getParent());
        }
    }

    public static void a(View view, W w) {
        if (view != null) {
            view.addOnLayoutChangeListener(new U(view, w));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r2.addView(r1, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r2.addView(r1, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i) {
        if (view == null || viewGroup == null) {
            return;
        }
        if (view.getParent() != null) {
            if (view.getParent() == viewGroup) {
            } else {
                c(view);
            }
        }
    }

    public static View[] a(View[] viewArr, View... viewArr2) {
        if (viewArr.length == 0) {
            return viewArr2;
        }
        if (viewArr2.length == 0) {
            return viewArr;
        }
        View[] viewArr3 = (View[]) Arrays.copyOf(viewArr, viewArr.length + viewArr2.length);
        System.arraycopy(viewArr2, 0, viewArr3, viewArr.length, viewArr2.length);
        return viewArr3;
    }

    public static Point a(View view, View view2) {
        if (view == null || view2 == null) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = -iArr[0];
        int i2 = -iArr[1];
        view2.getLocationOnScreen(iArr);
        return new Point(i + iArr[0], i2 + iArr[1]);
    }

    public static View a(Context context, View view) {
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (findViewById != null) {
            return findViewById;
        }
        if (view == null) {
            return null;
        }
        if (!a(view)) {
            AbstractC5496a.b("Views", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById2 = rootView.findViewById(R.id.content);
        return findViewById2 != null ? findViewById2 : rootView;
    }

    public static Rect a(View view, int i) {
        Point point;
        if (view == null || view.getVisibility() == 8) {
            return new Rect();
        }
        if (view.getVisibility() == 8) {
            point = new Point();
        } else {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            point = new Point(iArr[0], iArr[1]);
        }
        int i2 = point.x;
        return new Rect(i2 - i, point.y - i, view.getMeasuredWidth() + i2 + i, view.getMeasuredHeight() + point.y + i);
    }

    public static void a(Activity activity) {
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean a(int i, int i2, View view) {
        return i >= view.getLeft() && i <= view.getRight() && i2 >= view.getTop() && i2 <= view.getBottom();
    }
}
