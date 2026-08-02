package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestBodyFactory;", "", "Lcom/datadog/android/sessionreplay/internal/net/BytesCompressor;", "compressor", "<init>", "(Lcom/datadog/android/sessionreplay/internal/net/BytesCompressor;)V", "", "Lkotlin/Pair;", "Lcom/datadog/android/sessionreplay/model/MobileSegment;", "Lcom/google/gson/JsonObject;", "serializedSegmentsPairs", "Lokhttp3/RequestBody;", "create", "(Ljava/util/List;)Lokhttp3/RequestBody;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/net/BytesCompressor;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SegmentRequestBodyFactory {
    public static final java.lang.String BINARY_FILENAME_PREFIX = "file";
    public static final java.lang.String BLOB_FILENAME = "blob";
    public static final java.lang.String COMPRESSED_SEGMENT_SIZE_FORM_KEY = "compressed_segment_size";
    public static final java.lang.String EVENT_NAME_FORM_KEY = "event";
    public static final java.lang.String RAW_SEGMENT_SIZE_FORM_KEY = "raw_segment_size";
    public static final java.lang.String SEGMENT_DATA_FORM_KEY = "segment";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.net.BytesCompressor getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.Companion(null);
    private static final okhttp3.MediaType CONTENT_TYPE_BINARY_TYPE = okhttp3.MediaType.INSTANCE.parse(com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM);
    private static final okhttp3.MediaType CONTENT_TYPE_JSON_TYPE = okhttp3.MediaType.INSTANCE.parse("application/json");

    public SegmentRequestBodyFactory(com.datadog.android.sessionreplay.internal.net.BytesCompressor bytesCompressor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytesCompressor, "");
        this.getHighSpeedVideoSizes = bytesCompressor;
    }

    public /* synthetic */ SegmentRequestBodyFactory(com.datadog.android.sessionreplay.internal.net.BytesCompressor bytesCompressor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.sessionreplay.internal.net.BytesCompressor() : bytesCompressor);
    }

    public final okhttp3.RequestBody create(java.util.List<kotlin.Pair<com.datadog.android.sessionreplay.model.MobileSegment, com.google.gson.JsonObject>> serializedSegmentsPairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializedSegmentsPairs, "");
        okhttp3.MultipartBody.Builder type = new okhttp3.MultipartBody.Builder(null, 1, null).setType(okhttp3.MultipartBody.FORM);
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        int i = 0;
        for (java.lang.Object obj : serializedSegmentsPairs) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            java.lang.String obj2 = ((com.google.gson.JsonObject) pair.getSecond()).toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj2);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            byte[] bytes = sb.toString().getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] compressBytes = this.getHighSpeedVideoSizes.compressBytes(bytes);
            com.google.gson.JsonObject asJsonObject = ((com.datadog.android.sessionreplay.model.MobileSegment) pair.getFirst()).toJson().getAsJsonObject();
            asJsonObject.addProperty(COMPRESSED_SEGMENT_SIZE_FORM_KEY, java.lang.Integer.valueOf(compressBytes.length));
            asJsonObject.addProperty(RAW_SEGMENT_SIZE_FORM_KEY, java.lang.Integer.valueOf(bytes.length));
            type.addFormDataPart(SEGMENT_DATA_FORM_KEY, "file".concat(java.lang.String.valueOf(i)), okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, compressBytes, CONTENT_TYPE_BINARY_TYPE, 0, 0, 6, (java.lang.Object) null));
            jsonArray.add(asJsonObject);
            i++;
        }
        okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.INSTANCE;
        java.lang.String obj3 = jsonArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        type.addFormDataPart("event", "blob", companion.create(obj3, CONTENT_TYPE_JSON_TYPE));
        return type.build();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestBodyFactory$Companion;", "", "<init>", "()V", "", "BINARY_FILENAME_PREFIX", "Ljava/lang/String;", "BLOB_FILENAME", "COMPRESSED_SEGMENT_SIZE_FORM_KEY", "Lokhttp3/MediaType;", "CONTENT_TYPE_BINARY_TYPE", "Lokhttp3/MediaType;", "getCONTENT_TYPE_BINARY_TYPE$dd_sdk_android_session_replay_release", "()Lokhttp3/MediaType;", "CONTENT_TYPE_JSON_TYPE", "getCONTENT_TYPE_JSON_TYPE$dd_sdk_android_session_replay_release", "EVENT_NAME_FORM_KEY", "RAW_SEGMENT_SIZE_FORM_KEY", "SEGMENT_DATA_FORM_KEY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.MediaType getCONTENT_TYPE_BINARY_TYPE$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.CONTENT_TYPE_BINARY_TYPE;
        }

        public final okhttp3.MediaType getCONTENT_TYPE_JSON_TYPE$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.CONTENT_TYPE_JSON_TYPE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SegmentRequestBodyFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
