package h;

/* renamed from: h.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0139H implements android.view.View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.AbstractC0140I f3064a;

    public ViewOnTouchListenerC0139H(h.AbstractC0140I abstractC0140I) {
        this.f3064a = abstractC0140I;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        h.r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        h.AbstractC0140I abstractC0140I = this.f3064a;
        if (action == 0 && (rVar = abstractC0140I.f3087v) != null && rVar.isShowing() && x2 >= 0 && x2 < abstractC0140I.f3087v.getWidth() && y2 >= 0 && y2 < abstractC0140I.f3087v.getHeight()) {
            abstractC0140I.f3084r.postDelayed(abstractC0140I.f3080n, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0140I.f3084r.removeCallbacks(abstractC0140I.f3080n);
        return false;
    }
}
