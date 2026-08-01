package com.unity3d.ads.core.configuration;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MediationTraitsMetadataReader.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/MetadataReader;", "Lorg/json/JSONObject;", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "<init>", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "getBooleanTrait", "", "key", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getStringTrait", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final String MEDIATION_TRAITS = "mediation.traits.value";
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean getBooleanTrait(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MediationTraitsMetadataReader mediationTraitsMetadataReader = this;
        Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            if (!(obj != null ? obj instanceof JSONObject : true)) {
                obj = null;
            }
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(key)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean(key));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getStringTrait(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MediationTraitsMetadataReader mediationTraitsMetadataReader = this;
        Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            if (!(obj != null ? obj instanceof JSONObject : true)) {
                obj = null;
            }
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
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
