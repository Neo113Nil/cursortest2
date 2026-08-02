package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public final class c {

    public enum n {
        TOUCH_EVENT("te"),
        FORCE("f"),
        RADIUS("r"),
        TOUCH_LOCATION_X("x"),
        TOUCH_LOCATION_Y("y"),
        EVENT_TYPE("ty"),
        TOUCH_COUNT("tc"),
        START_TIME("st"),
        END_TIME("et"),
        SCREEN_NAME("s_n"),
        REASON("res"),
        MAXIMUM_PRECISION("10000000d"),
        UNINITIALIZED_TIME("-1000"),
        MAXIMUM_EVENT_COUNT("750"),
        MAXIMUM_TIME_ALLOWED("3000"),
        MAXIMUM_GESTURE_TIME("2000"),
        MAXIMUM_TOUCH_COUNT("5"),
        MAXIMUM_GESTURE_EVENT_COUNT("100");

        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String e() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final long d() {
            return java.lang.Long.parseLong(this.getHighSpeedVideoFpsRanges);
        }

        public enum a {
            INIT(0),
            INACTIVE(1),
            ACTIVE(2);

            private final int getHighSpeedVideoSizes;

            public final int b() {
                return this.getHighSpeedVideoSizes;
            }

            a(int i) {
                this.getHighSpeedVideoSizes = i;
            }
        }

        public enum b {
            FINGER_DOWN(1),
            FINGER_MOVE(2),
            FINGER_UP(3);

            private final int Camera2StreamConfigurationMap;

            public final int b() {
                return this.Camera2StreamConfigurationMap;
            }

            b(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$n$c, reason: collision with other inner class name */
        public enum EnumC0226c {
            TIMER_LIMIT(1),
            EVENT_LIMIT(2),
            GESTURE_LIMIT(3),
            COLLECTANDSUBMIT_TRIGGERED(4);

            private final int getHighResolutionOutputSizeshNQ4ISI;

            public final int b() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            EnumC0226c(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }
        }

        public final int c() {
            return java.lang.Integer.parseInt(this.getHighSpeedVideoFpsRanges);
        }

        public final double b() {
            return java.lang.Double.parseDouble(this.getHighSpeedVideoFpsRanges);
        }

        n(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f6933a = "pairing_id";
        public static final java.lang.String b = "correlation-id";
        public static final java.lang.String c = "Set-Cookie";
        public static final java.lang.String d = "Cookie";
        public static final java.lang.String e = "beacon_cookie";
        public static final java.lang.String f = "";
        public static final java.lang.String g = "Android";
        public static final java.lang.String h = "misc";
        public static final java.lang.String i = "Activity";
        public static final java.lang.String j = "No Source";
        public static final long n = 1000;
        public static final int s = 1000;
        public static final int w = 10;
        public static final int x = 10;
        public static final int y = 60000;
        public static final int z = 256;

        public enum e {
            ATOMODEL_MESSAGE(104),
            WEBVIEW_MESSAGE(95),
            GSFID_MESSAGE(70),
            CORE_CPUINFO_MESSAGE(90),
            KNOWNAPPS_MESSAGE(23),
            TOUCHWORKER_MESSAGE(25),
            RAMP_FETCH_COMPLETE(300),
            REMOTE_FETCH_COMPLETE(400);

            private final int Camera2StreamConfigurationMap;

            public static lib.android.paypal.com.magnessdk.c.b.e a(int i) {
                lib.android.paypal.com.magnessdk.c.b.e eVar = ATOMODEL_MESSAGE;
                if (i == eVar.b()) {
                    return eVar;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar2 = WEBVIEW_MESSAGE;
                if (i == eVar2.b()) {
                    return eVar2;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar3 = GSFID_MESSAGE;
                if (i == eVar3.b()) {
                    return eVar3;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar4 = KNOWNAPPS_MESSAGE;
                if (i == eVar4.b()) {
                    return eVar4;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar5 = TOUCHWORKER_MESSAGE;
                if (i == eVar5.b()) {
                    return eVar5;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar6 = RAMP_FETCH_COMPLETE;
                if (i == eVar6.b()) {
                    return eVar6;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar7 = REMOTE_FETCH_COMPLETE;
                if (i == eVar7.b()) {
                    return eVar7;
                }
                lib.android.paypal.com.magnessdk.c.b.e eVar8 = CORE_CPUINFO_MESSAGE;
                if (i == eVar8.b()) {
                    return eVar8;
                }
                return null;
            }

            public final int b() {
                return this.Camera2StreamConfigurationMap;
            }

            e(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        public enum a {
            MOBILE("MOBILE"),
            WIFI("WIFI"),
            VPN("VPN"),
            BLUETOOTH("Bluetooth Tethering"),
            WIFI_AWARE("WIFI AWARE"),
            LOWPAN("LOW PAN"),
            ETHERNET("Ethernet");

            private final java.lang.String getHighSpeedVideoSizes;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoSizes;
            }

            a(java.lang.String str) {
                this.getHighSpeedVideoSizes = str;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$b, reason: collision with other inner class name */
        public enum EnumC0219b {
            ERROR_DETAILS("ed"),
            FIELD("field"),
            ISSUE(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE),
            LOCATION("location");

            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            EnumC0219b(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$c, reason: collision with other inner class name */
        public enum EnumC0220c {
            RESPONSE_ERROR("RESPONSE_ERROR_"),
            NETWORK_EXCEPTION("NETWORK_EXCEPTION"),
            NO_DEBUGID_ERROR("NO_DEBUG_ID_PRESENT_ERROR");

            private final java.lang.String Camera2StreamConfigurationMap;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.Camera2StreamConfigurationMap;
            }

            EnumC0220c(java.lang.String str) {
                this.Camera2StreamConfigurationMap = str;
            }
        }

        public enum d {
            MAIN("main"),
            SENSOR(lib.android.paypal.com.magnessdk.g.n2),
            TOUCH(lib.android.paypal.com.magnessdk.g.q2),
            TELEMETRY(lib.android.paypal.com.magnessdk.g.p2),
            OBAMMODEL("obam"),
            ERROR("e");

            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            d(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
            }
        }

        public enum f {
            CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
            APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");

            private final java.lang.String getHighSpeedVideoSizes;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoSizes;
            }

            f(java.lang.String str) {
                this.getHighSpeedVideoSizes = str;
            }
        }

        private b() {
        }
    }

    public enum d {
        ANDROID_ID(a.b.l),
        APP_FIRST_INSTALL_TIME("app_first_install_time"),
        APP_GUID(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.APP_GUID),
        APP_ID("app_id"),
        APP_LAST_UPDATE_TIME("app_last_update_time"),
        APP_VERSION(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION),
        COMP_VERSION("comp_version"),
        CONF_URL("conf_url"),
        CPU("cpu"),
        DEVICE_MODEL("device_model"),
        DEVICE_NAME(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME),
        DISK("disk"),
        EMULATOR_FLAGS("ef"),
        GSF_ID("gsf_id"),
        IN_TREATMENT("t"),
        IS_EMULATOR("is_emulator"),
        IS_ROOTED("is_rooted"),
        MAC_ADDRS("mac_addrs"),
        MAGNES_GUID("magnes_guid"),
        MAGNES_SOURCE("magnes_source"),
        NOT_COLLECTIBLE_LIST("nc"),
        NOTIF_TOKEN("notif_token"),
        OS_TYPE("os_type"),
        OS_VERSION("os_version"),
        PAYLOAD_TYPE("payload_type"),
        ROOTED_FLAGS("rf"),
        SCREEN("screen"),
        SENSOR_METADATA("smd"),
        SMS_ENABLED("sms_enabled"),
        SOURCE_APP_VERSION("source_app_version"),
        SYSTEM("system"),
        T("t"),
        TOTAL_STORAGE_SPACE("total_storage_space"),
        USER_AGENT("user_agent");

        private final java.lang.String getHighSpeedVideoFpsRanges;

        public enum a {
            CORES("cores"),
            MAX_FREQUENCY("maxFreq"),
            MIN_FREQUENCY("minFreq");

            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            a(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }
        }

        public enum b {
            TOTAL_SD("total_sd"),
            TOTAL_UD("total");

            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            b(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$c, reason: collision with other inner class name */
        public enum EnumC0222c {
            ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
            ANDROID_X86("android_x86"),
            ANDY("andy"),
            ANDY_OS("AndyOS"),
            ANDY_OSX("AndyOSX"),
            DRIOD_4X("Driod4X"),
            DROID_4X("Droid4X"),
            GENERIC("generic"),
            GENERIC_X86("generic_x86"),
            GENY_MOTION("Genymotion"),
            GOLDFISH("goldfish"),
            GOODLE_SDK("google_sdk"),
            SDK("sdk"),
            UNKNOWN("unknown"),
            VBOX_86("vbox86"),
            VBOX_86P("vbox86p"),
            RANCHU("ranchu"),
            REMIXEMU("remixemu"),
            SAMSUNG(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG),
            TTVM_X86("ttVM_x86");

            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRanges;
            }

            EnumC0222c(java.lang.String str) {
                this.getHighSpeedVideoFpsRanges = str;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$d, reason: collision with other inner class name */
        public enum EnumC0223d {
            DENSITY("density"),
            DENSITY_DPI("densityDpi"),
            HEIGHT("height"),
            SCALE("scale"),
            WIDTH("width"),
            BRIGHTNESS("brightness"),
            X_DPI("xdpi"),
            Y_DPI("ydpi");

            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            EnumC0223d(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }
        }

        public enum e {
            FIFO_MAX_EVENT_COUNT("mec"),
            MAX_RANGE("mr"),
            NAME("n"),
            POWER("pwr"),
            RESOLUTION("re"),
            VENDOR("v"),
            VERSION("ver");

            private final java.lang.String getHighSpeedVideoSizes;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoSizes;
            }

            e(java.lang.String str) {
                this.getHighSpeedVideoSizes = str;
            }
        }

        public enum f {
            VERSION("version"),
            BOARD("board"),
            BOOTLOADER("bootloader"),
            CPU_ABI1("cpu_abi1"),
            DISPLAY(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION),
            RADIO("radio"),
            FINGERPRINT(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Fingerprint),
            HARDWARE("hardware"),
            MANUFACTURER("manufacturer"),
            PRODUCT("product"),
            TIME("time"),
            SYSTEM_TYPE("system_type");

            private final java.lang.String getHighSpeedVideoSizes;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoSizes;
            }

            f(java.lang.String str) {
                this.getHighSpeedVideoSizes = str;
            }
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }

        d(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    public enum e {
        BASE_STATION_ID("base_station_id"),
        BATTERY("battery"),
        BSSID("bssid"),
        BSSID_ARRAY("bssid_array"),
        C("c"),
        CDMA_NETWORK_ID("cdma_network_id"),
        CDMA_SYSTEM_ID("cdma_system_id"),
        CELL_ID("cell_id"),
        CONF_VERSION("conf_version"),
        CONN_TYPE("conn_type"),
        DC_ID("dc_id"),
        DEVICE_ID("device_id"),
        DEVICE_UPTIME("device_uptime"),
        DISK("disk"),
        DS("ds"),
        IP_ADDRESSES("ip_addresses"),
        IP_ADDRS("ip_addrs"),
        IS_DEV_MODE_ON("dmo"),
        KNOWN_APPS("known_apps"),
        LINKER_ID("linker_id"),
        LOCALE_COUNTRY("locale_country"),
        LOCALE_LANG("locale_lang"),
        LOCATION("location"),
        LOCATION_AREA_CODE("location_area_code"),
        MEMORY("memory"),
        MG_ID("mg_id"),
        NETWORK_OPERATOR("network_operator"),
        PHONE_TYPE("phone_type"),
        PL("pl"),
        PROXY_SETTING("proxy_setting"),
        RISK_COMP_SESSION_ID("risk_comp_session_id"),
        ROAMING("roaming"),
        SCREEN("screen"),
        SERIAL_NUMBER("serial_number"),
        SIM_OPERATOR_NAME("sim_operator_name"),
        SIM_SERIAL_NUMBER("sim_serial_number"),
        SR(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.SR_TRACK_NAME),
        SSID("ssid"),
        SUBSCRIBER_ID("subscriber_id"),
        T("t"),
        TIMESTAMP("timestamp"),
        TZ("tz"),
        TZ_NAME("tz_name"),
        VPN_SETTING("VPN_setting"),
        FLOW_NAME("fn");

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public enum a {
            CURRENT("current"),
            LEVEL("level"),
            METHOD("method"),
            LOW_POWER("low_power"),
            STATE("state"),
            TEMP("temp"),
            VOLTAGE("voltage");

            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRanges;
            }

            a(java.lang.String str) {
                this.getHighSpeedVideoFpsRanges = str;
            }
        }

        public enum b {
            FREE_SD("free_sd"),
            FREE_UD("free"),
            MOUNTED("mounted");

            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            b(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$e$c, reason: collision with other inner class name */
        public enum EnumC0224c {
            FREE("free"),
            FREE_RUNTIME("free_runtime"),
            MAX_RUNTIME("max_runtime"),
            TOTAL("total"),
            TOTAL_RUNTIME("total_runtime");

            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            EnumC0224c(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
            }
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        e(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    public enum h {
        NETWORKING;

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public enum d {
            GET_REQUEST_STARTED(50),
            GET_REQUEST_ERROR(51),
            GET_REQUEST_SUCCEEDED(52),
            POST_REQUEST_STARTED(53),
            POST_REQUEST_ERROR(54),
            POST_REQUEST_SUCCEEDED(55),
            HTTP_STATUS_FAILED(-1),
            HTTP_STATUS_200(200);

            private final int Camera2StreamConfigurationMap;

            public static lib.android.paypal.com.magnessdk.c.h.d a(int i) {
                lib.android.paypal.com.magnessdk.c.h.d dVar = GET_REQUEST_STARTED;
                if (i == dVar.b()) {
                    return dVar;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar2 = GET_REQUEST_ERROR;
                if (i == dVar2.b()) {
                    return dVar2;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar3 = GET_REQUEST_SUCCEEDED;
                if (i == dVar3.b()) {
                    return dVar3;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar4 = POST_REQUEST_STARTED;
                if (i == dVar4.b()) {
                    return dVar4;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar5 = POST_REQUEST_ERROR;
                if (i == dVar5.b()) {
                    return dVar5;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar6 = POST_REQUEST_SUCCEEDED;
                if (i == dVar6.b()) {
                    return dVar6;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar7 = HTTP_STATUS_FAILED;
                if (i == dVar7.b()) {
                    return dVar7;
                }
                lib.android.paypal.com.magnessdk.c.h.d dVar8 = HTTP_STATUS_200;
                if (i == dVar8.b()) {
                    return dVar8;
                }
                return null;
            }

            public final int b() {
                return this.Camera2StreamConfigurationMap;
            }

            d(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        public enum a {
            HTTP_CONNECT_TIMEOUT(60000),
            HTTP_READ_TIMEOUT(60000),
            READ_BYTE(1024);

            private final int Camera2StreamConfigurationMap;

            public final int b() {
                return this.Camera2StreamConfigurationMap;
            }

            a(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        /* loaded from: classes17.dex */
        public enum b {
            MAIN(0),
            MG(1),
            MG_AUDIT(-1);

            private final int getHighResolutionOutputSizeshNQ4ISI;

            public final int b() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            b(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$h$c, reason: collision with other inner class name */
        public enum EnumC0225c {
            POST("POST"),
            GET("GET");

            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            EnumC0225c(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
            }
        }

        public enum e {
            AUDIT_JSON_URL(lib.android.paypal.com.magnessdk.a.e),
            DEVICE_INFO_URL(lib.android.paypal.com.magnessdk.a.k),
            PRODUCTION_BEACON_URL(lib.android.paypal.com.magnessdk.a.l),
            PRODUCTION_JSON_URL(lib.android.paypal.com.magnessdk.a.n),
            RAMP_CONFIG_URL(lib.android.paypal.com.magnessdk.a.f6932o),
            REMOTE_CONFIG_URL(lib.android.paypal.com.magnessdk.a.p),
            SANDBOX_DEVICE_INFO_URL(lib.android.paypal.com.magnessdk.a.r),
            SANDBOX_AUDIT_JSON_URL(lib.android.paypal.com.magnessdk.a.q),
            SANDBOX_PROD_JSON_URL(lib.android.paypal.com.magnessdk.a.t),
            STAGE_DEVICE_INFO_URL(lib.android.paypal.com.magnessdk.a.v),
            STAGE_AUDIT_JSON_URL(lib.android.paypal.com.magnessdk.a.u),
            STAGE_PROD_JSON_URL(lib.android.paypal.com.magnessdk.a.x),
            PRODUCTION_ERROR_URL(lib.android.paypal.com.magnessdk.a.m),
            STAGE_ERROR_URL(lib.android.paypal.com.magnessdk.a.w),
            SANDBOX_ERROR_URL(lib.android.paypal.com.magnessdk.a.s);

            private final java.lang.String getHighSpeedVideoSizes;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoSizes;
            }

            e(java.lang.String str) {
                this.getHighSpeedVideoSizes = str;
            }
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        h() {
            this.getHighSpeedVideoFpsRangesFor = r3;
        }
    }

    public enum k {
        KNOWN_ROOT_APPS_PACKAGES("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"),
        SU_PATHS("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/xbin/daemonsu/", "/system/etc/init.d/99SuperSUDaemon/", "/system/bin/.ext/.su/", "/system/etc/.has_su_daemon/", "/system/etc/.installed_su_daemon/", "/cache/", "/data/", "/dev/");

        private final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;

        public enum b {
            NUMBER_OF_ROOTED_FLAGS(7),
            IS_TEST_KEYS_FOUND(0),
            IS_SU_FOUND(1),
            IS_SUPER_USER_APK_FOUND(2),
            DETECT_ROOT_MANAGEMENT_APPS(3),
            CHECK_FOR_BINARY_SU(4),
            CHECK_FOR_BINARY_BUSYBOX(5),
            CHECK_FOR_BINARY_MAGISK(6);

            private final int Camera2StreamConfigurationMap;

            public static lib.android.paypal.com.magnessdk.c.k.b a(int i) {
                lib.android.paypal.com.magnessdk.c.k.b bVar = IS_TEST_KEYS_FOUND;
                if (i == bVar.b()) {
                    return bVar;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar2 = IS_SU_FOUND;
                if (i == bVar2.b()) {
                    return bVar2;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar3 = IS_SUPER_USER_APK_FOUND;
                if (i == bVar3.b()) {
                    return bVar3;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar4 = DETECT_ROOT_MANAGEMENT_APPS;
                if (i == bVar4.b()) {
                    return bVar4;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar5 = CHECK_FOR_BINARY_SU;
                if (i == bVar5.b()) {
                    return bVar5;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar6 = CHECK_FOR_BINARY_BUSYBOX;
                if (i == bVar6.b()) {
                    return bVar6;
                }
                lib.android.paypal.com.magnessdk.c.k.b bVar7 = CHECK_FOR_BINARY_MAGISK;
                if (i == bVar7.b()) {
                    return bVar7;
                }
                return null;
            }

            public final int b() {
                return this.Camera2StreamConfigurationMap;
            }

            b(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        public enum a {
            SU("su"),
            BUSYBOX("busybox"),
            MAGISK("magisk");

            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            a(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
            }
        }

        public final java.lang.String[] b() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        k(java.lang.String... strArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = strArr;
        }
    }

    public enum a {
        AUDIT_KEY("audit"),
        FEATURE("type"),
        PAYLOAD("payload"),
        SENSOR_TYPE("t"),
        SENSOR_PAYLOAD("p");

        private final java.lang.String Camera2StreamConfigurationMap;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.Camera2StreamConfigurationMap;
        }

        a(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }
    }

    /* renamed from: lib.android.paypal.com.magnessdk.c$c, reason: collision with other inner class name */
    public enum EnumC0221c {
        RAMP("ramp"),
        REMOTE("remote");

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        EnumC0221c(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum g {
        NAME("n"),
        DERIVATIONS("d"),
        REASON("r"),
        SCORE(lib.android.paypal.com.magnessdk.g.n2);

        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }

        g(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    public enum i {
        OPEN("o"),
        EXCLUDED("e"),
        MIN_VERSION("m"),
        RAMP_THRESHOLD("r"),
        APP_IDS("ai"),
        APP_SOURCES("as"),
        PROD_ENDPOINT("ep"),
        CONF_REFRESH_TIME_KEY("cr_ti");

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        i(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    public enum j {
        CONF_VERSION("conf_version"),
        CONF_ENDPOINT_URL("endpoint_url"),
        CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
        ANDROID_APPS_TO_CHECK("android_apps_to_check"),
        NOT_COLLECTABLE("nc"),
        MG_ID("m"),
        UA_REFRESH_TIME_KEY("ua_refresh_time_interval"),
        SENSOR_FREQUENCY_RATE(lib.android.paypal.com.magnessdk.g.n2),
        SENSOR_COLLECT_TIME("st");

        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }

        j(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    public enum l {
        AC("ac"),
        GY("gy"),
        MG("mg");

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        l(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum m {
        FLIGHT_TIME("flightTime"),
        TELEMETRY_EVENTS("Events"),
        TYPING_SPEED(lib.android.paypal.com.magnessdk.g.p2),
        VIEW_ID(com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY),
        AUTO_COMPLETE_EVENT("wsac"),
        BACKSPACE_EVENT("wsbs"),
        CUT_EVENT("wsct"),
        PRE_FILLED_EVENT("wspf"),
        REGULAR_TYPING_EVENT("wsrt"),
        FAILED_TO_CONVERT_TO_JSON("Failed to convert to JSON");

        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }

        m(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    static class f {
        static final java.lang.String[] getHighSpeedVideoFpsRanges = {"com.bignox.appcenter", "com.bluestacks.settings", "com.bluestacks.filemanager", "com.genymotion.superuser", "org.greatfruit.andy.ime", "com.kaopu001.tiantianserver", "com.tiantian.ime", "com.microvirt.installer", "com.android.ld.appstore", "com.ldmnq.launcher3", "com.jide.Appstore"};
        static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"init.android_x86.rc", "ueventd.android_x86.rc", "fstab.android_x86", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "ueventd.android_x86_64.rc", "init.android_x86_64.rc", "init.superuser.rc"};
        static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"fstab.goldfish", "init.goldfish.rc"};
        static final java.lang.String[] getHighSpeedVideoSizes = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace"};
        static final java.lang.String[] Camera2StreamConfigurationMap = {"/system/bin/qemu-props"};
        static final java.lang.String[] getInputFormats = {"/dev/socket/qemud", "/dev/qemu_pipe"};
        static final java.lang.String[] getHighSpeedVideoSizesFor = {"goldfish"};
        static final java.lang.String[] getOutputMinFrameDuration = {"init.remixos.rc", "init.andy.rc", "ueventd.andy.rc", "bin/genybaseband", "bin/genymotion-vbox-sf", "ueventd.nox.rc", "init.nox.rc", "/system/bin/noxd"};
        static final java.lang.String[] getInputSizeshNQ4ISI = {"init.ranchu.rc"};

        /* loaded from: classes17.dex */
        static final class a {
            private a() {
            }
        }

        private f() {
        }
    }

    private c() {
    }
}
