package sg.bigo.ads.v;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13345a;

    public c(d dVar) {
        this.f13345a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f13345a;
        ValueCallback valueCallback = dVar.t;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(dVar);
        }
    }
}
