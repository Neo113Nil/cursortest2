package sg.bigo.ads.Z;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f12651a;

    public a(b bVar) {
        this.f12651a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f12651a.a(z);
    }
}
