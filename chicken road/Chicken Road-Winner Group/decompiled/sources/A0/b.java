package A0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import java.util.Collections;
import java.util.HashMap;
import m1.C1131a;
import m1.InterfaceC1134d;

/* loaded from: classes.dex */
public final class b implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f40b;

    static {
        C1131a c1131a = new C1131a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC1134d.class, c1131a);
        f40b = new C1055c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC1057e) obj2).a(f40b, ((D0.c) obj).f270a);
    }
}
