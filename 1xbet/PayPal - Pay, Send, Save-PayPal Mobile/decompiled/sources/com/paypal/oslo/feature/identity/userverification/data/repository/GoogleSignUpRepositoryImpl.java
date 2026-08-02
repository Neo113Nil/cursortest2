package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/data/repository/GoogleSignUpRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;", "", "googleWebClientId", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", "activityContext", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpDetails;", "fetchSignUpDetails", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/credentials/CustomCredential;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/credentials/CustomCredential;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoogleSignUpRepositoryImpl implements com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GoogleSignUpRepositoryImpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc A[Catch: GetCredentialException -> 0x011e, GetCredentialCancellationException -> 0x0149, TryCatch #2 {GetCredentialCancellationException -> 0x0149, GetCredentialException -> 0x011e, blocks: (B:11:0x0038, B:12:0x00b2, B:14:0x00bc, B:16:0x00c8, B:19:0x00cf, B:21:0x00f5, B:26:0x0047), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5 A[Catch: GetCredentialException -> 0x011e, GetCredentialCancellationException -> 0x0149, TRY_LEAVE, TryCatch #2 {GetCredentialCancellationException -> 0x0149, GetCredentialException -> 0x011e, blocks: (B:11:0x0038, B:12:0x00b2, B:14:0x00bc, B:16:0x00c8, B:19:0x00cf, B:21:0x00f5, B:26:0x0047), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchSignUpDetails(android.content.Context context, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError, com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails>> continuation) {
        com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl$fetchSignUpDetails$1 googleSignUpRepositoryImpl$fetchSignUpDetails$1;
        int i;
        androidx.view.Credential credential;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl$fetchSignUpDetails$1) {
                googleSignUpRepositoryImpl$fetchSignUpDetails$1 = (com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl$fetchSignUpDetails$1) continuation;
                if ((googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Starting fetch Google Sign-In details flow", null, null, 6, null);
                        com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder autoSelectEnabled = new com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder().setFilterByAuthorizedAccounts(false).setServerClientId(this.Camera2StreamConfigurationMap).setAutoSelectEnabled(false);
                        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        com.google.android.libraries.identity.googleid.GetGoogleIdOption build = autoSelectEnabled.setNonce(obj2).build();
                        androidx.view.GetCredentialRequest build2 = new androidx.credentials.GetCredentialRequest.Builder().addCredentialOption(build).build();
                        androidx.view.CredentialManager create = androidx.view.CredentialManager.INSTANCE.create(context);
                        googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                        googleSignUpRepositoryImpl$fetchSignUpDetails$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                        googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build2);
                        googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(create);
                        googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = create.getCredential(context, build2, googleSignUpRepositoryImpl$fetchSignUpDetails$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    credential = ((androidx.view.GetCredentialResponse) obj).getCredential();
                    if (!(credential instanceof androidx.view.CustomCredential)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(credential.getType(), com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL)) {
                            return getHighSpeedVideoFpsRanges((androidx.view.CustomCredential) credential);
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unexpected credential type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("credential_type", credential.getType())), null, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType(credential.getType()));
                    }
                    java.lang.String simpleName = credential.getClass().getSimpleName();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unexpected credential class", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("credential_class", simpleName)), null, 4, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType(simpleName));
                }
            }
            if (i != 0) {
            }
            credential = ((androidx.view.GetCredentialResponse) obj).getCredential();
            if (!(credential instanceof androidx.view.CustomCredential)) {
            }
        } catch (androidx.view.exceptions.GetCredentialCancellationException unused) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Google Sign-In credentials fetch failed.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "User cancelled")), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.Cancelled.INSTANCE);
        } catch (androidx.view.exceptions.GetCredentialException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Google Sign-In credentials fetch failed.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Google Sign-In failed. Please try again.";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError(message, e));
        }
        googleSignUpRepositoryImpl$fetchSignUpDetails$1 = new com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl$fetchSignUpDetails$1(this, continuation);
        java.lang.Object obj3 = googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = googleSignUpRepositoryImpl$fetchSignUpDetails$1.getHighSpeedVideoFpsRangesFor;
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError, com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails> getHighSpeedVideoFpsRanges(androidx.view.CustomCredential p0) {
        try {
            com.google.android.libraries.identity.googleid.GoogleIdTokenCredential createFrom = com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.INSTANCE.createFrom(p0.getData());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Successfully parsed Google ID token credential", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("googleTokenId", createFrom.getZza())), null, 4, null);
            java.lang.String zzb = createFrom.getZzb();
            java.lang.String zza = createFrom.getZza();
            java.lang.String zze = createFrom.getZze();
            java.lang.String str = zze == null ? "" : zze;
            java.lang.String zzd = createFrom.getZzd();
            java.lang.String str2 = zzd == null ? "" : zzd;
            android.net.Uri zzf = createFrom.getZzf();
            java.lang.String obj = zzf != null ? zzf.toString() : null;
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails(zzb, zza, str, str2, obj == null ? "" : obj));
        } catch (com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to parse Google ID token", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError(e));
        }
    }
}
