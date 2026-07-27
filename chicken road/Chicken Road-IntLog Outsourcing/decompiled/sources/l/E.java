package l;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f10765b;

    public /* synthetic */ E(H h3, int i2) {
        this.f10764a = i2;
        this.f10765b = h3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h3 = this.f10765b;
        switch (this.f10764a) {
            case 0:
                J j2 = h3.f10772c;
                if (j2 != null) {
                    j2.setListSelectionHidden(true);
                    j2.requestLayout();
                    break;
                }
                break;
            default:
                J j6 = h3.f10772c;
                if (j6 != null) {
                    Field field = E.G.f566a;
                    if (j6.isAttachedToWindow() && h3.f10772c.getCount() > h3.f10772c.getChildCount() && h3.f10772c.getChildCount() <= Integer.MAX_VALUE) {
                        h3.f10791v.setInputMethodMode(2);
                        h3.d();
                        break;
                    }
                }
                break;
        }
    }
}
