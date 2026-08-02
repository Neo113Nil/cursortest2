package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004H ¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "Landroid/os/Parcelable;", "<init>", "()V", "", "key", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "obj", "", "packToObject$core_publicRelease", "(Lorg/json/JSONObject;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "payload", "prepareInternal$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "magnesClientId", "prepareMagnesClientId$core_publicRelease", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getId", "()Ljava/lang/String;", "id", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayReference implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Companion(null);
    public static final java.lang.String KEY_APP_IDENTIFIER = "APP_IDENTIFIER";
    public static final java.lang.String KEY_PAYMENT_UUID = "PAYMENT_UUID";
    public static final java.lang.String KEY_REFERENCES_PAYPAL_PARTNER_ATTRIBUTION_ID = "paypalPartnerAttributionId";
    public static final java.lang.String KEY_REFERENCE_NUMBER = "REFERENCE_NUMBER";
    public static final java.lang.String KEY_SUGGESTED_EMAIL = "SUGGESTED_EMAIL";
    public static final java.lang.String KEY_SUGGESTED_PHONE = "SUGGESTED_PHONE";
    public static final java.lang.String KEY_SUGGESTED_PHONE_CODE = "SUGGESTED_PHONE_CODE";

    public abstract java.lang.String get(java.lang.String key);

    /* renamed from: getId */
    public abstract java.lang.String getGetHighResolutionOutputSizeshNQ4ISI();

    public abstract void packToObject$core_publicRelease(org.json.JSONObject obj);

    public abstract com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference prepareInternal$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload payload);

    public abstract com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference prepareMagnesClientId$core_publicRelease(java.lang.String magnesClientId);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference$Builder;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "build", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "paypalPartnerId", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference$Builder;", "key", "put", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference$Builder;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
            if (str.length() > 128) {
                throw new java.lang.IllegalArgumentException("Reference id can't have length bigger than 4096. Requested length is ".concat(java.lang.String.valueOf(str.length())));
            }
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Builder put(java.lang.String key, java.lang.String value) {
            java.lang.String[] strArr;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            strArr = com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceKt.getHighSpeedVideoFpsRanges;
            if (kotlin.collections.ArraysKt.contains(strArr, key)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Key '");
                sb.append(key);
                sb.append("' is reserved for internal use");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (this.Camera2StreamConfigurationMap.containsKey(key)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Key '");
                sb2.append(key);
                sb2.append("' already exists");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            byte[] bytes = key.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            int length = bytes.length;
            byte[] bytes2 = value.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
            int length2 = length + bytes2.length;
            int i = this.getHighSpeedVideoSizes;
            if (i + length2 > 4096) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Reference object can't contain more than 4096 bytes. Requested size is ");
                sb3.append(i + length2);
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            this.Camera2StreamConfigurationMap.put(key, value);
            this.getHighSpeedVideoSizes += length2;
            return this;
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Builder paypalPartnerId(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return put("paypalPartnerAttributionId", value);
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference build() {
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "fromJSON$core_publicRelease", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "", "KEY_APP_IDENTIFIER", "Ljava/lang/String;", "KEY_PAYMENT_UUID", "KEY_REFERENCES_PAYPAL_PARTNER_ATTRIBUTION_ID", "KEY_REFERENCE_NUMBER", "KEY_SUGGESTED_EMAIL", "KEY_SUGGESTED_PHONE", "KEY_SUGGESTED_PHONE_CODE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference fromJSON$core_publicRelease(final org.json.JSONObject json) {
            java.util.Map emptyMap;
            java.util.Iterator<java.lang.String> keys;
            kotlin.sequences.Sequence asSequence;
            kotlin.sequences.Sequence map;
            java.lang.String optString = json != null ? json.optString("apiReference", null) : null;
            if (json == null || (keys = json.keys()) == null || (asSequence = kotlin.sequences.SequencesKt.asSequence(keys)) == null || (map = kotlin.sequences.SequencesKt.map(asSequence, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference$Companion$fromJSON$values$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final kotlin.Pair<java.lang.String, java.lang.String> invoke(java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return new kotlin.Pair<>(str, json.get(str).toString());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            })) == null || (emptyMap = kotlin.collections.MapsKt.toMap(map)) == null) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            }
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl(optString, emptyMap);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
