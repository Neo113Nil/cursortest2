package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"", "SOFTSPACE_IDENTIFIER", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionRequestKt {
    public static final java.lang.String SOFTSPACE_IDENTIFIER = "com.softspace.1";

    public static final /* synthetic */ com.izettle.android.net.RequestBody access$toRequestBody(org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        final byte[] bytes = jSONObject2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new com.izettle.android.net.RequestBody(bytes) { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestKt$toRequestBody$1
            private final long contentLength;
            private final com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_JSON();
            final /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = bytes;
                this.contentLength = bytes.length;
            }

            @Override // com.izettle.android.net.RequestBody
            public final com.izettle.android.net.ContentType getContentType() {
                return this.contentType;
            }

            @Override // com.izettle.android.net.RequestBody
            public final long getContentLength() {
                return this.contentLength;
            }

            @Override // com.izettle.android.net.RequestBody
            public final java.io.InputStream getInputStream() {
                return new java.io.ByteArrayInputStream(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        };
    }
}
