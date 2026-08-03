package com.facebook.appevents.integrity;

/* compiled from: ProtectedModeManager.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/integrity/ProtectedModeManager;", "", "()V", "PROTECTED_MODE_IS_APPLIED_KEY", "", "PROTECTED_MODE_IS_APPLIED_VALUE", "defaultStandardParameterNames", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getDefaultStandardParameterNames", "()Ljava/util/HashSet;", "defaultStandardParameterNames$delegate", "Lkotlin/Lazy;", "enabled", "", "standardParams", "convertJSONArrayToHashSet", "jsonArray", "Lorg/json/JSONArray;", "disable", "", com.ironsource.mediationsdk.metadata.a.j, "loadStandardParams", "processParametersForProtectedMode", "parameters", "Landroid/os/Bundle;", "protectedModeIsApplied", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProtectedModeManager {
    private static final java.lang.String PROTECTED_MODE_IS_APPLIED_KEY = "pm";
    private static final java.lang.String PROTECTED_MODE_IS_APPLIED_VALUE = "1";
    private static boolean enabled;
    private static java.util.HashSet<java.lang.String> standardParams;
    public static final com.facebook.appevents.integrity.ProtectedModeManager INSTANCE = new com.facebook.appevents.integrity.ProtectedModeManager();

    /* renamed from: defaultStandardParameterNames$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy defaultStandardParameterNames = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.HashSet<java.lang.String>>() { // from class: com.facebook.appevents.integrity.ProtectedModeManager$defaultStandardParameterNames$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.HashSet<java.lang.String> invoke() {
            return kotlin.collections.SetsKt.hashSetOf("_currency", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "fb_contents", "fb_country", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CURRENCY, "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_NUM_ITEMS, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_ORDER_ID, "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SEARCH_STRING, "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY, com.facebook.appevents.internal.Constants.EVENT_NAME_MD5_EVENT_KEY, "_implicitlyLogged", "_inBackground", "_isTimedEvent", com.facebook.appevents.internal.Constants.LOG_TIME_APP_EVENT_KEY, "_session_id", "_ui", "_valueToUpdate", com.facebook.appevents.codeless.internal.Constants.IS_CODELESS_EVENT_KEY, "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_PACKAGE_FP, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_AD_TYPE, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT_ID, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_DESCRIPTION, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_LEVEL, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SUCCESS, "pm", "_audiencePropertyIds", "cs_maca");
        }
    });

    private ProtectedModeManager() {
    }

    public final java.util.HashSet<java.lang.String> getDefaultStandardParameterNames() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return (java.util.HashSet) defaultStandardParameterNames.getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.ProtectedModeManager.class)) {
            return;
        }
        try {
            com.facebook.appevents.integrity.ProtectedModeManager protectedModeManager = INSTANCE;
            enabled = true;
            protectedModeManager.loadStandardParams();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.ProtectedModeManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.ProtectedModeManager.class);
        }
    }

    private final void loadStandardParams() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            java.util.HashSet<java.lang.String> convertJSONArrayToHashSet = convertJSONArrayToHashSet(queryAppSettings.getProtectedModeStandardParamsSetting());
            if (convertJSONArrayToHashSet == null) {
                convertJSONArrayToHashSet = getDefaultStandardParameterNames();
            }
            standardParams = convertJSONArrayToHashSet;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final java.util.HashSet<java.lang.String> convertJSONArrayToHashSet(org.json.JSONArray jsonArray) {
        if (!com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) && jsonArray != null) {
            try {
                if (jsonArray.length() != 0) {
                    java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
                    int length = jsonArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            java.lang.String string = jsonArray.getString(i);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    return hashSet;
                }
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final void processParametersForProtectedMode(android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.ProtectedModeManager.class)) {
            return;
        }
        try {
            if (enabled && parameters != null && !parameters.isEmpty() && standardParams != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Set<java.lang.String> keySet = parameters.keySet();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                for (java.lang.String param : keySet) {
                    java.util.HashSet<java.lang.String> hashSet = standardParams;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(hashSet);
                    if (!hashSet.contains(param)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parameters.remove((java.lang.String) it.next());
                }
                parameters.putString(PROTECTED_MODE_IS_APPLIED_KEY, "1");
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.ProtectedModeManager.class);
        }
    }

    public final boolean protectedModeIsApplied(android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (parameters.containsKey(PROTECTED_MODE_IS_APPLIED_KEY)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(parameters.get(PROTECTED_MODE_IS_APPLIED_KEY), "1");
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
