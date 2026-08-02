package com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/data/datasource/PasskeyCredentialDataSource;", "", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "requestJson", "", "preferImmediatelyAvailableCredentials", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Landroidx/credentials/GetCredentialResponse;", "getPasskeyCredentialsFromManager", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyCredentialDataSource {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PasskeyCredentialDataSource() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPasskeyCredentialsFromManager(android.content.Context context, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, androidx.view.GetCredentialResponse>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1 passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1) {
                passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1 = (com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1) continuation;
                if ((passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj = passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputMinFrameDuration;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.view.CredentialManager create = androidx.view.CredentialManager.INSTANCE.create(context);
                        androidx.view.GetPublicKeyCredentialOption getPublicKeyCredentialOption = new androidx.view.GetPublicKeyCredentialOption(str, null, null, 6, null);
                        androidx.view.GetCredentialRequest build = new androidx.credentials.GetCredentialRequest.Builder().addCredentialOption(getPublicKeyCredentialOption).setPreferImmediatelyAvailableCredentials(z).build();
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(create);
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPublicKeyCredentialOption);
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputFormats = z;
                        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputMinFrameDuration = 1;
                        obj = create.getCredential(context, build, passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return arrow.core.EitherKt.right((androidx.view.GetCredentialResponse) obj);
                }
            }
            if (i != 0) {
            }
            return arrow.core.EitherKt.right((androidx.view.GetCredentialResponse) obj);
        } catch (androidx.view.exceptions.GetCredentialException e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - credential manager exception", e);
            return arrow.core.EitherKt.left(e);
        } catch (java.lang.SecurityException e2) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - security exception", e2);
            return arrow.core.EitherKt.left(e2);
        } catch (java.lang.UnsupportedOperationException e3) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - unsupported operation", e3);
            return arrow.core.EitherKt.left(e3);
        } catch (java.net.ConnectException e4) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - connection refused", e4);
            return arrow.core.EitherKt.left(e4);
        } catch (java.net.SocketTimeoutException e5) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - timeout", e5);
            return arrow.core.EitherKt.left(e5);
        } catch (java.net.UnknownHostException e6) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey credentials - cannot resolve host", e6);
            return arrow.core.EitherKt.left(e6);
        }
        passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1 = new com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource$getPasskeyCredentialsFromManager$1(this, continuation);
        java.lang.Object obj2 = passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCredentialDataSource$getPasskeyCredentialsFromManager$1.getOutputMinFrameDuration;
    }
}
