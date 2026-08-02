package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtils;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebAuthnUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.webauthn.WebAuthnUtils.Companion INSTANCE = new androidx.view.webauthn.WebAuthnUtils.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtils$Companion;", "", "<init>", "()V", "", "str", "", "b64Decode", "(Ljava/lang/String;)[B", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "b64Encode", "([B)Ljava/lang/String;", "Landroidx/credentials/provider/CallingAppInfo;", "info", "appInfoToOrigin", "(Landroidx/credentials/provider/CallingAppInfo;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final byte[] b64Decode(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            byte[] decode = android.util.Base64.decode(str, 11);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
            return decode;
        }

        public final java.lang.String b64Encode(byte[] data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            java.lang.String encodeToString = android.util.Base64.encodeToString(data, 11);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return encodeToString;
        }

        public final java.lang.String appInfoToOrigin(androidx.view.provider.CallingAppInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            return android.os.Build.VERSION.SDK_INT >= 28 ? androidx.view.webauthn.WebAuthnUtilsApi28.INSTANCE.appInfoToOrigin(info) : "";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
