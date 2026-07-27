package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.h.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5160e1 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12882a;

    public C5160e1(ValueCallback valueCallback) {
        this.f12882a = valueCallback;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.f12882a.onReceiveValue(null);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12882a.onReceiveValue(bitmap);
    }
}
