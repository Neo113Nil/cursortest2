package d1;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0491u;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n1.C;
import n1.C2159B;
import t3.AbstractC2425d;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1910a extends Activity implements InterfaceC0491u {

    /* renamed from: k, reason: collision with root package name */
    public final C0493w f16854k = new C0493w(this, true);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        boolean z3 = false;
        kotlin.jvm.internal.l.f("event", keyEvent);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        if (AbstractC2425d.p(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC2425d.i) {
                    try {
                        AbstractC2425d.f19588j = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC2425d.i = true;
                }
                Method method = AbstractC2425d.f19588j;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
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
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = C.f18360a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C2159B.f18356d;
            C2159B c2159b = (C2159B) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c2159b == null) {
                c2159b = new C2159B();
                c2159b.f18357a = null;
                c2159b.f18358b = null;
                c2159b.f18359c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c2159b);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = c2159b.f18357a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C2159B.f18356d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c2159b.f18357a == null) {
                                c2159b.f18357a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C2159B.f18356d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c2159b.f18357a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c2159b.f18357a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a5 = c2159b.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a5 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c2159b.f18358b == null) {
                        c2159b.f18358b = new SparseArray();
                    }
                    c2159b.f18358b.put(keyCode, new WeakReference(a5));
                }
            }
            if (a5 != null) {
                z3 = true;
            }
        }
        if (z3) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.l.f("event", keyEvent);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        if (AbstractC2425d.p(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = I.f7012l;
        G.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.l.f("outState", bundle);
        this.f16854k.r(EnumC0487p.f7060m);
        super.onSaveInstanceState(bundle);
    }
}
