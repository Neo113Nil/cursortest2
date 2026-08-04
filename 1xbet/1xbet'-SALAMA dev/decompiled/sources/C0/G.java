package C0;

import P.C0346b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class G extends C0346b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f1232d;

    public G(RecyclerView recyclerView) {
        this.f1232d = recyclerView;
        new F(this);
    }

    @Override // P.C0346b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f1232d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // P.C0346b
    public final void c(View view, Q.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5047a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f5735a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RecyclerView.class.getName());
        RecyclerView recyclerView = this.f1232d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        u layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1315b;
        A a2 = recyclerView2.f9710a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1315b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1315b.canScrollVertically(1) || layoutManager.f1315b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C c3 = recyclerView2.f9729o0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(a2, c3), layoutManager.q(a2, c3), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // P.C0346b
    public final boolean e(View view, int i7, Bundle bundle) {
        int iU;
        int iS;
        if (super.e(view, i7, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1232d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        u layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1315b;
        A a2 = recyclerView2.f9710a;
        if (i7 == 4096) {
            iU = recyclerView2.canScrollVertically(1) ? (layoutManager.f1320g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f1315b.canScrollHorizontally(1)) {
                iS = (layoutManager.f1319f - layoutManager.s()) - layoutManager.t();
            } else {
                iS = 0;
            }
        } else if (i7 != 8192) {
            iS = 0;
            iU = 0;
        } else {
            iU = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1320g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f1315b.canScrollHorizontally(-1)) {
                iS = -((layoutManager.f1319f - layoutManager.s()) - layoutManager.t());
            } else {
                iS = 0;
            }
        }
        if (iU == 0 && iS == 0) {
            return false;
        }
        layoutManager.f1315b.r(iS, iU);
        return true;
    }
}
