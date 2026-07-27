package A0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import java.util.Collections;
import java.util.HashMap;
import m1.C1131a;
import m1.InterfaceC1134d;

/* loaded from: classes.dex */
public final class a implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f35b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f36c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1055c f37d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1055c f38e;

    static {
        C1131a c1131a = new C1131a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC1134d.class, c1131a);
        f35b = new C1055c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        C1131a c1131a2 = new C1131a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InterfaceC1134d.class, c1131a2);
        f36c = new C1055c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        C1131a c1131a3 = new C1131a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(InterfaceC1134d.class, c1131a3);
        f37d = new C1055c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        C1131a c1131a4 = new C1131a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(InterfaceC1134d.class, c1131a4);
        f38e = new C1055c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        D0.b bVar = (D0.b) obj;
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        interfaceC1057e.a(f35b, bVar.f266a);
        interfaceC1057e.a(f36c, bVar.f267b);
        interfaceC1057e.a(f37d, bVar.f268c);
        interfaceC1057e.a(f38e, bVar.f269d);
    }
}
