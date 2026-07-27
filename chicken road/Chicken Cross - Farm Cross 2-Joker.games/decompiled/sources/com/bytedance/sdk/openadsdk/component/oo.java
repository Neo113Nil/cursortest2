package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.bytedance.sdk.openadsdk.utils.zti;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class oo extends PAGAppOpenAd {
    private final AdSlot gm;
    private boolean kj;
    private com.bytedance.sdk.openadsdk.pcc.oo.sf oo;
    private final Context pcc;
    private final boolean qf;
    private final of sf;
    private boolean vy;
    private final AtomicBoolean vj = new AtomicBoolean(false);
    private final String wh = tsz.pcc();

    public oo(Context context, of ofVar, boolean z, AdSlot adSlot) {
        this.pcc = context;
        this.sf = ofVar;
        this.qf = z;
        this.gm = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.oo = new vj(pAGAppOpenAdInteractionListener, this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.oo = new vj(pAGAppOpenAdInteractionCallback, this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int i;
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.vj.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            of ofVar = this.sf;
            ork.pcc(ofVar, "show_ad_fail", ofVar.vj(), "not_called_on_main_thread");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.sf(this.pcc, this.sf);
        Context context = activity != null ? activity : this.pcc;
        if (context == null) {
            context = lu.pcc();
        }
        try {
            i = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            i = 0;
        }
        if (this.sf.lq()) {
            intent = new Intent(context, (Class<?>) TTAppOpenAdTransActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTAppOpenAdActivity.class);
        }
        intent.putExtra("orientation_angle", i);
        intent.putExtra(FirebaseAnalytics.Param.AD_SOURCE, this.qf ? 1 : 2);
        boolean ork = com.bytedance.sdk.openadsdk.yt.vj.ork();
        intent.putExtra("enable_new_arch", ork);
        atb.pcc().vj();
        intent.putExtra("meta_index", atb.pcc().pcc(this.sf));
        if (ork) {
            intent.putExtra("single_process_listener_key", this.wh);
            atb.pcc().pcc(this.wh, (String) this.oo);
        } else {
            atb.pcc().pcc(this.oo);
        }
        this.oo = null;
        of ofVar2 = this.sf;
        ork.pcc(ofVar2, "show_start", ofVar2.vj(), (String) null);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.gm;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.sf.gqd() != null) {
                cacheTime = this.sf.gqd().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, new sf.InterfaceC0131sf() { // from class: com.bytedance.sdk.openadsdk.component.oo.1
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc() {
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc(Throwable th) {
                ork.pcc(oo.this.sf, "show_ad_fail", oo.this.sf.vj(), "activity_start_fail");
            }
        });
        jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.oo.2
            @Override // java.lang.Runnable
            public void run() {
                if (oo.this.gm != null) {
                    try {
                        if (oo.this.sf == null || of.wh(oo.this.sf) || oo.this.sf.duh()) {
                            return;
                        }
                        wh.pcc(oo.this.pcc).pcc(Integer.parseInt(oo.this.gm.getCodeId()), oo.this.sf.qxv());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.kj) {
            return;
        }
        zti.pcc(this.sf, d);
        this.kj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.vy) {
            return;
        }
        zti.pcc(this.sf, d, str, str2);
        this.vy = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        of ofVar = this.sf;
        if (ofVar != null) {
            return ofVar.oa();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        of ofVar = this.sf;
        if (ofVar == null || ofVar.oa() == null) {
            return null;
        }
        try {
            return this.sf.oa().get(str);
        } catch (Throwable th) {
            lo.gm("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.sf != null && System.currentTimeMillis() / 1000 <= this.sf.wjv();
    }
}
