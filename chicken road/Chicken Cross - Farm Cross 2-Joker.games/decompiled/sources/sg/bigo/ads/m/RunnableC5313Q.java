package sg.bigo.ads.m;

import android.view.View;
import android.view.animation.TranslateAnimation;

/* renamed from: sg.bigo.ads.m.Q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5313Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13066a;
    public final /* synthetic */ C5314S b;

    public RunnableC5313Q(C5314S c5314s, View view) {
        this.b = c5314s;
        this.f13066a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.b.d)) {
            return;
        }
        this.f13066a.setVisibility(0);
        C5314S.a(this.b);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
        translateAnimation.setDuration(600L);
        this.f13066a.startAnimation(translateAnimation);
    }
}
