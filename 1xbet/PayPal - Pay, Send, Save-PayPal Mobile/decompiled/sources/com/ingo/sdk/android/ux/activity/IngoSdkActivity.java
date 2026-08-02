package com.ingo.sdk.android.ux.activity;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003"}, d2 = {"Lcom/ingo/sdk/android/ux/activity/IngoSdkActivity;", "Lcom/ingo/sdk/android/common/core/platform/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "i", "", "colorIntToThemeHex", "(I)Ljava/lang/String;", "outState", "onSaveInstanceState", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStart", "onStop", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoSdkActivity extends com.ingo.sdk.android.common.core.platform.BaseActivity {
    public static final java.lang.String ACCOUNT_TO_FUND = "account_to_fund";
    public static final java.lang.String CUSTOMER_IDENTIFIER = "customerIdentifier";
    public static final java.lang.String EDGE_TO_EDGE_ENABLED = "EDGE_TO_EDGE_ENABLED";
    public static final java.lang.String FRAUDFORCE_DEVICE_BLACKBOX = "deviceBlackbox";
    public static final java.lang.String ICON_TINT_ENABLED = "icon_tint_enabled";
    public static final java.lang.String INGO_BASE_URL = "INGO_BASE_URL";
    public static final int INGO_SDK_REQUEST_CHECK_BACK = 101;
    public static final int INGO_SDK_REQUEST_CHECK_FRONT = 100;
    public static final int INGO_SDK_REQUEST_CHECK_VOID = 105;
    public static final int INGO_SDK_REQUEST_ID_BACK = 102;
    public static final int INGO_SDK_REQUEST_ID_FRONT = 103;
    public static final int INGO_SDK_REQUEST_ID_SELF = 104;
    public static final java.lang.String IS_DARK_MODE_ALLOWED = "IS_DARK_MODE_ALLOWED";
    public static final java.lang.String IS_FUNDING_DESTINATION_NAME_DISPLAYED = "IS_FUNDING_DESTINATION_NAME_DISPLAYED";
    public static final java.lang.String IS_LOGGING_ENABLED = "IS_LOGGING_ENABLED";
    public static final java.lang.String KEY_ACCOUNT = "KEY_ACCOUNT";
    public static final java.lang.String KEY_CONFIGURATION_RESPONSE = "KEY_CONFIGURATION_RESPONSE";
    public static final java.lang.String KEY_CONFIRM_AMOUNT_RESPONSE = "KEY_CONFIRM_AMOUNT_RESPONSE";
    public static final java.lang.String KEY_CUSTOMER_RESPONSE = "KEY_CUSTOMER_RESPONSE";
    public static final java.lang.String KEY_IDENTITY_VERIFICATION_FAILURE_RESPONSE = "KEY_IDENTITY_VERIFICATION_FAILURE_RESPONSE";
    public static final java.lang.String KEY_IDENTITY_VERIFICATION_IN_PROGRESS = "KEY_IDENTITY_VERIFICATION_IN_PROGRESS";
    public static final java.lang.String KEY_IDENTITY_VERIFICATION_REQUIRED_RESPONSE = "KEY_IDENTITY_VERIFICATION_REQUIRED_RESPONSE";
    public static final java.lang.String KEY_IS_FROM_ACCOUNT_SELECTION = "IS_FROM_ACCOUNT_SELECTION";
    public static final java.lang.String KEY_IS_FROM_VOID = "IS_FROM_VOID";
    public static final java.lang.String KEY_OCR_RESPONSE = "ocr_response";
    public static final java.lang.String KEY_PROMO_CODE_RESPONSE = "KEY_PROMO_CODE_RESPONSE";
    public static final java.lang.String KEY_PROMO_CODE_STRING = "KEY_PROMO_CODE_STRING";
    public static final java.lang.String KEY_SELECTED_TIMING = "SELECTED_TIMING";
    public static final java.lang.String KEY_TRANSACTION_DECLINED_RESPONSE = "KEY_TRANSACTION_DECLINED_RESPONSE";
    public static final java.lang.String KEY_TRANSACTION_DETAILS = "TRANSACTION_DETAILS";
    public static final java.lang.String KEY_TRANSACTION_FUNDED_RESPONSE = "KEY_TRANSACTION_FUNDED_RESPONSE";
    public static final java.lang.String KEY_TRANSACTION_ID = "KEY_TRANSACTION_ID";
    public static final java.lang.String KEY_TRANSACTION_LOAD_FAILURE_RESPONSE = "KEY_TRANSACTION_LOAD_FAILURE_RESPONSE";
    public static final java.lang.String KEY_VOID_IMAGE_REQUIRED_RESPONSE = "KEY_VOID_IMAGE_REQUIRED_RESPONSE";
    public static final java.lang.String KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE = "KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE";
    public static final java.lang.String MISNAP_LICENSE_KEY = "misnap_license_key";
    public static final java.lang.String PROMO_CODE_ENTRY_ENABLED = "promo_code_entry_enabled";
    public static final java.lang.String SCREENSHOTS_ENABLED = "screenshots_enabled";
    public static final java.lang.String SDK_AUTHORIZATION_TOKEN = "sdkAuthorizationToken";
    public static final java.lang.String THEME = "theme";
    public static final int $stable = 8;

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a0  */
    @Override // com.ingo.sdk.android.common.core.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.Object obj;
        com.ingo.sdk.android.ux.EdgeToEdgeProvider edgeToEdgeProvider = new com.ingo.sdk.android.ux.EdgeToEdgeProvider(getIntent().getBooleanExtra(EDGE_TO_EDGE_ENABLED, false));
        if (edgeToEdgeProvider.getEnabled() || android.os.Build.VERSION.SDK_INT >= 35) {
            androidx.view.EdgeToEdge.enable$default(this, null, null, 3, null);
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        }
        super.onCreate(savedInstanceState);
        com.ingo.sdk.kotlin.common.features.blackbox.BlackBoxProvider blackBoxProvider = new com.ingo.sdk.kotlin.common.features.blackbox.BlackBoxProvider() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkActivity$onCreate$deviceBlackBox$1
            @Override // com.ingo.sdk.kotlin.common.features.blackbox.BlackBoxProvider
            public final java.lang.String getBlackBox() {
                java.lang.String stringExtra = com.ingo.sdk.android.ux.activity.IngoSdkActivity.this.getIntent().getStringExtra(com.ingo.sdk.android.ux.activity.IngoSdkActivity.FRAUDFORCE_DEVICE_BLACKBOX);
                return stringExtra == null ? "" : stringExtra;
            }
        };
        if (!getIntent().getBooleanExtra(SCREENSHOTS_ENABLED, true)) {
            getWindow().setFlags(8192, 8192);
        }
        java.lang.String stringExtra = getIntent().getStringExtra(THEME);
        java.lang.String valueOf = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder builder = new com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder();
        java.lang.String stringExtra2 = getIntent().getStringExtra(INGO_BASE_URL);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder baseUrl = builder.baseUrl(stringExtra2);
        java.lang.String stringExtra3 = getIntent().getStringExtra(SDK_AUTHORIZATION_TOKEN);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder sdkAuthorizationToken = baseUrl.sdkAuthorizationToken(stringExtra3);
        java.lang.String stringExtra4 = getIntent().getStringExtra(CUSTOMER_IDENTIFIER);
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder deviceBlackBox = sdkAuthorizationToken.customerId(stringExtra4).deviceBlackBox(blackBoxProvider);
        java.lang.String str = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration.Builder isFundingDestinationNameDisplayed = deviceBlackBox.deviceInfo(new com.ingo.sdk.kotlin.common.core.model.DeviceInfo("Android", valueOf, str, "")).loggingEnabled(getIntent().getBooleanExtra(IS_LOGGING_ENABLED, false)).iconTintEnabled(getIntent().getBooleanExtra(ICON_TINT_ENABLED, true)).promoCodeEnabled(getIntent().getBooleanExtra(PROMO_CODE_ENTRY_ENABLED, true)).isFundingDestinationNameDisplayed(getIntent().getBooleanExtra(IS_FUNDING_DESTINATION_NAME_DISPLAYED, true));
        java.lang.String str2 = stringExtra;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            try {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                isFundingDestinationNameDisplayed.theme((com.ingo.sdk.kotlin.ux.IngoSdkTheme) companion.decodeFromString(com.ingo.sdk.kotlin.ux.IngoSdkTheme.INSTANCE.serializer(), stringExtra));
            } catch (java.lang.Throwable th) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error Decoding IngoSdkTheme JSON Object! Falling back to XML resources!", null, th, 2, null);
            }
            com.ingo.sdk.kotlin.common.IngoSdkConfiguration build = isFundingDestinationNameDisplayed.build();
            androidx.appcompat.app.AppCompatDelegate create = androidx.appcompat.app.AppCompatDelegate.create(this, (androidx.appcompat.app.AppCompatCallback) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            if (!getIntent().getBooleanExtra(IS_DARK_MODE_ALLOWED, true)) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "setting MODE_NIGHT_NO", null, 2, null);
                create.setLocalNightMode(1);
            }
            com.ingo.sdk.kotlin.ux.IngoSdkKt.initializeIngoSdk(build);
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState());
            mutableMap.putAll(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class), create), new kotlin.Pair(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.android.ux.EdgeToEdgeProvider.class), edgeToEdgeProvider)));
            com.ingo.sdk.kotlin.ux.IngoCoreKt.setIngoApplicationState(mutableMap);
            obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj == null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.putAll(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("ApplicationId", getApplication().getPackageName()), kotlin.TuplesKt.to("Platform", "Android"), kotlin.TuplesKt.to(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.PlatformVersion, valueOf), kotlin.TuplesKt.to(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.DeviceModel, android.os.Build.MODEL), kotlin.TuplesKt.to(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.IngoSdkVersion, getString(com.ingo.sdk.android.R.string.ingo_sdk_version))));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.Launch, defaultProperties$default);
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.location.LocationProvider.class));
                if (obj2 != null) {
                    com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider = (com.ingo.sdk.kotlin.common.features.location.LocationProvider) obj2;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(locationProvider, "");
                    ((com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl) locationProvider).initialize(this);
                    if (savedInstanceState != null) {
                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "SAVED INSTANCE NOT NULL", null, 2, null);
                        java.lang.String string = savedInstanceState.getString(KEY_CONFIGURATION_RESPONSE);
                        if (string != null) {
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "SERIALIZED CONFIGURATION: ".concat(java.lang.String.valueOf(string)), null, 2, null);
                            java.lang.Object obj3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                            if (obj3 != null) {
                                java.util.Map<java.lang.Object, java.lang.Object> sessionMap = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj3).getSessionMap();
                                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.class);
                                kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                                json.getSerializersModule();
                                sessionMap.put(orCreateKotlinClass, json.decodeFromString(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.INSTANCE.serializer(), string));
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                            }
                        } else {
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "SERIALIZED CONFIGURATION IS NULL", null, 2, null);
                        }
                        java.lang.String string2 = savedInstanceState.getString(KEY_ACCOUNT);
                        if (string2 != null) {
                            java.lang.Object obj4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                            if (obj4 != null) {
                                java.util.Map<java.lang.Object, java.lang.Object> sessionMap2 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj4).getSessionMap();
                                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class);
                                kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                                json2.getSerializersModule();
                                sessionMap2.put(orCreateKotlinClass2, json2.decodeFromString(com.ingo.sdk.kotlin.common.features.customer.model.Account.INSTANCE.serializer(), string2));
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                            }
                        }
                        java.lang.String string3 = savedInstanceState.getString(KEY_CUSTOMER_RESPONSE);
                        if (string3 != null) {
                            java.lang.Object obj5 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                            if (obj5 != null) {
                                java.util.Map<java.lang.Object, java.lang.Object> sessionMap3 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj5).getSessionMap();
                                kotlin.reflect.KClass orCreateKotlinClass3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class);
                                kotlinx.serialization.json.Json json3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                                json3.getSerializersModule();
                                sessionMap3.put(orCreateKotlinClass3, json3.decodeFromString(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.INSTANCE.serializer(), string3));
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                            }
                        }
                    }
                    setContentView(com.ingo.sdk.android.R.layout.ingo_activity);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.location.LocationProvider");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
        com.ingo.sdk.android.ux.activity.IngoSdkActivity ingoSdkActivity = this;
        isFundingDestinationNameDisplayed.theme(new com.ingo.sdk.kotlin.ux.IngoSdkTheme(new com.ingo.sdk.kotlin.ux.IngoSdkColorTheme(colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_primary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_secondary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_tertiary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_background)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_secondary_background)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_primary_inverse_text)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_alert)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_light_error))), new com.ingo.sdk.kotlin.ux.IngoSdkColorTheme(colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_primary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_secondary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_tertiary)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_background)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_secondary_background)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_primary_inverse_text)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_alert)), colorIntToThemeHex(androidx.core.content.ContextCompat.getColor(ingoSdkActivity, com.ingo.sdk.android.R.color.ingo_sdk_theme_dark_error)))));
        com.ingo.sdk.kotlin.common.IngoSdkConfiguration build2 = isFundingDestinationNameDisplayed.build();
        androidx.appcompat.app.AppCompatDelegate create2 = androidx.appcompat.app.AppCompatDelegate.create(this, (androidx.appcompat.app.AppCompatCallback) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        if (!getIntent().getBooleanExtra(IS_DARK_MODE_ALLOWED, true)) {
        }
        com.ingo.sdk.kotlin.ux.IngoSdkKt.initializeIngoSdk(build2);
        java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState());
        mutableMap2.putAll(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class), create2), new kotlin.Pair(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.android.ux.EdgeToEdgeProvider.class), edgeToEdgeProvider)));
        com.ingo.sdk.kotlin.ux.IngoCoreKt.setIngoApplicationState(mutableMap2);
        obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj == null) {
        }
    }

    public final java.lang.String colorIntToThemeHex(int i) {
        return "#".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i)));
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "INGO ACTIVITY ON SAVE INSTANCE STATE!!!", null, 2, null);
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
            if (configurationResponse != null) {
                kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                json.getSerializersModule();
                java.lang.String encodeToString = json.encodeToString(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.INSTANCE.serializer(), configurationResponse);
                outState.putString(KEY_CONFIGURATION_RESPONSE, encodeToString);
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Encoded: ".concat(java.lang.String.valueOf(encodeToString)), null, 2, null);
            }
            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj2 != null) {
                com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse = (com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse) ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).getSessionMap().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.class));
                if (ocrResponse != null) {
                    kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json2.getSerializersModule();
                    java.lang.String encodeToString2 = json2.encodeToString(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.INSTANCE.serializer(), ocrResponse);
                    outState.putString(KEY_OCR_RESPONSE, encodeToString2);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Encoded: ".concat(java.lang.String.valueOf(encodeToString2)), null, 2, null);
                }
                java.lang.Object obj3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                if (obj3 != null) {
                    java.lang.Object obj4 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj3).getSessionMap().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class));
                    com.ingo.sdk.kotlin.common.features.customer.model.Account account = obj4 instanceof com.ingo.sdk.kotlin.common.features.customer.model.Account ? (com.ingo.sdk.kotlin.common.features.customer.model.Account) obj4 : null;
                    if (account != null) {
                        kotlinx.serialization.json.Json json3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                        json3.getSerializersModule();
                        outState.putString(KEY_ACCOUNT, json3.encodeToString(com.ingo.sdk.kotlin.common.features.customer.model.Account.INSTANCE.serializer(), account));
                    }
                    java.lang.Object obj5 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                    if (obj5 != null) {
                        com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj5).customerResponse();
                        if (customerResponse != null) {
                            kotlinx.serialization.json.Json json4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                            json4.getSerializersModule();
                            outState.putString(KEY_CUSTOMER_RESPONSE, json4.encodeToString(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.INSTANCE.serializer(), customerResponse));
                            return;
                        }
                        return;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "INGO SDK ACTIVITY DESTROYED!!!", null, 2, null);
        deleteDirectory(getSelfieDirectory());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "IngoSdkActivity received new intent! This is an error and indicates the hosting application launched an IngoSdkActivity intent even though the Ingo SDK is already running at the top of the stack!", null, null, 6, null);
    }

    @Override // com.ingo.sdk.android.common.core.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.AppForeground, com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.AppBackground, com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    @Override // com.ingo.sdk.android.common.core.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ingo.sdk.android.common.core.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ingo.sdk.android.common.core.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
