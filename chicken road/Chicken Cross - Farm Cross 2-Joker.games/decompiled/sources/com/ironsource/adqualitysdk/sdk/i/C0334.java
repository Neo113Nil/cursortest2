package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.İ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0334 extends AbstractC1255 {
    public C0334(String str, String str2, C1074 c1074) {
        super(str, str2);
        String m5940 = AbstractC1257.m5940("d7zl6g==\n", "Wc+XhoKqkc0=\n", new StringBuilder().append(StringFog.decrypt("pGTmtSZVq6o=\n", "xQqCx0k8z4c=\n")).append(this.f3550.toLowerCase()).append(StringFog.decrypt("ag==\n", "R2qe3HJI/Zc=\n")).append(this.f3549));
        if (c1074 != null) {
            ArrayList arrayList = new ArrayList();
            while (c1074 != null && c1074.f3181 != null) {
                arrayList.add(c1074);
                c1074 = c1074.f3182;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1074 c10742 = (C1074) it.next();
                String m5514 = AbstractC0548.m5514("ng==\n", "sG9cZvpow9A=\n", new StringBuilder().append(str), str2);
                C0623 c0623 = c10742.f3181;
                this.f3551.add(new C1223(m5514, c0623.f1642, m5940, c10742.m5836() + c0623.m5582()));
            }
        } else {
            this.f3551.add(new C1223(str, str2, AbstractC1257.m5940("+slyGTwTZbC42DMdIRlo\n", "16odd1J2BsQ=\n", new StringBuilder().append(str)), 0));
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList arrayList2 = new ArrayList();
        String name = C0623.class.getName();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList2.add(0, stackTraceElement);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) it2.next();
            this.f3551.add(new C1223(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
    }
}
