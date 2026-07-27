package sg.bigo.ads.C;

import android.graphics.Bitmap;
import android.os.SystemClock;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class i implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5087a f12230a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ l d;

    public i(l lVar, sg.bigo.ads.U0.k kVar, String str, long j) {
        this.d = lVar;
        this.f12230a = kVar;
        this.b = str;
        this.c = j;
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
        ((sg.bigo.ads.U0.k) this.f12230a).a(str2);
        InterfaceC5087a interfaceC5087a = this.f12230a;
        if (interfaceC5087a instanceof sg.bigo.ads.U0.k) {
            ((sg.bigo.ads.U0.k) interfaceC5087a).f1 = yVar;
        }
        sg.bigo.ads.s1.b.a(interfaceC5087a, this.b, str, SystemClock.elapsedRealtime() - this.c, 0L, 1, str2, false, str3, str4, str5, 0);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        ((sg.bigo.ads.U0.k) this.f12230a).a(yVar.b);
        sg.bigo.ads.P.r rVar = new sg.bigo.ads.P.r();
        rVar.f12490a = bitmap.getWidth();
        rVar.b = bitmap.getHeight();
        ((sg.bigo.ads.U0.k) this.f12230a).a(rVar);
        this.d.a(bitmap, 2);
        InterfaceC5087a interfaceC5087a = this.f12230a;
        if (interfaceC5087a instanceof sg.bigo.ads.U0.k) {
            ((sg.bigo.ads.U0.k) interfaceC5087a).f1 = yVar;
        }
        sg.bigo.ads.s1.b.a(interfaceC5087a, this.b, yVar.f13302a, SystemClock.elapsedRealtime() - this.c, yVar.c, 0, 1, yVar.b, false, yVar.f, yVar.g, yVar.h, "", 0);
    }
}
