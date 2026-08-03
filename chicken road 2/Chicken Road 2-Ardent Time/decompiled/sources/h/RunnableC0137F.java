package h;

/* renamed from: h.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0137F implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.AbstractC0140I f3062b;

    public /* synthetic */ RunnableC0137F(h.AbstractC0140I abstractC0140I, int i2) {
        this.f3061a = i2;
        this.f3062b = abstractC0140I;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.AbstractC0140I abstractC0140I = this.f3062b;
        switch (this.f3061a) {
            case 0:
                h.C0142K c0142k = abstractC0140I.f3069c;
                if (c0142k != null) {
                    c0142k.setListSelectionHidden(true);
                    c0142k.requestLayout();
                    break;
                }
                break;
            default:
                h.C0142K c0142k2 = abstractC0140I.f3069c;
                if (c0142k2 != null) {
                    java.lang.reflect.Field field = y.x.f8478a;
                    if (c0142k2.isAttachedToWindow() && abstractC0140I.f3069c.getCount() > abstractC0140I.f3069c.getChildCount() && abstractC0140I.f3069c.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0140I.f3087v.setInputMethodMode(2);
                        abstractC0140I.c();
                        break;
                    }
                }
                break;
        }
    }
}
