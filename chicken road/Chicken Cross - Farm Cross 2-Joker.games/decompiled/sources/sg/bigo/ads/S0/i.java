package sg.bigo.ads.S0;

import java.util.HashMap;
import sg.bigo.ads.b1.p;

/* loaded from: classes3.dex */
public final class i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12541a;

    public i(j jVar) {
        this.f12541a = jVar;
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, int i2, int i3, String str2, HashMap hashMap) {
        this.f12541a.g.set(false);
        j jVar = this.f12541a;
        jVar.a(jVar.j, i3 == 702 || i3 == 701 || i3 == 700);
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, String str2, HashMap hashMap) {
        this.f12541a.g.set(false);
        j jVar = this.f12541a;
        jVar.a(jVar.j, false);
    }
}
