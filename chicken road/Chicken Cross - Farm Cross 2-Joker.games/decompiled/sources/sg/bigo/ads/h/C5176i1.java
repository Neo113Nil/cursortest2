package sg.bigo.ads.h;

import android.webkit.ValueCallback;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.h.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5176i1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5485f f12893a;

    public C5176i1(C5485f c5485f) {
        this.f12893a = c5485f;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        this.f12893a.b();
    }
}
