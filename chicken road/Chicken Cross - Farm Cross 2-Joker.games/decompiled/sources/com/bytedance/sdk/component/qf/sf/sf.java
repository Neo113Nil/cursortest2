package com.bytedance.sdk.component.qf.sf;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.pcc;
import com.bytedance.sdk.component.sf.pcc.qf;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.wh;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class sf extends gm {
    public static final com.bytedance.sdk.component.sf.pcc.pcc pcc = new pcc.C0127pcc().pcc().sf();
    public static final com.bytedance.sdk.component.sf.pcc.pcc sf = new pcc.C0127pcc().sf();
    private Map<String, String> hc;
    private boolean tmg;
    private com.bytedance.sdk.component.sf.pcc.pcc vh;

    public sf(vh vhVar) {
        super(vhVar);
        this.vh = pcc;
        this.tmg = false;
        this.hc = new HashMap();
    }

    public void pcc(boolean z) {
        this.tmg = z;
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void pcc(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        try {
            tmg.pcc pccVar2 = new tmg.pcc();
            if (this.tmg) {
                pccVar2.sf(this.kj);
            } else {
                qf.pcc pccVar3 = new qf.pcc();
                Uri parse = Uri.parse(this.kj);
                pccVar3.pcc(parse.getScheme());
                pccVar3.sf(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    pccVar3.gm(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.hc.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.hc.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        pccVar3.pcc(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                pccVar2.pcc(pccVar3.sf());
            }
            sf(pccVar2);
            pcc(pccVar2);
            pccVar2.pcc(this.vh);
            pccVar2.pcc((Object) oo());
            if (!TextUtils.isEmpty(this.vj)) {
                pccVar2.pcc(this.vj);
            }
            if (this.wh > 0) {
                pccVar2.pcc(this.wh);
            }
            this.gm.pcc(pccVar2.pcc().sf()).pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bytedance.sdk.component.qf.sf.sf.1
                @Override // com.bytedance.sdk.component.sf.pcc.gm
                public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
                    com.bytedance.sdk.component.qf.pcc.pcc pccVar4 = pccVar;
                    if (pccVar4 != null) {
                        pccVar4.pcc(sf.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.sf.pcc.gm
                public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
                    String sf2;
                    if (pccVar != null) {
                        HashMap hashMap = new HashMap();
                        if (gbbVar != null) {
                            sf.this.pcc(gbbVar.vy());
                            wh qf = gbbVar.qf();
                            if (qf != null) {
                                for (int i = 0; i < qf.pcc(); i++) {
                                    hashMap.put(qf.pcc(i), qf.sf(i));
                                }
                            }
                            jr wh = gbbVar.wh();
                            if (wh == null) {
                                sf2 = "";
                            } else {
                                sf2 = wh.sf();
                            }
                            pccVar.pcc(sf.this, new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, sf2, gbbVar.sf(), gbbVar.pcc()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (pccVar != null) {
                pccVar.pcc(this, new IOException(th.getMessage()));
            }
        }
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public com.bytedance.sdk.component.qf.sf pcc() {
        try {
            tmg.pcc pccVar = new tmg.pcc();
            String str = "";
            if (this.tmg) {
                pccVar.sf(this.kj);
            } else {
                qf.pcc pccVar2 = new qf.pcc();
                Uri parse = Uri.parse(this.kj);
                pccVar2.pcc(parse.getScheme());
                pccVar2.sf(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    pccVar2.gm(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str2 : queryParameterNames) {
                        this.hc.put(str2, parse.getQueryParameter(str2));
                    }
                }
                for (Map.Entry<String, String> entry : this.hc.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        pccVar2.pcc(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                pccVar.pcc(pccVar2.sf());
            }
            sf(pccVar);
            pcc(pccVar);
            pccVar.pcc(this.vh);
            pccVar.pcc((Object) oo());
            gbb sf2 = this.gm.pcc(pccVar.pcc().sf()).sf();
            if (sf2 == null) {
                return null;
            }
            pcc(sf2.vy());
            HashMap hashMap = new HashMap();
            wh qf = sf2.qf();
            if (qf != null) {
                for (int i = 0; i < qf.pcc(); i++) {
                    hashMap.put(qf.pcc(i), qf.sf(i));
                }
            }
            jr wh = sf2.wh();
            if (wh != null) {
                str = wh.sf();
            }
            return new com.bytedance.sdk.component.qf.sf(sf2.oo(), sf2.gm(), sf2.vj(), hashMap, str, sf2.sf(), sf2.pcc());
        } catch (Throwable unused) {
            return null;
        }
    }
}
