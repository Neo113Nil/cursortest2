package com.datadog.android.sessionreplay.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u001a\u0010\u0019\u001a\u00020\u00148\u0007X\u0087D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceMetadata;", "", "Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "application", "<init>", "(Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;)V", "component1", "()Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "copy", "(Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "getApplication", "type", "Ljava/lang/String;", "getType", "Companion", "Application"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResourceMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.model.ResourceMetadata.Companion INSTANCE = new com.datadog.android.sessionreplay.model.ResourceMetadata.Companion(null);
    private final com.datadog.android.sessionreplay.model.ResourceMetadata.Application application;
    private final java.lang.String type;

    public ResourceMetadata(com.datadog.android.sessionreplay.model.ResourceMetadata.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        this.application = application;
        this.type = "resource";
    }

    public final com.datadog.android.sessionreplay.model.ResourceMetadata.Application getApplication() {
        return this.application;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("type", this.type);
        jsonObject.add("application", this.application.toJson());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/ResourceMetadata;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.ResourceMetadata fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceMetadata", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.ResourceMetadata fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                java.lang.String asString = jsonObject.get("type").getAsString();
                com.google.gson.JsonObject asJsonObject = jsonObject.get("application").getAsJsonObject();
                com.datadog.android.sessionreplay.model.ResourceMetadata.Application.Companion companion = com.datadog.android.sessionreplay.model.ResourceMetadata.Application.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                com.datadog.android.sessionreplay.model.ResourceMetadata.Application fromJsonObject = companion.fromJsonObject(asJsonObject);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "resource")) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                return new com.datadog.android.sessionreplay.model.ResourceMetadata(fromJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceMetadata", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceMetadata", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceMetadata", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.ResourceMetadata.Application.Companion INSTANCE = new com.datadog.android.sessionreplay.model.ResourceMetadata.Application.Companion(null);
        private final java.lang.String id;

        public Application(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/ResourceMetadata$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.ResourceMetadata.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.ResourceMetadata.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.sessionreplay.model.ResourceMetadata.Application(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.sessionreplay.model.ResourceMetadata.Application) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.sessionreplay.model.ResourceMetadata.Application) other).id);
        }

        public final com.datadog.android.sessionreplay.model.ResourceMetadata.Application copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.sessionreplay.model.ResourceMetadata.Application(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.ResourceMetadata.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.ResourceMetadata.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.ResourceMetadata.Application copy$default(com.datadog.android.sessionreplay.model.ResourceMetadata.Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }
    }

    public final java.lang.String toString() {
        com.datadog.android.sessionreplay.model.ResourceMetadata.Application application = this.application;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceMetadata(application=");
        sb.append(application);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.application.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.sessionreplay.model.ResourceMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.datadog.android.sessionreplay.model.ResourceMetadata) other).application);
    }

    public final com.datadog.android.sessionreplay.model.ResourceMetadata copy(com.datadog.android.sessionreplay.model.ResourceMetadata.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        return new com.datadog.android.sessionreplay.model.ResourceMetadata(application);
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.sessionreplay.model.ResourceMetadata.Application getApplication() {
        return this.application;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.ResourceMetadata fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.ResourceMetadata fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.model.ResourceMetadata copy$default(com.datadog.android.sessionreplay.model.ResourceMetadata resourceMetadata, com.datadog.android.sessionreplay.model.ResourceMetadata.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            application = resourceMetadata.application;
        }
        return resourceMetadata.copy(application);
    }
}
