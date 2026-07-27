package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Method;

/* compiled from: MiaUtil.java */
/* loaded from: classes6.dex */
public class f0 {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object invoke = context.getClass().getMethod(k0.a("HF5TNFK/J75/JczQhFKsJr5B"), new Class[0]).invoke(context, new Object[0]);
            if (invoke != null) {
                Method method = invoke.getClass().getMethod(k0.a("HF5T5dQMHN=="), Uri.class);
                StringBuilder append = new StringBuilder().append(k0.a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = k0.a("n+xg");
                }
                str2 = (String) method.invoke(invoke, Uri.parse(append.append(str).toString()));
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MiaUtil", th.getMessage());
            }
        }
        com.mbridge.msdk.foundation.same.report.j.b(str2);
    }
}
