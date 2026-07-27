package com.bytedance.adsdk.sf;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* loaded from: classes4.dex */
public class vj {
    private static boolean gm = true;
    private static int kj = 0;
    private static boolean oo = true;
    private static com.bytedance.adsdk.sf.oo.vj ork = null;
    public static boolean pcc = false;
    private static int qf = 0;
    private static boolean sf = false;
    private static volatile com.bytedance.adsdk.sf.oo.qf tmg;
    private static volatile com.bytedance.adsdk.sf.oo.kj vh;
    private static String[] vj;
    private static com.bytedance.adsdk.sf.oo.wh vy;
    private static long[] wh;

    public static void pcc(String str) {
        if (sf) {
            int i = qf;
            if (i == 20) {
                kj++;
                return;
            }
            vj[i] = str;
            wh[i] = System.nanoTime();
            Trace.beginSection(str);
            qf++;
        }
    }

    public static float sf(String str) {
        int i = kj;
        if (i > 0) {
            kj = i - 1;
            return 0.0f;
        }
        if (!sf) {
            return 0.0f;
        }
        int i2 = qf - 1;
        qf = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(vj[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + vj[qf] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - wh[qf]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.sf.oo.kj pcc(Context context) {
        com.bytedance.adsdk.sf.oo.kj kjVar;
        com.bytedance.adsdk.sf.oo.kj kjVar2 = vh;
        if (kjVar2 != null) {
            return kjVar2;
        }
        synchronized (com.bytedance.adsdk.sf.oo.kj.class) {
            kjVar = vh;
            if (kjVar == null) {
                com.bytedance.adsdk.sf.oo.qf sf2 = sf(context);
                com.bytedance.adsdk.sf.oo.wh whVar = vy;
                if (whVar == null) {
                    whVar = new com.bytedance.adsdk.sf.oo.sf();
                }
                kjVar = new com.bytedance.adsdk.sf.oo.kj(sf2, whVar);
                vh = kjVar;
            }
        }
        return kjVar;
    }

    public static com.bytedance.adsdk.sf.oo.qf sf(Context context) {
        com.bytedance.adsdk.sf.oo.qf qfVar;
        if (!gm) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.sf.oo.qf qfVar2 = tmg;
        if (qfVar2 != null) {
            return qfVar2;
        }
        synchronized (com.bytedance.adsdk.sf.oo.qf.class) {
            qfVar = tmg;
            if (qfVar == null) {
                com.bytedance.adsdk.sf.oo.vj vjVar = ork;
                if (vjVar == null) {
                    vjVar = new com.bytedance.adsdk.sf.oo.vj() { // from class: com.bytedance.adsdk.sf.vj.1
                        @Override // com.bytedance.adsdk.sf.oo.vj
                        public File pcc() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                qfVar = new com.bytedance.adsdk.sf.oo.qf(vjVar);
                tmg = qfVar;
            }
        }
        return qfVar;
    }

    public static boolean pcc() {
        return oo;
    }
}
