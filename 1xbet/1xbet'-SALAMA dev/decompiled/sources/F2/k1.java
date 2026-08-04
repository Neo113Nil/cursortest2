package F2;

import C0.C0090i;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f2692a = new k1();

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    public static zzm a(Context context, M0 m7) {
        boolean z4;
        String str;
        String className;
        String str2 = m7.f2601a;
        Set set = m7.f2603c;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        p167y2.u uVar = T0.e().f2641h;
        J2.d dVar = C0252s.f2717f.f2718a;
        String strQ = J2.d.q(context);
        int i7 = 0;
        if (m7.f2608h.contains(strQ)) {
            z4 = true;
        } else {
            uVar.getClass();
            if (new ArrayList(uVar.f18187d).contains(strQ)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        Bundle bundle = m7.f2604d.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i8 = i7 + 1;
                if (i8 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i7];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (J2.d.f3806c.equalsIgnoreCase(className2) || J2.d.f3807d.equalsIgnoreCase(className2) || J2.d.f3808e.equalsIgnoreCase(className2) || J2.d.f3809f.equalsIgnoreCase(className2) || J2.d.f3810g.equalsIgnoreCase(className2) || J2.d.f3811h.equalsIgnoreCase(className2))) {
                    className = stackTrace[i8].getClassName();
                    break;
                }
                i7 = i8;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    for (int i9 = 2; i9 > 0 && stringTokenizer.hasMoreElements(); i9--) {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        p167y2.u uVar2 = T0.e().f2641h;
        int iMax = Math.max(m7.f2607g, uVar2.f18184a);
        String str3 = uVar2.f18186c;
        if (str3 == null) {
            str3 = "";
        }
        return new zzm(8, -1L, bundle, -1, listUnmodifiableList, z4, iMax, false, m7.f2605e, null, null, str2, m7.f2604d, m7.f2609i, Collections.unmodifiableList(new ArrayList(m7.j)), m7.f2606f, str, m7.f2610k, null, uVar2.f18185b, (String) Collections.max(Arrays.asList(null, str3), new C0090i(2)), new ArrayList(m7.f2602b), m7.f2611l, null, p136t.e.e(uVar2.f18188e), m7.f2612m);
    }
}
