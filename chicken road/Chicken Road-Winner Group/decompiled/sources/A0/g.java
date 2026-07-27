package A0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import java.util.Collections;
import java.util.HashMap;
import m1.C1131a;
import m1.InterfaceC1134d;

/* loaded from: classes.dex */
public final class g implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f51a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f52b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f53c;

    static {
        C1131a c1131a = new C1131a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC1134d.class, c1131a);
        f52b = new C1055c("startMs", Collections.unmodifiableMap(new HashMap(hashMap)));
        C1131a c1131a2 = new C1131a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InterfaceC1134d.class, c1131a2);
        f53c = new C1055c("endMs", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        D0.h hVar = (D0.h) obj;
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        interfaceC1057e.d(f52b, hVar.f286a);
        interfaceC1057e.d(f53c, hVar.f287b);
    }
}
