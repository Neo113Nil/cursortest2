package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.unity.purchasing.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameMetricsReport.java */
/* loaded from: classes6.dex */
public class f {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r25.n().getAdType() == 295) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[Catch: Exception -> 0x0870, TryCatch #0 {Exception -> 0x0870, blocks: (B:3:0x001d, B:5:0x0029, B:9:0x0030, B:11:0x003c, B:19:0x00ae, B:21:0x00b4, B:22:0x00d0, B:24:0x00d6, B:26:0x00db, B:29:0x00fc, B:31:0x0102, B:41:0x0130, B:43:0x0134, B:44:0x0137, B:45:0x013b, B:47:0x0141, B:50:0x014a, B:52:0x0191, B:53:0x01f0, B:55:0x01fa, B:57:0x020d, B:58:0x0216, B:59:0x0229, B:61:0x0238, B:62:0x0245, B:65:0x0251, B:67:0x027f, B:69:0x0285, B:71:0x028b, B:72:0x02ac, B:73:0x02b7, B:75:0x02c1, B:77:0x02c7, B:78:0x02f7, B:80:0x02ff, B:82:0x0305, B:83:0x0326, B:84:0x0331, B:86:0x0339, B:88:0x033f, B:89:0x0360, B:90:0x036b, B:92:0x0373, B:94:0x0379, B:95:0x039a, B:96:0x03a5, B:99:0x03ba, B:101:0x03c4, B:102:0x03ca, B:103:0x03cf, B:105:0x03d5, B:107:0x03e3, B:110:0x03f3, B:112:0x03f9, B:113:0x0445, B:115:0x044f, B:118:0x045b, B:120:0x0461, B:121:0x047c, B:122:0x0480, B:124:0x0486, B:125:0x04a1, B:126:0x04a4, B:128:0x04ae, B:130:0x04bd, B:131:0x04e0, B:132:0x04e9, B:135:0x04f2, B:137:0x04f8, B:138:0x053b, B:141:0x0547, B:143:0x055e, B:144:0x0586, B:146:0x058e, B:147:0x05b6, B:149:0x05ba, B:151:0x05ca, B:152:0x05cf, B:154:0x05d9, B:155:0x05e2, B:157:0x05e8, B:158:0x05f5, B:160:0x0616, B:162:0x061d, B:163:0x062a, B:165:0x0634, B:166:0x063d, B:168:0x0645, B:170:0x064c, B:171:0x0659, B:173:0x0663, B:174:0x066c, B:175:0x0679, B:177:0x0681, B:181:0x0694, B:184:0x06a2, B:186:0x06c8, B:188:0x06ce, B:189:0x06d3, B:190:0x06d1, B:191:0x06da, B:193:0x06e2, B:195:0x06e8, B:196:0x06ed, B:197:0x06eb, B:198:0x06f4, B:201:0x06fe, B:203:0x0706, B:204:0x070e, B:206:0x071e, B:208:0x0724, B:209:0x0729, B:211:0x0738, B:213:0x073e, B:214:0x0743, B:217:0x0754, B:220:0x0774, B:222:0x077d, B:223:0x079c, B:225:0x07a8, B:230:0x07b6, B:232:0x07c2, B:234:0x07cc, B:236:0x07e3, B:237:0x07f6, B:239:0x07fc, B:240:0x0801, B:241:0x07ff, B:242:0x07ed, B:243:0x07d5, B:245:0x07db, B:247:0x083c, B:248:0x0809, B:250:0x0817, B:251:0x082a, B:253:0x0830, B:254:0x0835, B:255:0x0833, B:256:0x0821, B:260:0x0788, B:261:0x0770, B:263:0x0741, B:264:0x0727, B:270:0x05af, B:271:0x057f, B:273:0x0513, B:274:0x0517, B:276:0x051d, B:277:0x0538, B:278:0x0416, B:279:0x041c, B:281:0x0424, B:282:0x043f, B:284:0x02e9, B:286:0x0272, B:287:0x0220, B:288:0x01d2, B:295:0x00bc, B:297:0x00c2, B:299:0x00cd, B:300:0x00c7, B:301:0x0068, B:306:0x007c, B:309:0x0085, B:311:0x008b, B:313:0x0096, B:315:0x009c, B:317:0x0090, B:318:0x00a2, B:329:0x005f, B:34:0x010e, B:36:0x0129, B:13:0x0041, B:15:0x0047), top: B:2:0x001d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db A[Catch: Exception -> 0x0870, TRY_LEAVE, TryCatch #0 {Exception -> 0x0870, blocks: (B:3:0x001d, B:5:0x0029, B:9:0x0030, B:11:0x003c, B:19:0x00ae, B:21:0x00b4, B:22:0x00d0, B:24:0x00d6, B:26:0x00db, B:29:0x00fc, B:31:0x0102, B:41:0x0130, B:43:0x0134, B:44:0x0137, B:45:0x013b, B:47:0x0141, B:50:0x014a, B:52:0x0191, B:53:0x01f0, B:55:0x01fa, B:57:0x020d, B:58:0x0216, B:59:0x0229, B:61:0x0238, B:62:0x0245, B:65:0x0251, B:67:0x027f, B:69:0x0285, B:71:0x028b, B:72:0x02ac, B:73:0x02b7, B:75:0x02c1, B:77:0x02c7, B:78:0x02f7, B:80:0x02ff, B:82:0x0305, B:83:0x0326, B:84:0x0331, B:86:0x0339, B:88:0x033f, B:89:0x0360, B:90:0x036b, B:92:0x0373, B:94:0x0379, B:95:0x039a, B:96:0x03a5, B:99:0x03ba, B:101:0x03c4, B:102:0x03ca, B:103:0x03cf, B:105:0x03d5, B:107:0x03e3, B:110:0x03f3, B:112:0x03f9, B:113:0x0445, B:115:0x044f, B:118:0x045b, B:120:0x0461, B:121:0x047c, B:122:0x0480, B:124:0x0486, B:125:0x04a1, B:126:0x04a4, B:128:0x04ae, B:130:0x04bd, B:131:0x04e0, B:132:0x04e9, B:135:0x04f2, B:137:0x04f8, B:138:0x053b, B:141:0x0547, B:143:0x055e, B:144:0x0586, B:146:0x058e, B:147:0x05b6, B:149:0x05ba, B:151:0x05ca, B:152:0x05cf, B:154:0x05d9, B:155:0x05e2, B:157:0x05e8, B:158:0x05f5, B:160:0x0616, B:162:0x061d, B:163:0x062a, B:165:0x0634, B:166:0x063d, B:168:0x0645, B:170:0x064c, B:171:0x0659, B:173:0x0663, B:174:0x066c, B:175:0x0679, B:177:0x0681, B:181:0x0694, B:184:0x06a2, B:186:0x06c8, B:188:0x06ce, B:189:0x06d3, B:190:0x06d1, B:191:0x06da, B:193:0x06e2, B:195:0x06e8, B:196:0x06ed, B:197:0x06eb, B:198:0x06f4, B:201:0x06fe, B:203:0x0706, B:204:0x070e, B:206:0x071e, B:208:0x0724, B:209:0x0729, B:211:0x0738, B:213:0x073e, B:214:0x0743, B:217:0x0754, B:220:0x0774, B:222:0x077d, B:223:0x079c, B:225:0x07a8, B:230:0x07b6, B:232:0x07c2, B:234:0x07cc, B:236:0x07e3, B:237:0x07f6, B:239:0x07fc, B:240:0x0801, B:241:0x07ff, B:242:0x07ed, B:243:0x07d5, B:245:0x07db, B:247:0x083c, B:248:0x0809, B:250:0x0817, B:251:0x082a, B:253:0x0830, B:254:0x0835, B:255:0x0833, B:256:0x0821, B:260:0x0788, B:261:0x0770, B:263:0x0741, B:264:0x0727, B:270:0x05af, B:271:0x057f, B:273:0x0513, B:274:0x0517, B:276:0x051d, B:277:0x0538, B:278:0x0416, B:279:0x041c, B:281:0x0424, B:282:0x043f, B:284:0x02e9, B:286:0x0272, B:287:0x0220, B:288:0x01d2, B:295:0x00bc, B:297:0x00c2, B:299:0x00cd, B:300:0x00c7, B:301:0x0068, B:306:0x007c, B:309:0x0085, B:311:0x008b, B:313:0x0096, B:315:0x009c, B:317:0x0090, B:318:0x00a2, B:329:0x005f, B:34:0x010e, B:36:0x0129, B:13:0x0041, B:15:0x0047), top: B:2:0x001d, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> c(String str, c cVar) {
        String str2;
        Iterator it;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "cid";
        String str9 = "dspid";
        String str10 = CampaignEx.JSON_KEY_EC_TEMP_ID;
        e eVar = new e();
        try {
        } catch (Exception e) {
            e = e;
        }
        if (Arrays.asList(b.g).contains(str)) {
            return eVar.a();
        }
        if (cVar == null) {
            eVar.a("metrics_data_reason", "metrics 上报时意外为空");
            return eVar.a();
        }
        List arrayList = new ArrayList();
        try {
            if (cVar.n() != null) {
                str2 = "rid_n";
            } else {
                str2 = "rid_n";
            }
        } catch (Throwable th) {
            str2 = "rid_n";
            q0.b("SameMetricsReport", th.getMessage());
        }
        if (Arrays.asList(b.f).contains(str)) {
            try {
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                if (MBridgeConstans.DEBUG) {
                    exc.printStackTrace();
                }
                return eVar.a();
            }
            if (!"m_download_start".equals(str) && !"m_download_end".equals(str)) {
                List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                if (o != null && o.size() > 0) {
                    arrayList.addAll(o);
                }
                if (arrayList.isEmpty()) {
                    return eVar.a();
                }
                Map<String, Map<String, String>> w = cVar.w();
                String str11 = cVar.t() + str;
                Object obj = "1";
                if (w.containsKey(str11) && w.get(str11) != null && w.get(str11).containsKey("126_exclude")) {
                    try {
                        String str12 = w.get(str11).get("126_exclude");
                        w.get(str11).remove("126_exclude");
                        if ("1".equals(str12)) {
                            return eVar.a();
                        }
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            e3.printStackTrace();
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CampaignEx campaignEx = (CampaignEx) it2.next();
                    if (campaignEx != null) {
                        eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                        eVar.a("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                        eVar.a("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                        eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                        eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                        ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                        if (rsIgnoreCheckRule != null) {
                            eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                            eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                            it = it2;
                            eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                        } else {
                            it = it2;
                            eVar.a("ignore_video", 1);
                            eVar.a("ignore_template", 1);
                            eVar.a("ignore_ec", 1);
                        }
                        if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                            eVar.a("lrid", campaignEx.getLocalRequestId());
                        } else {
                            eVar.a("n_lrid", campaignEx.getNLRid());
                            if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                                eVar.a("n_rid", campaignEx.getNRid());
                            }
                            eVar.a("lrid", campaignEx.getLocalRequestId());
                        }
                        eVar.a("rid", campaignEx.getRequestId());
                        if (campaignEx.getMof_tplid() != 0) {
                            eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                        }
                        CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                        if (eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE)) {
                            eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar.b(CampaignEx.KEY_LOCAL_CHECK_STATE) + "," + campaignEx.getLocalCheckShow());
                        } else {
                            eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                        }
                        if (rewardTemplateMode != null && rewardTemplateMode.k() != 0) {
                            if (eVar.a("vtid")) {
                                eVar.a("vtid", eVar.b("vtid") + "," + rewardTemplateMode.k());
                            } else {
                                eVar.a("vtid", Integer.valueOf(rewardTemplateMode.k()));
                            }
                        }
                        if (campaignEx.getCreativeId() == 0) {
                            str3 = str8;
                        } else if (eVar.a("crid")) {
                            str3 = str8;
                            eVar.a("crid", eVar.b("crid") + "," + campaignEx.getCreativeId());
                        } else {
                            str3 = str8;
                            eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                        }
                        if (campaignEx.getVidCrtvId() != 0) {
                            if (eVar.a("video_crid")) {
                                eVar.a("video_crid", eVar.b("video_crid") + "," + campaignEx.getVidCrtvId());
                            } else {
                                eVar.a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                            }
                        }
                        if (campaignEx.getEcCrtvId() != 0) {
                            if (eVar.a("endcard_crid")) {
                                eVar.a("endcard_crid", eVar.b("endcard_crid") + "," + campaignEx.getEcCrtvId());
                            } else {
                                eVar.a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                            }
                        }
                        if (campaignEx.getEcTemplateId() != 0) {
                            if (eVar.a(str10)) {
                                eVar.a(str10, eVar.b(str10) + "," + campaignEx.getEcTemplateId());
                            } else {
                                eVar.a(str10, Long.valueOf(campaignEx.getEcTemplateId()));
                            }
                        }
                        eVar.a("bid_tk", campaignEx.getBidToken());
                        if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                            if (v0.i(campaignEx.getMof_template_url())) {
                                eVar.a("sdyv", obj);
                            } else {
                                eVar.a("sdyv", "2");
                            }
                        }
                        if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                            str4 = str10;
                        } else if (!v0.i(campaignEx.getRewardTemplateMode().j())) {
                            str4 = str10;
                            if (eVar.a("vdyv")) {
                                eVar.a("vdyv", eVar.b("vdyv") + ",2");
                            } else {
                                eVar.a("vdyv", "2");
                            }
                        } else if (eVar.a("vdyv")) {
                            str4 = str10;
                            eVar.a("vdyv", eVar.b("vdyv") + ",1");
                        } else {
                            str4 = str10;
                            eVar.a("vdyv", obj);
                        }
                        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                            if (v0.i(campaignEx.getendcard_url())) {
                                if (eVar.a("edyv")) {
                                    eVar.a("edyv", eVar.b("edyv") + ",1");
                                } else {
                                    eVar.a("edyv", obj);
                                }
                            } else if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",2");
                            } else {
                                eVar.a("edyv", "2");
                            }
                        }
                        if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
                            JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                            if (eVar.a(str9)) {
                                eVar.a(str9, eVar.b(str9) + "," + jSONObject.optString("par_dspid"));
                            } else {
                                eVar.a(str9, jSONObject.optString("par_dspid"));
                            }
                        }
                        if (campaignEx.getPlayable_ads_without_video() == 2) {
                            if (eVar.a("only_ec")) {
                                eVar.a("only_ec", eVar.b("only_ec") + ",2");
                            } else {
                                eVar.a("only_ec", "2");
                            }
                        } else if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",1");
                        } else {
                            eVar.a("only_ec", obj);
                        }
                        eVar.a(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? obj : "0");
                        eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                        String str13 = str3;
                        if (eVar.a(str13)) {
                            eVar.a(str13, eVar.b(str13) + "," + campaignEx.getId());
                        } else {
                            eVar.a(str13, campaignEx.getId());
                        }
                        String str14 = str2;
                        if (eVar.a(str14)) {
                            eVar.a(str14, eVar.b(str14) + "," + campaignEx.getRequestIdNotice());
                        } else {
                            eVar.a(str14, campaignEx.getRequestIdNotice());
                        }
                        HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                        if (hashMap != null) {
                            String str15 = hashMap.get(campaignEx.getCampaignUnitId());
                            if (!TextUtils.isEmpty(str15)) {
                                eVar.a("u_stid", str15);
                            }
                        }
                        if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                        }
                        if (campaignEx.getAdType() != 0) {
                            eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                        }
                        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                        eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                        Object obj2 = obj;
                        if ("2000047".contains(str)) {
                            if (campaignEx.getTyped() != -1) {
                                eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                            }
                            if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                                eVar.a("reason_d", campaignEx.getReasond());
                            }
                        }
                        if ("2000048".contains(str)) {
                            if (campaignEx.getTyped() != -1) {
                                eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                            }
                            if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                                eVar.a("reason", campaignEx.getReasond());
                            }
                            eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                        }
                        if (campaignEx.getAdType() != 94 && campaignEx.getAdType() != 287) {
                            str8 = str13;
                            str2 = str14;
                            obj = obj2;
                            str10 = str4;
                            it2 = it;
                        }
                        if (Arrays.asList(b.j).contains(str)) {
                            eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                            eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                            if (Arrays.asList(b.l).contains(str)) {
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                            }
                            if (str.equals("2000147")) {
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                            }
                        }
                        if (TextUtils.equals(str, "2000130")) {
                            String j = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().j() : "";
                            str5 = str13;
                            String str16 = campaignEx.getendcard_url();
                            str6 = str14;
                            eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str16) || !str16.contains("alecfc=1")) ? a.h : a.g));
                            eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(j) || !j.contains("alecfc=1")) ? a.h : a.g));
                            boolean z = campaignEx.getPlayable_ads_without_video() == 2;
                            str7 = str9;
                            com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.B());
                            eVar.a("video_skip_result", Integer.valueOf(c == null ? 2 : c.E()));
                            if (z) {
                                eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                            } else {
                                eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                            }
                        } else {
                            str5 = str13;
                            str6 = str14;
                            str7 = str9;
                        }
                        if (Arrays.asList(b.k).contains(str)) {
                            int clickTempSource = campaignEx.getClickTempSource();
                            if (clickTempSource == 1) {
                                if (campaignEx.getRewardTemplateMode().j().contains("alecfc=1")) {
                                    eVar.a("full_screen_click", Integer.valueOf(a.g));
                                } else {
                                    eVar.a("full_screen_click", Integer.valueOf(a.h));
                                }
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                            } else if (clickTempSource == 2) {
                                String str17 = campaignEx.getendcard_url();
                                if ((campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) ? !TextUtils.isEmpty(str17) ? str17.contains("alecfc=1") : false : campaignEx.getMof_template_url().contains("alecfc=1")) {
                                    eVar.a("full_screen_click", Integer.valueOf(a.g));
                                } else {
                                    eVar.a("full_screen_click", Integer.valueOf(a.h));
                                }
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                            }
                            eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                            eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                            eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                        }
                        obj = obj2;
                        str8 = str5;
                        str10 = str4;
                        it2 = it;
                        str2 = str6;
                        str9 = str7;
                    }
                }
                return eVar.a();
            }
            arrayList = a(cVar, str);
            if (arrayList.isEmpty()) {
            }
        }
        if (cVar.n() != null) {
            arrayList.add(cVar.n());
        } else {
            List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
            if (o2 != null) {
                arrayList.addAll(o2);
            }
        }
        if (arrayList.isEmpty()) {
        }
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000048")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> e;
        HashMap hashMap = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> c = c(str, cVar);
            if (c != null) {
                hashMap.putAll(c);
            }
            Map<String, String> a2 = a(str, cVar.B(), mVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            if (Arrays.asList(b.d).contains(str) && (e = e(str, cVar)) != null) {
                hashMap.putAll(e);
            }
            Map<String, String> a3 = a(str, cVar);
            if (a3 != null) {
                hashMap.putAll(a3);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty(hashMap.get("lrid"))) {
                hashMap.put("lrid", cVar.t());
            }
            if (hashMap.containsKey("lrid")) {
                String str2 = hashMap.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    hashMap.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (hashMap.containsKey("n_lrid")) {
                String str3 = hashMap.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    hashMap.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.m).contains(str)) {
                    hashMap.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    hashMap.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e a4 = a(str, hashMap);
                if (mVar != null && a4 != null) {
                    mVar.d(a4);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            cVar.j(str);
            Map<String, String> a2 = a(str, cVar.B(), mVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> a3 = a(str, cVar);
            if (a3 != null) {
                hashMap.putAll(a3);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            com.mbridge.msdk.tracker.e a4 = a(str, hashMap);
            if (mVar != null && a4 != null) {
                mVar.d(a4);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        return cVar != null ? cVar.a(cVar.t() + str) : new HashMap();
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean a2 = com.mbridge.msdk.foundation.same.b.b().a();
            if (a2 != null) {
                jSONObject.put("r_v_r", a2.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            if (!TextUtils.isEmpty(f.q0())) {
                eVar.a("as_rid", f.q0());
            }
            String L = f.L();
            JSONArray K = f.K();
            if (K != null) {
                int i = 0;
                while (true) {
                    if (i >= K.length()) {
                        break;
                    }
                    if (str.equals(K.getString(i))) {
                        L = BuildConfig.VERSION_NAME;
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(L)) {
                eVar.a("log_rate", L);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.setting.m d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (d != null && !TextUtils.isEmpty(d.I())) {
                    eVar.a("us_rid", d.I());
                }
                if (d != null && !TextUtils.isEmpty(d.a())) {
                    eVar.a("u_stid", d.a());
                }
                e c = d.b().c(str2);
                if (c != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", c.b("r_stid"));
                            c.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(c);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:6:0x0007, B:8:0x0022, B:11:0x0028, B:13:0x0038, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x006d, B:23:0x0061, B:24:0x0071, B:26:0x0077, B:27:0x007f, B:29:0x0085, B:31:0x0090, B:33:0x0096, B:34:0x008a, B:36:0x003f, B:38:0x0043, B:40:0x004b, B:42:0x004f), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:6:0x0007, B:8:0x0022, B:11:0x0028, B:13:0x0038, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x006d, B:23:0x0061, B:24:0x0071, B:26:0x0077, B:27:0x007f, B:29:0x0085, B:31:0x0090, B:33:0x0096, B:34:0x008a, B:36:0x003f, B:38:0x0043, B:40:0x004b, B:42:0x004f), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x004d -> B:43:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x004f -> B:43:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CampaignEx> a(c cVar, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> w = cVar.w();
                if (w != null && w.containsKey(str2)) {
                    try {
                        Object obj = w.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            i = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            i = ((Integer) obj).intValue();
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (i != 1) {
                        List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o != null && o.size() > 0) {
                            arrayList.addAll(o);
                        }
                    } else if (cVar.n() != null) {
                        arrayList.add(cVar.n());
                    } else {
                        List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o2 != null && o2.size() > 0) {
                            arrayList.addAll(o2);
                        }
                    }
                }
                i = -1;
                if (i != 1) {
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(b.e).contains(str)) {
                String str2 = "";
                if (cVar != null) {
                    str2 = cVar.j();
                }
                hashMap.put("auto_load", str2);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> w = cVar.w();
                String str3 = cVar.t() + str;
                if (w.containsKey(str3) && w.get(str3) != null) {
                    hashMap.putAll(w.get(str3));
                }
                try {
                    Map<String, Map<String, String>> v = cVar.v();
                    String str4 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (v.containsKey(str4) && v.get(str4) != null) {
                        hashMap.putAll(v.get(str4));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }
}
