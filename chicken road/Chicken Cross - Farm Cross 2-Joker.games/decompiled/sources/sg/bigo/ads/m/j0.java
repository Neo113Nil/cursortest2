package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import sg.bigo.ads.k.InterfaceC5257b;

/* loaded from: classes3.dex */
public final class j0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5257b f13087a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewGroup.LayoutParams d;

    public j0(View view, ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, sg.bigo.ads.k.d dVar) {
        this.f13087a = dVar;
        this.b = viewGroup;
        this.c = view;
        this.d = layoutParams;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13087a.a(this.b.getWidth(), this.b.getHeight());
        sg.bigo.ads.K0.X.a(this.c, this.b, this.d, -1);
    }
}
