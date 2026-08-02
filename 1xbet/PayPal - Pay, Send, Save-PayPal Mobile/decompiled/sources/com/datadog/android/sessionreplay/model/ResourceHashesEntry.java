package com.datadog.android.sessionreplay.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "", "", "lastUpdateDateNs", "", "", "resourceHashes", "<init>", "(Ljava/lang/Number;Ljava/util/List;)V", "component1", "()Ljava/lang/Number;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Number;Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getLastUpdateDateNs", "Ljava/util/List;", "getResourceHashes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResourceHashesEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.model.ResourceHashesEntry.Companion INSTANCE = new com.datadog.android.sessionreplay.model.ResourceHashesEntry.Companion(null);
    private final java.lang.Number lastUpdateDateNs;
    private final java.util.List<java.lang.String> resourceHashes;

    public ResourceHashesEntry(java.lang.Number number, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.lastUpdateDateNs = number;
        this.resourceHashes = list;
    }

    public final java.lang.Number getLastUpdateDateNs() {
        return this.lastUpdateDateNs;
    }

    public final java.util.List<java.lang.String> getResourceHashes() {
        return this.resourceHashes;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("last_update_date_ns", this.lastUpdateDateNs);
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.resourceHashes.size());
        java.util.Iterator<T> it = this.resourceHashes.iterator();
        while (it.hasNext()) {
            jsonArray.add((java.lang.String) it.next());
        }
        jsonObject.add("resource_hashes", jsonArray);
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.ResourceHashesEntry fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceHashesEntry", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.ResourceHashesEntry fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                java.lang.Number asNumber = jsonObject.get("last_update_date_ns").getAsNumber();
                com.google.gson.JsonArray asJsonArray = jsonObject.get("resource_hashes").getAsJsonArray();
                java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAsString());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                return new com.datadog.android.sessionreplay.model.ResourceHashesEntry(asNumber, arrayList);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceHashesEntry", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceHashesEntry", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceHashesEntry", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Number number = this.lastUpdateDateNs;
        java.util.List<java.lang.String> list = this.resourceHashes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceHashesEntry(lastUpdateDateNs=");
        sb.append(number);
        sb.append(", resourceHashes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.lastUpdateDateNs.hashCode() * 31) + this.resourceHashes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.model.ResourceHashesEntry)) {
            return false;
        }
        com.datadog.android.sessionreplay.model.ResourceHashesEntry resourceHashesEntry = (com.datadog.android.sessionreplay.model.ResourceHashesEntry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lastUpdateDateNs, resourceHashesEntry.lastUpdateDateNs) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceHashes, resourceHashesEntry.resourceHashes);
    }

    public final com.datadog.android.sessionreplay.model.ResourceHashesEntry copy(java.lang.Number lastUpdateDateNs, java.util.List<java.lang.String> resourceHashes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastUpdateDateNs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceHashes, "");
        return new com.datadog.android.sessionreplay.model.ResourceHashesEntry(lastUpdateDateNs, resourceHashes);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.resourceHashes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Number getLastUpdateDateNs() {
        return this.lastUpdateDateNs;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.ResourceHashesEntry fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.ResourceHashesEntry fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.sessionreplay.model.ResourceHashesEntry copy$default(com.datadog.android.sessionreplay.model.ResourceHashesEntry resourceHashesEntry, java.lang.Number number, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            number = resourceHashesEntry.lastUpdateDateNs;
        }
        if ((i & 2) != 0) {
            list = resourceHashesEntry.resourceHashes;
        }
        return resourceHashesEntry.copy(number, list);
    }
}
