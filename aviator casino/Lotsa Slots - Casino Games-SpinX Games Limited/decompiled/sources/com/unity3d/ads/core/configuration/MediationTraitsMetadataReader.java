package com.unity3d.ads.core.configuration;

/* compiled from: MediationTraitsMetadataReader.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/MetadataReader;", "Lorg/json/JSONObject;", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "getBooleanTrait", "", com.ironsource.X3.i.W, "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getStringTrait", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediationTraitsMetadataReader extends com.unity3d.ads.core.configuration.MetadataReader<org.json.JSONObject> {
    public static final java.lang.String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final java.lang.String MEDIATION_TRAITS = "mediation.traits.value";
    public static final java.lang.String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(com.unity3d.services.core.misc.JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean getBooleanTrait(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.unity3d.ads.core.configuration.MediationTraitsMetadataReader mediationTraitsMetadataReader = this;
        java.lang.Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            if (!(obj instanceof org.json.JSONObject)) {
                obj = null;
            }
        }
        obj = null;
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(key)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return java.lang.Boolean.valueOf(jSONObject.optBoolean(key));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getStringTrait(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.unity3d.ads.core.configuration.MediationTraitsMetadataReader mediationTraitsMetadataReader = this;
        java.lang.Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            if (!(obj instanceof org.json.JSONObject)) {
                obj = null;
            }
        }
        obj = null;
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(key)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.optString(key);
        }
        return null;
    }
}
