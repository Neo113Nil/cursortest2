package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class j2 {
    public static Map a(AppLovinAdImpl appLovinAdImpl) {
        HashMap hashMap = new HashMap(10);
        if (appLovinAdImpl == null) {
            return hashMap;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinAdImpl.getAdDomain(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinAdImpl.getAdIdNumber()), hashMap);
        MaxAdFormat d = appLovinAdImpl.getAdZone().d();
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, d != null ? d.getLabel() : null, hashMap);
        CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().e(), hashMap);
        CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), hashMap);
        CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), hashMap);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), hashMap);
        if (appLovinAdImpl instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdImpl;
            CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(bVar.z0()), hashMap);
            CollectionUtils.putStringIfValid("template_stage_info", String.valueOf(bVar.b0()), hashMap);
        }
        return hashMap;
    }

    public static String b(com.applovin.impl.sdk.ad.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", bVar.T());
        JsonUtils.putInt(jSONObject, "reshow_count_from_render_process_gone", bVar.U());
        return jSONObject.toString();
    }

    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar == null) {
            return hashMap;
        }
        com.applovin.impl.sdk.l sdk = bVar.getSdk();
        if (((Boolean) sdk.a(c5.L)).booleanValue()) {
            HashMap hashMap2 = new HashMap();
            Iterator it = new ArrayList(bVar.m().keySet()).iterator();
            while (it.hasNext()) {
                String path = Uri.parse((String) it.next()).getPath();
                hashMap2.put(path, Formatter.formatFileSize(com.applovin.impl.sdk.l.p(), new File(path).length()));
            }
            hashMap.put("path", hashMap2.toString());
        }
        if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((Boolean) sdk.a(c5.M)).booleanValue()) {
            hashMap.put("details", ((com.applovin.impl.sdk.ad.a) bVar).h1());
        }
        return hashMap;
    }

    public static Map a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap hashMap = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return hashMap;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinNativeAdImpl.getAdDomain(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), hashMap);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), hashMap);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), hashMap);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), hashMap);
        return hashMap;
    }

    public static Map a(c3 c3Var) {
        Map a2 = a((o3) c3Var);
        CollectionUtils.putStringIfValid("bcode", c3Var.C(), a2);
        CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, c3Var.getCreativeId(), a2);
        CollectionUtils.putStringIfValid("ad_unit_id", c3Var.getAdUnitId(), a2);
        CollectionUtils.putStringIfValid("ad_event_id", c3Var.T(), a2);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, c3Var.getFormat().getLabel(), a2);
        CollectionUtils.putStringIfValid("dsp_id", c3Var.getDspId(), a2);
        CollectionUtils.putStringIfValid("dsp_name", c3Var.getDspName(), a2);
        return a2;
    }

    public static Map a(o3 o3Var) {
        HashMap hashMap = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", o3Var.c(), hashMap);
        String b = o3Var.b();
        CollectionUtils.putStringIfValid("adapter_class", b, hashMap);
        CollectionUtils.putStringIfValid("adapter_version", a4.a(b).getAdapterVersion(), hashMap);
        return hashMap;
    }

    public static Map a(MaxError maxError) {
        HashMap hashMap = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), hashMap);
        return hashMap;
    }

    public static String a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }
}
