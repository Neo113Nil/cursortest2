package A0;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import game.betting133.sports1xbet.R;
import i0.C2000e;
import java.util.Iterator;
import m.ViewOnKeyListenerC2067e;
import m.ViewOnKeyListenerC2079q;
import p4.C2285z;

/* loaded from: classes.dex */
public final class I implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f279k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f280l;

    public /* synthetic */ I(int i, Object obj) {
        this.f279k = i;
        this.f280l = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f279k) {
            case 0:
                N n5 = (N) this.f280l;
                AccessibilityManager accessibilityManager = n5.f348g;
                n5.f351k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(n5.i);
                accessibilityManager.addTouchExplorationStateChangeListener(n5.f350j);
                break;
            case 3:
                Context context = view.getContext();
                C2000e c2000e = (C2000e) this.f280l;
                if (!c2000e.f17274d) {
                    context.getApplicationContext().registerComponentCallbacks(c2000e.f17275e);
                    c2000e.f17274d = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z3;
        switch (this.f279k) {
            case 0:
                N n5 = (N) this.f280l;
                n5.f352l.removeCallbacks(n5.f343N);
                AccessibilityManager accessibilityManager = n5.f348g;
                accessibilityManager.removeAccessibilityStateChangeListener(n5.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(n5.f350j);
                break;
            case 1:
                AbstractC0012b abstractC0012b = (AbstractC0012b) this.f280l;
                kotlin.jvm.internal.l.f("<this>", abstractC0012b);
                Iterator it = n4.i.M(abstractC0012b.getParent(), n1.F.f18365k).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.l.f("<this>", view2);
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    K1 k12 = abstractC0012b.f465m;
                    if (k12 != null) {
                        k12.a();
                    }
                    abstractC0012b.f465m = null;
                    abstractC0012b.requestLayout();
                    break;
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((C2285z) this.f280l).d(null);
                break;
            case 3:
                Context context = view.getContext();
                C2000e c2000e = (C2000e) this.f280l;
                if (c2000e.f17274d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c2000e.f17275e);
                    c2000e.f17274d = false;
                    break;
                }
                break;
            case 4:
                ViewOnKeyListenerC2067e viewOnKeyListenerC2067e = (ViewOnKeyListenerC2067e) this.f280l;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2067e.f17882H;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2067e.f17882H = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2067e.f17882H.removeGlobalOnLayoutListener(viewOnKeyListenerC2067e.f17891s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC2079q viewOnKeyListenerC2079q = (ViewOnKeyListenerC2079q) this.f280l;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2079q.f17978y;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2079q.f17978y = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2079q.f17978y.removeGlobalOnLayoutListener(viewOnKeyListenerC2079q.f17972s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
