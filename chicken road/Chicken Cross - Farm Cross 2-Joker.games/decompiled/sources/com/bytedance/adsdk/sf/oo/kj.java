package com.bytedance.adsdk.sf.oo;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.sf.tmg;
import com.ironsource.C4761z5;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes4.dex */
public class kj {
    private final qf pcc;
    private final wh sf;

    public kj(qf qfVar, wh whVar) {
        this.pcc = qfVar;
        this.sf = whVar;
    }

    public tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, String str2) {
        com.bytedance.adsdk.sf.qf sf = sf(context, str, str2);
        if (sf != null) {
            return new tmg<>(sf);
        }
        return gm(context, str, str2);
    }

    private com.bytedance.adsdk.sf.qf sf(Context context, String str, String str2) {
        qf qfVar;
        Pair<gm, InputStream> pcc;
        tmg<com.bytedance.adsdk.sf.qf> sf;
        if (str2 == null || (qfVar = this.pcc) == null || (pcc = qfVar.pcc(str)) == null) {
            return null;
        }
        gm gmVar = (gm) pcc.first;
        InputStream inputStream = (InputStream) pcc.second;
        if (gmVar == gm.ZIP) {
            sf = com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(inputStream), str2);
        } else {
            sf = com.bytedance.adsdk.sf.kj.sf(inputStream, str2);
        }
        if (sf.pcc() != null) {
            return sf.pcc();
        }
        return null;
    }

    private tmg<com.bytedance.adsdk.sf.qf> gm(Context context, String str, String str2) {
        oo ooVar = null;
        try {
            try {
                oo pcc = this.sf.pcc(str);
                if (pcc.pcc()) {
                    tmg<com.bytedance.adsdk.sf.qf> pcc2 = pcc(context, str, pcc.sf(), pcc.gm(), str2);
                    pcc2.pcc();
                    if (pcc != null) {
                        try {
                            pcc.close();
                        } catch (IOException unused) {
                        }
                    }
                    return pcc2;
                }
                tmg<com.bytedance.adsdk.sf.qf> tmgVar = new tmg<>(new IllegalArgumentException(pcc.oo()));
                if (pcc != null) {
                    try {
                        pcc.close();
                    } catch (IOException unused2) {
                    }
                }
                return tmgVar;
            } catch (Exception e) {
                tmg<com.bytedance.adsdk.sf.qf> tmgVar2 = new tmg<>(e);
                if (0 != 0) {
                    try {
                        ooVar.close();
                    } catch (IOException unused3) {
                    }
                }
                return tmgVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    ooVar.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        tmg<com.bytedance.adsdk.sf.qf> pcc;
        gm gmVar;
        qf qfVar;
        if (str2 == null) {
            str2 = C4761z5.M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            gm gmVar2 = gm.ZIP;
            pcc = pcc(context, str, inputStream, str3);
            gmVar = gmVar2;
        } else {
            gmVar = gm.JSON;
            pcc = pcc(str, inputStream, str3);
        }
        if (str3 != null && pcc.pcc() != null && (qfVar = this.pcc) != null) {
            qfVar.pcc(str, gmVar);
        }
        return pcc;
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, InputStream inputStream, String str2) throws IOException {
        qf qfVar;
        if (str2 == null || (qfVar = this.pcc) == null) {
            return com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(new FileInputStream(qfVar.pcc(str, inputStream, gm.ZIP))), str);
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(String str, InputStream inputStream, String str2) throws IOException {
        qf qfVar;
        if (str2 == null || (qfVar = this.pcc) == null) {
            return com.bytedance.adsdk.sf.kj.sf(inputStream, (String) null);
        }
        return com.bytedance.adsdk.sf.kj.sf(new FileInputStream(qfVar.pcc(str, inputStream, gm.JSON).getAbsolutePath()), str);
    }
}
