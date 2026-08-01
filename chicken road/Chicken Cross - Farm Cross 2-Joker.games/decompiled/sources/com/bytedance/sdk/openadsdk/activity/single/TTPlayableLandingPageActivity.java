package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.kun;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.ork;
import com.bytedance.sdk.openadsdk.core.ye;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.tz.qf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements tsz.pcc, com.bytedance.sdk.openadsdk.core.gm.oo, com.bytedance.sdk.openadsdk.core.jr.oo.sf {
    private static final qf.pcc lrr = new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };
    private String atb;
    private String dax;
    private String fum;
    private ork gbb;
    private int gpj;
    private Context hc;
    private String jr;
    private boolean jsj;
    private com.bytedance.sdk.openadsdk.oo.oo.vj kun;
    private String lo;
    private mu lu;
    private mu nac;
    private com.bytedance.sdk.openadsdk.tz.kj nn;
    private of of;
    private com.bytedance.sdk.openadsdk.core.wh.oo ork;
    ye pcc;
    private boolean qy;
    private com.bytedance.sdk.openadsdk.tz.pcc.pcc ri;
    private hc rj;
    private ILoader rnn;
    TTAdDislikeToast sf;
    private com.bytedance.sdk.openadsdk.core.wh.oo tmg;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm tsz;
    private com.bytedance.sdk.openadsdk.core.wh.oo vh;
    private com.bytedance.sdk.component.vy.qf wh;
    private boolean xb;
    private boolean qf = true;
    private boolean kj = false;
    private boolean vy = true;
    final AtomicBoolean gm = new AtomicBoolean(false);
    private final String tz = "embeded_ad";
    private final tsz yt = new tsz(Looper.getMainLooper(), this);
    private final AtomicBoolean mk = new AtomicBoolean(false);
    private final AtomicInteger ye = new AtomicInteger(0);
    private final AtomicInteger lq = new AtomicInteger(0);
    private final AtomicInteger zti = new AtomicInteger(0);
    private boolean tsx = false;
    int oo = -1;
    protected com.bytedance.sdk.openadsdk.hc.vj vj = new com.bytedance.sdk.openadsdk.hc.vj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.hc.vj
        public void pcc() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && atb.hc(TTPlayableLandingPageActivity.this.of) && atb.gbb(TTPlayableLandingPageActivity.this.of)) {
                TTPlayableLandingPageActivity.this.yt.removeMessages(2);
                TTPlayableLandingPageActivity.this.yt.sendMessage(TTPlayableLandingPageActivity.this.pcc(1, 0));
            }
        }
    };
    private int iv = 1;

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public View dax() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void hoh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void jr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void kz() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean oo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ork() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public List<of> ptr() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message pcc(int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        if (i == 3) {
            obtain.arg2 = i2;
        }
        return obtain;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jr.vj()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            lu.sf(this);
            gm();
        } catch (Throwable unused) {
        }
        sf(bundle);
        of ofVar = this.of;
        if (ofVar == null) {
            return;
        }
        this.xb = ofVar.yir();
        int jr = atb.jr(this.of);
        if (jr == 0) {
            setRequestedOrientation(14);
        } else if (jr == 1) {
            setRequestedOrientation(1);
        } else if (jr == 2) {
            setRequestedOrientation(0);
            this.iv = 2;
        }
        this.hc = this;
        try {
            setContentView(wh());
            vy();
            qf();
            fum();
            this.ri.pcc(this);
            this.ri.pcc(false, (com.bytedance.sdk.openadsdk.hc.qf) null);
            kj();
            gm.pcc.pcc(SystemClock.elapsedRealtime() - elapsedRealtime, this.of, "embeded_ad", this.rnn, this.atb);
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.ri;
            if (pccVar != null) {
                pccVar.pcc();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View wh() {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        gmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.ri = new com.bytedance.sdk.openadsdk.tz.pcc.pcc(this.hc, this.of, this.iv, this.tsx, gmVar, true);
        int sf = rj.sf(this, 5.0f);
        this.tmg = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rj.sf(this, 28.0f), rj.sf(this, 28.0f));
        layoutParams.rightMargin = rj.sf(this, 56.0f);
        layoutParams.topMargin = rj.sf(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.tmg.setLayoutParams(layoutParams);
        this.tmg.setPadding(sf, sf, sf, sf);
        this.tmg.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        this.tmg.setScaleType(ImageView.ScaleType.CENTER);
        this.tmg.setImageDrawable(vh.pcc(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
        this.vh = ooVar;
        ooVar.setPadding(sf, sf, sf, sf);
        this.vh.setScaleType(ImageView.ScaleType.CENTER);
        this.vh.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        this.vh.setImageResource(tz.oo(lu.pcc(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(rj.sf(this, 28.0f), rj.sf(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = rj.sf(this, 16.0f);
        layoutParams2.topMargin = rj.sf(this, 20.0f);
        this.vh.setLayoutParams(layoutParams2);
        this.ork = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rj.sf(this, 28.0f), rj.sf(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = rj.sf(this, 20.0f);
        layoutParams3.leftMargin = rj.sf(this, 16.0f);
        this.ork.setLayoutParams(layoutParams3);
        this.ork.setPadding(sf, sf, sf, sf);
        this.ork.setScaleType(ImageView.ScaleType.FIT_XY);
        this.ork.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        this.ork.setImageDrawable(tz.gm(this, "tt_white_lefterbackicon_titlebar"));
        this.ork.setVisibility(0);
        gmVar.addView(this.tmg);
        gmVar.addView(this.vh);
        gmVar.addView(this.ork);
        return gmVar;
    }

    private void qf() {
        if (this.of.az() == 4) {
            this.tsz = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.hc, "interaction");
        }
    }

    private void kj() {
        int i = lu.oo().tsz(String.valueOf(this.of.kot())).nac;
        if (i >= 0) {
            this.yt.sendEmptyMessageDelayed(1, i * 1000);
        } else {
            rj.pcc((View) this.ork, 0);
        }
    }

    private void sf(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            of pcc = com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(com.bytedance.sdk.openadsdk.core.atb.pcc(intent));
            this.of = pcc;
            if (pcc != null) {
                this.lo = pcc.vh();
                this.gpj = this.of.hc();
                this.qy = this.of.jr();
                this.jr = this.of.esn();
                this.dax = this.of.hl();
                this.atb = this.of.cz();
                this.fum = this.of.gmh();
            }
        }
        if (bundle != null) {
            try {
                of pcc2 = com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(bundle.getInt("meta_index", -1));
                this.of = pcc2;
                if (pcc2 != null) {
                    this.jr = pcc2.esn();
                    this.dax = this.of.hl();
                    this.atb = this.of.cz();
                    this.fum = this.of.gmh();
                    this.lo = this.of.vh();
                    this.gpj = this.of.hc();
                    this.qy = this.of.jr();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.of == null) {
            finish();
            return;
        }
        try {
            this.tsx = lu.oo().lu(this.of.gqd().getCodeId());
        } catch (Throwable th) {
            lo.gm("TTPWPActivity", th.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc = this.of != null ? com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(this.of) : -1;
            this.oo = pcc;
            bundle.putInt("meta_index", pcc);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void vy() {
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.ork;
        if (ooVar != null) {
            ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.kun != null) {
                        TTPlayableLandingPageActivity.this.kun.qf();
                    }
                    TTPlayableLandingPageActivity.this.yt.sendMessage(TTPlayableLandingPageActivity.this.pcc(4, 0));
                    TTPlayableLandingPageActivity.this.pcc("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = this.vh;
        if (ooVar2 != null) {
            ooVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.pcc();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar3 = this.tmg;
        if (ooVar3 != null) {
            ooVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.tsx = !r2.tsx;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.wh(tTPlayableLandingPageActivity.tsx);
                    if (TTPlayableLandingPageActivity.this.nn != null) {
                        TTPlayableLandingPageActivity.this.nn.pcc(TTPlayableLandingPageActivity.this.tsx);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), this.of, "embeded_ad", str);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.oo >= 0) {
            com.bytedance.sdk.openadsdk.core.atb.pcc().gm(this.oo);
            this.oo = -1;
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.kun;
        if (vjVar != null) {
            vjVar.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        mu muVar = this.nac;
        if (muVar != null) {
            muVar.vh();
            com.bytedance.sdk.component.vy.qf qfVar = this.wh;
            if (qfVar != null) {
                this.nac.sf(qfVar.getVisibility() == 0);
            }
        }
        mu muVar2 = this.lu;
        if (muVar2 != null) {
            muVar2.vh();
        }
        com.bytedance.sdk.openadsdk.tz.kj kjVar = this.nn;
        if (kjVar != null) {
            kjVar.gm(true);
        }
        hc hcVar = this.rj;
        if (hcVar != null) {
            hcVar.qf();
        }
        if (DeviceUtils.qf() == 0) {
            this.tsx = true;
        }
        wh(this.tsx);
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.ri;
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        mu muVar = this.nac;
        if (muVar != null) {
            muVar.sf(false);
        }
        com.bytedance.sdk.openadsdk.tz.kj kjVar = this.nn;
        if (kjVar != null) {
            kjVar.pcc(true);
            this.nn.gm(false);
        }
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.ri;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.kun;
        if (vjVar != null) {
            vjVar.kj();
        }
        hc hcVar = this.rj;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        hc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void gbb() {
        hc();
    }

    private void hc() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.kun;
        if (vjVar != null) {
            vjVar.qf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.atb.pcc().gm(this.of);
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.ri;
        if (pccVar != null) {
            pccVar.oo();
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.kun;
        if (vjVar != null) {
            vjVar.pcc(true);
            this.kun.vh();
        }
        this.yt.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.atb)) {
            gm.pcc.pcc(this.lq.get(), this.ye.get(), this.of);
        }
        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.rnn);
        com.bytedance.sdk.component.vy.qf qfVar = this.wh;
        if (qfVar != null) {
            kun.pcc(qfVar.getWebView());
            this.wh.jr();
        }
        this.wh = null;
        mu muVar = this.nac;
        if (muVar != null) {
            muVar.tmg();
        }
        mu muVar2 = this.lu;
        if (muVar2 != null) {
            muVar2.tmg();
        }
        com.bytedance.sdk.openadsdk.tz.kj kjVar = this.nn;
        if (kjVar != null) {
            kjVar.nn();
        }
        hc hcVar = this.rj;
        if (hcVar != null) {
            hcVar.oo(true);
        }
        ye yeVar = this.pcc;
        if (yeVar != null) {
            yeVar.sf();
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        if (i == 1) {
            rj.pcc((View) this.ork, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        ork orkVar = this.gbb;
        if (orkVar == null || !orkVar.oo()) {
            int i2 = message.arg1;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.lo);
                ork orkVar2 = this.gbb;
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, orkVar2 != null ? orkVar2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                lo.pcc("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.oo.gm.sf(this.of, "embeded_ad", "remove_loading_page", jSONObject);
            this.yt.removeMessages(2);
            ork orkVar3 = this.gbb;
            if (orkVar3 != null) {
                orkVar3.gm();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.oo
    public void vj(boolean z) {
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar;
        this.qy = true;
        this.jsj = z;
        if (!z) {
            try {
                if (!com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_cookie", true)) {
                    Toast.makeText(this.hc, "Download later", 0).show();
                } else {
                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
                    ((FrameLayout) findViewById(R.id.content)).addView(tTAdDislikeToast);
                    tTAdDislikeToast.show("Download later");
                }
            } catch (Throwable unused) {
            }
        }
        if (!this.jsj || (gmVar = this.tsz) == null) {
            return;
        }
        gmVar.pcc(this.of);
    }

    protected void pcc() {
        if (this.of == null || isFinishing()) {
            return;
        }
        if (this.gm.get()) {
            gpj();
            return;
        }
        if (this.pcc == null) {
            sf();
        }
        this.pcc.pcc(new ye.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.ye.pcc
            public void pcc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ye.pcc
            public void pcc(int i, String str) {
                if (TTPlayableLandingPageActivity.this.gm.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.gm.set(true);
                TTPlayableLandingPageActivity.this.lo();
            }
        });
        ye yeVar = this.pcc;
        if (yeVar != null) {
            yeVar.pcc();
        }
    }

    void sf() {
        if (this.of != null) {
            this.pcc = new com.bytedance.sdk.openadsdk.gm.gm(this, this.of.hl(), this.of.ywc(), this.of);
        }
        if (this.sf == null) {
            this.sf = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.sf);
        }
    }

    private void gpj() {
        TTAdDislikeToast tTAdDislikeToast = this.sf;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo() {
        TTAdDislikeToast tTAdDislikeToast = this.sf;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void wh(boolean z) {
        Drawable pcc;
        try {
            this.tsx = z;
            if (z) {
                pcc = vh.pcc(this.hc, "tt_mute_wrapper");
            } else {
                pcc = vh.pcc(this.hc, "tt_unmute_wrapper");
            }
            this.tmg.setImageDrawable(pcc);
            com.bytedance.sdk.openadsdk.tz.kj kjVar = this.nn;
            if (kjVar != null) {
                kjVar.pcc(z);
            }
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.ri;
            if (pccVar != null) {
                pccVar.pcc(z);
            }
        } catch (Exception e) {
            lo.gm("TTPWPActivity", e.getMessage());
        }
    }

    private void fum() {
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(this, this.of, "embeded_ad", this.gpj) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                of ofVar = this.wh;
                if (ofVar == null || ofVar.gh() != 1 || z) {
                    super.pcc(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.tz();
                    TTPlayableLandingPageActivity.this.qy = true;
                    TTPlayableLandingPageActivity.this.jsj = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.lo);
                    } catch (JSONException e) {
                        lo.pcc("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.sf(TTPlayableLandingPageActivity.this.of, this.qf, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        pccVar.pcc(this.tsz);
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar2 = this.ri;
        if (pccVar2 != null) {
            pccVar2.pcc(pccVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tz() {
        com.bytedance.sdk.openadsdk.core.atb.pcc().sf(this.of);
    }

    public void gm() {
        rj.pcc((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                rj.pcc((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        lo.gm("TTPWPActivity", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void qcw() {
        tz();
    }
}
