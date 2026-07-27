package sg.bigo.ads.Y0;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import sg.bigo.ads.e.AbstractC5081e;

/* loaded from: classes3.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12624a;
    public final /* synthetic */ B b;

    public A(B b, boolean z) {
        this.b = b;
        this.f12624a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.P.c e = this.b.b.e();
        sg.bigo.ads.P.e eVar = this.b.c;
        int i = eVar.f12477a;
        int i2 = this.f12624a ? 1 : 2;
        String str = eVar.b;
        String str2 = eVar.c;
        HashMap a2 = sg.bigo.ads.s1.b.a(e, (sg.bigo.ads.Q.b) null, false);
        AbstractC5081e.a(a2, "ad_pkg_name", str, i, "open_rslt");
        a2.put("open_type", String.valueOf(i2));
        a2.put("ori_ad_bundle", ((sg.bigo.ads.U0.b) e).U);
        a2.put(Constants.REFERRER, str2);
        sg.bigo.ads.s1.b.a("06002070", a2);
    }
}
