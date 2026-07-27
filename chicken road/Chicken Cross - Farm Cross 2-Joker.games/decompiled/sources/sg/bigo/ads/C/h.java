package sg.bigo.ads.C;

import android.graphics.Bitmap;
import android.os.SystemClock;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class h implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5087a f12229a;
    public final /* synthetic */ sg.bigo.ads.Q.c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ l e;

    public h(l lVar, sg.bigo.ads.U0.k kVar, sg.bigo.ads.Q.c cVar, String str, long j) {
        this.e = lVar;
        this.f12229a = kVar;
        this.b = cVar;
        this.c = str;
        this.d = j;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (yVar != null) {
            String str6 = yVar.b;
            str2 = str6;
            str3 = yVar.f;
            str4 = yVar.g;
            str5 = yVar.h;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        ((sg.bigo.ads.U0.k) this.f12229a).a(str2);
        InterfaceC5087a interfaceC5087a = this.f12229a;
        if (interfaceC5087a instanceof sg.bigo.ads.U0.k) {
            ((sg.bigo.ads.U0.k) interfaceC5087a).f1 = yVar;
        }
        this.b.a(this.e, 1029, i, "Failed to download media image: " + str);
        sg.bigo.ads.s1.b.a(this.f12229a, this.c, str, SystemClock.elapsedRealtime() - this.d, 0L, 1, str2, false, str3, str4, str5, 0);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        ((sg.bigo.ads.U0.k) this.f12229a).a(yVar.b);
        sg.bigo.ads.P.r rVar = new sg.bigo.ads.P.r();
        rVar.f12490a = bitmap.getWidth();
        rVar.b = bitmap.getHeight();
        ((sg.bigo.ads.U0.k) this.f12229a).a(rVar);
        this.e.a(bitmap, 2);
        l lVar = this.e;
        Boolean valueOf = Boolean.valueOf(yVar.f13302a != 1);
        synchronized (lVar) {
            lVar.N.put("is_cache", valueOf);
        }
        InterfaceC5087a interfaceC5087a = this.f12229a;
        if (interfaceC5087a instanceof sg.bigo.ads.U0.k) {
            ((sg.bigo.ads.U0.k) interfaceC5087a).f1 = yVar;
        }
        this.b.a(this.e);
        sg.bigo.ads.s1.b.a(this.f12229a, this.c, yVar.f13302a, SystemClock.elapsedRealtime() - this.d, yVar.c, 0, 1, yVar.b, false, yVar.f, yVar.g, yVar.h, "", 0);
    }
}
