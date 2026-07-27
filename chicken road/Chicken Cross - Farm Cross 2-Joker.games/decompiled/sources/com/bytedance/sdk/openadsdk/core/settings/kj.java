package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.ork;
import com.bytedance.sdk.openadsdk.core.settings.vj;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj extends ork {
    static final ArrayList<String> oo = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean gm;
    private Set<String> vj;

    public kj(ork.pcc pccVar) {
        super(pccVar);
        this.vj = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ork
    protected String pcc() {
        try {
            if (lu.pcc() != null && !fum.pcc(lu.pcc())) {
                return "tt_sdk_settings_sr_" + fum.gm(lu.pcc()) + ".prop";
            }
            return "tt_sdk_settings_sr.prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vj
    public void pcc(JSONObject jSONObject) {
        int optInt;
        vj.pcc sf = sf();
        JSONObject wh = vh.sf().wh();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.gm = (optJSONObject == null || wh == null || !optJSONObject.toString().equals(wh.toString())) ? false : true;
        if (optJSONObject != null) {
            sf.pcc("digest", optJSONObject.toString());
        } else {
            sf.pcc("digest");
        }
        sf.pcc("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * 60000;
            if (optLong < 0 || optLong > 86400000) {
                optLong = 600000;
            }
            sf.pcc("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            sf.pcc("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (optInt2 < 0 || optInt2 > 100) {
                optInt2 = 30;
            }
            sf.pcc("blank_detect_rate", optInt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has(IronSourceConstants.EVENTS_DURATION)) {
                sf.pcc(IronSourceConstants.EVENTS_DURATION, optJSONObject2.optLong(IronSourceConstants.EVENTS_DURATION) * 1000);
            }
            if (optJSONObject2.has("max")) {
                sf.pcc("max", optJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            sf.pcc("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                sf.pcc("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                sf.pcc("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            vh.sf().kj();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            sf.pcc("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            sf.pcc("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            sf.pcc("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            sf.pcc("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            sf.pcc("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            sf.pcc("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            sf.pcc("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            sf.pcc("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            sf.pcc("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            sf.pcc("dc", jSONObject.optString("dc"));
        }
        vh.sf().pcc(jSONObject, sf);
        if (jSONObject.has("insert_js_config")) {
            sf.pcc("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            sf.pcc("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            sf.pcc("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && oo.contains(optString)) {
                    sf.pcc("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                sf.pcc("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                sf.pcc("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("support_gzip")) {
                sf.pcc("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                sf.pcc("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                sf.pcc("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                sf.pcc("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.vj.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            this.vj.add(optJSONArray.getString(i));
                        }
                    }
                    this.vj = pcc(this.vj);
                    sf.pcc("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th) {
                    lo.gm("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            sf.pcc("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        gm.pcc(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject(ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                sf.pcc("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("personalized_ad")) {
                sf.pcc("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("sladar_enable")) {
                sf.pcc("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("app_log_enable")) {
                sf.pcc("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("debug_unlock")) {
                sf.pcc("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String optString2 = optJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (!TextUtils.isEmpty(optString2)) {
                    sf.pcc("privacy_fields_allowed", optString2);
                } else {
                    sf.pcc("privacy_fields_allowed");
                }
            }
            if (optJSONObject6.has("app_reg")) {
                int optInt3 = optJSONObject6.optInt("app_reg", -1);
                if (optInt3 == 0 && zti.pcc().oo() == 1 && com.bytedance.sdk.openadsdk.yt.vj.pcc("app_register_alert_enable", false)) {
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.kj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(lu.pcc(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                sf.pcc("privacy_app_reg", optInt3 == 1);
                com.bytedance.sdk.openadsdk.core.vh.sf.pcc().pcc(optInt3);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            sf.pcc("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            sf.pcc("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (optInt5 < 0 || optInt5 > 3) {
                optInt5 = 0;
            }
            sf.pcc("splash_video_load_strategy", optInt5);
        }
        if (jSONObject.has("user_compliance_status")) {
            com.bytedance.sdk.openadsdk.core.vh.sf.pcc().sf(jSONObject.optInt("user_compliance_status", -1));
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            com.bytedance.sdk.openadsdk.core.vh.sf.pcc().pcc(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            com.bytedance.sdk.openadsdk.core.vh.sf.pcc().pcc(jSONObject.optLong("allow_req_time", com.bytedance.sdk.openadsdk.core.vh.sf.pcc.longValue()));
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            sf.pcc("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_sec_type")) {
                sf.pcc("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                sf.pcc("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                sf.pcc("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                sf.pcc("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                sf.pcc("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                sf.pcc("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                sf.pcc("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (optJSONObject7.has("bus_con_url_check")) {
                sf.pcc("bus_con_url_check", optJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (optJSONObject7.has("bus_con_behavior_count")) {
                sf.pcc("bus_con_behavior_count", optJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            if (optJSONObject7.has(vh.pcc)) {
                sf.pcc(vh.pcc, optJSONObject7.optBoolean(vh.pcc, false));
            }
            if (optJSONObject7.has(vh.sf)) {
                sf.pcc(vh.sf, optJSONObject7.optInt(vh.sf, 10000));
            }
            if (optJSONObject7.has(vh.gm)) {
                sf.pcc(vh.gm, (float) optJSONObject7.optDouble(vh.gm, 1.0d));
            }
            if (optJSONObject7.has("bus_con_slide_num")) {
                int optInt6 = optJSONObject7.optInt("bus_con_slide_num", 2);
                if (optInt6 <= 0) {
                    optInt6 = 2;
                }
                sf.pcc("bus_con_slide_num", optInt6);
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString3 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString3)) {
                            sf.pcc("perf_con_applog_send", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        sf.pcc("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        sf.pcc("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        sf.pcc("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        sf.pcc("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        sf.pcc("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        sf.pcc("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString4 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString4)) {
                            sf.pcc("perf_con_thread_pool_config", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        sf.pcc("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        sf.pcc("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        sf.pcc("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        sf.pcc("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        sf.pcc("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        sf.pcc("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        sf.pcc("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        sf.pcc("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (optJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        sf.pcc("perf_con_drop2rt_skip_label_list", optJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (optJSONObject8.has("perf_con_sync_gaid")) {
                        sf.pcc("perf_con_sync_gaid", optJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th2) {
                lo.gm("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            lo.gm("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        sf.pcc("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            sf.pcc("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            sf.pcc("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String optString5 = jSONObject.optString("token_adx_ids", "");
            if (!TextUtils.isEmpty(optString5)) {
                sf.pcc("token_adx_ids", optString5);
            } else {
                sf.pcc("token_adx_ids");
            }
        }
        if (jSONObject.has("ads_url_backup")) {
            String optString6 = jSONObject.optString("ads_url_backup", "");
            if (!TextUtils.isEmpty(optString6)) {
                sf.pcc("ads_url_backup", optString6);
            } else {
                sf.pcc("ads_url_backup");
            }
        }
        if (jSONObject.has("dual_event_url_backup")) {
            String optString7 = jSONObject.optString("dual_event_url_backup", "");
            if (!TextUtils.isEmpty(optString7)) {
                sf.pcc("dual_event_url_backup", optString7);
            } else {
                sf.pcc("dual_event_url_backup");
            }
        }
        sf.pcc();
        vh.sf().nn();
        vj();
    }

    public static Set<String> pcc(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
