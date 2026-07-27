package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import g4.AbstractC0476u;
import g4.C0472q;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class JSONConverter {
    public static final JSONConverter INSTANCE = new JSONConverter();

    private JSONConverter() {
    }

    public final CreateUserResponse convertToCreateUserResponse(JSONObject jsonObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        i.e(jsonObject, "jsonObject");
        JSONObject safeJSONObject2 = JSONObjectExtensionsKt.safeJSONObject(jsonObject, IdentityModelStoreKt.IDENTITY_NAME_SPACE);
        if (safeJSONObject2 == null || (map3 = JSONObjectExtensionsKt.toMap(safeJSONObject2)) == null) {
            map = C0472q.f5751a;
        } else {
            map = new LinkedHashMap(AbstractC0476u.W(map3.size()));
            Iterator<T> it = map3.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = JSONObjectExtensionsKt.safeJSONObject(jsonObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = JSONObjectExtensionsKt.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = JSONObjectExtensionsKt.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC0476u.W(map2.size()));
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        PropertiesObject propertiesObject = new PropertiesObject(linkedHashMap, safeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(safeJSONObject3, "country") : null, safeJSONObject3 != null ? JSONObjectExtensionsKt.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? JSONObjectExtensionsKt.safeDouble(safeJSONObject3, "long") : null);
        List expandJSONArray = JSONObjectExtensionsKt.expandJSONArray(jsonObject, "subscriptions", JSONConverter$convertToCreateUserResponse$respSubscriptions$1.INSTANCE);
        String safeString = JSONObjectExtensionsKt.safeString(jsonObject, "ryw_token");
        return new CreateUserResponse(map, propertiesObject, expandJSONArray, safeString != null ? new RywData(safeString, JSONObjectExtensionsKt.safeLong(jsonObject, "ryw_delay")) : null);
    }

    public final JSONObject convertToJSON(PropertiesObject properties) {
        i.e(properties, "properties");
        return JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), "country", properties.getCountry());
    }

    public final JSONObject convertToJSON(PropertiesDeltasObject propertiesDeltas) {
        i.e(propertiesDeltas, "propertiesDeltas");
        JSONObject putSafe = JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return JSONObjectExtensionsKt.putJSONArray(JSONObjectExtensionsKt.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), JSONConverter$convertToJSON$1.INSTANCE);
    }

    public final JSONArray convertToJSON(List<SubscriptionObject> subscriptions) {
        i.e(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<SubscriptionObject> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(SubscriptionObject subscription) {
        i.e(subscription, "subscription");
        JSONObject putSafe = JSONObjectExtensionsKt.putSafe(new JSONObject(), OutcomeConstants.OUTCOME_ID, subscription.getId());
        SubscriptionObjectType type = subscription.getType();
        return JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(putSafe, WebViewManager.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), OtelConfigRemoteOneSignal.OTEL_PATH, subscription.getSdk()), "device_model", subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}
