package com.facebook.appevents.codeless.internal;

/* compiled from: EventBinding.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0003!\"#BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding;", "", com.ironsource.X3.i.j0, "", "method", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "type", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "appVersion", "path", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "parameters", "Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "componentId", "pathType", "activityName", "(Ljava/lang/String;Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityName", "()Ljava/lang/String;", "getAppVersion", "getComponentId", "getEventName", "getMethod", "()Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "getPathType", "getType", "()Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "viewParameters", "getViewParameters", "()Ljava/util/List;", "viewPath", "getViewPath", "ActionType", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MappingMethod", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class EventBinding {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.codeless.internal.EventBinding.Companion INSTANCE = new com.facebook.appevents.codeless.internal.EventBinding.Companion(null);
    private final java.lang.String activityName;
    private final java.lang.String appVersion;
    private final java.lang.String componentId;
    private final java.lang.String eventName;
    private final com.facebook.appevents.codeless.internal.EventBinding.MappingMethod method;
    private final java.util.List<com.facebook.appevents.codeless.internal.ParameterComponent> parameters;
    private final java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path;
    private final java.lang.String pathType;
    private final com.facebook.appevents.codeless.internal.EventBinding.ActionType type;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.codeless.internal.EventBinding getInstanceFromJson(org.json.JSONObject jSONObject) throws org.json.JSONException, java.lang.IllegalArgumentException {
        return INSTANCE.getInstanceFromJson(jSONObject);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.appevents.codeless.internal.EventBinding> parseArray(org.json.JSONArray jSONArray) {
        return INSTANCE.parseArray(jSONArray);
    }

    public EventBinding(java.lang.String eventName, com.facebook.appevents.codeless.internal.EventBinding.MappingMethod method, com.facebook.appevents.codeless.internal.EventBinding.ActionType type, java.lang.String appVersion, java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path, java.util.List<com.facebook.appevents.codeless.internal.ParameterComponent> parameters, java.lang.String componentId, java.lang.String pathType, java.lang.String activityName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "componentId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathType, "pathType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.eventName = eventName;
        this.method = method;
        this.type = type;
        this.appVersion = appVersion;
        this.path = path;
        this.parameters = parameters;
        this.componentId = componentId;
        this.pathType = pathType;
        this.activityName = activityName;
    }

    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final com.facebook.appevents.codeless.internal.EventBinding.MappingMethod getMethod() {
        return this.method;
    }

    public final com.facebook.appevents.codeless.internal.EventBinding.ActionType getType() {
        return this.type;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    public final java.lang.String getPathType() {
        return this.pathType;
    }

    public final java.lang.String getActivityName() {
        return this.activityName;
    }

    public final java.util.List<com.facebook.appevents.codeless.internal.PathComponent> getViewPath() {
        java.util.List<com.facebook.appevents.codeless.internal.PathComponent> unmodifiableList = java.util.Collections.unmodifiableList(this.path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }

    public final java.util.List<com.facebook.appevents.codeless.internal.ParameterComponent> getViewParameters() {
        java.util.List<com.facebook.appevents.codeless.internal.ParameterComponent> unmodifiableList = java.util.Collections.unmodifiableList(this.parameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    /* compiled from: EventBinding.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.codeless.internal.EventBinding.MappingMethod[] valuesCustom() {
            com.facebook.appevents.codeless.internal.EventBinding.MappingMethod[] valuesCustom = values();
            return (com.facebook.appevents.codeless.internal.EventBinding.MappingMethod[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: EventBinding.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.codeless.internal.EventBinding.ActionType[] valuesCustom() {
            com.facebook.appevents.codeless.internal.EventBinding.ActionType[] valuesCustom = values();
            return (com.facebook.appevents.codeless.internal.EventBinding.ActionType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: EventBinding.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$Companion;", "", "()V", "getInstanceFromJson", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Lorg/json/JSONObject;", "parseArray", "", "array", "Lorg/json/JSONArray;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.appevents.codeless.internal.EventBinding> parseArray(org.json.JSONArray array) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (array != null) {
                try {
                    int length = array.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            org.json.JSONObject jSONObject = array.getJSONObject(i);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(getInstanceFromJson(jSONObject));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } catch (java.lang.IllegalArgumentException | org.json.JSONException unused) {
                }
            }
            return arrayList;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.codeless.internal.EventBinding getInstanceFromJson(org.json.JSONObject mapping) throws org.json.JSONException, java.lang.IllegalArgumentException {
            int length;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            java.lang.String eventName = mapping.getString("event_name");
            java.lang.String string = mapping.getString("method");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            java.lang.String upperCase = string.toUpperCase(ENGLISH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            com.facebook.appevents.codeless.internal.EventBinding.MappingMethod valueOf = com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.valueOf(upperCase);
            java.lang.String string2 = mapping.getString("event_type");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            java.util.Locale ENGLISH2 = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            java.lang.String upperCase2 = string2.toUpperCase(ENGLISH2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            com.facebook.appevents.codeless.internal.EventBinding.ActionType valueOf2 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.valueOf(upperCase2);
            java.lang.String appVersion = mapping.getString("app_version");
            org.json.JSONArray jSONArray = mapping.getJSONArray("path");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length2 = jSONArray.length();
            int i = 0;
            if (length2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    org.json.JSONObject jsonPath = jSONArray.getJSONObject(i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                    arrayList.add(new com.facebook.appevents.codeless.internal.PathComponent(jsonPath));
                    if (i3 >= length2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            java.lang.String pathType = mapping.optString(com.facebook.appevents.codeless.internal.Constants.EVENT_MAPPING_PATH_TYPE_KEY, com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_ABSOLUTE);
            org.json.JSONArray optJSONArray = mapping.optJSONArray("parameters");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    org.json.JSONObject jsonParameter = optJSONArray.getJSONObject(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new com.facebook.appevents.codeless.internal.ParameterComponent(jsonParameter));
                    if (i4 >= length) {
                        break;
                    }
                    i = i4;
                }
            }
            java.lang.String componentId = mapping.optString("component_id");
            java.lang.String activityName = mapping.optString("activity_name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new com.facebook.appevents.codeless.internal.EventBinding(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }
    }
}
