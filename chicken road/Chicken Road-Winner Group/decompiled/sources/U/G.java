package U;

import D.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class G extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final H f1494d;

    public G(H h3) {
        this.f1494d = h3;
    }

    @Override // D.C0001b
    public final void b(View view, E.i iVar) {
        this.f229a.onInitializeAccessibilityNodeInfo(view, iVar.f341a);
        H h3 = this.f1494d;
        if (h3.f1495d.l()) {
            return;
        }
        RecyclerView recyclerView = h3.f1495d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // D.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        H h3 = this.f1494d;
        if (!h3.f1495d.l()) {
            RecyclerView recyclerView = h3.f1495d;
            if (recyclerView.getLayoutManager() != null) {
                A a3 = recyclerView.getLayoutManager().f1586b.f2396a;
            }
        }
        return false;
    }
}
