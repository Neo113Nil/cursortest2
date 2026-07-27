package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewTreeObserver;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.RunnableC4946c;

/* loaded from: classes3.dex */
public final class V0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13152a;
    public final /* synthetic */ View b;

    public V0(View view, View view2) {
        this.f13152a = view;
        this.b = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        sg.bigo.ads.E0.p.a(AbstractC4954k.a(2), this.f13152a);
        View view = this.b;
        if (view == null) {
            return;
        }
        int a2 = AbstractC4963u.a(view.getContext(), 40);
        view.setVisibility(4);
        view.post(new RunnableC4946c(view, a2));
    }
}
