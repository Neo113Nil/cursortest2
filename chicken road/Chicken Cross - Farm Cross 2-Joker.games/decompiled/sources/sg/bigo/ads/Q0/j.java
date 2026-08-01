package sg.bigo.ads.Q0;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class j implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12507a;
    public final /* synthetic */ ValueCallback b;
    public final /* synthetic */ ValueCallback c;
    public final /* synthetic */ n d;

    public j(n nVar, String str, h hVar, i iVar) {
        this.d = nVar;
        this.f12507a = str;
        this.b = hVar;
        this.c = iVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.d.e.set(false);
        if (this.d.f.compareAndSet(true, false) && this.d.g.compareAndSet(false, true)) {
            this.d.a(this.f12507a, this.b, this.c);
        }
    }
}
