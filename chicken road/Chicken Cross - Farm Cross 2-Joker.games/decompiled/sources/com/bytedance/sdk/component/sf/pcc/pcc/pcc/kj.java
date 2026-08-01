package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class kj extends gbb {
    public static int pcc = -1;
    public static int sf = -2;
    HttpURLConnection gm;
    tmg oo;
    String qf;
    final int vj;
    String wh;

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public long pcc() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public long sf() {
        return 0L;
    }

    public void pcc(String str) {
        this.qf = str;
    }

    public kj(HttpURLConnection httpURLConnection, tmg tmgVar, int i) {
        this.gm = httpURLConnection;
        this.oo = tmgVar;
        this.vj = i;
    }

    public kj(int i, String str, tmg tmgVar) {
        this.wh = str;
        this.oo = tmgVar;
        this.vj = i;
    }

    public kj(int i, String str, tmg tmgVar, String str2) {
        this.wh = str;
        this.oo = tmgVar;
        this.vj = i;
        this.qf = str2;
    }

    public tmg vh() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public int gm() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public boolean oo() {
        int i = this.vj;
        return i >= 200 && i < 300;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public String vj() throws IOException {
        if (!TextUtils.isEmpty(this.wh)) {
            return this.wh;
        }
        return this.gm.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public jr wh() {
        vy vyVar;
        tmg tmgVar = this.oo;
        if (tmgVar != null && tmgVar.sf != null) {
            this.oo.sf.vh();
        }
        try {
            try {
                vyVar = new vy(this.gm);
            } catch (Throwable th) {
                th.getMessage();
                vyVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.gm;
            vyVar = new vy(httpURLConnection, httpURLConnection.getErrorStream());
        }
        tmg tmgVar2 = this.oo;
        if (tmgVar2 != null && tmgVar2.sf != null) {
            this.oo.sf.hc();
        }
        return vyVar;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public com.bytedance.sdk.component.sf.pcc.wh qf() {
        if (this.gm == null) {
            return new com.bytedance.sdk.component.sf.pcc.wh(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.gm.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || gm() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.sf.pcc.wh((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            wh().close();
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public com.bytedance.sdk.component.sf.pcc.ork kj() {
        if (vh() == null || vh().sf == null) {
            return null;
        }
        return new com.bytedance.sdk.component.sf.pcc.ork(vh().sf);
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public String vy() {
        return this.qf;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gbb
    public Map<String, List<String>> ork() {
        HttpURLConnection httpURLConnection = this.gm;
        if (httpURLConnection == null) {
            return new HashMap();
        }
        return httpURLConnection.getHeaderFields();
    }
}
