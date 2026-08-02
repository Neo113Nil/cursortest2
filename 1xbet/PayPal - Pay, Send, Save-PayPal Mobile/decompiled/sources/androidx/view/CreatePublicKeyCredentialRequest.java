package androidx.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 #2\u00020\u0001:\u0001#B]\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0018B?\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0017\u0010\""}, d2 = {"Landroidx/credentials/CreatePublicKeyCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "", "p0", "", "p1", "", "p2", "p3", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "p4", "p5", "Landroid/os/Bundle;", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;[BZZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V", "requestJson", "clientDataHash", "preferImmediatelyAvailableCredentials", "origin", "isAutoSelectAllowed", "isConditional", "(Ljava/lang/String;[BZLjava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;[BZLjava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "[B", "getClientDataHash", "()[B", "Z", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreatePublicKeyCredentialRequest extends androidx.view.CreateCredentialRequest {
    public static final java.lang.String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final java.lang.String BUNDLE_KEY_CONDITIONAL_CREATE = "androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST";
    public static final java.lang.String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final java.lang.String BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreatePublicKeyCredentialRequest.Companion INSTANCE = new androidx.view.CreatePublicKeyCredentialRequest.Companion(null);
    private final byte[] clientDataHash;
    private final boolean isConditional;
    private final java.lang.String requestJson;

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    /* synthetic */ CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, boolean z2, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z, z2, displayInfo, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? INSTANCE.toCredentialDataBundle$credentials_release(str, bArr) : bundle, (i & 128) != 0 ? INSTANCE.toCandidateDataBundle$credentials_release(str, bArr) : bundle2, (i & 256) != 0 ? false : z3);
    }

    /* renamed from: isConditional, reason: from getter */
    public final boolean getIsConditional() {
        return this.isConditional;
    }

    private CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, boolean z2, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z3) {
        super(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str2, z2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z3;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
        if (z3) {
            bundle2.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, java.lang.String str2, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) == 0 ? str2 : null, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, java.lang.String str2, boolean z2, boolean z3) {
        this(str, bArr, z2, z, androidx.view.CreatePublicKeyCredentialRequest.Companion.getRequestDisplayInfo$credentials_release$default(INSTANCE, str, null, 2, null), str2, null, null, z3, 192, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, java.lang.String str2, java.lang.String str3, boolean z2) {
        this(str, bArr, z2, z, INSTANCE.getRequestDisplayInfo$credentials_release(str, str3), str2, null, null, false, 448, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017"}, d2 = {"Landroidx/credentials/CreatePublicKeyCredentialRequest$Companion;", "", "<init>", "()V", "", "requestJson", "defaultProvider", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "getRequestDisplayInfo$credentials_release", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "clientDataHash", "Landroid/os/Bundle;", "toCredentialDataBundle$credentials_release", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "toCandidateDataBundle$credentials_release", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "origin", "candidateQueryData", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/CreatePublicKeyCredentialRequest;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "BUNDLE_KEY_CONDITIONAL_CREATE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.credentials.CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release$default(androidx.view.CreatePublicKeyCredentialRequest.Companion companion, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials_release(str, str2);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.credentials.CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release(java.lang.String requestJson, java.lang.String defaultProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(requestJson).getJSONObject("user");
                java.lang.String string = jSONObject.getString("name");
                java.lang.String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.credentials.CreateCredentialRequest.DisplayInfo(string, string2, (android.graphics.drawable.Icon) null, defaultProvider);
            } catch (java.lang.Exception unused) {
                throw new java.lang.IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        public static /* synthetic */ android.os.Bundle toCredentialDataBundle$credentials_release$default(androidx.view.CreatePublicKeyCredentialRequest.Companion companion, java.lang.String str, byte[] bArr, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            return companion.toCredentialDataBundle$credentials_release(str, bArr);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toCredentialDataBundle$credentials_release(java.lang.String requestJson, byte[] clientDataHash) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.PublicKeyCredential.BUNDLE_KEY_SUBTYPE, androidx.view.CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toCandidateDataBundle$credentials_release(java.lang.String requestJson, byte[] clientDataHash) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.PublicKeyCredential.BUNDLE_KEY_SUBTYPE, androidx.view.CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreatePublicKeyCredentialRequest createFrom$credentials_release(android.os.Bundle data, java.lang.String origin, android.os.Bundle candidateQueryData) {
            androidx.credentials.CreateCredentialRequest.DisplayInfo requestDisplayInfo$credentials_release$default;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z = data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    requestDisplayInfo$credentials_release$default = androidx.credentials.CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(data);
                } catch (java.lang.IllegalArgumentException unused) {
                    requestDisplayInfo$credentials_release$default = getRequestDisplayInfo$credentials_release$default(this, string, null, 2, null);
                }
                return new androidx.view.CreatePublicKeyCredentialRequest(string, byteArray, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z, requestDisplayInfo$credentials_release$default, origin, data, candidateQueryData, data.getBoolean(androidx.view.CreatePublicKeyCredentialRequest.BUNDLE_KEY_CONDITIONAL_CREATE), null);
            } catch (java.lang.Exception unused2) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, boolean z2, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z, z2, displayInfo, str2, bundle, bundle2, z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, java.lang.String str2, boolean z2) {
        this(str, bArr, z, str2, z2, false, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z, java.lang.String str2) {
        this(str, bArr, z, str2, false, false, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr, boolean z) {
        this(str, bArr, z, null, false, false, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str, byte[] bArr) {
        this(str, bArr, false, null, false, false, 60, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(java.lang.String str) {
        this(str, null, false, null, false, false, 62, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
