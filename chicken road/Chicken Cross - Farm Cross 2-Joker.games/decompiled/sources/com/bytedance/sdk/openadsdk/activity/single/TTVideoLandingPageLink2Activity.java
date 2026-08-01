package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.common.tmg;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.vh.oo {
    private TextView bg;
    nac fmh;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh gdh;
    private PAGLogoView gh;
    private View hoh;
    private long kz;
    private View ptr;
    private boolean qcw;
    private tmg se;
    private com.bytedance.sdk.openadsdk.common.vj tmh;
    private TextView vr;
    TTAdDislikeToast zsj;
    private boolean ew = false;
    final AtomicBoolean gd = new AtomicBoolean(false);
    final AtomicBoolean erj = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jr.vj() || this.gbb == null || this.pcc == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.vj pcc = kun.pcc(this.gbb, this.pcc, this.vj, this.atb);
        this.tmh = pcc;
        if (pcc != null) {
            pcc.pcc("landingpage_split_screen");
        }
        if (this.pcc.getWebView() != null) {
            this.pcc.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTVideoLandingPageLink2Activity.this.kun != null) {
                        TTVideoLandingPageLink2Activity.this.kun.sf(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this.vj, this.kj, this.wh, this.tmh, this.kun, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.ptr != null && !TTVideoLandingPageLink2Activity.this.qcw) {
                        TTVideoLandingPageLink2Activity.this.ptr.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.ew = true;
                    TTVideoLandingPageLink2Activity.this.dax();
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(TTVideoLandingPageLink2Activity.this.gbb, TTVideoLandingPageLink2Activity.this.atb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.kz, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.kz = System.currentTimeMillis();
            }
        };
        this.gdh = whVar;
        whVar.pcc(this.gbb);
        this.pcc.setWebViewClient(this.gdh);
        this.pcc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.kj, this.kun, this.tmh) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.se != null) {
                    TTVideoLandingPageLink2Activity.this.se.pcc(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.am);
        if (textView != null && this.gbb.yt() != null) {
            textView.setText(this.gbb.yt().vj());
        }
        jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.qcw = true;
                    if (TTVideoLandingPageLink2Activity.this.se != null) {
                        TTVideoLandingPageLink2Activity.this.se.sf();
                    }
                    TTVideoLandingPageLink2Activity.this.hoh.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.gh != null) {
                        TTVideoLandingPageLink2Activity.this.gh.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ew) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(TTVideoLandingPageLink2Activity.this.gbb, TTVideoLandingPageLink2Activity.this.atb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.kz, false);
                } catch (Exception unused) {
                }
            }
        }, (this.gbb == null || this.gbb.yt() == null) ? 10000L : this.gbb.yt().pcc() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected View pcc() {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        if (Build.VERSION.SDK_INT >= 35) {
            vjVar.setFitsSystemWindows(true);
        }
        vjVar.setOrientation(1);
        vjVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        vjVar.addView(gmVar, new LinearLayout.LayoutParams(-1, rj.sf(this, 220.0f)));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        gmVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.tsx);
        gmVar.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar2.setOrientation(0);
        vjVar2.setPadding(0, rj.sf(this, 20.0f), 0, 0);
        gmVar.addView(vjVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        vjVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.jr jrVar = new com.bytedance.sdk.openadsdk.core.widget.jr(this);
        jrVar.setId(520093713);
        jrVar.setGravity(17);
        jrVar.setText(tz.pcc(this, "tt_reward_feedback"));
        jrVar.setTextColor(-1);
        jrVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, rj.sf(this, 28.0f));
        int sf = rj.sf(this, 16.0f);
        layoutParams2.rightMargin = sf;
        layoutParams2.leftMargin = sf;
        vjVar2.addView(jrVar, layoutParams2);
        gbb gbbVar = new gbb(this);
        gbbVar.setId(com.bytedance.sdk.openadsdk.utils.nac.kun);
        gbbVar.setPadding(rj.sf(this, 7.0f), rj.sf(this, 7.0f), rj.sf(this, 7.0f), rj.sf(this, 7.0f));
        gbbVar.setImageResource(tz.oo(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(rj.sf(this, 28.0f), rj.sf(this, 28.0f));
        layoutParams3.rightMargin = rj.sf(this, 12.0f);
        vjVar2.addView(gbbVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(this);
        qfVar.setVisibility(8);
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.rj);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = rj.sf(this, 10.0f);
        vjVar.addView(qfVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.pcc pccVar = new com.bytedance.sdk.openadsdk.core.widget.pcc(this);
        pccVar.setId(com.bytedance.sdk.openadsdk.utils.nac.lrr);
        pccVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pccVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(rj.sf(this, 44.0f), rj.sf(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = rj.sf(this, 5.0f);
        qfVar.addView(pccVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar.setId(com.bytedance.sdk.openadsdk.utils.nac.iv);
        kjVar.setBackground(vh.pcc(this, "tt_circle_solid_mian"));
        kjVar.setGravity(17);
        kjVar.setTextColor(-1);
        kjVar.setTextSize(2, 19.0f);
        kjVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(rj.sf(this, 44.0f), rj.sf(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = rj.sf(this, 5.0f);
        qfVar.addView(kjVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.xb);
        kjVar2.setMaxLines(1);
        kjVar2.setEllipsize(TextUtils.TruncateAt.END);
        kjVar2.setTextColor(Color.parseColor("#e5000000"));
        kjVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = rj.sf(this, 5.0f);
        layoutParams7.rightMargin = rj.sf(this, 80.0f);
        layoutParams7.addRule(1, com.bytedance.sdk.openadsdk.utils.nac.iv);
        qfVar.addView(kjVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.ri);
        kjVar3.setClickable(true);
        kjVar3.setMaxLines(1);
        kjVar3.setEllipsize(TextUtils.TruncateAt.END);
        kjVar3.setFocusable(true);
        kjVar3.setGravity(17);
        kjVar3.setText(tz.pcc(this, "tt_video_mobile_go_detail"));
        kjVar3.setTextColor(-1);
        kjVar3.setTextSize(2, 14.0f);
        kjVar3.setPadding(rj.sf(this, 2.0f), rj.sf(this, 2.0f), rj.sf(this, 2.0f), rj.sf(this, 2.0f));
        kjVar3.setBackground(vh.pcc(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(rj.sf(this, 90.0f), rj.sf(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = rj.sf(this, 5.0f);
        qfVar.addView(kjVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        vjVar.addView(gmVar3, new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.component.vy.qf qfVar2 = new com.bytedance.sdk.component.vy.qf(this, qf.gm.LANDING_PAGE);
        qfVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = rj.sf(this, 2.0f);
        gmVar3.addView(qfVar2, layoutParams9);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar3 = new com.bytedance.sdk.openadsdk.core.wh.qf(this);
        qfVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.fmh);
        qfVar3.setBackgroundColor(Color.parseColor("#F8F8F8"));
        gmVar3.addView(qfVar3, new FrameLayout.LayoutParams(-1, -1));
        tmg tmgVar = new tmg(this);
        tmgVar.setId(com.bytedance.sdk.openadsdk.utils.nac.zsj);
        qfVar3.addView(tmgVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.rnn);
        vjVar3.setOrientation(1);
        vjVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        qfVar3.addView(vjVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.nac nacVar = new com.bytedance.sdk.openadsdk.core.widget.nac(this);
        nacVar.setId(com.bytedance.sdk.openadsdk.utils.nac.gd);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(rj.sf(this, 80.0f), rj.sf(this, 80.0f));
        layoutParams11.gravity = 17;
        vjVar3.addView(nacVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar4.setId(com.bytedance.sdk.openadsdk.utils.nac.erj);
        kjVar4.setTextColor(Color.parseColor("#161823"));
        kjVar4.setTextSize(0, rj.sf(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = rj.sf(this, 12.0f);
        vjVar3.addView(kjVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar5 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar5.setId(com.bytedance.sdk.openadsdk.utils.nac.se);
        kjVar5.setTextColor(Color.parseColor("#80161823"));
        kjVar5.setTextSize(0, rj.sf(this, 16.0f));
        kjVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int sf2 = rj.sf(this, 60.0f);
        layoutParams13.rightMargin = sf2;
        layoutParams13.leftMargin = sf2;
        layoutParams13.topMargin = rj.sf(this, 8.0f);
        vjVar3.addView(kjVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar6 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar6.setId(com.bytedance.sdk.openadsdk.utils.nac.ptr);
        kjVar6.setGravity(17);
        kjVar6.setTextColor(-1);
        kjVar6.setText(tz.pcc(this, "tt_video_mobile_go_detail"));
        kjVar6.setBackground(vh.pcc(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(rj.sf(this, 255.0f), rj.sf(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = rj.sf(this, 32.0f);
        vjVar3.addView(kjVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.gh = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.nac.hoh);
        this.gh.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, rj.sf(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = rj.sf(this, 18.0f);
        layoutParams15.bottomMargin = rj.sf(this, 61.0f);
        qfVar3.addView(this.gh, layoutParams15);
        com.bytedance.sdk.openadsdk.common.jr jrVar2 = new com.bytedance.sdk.openadsdk.common.jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.kj(context);
            }
        });
        jrVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.qcw);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, rj.sf(this, 48.0f));
        layoutParams16.gravity = 81;
        gmVar3.addView(jrVar2, layoutParams16);
        return vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected void gm() {
        super.gm();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(tz.pcc(lu.pcc(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.hc();
                }
            });
        }
        this.vr = (TextView) findViewById(520093714);
        this.se = (tmg) findViewById(com.bytedance.sdk.openadsdk.utils.nac.zsj);
        this.ptr = findViewById(com.bytedance.sdk.openadsdk.utils.nac.fmh);
        this.hoh = findViewById(com.bytedance.sdk.openadsdk.utils.nac.rnn);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.erj);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.se);
        com.bytedance.sdk.openadsdk.core.widget.nac nacVar = (com.bytedance.sdk.openadsdk.core.widget.nac) findViewById(com.bytedance.sdk.openadsdk.utils.nac.gd);
        this.bg = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.ptr);
        if (this.gbb.zk() != null && !TextUtils.isEmpty(this.gbb.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gbb.zk(), nacVar, this.gbb);
        }
        textView2.setText(this.gbb.ofe());
        textView3.setText(this.gbb.lc());
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.nac.hoh);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                    IABLandingPageActivity.pcc(TTVideoLandingPageLink2Activity.this.vj, TTVideoLandingPageLink2Activity.this.gbb, TTVideoLandingPageLink2Activity.this.atb);
                } else {
                    TTWebsiteActivity.pcc(TTVideoLandingPageLink2Activity.this.vj, TTVideoLandingPageLink2Activity.this.gbb, TTVideoLandingPageLink2Activity.this.atb);
                }
            }
        });
        if (findViewById instanceof PAGLogoView) {
            ((PAGLogoView) findViewById).initData(this.gbb);
        }
        if (this.pcc != null && this.pcc.getWebView() != null) {
            kun.pcc(this.gbb, this.pcc);
        }
        if (this.pcc.getWebView() != null) {
            this.pcc.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTVideoLandingPageLink2Activity.this.kun != null) {
                        TTVideoLandingPageLink2Activity.this.kun.pcc(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.tmh == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.tmh.pcc(motionEvent);
                    return false;
                }
            });
        }
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.pcc(this.gbb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.gbb, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected void vj() {
        if (wh()) {
            super.vj();
            if (this.tmg != null) {
                if (this.tmg.getNativeVideoController() != null) {
                    this.tmg.getNativeVideoController().pcc(false);
                    this.tmg.getNativeVideoController().wh(false);
                    this.ork.setClickable(true);
                    this.ork.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            TTVideoLandingPageLink2Activity.this.jr();
                            return false;
                        }
                    });
                }
                this.tmg.getNativeVideoController().pcc(new gm.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
                    public void pcc() {
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
                    public void pcc(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
                    public void sf(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
                    public void pcc(long j, long j2) {
                        if (TTVideoLandingPageLink2Activity.this.vr != null) {
                            int max = (int) Math.max(0L, (j2 - j) / 1000);
                            TTVideoLandingPageLink2Activity.this.vr.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.vr.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gbb.by().get(0), imageView, this.gbb);
            this.ork.setVisibility(0);
            this.ork.removeAllViews();
            this.ork.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.oo.gm.sf(TTVideoLandingPageLink2Activity.this.gbb, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected boolean wh() {
        return this.vh == 5 || this.vh == 15 || this.vh == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void ork() {
        super.ork();
        if (this.gbb != null) {
            this.gbb.gbb(true);
        }
        TextView textView = this.bg;
        if (textView != null) {
            textView.setText(sf());
            this.bg.setClickable(true);
            this.bg.setOnClickListener(this.hpk);
            this.bg.setOnTouchListener(this.hpk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dax() {
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        dax();
        if (!this.qcw && this.kun != null && this.pcc != null && this.se.getVisibility() == 8) {
            this.kun.pcc(this.pcc);
        }
        super.onDestroy();
    }

    private void nac() {
        TTAdDislikeToast tTAdDislikeToast = this.zsj;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    protected void hc() {
        if (isFinishing()) {
            return;
        }
        if (this.erj.get()) {
            nac();
            return;
        }
        if (this.fmh == null) {
            gpj();
        }
        nac nacVar = this.fmh;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    private void gpj() {
        try {
            if (this.fmh == null) {
                nac nacVar = new nac(this.vj, this.gbb);
                this.fmh = nacVar;
                nacVar.setDislikeSource("landing_page");
                this.fmh.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(View view) {
                        TTVideoLandingPageLink2Activity.this.gd.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void sf(View view) {
                        TTVideoLandingPageLink2Activity.this.gd.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.erj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.erj.set(true);
                        TTVideoLandingPageLink2Activity.this.lo();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.fmh);
            if (this.zsj == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.vj);
                this.zsj = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.zsj) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }
}
