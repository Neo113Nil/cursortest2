package com.paypal.oslo.feature.identity.passwordrecovery.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/SaveCredentialProvider;", "", "Landroid/app/Activity;", "activity", "Lkotlin/Function1;", "Landroidx/credentials/CredentialManager;", "credentialManagerFactory", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "", "credential", "password", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/SaveCredentialResult;", "saveCredential", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/app/Activity;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveCredentialProvider {
    public static final int $stable = 8;
    private final android.app.Activity getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<android.app.Activity, androidx.view.CredentialManager> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveCredentialProvider(android.app.Activity activity, kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends androidx.view.CredentialManager> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = activity;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.content.Context, androidx.view.CredentialManager> {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.view.CredentialManager invoke(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return ((androidx.view.CredentialManager.Companion) this.receiver).create(context);
        }

        AnonymousClass1(java.lang.Object obj) {
            super(1, obj, androidx.view.CredentialManager.Companion.class, "create", "create(Landroid/content/Context;)Landroidx/credentials/CredentialManager;", 0);
        }
    }

    public /* synthetic */ SaveCredentialProvider(android.app.Activity activity, com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? new com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider.AnonymousClass1(androidx.view.CredentialManager.INSTANCE) : anonymousClass1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveCredential(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider$saveCredential$1 saveCredentialProvider$saveCredential$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider$saveCredential$1) {
                saveCredentialProvider$saveCredential$1 = (com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider$saveCredential$1) continuation;
                if ((saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (str.length() <= 0) {
                            throw new java.lang.IllegalArgumentException("Invalid credential. Must be non-empty".toString());
                        }
                        if (str2.length() <= 0) {
                            throw new java.lang.IllegalArgumentException("Invalid password. Must be non-empty".toString());
                        }
                        android.app.Activity activity = this.getHighSpeedVideoFpsRanges;
                        if (activity == null) {
                            throw new java.lang.IllegalArgumentException("Cannot save credentials: Activity context is null".toString());
                        }
                        androidx.view.CredentialManager invoke = this.getHighSpeedVideoFpsRangesFor.invoke(activity);
                        android.app.Activity activity2 = this.getHighSpeedVideoFpsRanges;
                        androidx.view.CreatePasswordRequest createPasswordRequest = new androidx.view.CreatePasswordRequest(str, str2, null, false, false, 28, null);
                        saveCredentialProvider$saveCredential$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        saveCredentialProvider$saveCredential$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (invoke.createCredential(activity2, createPasswordRequest, saveCredentialProvider$saveCredential$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Success.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Success.INSTANCE;
        } catch (androidx.view.exceptions.CreateCredentialCancellationException e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User cancelled saving to password manager", null, null, 6, null);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Cancelled(e);
        } catch (androidx.view.exceptions.CreateCredentialException e2) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to save credential using password manager", e2);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e2);
        } catch (java.lang.IllegalArgumentException e3) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Invalid argument for credential", e3);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e3);
        } catch (java.lang.IllegalStateException e4) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Credential manager in invalid state", e4);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e4);
        } catch (java.lang.SecurityException e5) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Security permission denied", e5);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e5);
        } catch (java.lang.UnsupportedOperationException e6) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Credential operation not supported", e6);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e6);
        } catch (java.lang.Exception e7) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Unexpected error saving credential", e7);
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.SaveCredentialResult.Failure(e7);
        }
        saveCredentialProvider$saveCredential$1 = new com.paypal.oslo.feature.identity.passwordrecovery.ui.SaveCredentialProvider$saveCredential$1(this, continuation);
        java.lang.Object obj2 = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveCredentialProvider$saveCredential$1.getHighSpeedVideoFpsRangesFor;
    }
}
