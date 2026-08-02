package Q2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Z0 implements O2.a {

    /* renamed from: k, reason: collision with root package name */
    public static final Z0 f4973k = new Z0();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (r2.contains(r1) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X0 a(Context context, A0 a02) {
        boolean z3;
        Context applicationContext;
        String str;
        int i;
        int i5;
        String str2;
        a02.getClass();
        Set set = a02.f4892b;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        J2.p pVar = F0.e().f4922g;
        U2.e eVar = C0379q.f.f5048a;
        String m5 = U2.e.m(context);
        if (!a02.f4895e.contains(m5)) {
            pVar.getClass();
            if (!new ArrayList(pVar.f2725a).contains(m5)) {
                z3 = false;
                Bundle bundle = a02.f4893c.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i5 = i + 1;
                        if (i5 >= stackTrace.length) {
                            str2 = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i];
                        String className = stackTraceElement.getClassName();
                        i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (U2.e.f5862c.equalsIgnoreCase(className) || U2.e.f5863d.equalsIgnoreCase(className) || U2.e.f5864e.equalsIgnoreCase(className) || U2.e.f.equalsIgnoreCase(className) || U2.e.f5865g.equalsIgnoreCase(className) || U2.e.f5866h.equalsIgnoreCase(className))) ? 0 : i5;
                    }
                    str2 = stackTrace[i5].getClassName();
                    if (packageName != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                        StringBuilder sb = new StringBuilder();
                        if (stringTokenizer.hasMoreElements()) {
                            sb.append(stringTokenizer.nextToken());
                            for (int i6 = 2; i6 > 0 && stringTokenizer.hasMoreElements(); i6--) {
                                sb.append(".");
                                sb.append(stringTokenizer.nextToken());
                            }
                            packageName = sb.toString();
                        }
                        if (str2 != null) {
                        }
                    }
                    str2 = null;
                    str = str2;
                } else {
                    str = null;
                }
                F0.e().f4922g.getClass();
                return new X0(8, -1L, bundle, -1, unmodifiableList, z3, Math.max(a02.f4894d, -1), false, null, null, null, null, a02.f4893c, a02.f, Collections.unmodifiableList(new ArrayList(a02.f4896g)), null, str, a02.f4897h, null, -1, (String) Collections.max(Arrays.asList(null, ""), new Y0()), new ArrayList(a02.f4891a), a02.i, null, AbstractC2462i.b(1), a02.f4898j);
            }
        }
        z3 = true;
        Bundle bundle2 = a02.f4893c.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        F0.e().f4922g.getClass();
        return new X0(8, -1L, bundle2, -1, unmodifiableList, z3, Math.max(a02.f4894d, -1), false, null, null, null, null, a02.f4893c, a02.f, Collections.unmodifiableList(new ArrayList(a02.f4896g)), null, str, a02.f4897h, null, -1, (String) Collections.max(Arrays.asList(null, ""), new Y0()), new ArrayList(a02.f4891a), a02.i, null, AbstractC2462i.b(1), a02.f4898j);
    }
}
