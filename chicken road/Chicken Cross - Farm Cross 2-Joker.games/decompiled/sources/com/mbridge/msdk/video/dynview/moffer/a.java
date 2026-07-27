package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MOfferEnergize.java */
/* loaded from: classes6.dex */
public class a {
    private static volatile a c;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f10105a = new ConcurrentHashMap();
    private int b = 500;

    /* compiled from: MOfferEnergize.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f10107a;

        b(MOfferModel mOfferModel) {
            this.f10107a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f10107a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    /* compiled from: MOfferEnergize.java */
    class c implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f10108a;
        final /* synthetic */ ViewGroup b;

        c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f10108a = mOfferModel;
            this.b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f10108a, this.b, viewGroup, campaignUnit);
            } catch (Exception e) {
                q0.b("MOfferEnergize", e.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean b(String str) {
        if (this.f10105a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f10105a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f10105a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f10105a.clear();
            }
        } catch (Exception e) {
            q0.b("MOfferEnergize", e.getMessage());
        }
    }

    /* compiled from: MOfferEnergize.java */
    /* renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    class C1447a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10106a;
        final /* synthetic */ MOfferModel b;

        C1447a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f10106a = viewGroup;
            this.b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f10106a) == null) {
                return;
            }
            try {
                a.this.a(this.b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e) {
                q0.b("MOfferEnergize", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i, String str) {
            q0.b("MOfferEnergize", str);
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f10105a == null || TextUtils.isEmpty(str) || !this.f10105a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f10105a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        a(mOfferModel, viewGroup, aVar);
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C1447a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int a2 = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(a2, a2, a2, a2);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, v0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.b + 500);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e) {
            q0.b("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:35:0x0003, B:37:0x0009, B:39:0x0013, B:41:0x0021, B:5:0x0034, B:7:0x0038, B:9:0x0041, B:10:0x0057, B:11:0x004b, B:12:0x0083, B:14:0x0087, B:16:0x0090, B:17:0x00d0, B:18:0x00f7, B:20:0x0106, B:32:0x00ac), top: B:34:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:35:0x0003, B:37:0x0009, B:39:0x0013, B:41:0x0021, B:5:0x0034, B:7:0x0038, B:9:0x0041, B:10:0x0057, B:11:0x004b, B:12:0x0083, B:14:0x0087, B:16:0x0090, B:17:0x00d0, B:18:0x00f7, B:20:0x0106, B:32:0x00ac), top: B:34:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:35:0x0003, B:37:0x0009, B:39:0x0013, B:41:0x0021, B:5:0x0034, B:7:0x0038, B:9:0x0041, B:10:0x0057, B:11:0x004b, B:12:0x0083, B:14:0x0087, B:16:0x0090, B:17:0x00d0, B:18:0x00f7, B:20:0x0106, B:32:0x00ac), top: B:34:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:35:0x0003, B:37:0x0009, B:39:0x0013, B:41:0x0021, B:5:0x0034, B:7:0x0038, B:9:0x0041, B:10:0x0057, B:11:0x004b, B:12:0x0083, B:14:0x0087, B:16:0x0090, B:17:0x00d0, B:18:0x00f7, B:20:0x0106, B:32:0x00ac), top: B:34:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        int g;
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        if (mOfferModel != null) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() != null && mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() != null) {
                    g = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().g();
                    if (g == 0) {
                        g = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
                    }
                    if (g != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
                        if (!((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                            imageView2 = (ImageView) viewGroup.findViewById(-1803557032);
                        } else {
                            imageView2 = (ImageView) viewGroup.findViewById(a("mbridge_iv_adbanner"));
                        }
                        int h = v0.h(com.mbridge.msdk.foundation.controller.c.n().d()) - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                        layoutParams.height = h;
                        layoutParams.width = (h * 16) / 9;
                        imageView2.setLayoutParams(layoutParams);
                    }
                    if (viewGroup instanceof MBridgeNativeEndCardView) {
                        relativeLayout = null;
                    } else {
                        if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                            relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                            imageView = (ImageView) viewGroup.findViewById(389008949);
                            textView = (TextView) viewGroup.findViewById(1561614848);
                        } else {
                            relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                            imageView = (ImageView) viewGroup.findViewById(a("mbridge_iv_flag"));
                            textView = (TextView) viewGroup.findViewById(a("mbridge_tv_flag"));
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(imageView);
                        arrayList.add(textView);
                        new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.b);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams2.setMargins(0, 0, 0, 0);
                    viewGroup2.setLayoutParams(layoutParams2);
                    if (relativeLayout == null) {
                        relativeLayout.addView(viewGroup2);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        g = 1;
        if (g != 1) {
            if (!((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
            }
            int h2 = v0.h(com.mbridge.msdk.foundation.controller.c.n().d()) - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams3.height = h2;
            layoutParams3.width = (h2 * 16) / 9;
            imageView2.setLayoutParams(layoutParams3);
        }
        if (viewGroup instanceof MBridgeNativeEndCardView) {
        }
        RelativeLayout.LayoutParams layoutParams22 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams22.setMargins(0, 0, 0, 0);
        viewGroup2.setLayoutParams(layoutParams22);
        if (relativeLayout == null) {
        }
    }

    private void a(ViewGroup viewGroup) {
        View findViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable == null || (findViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) == null) {
                    return;
                }
                findViewById.setBackground(drawable);
            } catch (Exception e) {
                q0.b("MOfferEnergize", e.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f10105a == null) {
            this.f10105a = new ConcurrentHashMap();
        }
        if (this.f10105a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f10105a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            q0.b("MOfferEnergize", e.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f10105a == null) {
            this.f10105a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f10105a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            q0.b("MOfferEnergize", e.getMessage());
        }
    }

    private int a(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }
}
