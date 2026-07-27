package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import androidx.autofill.HintConstants;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a4;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.f3;
import com.applovin.impl.g3;
import com.applovin.impl.h3;
import com.applovin.impl.i6;
import com.applovin.impl.j8;
import com.applovin.impl.l3;
import com.applovin.impl.n5;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Te;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class k implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final l f4473a;
    private final AppLovinCommunicator b;

    k(l lVar) {
        this.f4473a = lVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(l.p());
        this.b = appLovinCommunicator;
        if (((Boolean) lVar.a(c5.w7)).booleanValue()) {
            appLovinCommunicator.a(lVar);
            appLovinCommunicator.subscribe(this, n7.f4352a);
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4473a.k0());
            bundle.putString("applovin_random_token", this.f4473a.j0());
            bundle.putString("compass_random_token", this.f4473a.v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(l.p()) ? "tablet" : HintConstants.AUTOFILL_HINT_PHONE);
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(a4.b(this.f4473a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f4473a.y0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f4473a.a(c5.x7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f4473a.Q();
            if (p.a()) {
                this.f4473a.Q().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j;
        int i;
        if (((Boolean) this.f4473a.a(c5.w7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4473a.k0());
                }
                this.f4473a.h0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f4473a.a(c5.u5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f4473a.l().addCustomQueryParams(t7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f4473a.l().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f4473a.Z().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f4473a.a(c5.r3)).longValue();
            int i2 = messageData2.getInt("retry_count", ((Integer) this.f4473a.a(c5.s3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f4473a.a(c5.t3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j2 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f4473a.B().a((Map) null, false, false))));
                }
                j = millis;
                i = i2;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map H = this.f4473a.B().H();
                    Map p = this.f4473a.B().p();
                    if (p.containsKey("idfv") && p.containsKey("idfv_scope")) {
                        i = i2;
                        String str = (String) p.get("idfv");
                        j = millis;
                        Integer num = (Integer) p.get("idfv_scope");
                        num.intValue();
                        p.remove("idfv");
                        p.remove("idfv_scope");
                        H.put("idfv", str);
                        H.put("idfv_scope", num);
                    } else {
                        j = millis;
                        i = i2;
                    }
                    H.put("server_installed_at", this.f4473a.a(c5.o));
                    H.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4473a.k0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, H);
                    map.put("device", p);
                } else {
                    j = millis;
                    i = i2;
                }
            }
            this.f4473a.s0().a((n5) new o0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f4473a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j).a(i).b((int) j2).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f4473a), i6.b.OTHER);
        }
    }

    public void b(c3 c3Var, String str) {
        if (b("max_ad_events")) {
            Bundle a2 = a(c3Var);
            a2.putString("type", str);
            this.f4473a.Q();
            if (p.a()) {
                this.f4473a.Q().a("CommunicatorService", "Sending \"max_ad_events\" message: " + a2);
            }
            a(a2, "max_ad_events");
        }
    }

    public void b(c3 c3Var) {
        if (b(com.moloco.sdk.internal.ilrd.provider.a.k)) {
            Bundle a2 = a(c3Var);
            a2.putAll(JsonUtils.toBundle(c3Var.S()));
            a2.putString("country_code", this.f4473a.w().getCountryCode());
            a(a2, com.moloco.sdk.internal.ilrd.provider.a.k);
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(c3 c3Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle a2 = a(c3Var);
            a2.putString("callback_name", str);
            a(a2, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f4473a.a(c5.w7)).booleanValue()) {
            return this.f4473a.c(c5.v7).contains(str) || this.b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString(Te.n, maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f4473a.c(c5.v7).contains(str)));
        }
    }

    public boolean a(String str) {
        return n7.f4352a.contains(str);
    }

    private Bundle a(c3 c3Var) {
        View view;
        Bundle bundle = new Bundle();
        bundle.putString("id", c3Var.T());
        bundle.putString("network_name", c3Var.c());
        bundle.putString("max_ad_unit_id", c3Var.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", c3Var.U());
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, c3Var.getFormat().getLabel());
        BundleUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, c3Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", c3Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", c3Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(c3Var.c())) {
            bundle.putString("custom_sdk_network_name", c3Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(c3Var.y()));
        if (c3Var instanceof l3) {
            if (c3Var instanceof f3) {
                view = ((f3) c3Var).z();
            } else {
                if (c3Var instanceof h3) {
                    h3 h3Var = (h3) c3Var;
                    if (!h3Var.A0()) {
                        view = h3Var.v0() != null ? h3Var.v0() : h3Var.w0();
                    }
                }
                view = null;
            }
            bundle.putString("ad_view", view != null ? j8.a(view) : "N/A");
        } else if (c3Var instanceof g3) {
            Bundle bundle2 = ((g3) c3Var).t0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
