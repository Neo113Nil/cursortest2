package l4;

import java.util.Map;
import w1.L;

/* renamed from: l4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1396g implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14940b;

    public /* synthetic */ C1396g(Object obj, int i7) {
        this.f14939a = i7;
        this.f14940b = obj;
    }

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        String str;
        switch (this.f14939a) {
            case 0:
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    str2 = null;
                    str = null;
                } else {
                    str = (String) map.get("d");
                }
                u uVar = (u) this.f14940b;
                if (uVar != null) {
                    uVar.b(str2, str);
                    break;
                }
                break;
            default:
                String str3 = (String) map.get("s");
                if (!str3.equals("ok")) {
                    String str4 = (String) map.get("d");
                    s sVar = (s) this.f14940b;
                    if (sVar.f15007y.r0()) {
                        sVar.f15007y.W(null, L.j("Failed to send stats: ", str3, " (message: ", str4, ")"), new Object[0]);
                        break;
                    }
                }
                break;
        }
    }
}
