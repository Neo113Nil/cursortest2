package n;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: n.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2129d0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2131e0 f18218a;

    public C2129d0(AbstractC2131e0 abstractC2131e0) {
        this.f18218a = abstractC2131e0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            AbstractC2131e0 abstractC2131e0 = this.f18218a;
            if (abstractC2131e0.f18227F.getInputMethodMode() == 2 || abstractC2131e0.f18227F.getContentView() == null) {
                return;
            }
            Handler handler = abstractC2131e0.f18223B;
            RunnableC2125b0 runnableC2125b0 = abstractC2131e0.f18241x;
            handler.removeCallbacks(runnableC2125b0);
            runnableC2125b0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i5, int i6) {
    }
}
