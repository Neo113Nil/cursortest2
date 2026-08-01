package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.h.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5188m1 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12906a;

    public C5188m1(B1 b1) {
        this.f12906a = b1;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.f12906a.onReceiveValue(null);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12906a.onReceiveValue(bitmap);
    }
}
