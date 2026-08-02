package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtilsApi28;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebAuthnUtilsApi28 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.webauthn.WebAuthnUtilsApi28.Companion INSTANCE = new androidx.view.webauthn.WebAuthnUtilsApi28.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtilsApi28$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/CallingAppInfo;", "info", "", "appInfoToOrigin", "(Landroidx/credentials/provider/CallingAppInfo;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String appInfoToOrigin(androidx.view.provider.CallingAppInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(info.getSigningInfo().getApkContentsSigners()[0].toByteArray());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("android:apk-key-hash:");
            androidx.view.webauthn.WebAuthnUtils.Companion companion = androidx.view.webauthn.WebAuthnUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
            sb.append(companion.b64Encode(digest));
            return sb.toString();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
