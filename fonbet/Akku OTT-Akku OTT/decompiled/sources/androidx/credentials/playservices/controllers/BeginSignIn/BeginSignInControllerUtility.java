package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.C0810d;
import com.google.android.gms.common.internal.C0875q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lcom/google/android/libraries/identity/googleid/a;", "option", "Lcom/google/android/gms/auth/api/identity/d$a;", "convertToGoogleIdTokenOption", "(Lcom/google/android/libraries/identity/googleid/a;)Lcom/google/android/gms/auth/api/identity/d$a;", "Landroidx/credentials/GetCredentialRequest;", "request", "Lcom/google/android/gms/auth/api/identity/d;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Landroidx/credentials/GetCredentialRequest;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/d;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C0810d.a convertToGoogleIdTokenOption(com.google.android.libraries.identity.googleid.a option) {
            C0810d.a.C0106a l = C0810d.a.l();
            l.d = option.c;
            l.c = option.b;
            String str = option.a;
            C0875q.d(str);
            l.b = str;
            l.a = true;
            Intrinsics.checkNotNullExpressionValue(l, "setSupported(...)");
            C0810d.a a = l.a();
            Intrinsics.checkNotNullExpressionValue(a, "build(...)");
            return a;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            Intrinsics.checkNotNullExpressionValue(context.getPackageManager(), "getPackageManager(...)");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final C0810d constructBeginSignInRequest$credentials_play_services_auth_release(GetCredentialRequest request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            C0810d.C0107d c0107d = new C0810d.C0107d(false);
            C0810d.a.C0106a l = C0810d.a.l();
            l.a = false;
            C0810d.a a = l.a();
            C0810d.c cVar = new C0810d.c(null, null, false);
            C0810d.b bVar = new C0810d.b(false, null);
            long determineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            C0810d.C0107d c0107d2 = c0107d;
            boolean z = false;
            boolean z2 = false;
            C0810d.a aVar = a;
            C0810d.c cVar2 = cVar;
            C0810d.b bVar2 = bVar;
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
                if (credentialOption instanceof GetPasswordOption) {
                    c0107d2 = new C0810d.C0107d(true);
                    if (!z2 && !credentialOption.getIsAutoSelectAllowed()) {
                        z2 = false;
                    }
                    z2 = true;
                } else if ((credentialOption instanceof GetPublicKeyCredentialOption) && !z) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode)) {
                        C0810d.c convertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((GetPublicKeyCredentialOption) credentialOption);
                        C0875q.g(convertToPlayAuthPasskeyRequest);
                        cVar2 = convertToPlayAuthPasskeyRequest;
                    } else {
                        C0810d.b convertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((GetPublicKeyCredentialOption) credentialOption);
                        C0875q.g(convertToPlayAuthPasskeyJsonRequest);
                        bVar2 = convertToPlayAuthPasskeyJsonRequest;
                    }
                    z = true;
                } else if (credentialOption instanceof com.google.android.libraries.identity.googleid.a) {
                    com.google.android.libraries.identity.googleid.a aVar2 = (com.google.android.libraries.identity.googleid.a) credentialOption;
                    aVar = convertToGoogleIdTokenOption(aVar2);
                    C0875q.g(aVar);
                    if (!z2 && !aVar2.d) {
                        z2 = false;
                    }
                    z2 = true;
                }
            }
            C0810d c0810d = new C0810d(c0107d2, aVar, null, z2, 0, cVar2, bVar2, determineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED ? request.getPreferImmediatelyAvailableCredentials() : false);
            Intrinsics.checkNotNullExpressionValue(c0810d, "build(...)");
            return c0810d;
        }

        private Companion() {
        }
    }
}
