package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import com.ironsource.C4665u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;

/* compiled from: RewardVideoRequestParams.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f9724a;
    private final String b;
    private final boolean c;
    private final com.mbridge.msdk.videocommon.setting.c d;
    private final String e;

    public e(String str, String str2, boolean z, com.mbridge.msdk.videocommon.setting.c cVar, String str3) {
        this.f9724a = str;
        this.b = str2;
        this.c = z;
        this.d = cVar;
        this.e = str3;
    }

    public com.mbridge.msdk.foundation.same.net.wrapper.e a(boolean z, String str, int i, String str2, String str3, String str4, String str5, boolean z2, int i2) {
        int i3;
        int i4;
        String b = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i5 = z ? 2 : 3;
        com.mbridge.msdk.videocommon.setting.c cVar = this.d;
        if (cVar != null) {
            i3 = cVar.e();
            i4 = this.d.b();
        } else {
            i3 = 0;
            i4 = 0;
        }
        String a2 = com.mbridge.msdk.foundation.same.buffer.b.a(this.b, C4665u.j);
        int i6 = this.c ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", b);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
        if (!TextUtils.isEmpty(this.f9724a)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f9724a);
        }
        if (com.mbridge.msdk.util.b.a()) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ttc_ids", str4 == null ? "" : str4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "install_ids", str3 == null ? "" : str3);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", String.valueOf(i5));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", String.valueOf(i3));
        if (this.c) {
            i4 = 1;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", String.valueOf(i4));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.g, a2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.h, str == null ? "" : str);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.i, str2 == null ? "" : str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", String.valueOf(i6));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", String.valueOf(i));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "token", str5);
        }
        if (this.c) {
            if (i2 == com.mbridge.msdk.foundation.same.a.I || i2 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "0");
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar2 = this.d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "u_stid", this.d.a());
        }
        com.mbridge.msdk.videocommon.setting.a c = com.mbridge.msdk.videocommon.setting.b.b().c();
        if (c != null && !TextUtils.isEmpty(c.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "r_stid", c.a());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "rw_plus", z2 ? "1" : "0");
        String d = v0.d(this.b);
        if (!TextUtils.isEmpty(d)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, j.b, d);
        }
        String str6 = this.e;
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str6 != null ? str6 : "");
        return eVar;
    }
}
