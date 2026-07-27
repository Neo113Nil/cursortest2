package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBTempContainer A;
    private MBridgeBTContainer B;
    private WindVaneWebView C;
    private com.mbridge.msdk.video.bt.module.listener.a D;
    private String E;
    private String F;
    private boolean G;
    private String O;
    private com.mbridge.msdk.foundation.same.report.metrics.c P;
    private boolean R;
    private String g;
    private String h;
    private String i;
    private com.mbridge.msdk.videocommon.entity.c j;
    private int n;
    private int o;
    private int p;
    private h s;
    private com.mbridge.msdk.videocommon.setting.c t;
    private com.mbridge.msdk.videocommon.download.a w;
    private CampaignEx x;
    private List<com.mbridge.msdk.videocommon.download.a> y;
    private List<CampaignEx> z;
    private int k = 2;
    private boolean l = false;
    private boolean m = false;
    private boolean q = false;
    private boolean r = false;
    private boolean u = false;
    private boolean v = false;
    private int H = 1;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private int N = 0;
    private boolean Q = false;
    private AdSession S = null;
    private MediaEvents T = null;
    private AdEvents U = null;
    private long V = 0;
    private String W = "";
    private Boolean X = null;
    private int Y = 0;
    private boolean Z = false;
    private boolean a0 = false;
    private boolean b0 = false;
    private int c0 = -1;
    private String d0 = "null";
    private com.mbridge.msdk.video.dynview.listener.a e0 = new a();
    private com.mbridge.msdk.video.dynview.listener.d f0 = new b();

    class a implements com.mbridge.msdk.video.dynview.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.k = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(U3.i.L)) {
                int intValue = ((Integer) map.get(U3.i.L)).intValue();
                if (MBRewardVideoActivity.this.z == null || MBRewardVideoActivity.this.z.size() <= 0 || intValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.x = (CampaignEx) mBRewardVideoActivity.z.get(intValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i = intValue - 1;
                if (MBRewardVideoActivity.this.z.get(i) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.z.get(i)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.x.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.x.getVideoCompleteTime(), MBRewardVideoActivity.this.H));
                MBRewardVideoActivity.this.x.setShowIndex(MBRewardVideoActivity.this.H);
                MBRewardVideoActivity.this.x.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.x);
            }
        }
    }

    class d implements com.mbridge.msdk.foundation.feedback.a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }
    }

    private static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f9749a;
        private final String b;
        private final String c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f9749a = list;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f9749a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f9749a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx h = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(h);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.b, h.getRequestId() + h.getId() + h.getVideoUrlEncode());
                        if (h.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(h.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.b + "_" + h.getId() + "_" + this.c + "_" + h.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(h.getAdType(), h);
                            }
                            if (!TextUtils.isEmpty(h.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.b + "_" + this.c + "_" + h.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.b, h);
                        }
                    }
                }
            } catch (Exception e2) {
                q0.a("MBRewardVideoActivity", e2.getMessage());
            }
        }
    }

    private static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f9750a;
        private final String b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f9750a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f9750a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f9750a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.b);
                    }
                }
            } catch (Throwable th) {
                q0.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i = mBRewardVideoActivity.H;
        mBRewardVideoActivity.H = i + 1;
        return i;
    }

    public void changeHalfScreenPadding(int i) {
        int f2;
        int g;
        int g2;
        float f3;
        try {
            CampaignEx campaignEx = this.x;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.x.getRewardTemplateMode().g() == 0) {
                if (i == 2) {
                    f2 = (int) (v0.f(this) * 0.6f);
                    g2 = v0.g(this);
                    f3 = g2 * 0.6f;
                } else {
                    f2 = (int) (v0.f(this) * 0.6f);
                    g = v0.g(this);
                    f3 = g * 0.7f;
                }
            } else if (this.x.getRewardTemplateMode().g() == 2) {
                f2 = (int) (v0.f(this) * 0.6f);
                g2 = v0.g(this);
                f3 = g2 * 0.6f;
            } else {
                f2 = (int) (v0.f(this) * 0.6f);
                g = v0.g(this);
                f3 = g * 0.7f;
            }
            layoutParams.height = f2;
            layoutParams.width = (int) f3;
            this.A.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, "layout");
    }

    @Override // android.app.Activity
    public void finish() {
        this.Z = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.g);
        if (this.S != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.S.removeAllFriendlyObstructions();
            this.S.finish();
            this.S = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
        this.b0 = true;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.a0 = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.A.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        List<com.mbridge.msdk.videocommon.download.a> list;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
            this.d0 = com.mbridge.msdk.foundation.controller.c.n().f().getClass().getSimpleName();
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.V = SystemClock.elapsedRealtime();
        this.W = TextUtils.isEmpty(this.W) ? "onCreate" : this.W + "_onCreate";
        try {
            Intent intent = getIntent();
            this.g = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.h = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.j = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.i = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.k = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.l = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c n = com.mbridge.msdk.foundation.controller.c.n();
            boolean z = this.l;
            int i = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            n.b(z ? 287 : 94);
            this.m = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.F = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            this.Q = intent.getBooleanExtra("is_refactor", false);
            if ((intent.getFlags() & 268435456) != 0) {
                this.c0 = 0;
            } else {
                this.c0 = 1;
            }
            if (this.Q) {
                this.s = MBridgeGlobalCommon.showRewardListenerMap.get(this.g);
            } else {
                this.s = com.mbridge.msdk.reward.controller.a.f0.get(this.g);
            }
            if (this.l) {
                this.n = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.p = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.q = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.y = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.g);
            this.z = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.g);
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(findLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            if (TextUtils.isEmpty(this.g)) {
                b("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.s;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.Y = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.h, this.g);
            this.t = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c c2 = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.g);
                this.t = c2;
                if (c2 == null) {
                    this.t = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.g, this.l);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.t;
            if (cVar2 != null) {
                this.j.a(cVar2.d());
                this.j.b(this.t.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.j;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.j.a(1);
            }
            int a2 = i0.a(this, "mbridge_reward_activity_open", "anim");
            int a3 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(a2) && i0.a(a3)) {
                overridePendingTransition(a2, a3);
            }
            if (bundle != null) {
                try {
                    this.v = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.q);
            if (!this.q) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.y;
                if (list2 != null && list2.size() > 0) {
                    this.w = this.y.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.w;
                if (aVar != null) {
                    this.x = aVar.h();
                    this.w.b(true);
                    this.w.d(false);
                    CampaignEx campaignEx = this.x;
                    if (campaignEx != null) {
                        this.O = campaignEx.getCurrentLocalRid();
                        this.x.setShowIndex(1);
                        this.x.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.b0 = this.x.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.x.getMaitve(), this.x.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.x;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.w != null && this.x != null && this.j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.x);
                    a(arrayList);
                    b(this.x);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.z);
            this.E = "";
            List<CampaignEx> list3 = this.z;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.z.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.z, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                str = campaignEx3.getCMPTEntryUrl();
                this.E = campaignEx3.getRequestId();
                this.O = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView a4 = a(this.g + "_" + this.E + "_" + str);
            this.C = a4;
            if (a4 == null) {
                if (this.w == null && (list = this.y) != null && list.size() > 0) {
                    this.w = this.y.get(0);
                }
                if (this.w == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (!this.l) {
                        i = 94;
                    }
                    this.w = bVar2.a(i, this.g, this.m);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.w;
                if (aVar2 != null) {
                    this.x = aVar2.h();
                    this.w.b(true);
                    this.w.d(false);
                }
                if (this.w != null && this.x != null && this.j != null) {
                    this.q = false;
                    List<CampaignEx> a5 = com.mbridge.msdk.videocommon.cache.a.a().a(this.z);
                    if (a5 == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = a5.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (a5.get(0) == null || !a5.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = a5.get(0);
                        this.x = campaignEx4;
                        if (campaignEx4 != null) {
                            this.O = campaignEx4.getCurrentLocalRid();
                            this.x.setCampaignIsFiltered(true);
                        }
                        c(this.x);
                    } else {
                        b(a5);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.z.get(0));
            WindVaneWebView windVaneWebView = this.C;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.z.get(0).getLocalRequestId(), this.z.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.C.getObject();
                    kVar.setAdEvents(this.U);
                    kVar.setAdSession(this.S);
                    kVar.setVideoEvents(this.T);
                    this.C.setObject(kVar);
                } catch (Exception e3) {
                    q0.b("MBRewardVideoActivity", e3.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th) {
            a(this.z);
            b("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        this.W = TextUtils.isEmpty(this.W) ? "onDestroy" : this.W + "_onDestroy";
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.W) ? "unKnown" : this.W);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.V));
        Boolean bool = this.X;
        eVar.a("is_unexpected_destroy", Integer.valueOf(bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        eVar.a("is_listener_null", Integer.valueOf(this.s == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Z ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.a0 ? 1 : 2));
        eVar.a("is_back_dispatcher_invoked", Integer.valueOf(this.b0 ? 1 : 2));
        h hVar = this.s;
        eVar.a("is_listener_change", Integer.valueOf(hVar != null ? hVar.hashCode() == this.Y ? 1 : 2 : 0));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.x, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.g);
        h();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        this.e0 = null;
        this.f0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.g + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.g + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.y, this.g, this.E));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.W = TextUtils.isEmpty(this.W) ? U3.i.t0 : this.W + "_onPause";
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        this.W = TextUtils.isEmpty(this.W) ? "onRestart" : this.W + "_onRestart";
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        this.W = TextUtils.isEmpty(this.W) ? U3.i.u0 : this.W + "_onResume";
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.g, this.y));
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.A;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.v);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.W = TextUtils.isEmpty(this.W) ? "onStart" : this.W + "_onStart";
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.x.setCampaignUnitId(this.g);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.g + "_1", this.x);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.z;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.z.get(0);
                campaignEx.setCampaignUnitId(this.g);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.g + "_1", campaignEx);
            }
        }
        if (this.G) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.g + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.g + "_2");
        this.G = true;
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.W = TextUtils.isEmpty(this.W) ? "onStop" : this.W + "_onStop";
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", "style"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        this.J = i2;
        this.L = i3;
        this.K = i4;
        this.M = i5;
        this.N = i;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i, i2, i3, i4, i5);
    }

    class c implements com.mbridge.msdk.video.bt.module.listener.a {
        c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(MBRewardVideoActivity.this.P);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(MBRewardVideoActivity.this.P, z, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z, int i) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(z, i);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(MBRewardVideoActivity.this.P, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z, String str, String str2) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(z, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i, String str, String str2) {
            if (MBRewardVideoActivity.this.s != null) {
                MBRewardVideoActivity.this.s.a(i, str, str2);
            }
        }
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i) {
        int i2 = mBRewardVideoActivity.I - i;
        mBRewardVideoActivity.I = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx h;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.y;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.y) {
                    if (aVar != null && (h = aVar.h()) != null && TextUtils.equals(h.getId(), campaignEx.getId()) && TextUtils.equals(h.getRequestId(), campaignEx.getRequestId())) {
                        this.w = aVar;
                    }
                }
            }
            this.q = true;
            j();
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.N, this.J, this.L, this.K, this.M);
            }
        } catch (Exception e2) {
            q0.b("MBRewardVideoActivity", e2.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.t, this.g);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable a2 = com.mbridge.msdk.foundation.controller.c.n().a(this.g, this.l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (a2 != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, a2, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.S;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.s;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean d2 = bVar.d();
            Boolean c2 = bVar.c();
            if (d2 == null && c2 == null) {
                this.X = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.X = Boolean.valueOf(bool.equals(d2) && bool.equals(c2));
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private void g() {
        h hVar;
        try {
            Boolean bool = this.X;
            if ((bool == null || bool.booleanValue()) && (hVar = this.s) != null) {
                hVar.a(this.P, "show fail : unexpected destroy");
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.z;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.z.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.x;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.D == null) {
            this.D = new c();
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int findID = findID("mbridge_temp_container");
        if (!i0.a(findID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.A = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.z;
        if (list3 == null || list3.size() <= 0 || !this.z.get(0).isDynamicView()) {
            this.A.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.A, 500L);
        }
        changeHalfScreenPadding(-1);
        this.A.setActivity(this);
        this.A.setBidCampaign(this.m);
        this.A.setBigOffer(this.q);
        this.A.setUnitId(this.g);
        this.A.setCampaign(this.x);
        if (this.x.getDynamicTempCode() == 5 && (list2 = this.z) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.A.removeAllViews();
            this.A.setCampOrderViewData(this.z, this.I);
            this.A.setCamPlayOrderCallback(this.e0, this.H);
        }
        this.A.setCampaignDownLoadTask(this.w);
        this.A.setIV(this.l);
        CampaignEx campaignEx2 = this.x;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.A.setIVRewardEnable(this.n, this.o, this.p);
        } else {
            this.A.setIVRewardEnable(0, 0, 0);
        }
        this.A.setMute(this.k);
        CampaignEx campaignEx3 = this.x;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.z) != null && list.size() > 0 && this.z.get(0) != null && (rewardPlus = this.z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.j = cVar;
        }
        this.A.setReward(this.j);
        this.A.setRewardUnitSetting(this.t);
        this.A.setPlacementId(this.h);
        this.A.setUserId(this.i);
        this.A.setShowRewardListener(this.s);
        this.A.setDeveloperExtraData(this.F);
        this.A.init(this);
        this.A.setAdSession(this.S);
        this.A.setAdEvents(this.U);
        this.A.setVideoEvents(this.T);
        this.A.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.x) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_bt_container");
        if (!i0.a(findID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.B = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.B.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a i = i();
        this.D = i;
        this.B.setBTContainerCallback(i);
        this.B.setShowRewardVideoListener(this.s);
        this.B.setChoiceOneCallback(this.f0);
        this.B.setCampaigns(this.z);
        this.B.setCampaignDownLoadTasks(this.y);
        this.B.setRewardUnitSetting(this.t);
        this.B.setUnitId(this.g);
        this.B.setPlacementId(this.h);
        this.B.setUserId(this.i);
        this.B.setActivity(this);
        CampaignEx campaignEx = this.x;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.z.get(0) != null && (rewardPlus = this.z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.j = cVar;
        }
        this.B.setReward(this.j);
        this.B.setIVRewardEnable(this.n, this.o, this.p);
        this.B.setIV(this.l);
        this.B.setMute(this.k);
        this.B.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.B.setDeveloperExtraData(this.F);
        this.B.init(this);
        this.B.setAdSession(this.S);
        this.B.setVideoEvents(this.T);
        this.B.setAdEvents(this.U);
        this.B.onCreate(this.Q);
        if (!com.mbridge.msdk.util.b.a() || (list = this.z) == null || list.size() <= 0 || this.z.get(0) == null) {
            return;
        }
        d(this.z.get(0));
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.S == null) {
                    AdSession a2 = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.g, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.S = a2;
                    if (a2 != null) {
                        this.U = AdEvents.createAdEvents(a2);
                        this.T = MediaEvents.createMediaEvents(this.S);
                    }
                }
            } catch (Throwable th) {
                q0.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    private WindVaneWebView a(String str) {
        a.C1462a b2 = com.mbridge.msdk.videocommon.a.b(str);
        if (b2 != null) {
            return b2.b();
        }
        return null;
    }

    class b implements com.mbridge.msdk.video.dynview.listener.d {
        b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.x = campaignEx;
            MBRewardVideoActivity.this.x.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.x);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() {
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.q = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.A != null) {
                MBRewardVideoActivity.this.A.setNotchPadding(MBRewardVideoActivity.this.N, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.M);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2) {
        List<CampaignEx> list = this.z;
        if (list == null || list.size() == 0) {
            return i;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.z.size(); i5++) {
            if (this.z.get(0) != null) {
                if (i5 == 0) {
                    i4 = this.z.get(0).getVideoCompleteTime();
                }
                i3 += this.z.get(i5).getVideoLength();
            }
        }
        if (i2 == 1) {
            if (i == 0) {
                if (i3 >= 45) {
                    return 45;
                }
            } else if (i3 > i) {
                if (i > 45) {
                    return 45;
                }
                return i;
            }
            return i3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2 - 1; i7++) {
            if (this.z.get(i7) != null) {
                i6 += this.z.get(i7).getVideoLength();
            }
        }
        if (i4 > i6) {
            return i4 - i6;
        }
        return 0;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int a2 = a(campaignEx.getVideoCompleteTime(), this.H);
            this.x = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.H = 1;
            this.x.setVideoCompleteTime(a2);
            this.x.setShowIndex(this.H);
            this.x.setShowType(1);
            c(this.x);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int i;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            i = list.get(0).getDynamicTempCode();
            this.O = list.get(0).getCurrentLocalRid();
        } else {
            i = 0;
        }
        if (i != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.I += campaignEx.getVideoLength();
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.z);
        h hVar = this.s;
        if (hVar != null) {
            hVar.a(this.P, str);
        }
        finish();
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.R) {
            return;
        }
        if (list == null) {
            try {
                if (this.q) {
                    list = this.z;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.y;
                    if (list2 != null && list2.get(0) != null && this.y.get(0).h() != null) {
                        list.add(this.y.get(0).h());
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        String str = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            str = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("context_status", Integer.valueOf(this.c0));
            eVar.a("activity_name", this.d0);
            com.mbridge.msdk.foundation.same.report.metrics.c b2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
            this.P = b2;
            b2.a("2000129", eVar);
        }
        if (this.P == null) {
            this.P = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.g);
            eVar2.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.m ? 1 : 0));
            eVar2.a("adtp", Integer.valueOf(this.l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar2.a("lrid", this.O);
            eVar2.a("his_reason", "show campaign is null");
            eVar2.a("context_status", Integer.valueOf(this.c0));
            eVar2.a("activity_name", this.d0);
            this.P.a("2000129", eVar2);
        }
        if (list != null) {
            this.P.b(list);
        }
        this.R = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.P);
    }
}
