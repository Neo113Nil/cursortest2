package com.bytedance.sdk.openadsdk.core.jr.gm;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.utils.vj;
import com.bytedance.sdk.component.utils.ye;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.tz.pcc.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.C4761z5;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile pcc pcc;
    private String sf;
    private final Map<of, sf> gm = new ConcurrentHashMap();
    private final Map<String, JSONObject> oo = new ConcurrentHashMap();
    private final AtomicBoolean vj = new AtomicBoolean(false);
    private final Set<String> wh = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.qf.sf.pcc> qf = new ConcurrentHashMap<>();
    private final Map<String, String> kj = new ConcurrentHashMap();

    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.gm.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0161pcc {
        void pcc(boolean z);
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc();
                }
            }
        }
        return pcc;
    }

    private pcc() {
    }

    public boolean pcc(of ofVar) {
        if (this.vj.get() && ofVar != null && ofVar.kez() != null && ofVar.kez().hc() != null) {
            try {
                if (!TextUtils.isEmpty(this.kj.get(vj.pcc(ofVar.kez().hc())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void sf() {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || this.vj.get()) {
            return;
        }
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String oo = pcc.this.oo();
                    if (!TextUtils.isEmpty(oo)) {
                        File file = new File(oo);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File pcc2 = pcc.pcc(file2);
                                        if (pcc2 != null && pcc2.exists()) {
                                            pcc.this.kj.put(file2.getName(), pcc2.getAbsolutePath());
                                        }
                                        pcc.this.pcc(pcc.this.oo(pcc2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.tz.pcc.gm.pcc().pcc(pcc.this.kj);
                pcc.this.vj.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pcc(File file, boolean z) {
        byte[] oo;
        String sf2;
        try {
            if (!vj(file) || (oo = qf.oo(file)) == null || oo.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                sf2 = com.bytedance.sdk.component.utils.pcc.gm(new String(oo));
            } else {
                sf2 = com.bytedance.sdk.component.oo.pcc.sf(new String(oo), com.bytedance.sdk.openadsdk.core.pcc.sf());
            }
            if (TextUtils.isEmpty(sf2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(sf2);
            if (z && jSONObject.length() > 0) {
                this.oo.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File oo(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return vj(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean vj(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public WebResourceResponse pcc(String str, String str2, String str3) {
        WebResourceResponse pcc2;
        String str4;
        File pcc3;
        try {
            pcc2 = com.bytedance.sdk.openadsdk.tz.pcc.gm.pcc().pcc(str3);
        } catch (Throwable th) {
            lo.pcc("PlayableCache", "playable intercept error: ", th);
        }
        if (pcc2 != null) {
            return pcc2;
        }
        if (this.vj.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith(UrlConst.HTTPS)) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                str4 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String pcc4 = vj.pcc(str);
            if (TextUtils.isEmpty(pcc4)) {
                return null;
            }
            String str5 = this.kj.get(pcc4);
            if (!TextUtils.isEmpty(str5)) {
                pcc3 = new File(str5);
            } else {
                pcc3 = pcc(new File(oo(), pcc4));
                if (pcc3 != null && pcc3.exists()) {
                    this.kj.put(pcc4, pcc3.getAbsolutePath());
                }
            }
            if (pcc3 != null && pcc3.exists()) {
                String pcc5 = pcc(str2);
                if (TextUtils.isEmpty(pcc5)) {
                    return null;
                }
                String replace = str3.replace(pcc5, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith(UrlConst.HTTPS) && !replace.startsWith("http://")) {
                    File file = new File(pcc3, replace);
                    if (file.exists() && pcc(pcc4, replace, file) && file.getCanonicalPath().startsWith(pcc3.getCanonicalPath())) {
                        return new WebResourceResponse(str4, C4761z5.O, new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File pcc(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return pcc(file3);
                }
            }
        }
        return null;
    }

    private String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            String str2 = split[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            String str3 = split[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean pcc(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.oo.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(vj.pcc(file))) {
                return true;
            }
        }
        return false;
    }

    public void pcc(final of ofVar, final InterfaceC0161pcc interfaceC0161pcc) {
        File file;
        if (oo.pcc().sf() && ofVar != null && atb.wh(ofVar) && ofVar.gqd() != null && !TextUtils.isEmpty(ofVar.gqd().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -705, "server bidding pre render");
            pcc(interfaceC0161pcc, false);
            return;
        }
        if (ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().hc())) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -701, (String) null);
            pcc(interfaceC0161pcc, false);
            return;
        }
        final String hc = ofVar.kez().hc();
        if (this.wh.contains(hc)) {
            return;
        }
        this.gm.put(ofVar, new sf().pcc(System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar);
        String pcc2 = vj.pcc(hc);
        final File file2 = new File(oo(), pcc2);
        String str = this.kj.get(pcc2);
        if (TextUtils.isEmpty(str)) {
            file = pcc(file2);
            if (file != null && file.exists()) {
                this.kj.put(pcc2, file.getAbsolutePath());
            }
        } else {
            file = new File(str);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -702, (String) null);
            gm(file2);
            this.gm.remove(ofVar);
            pcc(interfaceC0161pcc, true);
            return;
        }
        try {
            qf.gm(file2);
        } catch (Throwable unused) {
        }
        this.wh.add(hc);
        File file3 = new File(vj(), pcc2 + ".zip");
        com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
        this.qf.put(hc, oo);
        oo.gm(hc);
        oo.pcc(file3.getParent(), file3.getName());
        oo.pcc(7);
        oo.sf("playable_download");
        oo.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.2
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, final com.bytedance.sdk.component.qf.sf sfVar) {
                pcc.this.wh.remove(hc);
                pcc.this.qf.remove(hc);
                final sf sfVar2 = (sf) pcc.this.gm.remove(ofVar);
                if (sfVar2 != null) {
                    sfVar2.sf(System.currentTimeMillis());
                }
                if (sfVar.wh() && sfVar.vj() != null && sfVar.vj().exists()) {
                    rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long j;
                            long j2;
                            try {
                                sf sfVar3 = sfVar2;
                                if (sfVar3 != null) {
                                    sfVar3.gm(System.currentTimeMillis());
                                }
                                ye.pcc(sfVar.vj().getAbsolutePath(), file2.getAbsolutePath());
                                sf sfVar4 = sfVar2;
                                if (sfVar4 != null) {
                                    sfVar4.oo(System.currentTimeMillis());
                                }
                                sf sfVar5 = sfVar2;
                                if (sfVar5 != null) {
                                    j = sfVar5.pcc();
                                    j2 = sfVar2.sf();
                                } else {
                                    j = 0;
                                    j2 = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, j, j2);
                                pcc.sf(file2);
                                z = true;
                                try {
                                    File pcc3 = pcc.pcc(file2);
                                    if (pcc3 != null && pcc3.exists()) {
                                        pcc.this.kj.put(file2.getName(), pcc3.getAbsolutePath());
                                    }
                                    pcc.this.pcc(pcc.this.oo(pcc3), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                lo.pcc("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                sfVar.vj().delete();
                            } catch (Throwable unused3) {
                            }
                            pcc.this.pcc(interfaceC0161pcc, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, sfVar.pcc() != 0 ? sfVar.pcc() : -700, (String) null);
                    pcc.this.pcc(interfaceC0161pcc, false);
                }
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                pcc.this.wh.remove(hc);
                pcc.this.qf.remove(hc);
                pcc.this.gm.remove(ofVar);
                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -700, iOException.getMessage());
                pcc.this.pcc(interfaceC0161pcc, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final InterfaceC0161pcc interfaceC0161pcc, final boolean z) {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0161pcc interfaceC0161pcc2 = interfaceC0161pcc;
                if (interfaceC0161pcc2 != null) {
                    interfaceC0161pcc2.pcc(z);
                }
            }
        });
    }

    public static void sf(File file) {
        gm(file);
        try {
            ork.sf().hc().pcc(file);
        } catch (Throwable unused) {
        }
    }

    public static void gm(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String oo() {
        File file = new File(vj(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String vj() {
        if (TextUtils.isEmpty(this.sf)) {
            try {
                File pcc2 = qf.pcc(lu.pcc(), lu.pcc().getCacheDir(), "playable");
                if (!pcc2.exists()) {
                    pcc2.mkdirs();
                }
                this.sf = pcc2.getAbsolutePath();
            } catch (Throwable th) {
                lo.gm("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.sf;
    }

    private static class sf {
        long gm;
        long oo;
        long pcc;
        long sf;

        private sf() {
        }

        public long pcc() {
            return this.sf - this.pcc;
        }

        public long sf() {
            return this.oo - this.gm;
        }

        public sf pcc(long j) {
            this.pcc = j;
            return this;
        }

        public sf sf(long j) {
            this.sf = j;
            return this;
        }

        public sf gm(long j) {
            this.gm = j;
            return this;
        }

        public sf oo(long j) {
            this.oo = j;
            return this;
        }
    }

    public void sf(of ofVar) {
        if (ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().hc()) || !com.bytedance.sdk.openadsdk.yt.vj.pcc("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.qf.sf.pcc pccVar = this.qf.get(ofVar.kez().hc());
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    public Map<String, String> gm() {
        return this.kj;
    }
}
