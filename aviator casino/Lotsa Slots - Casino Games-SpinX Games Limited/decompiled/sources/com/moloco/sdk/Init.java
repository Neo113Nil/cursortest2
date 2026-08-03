package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class Init {

    public interface SDKInitResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAdServerUrl();

        com.google.protobuf.ByteString getAdServerUrlBytes();

        com.moloco.sdk.Init.SDKInitResponse.AdUnit getAdUnits(int i);

        int getAdUnitsCount();

        java.util.List<com.moloco.sdk.Init.SDKInitResponse.AdUnit> getAdUnitsList();

        java.lang.String getAppId();

        com.google.protobuf.ByteString getAppIdBytes();

        com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig getBidTokenConfig();

        com.moloco.sdk.ConfigsOuterClass.Configs getConfigs();

        java.lang.String getCountryIso2Code();

        com.google.protobuf.ByteString getCountryIso2CodeBytes();

        java.lang.String getCountryIso3Code();

        com.google.protobuf.ByteString getCountryIso3CodeBytes();

        com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig getCrashReportingConfig();

        com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig getDirectAdsConfig();

        com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig getEventCollectionConfig();

        com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag getExperimentalFeatureFlags(int i);

        int getExperimentalFeatureFlagsCount();

        java.util.List<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> getExperimentalFeatureFlagsList();

        com.moloco.sdk.Init.SDKInitResponse.Geo getGeo();

        com.moloco.sdk.Init.SDKInitResponse.ILRDConfig getIlrdConfig();

        com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig getOperationalMetricsConfig();

        java.lang.String getPlatformId();

        com.google.protobuf.ByteString getPlatformIdBytes();

        java.lang.String getPublisherId();

        com.google.protobuf.ByteString getPublisherIdBytes();

        com.moloco.sdk.Init.SDKInitResponse.Region getResolvedRegion();

        int getResolvedRegionValue();

        boolean getVerifyBannerVisible();

        boolean hasBidTokenConfig();

        boolean hasConfigs();

        boolean hasCrashReportingConfig();

        boolean hasDirectAdsConfig();

        boolean hasEventCollectionConfig();

        boolean hasGeo();

        boolean hasIlrdConfig();

        boolean hasOperationalMetricsConfig();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private Init() {
    }

    public static final class SDKInitResponse extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.Init.SDKInitResponse.Builder> implements com.moloco.sdk.Init.SDKInitResponseOrBuilder {
        public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
        public static final int AD_UNITS_FIELD_NUMBER = 4;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
        public static final int CONFIGS_FIELD_NUMBER = 16;
        public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
        public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
        public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
        private static final com.moloco.sdk.Init.SDKInitResponse DEFAULT_INSTANCE;
        public static final int DIRECT_ADS_CONFIG_FIELD_NUMBER = 18;
        public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
        public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
        public static final int GEO_FIELD_NUMBER = 10;
        public static final int ILRD_CONFIG_FIELD_NUMBER = 17;
        public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse> PARSER = null;
        public static final int PLATFORM_ID_FIELD_NUMBER = 8;
        public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
        public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
        public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
        private com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig_;
        private com.moloco.sdk.ConfigsOuterClass.Configs configs_;
        private com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig_;
        private com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig_;
        private com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig_;
        private com.moloco.sdk.Init.SDKInitResponse.Geo geo_;
        private com.moloco.sdk.Init.SDKInitResponse.ILRDConfig ilrdConfig_;
        private com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig_;
        private int resolvedRegion_;
        private boolean verifyBannerVisible_;
        private java.lang.String appId_ = "";
        private java.lang.String publisherId_ = "";
        private java.lang.String countryIso3Code_ = "";
        private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.Init.SDKInitResponse.AdUnit> adUnits_ = emptyProtobufList();
        private java.lang.String adServerUrl_ = "";
        private java.lang.String countryIso2Code_ = "";
        private java.lang.String platformId_ = "";
        private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlags_ = emptyProtobufList();

        public interface AdUnitOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            int getAdFrequency();

            float getBidFloor();

            java.lang.String getId();

            com.google.protobuf.ByteString getIdBytes();

            java.lang.String getName();

            com.google.protobuf.ByteString getNameBytes();

            com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native getNative();

            com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType getType();

            int getTypeValue();

            boolean hasNative();
        }

        public interface BidTokenConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getBidTokenUrl();

            com.google.protobuf.ByteString getBidTokenUrlBytes();
        }

        public interface CrashReportingConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getEnabled();

            java.lang.String getUrl();

            com.google.protobuf.ByteString getUrlBytes();
        }

        public interface DirectAdsConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getUrl();

            com.google.protobuf.ByteString getUrlBytes();
        }

        public interface EventCollectionConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getAppBackgroundTrackingUrl();

            com.google.protobuf.ByteString getAppBackgroundTrackingUrlBytes();

            java.lang.String getAppForegroundTrackingUrl();

            com.google.protobuf.ByteString getAppForegroundTrackingUrlBytes();

            boolean getEventCollectionEnabled();

            boolean getMrefCollectionEnabled();
        }

        public interface ExperimentalFeatureFlagOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getName();

            com.google.protobuf.ByteString getNameBytes();

            java.lang.String getValue();

            com.google.protobuf.ByteString getValueBytes();
        }

        public interface GeoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getCity();

            com.google.protobuf.ByteString getCityBytes();

            java.lang.String getCountryIso2Code();

            com.google.protobuf.ByteString getCountryIso2CodeBytes();

            java.lang.String getCountryIso3Code();

            com.google.protobuf.ByteString getCountryIso3CodeBytes();

            float getLatitude();

            float getLongitude();

            java.lang.String getRegion();

            com.google.protobuf.ByteString getRegionBytes();

            java.lang.String getZipCode();

            com.google.protobuf.ByteString getZipCodeBytes();
        }

        public interface ILRDConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getEnabled();

            int getMaxBatchSize();

            int getMaxSessionLen();

            java.lang.String getRawImpUrl();

            com.google.protobuf.ByteString getRawImpUrlBytes();

            int getRetryCount();

            int getSessionExp();

            com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks getSupportedNetworks(int i);

            int getSupportedNetworksCount();

            java.util.List<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> getSupportedNetworksList();

            int getSupportedNetworksValue(int i);

            java.util.List<java.lang.Integer> getSupportedNetworksValueList();

            int getUploadInterval();
        }

        public interface OperationalMetricsConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getEnabled();

            int getPollingIntervalSeconds();

            java.lang.String getUrl();

            com.google.protobuf.ByteString getUrlBytes();
        }

        private SDKInitResponse() {
        }

        public enum Region implements com.google.protobuf.Internal.EnumLite {
            UNKNOWN_REGION(0),
            US(1),
            ASIA(2),
            EU(3),
            LOCAL(4),
            UNIT(5),
            INDIA(6),
            UNRECOGNIZED(-1);

            public static final int ASIA_VALUE = 2;
            public static final int EU_VALUE = 3;
            public static final int INDIA_VALUE = 6;
            public static final int LOCAL_VALUE = 4;
            public static final int UNIT_VALUE = 5;
            public static final int UNKNOWN_REGION_VALUE = 0;
            public static final int US_VALUE = 1;
            private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.Region> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.Region>() { // from class: com.moloco.sdk.Init.SDKInitResponse.Region.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public com.moloco.sdk.Init.SDKInitResponse.Region findValueByNumber(int i) {
                    return com.moloco.sdk.Init.SDKInitResponse.Region.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.Init.SDKInitResponse.Region valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Region forNumber(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_REGION;
                    case 1:
                        return US;
                    case 2:
                        return ASIA;
                    case 3:
                        return EU;
                    case 4:
                        return LOCAL;
                    case 5:
                        return UNIT;
                    case 6:
                        return INDIA;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.Region> internalGetValueMap() {
                return internalValueMap;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.moloco.sdk.Init.SDKInitResponse.Region.RegionVerifier.INSTANCE;
            }

            private static final class RegionVerifier implements com.google.protobuf.Internal.EnumVerifier {
                static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.Init.SDKInitResponse.Region.RegionVerifier();

                private RegionVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return com.moloco.sdk.Init.SDKInitResponse.Region.forNumber(i) != null;
                }
            }

            Region(int i) {
                this.value = i;
            }
        }

        public enum SupportedNetworks implements com.google.protobuf.Internal.EnumLite {
            UNKNOWN(0),
            MAX(1),
            LEVEL_PLAY(2),
            UNRECOGNIZED(-1);

            public static final int LEVEL_PLAY_VALUE = 2;
            public static final int MAX_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks>() { // from class: com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks findValueByNumber(int i) {
                    return com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return MAX;
                }
                if (i != 2) {
                    return null;
                }
                return LEVEL_PLAY;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> internalGetValueMap() {
                return internalValueMap;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.SupportedNetworksVerifier.INSTANCE;
            }

            private static final class SupportedNetworksVerifier implements com.google.protobuf.Internal.EnumVerifier {
                static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.SupportedNetworksVerifier();

                private SupportedNetworksVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.forNumber(i) != null;
                }
            }

            SupportedNetworks(int i) {
                this.value = i;
            }
        }

        public static final class ExperimentalFeatureFlag extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder> implements com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder {
            private static final com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private java.lang.String name_ = "";
            private java.lang.String value_ = "";

            private ExperimentalFeatureFlag() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
            public java.lang.String getName() {
                return this.name_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
            public com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(java.lang.String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
            public java.lang.String getValue() {
                return this.value_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
            public com.google.protobuf.ByteString getValueBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.value_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(java.lang.String str) {
                str.getClass();
                this.value_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValueBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.value_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
                return DEFAULT_INSTANCE.createBuilder(experimentalFeatureFlag);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder> implements com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
                public java.lang.String getName() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).getName();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
                public com.google.protobuf.ByteString getNameBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).getNameBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder setName(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).setName(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder clearName() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).clearName();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).setNameBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
                public java.lang.String getValue() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).getValue();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder
                public com.google.protobuf.ByteString getValueBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).getValueBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder setValue(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).setValue(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder clearValue() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).clearValue();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder setValueBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) this.instance).setValueBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag = new com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag();
                DEFAULT_INSTANCE = experimentalFeatureFlag;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.class, experimentalFeatureFlag);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class EventCollectionConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig, com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder {
            public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
            public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
            private static final com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig DEFAULT_INSTANCE;
            public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
            public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig> PARSER;
            private java.lang.String appBackgroundTrackingUrl_ = "";
            private java.lang.String appForegroundTrackingUrl_ = "";
            private boolean eventCollectionEnabled_;
            private boolean mrefCollectionEnabled_;

            private EventCollectionConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public boolean getEventCollectionEnabled() {
                return this.eventCollectionEnabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEventCollectionEnabled(boolean z) {
                this.eventCollectionEnabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEventCollectionEnabled() {
                this.eventCollectionEnabled_ = false;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public boolean getMrefCollectionEnabled() {
                return this.mrefCollectionEnabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMrefCollectionEnabled(boolean z) {
                this.mrefCollectionEnabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMrefCollectionEnabled() {
                this.mrefCollectionEnabled_ = false;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public java.lang.String getAppBackgroundTrackingUrl() {
                return this.appBackgroundTrackingUrl_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public com.google.protobuf.ByteString getAppBackgroundTrackingUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.appBackgroundTrackingUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppBackgroundTrackingUrl(java.lang.String str) {
                str.getClass();
                this.appBackgroundTrackingUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppBackgroundTrackingUrl() {
                this.appBackgroundTrackingUrl_ = getDefaultInstance().getAppBackgroundTrackingUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppBackgroundTrackingUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.appBackgroundTrackingUrl_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public java.lang.String getAppForegroundTrackingUrl() {
                return this.appForegroundTrackingUrl_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
            public com.google.protobuf.ByteString getAppForegroundTrackingUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.appForegroundTrackingUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppForegroundTrackingUrl(java.lang.String str) {
                str.getClass();
                this.appForegroundTrackingUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppForegroundTrackingUrl() {
                this.appForegroundTrackingUrl_ = getDefaultInstance().getAppForegroundTrackingUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppForegroundTrackingUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.appForegroundTrackingUrl_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
                return DEFAULT_INSTANCE.createBuilder(eventCollectionConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig, com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public boolean getEventCollectionEnabled() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getEventCollectionEnabled();
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setEventCollectionEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setEventCollectionEnabled(z);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder clearEventCollectionEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).clearEventCollectionEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public boolean getMrefCollectionEnabled() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getMrefCollectionEnabled();
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setMrefCollectionEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setMrefCollectionEnabled(z);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder clearMrefCollectionEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).clearMrefCollectionEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public java.lang.String getAppBackgroundTrackingUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getAppBackgroundTrackingUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public com.google.protobuf.ByteString getAppBackgroundTrackingUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getAppBackgroundTrackingUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setAppBackgroundTrackingUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setAppBackgroundTrackingUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder clearAppBackgroundTrackingUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).clearAppBackgroundTrackingUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setAppBackgroundTrackingUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setAppBackgroundTrackingUrlBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public java.lang.String getAppForegroundTrackingUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getAppForegroundTrackingUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfigOrBuilder
                public com.google.protobuf.ByteString getAppForegroundTrackingUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).getAppForegroundTrackingUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setAppForegroundTrackingUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setAppForegroundTrackingUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder clearAppForegroundTrackingUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).clearAppForegroundTrackingUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder setAppForegroundTrackingUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig) this.instance).setAppForegroundTrackingUrlBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig = new com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig();
                DEFAULT_INSTANCE = eventCollectionConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.class, eventCollectionConfig);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AdUnit extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.AdUnit, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder> implements com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder {
            public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
            public static final int BID_FLOOR_FIELD_NUMBER = 4;
            private static final com.moloco.sdk.Init.SDKInitResponse.AdUnit DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 5;
            public static final int NATIVE_FIELD_NUMBER = 6;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 2;
            private int adFrequency_;
            private float bidFloor_;
            private java.lang.String id_ = "";
            private java.lang.String name_ = "";
            private com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native native_;
            private int type_;

            public interface NativeOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
                com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type getType();

                int getTypeValue();
            }

            private AdUnit() {
            }

            public enum InventoryType implements com.google.protobuf.Internal.EnumLite {
                INVALID(0),
                BANNER(1),
                INTERSTITIAL(2),
                NATIVE(3),
                REWARD_VIDEO(4),
                MREC(6),
                UNRECOGNIZED(-1);

                public static final int BANNER_VALUE = 1;
                public static final int INTERSTITIAL_VALUE = 2;
                public static final int INVALID_VALUE = 0;
                public static final int MREC_VALUE = 6;
                public static final int NATIVE_VALUE = 3;
                public static final int REWARD_VIDEO_VALUE = 4;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType>() { // from class: com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType findValueByNumber(int i) {
                        return com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType forNumber(int i) {
                    if (i == 0) {
                        return INVALID;
                    }
                    if (i == 1) {
                        return BANNER;
                    }
                    if (i == 2) {
                        return INTERSTITIAL;
                    }
                    if (i == 3) {
                        return NATIVE;
                    }
                    if (i == 4) {
                        return REWARD_VIDEO;
                    }
                    if (i != 6) {
                        return null;
                    }
                    return MREC;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.InventoryTypeVerifier.INSTANCE;
                }

                private static final class InventoryTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.InventoryTypeVerifier();

                    private InventoryTypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.forNumber(i) != null;
                    }
                }

                InventoryType(int i) {
                    this.value = i;
                }
            }

            public static final class Native extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder> implements com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder {
                private static final com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native> PARSER = null;
                public static final int TYPE_FIELD_NUMBER = 1;
                private int type_;

                private Native() {
                }

                public enum Type implements com.google.protobuf.Internal.EnumLite {
                    UNKNOWN_TYPE(0),
                    LOGO(1),
                    IMAGE(2),
                    VIDEO(3),
                    UNRECOGNIZED(-1);

                    public static final int IMAGE_VALUE = 2;
                    public static final int LOGO_VALUE = 1;
                    public static final int UNKNOWN_TYPE_VALUE = 0;
                    public static final int VIDEO_VALUE = 3;
                    private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type>() { // from class: com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.1
                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type findValueByNumber(int i) {
                            return com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.forNumber(i);
                        }
                    };
                    private final int value;

                    @Override // com.google.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        if (this == UNRECOGNIZED) {
                            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        return this.value;
                    }

                    @java.lang.Deprecated
                    public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type valueOf(int i) {
                        return forNumber(i);
                    }

                    public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type forNumber(int i) {
                        if (i == 0) {
                            return UNKNOWN_TYPE;
                        }
                        if (i == 1) {
                            return LOGO;
                        }
                        if (i == 2) {
                            return IMAGE;
                        }
                        if (i != 3) {
                            return null;
                        }
                        return VIDEO;
                    }

                    public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type> internalGetValueMap() {
                        return internalValueMap;
                    }

                    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                        return com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.TypeVerifier.INSTANCE;
                    }

                    private static final class TypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                        static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.TypeVerifier();

                        private TypeVerifier() {
                        }

                        @Override // com.google.protobuf.Internal.EnumVerifier
                        public boolean isInRange(int i) {
                            return com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.forNumber(i) != null;
                        }
                    }

                    Type(int i) {
                        this.value = i;
                    }
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder
                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type getType() {
                    com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type forNumber = com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.forNumber(this.type_);
                    return forNumber == null ? com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type.UNRECOGNIZED : forNumber;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setTypeValue(int i) {
                    this.type_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setType(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type type) {
                    this.type_ = type.getNumber();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearType() {
                    this.type_ = 0;
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r1) {
                    return DEFAULT_INSTANCE.createBuilder(r1);
                }

                public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder> implements com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder {
                    private Builder() {
                        super(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.DEFAULT_INSTANCE);
                    }

                    @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder
                    public int getTypeValue() {
                        return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) this.instance).getTypeValue();
                    }

                    public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder setTypeValue(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) this.instance).setTypeValue(i);
                        return this;
                    }

                    @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.NativeOrBuilder
                    public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type getType() {
                        return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) this.instance).getType();
                    }

                    public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder setType(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Type type) {
                        copyOnWrite();
                        ((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) this.instance).setType(type);
                        return this;
                    }

                    public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder clearType() {
                        copyOnWrite();
                        ((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native) this.instance).clearType();
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native();
                        case 2:
                            return new com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder();
                        case 3:
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"type_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native> parser = PARSER;
                            if (parser == null) {
                                synchronized (com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.class) {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                }
                            }
                            return parser;
                        case 6:
                            return (byte) 1;
                        case 7:
                            return null;
                        default:
                            throw new java.lang.UnsupportedOperationException();
                    }
                }

                static {
                    com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r0 = new com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native();
                    DEFAULT_INSTANCE = r0;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.class, r0);
                }

                public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public java.lang.String getId() {
                return this.id_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public com.google.protobuf.ByteString getIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(java.lang.String str) {
                str.getClass();
                this.id_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType getType() {
                com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType forNumber = com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.forNumber(this.type_);
                return forNumber == null ? com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i) {
                this.type_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType inventoryType) {
                this.type_ = inventoryType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.type_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public int getAdFrequency() {
                return this.adFrequency_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdFrequency(int i) {
                this.adFrequency_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdFrequency() {
                this.adFrequency_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public float getBidFloor() {
                return this.bidFloor_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBidFloor(float f) {
                this.bidFloor_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBidFloor() {
                this.bidFloor_ = 0.0f;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public java.lang.String getName() {
                return this.name_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(java.lang.String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public boolean hasNative() {
                return this.native_ != null;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native getNative() {
                com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r0 = this.native_;
                return r0 == null ? com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.getDefaultInstance() : r0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNative(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r1) {
                r1.getClass();
                this.native_ = r1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeNative(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r3) {
                r3.getClass();
                com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r0 = this.native_;
                if (r0 != null && r0 != com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.getDefaultInstance()) {
                    this.native_ = com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.newBuilder(this.native_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder) r3).buildPartial();
                } else {
                    this.native_ = r3;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNative() {
                this.native_ = null;
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.AdUnit) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
                return DEFAULT_INSTANCE.createBuilder(adUnit);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.AdUnit, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder> implements com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.AdUnit.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public java.lang.String getId() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getId();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public com.google.protobuf.ByteString getIdBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getIdBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setId(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setId(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearId() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearId();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setIdBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public int getTypeValue() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getTypeValue();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setTypeValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setTypeValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType getType() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getType();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setType(com.moloco.sdk.Init.SDKInitResponse.AdUnit.InventoryType inventoryType) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setType(inventoryType);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearType() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearType();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public int getAdFrequency() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getAdFrequency();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setAdFrequency(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setAdFrequency(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearAdFrequency() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearAdFrequency();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public float getBidFloor() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getBidFloor();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setBidFloor(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setBidFloor(f);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearBidFloor() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearBidFloor();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public java.lang.String getName() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getName();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public com.google.protobuf.ByteString getNameBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getNameBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setName(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setName(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearName() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearName();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setNameBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public boolean hasNative() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).hasNative();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder
                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native getNative() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).getNative();
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setNative(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r2) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setNative(r2);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder setNative(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).setNative(builder.build());
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder mergeNative(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Native r2) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).mergeNative(r2);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder clearNative() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.AdUnit) this.instance).clearNative();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.AdUnit();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new java.lang.Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.AdUnit.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit = new com.moloco.sdk.Init.SDKInitResponse.AdUnit();
                DEFAULT_INSTANCE = adUnit;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.AdUnit.class, adUnit);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.AdUnit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Geo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.Geo, com.moloco.sdk.Init.SDKInitResponse.Geo.Builder> implements com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder {
            public static final int CITY_FIELD_NUMBER = 6;
            public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
            public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.Init.SDKInitResponse.Geo DEFAULT_INSTANCE;
            public static final int LATITUDE_FIELD_NUMBER = 3;
            public static final int LONGITUDE_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.Geo> PARSER = null;
            public static final int REGION_FIELD_NUMBER = 7;
            public static final int ZIP_CODE_FIELD_NUMBER = 5;
            private float latitude_;
            private float longitude_;
            private java.lang.String countryIso3Code_ = "";
            private java.lang.String countryIso2Code_ = "";
            private java.lang.String zipCode_ = "";
            private java.lang.String city_ = "";
            private java.lang.String region_ = "";

            private Geo() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public java.lang.String getCountryIso3Code() {
                return this.countryIso3Code_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public com.google.protobuf.ByteString getCountryIso3CodeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.countryIso3Code_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountryIso3Code(java.lang.String str) {
                str.getClass();
                this.countryIso3Code_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCountryIso3Code() {
                this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountryIso3CodeBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.countryIso3Code_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public java.lang.String getCountryIso2Code() {
                return this.countryIso2Code_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public com.google.protobuf.ByteString getCountryIso2CodeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.countryIso2Code_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountryIso2Code(java.lang.String str) {
                str.getClass();
                this.countryIso2Code_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCountryIso2Code() {
                this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountryIso2CodeBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.countryIso2Code_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public float getLatitude() {
                return this.latitude_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLatitude(float f) {
                this.latitude_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLatitude() {
                this.latitude_ = 0.0f;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public float getLongitude() {
                return this.longitude_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLongitude(float f) {
                this.longitude_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLongitude() {
                this.longitude_ = 0.0f;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public java.lang.String getZipCode() {
                return this.zipCode_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public com.google.protobuf.ByteString getZipCodeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.zipCode_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setZipCode(java.lang.String str) {
                str.getClass();
                this.zipCode_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearZipCode() {
                this.zipCode_ = getDefaultInstance().getZipCode();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setZipCodeBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.zipCode_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public java.lang.String getCity() {
                return this.city_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public com.google.protobuf.ByteString getCityBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.city_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCity(java.lang.String str) {
                str.getClass();
                this.city_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCity() {
                this.city_ = getDefaultInstance().getCity();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCityBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.city_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public java.lang.String getRegion() {
                return this.region_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
            public com.google.protobuf.ByteString getRegionBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.region_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegion(java.lang.String str) {
                str.getClass();
                this.region_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRegion() {
                this.region_ = getDefaultInstance().getRegion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegionBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.region_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
                return DEFAULT_INSTANCE.createBuilder(geo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.Geo, com.moloco.sdk.Init.SDKInitResponse.Geo.Builder> implements com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.Geo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public java.lang.String getCountryIso3Code() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCountryIso3Code();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public com.google.protobuf.ByteString getCountryIso3CodeBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCountryIso3CodeBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCountryIso3Code(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCountryIso3Code(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearCountryIso3Code() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearCountryIso3Code();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCountryIso3CodeBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCountryIso3CodeBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public java.lang.String getCountryIso2Code() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCountryIso2Code();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public com.google.protobuf.ByteString getCountryIso2CodeBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCountryIso2CodeBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCountryIso2Code(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCountryIso2Code(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearCountryIso2Code() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearCountryIso2Code();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCountryIso2CodeBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCountryIso2CodeBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public float getLatitude() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getLatitude();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setLatitude(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setLatitude(f);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearLatitude() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearLatitude();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public float getLongitude() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getLongitude();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setLongitude(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setLongitude(f);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearLongitude() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearLongitude();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public java.lang.String getZipCode() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getZipCode();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public com.google.protobuf.ByteString getZipCodeBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getZipCodeBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setZipCode(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setZipCode(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearZipCode() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearZipCode();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setZipCodeBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setZipCodeBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public java.lang.String getCity() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCity();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public com.google.protobuf.ByteString getCityBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getCityBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCity(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCity(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearCity() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearCity();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setCityBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setCityBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public java.lang.String getRegion() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getRegion();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.GeoOrBuilder
                public com.google.protobuf.ByteString getRegionBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).getRegionBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setRegion(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setRegion(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder clearRegion() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).clearRegion();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.Geo.Builder setRegionBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.Geo) this.instance).setRegionBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.Geo();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.Geo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new java.lang.Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.Geo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.Geo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.Geo geo = new com.moloco.sdk.Init.SDKInitResponse.Geo();
                DEFAULT_INSTANCE = geo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.Geo.class, geo);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.Geo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.Geo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class BidTokenConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig, com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder {
            public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
            private static final com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig> PARSER;
            private java.lang.String bidTokenUrl_ = "";

            private BidTokenConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder
            public java.lang.String getBidTokenUrl() {
                return this.bidTokenUrl_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder
            public com.google.protobuf.ByteString getBidTokenUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.bidTokenUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBidTokenUrl(java.lang.String str) {
                str.getClass();
                this.bidTokenUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBidTokenUrl() {
                this.bidTokenUrl_ = getDefaultInstance().getBidTokenUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBidTokenUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.bidTokenUrl_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig) {
                return DEFAULT_INSTANCE.createBuilder(bidTokenConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig, com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder
                public java.lang.String getBidTokenUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) this.instance).getBidTokenUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.BidTokenConfigOrBuilder
                public com.google.protobuf.ByteString getBidTokenUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) this.instance).getBidTokenUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder setBidTokenUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) this.instance).setBidTokenUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder clearBidTokenUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) this.instance).clearBidTokenUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder setBidTokenUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig) this.instance).setBidTokenUrlBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new java.lang.Object[]{"bidTokenUrl_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig = new com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig();
                DEFAULT_INSTANCE = bidTokenConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.class, bidTokenConfig);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class OperationalMetricsConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig, com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder {
            private static final com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig DEFAULT_INSTANCE;
            public static final int ENABLED_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig> PARSER = null;
            public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
            public static final int URL_FIELD_NUMBER = 2;
            private boolean enabled_;
            private int pollingIntervalSeconds_;
            private java.lang.String url_ = "";

            private OperationalMetricsConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnabled(boolean z) {
                this.enabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnabled() {
                this.enabled_ = false;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
            public java.lang.String getUrl() {
                return this.url_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
            public com.google.protobuf.ByteString getUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrl(java.lang.String str) {
                str.getClass();
                this.url_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUrl() {
                this.url_ = getDefaultInstance().getUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.url_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
            public int getPollingIntervalSeconds() {
                return this.pollingIntervalSeconds_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPollingIntervalSeconds(int i) {
                this.pollingIntervalSeconds_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPollingIntervalSeconds() {
                this.pollingIntervalSeconds_ = 0;
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
                return DEFAULT_INSTANCE.createBuilder(operationalMetricsConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig, com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
                public boolean getEnabled() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).getEnabled();
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder setEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).setEnabled(z);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder clearEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).clearEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
                public java.lang.String getUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).getUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
                public com.google.protobuf.ByteString getUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).getUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder setUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).setUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder clearUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).clearUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder setUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).setUrlBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfigOrBuilder
                public int getPollingIntervalSeconds() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).getPollingIntervalSeconds();
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder setPollingIntervalSeconds(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).setPollingIntervalSeconds(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder clearPollingIntervalSeconds() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig) this.instance).clearPollingIntervalSeconds();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new java.lang.Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = new com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig();
                DEFAULT_INSTANCE = operationalMetricsConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.class, operationalMetricsConfig);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class CrashReportingConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig, com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder {
            private static final com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig DEFAULT_INSTANCE;
            public static final int ENABLED_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig> PARSER = null;
            public static final int URL_FIELD_NUMBER = 2;
            private boolean enabled_;
            private java.lang.String url_ = "";

            private CrashReportingConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnabled(boolean z) {
                this.enabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnabled() {
                this.enabled_ = false;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
            public java.lang.String getUrl() {
                return this.url_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
            public com.google.protobuf.ByteString getUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrl(java.lang.String str) {
                str.getClass();
                this.url_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUrl() {
                this.url_ = getDefaultInstance().getUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.url_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig) {
                return DEFAULT_INSTANCE.createBuilder(crashReportingConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig, com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
                public boolean getEnabled() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).getEnabled();
                }

                public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder setEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).setEnabled(z);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder clearEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).clearEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
                public java.lang.String getUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).getUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfigOrBuilder
                public com.google.protobuf.ByteString getUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).getUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder setUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).setUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder clearUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).clearUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder setUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig) this.instance).setUrlBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new java.lang.Object[]{"enabled_", "url_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig = new com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig();
                DEFAULT_INSTANCE = crashReportingConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.class, crashReportingConfig);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ILRDConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.ILRDConfig, com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder {
            private static final com.moloco.sdk.Init.SDKInitResponse.ILRDConfig DEFAULT_INSTANCE;
            public static final int ENABLED_FIELD_NUMBER = 1;
            public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
            public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ILRDConfig> PARSER = null;
            public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
            public static final int RETRY_COUNT_FIELD_NUMBER = 4;
            public static final int SESSION_EXP_FIELD_NUMBER = 3;
            public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
            public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
            private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> supportedNetworks_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks>() { // from class: com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.1
                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                public com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks convert(java.lang.Integer num) {
                    com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks forNumber = com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.forNumber(num.intValue());
                    return forNumber == null ? com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.UNRECOGNIZED : forNumber;
                }
            };
            private boolean enabled_;
            private int maxBatchSize_;
            private int maxSessionLen_;
            private int retryCount_;
            private int sessionExp_;
            private int supportedNetworksMemoizedSerializedSize;
            private int uploadInterval_;
            private java.lang.String rawImpUrl_ = "";
            private com.google.protobuf.Internal.IntList supportedNetworks_ = emptyIntList();

            private ILRDConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnabled(boolean z) {
                this.enabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnabled() {
                this.enabled_ = false;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public java.lang.String getRawImpUrl() {
                return this.rawImpUrl_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public com.google.protobuf.ByteString getRawImpUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.rawImpUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRawImpUrl(java.lang.String str) {
                str.getClass();
                this.rawImpUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRawImpUrl() {
                this.rawImpUrl_ = getDefaultInstance().getRawImpUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRawImpUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.rawImpUrl_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getSessionExp() {
                return this.sessionExp_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionExp(int i) {
                this.sessionExp_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSessionExp() {
                this.sessionExp_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getRetryCount() {
                return this.retryCount_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRetryCount(int i) {
                this.retryCount_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRetryCount() {
                this.retryCount_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getMaxBatchSize() {
                return this.maxBatchSize_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxBatchSize(int i) {
                this.maxBatchSize_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxBatchSize() {
                this.maxBatchSize_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getMaxSessionLen() {
                return this.maxSessionLen_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxSessionLen(int i) {
                this.maxSessionLen_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxSessionLen() {
                this.maxSessionLen_ = 0;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getUploadInterval() {
                return this.uploadInterval_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUploadInterval(int i) {
                this.uploadInterval_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUploadInterval() {
                this.uploadInterval_ = 0;
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig = new com.moloco.sdk.Init.SDKInitResponse.ILRDConfig();
                DEFAULT_INSTANCE = iLRDConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.class, iLRDConfig);
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public java.util.List<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> getSupportedNetworksList() {
                return new com.google.protobuf.Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getSupportedNetworksCount() {
                return this.supportedNetworks_.size();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks getSupportedNetworks(int i) {
                com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks forNumber = com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.forNumber(this.supportedNetworks_.getInt(i));
                return forNumber == null ? com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.UNRECOGNIZED : forNumber;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public java.util.List<java.lang.Integer> getSupportedNetworksValueList() {
                return this.supportedNetworks_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
            public int getSupportedNetworksValue(int i) {
                return this.supportedNetworks_.getInt(i);
            }

            private void ensureSupportedNetworksIsMutable() {
                com.google.protobuf.Internal.IntList intList = this.supportedNetworks_;
                if (intList.isModifiable()) {
                    return;
                }
                this.supportedNetworks_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSupportedNetworks(int i, com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks supportedNetworks) {
                supportedNetworks.getClass();
                ensureSupportedNetworksIsMutable();
                this.supportedNetworks_.setInt(i, supportedNetworks.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSupportedNetworks(com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks supportedNetworks) {
                supportedNetworks.getClass();
                ensureSupportedNetworksIsMutable();
                this.supportedNetworks_.addInt(supportedNetworks.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSupportedNetworks(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> iterable) {
                ensureSupportedNetworksIsMutable();
                java.util.Iterator<? extends com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedNetworks_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSupportedNetworks() {
                this.supportedNetworks_ = emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSupportedNetworksValue(int i, int i2) {
                ensureSupportedNetworksIsMutable();
                this.supportedNetworks_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSupportedNetworksValue(int i) {
                ensureSupportedNetworksIsMutable();
                this.supportedNetworks_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSupportedNetworksValue(java.lang.Iterable<java.lang.Integer> iterable) {
                ensureSupportedNetworksIsMutable();
                java.util.Iterator<java.lang.Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedNetworks_.addInt(it.next().intValue());
                }
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig) {
                return DEFAULT_INSTANCE.createBuilder(iLRDConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.ILRDConfig, com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public boolean getEnabled() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getEnabled();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setEnabled(z);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public java.lang.String getRawImpUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getRawImpUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public com.google.protobuf.ByteString getRawImpUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getRawImpUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setRawImpUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setRawImpUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearRawImpUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearRawImpUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setRawImpUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setRawImpUrlBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getSessionExp() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSessionExp();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setSessionExp(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setSessionExp(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearSessionExp() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearSessionExp();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getRetryCount() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getRetryCount();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setRetryCount(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setRetryCount(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearRetryCount() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearRetryCount();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getMaxBatchSize() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getMaxBatchSize();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setMaxBatchSize(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setMaxBatchSize(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearMaxBatchSize() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearMaxBatchSize();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getMaxSessionLen() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getMaxSessionLen();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setMaxSessionLen(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setMaxSessionLen(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearMaxSessionLen() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearMaxSessionLen();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getUploadInterval() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getUploadInterval();
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setUploadInterval(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setUploadInterval(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearUploadInterval() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearUploadInterval();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public java.util.List<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> getSupportedNetworksList() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksList();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getSupportedNetworksCount() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksCount();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks getSupportedNetworks(int i) {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworks(i);
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setSupportedNetworks(int i, com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks supportedNetworks) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setSupportedNetworks(i, supportedNetworks);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder addSupportedNetworks(com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks supportedNetworks) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).addSupportedNetworks(supportedNetworks);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder addAllSupportedNetworks(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> iterable) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).addAllSupportedNetworks(iterable);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder clearSupportedNetworks() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).clearSupportedNetworks();
                    return this;
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public java.util.List<java.lang.Integer> getSupportedNetworksValueList() {
                    return java.util.Collections.unmodifiableList(((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksValueList());
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.ILRDConfigOrBuilder
                public int getSupportedNetworksValue(int i) {
                    return ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksValue(i);
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder setSupportedNetworksValue(int i, int i2) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).setSupportedNetworksValue(i, i2);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder addSupportedNetworksValue(int i) {
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).addSupportedNetworksValue(i);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder addAllSupportedNetworksValue(java.lang.Iterable<java.lang.Integer> iterable) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig) this.instance).addAllSupportedNetworksValue(iterable);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.ILRDConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new java.lang.Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ILRDConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public static com.moloco.sdk.Init.SDKInitResponse.ILRDConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.ILRDConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class DirectAdsConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig, com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder {
            private static final com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig> PARSER = null;
            public static final int URL_FIELD_NUMBER = 1;
            private java.lang.String url_ = "";

            private DirectAdsConfig() {
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder
            public java.lang.String getUrl() {
                return this.url_;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder
            public com.google.protobuf.ByteString getUrlBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrl(java.lang.String str) {
                str.getClass();
                this.url_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUrl() {
                this.url_ = getDefaultInstance().getUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrlBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.url_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig) {
                return DEFAULT_INSTANCE.createBuilder(directAdsConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig, com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder> implements com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder
                public java.lang.String getUrl() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) this.instance).getUrl();
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfigOrBuilder
                public com.google.protobuf.ByteString getUrlBytes() {
                    return ((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) this.instance).getUrlBytes();
                }

                public com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder setUrl(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) this.instance).setUrl(str);
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder clearUrl() {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) this.instance).clearUrl();
                    return this;
                }

                public com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder setUrlBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig) this.instance).setUrlBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig();
                    case 2:
                        return new com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"url_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            static {
                com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig = new com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig();
                DEFAULT_INSTANCE = directAdsConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.class, directAdsConfig);
            }

            public static com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getAppId() {
            return this.appId_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getAppIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.appId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(java.lang.String str) {
            str.getClass();
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.appId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getPublisherId() {
            return this.publisherId_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getPublisherIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publisherId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherId(java.lang.String str) {
            str.getClass();
            this.publisherId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublisherId() {
            this.publisherId_ = getDefaultInstance().getPublisherId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.publisherId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getCountryIso3Code() {
            return this.countryIso3Code_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getCountryIso3CodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.countryIso3Code_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso3Code(java.lang.String str) {
            str.getClass();
            this.countryIso3Code_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryIso3Code() {
            this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso3CodeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.countryIso3Code_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.util.List<com.moloco.sdk.Init.SDKInitResponse.AdUnit> getAdUnitsList() {
            return this.adUnits_;
        }

        public java.util.List<? extends com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            return this.adUnits_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public int getAdUnitsCount() {
            return this.adUnits_.size();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.AdUnit getAdUnits(int i) {
            return this.adUnits_.get(i);
        }

        public com.moloco.sdk.Init.SDKInitResponse.AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            return this.adUnits_.get(i);
        }

        private void ensureAdUnitsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.Init.SDKInitResponse.AdUnit> protobufList = this.adUnits_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.adUnits_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i, adUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdUnits(com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(adUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(i, adUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdUnits(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.AdUnit> iterable) {
            ensureAdUnitsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.adUnits_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdUnits() {
            this.adUnits_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAdUnits(int i) {
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i);
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public int getResolvedRegionValue() {
            return this.resolvedRegion_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.Region getResolvedRegion() {
            com.moloco.sdk.Init.SDKInitResponse.Region forNumber = com.moloco.sdk.Init.SDKInitResponse.Region.forNumber(this.resolvedRegion_);
            return forNumber == null ? com.moloco.sdk.Init.SDKInitResponse.Region.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolvedRegionValue(int i) {
            this.resolvedRegion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolvedRegion(com.moloco.sdk.Init.SDKInitResponse.Region region) {
            this.resolvedRegion_ = region.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolvedRegion() {
            this.resolvedRegion_ = 0;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getAdServerUrl() {
            return this.adServerUrl_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getAdServerUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.adServerUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdServerUrl(java.lang.String str) {
            str.getClass();
            this.adServerUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdServerUrl() {
            this.adServerUrl_ = getDefaultInstance().getAdServerUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdServerUrlBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.adServerUrl_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getCountryIso2Code() {
            return this.countryIso2Code_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getCountryIso2CodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.countryIso2Code_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso2Code(java.lang.String str) {
            str.getClass();
            this.countryIso2Code_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryIso2Code() {
            this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso2CodeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.countryIso2Code_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.lang.String getPlatformId() {
            return this.platformId_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.google.protobuf.ByteString getPlatformIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.platformId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformId(java.lang.String str) {
            str.getClass();
            this.platformId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatformId() {
            this.platformId_ = getDefaultInstance().getPlatformId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.platformId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean getVerifyBannerVisible() {
            return this.verifyBannerVisible_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerifyBannerVisible(boolean z) {
            this.verifyBannerVisible_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerifyBannerVisible() {
            this.verifyBannerVisible_ = false;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.Geo getGeo() {
            com.moloco.sdk.Init.SDKInitResponse.Geo geo = this.geo_;
            return geo == null ? com.moloco.sdk.Init.SDKInitResponse.Geo.getDefaultInstance() : geo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeo(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
            geo.getClass();
            this.geo_ = geo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGeo(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
            geo.getClass();
            com.moloco.sdk.Init.SDKInitResponse.Geo geo2 = this.geo_;
            if (geo2 != null && geo2 != com.moloco.sdk.Init.SDKInitResponse.Geo.getDefaultInstance()) {
                this.geo_ = com.moloco.sdk.Init.SDKInitResponse.Geo.newBuilder(this.geo_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.Geo.Builder) geo).buildPartial();
            } else {
                this.geo_ = geo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeo() {
            this.geo_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasEventCollectionConfig() {
            return this.eventCollectionConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig getEventCollectionConfig() {
            com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig = this.eventCollectionConfig_;
            return eventCollectionConfig == null ? com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.getDefaultInstance() : eventCollectionConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCollectionConfig(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
            eventCollectionConfig.getClass();
            this.eventCollectionConfig_ = eventCollectionConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventCollectionConfig(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
            eventCollectionConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig2 = this.eventCollectionConfig_;
            if (eventCollectionConfig2 != null && eventCollectionConfig2 != com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.getDefaultInstance()) {
                this.eventCollectionConfig_ = com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.newBuilder(this.eventCollectionConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder) eventCollectionConfig).buildPartial();
            } else {
                this.eventCollectionConfig_ = eventCollectionConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCollectionConfig() {
            this.eventCollectionConfig_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasBidTokenConfig() {
            return this.bidTokenConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig getBidTokenConfig() {
            com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig = this.bidTokenConfig_;
            return bidTokenConfig == null ? com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.getDefaultInstance() : bidTokenConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenConfig(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig) {
            bidTokenConfig.getClass();
            this.bidTokenConfig_ = bidTokenConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBidTokenConfig(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig) {
            bidTokenConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig2 = this.bidTokenConfig_;
            if (bidTokenConfig2 != null && bidTokenConfig2 != com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.getDefaultInstance()) {
                this.bidTokenConfig_ = com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.newBuilder(this.bidTokenConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder) bidTokenConfig).buildPartial();
            } else {
                this.bidTokenConfig_ = bidTokenConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidTokenConfig() {
            this.bidTokenConfig_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public java.util.List<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> getExperimentalFeatureFlagsList() {
            return this.experimentalFeatureFlags_;
        }

        public java.util.List<? extends com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder> getExperimentalFeatureFlagsOrBuilderList() {
            return this.experimentalFeatureFlags_;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public int getExperimentalFeatureFlagsCount() {
            return this.experimentalFeatureFlags_.size();
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag getExperimentalFeatureFlags(int i) {
            return this.experimentalFeatureFlags_.get(i);
        }

        public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlagOrBuilder getExperimentalFeatureFlagsOrBuilder(int i) {
            return this.experimentalFeatureFlags_.get(i);
        }

        private void ensureExperimentalFeatureFlagsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> protobufList = this.experimentalFeatureFlags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.experimentalFeatureFlags_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
            experimentalFeatureFlag.getClass();
            ensureExperimentalFeatureFlagsIsMutable();
            this.experimentalFeatureFlags_.set(i, experimentalFeatureFlag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExperimentalFeatureFlags(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
            experimentalFeatureFlag.getClass();
            ensureExperimentalFeatureFlagsIsMutable();
            this.experimentalFeatureFlags_.add(experimentalFeatureFlag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
            experimentalFeatureFlag.getClass();
            ensureExperimentalFeatureFlagsIsMutable();
            this.experimentalFeatureFlags_.add(i, experimentalFeatureFlag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExperimentalFeatureFlags(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> iterable) {
            ensureExperimentalFeatureFlagsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.experimentalFeatureFlags_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentalFeatureFlags() {
            this.experimentalFeatureFlags_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExperimentalFeatureFlags(int i) {
            ensureExperimentalFeatureFlagsIsMutable();
            this.experimentalFeatureFlags_.remove(i);
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasOperationalMetricsConfig() {
            return this.operationalMetricsConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig getOperationalMetricsConfig() {
            com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = this.operationalMetricsConfig_;
            return operationalMetricsConfig == null ? com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.getDefaultInstance() : operationalMetricsConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationalMetricsConfig(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
            operationalMetricsConfig.getClass();
            this.operationalMetricsConfig_ = operationalMetricsConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOperationalMetricsConfig(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
            operationalMetricsConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig2 = this.operationalMetricsConfig_;
            if (operationalMetricsConfig2 != null && operationalMetricsConfig2 != com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.getDefaultInstance()) {
                this.operationalMetricsConfig_ = com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.newBuilder(this.operationalMetricsConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder) operationalMetricsConfig).buildPartial();
            } else {
                this.operationalMetricsConfig_ = operationalMetricsConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperationalMetricsConfig() {
            this.operationalMetricsConfig_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasCrashReportingConfig() {
            return this.crashReportingConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig getCrashReportingConfig() {
            com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig = this.crashReportingConfig_;
            return crashReportingConfig == null ? com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.getDefaultInstance() : crashReportingConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrashReportingConfig(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig) {
            crashReportingConfig.getClass();
            this.crashReportingConfig_ = crashReportingConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCrashReportingConfig(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig) {
            crashReportingConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig2 = this.crashReportingConfig_;
            if (crashReportingConfig2 != null && crashReportingConfig2 != com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.getDefaultInstance()) {
                this.crashReportingConfig_ = com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.newBuilder(this.crashReportingConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder) crashReportingConfig).buildPartial();
            } else {
                this.crashReportingConfig_ = crashReportingConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCrashReportingConfig() {
            this.crashReportingConfig_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasConfigs() {
            return this.configs_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.ConfigsOuterClass.Configs getConfigs() {
            com.moloco.sdk.ConfigsOuterClass.Configs configs = this.configs_;
            return configs == null ? com.moloco.sdk.ConfigsOuterClass.Configs.getDefaultInstance() : configs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigs(com.moloco.sdk.ConfigsOuterClass.Configs configs) {
            configs.getClass();
            this.configs_ = configs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfigs(com.moloco.sdk.ConfigsOuterClass.Configs configs) {
            configs.getClass();
            com.moloco.sdk.ConfigsOuterClass.Configs configs2 = this.configs_;
            if (configs2 != null && configs2 != com.moloco.sdk.ConfigsOuterClass.Configs.getDefaultInstance()) {
                this.configs_ = com.moloco.sdk.ConfigsOuterClass.Configs.newBuilder(this.configs_).mergeFrom((com.moloco.sdk.ConfigsOuterClass.Configs.Builder) configs).buildPartial();
            } else {
                this.configs_ = configs;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigs() {
            this.configs_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasIlrdConfig() {
            return this.ilrdConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig getIlrdConfig() {
            com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig = this.ilrdConfig_;
            return iLRDConfig == null ? com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.getDefaultInstance() : iLRDConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlrdConfig(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig) {
            iLRDConfig.getClass();
            this.ilrdConfig_ = iLRDConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIlrdConfig(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig) {
            iLRDConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig2 = this.ilrdConfig_;
            if (iLRDConfig2 != null && iLRDConfig2 != com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.getDefaultInstance()) {
                this.ilrdConfig_ = com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.newBuilder(this.ilrdConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder) iLRDConfig).buildPartial();
            } else {
                this.ilrdConfig_ = iLRDConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlrdConfig() {
            this.ilrdConfig_ = null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public boolean hasDirectAdsConfig() {
            return this.directAdsConfig_ != null;
        }

        @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
        public com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig getDirectAdsConfig() {
            com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig = this.directAdsConfig_;
            return directAdsConfig == null ? com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.getDefaultInstance() : directAdsConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectAdsConfig(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig) {
            directAdsConfig.getClass();
            this.directAdsConfig_ = directAdsConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDirectAdsConfig(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig) {
            directAdsConfig.getClass();
            com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig2 = this.directAdsConfig_;
            if (directAdsConfig2 != null && directAdsConfig2 != com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.getDefaultInstance()) {
                this.directAdsConfig_ = com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.newBuilder(this.directAdsConfig_).mergeFrom((com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder) directAdsConfig).buildPartial();
            } else {
                this.directAdsConfig_ = directAdsConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirectAdsConfig() {
            this.directAdsConfig_ = null;
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.Init.SDKInitResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.Init.SDKInitResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.Init.SDKInitResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.Init.SDKInitResponse.Builder newBuilder(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
            return DEFAULT_INSTANCE.createBuilder(sDKInitResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.Init.SDKInitResponse.Builder> implements com.moloco.sdk.Init.SDKInitResponseOrBuilder {
            private Builder() {
                super(com.moloco.sdk.Init.SDKInitResponse.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getAppId() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAppId();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getAppIdBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAppIdBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAppId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAppId(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearAppId() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearAppId();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAppIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAppIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getPublisherId() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getPublisherId();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getPublisherIdBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getPublisherIdBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setPublisherId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setPublisherId(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearPublisherId() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearPublisherId();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setPublisherIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setPublisherIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getCountryIso3Code() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getCountryIso3Code();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getCountryIso3CodeBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getCountryIso3CodeBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCountryIso3Code(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCountryIso3Code(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearCountryIso3Code() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearCountryIso3Code();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCountryIso3CodeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCountryIso3CodeBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.util.List<com.moloco.sdk.Init.SDKInitResponse.AdUnit> getAdUnitsList() {
                return java.util.Collections.unmodifiableList(((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAdUnitsList());
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public int getAdUnitsCount() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAdUnitsCount();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.AdUnit getAdUnits(int i) {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAdUnits(i);
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAdUnits(i, adUnit);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAdUnits(i, builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAdUnits(com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAdUnits(adUnit);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit adUnit) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAdUnits(i, adUnit);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAdUnits(com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAdUnits(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAdUnits(int i, com.moloco.sdk.Init.SDKInitResponse.AdUnit.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAdUnits(i, builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAllAdUnits(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.AdUnit> iterable) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAllAdUnits(iterable);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearAdUnits() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearAdUnits();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder removeAdUnits(int i) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).removeAdUnits(i);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public int getResolvedRegionValue() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getResolvedRegionValue();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setResolvedRegionValue(int i) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setResolvedRegionValue(i);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.Region getResolvedRegion() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getResolvedRegion();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setResolvedRegion(com.moloco.sdk.Init.SDKInitResponse.Region region) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setResolvedRegion(region);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearResolvedRegion() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearResolvedRegion();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getAdServerUrl() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAdServerUrl();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getAdServerUrlBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getAdServerUrlBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAdServerUrl(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAdServerUrl(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearAdServerUrl() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearAdServerUrl();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setAdServerUrlBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setAdServerUrlBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getCountryIso2Code() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getCountryIso2Code();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getCountryIso2CodeBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getCountryIso2CodeBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCountryIso2Code(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCountryIso2Code(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearCountryIso2Code() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearCountryIso2Code();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCountryIso2CodeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCountryIso2CodeBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.lang.String getPlatformId() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getPlatformId();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.google.protobuf.ByteString getPlatformIdBytes() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getPlatformIdBytes();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setPlatformId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setPlatformId(str);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearPlatformId() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearPlatformId();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setPlatformIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setPlatformIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean getVerifyBannerVisible() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getVerifyBannerVisible();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setVerifyBannerVisible(boolean z) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setVerifyBannerVisible(z);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearVerifyBannerVisible() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearVerifyBannerVisible();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasGeo() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasGeo();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.Geo getGeo() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getGeo();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setGeo(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setGeo(geo);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setGeo(com.moloco.sdk.Init.SDKInitResponse.Geo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setGeo(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeGeo(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeGeo(geo);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearGeo() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearGeo();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasEventCollectionConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasEventCollectionConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig getEventCollectionConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getEventCollectionConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setEventCollectionConfig(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setEventCollectionConfig(eventCollectionConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setEventCollectionConfig(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setEventCollectionConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeEventCollectionConfig(com.moloco.sdk.Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeEventCollectionConfig(eventCollectionConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearEventCollectionConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearEventCollectionConfig();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasBidTokenConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasBidTokenConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig getBidTokenConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getBidTokenConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setBidTokenConfig(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setBidTokenConfig(bidTokenConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setBidTokenConfig(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setBidTokenConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeBidTokenConfig(com.moloco.sdk.Init.SDKInitResponse.BidTokenConfig bidTokenConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeBidTokenConfig(bidTokenConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearBidTokenConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearBidTokenConfig();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public java.util.List<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> getExperimentalFeatureFlagsList() {
                return java.util.Collections.unmodifiableList(((com.moloco.sdk.Init.SDKInitResponse) this.instance).getExperimentalFeatureFlagsList());
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public int getExperimentalFeatureFlagsCount() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getExperimentalFeatureFlagsCount();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag getExperimentalFeatureFlags(int i) {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getExperimentalFeatureFlags(i);
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setExperimentalFeatureFlags(i, experimentalFeatureFlag);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setExperimentalFeatureFlags(i, builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addExperimentalFeatureFlags(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addExperimentalFeatureFlags(experimentalFeatureFlag);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addExperimentalFeatureFlags(i, experimentalFeatureFlag);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addExperimentalFeatureFlags(com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addExperimentalFeatureFlags(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addExperimentalFeatureFlags(int i, com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addExperimentalFeatureFlags(i, builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder addAllExperimentalFeatureFlags(java.lang.Iterable<? extends com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> iterable) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).addAllExperimentalFeatureFlags(iterable);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearExperimentalFeatureFlags() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearExperimentalFeatureFlags();
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder removeExperimentalFeatureFlags(int i) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).removeExperimentalFeatureFlags(i);
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasOperationalMetricsConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasOperationalMetricsConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig getOperationalMetricsConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getOperationalMetricsConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setOperationalMetricsConfig(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setOperationalMetricsConfig(operationalMetricsConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setOperationalMetricsConfig(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setOperationalMetricsConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeOperationalMetricsConfig(com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeOperationalMetricsConfig(operationalMetricsConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearOperationalMetricsConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearOperationalMetricsConfig();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasCrashReportingConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasCrashReportingConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig getCrashReportingConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getCrashReportingConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCrashReportingConfig(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCrashReportingConfig(crashReportingConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setCrashReportingConfig(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setCrashReportingConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeCrashReportingConfig(com.moloco.sdk.Init.SDKInitResponse.CrashReportingConfig crashReportingConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeCrashReportingConfig(crashReportingConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearCrashReportingConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearCrashReportingConfig();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasConfigs() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasConfigs();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs getConfigs() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getConfigs();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setConfigs(com.moloco.sdk.ConfigsOuterClass.Configs configs) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setConfigs(configs);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setConfigs(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeConfigs(com.moloco.sdk.ConfigsOuterClass.Configs configs) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeConfigs(configs);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearConfigs() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearConfigs();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasIlrdConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasIlrdConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.ILRDConfig getIlrdConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getIlrdConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setIlrdConfig(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setIlrdConfig(iLRDConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setIlrdConfig(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setIlrdConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeIlrdConfig(com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeIlrdConfig(iLRDConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearIlrdConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearIlrdConfig();
                return this;
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public boolean hasDirectAdsConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).hasDirectAdsConfig();
            }

            @Override // com.moloco.sdk.Init.SDKInitResponseOrBuilder
            public com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig getDirectAdsConfig() {
                return ((com.moloco.sdk.Init.SDKInitResponse) this.instance).getDirectAdsConfig();
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setDirectAdsConfig(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setDirectAdsConfig(directAdsConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder setDirectAdsConfig(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).setDirectAdsConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder mergeDirectAdsConfig(com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig) {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).mergeDirectAdsConfig(directAdsConfig);
                return this;
            }

            public com.moloco.sdk.Init.SDKInitResponse.Builder clearDirectAdsConfig() {
                copyOnWrite();
                ((com.moloco.sdk.Init.SDKInitResponse) this.instance).clearDirectAdsConfig();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.Init.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.Init.SDKInitResponse();
                case 2:
                    return new com.moloco.sdk.Init.SDKInitResponse.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t", new java.lang.Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", com.moloco.sdk.Init.SDKInitResponse.AdUnit.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag.class, "operationalMetricsConfig_", "crashReportingConfig_", "configs_", "ilrdConfig_", "directAdsConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.Init.SDKInitResponse.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            com.moloco.sdk.Init.SDKInitResponse sDKInitResponse = new com.moloco.sdk.Init.SDKInitResponse();
            DEFAULT_INSTANCE = sDKInitResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.Init.SDKInitResponse.class, sDKInitResponse);
        }

        public static com.moloco.sdk.Init.SDKInitResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.Init.SDKInitResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.Init$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
