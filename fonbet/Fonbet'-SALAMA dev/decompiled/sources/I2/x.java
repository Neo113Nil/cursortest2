package I2;

import F2.C0254t;
import android.content.Context;
import com.google.android.gms.internal.ads.zzaoj;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzbby;
import java.util.HashMap;
import java.util.Map;
import w1.F0;
import w1.P2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static zzape f3655a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3656b = new Object();

    public x(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f3656b) {
            try {
                if (f3655a == null) {
                    zzbby.zza(context);
                    f3655a = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeB)).booleanValue() ? C0307o.a(context) : zzaqi.zza(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0313v a(int i7, String str, HashMap hashMap, byte[] bArr) {
        C0313v c0313v = new C0313v();
        P2 p22 = new P2(14, str, c0313v, false);
        J2.g gVar = new J2.g();
        C0312u c0312u = new C0312u(i7, str, c0313v, p22, bArr, hashMap, gVar);
        if (J2.g.c()) {
            try {
                Map zzl = c0312u.zzl();
                if (bArr == null) {
                    bArr = null;
                }
                byte[] bArr2 = bArr;
                if (J2.g.c()) {
                    gVar.d("onNetworkRequest", new F0(str, "GET", zzl, bArr2, 3));
                }
            } catch (zzaoj e7) {
                String message = e7.getMessage();
                int i8 = J.f3546b;
                J2.j.g(message);
            }
        }
        f3655a.zza(c0312u);
        return c0313v;
    }
}
