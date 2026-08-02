package n1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import game.betting133.sports1xbet.R;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static Field f18360a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18361b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC2178t f18362c = new ViewTreeObserverOnGlobalLayoutListenerC2178t();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2184z.a(view);
        }
        if (f18361b) {
            return null;
        }
        if (f18360a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f18360a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f18361b = true;
                return null;
            }
        }
        try {
            Object obj = f18360a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f18361b = true;
            return null;
        }
    }

    public static void b(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i5 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i5 >= 28) {
                tag = AbstractC2183y.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z3 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z3) {
                    List<CharSequence> text = obtain.getText();
                    if (i5 >= 28) {
                        charSequence = AbstractC2183y.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i5 >= 28) {
                charSequence = AbstractC2183y.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2184z.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void d(View view, C2161b c2161b) {
        if (c2161b == null && (a(view) instanceof C2160a)) {
            c2161b = new C2161b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2161b == null ? null : c2161b.f18415b);
    }

    public static void e(View view, CharSequence charSequence) {
        Object tag;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            AbstractC2183y.d(view, charSequence);
        } else {
            if (i >= 28) {
                tag = AbstractC2183y.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate a5 = a(view);
                C2161b c2161b = a5 != null ? a5 instanceof C2160a ? ((C2160a) a5).f18411a : new C2161b(a5) : null;
                if (c2161b == null) {
                    c2161b = new C2161b();
                }
                d(view, c2161b);
                view.setTag(R.id.tag_accessibility_pane_title, charSequence);
                b(view, 8);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC2178t viewTreeObserverOnGlobalLayoutListenerC2178t = f18362c;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2178t.f18454k.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2178t);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2178t);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2178t.f18454k.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2178t);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2178t);
            }
        }
    }

    public static void f(View view, AbstractC1674uy abstractC1674uy) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC1674uy != null ? new L(abstractC1674uy) : null);
            return;
        }
        PathInterpolator pathInterpolator = J.f18375e;
        View.OnApplyWindowInsetsListener i = abstractC1674uy != null ? new I(view, abstractC1674uy) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, i);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(i);
        }
    }
}
