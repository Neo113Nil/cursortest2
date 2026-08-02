package com.paypal.oslo.feature.cashin.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "SOURCE", "BalanceLandingScreen", "NoBalanceLandingScreen", "LocationPermissionScreen", "MainScreen", "MapScreen", "StoresListScreen", "MethodSelectionScreen", "FeatureDisabledScreen", "ErrorScreen", "TopBar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInAnalytics {
    public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics();
    public static final java.lang.String PRODUCT = "add_cash_at_store";
    public static final java.lang.String SOURCE = "feature:cash-in";

    private CashInAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$BalanceLandingScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONTINUE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCONTINUE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "INTRO_CONTENT_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getINTRO_CONTENT_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceLandingScreen {
        public static final java.lang.String FEATURE = "intro";
        public static final java.lang.String IDENTIFIER = "add_cash_intro";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.BalanceLandingScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.BalanceLandingScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_cta", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module INTRO_CONTENT_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("intro_content", 0, null, 0, 6, null);

        private BalanceLandingScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTINUE_BUTTON() {
            return CONTINUE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getINTRO_CONTENT_MODULE() {
            return INTRO_CONTENT_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$NoBalanceLandingScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "GET_STARTED_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getGET_STARTED_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "INTRO_CONTENT_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getINTRO_CONTENT_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoBalanceLandingScreen {
        public static final java.lang.String FEATURE = "intro";
        public static final java.lang.String IDENTIFIER = "add_cash_intro";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.NoBalanceLandingScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.NoBalanceLandingScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item GET_STARTED_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_cta", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module INTRO_CONTENT_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("intro_content", 0, null, 0, 6, null);

        private NoBalanceLandingScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGET_STARTED_BUTTON() {
            return GET_STARTED_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getINTRO_CONTENT_MODULE() {
            return INTRO_CONTENT_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$LocationPermissionScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ENABLE_LOCATION_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getENABLE_LOCATION_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SEE_STORES_LIST_LINK", "getSEE_STORES_LIST_LINK", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "LOCATION_PERMISSION_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getLOCATION_PERMISSION_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocationPermissionScreen {
        public static final java.lang.String FEATURE = "permission";
        public static final java.lang.String IDENTIFIER = "add_cash_location_permission";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ENABLE_LOCATION_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("turn_on_location", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SEE_STORES_LIST_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_store_list", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module LOCATION_PERMISSION_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("location_permission", 0, null, 0, 6, null);

        private LocationPermissionScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getENABLE_LOCATION_BUTTON() {
            return ENABLE_LOCATION_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSEE_STORES_LIST_LINK() {
            return SEE_STORES_LIST_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getLOCATION_PERMISSION_MODULE() {
            return LOCATION_PERMISSION_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$MainScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "NEARBY_TAB", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getNEARBY_TAB", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ALL_STORES_TAB", "getALL_STORES_TAB"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MainScreen {
        public static final java.lang.String FEATURE = "store_directory";
        public static final java.lang.String IDENTIFIER = "cash_in_main";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MainScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MainScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item NEARBY_TAB = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("nearby_tab", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ALL_STORES_TAB = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("all_stores_tab", 0, 2, null);

        private MainScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getNEARBY_TAB() {
            return NEARBY_TAB;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getALL_STORES_TAB() {
            return ALL_STORES_TAB;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$MapScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SELECT_STORE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSELECT_STORE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SELECT_STORE_CTA", "getSELECT_STORE_CTA", "MAP_PIN", "getMAP_PIN", "STORE_LIST_ITEM", "getSTORE_LIST_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MAP_VIEW_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getMAP_VIEW_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "NEARBY_STORES_SHEET_MODULE", "getNEARBY_STORES_SHEET_MODULE", "EMPTY_NEARBY_STORE_LIST_MODULE", "getEMPTY_NEARBY_STORE_LIST_MODULE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MapScreen {
        public static final java.lang.String FEATURE = "store_search";
        public static final java.lang.String IDENTIFIER = "add_cash_nearby";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SELECT_STORE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("select_store_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SELECT_STORE_CTA = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("select_store_cta", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MAP_PIN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("map_pin", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item STORE_LIST_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("store_list_item", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MAP_VIEW_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("store_map", 0, null, 0, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module NEARBY_STORES_SHEET_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("nearby_store_list", 0, null, 1, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module EMPTY_NEARBY_STORE_LIST_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("empty_nearby_store_list", 0, null, 2, 6, null);

        private MapScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSELECT_STORE_BUTTON() {
            return SELECT_STORE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSELECT_STORE_CTA() {
            return SELECT_STORE_CTA;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMAP_PIN() {
            return MAP_PIN;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSTORE_LIST_ITEM() {
            return STORE_LIST_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMAP_VIEW_MODULE() {
            return MAP_VIEW_MODULE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getNEARBY_STORES_SHEET_MODULE() {
            return NEARBY_STORES_SHEET_MODULE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getEMPTY_NEARBY_STORE_LIST_MODULE() {
            return EMPTY_NEARBY_STORE_LIST_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$StoresListScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "RETRY_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getRETRY_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "STORE_LIST_ITEM", "getSTORE_LIST_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "FEATURED_STORES_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getFEATURED_STORES_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "OTHER_STORES_MODULE", "getOTHER_STORES_MODULE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StoresListScreen {
        public static final java.lang.String FEATURE = "store_search";
        public static final java.lang.String IDENTIFIER = "add_cash_store_listing";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.StoresListScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.StoresListScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item RETRY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item STORE_LIST_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("store_list_item", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FEATURED_STORES_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("featured_stores", 0, null, 0, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module OTHER_STORES_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("other_stores", 0, null, 1, 6, null);

        private StoresListScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getRETRY_BUTTON() {
            return RETRY_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSTORE_LIST_ITEM() {
            return STORE_LIST_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFEATURED_STORES_MODULE() {
            return FEATURED_STORES_MODULE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getOTHER_STORES_MODULE() {
            return OTHER_STORES_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$MethodSelectionScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "RETRY_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getRETRY_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "getCLOSE_BUTTON", "PAYMENT_METHOD_ITEM", "getPAYMENT_METHOD_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "BARCODE_DISPLAY_MODULE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getBARCODE_DISPLAY_MODULE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "PAYMENT_METHOD_SELECTOR_MODULE", "getPAYMENT_METHOD_SELECTOR_MODULE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MethodSelectionScreen {
        public static final java.lang.String FEATURE = "method_selection";
        public static final java.lang.String IDENTIFIER = "add_cash_choose_method";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MethodSelectionScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MethodSelectionScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item RETRY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PAYMENT_METHOD_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("payment_method_item", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BARCODE_DISPLAY_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("use_barcode", 0, null, 0, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module PAYMENT_METHOD_SELECTOR_MODULE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("use_debit_card", 0, null, 1, 6, null);

        private MethodSelectionScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getRETRY_BUTTON() {
            return RETRY_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPAYMENT_METHOD_ITEM() {
            return PAYMENT_METHOD_ITEM;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBARCODE_DISPLAY_MODULE() {
            return BARCODE_DISPLAY_MODULE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getPAYMENT_METHOD_SELECTOR_MODULE() {
            return PAYMENT_METHOD_SELECTOR_MODULE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$FeatureDisabledScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureDisabledScreen {
        public static final java.lang.String FEATURE = "cash_deposit";
        public static final java.lang.String IDENTIFIER = "cash_in_feature_disabled";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.FeatureDisabledScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.FeatureDisabledScreen();

        private FeatureDisabledScreen() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$ErrorScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCLOSE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ACTION_BUTTON", "getACTION_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorScreen {
        public static final java.lang.String FEATURE = "cash_deposit";
        public static final java.lang.String IDENTIFIER = "cash_in_error";
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.ErrorScreen INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.ErrorScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ACTION_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("error_action_button", 0, 2, null);

        private ErrorScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getACTION_BUTTON() {
            return ACTION_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/analytics/CashInAnalytics$TopBar;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getBACK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TopBar {
        public static final com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.TopBar INSTANCE = new com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.TopBar();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);

        private TopBar() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }
    }
}
