package androidx.view.playservices.controllers.identityauth.createpublickeycredential;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility;", "", "<init>", "()V", "Companion", "GetGMSVersion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.Companion(null);
    private static final java.lang.String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final java.lang.String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final java.lang.String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final java.lang.String JSON_KEY_SIGNATURE = "signature";
    private static final java.lang.String JSON_KEY_USER_HANDLE = "userHandle";
    private static final java.lang.String JSON_KEY_RESPONSE = "response";
    private static final java.lang.String JSON_KEY_ID = "id";
    private static final java.lang.String JSON_KEY_RAW_ID = "rawId";
    private static final java.lang.String JSON_KEY_TYPE = "type";
    private static final java.lang.String JSON_KEY_RPID = "rpId";
    private static final java.lang.String JSON_KEY_CHALLENGE = com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE;
    private static final java.lang.String JSON_KEY_APPID = "appid";
    private static final java.lang.String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final java.lang.String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final java.lang.String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final java.lang.String JSON_KEY_RES_KEY = "residentKey";
    private static final java.lang.String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final java.lang.String JSON_KEY_TIMEOUT = com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT;
    private static final java.lang.String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final java.lang.String JSON_KEY_TRANSPORTS = "transports";
    private static final java.lang.String JSON_KEY_RP = "rp";
    private static final java.lang.String JSON_KEY_NAME = "name";
    private static final java.lang.String JSON_KEY_ICON = "icon";
    private static final java.lang.String JSON_KEY_ALG = "alg";
    private static final java.lang.String JSON_KEY_USER = "user";
    private static final java.lang.String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final java.lang.String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final java.lang.String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final java.lang.String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final java.lang.String JSON_KEY_EXTENSTIONS = com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS;
    private static final java.lang.String JSON_KEY_ATTESTATION = "attestation";
    private static final java.lang.String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final java.lang.String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final java.lang.String JSON_KEY_RK = "rk";
    private static final java.lang.String JSON_KEY_CRED_PROPS = "credProps";
    private static final java.util.LinkedHashMap<com.google.android.gms.fido.fido2.api.common.ErrorCode, androidx.view.exceptions.domerrors.DomError> orderedErrorCodeToExceptions = kotlin.collections.MapsKt.linkedMapOf(kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.UNKNOWN_ERR, new androidx.view.exceptions.domerrors.UnknownError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.ABORT_ERR, new androidx.view.exceptions.domerrors.AbortError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new androidx.view.exceptions.domerrors.NotReadableError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.CONSTRAINT_ERR, new androidx.view.exceptions.domerrors.ConstraintError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.DATA_ERR, new androidx.view.exceptions.domerrors.DataError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.INVALID_STATE_ERR, new androidx.view.exceptions.domerrors.InvalidStateError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.ENCODING_ERR, new androidx.view.exceptions.domerrors.EncodingError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.NETWORK_ERR, new androidx.view.exceptions.domerrors.NetworkError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_ALLOWED_ERR, new androidx.view.exceptions.domerrors.NotAllowedError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_SUPPORTED_ERR, new androidx.view.exceptions.domerrors.NotSupportedError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.SECURITY_ERR, new androidx.view.exceptions.domerrors.SecurityError()), kotlin.TuplesKt.to(com.google.android.gms.fido.fido2.api.common.ErrorCode.TIMEOUT_ERR, new androidx.view.exceptions.domerrors.TimeoutError()));

    @kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0019\u001a\u00020'¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b5\u00104J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b6\u00104J\u001f\u00107\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b7\u00104J\u001f\u00108\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00104J\u001f\u00109\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b9\u00104J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0013¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u00138\u0001X\u0080D¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u001a\u0010K\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010HR\u001a\u0010M\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bM\u0010F\u001a\u0004\bN\u0010HR\u001a\u0010O\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u0010HR\u001a\u0010Q\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bQ\u0010F\u001a\u0004\bR\u0010HR\u001a\u0010S\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bS\u0010F\u001a\u0004\bT\u0010HR\u001a\u0010U\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010HR\u001a\u0010W\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bW\u0010F\u001a\u0004\bX\u0010HR\u001a\u0010Y\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bY\u0010F\u001a\u0004\bZ\u0010HR\u001a\u0010[\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\b[\u0010F\u001a\u0004\b\\\u0010HR\u001a\u0010]\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\b]\u0010F\u001a\u0004\b^\u0010HR\u001a\u0010_\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\b_\u0010F\u001a\u0004\b`\u0010HR\u001a\u0010a\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\ba\u0010F\u001a\u0004\bb\u0010HR\u001a\u0010c\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bc\u0010F\u001a\u0004\bd\u0010HR\u001a\u0010e\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\be\u0010F\u001a\u0004\bf\u0010HR\u001a\u0010g\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bg\u0010F\u001a\u0004\bh\u0010HR\u001a\u0010i\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bi\u0010F\u001a\u0004\bj\u0010HR\u001a\u0010k\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bk\u0010F\u001a\u0004\bl\u0010HR\u001a\u0010m\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bm\u0010F\u001a\u0004\bn\u0010HR\u001a\u0010o\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bo\u0010F\u001a\u0004\bp\u0010HR\u001a\u0010q\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bq\u0010F\u001a\u0004\br\u0010HR\u001a\u0010s\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bs\u0010F\u001a\u0004\bt\u0010HR\u001a\u0010u\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bu\u0010F\u001a\u0004\bv\u0010HR\u001a\u0010w\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\bw\u0010F\u001a\u0004\bx\u0010HR\u001a\u0010y\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\by\u0010F\u001a\u0004\bz\u0010HR\u001a\u0010{\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\b{\u0010F\u001a\u0004\b|\u0010HR\u001a\u0010}\u001a\u00020\u00138\u0001X\u0081D¢\u0006\f\n\u0004\b}\u0010F\u001a\u0004\b~\u0010HR\u001b\u0010\u007f\u001a\u00020\u00138\u0001X\u0081D¢\u0006\r\n\u0004\b\u007f\u0010F\u001a\u0005\b\u0080\u0001\u0010HR\u001d\u0010\u0081\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010F\u001a\u0005\b\u0082\u0001\u0010HR\u001d\u0010\u0083\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010F\u001a\u0005\b\u0084\u0001\u0010HR\u001d\u0010\u0085\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010F\u001a\u0005\b\u0086\u0001\u0010HR\u001d\u0010\u0087\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010F\u001a\u0005\b\u0088\u0001\u0010HR\u001d\u0010\u0089\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010F\u001a\u0005\b\u008a\u0001\u0010HR\u001d\u0010\u008b\u0001\u001a\u00020\u00138\u0001X\u0081D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010F\u001a\u0005\b\u008c\u0001\u0010HR?\u0010\u0090\u0001\u001a\"\u0012\u0004\u0012\u00020+\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001j\u0010\u0012\u0004\u0012\u00020+\u0012\u0005\u0012\u00030\u008e\u0001`\u008f\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "request", "Landroid/content/Context;", "context", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convert", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "", "clientDataJSON", "attestationObject", "", "", "transportArray", "", "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "toAssertPasskeyResponse", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Landroidx/credentials/GetPublicKeyCredentialOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "convertToPlayAuthPasskeyJsonRequest", "(Landroidx/credentials/GetPublicKeyCredentialOption;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "convertToPlayAuthPasskeyRequest", "(Landroidx/credentials/GetPublicKeyCredentialOption;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lorg/json/JSONObject;)[B", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", "publicKeyCredentialResponseContainsError", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "str", "b64Decode", "(Ljava/lang/String;)[B", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "b64Encode", "([B)Ljava/lang/String;", "", "alg", "", "checkAlgSupported", "(I)Z", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "Landroidx/credentials/exceptions/domerrors/DomError;", "Lkotlin/collections/getHighSpeedVideoSizes;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final java.lang.String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final java.lang.String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final java.lang.String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final java.lang.String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final java.lang.String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final java.lang.String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final java.lang.String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final java.lang.String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final java.lang.String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final java.lang.String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final java.lang.String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final java.lang.String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final java.lang.String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final java.lang.String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final java.lang.String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final java.lang.String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final java.lang.String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final java.lang.String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final java.lang.String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final java.lang.String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final java.lang.String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final java.lang.String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final java.lang.String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final java.lang.String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final java.lang.String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final java.lang.String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final java.lang.String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final java.lang.String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final java.lang.String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final java.lang.String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final java.lang.String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final java.lang.String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final java.lang.String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final java.lang.String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(org.json.JSONObject json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(json, builder);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, builder);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(json, builder);
            parseOptionalTimeout$credentials_play_services_auth_release(json, builder);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(json, builder);
            parseOptionalExtensions$credentials_play_services_auth_release(json, builder);
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] clientDataJSON, byte[] attestationObject, java.lang.String[] transportArray, org.json.JSONObject json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataJSON, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationObject, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transportArray, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new org.json.JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final java.lang.String toAssertPasskeyResponse(com.google.android.gms.auth.api.identity.SignInCredential cred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cred, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(response);
            if (response instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) {
                com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) response;
                com.google.android.gms.fido.fido2.api.common.ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCode, "");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (response instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) {
                try {
                    java.lang.String json = publicKeyCredential.toJson();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
                    return json;
                } catch (java.lang.Throwable th) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ");
                    sb.append(th.getMessage());
                    throw new androidx.view.exceptions.GetCredentialUnknownException(sb.toString());
                }
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            return jSONObject2;
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(androidx.view.GetPublicKeyCredentialOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions build = new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.getRequestJson()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.Deprecated(message = "Upgrade GMS version so 'convertToPlayAuthPasskeyJsonRequest' is used")
        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(androidx.view.GetPublicKeyCredentialOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject(option.getRequestJson());
            java.lang.String optString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new org.json.JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions build = new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(optString).setChallenge(getHighResolutionOutputSizeshNQ4ISI(jSONObject)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        private final byte[] getHighResolutionOutputSizeshNQ4ISI(org.json.JSONObject p0) {
            java.lang.String optString = p0.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new org.json.JSONException("Challenge not found in request or is unexpectedly empty");
            }
            return b64Decode(optString);
        }

        public final androidx.view.exceptions.CreateCredentialException publicKeyCredentialResponseContainsError(com.google.android.gms.fido.fido2.api.common.PublicKeyCredential cred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cred, "");
            com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse response = cred.getResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "");
            if (!(response instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse)) {
                return null;
            }
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) response;
            com.google.android.gms.fido.fido2.api.common.ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCode, "");
            androidx.view.exceptions.domerrors.DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            java.lang.String errorMessage = authenticatorErrorResponse.getErrorMessage();
            if (domError == null) {
                return new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.UnknownError(), "unknown fido gms exception - ".concat(java.lang.String.valueOf(errorMessage)));
            }
            if (errorCode == com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) errorMessage, (java.lang.CharSequence) "Unable to get sync account", false, 2, (java.lang.Object) null)) {
                return new androidx.view.exceptions.CreateCredentialCancellationException("Passkey registration was cancelled by the user.");
            }
            return new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(domError, errorMessage);
        }

        public final androidx.view.exceptions.GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(com.google.android.gms.fido.fido2.api.common.ErrorCode code, java.lang.String msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            androidx.view.exceptions.domerrors.DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(code);
            if (domError == null) {
                return new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.UnknownError(), "unknown fido gms exception - ".concat(java.lang.String.valueOf(msg)));
            }
            if (code == com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_ALLOWED_ERR && msg != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) msg, (java.lang.CharSequence) "Unable to get sync account", false, 2, (java.lang.Object) null)) {
                return new androidx.view.exceptions.GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
            }
            return new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException(domError, msg);
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                org.json.JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder builder2 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder();
                java.lang.String optString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                if (optString.length() > 0) {
                    builder2.setFido2Extension(new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension(optString));
                }
                if (jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                org.json.JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder builder2 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder();
                boolean optBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                java.lang.String optString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                builder2.setRequireResidentKey(java.lang.Boolean.valueOf(optBoolean)).setResidentKeyRequirement(optString.length() > 0 ? com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(optString) : null);
                java.lang.String optString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(optString2);
                if (optString2.length() > 0) {
                    builder2.setAttachment(com.google.android.gms.fido.fido2.api.common.Attachment.fromString(optString2));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.setTimeoutSeconds(java.lang.Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000.0d));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            java.util.ArrayList arrayList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                org.json.JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                    java.lang.String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    byte[] b64Decode = b64Decode(string);
                    java.lang.String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
                    if (string2.length() == 0) {
                        throw new org.json.JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (b64Decode.length == 0) {
                        throw new org.json.JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new java.util.ArrayList();
                        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(com.google.android.gms.fido.common.Transport.fromString(jSONArray2.getString(i2)));
                            } catch (com.google.android.gms.fido.common.Transport.UnsupportedTransportException e) {
                                throw new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.EncodingError(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor(string2, b64Decode, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            java.lang.String optString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            builder.setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(optString.length() != 0 ? optString : "none"));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            org.json.JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            java.lang.String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            java.lang.String optString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            java.lang.String optString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new org.json.JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            if (string.length() == 0) {
                throw new org.json.JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity(string, optString, optString2));
            org.json.JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                java.lang.String optString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(optString3);
                if (optString3.length() == 0) {
                    throw new org.json.JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters(optString3, i2));
                }
            }
            builder.setParameters(arrayList);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(org.json.JSONObject json, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            builder.setChallenge(getHighResolutionOutputSizeshNQ4ISI(json));
            org.json.JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            java.lang.String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            byte[] b64Decode = b64Decode(string);
            java.lang.String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            java.lang.String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            java.lang.String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(string3);
            if (string3.length() == 0) {
                throw new org.json.JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (b64Decode.length == 0) {
                throw new org.json.JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            if (string2.length() == 0) {
                throw new org.json.JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity(b64Decode, string2, optString, string3));
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

        public final boolean checkAlgSupported(int alg) {
            try {
                com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (java.lang.Throwable unused) {
                return false;
            }
        }

        public final java.util.LinkedHashMap<com.google.android.gms.fido.fido2.api.common.ErrorCode, androidx.view.exceptions.domerrors.DomError> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions convert(androidx.view.CreatePublicKeyCredentialRequest request, android.content.Context context) {
            long j;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                    j = androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.GetGMSVersion.getHighSpeedVideoFpsRangesFor(packageInfo);
                } else {
                    j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
                }
                if (j > 241217000) {
                    return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(request.getRequestJson());
                }
            }
            return convertJSON$credentials_play_services_auth_release(new org.json.JSONObject(request.getRequestJson()));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "<init>", "()V", "Landroid/content/pm/PackageInfo;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/pm/PackageInfo;)J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class GetGMSVersion {
        public static final androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.GetGMSVersion INSTANCE = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.GetGMSVersion();

        private GetGMSVersion() {
        }

        @kotlin.jvm.JvmStatic
        public static final long getHighSpeedVideoFpsRangesFor(android.content.pm.PackageInfo p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return p0.getLongVersionCode();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions convert(androidx.view.CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, android.content.Context context) {
        return INSTANCE.convert(createPublicKeyCredentialRequest, context);
    }
}
