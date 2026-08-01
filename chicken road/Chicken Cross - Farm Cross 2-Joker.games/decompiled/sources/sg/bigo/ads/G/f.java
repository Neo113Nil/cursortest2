package sg.bigo.ads.G;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.s0.z;

/* loaded from: classes3.dex */
public final class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12307a;
    public final /* synthetic */ h b;

    public f(h hVar, ValueCallback valueCallback) {
        this.b = hVar;
        this.f12307a = valueCallback;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        this.f12307a.onReceiveValue(null);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        this.b.g = bitmap;
        this.f12307a.onReceiveValue(bitmap);
    }
}
