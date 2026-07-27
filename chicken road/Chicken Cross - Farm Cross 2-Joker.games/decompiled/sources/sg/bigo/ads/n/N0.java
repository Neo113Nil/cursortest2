package sg.bigo.ads.n;

import android.view.ViewGroup;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class N0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13144a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ S0 c;

    public N0(S0 s0, ViewGroup viewGroup, boolean z) {
        this.c = s0;
        this.f13144a = viewGroup;
        this.b = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.c.a(this.f13144a, (String[]) null, this.b);
    }
}
