package com.tiktok.appevents;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.appevents.internal.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4561o2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.tiktok.util.JSON;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class TTInAppPurchaseManager {
    TTInAppPurchaseManager() {
    }

    static JSONObject getPurchaseProps(TTPurchaseInfo purchaseInfo) {
        try {
            JSONObject build = JSON.build();
            if (purchaseInfo.isAutoTrack()) {
                JSON.putObject(build, "type", "auto");
            }
            JSON.putObject(build, "currency", JSON.getString(purchaseInfo.getSkuDetails(), Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
            JSON.putDouble(build, "value", getPrice(purchaseInfo.getSkuDetails()));
            JSON.putDouble(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, JSON.getInt(purchaseInfo.getPurchase(), "purchaseState", 1));
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, FirebaseAnalytics.Event.PURCHASE, purchaseInfo.getPurchase());
            JSON.putObject(build2, AppLovinEventParameters.PRODUCT_IDENTIFIER, purchaseInfo.getSkuDetails());
            JSON.putObject(build, "original_json", build2);
            JSON.putObject(build, TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, getContents(purchaseInfo));
            JSON.putObject(build, C4561o2.u, getOrder(purchaseInfo));
            return build;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject getOrder(TTPurchaseInfo purchaseInfo) {
        JSONObject build = JSON.build();
        try {
            JSON.putObject(build, TTContentsEventConstants.Params.EVENT_PROPERTY_ORDER_ID, JSON.getString(purchaseInfo.getPurchase(), "orderId"));
            JSON.putLong(build, "order_time", JSON.getLong(purchaseInfo.getPurchase(), Constants.GP_IAP_PURCHASE_TIME));
            JSON.putObject(build, "order_token", JSON.getString(purchaseInfo.getPurchase(), "token", JSON.getString(purchaseInfo.getPurchase(), "purchaseToken")));
            JSON.putObject(build, "is_auto_renewing", Boolean.valueOf(JSON.getBoolean(purchaseInfo.getPurchase(), Constants.GP_IAP_AUTORENEWING, false)));
        } catch (Throwable unused) {
        }
        return build;
    }

    private static JSONArray getContents(TTPurchaseInfo purchaseInfo) {
        JSONArray buildArr = JSON.buildArr();
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, "content_id", JSON.getString(purchaseInfo.getPurchase(), "productId"));
            JSON.putObject(build, "content_type", purchaseInfo.isSubs() ? "SUB" : "SKU");
            JSON.putInt(build, FirebaseAnalytics.Param.QUANTITY, JSON.getInt(purchaseInfo.getPurchase(), FirebaseAnalytics.Param.QUANTITY));
            JSON.putDouble(build, "price", getPrice(purchaseInfo.getSkuDetails()));
            JSON.putObject(build, "title", JSON.getString(purchaseInfo.getSkuDetails(), "title"));
            JSON.putObject(build, "description", JSON.getString(purchaseInfo.getSkuDetails(), "description"));
            JSON.putObject(build, "subscription_period", JSON.getString(purchaseInfo.getSkuDetails(), Constants.GP_IAP_SUBSCRIPTION_PERIOD));
            JSON.putInt(build, "subscription_period_number", JSON.getInt(purchaseInfo.getSkuDetails(), "subscriptionPeriodNumber"));
            JSON.putObject(build, "free_trial_period", JSON.getString(purchaseInfo.getSkuDetails(), Constants.GP_IAP_FREE_TRIAL_PERIOD));
            JSONArray buildArr2 = JSON.buildArr();
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, "offer_id", JSON.getString(purchaseInfo.getSkuDetails(), "offer_id"));
            JSON.putObject(build2, "type", JSON.getString(purchaseInfo.getSkuDetails(), CampaignEx.JSON_KEY_OFFER_TYPE));
            JSON.putObject(build2, "price", JSON.getString(purchaseInfo.getSkuDetails(), "price"));
            if (!TextUtils.isEmpty(JSON.getString(purchaseInfo.getSkuDetails(), Constants.GP_IAP_FREE_TRIAL_PERIOD))) {
                JSON.putObject(build2, "payment_mode", "pay_as_you_go");
            }
            JSON.putArr(buildArr2, build2);
            JSON.putObject(build, "offers", buildArr2);
            JSON.putArr(buildArr, build);
        } catch (Throwable unused) {
        }
        return buildArr;
    }

    private static double getPrice(JSONObject skuDetails) {
        try {
            return BigDecimal.valueOf(JSON.getLong(skuDetails, Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4, 0L) / 1000000.0d).doubleValue();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }
}
