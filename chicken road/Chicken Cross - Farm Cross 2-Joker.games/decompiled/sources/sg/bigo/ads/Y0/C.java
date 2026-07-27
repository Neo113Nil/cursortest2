package sg.bigo.ads.Y0;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f12626a;
    public final /* synthetic */ sg.bigo.ads.P.f b;
    public final /* synthetic */ sg.bigo.ads.P.c c;
    public final /* synthetic */ sg.bigo.ads.Q.b d;

    public C(WeakReference weakReference, sg.bigo.ads.P.f fVar, sg.bigo.ads.P.c cVar, sg.bigo.ads.Q.b bVar) {
        this.f12626a = weakReference;
        this.b = fVar;
        this.c = cVar;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = (Activity) this.f12626a.get();
        if (activity != null) {
            boolean hasWindowFocus = activity.hasWindowFocus();
            sg.bigo.ads.P.f fVar = this.b;
            fVar.i = !hasWindowFocus ? 1 : 0;
            sg.bigo.ads.s1.b.a(this.c, 1, fVar, this.d);
        }
    }
}
