package com.bytedance.sdk.openadsdk.core.gbb;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    final Set<Pair<View, FriendlyObstructionPurpose>> pcc = new HashSet();
    private qf sf;

    private wh() {
        vj.pcc(lu.pcc());
    }

    private Handler vj() {
        return com.bytedance.sdk.component.utils.vy.sf();
    }

    public static wh pcc() {
        return new wh();
    }

    public void pcc(final WebView webView) {
        if (webView == null || this.sf != null) {
            return;
        }
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(webView);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.1
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(WebView webView) {
        try {
            if (this.sf == null) {
                this.sf = kj.pcc(webView);
            }
        } catch (Throwable th) {
            lo.gm("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put("message", th.getMessage());
            vj.pcc(hashMap);
        }
    }

    public void pcc(final View view, final of ofVar) {
        if (this.sf != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
        final Set<ork> sf = gto != null ? gto.sf() : null;
        if (view == null || sf == null) {
            return;
        }
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            pcc(view, sf, ofVar);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.3
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.pcc(view, (Set<ork>) sf, ofVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view, Set<ork> set, of ofVar) {
        try {
            if (this.sf == null) {
                this.sf = kj.pcc(view, set);
                if (ofVar.on()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, ofVar.vj(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            lo.gm("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put("message", th.getMessage());
            vj.pcc(hashMap);
        }
    }

    public void sf() {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            wh();
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.4
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.wh();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        if (this.sf != null) {
            try {
                pcc((View) null, (FriendlyObstructionPurpose) null);
                this.sf.sf();
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(final boolean z, final float f) {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(z, f);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.5
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(boolean z, float f) {
        if (this.sf != null) {
            try {
                pcc((View) null, (FriendlyObstructionPurpose) null);
                this.sf.pcc(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    public void gm() {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            qf();
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.6
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.qf();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qf() {
        qf qfVar = this.sf;
        if (qfVar != null) {
            try {
                qfVar.oo();
            } catch (Throwable unused) {
            }
        }
    }

    public void oo() {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            kj();
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.7
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.kj();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj() {
        qf qfVar = this.sf;
        if (qfVar != null) {
            try {
                qfVar.gm();
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(view, friendlyObstructionPurpose);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.8
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        qf qfVar = this.sf;
        try {
            if (qfVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.pcc.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                qfVar.pcc(view, friendlyObstructionPurpose);
            }
            if (this.pcc.size() > 0) {
                qfVar.pcc(this.pcc);
                this.pcc.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void pcc(final long j, final boolean z) {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(j, z);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.9
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(j, z);
                }
            });
        }
    }

    public void sf(long j, boolean z) {
        qf qfVar = this.sf;
        if (qfVar != null) {
            try {
                qfVar.pcc(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(final boolean z) {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(z);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.10
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(boolean z) {
        qf qfVar = this.sf;
        if (qfVar != null) {
            try {
                qfVar.pcc(z);
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(final int i) {
        if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
            sf(i);
        } else {
            vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.wh.2
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.sf(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        qf qfVar = this.sf;
        if (qfVar != null) {
            try {
                qfVar.sf(i);
            } catch (Throwable unused) {
            }
        }
    }
}
