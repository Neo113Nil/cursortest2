package sg.bigo.ads.x1;

import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class r implements sg.bigo.ads.w1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13402a;
    public final /* synthetic */ q b;
    public final /* synthetic */ s c;

    public r(s sVar, String str, q qVar) {
        this.c = sVar;
        this.f13402a = str;
        this.b = qVar;
    }

    @Override // sg.bigo.ads.w1.c
    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ("impl_track".equals(this.f13402a)) {
            copyOnWriteArrayList = this.c.r;
        } else if ("click_track".equals(this.f13402a)) {
            copyOnWriteArrayList = this.c.s;
        } else {
            if (!"nurl_track".equals(this.f13402a)) {
                if ("lurl_track".equals(this.f13402a)) {
                    copyOnWriteArrayList = this.c.u;
                }
                p pVar = p.h;
                s sVar = this.c;
                pVar.getClass();
                AbstractC5446j.a(1, null, new m(sVar), 0L);
            }
            copyOnWriteArrayList = this.c.t;
        }
        copyOnWriteArrayList.remove(this.b);
        p pVar2 = p.h;
        s sVar2 = this.c;
        pVar2.getClass();
        AbstractC5446j.a(1, null, new m(sVar2), 0L);
    }

    @Override // sg.bigo.ads.w1.c
    public final void b() {
        p pVar = p.h;
        s sVar = this.c;
        pVar.getClass();
        AbstractC5446j.a(1, null, new m(sVar), 0L);
    }

    @Override // sg.bigo.ads.w1.c
    public final boolean a(int i) {
        sg.bigo.ads.P.u uVar = this.c.p;
        if (i >= 100) {
            return uVar.b.contains(String.valueOf(i));
        }
        uVar.getClass();
        return false;
    }
}
