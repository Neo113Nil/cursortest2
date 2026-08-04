package E5;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import java.util.HashMap;
import java.util.Map;
import p042f4.C0897f;

/* JADX INFO: renamed from: E5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0195m implements B, InterfaceC0204w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2386a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2387b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f2388c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f2389d = new HashMap();

    public static C0897f c(C0197o c0197o) throws P4.a {
        FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
        if (firebaseUserS == null) {
            throw new P4.a("No user is signed in");
        }
        HashMap map = f2386a;
        if (map.get(c0197o.f2391a) == null) {
            map.put(c0197o.f2391a, new HashMap());
        }
        Map map2 = (Map) map.get(c0197o.f2391a);
        zzad zzadVar = (zzad) firebaseUserS;
        if (map2.get(zzadVar.f11909b.f11939a) == null) {
            map2.put(zzadVar.f11909b.f11939a, new C0897f(zzadVar));
        }
        return (C0897f) map2.get(zzadVar.f11909b.f11939a);
    }
}
