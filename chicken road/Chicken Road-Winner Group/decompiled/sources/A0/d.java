package A0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import java.util.Collections;
import java.util.HashMap;
import m1.C1131a;
import m1.InterfaceC1134d;

/* loaded from: classes.dex */
public final class d implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f44a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f45b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f46c;

    static {
        C1131a c1131a = new C1131a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC1134d.class, c1131a);
        f45b = new C1055c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        C1131a c1131a2 = new C1131a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InterfaceC1134d.class, c1131a2);
        f46c = new C1055c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        D0.f fVar = (D0.f) obj;
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        interfaceC1057e.a(f45b, fVar.f282a);
        interfaceC1057e.a(f46c, fVar.f283b);
    }
}
