package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Landroidx/credentials/SignalAllAcceptedCredentialIdsRequest;", "Landroidx/credentials/SignalCredentialStateRequest;", "", "requestJson", "Landroid/os/Bundle;", "requestData", "origin", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SignalAllAcceptedCredentialIdsRequest extends androidx.view.SignalCredentialStateRequest {
    public static final java.lang.String SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE = "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.SignalAllAcceptedCredentialIdsRequest.Companion INSTANCE = new androidx.view.SignalAllAcceptedCredentialIdsRequest.Companion(null);
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"rpId", "userId", "allAcceptedCredentialIds"});

    public /* synthetic */ SignalAllAcceptedCredentialIdsRequest(java.lang.String str, android.os.Bundle bundle, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        super(SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE, str, bundle, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (INSTANCE.isValidRequestJson(str)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Structural/type validation failed for JSON: '");
        sb.append(str);
        sb.append('\'');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(java.lang.String str) {
        this(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(java.lang.String str, java.lang.String str2) {
        this(str, INSTANCE.toRequestData(str), str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/credentials/SignalAllAcceptedCredentialIdsRequest$Companion;", "", "<init>", "()V", "", "requestJson", "Landroid/os/Bundle;", "toRequestData", "(Ljava/lang/String;)Landroid/os/Bundle;", "", "isValidRequestJson", "(Ljava/lang/String;)Z", "SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE", "Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.os.Bundle toRequestData(java.lang.String requestJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.signal_request_json_key", requestJson);
            return bundle;
        }

        public final boolean isValidRequestJson(java.lang.String requestJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(requestJson);
                java.util.Iterator it = androidx.view.SignalAllAcceptedCredentialIdsRequest.Camera2StreamConfigurationMap.iterator();
                while (it.hasNext()) {
                    if (!jSONObject.has((java.lang.String) it.next())) {
                        return false;
                    }
                }
                java.lang.String string = jSONObject.getString("userId");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                if (!androidx.view.internal.ConversionUtilsKt.isValidBase64Url(string)) {
                    return false;
                }
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("allAcceptedCredentialIds");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    java.lang.Object obj = jSONArray.get(i);
                    if (!(obj instanceof java.lang.String) || !androidx.view.internal.ConversionUtilsKt.isValidBase64Url((java.lang.String) obj)) {
                        return false;
                    }
                }
                return true;
            } catch (java.lang.Exception unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
