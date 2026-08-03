package h;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138G implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.AbstractC0140I f3063a;

    public C0138G(h.AbstractC0140I abstractC0140I) {
        this.f3063a = abstractC0140I;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i2) {
        if (i2 == 1) {
            h.AbstractC0140I abstractC0140I = this.f3063a;
            if (abstractC0140I.f3087v.getInputMethodMode() == 2 || abstractC0140I.f3087v.getContentView() == null) {
                return;
            }
            android.os.Handler handler = abstractC0140I.f3084r;
            h.RunnableC0137F runnableC0137F = abstractC0140I.f3080n;
            handler.removeCallbacks(runnableC0137F);
            runnableC0137F.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i2, int i3, int i4) {
    }
}
