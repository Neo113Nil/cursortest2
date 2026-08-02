package com.paypal.oslo.feature.onboarding.signup.password.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/ui/SaveCredentialProvider;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "email", "password", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult;", "saveCredential", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/app/Activity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveCredentialProvider {
    public static final int $stable = 8;
    private final android.app.Activity getHighSpeedVideoFpsRanges;

    public SaveCredentialProvider(android.app.Activity activity) {
        this.getHighSpeedVideoFpsRanges = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCredential(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult> continuation) {
        com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider$saveCredential$1 saveCredentialProvider$saveCredential$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider$saveCredential$1) {
                saveCredentialProvider$saveCredential$1 = (com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider$saveCredential$1) continuation;
                if ((saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (str.length() <= 0) {
                            throw new java.lang.IllegalArgumentException("Invalid email. Must be non-empty".toString());
                        }
                        if (str2.length() <= 0) {
                            throw new java.lang.IllegalArgumentException("Invalid password. Must be non-empty".toString());
                        }
                        if (this.getHighSpeedVideoFpsRanges == null) {
                            throw new java.lang.IllegalArgumentException("Cannot save credentials: Activity context is null".toString());
                        }
                        androidx.view.CredentialManager create = androidx.view.CredentialManager.INSTANCE.create(this.getHighSpeedVideoFpsRanges);
                        android.app.Activity activity = this.getHighSpeedVideoFpsRanges;
                        androidx.view.CreatePasswordRequest createPasswordRequest = new androidx.view.CreatePasswordRequest(str, str2, null, false, false, 28, null);
                        saveCredentialProvider$saveCredential$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap = 1;
                        if (create.createCredential(activity, createPasswordRequest, saveCredentialProvider$saveCredential$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Success.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Success.INSTANCE;
        } catch (androidx.view.exceptions.CreateCredentialCancellationException e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "User cancelled saving to password manager", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", e.getMessage()), kotlin.TuplesKt.to("error", e)), null, 4, null);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled(e);
        } catch (androidx.view.exceptions.CreateCredentialException e2) {
            com.paypal.oslo.feature.onboarding.LoggerKt.log.e("Failed to save credential using password manager", e2);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e2);
        } catch (java.lang.IllegalArgumentException e3) {
            com.paypal.oslo.feature.onboarding.LoggerKt.log.e("Invalid argument for credential", e3);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e3);
        } catch (java.lang.IllegalStateException e4) {
            com.paypal.oslo.feature.onboarding.LoggerKt.log.e("Credential manager in invalid state", e4);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e4);
        } catch (java.lang.SecurityException e5) {
            com.paypal.oslo.feature.onboarding.LoggerKt.log.e("Security permission denied", e5);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e5);
        } catch (java.lang.UnsupportedOperationException e6) {
            com.paypal.oslo.feature.onboarding.LoggerKt.log.e("Credential operation not supported", e6);
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e6);
        }
        saveCredentialProvider$saveCredential$1 = new com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider$saveCredential$1(this, continuation);
        java.lang.Object obj2 = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap;
    }
}
