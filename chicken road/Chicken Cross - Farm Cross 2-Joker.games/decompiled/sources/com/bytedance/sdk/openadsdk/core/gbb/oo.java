package com.bytedance.sdk.openadsdk.core.gbb;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.gbb.sf.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.sf.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    private long dax;
    private String fum;
    private boolean gpj;
    private boolean jr;
    private boolean lo;
    private boolean lu;
    private of nac;
    private String tz;
    private final AtomicBoolean hc = new AtomicBoolean(false);
    private final AtomicBoolean gbb = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> sf = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> gm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> oo = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> vj = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> wh = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> qf = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> kj = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> vy = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> ork = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.sf> vh = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.pcc> tmg = new ArrayList();

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar) {
        if (!pcc(-1L, this.pcc, pccVar, this.jr ? null : new gm.sf("error", this.nac, 0.0f)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_error", (JSONObject) null);
    }

    public void pcc(long j) {
        if (this.hc.compareAndSet(false, true)) {
            if (!pcc(j, this.sf, null, new gm.sf(this.jr ? "show_impression" : "impression", this.nac)) || this.jr) {
                return;
            }
            com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_impression", (JSONObject) null);
        }
    }

    public void sf(long j) {
        if (!pcc(j, this.gm, null, this.jr ? null : new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.nac, j)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_pause", (JSONObject) null);
    }

    public void gm(long j) {
        if (!pcc(j, this.oo, null, this.jr ? null : new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.nac, j)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_resume", (JSONObject) null);
    }

    public void oo(long j) {
        if (!pcc(j, this.vj, null, new gm.sf(this.jr ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.nac, 1.0f)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_complete", (JSONObject) null);
    }

    public void vj(long j) {
        if (this.gbb.compareAndSet(false, true)) {
            pcc(j, this.wh, (com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc) null);
        }
    }

    public void wh(long j) {
        if (!pcc(j, this.qf, null, this.jr ? null : new gm.sf("skip", this.nac)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_skip", (JSONObject) null);
    }

    public void qf(long j) {
        if (!pcc(j, this.kj, null, new gm.sf(this.jr ? "click" : "clickTracking", this.nac)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_video_click", (JSONObject) null);
    }

    public void kj(long j) {
        if (!pcc(j, this.vy, null, this.jr ? null : new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.nac, j)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_mute", (JSONObject) null);
    }

    public void vy(long j) {
        if (!pcc(j, this.ork, null, this.jr ? null : new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.nac, j)) || this.jr) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_unmute", (JSONObject) null);
    }

    public void pcc(long j, long j2, wh whVar) {
        gm.sf sfVar;
        if (System.currentTimeMillis() - this.dax >= 1000 && j >= 0 && j2 > 0) {
            this.dax = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc = pcc(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.lu) {
                pcc("firstQuartile");
                this.lu = true;
                if (whVar != null) {
                    pcc(whVar, 6);
                }
                if (!this.jr) {
                    sfVar = new gm.sf("firstQuartile", this.nac, 0.25f);
                    f = f2;
                }
                f = f2;
                sfVar = null;
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.gpj) {
                    pcc(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.gpj = true;
                    if (whVar != null) {
                        pcc(whVar, 7);
                    }
                    if (!this.jr) {
                        sfVar = new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.nac, 0.5f);
                        f = f2;
                    }
                    f = f2;
                    sfVar = null;
                } else {
                    f2 = 0.75f;
                    if (f >= 0.75f && !this.lo) {
                        pcc("thirdQuartile");
                        this.lo = true;
                        if (whVar != null) {
                            pcc(whVar, 8);
                        }
                        if (!this.jr) {
                            sfVar = new gm.sf("thirdQuartile", this.nac, 0.75f);
                            f = f2;
                        }
                        f = f2;
                    }
                    sfVar = null;
                }
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            if (!this.jr && !pcc.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.gbb.sf.gm gmVar = pcc.get(0);
                if ((gmVar instanceof com.bytedance.sdk.openadsdk.core.gbb.sf.pcc) && ((com.bytedance.sdk.openadsdk.core.gbb.sf.pcc) gmVar).pcc() == 0) {
                    com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_start", (JSONObject) null);
                    sfVar = new gm.sf("start", this.nac, f);
                }
            }
            if (pcc.isEmpty()) {
                return;
            }
            pcc(j, pcc, null, sfVar != null ? sfVar : new gm.sf("video_progress", this.nac, f));
        }
    }

    public void pcc(int i, long j, long j2) {
        if (System.currentTimeMillis() - this.dax < 1000) {
            return;
        }
        this.dax = System.currentTimeMillis();
        float f = j / j2;
        List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc = pcc(j, f);
        gm.sf sfVar = null;
        if (i != 6) {
            if (i == 7) {
                pcc(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                this.gpj = true;
                f = 0.5f;
                if (!this.jr) {
                    sfVar = new gm.sf(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.nac, 0.5f);
                }
            } else if (i == 8) {
                pcc("thirdQuartile");
                this.lo = true;
                f = 0.75f;
                if (!this.jr) {
                    sfVar = new gm.sf("thirdQuartile", this.nac, 0.75f);
                }
            } else if (i == 15 && (pcc.get(0) instanceof com.bytedance.sdk.openadsdk.core.gbb.sf.pcc)) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_start", (JSONObject) null);
                sfVar = new gm.sf("start", this.nac, f);
            }
        } else if (!this.lu) {
            pcc("firstQuartile");
            this.lu = true;
            f = 0.25f;
            if (!this.jr) {
                sfVar = new gm.sf("firstQuartile", this.nac, 0.25f);
            }
        }
        if (pcc.isEmpty()) {
            return;
        }
        pcc(j, pcc, null, sfVar != null ? sfVar : new gm.sf("video_progress", this.nac, f));
    }

    private void pcc(final wh whVar, final int i) {
        com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbb.oo.1
            @Override // java.lang.Runnable
            public void run() {
                wh whVar2 = whVar;
                if (whVar2 != null) {
                    whVar2.pcc(i);
                }
            }
        });
    }

    private void pcc(String str) {
        try {
            if (this.jr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.nac, this.fum, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean pcc(long j, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar, gm.sf sfVar) {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez;
        of ofVar = this.nac;
        String str = null;
        if (ofVar != null && (kez = ofVar.kez()) != null) {
            str = kez.vh();
        }
        return com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(this.nac, list, pccVar, j, str, sfVar, pcc());
    }

    private String pcc() {
        if (this.tz == null) {
            this.tz = UUID.randomUUID().toString();
        }
        return this.tz;
    }

    private boolean pcc(long j, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar) {
        return pcc(j, list, pccVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> pcc(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.vh.size(); i++) {
            com.bytedance.sdk.openadsdk.core.gbb.sf.sf sfVar = this.vh.get(i);
            if (sfVar.pcc(f)) {
                arrayList.add(sfVar);
            }
        }
        for (int i2 = 0; i2 < this.tmg.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.gbb.sf.pcc pccVar = this.tmg.get(i2);
            if (pccVar.pcc(j)) {
                arrayList.add(pccVar);
            }
        }
        return arrayList;
    }

    public void pcc(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.sf.addAll(list);
    }

    public void sf(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.gm.addAll(list);
    }

    public void gm(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.oo.addAll(list);
    }

    public void oo(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.vj.addAll(list);
    }

    public void vj(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.wh.addAll(list);
    }

    public void wh(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.qf.addAll(list);
    }

    public void qf(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.kj.addAll(list);
    }

    public void kj(List<com.bytedance.sdk.openadsdk.core.gbb.sf.sf> list) {
        this.vh.addAll(list);
        Collections.sort(this.vh);
    }

    public void vy(List<com.bytedance.sdk.openadsdk.core.gbb.sf.pcc> list) {
        this.tmg.addAll(list);
        Collections.sort(this.tmg);
    }

    public void ork(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.pcc.addAll(list);
    }

    public void vh(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.vy.addAll(list);
    }

    public void tmg(List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list) {
        this.ork.addAll(list);
    }

    public void pcc(JSONObject jSONObject) {
        ork(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("errorTrackers")));
        pcc(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("impressionTrackers")));
        sf(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("pauseTrackers"), true));
        gm(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("resumeTrackers"), true));
        oo(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("completeTrackers")));
        vj(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("closeTrackers")));
        wh(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("skipTrackers")));
        qf(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("clickTrackers")));
        vh(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("muteTrackers"), true));
        tmg(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(jSONObject.optJSONArray("unMuteTrackers"), true));
        kj(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.sf(jSONObject.optJSONArray("fractionalTrackers")));
        vy(com.bytedance.sdk.openadsdk.core.gbb.sf.gm.gm(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void pcc(of ofVar) {
        this.nac = ofVar;
        this.fum = ofVar.vj();
        this.jr = ofVar.on();
    }

    public void pcc(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        vy(Collections.singletonList(new pcc.C0149pcc(str, j).pcc()));
    }

    public void pcc(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        kj(Collections.singletonList(new sf.pcc(str, f).pcc()));
    }

    public void pcc(oo ooVar) {
        ork(ooVar.pcc);
        pcc(ooVar.sf);
        sf(ooVar.gm);
        gm(ooVar.oo);
        oo(ooVar.vj);
        vj(ooVar.wh);
        wh(ooVar.qf);
        qf(ooVar.kj);
        vh(ooVar.vy);
        tmg(ooVar.ork);
        kj(ooVar.vh);
        vy(ooVar.tmg);
    }
}
