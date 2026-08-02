package com.datadog.android.sessionreplay.model;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u001cIJKHLMNOPQRSTUVWXYZ[\\]^_`abcBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J~\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010#R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\bE\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010\u001d"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "application", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "session", "Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "view", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "recordsCount", "indexInView", "", "hasFullSnapshot", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "source", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "records", "<init>", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;Lcom/datadog/android/sessionreplay/model/MobileSegment$View;JJJLjava/lang/Long;Ljava/lang/Boolean;Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;Ljava/util/List;)V", "component1", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "component10", "()Ljava/util/List;", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "component3", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "component4", "()J", "component5", "component6", "component7", "()Ljava/lang/Long;", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;Lcom/datadog/android/sessionreplay/model/MobileSegment$View;JJJLjava/lang/Long;Ljava/lang/Boolean;Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "getApplication", "J", "getEnd", "Ljava/lang/Boolean;", "getHasFullSnapshot", "Ljava/lang/Long;", "getIndexInView", "Ljava/util/List;", "getRecords", "getRecordsCount", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "getSession", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "getSource", "getStart", "Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "getView", "Companion", "Add", "Alignment", "Application", "Data", "Data1", "Data2", "Data3", "Horizontal", "MobileIncrementalData", "MobileRecord", "Padding", "PointerEventType", "PointerType", "Position", "Remove", "Session", "ShapeBorder", "ShapeStyle", "Source", "TextPosition", "TextStyle", "TruncationMode", "Vertical", "View", "Wireframe", "WireframeClip", "WireframeUpdateMutation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MobileSegment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.model.MobileSegment.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Companion(null);
    private final com.datadog.android.sessionreplay.model.MobileSegment.Application application;
    private final long end;
    private final java.lang.Boolean hasFullSnapshot;
    private final java.lang.Long indexInView;
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> records;
    private final long recordsCount;
    private final com.datadog.android.sessionreplay.model.MobileSegment.Session session;
    private final com.datadog.android.sessionreplay.model.MobileSegment.Source source;
    private final long start;
    private final com.datadog.android.sessionreplay.model.MobileSegment.View view;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileSegment(com.datadog.android.sessionreplay.model.MobileSegment.Application application, com.datadog.android.sessionreplay.model.MobileSegment.Session session, com.datadog.android.sessionreplay.model.MobileSegment.View view, long j, long j2, long j3, java.lang.Long l, java.lang.Boolean bool, com.datadog.android.sessionreplay.model.MobileSegment.Source source, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.application = application;
        this.session = session;
        this.view = view;
        this.start = j;
        this.end = j2;
        this.recordsCount = j3;
        this.indexInView = l;
        this.hasFullSnapshot = bool;
        this.source = source;
        this.records = list;
    }

    public /* synthetic */ MobileSegment(com.datadog.android.sessionreplay.model.MobileSegment.Application application, com.datadog.android.sessionreplay.model.MobileSegment.Session session, com.datadog.android.sessionreplay.model.MobileSegment.View view, long j, long j2, long j3, java.lang.Long l, java.lang.Boolean bool, com.datadog.android.sessionreplay.model.MobileSegment.Source source, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(application, session, view, j, j2, j3, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool, source, list);
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment.Application getApplication() {
        return this.application;
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment.Session getSession() {
        return this.session;
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment.View getView() {
        return this.view;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getRecordsCount() {
        return this.recordsCount;
    }

    public final java.lang.Long getIndexInView() {
        return this.indexInView;
    }

    public final java.lang.Boolean getHasFullSnapshot() {
        return this.hasFullSnapshot;
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment.Source getSource() {
        return this.source;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> getRecords() {
        return this.records;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add("application", this.application.toJson());
        jsonObject.add("session", this.session.toJson());
        jsonObject.add("view", this.view.toJson());
        jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
        jsonObject.addProperty("end", java.lang.Long.valueOf(this.end));
        jsonObject.addProperty("records_count", java.lang.Long.valueOf(this.recordsCount));
        java.lang.Long l = this.indexInView;
        if (l != null) {
            jsonObject.addProperty("index_in_view", java.lang.Long.valueOf(l.longValue()));
        }
        java.lang.Boolean bool = this.hasFullSnapshot;
        if (bool != null) {
            jsonObject.addProperty("has_full_snapshot", java.lang.Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add("source", this.source.toJson());
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.records.size());
        java.util.Iterator<T> it = this.records.iterator();
        while (it.hasNext()) {
            jsonArray.add(((com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord) it.next()).toJson());
        }
        jsonObject.add("records", jsonArray);
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.MobileSegment fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileSegment", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.sessionreplay.model.MobileSegment fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                com.google.gson.JsonObject asJsonObject = jsonObject.get("application").getAsJsonObject();
                com.datadog.android.sessionreplay.model.MobileSegment.Application.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Application.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                com.datadog.android.sessionreplay.model.MobileSegment.Application fromJsonObject = companion.fromJsonObject(asJsonObject);
                com.google.gson.JsonObject asJsonObject2 = jsonObject.get("session").getAsJsonObject();
                com.datadog.android.sessionreplay.model.MobileSegment.Session.Companion companion2 = com.datadog.android.sessionreplay.model.MobileSegment.Session.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                com.datadog.android.sessionreplay.model.MobileSegment.Session fromJsonObject2 = companion2.fromJsonObject(asJsonObject2);
                com.google.gson.JsonObject asJsonObject3 = jsonObject.get("view").getAsJsonObject();
                com.datadog.android.sessionreplay.model.MobileSegment.View.Companion companion3 = com.datadog.android.sessionreplay.model.MobileSegment.View.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
                com.datadog.android.sessionreplay.model.MobileSegment.View fromJsonObject3 = companion3.fromJsonObject(asJsonObject3);
                long asLong = jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong();
                long asLong2 = jsonObject.get("end").getAsLong();
                long asLong3 = jsonObject.get("records_count").getAsLong();
                com.google.gson.JsonElement jsonElement = jsonObject.get("index_in_view");
                java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                com.google.gson.JsonElement jsonElement2 = jsonObject.get("has_full_snapshot");
                java.lang.Boolean valueOf2 = jsonElement2 != null ? java.lang.Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                com.datadog.android.sessionreplay.model.MobileSegment.Source.Companion companion4 = com.datadog.android.sessionreplay.model.MobileSegment.Source.INSTANCE;
                java.lang.String asString = jsonObject.get("source").getAsString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                com.datadog.android.sessionreplay.model.MobileSegment.Source fromJson = companion4.fromJson(asString);
                com.google.gson.JsonArray asJsonArray = jsonObject.get("records").getAsJsonArray();
                java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                for (com.google.gson.JsonElement jsonElement3 : asJsonArray) {
                    com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.Companion companion5 = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement3, "");
                    arrayList.add(companion5.fromJsonElement(jsonElement3));
                }
                return new com.datadog.android.sessionreplay.model.MobileSegment(fromJsonObject, fromJsonObject2, fromJsonObject3, asLong, asLong2, asLong3, valueOf, valueOf2, fromJson, arrayList);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileSegment", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileSegment", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileSegment", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Application.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Application.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.sessionreplay.model.MobileSegment.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Application(asString);
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
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Application) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.sessionreplay.model.MobileSegment.Application) other).id);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Application copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.Application(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Application copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Session {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Session.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Session.Companion(null);
        private final java.lang.String id;

        public Session(java.lang.String str) {
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Session;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Session fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Session", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Session(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Session", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Session", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Session", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Session(id=");
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
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.sessionreplay.model.MobileSegment.Session) other).id);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Session copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Session fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Session copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Session session, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class View {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.View.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.View.Companion(null);
        private final java.lang.String id;

        public View(java.lang.String str) {
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$View;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.View fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type View", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.View(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type View", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type View", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type View", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View(id=");
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
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.View) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.sessionreplay.model.MobileSegment.View) other).id);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.View copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.View(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.View fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.View copy$default(com.datadog.android.sessionreplay.model.MobileSegment.View view, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = view.id;
            }
            return view.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Companion", "FocusRecord", "MetaRecord", "MobileFullSnapshotRecord", "MobileIncrementalSnapshotRecord", "ViewEndRecord", "VisualViewportRecord", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MobileRecord {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.Companion(null);

        public abstract com.google.gson.JsonElement toJson();

        private MobileRecord() {
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(JLcom/datadog/android/sessionreplay/model/MobileSegment$Data;)V", "component1", "()J", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "copy", "(JLcom/datadog/android/sessionreplay/model/MobileSegment$Data;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "getData", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class MobileFullSnapshotRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.Data data;
            private final long timestamp;
            private final long type;

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Data getData() {
                return this.data;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MobileFullSnapshotRecord(long j, com.datadog.android.sessionreplay.model.MobileSegment.Data data) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                this.timestamp = j;
                this.data = data;
                this.type = 10L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data.toJson());
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileFullSnapshotRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileFullSnapshotRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        long asLong2 = jsonObject.get("type").getAsLong();
                        com.google.gson.JsonObject asJsonObject = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonObject();
                        com.datadog.android.sessionreplay.model.MobileSegment.Data.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Data.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.Data fromJsonObject = companion.fromJsonObject(asJsonObject);
                        if (asLong2 != 10) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord(asLong, fromJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileFullSnapshotRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileFullSnapshotRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileFullSnapshotRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                com.datadog.android.sessionreplay.model.MobileSegment.Data data = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileFullSnapshotRecord(timestamp=");
                sb.append(j);
                sb.append(", data=");
                sb.append(data);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Long.hashCode(this.timestamp) * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord mobileFullSnapshotRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord) other;
                return this.timestamp == mobileFullSnapshotRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.data, mobileFullSnapshotRecord.data);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord copy(long timestamp, com.datadog.android.sessionreplay.model.MobileSegment.Data data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord(timestamp, data);
            }

            /* renamed from: component2, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord mobileFullSnapshotRecord, long j, com.datadog.android.sessionreplay.model.MobileSegment.Data data, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = mobileFullSnapshotRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    data = mobileFullSnapshotRecord.data;
                }
                return mobileFullSnapshotRecord.copy(j, data);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(JLcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;)V", "component1", "()J", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "copy", "(JLcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "getData", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class MobileIncrementalSnapshotRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData data;
            private final long timestamp;
            private final long type;

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData getData() {
                return this.data;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MobileIncrementalSnapshotRecord(long j, com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData mobileIncrementalData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileIncrementalData, "");
                this.timestamp = j;
                this.data = mobileIncrementalData;
                this.type = 11L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data.toJson());
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MobileIncrementalSnapshotRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileIncrementalSnapshotRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        long asLong2 = jsonObject.get("type").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData fromJsonElement = companion.fromJsonElement(jsonElement);
                        if (asLong2 != 11) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord(asLong, fromJsonElement);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileIncrementalSnapshotRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileIncrementalSnapshotRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileIncrementalSnapshotRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData mobileIncrementalData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileIncrementalSnapshotRecord(timestamp=");
                sb.append(j);
                sb.append(", data=");
                sb.append(mobileIncrementalData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Long.hashCode(this.timestamp) * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord mobileIncrementalSnapshotRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord) other;
                return this.timestamp == mobileIncrementalSnapshotRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.data, mobileIncrementalSnapshotRecord.data);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord copy(long timestamp, com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord(timestamp, data);
            }

            /* renamed from: component2, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord mobileIncrementalSnapshotRecord, long j, com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData mobileIncrementalData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = mobileIncrementalSnapshotRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    mobileIncrementalData = mobileIncrementalSnapshotRecord.data;
                }
                return mobileIncrementalSnapshotRecord.copy(j, mobileIncrementalData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "", "slotId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "copy", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "getData", "Ljava/lang/String;", "getSlotId", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class MetaRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.Data1 data;
            private final java.lang.String slotId;
            private final long timestamp;
            private final long type;

            public /* synthetic */ MetaRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : str, data1);
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Data1 getData() {
                return this.data;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MetaRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data1, "");
                this.timestamp = j;
                this.slotId = str;
                this.data = data1;
                this.type = 4L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                java.lang.String str = this.slotId;
                if (str != null) {
                    jsonObject.addProperty("slotId", str);
                }
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data.toJson());
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$MetaRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MetaRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("slotId");
                        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                        long asLong2 = jsonObject.get("type").getAsLong();
                        com.google.gson.JsonObject asJsonObject = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonObject();
                        com.datadog.android.sessionreplay.model.MobileSegment.Data1.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Data1.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.Data1 fromJsonObject = companion.fromJsonObject(asJsonObject);
                        if (asLong2 != 4) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord(asLong, asString, fromJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MetaRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MetaRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MetaRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                java.lang.String str = this.slotId;
                com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1 = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MetaRecord(timestamp=");
                sb.append(j);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(data1);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.timestamp);
                java.lang.String str = this.slotId;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord metaRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord) other;
                return this.timestamp == metaRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, metaRecord.slotId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, metaRecord.data);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord copy(long timestamp, java.lang.String slotId, com.datadog.android.sessionreplay.model.MobileSegment.Data1 data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord(timestamp, slotId, data);
            }

            /* renamed from: component3, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data1 getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord metaRecord, long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = metaRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    str = metaRecord.slotId;
                }
                if ((i & 4) != 0) {
                    data1 = metaRecord.data;
                }
                return metaRecord.copy(j, str, data1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "", "slotId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "copy", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "getData", "Ljava/lang/String;", "getSlotId", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class FocusRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.Data2 data;
            private final java.lang.String slotId;
            private final long timestamp;
            private final long type;

            public /* synthetic */ FocusRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data2 data2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : str, data2);
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Data2 getData() {
                return this.data;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FocusRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data2 data2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
                this.timestamp = j;
                this.slotId = str;
                this.data = data2;
                this.type = 6L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                java.lang.String str = this.slotId;
                if (str != null) {
                    jsonObject.addProperty("slotId", str);
                }
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data.toJson());
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$FocusRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type FocusRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("slotId");
                        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                        long asLong2 = jsonObject.get("type").getAsLong();
                        com.google.gson.JsonObject asJsonObject = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonObject();
                        com.datadog.android.sessionreplay.model.MobileSegment.Data2.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Data2.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.Data2 fromJsonObject = companion.fromJsonObject(asJsonObject);
                        if (asLong2 != 6) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord(asLong, asString, fromJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type FocusRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type FocusRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type FocusRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                java.lang.String str = this.slotId;
                com.datadog.android.sessionreplay.model.MobileSegment.Data2 data2 = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FocusRecord(timestamp=");
                sb.append(j);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(data2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.timestamp);
                java.lang.String str = this.slotId;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord focusRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord) other;
                return this.timestamp == focusRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, focusRecord.slotId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, focusRecord.data);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord copy(long timestamp, java.lang.String slotId, com.datadog.android.sessionreplay.model.MobileSegment.Data2 data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord(timestamp, slotId, data);
            }

            /* renamed from: component3, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data2 getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord focusRecord, long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data2 data2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = focusRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    str = focusRecord.slotId;
                }
                if ((i & 4) != 0) {
                    data2 = focusRecord.data;
                }
                return focusRecord.copy(j, str, data2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "", "slotId", "<init>", "(JLjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getSlotId", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ViewEndRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord.Companion(null);
            private final java.lang.String slotId;
            private final long timestamp;
            private final long type;

            public /* synthetic */ ViewEndRecord(long j, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : str);
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public ViewEndRecord(long j, java.lang.String str) {
                super(null);
                this.timestamp = j;
                this.slotId = str;
                this.type = 7L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                java.lang.String str = this.slotId;
                if (str != null) {
                    jsonObject.addProperty("slotId", str);
                }
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$ViewEndRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEndRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("slotId");
                        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                        if (jsonObject.get("type").getAsLong() != 7) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord(asLong, asString);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEndRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEndRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEndRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                java.lang.String str = this.slotId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewEndRecord(timestamp=");
                sb.append(j);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.timestamp);
                java.lang.String str = this.slotId;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord viewEndRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord) other;
                return this.timestamp == viewEndRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, viewEndRecord.slotId);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord copy(long timestamp, java.lang.String slotId) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord(timestamp, slotId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord viewEndRecord, long j, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = viewEndRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    str = viewEndRecord.slotId;
                }
                return viewEndRecord.copy(j, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "", "timestamp", "", "slotId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "copy", "(JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "getData", "Ljava/lang/String;", "getSlotId", "J", "getTimestamp", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class VisualViewportRecord extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.Data3 data;
            private final java.lang.String slotId;
            private final long timestamp;
            private final long type;

            public /* synthetic */ VisualViewportRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : str, data3);
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Data3 getData() {
                return this.data;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VisualViewportRecord(long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data3, "");
                this.timestamp = j;
                this.slotId = str;
                this.data = data3;
                this.type = 8L;
            }

            public final long getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
                java.lang.String str = this.slotId;
                if (str != null) {
                    jsonObject.addProperty("slotId", str);
                }
                jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data.toJson());
                jsonObject.addProperty("type", java.lang.Long.valueOf(this.type));
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$VisualViewportRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type VisualViewportRecord", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("timestamp").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("slotId");
                        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                        com.google.gson.JsonObject asJsonObject = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonObject();
                        com.datadog.android.sessionreplay.model.MobileSegment.Data3.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Data3.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.Data3 fromJsonObject = companion.fromJsonObject(asJsonObject);
                        if (jsonObject.get("type").getAsLong() != 8) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord(asLong, asString, fromJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type VisualViewportRecord", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type VisualViewportRecord", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type VisualViewportRecord", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.timestamp;
                java.lang.String str = this.slotId;
                com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3 = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("VisualViewportRecord(timestamp=");
                sb.append(j);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(data3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.timestamp);
                java.lang.String str = this.slotId;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord visualViewportRecord = (com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord) other;
                return this.timestamp == visualViewportRecord.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, visualViewportRecord.slotId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, visualViewportRecord.data);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord copy(long timestamp, java.lang.String slotId, com.datadog.android.sessionreplay.model.MobileSegment.Data3 data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord(timestamp, slotId, data);
            }

            /* renamed from: component3, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data3 getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord visualViewportRecord, long j, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = visualViewportRecord.timestamp;
                }
                if ((i & 2) != 0) {
                    str = visualViewportRecord.slotId;
                }
                if ((i & 4) != 0) {
                    data3 = visualViewportRecord.data;
                }
                return visualViewportRecord.copy(j, str, data3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "Lcom/google/gson/JsonElement;", "jsonElement", "fromJsonElement", "(Lcom/google/gson/JsonElement;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(jsonString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    return fromJsonElement(parseString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type MobileRecord", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord mobileFullSnapshotRecord;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord mobileIncrementalSnapshotRecord;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord metaRecord;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord focusRecord;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord viewEndRecord;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord visualViewportRecord;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = jsonElement instanceof com.google.gson.JsonObject;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord mobileRecord = null;
                try {
                } catch (com.google.gson.JsonParseException e) {
                    arrayList.add(e);
                    mobileFullSnapshotRecord = null;
                }
                if (z) {
                    mobileFullSnapshotRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                    try {
                    } catch (com.google.gson.JsonParseException e2) {
                        arrayList.add(e2);
                        mobileIncrementalSnapshotRecord = null;
                    }
                    if (z) {
                        mobileIncrementalSnapshotRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                        try {
                        } catch (com.google.gson.JsonParseException e3) {
                            arrayList.add(e3);
                            metaRecord = null;
                        }
                        if (z) {
                            metaRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                            try {
                            } catch (com.google.gson.JsonParseException e4) {
                                arrayList.add(e4);
                                focusRecord = null;
                            }
                            if (z) {
                                focusRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                try {
                                } catch (com.google.gson.JsonParseException e5) {
                                    arrayList.add(e5);
                                    viewEndRecord = null;
                                }
                                if (z) {
                                    viewEndRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                    try {
                                    } catch (com.google.gson.JsonParseException e6) {
                                        arrayList.add(e6);
                                        visualViewportRecord = null;
                                    }
                                    if (z) {
                                        visualViewportRecord = com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.VisualViewportRecord.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                        int i = 0;
                                        com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord[] mobileRecordArr = {mobileFullSnapshotRecord, mobileIncrementalSnapshotRecord, metaRecord, focusRecord, viewEndRecord, visualViewportRecord};
                                        while (true) {
                                            if (i < 6) {
                                                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord mobileRecord2 = mobileRecordArr[i];
                                                if (mobileRecord2 != null) {
                                                    mobileRecord = mobileRecord2;
                                                    break;
                                                }
                                                i++;
                                            } else {
                                                break;
                                            }
                                        }
                                        if (mobileRecord != null) {
                                            return mobileRecord;
                                        }
                                        throw new com.google.gson.JsonParseException("Unable to parse json into one of type \nMobileRecord\n".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.CharSequence>() { // from class: com.datadog.android.sessionreplay.model.MobileSegment$MobileRecord$Companion$fromJsonElement$message$1
                                            @Override // kotlin.jvm.functions.Function1
                                            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                                            public final java.lang.CharSequence invoke(java.lang.Throwable th) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                                return java.lang.String.valueOf(th.getMessage());
                                            }
                                        }, 30, null))));
                                    }
                                    throw new com.google.gson.JsonParseException("Unable to parse json into type VisualViewportRecord");
                                }
                                throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEndRecord");
                            }
                            throw new com.google.gson.JsonParseException("Unable to parse json into type FocusRecord");
                        }
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MetaRecord");
                    }
                    throw new com.google.gson.JsonParseException("Unable to parse json into type MobileIncrementalSnapshotRecord");
                }
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileFullSnapshotRecord");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonElement(jsonElement);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public /* synthetic */ MobileRecord(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframes", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWireframes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Data.Companion(null);
        private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.wireframes = list;
        }

        public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> getWireframes() {
            return this.wireframes;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.wireframes.size());
            java.util.Iterator<T> it = this.wireframes.iterator();
            while (it.hasNext()) {
                jsonArray.add(((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) it.next()).toJson());
            }
            jsonObject.add("wireframes", jsonArray);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonArray asJsonArray = jsonObject.get("wireframes").getAsJsonArray();
                    java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    for (com.google.gson.JsonElement jsonElement : asJsonArray) {
                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement, "");
                        arrayList.add(companion.fromJsonElement(jsonElement));
                    }
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Data(arrayList);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = this.wireframes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(wireframes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.wireframes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.wireframes, ((com.datadog.android.sessionreplay.model.MobileSegment.Data) other).wireframes);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Data copy(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframes, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.Data(wireframes);
        }

        public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> component1() {
            return this.wireframes;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Data copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.wireframes;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Companion", "MobileMutationData", "PointerInteractionData", "TouchData", "ViewportResizeData", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MobileIncrementalData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.Companion(null);

        public abstract com.google.gson.JsonElement toJson();

        private MobileIncrementalData() {
        }

        @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\fR\u001a\u0010#\u001a\u00020\"8\u0007X\u0087D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b'\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;", "adds", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;", "removes", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "updates", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAdds", "getRemoves", "", "source", "J", "getSource", "()J", "getUpdates", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class MobileMutationData extends com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData.Companion(null);
            private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> adds;
            private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> removes;
            private final long source;
            private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> updates;

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> getAdds() {
                return this.adds;
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> getRemoves() {
                return this.removes;
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> getUpdates() {
                return this.updates;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public MobileMutationData(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> list, java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> list2, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> list3) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
                this.adds = list;
                this.removes = list2;
                this.updates = list3;
            }

            public final long getSource() {
                return this.source;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("source", java.lang.Long.valueOf(this.source));
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.adds.size());
                java.util.Iterator<T> it = this.adds.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.sessionreplay.model.MobileSegment.Add) it.next()).toJson());
                }
                jsonObject.add("adds", jsonArray);
                com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray(this.removes.size());
                java.util.Iterator<T> it2 = this.removes.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(((com.datadog.android.sessionreplay.model.MobileSegment.Remove) it2.next()).toJson());
                }
                jsonObject.add("removes", jsonArray2);
                com.google.gson.JsonArray jsonArray3 = new com.google.gson.JsonArray(this.updates.size());
                java.util.Iterator<T> it3 = this.updates.iterator();
                while (it3.hasNext()) {
                    jsonArray3.add(((com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation) it3.next()).toJson());
                }
                jsonObject.add("updates", jsonArray3);
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileMutationData", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("source").getAsLong();
                        com.google.gson.JsonArray asJsonArray = jsonObject.get("adds").getAsJsonArray();
                        java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                        for (com.google.gson.JsonElement jsonElement : asJsonArray) {
                            com.datadog.android.sessionreplay.model.MobileSegment.Add.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Add.INSTANCE;
                            com.google.gson.JsonObject asJsonObject = jsonElement.getAsJsonObject();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                            arrayList.add(companion.fromJsonObject(asJsonObject));
                        }
                        com.google.gson.JsonArray asJsonArray2 = jsonObject.get("removes").getAsJsonArray();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(asJsonArray2.size());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray2, "");
                        for (com.google.gson.JsonElement jsonElement2 : asJsonArray2) {
                            com.datadog.android.sessionreplay.model.MobileSegment.Remove.Companion companion2 = com.datadog.android.sessionreplay.model.MobileSegment.Remove.INSTANCE;
                            com.google.gson.JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                            arrayList2.add(companion2.fromJsonObject(asJsonObject2));
                        }
                        com.google.gson.JsonArray asJsonArray3 = jsonObject.get("updates").getAsJsonArray();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(asJsonArray3.size());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray3, "");
                        for (com.google.gson.JsonElement jsonElement3 : asJsonArray3) {
                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.Companion companion3 = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.INSTANCE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement3, "");
                            arrayList3.add(companion3.fromJsonElement(jsonElement3));
                        }
                        if (asLong != 0) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData(arrayList, arrayList2, arrayList3);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileMutationData", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileMutationData", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type MobileMutationData", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> list = this.adds;
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> list2 = this.removes;
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> list3 = this.updates;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileMutationData(adds=");
                sb.append(list);
                sb.append(", removes=");
                sb.append(list2);
                sb.append(", updates=");
                sb.append(list3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.adds.hashCode() * 31) + this.removes.hashCode()) * 31) + this.updates.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData mobileMutationData = (com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.adds, mobileMutationData.adds) && kotlin.jvm.internal.Intrinsics.areEqual(this.removes, mobileMutationData.removes) && kotlin.jvm.internal.Intrinsics.areEqual(this.updates, mobileMutationData.updates);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData copy(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> adds, java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> removes, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> updates) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adds, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removes, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updates, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData(adds, removes, updates);
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation> component3() {
                return this.updates;
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Remove> component2() {
                return this.removes;
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Add> component1() {
                return this.adds;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData mobileMutationData, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = mobileMutationData.adds;
                }
                if ((i & 2) != 0) {
                    list2 = mobileMutationData.removes;
                }
                if ((i & 4) != 0) {
                    list3 = mobileMutationData.updates;
                }
                return mobileMutationData.copy(list, list2, list3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;", "positions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPositions", "", "source", "J", "getSource", "()J", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TouchData extends com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData.Companion(null);
            private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> positions;
            private final long source;

            public /* synthetic */ TouchData(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list);
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> getPositions() {
                return this.positions;
            }

            public TouchData(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> list) {
                super(null);
                this.positions = list;
                this.source = 2L;
            }

            public final long getSource() {
                return this.source;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("source", java.lang.Long.valueOf(this.source));
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> list = this.positions;
                if (list != null) {
                    com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        jsonArray.add(((com.datadog.android.sessionreplay.model.MobileSegment.Position) it.next()).toJson());
                    }
                    jsonObject.add("positions", jsonArray);
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$TouchData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TouchData", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    java.util.ArrayList arrayList;
                    com.google.gson.JsonArray asJsonArray;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("source").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("positions");
                        if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new java.util.ArrayList(asJsonArray.size());
                            for (com.google.gson.JsonElement jsonElement2 : asJsonArray) {
                                com.datadog.android.sessionreplay.model.MobileSegment.Position.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Position.INSTANCE;
                                com.google.gson.JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                                arrayList.add(companion.fromJsonObject(asJsonObject));
                            }
                        }
                        if (asLong != 2) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData(arrayList);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TouchData", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TouchData", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TouchData", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> list = this.positions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TouchData(positions=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> list = this.positions;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData) && kotlin.jvm.internal.Intrinsics.areEqual(this.positions, ((com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData) other).positions);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData copy(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> positions) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData(positions);
            }

            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Position> component1() {
                return this.positions;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData touchData, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = touchData.positions;
                }
                return touchData.copy(list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TouchData() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "", "width", "height", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getHeight", "source", "getSource", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ViewportResizeData extends com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData.Companion(null);
            private final long height;
            private final long source;
            private final long width;

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public ViewportResizeData(long j, long j2) {
                super(null);
                this.width = j;
                this.height = j2;
                this.source = 4L;
            }

            public final long getSource() {
                return this.source;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("source", java.lang.Long.valueOf(this.source));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$ViewportResizeData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewportResizeData", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("source").getAsLong();
                        long asLong2 = jsonObject.get("width").getAsLong();
                        long asLong3 = jsonObject.get("height").getAsLong();
                        if (asLong != 4) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData(asLong2, asLong3);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewportResizeData", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewportResizeData", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewportResizeData", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.width;
                long j2 = this.height;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewportResizeData(width=");
                sb.append(j);
                sb.append(", height=");
                sb.append(j2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Long.hashCode(this.width) * 31) + java.lang.Long.hashCode(this.height);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData viewportResizeData = (com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData) other;
                return this.width == viewportResizeData.width && this.height == viewportResizeData.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData copy(long width, long height) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData(width, height);
            }

            /* renamed from: component2, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component1, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData viewportResizeData, long j, long j2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = viewportResizeData.width;
                }
                if ((i & 2) != 0) {
                    j2 = viewportResizeData.height;
                }
                return viewportResizeData.copy(j, j2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087D¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "pointerEventType", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;", "pointerType", "", "pointerId", "", "x", "y", "<init>", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;JLjava/lang/Number;Ljava/lang/Number;)V", "component1", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;", "component3", "()J", "component4", "()Ljava/lang/Number;", "component5", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;JLjava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "getPointerEventType", "J", "getPointerId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;", "getPointerType", "source", "getSource", "Ljava/lang/Number;", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PointerInteractionData extends com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType;
            private final long pointerId;
            private final com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType;
            private final long source;
            private final java.lang.Number x;
            private final java.lang.Number y;

            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType getPointerEventType() {
                return this.pointerEventType;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerType getPointerType() {
                return this.pointerType;
            }

            public final long getPointerId() {
                return this.pointerId;
            }

            public final java.lang.Number getX() {
                return this.x;
            }

            public final java.lang.Number getY() {
                return this.y;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PointerInteractionData(com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType, com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType, long j, java.lang.Number number, java.lang.Number number2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerEventType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
                this.pointerEventType = pointerEventType;
                this.pointerType = pointerType;
                this.pointerId = j;
                this.x = number;
                this.y = number2;
                this.source = 9L;
            }

            public final long getSource() {
                return this.source;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("source", java.lang.Long.valueOf(this.source));
                jsonObject.add("pointerEventType", this.pointerEventType.toJson());
                jsonObject.add("pointerType", this.pointerType.toJson());
                jsonObject.addProperty("pointerId", java.lang.Long.valueOf(this.pointerId));
                jsonObject.addProperty("x", this.x);
                jsonObject.addProperty("y", this.y);
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$PointerInteractionData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PointerInteractionData", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("source").getAsLong();
                        com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.INSTANCE;
                        java.lang.String asString = jsonObject.get("pointerEventType").getAsString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType fromJson = companion.fromJson(asString);
                        com.datadog.android.sessionreplay.model.MobileSegment.PointerType.Companion companion2 = com.datadog.android.sessionreplay.model.MobileSegment.PointerType.INSTANCE;
                        java.lang.String asString2 = jsonObject.get("pointerType").getAsString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                        com.datadog.android.sessionreplay.model.MobileSegment.PointerType fromJson2 = companion2.fromJson(asString2);
                        long asLong2 = jsonObject.get("pointerId").getAsLong();
                        java.lang.Number asNumber = jsonObject.get("x").getAsNumber();
                        java.lang.Number asNumber2 = jsonObject.get("y").getAsNumber();
                        if (asLong != 9) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                        return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData(fromJson, fromJson2, asLong2, asNumber, asNumber2);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PointerInteractionData", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PointerInteractionData", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PointerInteractionData", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType = this.pointerEventType;
                com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType = this.pointerType;
                long j = this.pointerId;
                java.lang.Number number = this.x;
                java.lang.Number number2 = this.y;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInteractionData(pointerEventType=");
                sb.append(pointerEventType);
                sb.append(", pointerType=");
                sb.append(pointerType);
                sb.append(", pointerId=");
                sb.append(j);
                sb.append(", x=");
                sb.append(number);
                sb.append(", y=");
                sb.append(number2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((((((this.pointerEventType.hashCode() * 31) + this.pointerType.hashCode()) * 31) + java.lang.Long.hashCode(this.pointerId)) * 31) + this.x.hashCode()) * 31) + this.y.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData pointerInteractionData = (com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData) other;
                return this.pointerEventType == pointerInteractionData.pointerEventType && this.pointerType == pointerInteractionData.pointerType && this.pointerId == pointerInteractionData.pointerId && kotlin.jvm.internal.Intrinsics.areEqual(this.x, pointerInteractionData.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, pointerInteractionData.y);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData copy(com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType, com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType, long pointerId, java.lang.Number x, java.lang.Number y) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerEventType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData(pointerEventType, pointerType, pointerId, x, y);
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Number getY() {
                return this.y;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Number getX() {
                return this.x;
            }

            /* renamed from: component3, reason: from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            /* renamed from: component2, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerType getPointerType() {
                return this.pointerType;
            }

            /* renamed from: component1, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType getPointerEventType() {
                return this.pointerEventType;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData copy$default(com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData pointerInteractionData, com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType, com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType, long j, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    pointerEventType = pointerInteractionData.pointerEventType;
                }
                if ((i & 2) != 0) {
                    pointerType = pointerInteractionData.pointerType;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType2 = pointerType;
                if ((i & 4) != 0) {
                    j = pointerInteractionData.pointerId;
                }
                long j2 = j;
                if ((i & 8) != 0) {
                    number = pointerInteractionData.x;
                }
                java.lang.Number number3 = number;
                if ((i & 16) != 0) {
                    number2 = pointerInteractionData.y;
                }
                return pointerInteractionData.copy(pointerEventType, pointerType2, j2, number3, number2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;", "Lcom/google/gson/JsonElement;", "jsonElement", "fromJsonElement", "(Lcom/google/gson/JsonElement;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(jsonString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    return fromJsonElement(parseString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type MobileIncrementalData", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData mobileMutationData;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData touchData;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData viewportResizeData;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData pointerInteractionData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = jsonElement instanceof com.google.gson.JsonObject;
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData mobileIncrementalData = null;
                try {
                } catch (com.google.gson.JsonParseException e) {
                    arrayList.add(e);
                    mobileMutationData = null;
                }
                if (z) {
                    mobileMutationData = com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                    try {
                    } catch (com.google.gson.JsonParseException e2) {
                        arrayList.add(e2);
                        touchData = null;
                    }
                    if (z) {
                        touchData = com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.TouchData.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                        try {
                        } catch (com.google.gson.JsonParseException e3) {
                            arrayList.add(e3);
                            viewportResizeData = null;
                        }
                        if (z) {
                            viewportResizeData = com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                            try {
                            } catch (com.google.gson.JsonParseException e4) {
                                arrayList.add(e4);
                                pointerInteractionData = null;
                            }
                            if (z) {
                                pointerInteractionData = com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                int i = 0;
                                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData[] mobileIncrementalDataArr = {mobileMutationData, touchData, viewportResizeData, pointerInteractionData};
                                while (true) {
                                    if (i < 4) {
                                        com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData mobileIncrementalData2 = mobileIncrementalDataArr[i];
                                        if (mobileIncrementalData2 != null) {
                                            mobileIncrementalData = mobileIncrementalData2;
                                            break;
                                        }
                                        i++;
                                    } else {
                                        break;
                                    }
                                }
                                if (mobileIncrementalData != null) {
                                    return mobileIncrementalData;
                                }
                                throw new com.google.gson.JsonParseException("Unable to parse json into one of type \nMobileIncrementalData\n".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.CharSequence>() { // from class: com.datadog.android.sessionreplay.model.MobileSegment$MobileIncrementalData$Companion$fromJsonElement$message$1
                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                    public final java.lang.CharSequence invoke(java.lang.Throwable th) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                        return java.lang.String.valueOf(th.getMessage());
                                    }
                                }, 30, null))));
                            }
                            throw new com.google.gson.JsonParseException("Unable to parse json into type PointerInteractionData");
                        }
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ViewportResizeData");
                    }
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TouchData");
                }
                throw new com.google.gson.JsonParseException("Unable to parse json into type MobileMutationData");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonElement(jsonElement);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public /* synthetic */ MobileIncrementalData(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "", "", "width", "height", "", "href", "<init>", "(JJLjava/lang/String;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "J", "getHeight", "Ljava/lang/String;", "getHref", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data1 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data1.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Data1.Companion(null);
        private final long height;
        private final java.lang.String href;
        private final long width;

        public Data1(long j, long j2, java.lang.String str) {
            this.width = j;
            this.height = j2;
            this.href = str;
        }

        public /* synthetic */ Data1(long j, long j2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, (i & 4) != 0 ? null : str);
        }

        public final long getWidth() {
            return this.width;
        }

        public final long getHeight() {
            return this.height;
        }

        public final java.lang.String getHref() {
            return this.href;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
            jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
            java.lang.String str = this.href;
            if (str != null) {
                jsonObject.addProperty("href", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data1 fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data1", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data1 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("width").getAsLong();
                    long asLong2 = jsonObject.get("height").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("href");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Data1(asLong, asLong2, jsonElement != null ? jsonElement.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data1", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data1", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data1", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.width;
            long j2 = this.height;
            java.lang.String str = this.href;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data1(width=");
            sb.append(j);
            sb.append(", height=");
            sb.append(j2);
            sb.append(", href=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Long.hashCode(this.width);
            int hashCode2 = java.lang.Long.hashCode(this.height);
            java.lang.String str = this.href;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Data1)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1 = (com.datadog.android.sessionreplay.model.MobileSegment.Data1) other;
            return this.width == data1.width && this.height == data1.height && kotlin.jvm.internal.Intrinsics.areEqual(this.href, data1.href);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Data1 copy(long width, long height, java.lang.String href) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Data1(width, height, href);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getHref() {
            return this.href;
        }

        /* renamed from: component2, reason: from getter */
        public final long getHeight() {
            return this.height;
        }

        /* renamed from: component1, reason: from getter */
        public final long getWidth() {
            return this.width;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data1 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data1 fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Data1 copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Data1 data1, long j, long j2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = data1.width;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = data1.height;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = data1.href;
            }
            return data1.copy(j3, j4, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "", "", "hasFocus", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Z", "getHasFocus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data2 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data2.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Data2.Companion(null);
        private final boolean hasFocus;

        public Data2(boolean z) {
            this.hasFocus = z;
        }

        public final boolean getHasFocus() {
            return this.hasFocus;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("has_focus", java.lang.Boolean.valueOf(this.hasFocus));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data2;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data2 fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data2", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data2 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Data2(jsonObject.get("has_focus").getAsBoolean());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data2", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data2", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data2", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            boolean z = this.hasFocus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data2(hasFocus=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.hasFocus);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Data2) && this.hasFocus == ((com.datadog.android.sessionreplay.model.MobileSegment.Data2) other).hasFocus;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Data2 copy(boolean hasFocus) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Data2(hasFocus);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasFocus() {
            return this.hasFocus;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data2 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data2 fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Data2 copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Data2 data2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = data2.hasFocus;
            }
            return data2.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\r"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "", "", "height", "offsetLeft", "offsetTop", "pageLeft", "pageTop", "scale", "width", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getHeight", "getOffsetLeft", "getOffsetTop", "getPageLeft", "getPageTop", "getScale", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data3 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data3.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Data3.Companion(null);
        private final java.lang.Number height;
        private final java.lang.Number offsetLeft;
        private final java.lang.Number offsetTop;
        private final java.lang.Number pageLeft;
        private final java.lang.Number pageTop;
        private final java.lang.Number scale;
        private final java.lang.Number width;

        public Data3(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Number number5, java.lang.Number number6, java.lang.Number number7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number7, "");
            this.height = number;
            this.offsetLeft = number2;
            this.offsetTop = number3;
            this.pageLeft = number4;
            this.pageTop = number5;
            this.scale = number6;
            this.width = number7;
        }

        public final java.lang.Number getHeight() {
            return this.height;
        }

        public final java.lang.Number getOffsetLeft() {
            return this.offsetLeft;
        }

        public final java.lang.Number getOffsetTop() {
            return this.offsetTop;
        }

        public final java.lang.Number getPageLeft() {
            return this.pageLeft;
        }

        public final java.lang.Number getPageTop() {
            return this.pageTop;
        }

        public final java.lang.Number getScale() {
            return this.scale;
        }

        public final java.lang.Number getWidth() {
            return this.width;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("height", this.height);
            jsonObject.addProperty("offsetLeft", this.offsetLeft);
            jsonObject.addProperty("offsetTop", this.offsetTop);
            jsonObject.addProperty("pageLeft", this.pageLeft);
            jsonObject.addProperty("pageTop", this.pageTop);
            jsonObject.addProperty("scale", this.scale);
            jsonObject.addProperty("width", this.width);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Data3;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data3 fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data3", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Data3 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("height").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("offsetLeft").getAsNumber();
                    java.lang.Number asNumber3 = jsonObject.get("offsetTop").getAsNumber();
                    java.lang.Number asNumber4 = jsonObject.get("pageLeft").getAsNumber();
                    java.lang.Number asNumber5 = jsonObject.get("pageTop").getAsNumber();
                    java.lang.Number asNumber6 = jsonObject.get("scale").getAsNumber();
                    java.lang.Number asNumber7 = jsonObject.get("width").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber4, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber5, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber6, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber7, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Data3(asNumber, asNumber2, asNumber3, asNumber4, asNumber5, asNumber6, asNumber7);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data3", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data3", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Data3", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.height;
            java.lang.Number number2 = this.offsetLeft;
            java.lang.Number number3 = this.offsetTop;
            java.lang.Number number4 = this.pageLeft;
            java.lang.Number number5 = this.pageTop;
            java.lang.Number number6 = this.scale;
            java.lang.Number number7 = this.width;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data3(height=");
            sb.append(number);
            sb.append(", offsetLeft=");
            sb.append(number2);
            sb.append(", offsetTop=");
            sb.append(number3);
            sb.append(", pageLeft=");
            sb.append(number4);
            sb.append(", pageTop=");
            sb.append(number5);
            sb.append(", scale=");
            sb.append(number6);
            sb.append(", width=");
            sb.append(number7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.height.hashCode() * 31) + this.offsetLeft.hashCode()) * 31) + this.offsetTop.hashCode()) * 31) + this.pageLeft.hashCode()) * 31) + this.pageTop.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.width.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Data3)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3 = (com.datadog.android.sessionreplay.model.MobileSegment.Data3) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.height, data3.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetLeft, data3.offsetLeft) && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetTop, data3.offsetTop) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageLeft, data3.pageLeft) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageTop, data3.pageTop) && kotlin.jvm.internal.Intrinsics.areEqual(this.scale, data3.scale) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, data3.width);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Data3 copy(java.lang.Number height, java.lang.Number offsetLeft, java.lang.Number offsetTop, java.lang.Number pageLeft, java.lang.Number pageTop, java.lang.Number scale, java.lang.Number width) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offsetLeft, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offsetTop, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageLeft, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageTop, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scale, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.Data3(height, offsetLeft, offsetTop, pageLeft, pageTop, scale, width);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Number getWidth() {
            return this.width;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Number getScale() {
            return this.scale;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Number getPageTop() {
            return this.pageTop;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getPageLeft() {
            return this.pageLeft;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getOffsetTop() {
            return this.offsetTop;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getOffsetLeft() {
            return this.offsetLeft;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getHeight() {
            return this.height;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data3 fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Data3 fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Data3 copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Data3 data3, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Number number5, java.lang.Number number6, java.lang.Number number7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = data3.height;
            }
            if ((i & 2) != 0) {
                number2 = data3.offsetLeft;
            }
            java.lang.Number number8 = number2;
            if ((i & 4) != 0) {
                number3 = data3.offsetTop;
            }
            java.lang.Number number9 = number3;
            if ((i & 8) != 0) {
                number4 = data3.pageLeft;
            }
            java.lang.Number number10 = number4;
            if ((i & 16) != 0) {
                number5 = data3.pageTop;
            }
            java.lang.Number number11 = number5;
            if ((i & 32) != 0) {
                number6 = data3.scale;
            }
            java.lang.Number number12 = number6;
            if ((i & 64) != 0) {
                number7 = data3.width;
            }
            return data3.copy(number, number8, number9, number10, number11, number12, number7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Companion", "ImageWireframe", "PlaceholderWireframe", "ShapeWireframe", "TextWireframe", "WebviewWireframe", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Wireframe {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.Companion(null);

        public abstract com.google.gson.JsonElement toJson();

        private Wireframe() {
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJf\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b2\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u00105\u001a\u00020)8\u0007X\u0087D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010+R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b8\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b9\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b:\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "<init>", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;)V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "copy", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "J", "getHeight", "getId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "type", "Ljava/lang/String;", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ShapeWireframe extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final long height;
            private final long id;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String type;
            private final long width;
            private final long x;
            private final long y;

            public /* synthetic */ ShapeWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder);
            }

            public final long getId() {
                return this.id;
            }

            public final long getX() {
                return this.x;
            }

            public final long getY() {
                return this.y;
            }

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public ShapeWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder) {
                super(null);
                this.id = j;
                this.x = j2;
                this.y = j3;
                this.width = j4;
                this.height = j5;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.Wireframe
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
                jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframe", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    com.google.gson.JsonObject asJsonObject3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        long asLong2 = jsonObject.get("x").getAsLong();
                        long asLong3 = jsonObject.get("y").getAsLong();
                        long asLong4 = jsonObject.get("width").getAsLong();
                        long asLong5 = jsonObject.get("height").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("shapeStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement3 == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(jsonObject.get("type").getAsString(), com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(asLong, asLong2, asLong3, asLong4, asLong5, fromJsonObject, fromJsonObject2, fromJsonObject3);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframe", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframe", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframe", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                long j2 = this.x;
                long j3 = this.y;
                long j4 = this.width;
                long j5 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeWireframe(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(j2);
                sb.append(", y=");
                sb.append(j3);
                sb.append(", width=");
                sb.append(j4);
                sb.append(", height=");
                sb.append(j5);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                int hashCode2 = java.lang.Long.hashCode(this.x);
                int hashCode3 = java.lang.Long.hashCode(this.y);
                int hashCode4 = java.lang.Long.hashCode(this.width);
                int hashCode5 = java.lang.Long.hashCode(this.height);
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (shapeBorder != null ? shapeBorder.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) other;
                return this.id == shapeWireframe.id && this.x == shapeWireframe.x && this.y == shapeWireframe.y && this.width == shapeWireframe.width && this.height == shapeWireframe.height && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, shapeWireframe.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, shapeWireframe.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, shapeWireframe.border);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe copy(long id, long x, long y, long width, long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(id, x, y, width, height, clip, shapeStyle, border);
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final long getX() {
                return this.x;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0086\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b5\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b<\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010#R\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010'\"\u0004\bA\u0010BR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010\u0019R\u001a\u0010G\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\bI\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\bJ\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\bK\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "text", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "textStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "textPosition", "<init>", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;)V", "component1", "()J", "component10", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "component11", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "()Ljava/lang/String;", "copy", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "J", "getHeight", "getId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "getTextPosition", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "getTextStyle", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TextWireframe extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final long height;
            private final long id;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private java.lang.String text;
            private final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition;
            private final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle;
            private final java.lang.String type;
            private final long width;
            private final long x;
            private final long y;

            public /* synthetic */ TextWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, str, textStyle, (i & 1024) != 0 ? null : textPosition);
            }

            public final long getId() {
                return this.id;
            }

            public final long getX() {
                return this.x;
            }

            public final long getY() {
                return this.y;
            }

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getText() {
                return this.text;
            }

            public final void setText(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.text = str;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle getTextStyle() {
                return this.textStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition getTextPosition() {
                return this.textPosition;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textStyle, "");
                this.id = j;
                this.x = j2;
                this.y = j3;
                this.width = j4;
                this.height = j5;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.text = str;
                this.textStyle = textStyle;
                this.textPosition = textPosition;
                this.type = "text";
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.Wireframe
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
                jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                jsonObject.addProperty("text", this.text);
                jsonObject.add("textStyle", this.textStyle.toJson());
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                if (textPosition != null) {
                    jsonObject.add("textPosition", textPosition.toJson());
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframe", e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, IllegalStateException -> 0x00f5, TryCatch #7 {IllegalStateException -> 0x00f5, NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, blocks: (B:13:0x0063, B:14:0x0070, B:16:0x0078, B:18:0x007e, B:19:0x0089, B:21:0x00ba, B:23:0x00c0, B:24:0x00c8, B:26:0x00ce, B:29:0x00e3, B:30:0x00ee), top: B:12:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[Catch: NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, IllegalStateException -> 0x00f5, TryCatch #7 {IllegalStateException -> 0x00f5, NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, blocks: (B:13:0x0063, B:14:0x0070, B:16:0x0078, B:18:0x007e, B:19:0x0089, B:21:0x00ba, B:23:0x00c0, B:24:0x00c8, B:26:0x00ce, B:29:0x00e3, B:30:0x00ee), top: B:12:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[Catch: NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, IllegalStateException -> 0x00f5, TryCatch #7 {IllegalStateException -> 0x00f5, NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, blocks: (B:13:0x0063, B:14:0x0070, B:16:0x0078, B:18:0x007e, B:19:0x0089, B:21:0x00ba, B:23:0x00c0, B:24:0x00c8, B:26:0x00ce, B:29:0x00e3, B:30:0x00ee), top: B:12:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[Catch: NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, IllegalStateException -> 0x00f5, TryCatch #7 {IllegalStateException -> 0x00f5, NullPointerException -> 0x00ef, NumberFormatException -> 0x00f1, blocks: (B:13:0x0063, B:14:0x0070, B:16:0x0078, B:18:0x007e, B:19:0x0089, B:21:0x00ba, B:23:0x00c0, B:24:0x00c8, B:26:0x00ce, B:29:0x00e3, B:30:0x00ee), top: B:12:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x005b A[Catch: NumberFormatException -> 0x00f9, IllegalStateException -> 0x00fd, NullPointerException -> 0x0101, TRY_LEAVE, TryCatch #1 {NullPointerException -> 0x0101, blocks: (B:4:0x000d, B:47:0x0045, B:49:0x004b, B:7:0x0053, B:9:0x005b), top: B:3:0x000d }] */
                @kotlin.jvm.JvmStatic
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    java.lang.String str;
                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject;
                    com.google.gson.JsonElement jsonElement;
                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
                    java.lang.String asString;
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    java.lang.String str2 = "Unable to parse json into type TextWireframe";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        try {
                            long asLong = jsonObject.get("id").getAsLong();
                            long asLong2 = jsonObject.get("x").getAsLong();
                            long asLong3 = jsonObject.get("y").getAsLong();
                            long asLong4 = jsonObject.get("width").getAsLong();
                            long asLong5 = jsonObject.get("height").getAsLong();
                            com.google.gson.JsonElement jsonElement2 = jsonObject.get("clip");
                            if (jsonElement2 != null) {
                                try {
                                    com.google.gson.JsonObject asJsonObject3 = jsonElement2.getAsJsonObject();
                                    if (asJsonObject3 != null) {
                                        fromJsonObject = com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                                        jsonElement = jsonObject.get("shapeStyle");
                                        if (jsonElement != null) {
                                            com.google.gson.JsonObject asJsonObject4 = jsonElement.getAsJsonObject();
                                            if (asJsonObject4 != null) {
                                                str = "Unable to parse json into type TextWireframe";
                                                try {
                                                    shapeStyle = com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject4);
                                                    com.google.gson.JsonElement jsonElement3 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                                                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject2 = (jsonElement3 != null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject2);
                                                    asString = jsonObject.get("type").getAsString();
                                                    java.lang.String asString2 = jsonObject.get("text").getAsString();
                                                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = fromJsonObject;
                                                    com.google.gson.JsonObject asJsonObject5 = jsonObject.get("textStyle").getAsJsonObject();
                                                    com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.INSTANCE;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject5, "");
                                                    com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject3 = companion.fromJsonObject(asJsonObject5);
                                                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("textPosition");
                                                    com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJsonObject4 = (jsonElement4 != null || (asJsonObject = jsonElement4.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.TextPosition.INSTANCE.fromJsonObject(asJsonObject);
                                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "text")) {
                                                        throw new java.lang.IllegalStateException("Check failed.".toString());
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                                                    return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe(asLong, asLong2, asLong3, asLong4, asLong5, wireframeClip, shapeStyle, fromJsonObject2, asString2, fromJsonObject3, fromJsonObject4);
                                                } catch (java.lang.IllegalStateException e) {
                                                    e = e;
                                                    str2 = str;
                                                    throw new com.google.gson.JsonParseException(str2, e);
                                                } catch (java.lang.NullPointerException e2) {
                                                    e = e2;
                                                    throw new com.google.gson.JsonParseException(str, e);
                                                } catch (java.lang.NumberFormatException e3) {
                                                    e = e3;
                                                    str2 = str;
                                                    throw new com.google.gson.JsonParseException(str2, e);
                                                }
                                            }
                                        }
                                        shapeStyle = null;
                                        com.google.gson.JsonElement jsonElement32 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                                        if (jsonElement32 != null) {
                                        }
                                        asString = jsonObject.get("type").getAsString();
                                        java.lang.String asString22 = jsonObject.get("text").getAsString();
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip2 = fromJsonObject;
                                        com.google.gson.JsonObject asJsonObject52 = jsonObject.get("textStyle").getAsJsonObject();
                                        com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.Companion companion2 = com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.INSTANCE;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject52, "");
                                        com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject32 = companion2.fromJsonObject(asJsonObject52);
                                        com.google.gson.JsonElement jsonElement42 = jsonObject.get("textPosition");
                                        if (jsonElement42 != null) {
                                        }
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "text")) {
                                        }
                                    }
                                } catch (java.lang.IllegalStateException e4) {
                                    e = e4;
                                    throw new com.google.gson.JsonParseException(str2, e);
                                } catch (java.lang.NumberFormatException e5) {
                                    e = e5;
                                    throw new com.google.gson.JsonParseException(str2, e);
                                }
                            }
                            fromJsonObject = null;
                            jsonElement = jsonObject.get("shapeStyle");
                            if (jsonElement != null) {
                            }
                            shapeStyle = null;
                            com.google.gson.JsonElement jsonElement322 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                            if (jsonElement322 != null) {
                            }
                            asString = jsonObject.get("type").getAsString();
                            java.lang.String asString222 = jsonObject.get("text").getAsString();
                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip22 = fromJsonObject;
                            com.google.gson.JsonObject asJsonObject522 = jsonObject.get("textStyle").getAsJsonObject();
                            com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.Companion companion22 = com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.INSTANCE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject522, "");
                            com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject322 = companion22.fromJsonObject(asJsonObject522);
                            com.google.gson.JsonElement jsonElement422 = jsonObject.get("textPosition");
                            if (jsonElement422 != null) {
                            }
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "text")) {
                            }
                        } catch (java.lang.NullPointerException e6) {
                            e = e6;
                            str = "Unable to parse json into type TextWireframe";
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e = e7;
                    } catch (java.lang.NumberFormatException e8) {
                        e = e8;
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                long j2 = this.x;
                long j3 = this.y;
                long j4 = this.width;
                long j5 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.text;
                com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle = this.textStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TextWireframe(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(j2);
                sb.append(", y=");
                sb.append(j3);
                sb.append(", width=");
                sb.append(j4);
                sb.append(", height=");
                sb.append(j5);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", text=");
                sb.append(str);
                sb.append(", textStyle=");
                sb.append(textStyle);
                sb.append(", textPosition=");
                sb.append(textPosition);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                int hashCode2 = java.lang.Long.hashCode(this.x);
                int hashCode3 = java.lang.Long.hashCode(this.y);
                int hashCode4 = java.lang.Long.hashCode(this.width);
                int hashCode5 = java.lang.Long.hashCode(this.height);
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                int hashCode9 = this.text.hashCode();
                int hashCode10 = this.textStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (textPosition != null ? textPosition.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe textWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) other;
                return this.id == textWireframe.id && this.x == textWireframe.x && this.y == textWireframe.y && this.width == textWireframe.width && this.height == textWireframe.height && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, textWireframe.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, textWireframe.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, textWireframe.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, textWireframe.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.textStyle, textWireframe.textStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.textPosition, textWireframe.textPosition);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe copy(long id, long x, long y, long width, long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String text, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textStyle, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe(id, x, y, width, height, clip, shapeStyle, border, text, textStyle, textPosition);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getText() {
                return this.text;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final long getX() {
                return this.x;
            }

            /* renamed from: component11, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition getTextPosition() {
                return this.textPosition;
            }

            /* renamed from: component10, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle getTextStyle() {
                return this.textStyle;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0096\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b4\u0010\u0019R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u00108R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b?\u0010\u0017R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010@\u001a\u0004\b\u0013\u0010\u001c\"\u0004\bA\u0010BR$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00105\u001a\u0004\bC\u0010\u0019\"\u0004\bD\u00108R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010$R\u001a\u0010I\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bK\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\bL\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\bM\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "base64", "resourceId", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "isEmpty", "<init>", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()J", "component10", "()Ljava/lang/String;", "component11", "component12", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "copy", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBase64", "setBase64", "(Ljava/lang/String;)V", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "J", "getHeight", "getId", "Ljava/lang/Boolean;", "setEmpty", "(Ljava/lang/Boolean;)V", "getMimeType", "setMimeType", "getResourceId", "setResourceId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ImageWireframe extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe.Companion(null);
            private java.lang.String base64;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final long height;
            private final long id;
            private java.lang.Boolean isEmpty;
            private java.lang.String mimeType;
            private java.lang.String resourceId;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String type;
            private final long width;
            private final long x;
            private final long y;

            public /* synthetic */ ImageWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : bool);
            }

            public final long getId() {
                return this.id;
            }

            public final long getX() {
                return this.x;
            }

            public final long getY() {
                return this.y;
            }

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getBase64() {
                return this.base64;
            }

            public final void setBase64(java.lang.String str) {
                this.base64 = str;
            }

            public final java.lang.String getResourceId() {
                return this.resourceId;
            }

            public final void setResourceId(java.lang.String str) {
                this.resourceId = str;
            }

            public final java.lang.String getMimeType() {
                return this.mimeType;
            }

            public final void setMimeType(java.lang.String str) {
                this.mimeType = str;
            }

            public final java.lang.Boolean isEmpty() {
                return this.isEmpty;
            }

            public final void setEmpty(java.lang.Boolean bool) {
                this.isEmpty = bool;
            }

            public ImageWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool) {
                super(null);
                this.id = j;
                this.x = j2;
                this.y = j3;
                this.width = j4;
                this.height = j5;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.base64 = str;
                this.resourceId = str2;
                this.mimeType = str3;
                this.isEmpty = bool;
                this.type = "image";
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.Wireframe
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
                jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                java.lang.String str = this.base64;
                if (str != null) {
                    jsonObject.addProperty("base64", str);
                }
                java.lang.String str2 = this.resourceId;
                if (str2 != null) {
                    jsonObject.addProperty("resourceId", str2);
                }
                java.lang.String str3 = this.mimeType;
                if (str3 != null) {
                    jsonObject.addProperty(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, str3);
                }
                java.lang.Boolean bool = this.isEmpty;
                if (bool != null) {
                    jsonObject.addProperty("isEmpty", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ImageWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframe", e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[Catch: NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, IllegalStateException -> 0x00f4, TryCatch #6 {IllegalStateException -> 0x00f4, NullPointerException -> 0x00f0, NumberFormatException -> 0x00f2, blocks: (B:21:0x008b, B:23:0x0093, B:24:0x009c, B:26:0x00a4, B:27:0x00ad, B:29:0x00b5, B:30:0x00be, B:32:0x00c6, B:33:0x00d3, B:35:0x00db, B:38:0x00e4, B:39:0x00ef), top: B:20:0x008b }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
                @kotlin.jvm.JvmStatic
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.String str3;
                    long asLong;
                    long asLong2;
                    long asLong3;
                    long asLong4;
                    long asLong5;
                    com.google.gson.JsonElement jsonElement;
                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject;
                    java.lang.String asString;
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        try {
                            asLong = jsonObject.get("id").getAsLong();
                            asLong2 = jsonObject.get("x").getAsLong();
                            asLong3 = jsonObject.get("y").getAsLong();
                            asLong4 = jsonObject.get("width").getAsLong();
                            asLong5 = jsonObject.get("height").getAsLong();
                            jsonElement = jsonObject.get("clip");
                        } catch (java.lang.NullPointerException e) {
                            e = e;
                            str = "Unable to parse json into type ImageWireframe";
                        }
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        str = "Unable to parse json into type ImageWireframe";
                    } catch (java.lang.NumberFormatException e3) {
                        e = e3;
                        str = "Unable to parse json into type ImageWireframe";
                    }
                    try {
                        if (jsonElement != null) {
                            try {
                                com.google.gson.JsonObject asJsonObject3 = jsonElement.getAsJsonObject();
                                if (asJsonObject3 != null) {
                                    fromJsonObject = com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("shapeStyle");
                                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement2 != null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject2);
                                    com.google.gson.JsonElement jsonElement3 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement3 != null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject);
                                    asString = jsonObject.get("type").getAsString();
                                    str = "Unable to parse json into type ImageWireframe";
                                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("base64");
                                    java.lang.String asString2 = jsonElement4 == null ? jsonElement4.getAsString() : null;
                                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("resourceId");
                                    java.lang.String asString3 = jsonElement5 == null ? jsonElement5.getAsString() : null;
                                    com.google.gson.JsonElement jsonElement6 = jsonObject.get(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE);
                                    java.lang.String asString4 = jsonElement6 == null ? jsonElement6.getAsString() : null;
                                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("isEmpty");
                                    java.lang.Boolean valueOf = jsonElement7 == null ? java.lang.Boolean.valueOf(jsonElement7.getAsBoolean()) : null;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "image")) {
                                        throw new java.lang.IllegalStateException("Check failed.".toString());
                                    }
                                    return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe(asLong, asLong2, asLong3, asLong4, asLong5, fromJsonObject, fromJsonObject2, fromJsonObject3, asString2, asString3, asString4, valueOf);
                                }
                            } catch (java.lang.IllegalStateException e4) {
                                e = e4;
                                str3 = "Unable to parse json into type ImageWireframe";
                                throw new com.google.gson.JsonParseException(str3, e);
                            } catch (java.lang.NumberFormatException e5) {
                                e = e5;
                                str2 = "Unable to parse json into type ImageWireframe";
                                throw new com.google.gson.JsonParseException(str2, e);
                            }
                        }
                        com.google.gson.JsonElement jsonElement42 = jsonObject.get("base64");
                        if (jsonElement42 == null) {
                        }
                        com.google.gson.JsonElement jsonElement52 = jsonObject.get("resourceId");
                        if (jsonElement52 == null) {
                        }
                        com.google.gson.JsonElement jsonElement62 = jsonObject.get(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE);
                        if (jsonElement62 == null) {
                        }
                        com.google.gson.JsonElement jsonElement72 = jsonObject.get("isEmpty");
                        if (jsonElement72 == null) {
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "image")) {
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e = e6;
                        str3 = str;
                        throw new com.google.gson.JsonParseException(str3, e);
                    } catch (java.lang.NullPointerException e7) {
                        e = e7;
                        throw new com.google.gson.JsonParseException(str, e);
                    } catch (java.lang.NumberFormatException e8) {
                        e = e8;
                        str2 = str;
                        throw new com.google.gson.JsonParseException(str2, e);
                    }
                    fromJsonObject = null;
                    com.google.gson.JsonElement jsonElement22 = jsonObject.get("shapeStyle");
                    if (jsonElement22 != null) {
                    }
                    com.google.gson.JsonElement jsonElement32 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                    if (jsonElement32 != null) {
                    }
                    asString = jsonObject.get("type").getAsString();
                    str = "Unable to parse json into type ImageWireframe";
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                long j2 = this.x;
                long j3 = this.y;
                long j4 = this.width;
                long j5 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.base64;
                java.lang.String str2 = this.resourceId;
                java.lang.String str3 = this.mimeType;
                java.lang.Boolean bool = this.isEmpty;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageWireframe(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(j2);
                sb.append(", y=");
                sb.append(j3);
                sb.append(", width=");
                sb.append(j4);
                sb.append(", height=");
                sb.append(j5);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", base64=");
                sb.append(str);
                sb.append(", resourceId=");
                sb.append(str2);
                sb.append(", mimeType=");
                sb.append(str3);
                sb.append(", isEmpty=");
                sb.append(bool);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                int hashCode2 = java.lang.Long.hashCode(this.x);
                int hashCode3 = java.lang.Long.hashCode(this.y);
                int hashCode4 = java.lang.Long.hashCode(this.width);
                int hashCode5 = java.lang.Long.hashCode(this.height);
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                java.lang.String str = this.base64;
                int hashCode9 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.resourceId;
                int hashCode10 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.mimeType;
                int hashCode11 = str3 == null ? 0 : str3.hashCode();
                java.lang.Boolean bool = this.isEmpty;
                return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (bool != null ? bool.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe imageWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) other;
                return this.id == imageWireframe.id && this.x == imageWireframe.x && this.y == imageWireframe.y && this.width == imageWireframe.width && this.height == imageWireframe.height && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, imageWireframe.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, imageWireframe.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, imageWireframe.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.base64, imageWireframe.base64) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, imageWireframe.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, imageWireframe.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.isEmpty, imageWireframe.isEmpty);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe copy(long id, long x, long y, long width, long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String base64, java.lang.String resourceId, java.lang.String mimeType, java.lang.Boolean isEmpty) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe(id, x, y, width, height, clip, shapeStyle, border, base64, resourceId, mimeType, isEmpty);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getBase64() {
                return this.base64;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final long getX() {
                return this.x;
            }

            /* renamed from: component12, reason: from getter */
            public final java.lang.Boolean getIsEmpty() {
                return this.isEmpty;
            }

            /* renamed from: component11, reason: from getter */
            public final java.lang.String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component10, reason: from getter */
            public final java.lang.String getResourceId() {
                return this.resourceId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b*\u0010\u000fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\n8\u0007X\u0087D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b1\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b2\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b3\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "", "label", "<init>", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Ljava/lang/String;)V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Ljava/lang/String;", "copy", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "J", "getHeight", "getId", "Ljava/lang/String;", "getLabel", "setLabel", "(Ljava/lang/String;)V", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PlaceholderWireframe extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final long height;
            private final long id;
            private java.lang.String label;
            private final java.lang.String type;
            private final long width;
            private final long x;
            private final long y;

            public /* synthetic */ PlaceholderWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : str);
            }

            public final long getId() {
                return this.id;
            }

            public final long getX() {
                return this.x;
            }

            public final long getY() {
                return this.y;
            }

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final java.lang.String getLabel() {
                return this.label;
            }

            public final void setLabel(java.lang.String str) {
                this.label = str;
            }

            public PlaceholderWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, java.lang.String str) {
                super(null);
                this.id = j;
                this.x = j2;
                this.y = j3;
                this.width = j4;
                this.height = j5;
                this.clip = wireframeClip;
                this.label = str;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.Wireframe
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
                jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                jsonObject.addProperty("type", this.type);
                java.lang.String str = this.label;
                if (str != null) {
                    jsonObject.addProperty("label", str);
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$PlaceholderWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframe", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        long asLong2 = jsonObject.get("x").getAsLong();
                        long asLong3 = jsonObject.get("y").getAsLong();
                        long asLong4 = jsonObject.get("width").getAsLong();
                        long asLong5 = jsonObject.get("height").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject);
                        java.lang.String asString = jsonObject.get("type").getAsString();
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("label");
                        java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe(asLong, asLong2, asLong3, asLong4, asLong5, fromJsonObject, asString2);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframe", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframe", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframe", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                long j2 = this.x;
                long j3 = this.y;
                long j4 = this.width;
                long j5 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                java.lang.String str = this.label;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaceholderWireframe(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(j2);
                sb.append(", y=");
                sb.append(j3);
                sb.append(", width=");
                sb.append(j4);
                sb.append(", height=");
                sb.append(j5);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", label=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                int hashCode2 = java.lang.Long.hashCode(this.x);
                int hashCode3 = java.lang.Long.hashCode(this.y);
                int hashCode4 = java.lang.Long.hashCode(this.width);
                int hashCode5 = java.lang.Long.hashCode(this.height);
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                java.lang.String str = this.label;
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe placeholderWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) other;
                return this.id == placeholderWireframe.id && this.x == placeholderWireframe.x && this.y == placeholderWireframe.y && this.width == placeholderWireframe.width && this.height == placeholderWireframe.height && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, placeholderWireframe.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, placeholderWireframe.label);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe copy(long id, long x, long y, long width, long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, java.lang.String label) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe(id, x, y, width, height, clip, label);
            }

            /* renamed from: component7, reason: from getter */
            public final java.lang.String getLabel() {
                return this.label;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final long getX() {
                return this.x;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u0000 B2\u00020\u0001:\u0001BBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J|\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b0\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010#R\u001a\u0010=\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b?\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b@\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\bA\u0010\u0015"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "slotId", "", "isVisible", "<init>", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()J", "component10", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "()Ljava/lang/String;", "copy", "(JJJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "J", "getHeight", "getId", "Ljava/lang/Boolean;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "Ljava/lang/String;", "getSlotId", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class WebviewWireframe extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final long height;
            private final long id;
            private final java.lang.Boolean isVisible;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String slotId;
            private final java.lang.String type;
            private final long width;
            private final long x;
            private final long y;

            public /* synthetic */ WebviewWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, str, (i & 512) != 0 ? null : bool);
            }

            public final long getId() {
                return this.id;
            }

            public final long getX() {
                return this.x;
            }

            public final long getY() {
                return this.y;
            }

            public final long getWidth() {
                return this.width;
            }

            public final long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public final java.lang.Boolean isVisible() {
                return this.isVisible;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebviewWireframe(long j, long j2, long j3, long j4, long j5, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.Boolean bool) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.id = j;
                this.x = j2;
                this.y = j3;
                this.width = j4;
                this.height = j5;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.slotId = str;
                this.isVisible = bool;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.Wireframe
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
                jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
                jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
                jsonObject.addProperty("height", java.lang.Long.valueOf(this.height));
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                jsonObject.addProperty("slotId", this.slotId);
                java.lang.Boolean bool = this.isVisible;
                if (bool != null) {
                    jsonObject.addProperty("isVisible", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$WebviewWireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframe", e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: NumberFormatException -> 0x00d9, IllegalStateException -> 0x00df, NullPointerException -> 0x00e5, TRY_LEAVE, TryCatch #4 {NullPointerException -> 0x00e5, blocks: (B:4:0x000b, B:50:0x0043, B:52:0x0049, B:7:0x0052, B:9:0x005a, B:11:0x0060, B:12:0x0068, B:14:0x0070), top: B:3:0x000b }] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[Catch: NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, IllegalStateException -> 0x00d7, TryCatch #5 {IllegalStateException -> 0x00d7, NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, blocks: (B:18:0x0078, B:19:0x0085, B:21:0x00a3, B:22:0x00b0, B:24:0x00b8, B:27:0x00c7, B:28:0x00d2), top: B:17:0x0078 }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, IllegalStateException -> 0x00d7, TryCatch #5 {IllegalStateException -> 0x00d7, NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, blocks: (B:18:0x0078, B:19:0x0085, B:21:0x00a3, B:22:0x00b0, B:24:0x00b8, B:27:0x00c7, B:28:0x00d2), top: B:17:0x0078 }] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00c7 A[Catch: NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, IllegalStateException -> 0x00d7, TryCatch #5 {IllegalStateException -> 0x00d7, NullPointerException -> 0x00d3, NumberFormatException -> 0x00d5, blocks: (B:18:0x0078, B:19:0x0085, B:21:0x00a3, B:22:0x00b0, B:24:0x00b8, B:27:0x00c7, B:28:0x00d2), top: B:17:0x0078 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
                @kotlin.jvm.JvmStatic
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.String str3;
                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject;
                    com.google.gson.JsonElement jsonElement;
                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder;
                    java.lang.String asString;
                    com.google.gson.JsonObject asJsonObject;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        try {
                            long asLong = jsonObject.get("id").getAsLong();
                            long asLong2 = jsonObject.get("x").getAsLong();
                            long asLong3 = jsonObject.get("y").getAsLong();
                            long asLong4 = jsonObject.get("width").getAsLong();
                            long asLong5 = jsonObject.get("height").getAsLong();
                            com.google.gson.JsonElement jsonElement2 = jsonObject.get("clip");
                            if (jsonElement2 != null) {
                                try {
                                    com.google.gson.JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                                    if (asJsonObject2 != null) {
                                        fromJsonObject = com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject2);
                                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("shapeStyle");
                                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement3 != null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject);
                                        jsonElement = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                                        if (jsonElement != null) {
                                            com.google.gson.JsonObject asJsonObject3 = jsonElement.getAsJsonObject();
                                            if (asJsonObject3 != null) {
                                                str = "Unable to parse json into type WebviewWireframe";
                                                try {
                                                    shapeBorder = com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject3);
                                                    asString = jsonObject.get("type").getAsString();
                                                    java.lang.String asString2 = jsonObject.get("slotId").getAsString();
                                                    com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = fromJsonObject2;
                                                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("isVisible");
                                                    java.lang.Boolean valueOf = jsonElement4 != null ? java.lang.Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW)) {
                                                        throw new java.lang.IllegalStateException("Check failed.".toString());
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                                                    return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe(asLong, asLong2, asLong3, asLong4, asLong5, fromJsonObject, shapeStyle, shapeBorder, asString2, valueOf);
                                                } catch (java.lang.IllegalStateException e) {
                                                    e = e;
                                                    str3 = str;
                                                    throw new com.google.gson.JsonParseException(str3, e);
                                                } catch (java.lang.NullPointerException e2) {
                                                    e = e2;
                                                    throw new com.google.gson.JsonParseException(str, e);
                                                } catch (java.lang.NumberFormatException e3) {
                                                    e = e3;
                                                    str2 = str;
                                                    throw new com.google.gson.JsonParseException(str2, e);
                                                }
                                            }
                                        }
                                        shapeBorder = null;
                                        asString = jsonObject.get("type").getAsString();
                                        java.lang.String asString22 = jsonObject.get("slotId").getAsString();
                                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle2 = fromJsonObject2;
                                        com.google.gson.JsonElement jsonElement42 = jsonObject.get("isVisible");
                                        if (jsonElement42 != null) {
                                        }
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW)) {
                                        }
                                    }
                                } catch (java.lang.IllegalStateException e4) {
                                    e = e4;
                                    str3 = "Unable to parse json into type WebviewWireframe";
                                    throw new com.google.gson.JsonParseException(str3, e);
                                } catch (java.lang.NumberFormatException e5) {
                                    e = e5;
                                    str2 = "Unable to parse json into type WebviewWireframe";
                                    throw new com.google.gson.JsonParseException(str2, e);
                                }
                            }
                            fromJsonObject = null;
                            com.google.gson.JsonElement jsonElement32 = jsonObject.get("shapeStyle");
                            if (jsonElement32 != null) {
                            }
                            jsonElement = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                            if (jsonElement != null) {
                            }
                            shapeBorder = null;
                            asString = jsonObject.get("type").getAsString();
                            java.lang.String asString222 = jsonObject.get("slotId").getAsString();
                            com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle22 = fromJsonObject2;
                            com.google.gson.JsonElement jsonElement422 = jsonObject.get("isVisible");
                            if (jsonElement422 != null) {
                            }
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW)) {
                            }
                        } catch (java.lang.NullPointerException e6) {
                            e = e6;
                            str = "Unable to parse json into type WebviewWireframe";
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e = e7;
                        str = "Unable to parse json into type WebviewWireframe";
                    } catch (java.lang.NumberFormatException e8) {
                        e = e8;
                        str = "Unable to parse json into type WebviewWireframe";
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                long j2 = this.x;
                long j3 = this.y;
                long j4 = this.width;
                long j5 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.slotId;
                java.lang.Boolean bool = this.isVisible;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("WebviewWireframe(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(j2);
                sb.append(", y=");
                sb.append(j3);
                sb.append(", width=");
                sb.append(j4);
                sb.append(", height=");
                sb.append(j5);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(", isVisible=");
                sb.append(bool);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                int hashCode2 = java.lang.Long.hashCode(this.x);
                int hashCode3 = java.lang.Long.hashCode(this.y);
                int hashCode4 = java.lang.Long.hashCode(this.width);
                int hashCode5 = java.lang.Long.hashCode(this.height);
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                int hashCode9 = this.slotId.hashCode();
                java.lang.Boolean bool = this.isVisible;
                return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (bool != null ? bool.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) other;
                return this.id == webviewWireframe.id && this.x == webviewWireframe.x && this.y == webviewWireframe.y && this.width == webviewWireframe.width && this.height == webviewWireframe.height && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, webviewWireframe.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, webviewWireframe.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, webviewWireframe.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, webviewWireframe.slotId) && kotlin.jvm.internal.Intrinsics.areEqual(this.isVisible, webviewWireframe.isVisible);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe copy(long id, long x, long y, long width, long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String slotId, java.lang.Boolean isVisible) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe(id, x, y, width, height, clip, shapeStyle, border, slotId, isVisible);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final long getX() {
                return this.x;
            }

            /* renamed from: component10, reason: from getter */
            public final java.lang.Boolean getIsVisible() {
                return this.isVisible;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/google/gson/JsonElement;", "jsonElement", "fromJsonElement", "(Lcom/google/gson/JsonElement;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(jsonString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    return fromJsonElement(parseString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type Wireframe", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe;
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe textWireframe;
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe imageWireframe;
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe placeholderWireframe;
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = jsonElement instanceof com.google.gson.JsonObject;
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe = null;
                try {
                } catch (com.google.gson.JsonParseException e) {
                    arrayList.add(e);
                    shapeWireframe = null;
                }
                if (z) {
                    shapeWireframe = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                    try {
                    } catch (com.google.gson.JsonParseException e2) {
                        arrayList.add(e2);
                        textWireframe = null;
                    }
                    if (z) {
                        textWireframe = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                        try {
                        } catch (com.google.gson.JsonParseException e3) {
                            arrayList.add(e3);
                            imageWireframe = null;
                        }
                        if (z) {
                            imageWireframe = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                            try {
                            } catch (com.google.gson.JsonParseException e4) {
                                arrayList.add(e4);
                                placeholderWireframe = null;
                            }
                            if (z) {
                                placeholderWireframe = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                try {
                                } catch (com.google.gson.JsonParseException e5) {
                                    arrayList.add(e5);
                                    webviewWireframe = null;
                                }
                                if (z) {
                                    webviewWireframe = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                    int i = 0;
                                    com.datadog.android.sessionreplay.model.MobileSegment.Wireframe[] wireframeArr = {shapeWireframe, textWireframe, imageWireframe, placeholderWireframe, webviewWireframe};
                                    while (true) {
                                        if (i < 5) {
                                            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe2 = wireframeArr[i];
                                            if (wireframe2 != null) {
                                                wireframe = wireframe2;
                                                break;
                                            }
                                            i++;
                                        } else {
                                            break;
                                        }
                                    }
                                    if (wireframe != null) {
                                        return wireframe;
                                    }
                                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type \nWireframe\n".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.CharSequence>() { // from class: com.datadog.android.sessionreplay.model.MobileSegment$Wireframe$Companion$fromJsonElement$message$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                        public final java.lang.CharSequence invoke(java.lang.Throwable th) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                            return java.lang.String.valueOf(th.getMessage());
                                        }
                                    }, 30, null))));
                                }
                                throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframe");
                            }
                            throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframe");
                        }
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframe");
                    }
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframe");
                }
                throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframe");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonElement(jsonElement);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public /* synthetic */ Wireframe(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;", "", "", "previousId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframe", "<init>", "(Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)V", "component1", "()Ljava/lang/Long;", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "copy", "(Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getPreviousId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "getWireframe", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Add {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Add.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Add.Companion(null);
        private final java.lang.Long previousId;
        private final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe;

        public Add(java.lang.Long l, com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
            this.previousId = l;
            this.wireframe = wireframe;
        }

        public /* synthetic */ Add(java.lang.Long l, com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, wireframe);
        }

        public final java.lang.Long getPreviousId() {
            return this.previousId;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe getWireframe() {
            return this.wireframe;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.previousId;
            if (l != null) {
                jsonObject.addProperty("previousId", java.lang.Long.valueOf(l.longValue()));
            }
            jsonObject.add("wireframe", this.wireframe.toJson());
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Add$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Add;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Add fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Add", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Add fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("previousId");
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("wireframe");
                    com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.Companion companion = com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement2, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Add(valueOf, companion.fromJsonElement(jsonElement2));
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Add", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Add", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Add", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.previousId;
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe = this.wireframe;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Add(previousId=");
            sb.append(l);
            sb.append(", wireframe=");
            sb.append(wireframe);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.previousId;
            return ((l == null ? 0 : l.hashCode()) * 31) + this.wireframe.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Add)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Add add = (com.datadog.android.sessionreplay.model.MobileSegment.Add) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.previousId, add.previousId) && kotlin.jvm.internal.Intrinsics.areEqual(this.wireframe, add.wireframe);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Add copy(java.lang.Long previousId, com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.Add(previousId, wireframe);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe getWireframe() {
            return this.wireframe;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getPreviousId() {
            return this.previousId;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Add fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Add fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Add copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Add add, java.lang.Long l, com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = add.previousId;
            }
            if ((i & 2) != 0) {
                wireframe = add.wireframe;
            }
            return add.copy(l, wireframe);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;", "", "", "id", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Remove {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Remove.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Remove.Companion(null);
        private final long id;

        public Remove(long j) {
            this.id = j;
        }

        public final long getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Remove;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Remove fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Remove", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Remove fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Remove(jsonObject.get("id").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Remove", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Remove", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Remove", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Remove(id=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.id);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Remove) && this.id == ((com.datadog.android.sessionreplay.model.MobileSegment.Remove) other).id;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Remove copy(long id) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Remove(id);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Remove fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Remove fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Remove copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Remove remove, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = remove.id;
            }
            return remove.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Companion", "ImageWireframeUpdate", "PlaceholderWireframeUpdate", "ShapeWireframeUpdate", "TextWireframeUpdate", "WebviewWireframeUpdate", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class WireframeUpdateMutation {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.Companion(null);

        public abstract com.google.gson.JsonElement toJson();

        private WireframeUpdateMutation() {
        }

        @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0092\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b6\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010$R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010(\"\u0004\bC\u0010DR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010\u0019R\u001a\u0010I\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\bK\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\bL\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\bM\u0010\u001d"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "text", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "textStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "textPosition", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;)V", "component1", "()J", "component10", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "component11", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "()Ljava/lang/String;", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "Ljava/lang/Long;", "getHeight", "J", "getId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "getTextPosition", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "getTextStyle", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TextWireframeUpdate extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final java.lang.Long height;
            private final long id;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private java.lang.String text;
            private final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition;
            private final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle;
            private final java.lang.String type;
            private final java.lang.Long width;
            private final java.lang.Long x;
            private final java.lang.Long y;

            public /* synthetic */ TextWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : textStyle, (i & 1024) != 0 ? null : textPosition);
            }

            public final long getId() {
                return this.id;
            }

            public final java.lang.Long getX() {
                return this.x;
            }

            public final java.lang.Long getY() {
                return this.y;
            }

            public final java.lang.Long getWidth() {
                return this.width;
            }

            public final java.lang.Long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getText() {
                return this.text;
            }

            public final void setText(java.lang.String str) {
                this.text = str;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle getTextStyle() {
                return this.textStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition getTextPosition() {
                return this.textPosition;
            }

            public TextWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition) {
                super(null);
                this.id = j;
                this.x = l;
                this.y = l2;
                this.width = l3;
                this.height = l4;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.text = str;
                this.textStyle = textStyle;
                this.textPosition = textPosition;
                this.type = "text";
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                java.lang.Long l = this.x;
                if (l != null) {
                    jsonObject.addProperty("x", java.lang.Long.valueOf(l.longValue()));
                }
                java.lang.Long l2 = this.y;
                if (l2 != null) {
                    jsonObject.addProperty("y", java.lang.Long.valueOf(l2.longValue()));
                }
                java.lang.Long l3 = this.width;
                if (l3 != null) {
                    jsonObject.addProperty("width", java.lang.Long.valueOf(l3.longValue()));
                }
                java.lang.Long l4 = this.height;
                if (l4 != null) {
                    jsonObject.addProperty("height", java.lang.Long.valueOf(l4.longValue()));
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                java.lang.String str = this.text;
                if (str != null) {
                    jsonObject.addProperty("text", str);
                }
                com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle = this.textStyle;
                if (textStyle != null) {
                    jsonObject.add("textStyle", textStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                if (textPosition != null) {
                    jsonObject.add("textPosition", textPosition.toJson());
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$TextWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframeUpdate", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    com.google.gson.JsonObject asJsonObject3;
                    com.google.gson.JsonObject asJsonObject4;
                    com.google.gson.JsonObject asJsonObject5;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("x");
                        java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("y");
                        java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("width");
                        java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement4 = jsonObject.get("height");
                        java.lang.Long valueOf4 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement5 = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement5 == null || (asJsonObject5 = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject5);
                        com.google.gson.JsonElement jsonElement6 = jsonObject.get("shapeStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement6 == null || (asJsonObject4 = jsonElement6.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject4);
                        com.google.gson.JsonElement jsonElement7 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement7 == null || (asJsonObject3 = jsonElement7.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject3);
                        java.lang.String asString = jsonObject.get("type").getAsString();
                        com.google.gson.JsonElement jsonElement8 = jsonObject.get("text");
                        java.lang.String asString2 = jsonElement8 != null ? jsonElement8.getAsString() : null;
                        com.google.gson.JsonElement jsonElement9 = jsonObject.get("textStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject4 = (jsonElement9 == null || (asJsonObject2 = jsonElement9.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement10 = jsonObject.get("textPosition");
                        com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJsonObject5 = (jsonElement10 == null || (asJsonObject = jsonElement10.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.TextPosition.INSTANCE.fromJsonObject(asJsonObject);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "text")) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate(asLong, valueOf, valueOf2, valueOf3, valueOf4, fromJsonObject, fromJsonObject2, fromJsonObject3, asString2, fromJsonObject4, fromJsonObject5);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframeUpdate", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframeUpdate", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframeUpdate", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                java.lang.Long l = this.x;
                java.lang.Long l2 = this.y;
                java.lang.Long l3 = this.width;
                java.lang.Long l4 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.text;
                com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle = this.textStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TextWireframeUpdate(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(l);
                sb.append(", y=");
                sb.append(l2);
                sb.append(", width=");
                sb.append(l3);
                sb.append(", height=");
                sb.append(l4);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", text=");
                sb.append(str);
                sb.append(", textStyle=");
                sb.append(textStyle);
                sb.append(", textPosition=");
                sb.append(textPosition);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                java.lang.Long l = this.x;
                int hashCode2 = l == null ? 0 : l.hashCode();
                java.lang.Long l2 = this.y;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                java.lang.Long l3 = this.width;
                int hashCode4 = l3 == null ? 0 : l3.hashCode();
                java.lang.Long l4 = this.height;
                int hashCode5 = l4 == null ? 0 : l4.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                java.lang.String str = this.text;
                int hashCode9 = str == null ? 0 : str.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle = this.textStyle;
                int hashCode10 = textStyle == null ? 0 : textStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = this.textPosition;
                return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (textPosition != null ? textPosition.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate) other;
                return this.id == textWireframeUpdate.id && kotlin.jvm.internal.Intrinsics.areEqual(this.x, textWireframeUpdate.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, textWireframeUpdate.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, textWireframeUpdate.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, textWireframeUpdate.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, textWireframeUpdate.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, textWireframeUpdate.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, textWireframeUpdate.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, textWireframeUpdate.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.textStyle, textWireframeUpdate.textStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.textPosition, textWireframeUpdate.textPosition);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate copy(long id, java.lang.Long x, java.lang.Long y, java.lang.Long width, java.lang.Long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String text, com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate(id, x, y, width, height, clip, shapeStyle, border, text, textStyle, textPosition);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getText() {
                return this.text;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.Long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getX() {
                return this.x;
            }

            /* renamed from: component11, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition getTextPosition() {
                return this.textPosition;
            }

            /* renamed from: component10, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle getTextStyle() {
                return this.textStyle;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001=Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJn\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001aR\u001a\u00107\u001a\u00020*8\u0007X\u0087D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b:\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b;\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b<\u0010\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;)V", "component1", "()J", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "Ljava/lang/Long;", "getHeight", "J", "getId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "type", "Ljava/lang/String;", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ShapeWireframeUpdate extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final java.lang.Long height;
            private final long id;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String type;
            private final java.lang.Long width;
            private final java.lang.Long x;
            private final java.lang.Long y;

            public /* synthetic */ ShapeWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder);
            }

            public final long getId() {
                return this.id;
            }

            public final java.lang.Long getX() {
                return this.x;
            }

            public final java.lang.Long getY() {
                return this.y;
            }

            public final java.lang.Long getWidth() {
                return this.width;
            }

            public final java.lang.Long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public ShapeWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder) {
                super(null);
                this.id = j;
                this.x = l;
                this.y = l2;
                this.width = l3;
                this.height = l4;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                java.lang.Long l = this.x;
                if (l != null) {
                    jsonObject.addProperty("x", java.lang.Long.valueOf(l.longValue()));
                }
                java.lang.Long l2 = this.y;
                if (l2 != null) {
                    jsonObject.addProperty("y", java.lang.Long.valueOf(l2.longValue()));
                }
                java.lang.Long l3 = this.width;
                if (l3 != null) {
                    jsonObject.addProperty("width", java.lang.Long.valueOf(l3.longValue()));
                }
                java.lang.Long l4 = this.height;
                if (l4 != null) {
                    jsonObject.addProperty("height", java.lang.Long.valueOf(l4.longValue()));
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ShapeWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframeUpdate", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    com.google.gson.JsonObject asJsonObject3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("x");
                        java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("y");
                        java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("width");
                        java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement4 = jsonObject.get("height");
                        java.lang.Long valueOf4 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement5 = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement5 == null || (asJsonObject3 = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                        com.google.gson.JsonElement jsonElement6 = jsonObject.get("shapeStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement6 == null || (asJsonObject2 = jsonElement6.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement7 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement7 == null || (asJsonObject = jsonElement7.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(jsonObject.get("type").getAsString(), com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate(asLong, valueOf, valueOf2, valueOf3, valueOf4, fromJsonObject, fromJsonObject2, fromJsonObject3);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframeUpdate", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframeUpdate", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframeUpdate", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                java.lang.Long l = this.x;
                java.lang.Long l2 = this.y;
                java.lang.Long l3 = this.width;
                java.lang.Long l4 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeWireframeUpdate(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(l);
                sb.append(", y=");
                sb.append(l2);
                sb.append(", width=");
                sb.append(l3);
                sb.append(", height=");
                sb.append(l4);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                java.lang.Long l = this.x;
                int hashCode2 = l == null ? 0 : l.hashCode();
                java.lang.Long l2 = this.y;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                java.lang.Long l3 = this.width;
                int hashCode4 = l3 == null ? 0 : l3.hashCode();
                java.lang.Long l4 = this.height;
                int hashCode5 = l4 == null ? 0 : l4.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (shapeBorder != null ? shapeBorder.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate) other;
                return this.id == shapeWireframeUpdate.id && kotlin.jvm.internal.Intrinsics.areEqual(this.x, shapeWireframeUpdate.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, shapeWireframeUpdate.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, shapeWireframeUpdate.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, shapeWireframeUpdate.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, shapeWireframeUpdate.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, shapeWireframeUpdate.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, shapeWireframeUpdate.border);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate copy(long id, java.lang.Long x, java.lang.Long y, java.lang.Long width, java.lang.Long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate(id, x, y, width, height, clip, shapeStyle, border);
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.Long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getX() {
                return this.x;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u0000 P2\u00020\u0001:\u0001PB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u009e\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b5\u0010\u0019R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u0017R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010B\u001a\u0004\b\u0013\u0010\u001c\"\u0004\bC\u0010DR$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u00109R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\bG\u0010\u0019\"\u0004\bH\u00109R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010%R\u001a\u0010K\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bM\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\bN\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bO\u0010\u001e"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "base64", "resourceId", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "isEmpty", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()J", "component10", "()Ljava/lang/String;", "component11", "component12", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBase64", "setBase64", "(Ljava/lang/String;)V", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "Ljava/lang/Long;", "getHeight", "J", "getId", "Ljava/lang/Boolean;", "setEmpty", "(Ljava/lang/Boolean;)V", "getMimeType", "setMimeType", "getResourceId", "setResourceId", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ImageWireframeUpdate extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate.Companion(null);
            private java.lang.String base64;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final java.lang.Long height;
            private final long id;
            private java.lang.Boolean isEmpty;
            private java.lang.String mimeType;
            private java.lang.String resourceId;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String type;
            private final java.lang.Long width;
            private final java.lang.Long x;
            private final java.lang.Long y;

            public /* synthetic */ ImageWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : bool);
            }

            public final long getId() {
                return this.id;
            }

            public final java.lang.Long getX() {
                return this.x;
            }

            public final java.lang.Long getY() {
                return this.y;
            }

            public final java.lang.Long getWidth() {
                return this.width;
            }

            public final java.lang.Long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getBase64() {
                return this.base64;
            }

            public final void setBase64(java.lang.String str) {
                this.base64 = str;
            }

            public final java.lang.String getResourceId() {
                return this.resourceId;
            }

            public final void setResourceId(java.lang.String str) {
                this.resourceId = str;
            }

            public final java.lang.String getMimeType() {
                return this.mimeType;
            }

            public final void setMimeType(java.lang.String str) {
                this.mimeType = str;
            }

            public final java.lang.Boolean isEmpty() {
                return this.isEmpty;
            }

            public final void setEmpty(java.lang.Boolean bool) {
                this.isEmpty = bool;
            }

            public ImageWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool) {
                super(null);
                this.id = j;
                this.x = l;
                this.y = l2;
                this.width = l3;
                this.height = l4;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.base64 = str;
                this.resourceId = str2;
                this.mimeType = str3;
                this.isEmpty = bool;
                this.type = "image";
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                java.lang.Long l = this.x;
                if (l != null) {
                    jsonObject.addProperty("x", java.lang.Long.valueOf(l.longValue()));
                }
                java.lang.Long l2 = this.y;
                if (l2 != null) {
                    jsonObject.addProperty("y", java.lang.Long.valueOf(l2.longValue()));
                }
                java.lang.Long l3 = this.width;
                if (l3 != null) {
                    jsonObject.addProperty("width", java.lang.Long.valueOf(l3.longValue()));
                }
                java.lang.Long l4 = this.height;
                if (l4 != null) {
                    jsonObject.addProperty("height", java.lang.Long.valueOf(l4.longValue()));
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                java.lang.String str = this.base64;
                if (str != null) {
                    jsonObject.addProperty("base64", str);
                }
                java.lang.String str2 = this.resourceId;
                if (str2 != null) {
                    jsonObject.addProperty("resourceId", str2);
                }
                java.lang.String str3 = this.mimeType;
                if (str3 != null) {
                    jsonObject.addProperty(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, str3);
                }
                java.lang.Boolean bool = this.isEmpty;
                if (bool != null) {
                    jsonObject.addProperty("isEmpty", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$ImageWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframeUpdate", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    com.google.gson.JsonObject asJsonObject3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("x");
                        java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("y");
                        java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("width");
                        java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement4 = jsonObject.get("height");
                        java.lang.Long valueOf4 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement5 = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement5 == null || (asJsonObject3 = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                        com.google.gson.JsonElement jsonElement6 = jsonObject.get("shapeStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement6 == null || (asJsonObject2 = jsonElement6.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement7 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement7 == null || (asJsonObject = jsonElement7.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject);
                        java.lang.String asString = jsonObject.get("type").getAsString();
                        com.google.gson.JsonElement jsonElement8 = jsonObject.get("base64");
                        java.lang.String asString2 = jsonElement8 != null ? jsonElement8.getAsString() : null;
                        com.google.gson.JsonElement jsonElement9 = jsonObject.get("resourceId");
                        java.lang.String asString3 = jsonElement9 != null ? jsonElement9.getAsString() : null;
                        com.google.gson.JsonElement jsonElement10 = jsonObject.get(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE);
                        java.lang.String asString4 = jsonElement10 != null ? jsonElement10.getAsString() : null;
                        com.google.gson.JsonElement jsonElement11 = jsonObject.get("isEmpty");
                        java.lang.Boolean valueOf5 = jsonElement11 != null ? java.lang.Boolean.valueOf(jsonElement11.getAsBoolean()) : null;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "image")) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate(asLong, valueOf, valueOf2, valueOf3, valueOf4, fromJsonObject, fromJsonObject2, fromJsonObject3, asString2, asString3, asString4, valueOf5);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframeUpdate", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframeUpdate", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframeUpdate", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                java.lang.Long l = this.x;
                java.lang.Long l2 = this.y;
                java.lang.Long l3 = this.width;
                java.lang.Long l4 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.base64;
                java.lang.String str2 = this.resourceId;
                java.lang.String str3 = this.mimeType;
                java.lang.Boolean bool = this.isEmpty;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageWireframeUpdate(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(l);
                sb.append(", y=");
                sb.append(l2);
                sb.append(", width=");
                sb.append(l3);
                sb.append(", height=");
                sb.append(l4);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", base64=");
                sb.append(str);
                sb.append(", resourceId=");
                sb.append(str2);
                sb.append(", mimeType=");
                sb.append(str3);
                sb.append(", isEmpty=");
                sb.append(bool);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                java.lang.Long l = this.x;
                int hashCode2 = l == null ? 0 : l.hashCode();
                java.lang.Long l2 = this.y;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                java.lang.Long l3 = this.width;
                int hashCode4 = l3 == null ? 0 : l3.hashCode();
                java.lang.Long l4 = this.height;
                int hashCode5 = l4 == null ? 0 : l4.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                java.lang.String str = this.base64;
                int hashCode9 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.resourceId;
                int hashCode10 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.mimeType;
                int hashCode11 = str3 == null ? 0 : str3.hashCode();
                java.lang.Boolean bool = this.isEmpty;
                return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (bool != null ? bool.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate) other;
                return this.id == imageWireframeUpdate.id && kotlin.jvm.internal.Intrinsics.areEqual(this.x, imageWireframeUpdate.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, imageWireframeUpdate.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, imageWireframeUpdate.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, imageWireframeUpdate.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, imageWireframeUpdate.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, imageWireframeUpdate.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, imageWireframeUpdate.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.base64, imageWireframeUpdate.base64) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, imageWireframeUpdate.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, imageWireframeUpdate.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.isEmpty, imageWireframeUpdate.isEmpty);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate copy(long id, java.lang.Long x, java.lang.Long y, java.lang.Long width, java.lang.Long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String base64, java.lang.String resourceId, java.lang.String mimeType, java.lang.Boolean isEmpty) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate(id, x, y, width, height, clip, shapeStyle, border, base64, resourceId, mimeType, isEmpty);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getBase64() {
                return this.base64;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.Long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getX() {
                return this.x;
            }

            /* renamed from: component12, reason: from getter */
            public final java.lang.Boolean getIsEmpty() {
                return this.isEmpty;
            }

            /* renamed from: component11, reason: from getter */
            public final java.lang.String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component10, reason: from getter */
            public final java.lang.String getResourceId() {
                return this.resourceId;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jb\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\n8\u0007X\u0087D¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b3\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b4\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b5\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "", "label", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Ljava/lang/String;", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "Ljava/lang/Long;", "getHeight", "J", "getId", "Ljava/lang/String;", "getLabel", "setLabel", "(Ljava/lang/String;)V", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PlaceholderWireframeUpdate extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final java.lang.Long height;
            private final long id;
            private java.lang.String label;
            private final java.lang.String type;
            private final java.lang.Long width;
            private final java.lang.Long x;
            private final java.lang.Long y;

            public /* synthetic */ PlaceholderWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : str);
            }

            public final long getId() {
                return this.id;
            }

            public final java.lang.Long getX() {
                return this.x;
            }

            public final java.lang.Long getY() {
                return this.y;
            }

            public final java.lang.Long getWidth() {
                return this.width;
            }

            public final java.lang.Long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final java.lang.String getLabel() {
                return this.label;
            }

            public final void setLabel(java.lang.String str) {
                this.label = str;
            }

            public PlaceholderWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, java.lang.String str) {
                super(null);
                this.id = j;
                this.x = l;
                this.y = l2;
                this.width = l3;
                this.height = l4;
                this.clip = wireframeClip;
                this.label = str;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                java.lang.Long l = this.x;
                if (l != null) {
                    jsonObject.addProperty("x", java.lang.Long.valueOf(l.longValue()));
                }
                java.lang.Long l2 = this.y;
                if (l2 != null) {
                    jsonObject.addProperty("y", java.lang.Long.valueOf(l2.longValue()));
                }
                java.lang.Long l3 = this.width;
                if (l3 != null) {
                    jsonObject.addProperty("width", java.lang.Long.valueOf(l3.longValue()));
                }
                java.lang.Long l4 = this.height;
                if (l4 != null) {
                    jsonObject.addProperty("height", java.lang.Long.valueOf(l4.longValue()));
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                jsonObject.addProperty("type", this.type);
                java.lang.String str = this.label;
                if (str != null) {
                    jsonObject.addProperty("label", str);
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$PlaceholderWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframeUpdate", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("x");
                        java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("y");
                        java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("width");
                        java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement4 = jsonObject.get("height");
                        java.lang.Long valueOf4 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement5 = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement5 == null || (asJsonObject = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject);
                        java.lang.String asString = jsonObject.get("type").getAsString();
                        com.google.gson.JsonElement jsonElement6 = jsonObject.get("label");
                        java.lang.String asString2 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate(asLong, valueOf, valueOf2, valueOf3, valueOf4, fromJsonObject, asString2);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframeUpdate", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframeUpdate", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframeUpdate", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                java.lang.Long l = this.x;
                java.lang.Long l2 = this.y;
                java.lang.Long l3 = this.width;
                java.lang.Long l4 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                java.lang.String str = this.label;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaceholderWireframeUpdate(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(l);
                sb.append(", y=");
                sb.append(l2);
                sb.append(", width=");
                sb.append(l3);
                sb.append(", height=");
                sb.append(l4);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", label=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                java.lang.Long l = this.x;
                int hashCode2 = l == null ? 0 : l.hashCode();
                java.lang.Long l2 = this.y;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                java.lang.Long l3 = this.width;
                int hashCode4 = l3 == null ? 0 : l3.hashCode();
                java.lang.Long l4 = this.height;
                int hashCode5 = l4 == null ? 0 : l4.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                java.lang.String str = this.label;
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate) other;
                return this.id == placeholderWireframeUpdate.id && kotlin.jvm.internal.Intrinsics.areEqual(this.x, placeholderWireframeUpdate.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, placeholderWireframeUpdate.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, placeholderWireframeUpdate.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, placeholderWireframeUpdate.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, placeholderWireframeUpdate.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, placeholderWireframeUpdate.label);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate copy(long id, java.lang.Long x, java.lang.Long y, java.lang.Long width, java.lang.Long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, java.lang.String label) {
                return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate(id, x, y, width, height, clip, label);
            }

            /* renamed from: component7, reason: from getter */
            public final java.lang.String getLabel() {
                return this.label;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.Long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getX() {
                return this.x;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 D2\u00020\u0001:\u0001DBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0084\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b1\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010?\u001a\u00020\u000e8\u0007X\u0087D¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\bA\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\bB\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\bC\u0010\u0019"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "", "id", "x", "y", "width", "height", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "", "slotId", "", "isVisible", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()J", "component10", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "component7", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "component8", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "component9", "()Ljava/lang/String;", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "getBorder", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getClip", "Ljava/lang/Long;", "getHeight", "J", "getId", "Ljava/lang/Boolean;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "getShapeStyle", "Ljava/lang/String;", "getSlotId", "type", "getType", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class WebviewWireframeUpdate extends com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate.Companion(null);
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border;
            private final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
            private final java.lang.Long height;
            private final long id;
            private final java.lang.Boolean isVisible;
            private final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle;
            private final java.lang.String slotId;
            private final java.lang.String type;
            private final java.lang.Long width;
            private final java.lang.Long x;
            private final java.lang.Long y;

            public /* synthetic */ WebviewWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : wireframeClip, (i & 64) != 0 ? null : shapeStyle, (i & 128) != 0 ? null : shapeBorder, str, (i & 512) != 0 ? null : bool);
            }

            public final long getId() {
                return this.id;
            }

            public final java.lang.Long getX() {
                return this.x;
            }

            public final java.lang.Long getY() {
                return this.y;
            }

            public final java.lang.Long getWidth() {
                return this.width;
            }

            public final java.lang.Long getHeight() {
                return this.height;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            public final java.lang.Boolean isVisible() {
                return this.isVisible;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebviewWireframeUpdate(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, java.lang.Boolean bool) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.id = j;
                this.x = l;
                this.y = l2;
                this.width = l3;
                this.height = l4;
                this.clip = wireframeClip;
                this.shapeStyle = shapeStyle;
                this.border = shapeBorder;
                this.slotId = str;
                this.isVisible = bool;
                this.type = com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            @Override // com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation
            public final com.google.gson.JsonElement toJson() {
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
                java.lang.Long l = this.x;
                if (l != null) {
                    jsonObject.addProperty("x", java.lang.Long.valueOf(l.longValue()));
                }
                java.lang.Long l2 = this.y;
                if (l2 != null) {
                    jsonObject.addProperty("y", java.lang.Long.valueOf(l2.longValue()));
                }
                java.lang.Long l3 = this.width;
                if (l3 != null) {
                    jsonObject.addProperty("width", java.lang.Long.valueOf(l3.longValue()));
                }
                java.lang.Long l4 = this.height;
                if (l4 != null) {
                    jsonObject.addProperty("height", java.lang.Long.valueOf(l4.longValue()));
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                if (wireframeClip != null) {
                    jsonObject.add("clip", wireframeClip.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                if (shapeStyle != null) {
                    jsonObject.add("shapeStyle", shapeStyle.toJson());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                if (shapeBorder != null) {
                    jsonObject.add(androidx.compose.material.OutlinedTextFieldKt.BorderId, shapeBorder.toJson());
                }
                jsonObject.addProperty("type", this.type);
                jsonObject.addProperty("slotId", this.slotId);
                java.lang.Boolean bool = this.isVisible;
                if (bool != null) {
                    jsonObject.addProperty("isVisible", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                return jsonObject;
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$WebviewWireframeUpdate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                        return fromJsonObject(asJsonObject);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframeUpdate", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                    com.google.gson.JsonObject asJsonObject;
                    com.google.gson.JsonObject asJsonObject2;
                    com.google.gson.JsonObject asJsonObject3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    try {
                        long asLong = jsonObject.get("id").getAsLong();
                        com.google.gson.JsonElement jsonElement = jsonObject.get("x");
                        java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement2 = jsonObject.get("y");
                        java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement3 = jsonObject.get("width");
                        java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement4 = jsonObject.get("height");
                        java.lang.Long valueOf4 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                        com.google.gson.JsonElement jsonElement5 = jsonObject.get("clip");
                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject = (jsonElement5 == null || (asJsonObject3 = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.INSTANCE.fromJsonObject(asJsonObject3);
                        com.google.gson.JsonElement jsonElement6 = jsonObject.get("shapeStyle");
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject2 = (jsonElement6 == null || (asJsonObject2 = jsonElement6.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement7 = jsonObject.get(androidx.compose.material.OutlinedTextFieldKt.BorderId);
                        com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject3 = (jsonElement7 == null || (asJsonObject = jsonElement7.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.INSTANCE.fromJsonObject(asJsonObject);
                        java.lang.String asString = jsonObject.get("type").getAsString();
                        java.lang.String asString2 = jsonObject.get("slotId").getAsString();
                        com.google.gson.JsonElement jsonElement8 = jsonObject.get("isVisible");
                        java.lang.Boolean valueOf5 = jsonElement8 != null ? java.lang.Boolean.valueOf(jsonElement8.getAsBoolean()) : null;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate(asLong, valueOf, valueOf2, valueOf3, valueOf4, fromJsonObject, fromJsonObject2, fromJsonObject3, asString2, valueOf5);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframeUpdate", e);
                    } catch (java.lang.NullPointerException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframeUpdate", e2);
                    } catch (java.lang.NumberFormatException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframeUpdate", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.id;
                java.lang.Long l = this.x;
                java.lang.Long l2 = this.y;
                java.lang.Long l3 = this.width;
                java.lang.Long l4 = this.height;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                java.lang.String str = this.slotId;
                java.lang.Boolean bool = this.isVisible;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("WebviewWireframeUpdate(id=");
                sb.append(j);
                sb.append(", x=");
                sb.append(l);
                sb.append(", y=");
                sb.append(l2);
                sb.append(", width=");
                sb.append(l3);
                sb.append(", height=");
                sb.append(l4);
                sb.append(", clip=");
                sb.append(wireframeClip);
                sb.append(", shapeStyle=");
                sb.append(shapeStyle);
                sb.append(", border=");
                sb.append(shapeBorder);
                sb.append(", slotId=");
                sb.append(str);
                sb.append(", isVisible=");
                sb.append(bool);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Long.hashCode(this.id);
                java.lang.Long l = this.x;
                int hashCode2 = l == null ? 0 : l.hashCode();
                java.lang.Long l2 = this.y;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                java.lang.Long l3 = this.width;
                int hashCode4 = l3 == null ? 0 : l3.hashCode();
                java.lang.Long l4 = this.height;
                int hashCode5 = l4 == null ? 0 : l4.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = this.clip;
                int hashCode6 = wireframeClip == null ? 0 : wireframeClip.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = this.shapeStyle;
                int hashCode7 = shapeStyle == null ? 0 : shapeStyle.hashCode();
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = this.border;
                int hashCode8 = shapeBorder == null ? 0 : shapeBorder.hashCode();
                int hashCode9 = this.slotId.hashCode();
                java.lang.Boolean bool = this.isVisible;
                return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (bool != null ? bool.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate)) {
                    return false;
                }
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate) other;
                return this.id == webviewWireframeUpdate.id && kotlin.jvm.internal.Intrinsics.areEqual(this.x, webviewWireframeUpdate.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, webviewWireframeUpdate.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, webviewWireframeUpdate.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, webviewWireframeUpdate.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.clip, webviewWireframeUpdate.clip) && kotlin.jvm.internal.Intrinsics.areEqual(this.shapeStyle, webviewWireframeUpdate.shapeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.border, webviewWireframeUpdate.border) && kotlin.jvm.internal.Intrinsics.areEqual(this.slotId, webviewWireframeUpdate.slotId) && kotlin.jvm.internal.Intrinsics.areEqual(this.isVisible, webviewWireframeUpdate.isVisible);
            }

            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate copy(long id, java.lang.Long x, java.lang.Long y, java.lang.Long width, java.lang.Long height, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder border, java.lang.String slotId, java.lang.Boolean isVisible) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "");
                return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate(id, x, y, width, height, clip, shapeStyle, border, slotId, isVisible);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getSlotId() {
                return this.slotId;
            }

            /* renamed from: component8, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder getBorder() {
                return this.border;
            }

            /* renamed from: component7, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle getShapeStyle() {
                return this.shapeStyle;
            }

            /* renamed from: component6, reason: from getter */
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip getClip() {
                return this.clip;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.Long getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Long getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.Long getY() {
                return this.y;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Long getX() {
                return this.x;
            }

            /* renamed from: component10, reason: from getter */
            public final java.lang.Boolean getIsVisible() {
                return this.isVisible;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonObject(jsonObject);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;", "Lcom/google/gson/JsonElement;", "jsonElement", "fromJsonElement", "(Lcom/google/gson/JsonElement;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeUpdateMutation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(jsonString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    return fromJsonElement(parseString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type WireframeUpdateMutation", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = jsonElement instanceof com.google.gson.JsonObject;
                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation wireframeUpdateMutation = null;
                try {
                } catch (com.google.gson.JsonParseException e) {
                    arrayList.add(e);
                    textWireframeUpdate = null;
                }
                if (z) {
                    textWireframeUpdate = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                    try {
                    } catch (com.google.gson.JsonParseException e2) {
                        arrayList.add(e2);
                        shapeWireframeUpdate = null;
                    }
                    if (z) {
                        shapeWireframeUpdate = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                        try {
                        } catch (com.google.gson.JsonParseException e3) {
                            arrayList.add(e3);
                            imageWireframeUpdate = null;
                        }
                        if (z) {
                            imageWireframeUpdate = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                            try {
                            } catch (com.google.gson.JsonParseException e4) {
                                arrayList.add(e4);
                                placeholderWireframeUpdate = null;
                            }
                            if (z) {
                                placeholderWireframeUpdate = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                try {
                                } catch (com.google.gson.JsonParseException e5) {
                                    arrayList.add(e5);
                                    webviewWireframeUpdate = null;
                                }
                                if (z) {
                                    webviewWireframeUpdate = com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate.INSTANCE.fromJsonObject((com.google.gson.JsonObject) jsonElement);
                                    int i = 0;
                                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation[] wireframeUpdateMutationArr = {textWireframeUpdate, shapeWireframeUpdate, imageWireframeUpdate, placeholderWireframeUpdate, webviewWireframeUpdate};
                                    while (true) {
                                        if (i < 5) {
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation wireframeUpdateMutation2 = wireframeUpdateMutationArr[i];
                                            if (wireframeUpdateMutation2 != null) {
                                                wireframeUpdateMutation = wireframeUpdateMutation2;
                                                break;
                                            }
                                            i++;
                                        } else {
                                            break;
                                        }
                                    }
                                    if (wireframeUpdateMutation != null) {
                                        return wireframeUpdateMutation;
                                    }
                                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type \nWireframeUpdateMutation\n".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.CharSequence>() { // from class: com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation$Companion$fromJsonElement$message$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                                        public final java.lang.CharSequence invoke(java.lang.Throwable th) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                            return java.lang.String.valueOf(th.getMessage());
                                        }
                                    }, 30, null))));
                                }
                                throw new com.google.gson.JsonParseException("Unable to parse json into type WebviewWireframeUpdate");
                            }
                            throw new com.google.gson.JsonParseException("Unable to parse json into type PlaceholderWireframeUpdate");
                        }
                        throw new com.google.gson.JsonParseException("Unable to parse json into type ImageWireframeUpdate");
                    }
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeWireframeUpdate");
                }
                throw new com.google.gson.JsonParseException("Unable to parse json into type TextWireframeUpdate");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonElement(jsonElement);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public /* synthetic */ WireframeUpdateMutation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;", "", "", "id", "x", "y", "timestamp", "<init>", "(JJJJ)V", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getId", "getTimestamp", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Position {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Position.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Position.Companion(null);
        private final long id;
        private final long timestamp;
        private final long x;
        private final long y;

        public Position(long j, long j2, long j3, long j4) {
            this.id = j;
            this.x = j2;
            this.y = j3;
            this.timestamp = j4;
        }

        public final long getId() {
            return this.id;
        }

        public final long getX() {
            return this.x;
        }

        public final long getY() {
            return this.y;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", java.lang.Long.valueOf(this.id));
            jsonObject.addProperty("x", java.lang.Long.valueOf(this.x));
            jsonObject.addProperty("y", java.lang.Long.valueOf(this.y));
            jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Position$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Position;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Position fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Position", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Position fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Position(jsonObject.get("id").getAsLong(), jsonObject.get("x").getAsLong(), jsonObject.get("y").getAsLong(), jsonObject.get("timestamp").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Position", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Position", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Position", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.id;
            long j2 = this.x;
            long j3 = this.y;
            long j4 = this.timestamp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Position(id=");
            sb.append(j);
            sb.append(", x=");
            sb.append(j2);
            sb.append(", y=");
            sb.append(j3);
            sb.append(", timestamp=");
            sb.append(j4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Long.hashCode(this.id) * 31) + java.lang.Long.hashCode(this.x)) * 31) + java.lang.Long.hashCode(this.y)) * 31) + java.lang.Long.hashCode(this.timestamp);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Position)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Position position = (com.datadog.android.sessionreplay.model.MobileSegment.Position) other;
            return this.id == position.id && this.x == position.x && this.y == position.y && this.timestamp == position.timestamp;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Position copy(long id, long x, long y, long timestamp) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Position(id, x, y, timestamp);
        }

        /* renamed from: component4, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final long getY() {
            return this.y;
        }

        /* renamed from: component2, reason: from getter */
        public final long getX() {
            return this.x;
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Position fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Position fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "", "", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getBottom", "getLeft", "getRight", "getTop", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WireframeClip {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip.Companion(null);
        private final java.lang.Long bottom;
        private final java.lang.Long left;
        private final java.lang.Long right;
        private final java.lang.Long top;

        public WireframeClip(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4) {
            this.top = l;
            this.bottom = l2;
            this.left = l3;
            this.right = l4;
        }

        public /* synthetic */ WireframeClip(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4);
        }

        public final java.lang.Long getTop() {
            return this.top;
        }

        public final java.lang.Long getBottom() {
            return this.bottom;
        }

        public final java.lang.Long getLeft() {
            return this.left;
        }

        public final java.lang.Long getRight() {
            return this.right;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.top;
            if (l != null) {
                jsonObject.addProperty(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.bottom;
            if (l2 != null) {
                jsonObject.addProperty(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, java.lang.Long.valueOf(l2.longValue()));
            }
            java.lang.Long l3 = this.left;
            if (l3 != null) {
                jsonObject.addProperty(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, java.lang.Long.valueOf(l3.longValue()));
            }
            java.lang.Long l4 = this.right;
            if (l4 != null) {
                jsonObject.addProperty(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, java.lang.Long.valueOf(l4.longValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type WireframeClip", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
                    java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
                    java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
                    return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(valueOf, valueOf2, valueOf3, jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type WireframeClip", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type WireframeClip", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type WireframeClip", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.top;
            java.lang.Long l2 = this.bottom;
            java.lang.Long l3 = this.left;
            java.lang.Long l4 = this.right;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WireframeClip(top=");
            sb.append(l);
            sb.append(", bottom=");
            sb.append(l2);
            sb.append(", left=");
            sb.append(l3);
            sb.append(", right=");
            sb.append(l4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.top;
            int hashCode = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.bottom;
            int hashCode2 = l2 == null ? 0 : l2.hashCode();
            java.lang.Long l3 = this.left;
            int hashCode3 = l3 == null ? 0 : l3.hashCode();
            java.lang.Long l4 = this.right;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (l4 != null ? l4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip = (com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.top, wireframeClip.top) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottom, wireframeClip.bottom) && kotlin.jvm.internal.Intrinsics.areEqual(this.left, wireframeClip.left) && kotlin.jvm.internal.Intrinsics.areEqual(this.right, wireframeClip.right);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip copy(java.lang.Long top, java.lang.Long bottom, java.lang.Long left, java.lang.Long right) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(top, bottom, left, right);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Long getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Long getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getBottom() {
            return this.bottom;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getTop() {
            return this.top;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip copy$default(com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = wireframeClip.top;
            }
            if ((i & 2) != 0) {
                l2 = wireframeClip.bottom;
            }
            if ((i & 4) != 0) {
                l3 = wireframeClip.left;
            }
            if ((i & 8) != 0) {
                l4 = wireframeClip.right;
            }
            return wireframeClip.copy(l, l2, l3, l4);
        }

        public WireframeClip() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "", "", "backgroundColor", "", "opacity", "cornerRadius", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Number;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBackgroundColor", "Ljava/lang/Number;", "getCornerRadius", "getOpacity", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ShapeStyle {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle.Companion(null);
        private final java.lang.String backgroundColor;
        private final java.lang.Number cornerRadius;
        private final java.lang.Number opacity;

        public ShapeStyle(java.lang.String str, java.lang.Number number, java.lang.Number number2) {
            this.backgroundColor = str;
            this.opacity = number;
            this.cornerRadius = number2;
        }

        public /* synthetic */ ShapeStyle(java.lang.String str, java.lang.Number number, java.lang.Number number2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : number, (i & 4) != 0 ? null : number2);
        }

        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final java.lang.Number getOpacity() {
            return this.opacity;
        }

        public final java.lang.Number getCornerRadius() {
            return this.cornerRadius;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.backgroundColor;
            if (str != null) {
                jsonObject.addProperty("backgroundColor", str);
            }
            java.lang.Number number = this.opacity;
            if (number != null) {
                jsonObject.addProperty("opacity", number);
            }
            java.lang.Number number2 = this.cornerRadius;
            if (number2 != null) {
                jsonObject.addProperty("cornerRadius", number2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeStyle", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("backgroundColor");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("opacity");
                    java.lang.Number asNumber = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("cornerRadius");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(asString, asNumber, jsonElement3 != null ? jsonElement3.getAsNumber() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeStyle", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeStyle", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeStyle", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.backgroundColor;
            java.lang.Number number = this.opacity;
            java.lang.Number number2 = this.cornerRadius;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeStyle(backgroundColor=");
            sb.append(str);
            sb.append(", opacity=");
            sb.append(number);
            sb.append(", cornerRadius=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.backgroundColor;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Number number = this.opacity;
            int hashCode2 = number == null ? 0 : number.hashCode();
            java.lang.Number number2 = this.cornerRadius;
            return (((hashCode * 31) + hashCode2) * 31) + (number2 != null ? number2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = (com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, shapeStyle.backgroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.opacity, shapeStyle.opacity) && kotlin.jvm.internal.Intrinsics.areEqual(this.cornerRadius, shapeStyle.cornerRadius);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle copy(java.lang.String backgroundColor, java.lang.Number opacity, java.lang.Number cornerRadius) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(backgroundColor, opacity, cornerRadius);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getOpacity() {
            return this.opacity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle copy$default(com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle, java.lang.String str, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shapeStyle.backgroundColor;
            }
            if ((i & 2) != 0) {
                number = shapeStyle.opacity;
            }
            if ((i & 4) != 0) {
                number2 = shapeStyle.cornerRadius;
            }
            return shapeStyle.copy(str, number, number2);
        }

        public ShapeStyle() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "width", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getColor", "J", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ShapeBorder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder.Companion(null);
        private final java.lang.String color;
        private final long width;

        public ShapeBorder(java.lang.String str, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.color = str;
            this.width = j;
        }

        public final java.lang.String getColor() {
            return this.color;
        }

        public final long getWidth() {
            return this.width;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, this.color);
            jsonObject.addProperty("width", java.lang.Long.valueOf(this.width));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeBorder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeBorder", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR).getAsString();
                    long asLong = jsonObject.get("width").getAsLong();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder(asString, asLong);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeBorder", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeBorder", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ShapeBorder", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.color;
            long j = this.width;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeBorder(color=");
            sb.append(str);
            sb.append(", width=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.color.hashCode() * 31) + java.lang.Long.hashCode(this.width);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder = (com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.color, shapeBorder.color) && this.width == shapeBorder.width;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder copy(java.lang.String color, long width) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder(color, width);
        }

        /* renamed from: component2, reason: from getter */
        public final long getWidth() {
            return this.width;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder copy$default(com.datadog.android.sessionreplay.model.MobileSegment.ShapeBorder shapeBorder, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shapeBorder.color;
            }
            if ((i & 2) != 0) {
                j = shapeBorder.width;
            }
            return shapeBorder.copy(str, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b!\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "", "", "family", "", io.ktor.http.ContentDisposition.Parameters.Size, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;", "truncationMode", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;", "copy", "(Ljava/lang/String;JLjava/lang/String;Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getColor", "getFamily", "J", "getSize", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;", "getTruncationMode", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextStyle {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.TextStyle.Companion(null);
        private final java.lang.String color;
        private final java.lang.String family;
        private final long size;
        private final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode;

        public TextStyle(java.lang.String str, long j, java.lang.String str2, com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.family = str;
            this.size = j;
            this.color = str2;
            this.truncationMode = truncationMode;
        }

        public /* synthetic */ TextStyle(java.lang.String str, long j, java.lang.String str2, com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, (i & 8) != 0 ? null : truncationMode);
        }

        public final java.lang.String getFamily() {
            return this.family;
        }

        public final long getSize() {
            return this.size;
        }

        public final java.lang.String getColor() {
            return this.color;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode getTruncationMode() {
            return this.truncationMode;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("family", this.family);
            jsonObject.addProperty(io.ktor.http.ContentDisposition.Parameters.Size, java.lang.Long.valueOf(this.size));
            jsonObject.addProperty(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, this.color);
            com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode = this.truncationMode;
            if (truncationMode != null) {
                jsonObject.add("truncationMode", truncationMode.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextStyle;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextStyle", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString2 = jsonObject.get("family").getAsString();
                    long asLong = jsonObject.get(io.ktor.http.ContentDisposition.Parameters.Size).getAsLong();
                    java.lang.String asString3 = jsonObject.get(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR).getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("truncationMode");
                    com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode fromJson = (jsonElement == null || (asString = jsonElement.getAsString()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.INSTANCE.fromJson(asString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new com.datadog.android.sessionreplay.model.MobileSegment.TextStyle(asString2, asLong, asString3, fromJson);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextStyle", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextStyle", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextStyle", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.family;
            long j = this.size;
            java.lang.String str2 = this.color;
            com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode = this.truncationMode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TextStyle(family=");
            sb.append(str);
            sb.append(", size=");
            sb.append(j);
            sb.append(", color=");
            sb.append(str2);
            sb.append(", truncationMode=");
            sb.append(truncationMode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.family.hashCode();
            int hashCode2 = java.lang.Long.hashCode(this.size);
            int hashCode3 = this.color.hashCode();
            com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode = this.truncationMode;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (truncationMode == null ? 0 : truncationMode.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.TextStyle)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle = (com.datadog.android.sessionreplay.model.MobileSegment.TextStyle) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.family, textStyle.family) && this.size == textStyle.size && kotlin.jvm.internal.Intrinsics.areEqual(this.color, textStyle.color) && this.truncationMode == textStyle.truncationMode;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle copy(java.lang.String family, long size, java.lang.String color, com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(family, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            return new com.datadog.android.sessionreplay.model.MobileSegment.TextStyle(family, size, color, truncationMode);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode getTruncationMode() {
            return this.truncationMode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFamily() {
            return this.family;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextStyle fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.TextStyle copy$default(com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle, java.lang.String str, long j, java.lang.String str2, com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = textStyle.family;
            }
            if ((i & 2) != 0) {
                j = textStyle.size;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                str2 = textStyle.color;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                truncationMode = textStyle.truncationMode;
            }
            return textStyle.copy(str, j2, str3, truncationMode);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "padding", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "alignment", "<init>", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;)V", "component1", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "getAlignment", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "getPadding", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextPosition {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.TextPosition.Companion(null);
        private final com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment;
        private final com.datadog.android.sessionreplay.model.MobileSegment.Padding padding;

        public TextPosition(com.datadog.android.sessionreplay.model.MobileSegment.Padding padding, com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment) {
            this.padding = padding;
            this.alignment = alignment;
        }

        public /* synthetic */ TextPosition(com.datadog.android.sessionreplay.model.MobileSegment.Padding padding, com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : padding, (i & 2) != 0 ? null : alignment);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Padding getPadding() {
            return this.padding;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Alignment getAlignment() {
            return this.alignment;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.sessionreplay.model.MobileSegment.Padding padding = this.padding;
            if (padding != null) {
                jsonObject.add("padding", padding.toJson());
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment = this.alignment;
            if (alignment != null) {
                jsonObject.add("alignment", alignment.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TextPosition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextPosition", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("padding");
                    com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment = null;
                    com.datadog.android.sessionreplay.model.MobileSegment.Padding fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.Padding.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("alignment");
                    if (jsonElement2 != null && (asJsonObject = jsonElement2.getAsJsonObject()) != null) {
                        alignment = com.datadog.android.sessionreplay.model.MobileSegment.Alignment.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.sessionreplay.model.MobileSegment.TextPosition(fromJsonObject, alignment);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextPosition", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextPosition", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type TextPosition", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.sessionreplay.model.MobileSegment.Padding padding = this.padding;
            com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment = this.alignment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TextPosition(padding=");
            sb.append(padding);
            sb.append(", alignment=");
            sb.append(alignment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.sessionreplay.model.MobileSegment.Padding padding = this.padding;
            int hashCode = padding == null ? 0 : padding.hashCode();
            com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment = this.alignment;
            return (hashCode * 31) + (alignment != null ? alignment.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.TextPosition)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition = (com.datadog.android.sessionreplay.model.MobileSegment.TextPosition) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.padding, textPosition.padding) && kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, textPosition.alignment);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition copy(com.datadog.android.sessionreplay.model.MobileSegment.Padding padding, com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.TextPosition(padding, alignment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.Alignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.Padding getPadding() {
            return this.padding;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TextPosition fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.TextPosition copy$default(com.datadog.android.sessionreplay.model.MobileSegment.TextPosition textPosition, com.datadog.android.sessionreplay.model.MobileSegment.Padding padding, com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                padding = textPosition.padding;
            }
            if ((i & 2) != 0) {
                alignment = textPosition.alignment;
            }
            return textPosition.copy(padding, alignment);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextPosition() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "", "", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getBottom", "getLeft", "getRight", "getTop", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Padding {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Padding.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Padding.Companion(null);
        private final java.lang.Long bottom;
        private final java.lang.Long left;
        private final java.lang.Long right;
        private final java.lang.Long top;

        public Padding(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4) {
            this.top = l;
            this.bottom = l2;
            this.left = l3;
            this.right = l4;
        }

        public /* synthetic */ Padding(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4);
        }

        public final java.lang.Long getTop() {
            return this.top;
        }

        public final java.lang.Long getBottom() {
            return this.bottom;
        }

        public final java.lang.Long getLeft() {
            return this.left;
        }

        public final java.lang.Long getRight() {
            return this.right;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.top;
            if (l != null) {
                jsonObject.addProperty(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.bottom;
            if (l2 != null) {
                jsonObject.addProperty(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, java.lang.Long.valueOf(l2.longValue()));
            }
            java.lang.Long l3 = this.left;
            if (l3 != null) {
                jsonObject.addProperty(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, java.lang.Long.valueOf(l3.longValue()));
            }
            java.lang.Long l4 = this.right;
            if (l4 != null) {
                jsonObject.addProperty(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, java.lang.Long.valueOf(l4.longValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Padding;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Padding fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Padding", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Padding fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
                    java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
                    java.lang.Long valueOf3 = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Padding(valueOf, valueOf2, valueOf3, jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Padding", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Padding", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Padding", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.top;
            java.lang.Long l2 = this.bottom;
            java.lang.Long l3 = this.left;
            java.lang.Long l4 = this.right;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding(top=");
            sb.append(l);
            sb.append(", bottom=");
            sb.append(l2);
            sb.append(", left=");
            sb.append(l3);
            sb.append(", right=");
            sb.append(l4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.top;
            int hashCode = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.bottom;
            int hashCode2 = l2 == null ? 0 : l2.hashCode();
            java.lang.Long l3 = this.left;
            int hashCode3 = l3 == null ? 0 : l3.hashCode();
            java.lang.Long l4 = this.right;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (l4 != null ? l4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Padding)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Padding padding = (com.datadog.android.sessionreplay.model.MobileSegment.Padding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.top, padding.top) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottom, padding.bottom) && kotlin.jvm.internal.Intrinsics.areEqual(this.left, padding.left) && kotlin.jvm.internal.Intrinsics.areEqual(this.right, padding.right);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Padding copy(java.lang.Long top, java.lang.Long bottom, java.lang.Long left, java.lang.Long right) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Padding(top, bottom, left, right);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Long getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Long getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getBottom() {
            return this.bottom;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getTop() {
            return this.top;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Padding fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Padding fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Padding copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Padding padding, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = padding.top;
            }
            if ((i & 2) != 0) {
                l2 = padding.bottom;
            }
            if ((i & 4) != 0) {
                l3 = padding.left;
            }
            if ((i & 8) != 0) {
                l4 = padding.right;
            }
            return padding.copy(l, l2, l3, l4);
        }

        public Padding() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;", "horizontal", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;", "vertical", "<init>", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;)V", "component1", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;", "component2", "()Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;", "getHorizontal", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;", "getVertical", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Alignment {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Alignment.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment.Companion(null);
        private final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal;
        private final com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical;

        public Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal, com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical) {
            this.horizontal = horizontal;
            this.vertical = vertical;
        }

        public /* synthetic */ Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal, com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : horizontal, (i & 2) != 0 ? null : vertical);
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Vertical getVertical() {
            return this.vertical;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal = this.horizontal;
            if (horizontal != null) {
                jsonObject.add("horizontal", horizontal.toJson());
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical = this.vertical;
            if (vertical != null) {
                jsonObject.add("vertical", vertical.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Alignment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Alignment fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Alignment", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Alignment fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("horizontal");
                    com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical = null;
                    com.datadog.android.sessionreplay.model.MobileSegment.Horizontal fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("vertical");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        vertical = com.datadog.android.sessionreplay.model.MobileSegment.Vertical.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(fromJson, vertical);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Alignment", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Alignment", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Alignment", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal = this.horizontal;
            com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical = this.vertical;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alignment(horizontal=");
            sb.append(horizontal);
            sb.append(", vertical=");
            sb.append(vertical);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal = this.horizontal;
            int hashCode = horizontal == null ? 0 : horizontal.hashCode();
            com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical = this.vertical;
            return (hashCode * 31) + (vertical != null ? vertical.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment.Alignment)) {
                return false;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment = (com.datadog.android.sessionreplay.model.MobileSegment.Alignment) other;
            return this.horizontal == alignment.horizontal && this.vertical == alignment.vertical;
        }

        public final com.datadog.android.sessionreplay.model.MobileSegment.Alignment copy(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal, com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(horizontal, vertical);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.Vertical getVertical() {
            return this.vertical;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Alignment fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Alignment fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.model.MobileSegment.Alignment copy$default(com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment, com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal, com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                horizontal = alignment.horizontal;
            }
            if ((i & 2) != 0) {
                vertical = alignment.vertical;
            }
            return alignment.copy(horizontal, vertical);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Alignment() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "FLUTTER", "REACT_NATIVE", "KOTLIN_MULTIPLATFORM"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Source {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Source.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Source.Companion(null);
        private final java.lang.String getHighSpeedVideoSizes;

        Source(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Source$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Source fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.Source source : com.datadog.android.sessionreplay.model.MobileSegment.Source.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(source.getHighSpeedVideoSizes, jsonString)) {
                        return source;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Source fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Companion", "DOWN", "UP", "MOVE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PointerEventType {
        DOWN(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN),
        UP(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP),
        MOVE("move");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.Companion(null);
        private final java.lang.String getHighSpeedVideoSizes;

        PointerEventType(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType pointerEventType : com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pointerEventType.getHighSpeedVideoSizes, jsonString)) {
                        return pointerEventType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "MOUSE", "TOUCH", "PEN"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PointerType {
        MOUSE("mouse"),
        TOUCH("touch"),
        PEN("pen");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.PointerType.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.PointerType.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        PointerType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.PointerType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.PointerType pointerType : com.datadog.android.sessionreplay.model.MobileSegment.PointerType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pointerType.Camera2StreamConfigurationMap, jsonString)) {
                        return pointerType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.PointerType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion", "CLIP", com.datadog.android.internal.network.HttpSpec.Method.HEAD, "TAIL", "MIDDLE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TruncationMode {
        CLIP("clip"),
        HEAD("head"),
        TAIL("tail"),
        MIDDLE(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        TruncationMode(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$TruncationMode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode : com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(truncationMode.getHighSpeedVideoFpsRanges, jsonString)) {
                        return truncationMode;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "LEFT", "RIGHT", "CENTER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Horizontal {
        LEFT(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT),
        RIGHT(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT),
        CENTER(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        Horizontal(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Horizontal;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal : com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(horizontal.Camera2StreamConfigurationMap, jsonString)) {
                        return horizontal;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Horizontal fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "TOP", "BOTTOM", "CENTER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Vertical {
        TOP(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP),
        BOTTOM(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM),
        CENTER(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Vertical.Companion INSTANCE = new com.datadog.android.sessionreplay.model.MobileSegment.Vertical.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        Vertical(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Vertical;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.sessionreplay.model.MobileSegment.Vertical fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical : com.datadog.android.sessionreplay.model.MobileSegment.Vertical.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(vertical.Camera2StreamConfigurationMap, jsonString)) {
                        return vertical;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.sessionreplay.model.MobileSegment.Vertical fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        com.datadog.android.sessionreplay.model.MobileSegment.Application application = this.application;
        com.datadog.android.sessionreplay.model.MobileSegment.Session session = this.session;
        com.datadog.android.sessionreplay.model.MobileSegment.View view = this.view;
        long j = this.start;
        long j2 = this.end;
        long j3 = this.recordsCount;
        java.lang.Long l = this.indexInView;
        java.lang.Boolean bool = this.hasFullSnapshot;
        com.datadog.android.sessionreplay.model.MobileSegment.Source source = this.source;
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list = this.records;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileSegment(application=");
        sb.append(application);
        sb.append(", session=");
        sb.append(session);
        sb.append(", view=");
        sb.append(view);
        sb.append(", start=");
        sb.append(j);
        sb.append(", end=");
        sb.append(j2);
        sb.append(", recordsCount=");
        sb.append(j3);
        sb.append(", indexInView=");
        sb.append(l);
        sb.append(", hasFullSnapshot=");
        sb.append(bool);
        sb.append(", source=");
        sb.append(source);
        sb.append(", records=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.application.hashCode();
        int hashCode2 = this.session.hashCode();
        int hashCode3 = this.view.hashCode();
        int hashCode4 = java.lang.Long.hashCode(this.start);
        int hashCode5 = java.lang.Long.hashCode(this.end);
        int hashCode6 = java.lang.Long.hashCode(this.recordsCount);
        java.lang.Long l = this.indexInView;
        int hashCode7 = l == null ? 0 : l.hashCode();
        java.lang.Boolean bool = this.hasFullSnapshot;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.source.hashCode()) * 31) + this.records.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.model.MobileSegment)) {
            return false;
        }
        com.datadog.android.sessionreplay.model.MobileSegment mobileSegment = (com.datadog.android.sessionreplay.model.MobileSegment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.application, mobileSegment.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, mobileSegment.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.view, mobileSegment.view) && this.start == mobileSegment.start && this.end == mobileSegment.end && this.recordsCount == mobileSegment.recordsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.indexInView, mobileSegment.indexInView) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasFullSnapshot, mobileSegment.hasFullSnapshot) && this.source == mobileSegment.source && kotlin.jvm.internal.Intrinsics.areEqual(this.records, mobileSegment.records);
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment copy(com.datadog.android.sessionreplay.model.MobileSegment.Application application, com.datadog.android.sessionreplay.model.MobileSegment.Session session, com.datadog.android.sessionreplay.model.MobileSegment.View view, long start, long end, long recordsCount, java.lang.Long indexInView, java.lang.Boolean hasFullSnapshot, com.datadog.android.sessionreplay.model.MobileSegment.Source source, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> records) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
        return new com.datadog.android.sessionreplay.model.MobileSegment(application, session, view, start, end, recordsCount, indexInView, hasFullSnapshot, source, records);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.sessionreplay.model.MobileSegment.Source getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Boolean getHasFullSnapshot() {
        return this.hasFullSnapshot;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Long getIndexInView() {
        return this.indexInView;
    }

    /* renamed from: component6, reason: from getter */
    public final long getRecordsCount() {
        return this.recordsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final com.datadog.android.sessionreplay.model.MobileSegment.View getView() {
        return this.view;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.sessionreplay.model.MobileSegment.Session getSession() {
        return this.session;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> component10() {
        return this.records;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.sessionreplay.model.MobileSegment.Application getApplication() {
        return this.application;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.MobileSegment fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.sessionreplay.model.MobileSegment fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
