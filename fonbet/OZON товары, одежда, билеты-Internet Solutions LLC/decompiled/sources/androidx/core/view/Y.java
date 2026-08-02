package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5305a;
import androidx.core.view.C5311d;
import androidx.core.view.C5336p0;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.ozon.app.android.R;
import y2.q;
import z2.C10975a;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, C5326k0> f42252a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f42253b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f42254c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f42255d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    private static final T f42256e = new T();

    /* renamed from: f, reason: collision with root package name */
    private static final a f42257f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f42258g = 0;

    static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f42259a = new WeakHashMap<>();

        a() {
        }

        final void a(View view) {
            this.f42259a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        final void b(View view) {
            this.f42259a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f42259a.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z11 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z11) {
                        Y.t(z11 ? 16 : 32, key);
                        entry.setValue(Boolean.valueOf(z11));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f42260a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f42261b;

        /* renamed from: c, reason: collision with root package name */
        private final int f42262c;

        /* renamed from: d, reason: collision with root package name */
        private final int f42263d;

        b(int i11, Class<T> cls, int i12, int i13) {
            this.f42260a = i11;
            this.f42261b = cls;
            this.f42263d = i12;
            this.f42262c = i13;
        }

        abstract T a(View view);

        abstract void b(View view, T t2);

        final T c(View view) {
            if (Build.VERSION.SDK_INT >= this.f42262c) {
                return a(view);
            }
            T t2 = (T) view.getTag(this.f42260a);
            if (this.f42261b.isInstance(t2)) {
                return t2;
            }
            return null;
        }

        final void d(View view, T t2) {
            if (Build.VERSION.SDK_INT >= this.f42262c) {
                b(view, t2);
                return;
            }
            if (e(c(view), t2)) {
                C5305a e11 = Y.e(view);
                if (e11 == null) {
                    e11 = new C5305a();
                }
                Y.C(view, e11);
                view.setTag(this.f42260a, t2);
                Y.t(this.f42263d, view);
            }
        }

        abstract boolean e(T t2, T t11);
    }

    static class c {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        final class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            C5353y0 f42264a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f42265b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ D f42266c;

            a(View view, D d11) {
                this.f42265b = view;
                this.f42266c = d11;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C5353y0 u11 = C5353y0.u(view, windowInsets);
                int i11 = Build.VERSION.SDK_INT;
                D d11 = this.f42266c;
                if (i11 < 30) {
                    d.a(windowInsets, this.f42265b);
                    if (u11.equals(this.f42264a)) {
                        return d11.onApplyWindowInsets(view, u11).t();
                    }
                }
                this.f42264a = u11;
                C5353y0 onApplyWindowInsets = d11.onApplyWindowInsets(view, u11);
                if (i11 >= 30) {
                    return onApplyWindowInsets.t();
                }
                int i12 = Y.f42258g;
                c.c(view);
                return onApplyWindowInsets.t();
            }
        }

        static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C5353y0 b(@NonNull View view, @NonNull C5353y0 c5353y0, @NonNull Rect rect) {
            WindowInsets t2 = c5353y0.t();
            if (t2 != null) {
                return C5353y0.u(view, view.computeSystemWindowInsets(t2, rect));
            }
            rect.setEmpty();
            return c5353y0;
        }

        static boolean c(@NonNull View view, float f7, float f11, boolean z11) {
            return view.dispatchNestedFling(f7, f11, z11);
        }

        static boolean d(@NonNull View view, float f7, float f11) {
            return view.dispatchNestedPreFling(f7, f11);
        }

        static boolean e(View view, int i11, int i12, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i11, i12, iArr, iArr2);
        }

        static boolean f(View view, int i11, int i12, int i13, int i14, int[] iArr) {
            return view.dispatchNestedScroll(i11, i12, i13, i14, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static C5353y0 j(@NonNull View view) {
            return C5353y0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(@NonNull View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f7) {
            view.setElevation(f7);
        }

        static void t(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        static void u(@NonNull View view, D d11) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, d11);
            }
            if (d11 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, d11));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        static void x(@NonNull View view, float f7) {
            view.setZ(f7);
        }

        static boolean y(View view, int i11) {
            return view.startNestedScroll(i11);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e {
        public static C5353y0 a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C5353y0 u11 = C5353y0.u(null, rootWindowInsets);
            u11.r(u11);
            u11.d(view.getRootView());
            return u11;
        }

        static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        static void c(@NonNull View view, int i11) {
            view.setScrollIndicators(i11);
        }

        static void d(@NonNull View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    /* loaded from: classes8.dex */
    static class f {
        static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(@NonNull View view, ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, Object obj, int i11) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i11);
        }

        static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    static class g {
        static void a(@NonNull View view, Collection<View> collection, int i11) {
            view.addKeyboardNavigationClusters(collection, i11);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(@NonNull View view, View view2, int i11) {
            return view.keyboardNavigationClusterSearch(view2, i11);
        }

        static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(@NonNull View view, boolean z11) {
            view.setFocusedByDefault(z11);
        }

        static void m(View view, int i11) {
            view.setImportantForAutofill(i11);
        }

        static void n(@NonNull View view, boolean z11) {
            view.setKeyboardNavigationCluster(z11);
        }

        static void o(View view, int i11) {
            view.setNextClusterForwardId(i11);
        }

        static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class h {
        static void a(@NonNull View view, @NonNull final m mVar) {
            androidx.collection.Z z11 = (androidx.collection.Z) view.getTag(R.id.tag_unhandled_key_listeners);
            if (z11 == null) {
                z11 = new androidx.collection.Z();
                view.setTag(R.id.tag_unhandled_key_listeners, z11);
            }
            Objects.requireNonNull(mVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.Z
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return Y.m.this.a();
                }
            };
            z11.put(mVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(@NonNull View view, @NonNull m mVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.Z z11 = (androidx.collection.Z) view.getTag(R.id.tag_unhandled_key_listeners);
            if (z11 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) z11.get(mVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i11) {
            return (T) view.requireViewById(i11);
        }

        static void g(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, C10975a c10975a) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    private static class i {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }

        static void e(View view, A2.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class j {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i11) {
            view.setImportantForContentCapture(i11);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes8.dex */
    private static final class k {
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C5311d b(@NonNull View view, @NonNull C5311d c5311d) {
            ContentInfo d11 = c5311d.d();
            ContentInfo performReceiveContent = view.performReceiveContent(d11);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == d11 ? c5311d : new C5311d(new C5311d.e(performReceiveContent));
        }

        public static void c(@NonNull View view, String[] strArr, E e11) {
            if (e11 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new l(e11));
            }
        }
    }

    /* loaded from: classes8.dex */
    private static final class l implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final E f42267a;

        l(@NonNull E e11) {
            this.f42267a = e11;
        }

        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            C5311d c5311d = new C5311d(new C5311d.e(contentInfo));
            C5311d a11 = this.f42267a.a(view, c5311d);
            if (a11 == null) {
                return null;
            }
            return a11 == c5311d ? contentInfo : a11.d();
        }
    }

    /* loaded from: classes8.dex */
    public interface m {
        boolean a();
    }

    /* loaded from: classes8.dex */
    static class n {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f42268d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f42269a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f42270b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f42271c = null;

        n() {
        }

        static n a(View view) {
            n nVar = (n) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n();
            view.setTag(R.id.tag_unhandled_key_event_manager, nVar2);
            return nVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f42269a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View c11 = c(viewGroup.getChildAt(childCount), keyEvent);
                    if (c11 != null) {
                        return c11;
                    }
                }
            }
            if (d(view, keyEvent)) {
                return view;
            }
            return null;
        }

        private static boolean d(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((m) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        final boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                WeakHashMap<View, Boolean> weakHashMap = this.f42269a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList<WeakReference<View>> arrayList = f42268d;
                if (!arrayList.isEmpty()) {
                    synchronized (arrayList) {
                        try {
                            if (this.f42269a == null) {
                                this.f42269a = new WeakHashMap<>();
                            }
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                ArrayList<WeakReference<View>> arrayList2 = f42268d;
                                View view2 = arrayList2.get(size).get();
                                if (view2 == null) {
                                    arrayList2.remove(size);
                                } else {
                                    this.f42269a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        this.f42269a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View c11 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c11 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (this.f42270b == null) {
                        this.f42270b = new SparseArray<>();
                    }
                    this.f42270b.put(keyCode, new WeakReference<>(c11));
                }
            }
            return c11 != null;
        }

        final boolean e(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f42271c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f42271c = new WeakReference<>(keyEvent);
            if (this.f42270b == null) {
                this.f42270b = new SparseArray<>();
            }
            SparseArray<WeakReference<View>> sparseArray = this.f42270b;
            if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                d(view, keyEvent);
            }
            return true;
        }
    }

    public static void A(@NonNull View view) {
        c.c(view);
    }

    public static void B(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.d(view, context, iArr, attributeSet, typedArray, i11, 0);
        }
    }

    public static void C(@NonNull View view, C5305a c5305a) {
        if (c5305a == null && (f(view) instanceof C5305a.C0773a)) {
            c5305a = new C5305a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c5305a == null ? null : c5305a.getBridge());
    }

    public static void D(@NonNull View view, boolean z11) {
        new X(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(view, Boolean.valueOf(z11));
    }

    public static void E(@NonNull View view, CharSequence charSequence) {
        new V(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        a aVar = f42257f;
        if (charSequence != null) {
            aVar.a(view);
        } else {
            aVar.b(view);
        }
    }

    public static void F(@NonNull View view, ColorStateList colorStateList) {
        d.q(view, colorStateList);
    }

    public static void G(@NonNull View view, PorterDuff.Mode mode) {
        d.r(view, mode);
    }

    public static void H(@NonNull View view, float f7) {
        d.s(view, f7);
    }

    public static void I(int i11, @NonNull ViewGroup viewGroup) {
        g.m(viewGroup, i11);
    }

    public static void J(@NonNull View view, D d11) {
        d.u(view, d11);
    }

    public static void K(@NonNull ViewGroup viewGroup, H h11) {
        f.d(viewGroup, h11 != null ? h11.a() : null);
    }

    public static void L(@NonNull View view, boolean z11) {
        new U(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).d(view, Boolean.valueOf(z11));
    }

    public static void M(int i11, @NonNull ViewGroup viewGroup) {
        e.d(viewGroup, i11, 3);
    }

    public static void N(@NonNull SwitchCompat switchCompat, CharSequence charSequence) {
        new W(R.id.tag_state_description, CharSequence.class, 64, 30).d(switchCompat, charSequence);
    }

    public static void O(@NonNull View view, String str) {
        d.v(view, str);
    }

    public static void P(@NonNull View view, float f7) {
        d.w(view, f7);
    }

    public static void Q(@NonNull View view, C5336p0.b bVar) {
        C5336p0.d(view, bVar);
    }

    public static void R(@NonNull View view, float f7) {
        d.x(view, f7);
    }

    public static int a(@NonNull View view, @NonNull String str, @NonNull y2.s sVar) {
        int i11;
        ArrayList h11 = h(view);
        int i12 = 0;
        while (true) {
            if (i12 >= h11.size()) {
                int i13 = -1;
                for (int i14 = 0; i14 < 32 && i13 == -1; i14++) {
                    int i15 = f42255d[i14];
                    boolean z11 = true;
                    for (int i16 = 0; i16 < h11.size(); i16++) {
                        z11 &= ((q.a) h11.get(i16)).b() != i15;
                    }
                    if (z11) {
                        i13 = i15;
                    }
                }
                i11 = i13;
            } else {
                if (TextUtils.equals(str, ((q.a) h11.get(i12)).c())) {
                    i11 = ((q.a) h11.get(i12)).b();
                    break;
                }
                i12++;
            }
        }
        if (i11 != -1) {
            q.a aVar = new q.a(i11, str, sVar);
            C5305a e11 = e(view);
            if (e11 == null) {
                e11 = new C5305a();
            }
            C(view, e11);
            y(aVar.b(), view);
            h(view).add(aVar);
            t(0, view);
        }
        return i11;
    }

    @NonNull
    @Deprecated
    public static C5326k0 b(@NonNull View view) {
        if (f42252a == null) {
            f42252a = new WeakHashMap<>();
        }
        C5326k0 c5326k0 = f42252a.get(view);
        if (c5326k0 != null) {
            return c5326k0;
        }
        C5326k0 c5326k02 = new C5326k0(view);
        f42252a.put(view, c5326k02);
        return c5326k02;
    }

    @NonNull
    public static void c(@NonNull View view, @NonNull C5353y0 c5353y0, @NonNull Rect rect) {
        d.b(view, c5353y0, rect);
    }

    @NonNull
    public static C5353y0 d(@NonNull View view, @NonNull C5353y0 c5353y0) {
        WindowInsets t2 = c5353y0.t();
        if (t2 != null) {
            WindowInsets a11 = c.a(view, t2);
            if (!a11.equals(t2)) {
                return C5353y0.u(view, a11);
            }
        }
        return c5353y0;
    }

    public static C5305a e(@NonNull View view) {
        View.AccessibilityDelegate f7 = f(view);
        if (f7 == null) {
            return null;
        }
        return f7 instanceof C5305a.C0773a ? ((C5305a.C0773a) f7).f42273a : new C5305a(f7);
    }

    private static View.AccessibilityDelegate f(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (f42254c) {
            return null;
        }
        if (f42253b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f42253b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f42254c = true;
                return null;
            }
        }
        try {
            Object obj = f42253b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f42254c = true;
            return null;
        }
    }

    public static CharSequence g(@NonNull View view) {
        return new V(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    private static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static ColorStateList i(@NonNull View view) {
        return d.g(view);
    }

    public static PorterDuff.Mode j(@NonNull View view) {
        return d.h(view);
    }

    public static float k(@NonNull View view) {
        return d.i(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int l(@NonNull RecyclerView recyclerView) {
        return g.c(recyclerView);
    }

    public static String[] m(@NonNull TextView textView) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(textView) : (String[]) textView.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static C5353y0 n(@NonNull View view) {
        return e.a(view);
    }

    public static String o(@NonNull View view) {
        return d.k(view);
    }

    public static float p(@NonNull View view) {
        return d.l(view);
    }

    public static float q(@NonNull View view) {
        return d.m(view);
    }

    public static boolean r(@NonNull CoordinatorLayout coordinatorLayout) {
        return f(coordinatorLayout) != null;
    }

    public static boolean s(@NonNull View view) {
        return d.p(view);
    }

    static void t(int i11, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z11) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z11 ? 32 : 2048);
                obtain.setContentChangeTypes(i11);
                if (z11) {
                    obtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i11 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i11);
                        return;
                    } catch (AbstractMethodError e11) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e11);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i11);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    @NonNull
    public static C5353y0 u(@NonNull View view, @NonNull C5353y0 c5353y0) {
        WindowInsets t2 = c5353y0.t();
        if (t2 != null) {
            WindowInsets b11 = c.b(view, t2);
            if (!b11.equals(t2)) {
                return C5353y0.u(view, b11);
            }
        }
        return c5353y0;
    }

    public static void v(@NonNull View view) {
        int a11 = C5335p.a();
        if (a11 == -1) {
            return;
        }
        view.performHapticFeedback(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5311d w(@NonNull View view, @NonNull C5311d c5311d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c5311d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, c5311d);
        }
        E e11 = (E) view.getTag(R.id.tag_on_receive_content_listener);
        F f7 = f42256e;
        if (e11 == null) {
            if (view instanceof F) {
                f7 = (F) view;
            }
            return f7.onReceiveContent(c5311d);
        }
        C5311d a11 = e11.a(view, c5311d);
        if (a11 == null) {
            return null;
        }
        if (view instanceof F) {
            f7 = (F) view;
        }
        return f7.onReceiveContent(a11);
    }

    public static void x(int i11, @NonNull View view) {
        y(i11, view);
        t(0, view);
    }

    private static void y(int i11, View view) {
        ArrayList h11 = h(view);
        for (int i12 = 0; i12 < h11.size(); i12++) {
            if (((q.a) h11.get(i12)).b() == i11) {
                h11.remove(i12);
                return;
            }
        }
    }

    public static void z(@NonNull View view, @NonNull q.a aVar, y2.s sVar) {
        if (sVar == null) {
            x(aVar.b(), view);
            return;
        }
        q.a a11 = aVar.a(sVar);
        C5305a e11 = e(view);
        if (e11 == null) {
            e11 = new C5305a();
        }
        C(view, e11);
        y(a11.b(), view);
        h(view).add(a11);
        t(0, view);
    }
}
