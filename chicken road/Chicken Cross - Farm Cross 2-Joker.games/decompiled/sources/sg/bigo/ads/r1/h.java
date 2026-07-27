package sg.bigo.ads.r1;

import java.net.URL;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class h implements sg.bigo.ads.C1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13274a;

    public h(j jVar) {
        this.f13274a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, boolean z) {
        j jVar = this.f13274a;
        jVar.getClass();
        try {
            new URL(str);
            InterfaceC5087a interfaceC5087a = jVar.d;
            sg.bigo.ads.U0.j jVar2 = interfaceC5087a != null ? ((sg.bigo.ads.U0.b) interfaceC5087a).z : null;
            if (jVar2 != null) {
                jVar2.f12574a = str;
            }
        } catch (Exception unused) {
        }
        jVar.a("AdVPAIDClickThru", jVar.k.j.getClickPoints(), new int[]{z ? 1 : 0});
    }
}
