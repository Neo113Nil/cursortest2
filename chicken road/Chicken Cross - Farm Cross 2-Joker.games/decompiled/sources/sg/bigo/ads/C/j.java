package sg.bigo.ads.C;

import android.graphics.Bitmap;
import android.os.SystemClock;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class j implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5087a f12231a;
    public final /* synthetic */ long b;

    public j(InterfaceC5087a interfaceC5087a, long j) {
        this.f12231a = interfaceC5087a;
        this.b = j;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (yVar != null) {
            String str6 = yVar.b;
            String str7 = yVar.f;
            String str8 = yVar.g;
            str5 = yVar.h;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        InterfaceC5087a interfaceC5087a = this.f12231a;
        sg.bigo.ads.s1.b.a(interfaceC5087a, ((sg.bigo.ads.U0.k) interfaceC5087a).e(), str, SystemClock.elapsedRealtime() - this.b, 0L, 1, str2, false, str3, str4, str5, 0);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        InterfaceC5087a interfaceC5087a = this.f12231a;
        sg.bigo.ads.s1.b.a(interfaceC5087a, ((sg.bigo.ads.U0.k) interfaceC5087a).e(), yVar.f13302a, SystemClock.elapsedRealtime() - this.b, yVar.c, 0, 1, yVar.b, false, yVar.f, yVar.g, yVar.h, "", 0);
    }
}
