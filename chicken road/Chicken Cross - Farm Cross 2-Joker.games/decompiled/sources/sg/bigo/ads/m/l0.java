package sg.bigo.ads.m;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13091a;
    public final /* synthetic */ ViewGroup b;

    public l0(sg.bigo.ads.H.o oVar, ViewGroup viewGroup) {
        this.f13091a = oVar;
        this.b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13091a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.f13091a.setBackgroundColor(Color.parseColor("#66000000"));
        sg.bigo.ads.K0.X.a(this.f13091a, this.b, null, 1);
    }
}
