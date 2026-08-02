package w1;

import A1.C0011c;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0859k;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733p extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17816b;

    public C1733p(boolean z4, boolean z7) {
        this.f17815a = z4;
        this.f17816b = z7;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        Map c3;
        int identifier;
        C1751v c1751v = H2.a().f17404h;
        String b7 = C0859k.a().b();
        boolean z4 = this.f17815a;
        boolean z7 = this.f17816b;
        c1751v.f17883A = b7;
        c1751v.f17885C = z4;
        c1751v.f17886D = z7;
        c1751v.d(new C1717l(c1751v, 1));
        String property = System.getProperty("os.arch");
        if (TextUtils.isEmpty(property)) {
            property = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("device.model", Build.MODEL);
        hashMap.put("build.brand", Build.BRAND);
        hashMap.put("build.id", Build.ID);
        hashMap.put("version.release", Build.VERSION.RELEASE);
        hashMap.put("build.device", Build.DEVICE);
        hashMap.put("build.product", Build.PRODUCT);
        synchronized (C1718l0.class) {
            if (C1718l0.f17768b == null) {
                C1718l0.f17768b = new C1718l0(0);
            }
        }
        Context context = AbstractC1707i1.f17743c;
        hashMap.put("proguard.build.uuid", (context == null || (identifier = context.getResources().getIdentifier("com.flurry.crash.map_id", "string", context.getPackageName())) == 0) ? "" : context.getResources().getString(identifier));
        hashMap.put("device.arch", property);
        C1759x1.z().A(new R1(new C1700g2(2, hashMap), 19));
        R1.f();
        C1759x1.z().A(new R1(new U1(1), 20));
        C0011c c0011c = new C0011c(8);
        synchronized (c0011c) {
            try {
                if (!c0011c.f332b) {
                    c0011c.f332b = true;
                    ((File) c0011c.f333c).getAbsolutePath();
                    String k7 = AbstractC1715k1.k((File) c0011c.f333c);
                    AbstractC1706i0.o(3, "Referrer file contents: ".concat(String.valueOf(k7)));
                    if (k7 != null) {
                        c0011c.f334d = k7;
                    }
                }
                c3 = AbstractC1715k1.c((String) c0011c.f334d);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3.size() > 0) {
            C1759x1.z().A(new R1(new S1(c3, 2), 28));
        }
        int i7 = H2.a().f17399c.f17452A;
        if (i7 == 0 || R1.f17523f == i7) {
            return;
        }
        R1.f17523f = i7;
        C1759x1.z().A(new R1(new C1680b2(i7), 15));
    }
}
