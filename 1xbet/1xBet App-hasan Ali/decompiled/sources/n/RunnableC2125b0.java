package n;

/* renamed from: n.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2125b0 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2131e0 f18216l;

    public /* synthetic */ RunnableC2125b0(AbstractC2131e0 abstractC2131e0, int i) {
        this.f18215k = i;
        this.f18216l = abstractC2131e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18215k) {
            case 0:
                C2139i0 c2139i0 = this.f18216l.f18230m;
                if (c2139i0 != null) {
                    c2139i0.setListSelectionHidden(true);
                    c2139i0.requestLayout();
                    break;
                }
                break;
            default:
                AbstractC2131e0 abstractC2131e0 = this.f18216l;
                C2139i0 c2139i02 = abstractC2131e0.f18230m;
                if (c2139i02 != null && c2139i02.isAttachedToWindow() && abstractC2131e0.f18230m.getCount() > abstractC2131e0.f18230m.getChildCount() && abstractC2131e0.f18230m.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC2131e0.f18227F.setInputMethodMode(2);
                    abstractC2131e0.b();
                    break;
                }
                break;
        }
    }
}
