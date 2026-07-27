package sg.bigo.ads.h;

import android.view.View;

/* renamed from: sg.bigo.ads.h.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5205s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12923a;

    public RunnableC5205s0(View view) {
        this.f12923a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12923a.clearAnimation();
    }
}
