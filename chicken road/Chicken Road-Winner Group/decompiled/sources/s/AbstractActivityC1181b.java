package s;

import D.C0023y;
import D.z;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import com.chicken.jump.road.pump.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1181b extends Activity implements androidx.lifecycle.k {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.m f10289a = new androidx.lifecycle.m(this);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Object invoke;
        boolean booleanValue;
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (F2.b.p(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z3 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!F2.b.f380a) {
                    try {
                        F2.b.f381b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    F2.b.f380a = true;
                }
                Method method = F2.b.f381b;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, event);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(event)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = z.f259a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0023y.f255d;
            C0023y c0023y = (C0023y) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0023y == null) {
                c0023y = new C0023y();
                c0023y.f256a = null;
                c0023y.f257b = null;
                c0023y.f258c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c0023y);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = c0023y.f256a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C0023y.f255d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c0023y.f256a == null) {
                                c0023y.f256a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C0023y.f255d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c0023y.f256a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c0023y.f256a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = c0023y.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c0023y.f257b == null) {
                        c0023y.f257b = new SparseArray();
                    }
                    c0023y.f257b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                z3 = true;
            }
        }
        if (z3) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (F2.b.p(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = u.f2332b;
        s.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        androidx.lifecycle.f fVar = androidx.lifecycle.f.f2305c;
        androidx.lifecycle.m mVar = this.f10289a;
        mVar.d("setCurrentState");
        mVar.f(fVar);
        super.onSaveInstanceState(outState);
    }
}
