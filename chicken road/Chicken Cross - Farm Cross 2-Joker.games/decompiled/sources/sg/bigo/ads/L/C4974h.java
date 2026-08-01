package sg.bigo.ads.L;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.L.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4974h implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12385a;

    public C4974h(ValueCallback valueCallback) {
        this.f12385a = valueCallback;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.f12385a.onReceiveValue(null);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12385a.onReceiveValue(bitmap);
    }
}
