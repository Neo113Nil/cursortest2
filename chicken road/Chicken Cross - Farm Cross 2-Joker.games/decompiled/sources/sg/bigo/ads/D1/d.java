package sg.bigo.ads.D1;

import android.webkit.ValueCallback;
import sg.bigo.ads.P.x;

/* loaded from: classes3.dex */
public final class d implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12257a;

    public d(e eVar) {
        this.f12257a = eVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        this.f12257a.b.r.a(1);
        x xVar = this.f12257a.b.r;
        if (str == null) {
            str = "";
        }
        xVar.f12496a = str;
    }
}
