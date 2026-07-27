package sg.bigo.ads.L0;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12408a;
    public final /* synthetic */ f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewFlow viewFlow;
        int itemCount;
        int i;
        if (this.f12408a) {
            return;
        }
        f fVar = this.b;
        if (fVar.b && !((ViewFlow) fVar).v && X.a(fVar)) {
            if (sg.bigo.ads.J0.a.a(new Rect(), this.b) && (itemCount = (viewFlow = (ViewFlow) this.b).getItemCount()) > 1) {
                int currentItem = viewFlow.getCurrentItem();
                if (!viewFlow.N) {
                    if (currentItem != itemCount - 1) {
                        View view = viewFlow.m;
                        int i2 = viewFlow.k;
                        if (view != null) {
                            i2 -= view.getMeasuredWidth();
                        }
                        if (viewFlow.getMeasuredWidth() + viewFlow.getScrollX() < i2) {
                            i = currentItem + 1;
                        }
                    }
                    i = currentItem - 1;
                    viewFlow.N = true;
                } else if (currentItem == 0) {
                    i = currentItem + 1;
                    viewFlow.N = false;
                } else {
                    i = currentItem - 1;
                }
                viewFlow.a(i, -20, true);
            }
        }
        this.b.postDelayed(this, r0.f12409a);
    }
}
