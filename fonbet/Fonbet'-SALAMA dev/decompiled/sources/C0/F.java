package C0;

import P.C0346b;
import P.U;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F extends C0346b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1230d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1231e;

    public F(G g3) {
        this.f1231e = g3;
    }

    @Override // P.C0346b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1230d) {
            case 1:
                if (accessibilityEvent.getEventType() != 32) {
                    return this.f5047a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                DrawerLayout drawerLayout = (DrawerLayout) this.f1231e;
                View f7 = drawerLayout.f();
                if (f7 != null) {
                    int h6 = drawerLayout.h(f7);
                    drawerLayout.getClass();
                    WeakHashMap weakHashMap = U.f5037a;
                    Gravity.getAbsoluteGravity(h6, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // P.C0346b
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1230d) {
            case 1:
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(DrawerLayout.class.getName());
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // P.C0346b
    public final void c(View view, Q.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5047a;
        switch (this.f1230d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, hVar.f5735a);
                G g3 = (G) this.f1231e;
                if (!g3.f1232d.l()) {
                    RecyclerView recyclerView = g3.f1232d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().getClass();
                        RecyclerView.j(view);
                        break;
                    }
                }
                break;
            default:
                int[] iArr = DrawerLayout.f9269R;
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.f5735a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(DrawerLayout.class.getName());
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5726c.f5732a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5727d.f5732a);
                break;
        }
    }

    @Override // P.C0346b
    public boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1230d) {
            case 1:
                int[] iArr = DrawerLayout.f9269R;
                return this.f5047a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.d(viewGroup, view, accessibilityEvent);
        }
    }

    @Override // P.C0346b
    public boolean e(View view, int i7, Bundle bundle) {
        switch (this.f1230d) {
            case 0:
                if (super.e(view, i7, bundle)) {
                    return true;
                }
                G g3 = (G) this.f1231e;
                if (!g3.f1232d.l()) {
                    RecyclerView recyclerView = g3.f1232d;
                    if (recyclerView.getLayoutManager() != null) {
                        A a2 = recyclerView.getLayoutManager().f1315b.f9710a;
                    }
                }
                return false;
            default:
                return super.e(view, i7, bundle);
        }
    }

    public F(DrawerLayout drawerLayout) {
        this.f1231e = drawerLayout;
        new Rect();
    }
}
