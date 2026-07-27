package sg.bigo.ads.H;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12315a;
    public final /* synthetic */ TextView b;

    public k(ViewGroup viewGroup, TextView textView) {
        this.f12315a = viewGroup;
        this.b = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getLayoutParams().height = Math.round(this.f12315a.getHeight() * 15 * 0.01f);
    }
}
