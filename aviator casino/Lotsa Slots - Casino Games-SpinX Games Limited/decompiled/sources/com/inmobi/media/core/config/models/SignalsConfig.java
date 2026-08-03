package com.inmobi.media.core.config.models;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\b01234567B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0011H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\tJ\u0006\u0010*\u001a\u00020\u000bJ\u0006\u0010+\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u0006\u0010.\u001a\u00020\u0011J\u0006\u0010/\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "ice", "Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "ext", "Lorg/json/JSONObject;", "unifiedIdServiceConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "novatiqConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "session", "Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", com.ironsource.Gb.b, "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "kA", "", "vAK", "", "lowMemoryFreq", "getLowMemoryFreq", "()I", "setLowMemoryFreq", "(I)V", "bts", "Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "getBts", "()Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "setBts", "(Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;)V", org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, "Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "getPurchases", "()Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "setPurchases", "(Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;)V", "getType", "isValid", "", "getIceConfig", "getUnifiedIdServiceConfig", "getNovatiqConfig", "getPublisherConfig", "getSessionConfig", "getExt", "getAK", "getAKV", "IceConfig", "CellIceConfig", "NovatiqConfig", "UnifiedIdServiceConfig", "PublisherConfig", "SessionConfig", "Purchases", "BootTimeConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignalsConfig extends com.inmobi.media.core.config.models.Config {
    private org.json.JSONObject ext;
    private com.inmobi.media.core.config.models.SignalsConfig.IceConfig ice = new com.inmobi.media.core.config.models.SignalsConfig.IceConfig();
    private com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = new com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig();
    private com.inmobi.media.core.config.models.SignalsConfig.NovatiqConfig novatiqConfig = new com.inmobi.media.core.config.models.SignalsConfig.NovatiqConfig();
    private com.inmobi.media.core.config.models.SignalsConfig.SessionConfig session = new com.inmobi.media.core.config.models.SignalsConfig.SessionConfig();
    private com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisher = new com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig();
    private java.lang.String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
    private com.inmobi.media.core.config.models.SignalsConfig.BootTimeConfig bts = new com.inmobi.media.core.config.models.SignalsConfig.BootTimeConfig();
    private com.inmobi.media.core.config.models.SignalsConfig.Purchases purchases = new com.inmobi.media.core.config.models.SignalsConfig.Purchases();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "maxEntries", "", "getMaxEntries", "()I", "threshold", "getThreshold", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = 120;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "", "<init>", "()V", "cof", "", "getCof", "()I", "setCof", "(I)V", "vce", "", "getVce", "()Z", "setVce", "(Z)V", "cce", "getCce", "setCce", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z) {
            this.cce = z;
        }

        public final void setCof(int i) {
            this.cof = i;
        }

        public final void setVce(boolean z) {
            this.vce = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "", "<init>", "()V", "locationEnabled", "", "sessionEnabled", "c", "Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "isLocationEnabled", "isSessionEnabled", "getCellOperatorFlag", "", "isVisibleCellTowerEnabled", "isConnectedCellTowerEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IceConfig {
        private com.inmobi.media.core.config.models.SignalsConfig.CellIceConfig c = new com.inmobi.media.core.config.models.SignalsConfig.CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.c.getCce();
        }

        /* renamed from: isLocationEnabled, reason: from getter */
        public final boolean getLocationEnabled() {
            return this.locationEnabled;
        }

        /* renamed from: isSessionEnabled, reason: from getter */
        public final boolean getSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.c.getVce();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "", "<init>", "()V", "value", "", "isNovatiqEnabled", "()Z", "setNovatiqEnabled", "(Z)V", "", "", "carrierNames", "getCarrierNames", "()Ljava/util/List;", "setCarrierNames", "(Ljava/util/List;)V", "beaconUrl", "getBeaconUrl", "()Ljava/lang/String;", "setBeaconUrl", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;
        private java.util.List<java.lang.String> carrierNames = kotlin.collections.CollectionsKt.emptyList();
        private java.lang.String beaconUrl = "https://spadsync.com/sync";

        public final java.lang.String getBeaconUrl() {
            return this.beaconUrl;
        }

        public final java.util.List<java.lang.String> getCarrierNames() {
            return this.carrierNames;
        }

        /* renamed from: isNovatiqEnabled, reason: from getter */
        public final boolean getIsNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        public final void setBeaconUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.beaconUrl = str;
        }

        public final void setCarrierNames(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.carrierNames = list;
        }

        public final void setNovatiqEnabled(boolean z) {
            this.isNovatiqEnabled = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0006!\"#$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "", "<init>", "()V", "enableMCO", "", "getEnableMCO", "()Z", "enableAB", "getEnableAB", "generalKeys", "", "", "adSpecificKeys", "payloadSize", "", "getPayloadSize", "()I", "auto", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "getAuto", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "obj", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "getObj", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef.DIRECT, "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getDirect", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getGeneralKeys", "", "getAdSpecificKeys", "DirectInputData", "ObjInputData", "AutoInputData", "BaseInputData", "KeyData", "DepthData", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        private final java.util.Map<java.lang.String, java.lang.String> generalKeys = new java.util.LinkedHashMap();
        private final java.util.Map<java.lang.String, java.lang.String> adSpecificKeys = new java.util.LinkedHashMap();
        private final int payloadSize = 6000;
        private final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.AutoInputData auto = new com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.AutoInputData();
        private final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.ObjInputData obj = new com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.ObjInputData();
        private final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DirectInputData direct = new com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DirectInputData();

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeys", "()Ljava/util/Map;", "incompatibleSdkVer", "", "getIncompatibleSdkVer", "()Ljava/util/List;", "topic", "getTopic", "()Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AutoInputData extends com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.BaseInputData {
            private final java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeys = new java.util.LinkedHashMap();
            private final java.util.List<java.lang.String> incompatibleSdkVer = kotlin.collections.CollectionsKt.emptyList();
            private final java.lang.String topic = "";

            public final java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            public final java.util.List<java.lang.String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            public final java.lang.String getTopic() {
                return this.topic;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", com.helpshift.proactive.InAppViewConstants.EXPIRY, "", "getExpiry", "()I", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "getCount", "precision", "getPrecision", "strLen", "getStrLen", "depth", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "getDepth", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;
            private final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DepthData depth = new com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DepthData();

            public final int getCount() {
                return this.count;
            }

            public final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "getAllowedKeys", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DirectInputData extends com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.BaseInputData {
            private final java.util.Map<java.lang.String, java.lang.String> allowedKeys = new java.util.LinkedHashMap();

            public final java.util.Map<java.lang.String, java.lang.String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "type", "getType", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeyData {
            private final java.lang.String name = "";
            private final java.lang.String type = "";

            public final java.lang.String getName() {
                return this.name;
            }

            public final java.lang.String getType() {
                return this.type;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeysAnd", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeysAnd", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ObjInputData extends com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.BaseInputData {
            private final java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = new java.util.LinkedHashMap();

            public final java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        public final java.util.Map<java.lang.String, java.lang.String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.AutoInputData getAuto() {
            return this.auto;
        }

        public final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "", "<init>", "()V", "inapp", "", "getInapp", "()Z", "setInapp", "(Z)V", "versionList", "", "", "getVersionList", "()Ljava/util/List;", "setVersionList", "(Ljava/util/List;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Purchases {
        private boolean inapp;
        private java.util.List<java.lang.String> versionList = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.android.billingclient.BuildConfig.VERSION_NAME, "7.1.0", "7.1.1"});

        public final boolean getInapp() {
            return this.inapp;
        }

        public final java.util.List<java.lang.String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z) {
            this.inapp = z;
        }

        public final void setVersionList(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.versionList = list;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", "", "<init>", "()V", "control", "", "", "getSigControlList", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SessionConfig {
        private java.util.List<java.lang.Integer> control = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 1, 2, 3, 4, 5, 6});

        public final java.util.List<java.lang.Integer> getSigControlList() {
            return this.control;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "", "<init>", "()V", "enabled", "", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "maxRetries", "", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "retryInterval", "getRetryInterval", "setRetryInterval", "timeout", "getTimeout", "setTimeout", "isEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        private java.lang.String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return android.webkit.URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i) {
            this.maxRetries = i;
        }

        public final void setRetryInterval(int i) {
            this.retryInterval = i;
        }

        public final void setTimeout(int i) {
            this.timeout = i;
        }

        public final void setUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    /* renamed from: getAK, reason: from getter */
    public final java.lang.String getKA() {
        return this.kA;
    }

    /* renamed from: getAKV, reason: from getter */
    public final int getVAK() {
        return this.vAK;
    }

    public final com.inmobi.media.core.config.models.SignalsConfig.BootTimeConfig getBts() {
        return this.bts;
    }

    public final org.json.JSONObject getExt() {
        return this.ext;
    }

    /* renamed from: getIceConfig, reason: from getter */
    public final com.inmobi.media.core.config.models.SignalsConfig.IceConfig getIce() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    public final com.inmobi.media.core.config.models.SignalsConfig.NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    /* renamed from: getPublisherConfig, reason: from getter */
    public final com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig getPublisher() {
        return this.publisher;
    }

    public final com.inmobi.media.core.config.models.SignalsConfig.Purchases getPurchases() {
        return this.purchases;
    }

    /* renamed from: getSessionConfig, reason: from getter */
    public final com.inmobi.media.core.config.models.SignalsConfig.SessionConfig getSession() {
        return this.session;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public java.lang.String getType() {
        return "signals";
    }

    public final com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(com.inmobi.media.core.config.models.SignalsConfig.BootTimeConfig bootTimeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i) {
        this.lowMemoryFreq = i;
    }

    public final void setPurchases(com.inmobi.media.core.config.models.SignalsConfig.Purchases purchases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchases, "<set-?>");
        this.purchases = purchases;
    }
}
