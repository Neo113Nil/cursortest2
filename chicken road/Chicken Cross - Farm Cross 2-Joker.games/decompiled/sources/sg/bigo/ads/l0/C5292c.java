package sg.bigo.ads.l0;

import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.U.k;

/* renamed from: sg.bigo.ads.l0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5292c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5293d f13055a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ int c;

    public C5292c(InterfaceC5293d interfaceC5293d, Map map, int i) {
        this.f13055a = interfaceC5293d;
        this.b = map;
        this.c = i;
    }

    @Override // sg.bigo.ads.U.k
    public final void a(int i, int i2, String str) {
        InterfaceC5293d interfaceC5293d = this.f13055a;
        if (interfaceC5293d != null) {
            interfaceC5293d.a(this.b);
        }
        int i3 = this.c;
        Locale locale = Locale.ENGLISH;
        sg.bigo.ads.s1.b.a(3, i3, "code: " + i + ", subcode: " + i2 + ", error msg: " + str);
    }

    @Override // sg.bigo.ads.U.k
    public final void a() {
        InterfaceC5293d interfaceC5293d = this.f13055a;
        if (interfaceC5293d != null) {
            interfaceC5293d.a(this.c);
        }
        sg.bigo.ads.s1.b.a(2, this.c, "");
    }
}
