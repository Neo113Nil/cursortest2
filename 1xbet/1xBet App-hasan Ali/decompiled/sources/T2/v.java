package T2;

import Q2.C0;
import android.content.Context;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1411p3;
import com.google.android.gms.internal.ads.C1543s1;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.K3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static C0 f5749a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5750b = new Object();

    public v(Context context) {
        C0 c02;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f5750b) {
            try {
                if (f5749a == null) {
                    F7.a(context);
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8870n4)).booleanValue()) {
                        c02 = C0436n.r(context);
                    } else {
                        c02 = new C0(new K3(new C1390oj(context.getApplicationContext())), new C1390oj(new C1543s1(23)));
                        c02.i();
                    }
                    f5749a = c02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static t a(int i, String str, HashMap hashMap, byte[] bArr) {
        t tVar = new t();
        v3.g gVar = new v3.g(11, str, tVar);
        U2.g gVar2 = new U2.g();
        C0440s c0440s = new C0440s(i, str, tVar, gVar, bArr, hashMap, gVar2);
        if (U2.g.c()) {
            try {
                Map c5 = c0440s.c();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (U2.g.c()) {
                    gVar2.d("onNetworkRequest", new C1071hd(str, "GET", c5, bArr2, 2));
                }
            } catch (C1411p3 e3) {
                U2.j.i(e3.getMessage());
            }
        }
        f5749a.g(c0440s);
        return tVar;
    }
}
