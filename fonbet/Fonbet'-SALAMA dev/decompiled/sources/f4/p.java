package f4;

import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import e4.C1036j;
import i3.C1263a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C1263a f12959a = new C1263a("GetTokenResultFactory", new String[0]);

    public static C1036j a(String str) {
        Map hashMap;
        try {
            hashMap = r.b(str);
        } catch (zzzh e7) {
            f12959a.b("Error parsing token claims", e7, new Object[0]);
            hashMap = new HashMap();
        }
        C1036j c1036j = new C1036j();
        c1036j.f12681a = str;
        c1036j.f12682b = hashMap;
        return c1036j;
    }
}
