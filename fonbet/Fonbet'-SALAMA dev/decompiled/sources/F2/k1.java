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

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f2692a = new k1();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r2.contains(r1) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzm a(Context context, M0 m02) {
        boolean z4;
        Context applicationContext;
        String str;
        String str2;
        int i7;
        int i8;
        String str3;
        String str4 = m02.f2601a;
        Set set = m02.f2603c;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        y2.u uVar = T0.e().f2641h;
        J2.d dVar = C0252s.f2717f.f2718a;
        String q7 = J2.d.q(context);
        if (!m02.f2608h.contains(q7)) {
            uVar.getClass();
            if (!new ArrayList(uVar.f18181d).contains(q7)) {
                z4 = false;
                Bundle bundle = m02.f2604d.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i8 = i7 + 1;
                        if (i8 >= stackTrace.length) {
                            str3 = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i7];
                        String className = stackTraceElement.getClassName();
                        i7 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (J2.d.f3806c.equalsIgnoreCase(className) || J2.d.f3807d.equalsIgnoreCase(className) || J2.d.f3808e.equalsIgnoreCase(className) || J2.d.f3809f.equalsIgnoreCase(className) || J2.d.f3810g.equalsIgnoreCase(className) || J2.d.f3811h.equalsIgnoreCase(className))) ? 0 : i8;
                    }
                    str3 = stackTrace[i8].getClassName();
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
                        if (str3 != null) {
                        }
                    }
                    str3 = null;
                    str = str3;
                } else {
                    str = null;
                }
                y2.u uVar2 = T0.e().f2641h;
                int max = Math.max(m02.f2607g, uVar2.f18178a);
                str2 = uVar2.f18180c;
                if (str2 == null) {
                    str2 = "";
                }
                return new zzm(8, -1L, bundle, -1, unmodifiableList, z4, max, false, m02.f2605e, null, null, str4, m02.f2604d, m02.f2609i, Collections.unmodifiableList(new ArrayList(m02.j)), m02.f2606f, str, m02.f2610k, null, uVar2.f18179b, (String) Collections.max(Arrays.asList(null, str2), new C0090i(2)), new ArrayList(m02.f2602b), m02.f2611l, null, t.e.e(uVar2.f18182e), m02.f2612m);
            }
        }
        z4 = true;
        Bundle bundle2 = m02.f2604d.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        y2.u uVar22 = T0.e().f2641h;
        int max2 = Math.max(m02.f2607g, uVar22.f18178a);
        str2 = uVar22.f18180c;
        if (str2 == null) {
        }
        return new zzm(8, -1L, bundle2, -1, unmodifiableList, z4, max2, false, m02.f2605e, null, null, str4, m02.f2604d, m02.f2609i, Collections.unmodifiableList(new ArrayList(m02.j)), m02.f2606f, str, m02.f2610k, null, uVar22.f18179b, (String) Collections.max(Arrays.asList(null, str2), new C0090i(2)), new ArrayList(m02.f2602b), m02.f2611l, null, t.e.e(uVar22.f18182e), m02.f2612m);
    }
}
