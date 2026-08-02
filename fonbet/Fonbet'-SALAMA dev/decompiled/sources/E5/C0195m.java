package E5;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import f4.C1094f;
import java.util.HashMap;
import java.util.Map;
import n1.C1450e;

/* renamed from: E5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0195m implements B, InterfaceC0204w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2386a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2387b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2388c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f2389d = new HashMap();

    public static C1094f c(C0197o c0197o) {
        FirebaseUser s7 = C1450e.s(c0197o);
        if (s7 == null) {
            throw new P4.a("No user is signed in");
        }
        HashMap hashMap = f2386a;
        if (hashMap.get(c0197o.f2391a) == null) {
            hashMap.put(c0197o.f2391a, new HashMap());
        }
        Map map = (Map) hashMap.get(c0197o.f2391a);
        zzad zzadVar = (zzad) s7;
        if (map.get(zzadVar.f11909b.f11939a) == null) {
            map.put(zzadVar.f11909b.f11939a, new C1094f(zzadVar));
        }
        return (C1094f) map.get(zzadVar.f11909b.f11939a);
    }
}
