package com.datadog.android.telemetry.model;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u000bYZX[\\]^_`abB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u009a\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b>\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010\u001eR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010(R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\bR\u0010\"R\u001a\u0010S\u001a\u00020\u00068\u0007X\u0087D¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010&R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bU\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bW\u0010/"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "dd", "", "date", "", "service", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "source", "version", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "application", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "session", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "view", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "action", "", "effectiveSampleRate", "", "experimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "telemetry", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;)V", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "component10", "()Ljava/lang/Number;", "component11", "()Ljava/util/List;", "component12", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "component5", "component6", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "component7", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "component8", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "component9", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "getAction", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "getApplication", "J", "getDate", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "getDd", "Ljava/lang/Number;", "getEffectiveSampleRate", "Ljava/util/List;", "getExperimentalFeatures", "Ljava/lang/String;", "getService", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "getSession", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "getSource", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "getTelemetry", "type", "getType", "getVersion", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "getView", "Companion", "Action", "Application", "Dd", "Device", "Error", "Os", "Session", "Source", "Telemetry", "View"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TelemetryErrorEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Companion(null);
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application;
    private final long date;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd;
    private final java.lang.Number effectiveSampleRate;
    private final java.util.List<java.lang.String> experimentalFeatures;
    private final java.lang.String service;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry;
    private final java.lang.String type;
    private final java.lang.String version;
    private final com.datadog.android.telemetry.model.TelemetryErrorEvent.View view;

    public TelemetryErrorEvent(com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd, long j, java.lang.String str, com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source, java.lang.String str2, com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application, com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session, com.datadog.android.telemetry.model.TelemetryErrorEvent.View view, com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action, java.lang.Number number, java.util.List<java.lang.String> list, com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetry, "");
        this.dd = dd;
        this.date = j;
        this.service = str;
        this.source = source;
        this.version = str2;
        this.application = application;
        this.session = session;
        this.view = view;
        this.action = action;
        this.effectiveSampleRate = number;
        this.experimentalFeatures = list;
        this.telemetry = telemetry;
        this.type = "telemetry";
    }

    public /* synthetic */ TelemetryErrorEvent(com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd, long j, java.lang.String str, com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source, java.lang.String str2, com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application, com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session, com.datadog.android.telemetry.model.TelemetryErrorEvent.View view, com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action, java.lang.Number number, java.util.List list, com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dd, j, str, source, str2, (i & 32) != 0 ? null : application, (i & 64) != 0 ? null : session, (i & 128) != 0 ? null : view, (i & 256) != 0 ? null : action, (i & 512) != 0 ? null : number, (i & 1024) != 0 ? null : list, telemetry);
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd getDd() {
        return this.dd;
    }

    public final long getDate() {
        return this.date;
    }

    public final java.lang.String getService() {
        return this.service;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source getSource() {
        return this.source;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application getApplication() {
        return this.application;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session getSession() {
        return this.session;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.View getView() {
        return this.view;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action getAction() {
        return this.action;
    }

    public final java.lang.Number getEffectiveSampleRate() {
        return this.effectiveSampleRate;
    }

    public final java.util.List<java.lang.String> getExperimentalFeatures() {
        return this.experimentalFeatures;
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry getTelemetry() {
        return this.telemetry;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add("_dd", this.dd.toJson());
        jsonObject.addProperty("type", this.type);
        jsonObject.addProperty("date", java.lang.Long.valueOf(this.date));
        jsonObject.addProperty("service", this.service);
        jsonObject.add("source", this.source.toJson());
        jsonObject.addProperty("version", this.version);
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application = this.application;
        if (application != null) {
            jsonObject.add("application", application.toJson());
        }
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session = this.session;
        if (session != null) {
            jsonObject.add("session", session.toJson());
        }
        com.datadog.android.telemetry.model.TelemetryErrorEvent.View view = this.view;
        if (view != null) {
            jsonObject.add("view", view.toJson());
        }
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action = this.action;
        if (action != null) {
            jsonObject.add("action", action.toJson());
        }
        java.lang.Number number = this.effectiveSampleRate;
        if (number != null) {
            jsonObject.addProperty("effective_sample_rate", number);
        }
        java.util.List<java.lang.String> list = this.experimentalFeatures;
        if (list != null) {
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("experimental_features", jsonArray);
        }
        jsonObject.add("telemetry", this.telemetry.toJson());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.telemetry.model.TelemetryErrorEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type TelemetryErrorEvent", e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[Catch: NullPointerException -> 0x014a, NumberFormatException -> 0x0157, IllegalStateException -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NullPointerException -> 0x014a, blocks: (B:4:0x000d, B:68:0x0061, B:70:0x0067, B:7:0x0070, B:9:0x0078, B:11:0x007e, B:13:0x0087, B:15:0x008f, B:17:0x0095, B:19:0x009e, B:21:0x00a6, B:23:0x00ac, B:24:0x00b4, B:26:0x00bc, B:28:0x00c5, B:30:0x00cd), top: B:3:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[Catch: NumberFormatException -> 0x0142, IllegalStateException -> 0x0146, NullPointerException -> 0x014a, TRY_LEAVE, TryCatch #5 {NullPointerException -> 0x014a, blocks: (B:4:0x000d, B:68:0x0061, B:70:0x0067, B:7:0x0070, B:9:0x0078, B:11:0x007e, B:13:0x0087, B:15:0x008f, B:17:0x0095, B:19:0x009e, B:21:0x00a6, B:23:0x00ac, B:24:0x00b4, B:26:0x00bc, B:28:0x00c5, B:30:0x00cd), top: B:3:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0118 A[Catch: NullPointerException -> 0x0138, NumberFormatException -> 0x013a, IllegalStateException -> 0x013e, TryCatch #5 {IllegalStateException -> 0x013e, NullPointerException -> 0x0138, NumberFormatException -> 0x013a, blocks: (B:34:0x00d5, B:35:0x00e6, B:37:0x00ec, B:40:0x0101, B:42:0x0118, B:45:0x012c, B:46:0x0137), top: B:33:0x00d5 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012c A[Catch: NullPointerException -> 0x0138, NumberFormatException -> 0x013a, IllegalStateException -> 0x013e, TryCatch #5 {IllegalStateException -> 0x013e, NullPointerException -> 0x0138, NumberFormatException -> 0x013a, blocks: (B:34:0x00d5, B:35:0x00e6, B:37:0x00ec, B:40:0x0101, B:42:0x0118, B:45:0x012c, B:46:0x0137), top: B:33:0x00d5 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.datadog.android.telemetry.model.TelemetryErrorEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            java.lang.String str;
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Application fromJsonObject;
            com.google.gson.JsonElement jsonElement;
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action;
            java.util.ArrayList arrayList;
            com.google.gson.JsonObject asJsonObject;
            com.google.gson.JsonObject asJsonObject2;
            com.google.gson.JsonObject asJsonObject3;
            java.lang.String str2 = "Unable to parse json into type TelemetryErrorEvent";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                try {
                    com.google.gson.JsonObject asJsonObject4 = jsonObject.get("_dd").getAsJsonObject();
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd.Companion companion = com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd fromJsonObject2 = companion.fromJsonObject(asJsonObject4);
                    java.lang.String asString = jsonObject.get("type").getAsString();
                    long asLong = jsonObject.get("date").getAsLong();
                    java.lang.String asString2 = jsonObject.get("service").getAsString();
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.Companion companion2 = com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.INSTANCE;
                    java.lang.String asString3 = jsonObject.get("source").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Source fromJson = companion2.fromJson(asString3);
                    java.lang.String asString4 = jsonObject.get("version").getAsString();
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("application");
                    if (jsonElement2 != null) {
                        try {
                            com.google.gson.JsonObject asJsonObject5 = jsonElement2.getAsJsonObject();
                            if (asJsonObject5 != null) {
                                fromJsonObject = com.datadog.android.telemetry.model.TelemetryErrorEvent.Application.INSTANCE.fromJsonObject(asJsonObject5);
                                com.google.gson.JsonElement jsonElement3 = jsonObject.get("session");
                                com.datadog.android.telemetry.model.TelemetryErrorEvent.Session fromJsonObject3 = (jsonElement3 != null || (asJsonObject3 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.telemetry.model.TelemetryErrorEvent.Session.INSTANCE.fromJsonObject(asJsonObject3);
                                com.google.gson.JsonElement jsonElement4 = jsonObject.get("view");
                                com.datadog.android.telemetry.model.TelemetryErrorEvent.View fromJsonObject4 = (jsonElement4 != null || (asJsonObject2 = jsonElement4.getAsJsonObject()) == null) ? null : com.datadog.android.telemetry.model.TelemetryErrorEvent.View.INSTANCE.fromJsonObject(asJsonObject2);
                                com.google.gson.JsonElement jsonElement5 = jsonObject.get("action");
                                com.datadog.android.telemetry.model.TelemetryErrorEvent.Action fromJsonObject5 = (jsonElement5 != null || (asJsonObject = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.telemetry.model.TelemetryErrorEvent.Action.INSTANCE.fromJsonObject(asJsonObject);
                                com.google.gson.JsonElement jsonElement6 = jsonObject.get("effective_sample_rate");
                                java.lang.Number asNumber = jsonElement6 == null ? jsonElement6.getAsNumber() : null;
                                jsonElement = jsonObject.get("experimental_features");
                                if (jsonElement != null) {
                                    com.google.gson.JsonArray asJsonArray = jsonElement.getAsJsonArray();
                                    if (asJsonArray != null) {
                                        str = "Unable to parse json into type TelemetryErrorEvent";
                                        try {
                                            action = fromJsonObject5;
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList(asJsonArray.size());
                                            java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(it.next().getAsString());
                                            }
                                            arrayList = arrayList2;
                                            com.google.gson.JsonObject asJsonObject6 = jsonObject.get("telemetry").getAsJsonObject();
                                            com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.Companion companion3 = com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.INSTANCE;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
                                            com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJsonObject6 = companion3.fromJsonObject(asJsonObject6);
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "telemetry")) {
                                                throw new java.lang.IllegalStateException("Check failed.".toString());
                                            }
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                                            return new com.datadog.android.telemetry.model.TelemetryErrorEvent(fromJsonObject2, asLong, asString2, fromJson, asString4, fromJsonObject, fromJsonObject3, fromJsonObject4, action, asNumber, arrayList, fromJsonObject6);
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
                                action = fromJsonObject5;
                                arrayList = null;
                                com.google.gson.JsonObject asJsonObject62 = jsonObject.get("telemetry").getAsJsonObject();
                                com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.Companion companion32 = com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject62, "");
                                com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJsonObject62 = companion32.fromJsonObject(asJsonObject62);
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "telemetry")) {
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
                    com.google.gson.JsonElement jsonElement32 = jsonObject.get("session");
                    if (jsonElement32 != null) {
                    }
                    com.google.gson.JsonElement jsonElement42 = jsonObject.get("view");
                    if (jsonElement42 != null) {
                    }
                    com.google.gson.JsonElement jsonElement52 = jsonObject.get("action");
                    if (jsonElement52 != null) {
                    }
                    com.google.gson.JsonElement jsonElement62 = jsonObject.get("effective_sample_rate");
                    if (jsonElement62 == null) {
                    }
                    jsonElement = jsonObject.get("experimental_features");
                    if (jsonElement != null) {
                    }
                    action = fromJsonObject5;
                    arrayList = null;
                    com.google.gson.JsonObject asJsonObject622 = jsonObject.get("telemetry").getAsJsonObject();
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.Companion companion322 = com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject622, "");
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJsonObject622 = companion322.fromJsonObject(asJsonObject622);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString, "telemetry")) {
                    }
                } catch (java.lang.NullPointerException e6) {
                    e = e6;
                    str = "Unable to parse json into type TelemetryErrorEvent";
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dd {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd.Companion(null);
        private final long formatVersion = 2;

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("format_version", java.lang.Long.valueOf(this.formatVersion));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    if (jsonObject.get("format_version").getAsLong() != 2) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd();
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

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Application.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Application(asString);
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
            return (other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Application) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.telemetry.model.TelemetryErrorEvent.Application) other).id);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Application(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Application copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Session {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Session.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Session(asString);
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
            return (other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.telemetry.model.TelemetryErrorEvent.Session) other).id);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Session copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class View {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.View.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.View.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.View fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.View(asString);
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
            return (other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.View) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.telemetry.model.TelemetryErrorEvent.View) other).id);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.View copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.View(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.View fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.View fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.View copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.View view, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = view.id;
            }
            return view.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Action.Companion(null);
        private final java.lang.String id;

        public Action(java.lang.String str) {
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Action(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(id=");
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
            return (other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Action) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.telemetry.model.TelemetryErrorEvent.Action) other).id);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Action(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Action copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = action.id;
            }
            return action.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0013R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0013R\u001a\u00101\u001a\u00020\u00068\u0007X\u0087D¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0013"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "device", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "os", "", "message", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "error", "", "additionalProperties", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;Ljava/util/Map;)V", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "component2", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "component5", "()Ljava/util/Map;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;Ljava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "getDevice", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "getError", "Ljava/lang/String;", "getMessage", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "getOs", "status", "getStatus", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Telemetry {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"device", "os", "type", "status", "message", "error"};
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device;
        private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error;
        private final java.lang.String message;
        private final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os;
        private final java.lang.String status;
        private final java.lang.String type;

        public Telemetry(com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device, com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os, java.lang.String str, com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error, java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.device = device;
            this.os = os;
            this.message = str;
            this.error = error;
            this.additionalProperties = map;
            this.type = "log";
            this.status = "error";
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device getDevice() {
            return this.device;
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os getOs() {
            return this.os;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error getError() {
            return this.error;
        }

        public /* synthetic */ Telemetry(com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device, com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os, java.lang.String str, com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : device, (i & 2) != 0 ? null : os, str, (i & 8) != 0 ? null : error, (i & 16) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device = this.device;
            if (device != null) {
                jsonObject.add("device", device.toJson());
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os = this.os;
            if (os != null) {
                jsonObject.add("os", os.toJson());
            }
            jsonObject.addProperty("type", this.type);
            jsonObject.addProperty("status", this.status);
            jsonObject.addProperty("message", this.message);
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error = this.error;
            if (error != null) {
                jsonObject.add("error", error.toJson());
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Telemetry", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("device");
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error = null;
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Device fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.telemetry.model.TelemetryErrorEvent.Device.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("os");
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Os fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.telemetry.model.TelemetryErrorEvent.Os.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("type");
                    java.lang.String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    java.lang.String asString2 = jsonObject.get("status").getAsString();
                    java.lang.String asString3 = jsonObject.get("message").getAsString();
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("error");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        error = com.datadog.android.telemetry.model.TelemetryErrorEvent.Error.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error2 = error;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_rum_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (asString != null && !kotlin.jvm.internal.Intrinsics.areEqual(asString, "log")) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString2, "error")) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry(fromJsonObject, fromJsonObject2, asString3, error2, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Telemetry", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Telemetry", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Telemetry", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device = this.device;
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os = this.os;
            java.lang.String str = this.message;
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error = this.error;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Telemetry(device=");
            sb.append(device);
            sb.append(", os=");
            sb.append(os);
            sb.append(", message=");
            sb.append(str);
            sb.append(", error=");
            sb.append(error);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device = this.device;
            int hashCode = device == null ? 0 : device.hashCode();
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os = this.os;
            int hashCode2 = os == null ? 0 : os.hashCode();
            int hashCode3 = this.message.hashCode();
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error = this.error;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (error != null ? error.hashCode() : 0)) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry)) {
                return false;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry = (com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.device, telemetry.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.os, telemetry.os) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, telemetry.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, telemetry.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, telemetry.additionalProperties);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry copy(com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device, com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os, java.lang.String message, com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry(device, os, message, error, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component5() {
            return this.additionalProperties;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os getOs() {
            return this.os;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device getDevice() {
            return this.device;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry, com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device, com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os, java.lang.String str, com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                device = telemetry.device;
            }
            if ((i & 2) != 0) {
                os = telemetry.os;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os2 = os;
            if ((i & 4) != 0) {
                str = telemetry.message;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                error = telemetry.error;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error2 = error;
            if ((i & 16) != 0) {
                map = telemetry.additionalProperties;
            }
            return telemetry.copy(device, os2, str2, error2, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "", "", "architecture", "brand", "model", "", "logicalCpuCount", "totalRam", "", "isLowRam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Number;", "component5", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getArchitecture", "getBrand", "Ljava/lang/Boolean;", "Ljava/lang/Number;", "getLogicalCpuCount", "getModel", "getTotalRam", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Device.Companion(null);
        private final java.lang.String architecture;
        private final java.lang.String brand;
        private final java.lang.Boolean isLowRam;
        private final java.lang.Number logicalCpuCount;
        private final java.lang.String model;
        private final java.lang.Number totalRam;

        public Device(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Number number, java.lang.Number number2, java.lang.Boolean bool) {
            this.architecture = str;
            this.brand = str2;
            this.model = str3;
            this.logicalCpuCount = number;
            this.totalRam = number2;
            this.isLowRam = bool;
        }

        public /* synthetic */ Device(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Number number, java.lang.Number number2, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : number, (i & 16) != 0 ? null : number2, (i & 32) != 0 ? null : bool);
        }

        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getModel() {
            return this.model;
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
            java.lang.String str = this.architecture;
            if (str != null) {
                jsonObject.addProperty("architecture", str);
            }
            java.lang.String str2 = this.brand;
            if (str2 != null) {
                jsonObject.addProperty("brand", str2);
            }
            java.lang.String str3 = this.model;
            if (str3 != null) {
                jsonObject.addProperty("model", str3);
            }
            java.lang.Number number = this.logicalCpuCount;
            if (number != null) {
                jsonObject.addProperty("logical_cpu_count", number);
            }
            java.lang.Number number2 = this.totalRam;
            if (number2 != null) {
                jsonObject.addProperty("total_ram", number2);
            }
            java.lang.Boolean bool = this.isLowRam;
            if (bool != null) {
                jsonObject.addProperty("is_low_ram", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("architecture");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("brand");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("model");
                    java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("logical_cpu_count");
                    java.lang.Number asNumber = jsonElement4 != null ? jsonElement4.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("total_ram");
                    java.lang.Number asNumber2 = jsonElement5 != null ? jsonElement5.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("is_low_ram");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Device(asString, asString2, asString3, asNumber, asNumber2, jsonElement6 != null ? java.lang.Boolean.valueOf(jsonElement6.getAsBoolean()) : null);
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
            java.lang.String str = this.architecture;
            java.lang.String str2 = this.brand;
            java.lang.String str3 = this.model;
            java.lang.Number number = this.logicalCpuCount;
            java.lang.Number number2 = this.totalRam;
            java.lang.Boolean bool = this.isLowRam;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Device(architecture=");
            sb.append(str);
            sb.append(", brand=");
            sb.append(str2);
            sb.append(", model=");
            sb.append(str3);
            sb.append(", logicalCpuCount=");
            sb.append(number);
            sb.append(", totalRam=");
            sb.append(number2);
            sb.append(", isLowRam=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.architecture;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.brand;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.model;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.Number number = this.logicalCpuCount;
            int hashCode4 = number == null ? 0 : number.hashCode();
            java.lang.Number number2 = this.totalRam;
            int hashCode5 = number2 == null ? 0 : number2.hashCode();
            java.lang.Boolean bool = this.isLowRam;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Device)) {
                return false;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device = (com.datadog.android.telemetry.model.TelemetryErrorEvent.Device) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, device.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, device.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, device.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.logicalCpuCount, device.logicalCpuCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, device.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, device.isLowRam);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device copy(java.lang.String architecture, java.lang.String brand, java.lang.String model, java.lang.Number logicalCpuCount, java.lang.Number totalRam, java.lang.Boolean isLowRam) {
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Device(architecture, brand, model, logicalCpuCount, totalRam, isLowRam);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getIsLowRam() {
            return this.isLowRam;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Number getTotalRam() {
            return this.totalRam;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getLogicalCpuCount() {
            return this.logicalCpuCount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getModel() {
            return this.model;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Device fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Device copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Device device, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Number number, java.lang.Number number2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = device.architecture;
            }
            if ((i & 2) != 0) {
                str2 = device.brand;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = device.model;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                number = device.logicalCpuCount;
            }
            java.lang.Number number3 = number;
            if ((i & 16) != 0) {
                number2 = device.totalRam;
            }
            java.lang.Number number4 = number2;
            if ((i & 32) != 0) {
                bool = device.isLowRam;
            }
            return device.copy(str, str4, str5, number3, number4, bool);
        }

        public Device() {
            this(null, null, null, null, null, null, 63, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "", "", "build", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Os {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Os.Companion(null);
        private final java.lang.String build;
        private final java.lang.String name;
        private final java.lang.String version;

        public Os(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.build = str;
            this.name = str2;
            this.version = str3;
        }

        public /* synthetic */ Os(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getBuild() {
            return this.build;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.build;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            java.lang.String str3 = this.version;
            if (str3 != null) {
                jsonObject.addProperty("version", str3);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("build");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("version");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Os(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
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
            java.lang.String str = this.build;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Os(build=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", version=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.build;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.version;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Os)) {
                return false;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os = (com.datadog.android.telemetry.model.TelemetryErrorEvent.Os) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.build, os.build) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, os.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, os.version);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os copy(java.lang.String build, java.lang.String name2, java.lang.String version) {
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Os(build, name2, version);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBuild() {
            return this.build;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Os fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Os copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Os os, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = os.build;
            }
            if ((i & 2) != 0) {
                str2 = os.name;
            }
            if ((i & 4) != 0) {
                str3 = os.version;
            }
            return os.copy(str, str2, str3);
        }

        public Os() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "", "", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getKind", "getStack", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Error.Companion(null);
        private final java.lang.String kind;
        private final java.lang.String stack;

        public Error(java.lang.String str, java.lang.String str2) {
            this.stack = str;
            this.kind = str2;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getStack() {
            return this.stack;
        }

        public final java.lang.String getKind() {
            return this.kind;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.stack;
            if (str != null) {
                jsonObject.addProperty(com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, str);
            }
            java.lang.String str2 = this.kind;
            if (str2 != null) {
                jsonObject.addProperty("kind", str2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get(com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK);
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("kind");
                    return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Error(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.stack;
            java.lang.String str2 = this.kind;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(stack=");
            sb.append(str);
            sb.append(", kind=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.stack;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.kind;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent.Error)) {
                return false;
            }
            com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error = (com.datadog.android.telemetry.model.TelemetryErrorEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.stack, error.stack) && kotlin.jvm.internal.Intrinsics.areEqual(this.kind, error.kind);
        }

        public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error copy(java.lang.String stack, java.lang.String kind) {
            return new com.datadog.android.telemetry.model.TelemetryErrorEvent.Error(stack, kind);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getKind() {
            return this.kind;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStack() {
            return this.stack;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Error fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent.Error copy$default(com.datadog.android.telemetry.model.TelemetryErrorEvent.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.stack;
            }
            if ((i & 2) != 0) {
                str2 = error.kind;
            }
            return error.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "UNITY", "KOTLIN_MULTIPLATFORM", "ELECTRON", "RUM_CPP"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Source {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform"),
        ELECTRON("electron"),
        RUM_CPP("rum-cpp");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.Companion INSTANCE = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        Source(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source : com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(source.Camera2StreamConfigurationMap, jsonString)) {
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
        public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd = this.dd;
        long j = this.date;
        java.lang.String str = this.service;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source = this.source;
        java.lang.String str2 = this.version;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application = this.application;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session = this.session;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.View view = this.view;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action = this.action;
        java.lang.Number number = this.effectiveSampleRate;
        java.util.List<java.lang.String> list = this.experimentalFeatures;
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry = this.telemetry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TelemetryErrorEvent(dd=");
        sb.append(dd);
        sb.append(", date=");
        sb.append(j);
        sb.append(", service=");
        sb.append(str);
        sb.append(", source=");
        sb.append(source);
        sb.append(", version=");
        sb.append(str2);
        sb.append(", application=");
        sb.append(application);
        sb.append(", session=");
        sb.append(session);
        sb.append(", view=");
        sb.append(view);
        sb.append(", action=");
        sb.append(action);
        sb.append(", effectiveSampleRate=");
        sb.append(number);
        sb.append(", experimentalFeatures=");
        sb.append(list);
        sb.append(", telemetry=");
        sb.append(telemetry);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.dd.hashCode();
        int hashCode2 = java.lang.Long.hashCode(this.date);
        int hashCode3 = this.service.hashCode();
        int hashCode4 = this.source.hashCode();
        int hashCode5 = this.version.hashCode();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application = this.application;
        int hashCode6 = application == null ? 0 : application.hashCode();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session = this.session;
        int hashCode7 = session == null ? 0 : session.hashCode();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.View view = this.view;
        int hashCode8 = view == null ? 0 : view.hashCode();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action = this.action;
        int hashCode9 = action == null ? 0 : action.hashCode();
        java.lang.Number number = this.effectiveSampleRate;
        int hashCode10 = number == null ? 0 : number.hashCode();
        java.util.List<java.lang.String> list = this.experimentalFeatures;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.telemetry.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent)) {
            return false;
        }
        com.datadog.android.telemetry.model.TelemetryErrorEvent telemetryErrorEvent = (com.datadog.android.telemetry.model.TelemetryErrorEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dd, telemetryErrorEvent.dd) && this.date == telemetryErrorEvent.date && kotlin.jvm.internal.Intrinsics.areEqual(this.service, telemetryErrorEvent.service) && this.source == telemetryErrorEvent.source && kotlin.jvm.internal.Intrinsics.areEqual(this.version, telemetryErrorEvent.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, telemetryErrorEvent.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, telemetryErrorEvent.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.view, telemetryErrorEvent.view) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, telemetryErrorEvent.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveSampleRate, telemetryErrorEvent.effectiveSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.experimentalFeatures, telemetryErrorEvent.experimentalFeatures) && kotlin.jvm.internal.Intrinsics.areEqual(this.telemetry, telemetryErrorEvent.telemetry);
    }

    public final com.datadog.android.telemetry.model.TelemetryErrorEvent copy(com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd, long date, java.lang.String service, com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source, java.lang.String version, com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application, com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session, com.datadog.android.telemetry.model.TelemetryErrorEvent.View view, com.datadog.android.telemetry.model.TelemetryErrorEvent.Action action, java.lang.Number effectiveSampleRate, java.util.List<java.lang.String> experimentalFeatures, com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry telemetry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetry, "");
        return new com.datadog.android.telemetry.model.TelemetryErrorEvent(dd, date, service, source, version, application, session, view, action, effectiveSampleRate, experimentalFeatures, telemetry);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Action getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.View getView() {
        return this.view;
    }

    /* renamed from: component7, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Session getSession() {
        return this.session;
    }

    /* renamed from: component6, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Application getApplication() {
        return this.application;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getService() {
        return this.service;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component12, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry getTelemetry() {
        return this.telemetry;
    }

    public final java.util.List<java.lang.String> component11() {
        return this.experimentalFeatures;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Number getEffectiveSampleRate() {
        return this.effectiveSampleRate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd getDd() {
        return this.dd;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.telemetry.model.TelemetryErrorEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.telemetry.model.TelemetryErrorEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
