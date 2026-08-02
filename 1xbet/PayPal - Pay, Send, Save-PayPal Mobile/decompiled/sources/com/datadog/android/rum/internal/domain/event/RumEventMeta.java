package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b0\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "toJson", "()Lcom/google/gson/JsonObject;", "", "getType", "()Ljava/lang/String;", "type", "Companion", "View", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RumEventMeta {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.event.RumEventMeta.Companion INSTANCE = new com.datadog.android.rum.internal.domain.event.RumEventMeta.Companion(null);
    public static final java.lang.String DOCUMENT_VERSION_KEY = "documentVersion";
    public static final java.lang.String HAS_ACCESSIBILITY_KEY = "hasAccessibility";
    public static final java.lang.String TYPE_KEY = "type";
    public static final java.lang.String VIEW_ID_KEY = "viewId";
    public static final java.lang.String VIEW_TYPE_VALUE = "view";

    public abstract java.lang.String getType();

    private RumEventMeta() {
    }

    public com.google.gson.JsonObject toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("type", getType());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", com.datadog.android.rum.internal.domain.event.RumEventMeta.DOCUMENT_VERSION_KEY, "", com.datadog.android.rum.internal.domain.event.RumEventMeta.HAS_ACCESSIBILITY_KEY, "<init>", "(Ljava/lang/String;JLjava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;JLjava/lang/Boolean;)Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonObject;", "toJson", "()Lcom/google/gson/JsonObject;", "toString", "J", "getDocumentVersion", "Ljava/lang/Boolean;", "getHasAccessibility", "type", "Ljava/lang/String;", "getType", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class View extends com.datadog.android.rum.internal.domain.event.RumEventMeta {
        private final long documentVersion;
        private final java.lang.Boolean hasAccessibility;
        private final java.lang.String type;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        public /* synthetic */ View(java.lang.String str, long j, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public final java.lang.Boolean getHasAccessibility() {
            return this.hasAccessibility;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(java.lang.String str, long j, java.lang.Boolean bool) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.viewId = str;
            this.documentVersion = j;
            this.hasAccessibility = bool;
            this.type = "view";
        }

        @Override // com.datadog.android.rum.internal.domain.event.RumEventMeta
        public final java.lang.String getType() {
            return this.type;
        }

        @Override // com.datadog.android.rum.internal.domain.event.RumEventMeta
        public final com.google.gson.JsonObject toJson() {
            com.google.gson.JsonObject json = super.toJson();
            json.addProperty(com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, this.viewId);
            json.addProperty(com.datadog.android.rum.internal.domain.event.RumEventMeta.DOCUMENT_VERSION_KEY, java.lang.Long.valueOf(this.documentVersion));
            json.addProperty(com.datadog.android.rum.internal.domain.event.RumEventMeta.HAS_ACCESSIBILITY_KEY, this.hasAccessibility);
            return json;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            long j = this.documentVersion;
            java.lang.Boolean bool = this.hasAccessibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View(viewId=");
            sb.append(str);
            sb.append(", documentVersion=");
            sb.append(j);
            sb.append(", hasAccessibility=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.viewId.hashCode();
            int hashCode2 = java.lang.Long.hashCode(this.documentVersion);
            java.lang.Boolean bool = this.hasAccessibility;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.event.RumEventMeta.View)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.event.RumEventMeta.View view = (com.datadog.android.rum.internal.domain.event.RumEventMeta.View) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, view.viewId) && this.documentVersion == view.documentVersion && kotlin.jvm.internal.Intrinsics.areEqual(this.hasAccessibility, view.hasAccessibility);
        }

        public final com.datadog.android.rum.internal.domain.event.RumEventMeta.View copy(java.lang.String viewId, long documentVersion, java.lang.Boolean hasAccessibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            return new com.datadog.android.rum.internal.domain.event.RumEventMeta.View(viewId, documentVersion, hasAccessibility);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getHasAccessibility() {
            return this.hasAccessibility;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.event.RumEventMeta.View copy$default(com.datadog.android.rum.internal.domain.event.RumEventMeta.View view, java.lang.String str, long j, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = view.viewId;
            }
            if ((i & 2) != 0) {
                j = view.documentVersion;
            }
            if ((i & 4) != 0) {
                bool = view.hasAccessibility;
            }
            return view.copy(str, j, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "fromJson", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "DOCUMENT_VERSION_KEY", "Ljava/lang/String;", "HAS_ACCESSIBILITY_KEY", "TYPE_KEY", "VIEW_ID_KEY", "VIEW_TYPE_VALUE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.internal.domain.event.RumEventMeta fromJson(java.lang.String jsonString, com.datadog.android.api.InternalLogger internalLogger) throws com.google.gson.JsonParseException {
            com.datadog.android.rum.internal.domain.event.RumEventMeta.View view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                final java.lang.String asString = asJsonObject.get("type").getAsString();
                if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "view")) {
                    java.lang.String asString2 = asJsonObject.get(com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY).getAsString();
                    long asLong = asJsonObject.get(com.datadog.android.rum.internal.domain.event.RumEventMeta.DOCUMENT_VERSION_KEY).getAsLong();
                    com.google.gson.JsonElement jsonElement = asJsonObject.get(com.datadog.android.rum.internal.domain.event.RumEventMeta.HAS_ACCESSIBILITY_KEY);
                    boolean asBoolean = jsonElement == null ? false : jsonElement.getAsBoolean();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    view = new com.datadog.android.rum.internal.domain.event.RumEventMeta.View(asString2, asLong, java.lang.Boolean.valueOf(asBoolean));
                } else {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMeta$Companion$fromJson$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unknown RUM event meta type value [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{asString}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    view = null;
                }
                return view;
            } catch (java.lang.ClassCastException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into RUM event meta", e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into RUM event meta", e2);
            } catch (java.lang.NullPointerException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into RUM event meta", e3);
            } catch (java.lang.NumberFormatException e4) {
                throw new com.google.gson.JsonParseException("Unable to parse json into RUM event meta", e4);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RumEventMeta(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
