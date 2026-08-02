package l4;

import java.util.Map;
import m4.C1437a;
import n4.AbstractC1469c;
import n4.C1479m;
import w1.L;

/* renamed from: l4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1397h implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14942b;

    public C1397h(s sVar, boolean z4) {
        this.f14942b = sVar;
        this.f14941a = z4;
    }

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        s sVar = this.f14942b;
        if (equals) {
            sVar.f14991h = EnumC1402m.f14957e;
            sVar.f14979C = 0;
            sVar.j(this.f14941a);
            return;
        }
        sVar.f14999q = null;
        sVar.f15000r = true;
        C1479m c1479m = sVar.f14984a;
        c1479m.getClass();
        c1479m.t(AbstractC1469c.f15395c, Boolean.FALSE);
        android.support.v4.media.session.t tVar = sVar.f15007y;
        tVar.W(null, L.j("Authentication failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
        sVar.f14990g.d(2);
        if (str.equals("invalid_token")) {
            int i7 = sVar.f14979C + 1;
            sVar.f14979C = i7;
            if (i7 >= 3) {
                C1437a c1437a = sVar.f15008z;
                c1437a.f15268i = c1437a.f15263d;
                tVar.C0("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        }
    }
}
