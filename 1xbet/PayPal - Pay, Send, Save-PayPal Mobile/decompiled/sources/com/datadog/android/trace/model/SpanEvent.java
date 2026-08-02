package com.datadog.android.trace.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0011DEFCGHIJKLMNOPQRSBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b1\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b:\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u00109R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b=\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b>\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b?\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u0010\u0014"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent;", "", "", "traceId", "spanId", "parentId", "resource", "name", "service", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "error", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "Lcom/datadog/android/trace/model/SpanEvent$Meta;", com.adjust.sdk.Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/datadog/android/trace/model/SpanEvent$Metrics;Lcom/datadog/android/trace/model/SpanEvent$Meta;)V", "component1", "()Ljava/lang/String;", "component10", "()Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "component11", "()Lcom/datadog/android/trace/model/SpanEvent$Meta;", "component2", "component3", "component4", "component5", "component6", "component7", "()J", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/datadog/android/trace/model/SpanEvent$Metrics;Lcom/datadog/android/trace/model/SpanEvent$Meta;)Lcom/datadog/android/trace/model/SpanEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "J", "getDuration", "getError", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "getMeta", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "getMetrics", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getParentId", "getResource", "setResource", "getService", "getSpanId", "getStart", "getTraceId", "type", "getType", "Companion", "Account", "Application", "Client", "Dd", "Device", "Meta", "Metrics", "Network", "Os", "Session", "SimCarrier", "Span", "Tracer", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Usr", "View"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SpanEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.model.SpanEvent.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Companion(null);
    private final long duration;
    private final long error;
    private final com.datadog.android.trace.model.SpanEvent.Meta meta;
    private final com.datadog.android.trace.model.SpanEvent.Metrics metrics;
    private java.lang.String name;
    private final java.lang.String parentId;
    private java.lang.String resource;
    private final java.lang.String service;
    private final java.lang.String spanId;
    private final long start;
    private final java.lang.String traceId;
    private final java.lang.String type;

    public SpanEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j, long j2, long j3, com.datadog.android.trace.model.SpanEvent.Metrics metrics, com.datadog.android.trace.model.SpanEvent.Meta meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "");
        this.traceId = str;
        this.spanId = str2;
        this.parentId = str3;
        this.resource = str4;
        this.name = str5;
        this.service = str6;
        this.duration = j;
        this.start = j2;
        this.error = j3;
        this.metrics = metrics;
        this.meta = meta;
        this.type = io.reactivex.annotations.SchedulerSupport.CUSTOM;
    }

    public /* synthetic */ SpanEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j, long j2, long j3, com.datadog.android.trace.model.SpanEvent.Metrics metrics, com.datadog.android.trace.model.SpanEvent.Meta meta, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, j, j2, (i & 256) != 0 ? 0L : j3, metrics, meta);
    }

    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    public final java.lang.String getSpanId() {
        return this.spanId;
    }

    public final java.lang.String getParentId() {
        return this.parentId;
    }

    public final java.lang.String getResource() {
        return this.resource;
    }

    public final void setResource(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.resource = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    public final java.lang.String getService() {
        return this.service;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getError() {
        return this.error;
    }

    public final com.datadog.android.trace.model.SpanEvent.Metrics getMetrics() {
        return this.metrics;
    }

    public final com.datadog.android.trace.model.SpanEvent.Meta getMeta() {
        return this.meta;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("trace_id", this.traceId);
        jsonObject.addProperty("span_id", this.spanId);
        jsonObject.addProperty("parent_id", this.parentId);
        jsonObject.addProperty("resource", this.resource);
        jsonObject.addProperty("name", this.name);
        jsonObject.addProperty("service", this.service);
        jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
        jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
        jsonObject.addProperty("error", java.lang.Long.valueOf(this.error));
        jsonObject.addProperty("type", this.type);
        jsonObject.add(com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, this.metrics.toJson());
        jsonObject.add(com.adjust.sdk.Constants.REFERRER_API_META, this.meta.toJson());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.trace.model.SpanEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type SpanEvent", e);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @kotlin.jvm.JvmStatic
        public final com.datadog.android.trace.model.SpanEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                java.lang.String asString = jsonObject.get("trace_id").getAsString();
                java.lang.String asString2 = jsonObject.get("span_id").getAsString();
                java.lang.String asString3 = jsonObject.get("parent_id").getAsString();
                java.lang.String asString4 = jsonObject.get("resource").getAsString();
                java.lang.String asString5 = jsonObject.get("name").getAsString();
                java.lang.String asString6 = jsonObject.get("service").getAsString();
                long asLong = jsonObject.get("duration").getAsLong();
                long asLong2 = jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong();
                long asLong3 = jsonObject.get("error").getAsLong();
                java.lang.String asString7 = jsonObject.get("type").getAsString();
                com.google.gson.JsonObject asJsonObject = jsonObject.get(com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX).getAsJsonObject();
                str = "Unable to parse json into type SpanEvent";
                try {
                    com.datadog.android.trace.model.SpanEvent.Metrics.Companion companion = com.datadog.android.trace.model.SpanEvent.Metrics.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    com.datadog.android.trace.model.SpanEvent.Metrics fromJsonObject = companion.fromJsonObject(asJsonObject);
                    com.google.gson.JsonObject asJsonObject2 = jsonObject.get(com.adjust.sdk.Constants.REFERRER_API_META).getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Meta.Companion companion2 = com.datadog.android.trace.model.SpanEvent.Meta.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
                    com.datadog.android.trace.model.SpanEvent.Meta fromJsonObject2 = companion2.fromJsonObject(asJsonObject2);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString7, io.reactivex.annotations.SchedulerSupport.CUSTOM)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString5, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString6, "");
                    return new com.datadog.android.trace.model.SpanEvent(asString, asString2, asString3, asString4, asString5, asString6, asLong, asLong2, asLong3, fromJsonObject, fromJsonObject2);
                } catch (java.lang.IllegalStateException e) {
                    e = e;
                    throw new com.google.gson.JsonParseException(str, e);
                } catch (java.lang.NullPointerException e2) {
                    e = e2;
                    throw new com.google.gson.JsonParseException(str, e);
                } catch (java.lang.NumberFormatException e3) {
                    e = e3;
                    throw new com.google.gson.JsonParseException(str, e);
                }
            } catch (java.lang.IllegalStateException e4) {
                e = e4;
                str = "Unable to parse json into type SpanEvent";
            } catch (java.lang.NullPointerException e5) {
                e = e5;
                str = "Unable to parse json into type SpanEvent";
            } catch (java.lang.NumberFormatException e6) {
                e = e6;
                str = "Unable to parse json into type SpanEvent";
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "", "", "topLevel", "", "", "", "additionalProperties", "<init>", "(Ljava/lang/Long;Ljava/util/Map;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/Long;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/Long;", "getTopLevel", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Metrics {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Metrics.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Metrics.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"_top_level"};
        private final java.util.Map<java.lang.String, java.lang.Number> additionalProperties;
        private final java.lang.Long topLevel;

        /* JADX WARN: Multi-variable type inference failed */
        public Metrics(java.lang.Long l, java.util.Map<java.lang.String, ? extends java.lang.Number> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.topLevel = l;
            this.additionalProperties = map;
        }

        public final java.lang.Long getTopLevel() {
            return this.topLevel;
        }

        public /* synthetic */ Metrics(java.lang.Long l, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Number> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.topLevel;
            if (l != null) {
                jsonObject.addProperty("_top_level", java.lang.Long.valueOf(l.longValue()));
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Number> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Number value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.addProperty(key, value);
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Metrics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return com.datadog.android.trace.model.SpanEvent.Metrics.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Metrics fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Metrics", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Metrics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("_top_level");
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_trace_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            java.lang.Number asNumber = entry.getValue().getAsNumber();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                            linkedHashMap.put(key, asNumber);
                        }
                    }
                    return new com.datadog.android.trace.model.SpanEvent.Metrics(valueOf, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Metrics", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Metrics", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Metrics", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.topLevel;
            java.util.Map<java.lang.String, java.lang.Number> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metrics(topLevel=");
            sb.append(l);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.topLevel;
            return ((l == null ? 0 : l.hashCode()) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Metrics)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Metrics metrics = (com.datadog.android.trace.model.SpanEvent.Metrics) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.topLevel, metrics.topLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, metrics.additionalProperties);
        }

        public final com.datadog.android.trace.model.SpanEvent.Metrics copy(java.lang.Long topLevel, java.util.Map<java.lang.String, ? extends java.lang.Number> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.trace.model.SpanEvent.Metrics(topLevel, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Number> component2() {
            return this.additionalProperties;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getTopLevel() {
            return this.topLevel;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Metrics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Metrics fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Metrics copy$default(com.datadog.android.trace.model.SpanEvent.Metrics metrics, java.lang.Long l, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = metrics.topLevel;
            }
            if ((i & 2) != 0) {
                map = metrics.additionalProperties;
            }
            return metrics.copy(l, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Metrics() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u0000 M2\u00020\u0001:\u0001MBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0084\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010%R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010'R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010\u0019"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Meta;", "", "", "version", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "dd", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "span", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "tracer", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "usr", "Lcom/datadog/android/trace/model/SpanEvent$Account;", "account", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "network", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "device", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "os", "", "additionalProperties", "<init>", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Dd;Lcom/datadog/android/trace/model/SpanEvent$Span;Lcom/datadog/android/trace/model/SpanEvent$Tracer;Lcom/datadog/android/trace/model/SpanEvent$Usr;Lcom/datadog/android/trace/model/SpanEvent$Account;Lcom/datadog/android/trace/model/SpanEvent$Network;Lcom/datadog/android/trace/model/SpanEvent$Device;Lcom/datadog/android/trace/model/SpanEvent$Os;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/util/Map;", "component2", "()Lcom/datadog/android/trace/model/SpanEvent$Dd;", "component3", "()Lcom/datadog/android/trace/model/SpanEvent$Span;", "component4", "()Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "component5", "()Lcom/datadog/android/trace/model/SpanEvent$Usr;", "component6", "()Lcom/datadog/android/trace/model/SpanEvent$Account;", "component7", "()Lcom/datadog/android/trace/model/SpanEvent$Network;", "component8", "()Lcom/datadog/android/trace/model/SpanEvent$Device;", "component9", "()Lcom/datadog/android/trace/model/SpanEvent$Os;", "copy", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Dd;Lcom/datadog/android/trace/model/SpanEvent$Span;Lcom/datadog/android/trace/model/SpanEvent$Tracer;Lcom/datadog/android/trace/model/SpanEvent$Usr;Lcom/datadog/android/trace/model/SpanEvent$Account;Lcom/datadog/android/trace/model/SpanEvent$Network;Lcom/datadog/android/trace/model/SpanEvent$Device;Lcom/datadog/android/trace/model/SpanEvent$Os;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/trace/model/SpanEvent$Account;", "getAccount", "Ljava/util/Map;", "getAdditionalProperties", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "getDd", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "getDevice", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "getNetwork", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "getOs", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "getSpan", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "getTracer", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "getUsr", "Ljava/lang/String;", "getVersion", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Meta {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Meta.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Meta.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"version", "_dd", "span", "tracer", "usr", "account", "network", "device", "os"};
        private final com.datadog.android.trace.model.SpanEvent.Account account;
        private final java.util.Map<java.lang.String, java.lang.String> additionalProperties;
        private final com.datadog.android.trace.model.SpanEvent.Dd dd;
        private final com.datadog.android.trace.model.SpanEvent.Device device;
        private final com.datadog.android.trace.model.SpanEvent.Network network;
        private final com.datadog.android.trace.model.SpanEvent.Os os;
        private final com.datadog.android.trace.model.SpanEvent.Span span;
        private final com.datadog.android.trace.model.SpanEvent.Tracer tracer;
        private final com.datadog.android.trace.model.SpanEvent.Usr usr;
        private final java.lang.String version;

        public Meta(java.lang.String str, com.datadog.android.trace.model.SpanEvent.Dd dd, com.datadog.android.trace.model.SpanEvent.Span span, com.datadog.android.trace.model.SpanEvent.Tracer tracer, com.datadog.android.trace.model.SpanEvent.Usr usr, com.datadog.android.trace.model.SpanEvent.Account account, com.datadog.android.trace.model.SpanEvent.Network network, com.datadog.android.trace.model.SpanEvent.Device device, com.datadog.android.trace.model.SpanEvent.Os os, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.version = str;
            this.dd = dd;
            this.span = span;
            this.tracer = tracer;
            this.usr = usr;
            this.account = account;
            this.network = network;
            this.device = device;
            this.os = os;
            this.additionalProperties = map;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final com.datadog.android.trace.model.SpanEvent.Dd getDd() {
            return this.dd;
        }

        public final com.datadog.android.trace.model.SpanEvent.Span getSpan() {
            return this.span;
        }

        public final com.datadog.android.trace.model.SpanEvent.Tracer getTracer() {
            return this.tracer;
        }

        public final com.datadog.android.trace.model.SpanEvent.Usr getUsr() {
            return this.usr;
        }

        public final com.datadog.android.trace.model.SpanEvent.Account getAccount() {
            return this.account;
        }

        public final com.datadog.android.trace.model.SpanEvent.Network getNetwork() {
            return this.network;
        }

        public final com.datadog.android.trace.model.SpanEvent.Device getDevice() {
            return this.device;
        }

        public final com.datadog.android.trace.model.SpanEvent.Os getOs() {
            return this.os;
        }

        public /* synthetic */ Meta(java.lang.String str, com.datadog.android.trace.model.SpanEvent.Dd dd, com.datadog.android.trace.model.SpanEvent.Span span, com.datadog.android.trace.model.SpanEvent.Tracer tracer, com.datadog.android.trace.model.SpanEvent.Usr usr, com.datadog.android.trace.model.SpanEvent.Account account, com.datadog.android.trace.model.SpanEvent.Network network, com.datadog.android.trace.model.SpanEvent.Device device, com.datadog.android.trace.model.SpanEvent.Os os, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dd, span, tracer, usr, (i & 32) != 0 ? null : account, (i & 64) != 0 ? null : network, device, os, (i & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("version", this.version);
            jsonObject.add("_dd", this.dd.toJson());
            jsonObject.add("span", this.span.toJson());
            jsonObject.add("tracer", this.tracer.toJson());
            jsonObject.add("usr", this.usr.toJson());
            com.datadog.android.trace.model.SpanEvent.Account account = this.account;
            if (account != null) {
                jsonObject.add("account", account.toJson());
            }
            com.datadog.android.trace.model.SpanEvent.Network network = this.network;
            if (network != null) {
                jsonObject.add("network", network.toJson());
            }
            jsonObject.add("device", this.device.toJson());
            jsonObject.add("os", this.os.toJson());
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.addProperty(key, value);
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Meta$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return com.datadog.android.trace.model.SpanEvent.Meta.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Meta fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Meta", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Meta fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("version").getAsString();
                    com.google.gson.JsonObject asJsonObject3 = jsonObject.get("_dd").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Dd.Companion companion = com.datadog.android.trace.model.SpanEvent.Dd.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
                    com.datadog.android.trace.model.SpanEvent.Dd fromJsonObject = companion.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonObject asJsonObject4 = jsonObject.get("span").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Span.Companion companion2 = com.datadog.android.trace.model.SpanEvent.Span.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                    com.datadog.android.trace.model.SpanEvent.Span fromJsonObject2 = companion2.fromJsonObject(asJsonObject4);
                    com.google.gson.JsonObject asJsonObject5 = jsonObject.get("tracer").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Tracer.Companion companion3 = com.datadog.android.trace.model.SpanEvent.Tracer.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject5, "");
                    com.datadog.android.trace.model.SpanEvent.Tracer fromJsonObject3 = companion3.fromJsonObject(asJsonObject5);
                    com.google.gson.JsonObject asJsonObject6 = jsonObject.get("usr").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Usr.Companion companion4 = com.datadog.android.trace.model.SpanEvent.Usr.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
                    com.datadog.android.trace.model.SpanEvent.Usr fromJsonObject4 = companion4.fromJsonObject(asJsonObject6);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("account");
                    com.datadog.android.trace.model.SpanEvent.Account fromJsonObject5 = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Account.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("network");
                    com.datadog.android.trace.model.SpanEvent.Network fromJsonObject6 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Network.INSTANCE.fromJsonObject(asJsonObject);
                    com.google.gson.JsonObject asJsonObject7 = jsonObject.get("device").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Device.Companion companion5 = com.datadog.android.trace.model.SpanEvent.Device.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject7, "");
                    com.datadog.android.trace.model.SpanEvent.Device fromJsonObject7 = companion5.fromJsonObject(asJsonObject7);
                    com.google.gson.JsonObject asJsonObject8 = jsonObject.get("os").getAsJsonObject();
                    com.datadog.android.trace.model.SpanEvent.Os.Companion companion6 = com.datadog.android.trace.model.SpanEvent.Os.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject8, "");
                    com.datadog.android.trace.model.SpanEvent.Os fromJsonObject8 = companion6.fromJsonObject(asJsonObject8);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_trace_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            java.lang.String asString2 = entry.getValue().getAsString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                            linkedHashMap.put(key, asString2);
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.trace.model.SpanEvent.Meta(asString, fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Meta", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Meta", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Meta", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            com.datadog.android.trace.model.SpanEvent.Dd dd = this.dd;
            com.datadog.android.trace.model.SpanEvent.Span span = this.span;
            com.datadog.android.trace.model.SpanEvent.Tracer tracer = this.tracer;
            com.datadog.android.trace.model.SpanEvent.Usr usr = this.usr;
            com.datadog.android.trace.model.SpanEvent.Account account = this.account;
            com.datadog.android.trace.model.SpanEvent.Network network = this.network;
            com.datadog.android.trace.model.SpanEvent.Device device = this.device;
            com.datadog.android.trace.model.SpanEvent.Os os = this.os;
            java.util.Map<java.lang.String, java.lang.String> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Meta(version=");
            sb.append(str);
            sb.append(", dd=");
            sb.append(dd);
            sb.append(", span=");
            sb.append(span);
            sb.append(", tracer=");
            sb.append(tracer);
            sb.append(", usr=");
            sb.append(usr);
            sb.append(", account=");
            sb.append(account);
            sb.append(", network=");
            sb.append(network);
            sb.append(", device=");
            sb.append(device);
            sb.append(", os=");
            sb.append(os);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            int hashCode2 = this.dd.hashCode();
            int hashCode3 = this.span.hashCode();
            int hashCode4 = this.tracer.hashCode();
            int hashCode5 = this.usr.hashCode();
            com.datadog.android.trace.model.SpanEvent.Account account = this.account;
            int hashCode6 = account == null ? 0 : account.hashCode();
            com.datadog.android.trace.model.SpanEvent.Network network = this.network;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (network != null ? network.hashCode() : 0)) * 31) + this.device.hashCode()) * 31) + this.os.hashCode()) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Meta)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Meta meta = (com.datadog.android.trace.model.SpanEvent.Meta) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.version, meta.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.dd, meta.dd) && kotlin.jvm.internal.Intrinsics.areEqual(this.span, meta.span) && kotlin.jvm.internal.Intrinsics.areEqual(this.tracer, meta.tracer) && kotlin.jvm.internal.Intrinsics.areEqual(this.usr, meta.usr) && kotlin.jvm.internal.Intrinsics.areEqual(this.account, meta.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.network, meta.network) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, meta.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.os, meta.os) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, meta.additionalProperties);
        }

        public final com.datadog.android.trace.model.SpanEvent.Meta copy(java.lang.String version, com.datadog.android.trace.model.SpanEvent.Dd dd, com.datadog.android.trace.model.SpanEvent.Span span, com.datadog.android.trace.model.SpanEvent.Tracer tracer, com.datadog.android.trace.model.SpanEvent.Usr usr, com.datadog.android.trace.model.SpanEvent.Account account, com.datadog.android.trace.model.SpanEvent.Network network, com.datadog.android.trace.model.SpanEvent.Device device, com.datadog.android.trace.model.SpanEvent.Os os, java.util.Map<java.lang.String, java.lang.String> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.trace.model.SpanEvent.Meta(version, dd, span, tracer, usr, account, network, device, os, additionalProperties);
        }

        /* renamed from: component9, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Os getOs() {
            return this.os;
        }

        /* renamed from: component8, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Device getDevice() {
            return this.device;
        }

        /* renamed from: component7, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Network getNetwork() {
            return this.network;
        }

        /* renamed from: component6, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Account getAccount() {
            return this.account;
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Usr getUsr() {
            return this.usr;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Tracer getTracer() {
            return this.tracer;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Span getSpan() {
            return this.span;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Dd getDd() {
            return this.dd;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component10() {
            return this.additionalProperties;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Meta fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Meta fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Dd;", "", "", "source", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "application", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "session", "Lcom/datadog/android/trace/model/SpanEvent$View;", "view", "<init>", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Application;Lcom/datadog/android/trace/model/SpanEvent$Session;Lcom/datadog/android/trace/model/SpanEvent$View;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/trace/model/SpanEvent$Application;", "component3", "()Lcom/datadog/android/trace/model/SpanEvent$Session;", "component4", "()Lcom/datadog/android/trace/model/SpanEvent$View;", "copy", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Application;Lcom/datadog/android/trace/model/SpanEvent$Session;Lcom/datadog/android/trace/model/SpanEvent$View;)Lcom/datadog/android/trace/model/SpanEvent$Dd;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "getApplication", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "getSession", "Ljava/lang/String;", "getSource", "Lcom/datadog/android/trace/model/SpanEvent$View;", "getView", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Dd.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Dd.Companion(null);
        private final com.datadog.android.trace.model.SpanEvent.Application application;
        private final com.datadog.android.trace.model.SpanEvent.Session session;
        private final java.lang.String source;
        private final com.datadog.android.trace.model.SpanEvent.View view;

        public Dd(java.lang.String str, com.datadog.android.trace.model.SpanEvent.Application application, com.datadog.android.trace.model.SpanEvent.Session session, com.datadog.android.trace.model.SpanEvent.View view) {
            this.source = str;
            this.application = application;
            this.session = session;
            this.view = view;
        }

        public /* synthetic */ Dd(java.lang.String str, com.datadog.android.trace.model.SpanEvent.Application application, com.datadog.android.trace.model.SpanEvent.Session session, com.datadog.android.trace.model.SpanEvent.View view, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME : str, (i & 2) != 0 ? null : application, (i & 4) != 0 ? null : session, (i & 8) != 0 ? null : view);
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final com.datadog.android.trace.model.SpanEvent.Application getApplication() {
            return this.application;
        }

        public final com.datadog.android.trace.model.SpanEvent.Session getSession() {
            return this.session;
        }

        public final com.datadog.android.trace.model.SpanEvent.View getView() {
            return this.view;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.source;
            if (str != null) {
                jsonObject.addProperty("source", str);
            }
            com.datadog.android.trace.model.SpanEvent.Application application = this.application;
            if (application != null) {
                jsonObject.add("application", application.toJson());
            }
            com.datadog.android.trace.model.SpanEvent.Session session = this.session;
            if (session != null) {
                jsonObject.add("session", session.toJson());
            }
            com.datadog.android.trace.model.SpanEvent.View view = this.view;
            if (view != null) {
                jsonObject.add("view", view.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Dd;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Dd;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Dd fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("source");
                    com.datadog.android.trace.model.SpanEvent.View view = null;
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("application");
                    com.datadog.android.trace.model.SpanEvent.Application fromJsonObject = (jsonElement2 == null || (asJsonObject3 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Application.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("session");
                    com.datadog.android.trace.model.SpanEvent.Session fromJsonObject2 = (jsonElement3 == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Session.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("view");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        view = com.datadog.android.trace.model.SpanEvent.View.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.trace.model.SpanEvent.Dd(asString, fromJsonObject, fromJsonObject2, view);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            com.datadog.android.trace.model.SpanEvent.Application application = this.application;
            com.datadog.android.trace.model.SpanEvent.Session session = this.session;
            com.datadog.android.trace.model.SpanEvent.View view = this.view;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dd(source=");
            sb.append(str);
            sb.append(", application=");
            sb.append(application);
            sb.append(", session=");
            sb.append(session);
            sb.append(", view=");
            sb.append(view);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.source;
            int hashCode = str == null ? 0 : str.hashCode();
            com.datadog.android.trace.model.SpanEvent.Application application = this.application;
            int hashCode2 = application == null ? 0 : application.hashCode();
            com.datadog.android.trace.model.SpanEvent.Session session = this.session;
            int hashCode3 = session == null ? 0 : session.hashCode();
            com.datadog.android.trace.model.SpanEvent.View view = this.view;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (view != null ? view.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Dd)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Dd dd = (com.datadog.android.trace.model.SpanEvent.Dd) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.source, dd.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, dd.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, dd.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.view, dd.view);
        }

        public final com.datadog.android.trace.model.SpanEvent.Dd copy(java.lang.String source, com.datadog.android.trace.model.SpanEvent.Application application, com.datadog.android.trace.model.SpanEvent.Session session, com.datadog.android.trace.model.SpanEvent.View view) {
            return new com.datadog.android.trace.model.SpanEvent.Dd(source, application, session, view);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.View getView() {
            return this.view;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Session getSession() {
            return this.session;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Application getApplication() {
            return this.application;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Dd fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Dd copy$default(com.datadog.android.trace.model.SpanEvent.Dd dd, java.lang.String str, com.datadog.android.trace.model.SpanEvent.Application application, com.datadog.android.trace.model.SpanEvent.Session session, com.datadog.android.trace.model.SpanEvent.View view, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dd.source;
            }
            if ((i & 2) != 0) {
                application = dd.application;
            }
            if ((i & 4) != 0) {
                session = dd.session;
            }
            if ((i & 8) != 0) {
                view = dd.view;
            }
            return dd.copy(str, application, session, view);
        }

        public Dd() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Span;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "kind", "Ljava/lang/String;", "getKind", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Span {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Span.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Span.Companion(null);
        private final java.lang.String kind = "client";

        public final java.lang.String getKind() {
            return this.kind;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("kind", this.kind);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Span$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Span;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Span;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Span fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Span", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Span fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("kind");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    if (asString != null && !kotlin.jvm.internal.Intrinsics.areEqual(asString, "client")) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    return new com.datadog.android.trace.model.SpanEvent.Span();
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Span", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Span", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Span", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Span fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Span fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "", "", "version", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getVersion", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Tracer {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Tracer.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Tracer.Companion(null);
        private final java.lang.String version;

        public Tracer(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.version = str;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("version", this.version);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Tracer$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Tracer fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Tracer", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Tracer fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("version").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.trace.model.SpanEvent.Tracer(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Tracer", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Tracer", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Tracer", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tracer(version=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.version.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.trace.model.SpanEvent.Tracer) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, ((com.datadog.android.trace.model.SpanEvent.Tracer) other).version);
        }

        public final com.datadog.android.trace.model.SpanEvent.Tracer copy(java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.datadog.android.trace.model.SpanEvent.Tracer(version);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Tracer fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Tracer fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Tracer copy$default(com.datadog.android.trace.model.SpanEvent.Tracer tracer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = tracer.version;
            }
            return tracer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b!\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Usr;", "", "", "id", "name", "email", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getEmail", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Usr {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Usr.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Usr.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"id", "name", "email"};
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String email;
        private final java.lang.String id;
        private final java.lang.String name;

        public Usr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.additionalProperties = map;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public /* synthetic */ Usr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            java.lang.String str3 = this.email;
            if (str3 != null) {
                jsonObject.addProperty("email", str3);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.add(key, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return com.datadog.android.trace.model.SpanEvent.Usr.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Usr fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("email");
                    java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_trace_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new com.datadog.android.trace.model.SpanEvent.Usr(asString, asString2, asString3, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.email;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Usr(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", email=");
            sb.append(str3);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.email;
            return (((((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Usr)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Usr usr = (com.datadog.android.trace.model.SpanEvent.Usr) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, usr.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, usr.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, usr.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, usr.additionalProperties);
        }

        public final com.datadog.android.trace.model.SpanEvent.Usr copy(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.trace.model.SpanEvent.Usr(id, name2, email, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component4() {
            return this.additionalProperties;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Usr fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Usr copy$default(com.datadog.android.trace.model.SpanEvent.Usr usr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = usr.id;
            }
            if ((i & 2) != 0) {
                str2 = usr.name;
            }
            if ((i & 4) != 0) {
                str3 = usr.email;
            }
            if ((i & 8) != 0) {
                map = usr.additionalProperties;
            }
            return usr.copy(str, str2, str3, map);
        }

        public Usr() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Account;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Account {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Account.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Account.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"id", "name"};
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String id;
        private final java.lang.String name;

        public Account(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.id = str;
            this.name = str2;
            this.additionalProperties = map;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public /* synthetic */ Account(java.lang.String str, java.lang.String str2, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.add(key, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Account;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return com.datadog.android.trace.model.SpanEvent.Account.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Account fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_trace_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new com.datadog.android.trace.model.SpanEvent.Account(asString, asString2, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Account(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Account)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Account account = (com.datadog.android.trace.model.SpanEvent.Account) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, account.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, account.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, account.additionalProperties);
        }

        public final com.datadog.android.trace.model.SpanEvent.Account copy(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.trace.model.SpanEvent.Account(id, name2, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.additionalProperties;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Account fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Account copy$default(com.datadog.android.trace.model.SpanEvent.Account account, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                str2 = account.name;
            }
            if ((i & 4) != 0) {
                map = account.additionalProperties;
            }
            return account.copy(str, str2, map);
        }

        public Account() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Network;", "", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "client", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$Client;)V", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$Client;", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$Client;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "getClient", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Network {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Network.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Network.Companion(null);
        private final com.datadog.android.trace.model.SpanEvent.Client client;

        public Network(com.datadog.android.trace.model.SpanEvent.Client client) {
            this.client = client;
        }

        public /* synthetic */ Network(com.datadog.android.trace.model.SpanEvent.Client client, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : client);
        }

        public final com.datadog.android.trace.model.SpanEvent.Client getClient() {
            return this.client;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.trace.model.SpanEvent.Client client = this.client;
            if (client != null) {
                jsonObject.add("client", client.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Network$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Network;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Network fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Network", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Network fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("client");
                    return new com.datadog.android.trace.model.SpanEvent.Network((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Client.INSTANCE.fromJsonObject(asJsonObject));
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Network", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Network", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Network", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.trace.model.SpanEvent.Client client = this.client;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(client=");
            sb.append(client);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.trace.model.SpanEvent.Client client = this.client;
            if (client == null) {
                return 0;
            }
            return client.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.trace.model.SpanEvent.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.client, ((com.datadog.android.trace.model.SpanEvent.Network) other).client);
        }

        public final com.datadog.android.trace.model.SpanEvent.Network copy(com.datadog.android.trace.model.SpanEvent.Client client) {
            return new com.datadog.android.trace.model.SpanEvent.Network(client);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Client getClient() {
            return this.client;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Network fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Network fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Network copy$default(com.datadog.android.trace.model.SpanEvent.Network network, com.datadog.android.trace.model.SpanEvent.Client client, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                client = network.client;
            }
            return network.copy(client);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ¾\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010!R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\bA\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\bB\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bC\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bD\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u0018"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Device;", "", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "type", "", "name", "model", "brand", "architecture", "locale", "", "locales", "timeZone", "", "batteryLevel", "", "powerSavingMode", "brightnessLevel", "logicalCpuCount", "totalRam", "isLowRam", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$Type;", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Number;", "component12", "component13", "component14", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getArchitecture", "Ljava/lang/Number;", "getBatteryLevel", "getBrand", "getBrightnessLevel", "Ljava/lang/Boolean;", "getLocale", "Ljava/util/List;", "getLocales", "getLogicalCpuCount", "getModel", "getName", "getPowerSavingMode", "getTimeZone", "getTotalRam", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Device.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Device.Companion(null);
        private final java.lang.String architecture;
        private final java.lang.Number batteryLevel;
        private final java.lang.String brand;
        private final java.lang.Number brightnessLevel;
        private final java.lang.Boolean isLowRam;
        private final java.lang.String locale;
        private final java.util.List<java.lang.String> locales;
        private final java.lang.Number logicalCpuCount;
        private final java.lang.String model;
        private final java.lang.String name;
        private final java.lang.Boolean powerSavingMode;
        private final java.lang.String timeZone;
        private final java.lang.Number totalRam;
        private final com.datadog.android.trace.model.SpanEvent.Type type;

        public Device(com.datadog.android.trace.model.SpanEvent.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2) {
            this.type = type;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locale = str5;
            this.locales = list;
            this.timeZone = str6;
            this.batteryLevel = number;
            this.powerSavingMode = bool;
            this.brightnessLevel = number2;
            this.logicalCpuCount = number3;
            this.totalRam = number4;
            this.isLowRam = bool2;
        }

        public /* synthetic */ Device(com.datadog.android.trace.model.SpanEvent.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : number, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : number2, (i & 2048) != 0 ? null : number3, (i & 4096) != 0 ? null : number4, (i & 8192) == 0 ? bool2 : null);
        }

        public final com.datadog.android.trace.model.SpanEvent.Type getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getModel() {
            return this.model;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        public final java.lang.String getLocale() {
            return this.locale;
        }

        public final java.util.List<java.lang.String> getLocales() {
            return this.locales;
        }

        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        public final java.lang.Number getBatteryLevel() {
            return this.batteryLevel;
        }

        public final java.lang.Boolean getPowerSavingMode() {
            return this.powerSavingMode;
        }

        public final java.lang.Number getBrightnessLevel() {
            return this.brightnessLevel;
        }

        public final java.lang.Number getLogicalCpuCount() {
            return this.logicalCpuCount;
        }

        public final java.lang.Number getTotalRam() {
            return this.totalRam;
        }

        public final java.lang.Boolean isLowRam() {
            return this.isLowRam;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.trace.model.SpanEvent.Type type = this.type;
            if (type != null) {
                jsonObject.add("type", type.toJson());
            }
            java.lang.String str = this.name;
            if (str != null) {
                jsonObject.addProperty("name", str);
            }
            java.lang.String str2 = this.model;
            if (str2 != null) {
                jsonObject.addProperty("model", str2);
            }
            java.lang.String str3 = this.brand;
            if (str3 != null) {
                jsonObject.addProperty("brand", str3);
            }
            java.lang.String str4 = this.architecture;
            if (str4 != null) {
                jsonObject.addProperty("architecture", str4);
            }
            java.lang.String str5 = this.locale;
            if (str5 != null) {
                jsonObject.addProperty("locale", str5);
            }
            java.util.List<java.lang.String> list = this.locales;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add((java.lang.String) it.next());
                }
                jsonObject.add("locales", jsonArray);
            }
            java.lang.String str6 = this.timeZone;
            if (str6 != null) {
                jsonObject.addProperty("time_zone", str6);
            }
            java.lang.Number number = this.batteryLevel;
            if (number != null) {
                jsonObject.addProperty("battery_level", number);
            }
            java.lang.Boolean bool = this.powerSavingMode;
            if (bool != null) {
                jsonObject.addProperty("power_saving_mode", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Number number2 = this.brightnessLevel;
            if (number2 != null) {
                jsonObject.addProperty("brightness_level", number2);
            }
            java.lang.Number number3 = this.logicalCpuCount;
            if (number3 != null) {
                jsonObject.addProperty("logical_cpu_count", number3);
            }
            java.lang.Number number4 = this.totalRam;
            if (number4 != null) {
                jsonObject.addProperty("total_ram", number4);
            }
            java.lang.Boolean bool2 = this.isLowRam;
            if (bool2 != null) {
                jsonObject.addProperty("is_low_ram", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Device;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Device fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonArray asJsonArray;
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("type");
                    com.datadog.android.trace.model.SpanEvent.Type fromJson = (jsonElement == null || (asString = jsonElement.getAsString()) == null) ? null : com.datadog.android.trace.model.SpanEvent.Type.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("model");
                    java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("brand");
                    java.lang.String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("architecture");
                    java.lang.String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("locale");
                    java.lang.String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("locales");
                    if (jsonElement7 == null || (asJsonArray = jsonElement7.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getAsString());
                        }
                    }
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("time_zone");
                    java.lang.String asString7 = jsonElement8 != null ? jsonElement8.getAsString() : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("battery_level");
                    java.lang.Number asNumber = jsonElement9 != null ? jsonElement9.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement10 = jsonObject.get("power_saving_mode");
                    java.lang.Boolean valueOf = jsonElement10 != null ? java.lang.Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement11 = jsonObject.get("brightness_level");
                    java.lang.Number asNumber2 = jsonElement11 != null ? jsonElement11.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement12 = jsonObject.get("logical_cpu_count");
                    java.lang.Number asNumber3 = jsonElement12 != null ? jsonElement12.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement13 = jsonObject.get("total_ram");
                    java.lang.Number asNumber4 = jsonElement13 != null ? jsonElement13.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement14 = jsonObject.get("is_low_ram");
                    return new com.datadog.android.trace.model.SpanEvent.Device(fromJson, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, asNumber2, asNumber3, asNumber4, jsonElement14 != null ? java.lang.Boolean.valueOf(jsonElement14.getAsBoolean()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.trace.model.SpanEvent.Type type = this.type;
            java.lang.String str = this.name;
            java.lang.String str2 = this.model;
            java.lang.String str3 = this.brand;
            java.lang.String str4 = this.architecture;
            java.lang.String str5 = this.locale;
            java.util.List<java.lang.String> list = this.locales;
            java.lang.String str6 = this.timeZone;
            java.lang.Number number = this.batteryLevel;
            java.lang.Boolean bool = this.powerSavingMode;
            java.lang.Number number2 = this.brightnessLevel;
            java.lang.Number number3 = this.logicalCpuCount;
            java.lang.Number number4 = this.totalRam;
            java.lang.Boolean bool2 = this.isLowRam;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Device(type=");
            sb.append(type);
            sb.append(", name=");
            sb.append(str);
            sb.append(", model=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(str3);
            sb.append(", architecture=");
            sb.append(str4);
            sb.append(", locale=");
            sb.append(str5);
            sb.append(", locales=");
            sb.append(list);
            sb.append(", timeZone=");
            sb.append(str6);
            sb.append(", batteryLevel=");
            sb.append(number);
            sb.append(", powerSavingMode=");
            sb.append(bool);
            sb.append(", brightnessLevel=");
            sb.append(number2);
            sb.append(", logicalCpuCount=");
            sb.append(number3);
            sb.append(", totalRam=");
            sb.append(number4);
            sb.append(", isLowRam=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.trace.model.SpanEvent.Type type = this.type;
            int hashCode = type == null ? 0 : type.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.model;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.brand;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.architecture;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.locale;
            int hashCode6 = str5 == null ? 0 : str5.hashCode();
            java.util.List<java.lang.String> list = this.locales;
            int hashCode7 = list == null ? 0 : list.hashCode();
            java.lang.String str6 = this.timeZone;
            int hashCode8 = str6 == null ? 0 : str6.hashCode();
            java.lang.Number number = this.batteryLevel;
            int hashCode9 = number == null ? 0 : number.hashCode();
            java.lang.Boolean bool = this.powerSavingMode;
            int hashCode10 = bool == null ? 0 : bool.hashCode();
            java.lang.Number number2 = this.brightnessLevel;
            int hashCode11 = number2 == null ? 0 : number2.hashCode();
            java.lang.Number number3 = this.logicalCpuCount;
            int hashCode12 = number3 == null ? 0 : number3.hashCode();
            java.lang.Number number4 = this.totalRam;
            int hashCode13 = number4 == null ? 0 : number4.hashCode();
            java.lang.Boolean bool2 = this.isLowRam;
            return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Device)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Device device = (com.datadog.android.trace.model.SpanEvent.Device) other;
            return this.type == device.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, device.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, device.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, device.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, device.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, device.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.locales, device.locales) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, device.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.logicalCpuCount, device.logicalCpuCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, device.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, device.isLowRam);
        }

        public final com.datadog.android.trace.model.SpanEvent.Device copy(com.datadog.android.trace.model.SpanEvent.Type type, java.lang.String name2, java.lang.String model, java.lang.String brand, java.lang.String architecture, java.lang.String locale, java.util.List<java.lang.String> locales, java.lang.String timeZone, java.lang.Number batteryLevel, java.lang.Boolean powerSavingMode, java.lang.Number brightnessLevel, java.lang.Number logicalCpuCount, java.lang.Number totalRam, java.lang.Boolean isLowRam) {
            return new com.datadog.android.trace.model.SpanEvent.Device(type, name2, model, brand, architecture, locale, locales, timeZone, batteryLevel, powerSavingMode, brightnessLevel, logicalCpuCount, totalRam, isLowRam);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Number getBatteryLevel() {
            return this.batteryLevel;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.locales;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getLocale() {
            return this.locale;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getModel() {
            return this.model;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.Boolean getIsLowRam() {
            return this.isLowRam;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.Number getTotalRam() {
            return this.totalRam;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Number getLogicalCpuCount() {
            return this.logicalCpuCount;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Number getBrightnessLevel() {
            return this.brightnessLevel;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Boolean getPowerSavingMode() {
            return this.powerSavingMode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.Type getType() {
            return this.type;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Device fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Device() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "getVersionMajor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Os {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Os.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Os.Companion(null);
        private final java.lang.String build;
        private final java.lang.String name;
        private final java.lang.String version;
        private final java.lang.String versionMajor;

        public Os(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public /* synthetic */ Os(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getBuild() {
            return this.build;
        }

        public final java.lang.String getVersionMajor() {
            return this.versionMajor;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("name", this.name);
            jsonObject.addProperty("version", this.version);
            java.lang.String str = this.build;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            jsonObject.addProperty("version_major", this.versionMajor);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Os;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Os fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("name").getAsString();
                    java.lang.String asString2 = jsonObject.get("version").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("build");
                    java.lang.String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    java.lang.String asString4 = jsonObject.get("version_major").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new com.datadog.android.trace.model.SpanEvent.Os(asString, asString2, asString3, asString4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.version;
            java.lang.String str3 = this.build;
            java.lang.String str4 = this.versionMajor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Os(name=");
            sb.append(str);
            sb.append(", version=");
            sb.append(str2);
            sb.append(", build=");
            sb.append(str3);
            sb.append(", versionMajor=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.version.hashCode();
            java.lang.String str = this.build;
            return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.versionMajor.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Os)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Os os = (com.datadog.android.trace.model.SpanEvent.Os) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, os.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, os.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.build, os.build) && kotlin.jvm.internal.Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final com.datadog.android.trace.model.SpanEvent.Os copy(java.lang.String name2, java.lang.String version, java.lang.String build, java.lang.String versionMajor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionMajor, "");
            return new com.datadog.android.trace.model.SpanEvent.Os(name2, version, build, versionMajor);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getVersionMajor() {
            return this.versionMajor;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBuild() {
            return this.build;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Os fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Os copy$default(com.datadog.android.trace.model.SpanEvent.Os os, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = os.name;
            }
            if ((i & 2) != 0) {
                str2 = os.version;
            }
            if ((i & 4) != 0) {
                str3 = os.build;
            }
            if ((i & 8) != 0) {
                str4 = os.versionMajor;
            }
            return os.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Application.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Application.Companion(null);
        private final java.lang.String id;

        public Application(java.lang.String str) {
            this.id = str;
        }

        public /* synthetic */ Application(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.trace.model.SpanEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    return new com.datadog.android.trace.model.SpanEvent.Application(jsonElement != null ? jsonElement.getAsString() : null);
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
            java.lang.String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.trace.model.SpanEvent.Application) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.trace.model.SpanEvent.Application) other).id);
        }

        public final com.datadog.android.trace.model.SpanEvent.Application copy(java.lang.String id) {
            return new com.datadog.android.trace.model.SpanEvent.Application(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Application copy$default(com.datadog.android.trace.model.SpanEvent.Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Application() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Session {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Session.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Session.Companion(null);
        private final java.lang.String id;

        public Session(java.lang.String str) {
            this.id = str;
        }

        public /* synthetic */ Session(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Session;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Session;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Session fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.trace.model.SpanEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    return new com.datadog.android.trace.model.SpanEvent.Session(jsonElement != null ? jsonElement.getAsString() : null);
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
            java.lang.String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.trace.model.SpanEvent.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.trace.model.SpanEvent.Session) other).id);
        }

        public final com.datadog.android.trace.model.SpanEvent.Session copy(java.lang.String id) {
            return new com.datadog.android.trace.model.SpanEvent.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Session fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Session copy$default(com.datadog.android.trace.model.SpanEvent.Session session, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Session() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$View;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class View {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.View.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.View.Companion(null);
        private final java.lang.String id;

        public View(java.lang.String str) {
            this.id = str;
        }

        public /* synthetic */ View(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$View;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.View fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.trace.model.SpanEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    return new com.datadog.android.trace.model.SpanEvent.View(jsonElement != null ? jsonElement.getAsString() : null);
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
            java.lang.String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.trace.model.SpanEvent.View) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.trace.model.SpanEvent.View) other).id);
        }

        public final com.datadog.android.trace.model.SpanEvent.View copy(java.lang.String id) {
            return new com.datadog.android.trace.model.SpanEvent.View(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.View fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.View copy$default(com.datadog.android.trace.model.SpanEvent.View view, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = view.id;
            }
            return view.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public View() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Client;", "", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "simCarrier", "", "signalStrength", "downlinkKbps", "uplinkKbps", "connectivity", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Client;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getConnectivity", "getDownlinkKbps", "getSignalStrength", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "getSimCarrier", "getUplinkKbps", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Client {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Client.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Client.Companion(null);
        private final java.lang.String connectivity;
        private final java.lang.String downlinkKbps;
        private final java.lang.String signalStrength;
        private final com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier;
        private final java.lang.String uplinkKbps;

        public Client(com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.simCarrier = simCarrier;
            this.signalStrength = str;
            this.downlinkKbps = str2;
            this.uplinkKbps = str3;
            this.connectivity = str4;
        }

        public /* synthetic */ Client(com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : simCarrier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final com.datadog.android.trace.model.SpanEvent.SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        public final java.lang.String getSignalStrength() {
            return this.signalStrength;
        }

        public final java.lang.String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        public final java.lang.String getUplinkKbps() {
            return this.uplinkKbps;
        }

        public final java.lang.String getConnectivity() {
            return this.connectivity;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier = this.simCarrier;
            if (simCarrier != null) {
                jsonObject.add("sim_carrier", simCarrier.toJson());
            }
            java.lang.String str = this.signalStrength;
            if (str != null) {
                jsonObject.addProperty("signal_strength", str);
            }
            java.lang.String str2 = this.downlinkKbps;
            if (str2 != null) {
                jsonObject.addProperty("downlink_kbps", str2);
            }
            java.lang.String str3 = this.uplinkKbps;
            if (str3 != null) {
                jsonObject.addProperty("uplink_kbps", str3);
            }
            java.lang.String str4 = this.connectivity;
            if (str4 != null) {
                jsonObject.addProperty("connectivity", str4);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Client$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Client;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$Client;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Client fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Client", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Client fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("sim_carrier");
                    com.datadog.android.trace.model.SpanEvent.SimCarrier fromJsonObject = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.trace.model.SpanEvent.SimCarrier.INSTANCE.fromJsonObject(asJsonObject);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("signal_strength");
                    java.lang.String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("downlink_kbps");
                    java.lang.String asString2 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("uplink_kbps");
                    java.lang.String asString3 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("connectivity");
                    return new com.datadog.android.trace.model.SpanEvent.Client(fromJsonObject, asString, asString2, asString3, jsonElement5 != null ? jsonElement5.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Client", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Client", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Client", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier = this.simCarrier;
            java.lang.String str = this.signalStrength;
            java.lang.String str2 = this.downlinkKbps;
            java.lang.String str3 = this.uplinkKbps;
            java.lang.String str4 = this.connectivity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Client(simCarrier=");
            sb.append(simCarrier);
            sb.append(", signalStrength=");
            sb.append(str);
            sb.append(", downlinkKbps=");
            sb.append(str2);
            sb.append(", uplinkKbps=");
            sb.append(str3);
            sb.append(", connectivity=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier = this.simCarrier;
            int hashCode = simCarrier == null ? 0 : simCarrier.hashCode();
            java.lang.String str = this.signalStrength;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.downlinkKbps;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.uplinkKbps;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.connectivity;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.Client)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.Client client = (com.datadog.android.trace.model.SpanEvent.Client) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.simCarrier, client.simCarrier) && kotlin.jvm.internal.Intrinsics.areEqual(this.signalStrength, client.signalStrength) && kotlin.jvm.internal.Intrinsics.areEqual(this.downlinkKbps, client.downlinkKbps) && kotlin.jvm.internal.Intrinsics.areEqual(this.uplinkKbps, client.uplinkKbps) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectivity, client.connectivity);
        }

        public final com.datadog.android.trace.model.SpanEvent.Client copy(com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier, java.lang.String signalStrength, java.lang.String downlinkKbps, java.lang.String uplinkKbps, java.lang.String connectivity) {
            return new com.datadog.android.trace.model.SpanEvent.Client(simCarrier, signalStrength, downlinkKbps, uplinkKbps, connectivity);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getConnectivity() {
            return this.connectivity;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getUplinkKbps() {
            return this.uplinkKbps;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSignalStrength() {
            return this.signalStrength;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.trace.model.SpanEvent.SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Client fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Client fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.Client copy$default(com.datadog.android.trace.model.SpanEvent.Client client, com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                simCarrier = client.simCarrier;
            }
            if ((i & 2) != 0) {
                str = client.signalStrength;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = client.downlinkKbps;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = client.uplinkKbps;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = client.connectivity;
            }
            return client.copy(simCarrier, str5, str6, str7, str4);
        }

        public Client() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SimCarrier {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.SimCarrier.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.SimCarrier.Companion(null);
        private final java.lang.String id;
        private final java.lang.String name;

        public SimCarrier(java.lang.String str, java.lang.String str2) {
            this.id = str;
            this.name = str2;
        }

        public /* synthetic */ SimCarrier(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$SimCarrier$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.SimCarrier fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SimCarrier", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.SimCarrier fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    return new com.datadog.android.trace.model.SpanEvent.SimCarrier(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SimCarrier", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SimCarrier", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SimCarrier", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SimCarrier(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.trace.model.SpanEvent.SimCarrier)) {
                return false;
            }
            com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier = (com.datadog.android.trace.model.SpanEvent.SimCarrier) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, simCarrier.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, simCarrier.name);
        }

        public final com.datadog.android.trace.model.SpanEvent.SimCarrier copy(java.lang.String id, java.lang.String name2) {
            return new com.datadog.android.trace.model.SpanEvent.SimCarrier(id, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.SimCarrier fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.SimCarrier fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.trace.model.SpanEvent.SimCarrier copy$default(com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = simCarrier.id;
            }
            if ((i & 2) != 0) {
                str2 = simCarrier.name;
            }
            return simCarrier.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SimCarrier() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Type;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.trace.model.SpanEvent.Type.Companion INSTANCE = new com.datadog.android.trace.model.SpanEvent.Type.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        Type(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Type$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.trace.model.SpanEvent.Type fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.trace.model.SpanEvent.Type type : com.datadog.android.trace.model.SpanEvent.Type.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(type.getHighSpeedVideoFpsRanges, jsonString)) {
                        return type;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.trace.model.SpanEvent.Type fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.traceId;
        java.lang.String str2 = this.spanId;
        java.lang.String str3 = this.parentId;
        java.lang.String str4 = this.resource;
        java.lang.String str5 = this.name;
        java.lang.String str6 = this.service;
        long j = this.duration;
        long j2 = this.start;
        long j3 = this.error;
        com.datadog.android.trace.model.SpanEvent.Metrics metrics = this.metrics;
        com.datadog.android.trace.model.SpanEvent.Meta meta = this.meta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanEvent(traceId=");
        sb.append(str);
        sb.append(", spanId=");
        sb.append(str2);
        sb.append(", parentId=");
        sb.append(str3);
        sb.append(", resource=");
        sb.append(str4);
        sb.append(", name=");
        sb.append(str5);
        sb.append(", service=");
        sb.append(str6);
        sb.append(", duration=");
        sb.append(j);
        sb.append(", start=");
        sb.append(j2);
        sb.append(", error=");
        sb.append(j3);
        sb.append(", metrics=");
        sb.append(metrics);
        sb.append(", meta=");
        sb.append(meta);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((this.traceId.hashCode() * 31) + this.spanId.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.resource.hashCode()) * 31) + this.name.hashCode()) * 31) + this.service.hashCode()) * 31) + java.lang.Long.hashCode(this.duration)) * 31) + java.lang.Long.hashCode(this.start)) * 31) + java.lang.Long.hashCode(this.error)) * 31) + this.metrics.hashCode()) * 31) + this.meta.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.trace.model.SpanEvent)) {
            return false;
        }
        com.datadog.android.trace.model.SpanEvent spanEvent = (com.datadog.android.trace.model.SpanEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, spanEvent.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.spanId, spanEvent.spanId) && kotlin.jvm.internal.Intrinsics.areEqual(this.parentId, spanEvent.parentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resource, spanEvent.resource) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, spanEvent.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, spanEvent.service) && this.duration == spanEvent.duration && this.start == spanEvent.start && this.error == spanEvent.error && kotlin.jvm.internal.Intrinsics.areEqual(this.metrics, spanEvent.metrics) && kotlin.jvm.internal.Intrinsics.areEqual(this.meta, spanEvent.meta);
    }

    public final com.datadog.android.trace.model.SpanEvent copy(java.lang.String traceId, java.lang.String spanId, java.lang.String parentId, java.lang.String resource, java.lang.String name2, java.lang.String service, long duration, long start, long error, com.datadog.android.trace.model.SpanEvent.Metrics metrics, com.datadog.android.trace.model.SpanEvent.Meta meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "");
        return new com.datadog.android.trace.model.SpanEvent(traceId, spanId, parentId, resource, name2, service, duration, start, error, metrics, meta);
    }

    /* renamed from: component9, reason: from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: component8, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: component7, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getService() {
        return this.service;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getResource() {
        return this.resource;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getParentId() {
        return this.parentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSpanId() {
        return this.spanId;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.trace.model.SpanEvent.Meta getMeta() {
        return this.meta;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.trace.model.SpanEvent.Metrics getMetrics() {
        return this.metrics;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.trace.model.SpanEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.trace.model.SpanEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
