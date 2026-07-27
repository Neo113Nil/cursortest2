package u;

import E.InterfaceC0032g;
import a.AbstractC0169a;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0244n;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0250u;
import androidx.lifecycle.M;
import b2.AbstractC0279e;
import com.chickyneer.roadway.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.C1401k;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1467h extends Activity implements InterfaceC0250u, InterfaceC0032g {
    private final C1401k extraDataMap = new C1401k();
    private final C0252w lifecycleRegistry = new C0252w(this);

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent event) {
        Object invoke;
        boolean booleanValue;
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (AbstractC0169a.k(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC0169a.f3814a) {
                    try {
                        AbstractC0169a.f3815b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC0169a.f3814a = true;
                }
                Method method = AbstractC0169a.f3815b;
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
        Field field = E.G.f566a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = E.F.f562d;
            E.F f3 = (E.F) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (f3 == null) {
                f3 = new E.F();
                f3.f563a = null;
                f3.f564b = null;
                f3.f565c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, f3);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = f3.f563a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = E.F.f562d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (f3.f563a == null) {
                                f3.f563a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = E.F.f562d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    f3.f563a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        f3.f563a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a6 = f3.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (f3.f564b == null) {
                        f3.f564b = new SparseArray();
                    }
                    f3.f564b.put(keyCode, new WeakReference(a6));
                }
            }
            if (a6 != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (AbstractC0169a.k(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends AbstractC1466g> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.i.e(extraDataClass, "extraDataClass");
        AbstractC0279e.o(this.extraDataMap.getOrDefault(extraDataClass, null));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = I.f4529b;
        M.h(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        C0252w c0252w = this.lifecycleRegistry;
        EnumC0244n enumC0244n = EnumC0244n.f4578c;
        c0252w.d("setCurrentState");
        c0252w.f(enumC0244n);
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(AbstractC1466g extraData) {
        kotlin.jvm.internal.i.e(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        break;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        break;
                    }
                    break;
            }
        }
        return !z;
    }

    @Override // E.InterfaceC0032g
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
