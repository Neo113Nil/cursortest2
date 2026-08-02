package androidx.view.playservices.controllers;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0004\u0018\u00010\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/ResultReceiver;", "T", "resultReceiver", "toIpcFriendlyResultReceiver", "(Landroid/os/ResultReceiver;)Landroid/os/ResultReceiver;", "Landroid/content/Intent;", "hiddenIntent", "", "typeTag", "", "generateHiddenActivityIntent", "(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CredentialProviderBaseController {
    public static final java.lang.String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final java.lang.String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final java.lang.String CREATE_CANCELED = "CREATE_CANCELED";
    public static final java.lang.String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final java.lang.String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final java.lang.String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final java.lang.String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final java.lang.String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final java.lang.String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final java.lang.String EXTRA_DIGITAL_CREDENTIAL_INTENT = "EXTRA_DIGITAL_CREDENTIAL_INTENT";
    public static final java.lang.String EXTRA_ERROR_NAME = "EXTRA_ERROR_NAME";
    public static final java.lang.String EXTRA_FLOW_PENDING_INTENT = "EXTRA_FLOW_PENDING_INTENT";
    public static final java.lang.String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final java.lang.String GET_CANCELED = "GET_CANCELED_TAG";
    public static final java.lang.String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final java.lang.String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final java.lang.String GET_UNKNOWN = "GET_UNKNOWN";
    public static final java.lang.String REQUEST_TAG = "REQUEST_TYPE";
    public static final java.lang.String RESULT_DATA_TAG = "RESULT_DATA";
    public static final java.lang.String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final java.lang.String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final java.lang.String TYPE_TAG = "TYPE";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.CredentialProviderBaseController.Companion INSTANCE = new androidx.view.playservices.controllers.CredentialProviderBaseController.Companion(null);
    private static final java.util.Set<java.lang.Integer> retryables = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u00020\r*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u00020\u00108\u0001X\u0081D¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b-\u0010%R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b.\u0010%R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00102\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b2\u0010%R\u0014\u00103\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b3\u0010%R\u0014\u00104\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b4\u0010%R\u0014\u00105\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b5\u0010%R\u0014\u00106\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b6\u0010%R\u0014\u00107\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b7\u0010%R\u0014\u00108\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b8\u0010%R\u0014\u00109\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b9\u0010%R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b:\u0010%"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;", "", "<init>", "()V", "", "typeName", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroidx/credentials/exceptions/GetCredentialException;", "getCredentialExceptionTypeToException$credentials_play_services_auth_release", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/os/ResultReceiver;", "errName", "errMsg", "", "reportError$credentials_play_services_auth_release", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reportResult$credentials_play_services_auth_release", "(Landroid/os/ResultReceiver;IILandroid/content/Intent;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "createCredentialExceptionTypeToException$credentials_play_services_auth_release", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", "", "retryables", "Ljava/util/Set;", "getRetryables", "()Ljava/util/Set;", "CONTROLLER_REQUEST_CODE", com.visa.cbp.getEncExpo.warmup, "getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release", "()I", "getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release$annotations", "GET_CANCELED", "Ljava/lang/String;", androidx.view.playservices.controllers.CredentialProviderBaseController.GET_INTERRUPTED, androidx.view.playservices.controllers.CredentialProviderBaseController.GET_NO_CREDENTIALS, androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_CANCELED, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_INTERRUPTED, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN, "TYPE_TAG", "BEGIN_SIGN_IN_TAG", "SIGN_IN_INTENT_TAG", "CREATE_PASSWORD_TAG", "CREATE_PUBLIC_KEY_CREDENTIAL_TAG", "REQUEST_TAG", "RESULT_DATA_TAG", androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_DIGITAL_CREDENTIAL_INTENT, androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_ERROR_NAME, "FAILURE_RESPONSE_TAG", "EXCEPTION_TYPE_TAG", "EXCEPTION_MESSAGE_TAG", "ACTIVITY_REQUEST_CODE_TAG", "RESULT_RECEIVER_TAG"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release$annotations() {
        }

        private Companion() {
        }

        public final java.util.Set<java.lang.Integer> getRetryables() {
            return androidx.view.playservices.controllers.CredentialProviderBaseController.retryables;
        }

        public final int getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() {
            return androidx.view.playservices.controllers.CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final androidx.view.exceptions.GetCredentialException getCredentialExceptionTypeToException$credentials_play_services_auth_release(java.lang.String typeName, java.lang.String msg) {
            if (typeName != null) {
                int hashCode = typeName.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && typeName.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new androidx.view.exceptions.NoCredentialException(msg);
                        }
                    } else if (typeName.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new androidx.view.exceptions.GetCredentialInterruptedException(msg);
                    }
                } else if (typeName.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.GET_CANCELED)) {
                    return new androidx.view.exceptions.GetCredentialCancellationException(msg);
                }
            }
            return new androidx.view.exceptions.GetCredentialUnknownException(msg);
        }

        public final void reportError$credentials_play_services_auth_release(android.os.ResultReceiver resultReceiver, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultReceiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(androidx.view.playservices.controllers.CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
            bundle.putString(androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
            bundle.putString(androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
            resultReceiver.send(Integer.MAX_VALUE, bundle);
        }

        public final void reportResult$credentials_play_services_auth_release(android.os.ResultReceiver resultReceiver, int i, int i2, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultReceiver, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(androidx.view.playservices.controllers.CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
            bundle.putInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
            bundle.putParcelable(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG, intent);
            resultReceiver.send(i2, bundle);
        }

        public final androidx.view.exceptions.CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth_release(java.lang.String typeName, java.lang.String msg) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(typeName, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_CANCELED)) {
                return new androidx.view.exceptions.CreateCredentialCancellationException(msg);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(typeName, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_INTERRUPTED)) {
                return new androidx.view.exceptions.CreateCredentialInterruptedException(msg);
            }
            return new androidx.view.exceptions.CreateCredentialUnknownException(msg);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CredentialProviderBaseController(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    public final <T extends android.os.ResultReceiver> android.os.ResultReceiver toIpcFriendlyResultReceiver(T resultReceiver) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        android.os.ResultReceiver resultReceiver2 = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    public final void generateHiddenActivityIntent(android.os.ResultReceiver resultReceiver, android.content.Intent hiddenIntent, java.lang.String typeTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultReceiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hiddenIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTag, "");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }
}
