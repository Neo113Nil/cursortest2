package com.bytedance.sdk.openadsdk.tz.pcc;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.dax;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.ye;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.qf;
import com.bytedance.sdk.openadsdk.tz.sf.pcc;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class gm {
    private static volatile gm pcc;
    private String gm;
    private String oo;
    private String sf;
    private final Set<String> vj = Collections.synchronizedSet(new HashSet());

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                if (pcc == null) {
                    pcc = new gm();
                }
            }
        }
        return pcc;
    }

    public void pcc(Map<String, String> map) {
        File[] listFiles;
        if (qf.pcc()) {
            String wh = wh();
            if (!TextUtils.isEmpty(wh)) {
                File file = new File(wh);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            try {
                                File pcc2 = com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc(file2);
                                if (pcc2 != null && pcc2.exists()) {
                                    map.put(file2.getName(), pcc2.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int pcc3 = vj.pcc("plb_res_delay_fetch_time", 0);
            if (pcc3 <= 0) {
                gm();
            } else {
                jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.gm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.gm();
                    }
                }, pcc3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.tz.pcc.gm.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tz.sf.pcc sf = com.bytedance.sdk.openadsdk.tz.sf.pcc.sf(com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("pag_plb_config", "model", ""));
                if (sf != null) {
                    gm.this.pcc(sf, null, 0);
                }
            }
        });
    }

    public void sf() {
        if (!qf.pcc() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("pag_plb_config", "last_update_time", 0L);
        final String pcc2 = vj.pcc("plb_res", "");
        long pcc3 = vj.pcc("plb_res_fetch_interval", Constants.ONE_HOUR);
        if (pcc3 <= 0 || pcc3 > 259200000) {
            pcc3 = 3600000;
        }
        if (currentTimeMillis < pcc3 || TextUtils.isEmpty(pcc2)) {
            return;
        }
        int pcc4 = vj.pcc("plb_res_delay_fetch_time", 0);
        if (pcc4 <= 0) {
            sf(pcc2);
        } else {
            jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.gm.3
                @Override // java.lang.Runnable
                public void run() {
                    gm.this.sf(pcc2);
                }
            }, pcc4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(final String str) {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.tz.pcc.gm.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
                try {
                    gm.gm(com.bytedance.sdk.openadsdk.vy.oo.pcc(gm, str));
                    com.bytedance.sdk.component.qf.sf vj = gm.vj();
                    if (vj == null || !vj.wh()) {
                        return;
                    }
                    String oo = vj.oo();
                    com.bytedance.sdk.openadsdk.tz.sf.pcc sf = com.bytedance.sdk.openadsdk.tz.sf.pcc.sf(oo);
                    com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (sf != null) {
                        com.bytedance.sdk.openadsdk.tz.sf.pcc sf2 = com.bytedance.sdk.openadsdk.tz.sf.pcc.sf(com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("pag_plb_config", "model", ""));
                        if (sf2 == null || !sf.pcc().equals(sf2.pcc())) {
                            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("pag_plb_config", "model", oo);
                            gm.this.pcc(sf, sf2, 1);
                        }
                    }
                } catch (Exception e) {
                    lo.gm("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(com.bytedance.sdk.openadsdk.tz.sf.pcc pccVar, com.bytedance.sdk.openadsdk.tz.sf.pcc pccVar2, int i) {
        List<pcc.C0206pcc> list = null;
        pcc(pccVar.sf(), pccVar2 == null ? null : pccVar2.sf(), 1, i);
        List<pcc.C0206pcc> gm = pccVar.gm();
        if (pccVar2 != null) {
            list = pccVar2.gm();
        }
        pcc(gm, list, 2, i);
    }

    private void pcc(List<pcc.C0206pcc> list, List<pcc.C0206pcc> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String vj = i == 1 ? vj() : wh();
        for (pcc.C0206pcc c0206pcc : list) {
            String pcc2 = c0206pcc.pcc();
            String pcc3 = dax.pcc(pcc2);
            if (!TextUtils.isEmpty(pcc3)) {
                if (i == 1) {
                    pcc3 = pcc3 + gm(pcc2);
                }
                String str = pcc3;
                File file = new File(vj, str);
                boolean exists = file.exists();
                if (i2 == 1) {
                    if (exists && list2 != null && list2.contains(c0206pcc)) {
                        new Object[]{"file exists, no need to download: tp= ", Integer.valueOf(i), ", url=", pcc2};
                        com.bytedance.sdk.openadsdk.core.jr.gm.pcc.gm(file);
                    }
                    pcc(pcc2, vj, str, i, file, exists);
                } else if (exists) {
                    new Object[]{"file exists, no need to download: tp= ", Integer.valueOf(i), ", url=", pcc2};
                } else {
                    pcc(pcc2, vj, str, i, file, exists);
                }
            }
        }
    }

    private void pcc(final String str, final String str2, final String str3, final int i, final File file, final boolean z) {
        String concat;
        if (this.vj.contains(str)) {
            new Object[]{"Downloading, no repeat downloading, url: ", str};
            return;
        }
        if (i == 2) {
            concat = str3 + ".zip";
        } else {
            concat = z ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.vj.add(str);
        com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
        oo.gm(str);
        oo.pcc(str2, concat);
        final com.bytedance.sdk.component.qf.sf vj = oo.vj();
        this.vj.remove(str);
        if (vj == null || !vj.wh() || vj.vj() == null || !vj.vj().exists()) {
            File file2 = new File(str2 + File.separator + str3 + ".tmp");
            if (file2.exists()) {
                try {
                    file2.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("downloadZip") { // from class: com.bytedance.sdk.openadsdk.tz.pcc.gm.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        ye.pcc(vj.vj().getAbsolutePath(), str4);
                        File file3 = new File(str4);
                        File pcc2 = com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc(file3);
                        if (pcc2 != null && pcc2.exists()) {
                            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().gm().put(file3.getName(), pcc2.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.jr.gm.pcc.sf(file3);
                    } catch (Throwable th) {
                        lo.gm("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i), ", url=", str);
                    }
                    try {
                        vj.vj().delete();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (z) {
            file.delete();
            vj.vj().renameTo(file);
        }
    }

    private static String gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(lastIndexOf + 1);
    }

    private String oo() {
        if (TextUtils.isEmpty(this.sf)) {
            try {
                File pcc2 = com.bytedance.sdk.component.utils.qf.pcc(lu.pcc(), lu.pcc().getCacheDir(), "playable");
                if (!pcc2.exists()) {
                    pcc2.mkdirs();
                }
                this.sf = pcc2.getAbsolutePath();
            } catch (Throwable th) {
                lo.gm("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.sf;
    }

    private String vj() {
        if (TextUtils.isEmpty(this.gm)) {
            String str = oo() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.gm = str;
        }
        return this.gm;
    }

    private String wh() {
        if (TextUtils.isEmpty(this.oo)) {
            String str = oo() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.oo = str;
        }
        return this.oo;
    }

    public WebResourceResponse pcc(String str) {
        if (!qf.pcc()) {
            return null;
        }
        String pcc2 = dax.pcc(str);
        if (TextUtils.isEmpty(pcc2)) {
            return null;
        }
        File file = new File(vj(), pcc2 + gm(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
