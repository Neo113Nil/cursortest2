package androidx.view.playservices.controllers.identitycredentials.createpasswordcredential;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, androidx.view.exceptions.CreateCredentialException> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ androidx.view.exceptions.CreateCredentialException invoke(java.lang.String str, java.lang.String str2) {
        return ((androidx.view.playservices.controllers.CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }

    CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(java.lang.Object obj) {
        super(2, obj, androidx.view.playservices.controllers.CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }
}
