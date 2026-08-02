package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0002/0BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011Jb\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b-\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b.\u0010\u0013"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo;", "", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "connectivity", "", "carrierName", "", "carrierId", "upKbps", "downKbps", "strength", "cellularTechnology", "<init>", "(Lcom/datadog/android/api/context/NetworkInfo$Connectivity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "component7", "copy", "(Lcom/datadog/android/api/context/NetworkInfo$Connectivity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson$dd_sdk_android_core_release", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Long;", "getCarrierId", "Ljava/lang/String;", "getCarrierName", "getCellularTechnology", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "getConnectivity", "getDownKbps", "getStrength", "getUpKbps", "Companion", "Connectivity"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetworkInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.context.NetworkInfo.Companion INSTANCE = new com.datadog.android.api.context.NetworkInfo.Companion(null);
    private final java.lang.Long carrierId;
    private final java.lang.String carrierName;
    private final java.lang.String cellularTechnology;
    private final com.datadog.android.api.context.NetworkInfo.Connectivity connectivity;
    private final java.lang.Long downKbps;
    private final java.lang.Long strength;
    private final java.lang.Long upKbps;

    public NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity connectivity, java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivity, "");
        this.connectivity = connectivity;
        this.carrierName = str;
        this.carrierId = l;
        this.upKbps = l2;
        this.downKbps = l3;
        this.strength = l4;
        this.cellularTechnology = str2;
    }

    public /* synthetic */ NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity connectivity, java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED : connectivity, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) == 0 ? str2 : null);
    }

    public final com.datadog.android.api.context.NetworkInfo.Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final java.lang.String getCarrierName() {
        return this.carrierName;
    }

    public final java.lang.Long getCarrierId() {
        return this.carrierId;
    }

    public final java.lang.Long getUpKbps() {
        return this.upKbps;
    }

    public final java.lang.Long getDownKbps() {
        return this.downKbps;
    }

    public final java.lang.Long getStrength() {
        return this.strength;
    }

    public final java.lang.String getCellularTechnology() {
        return this.cellularTechnology;
    }

    public final com.google.gson.JsonElement toJson$dd_sdk_android_core_release() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add("connectivity", this.connectivity.toJson$dd_sdk_android_core_release());
        java.lang.String str = this.carrierName;
        if (str != null) {
            jsonObject.addProperty("carrier_name", str);
        }
        java.lang.Long l = this.carrierId;
        if (l != null) {
            jsonObject.addProperty("carrier_id", java.lang.Long.valueOf(l.longValue()));
        }
        java.lang.Long l2 = this.upKbps;
        if (l2 != null) {
            jsonObject.addProperty("up_kbps", java.lang.Long.valueOf(l2.longValue()));
        }
        java.lang.Long l3 = this.downKbps;
        if (l3 != null) {
            jsonObject.addProperty("down_kbps", java.lang.Long.valueOf(l3.longValue()));
        }
        java.lang.Long l4 = this.strength;
        if (l4 != null) {
            jsonObject.addProperty("strength", java.lang.Long.valueOf(l4.longValue()));
        }
        java.lang.String str2 = this.cellularTechnology;
        if (str2 != null) {
            jsonObject.addProperty("cellular_technology", str2);
        }
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/context/NetworkInfo;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/api/context/NetworkInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.api.context.NetworkInfo fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type NetworkInfo", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.api.context.NetworkInfo fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                com.datadog.android.api.context.NetworkInfo.Connectivity.Companion companion = com.datadog.android.api.context.NetworkInfo.Connectivity.INSTANCE;
                java.lang.String asString = jsonObject.get("connectivity").getAsString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                com.datadog.android.api.context.NetworkInfo.Connectivity fromJson = companion.fromJson(asString);
                com.google.gson.JsonElement jsonElement = jsonObject.get("carrier_name");
                java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                com.google.gson.JsonElement jsonElement2 = jsonObject.get("carrier_id");
                java.lang.Long valueOf = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                com.google.gson.JsonElement jsonElement3 = jsonObject.get("up_kbps");
                java.lang.Long valueOf2 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                com.google.gson.JsonElement jsonElement4 = jsonObject.get("down_kbps");
                java.lang.Long valueOf3 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                com.google.gson.JsonElement jsonElement5 = jsonObject.get("strength");
                java.lang.Long valueOf4 = jsonElement5 != null ? java.lang.Long.valueOf(jsonElement5.getAsLong()) : null;
                com.google.gson.JsonElement jsonElement6 = jsonObject.get("cellular_technology");
                return new com.datadog.android.api.context.NetworkInfo(fromJson, asString2, valueOf, valueOf2, valueOf3, valueOf4, jsonElement6 != null ? jsonElement6.getAsString() : null);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type NetworkInfo", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type NetworkInfo", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type NetworkInfo", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson$dd_sdk_android_core_release", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Companion", "NETWORK_NOT_CONNECTED", "NETWORK_ETHERNET", "NETWORK_WIFI", "NETWORK_WIMAX", "NETWORK_BLUETOOTH", "NETWORK_2G", "NETWORK_3G", "NETWORK_4G", "NETWORK_5G", "NETWORK_MOBILE_OTHER", "NETWORK_CELLULAR", "NETWORK_OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Connectivity {
        NETWORK_NOT_CONNECTED("network_not_connected"),
        NETWORK_ETHERNET("network_ethernet"),
        NETWORK_WIFI("network_wifi"),
        NETWORK_WIMAX("network_wimax"),
        NETWORK_BLUETOOTH("network_bluetooth"),
        NETWORK_2G("network_2G"),
        NETWORK_3G("network_3G"),
        NETWORK_4G("network_4G"),
        NETWORK_5G("network_5G"),
        NETWORK_MOBILE_OTHER("network_mobile_other"),
        NETWORK_CELLULAR("network_cellular"),
        NETWORK_OTHER("network_other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.api.context.NetworkInfo.Connectivity.Companion INSTANCE = new com.datadog.android.api.context.NetworkInfo.Connectivity.Companion(null);
        private final java.lang.String Camera2StreamConfigurationMap;

        Connectivity(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson$dd_sdk_android_core_release() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo$Connectivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.api.context.NetworkInfo.Connectivity fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    for (com.datadog.android.api.context.NetworkInfo.Connectivity connectivity : com.datadog.android.api.context.NetworkInfo.Connectivity.values()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(connectivity.Camera2StreamConfigurationMap, jsonString)) {
                            return connectivity;
                        }
                    }
                    throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
                } catch (java.util.NoSuchElementException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type NetworkInfo.Connectivity", e);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.api.context.NetworkInfo.Connectivity fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        com.datadog.android.api.context.NetworkInfo.Connectivity connectivity = this.connectivity;
        java.lang.String str = this.carrierName;
        java.lang.Long l = this.carrierId;
        java.lang.Long l2 = this.upKbps;
        java.lang.Long l3 = this.downKbps;
        java.lang.Long l4 = this.strength;
        java.lang.String str2 = this.cellularTechnology;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkInfo(connectivity=");
        sb.append(connectivity);
        sb.append(", carrierName=");
        sb.append(str);
        sb.append(", carrierId=");
        sb.append(l);
        sb.append(", upKbps=");
        sb.append(l2);
        sb.append(", downKbps=");
        sb.append(l3);
        sb.append(", strength=");
        sb.append(l4);
        sb.append(", cellularTechnology=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.connectivity.hashCode();
        java.lang.String str = this.carrierName;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Long l = this.carrierId;
        int hashCode3 = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.upKbps;
        int hashCode4 = l2 == null ? 0 : l2.hashCode();
        java.lang.Long l3 = this.downKbps;
        int hashCode5 = l3 == null ? 0 : l3.hashCode();
        java.lang.Long l4 = this.strength;
        int hashCode6 = l4 == null ? 0 : l4.hashCode();
        java.lang.String str2 = this.cellularTechnology;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.NetworkInfo)) {
            return false;
        }
        com.datadog.android.api.context.NetworkInfo networkInfo = (com.datadog.android.api.context.NetworkInfo) other;
        return this.connectivity == networkInfo.connectivity && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierName, networkInfo.carrierName) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierId, networkInfo.carrierId) && kotlin.jvm.internal.Intrinsics.areEqual(this.upKbps, networkInfo.upKbps) && kotlin.jvm.internal.Intrinsics.areEqual(this.downKbps, networkInfo.downKbps) && kotlin.jvm.internal.Intrinsics.areEqual(this.strength, networkInfo.strength) && kotlin.jvm.internal.Intrinsics.areEqual(this.cellularTechnology, networkInfo.cellularTechnology);
    }

    public final com.datadog.android.api.context.NetworkInfo copy(com.datadog.android.api.context.NetworkInfo.Connectivity connectivity, java.lang.String carrierName, java.lang.Long carrierId, java.lang.Long upKbps, java.lang.Long downKbps, java.lang.Long strength, java.lang.String cellularTechnology) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivity, "");
        return new com.datadog.android.api.context.NetworkInfo(connectivity, carrierName, carrierId, upKbps, downKbps, strength, cellularTechnology);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCellularTechnology() {
        return this.cellularTechnology;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Long getStrength() {
        return this.strength;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getDownKbps() {
        return this.downKbps;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getUpKbps() {
        return this.upKbps;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getCarrierId() {
        return this.carrierId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCarrierName() {
        return this.carrierName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.api.context.NetworkInfo.Connectivity getConnectivity() {
        return this.connectivity;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.api.context.NetworkInfo fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.api.context.NetworkInfo fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }

    public static /* synthetic */ com.datadog.android.api.context.NetworkInfo copy$default(com.datadog.android.api.context.NetworkInfo networkInfo, com.datadog.android.api.context.NetworkInfo.Connectivity connectivity, java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            connectivity = networkInfo.connectivity;
        }
        if ((i & 2) != 0) {
            str = networkInfo.carrierName;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            l = networkInfo.carrierId;
        }
        java.lang.Long l5 = l;
        if ((i & 8) != 0) {
            l2 = networkInfo.upKbps;
        }
        java.lang.Long l6 = l2;
        if ((i & 16) != 0) {
            l3 = networkInfo.downKbps;
        }
        java.lang.Long l7 = l3;
        if ((i & 32) != 0) {
            l4 = networkInfo.strength;
        }
        java.lang.Long l8 = l4;
        if ((i & 64) != 0) {
            str2 = networkInfo.cellularTechnology;
        }
        return networkInfo.copy(connectivity, str3, l5, l6, l7, l8, str2);
    }

    public NetworkInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
