package T2;

import A0.J0;
import P.W;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1815y3;
import java.util.Map;

/* loaded from: classes.dex */
public final class u extends A3 {

    /* renamed from: w, reason: collision with root package name */
    public final C0634Ld f5747w;

    /* renamed from: x, reason: collision with root package name */
    public final U2.g f5748x;

    public u(String str, C0634Ld c0634Ld) {
        super(0, str, new J0(c0634Ld));
        this.f5747w = c0634Ld;
        U2.g gVar = new U2.g();
        this.f5748x = gVar;
        if (U2.g.c()) {
            Object obj = null;
            gVar.d("onNetworkRequest", new C1071hd(str, "GET", obj, obj, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final W a(C1815y3 c1815y3) {
        return new W(c1815y3, AbstractC1668us.z(c1815y3));
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final void e(Object obj) {
        byte[] bArr;
        C1815y3 c1815y3 = (C1815y3) obj;
        Map map = c1815y3.f16388c;
        U2.g gVar = this.f5748x;
        gVar.getClass();
        if (U2.g.c()) {
            int i = c1815y3.f16386a;
            gVar.d("onNetworkResponse", new C2.h(i, map));
            if (i < 200 || i >= 300) {
                gVar.d("onNetworkRequestError", new H3.g(null, 3));
            }
        }
        if (U2.g.c() && (bArr = c1815y3.f16387b) != null) {
            gVar.d("onNetworkResponseBody", new J0(bArr));
        }
        this.f5747w.b(c1815y3);
    }
}
