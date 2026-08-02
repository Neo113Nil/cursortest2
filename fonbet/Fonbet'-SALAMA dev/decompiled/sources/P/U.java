package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f5037a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f5038b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5039c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final C f5040d = new C();

    /* renamed from: e, reason: collision with root package name */
    public static final E f5041e = new E();

    public static b0 a(View view) {
        if (f5037a == null) {
            f5037a = new WeakHashMap();
        }
        b0 b0Var = (b0) f5037a.get(view);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(view);
        f5037a.put(view, b0Var2);
        return b0Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = T.f5033d;
        T t7 = (T) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (t7 == null) {
            t7 = new T();
            t7.f5034a = null;
            t7.f5035b = null;
            t7.f5036c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t7);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = t7.f5034a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = T.f5033d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (t7.f5034a == null) {
                            t7.f5034a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = T.f5033d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                t7.f5034a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    t7.f5034a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = t7.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (t7.f5035b == null) {
                    t7.f5035b = new SparseArray();
                }
                t7.f5035b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return N.a(view);
        }
        if (f5039c) {
            return null;
        }
        if (f5038b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5038b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5039c = true;
                return null;
            }
        }
        try {
            Object obj = f5038b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5039c = true;
            return null;
        }
    }

    public static String[] d(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? P.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i7) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i8 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i8 >= 28) {
                tag = M.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z4 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i7);
                if (z4) {
                    List<CharSequence> text = obtain.getText();
                    if (i8 >= 28) {
                        charSequence = M.b(view);
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
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i7);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i8 >= 28) {
                charSequence = M.b(view);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static C0352h f(View view, C0352h c0352h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0352h + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return P.b(view, c0352h);
        }
        InterfaceC0366w interfaceC0366w = (InterfaceC0366w) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0367x interfaceC0367x = f5040d;
        if (interfaceC0366w == null) {
            if (view instanceof InterfaceC0367x) {
                interfaceC0367x = (InterfaceC0367x) view;
            }
            return interfaceC0367x.a(c0352h);
        }
        C0352h a2 = ((V.p) interfaceC0366w).a(view, c0352h);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0367x) {
            interfaceC0367x = (InterfaceC0367x) view;
        }
        return interfaceC0367x.a(a2);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            N.d(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void h(View view, C0346b c0346b) {
        if (c0346b == null && (c(view) instanceof C0345a)) {
            c0346b = new C0346b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0346b == null ? null : c0346b.f5048b);
    }

    public static void i(View view, CharSequence charSequence) {
        new D(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        E e7 = f5041e;
        if (charSequence == null) {
            e7.f5024a.remove(view);
            view.removeOnAttachStateChangeListener(e7);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e7);
        } else {
            e7.f5024a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e7);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e7);
            }
        }
    }
}
