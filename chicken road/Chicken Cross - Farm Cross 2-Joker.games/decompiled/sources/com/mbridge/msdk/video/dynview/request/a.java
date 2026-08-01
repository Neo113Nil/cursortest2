package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import org.json.JSONObject;

/* compiled from: MOfferReport.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10112a = "com.mbridge.msdk.video.dynview.request.a";

    /* compiled from: MOfferReport.java */
    /* renamed from: com.mbridge.msdk.video.dynview.request.a$a, reason: collision with other inner class name */
    class C1449a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f10113a;

        C1449a(ViewGroup viewGroup) {
            this.f10113a = viewGroup;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, this.f10113a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, this.f10113a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.b(campaign, this.f10113a);
        }
    }

    public static void a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000091");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    jSONObject.put("c", com.mbridge.msdk.foundation.same.a.g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, 0);
                jSONObject.put("rid_n", str3);
                jSONObject.put("reason", str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, v0.b(campaignEx.getRewardTemplateMode().j()));
                }
                d.b().a(jSONObject);
            } catch (Throwable th) {
                q0.b(f10112a, th.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(CampaignUnit campaignUnit, int i, int i2, String str) {
        int i3;
        String impressionURL;
        int i4;
        String str2;
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0 || campaignUnit.getAds().get(i) == null) {
            return;
        }
        if (i2 == 0 && campaignUnit.getAds().get(i).mMoreOfferImpShow) {
            return;
        }
        String a2 = c1.a(campaignUnit.getAds().get(i).getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(a2)) {
            a2 = c1.a(campaignUnit.getAds().get(i).getendcard_url(), "mof_uid");
        }
        String str3 = TextUtils.isEmpty(a2) ? str : a2;
        if (i2 == 0) {
            i3 = com.mbridge.msdk.click.retry.a.m;
            impressionURL = campaignUnit.getAds().get(i).getImpressionURL();
        } else {
            if (i2 != 1) {
                str2 = "";
                i4 = 0;
                if (TextUtils.isEmpty(str2)) {
                    com.mbridge.msdk.click.a.a(c.n().d(), campaignUnit.getAds().get(i), str3, str2, false, true, i4);
                    return;
                }
                return;
            }
            i3 = com.mbridge.msdk.click.retry.a.n;
            impressionURL = campaignUnit.getAds().get(i).getOnlyImpressionURL();
        }
        i4 = i3;
        str2 = impressionURL;
        if (TextUtils.isEmpty(str2)) {
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        a(context, campaignEx);
        com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(context, str);
        if (view instanceof ViewGroup) {
            aVar.a(new C1449a((ViewGroup) view));
        }
        aVar.a(campaignEx);
    }

    private static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }
}
