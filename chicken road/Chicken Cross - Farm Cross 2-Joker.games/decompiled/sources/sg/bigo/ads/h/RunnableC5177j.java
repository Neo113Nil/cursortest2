package sg.bigo.ads.h;

import android.view.View;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* renamed from: sg.bigo.ads.h.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5177j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5204s f12895a;

    public RunnableC5177j(AbstractC5204s abstractC5204s) {
        this.f12895a = abstractC5204s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        AdCountDownButton adCountDownButton = this.f12895a.g;
        if (adCountDownButton == null || (view = adCountDownButton.j) == null) {
            return;
        }
        view.performClick();
    }
}
