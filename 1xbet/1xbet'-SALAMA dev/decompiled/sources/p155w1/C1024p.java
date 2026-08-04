package p155w1;

import A1.C0011c;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0815k;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: w1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1024p extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17822b;

    public C1024p(boolean z4, boolean z7) {
        this.f17821a = z4;
        this.f17822b = z7;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        Map mapC;
        int identifier;
        C1042v c1042v = H2.a().f17410h;
        String strB = C0815k.a().b();
        boolean z4 = this.f17821a;
        boolean z7 = this.f17822b;
        c1042v.f17889A = strB;
        c1042v.f17891C = z4;
        c1042v.f17892D = z7;
        c1042v.d(new C1008l(c1042v, 1));
        String property = System.getProperty("os.arch");
        if (TextUtils.isEmpty(property)) {
            property = "";
        }
        HashMap map = new HashMap();
        map.put("device.model", Build.MODEL);
        map.put("build.brand", Build.BRAND);
        map.put("build.id", Build.ID);
        map.put("version.release", Build.VERSION.RELEASE);
        map.put("build.device", Build.DEVICE);
        map.put("build.product", Build.PRODUCT);
        synchronized (C1009l0.class) {
            if (C1009l0.f17774b == null) {
                C1009l0.f17774b = new C1009l0(0);
            }
        }
        Context context = AbstractC0998i1.f17749c;
        map.put("proguard.build.uuid", (context == null || (identifier = context.getResources().getIdentifier("com.flurry.crash.map_id", "string", context.getPackageName())) == 0) ? "" : context.getResources().getString(identifier));
        map.put("device.arch", property);
        C1050x1.z().A(new R1(new C0991g2(2, map), 19));
        R1.f();
        C1050x1.z().A(new R1(new U1(1), 20));
        C0011c c0011c = new C0011c(8);
        synchronized (c0011c) {
            try {
                if (!c0011c.f332b) {
                    c0011c.f332b = true;
                    ((File) c0011c.f333c).getAbsolutePath();
                    String strK = AbstractC1006k1.k((File) c0011c.f333c);
                    AbstractC0997i0.o(3, "Referrer file contents: ".concat(String.valueOf(strK)));
                    if (strK != null) {
                        c0011c.f334d = strK;
                    }
                }
                mapC = AbstractC1006k1.c((String) c0011c.f334d);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapC.size() > 0) {
            C1050x1.z().A(new R1(new S1(mapC, 2), 28));
        }
        int i7 = H2.a().f17405c.f17458A;
        if (i7 == 0 || R1.f17529f == i7) {
            return;
        }
        R1.f17529f = i7;
        C1050x1.z().A(new R1(new C0971b2(i7), 15));
    }
}
