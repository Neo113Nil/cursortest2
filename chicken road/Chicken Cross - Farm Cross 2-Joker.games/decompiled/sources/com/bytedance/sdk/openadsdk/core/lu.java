package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class lu {
    private static int gm = -1;
    private static volatile Context pcc;
    private static volatile of<com.bytedance.sdk.openadsdk.oo.pcc> sf;

    public static Context pcc() {
        if (pcc == null) {
            sf(null);
        }
        return pcc;
    }

    public static Context pcc(Context context) {
        if (context == null) {
            context = pcc();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static void sf(Context context) {
        if (pcc == null) {
            synchronized (lu.class) {
                if (pcc == null) {
                    if (context != null) {
                        pcc = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            pcc = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application pcc2 = pcc.pcc();
                        if (pcc2 != null) {
                            pcc = pcc2;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static int sf() {
        Context pcc2;
        if (gm < 0 && (pcc2 = pcc()) != null) {
            gm = ViewConfiguration.get(pcc2).getScaledTouchSlop();
        }
        return gm;
    }

    public static of<com.bytedance.sdk.openadsdk.oo.pcc> gm() {
        if (sf == null) {
            synchronized (lu.class) {
                if (sf == null) {
                    sf = new yt(pcc);
                }
            }
        }
        return sf;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.vh oo() {
        return com.bytedance.sdk.openadsdk.core.settings.vh.sf();
    }

    public static com.bytedance.sdk.openadsdk.dax.sf.gm vj() {
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            return com.bytedance.sdk.openadsdk.dax.sf.oo.pcc();
        }
        return com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc();
    }

    private static class pcc {
        private static volatile Application pcc;

        public static Application pcc() {
            return pcc;
        }

        static {
            try {
                Object sf = sf();
                pcc = (Application) sf.getClass().getMethod("getApplication", new Class[0]).invoke(sf, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("MyApplication", "application get failed", th);
            }
        }

        private static Object sf() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
