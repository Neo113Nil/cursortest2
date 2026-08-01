package sg.bigo.ads.A;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdCountDownButton f12208a;
    public final /* synthetic */ View b;
    public final /* synthetic */ e c;

    public a(e eVar, AdCountDownButton adCountDownButton, View view) {
        this.c = eVar;
        this.f12208a = adCountDownButton;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c.c.d;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                AdCountDownButton adCountDownButton = this.f12208a;
                View view = this.b;
                Rect rect = new Rect();
                adCountDownButton.getHitRect(rect);
                rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                View closeView = adCountDownButton.getCloseView();
                if (view == null || closeView == null) {
                    return;
                }
                view.setOnTouchListener(new b(rect, closeView));
                return;
            }
        }
        this.f12208a.setBtnClickArea(i2);
    }
}
