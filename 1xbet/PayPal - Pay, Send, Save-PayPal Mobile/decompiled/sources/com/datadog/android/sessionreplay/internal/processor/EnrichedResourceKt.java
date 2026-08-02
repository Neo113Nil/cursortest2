package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;", "", "rumApplicationId", "", "asBinaryMetadata", "(Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;Ljava/lang/String;)[B"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnrichedResourceKt {
    public static final byte[] asBinaryMetadata(com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrichedResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String filename$dd_sdk_android_session_replay_release = enrichedResource.getFilename$dd_sdk_android_session_replay_release();
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, str);
        jsonObject.addProperty("filename", filename$dd_sdk_android_session_replay_release);
        if (enrichedResource.getMimeType$dd_sdk_android_session_replay_release() != null) {
            jsonObject.addProperty(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, enrichedResource.getMimeType$dd_sdk_android_session_replay_release());
        }
        java.lang.String obj = jsonObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        byte[] bytes = obj.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }
}
