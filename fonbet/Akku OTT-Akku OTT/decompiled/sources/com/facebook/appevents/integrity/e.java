package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nProtectedModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedModeManager.kt\ncom/facebook/appevents/integrity/ProtectedModeManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,250:1\n1855#2,2:251\n1855#2,2:253\n*S KotlinDebug\n*F\n+ 1 ProtectedModeManager.kt\ncom/facebook/appevents/integrity/ProtectedModeManager\n*L\n220#1:251,2\n227#1:253,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e {
    public static boolean b;
    public static HashSet<String> d;
    public static final e a = new e();
    public static final Lazy c = LazyKt.lazy(a.a);

    public static final class a extends Lambda implements Function0<HashSet<String>> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final HashSet<String> invoke() {
            return SetsKt.hashSetOf("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "add_to_messaging_customer_base_for_whatsapp", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    @JvmStatic
    public static final void b(Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty() && d != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet<String> hashSet = d;
                    Intrinsics.checkNotNull(hashSet);
                    if (!hashSet.contains(param)) {
                        Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                boolean z = false;
                for (String str : arrayList) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:4:0x0007, B:9:0x0013, B:14:0x0048, B:22:0x005a, B:23:0x005e, B:38:0x0042, B:28:0x0020, B:31:0x0027, B:33:0x0032, B:18:0x004f), top: B:3:0x0007, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        HashSet<String> hashSet;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k == null) {
                return;
            }
            JSONArray jSONArray = k.m;
            HashSet<String> hashSet2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(this) && jSONArray != null) {
                try {
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
                if (jSONArray.length() != 0) {
                    hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    if (hashSet == null) {
                        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                            try {
                                hashSet2 = (HashSet) c.getValue();
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, this);
                            }
                        }
                        hashSet = hashSet2;
                    }
                    d = hashSet;
                }
            }
            hashSet = null;
            if (hashSet == null) {
            }
            d = hashSet;
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, this);
        }
    }

    public final boolean c(Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.a.b(this) || bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey("pm")) {
                if (Intrinsics.areEqual(bundle.get("pm"), "1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return false;
        }
    }
}
