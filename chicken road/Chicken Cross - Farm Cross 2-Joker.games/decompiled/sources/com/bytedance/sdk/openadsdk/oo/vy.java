package com.bytedance.sdk.openadsdk.oo;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class vy {
    private final WebView kj;
    private long ork;
    private final of pcc;
    private int qf;
    private final boolean vj;
    private int wh;
    private String vy = "landingpage";
    private final Map<Integer, Long> sf = new HashMap();
    private final List<Integer> gm = new ArrayList();
    private final Map<Integer, String> oo = new HashMap();

    public vy(of ofVar, WebView webView, boolean z) {
        this.pcc = ofVar;
        this.kj = webView;
        this.vj = z;
    }

    public void pcc(String str, int i) {
        if (this.vj) {
            i++;
        }
        if (pcc(true)) {
            gm.pcc(this.pcc, this.vy, this.wh, str, i);
            this.oo.put(Integer.valueOf(this.wh), str);
            this.ork = SystemClock.elapsedRealtime();
        }
    }

    public void pcc(String str) {
        if (pcc(false)) {
            gm.pcc(this.pcc, this.vy, this.wh, str, SystemClock.elapsedRealtime() - this.ork);
        }
    }

    public void pcc(WebView webView, String str) {
        of ofVar = this.pcc;
        if (ofVar == null || !com.bytedance.sdk.component.vy.sf.pcc(ofVar.qy().gm(), str)) {
            return;
        }
        String str2 = this.oo.get(Integer.valueOf(this.wh));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        gm.pcc(this.pcc, this.vy, this.wh, str2, str, 2);
    }

    public void sf(String str) {
        String str2 = this.oo.get(Integer.valueOf(this.wh));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.wh;
        if (i > 0) {
            gm.pcc(this.pcc, this.vy, i, str3, str, 1);
        }
    }

    private boolean pcc(boolean z) {
        int i = z ? this.wh : this.qf;
        sf(z);
        int i2 = z ? this.wh : this.qf;
        return i2 > 0 && i2 != i;
    }

    private void sf(boolean z) {
        try {
            WebBackForwardList copyBackForwardList = this.kj.copyBackForwardList();
            if (copyBackForwardList != null) {
                if (z) {
                    int currentIndex = copyBackForwardList.getCurrentIndex();
                    this.wh = currentIndex + 1;
                    if (this.vj) {
                        this.wh = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = copyBackForwardList.getCurrentIndex();
                this.qf = currentIndex2 + 1;
                if (this.vj) {
                    this.qf = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            lo.gm("ArbitrageLandingLog", th.toString());
        }
    }

    public void gm(String str) {
        this.vy = str;
    }
}
