package P;

/* loaded from: classes.dex */
public final class I extends y.C1014b {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f1206d;

    public I(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f1206d = recyclerView;
        new P.H(this);
    }

    @Override // y.C1014b
    public final void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(androidx.recyclerview.widget.RecyclerView.class.getName());
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || this.f1206d.l()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // y.C1014b
    public final void b(android.view.View view, z.C1041h c1041h) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f8454a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = c1041h.f8517a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1206d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        P.v layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.f1303b;
        P.B b2 = recyclerView2.f2464a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1303b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1303b.canScrollVertically(1) || layoutManager.f1303b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        P.E e2 = recyclerView2.f2467b0;
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(b2, e2), layoutManager.q(b2, e2), false, 0));
    }

    @Override // y.C1014b
    public final boolean c(android.view.View view, int i2, android.os.Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1206d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        P.v layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.f1303b;
        P.B b2 = recyclerView2.f2464a;
        if (i2 == 4096) {
            u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f1308g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f1303b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f1307f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u2 = 0;
        } else {
            u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1308g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f1303b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f1307f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u2 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f1303b.r(s2, u2);
        return true;
    }
}
