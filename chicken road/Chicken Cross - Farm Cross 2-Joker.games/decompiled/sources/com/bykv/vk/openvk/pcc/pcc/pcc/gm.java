package com.bykv.vk.openvk.pcc.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.vh;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class gm {
    private static String gm = null;
    private static vh oo = null;
    public static boolean pcc = false;
    private static Context sf = null;
    private static int vj = 1;

    public static Context pcc() {
        return sf;
    }

    public static String sf() {
        if (TextUtils.isEmpty(gm)) {
            try {
                File file = new File(pcc().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                gm = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return gm;
    }

    public static void pcc(Context context, String str) {
        sf = context;
        gm = str;
    }

    public static vh gm() {
        if (oo == null) {
            oo = new vh.pcc("v_config").pcc(10000L, TimeUnit.MILLISECONDS).sf(10000L, TimeUnit.MILLISECONDS).gm(10000L, TimeUnit.MILLISECONDS).pcc();
        }
        return oo;
    }

    public static void pcc(vh vhVar) {
        oo = vhVar;
    }

    public static boolean oo() {
        return pcc;
    }

    public static void pcc(int i) {
        vj = i;
    }

    public static int vj() {
        return vj;
    }
}
