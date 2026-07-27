package sg.bigo.ads.G;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12306a;
    public final /* synthetic */ InterfaceC5087a b;
    public final /* synthetic */ ValueCallback c;
    public final /* synthetic */ h d;

    public e(h hVar, String str, k kVar, d dVar) {
        this.d = hVar;
        this.f12306a = str;
        this.b = kVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap b = AbstractC4962t.b(Uri.parse(this.f12306a).getPath(), this.d.f12308a.k.e);
        if (b == null) {
            this.d.a(this.b, this.c);
        } else {
            this.d.g = b;
            this.c.onReceiveValue(b);
        }
    }
}
