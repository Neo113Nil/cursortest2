package L5;

import com.google.android.gms.ads.MobileAds;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final A5.p f4440a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4441b = false;

    public U(A5.p pVar) {
        this.f4440a = pVar;
    }

    public final void a(D2.c cVar) {
        if (this.f4441b) {
            return;
        }
        try {
            Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, "Flutter-GMA-5.3.1");
        } catch (Exception unused) {
        }
        this.f4440a.success(new E(cVar));
        this.f4441b = true;
    }
}
