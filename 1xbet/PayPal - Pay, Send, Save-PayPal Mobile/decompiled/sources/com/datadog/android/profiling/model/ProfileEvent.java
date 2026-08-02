package com.datadog.android.profiling.model;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u0000 P2\u00020\u0001:\u0007QPRSTUVB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u0096\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b:\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010*R\u001a\u0010\u0010\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010&R\u001a\u0010\u0013\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010\"R\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bH\u0010 R\u001a\u0010\u0016\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bI\u0010 R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010("}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent;", "", "Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "application", "Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "session", "Lcom/datadog/android/profiling/model/ProfileEvent$View;", "view", "Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "longTask", "Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "vital", "", "", "attachments", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lcom/datadog/android/profiling/model/ProfileEvent$Family;", "family", "runtime", "", "version", "tagsProfiler", "<init>", "(Lcom/datadog/android/profiling/model/ProfileEvent$Application;Lcom/datadog/android/profiling/model/ProfileEvent$Session;Lcom/datadog/android/profiling/model/ProfileEvent$View;Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;Lcom/datadog/android/profiling/model/ProfileEvent$Vital;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/profiling/model/ProfileEvent$Family;Lcom/datadog/android/profiling/model/ProfileEvent$Family;JLjava/lang/String;)V", "component1", "()Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "component10", "()Lcom/datadog/android/profiling/model/ProfileEvent$Family;", "component11", "()J", "component12", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "component3", "()Lcom/datadog/android/profiling/model/ProfileEvent$View;", "component4", "()Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "component5", "()Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "copy", "(Lcom/datadog/android/profiling/model/ProfileEvent$Application;Lcom/datadog/android/profiling/model/ProfileEvent$Session;Lcom/datadog/android/profiling/model/ProfileEvent$View;Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;Lcom/datadog/android/profiling/model/ProfileEvent$Vital;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/profiling/model/ProfileEvent$Family;Lcom/datadog/android/profiling/model/ProfileEvent$Family;JLjava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "getApplication", "Ljava/util/List;", "getAttachments", "Ljava/lang/String;", "getEnd", "Lcom/datadog/android/profiling/model/ProfileEvent$Family;", "getFamily", "Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "getLongTask", "getRuntime", "Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "getSession", "getStart", "getTagsProfiler", "J", "getVersion", "Lcom/datadog/android/profiling/model/ProfileEvent$View;", "getView", "Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "getVital", "Companion", "Application", "Family", "LongTask", "Session", "View", "Vital"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProfileEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.profiling.model.ProfileEvent.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.Companion(null);
    private final com.datadog.android.profiling.model.ProfileEvent.Application application;
    private final java.util.List<java.lang.String> attachments;
    private final java.lang.String end;
    private final com.datadog.android.profiling.model.ProfileEvent.Family family;
    private final com.datadog.android.profiling.model.ProfileEvent.LongTask longTask;
    private final com.datadog.android.profiling.model.ProfileEvent.Family runtime;
    private final com.datadog.android.profiling.model.ProfileEvent.Session session;
    private final java.lang.String start;
    private final java.lang.String tagsProfiler;
    private final long version;
    private final com.datadog.android.profiling.model.ProfileEvent.View view;
    private final com.datadog.android.profiling.model.ProfileEvent.Vital vital;

    public ProfileEvent(com.datadog.android.profiling.model.ProfileEvent.Application application, com.datadog.android.profiling.model.ProfileEvent.Session session, com.datadog.android.profiling.model.ProfileEvent.View view, com.datadog.android.profiling.model.ProfileEvent.LongTask longTask, com.datadog.android.profiling.model.ProfileEvent.Vital vital, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, com.datadog.android.profiling.model.ProfileEvent.Family family, com.datadog.android.profiling.model.ProfileEvent.Family family2, long j, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(family, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(family2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.application = application;
        this.session = session;
        this.view = view;
        this.longTask = longTask;
        this.vital = vital;
        this.attachments = list;
        this.start = str;
        this.end = str2;
        this.family = family;
        this.runtime = family2;
        this.version = j;
        this.tagsProfiler = str3;
    }

    public /* synthetic */ ProfileEvent(com.datadog.android.profiling.model.ProfileEvent.Application application, com.datadog.android.profiling.model.ProfileEvent.Session session, com.datadog.android.profiling.model.ProfileEvent.View view, com.datadog.android.profiling.model.ProfileEvent.LongTask longTask, com.datadog.android.profiling.model.ProfileEvent.Vital vital, java.util.List list, java.lang.String str, java.lang.String str2, com.datadog.android.profiling.model.ProfileEvent.Family family, com.datadog.android.profiling.model.ProfileEvent.Family family2, long j, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i & 2) != 0 ? null : session, (i & 4) != 0 ? null : view, (i & 8) != 0 ? null : longTask, (i & 16) != 0 ? null : vital, list, str, str2, family, family2, j, str3);
    }

    public final com.datadog.android.profiling.model.ProfileEvent.Application getApplication() {
        return this.application;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.Session getSession() {
        return this.session;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.View getView() {
        return this.view;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.LongTask getLongTask() {
        return this.longTask;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.Vital getVital() {
        return this.vital;
    }

    public final java.util.List<java.lang.String> getAttachments() {
        return this.attachments;
    }

    public final java.lang.String getStart() {
        return this.start;
    }

    public final java.lang.String getEnd() {
        return this.end;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.Family getFamily() {
        return this.family;
    }

    public final com.datadog.android.profiling.model.ProfileEvent.Family getRuntime() {
        return this.runtime;
    }

    public final long getVersion() {
        return this.version;
    }

    public final java.lang.String getTagsProfiler() {
        return this.tagsProfiler;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add("application", this.application.toJson());
        com.datadog.android.profiling.model.ProfileEvent.Session session = this.session;
        if (session != null) {
            jsonObject.add("session", session.toJson());
        }
        com.datadog.android.profiling.model.ProfileEvent.View view = this.view;
        if (view != null) {
            jsonObject.add("view", view.toJson());
        }
        com.datadog.android.profiling.model.ProfileEvent.LongTask longTask = this.longTask;
        if (longTask != null) {
            jsonObject.add(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.EVENT_TYPE_LONG_TASK, longTask.toJson());
        }
        com.datadog.android.profiling.model.ProfileEvent.Vital vital = this.vital;
        if (vital != null) {
            jsonObject.add("vital", vital.toJson());
        }
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.attachments.size());
        java.util.Iterator<T> it = this.attachments.iterator();
        while (it.hasNext()) {
            jsonArray.add((java.lang.String) it.next());
        }
        jsonObject.add("attachments", jsonArray);
        jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, this.start);
        jsonObject.addProperty("end", this.end);
        jsonObject.add("family", this.family.toJson());
        jsonObject.add("runtime", this.runtime.toJson());
        jsonObject.addProperty("version", java.lang.Long.valueOf(this.version));
        jsonObject.addProperty("tags_profiler", this.tagsProfiler);
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.profiling.model.ProfileEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ProfileEvent", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.profiling.model.ProfileEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            com.google.gson.JsonObject asJsonObject;
            com.google.gson.JsonObject asJsonObject2;
            com.google.gson.JsonObject asJsonObject3;
            com.google.gson.JsonObject asJsonObject4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                com.google.gson.JsonObject asJsonObject5 = jsonObject.get("application").getAsJsonObject();
                com.datadog.android.profiling.model.ProfileEvent.Application.Companion companion = com.datadog.android.profiling.model.ProfileEvent.Application.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject5, "");
                com.datadog.android.profiling.model.ProfileEvent.Application fromJsonObject = companion.fromJsonObject(asJsonObject5);
                com.google.gson.JsonElement jsonElement = jsonObject.get("session");
                com.datadog.android.profiling.model.ProfileEvent.Session fromJsonObject2 = (jsonElement == null || (asJsonObject4 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.profiling.model.ProfileEvent.Session.INSTANCE.fromJsonObject(asJsonObject4);
                com.google.gson.JsonElement jsonElement2 = jsonObject.get("view");
                com.datadog.android.profiling.model.ProfileEvent.View fromJsonObject3 = (jsonElement2 == null || (asJsonObject3 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.profiling.model.ProfileEvent.View.INSTANCE.fromJsonObject(asJsonObject3);
                com.google.gson.JsonElement jsonElement3 = jsonObject.get(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.EVENT_TYPE_LONG_TASK);
                com.datadog.android.profiling.model.ProfileEvent.LongTask fromJsonObject4 = (jsonElement3 == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.profiling.model.ProfileEvent.LongTask.INSTANCE.fromJsonObject(asJsonObject2);
                com.google.gson.JsonElement jsonElement4 = jsonObject.get("vital");
                com.datadog.android.profiling.model.ProfileEvent.Vital fromJsonObject5 = (jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null) ? null : com.datadog.android.profiling.model.ProfileEvent.Vital.INSTANCE.fromJsonObject(asJsonObject);
                com.google.gson.JsonArray asJsonArray = jsonObject.get("attachments").getAsJsonArray();
                java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAsString());
                }
                java.lang.String asString = jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsString();
                java.lang.String asString2 = jsonObject.get("end").getAsString();
                com.datadog.android.profiling.model.ProfileEvent.Family.Companion companion2 = com.datadog.android.profiling.model.ProfileEvent.Family.INSTANCE;
                java.lang.String asString3 = jsonObject.get("family").getAsString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                com.datadog.android.profiling.model.ProfileEvent.Family fromJson = companion2.fromJson(asString3);
                com.datadog.android.profiling.model.ProfileEvent.Family.Companion companion3 = com.datadog.android.profiling.model.ProfileEvent.Family.INSTANCE;
                java.lang.String asString4 = jsonObject.get("runtime").getAsString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                com.datadog.android.profiling.model.ProfileEvent.Family fromJson2 = companion3.fromJson(asString4);
                long asLong = jsonObject.get("version").getAsLong();
                java.lang.String asString5 = jsonObject.get("tags_profiler").getAsString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString5, "");
                return new com.datadog.android.profiling.model.ProfileEvent(fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, arrayList, asString, asString2, fromJson, fromJson2, asLong, asString5);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ProfileEvent", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ProfileEvent", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ProfileEvent", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.Application.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.Application.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.profiling.model.ProfileEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.profiling.model.ProfileEvent.Application(asString);
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
            return (other instanceof com.datadog.android.profiling.model.ProfileEvent.Application) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.profiling.model.ProfileEvent.Application) other).id);
        }

        public final com.datadog.android.profiling.model.ProfileEvent.Application copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.profiling.model.ProfileEvent.Application(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.profiling.model.ProfileEvent.Application copy$default(com.datadog.android.profiling.model.ProfileEvent.Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Session {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.Session.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.Session.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Session;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent$Session;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.Session fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.profiling.model.ProfileEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.profiling.model.ProfileEvent.Session(asString);
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
            return (other instanceof com.datadog.android.profiling.model.ProfileEvent.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.profiling.model.ProfileEvent.Session) other).id);
        }

        public final com.datadog.android.profiling.model.ProfileEvent.Session copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.profiling.model.ProfileEvent.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Session fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.profiling.model.ProfileEvent.Session copy$default(com.datadog.android.profiling.model.ProfileEvent.Session session, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$View;", "", "", "", "id", "name", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/profiling/model/ProfileEvent$View;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class View {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.View.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.View.Companion(null);
        private final java.util.List<java.lang.String> id;
        private final java.util.List<java.lang.String> name;

        public View(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.id = list;
            this.name = list2;
        }

        public final java.util.List<java.lang.String> getId() {
            return this.id;
        }

        public final java.util.List<java.lang.String> getName() {
            return this.name;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.id.size());
            java.util.Iterator<T> it = this.id.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("id", jsonArray);
            com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray(this.name.size());
            java.util.Iterator<T> it2 = this.name.iterator();
            while (it2.hasNext()) {
                jsonArray2.add((java.lang.String) it2.next());
            }
            jsonObject.add("name", jsonArray2);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$View;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.View fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.profiling.model.ProfileEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonArray asJsonArray = jsonObject.get("id").getAsJsonArray();
                    java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    com.google.gson.JsonArray asJsonArray2 = jsonObject.get("name").getAsJsonArray();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(asJsonArray2.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray2, "");
                    java.util.Iterator<com.google.gson.JsonElement> it2 = asJsonArray2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getAsString());
                    }
                    return new com.datadog.android.profiling.model.ProfileEvent.View(arrayList, arrayList2);
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
            java.util.List<java.lang.String> list = this.id;
            java.util.List<java.lang.String> list2 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View(id=");
            sb.append(list);
            sb.append(", name=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.profiling.model.ProfileEvent.View)) {
                return false;
            }
            com.datadog.android.profiling.model.ProfileEvent.View view = (com.datadog.android.profiling.model.ProfileEvent.View) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, view.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, view.name);
        }

        public final com.datadog.android.profiling.model.ProfileEvent.View copy(java.util.List<java.lang.String> id, java.util.List<java.lang.String> name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.datadog.android.profiling.model.ProfileEvent.View(id, name2);
        }

        public final java.util.List<java.lang.String> component2() {
            return this.name;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.View fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.profiling.model.ProfileEvent.View copy$default(com.datadog.android.profiling.model.ProfileEvent.View view, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = view.id;
            }
            if ((i & 2) != 0) {
                list2 = view.name;
            }
            return view.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "", "", "", "id", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTask {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.LongTask.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.LongTask.Companion(null);
        private final java.util.List<java.lang.String> id;

        public LongTask(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = list;
        }

        public final java.util.List<java.lang.String> getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.id.size());
            java.util.Iterator<T> it = this.id.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("id", jsonArray);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$LongTask$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent$LongTask;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.LongTask fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.LongTask fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonArray asJsonArray = jsonObject.get("id").getAsJsonArray();
                    java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    return new com.datadog.android.profiling.model.ProfileEvent.LongTask(arrayList);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LongTask(id=");
            sb.append(list);
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
            return (other instanceof com.datadog.android.profiling.model.ProfileEvent.LongTask) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.profiling.model.ProfileEvent.LongTask) other).id);
        }

        public final com.datadog.android.profiling.model.ProfileEvent.LongTask copy(java.util.List<java.lang.String> id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.profiling.model.ProfileEvent.LongTask(id);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.LongTask fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.LongTask fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.profiling.model.ProfileEvent.LongTask copy$default(com.datadog.android.profiling.model.ProfileEvent.LongTask longTask, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = longTask.id;
            }
            return longTask.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "", "", "", "id", "label", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getId", "getLabel", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Vital {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.Vital.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.Vital.Companion(null);
        private final java.util.List<java.lang.String> id;
        private final java.util.List<java.lang.String> label;

        public Vital(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.id = list;
            this.label = list2;
        }

        public final java.util.List<java.lang.String> getId() {
            return this.id;
        }

        public final java.util.List<java.lang.String> getLabel() {
            return this.label;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.id.size());
            java.util.Iterator<T> it = this.id.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("id", jsonArray);
            com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray(this.label.size());
            java.util.Iterator<T> it2 = this.label.iterator();
            while (it2.hasNext()) {
                jsonArray2.add((java.lang.String) it2.next());
            }
            jsonObject.add("label", jsonArray2);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Vital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Vital;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/profiling/model/ProfileEvent$Vital;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.Vital fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.Vital fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonArray asJsonArray = jsonObject.get("id").getAsJsonArray();
                    java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    com.google.gson.JsonArray asJsonArray2 = jsonObject.get("label").getAsJsonArray();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(asJsonArray2.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray2, "");
                    java.util.Iterator<com.google.gson.JsonElement> it2 = asJsonArray2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getAsString());
                    }
                    return new com.datadog.android.profiling.model.ProfileEvent.Vital(arrayList, arrayList2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.id;
            java.util.List<java.lang.String> list2 = this.label;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vital(id=");
            sb.append(list);
            sb.append(", label=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.label.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.profiling.model.ProfileEvent.Vital)) {
                return false;
            }
            com.datadog.android.profiling.model.ProfileEvent.Vital vital = (com.datadog.android.profiling.model.ProfileEvent.Vital) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, vital.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, vital.label);
        }

        public final com.datadog.android.profiling.model.ProfileEvent.Vital copy(java.util.List<java.lang.String> id, java.util.List<java.lang.String> label) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            return new com.datadog.android.profiling.model.ProfileEvent.Vital(id, label);
        }

        public final java.util.List<java.lang.String> component2() {
            return this.label;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Vital fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Vital fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.profiling.model.ProfileEvent.Vital copy$default(com.datadog.android.profiling.model.ProfileEvent.Vital vital, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = vital.id;
            }
            if ((i & 2) != 0) {
                list2 = vital.label;
            }
            return vital.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Family;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Companion", "ANDROID", "CHROME", "IOS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Family {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        CHROME("chrome"),
        IOS("ios");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.profiling.model.ProfileEvent.Family.Companion INSTANCE = new com.datadog.android.profiling.model.ProfileEvent.Family.Companion(null);
        private final java.lang.String getHighSpeedVideoFpsRanges;

        Family(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/profiling/model/ProfileEvent$Family$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/profiling/model/ProfileEvent$Family;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/profiling/model/ProfileEvent$Family;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.profiling.model.ProfileEvent.Family fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.profiling.model.ProfileEvent.Family family : com.datadog.android.profiling.model.ProfileEvent.Family.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(family.getHighSpeedVideoFpsRanges, jsonString)) {
                        return family;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.profiling.model.ProfileEvent.Family fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        com.datadog.android.profiling.model.ProfileEvent.Application application = this.application;
        com.datadog.android.profiling.model.ProfileEvent.Session session = this.session;
        com.datadog.android.profiling.model.ProfileEvent.View view = this.view;
        com.datadog.android.profiling.model.ProfileEvent.LongTask longTask = this.longTask;
        com.datadog.android.profiling.model.ProfileEvent.Vital vital = this.vital;
        java.util.List<java.lang.String> list = this.attachments;
        java.lang.String str = this.start;
        java.lang.String str2 = this.end;
        com.datadog.android.profiling.model.ProfileEvent.Family family = this.family;
        com.datadog.android.profiling.model.ProfileEvent.Family family2 = this.runtime;
        long j = this.version;
        java.lang.String str3 = this.tagsProfiler;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileEvent(application=");
        sb.append(application);
        sb.append(", session=");
        sb.append(session);
        sb.append(", view=");
        sb.append(view);
        sb.append(", longTask=");
        sb.append(longTask);
        sb.append(", vital=");
        sb.append(vital);
        sb.append(", attachments=");
        sb.append(list);
        sb.append(", start=");
        sb.append(str);
        sb.append(", end=");
        sb.append(str2);
        sb.append(", family=");
        sb.append(family);
        sb.append(", runtime=");
        sb.append(family2);
        sb.append(", version=");
        sb.append(j);
        sb.append(", tagsProfiler=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.application.hashCode();
        com.datadog.android.profiling.model.ProfileEvent.Session session = this.session;
        int hashCode2 = session == null ? 0 : session.hashCode();
        com.datadog.android.profiling.model.ProfileEvent.View view = this.view;
        int hashCode3 = view == null ? 0 : view.hashCode();
        com.datadog.android.profiling.model.ProfileEvent.LongTask longTask = this.longTask;
        int hashCode4 = longTask == null ? 0 : longTask.hashCode();
        com.datadog.android.profiling.model.ProfileEvent.Vital vital = this.vital;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (vital != null ? vital.hashCode() : 0)) * 31) + this.attachments.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + this.family.hashCode()) * 31) + this.runtime.hashCode()) * 31) + java.lang.Long.hashCode(this.version)) * 31) + this.tagsProfiler.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.profiling.model.ProfileEvent)) {
            return false;
        }
        com.datadog.android.profiling.model.ProfileEvent profileEvent = (com.datadog.android.profiling.model.ProfileEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.application, profileEvent.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, profileEvent.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.view, profileEvent.view) && kotlin.jvm.internal.Intrinsics.areEqual(this.longTask, profileEvent.longTask) && kotlin.jvm.internal.Intrinsics.areEqual(this.vital, profileEvent.vital) && kotlin.jvm.internal.Intrinsics.areEqual(this.attachments, profileEvent.attachments) && kotlin.jvm.internal.Intrinsics.areEqual(this.start, profileEvent.start) && kotlin.jvm.internal.Intrinsics.areEqual(this.end, profileEvent.end) && this.family == profileEvent.family && this.runtime == profileEvent.runtime && this.version == profileEvent.version && kotlin.jvm.internal.Intrinsics.areEqual(this.tagsProfiler, profileEvent.tagsProfiler);
    }

    public final com.datadog.android.profiling.model.ProfileEvent copy(com.datadog.android.profiling.model.ProfileEvent.Application application, com.datadog.android.profiling.model.ProfileEvent.Session session, com.datadog.android.profiling.model.ProfileEvent.View view, com.datadog.android.profiling.model.ProfileEvent.LongTask longTask, com.datadog.android.profiling.model.ProfileEvent.Vital vital, java.util.List<java.lang.String> attachments, java.lang.String start, java.lang.String end, com.datadog.android.profiling.model.ProfileEvent.Family family, com.datadog.android.profiling.model.ProfileEvent.Family runtime, long version, java.lang.String tagsProfiler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(family, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tagsProfiler, "");
        return new com.datadog.android.profiling.model.ProfileEvent(application, session, view, longTask, vital, attachments, start, end, family, runtime, version, tagsProfiler);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.Family getFamily() {
        return this.family;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getEnd() {
        return this.end;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getStart() {
        return this.start;
    }

    public final java.util.List<java.lang.String> component6() {
        return this.attachments;
    }

    /* renamed from: component5, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.Vital getVital() {
        return this.vital;
    }

    /* renamed from: component4, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.LongTask getLongTask() {
        return this.longTask;
    }

    /* renamed from: component3, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.View getView() {
        return this.view;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.Session getSession() {
        return this.session;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getTagsProfiler() {
        return this.tagsProfiler;
    }

    /* renamed from: component11, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.Family getRuntime() {
        return this.runtime;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.profiling.model.ProfileEvent.Application getApplication() {
        return this.application;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.profiling.model.ProfileEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.profiling.model.ProfileEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
