package sg.bigo.ads.t;

import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* renamed from: sg.bigo.ads.t.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5476f {
    public static WeakReference e;

    /* renamed from: a, reason: collision with root package name */
    public final int f13309a;
    public final int b;
    public final int c;
    public final float d;

    public C5476f(int i, int i2, int i3, float f) {
        this.f13309a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || landingPageStyleConfig.g == null || landingPageStyleConfig.d <= 0 || landingPageStyleConfig.f12718a == 0) {
            return;
        }
        WeakReference weakReference = e;
        InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
        if (interfaceC5475e != null) {
            interfaceC5475e.a(landingPageStyleConfig.c);
        }
    }
}
