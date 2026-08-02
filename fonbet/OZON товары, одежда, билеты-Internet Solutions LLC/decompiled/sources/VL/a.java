package VL;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.functions.Function1;
import l10.i;
import qc.g;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements g, SwipeRefreshLayout.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28450a;

    public /* synthetic */ a(Object obj) {
        this.f28450a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f28450a).invoke(obj);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        i.a((i) this.f28450a);
    }
}
