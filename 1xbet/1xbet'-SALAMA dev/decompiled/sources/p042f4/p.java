package p042f4;

import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import java.util.HashMap;
import java.util.Map;
import p034e4.j;
import p062i3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12965a = new a("GetTokenResultFactory", new String[0]);

    public static j a(String str) {
        Map map;
        try {
            map = r.b(str);
        } catch (zzzh e7) {
            f12965a.b("Error parsing token claims", e7, new Object[0]);
            map = new HashMap();
        }
        j jVar = new j();
        jVar.f12687a = str;
        jVar.f12688b = map;
        return jVar;
    }
}
