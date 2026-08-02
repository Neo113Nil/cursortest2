package com.adobe.marketing.mobile.internal.configuration;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/Event;", "event", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "", "collectSdkIdentifiers$core_phoneRelease", "(Lcom/adobe/marketing/mobile/Event;Lcom/adobe/marketing/mobile/ExtensionApi;)Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "ID", "SharedStateKeys"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileIdentitiesProvider {
    public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.EXTENSION_NAME, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.EXTENSION_NAME, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target.EXTENSION_NAME, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME});

    private MobileIdentitiesProvider() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys;", "", "<init>", "()V", "Analytics", "Audience", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Identity", "Target"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SharedStateKeys {
        public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys();

        private SharedStateKeys() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Analytics;", "", "<init>", "()V", "", "ANALYTICS_ID", "Ljava/lang/String;", "EXTENSION_NAME", "VISITOR_IDENTIFIER"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Analytics {
            public static final java.lang.String ANALYTICS_ID = "aid";
            public static final java.lang.String EXTENSION_NAME = "com.adobe.module.analytics";
            public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics();
            public static final java.lang.String VISITOR_IDENTIFIER = "vid";

            private Analytics() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Audience;", "", "<init>", "()V", "", "DPID", "Ljava/lang/String;", "DPUUID", "EXTENSION_NAME", "UUID"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Audience {
            public static final java.lang.String DPID = "dpid";
            public static final java.lang.String DPUUID = "dpuuid";
            public static final java.lang.String EXTENSION_NAME = "com.adobe.module.audience";
            public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience();
            public static final java.lang.String UUID = "uuid";

            private Audience() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Identity;", "", "<init>", "()V", "", "ADVERTISING_IDENTIFIER", "Ljava/lang/String;", "EXTENSION_NAME", "MID", "PUSH_IDENTIFIER", "VISITOR_IDS_LIST"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Identity {
            public static final java.lang.String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            public static final java.lang.String EXTENSION_NAME = "com.adobe.module.identity";
            public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity();
            public static final java.lang.String MID = "mid";
            public static final java.lang.String PUSH_IDENTIFIER = "pushidentifier";
            public static final java.lang.String VISITOR_IDS_LIST = "visitoridslist";

            private Identity() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Target;", "", "<init>", "()V", "", "EXTENSION_NAME", "Ljava/lang/String;", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.THIRD_PARTY_ID, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.TNT_ID}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Target {
            public static final java.lang.String EXTENSION_NAME = "com.adobe.module.target";
            public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target();
            public static final java.lang.String THIRD_PARTY_ID = "thirdpartyid";
            public static final java.lang.String TNT_ID = "tntid";

            private Target() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Configuration;", "", "<init>", "()V", "", "CONFIG_EXPERIENCE_CLOUD_ORG_ID", "Ljava/lang/String;", "EXTENSION_NAME"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
            public static final java.lang.String CONFIG_EXPERIENCE_CLOUD_ORG_ID = "experienceCloud.org";
            public static final java.lang.String EXTENSION_NAME = "com.adobe.module.configuration";
            public static final com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration INSTANCE = new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration();

            private Configuration() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$ID;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final /* data */ class ID {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String Camera2StreamConfigurationMap;
        final java.lang.String getHighSpeedVideoSizes;

        public ID(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoSizes = str3;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ID(getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID)) {
                return false;
            }
            com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID id = (com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, id.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, id.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, id.getHighSpeedVideoSizes);
        }
    }

    public final java.lang.String collectSdkIdentifiers$core_phoneRelease(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        java.lang.String jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.adobe.marketing.mobile.SharedStateResult sharedState = extensionApi.getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = null;
        if ((sharedState != null ? sharedState.getStatus() : null) == com.adobe.marketing.mobile.SharedStateStatus.SET) {
            java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(sharedState != null ? sharedState.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, null);
            if (optString != null && optString.length() > 0) {
                arrayList2.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID("AVID", optString, "integrationCode"));
            }
            java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState != null ? sharedState.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.VISITOR_IDENTIFIER, null);
            if (optString2 != null && optString2.length() > 0) {
                arrayList2.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.VISITOR_IDENTIFIER, optString2, "analytics"));
            }
        }
        arrayList.addAll(arrayList2);
        com.adobe.marketing.mobile.SharedStateResult sharedState2 = extensionApi.getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if ((sharedState2 != null ? sharedState2.getStatus() : null) == com.adobe.marketing.mobile.SharedStateStatus.SET) {
            java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 != null ? sharedState2.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.DPUUID, null);
            if (optString3 != null && optString3.length() > 0) {
                java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 != null ? sharedState2.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.DPID, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "");
                arrayList3.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID(optString4, optString3, "namespaceId"));
            }
            java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 != null ? sharedState2.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, null);
            if (optString5 != null && optString5.length() > 0) {
                arrayList3.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID("0", optString5, "namespaceId"));
            }
        }
        arrayList.addAll(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        com.adobe.marketing.mobile.SharedStateResult sharedState3 = extensionApi.getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState3 != null ? sharedState3.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.MID, null);
        if (optString6 != null) {
            arrayList4.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID("4", optString6, "namespaceId"));
        }
        java.util.List optTypedList = com.adobe.marketing.mobile.util.DataReader.optTypedList(java.util.Map.class, sharedState3 != null ? sharedState3.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.VISITOR_IDS_LIST, kotlin.collections.CollectionsKt.emptyList());
        if (optTypedList != null) {
            java.util.List<com.adobe.marketing.mobile.VisitorID> convertToVisitorIds = com.adobe.marketing.mobile.internal.util.VisitorIDSerializer.convertToVisitorIds(optTypedList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(convertToVisitorIds, "");
            for (com.adobe.marketing.mobile.VisitorID visitorID : convertToVisitorIds) {
                java.lang.String id = visitorID.getId();
                if (id != null && id.length() != 0) {
                    java.lang.String idType = visitorID.getIdType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(idType, "");
                    java.lang.String id2 = visitorID.getId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "");
                    arrayList4.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID(idType, id2, "integrationCode"));
                }
            }
        }
        java.lang.String optString7 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState3 != null ? sharedState3.getValue() : null, "pushidentifier", null);
        if (optString7 != null && optString7.length() > 0) {
            arrayList4.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID("20919", optString7, "integrationCode"));
        }
        arrayList.addAll(arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        com.adobe.marketing.mobile.SharedStateResult sharedState4 = extensionApi.getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        if ((sharedState4 != null ? sharedState4.getStatus() : null) == com.adobe.marketing.mobile.SharedStateStatus.SET) {
            java.lang.String optString8 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState4 != null ? sharedState4.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target.TNT_ID, null);
            if (optString8 != null && optString8.length() > 0) {
                arrayList5.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target.TNT_ID, optString8, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
            }
            java.lang.String optString9 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState4 != null ? sharedState4.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Target.THIRD_PARTY_ID, null);
            if (optString9 != null && optString9.length() > 0) {
                arrayList5.add(new com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID("3rdpartyid", optString9, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
            }
        }
        arrayList.addAll(arrayList5);
        java.util.ArrayList<com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID> arrayList6 = arrayList;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        for (com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.ID id3 : arrayList6) {
            arrayList7.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("namespace", id3.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, id3.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("type", id3.getHighSpeedVideoSizes)));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        com.adobe.marketing.mobile.SharedStateResult sharedState5 = extensionApi.getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        if ((sharedState5 != null ? sharedState5.getStatus() : null) == com.adobe.marketing.mobile.SharedStateStatus.SET) {
            java.lang.String optString10 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState5 != null ? sharedState5.getValue() : null, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORG_ID, null);
            if (optString10 != null && optString10.length() > 0) {
                str = optString10;
            }
        }
        if (str != null) {
            arrayList9.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("namespace", "imsOrgID"), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str)));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!arrayList9.isEmpty()) {
            linkedHashMap.put("companyContexts", arrayList9);
        }
        if (!arrayList8.isEmpty()) {
            linkedHashMap.put("users", kotlin.collections.CollectionsKt.listOf(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userIDs", arrayList8))));
        }
        try {
            jSONObject = new org.json.JSONObject(linkedHashMap).toString();
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject().toString();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }
}
