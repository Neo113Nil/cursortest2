package sg.bigo.ads.Q0;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f implements sg.bigo.ads.b1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.R0.i f12503a;
    public final /* synthetic */ sg.bigo.ads.b1.p b;
    public final /* synthetic */ n c;

    public f(n nVar, sg.bigo.ads.R0.i iVar, sg.bigo.ads.S0.i iVar2) {
        this.c = nVar;
        this.f12503a = iVar;
        this.b = iVar2;
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, int i2, int i3, String str2, HashMap hashMap) {
        sg.bigo.ads.b1.p pVar = this.b;
        if (pVar != null) {
            pVar.a(str, i, i2, i3, str2, hashMap);
        }
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, String str2, HashMap hashMap) {
        sg.bigo.ads.R0.i iVar = this.f12503a;
        iVar.getClass();
        iVar.m = System.currentTimeMillis();
        this.c.f12510a.a(0L);
        sg.bigo.ads.b1.p pVar = this.b;
        if (pVar != null) {
            pVar.a(str, i, str2, hashMap);
        }
    }
}
