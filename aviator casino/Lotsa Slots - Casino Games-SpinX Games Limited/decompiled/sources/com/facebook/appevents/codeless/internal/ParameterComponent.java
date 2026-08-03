package com.facebook.appevents.codeless.internal;

/* compiled from: ParameterComponent.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "", "component", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "name", "", "getName", "()Ljava/lang/String;", "path", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "getPath", "()Ljava/util/List;", "pathType", "getPathType", "value", "getValue", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ParameterComponent {
    private static final java.lang.String PARAMETER_NAME_KEY = "name";
    private static final java.lang.String PARAMETER_PATH_KEY = "path";
    private static final java.lang.String PARAMETER_VALUE_KEY = "value";
    private final java.lang.String name;
    private final java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path;
    private final java.lang.String pathType;
    private final java.lang.String value;

    public ParameterComponent(org.json.JSONObject component) {
        int length;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "component");
        java.lang.String string = component.getString("name");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        java.lang.String optString = component.optString("value");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = optString;
        java.lang.String optString2 = component.optString(com.facebook.appevents.codeless.internal.Constants.EVENT_MAPPING_PATH_TYPE_KEY, com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_ABSOLUTE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.pathType = optString2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new com.facebook.appevents.codeless.internal.PathComponent(jSONObject));
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.path = arrayList;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.util.List<com.facebook.appevents.codeless.internal.PathComponent> getPath() {
        return this.path;
    }

    public final java.lang.String getPathType() {
        return this.pathType;
    }
}
