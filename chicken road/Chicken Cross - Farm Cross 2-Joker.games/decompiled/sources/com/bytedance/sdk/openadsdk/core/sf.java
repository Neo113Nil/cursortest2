package com.bytedance.sdk.openadsdk.core;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static boolean pcc(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.pcc, ArrayList<Integer>> pcc(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.pcc pccVar = new com.bytedance.sdk.openadsdk.core.model.pcc();
            pccVar.pcc(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
            pccVar.pcc(jSONObject.optInt("ret"));
            pccVar.sf(jSONObject.optInt("multi_ad_style", 0));
            pccVar.sf(jSONObject.optString("message"));
            String optString = jSONObject.optString("gdid_encrypted");
            pccVar.pcc(com.bytedance.sdk.openadsdk.core.model.tz.pcc(jSONObject.optJSONObject("loop_config")));
            String optString2 = jSONObject.optString("auction_price");
            if (pccVar.oo() != 0) {
                return null;
            }
            pccVar.pcc(com.bytedance.sdk.openadsdk.core.model.qy.pcc(jSONObject.optString("multi_ad_config")));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                optJSONArray.length();
                int i = 0;
                ArrayList arrayList2 = pccVar.vy() ? new ArrayList() : null;
                while (i < optJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.of pcc2 = pcc(optJSONArray.optJSONObject(i), adSlot, tszVar, pccVar, i);
                    ?? r9 = arrayList2;
                    if (!pccVar.vy()) {
                        r9 = ofVar;
                    }
                    int pcc3 = pcc(pcc2);
                    if (pcc3 != 200) {
                        if (pcc2 != null) {
                            com.bytedance.sdk.openadsdk.oo.gm.sf(pcc2, com.bytedance.sdk.openadsdk.utils.kun.gm(pcc2.tqg()), pcc3);
                        } else {
                            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, "", pcc3);
                        }
                        arrayList.add(Integer.valueOf(pcc3));
                        if (r9 != 0 && pcc2 != null) {
                            r9.add(new pcc(pcc2.hpk(), pcc3));
                        }
                        if (pcc2 != null && (pcc2.bg() == 39 || pcc2.bg() == 41)) {
                            pccVar.sf(0);
                        }
                        optJSONArray.remove(i);
                        i--;
                    } else {
                        pcc2.gbb(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            pcc2.vy(optString);
                        }
                        pccVar.pcc(pcc2);
                    }
                    i++;
                    ofVar = null;
                    arrayList2 = r9;
                }
                List<com.bytedance.sdk.openadsdk.core.model.of> vj = pccVar.vj();
                pcc(vj, pccVar);
                if (vj != null) {
                    if (pccVar.vy() && vj.size() == 1) {
                        pccVar.sf(0);
                        com.bytedance.sdk.openadsdk.core.model.of ofVar2 = vj.get(0);
                        if (ofVar2 != null) {
                            ofVar2.vh(false);
                        }
                    }
                    int size = vj.size();
                    jSONObject.put("creatives", optJSONArray);
                    for (int i2 = 0; i2 < size; i2++) {
                        com.bytedance.sdk.openadsdk.core.model.of ofVar3 = vj.get(i2);
                        if (ofVar3 != null) {
                            if (i2 > 0) {
                                ofVar3.su();
                            }
                            ofVar3.pq(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    pcc((ArrayList<pcc>) arrayList2);
                }
            }
            return new Pair<>(pccVar, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void pcc(List<com.bytedance.sdk.openadsdk.core.model.of> list, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar = list.get(0);
        if (!pccVar.vy() || ofVar == null || !ofVar.aj() || com.bytedance.sdk.openadsdk.utils.kun.lq() == 0) {
            return;
        }
        pccVar.sf(0);
        ofVar.vh(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x06db, code lost:
    
        if (r16.optBoolean("is_html", false) != false) goto L181;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.sdk.openadsdk.core.model.of pcc(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, int i) {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar;
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar2;
        com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar2;
        sf.pcc pccVar3;
        com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar4;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar = new com.bytedance.sdk.openadsdk.core.model.of();
        if (pccVar != null) {
            ofVar.pcc(pccVar);
            if (pccVar.vy()) {
                int optInt = jSONObject.optInt("interaction_method");
                if (optInt == 30 || optInt == 39 || optInt == 40 || optInt == 41 || optInt == 43 || optInt == 44) {
                    ofVar.vh(true);
                } else {
                    pccVar.sf(0);
                    ofVar.vh(false);
                }
            }
        }
        ofVar.pcc(i);
        pcc(jSONObject, ofVar);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (optJSONObject4 != null) {
            ofVar.pcc(com.bytedance.sdk.openadsdk.core.model.jsj.pcc(optJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            ofVar.pq(jSONObject.optString("raw_response_info"));
        }
        ofVar.jr(jSONObject.optInt("proportion_watching", -1));
        ofVar.nac(jSONObject.optBoolean("mate_disable_cache", false));
        ofVar.lq(jSONObject.optInt("interaction_type"));
        ofVar.ye(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.of.gm, 0));
        ofVar.zti(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.of.sf, 0));
        ofVar.pq(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.of.oo, 0));
        ofVar.lu(jSONObject.optString("target_url"));
        ofVar.of(jSONObject.optString("ad_id"));
        ofVar.yt(jSONObject.optString("app_log_url"));
        ofVar.qy(jSONObject.optString("settings_url"));
        ofVar.dax(jSONObject.optString("source"));
        ofVar.nac(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        ofVar.tsx(jSONObject.optInt("dislike_control", 0));
        ofVar.qy(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        ofVar.tsz(jSONObject.optString("gecko_id"));
        ofVar.sf(jSONObject.optInt("lp_cache_count", 0));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject5 = jSONObject.optJSONObject("set_click_type");
            ofVar.sf(optJSONObject5.optDouble("cta", 2.0d));
            ofVar.pcc(optJSONObject5.optDouble("other", 1.0d));
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject(ShareConstants.MEDIA_EXTENSION);
        ofVar.wh(optJSONObject6);
        if (optJSONObject6 != null) {
            ofVar.pcc(new com.bytedance.sdk.openadsdk.core.model.nac(optJSONObject6));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("icon");
        ofVar.tmg(jSONObject.optBoolean("screenshot", false));
        ofVar.of(jSONObject.optInt("play_bar_style", 0));
        ofVar.mk(jSONObject.optString("market_url", ""));
        ofVar.fum(jSONObject.optInt("video_adaptation", 0));
        ofVar.lu(jSONObject.optInt("feed_video_opentype", 0));
        ofVar.gm(jSONObject.optJSONObject("session_params"));
        JSONObject optJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        ofVar.oo(optJSONObject8);
        if (optJSONObject8 != null && (optJSONObject3 = optJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.ye yeVar = new com.bytedance.sdk.openadsdk.core.model.ye();
            yeVar.pcc((float) optJSONObject3.optDouble("speed", 1.0d));
            yeVar.pcc(optJSONObject3.optInt("type", 0));
            ofVar.pcc(yeVar);
        }
        ofVar.gbb(jSONObject.optString("auction_price", ""));
        ofVar.ri(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            ofVar.gl();
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("render");
        if (optJSONObject9 != null) {
            ofVar.gpj(optJSONObject9.optInt("render_sequence", 0));
            ofVar.lo(optJSONObject9.optInt("backup_render_control", 1));
            ofVar.hpk(optJSONObject9.optInt("reserve_time", 100));
            ofVar.fmh(optJSONObject9.optInt("render_thread", 0));
        }
        ofVar.dax(jSONObject.optInt("render_control", tszVar != null ? tszVar.vy : 1));
        if (optJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.lu luVar = new com.bytedance.sdk.openadsdk.core.model.lu();
            luVar.pcc(optJSONObject7.optString("url"));
            luVar.sf(optJSONObject7.optInt("height"));
            luVar.pcc(optJSONObject7.optInt("width"));
            ofVar.pcc(luVar);
        }
        JSONObject optJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject10 != null) {
            ofVar.gbb(optJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            ofVar.tmg(optJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject optJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.lu luVar2 = new com.bytedance.sdk.openadsdk.core.model.lu();
            luVar2.pcc(optJSONObject11.optString("url"));
            luVar2.sf(optJSONObject11.optInt("height"));
            luVar2.pcc(optJSONObject11.optInt("width"));
            ofVar.sf(luVar2);
        }
        if (jSONObject.has("banner") && (optJSONObject2 = jSONObject.optJSONObject("banner")) != null) {
            ofVar.pcc(new PAGBannerSize(optJSONObject2.optInt("width", 0), optJSONObject2.optInt("height", 0)));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.lu luVar3 = new com.bytedance.sdk.openadsdk.core.model.lu();
                JSONObject optJSONObject12 = optJSONArray.optJSONObject(i2);
                luVar3.pcc(optJSONObject12.optString("url"));
                luVar3.sf(optJSONObject12.optInt("height"));
                luVar3.pcc(optJSONObject12.optInt("width"));
                luVar3.pcc(optJSONObject12.optBoolean("image_preview"));
                luVar3.sf(optJSONObject12.optString("image_key"));
                ofVar.gm(luVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                ofVar.eko().add(optJSONArray2.optString(i3));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray(CampaignEx.JSON_KEY_CLICK_URL);
        if (optJSONArray3 != null) {
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                ofVar.oyx().add(optJSONArray3.optString(i4));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                ofVar.pzh().add(optJSONArray4.optString(i5));
            }
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("click_area");
        if (optJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.vh vhVar = new com.bytedance.sdk.openadsdk.core.model.vh();
            vhVar.pcc = optJSONObject13.optBoolean("click_upper_content_area", true);
            vhVar.sf = optJSONObject13.optBoolean("click_upper_non_content_area", true);
            vhVar.gm = optJSONObject13.optBoolean("click_lower_content_area", true);
            vhVar.oo = optJSONObject13.optBoolean("click_lower_non_content_area", true);
            vhVar.vj = optJSONObject13.optBoolean("click_button_area", true);
            vhVar.wh = optJSONObject13.optBoolean("click_video_area", true);
            ofVar.pcc(vhVar);
        }
        JSONObject optJSONObject14 = jSONObject.optJSONObject("adslot");
        if (optJSONObject14 != null) {
            ofVar.pcc(pcc(optJSONObject14));
        } else {
            ofVar.pcc(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                ofVar.ork(String.valueOf(requestExtraMap.get("admob_watermark")));
            }
        } else {
            ofVar.ork(jSONObject.optString("identificationOverlayContent"));
        }
        ofVar.yt(jSONObject.optInt("intercept_flag", 0));
        ofVar.gpj(jSONObject.optString("phone_num"));
        ofVar.lo(jSONObject.optString("title"));
        ofVar.fum(jSONObject.optString("description"));
        ofVar.tz(jSONObject.optString("button_text"));
        ofVar.tz(jSONObject.optInt("ad_logo", 1));
        ofVar.jsj(jSONObject.optString("ext"));
        ofVar.mk(jSONObject.optInt("cover_click_area", 0));
        ofVar.mu(jSONObject.optInt("image_mode"));
        ofVar.rnn(jSONObject.optInt(U3.i.n, 1));
        ofVar.pcc((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        ofVar.mk(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject optJSONObject16 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject optJSONObject17 = jSONObject.optJSONObject("oem");
        ofVar.wh(jSONObject.optInt("is_web_jump_ip", 0));
        ofVar.pcc(com.bytedance.sdk.openadsdk.core.model.mk.pcc(optJSONObject17));
        ofVar.pcc(vj(optJSONObject15));
        JSONObject optJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        ofVar.pcc(kj(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        ofVar.pcc(wh(optJSONObject18));
        ofVar.pcc(qf(optJSONObject18));
        ofVar.pcc(ork(optJSONObject16));
        ofVar.pcc(new com.bytedance.sdk.openadsdk.core.model.atb(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                FilterWord sf = sf(optJSONArray5.optJSONObject(i6));
                if (sf != null && sf.isValid()) {
                    ofVar.pcc(sf);
                }
            }
        }
        ofVar.nn(jSONObject.optInt("count_down"));
        ofVar.gm(jSONObject.optLong("expiration_time"));
        ofVar.erj(jSONObject.optInt("video_encode_type", 0));
        ofVar.se(jSONObject.optInt("video_black_fallback", 1));
        ofVar.gd(0);
        JSONObject optJSONObject19 = jSONObject.optJSONObject("video");
        if (optJSONObject19 != null) {
            sfVar = pcc(optJSONObject19, ofVar, true);
            ofVar.sf(sfVar);
            ofVar.kj(optJSONObject19.optInt("multi_played_percent", 50));
        } else {
            sfVar = null;
        }
        JSONObject optJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject20 != null) {
            sfVar2 = pcc(optJSONObject20, ofVar, false);
            ofVar.gm(sfVar2);
        } else {
            sfVar2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || ofVar.wke() == 0 || com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar)) {
            ofVar.pcc(sfVar);
            ofVar.erj(0);
        } else {
            if (sfVar2 != null && sfVar != null) {
                if (TextUtils.isEmpty(sfVar2.tmg())) {
                    sfVar2.oo(sfVar.tmg());
                }
                if (TextUtils.isEmpty(sfVar2.hc())) {
                    sfVar2.vj(sfVar.hc());
                }
                if (sfVar2.oo() == -1) {
                    sfVar2.oo(sfVar.oo());
                }
            }
            if (sfVar2 != null) {
                ofVar.pcc(sfVar2);
            } else {
                ofVar.pcc(sfVar);
            }
        }
        JSONObject optJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject21 != null) {
            ofVar.pcc(vy(optJSONObject21));
        }
        ofVar.pcc(vh(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject22 != null) {
            of.pcc pccVar5 = new of.pcc();
            pccVar5.gm(optJSONObject22.optString("id"));
            pccVar5.oo(optJSONObject22.optString("md5"));
            pccVar5.vj(optJSONObject22.optString("url"));
            pccVar5.wh(optJSONObject22.optString("data"));
            pccVar5.qf(optJSONObject22.optString("diff_data"));
            String optString = optJSONObject22.optString("dynamic_creative");
            pccVar5.kj(optString);
            pccVar5.sf(optJSONObject22.optString("version"));
            pccVar5.vy(optJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(optString);
                JSONArray optJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (optJSONArray6 != null) {
                    for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                        arrayList.add(Integer.valueOf(optJSONArray6.optInt(i7)));
                    }
                }
                String optString2 = jSONObject2.optString("music_url");
                pccVar5.pcc(arrayList);
                pccVar5.pcc(optString2);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.lo.gm("TTAD.AdInfoFactory", e.getMessage());
            }
            pccVar5.ork(optJSONObject22.optString("engine_version"));
            pccVar5.vh(optJSONObject22.optString("ugen_url"));
            pccVar5.tmg(optJSONObject22.optString("ugen_md5"));
            pccVar5.hc(optJSONObject22.optString("ugen_data"));
            ofVar.pcc(pccVar5);
        }
        JSONObject optJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (optJSONObject23 != null) {
            ofVar.pcc(com.bytedance.sdk.openadsdk.core.model.zti.pcc(optJSONObject23));
        }
        JSONObject optJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (optJSONObject24 != null) {
            ofVar.sf(optJSONObject24);
        }
        ofVar.jr(jSONObject.optString("creative_extra"));
        ofVar.nac(jSONObject.optInt("if_block_lp", 0));
        ofVar.jsj(jSONObject.optInt("cache_sort", 1));
        ofVar.tsz(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject25 != null) {
            ofVar.pcc(oo(optJSONObject25));
        }
        ofVar.kun(jSONObject.optInt("is_package_open", 1));
        ofVar.hc(jSONObject.optString("ad_info", null));
        int i8 = 2;
        ofVar.atb(jSONObject.optInt("ua_policy", 2));
        ofVar.rj(jSONObject.optInt("playable_duration_time", 30));
        ofVar.lrr(jSONObject.optInt("playable_close_time", -1));
        ofVar.iv(jSONObject.optInt("playable_endcard_close_time", -1));
        ofVar.xb(jSONObject.optInt("endcard_close_time", -1));
        ofVar.ork(jSONObject.optInt("interaction_method"));
        ofVar.vh(jSONObject.optInt("top_area_leave_blank", 0));
        ofVar.vr(jSONObject.optInt("lp_click_type", -1));
        ofVar.vj(jSONObject.optInt("lp_click_interval", -1));
        ofVar.atb(jSONObject.optString("dsp_html"));
        ofVar.vy(jSONObject.optInt("image_stay", 0));
        int optInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (optInt2 < 0 || optInt2 > 3) {
            optInt2 = 0;
        }
        if (optInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                optInt2 = 1;
            }
        }
        i8 = optInt2;
        ofVar.hoh(i8);
        if (i8 == 1 || i8 == 3) {
            int tqg = ofVar.tqg();
            if (tqg < 0) {
                if (ofVar.gqd() != null) {
                    tqg = ofVar.gqd().getDurationSlotType();
                } else {
                    tqg = ofVar.hh();
                }
            }
            String gm = com.bytedance.sdk.openadsdk.utils.kun.gm(tqg);
            if (jSONObject.has("vast_json")) {
                pccVar4 = com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc(jSONObject.optJSONObject("vast_json"));
            } else {
                String optString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString3)) {
                    pcc(ofVar, gm);
                    return null;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Pair<com.bytedance.sdk.openadsdk.core.gbb.pcc, sf.pcc> pcc2 = pcc(optString3, ofVar.ial(), tqg);
                if (pcc2 != null) {
                    pccVar2 = (com.bytedance.sdk.openadsdk.core.gbb.pcc) pcc2.first;
                    pccVar3 = (sf.pcc) pcc2.second;
                } else {
                    pccVar2 = null;
                    pccVar3 = null;
                }
                com.bytedance.sdk.openadsdk.core.gbb.gm.oo.sf(ofVar, gm, pccVar2, elapsedRealtime, pccVar3);
                pccVar4 = pccVar2;
            }
            if (pccVar4 == null) {
                return null;
            }
            pcc(pccVar4, ofVar);
        }
        ofVar.ye(jSONObject.optString("deep_link_appname", ""));
        ofVar.ptr(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject optJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (optJSONObject26 != null) {
            ofVar.pcc(new com.bytedance.sdk.openadsdk.core.model.jr(optJSONObject26));
        }
        JSONObject optJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (optJSONObject27 != null) {
            ofVar.qf(optJSONObject27.optString("adchoices_icon", ""));
            ofVar.kj(optJSONObject27.optString("adchoices_url", ""));
        }
        String optString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(optString4)) {
            ofVar.vy(optString4);
        }
        ofVar.erj();
        JSONObject optJSONObject28 = jSONObject.optJSONObject("ugen");
        if (optJSONObject28 != null && (optJSONObject = optJSONObject28.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            ofVar.pcc(gm(optJSONObject));
            JSONObject optJSONObject29 = optJSONObject.optJSONObject("overlay");
            if (optJSONObject29 != null) {
                ofVar.sf(gm(optJSONObject29));
            }
        }
        ofVar.qf(jSONObject.optInt("preload_h5_type", 0));
        ofVar.ork(jSONObject.optBoolean("hasReportShow", false));
        ofVar.vh(jSONObject.optString("endcard_creative", ""));
        ofVar.qf(jSONObject.optJSONObject("ad_label"));
        JSONObject optJSONObject30 = jSONObject.optJSONObject("ev");
        if (optJSONObject30 != null) {
            ofVar.lu(optJSONObject30.optBoolean(a.k, com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc));
            ofVar.bg(optJSONObject30.optInt("wait_time", com.bytedance.sdk.openadsdk.qy.pcc.gm.sf));
            ofVar.mu(optJSONObject30.optString("label", com.bytedance.sdk.openadsdk.qy.pcc.gm.gm));
            ofVar.pcc(new com.bytedance.sdk.openadsdk.qy.pcc.sf(ofVar));
        }
        JSONArray optJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (optJSONArray7 != null && optJSONArray7.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.vj vjVar = new com.bytedance.sdk.openadsdk.core.model.vj(optJSONArray7);
            if (vjVar.gm()) {
                ofVar.pcc(vjVar);
            }
        }
        JSONObject optJSONObject31 = jSONObject.optJSONObject("popup");
        if (optJSONObject31 != null) {
            ofVar.pcc(new com.bytedance.sdk.openadsdk.core.model.yt(optJSONObject31));
        }
        JSONArray optJSONArray8 = jSONObject.optJSONArray("app_log_url_backup");
        if (optJSONArray8 != null && optJSONArray8.length() > 0) {
            for (int i9 = 0; i9 < optJSONArray8.length(); i9++) {
                String optString5 = optJSONArray8.optString(i9);
                if (!TextUtils.isEmpty(optString5)) {
                    ofVar.nn(optString5);
                }
            }
        }
        JSONObject optJSONObject32 = jSONObject.optJSONObject("pixel_domain_backup");
        if (optJSONObject32 != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator<String> keys = optJSONObject32.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        String optString6 = optJSONObject32.optString(next, "");
                        if (!TextUtils.isEmpty(optString6)) {
                            hashMap.put(next, optString6);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            ofVar.pcc(hashMap);
        }
        return ofVar;
    }

    private static void pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("iv_skip_time", -1);
            int optInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (optInt != -1) {
                ofVar.kz(optInt);
            }
            if (optInt2 != -1) {
                ofVar.ew(optInt2);
            }
        }
    }

    private static com.bytedance.sdk.openadsdk.core.hc.kj.pcc gm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.hc.kj.pcc pccVar = new com.bytedance.sdk.openadsdk.core.hc.kj.pcc();
        pccVar.pcc(jSONObject.optString("id"));
        pccVar.sf(jSONObject.optString("md5"));
        pccVar.gm(jSONObject.optString("url"));
        return pccVar;
    }

    private static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.gbb.pcc, sf.pcc> pcc(String str, int i, int i2) {
        int i3;
        int i4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            i3 = 0;
            i4 = 0;
        } else {
            i3 = rj.gm(lu.pcc());
            i4 = rj.vj(lu.pcc());
            if (i == 2) {
                i4 = i3;
                i3 = i4;
            }
        }
        com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj vjVar = new com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj(lu.pcc(), i3, i4);
        return new Pair<>(vjVar.pcc(str, (File) null, new ArrayList()), vjVar.wh);
    }

    private static void pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        pccVar.pcc(ofVar);
        if (!pcc(ofVar.az())) {
            ofVar.lq(2);
        }
        ofVar.dax(1);
        ofVar.pcc(pccVar);
        if (!TextUtils.isEmpty(pccVar.oo())) {
            ofVar.lo(pccVar.oo());
        }
        if (!TextUtils.isEmpty(pccVar.vj())) {
            ofVar.fum(pccVar.vj());
        }
        ofVar.lu(pccVar.wh());
        ofVar.pcc((com.bytedance.sdk.openadsdk.core.model.wh) null);
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = ofVar.kez();
        if (kez == null) {
            kez = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf();
        }
        kez.gm(pccVar.qf());
        kez.pcc(pccVar.kj());
        kez.wh((String) null);
        kez.sf((String) null);
        kez.oo((String) null);
        ofVar.pcc(kez);
        if (pccVar.sf() != null && !TextUtils.isEmpty(pccVar.sf().oo())) {
            com.bytedance.sdk.openadsdk.core.model.lu luVar = new com.bytedance.sdk.openadsdk.core.model.lu();
            luVar.pcc(pccVar.sf().oo());
            luVar.pcc(pccVar.sf().pcc());
            luVar.sf(pccVar.sf().sf());
            ofVar.pcc(luVar);
            return;
        }
        if (ofVar.zk() == null) {
            com.bytedance.sdk.openadsdk.core.model.lu luVar2 = new com.bytedance.sdk.openadsdk.core.model.lu();
            luVar2.pcc("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            luVar2.pcc(98);
            luVar2.sf(98);
            ofVar.pcc(luVar2);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.qf oo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        long j = optLong >= 0 ? optLong : 0L;
        int optInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.qf qfVar = new com.bytedance.sdk.openadsdk.core.model.qf();
        qfVar.sf(optInt);
        qfVar.gm(optInt2);
        qfVar.pcc(j);
        qfVar.pcc(optInt3);
        return qfVar;
    }

    public static AdSlot pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float optDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float optDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int optInt3 = jSONObject.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject.optString("mRewardName", "");
        int optInt4 = jSONObject.optInt("mRewardAmount", 0);
        String optString3 = jSONObject.optString("mMediaExtra", "");
        String optString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int optInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean optBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String optString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize(optDouble, optDouble2).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(optBoolean2).isExpressAd(optBoolean3).withBid(optString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    public static FilterWord sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord sf = sf(optJSONArray.optJSONObject(i));
                    if (sf != null && sf.isValid()) {
                        filterWord.addOption(sf);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.wh vj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.wh whVar = new com.bytedance.sdk.openadsdk.core.model.wh();
        whVar.sf(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        whVar.gm(jSONObject.optString("package_name"));
        whVar.pcc(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        whVar.pcc(jSONObject.optDouble("score", -1.0d));
        whVar.pcc(jSONObject.optInt("comment_num", -1));
        whVar.sf(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        whVar.oo(jSONObject.optString("app_category"));
        return whVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.fum wh(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.fum fumVar = new com.bytedance.sdk.openadsdk.core.model.fum();
        if (jSONObject == null) {
            fumVar.pcc(10L);
            fumVar.sf(20L);
            fumVar.gm(10L);
            fumVar.oo(20L);
            fumVar.pcc("");
            return fumVar;
        }
        fumVar.pcc(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        fumVar.sf(jSONObject.optLong("straight_lp_showtime", 20L));
        fumVar.gm(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        fumVar.oo(jSONObject.optLong("straight_agg_showtime", 20L));
        fumVar.pcc(jSONObject.optString("loading_text", ""));
        return fumVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.gpj qf(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.gpj gpjVar = new com.bytedance.sdk.openadsdk.core.model.gpj();
        if (jSONObject == null) {
            gpjVar.oo(5);
            gpjVar.vj(30);
            gpjVar.wh(70);
            gpjVar.qf(1);
            gpjVar.kj(com.bytedance.sdk.openadsdk.core.model.gpj.pcc);
            gpjVar.gm(0);
            gpjVar.sf(0);
            gpjVar.pcc(3);
            return gpjVar;
        }
        gpjVar.oo(jSONObject.optInt("ceiling_time", 5));
        gpjVar.vj(jSONObject.optInt("ceiling_ratio", 30));
        gpjVar.wh(jSONObject.optInt("expand_ratio", 70));
        gpjVar.qf(jSONObject.optInt("back_type", 1));
        gpjVar.kj(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.gpj.pcc));
        gpjVar.gm(jSONObject.optInt("pre_render_status", 0));
        gpjVar.sf(jSONObject.optInt("pre_render_use_gecko", 0));
        gpjVar.pcc(jSONObject.optInt("pre_render_add_type", 3));
        return gpjVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.kj kj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.kj kjVar = new com.bytedance.sdk.openadsdk.core.model.kj();
        if (jSONObject == null) {
            kjVar.gm(0);
            kjVar.oo(0);
            kjVar.sf(new ArrayList());
            kjVar.vj(0);
            kjVar.pcc(new ArrayList());
            kjVar.sf(0);
            kjVar.pcc(0);
            return kjVar;
        }
        kjVar.gm(jSONObject.optInt("interceptor_x", 0));
        kjVar.oo(jSONObject.optInt("interceptor_y", 0));
        JSONArray optJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
        }
        kjVar.sf(arrayList);
        kjVar.vj(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(optJSONArray2.optString(i2));
            }
        }
        kjVar.pcc(arrayList2);
        kjVar.sf(jSONObject.optInt("boc_index", 0));
        kjVar.pcc(jSONObject.optInt("is_act", 0));
        return kjVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.gbb vy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.gbb gbbVar = new com.bytedance.sdk.openadsdk.core.model.gbb();
        gbbVar.pcc(jSONObject.optInt("if_send_click", 0));
        return gbbVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.hc ork(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.hc hcVar = new com.bytedance.sdk.openadsdk.core.model.hc();
        hcVar.pcc(jSONObject.optString("deeplink_url"));
        hcVar.sf(jSONObject.optString("fallback_url"));
        hcVar.pcc(jSONObject.optInt("fallback_type"));
        return hcVar;
    }

    private static com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.of ofVar, boolean z) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf();
        sfVar.sf(jSONObject.optInt("cover_height"));
        sfVar.gm(jSONObject.optInt("cover_width"));
        sfVar.pcc(jSONObject.optString("resolution"));
        sfVar.pcc(jSONObject.optLong(ContentDisposition.Parameters.Size));
        double optDouble = jSONObject.optDouble("video_duration", 0.0d);
        sfVar.pcc(optDouble);
        int i = 1;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble <= 15.0d && ofVar.ei() != 1 && com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar)) {
            i = optInt2;
        }
        sfVar.ork(i);
        sfVar.sf(jSONObject.optString("cover_url"));
        sfVar.gm(jSONObject.optString("video_url"));
        sfVar.oo(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        sfVar.vj(jSONObject.optString("playable_download_url"));
        sfVar.wh(jSONObject.optString("file_hash"));
        sfVar.kj(jSONObject.optInt("if_playable_loading_show", 0));
        sfVar.vy(jSONObject.optInt("remove_loading_page_type", 0));
        sfVar.pcc(jSONObject.optInt("fallback_endcard_judge", 0));
        sfVar.vj(jSONObject.optInt("video_preload_size", 307200));
        sfVar.wh(jSONObject.optInt("reward_video_cached_type", 0));
        sfVar.qf(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        sfVar.oo(optInt);
        return sfVar;
    }

    private static Map<String, Object> vh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r0 != 50) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            com.bytedance.sdk.openadsdk.oo.gm.gm((com.bytedance.sdk.openadsdk.core.model.of) null, "", 401);
            return 401;
        }
        String gm = com.bytedance.sdk.openadsdk.utils.kun.gm(ofVar.tqg());
        if (TextUtils.isEmpty(ofVar.esn()) || ofVar.esn().length() <= 1) {
            com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, TTAdConstant.AD_ID_IS_NULL_CODE);
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        }
        if (ofVar.uxz()) {
            if (ofVar.tqg() < 0) {
                if (ofVar.gqd() != null) {
                    ofVar.gqd().getDurationSlotType();
                } else {
                    ofVar.hh();
                }
            }
            if (ofVar.nmd()) {
                gm = "fullscreen_interstitial_ad";
            }
            if (TextUtils.isEmpty(ofVar.zgt())) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, gm, "load_html_fail", (JSONObject) null);
                return 401;
            }
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, gm, "load_html_success", (JSONObject) null);
        }
        if (ofVar.fg() == 0) {
            int ct = ofVar.ct();
            if (ct != 2 && ct != 3 && ct != 4) {
                if (ct != 5 && ct != 15) {
                    if (ct != 16) {
                    }
                }
                int pcc2 = pcc(ofVar.kez(), ofVar.on());
                if (pcc2 != 200) {
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, pcc2);
                    return pcc2;
                }
            }
            int pcc3 = pcc(ofVar.by());
            if (pcc3 != 200) {
                com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, pcc3);
                return pcc3;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().tz()) {
            return gm(ofVar);
        }
        return sf(ofVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 != 8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        int i;
        String gm = com.bytedance.sdk.openadsdk.utils.kun.gm(ofVar.tqg());
        if (ofVar.fg() == 0) {
            i = pcc(ofVar.dt());
            com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, i);
        } else {
            i = 200;
        }
        int az = ofVar.az();
        if (az != 2 && az != 3) {
            if (az == 4) {
                com.bytedance.sdk.openadsdk.core.model.wh xfm = ofVar.xfm();
                if (xfm == null) {
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, 407);
                    i = 407;
                } else if (TextUtils.isEmpty(xfm.gm()) && TextUtils.isEmpty(xfm.pcc())) {
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                    i = 417;
                } else if (TextUtils.isEmpty(xfm.gm())) {
                    i = TTAdConstant.PACKAGE_NAME_CODE;
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, TTAdConstant.PACKAGE_NAME_CODE);
                } else if (TextUtils.isEmpty(xfm.pcc())) {
                    i = 408;
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, 408);
                }
            }
            if (i != 417 || i == 407 || i == 406) {
                return i;
            }
            if (i != 200) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, gm, i);
            }
            return 200;
        }
        int sf = sf(ofVar, gm);
        if (sf != 200) {
            i = sf;
        }
        if (i != 417) {
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r3 != 8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        int i;
        String gm = com.bytedance.sdk.openadsdk.utils.kun.gm(ofVar.tqg());
        if (ofVar.fg() == 0) {
            i = pcc(ofVar.dt());
            if (i != 200) {
                com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, i);
                return i;
            }
        } else {
            i = 200;
        }
        int az = ofVar.az();
        if (az != 2 && az != 3) {
            if (az == 4) {
                i = pcc(ofVar.xfm());
                if (i != 200) {
                    com.bytedance.sdk.openadsdk.oo.gm.gm(ofVar, gm, i);
                    return i;
                }
            }
        }
        int sf = sf(ofVar, gm);
        return sf != 200 ? sf : i;
    }

    private static boolean oo(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        return (ofVar.on() || ofVar.uxz()) ? false : true;
    }

    private static int pcc(com.bytedance.sdk.openadsdk.core.model.hc hcVar) {
        if (hcVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hcVar.pcc())) {
            return 403;
        }
        if (TextUtils.isEmpty(hcVar.sf())) {
            return 404;
        }
        return (hcVar.gm() == 1 || hcVar.gm() == 2) ? 200 : 405;
    }

    private static int pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar, boolean z) {
        if (sfVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(sfVar.vh())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(sfVar.ork())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int pcc(com.bytedance.sdk.openadsdk.core.model.wh whVar) {
        if (whVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(whVar.pcc())) {
            return 408;
        }
        if (TextUtils.isEmpty(whVar.gm())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int pcc(List<com.bytedance.sdk.openadsdk.core.model.lu> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.lu luVar : list) {
            if (luVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(luVar.pcc())) {
                return 412;
            }
        }
        return 200;
    }

    private static void pcc(final ArrayList<pcc> arrayList) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.sf.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pcc pccVar = (pcc) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", pccVar.pcc);
                    jSONObject2.put("error_msg", pccVar.sf);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("multiple_ads_parsing_error").sf(jSONObject.toString());
            }
        });
    }

    private static class pcc {
        public String pcc;
        public int sf;

        public pcc(String str, int i) {
            this.pcc = str;
            this.sf = i;
        }
    }

    public static boolean pcc(String str) {
        if (str == null) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("ttclid"));
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static int sf(com.bytedance.sdk.openadsdk.core.model.of ofVar, String str) {
        if (oo(ofVar)) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.sf.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("web_ad_target_url");
                    return pccVar;
                }
            });
            String xy = ofVar.xy();
            if (TextUtils.isEmpty(xy)) {
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.sf.3
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("web_ad_target_url");
                        return pccVar;
                    }
                });
                return 406;
            }
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.sf.4
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("web_ad_target_url");
                    return pccVar;
                }
            });
            if (!pcc(xy)) {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, xy);
            }
        }
        return 200;
    }
}
