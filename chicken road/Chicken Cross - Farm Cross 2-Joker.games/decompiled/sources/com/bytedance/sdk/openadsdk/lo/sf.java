package com.bytedance.sdk.openadsdk.lo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.qf.pcc;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.pcc.pcc.ork;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.qy;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.lo.pcc.gm;
import com.bytedance.sdk.openadsdk.lu.oo;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static volatile sf pcc;
    private gm gm;
    private final Map<String, JSONObject> oo = new HashMap();
    private final com.bytedance.sdk.component.qf.pcc sf;

    public int pcc() {
        try {
            return vj.pcc("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    public static sf sf() {
        if (pcc == null) {
            synchronized (sf.class) {
                if (pcc == null) {
                    pcc = new sf();
                }
            }
        }
        return pcc;
    }

    private sf() {
        long pcc2 = pcc();
        pcc.C0126pcc pcc3 = new pcc.C0126pcc().pcc(pcc2, TimeUnit.MILLISECONDS).sf(pcc2, TimeUnit.MILLISECONDS).gm(pcc2, TimeUnit.MILLISECONDS).pcc(new pcc());
        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            pcc3.pcc(new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.lo.sf.1
                @Override // com.bytedance.sdk.component.qf.pcc.sf
                public void pcc(oo ooVar) {
                    ooVar.pcc().gm();
                    ooVar.hashCode();
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(ooVar);
                }

                @Override // com.bytedance.sdk.component.qf.pcc.sf
                public void sf(oo ooVar) {
                    ooVar.pcc().gm();
                    ooVar.hashCode();
                    com.bytedance.sdk.openadsdk.lu.gm.sf(ooVar);
                }

                @Override // com.bytedance.sdk.component.qf.pcc.sf
                public void gm(oo ooVar) {
                    ooVar.pcc().gm();
                    ooVar.hashCode();
                    com.bytedance.sdk.openadsdk.lu.gm.gm(ooVar);
                }
            });
        }
        com.bytedance.sdk.component.qf.pcc pcc4 = pcc3.pcc(true).pcc();
        this.sf = pcc4;
        com.bytedance.sdk.component.sf.pcc.pcc.pcc.pcc.pcc(new ork() { // from class: com.bytedance.sdk.openadsdk.lo.sf.2
            @Override // com.bytedance.sdk.component.sf.pcc.pcc.pcc.ork
            public ExecutorService pcc() {
                if (vh.sf().qc()) {
                    return rnn.hc();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.sf.pcc.pcc.pcc.ork
            public boolean sf() {
                return vh.sf().qc();
            }
        });
        com.bytedance.sdk.component.qf.pcc.pcc(new com.bytedance.sdk.component.sf.pcc.pcc.pcc.vj() { // from class: com.bytedance.sdk.openadsdk.lo.sf.3
            @Override // com.bytedance.sdk.component.sf.pcc.pcc.pcc.vj
            public boolean pcc() {
                return vj.pcc("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.qf.pcc.pcc(new pcc.gm() { // from class: com.bytedance.sdk.openadsdk.lo.sf.4
            @Override // com.bytedance.sdk.component.qf.pcc.gm
            public boolean pcc() {
                return com.bytedance.sdk.openadsdk.utils.sf.gm();
            }

            @Override // com.bytedance.sdk.component.qf.pcc.gm
            public boolean sf() {
                return lu.kj(com.bytedance.sdk.openadsdk.core.lu.pcc());
            }

            @Override // com.bytedance.sdk.component.qf.pcc.gm
            public void pcc(final String str, final String str2, final String str3, final int i, final String str4, final boolean z, final int i2, final int i3) {
                try {
                    if (!TextUtils.isEmpty(str3) && str3.contains("/api/ad/union/sdk/stats/batch/")) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.dax.oo.pcc("net_call_fail", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.lo.sf.4.1
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            String str5;
                            String str6;
                            String str7;
                            Uri parse;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fail_url", str3);
                            String str8 = "";
                            try {
                                parse = Uri.parse(str3);
                                str5 = parse.getHost();
                            } catch (Throwable unused) {
                                str5 = "";
                            }
                            try {
                                str6 = parse.getPath();
                            } catch (Throwable unused2) {
                                str6 = "";
                                if (!TextUtils.isEmpty(str5)) {
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                }
                                jSONObject.put("error_code", i);
                                jSONObject.put("trace_id", str);
                                jSONObject.put("error_msg", str4);
                                jSONObject.put("is_retry_enabled", z);
                                if (z) {
                                }
                                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("net_call_fail").sf(jSONObject.toString());
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                jSONObject.put("error_domain", str5);
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                jSONObject.put("error_path", str6);
                            }
                            jSONObject.put("error_code", i);
                            jSONObject.put("trace_id", str);
                            jSONObject.put("error_msg", str4);
                            jSONObject.put("is_retry_enabled", z);
                            if (z) {
                                jSONObject.put("primary_url", str2);
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        Uri parse2 = Uri.parse(str2);
                                        str7 = parse2.getHost();
                                        try {
                                            str8 = parse2.getPath();
                                        } catch (Throwable unused3) {
                                        }
                                    } catch (Throwable unused4) {
                                        str7 = "";
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                        jSONObject.put("primary_domain", str7);
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                        jSONObject.put("primary_path", str8);
                                    }
                                }
                                jSONObject.put("attempt_index", i2);
                                jSONObject.put("total_attempts", i3);
                            }
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("net_call_fail").sf(jSONObject.toString());
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        });
        com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(com.bytedance.sdk.openadsdk.utils.sf.kj());
        com.bytedance.sdk.component.sf.pcc.oo sf = pcc4.kj().sf();
        if (sf != null) {
            sf.pcc(32);
        }
    }

    public class pcc implements kj {
        public pcc() {
        }

        @Override // com.bytedance.sdk.component.sf.pcc.kj
        public gbb pcc(kj.pcc pccVar) throws IOException {
            JSONObject pcc;
            tmg pcc2 = pccVar.pcc();
            if (pcc2.oo() != null && !pcc2.oo().oo().isEmpty()) {
                List<String> oo = pcc2.oo().oo();
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = oo.iterator();
                while (it.hasNext()) {
                    sb.append("/").append(it.next());
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    if (sb2.equals("/monitor/collect/c/session")) {
                        return pccVar.pcc(pcc2);
                    }
                    if (sb2.equals("/api/ad/union/sdk/register_status/") || sb2.equals("/api/ad/union/sdk/compliance_status/")) {
                        return pccVar.pcc(pcc2);
                    }
                }
            }
            tmg.pcc vh = pcc2.vh();
            String sf = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(sf) && (pcc = sf.this.pcc(sf)) != null) {
                vh.sf("transfer-param", pcc.optString("message"));
                if (pcc.optInt("cypher") == 4) {
                    vh.sf("cypher", "4");
                } else {
                    vh.sf("cypher", ExifInterface.GPS_MEASUREMENT_3D);
                }
            }
            try {
                vh.sf("x-pangle-target-idc", vh.sf().rc());
            } catch (Throwable unused) {
            }
            return pccVar.pcc(vh.sf());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pcc(String str) {
        JSONObject jSONObject = this.oo.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new qy(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.oo.put(str, encryptType4);
        return encryptType4;
    }

    public com.bytedance.sdk.component.qf.pcc gm() {
        return this.sf;
    }

    public gm oo() {
        vj();
        return this.gm;
    }

    public void pcc(String str, int i, int i2, ImageView imageView, of ofVar) {
        com.bytedance.sdk.openadsdk.ork.oo.pcc(str).pcc(i).sf(i2).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(ofVar, str, imageView));
    }

    public void pcc(int i, final ImageView imageView, final of ofVar) {
        if (ofVar == null || !TextUtils.isEmpty(ofVar.fum())) {
            com.bytedance.sdk.openadsdk.ork.oo.pcc(ofVar.fum()).pcc(i).sf(i).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(ofVar, ofVar.fum(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lo.sf.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String tz = ofVar.tz();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(tz));
                            try {
                                com.bytedance.sdk.component.utils.sf.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.lu luVar, ImageView imageView, of ofVar) {
        if (luVar == null || TextUtils.isEmpty(luVar.pcc()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(ofVar, luVar.pcc(), imageView));
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.lu luVar, ImageView imageView, of ofVar, dax daxVar) {
        if (luVar == null || TextUtils.isEmpty(luVar.pcc()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(ofVar, luVar.pcc(), imageView, daxVar));
    }

    public void pcc(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.ork.oo.pcc(str).gm(2).pcc(new com.bytedance.sdk.component.vj.kj() { // from class: com.bytedance.sdk.openadsdk.lo.sf.7
            @Override // com.bytedance.sdk.component.vj.kj
            public Bitmap pcc(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(view2.getContext(), bitmap, 10);
            }
        }).pcc(new dax() { // from class: com.bytedance.sdk.openadsdk.lo.sf.6
            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
                final View view2;
                if (vhVar == null) {
                    return;
                }
                final Object sf = vhVar.sf();
                if (!(sf instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (rnn.wh()) {
                    if (view2 instanceof ImageView) {
                        ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) sf));
                        return;
                    } else {
                        view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) sf));
                        return;
                    }
                }
                view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lo.sf.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View view3 = view2;
                        if (view3 instanceof ImageView) {
                            ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) sf));
                        } else {
                            view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) sf));
                        }
                    }
                });
            }
        });
    }

    private void vj() {
        if (this.gm == null) {
            this.gm = new gm();
        }
    }
}
